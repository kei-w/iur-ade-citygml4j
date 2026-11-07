//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SewerSystemAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SewerSystemAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/2.0}SewerSystemAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SewerSystemAttributePropertyType", propOrder = {
    "sewerSystemAttribute"
})
public class SewerSystemAttributePropertyType {

    @XmlElement(name = "SewerSystemAttribute", required = true)
    protected SewerSystemAttributeType sewerSystemAttribute;

    /**
     * Gets the value of the sewerSystemAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link SewerSystemAttributeType }
     *     
     */
    public SewerSystemAttributeType getSewerSystemAttribute() {
        return sewerSystemAttribute;
    }

    /**
     * Sets the value of the sewerSystemAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SewerSystemAttributeType }
     *     
     */
    public void setSewerSystemAttribute(SewerSystemAttributeType value) {
        this.sewerSystemAttribute = value;
    }

    public boolean isSetSewerSystemAttribute() {
        return (this.sewerSystemAttribute!= null);
    }

}
