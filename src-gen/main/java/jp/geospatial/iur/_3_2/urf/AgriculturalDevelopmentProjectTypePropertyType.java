//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgriculturalDevelopmentProjectTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgriculturalDevelopmentProjectTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}AgriculturalDevelopmentProjectType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgriculturalDevelopmentProjectTypePropertyType", propOrder = {
    "agriculturalDevelopmentProjectType"
})
public class AgriculturalDevelopmentProjectTypePropertyType {

    @XmlElement(name = "AgriculturalDevelopmentProjectType", required = true)
    protected AgriculturalDevelopmentProjectTypeType agriculturalDevelopmentProjectType;

    /**
     * Gets the value of the agriculturalDevelopmentProjectType property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalDevelopmentProjectTypeType }
     *     
     */
    public AgriculturalDevelopmentProjectTypeType getAgriculturalDevelopmentProjectType() {
        return agriculturalDevelopmentProjectType;
    }

    /**
     * Sets the value of the agriculturalDevelopmentProjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalDevelopmentProjectTypeType }
     *     
     */
    public void setAgriculturalDevelopmentProjectType(AgriculturalDevelopmentProjectTypeType value) {
        this.agriculturalDevelopmentProjectType = value;
    }

    public boolean isSetAgriculturalDevelopmentProjectType() {
        return (this.agriculturalDevelopmentProjectType!= null);
    }

}
