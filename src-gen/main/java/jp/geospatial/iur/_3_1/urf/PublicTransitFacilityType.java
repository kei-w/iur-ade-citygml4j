//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 11:58:45 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for PublicTransitFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicTransitFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="facilityType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="secionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frequencyOfService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCustomers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicTransitFacilityType", propOrder = {
    "identifier",
    "companyName",
    "companyType",
    "facilityType",
    "secionName",
    "frequencyOfService",
    "numberOfCustomers"
})
public class PublicTransitFacilityType
    extends UrbanFunctionType
{

    @XmlElement(name = "id", required = true)
    protected String identifier;
    protected String companyName;
    protected CodeType companyType;
    protected CodeType facilityType;
    protected String secionName;
    protected BigInteger frequencyOfService;
    protected BigInteger numberOfCustomers;

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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public boolean isSetCompanyName() {
        return (this.companyName!= null);
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCompanyType(CodeType value) {
        this.companyType = value;
    }

    public boolean isSetCompanyType() {
        return (this.companyType!= null);
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFacilityType(CodeType value) {
        this.facilityType = value;
    }

    public boolean isSetFacilityType() {
        return (this.facilityType!= null);
    }

    /**
     * Gets the value of the secionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecionName() {
        return secionName;
    }

    /**
     * Sets the value of the secionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecionName(String value) {
        this.secionName = value;
    }

    public boolean isSetSecionName() {
        return (this.secionName!= null);
    }

    /**
     * Gets the value of the frequencyOfService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequencyOfService() {
        return frequencyOfService;
    }

    /**
     * Sets the value of the frequencyOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequencyOfService(BigInteger value) {
        this.frequencyOfService = value;
    }

    public boolean isSetFrequencyOfService() {
        return (this.frequencyOfService!= null);
    }

    /**
     * Gets the value of the numberOfCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * Sets the value of the numberOfCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCustomers(BigInteger value) {
        this.numberOfCustomers = value;
    }

    public boolean isSetNumberOfCustomers() {
        return (this.numberOfCustomers!= null);
    }

}
