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
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PortTransportationFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortTransportationFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="startingPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="beddingWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLanes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="parkingLotCapacityOfBus" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="parkingLotCapacityOfCars" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="routeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="heightToDigit" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="heightLimit" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfAircraftParkingSpaces" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="pavementType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainCargo" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
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
@XmlType(name = "PortTransportationFacilityType", propOrder = {
    "structureType",
    "startingPoint",
    "length",
    "area",
    "beddingWidth",
    "numberOfLanes",
    "parkingLotCapacityOfBus",
    "parkingLotCapacityOfCars",
    "routeType",
    "heightToDigit",
    "heightLimit",
    "minimumWidth",
    "minimumDepth",
    "numberOfAircraftParkingSpaces",
    "pavementType",
    "mainCargo",
    "totalCost",
    "subsidy",
    "note"
})
public class PortTransportationFacilityType
    extends PortAttributeType
{

    protected CodeType structureType;
    protected String startingPoint;
    protected LengthType length;
    protected MeasureType area;
    protected LengthType beddingWidth;
    protected BigInteger numberOfLanes;
    protected BigInteger parkingLotCapacityOfBus;
    protected BigInteger parkingLotCapacityOfCars;
    protected CodeType routeType;
    protected LengthType heightToDigit;
    protected LengthType heightLimit;
    protected LengthType minimumWidth;
    protected LengthType minimumDepth;
    protected BigInteger numberOfAircraftParkingSpaces;
    protected CodeType pavementType;
    protected CodeType mainCargo;
    protected BigInteger totalCost;
    protected BigInteger subsidy;
    protected String note;

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
     * Gets the value of the startingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingPoint() {
        return startingPoint;
    }

    /**
     * Sets the value of the startingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingPoint(String value) {
        this.startingPoint = value;
    }

    public boolean isSetStartingPoint() {
        return (this.startingPoint!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
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
     * Gets the value of the beddingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBeddingWidth() {
        return beddingWidth;
    }

    /**
     * Sets the value of the beddingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBeddingWidth(LengthType value) {
        this.beddingWidth = value;
    }

    public boolean isSetBeddingWidth() {
        return (this.beddingWidth!= null);
    }

    /**
     * Gets the value of the numberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanes() {
        return numberOfLanes;
    }

    /**
     * Sets the value of the numberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanes(BigInteger value) {
        this.numberOfLanes = value;
    }

    public boolean isSetNumberOfLanes() {
        return (this.numberOfLanes!= null);
    }

    /**
     * Gets the value of the parkingLotCapacityOfBus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingLotCapacityOfBus() {
        return parkingLotCapacityOfBus;
    }

    /**
     * Sets the value of the parkingLotCapacityOfBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingLotCapacityOfBus(BigInteger value) {
        this.parkingLotCapacityOfBus = value;
    }

    public boolean isSetParkingLotCapacityOfBus() {
        return (this.parkingLotCapacityOfBus!= null);
    }

    /**
     * Gets the value of the parkingLotCapacityOfCars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingLotCapacityOfCars() {
        return parkingLotCapacityOfCars;
    }

    /**
     * Sets the value of the parkingLotCapacityOfCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingLotCapacityOfCars(BigInteger value) {
        this.parkingLotCapacityOfCars = value;
    }

    public boolean isSetParkingLotCapacityOfCars() {
        return (this.parkingLotCapacityOfCars!= null);
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRouteType(CodeType value) {
        this.routeType = value;
    }

    public boolean isSetRouteType() {
        return (this.routeType!= null);
    }

    /**
     * Gets the value of the heightToDigit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeightToDigit() {
        return heightToDigit;
    }

    /**
     * Sets the value of the heightToDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeightToDigit(LengthType value) {
        this.heightToDigit = value;
    }

    public boolean isSetHeightToDigit() {
        return (this.heightToDigit!= null);
    }

    /**
     * Gets the value of the heightLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeightLimit() {
        return heightLimit;
    }

    /**
     * Sets the value of the heightLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeightLimit(LengthType value) {
        this.heightLimit = value;
    }

    public boolean isSetHeightLimit() {
        return (this.heightLimit!= null);
    }

    /**
     * Gets the value of the minimumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumWidth() {
        return minimumWidth;
    }

    /**
     * Sets the value of the minimumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumWidth(LengthType value) {
        this.minimumWidth = value;
    }

    public boolean isSetMinimumWidth() {
        return (this.minimumWidth!= null);
    }

    /**
     * Gets the value of the minimumDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumDepth() {
        return minimumDepth;
    }

    /**
     * Sets the value of the minimumDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumDepth(LengthType value) {
        this.minimumDepth = value;
    }

    public boolean isSetMinimumDepth() {
        return (this.minimumDepth!= null);
    }

    /**
     * Gets the value of the numberOfAircraftParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAircraftParkingSpaces() {
        return numberOfAircraftParkingSpaces;
    }

    /**
     * Sets the value of the numberOfAircraftParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAircraftParkingSpaces(BigInteger value) {
        this.numberOfAircraftParkingSpaces = value;
    }

    public boolean isSetNumberOfAircraftParkingSpaces() {
        return (this.numberOfAircraftParkingSpaces!= null);
    }

    /**
     * Gets the value of the pavementType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPavementType() {
        return pavementType;
    }

    /**
     * Sets the value of the pavementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPavementType(CodeType value) {
        this.pavementType = value;
    }

    public boolean isSetPavementType() {
        return (this.pavementType!= null);
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
