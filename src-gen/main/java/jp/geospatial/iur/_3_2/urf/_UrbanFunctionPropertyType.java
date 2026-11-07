//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java class for _UrbanFunctionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_UrbanFunctionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}_UrbanFunction"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_UrbanFunctionPropertyType", propOrder = {
    "_UrbanFunction"
})
public class _UrbanFunctionPropertyType {

    @XmlElementRef(name = "_UrbanFunction", namespace = "https://www.geospatial.jp/iur/urf/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends _UrbanFunctionType> _UrbanFunction;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the _UrbanFunction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionAttractionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZonalDisasterPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketsSlaughterhousesCrematoriaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveUrbanDisasterPreventionFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionAndRevitalizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplyFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelecommunicationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SnowProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TideFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SandControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStipulatedByCabinetOrderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForTsunamiDisasterPreventionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SocialWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenSpaceForPublicUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EducationalAndCulturalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnusedLandUsePromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateUrbanRenewalProjectPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidenceAttractionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConservationZoneForClustersOfTraditionalStructuresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftNoiseControlZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExceptionalFloorAreaRateDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighLevelUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductiveGreenZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandscapeZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HousingControlAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FirePreventionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighRiseResidentialAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUrbanRenaissanceDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseRestrictionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreePlantingDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedDisasterPreventionBlockImprovementZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialGreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeightControlDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPlaceDevelopmentZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialEnvironmentImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnclassifiedBlankAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuasiUrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnclassifiedUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDisasterRecoveryPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBuildingZoneImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictDevelopmentPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SedimentDisasterProneAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndustrialParkDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingAndUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRenewalProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewUrbanInfrastructureProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoricSceneryMaintenanceAndImprovementDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link _AbstractDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlobalHubCityDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewUrbanInfrastructureProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForDistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForIndustrialParkDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedUrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NaturalConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreeDimensionalExtentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionOfFloraAndFaunaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DIDType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicResourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeatherObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link _UrbanFunctionType }{@code >}
     *     
     */
    public JAXBElement<? extends _UrbanFunctionType> get_UrbanFunction() {
        return _UrbanFunction;
    }

    /**
     * Sets the value of the _UrbanFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionAttractionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZonalDisasterPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketsSlaughterhousesCrematoriaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveUrbanDisasterPreventionFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionAndRevitalizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplyFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelecommunicationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SnowProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TideFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SandControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStipulatedByCabinetOrderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForTsunamiDisasterPreventionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SocialWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenSpaceForPublicUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EducationalAndCulturalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnusedLandUsePromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateUrbanRenewalProjectPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidenceAttractionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConservationZoneForClustersOfTraditionalStructuresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftNoiseControlZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExceptionalFloorAreaRateDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighLevelUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductiveGreenZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandscapeZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HousingControlAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FirePreventionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighRiseResidentialAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUrbanRenaissanceDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseRestrictionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreePlantingDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedDisasterPreventionBlockImprovementZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialGreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeightControlDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPlaceDevelopmentZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialEnvironmentImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnclassifiedBlankAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuasiUrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnclassifiedUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDisasterRecoveryPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBuildingZoneImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictDevelopmentPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SedimentDisasterProneAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndustrialParkDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingAndUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRenewalProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewUrbanInfrastructureProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoricSceneryMaintenanceAndImprovementDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link _AbstractDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlobalHubCityDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewUrbanInfrastructureProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForDistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForIndustrialParkDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedUrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NaturalConditionsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreeDimensionalExtentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionOfFloraAndFaunaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DIDType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicResourceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WeatherObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link _UrbanFunctionType }{@code >}
     *     
     */
    public void set_UrbanFunction(JAXBElement<? extends _UrbanFunctionType> value) {
        this._UrbanFunction = value;
    }

    public boolean isSet_UrbanFunction() {
        return (this._UrbanFunction!= null);
    }

    /**
     * Gets the value of the remoteSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * Sets the value of the remoteSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.SIMPLE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}
