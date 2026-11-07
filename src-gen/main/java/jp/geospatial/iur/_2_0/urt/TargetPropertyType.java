//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:49:19 JST 2026
//


package jp.geospatial.iur._2_0.urt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import jp.geospatial.iur._2_0.urf.AbstractDistrictPlanType;
import jp.geospatial.iur._2_0.urf.AdministrationType;
import jp.geospatial.iur._2_0.urf.AgreementType;
import jp.geospatial.iur._2_0.urf.AircraftNoiseControlZoneType;
import jp.geospatial.iur._2_0.urf.AreaClassificationType;
import jp.geospatial.iur._2_0.urf.BoundaryType;
import jp.geospatial.iur._2_0.urf.CensusBlockType;
import jp.geospatial.iur._2_0.urf.CollectiveFacilitiesForReconstructionAndRevitalizationType;
import jp.geospatial.iur._2_0.urf.CollectiveFacilitiesForReconstructionType;
import jp.geospatial.iur._2_0.urf.CollectiveFacilitiesForTsunamiDisasterPreventionType;
import jp.geospatial.iur._2_0.urf.CollectiveGovernmentAndPublicOfficeFacilitiesType;
import jp.geospatial.iur._2_0.urf.CollectiveHousingFacilitiesType;
import jp.geospatial.iur._2_0.urf.CollectiveUrbanDisasterPreventionFacilitiesType;
import jp.geospatial.iur._2_0.urf.ConservationZoneForClustersOfTraditionalStructuresType;
import jp.geospatial.iur._2_0.urf.DevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.DisasterDamageType;
import jp.geospatial.iur._2_0.urf.DisasterPreventionBaseType;
import jp.geospatial.iur._2_0.urf.DisasterPreventionBlockImprovementProjectType;
import jp.geospatial.iur._2_0.urf.DisasterPreventionBlockImprovementZonePlanType;
import jp.geospatial.iur._2_0.urf.DistributionBusinessParkType;
import jp.geospatial.iur._2_0.urf.DistributionBusinessZoneType;
import jp.geospatial.iur._2_0.urf.DistrictDevelopmentPlanType;
import jp.geospatial.iur._2_0.urf.DistrictFacilityType;
import jp.geospatial.iur._2_0.urf.DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType;
import jp.geospatial.iur._2_0.urf.DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType;
import jp.geospatial.iur._2_0.urf.DistrictPlanType;
import jp.geospatial.iur._2_0.urf.DistrictType;
import jp.geospatial.iur._2_0.urf.DistrictsAndZonesType;
import jp.geospatial.iur._2_0.urf.EducationalAndCulturalFacilityType;
import jp.geospatial.iur._2_0.urf.ExceptionalFloorAreaRateDistrictType;
import jp.geospatial.iur._2_0.urf.FirePreventionDistrictType;
import jp.geospatial.iur._2_0.urf.FireProtectionFacilityType;
import jp.geospatial.iur._2_0.urf.FloodPreventionFacilityType;
import jp.geospatial.iur._2_0.urf.GlobalHubCityDevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.GreenSpaceConservationDistrictType;
import jp.geospatial.iur._2_0.urf.HeightControlDistrictType;
import jp.geospatial.iur._2_0.urf.HighLevelUseDistrictType;
import jp.geospatial.iur._2_0.urf.HighRiseResidentialAttractionDistrictType;
import jp.geospatial.iur._2_0.urf.HistoricSceneryMaintenanceAndImprovementDistrictPlanType;
import jp.geospatial.iur._2_0.urf.HousingControlAreaType;
import jp.geospatial.iur._2_0.urf.HubCityType;
import jp.geospatial.iur._2_0.urf.IndustrialParkDevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.LandReadjustmentProjectType;
import jp.geospatial.iur._2_0.urf.LandReadjustmentPromotionAreaType;
import jp.geospatial.iur._2_0.urf.LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType;
import jp.geospatial.iur._2_0.urf.LandscapeZoneType;
import jp.geospatial.iur._2_0.urf.MarketsSlaughterhousesCrematoriaType;
import jp.geospatial.iur._2_0.urf.MedicalFacilityType;
import jp.geospatial.iur._2_0.urf.NewHousingAndUrbanDevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.NewUrbanInfrastructureProjectType;
import jp.geospatial.iur._2_0.urf.OpenSpaceForPublicUseType;
import jp.geospatial.iur._2_0.urf.ParkingPlaceDevelopmentZoneType;
import jp.geospatial.iur._2_0.urf.PollutionType;
import jp.geospatial.iur._2_0.urf.PortZoneType;
import jp.geospatial.iur._2_0.urf.PrivateUrbanRenewalProjectPlanType;
import jp.geospatial.iur._2_0.urf.ProductiveGreenZoneType;
import jp.geospatial.iur._2_0.urf.ProjectPromotionAreaType;
import jp.geospatial.iur._2_0.urf.PromotionDistrictType;
import jp.geospatial.iur._2_0.urf.PublicTransitFacilityType;
import jp.geospatial.iur._2_0.urf.QuasiUrbanPlanningAreaType;
import jp.geospatial.iur._2_0.urf.RecreationsType;
import jp.geospatial.iur._2_0.urf.RegulationType;
import jp.geospatial.iur._2_0.urf.ResidentialBlockConstructionProjectType;
import jp.geospatial.iur._2_0.urf.ResidentialBlockConstructionPromotionAreaType;
import jp.geospatial.iur._2_0.urf.ResidentialEnvironmentImprovementDistrictType;
import jp.geospatial.iur._2_0.urf.RoadsideDistrictFacilityType;
import jp.geospatial.iur._2_0.urf.RoadsideDistrictImprovementPlanType;
import jp.geospatial.iur._2_0.urf.RoadsideDistrictPlanType;
import jp.geospatial.iur._2_0.urf.RuralDistrictFacilityType;
import jp.geospatial.iur._2_0.urf.RuralDistrictImprovementPlanType;
import jp.geospatial.iur._2_0.urf.RuralDistrictPlanType;
import jp.geospatial.iur._2_0.urf.SandControlFacilityType;
import jp.geospatial.iur._2_0.urf.ScenicDistrictType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForCollectiveHousingFacilitiesType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForDistributionBusinessParkType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForIndustrialParkDevelopmentProjectsType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForNewUrbanInfrastructureProjectsType;
import jp.geospatial.iur._2_0.urf.ScheduledAreaForUrbanDevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.SedimentDisasterProneAreaType;
import jp.geospatial.iur._2_0.urf.SnowProtectionFacilityType;
import jp.geospatial.iur._2_0.urf.SocialWelfareFacilityType;
import jp.geospatial.iur._2_0.urf.SpecialGreenSpaceConservationDistrictType;
import jp.geospatial.iur._2_0.urf.SpecialUrbanRenaissanceDistrictType;
import jp.geospatial.iur._2_0.urf.SpecialUseAttractionDistrictType;
import jp.geospatial.iur._2_0.urf.SpecialUseDistrictType;
import jp.geospatial.iur._2_0.urf.SpecialUseRestrictionDistrictType;
import jp.geospatial.iur._2_0.urf.SpecialZoneForPreservationOfHistoricalLandscapeType;
import jp.geospatial.iur._2_0.urf.SpecifiedBlockType;
import jp.geospatial.iur._2_0.urf.SpecifiedBuildingZoneImprovementPlanType;
import jp.geospatial.iur._2_0.urf.SpecifiedDisasterPreventionBlockImprovementZoneType;
import jp.geospatial.iur._2_0.urf.SpecifiedUrgentUrbanRenewalAreaType;
import jp.geospatial.iur._2_0.urf.SupplyFacilityType;
import jp.geospatial.iur._2_0.urf.TelecommunicationFacilityType;
import jp.geospatial.iur._2_0.urf.ThreeDimensionalExtent;
import jp.geospatial.iur._2_0.urf.TideFacilityType;
import jp.geospatial.iur._2_0.urf.TrafficFacilityType;
import jp.geospatial.iur._2_0.urf.TreatmentFacilityType;
import jp.geospatial.iur._2_0.urf.TreePlantingDistrictType;
import jp.geospatial.iur._2_0.urf.UnusedLandUsePromotionAreaType;
import jp.geospatial.iur._2_0.urf.UrbanDevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.UrbanDisasterRecoveryPromotionAreaType;
import jp.geospatial.iur._2_0.urf.UrbanFacilityStipulatedByCabinetOrderType;
import jp.geospatial.iur._2_0.urf.UrbanFacilityType;
import jp.geospatial.iur._2_0.urf.UrbanFunctionType;
import jp.geospatial.iur._2_0.urf.UrbanPlanningAreaType;
import jp.geospatial.iur._2_0.urf.UrbanRedevelopmentProjectType;
import jp.geospatial.iur._2_0.urf.UrbanRedevelopmentPromotionAreaType;
import jp.geospatial.iur._2_0.urf.UrbanRenewalProjectType;
import jp.geospatial.iur._2_0.urf.UrbanizationType;
import jp.geospatial.iur._2_0.urf.UrgentUrbanRenewalAreaType;
import jp.geospatial.iur._2_0.urf.UseDistrictType;
import jp.geospatial.iur._2_0.urf.WaterwayType;
import jp.geospatial.iur._2_0.urf.WindProtectionFacilityType;
import jp.geospatial.iur._2_0.urf.ZonalDisasterPreventionFacilityType;
import jp.geospatial.iur._2_0.urf.ZoneForPreservationOfHistoricalLandscapeType;
import jp.geospatial.iur._2_0.urf.ZoneType;
import jp.geospatial.iur._2_0.urg.GenericGridCellType;
import jp.geospatial.iur._2_0.urg.HouseholdsType;
import jp.geospatial.iur._2_0.urg.LandPriceType;
import jp.geospatial.iur._2_0.urg.OfficesAndEmployeesType;
import jp.geospatial.iur._2_0.urg.PopulationType;
import jp.geospatial.iur._2_0.urg.PublicTransitAccessibilityType;
import jp.geospatial.iur._2_0.urg.StatisticalGridType;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.citygml._2.AbstractSiteType;
import net.opengis.citygml.bridge._2.AbstractBridgeType;
import net.opengis.citygml.bridge._2.BridgeConstructionElementType;
import net.opengis.citygml.bridge._2.BridgeFurnitureType;
import net.opengis.citygml.bridge._2.BridgeInstallationType;
import net.opengis.citygml.bridge._2.BridgePartType;
import net.opengis.citygml.bridge._2.BridgeRoomType;
import net.opengis.citygml.bridge._2.BridgeType;
import net.opengis.citygml.bridge._2.IntBridgeInstallationType;
import net.opengis.citygml.building._2.AbstractBuildingType;
import net.opengis.citygml.building._2.BuildingFurnitureType;
import net.opengis.citygml.building._2.BuildingInstallationType;
import net.opengis.citygml.building._2.BuildingPartType;
import net.opengis.citygml.building._2.BuildingType;
import net.opengis.citygml.building._2.IntBuildingInstallationType;
import net.opengis.citygml.building._2.RoomType;
import net.opengis.citygml.cityfurniture._2.CityFurnitureType;
import net.opengis.citygml.cityobjectgroup._2.CityObjectGroupType;
import net.opengis.citygml.generics._2.GenericCityObjectType;
import net.opengis.citygml.landuse._2.LandUseType;
import net.opengis.citygml.relief._2.AbstractReliefComponentType;
import net.opengis.citygml.relief._2.BreaklineReliefType;
import net.opengis.citygml.relief._2.MassPointReliefType;
import net.opengis.citygml.relief._2.RasterReliefType;
import net.opengis.citygml.relief._2.ReliefFeatureType;
import net.opengis.citygml.relief._2.TINReliefType;
import net.opengis.citygml.transportation._2.AbstractTransportationObjectType;
import net.opengis.citygml.transportation._2.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation._2.RailwayType;
import net.opengis.citygml.transportation._2.RoadType;
import net.opengis.citygml.transportation._2.SquareType;
import net.opengis.citygml.transportation._2.TrackType;
import net.opengis.citygml.transportation._2.TrafficAreaType;
import net.opengis.citygml.transportation._2.TransportationComplexType;
import net.opengis.citygml.tunnel._2.AbstractTunnelType;
import net.opengis.citygml.tunnel._2.HollowSpaceType;
import net.opengis.citygml.tunnel._2.IntTunnelInstallationType;
import net.opengis.citygml.tunnel._2.TunnelFurnitureType;
import net.opengis.citygml.tunnel._2.TunnelInstallationType;
import net.opengis.citygml.tunnel._2.TunnelPartType;
import net.opengis.citygml.tunnel._2.TunnelType;
import net.opengis.citygml.vegetation._2.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation._2.PlantCoverType;
import net.opengis.citygml.vegetation._2.SolitaryVegetationObjectType;
import net.opengis.citygml.waterbody._2.AbstractWaterBoundarySurfaceType;
import net.opengis.citygml.waterbody._2.AbstractWaterObjectType;
import net.opengis.citygml.waterbody._2.WaterBodyType;
import net.opengis.citygml.waterbody._2.WaterClosureSurfaceType;
import net.opengis.citygml.waterbody._2.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody._2.WaterSurfaceType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>Java class for TargetPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.opengis.net/citygml/2.0}_CityObject"/&gt;
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
@XmlType(name = "TargetPropertyType", propOrder = {
    "_CityObject"
})
public class TargetPropertyType {

