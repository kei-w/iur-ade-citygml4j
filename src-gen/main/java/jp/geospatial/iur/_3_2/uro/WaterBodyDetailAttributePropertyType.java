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
 * <p>Java class for WaterBodyDetailAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBodyDetailAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}WaterBodyDetailAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBodyDetailAttributePropertyType", propOrder = {
    "waterBodyDetailAttribute"
})
public class WaterBodyDetailAttributePropertyType {

    @XmlElement(name = "WaterBodyDetailAttribute", required = true)
    protected WaterBodyDetailAttributeType waterBodyDetailAttribute;

    /**
     * Gets the value of the waterBodyDetailAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link WaterBodyDetailAttributeType }
     *     
     */
    public WaterBodyDetailAttributeType getWaterBodyDetailAttribute() {
        return waterBodyDetailAttribute;
    }

    /**
     * Sets the value of the waterBodyDetailAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterBodyDetailAttributeType }
     *     
     */
    public void setWaterBodyDetailAttribute(WaterBodyDetailAttributeType value) {
        this.waterBodyDetailAttribute = value;
    }

    public boolean isSetWaterBodyDetailAttribute() {
        return (this.waterBodyDetailAttribute!= null);
    }

}
