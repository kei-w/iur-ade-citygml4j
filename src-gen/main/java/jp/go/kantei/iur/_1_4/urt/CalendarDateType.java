//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for CalendarDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="exceptionType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="calendar" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateType", propOrder = {
    "date",
    "exceptionType",
    "calendar"
})
public class CalendarDateType
    extends PublicTransitType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected CodeType exceptionType;
    protected CalendarPropertyType calendar;

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
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExceptionType(CodeType value) {
        this.exceptionType = value;
    }

    public boolean isSetExceptionType() {
        return (this.exceptionType!= null);
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPropertyType }
     *     
     */
    public CalendarPropertyType getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPropertyType }
     *     
     */
    public void setCalendar(CalendarPropertyType value) {
        this.calendar = value;
    }

    public boolean isSetCalendar() {
        return (this.calendar!= null);
    }

}
