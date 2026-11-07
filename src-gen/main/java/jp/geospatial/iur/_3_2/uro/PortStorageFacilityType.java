//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PortStorageFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortStorageFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="innerTotalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="innerOfSiteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="outerOfTotalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="outerSiteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="mainCargo" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="storageCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="storageCapacityUnit" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterial" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortStorageFacilityType", propOrder = {
    "innerTotalFloorArea",
    "innerOfSiteArea",
    "outerOfTotalFloorArea",
    "outerSiteArea",
    "mainCargo",
    "storageCapacity",
    "storageCapacityUnit",
    "mainMaterial",
    "totalCost",
    "note"
})
public class PortStorageFacilityType
    extends PortAttributeType
{

    protected MeasureType innerTotalFloorArea;
    protected MeasureType innerOfSiteArea;
    protected MeasureType outerOfTotalFloorArea;
    protected MeasureType outerSiteArea;
    protected CodeType mainCargo;
    protected BigInteger storageCapacity;
    protected CodeType storageCapacityUnit;
    protected CodeType mainMaterial;
    protected BigInteger totalCost;
    protected String note;

    /**
     * Gets the value of the innerTotalFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInnerTotalFloorArea() {
        return innerTotalFloorArea;
    }

    /**
     * Sets the value of the innerTotalFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInnerTotalFloorArea(MeasureType value) {
        this.innerTotalFloorArea = value;
    }

    public boolean isSetInnerTotalFloorArea() {
        return (this.innerTotalFloorArea!= null);
    }

    /**
     * Gets the value of the innerOfSiteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInnerOfSiteArea() {
        return innerOfSiteArea;
    }

    /**
     * Sets the value of the innerOfSiteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInnerOfSiteArea(MeasureType value) {
        this.innerOfSiteArea = value;
    }

    public boolean isSetInnerOfSiteArea() {
        return (this.innerOfSiteArea!= null);
    }

    /**
     * Gets the value of the outerOfTotalFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOuterOfTotalFloorArea() {
        return outerOfTotalFloorArea;
    }

    /**
     * Sets the value of the outerOfTotalFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOuterOfTotalFloorArea(MeasureType value) {
        this.outerOfTotalFloorArea = value;
    }

    public boolean isSetOuterOfTotalFloorArea() {
        return (this.outerOfTotalFloorArea!= null);
    }

    /**
     * Gets the value of the outerSiteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOuterSiteArea() {
        return outerSiteArea;
    }

    /**
     * Sets the value of the outerSiteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOuterSiteArea(MeasureType value) {
        this.outerSiteArea = value;
    }

    public boolean isSetOuterSiteArea() {
        return (this.outerSiteArea!= null);
    }

    /**
     * Gets the value of the mainCargo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainCargo() {
        return mainCargo;
    }

    /**
     * Sets the value of the mainCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainCargo(CodeType value) {
        this.mainCargo = value;
    }

    public boolean isSetMainCargo() {
        return (this.mainCargo!= null);
    }

    /**
     * Gets the value of the storageCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * Sets the value of the storageCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStorageCapacity(BigInteger value) {
        this.storageCapacity = value;
    }

    public boolean isSetStorageCapacity() {
        return (this.storageCapacity!= null);
    }

    /**
     * Gets the value of the storageCapacityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStorageCapacityUnit() {
        return storageCapacityUnit;
    }

    /**
     * Sets the value of the storageCapacityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStorageCapacityUnit(CodeType value) {
        this.storageCapacityUnit = value;
    }

    public boolean isSetStorageCapacityUnit() {
        return (this.storageCapacityUnit!= null);
    }

    /**
     * Gets the value of the mainMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainMaterial() {
        return mainMaterial;
    }

    /**
     * Sets the value of the mainMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainMaterial(CodeType value) {
        this.mainMaterial = value;
    }

    public boolean isSetMainMaterial() {
        return (this.mainMaterial!= null);
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost(BigInteger value) {
        this.totalCost = value;
    }

    public boolean isSetTotalCost() {
        return (this.totalCost!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

}
