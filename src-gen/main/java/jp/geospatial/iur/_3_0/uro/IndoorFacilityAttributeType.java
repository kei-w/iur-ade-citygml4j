//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndoorFacilityAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndoorFacilityAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IndoorAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weekdayHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weekendHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorFacilityAttributeType", propOrder = {
    "weekdayHours",
    "weekendHours",
    "phone",
    "website"
})
public class IndoorFacilityAttributeType
    extends IndoorAttributeType
{

    protected String weekdayHours;
    protected String weekendHours;
    protected String phone;
    protected String website;

    /**
     * Gets the value of the weekdayHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekdayHours() {
        return weekdayHours;
    }

    /**
     * Sets the value of the weekdayHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekdayHours(String value) {
        this.weekdayHours = value;
    }

    public boolean isSetWeekdayHours() {
        return (this.weekdayHours!= null);
    }

    /**
     * Gets the value of the weekendHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendHours() {
        return weekendHours;
    }

    /**
     * Sets the value of the weekendHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendHours(String value) {
        this.weekendHours = value;
    }

    public boolean isSetWeekendHours() {
        return (this.weekendHours!= null);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    public boolean isSetWebsite() {
        return (this.website!= null);
    }

}
