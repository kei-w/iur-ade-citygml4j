//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:49:19 JST 2026
//


package jp.geospatial.iur._2_0.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for StopTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/2.0}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="stopSequence" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="headsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pickupType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dropoffType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousPickupType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousDropoffType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="shapeDistanceTraveled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="timePoint" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="trip" type="{https://www.geospatial.jp/iur/urt/2.0}TripPropertyType"/&gt;
 *         &lt;element name="stop" type="{https://www.geospatial.jp/iur/urt/2.0}StopPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimeType", propOrder = {
    "arrivalTime",
    "departureTime",
    "stopSequence",
    "headsign",
    "pickupType",
    "dropoffType",
    "continuousPickupType",
    "continuousDropoffType",
    "shapeDistanceTraveled",
    "timePoint",
    "trip",
    "stop"
})
public class StopTimeType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar arrivalTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(required = true)
    protected BigInteger stopSequence;
    protected String headsign;
    protected CodeType pickupType;
    protected CodeType dropoffType;
    protected CodeType continuousPickupType;
    protected CodeType continuousDropoffType;
    protected Double shapeDistanceTraveled;
    protected CodeType timePoint;
    @XmlElement(required = true)
    protected TripPropertyType trip;
    @XmlElement(required = true)
    protected StopPropertyType stop;

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalTime(XMLGregorianCalendar value) {
        this.arrivalTime = value;
    }

    public boolean isSetArrivalTime() {
        return (this.arrivalTime!= null);
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    public boolean isSetDepartureTime() {
        return (this.departureTime!= null);
    }

    /**
     * Gets the value of the stopSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopSequence() {
        return stopSequence;
    }

    /**
     * Sets the value of the stopSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopSequence(BigInteger value) {
        this.stopSequence = value;
    }

    public boolean isSetStopSequence() {
        return (this.stopSequence!= null);
    }

    /**
     * Gets the value of the headsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadsign() {
        return headsign;
    }

    /**
     * Sets the value of the headsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadsign(String value) {
        this.headsign = value;
    }

    public boolean isSetHeadsign() {
        return (this.headsign!= null);
    }

    /**
     * Gets the value of the pickupType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPickupType() {
        return pickupType;
    }

    /**
     * Sets the value of the pickupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPickupType(CodeType value) {
        this.pickupType = value;
    }

    public boolean isSetPickupType() {
        return (this.pickupType!= null);
    }

    /**
     * Gets the value of the dropoffType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDropoffType() {
        return dropoffType;
    }

    /**
     * Sets the value of the dropoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDropoffType(CodeType value) {
        this.dropoffType = value;
    }

    public boolean isSetDropoffType() {
        return (this.dropoffType!= null);
    }

    /**
     * Gets the value of the continuousPickupType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousPickupType() {
        return continuousPickupType;
    }

    /**
     * Sets the value of the continuousPickupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousPickupType(CodeType value) {
        this.continuousPickupType = value;
    }

    public boolean isSetContinuousPickupType() {
        return (this.continuousPickupType!= null);
    }

    /**
     * Gets the value of the continuousDropoffType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousDropoffType() {
        return continuousDropoffType;
    }

    /**
     * Sets the value of the continuousDropoffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousDropoffType(CodeType value) {
        this.continuousDropoffType = value;
    }

    public boolean isSetContinuousDropoffType() {
        return (this.continuousDropoffType!= null);
    }

    /**
     * Gets the value of the shapeDistanceTraveled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShapeDistanceTraveled() {
        return shapeDistanceTraveled;
    }

    /**
     * Sets the value of the shapeDistanceTraveled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShapeDistanceTraveled(Double value) {
        this.shapeDistanceTraveled = value;
    }

    public boolean isSetShapeDistanceTraveled() {
        return (this.shapeDistanceTraveled!= null);
    }

    /**
     * Gets the value of the timePoint property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTimePoint() {
        return timePoint;
    }

    /**
     * Sets the value of the timePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTimePoint(CodeType value) {
        this.timePoint = value;
    }

    public boolean isSetTimePoint() {
        return (this.timePoint!= null);
    }

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link TripPropertyType }
     *     
     */
    public TripPropertyType getTrip() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPropertyType }
     *     
     */
    public void setTrip(TripPropertyType value) {
        this.trip = value;
    }

    public boolean isSetTrip() {
        return (this.trip!= null);
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setStop(StopPropertyType value) {
        this.stop = value;
    }

    public boolean isSetStop() {
        return (this.stop!= null);
    }

}
