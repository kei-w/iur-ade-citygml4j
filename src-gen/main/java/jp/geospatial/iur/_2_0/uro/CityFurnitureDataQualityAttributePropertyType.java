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
 * <p>Java class for CityFurnitureDataQualityAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityFurnitureDataQualityAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/2.0}CityFurnitureDataQualityAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityFurnitureDataQualityAttributePropertyType", propOrder = {
    "cityFurnitureDataQualityAttribute"
})
public class CityFurnitureDataQualityAttributePropertyType {

    @XmlElement(name = "CityFurnitureDataQualityAttribute", required = true)
    protected CityFurnitureDataQualityAttributeType cityFurnitureDataQualityAttribute;

    /**
     * Gets the value of the cityFurnitureDataQualityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link CityFurnitureDataQualityAttributeType }
     *     
     */
    public CityFurnitureDataQualityAttributeType getCityFurnitureDataQualityAttribute() {
        return cityFurnitureDataQualityAttribute;
    }

    /**
     * Sets the value of the cityFurnitureDataQualityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityFurnitureDataQualityAttributeType }
     *     
     */
    public void setCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttributeType value) {
        this.cityFurnitureDataQualityAttribute = value;
    }

    public boolean isSetCityFurnitureDataQualityAttribute() {
        return (this.cityFurnitureDataQualityAttribute!= null);
    }

}
