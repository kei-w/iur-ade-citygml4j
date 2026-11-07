//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandUseDetailAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandUseDetailAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}LandUseDetailAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandUseDetailAttributePropertyType", propOrder = {
    "landUseDetailAttribute"
})
public class LandUseDetailAttributePropertyType {

    @XmlElement(name = "LandUseDetailAttribute", required = true)
    protected LandUseDetailAttributeType landUseDetailAttribute;

    /**
     * Gets the value of the landUseDetailAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link LandUseDetailAttributeType }
     *     
     */
    public LandUseDetailAttributeType getLandUseDetailAttribute() {
        return landUseDetailAttribute;
    }

    /**
     * Sets the value of the landUseDetailAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandUseDetailAttributeType }
     *     
     */
    public void setLandUseDetailAttribute(LandUseDetailAttributeType value) {
        this.landUseDetailAttribute = value;
    }

    public boolean isSetLandUseDetailAttribute() {
        return (this.landUseDetailAttribute!= null);
    }

}
