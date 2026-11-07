//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcPsetOpeningElementCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetOpeningElementCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fireExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="protectedOpening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="parallelJambs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetOpeningElementCommonType", propOrder = {
    "reference",
    "purpose",
    "fireExit",
    "protectedOpening",
    "parallelJambs"
})
public class IfcPsetOpeningElementCommonType
    extends IfcAttributeType
{

    protected String reference;
    protected String purpose;
    protected Boolean fireExit;
    protected Boolean protectedOpening;
    protected Boolean parallelJambs;

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
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    public boolean isSetPurpose() {
        return (this.purpose!= null);
    }

    /**
     * Gets the value of the fireExit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFireExit() {
        return fireExit;
    }

    /**
     * Sets the value of the fireExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFireExit(Boolean value) {
        this.fireExit = value;
    }

    public boolean isSetFireExit() {
        return (this.fireExit!= null);
    }

    /**
     * Gets the value of the protectedOpening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtectedOpening() {
        return protectedOpening;
    }

    /**
     * Sets the value of the protectedOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectedOpening(Boolean value) {
        this.protectedOpening = value;
    }

    public boolean isSetProtectedOpening() {
        return (this.protectedOpening!= null);
    }

    /**
     * Gets the value of the parallelJambs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelJambs() {
        return parallelJambs;
    }

    /**
     * Sets the value of the parallelJambs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelJambs(Boolean value) {
        this.parallelJambs = value;
    }

    public boolean isSetParallelJambs() {
        return (this.parallelJambs!= null);
    }

}
