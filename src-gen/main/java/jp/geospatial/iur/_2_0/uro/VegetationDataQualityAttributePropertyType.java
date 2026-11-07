//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 11:13:19 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VegetationDataQualityAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VegetationDataQualityAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/2.0}VegetationDataQualityAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VegetationDataQualityAttributePropertyType", propOrder = {
    "vegetationDataQualityAttribute"
})
public class VegetationDataQualityAttributePropertyType {

    @XmlElement(name = "VegetationDataQualityAttribute", required = true)
    protected VegetationDataQualityAttributeType vegetationDataQualityAttribute;

    /**
     * Gets the value of the vegetationDataQualityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link VegetationDataQualityAttributeType }
     *     
     */
    public VegetationDataQualityAttributeType getVegetationDataQualityAttribute() {
        return vegetationDataQualityAttribute;
    }

    /**
     * Sets the value of the vegetationDataQualityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link VegetationDataQualityAttributeType }
     *     
     */
    public void setVegetationDataQualityAttribute(VegetationDataQualityAttributeType value) {
        this.vegetationDataQualityAttribute = value;
    }

    public boolean isSetVegetationDataQualityAttribute() {
        return (this.vegetationDataQualityAttribute!= null);
    }

}
