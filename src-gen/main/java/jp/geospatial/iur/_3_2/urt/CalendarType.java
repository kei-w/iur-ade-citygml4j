//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.2}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarType", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday",
    "startDate",
    "endDate"
})
public class CalendarType
    extends PublicTransitType
{

    protected boolean monday;
    protected boolean tuesday;
    protected boolean wednesday;
    protected boolean thursday;
    protected boolean friday;
    protected boolean saturday;
    protected boolean sunday;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the monday property.
     * 
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     */
    public void setMonday(boolean value) {
        this.monday = value;
    }

    public boolean isSetMonday() {
        return true;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     */
    public void setTuesday(boolean value) {
        this.tuesday = value;
    }

    public boolean isSetTuesday() {
        return true;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     */
    public void setWednesday(boolean value) {
        this.wednesday = value;
    }

    public boolean isSetWednesday() {
        return true;
    }

    /**
     * Gets the value of the thursday property.
     * 
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     */
    public void setThursday(boolean value) {
        this.thursday = value;
    }

    public boolean isSetThursday() {
        return true;
    }

    /**
     * Gets the value of the friday property.
     * 
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     */
    public void setFriday(boolean value) {
        this.friday = value;
    }

    public boolean isSetFriday() {
        return true;
    }

    /**
     * Gets the value of the saturday property.
     * 
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     */
    public void setSaturday(boolean value) {
        this.saturday = value;
    }

    public boolean isSetSaturday() {
        return true;
    }

    /**
     * Gets the value of the sunday property.
     * 
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     */
    public void setSunday(boolean value) {
        this.sunday = value;
    }

    public boolean isSetSunday() {
        return true;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

}
