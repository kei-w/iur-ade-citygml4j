//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for AgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="timeZone" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="language" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fareUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presidentPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="presidentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyType", propOrder = {
    "agencyName",
    "url",
    "timeZone",
    "language",
    "phone",
    "fareUrl",
    "email",
    "officialName",
    "zipNumber",
    "address",
    "presidentPosition",
    "presidentName"
})
public class AgencyType
    extends PublicTransitType
{

    @XmlElement(name = "name", required = true)
    protected String agencyName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected CodeType timeZone;
    protected CodeType language;
    protected String phone;
    @XmlSchemaType(name = "anyURI")
    protected String fareUrl;
    protected String email;
    protected String officialName;
    protected String zipNumber;
    protected String address;
    protected String presidentPosition;
    protected String presidentName;

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    public boolean isSetAgencyName() {
        return (this.agencyName!= null);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTimeZone(CodeType value) {
        this.timeZone = value;
    }

    public boolean isSetTimeZone() {
        return (this.timeZone!= null);
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLanguage(CodeType value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
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
     * Gets the value of the fareUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareUrl() {
        return fareUrl;
    }

    /**
     * Sets the value of the fareUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareUrl(String value) {
        this.fareUrl = value;
    }

    public boolean isSetFareUrl() {
        return (this.fareUrl!= null);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    public boolean isSetEmail() {
        return (this.email!= null);
    }

    /**
     * Gets the value of the officialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialName() {
        return officialName;
    }

    /**
     * Sets the value of the officialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialName(String value) {
        this.officialName = value;
    }

    public boolean isSetOfficialName() {
        return (this.officialName!= null);
    }

    /**
     * Gets the value of the zipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipNumber() {
        return zipNumber;
    }

    /**
     * Sets the value of the zipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipNumber(String value) {
        this.zipNumber = value;
    }

    public boolean isSetZipNumber() {
        return (this.zipNumber!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the presidentPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresidentPosition() {
        return presidentPosition;
    }

    /**
     * Sets the value of the presidentPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresidentPosition(String value) {
        this.presidentPosition = value;
    }

    public boolean isSetPresidentPosition() {
        return (this.presidentPosition!= null);
    }

    /**
     * Gets the value of the presidentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresidentName() {
        return presidentName;
    }

    /**
     * Sets the value of the presidentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresidentName(String value) {
        this.presidentName = value;
    }

    public boolean isSetPresidentName() {
        return (this.presidentName!= null);
    }

}
