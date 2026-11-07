//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateIDAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateIDAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}RealEstateIDAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateIDAttributePropertyType", propOrder = {
    "realEstateIDAttribute"
})
public class RealEstateIDAttributePropertyType {

    @XmlElement(name = "RealEstateIDAttribute", required = true)
    protected RealEstateIDAttributeType realEstateIDAttribute;

    /**
     * Gets the value of the realEstateIDAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateIDAttributeType }
     *     
     */
    public RealEstateIDAttributeType getRealEstateIDAttribute() {
        return realEstateIDAttribute;
    }

    /**
     * Sets the value of the realEstateIDAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateIDAttributeType }
     *     
     */
    public void setRealEstateIDAttribute(RealEstateIDAttributeType value) {
        this.realEstateIDAttribute = value;
    }

    public boolean isSetRealEstateIDAttribute() {
        return (this.realEstateIDAttribute!= null);
    }

}
