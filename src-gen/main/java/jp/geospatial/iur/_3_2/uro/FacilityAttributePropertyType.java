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
 * <p>Java class for FacilityAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}FacilityAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityAttributePropertyType", propOrder = {
    "facilityAttribute"
})
public class FacilityAttributePropertyType {

    @XmlElementRef(name = "FacilityAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends FacilityAttributeType> facilityAttribute;

    /**
     * Gets the value of the facilityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortCapacityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaintenanceHistoryAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkFacilityLongevityPlanAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends FacilityAttributeType> getFacilityAttribute() {
        return facilityAttribute;
    }

    /**
     * Sets the value of the facilityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortCapacityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FishingPortAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaintenanceHistoryAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkFacilityLongevityPlanAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilityAttributeType }{@code >}
     *     
     */
    public void setFacilityAttribute(JAXBElement<? extends FacilityAttributeType> value) {
        this.facilityAttribute = value;
    }

    public boolean isSetFacilityAttribute() {
        return (this.facilityAttribute!= null);
    }

}
