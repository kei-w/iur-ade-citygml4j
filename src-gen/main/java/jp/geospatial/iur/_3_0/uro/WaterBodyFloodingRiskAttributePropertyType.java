//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterBodyFloodingRiskAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBodyFloodingRiskAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}WaterBodyFloodingRiskAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBodyFloodingRiskAttributePropertyType", propOrder = {
    "waterBodyFloodingRiskAttribute"
})
public class WaterBodyFloodingRiskAttributePropertyType {

    @XmlElementRef(name = "WaterBodyFloodingRiskAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends WaterBodyFloodingRiskAttributeType> waterBodyFloodingRiskAttribute;

    /**
     * Gets the value of the waterBodyFloodingRiskAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends WaterBodyFloodingRiskAttributeType> getWaterBodyFloodingRiskAttribute() {
        return waterBodyFloodingRiskAttribute;
    }

    /**
     * Sets the value of the waterBodyFloodingRiskAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     *     
     */
    public void setWaterBodyFloodingRiskAttribute(JAXBElement<? extends WaterBodyFloodingRiskAttributeType> value) {
        this.waterBodyFloodingRiskAttribute = value;
    }

    public boolean isSetWaterBodyFloodingRiskAttribute() {
        return (this.waterBodyFloodingRiskAttribute!= null);
    }

}
