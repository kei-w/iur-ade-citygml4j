//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for MooringFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MooringFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mainPartLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="totalLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="facilityWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="apronWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="plannedDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="currentDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="ceilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="gravityResistant" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="form" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainVessels" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mooringPostWeight" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMooringPosts" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="resistantMaterial" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lighting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="stairs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lifesavingAppliances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLifesavingAppliances" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="bumper" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVehicleBoardings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="vehicleBoardingWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="shipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfSeats" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="mainCargo" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterial" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="subsidy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "MooringFacilityType", propOrder = {
    "mainPartLength",
    "totalLength",
    "facilityWidth",
    "apronWidth",
    "plannedDepth",
    "currentDepth",
    "area",
    "ceilingHeight",
    "gravityResistant",
    "form",
    "mainVessels",
    "mooringPostWeight",
    "numberOfMooringPosts",
    "resistantMaterial",
    "lighting",
    "stairs",
    "lifesavingAppliances",
    "numberOfLifesavingAppliances",
    "bumper",
    "numberOfVehicleBoardings",
    "vehicleBoardingWidth",
    "shipType",
    "numberOfSeats",
    "mainCargo",
    "structureType",
    "mainMaterial",
    "totalCost",
    "subsidy",
    "note"
})
public class MooringFacilityType
    extends PortAttributeType
{

    protected LengthType mainPartLength;
    protected LengthType totalLength;
    protected LengthType facilityWidth;
    protected LengthType apronWidth;
    protected LengthType plannedDepth;
    protected LengthType currentDepth;
    protected MeasureType area;
    protected LengthType ceilingHeight;
    protected MeasureType gravityResistant;
    protected CodeType form;
    protected CodeType mainVessels;
    protected MeasureType mooringPostWeight;
    protected BigInteger numberOfMooringPosts;
    protected BigInteger resistantMaterial;
    protected BigInteger lighting;
    protected BigInteger stairs;
    protected String lifesavingAppliances;
    protected BigInteger numberOfLifesavingAppliances;
    protected LengthType bumper;
    protected BigInteger numberOfVehicleBoardings;
    protected LengthType vehicleBoardingWidth;
    protected String shipType;
    protected BigInteger numberOfSeats;
    protected CodeType mainCargo;
    protected CodeType structureType;
    protected CodeType mainMaterial;
    protected BigInteger totalCost;
    protected BigInteger subsidy;
    protected String note;

    /**
     * Gets the value of the mainPartLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMainPartLength() {
        return mainPartLength;
    }

    /**
     * Sets the value of the mainPartLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMainPartLength(LengthType value) {
        this.mainPartLength = value;
    }

    public boolean isSetMainPartLength() {
        return (this.mainPartLength!= null);
    }

    /**
     * Gets the value of the totalLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTotalLength() {
        return totalLength;
    }

    /**
     * Sets the value of the totalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTotalLength(LengthType value) {
        this.totalLength = value;
    }

    public boolean isSetTotalLength() {
        return (this.totalLength!= null);
    }

    /**
     * Gets the value of the facilityWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getFacilityWidth() {
        return facilityWidth;
    }

    /**
     * Sets the value of the facilityWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setFacilityWidth(LengthType value) {
        this.facilityWidth = value;
    }

    public boolean isSetFacilityWidth() {
        return (this.facilityWidth!= null);
    }

    /**
     * Gets the value of the apronWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getApronWidth() {
        return apronWidth;
    }

    /**
     * Sets the value of the apronWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setApronWidth(LengthType value) {
        this.apronWidth = value;
    }

    public boolean isSetApronWidth() {
        return (this.apronWidth!= null);
    }

    /**
     * Gets the value of the plannedDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPlannedDepth() {
        return plannedDepth;
    }

    /**
     * Sets the value of the plannedDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPlannedDepth(LengthType value) {
        this.plannedDepth = value;
    }

    public boolean isSetPlannedDepth() {
        return (this.plannedDepth!= null);
    }

    /**
     * Gets the value of the currentDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCurrentDepth() {
        return currentDepth;
    }

    /**
     * Sets the value of the currentDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCurrentDepth(LengthType value) {
        this.currentDepth = value;
    }

    public boolean isSetCurrentDepth() {
        return (this.currentDepth!= null);
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setArea(MeasureType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the ceilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCeilingHeight() {
        return ceilingHeight;
    }

    /**
     * Sets the value of the ceilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCeilingHeight(LengthType value) {
        this.ceilingHeight = value;
    }

    public boolean isSetCeilingHeight() {
        return (this.ceilingHeight!= null);
    }

    /**
     * Gets the value of the gravityResistant property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGravityResistant() {
        return gravityResistant;
    }

    /**
     * Sets the value of the gravityResistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGravityResistant(MeasureType value) {
        this.gravityResistant = value;
    }

    public boolean isSetGravityResistant() {
        return (this.gravityResistant!= null);
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setForm(CodeType value) {
        this.form = value;
    }

    public boolean isSetForm() {
        return (this.form!= null);
    }

    /**
     * Gets the value of the mainVessels property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainVessels() {
        return mainVessels;
    }

    /**
     * Sets the value of the mainVessels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainVessels(CodeType value) {
        this.mainVessels = value;
    }

    public boolean isSetMainVessels() {
        return (this.mainVessels!= null);
    }

    /**
     * Gets the value of the mooringPostWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMooringPostWeight() {
        return mooringPostWeight;
    }

    /**
     * Sets the value of the mooringPostWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMooringPostWeight(MeasureType value) {
        this.mooringPostWeight = value;
    }

    public boolean isSetMooringPostWeight() {
        return (this.mooringPostWeight!= null);
    }

    /**
     * Gets the value of the numberOfMooringPosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMooringPosts() {
        return numberOfMooringPosts;
    }

    /**
     * Sets the value of the numberOfMooringPosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMooringPosts(BigInteger value) {
        this.numberOfMooringPosts = value;
    }

    public boolean isSetNumberOfMooringPosts() {
        return (this.numberOfMooringPosts!= null);
    }

    /**
     * Gets the value of the resistantMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResistantMaterial() {
        return resistantMaterial;
    }

    /**
     * Sets the value of the resistantMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResistantMaterial(BigInteger value) {
        this.resistantMaterial = value;
    }

    public boolean isSetResistantMaterial() {
        return (this.resistantMaterial!= null);
    }

    /**
     * Gets the value of the lighting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLighting() {
        return lighting;
    }

    /**
     * Sets the value of the lighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLighting(BigInteger value) {
        this.lighting = value;
    }

    public boolean isSetLighting() {
        return (this.lighting!= null);
    }

    /**
     * Gets the value of the stairs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStairs() {
        return stairs;
    }

    /**
     * Sets the value of the stairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStairs(BigInteger value) {
        this.stairs = value;
    }

    public boolean isSetStairs() {
        return (this.stairs!= null);
    }

    /**
     * Gets the value of the lifesavingAppliances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifesavingAppliances() {
        return lifesavingAppliances;
    }

    /**
     * Sets the value of the lifesavingAppliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifesavingAppliances(String value) {
        this.lifesavingAppliances = value;
    }

    public boolean isSetLifesavingAppliances() {
        return (this.lifesavingAppliances!= null);
    }

    /**
     * Gets the value of the numberOfLifesavingAppliances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLifesavingAppliances() {
        return numberOfLifesavingAppliances;
    }

    /**
     * Sets the value of the numberOfLifesavingAppliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLifesavingAppliances(BigInteger value) {
        this.numberOfLifesavingAppliances = value;
    }

    public boolean isSetNumberOfLifesavingAppliances() {
        return (this.numberOfLifesavingAppliances!= null);
    }

    /**
     * Gets the value of the bumper property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBumper() {
        return bumper;
    }

    /**
     * Sets the value of the bumper property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBumper(LengthType value) {
        this.bumper = value;
    }

    public boolean isSetBumper() {
        return (this.bumper!= null);
    }

    /**
     * Gets the value of the numberOfVehicleBoardings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicleBoardings() {
        return numberOfVehicleBoardings;
    }

    /**
     * Sets the value of the numberOfVehicleBoardings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicleBoardings(BigInteger value) {
        this.numberOfVehicleBoardings = value;
    }

    public boolean isSetNumberOfVehicleBoardings() {
        return (this.numberOfVehicleBoardings!= null);
    }

    /**
     * Gets the value of the vehicleBoardingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getVehicleBoardingWidth() {
        return vehicleBoardingWidth;
    }

    /**
     * Sets the value of the vehicleBoardingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setVehicleBoardingWidth(LengthType value) {
        this.vehicleBoardingWidth = value;
    }

    public boolean isSetVehicleBoardingWidth() {
        return (this.vehicleBoardingWidth!= null);
    }

    /**
     * Gets the value of the shipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * Sets the value of the shipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    public boolean isSetShipType() {
        return (this.shipType!= null);
    }

    /**
     * Gets the value of the numberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Sets the value of the numberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSeats(BigInteger value) {
        this.numberOfSeats = value;
    }

    public boolean isSetNumberOfSeats() {
        return (this.numberOfSeats!= null);
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
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructureType(CodeType value) {
        this.structureType = value;
    }

    public boolean isSetStructureType() {
        return (this.structureType!= null);
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
     * Gets the value of the subsidy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubsidy() {
        return subsidy;
    }

    /**
     * Sets the value of the subsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubsidy(BigInteger value) {
        this.subsidy = value;
    }

    public boolean isSetSubsidy() {
        return (this.subsidy!= null);
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
