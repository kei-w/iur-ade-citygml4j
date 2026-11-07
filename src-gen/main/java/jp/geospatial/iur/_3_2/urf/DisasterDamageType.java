//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for DisasterDamageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisasterDamageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}_UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="damagedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfDamagedHouses" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousesFloodedAboveFloorLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousesFloodedBelowFloorLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maximumRainfallPerHour" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalRainfall" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisasterDamageType", propOrder = {
    "identifier",
    "date",
    "damagedArea",
    "numberOfDamagedHouses",
    "numberOfHousesFloodedAboveFloorLevel",
    "numberOfHousesFloodedBelowFloorLevel",
    "maximumRainfallPerHour",
    "totalRainfall"
})
public class DisasterDamageType
    extends _UrbanFunctionType
{

    @XmlElement(name = "id", required = true)
    protected String identifier;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected MeasureType damagedArea;
    protected BigInteger numberOfDamagedHouses;
    protected BigInteger numberOfHousesFloodedAboveFloorLevel;
    protected BigInteger numberOfHousesFloodedBelowFloorLevel;
    protected BigInteger maximumRainfallPerHour;
    protected BigInteger totalRainfall;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    public boolean isSetDate() {
        return (this.date!= null);
    }

    /**
     * Gets the value of the damagedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDamagedArea() {
        return damagedArea;
    }

    /**
     * Sets the value of the damagedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDamagedArea(MeasureType value) {
        this.damagedArea = value;
    }

    public boolean isSetDamagedArea() {
        return (this.damagedArea!= null);
    }

    /**
     * Gets the value of the numberOfDamagedHouses property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDamagedHouses() {
        return numberOfDamagedHouses;
    }

    /**
     * Sets the value of the numberOfDamagedHouses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDamagedHouses(BigInteger value) {
        this.numberOfDamagedHouses = value;
    }

    public boolean isSetNumberOfDamagedHouses() {
        return (this.numberOfDamagedHouses!= null);
    }

    /**
     * Gets the value of the numberOfHousesFloodedAboveFloorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHousesFloodedAboveFloorLevel() {
        return numberOfHousesFloodedAboveFloorLevel;
    }

    /**
     * Sets the value of the numberOfHousesFloodedAboveFloorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHousesFloodedAboveFloorLevel(BigInteger value) {
        this.numberOfHousesFloodedAboveFloorLevel = value;
    }

    public boolean isSetNumberOfHousesFloodedAboveFloorLevel() {
        return (this.numberOfHousesFloodedAboveFloorLevel!= null);
    }

    /**
     * Gets the value of the numberOfHousesFloodedBelowFloorLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHousesFloodedBelowFloorLevel() {
        return numberOfHousesFloodedBelowFloorLevel;
    }

    /**
     * Sets the value of the numberOfHousesFloodedBelowFloorLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHousesFloodedBelowFloorLevel(BigInteger value) {
        this.numberOfHousesFloodedBelowFloorLevel = value;
    }

    public boolean isSetNumberOfHousesFloodedBelowFloorLevel() {
        return (this.numberOfHousesFloodedBelowFloorLevel!= null);
    }

    /**
     * Gets the value of the maximumRainfallPerHour property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRainfallPerHour() {
        return maximumRainfallPerHour;
    }

    /**
     * Sets the value of the maximumRainfallPerHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRainfallPerHour(BigInteger value) {
        this.maximumRainfallPerHour = value;
    }

    public boolean isSetMaximumRainfallPerHour() {
        return (this.maximumRainfallPerHour!= null);
    }

    /**
     * Gets the value of the totalRainfall property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRainfall() {
        return totalRainfall;
    }

    /**
     * Sets the value of the totalRainfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRainfall(BigInteger value) {
        this.totalRainfall = value;
    }

    public boolean isSetTotalRainfall() {
        return (this.totalRainfall!= null);
    }

}
