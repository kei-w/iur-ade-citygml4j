//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBodyAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBodyAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/2.0}WaterBodyAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBodyAttributePropertyType", propOrder = {
    "waterBodyAttribute"
})
public class WaterBodyAttributePropertyType {

    @XmlElementRef(name = "WaterBodyAttribute", namespace = "https://www.geospatial.jp/iur/uro/2.0", type = JAXBElement.class)
    protected JAXBElement<? extends WaterBodyAttributeType> waterBodyAttribute;

    /**
     * Gets the value of the waterBodyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends WaterBodyAttributeType> getWaterBodyAttribute() {
        return waterBodyAttribute;
    }

    /**
     * Sets the value of the waterBodyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     *     
     */
    public void setWaterBodyAttribute(JAXBElement<? extends WaterBodyAttributeType> value) {
        this.waterBodyAttribute = value;
    }

    public boolean isSetWaterBodyAttribute() {
        return (this.waterBodyAttribute!= null);
    }

}
