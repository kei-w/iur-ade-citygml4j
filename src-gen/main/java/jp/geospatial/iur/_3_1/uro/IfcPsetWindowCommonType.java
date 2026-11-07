//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcPsetWindowCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetWindowCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acousticRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fireRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="securityRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="infiltration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="thermalTransmittance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="glazingAreaFraction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="smokeStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetWindowCommonType", propOrder = {
    "reference",
    "acousticRating",
    "fireRating",
    "securityRating",
    "isExternal",
    "infiltration",
    "thermalTransmittance",
    "glazingAreaFraction",
    "smokeStop"
})
public class IfcPsetWindowCommonType
    extends IfcAttributeType
{

    protected String reference;
    protected String acousticRating;
    protected String fireRating;
    protected String securityRating;
    protected Boolean isExternal;
    protected Double infiltration;
    protected Double thermalTransmittance;
    protected Double glazingAreaFraction;
    protected Boolean smokeStop;

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
     * Gets the value of the acousticRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcousticRating() {
        return acousticRating;
    }

    /**
     * Sets the value of the acousticRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcousticRating(String value) {
        this.acousticRating = value;
    }

    public boolean isSetAcousticRating() {
        return (this.acousticRating!= null);
    }

    /**
     * Gets the value of the fireRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireRating() {
        return fireRating;
    }

    /**
     * Sets the value of the fireRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireRating(String value) {
        this.fireRating = value;
    }

    public boolean isSetFireRating() {
        return (this.fireRating!= null);
    }

    /**
     * Gets the value of the securityRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRating() {
        return securityRating;
    }

    /**
     * Sets the value of the securityRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRating(String value) {
        this.securityRating = value;
    }

    public boolean isSetSecurityRating() {
        return (this.securityRating!= null);
    }

    /**
     * Gets the value of the isExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Sets the value of the isExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

    public boolean isSetIsExternal() {
        return (this.isExternal!= null);
    }

    /**
     * Gets the value of the infiltration property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInfiltration() {
        return infiltration;
    }

    /**
     * Sets the value of the infiltration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInfiltration(Double value) {
        this.infiltration = value;
    }

    public boolean isSetInfiltration() {
        return (this.infiltration!= null);
    }

    /**
     * Gets the value of the thermalTransmittance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThermalTransmittance() {
        return thermalTransmittance;
    }

    /**
     * Sets the value of the thermalTransmittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThermalTransmittance(Double value) {
        this.thermalTransmittance = value;
    }

    public boolean isSetThermalTransmittance() {
        return (this.thermalTransmittance!= null);
    }

    /**
     * Gets the value of the glazingAreaFraction property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGlazingAreaFraction() {
        return glazingAreaFraction;
    }

    /**
     * Sets the value of the glazingAreaFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGlazingAreaFraction(Double value) {
        this.glazingAreaFraction = value;
    }

    public boolean isSetGlazingAreaFraction() {
        return (this.glazingAreaFraction!= null);
    }

    /**
     * Gets the value of the smokeStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokeStop() {
        return smokeStop;
    }

    /**
     * Sets the value of the smokeStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokeStop(Boolean value) {
        this.smokeStop = value;
    }

    public boolean isSetSmokeStop() {
        return (this.smokeStop!= null);
    }

}
