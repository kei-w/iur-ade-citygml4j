//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:01:11 JST 2026
//


package jp.geospatial.iur._3_1.urg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for LandslideDisasterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandslideDisasterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urg/3.1}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateOfOccurence" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="landSlideType" type="{https://www.geospatial.jp/iur/urg/3.1}LandSlideTypeValue" minOccurs="0"/&gt;
 *         &lt;element name="maximumRainfallPerDay" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumRainfallPerHour" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="slope" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="sedimentDischarge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandslideDisasterType", propOrder = {
    "dateOfOccurence",
    "landSlideType",
    "maximumRainfallPerDay",
    "maximumRainfallPerHour",
    "slope",
    "sedimentDischarge",
    "length"
})
public class LandslideDisasterType
    extends StatisticalGridType
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfOccurence;
    @XmlSchemaType(name = "string")
    protected LandSlideTypeValue landSlideType;
    protected LengthType maximumRainfallPerDay;
    protected LengthType maximumRainfallPerHour;
    protected BigInteger slope;
    protected BigInteger sedimentDischarge;
    protected LengthType length;

    /**
     * Gets the value of the dateOfOccurence property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfOccurence() {
        return dateOfOccurence;
    }

    /**
     * Sets the value of the dateOfOccurence property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfOccurence(XMLGregorianCalendar value) {
        this.dateOfOccurence = value;
    }

    public boolean isSetDateOfOccurence() {
        return (this.dateOfOccurence!= null);
    }

    /**
     * Gets the value of the landSlideType property.
     * 
     * @return
     *     possible object is
     *     {@link LandSlideTypeValue }
     *     
     */
    public LandSlideTypeValue getLandSlideType() {
        return landSlideType;
    }

    /**
     * Sets the value of the landSlideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandSlideTypeValue }
     *     
     */
    public void setLandSlideType(LandSlideTypeValue value) {
        this.landSlideType = value;
    }

    public boolean isSetLandSlideType() {
        return (this.landSlideType!= null);
    }

    /**
     * Gets the value of the maximumRainfallPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumRainfallPerDay() {
        return maximumRainfallPerDay;
    }

    /**
     * Sets the value of the maximumRainfallPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumRainfallPerDay(LengthType value) {
        this.maximumRainfallPerDay = value;
    }

    public boolean isSetMaximumRainfallPerDay() {
        return (this.maximumRainfallPerDay!= null);
    }

    /**
     * Gets the value of the maximumRainfallPerHour property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumRainfallPerHour() {
        return maximumRainfallPerHour;
    }

    /**
     * Sets the value of the maximumRainfallPerHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumRainfallPerHour(LengthType value) {
        this.maximumRainfallPerHour = value;
    }

    public boolean isSetMaximumRainfallPerHour() {
        return (this.maximumRainfallPerHour!= null);
    }

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSlope(BigInteger value) {
        this.slope = value;
    }

    public boolean isSetSlope() {
        return (this.slope!= null);
    }

    /**
     * Gets the value of the sedimentDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSedimentDischarge() {
        return sedimentDischarge;
    }

    /**
     * Sets the value of the sedimentDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSedimentDischarge(BigInteger value) {
        this.sedimentDischarge = value;
    }

    public boolean isSetSedimentDischarge() {
        return (this.sedimentDischarge!= null);
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

}
