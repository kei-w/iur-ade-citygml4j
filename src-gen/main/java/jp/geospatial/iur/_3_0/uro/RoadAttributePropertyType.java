//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}RoadAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadAttributePropertyType", propOrder = {
    "roadAttribute"
})
public class RoadAttributePropertyType {

    @XmlElementRef(name = "RoadAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends RoadAttributeType> roadAttribute;

    /**
     * Gets the value of the roadAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends RoadAttributeType> getRoadAttribute() {
        return roadAttribute;
    }

    /**
     * Sets the value of the roadAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     *     
     */
    public void setRoadAttribute(JAXBElement<? extends RoadAttributeType> value) {
        this.roadAttribute = value;
    }

    public boolean isSetRoadAttribute() {
        return (this.roadAttribute!= null);
    }

}
