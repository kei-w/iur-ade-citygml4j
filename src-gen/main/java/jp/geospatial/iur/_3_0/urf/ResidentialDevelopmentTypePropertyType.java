//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResidentialDevelopmentTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidentialDevelopmentTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.0}ResidentialDevelopmentType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentialDevelopmentTypePropertyType", propOrder = {
    "residentialDevelopmentType"
})
public class ResidentialDevelopmentTypePropertyType {

    @XmlElement(name = "ResidentialDevelopmentType", required = true)
    protected ResidentialDevelopmentTypeType residentialDevelopmentType;

    /**
     * Gets the value of the residentialDevelopmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialDevelopmentTypeType }
     *     
     */
    public ResidentialDevelopmentTypeType getResidentialDevelopmentType() {
        return residentialDevelopmentType;
    }

    /**
     * Sets the value of the residentialDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialDevelopmentTypeType }
     *     
     */
    public void setResidentialDevelopmentType(ResidentialDevelopmentTypeType value) {
        this.residentialDevelopmentType = value;
    }

    public boolean isSetResidentialDevelopmentType() {
        return (this.residentialDevelopmentType!= null);
    }

}