    @XmlElementRef(name = "_CityObject", namespace = "http://www.opengis.net/citygml/2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractCityObjectType> _CityObject;
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
     * Gets the value of the _CityObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BuildingPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolitaryVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlantCoverType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntTunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SquareType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportationComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuxiliaryTrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTransportationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeRoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HollowSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityObjectGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterGroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassPointReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TINReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BreaklineReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractReliefComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.geospatial.iur._2_0.urg.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericCityObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeConstructionElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.geospatial.iur._2_0.urf.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreeDimensionalExtent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndustrialParkDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingAndUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRenewalProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewUrbanInfrastructureProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZonalDisasterPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedUrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuasiUrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoricSceneryMaintenanceAndImprovementDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveUrbanDisasterPreventionFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplyFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SocialWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EducationalAndCulturalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketsSlaughterhousesCrematoriaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionAndRevitalizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenSpaceForPublicUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForTsunamiDisasterPreventionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelecommunicationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SandControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SnowProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TideFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStipulatedByCabinetOrderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDisasterRecoveryPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateUrbanRenewalProjectPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseRestrictionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighLevelUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialGreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighRiseResidentialAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUrbanRenaissanceDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandscapeZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedDisasterPreventionBlockImprovementZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExceptionalFloorAreaRateDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FirePreventionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductiveGreenZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreePlantingDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialEnvironmentImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeightControlDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConservationZoneForClustersOfTraditionalStructuresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftNoiseControlZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPlaceDevelopmentZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HousingControlAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlobalHubCityDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBuildingZoneImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictDevelopmentPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnusedLandUsePromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SedimentDisasterProneAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForIndustrialParkDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForDistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewUrbanInfrastructureProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCityObjectType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractCityObjectType> get_CityObject() {
        return _CityObject;
    }

    /**
     * Sets the value of the _CityObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BuildingPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgePartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractBridgeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelPartType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTunnelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationJPType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarDateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CalendarType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AttributionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SolitaryVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlantCoverType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractVegetationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntTunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SquareType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportationComplexType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuxiliaryTrafficAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractTransportationObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeRoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.GroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterCeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.FloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.CeilingSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.RoofSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.InteriorWallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.ClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.OuterFloorSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.WallSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.tunnel._2.AbstractBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterBodyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HollowSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CityObjectGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BuildingFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TunnelInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterClosureSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterGroundSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterSurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractWaterBoundarySurfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntBridgeInstallationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.building._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassPointReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RasterReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TINReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BreaklineReliefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractReliefComponentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.geospatial.iur._2_0.urg.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitAccessibilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OfficesAndEmployeesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PopulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandPriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HouseholdsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericGridCellType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatisticalGridType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GenericCityObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeFurnitureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.DoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.WindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link net.opengis.citygml.bridge._2.AbstractOpeningType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BridgeConstructionElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PollutionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link jp.geospatial.iur._2_0.urf.LandUseDiversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RecreationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThreeDimensionalExtent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterDamageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdministrationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CensusBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndustrialParkDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewHousingAndUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRenewalProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewUrbanInfrastructureProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AgreementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZonalDisasterPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedUrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrgentUrbanRenewalAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AreaClassificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuasiUrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoricSceneryMaintenanceAndImprovementDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractDistrictPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveUrbanDisasterPreventionFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SupplyFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MedicalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SocialWelfareFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EducationalAndCulturalFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketsSlaughterhousesCrematoriaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionAndRevitalizationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpenSpaceForPublicUseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForTsunamiDisasterPreventionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveFacilitiesForReconstructionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WindProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TelecommunicationFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SandControlFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SnowProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FireProtectionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FloodPreventionFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TideFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityStipulatedByCabinetOrderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreatmentFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanDisasterRecoveryPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrivateUrbanRenewalProjectPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseRestrictionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighLevelUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialGreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HighRiseResidentialAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUrbanRenaissanceDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandscapeZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedDisasterPreventionBlockImprovementZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseAttractionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScenicDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExceptionalFloorAreaRateDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FirePreventionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductiveGreenZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialZoneForPreservationOfHistoricalLandscapeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TreePlantingDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBlockType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialEnvironmentImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionBusinessZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialUseDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeightControlDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConservationZoneForClustersOfTraditionalStructuresType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PortZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AircraftNoiseControlZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GreenSpaceConservationDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPlaceDevelopmentZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HousingControlAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictsAndZonesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanRedevelopmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResidentialBlockConstructionPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProjectPromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GlobalHubCityDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecifiedBuildingZoneImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictImprovementPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictDevelopmentPlanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadsideDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RuralDistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistrictFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnusedLandUsePromotionAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SedimentDisasterProneAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForIndustrialParkDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForDistributionBusinessParkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForNewUrbanInfrastructureProjectsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveHousingFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledAreaForUrbanDevelopmentProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PromotionDistrictType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DisasterPreventionBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HubCityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitFacilityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCityObjectType }{@code >}
     *     
     */
    public void set_CityObject(JAXBElement<? extends AbstractCityObjectType> value) {
        this._CityObject = value;
    }

    public boolean isSet_CityObject() {
        return (this._CityObject!= null);
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
