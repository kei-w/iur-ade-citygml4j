//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 11:13:19 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VegetationAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VegetationAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/2.0}VegetationAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VegetationAttributePropertyType", propOrder = {
    "vegetationAttribute"
})
public class VegetationAttributePropertyType {

    @XmlElementRef(name = "VegetationAttribute", namespace = "https://www.geospatial.jp/iur/uro/2.0", type = JAXBElement.class)
    protected JAXBElement<? extends VegetationAttributeType> vegetationAttribute;

    /**
     * Gets the value of the vegetationAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends VegetationAttributeType> getVegetationAttribute() {
        return vegetationAttribute;
    }

    /**
     * Sets the value of the vegetationAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     *     
     */
    public void setVegetationAttribute(JAXBElement<? extends VegetationAttributeType> value) {
        this.vegetationAttribute = value;
    }

    public boolean isSetVegetationAttribute() {
        return (this.vegetationAttribute!= null);
    }

}
