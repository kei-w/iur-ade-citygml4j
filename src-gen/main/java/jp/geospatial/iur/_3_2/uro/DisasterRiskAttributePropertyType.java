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
 * <p>Java class for DisasterRiskAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisasterRiskAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}DisasterRiskAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisasterRiskAttributePropertyType", propOrder = {
    "disasterRiskAttribute"
})
public class DisasterRiskAttributePropertyType {

    @XmlElementRef(name = "DisasterRiskAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends DisasterRiskAttributeType> disasterRiskAttribute;

    /**
     * Gets the value of the disasterRiskAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservoirFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandSlideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterRiskAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends DisasterRiskAttributeType> getDisasterRiskAttribute() {
        return disasterRiskAttribute;
    }

    /**
     * Sets the value of the disasterRiskAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservoirFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandSlideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterRiskAttributeType }{@code >}
     *     
     */
    public void setDisasterRiskAttribute(JAXBElement<? extends DisasterRiskAttributeType> value) {
        this.disasterRiskAttribute = value;
    }

    public boolean isSetDisasterRiskAttribute() {
        return (this.disasterRiskAttribute!= null);
    }

}
