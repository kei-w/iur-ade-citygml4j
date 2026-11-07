//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}PortAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortAttributePropertyType", propOrder = {
    "portAttribute"
})
public class PortAttributePropertyType {

    @XmlElementRef(name = "PortAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class)
    protected JAXBElement<? extends PortAttributeType> portAttribute;

    /**
     * Gets the value of the portAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends PortAttributeType> getPortAttribute() {
        return portAttribute;
    }

    /**
     * Sets the value of the portAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     *     
     */
    public void setPortAttribute(JAXBElement<? extends PortAttributeType> value) {
        this.portAttribute = value;
    }

    public boolean isSetPortAttribute() {
        return (this.portAttribute!= null);
    }

}
