//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for WeatherObservationTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherObservationTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="totalRainfall" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maxRainfallPerHour" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="averageTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maxTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageWindSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maxWindDirection" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherObservationTypeType", propOrder = {
    "date",
    "totalRainfall",
    "maxRainfallPerHour",
    "averageTemperature",
    "maxTemperature",
    "minTemperature",
    "averageWindSpeed",
    "maxWindDirection"
})
public class WeatherObservationTypeType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected LengthType totalRainfall;
    protected LengthType maxRainfallPerHour;
    protected Double averageTemperature;
    protected Double maxTemperature;
    protected Double minTemperature;
    protected Double averageWindSpeed;
    protected CodeType maxWindDirection;

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
     * Gets the value of the totalRainfall property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTotalRainfall() {
        return totalRainfall;
    }

    /**
     * Sets the value of the totalRainfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTotalRainfall(LengthType value) {
        this.totalRainfall = value;
    }

    public boolean isSetTotalRainfall() {
        return (this.totalRainfall!= null);
    }

    /**
     * Gets the value of the maxRainfallPerHour property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaxRainfallPerHour() {
        return maxRainfallPerHour;
    }

    /**
     * Sets the value of the maxRainfallPerHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaxRainfallPerHour(LengthType value) {
        this.maxRainfallPerHour = value;
    }

    public boolean isSetMaxRainfallPerHour() {
        return (this.maxRainfallPerHour!= null);
    }

    /**
     * Gets the value of the averageTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageTemperature() {
        return averageTemperature;
    }

    /**
     * Sets the value of the averageTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageTemperature(Double value) {
        this.averageTemperature = value;
    }

    public boolean isSetAverageTemperature() {
        return (this.averageTemperature!= null);
    }

    /**
     * Gets the value of the maxTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Sets the value of the maxTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTemperature(Double value) {
        this.maxTemperature = value;
    }

    public boolean isSetMaxTemperature() {
        return (this.maxTemperature!= null);
    }

    /**
     * Gets the value of the minTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * Sets the value of the minTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTemperature(Double value) {
        this.minTemperature = value;
    }

    public boolean isSetMinTemperature() {
        return (this.minTemperature!= null);
    }

    /**
     * Gets the value of the averageWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageWindSpeed() {
        return averageWindSpeed;
    }

    /**
     * Sets the value of the averageWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageWindSpeed(Double value) {
        this.averageWindSpeed = value;
    }

    public boolean isSetAverageWindSpeed() {
        return (this.averageWindSpeed!= null);
    }

    /**
     * Gets the value of the maxWindDirection property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaxWindDirection() {
        return maxWindDirection;
    }

    /**
     * Sets the value of the maxWindDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaxWindDirection(CodeType value) {
        this.maxWindDirection = value;
    }

    public boolean isSetMaxWindDirection() {
        return (this.maxWindDirection!= null);
    }

}
