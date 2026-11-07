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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrafficVolumeAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficVolumeAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}RoadAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sectionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weekday12hourTrafficVolume" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="weekday24hourTrafficVolume" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="largeVehicleRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="congestionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageTravelSpeedInCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageInboundTravelSpeedInCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageOutboundTravelSpeedInCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageInboundTravelSpeedNotCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="averageOutboundTravelSpeedNotCongestion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="observationPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficVolumeAttributeType", propOrder = {
    "sectionID",
    "routeName",
    "weekday12HourTrafficVolume",
    "weekday24HourTrafficVolume",
    "largeVehicleRate",
    "congestionRate",
    "averageTravelSpeedInCongestion",
    "averageInboundTravelSpeedInCongestion",
    "averageOutboundTravelSpeedInCongestion",
    "averageInboundTravelSpeedNotCongestion",
    "averageOutboundTravelSpeedNotCongestion",
    "observationPointName",
    "reference",
    "surveyYear"
})
public class TrafficVolumeAttributeType
    extends RoadAttributeType
{

    protected String sectionID;
    protected String routeName;
    @XmlElement(name = "weekday12hourTrafficVolume")
    protected BigInteger weekday12HourTrafficVolume;
    @XmlElement(name = "weekday24hourTrafficVolume")
    protected BigInteger weekday24HourTrafficVolume;
    protected Double largeVehicleRate;
    protected Double congestionRate;
    protected Double averageTravelSpeedInCongestion;
    protected Double averageInboundTravelSpeedInCongestion;
    protected Double averageOutboundTravelSpeedInCongestion;
    protected Double averageInboundTravelSpeedNotCongestion;
    protected Double averageOutboundTravelSpeedNotCongestion;
    protected String observationPointName;
    protected String reference;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;

    /**
     * Gets the value of the sectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionID() {
        return sectionID;
    }

    /**
     * Sets the value of the sectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionID(String value) {
        this.sectionID = value;
    }

    public boolean isSetSectionID() {
        return (this.sectionID!= null);
    }

    /**
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    public boolean isSetRouteName() {
        return (this.routeName!= null);
    }

    /**
     * Gets the value of the weekday12HourTrafficVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeekday12HourTrafficVolume() {
        return weekday12HourTrafficVolume;
    }

    /**
     * Sets the value of the weekday12HourTrafficVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeekday12HourTrafficVolume(BigInteger value) {
        this.weekday12HourTrafficVolume = value;
    }

    public boolean isSetWeekday12HourTrafficVolume() {
        return (this.weekday12HourTrafficVolume!= null);
    }

    /**
     * Gets the value of the weekday24HourTrafficVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeekday24HourTrafficVolume() {
        return weekday24HourTrafficVolume;
    }

    /**
     * Sets the value of the weekday24HourTrafficVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeekday24HourTrafficVolume(BigInteger value) {
        this.weekday24HourTrafficVolume = value;
    }

    public boolean isSetWeekday24HourTrafficVolume() {
        return (this.weekday24HourTrafficVolume!= null);
    }

    /**
     * Gets the value of the largeVehicleRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargeVehicleRate() {
        return largeVehicleRate;
    }

    /**
     * Sets the value of the largeVehicleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargeVehicleRate(Double value) {
        this.largeVehicleRate = value;
    }

    public boolean isSetLargeVehicleRate() {
        return (this.largeVehicleRate!= null);
    }

    /**
     * Gets the value of the congestionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCongestionRate() {
        return congestionRate;
    }

    /**
     * Sets the value of the congestionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCongestionRate(Double value) {
        this.congestionRate = value;
    }

    public boolean isSetCongestionRate() {
        return (this.congestionRate!= null);
    }

    /**
     * Gets the value of the averageTravelSpeedInCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageTravelSpeedInCongestion() {
        return averageTravelSpeedInCongestion;
    }

    /**
     * Sets the value of the averageTravelSpeedInCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageTravelSpeedInCongestion(Double value) {
        this.averageTravelSpeedInCongestion = value;
    }

    public boolean isSetAverageTravelSpeedInCongestion() {
        return (this.averageTravelSpeedInCongestion!= null);
    }

    /**
     * Gets the value of the averageInboundTravelSpeedInCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageInboundTravelSpeedInCongestion() {
        return averageInboundTravelSpeedInCongestion;
    }

    /**
     * Sets the value of the averageInboundTravelSpeedInCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageInboundTravelSpeedInCongestion(Double value) {
        this.averageInboundTravelSpeedInCongestion = value;
    }

    public boolean isSetAverageInboundTravelSpeedInCongestion() {
        return (this.averageInboundTravelSpeedInCongestion!= null);
    }

    /**
     * Gets the value of the averageOutboundTravelSpeedInCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageOutboundTravelSpeedInCongestion() {
        return averageOutboundTravelSpeedInCongestion;
    }

    /**
     * Sets the value of the averageOutboundTravelSpeedInCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageOutboundTravelSpeedInCongestion(Double value) {
        this.averageOutboundTravelSpeedInCongestion = value;
    }

    public boolean isSetAverageOutboundTravelSpeedInCongestion() {
        return (this.averageOutboundTravelSpeedInCongestion!= null);
    }

    /**
     * Gets the value of the averageInboundTravelSpeedNotCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageInboundTravelSpeedNotCongestion() {
        return averageInboundTravelSpeedNotCongestion;
    }

    /**
     * Sets the value of the averageInboundTravelSpeedNotCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageInboundTravelSpeedNotCongestion(Double value) {
        this.averageInboundTravelSpeedNotCongestion = value;
    }

    public boolean isSetAverageInboundTravelSpeedNotCongestion() {
        return (this.averageInboundTravelSpeedNotCongestion!= null);
    }

    /**
     * Gets the value of the averageOutboundTravelSpeedNotCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageOutboundTravelSpeedNotCongestion() {
        return averageOutboundTravelSpeedNotCongestion;
    }

    /**
     * Sets the value of the averageOutboundTravelSpeedNotCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageOutboundTravelSpeedNotCongestion(Double value) {
        this.averageOutboundTravelSpeedNotCongestion = value;
    }

    public boolean isSetAverageOutboundTravelSpeedNotCongestion() {
        return (this.averageOutboundTravelSpeedNotCongestion!= null);
    }

    /**
     * Gets the value of the observationPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationPointName() {
        return observationPointName;
    }

    /**
     * Sets the value of the observationPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationPointName(String value) {
        this.observationPointName = value;
    }

    public boolean isSetObservationPointName() {
        return (this.observationPointName!= null);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
    }

    /**
     * Gets the value of the surveyYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyYear() {
        return surveyYear;
    }

    /**
     * Sets the value of the surveyYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyYear(XMLGregorianCalendar value) {
        this.surveyYear = value;
    }

    public boolean isSetSurveyYear() {
        return (this.surveyYear!= null);
    }

}
