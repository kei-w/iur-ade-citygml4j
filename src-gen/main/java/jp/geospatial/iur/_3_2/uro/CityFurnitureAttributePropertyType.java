//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityFurnitureAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityFurnitureAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}CityFurnitureAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityFurnitureAttributePropertyType", propOrder = {
    "cityFurnitureAttribute"
})
public class CityFurnitureAttributePropertyType {

    @XmlElementRef(name = "CityFurnitureAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends CityFurnitureAttributeType> cityFurnitureAttribute;

    /**
     * Gets the value of the cityFurnitureAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends CityFurnitureAttributeType> getCityFurnitureAttribute() {
        return cityFurnitureAttribute;
    }

    /**
     * Sets the value of the cityFurnitureAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     *     
     */
    public void setCityFurnitureAttribute(JAXBElement<? extends CityFurnitureAttributeType> value) {
        this.cityFurnitureAttribute = value;
    }

    public boolean isSetCityFurnitureAttribute() {
        return (this.cityFurnitureAttribute!= null);
    }

}
