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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for FishingPortCapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishingPortCapacityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}FishingPortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightCapacity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="hullForm" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="shipNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="waterDepth-2m" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="waterDepth2-3m" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="waterDepth3-6m" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="waterDepth6-m" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="heightAboveAWL" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="heightOnFoundations" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="luminousRange" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="luminousColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="candlePower" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumGroundingWeight" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="handleablePower" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maximumWaterSupply" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maximumRefueling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="people" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishingPortCapacityType", propOrder = {
    "capacity",
    "weightCapacity",
    "hullForm",
    "shipNumber",
    "waterDepth2M",
    "waterDepth23M",
    "waterDepth36M",
    "waterDepth6M",
    "heightAboveAWL",
    "heightOnFoundations",
    "luminousRange",
    "luminousColor",
    "candlePower",
    "lightType",
    "period",
    "maximumGroundingWeight",
    "handleablePower",
    "maximumWaterSupply",
    "maximumRefueling",
    "people",
    "other"
})
public class FishingPortCapacityType
    extends FishingPortAttributeType
{

    protected String capacity;
    protected MeasureType weightCapacity;
    protected BigInteger hullForm;
    protected BigInteger shipNumber;
    @XmlElement(name = "waterDepth-2m")
    protected MeasureType waterDepth2M;
    @XmlElement(name = "waterDepth2-3m")
    protected MeasureType waterDepth23M;
    @XmlElement(name = "waterDepth3-6m")
    protected MeasureType waterDepth36M;
    @XmlElement(name = "waterDepth6-m")
    protected MeasureType waterDepth6M;
    protected LengthType heightAboveAWL;
    protected LengthType heightOnFoundations;
    protected LengthType luminousRange;
    protected String luminousColor;
    protected BigInteger candlePower;
    protected String lightType;
    protected String period;
    protected BigInteger maximumGroundingWeight;
    protected BigInteger handleablePower;
    protected BigInteger maximumWaterSupply;
    protected String maximumRefueling;
    protected BigInteger people;
    protected String other;

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacity(String value) {
        this.capacity = value;
    }

    public boolean isSetCapacity() {
        return (this.capacity!= null);
    }

    /**
     * Gets the value of the weightCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightCapacity() {
        return weightCapacity;
    }

    /**
     * Sets the value of the weightCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightCapacity(MeasureType value) {
        this.weightCapacity = value;
    }

    public boolean isSetWeightCapacity() {
        return (this.weightCapacity!= null);
    }

    /**
     * Gets the value of the hullForm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHullForm() {
        return hullForm;
    }

    /**
     * Sets the value of the hullForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHullForm(BigInteger value) {
        this.hullForm = value;
    }

    public boolean isSetHullForm() {
        return (this.hullForm!= null);
    }

    /**
     * Gets the value of the shipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipNumber() {
        return shipNumber;
    }

    /**
     * Sets the value of the shipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipNumber(BigInteger value) {
        this.shipNumber = value;
    }

    public boolean isSetShipNumber() {
        return (this.shipNumber!= null);
    }

    /**
     * Gets the value of the waterDepth2M property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWaterDepth2M() {
        return waterDepth2M;
    }

    /**
     * Sets the value of the waterDepth2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWaterDepth2M(MeasureType value) {
        this.waterDepth2M = value;
    }

    public boolean isSetWaterDepth2M() {
        return (this.waterDepth2M!= null);
    }

    /**
     * Gets the value of the waterDepth23M property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWaterDepth23M() {
        return waterDepth23M;
    }

    /**
     * Sets the value of the waterDepth23M property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWaterDepth23M(MeasureType value) {
        this.waterDepth23M = value;
    }

    public boolean isSetWaterDepth23M() {
        return (this.waterDepth23M!= null);
    }

    /**
     * Gets the value of the waterDepth36M property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWaterDepth36M() {
        return waterDepth36M;
    }

    /**
     * Sets the value of the waterDepth36M property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWaterDepth36M(MeasureType value) {
        this.waterDepth36M = value;
    }

    public boolean isSetWaterDepth36M() {
        return (this.waterDepth36M!= null);
    }

    /**
     * Gets the value of the waterDepth6M property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWaterDepth6M() {
        return waterDepth6M;
    }

    /**
     * Sets the value of the waterDepth6M property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWaterDepth6M(MeasureType value) {
        this.waterDepth6M = value;
    }

    public boolean isSetWaterDepth6M() {
        return (this.waterDepth6M!= null);
    }

    /**
     * Gets the value of the heightAboveAWL property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeightAboveAWL() {
        return heightAboveAWL;
    }

    /**
     * Sets the value of the heightAboveAWL property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeightAboveAWL(LengthType value) {
        this.heightAboveAWL = value;
    }

    public boolean isSetHeightAboveAWL() {
        return (this.heightAboveAWL!= null);
    }

    /**
     * Gets the value of the heightOnFoundations property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeightOnFoundations() {
        return heightOnFoundations;
    }

    /**
     * Sets the value of the heightOnFoundations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeightOnFoundations(LengthType value) {
        this.heightOnFoundations = value;
    }

    public boolean isSetHeightOnFoundations() {
        return (this.heightOnFoundations!= null);
    }

    /**
     * Gets the value of the luminousRange property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLuminousRange() {
        return luminousRange;
    }

    /**
     * Sets the value of the luminousRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLuminousRange(LengthType value) {
        this.luminousRange = value;
    }

    public boolean isSetLuminousRange() {
        return (this.luminousRange!= null);
    }

    /**
     * Gets the value of the luminousColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuminousColor() {
        return luminousColor;
    }

    /**
     * Sets the value of the luminousColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuminousColor(String value) {
        this.luminousColor = value;
    }

    public boolean isSetLuminousColor() {
        return (this.luminousColor!= null);
    }

    /**
     * Gets the value of the candlePower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCandlePower() {
        return candlePower;
    }

    /**
     * Sets the value of the candlePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCandlePower(BigInteger value) {
        this.candlePower = value;
    }

    public boolean isSetCandlePower() {
        return (this.candlePower!= null);
    }

    /**
     * Gets the value of the lightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightType() {
        return lightType;
    }

    /**
     * Sets the value of the lightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightType(String value) {
        this.lightType = value;
    }

    public boolean isSetLightType() {
        return (this.lightType!= null);
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Gets the value of the maximumGroundingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumGroundingWeight() {
        return maximumGroundingWeight;
    }

    /**
     * Sets the value of the maximumGroundingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumGroundingWeight(BigInteger value) {
        this.maximumGroundingWeight = value;
    }

    public boolean isSetMaximumGroundingWeight() {
        return (this.maximumGroundingWeight!= null);
    }

    /**
     * Gets the value of the handleablePower property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHandleablePower() {
        return handleablePower;
    }

    /**
     * Sets the value of the handleablePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHandleablePower(BigInteger value) {
        this.handleablePower = value;
    }

    public boolean isSetHandleablePower() {
        return (this.handleablePower!= null);
    }

    /**
     * Gets the value of the maximumWaterSupply property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumWaterSupply() {
        return maximumWaterSupply;
    }

    /**
     * Sets the value of the maximumWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumWaterSupply(BigInteger value) {
        this.maximumWaterSupply = value;
    }

    public boolean isSetMaximumWaterSupply() {
        return (this.maximumWaterSupply!= null);
    }

    /**
     * Gets the value of the maximumRefueling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumRefueling() {
        return maximumRefueling;
    }

    /**
     * Sets the value of the maximumRefueling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumRefueling(String value) {
        this.maximumRefueling = value;
    }

    public boolean isSetMaximumRefueling() {
        return (this.maximumRefueling!= null);
    }

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeople(BigInteger value) {
        this.people = value;
    }

    public boolean isSetPeople() {
        return (this.people!= null);
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    public boolean isSetOther() {
        return (this.other!= null);
    }

}
