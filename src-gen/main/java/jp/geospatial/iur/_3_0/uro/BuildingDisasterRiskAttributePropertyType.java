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
 * <p>Java class for BuildingDisasterRiskAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingDisasterRiskAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}BuildingDisasterRiskAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingDisasterRiskAttributePropertyType", propOrder = {
    "buildingDisasterRiskAttribute"
})
public class BuildingDisasterRiskAttributePropertyType {

    @XmlElementRef(name = "BuildingDisasterRiskAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends BuildingDisasterRiskAttributeType> buildingDisasterRiskAttribute;

    /**
     * Gets the value of the buildingDisasterRiskAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends BuildingDisasterRiskAttributeType> getBuildingDisasterRiskAttribute() {
        return buildingDisasterRiskAttribute;
    }

    /**
     * Sets the value of the buildingDisasterRiskAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     *     
     */
    public void setBuildingDisasterRiskAttribute(JAXBElement<? extends BuildingDisasterRiskAttributeType> value) {
        this.buildingDisasterRiskAttribute = value;
    }

    public boolean isSetBuildingDisasterRiskAttribute() {
        return (this.buildingDisasterRiskAttribute!= null);
    }

}
