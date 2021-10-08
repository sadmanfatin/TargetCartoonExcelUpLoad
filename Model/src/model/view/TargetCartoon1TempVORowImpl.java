package model.view;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 08 09:59:51 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TargetCartoon1TempVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Name {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getName();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        Upc {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getUpc();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setUpc((String)value);
            }
        }
        ,
        Po {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getPo();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setPo((String)value);
            }
        }
        ,
        VcpSsp {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getVcpSsp();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setVcpSsp((String)value);
            }
        }
        ,
        CountryOfOrigin {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getCountryOfOrigin();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setCountryOfOrigin((String)value);
            }
        }
        ,
        DpciItem {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getDpciItem();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setDpciItem((String)value);
            }
        }
        ,
        VenStyle {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getVenStyle();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setVenStyle((String)value);
            }
        }
        ,
        GmsColor {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getGmsColor();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setGmsColor((String)value);
            }
        }
        ,
        GmsQty {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getGmsQty();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setGmsQty((String)value);
            }
        }
        ,
        Sizes {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getSizes();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setSizes((String)value);
            }
        }
        ,
        CartonDimensionCm {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getCartonDimensionCm();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setCartonDimensionCm((String)value);
            }
        }
        ,
        CartonQtyPcs {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getCartonQtyPcs();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setCartonQtyPcs((String)value);
            }
        }
        ,
        Tdate {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getTdate();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setTdate((Date)value);
            }
        }
        ,
        FileName {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getFileName();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setFileName((String)value);
            }
        }
        ,
        EncodedBarcode {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getEncodedBarcode();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setEncodedBarcode((String)value);
            }
        }
        ,
        Status {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getStatus();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setStatus((Number)value);
            }
        }
        ,
        Chkdigit {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getChkdigit();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setChkdigit((String)value);
            }
        }
        ,
        Barcodes {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getBarcodes();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setBarcodes((String)value);
            }
        }
        ,
        BarcodeWithCheck {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getBarcodeWithCheck();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setBarcodeWithCheck((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        RowID {
            public Object get(TargetCartoon1TempVORowImpl obj) {
                return obj.getRowID();
            }

            public void put(TargetCartoon1TempVORowImpl obj, Object value) {
                obj.setRowID((RowID)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TargetCartoon1TempVORowImpl object);

        public abstract void put(TargetCartoon1TempVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int NAME = AttributesEnum.Name.index();
    public static final int UPC = AttributesEnum.Upc.index();
    public static final int PO = AttributesEnum.Po.index();
    public static final int VCPSSP = AttributesEnum.VcpSsp.index();
    public static final int COUNTRYOFORIGIN = AttributesEnum.CountryOfOrigin.index();
    public static final int DPCIITEM = AttributesEnum.DpciItem.index();
    public static final int VENSTYLE = AttributesEnum.VenStyle.index();
    public static final int GMSCOLOR = AttributesEnum.GmsColor.index();
    public static final int GMSQTY = AttributesEnum.GmsQty.index();
    public static final int SIZES = AttributesEnum.Sizes.index();
    public static final int CARTONDIMENSIONCM = AttributesEnum.CartonDimensionCm.index();
    public static final int CARTONQTYPCS = AttributesEnum.CartonQtyPcs.index();
    public static final int TDATE = AttributesEnum.Tdate.index();
    public static final int FILENAME = AttributesEnum.FileName.index();
    public static final int ENCODEDBARCODE = AttributesEnum.EncodedBarcode.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CHKDIGIT = AttributesEnum.Chkdigit.index();
    public static final int BARCODES = AttributesEnum.Barcodes.index();
    public static final int BARCODEWITHCHECK = AttributesEnum.BarcodeWithCheck.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ROWID = AttributesEnum.RowID.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TargetCartoon1TempVORowImpl() {
    }

    /**
     * Gets TargetCartoon1TempEO entity object.
     * @return the TargetCartoon1TempEO
     */
    public EntityImpl getTargetCartoon1TempEO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for UPC using the alias name Upc.
     * @return the UPC
     */
    public String getUpc() {
        return (String) getAttributeInternal(UPC);
    }

    /**
     * Sets <code>value</code> as attribute value for UPC using the alias name Upc.
     * @param value value to set the UPC
     */
    public void setUpc(String value) {
        setAttributeInternal(UPC, value);
    }

    /**
     * Gets the attribute value for PO using the alias name Po.
     * @return the PO
     */
    public String getPo() {
        return (String) getAttributeInternal(PO);
    }

    /**
     * Sets <code>value</code> as attribute value for PO using the alias name Po.
     * @param value value to set the PO
     */
    public void setPo(String value) {
        setAttributeInternal(PO, value);
    }

    /**
     * Gets the attribute value for VCP_SSP using the alias name VcpSsp.
     * @return the VCP_SSP
     */
    public String getVcpSsp() {
        return (String) getAttributeInternal(VCPSSP);
    }

    /**
     * Sets <code>value</code> as attribute value for VCP_SSP using the alias name VcpSsp.
     * @param value value to set the VCP_SSP
     */
    public void setVcpSsp(String value) {
        setAttributeInternal(VCPSSP, value);
    }

    /**
     * Gets the attribute value for COUNTRY_OF_ORIGIN using the alias name CountryOfOrigin.
     * @return the COUNTRY_OF_ORIGIN
     */
    public String getCountryOfOrigin() {
        return (String) getAttributeInternal(COUNTRYOFORIGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_OF_ORIGIN using the alias name CountryOfOrigin.
     * @param value value to set the COUNTRY_OF_ORIGIN
     */
    public void setCountryOfOrigin(String value) {
        setAttributeInternal(COUNTRYOFORIGIN, value);
    }

    /**
     * Gets the attribute value for DPCI_ITEM using the alias name DpciItem.
     * @return the DPCI_ITEM
     */
    public String getDpciItem() {
        return (String) getAttributeInternal(DPCIITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for DPCI_ITEM using the alias name DpciItem.
     * @param value value to set the DPCI_ITEM
     */
    public void setDpciItem(String value) {
        setAttributeInternal(DPCIITEM, value);
    }

    /**
     * Gets the attribute value for VEN_STYLE using the alias name VenStyle.
     * @return the VEN_STYLE
     */
    public String getVenStyle() {
        return (String) getAttributeInternal(VENSTYLE);
    }

    /**
     * Sets <code>value</code> as attribute value for VEN_STYLE using the alias name VenStyle.
     * @param value value to set the VEN_STYLE
     */
    public void setVenStyle(String value) {
        setAttributeInternal(VENSTYLE, value);
    }

    /**
     * Gets the attribute value for GMS_COLOR using the alias name GmsColor.
     * @return the GMS_COLOR
     */
    public String getGmsColor() {
        return (String) getAttributeInternal(GMSCOLOR);
    }

    /**
     * Sets <code>value</code> as attribute value for GMS_COLOR using the alias name GmsColor.
     * @param value value to set the GMS_COLOR
     */
    public void setGmsColor(String value) {
        setAttributeInternal(GMSCOLOR, value);
    }

    /**
     * Gets the attribute value for GMS_QTY using the alias name GmsQty.
     * @return the GMS_QTY
     */
    public String getGmsQty() {
        return (String) getAttributeInternal(GMSQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for GMS_QTY using the alias name GmsQty.
     * @param value value to set the GMS_QTY
     */
    public void setGmsQty(String value) {
        setAttributeInternal(GMSQTY, value);
    }

    /**
     * Gets the attribute value for SIZES using the alias name Sizes.
     * @return the SIZES
     */
    public String getSizes() {
        return (String) getAttributeInternal(SIZES);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZES using the alias name Sizes.
     * @param value value to set the SIZES
     */
    public void setSizes(String value) {
        setAttributeInternal(SIZES, value);
    }

    /**
     * Gets the attribute value for CARTON_DIMENSION_CM using the alias name CartonDimensionCm.
     * @return the CARTON_DIMENSION_CM
     */
    public String getCartonDimensionCm() {
        return (String) getAttributeInternal(CARTONDIMENSIONCM);
    }

    /**
     * Sets <code>value</code> as attribute value for CARTON_DIMENSION_CM using the alias name CartonDimensionCm.
     * @param value value to set the CARTON_DIMENSION_CM
     */
    public void setCartonDimensionCm(String value) {
        setAttributeInternal(CARTONDIMENSIONCM, value);
    }

    /**
     * Gets the attribute value for CARTON_QTY_PCS using the alias name CartonQtyPcs.
     * @return the CARTON_QTY_PCS
     */
    public String getCartonQtyPcs() {
        return (String) getAttributeInternal(CARTONQTYPCS);
    }

    /**
     * Sets <code>value</code> as attribute value for CARTON_QTY_PCS using the alias name CartonQtyPcs.
     * @param value value to set the CARTON_QTY_PCS
     */
    public void setCartonQtyPcs(String value) {
        setAttributeInternal(CARTONQTYPCS, value);
    }

    /**
     * Gets the attribute value for TDATE using the alias name Tdate.
     * @return the TDATE
     */
    public Date getTdate() {
        return (Date) getAttributeInternal(TDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TDATE using the alias name Tdate.
     * @param value value to set the TDATE
     */
    public void setTdate(Date value) {
        setAttributeInternal(TDATE, value);
    }

    /**
     * Gets the attribute value for FILE_NAME using the alias name FileName.
     * @return the FILE_NAME
     */
    public String getFileName() {
        return (String) getAttributeInternal(FILENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FILE_NAME using the alias name FileName.
     * @param value value to set the FILE_NAME
     */
    public void setFileName(String value) {
        setAttributeInternal(FILENAME, value);
    }

    /**
     * Gets the attribute value for ENCODED_BARCODE using the alias name EncodedBarcode.
     * @return the ENCODED_BARCODE
     */
    public String getEncodedBarcode() {
        return (String) getAttributeInternal(ENCODEDBARCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for ENCODED_BARCODE using the alias name EncodedBarcode.
     * @param value value to set the ENCODED_BARCODE
     */
    public void setEncodedBarcode(String value) {
        setAttributeInternal(ENCODEDBARCODE, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public Number getStatus() {
        return (Number) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(Number value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for CHKDIGIT using the alias name Chkdigit.
     * @return the CHKDIGIT
     */
    public String getChkdigit() {
        return (String) getAttributeInternal(CHKDIGIT);
    }

    /**
     * Sets <code>value</code> as attribute value for CHKDIGIT using the alias name Chkdigit.
     * @param value value to set the CHKDIGIT
     */
    public void setChkdigit(String value) {
        setAttributeInternal(CHKDIGIT, value);
    }

    /**
     * Gets the attribute value for BARCODES using the alias name Barcodes.
     * @return the BARCODES
     */
    public String getBarcodes() {
        return (String) getAttributeInternal(BARCODES);
    }

    /**
     * Sets <code>value</code> as attribute value for BARCODES using the alias name Barcodes.
     * @param value value to set the BARCODES
     */
    public void setBarcodes(String value) {
        setAttributeInternal(BARCODES, value);
    }

    /**
     * Gets the attribute value for BARCODE_WITH_CHECK using the alias name BarcodeWithCheck.
     * @return the BARCODE_WITH_CHECK
     */
    public String getBarcodeWithCheck() {
        return (String) getAttributeInternal(BARCODEWITHCHECK);
    }

    /**
     * Sets <code>value</code> as attribute value for BARCODE_WITH_CHECK using the alias name BarcodeWithCheck.
     * @param value value to set the BARCODE_WITH_CHECK
     */
    public void setBarcodeWithCheck(String value) {
        setAttributeInternal(BARCODEWITHCHECK, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name RowID.
     * @return the ROWID
     */
    public RowID getRowID() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROWID using the alias name RowID.
     * @param value value to set the ROWID
     */
    public void setRowID(RowID value) {
        setAttributeInternal(ROWID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
