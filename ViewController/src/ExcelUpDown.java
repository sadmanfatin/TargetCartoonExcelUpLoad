import java.io.IOException;
import java.io.InputStream;

import java.sql.CallableStatement;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import model.view.*;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.adf.view.rich.component.rich.input.RichInputFile;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.AttributeDef;
import oracle.jbo.Key;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
//import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;

import oracle.jbo.server.ViewRowImpl;

import org.apache.commons.io.FilenameUtils;
import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelUpDown {
    private RichInputFile excelUploadFile;

    public ExcelUpDown() {

        
    }
    
    Map<Integer,String> excelHeaderMap ; 
    XSSFWorkbook workbook ; 
    XSSFSheet worksheet;
    
    AppModuleImpl appM = getAppModuleImpl();
    
 


    private AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }
    
    
    
    

    public void uploadExcelFile(ValueChangeEvent valueChangeEvent) throws IOException,
                                                                          InvalidFormatException {
        // Add event code here...
        System.out.println("    --------------------- =-=-=-=-  1"  );
        UploadedFile file;
                    file = (UploadedFile)valueChangeEvent.getNewValue();
       
                    
        InputStream is = file.getInputStream();
        
        String fileExtension ;
        fileExtension =FilenameUtils.getExtension( file.getFilename());
     
         System.out.println(fileExtension);  
      
      
      if (!fileExtension.equals("xlsx")) {
             if (!fileExtension.equals("xls")) {
                showMessage("File is not in Excel format!" , "warn");
                return;
            }
            
        }
     
    
//        Creating a Workbook from an Excel file (.xls or .xlsx)
        
        Workbook workbook = WorkbookFactory.create(is);        
            
    //    Workbook workbook  = new XSSFWorkbook(is);
//        Workbook workbook = WorkbookFactory.create(file.getInputStream());
       
       Sheet sheet = workbook.getSheetAt(0);
                     
        ViewObject CartonVO  = appM.getTargetCartoon1VO1();
        ViewRowImpl cartonVORow;
        int count = 0;
          
          
         for (Row excelRow : sheet) {
             
           //  System.out.println("===============  excel row   "  + count );
                     
             if(   excelRow.getRowNum() ==0 )  {
                 
                 populateHeaderMap(excelRow);
                 
             }                                         
             else if( excelRow.getRowNum() > 0 ){
                  
                 cartonVORow = (ViewRowImpl)CartonVO.createRow();  
               insertExcelRowIntoCartonVO(cartonVORow , excelRow );
                 
               
             }
             
             

              count ++;
        }
         
        // String fileName =file.getFilename();        
        //  String fileName =sheet.getRow(1).getCell(11).getStringCellValue();     
        // fileName = fileName.substring(0, fileName.indexOf("."));       
        //  System.out.println("file name = "+fileName );
       
         showMessage("File Uploaded Successfully !", "info");
        
         this.executeOperation("Commit");
        
        appM.getTargetCartoon1VO1().executeQuery();
        
        
       getExcelUploadFile().setValue(null);
       
       updateCartonTableWithTempTable();
       
       barcodeProcess();
       
       AdfFacesContext.getCurrentInstance().addPartialTarget(getExcelUploadFile());
        
    }


    public void setExcelUploadFile(RichInputFile excelUploadFile) {
        this.excelUploadFile = excelUploadFile;
    }

    public RichInputFile getExcelUploadFile() {
        return excelUploadFile;
    }

    private void insertExcelRowIntoCartonVO( ViewRowImpl cartoonVORow, Row  excelRow) {
        DataFormatter formatter = new DataFormatter();
        
        
        TargetCartoon1VORowImpl  cartonVORowImpl = (TargetCartoon1VORowImpl)cartoonVORow;
         int cellNo; 
         
         
      String excelColumnName = null;
      String voAttributeName = null;
        AttributeDef[] voAttributes =   cartonVORowImpl.getViewObject().getAttributeDefs();
      
      Map<Integer,String>  excelHeaderMap   = this.getExcelHeaderMap();
      
      
        for (Cell excelCell : excelRow){
            

         cellNo = excelCell.getColumnIndex(); 
           
       //  excelColumnName =  excelHeaderMap.get( new Key(new Object[]{cellNo  }   )        );  
       excelColumnName =  excelHeaderMap.get( cellNo      );  
            
            System.out.println("  ------------- cellNo ,  excelColumnName "+  cellNo+  "   "+  excelColumnName);
            
            
            
            
            for(AttributeDef voAttribute : voAttributes) {
                if(  excelColumnName != null &&  excelColumnName.equals(voAttribute.getColumnName()) ) { 
                    
                    voAttributeName =  voAttribute.getName() ;                
                   System.out.println("  ------------- excelColumnName "+ excelColumnName);
                    System.out.println("  ------------- voAttributeName "+ voAttributeName);
                    
                }
            }
           System.out.println("  ===================================================================================================== ");
         
            
         //   System.out.println("  cellNo ,  excelColumnName " + cellNo +"  "+ excelColumnName   );
            
            String cellVal;
            cellVal = formatter.formatCellValue(excelCell);
           
          //  System.out.println("  ====== excel cell  cellNo ,  cellVal =========  "+  cellNo + "   "+cellVal  );
            
                
            cartonVORowImpl.setAttribute(voAttributeName, cellVal);
       
          
               
                 
            
        }
         
    }
       
       
       
       
    
    public  void showMessage(String messege , String severity ) {
        
        
        FacesMessage fm = new FacesMessage(messege);
        
        if(severity.equals("info")){
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
        }
        else if(severity.equals("warn")){
            fm.setSeverity(FacesMessage.SEVERITY_WARN);
        }
        else if(severity.equals("error")){
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
        }
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
    }

    private void executeOperation(String method) {
        BindingContainer bindings = getBindings();
               OperationBinding ob = bindings.getOperationBinding(method);
        Object result = ob.execute();
        
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    private  void populateHeaderMap(Row excelRow) {
        
      this.excelHeaderMap =  new HashMap<Integer, String>();
    
        String cellVal;
        int cellNo ;
        DataFormatter formatter = new DataFormatter();

    
      for (Cell excelCell : excelRow){
        cellNo = excelCell.getColumnIndex();
        cellVal = formatter.formatCellValue(excelCell);
          
       //   System.out.println(" cell no , cell value " + cellNo + "   "+cellVal);
          
          
        excelHeaderMap.put(cellNo , cellVal );
        
         
      }
      
      
      
    }

    public Map<Integer, String> getExcelHeaderMap() {
        return excelHeaderMap;
    }
    
    
    private void updateCartonTableWithTempTable() {
            
            String statement = "BEGIN UPDATE_CARTON_T_WITH_TEMP_T; END;";
            CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
          
           
            try {

                cs.execute();
            }
            catch(Exception e){
                e.printStackTrace();
                ;
            }            
            
            
        }
    
    
    

    private void barcodeProcess() {
        
        
            String statement = "BEGIN BARCODE_PROCESS; END;";
           
           CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);              
               
                try {

                  //  cs.execute();
}
                catch(Exception e){
                    e.printStackTrace();
                    
                }                                    
        
    }
}
