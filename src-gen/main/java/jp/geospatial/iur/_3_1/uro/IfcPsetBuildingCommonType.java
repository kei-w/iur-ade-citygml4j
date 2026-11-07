//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcPsetBuildingCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetBuildingCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPermanentId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mainFireUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ancillaryFireUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sprinklerProtection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sprinklerProtectionAutomatic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="occupancyType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="grossPlannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfStoreys" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="yearOfConstruction" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="isLandmarked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetBuildingCommonType", propOrder = {
    "buildingId",
    "isPermanentId",
    "mainFireUse",
    "ancillaryFireUse",
    "sprinklerProtection",
    "sprinklerProtectionAutomatic",
    "occupancyType",
    "grossPlannedArea",
    "numberOfStoreys",
    "yearOfConstruction",
    "isLandmarked"
})
public class IfcPsetBuildingCommonType
    extends IfcAttributeType
{

    protected String buildingId;
    protected Boolean isPermanentId;
    protected String mainFireUse;
    protected String ancillaryFireUse;
    protected Boolean sprinklerProtection;
    protected Boolean sprinklerProtectionAutomatic;
    protected CodeType occupancyType;
    protected MeasureType grossPlannedArea;
    protected BigInteger numberOfStoreys;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfConstruction;
    protected Boolean isLandmarked;

    /**
     * Gets the value of the buildingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingId() {
        return buildingId;
    }

    /**
     * Sets the value of the buildingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingId(String value) {
        this.buildingId = value;
    }

    public boolean isSetBuildingId() {
        return (this.buildingId!= null);
    }

    /**
     * Gets the value of the isPermanentId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPermanentId() {
        return isPermanentId;
    }

    /**
     * Sets the value of the isPermanentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPermanentId(Boolean value) {
        this.isPermanentId = value;
    }

    public boolean isSetIsPermanentId() {
        return (this.isPermanentId!= null);
    }

    /**
     * Gets the value of the mainFireUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainFireUse() {
        return mainFireUse;
    }

    /**
     * Sets the value of the mainFireUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainFireUse(String value) {
        this.mainFireUse = value;
    }

    public boolean isSetMainFireUse() {
        return (this.mainFireUse!= null);
    }

    /**
     * Gets the value of the ancillaryFireUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryFireUse() {
        return ancillaryFireUse;
    }

    /**
     * Sets the value of the ancillaryFireUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryFireUse(String value) {
        this.ancillaryFireUse = value;
    }

    public boolean isSetAncillaryFireUse() {
        return (this.ancillaryFireUse!= null);
    }

    /**
     * Gets the value of the sprinklerProtection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprinklerProtection() {
        return sprinklerProtection;
    }

    /**
     * Sets the value of the sprinklerProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprinklerProtection(Boolean value) {
        this.sprinklerProtection = value;
    }

    public boolean isSetSprinklerProtection() {
        return (this.sprinklerProtection!= null);
    }

    /**
     * Gets the value of the sprinklerProtectionAutomatic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprinklerProtectionAutomatic() {
        return sprinklerProtectionAutomatic;
    }

    /**
     * Sets the value of the sprinklerProtectionAutomatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprinklerProtectionAutomatic(Boolean value) {
        this.sprinklerProtectionAutomatic = value;
    }

    public boolean isSetSprinklerProtectionAutomatic() {
        return (this.sprinklerProtectionAutomatic!= null);
    }

    /**
     * Gets the value of the occupancyType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupancyType() {
        return occupancyType;
    }

    /**
     * Sets the value of the occupancyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupancyType(CodeType value) {
        this.occupancyType = value;
    }

    public boolean isSetOccupancyType() {
        return (this.occupancyType!= null);
    }

    /**
     * Gets the value of the grossPlannedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossPlannedArea() {
        return grossPlannedArea;
    }

    /**
     * Sets the value of the grossPlannedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossPlannedArea(MeasureType value) {
        this.grossPlannedArea = value;
    }

    public boolean isSetGrossPlannedArea() {
        return (this.grossPlannedArea!= null);
    }

    /**
     * Gets the value of the numberOfStoreys property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStoreys() {
        return numberOfStoreys;
    }

    /**
     * Sets the value of the numberOfStoreys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStoreys(BigInteger value) {
        this.numberOfStoreys = value;
    }

    public boolean isSetNumberOfStoreys() {
        return (this.numberOfStoreys!= null);
    }

    /**
     * Gets the value of the yearOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * Sets the value of the yearOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfConstruction(XMLGregorianCalendar value) {
        this.yearOfConstruction = value;
    }

    public boolean isSetYearOfConstruction() {
        return (this.yearOfConstruction!= null);
    }

    /**
     * Gets the value of the isLandmarked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLandmarked() {
        return isLandmarked;
    }

    /**
     * Sets the value of the isLandmarked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLandmarked(Boolean value) {
        this.isLandmarked = value;
    }

    public boolean isSetIsLandmarked() {
        return (this.isLandmarked!= null);
    }

}
