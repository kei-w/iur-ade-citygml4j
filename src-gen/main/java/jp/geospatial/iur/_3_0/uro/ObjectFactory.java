//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.geospatial.iur._3_0.uro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BridBaseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridBaseAttribute");
    private final static QName _BridFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridFacilityIdAttribute");
    private final static QName _BridFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridFacilityTypeAttribute");
    private final static QName _BridFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridFacilityAttribute");
    private final static QName _BridStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridStructureAttribute");
    private final static QName _BridFunctionalAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridFunctionalAttribute");
    private final static QName _BridRiskAssessmentAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridRiskAssessmentAttribute");
    private final static QName _BridDisasterRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridDisasterRiskAttribute");
    private final static QName _BridDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridDmAttribute");
    private final static QName _BridDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bridDataQualityAttribute");
    private final static QName _FrnFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "frnFacilityIdAttribute");
    private final static QName _FrnFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "frnFacilityTypeAttribute");
    private final static QName _FrnFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "frnFacilityAttribute");
    private final static QName _FrnDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "frnDmAttribute");
    private final static QName _TranFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tranFacilityIdAttribute");
    private final static QName _TranFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tranFacilityTypeAttribute");
    private final static QName _TranFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tranFacilityAttribute");
    private final static QName _TranDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tranDmAttribute");
    private final static QName _TranDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tranDataQualityAttribute");
    private final static QName _VegFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "vegFacilityIdAttribute");
    private final static QName _VegFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "vegFacilityTypeAttribute");
    private final static QName _VegFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "vegFacilityAttribute");
    private final static QName _VegDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "vegDmAttribute");
    private final static QName _TunBaseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunBaseAttribute");
    private final static QName _TunStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunStructureAttribute");
    private final static QName _TunFunctionalAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunFunctionalAttribute");
    private final static QName _TunRiskAssessmentAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunRiskAssessmentAttribute");
    private final static QName _TunDisasterRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunDisasterRiskAttribute");
    private final static QName _TunDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunDmAttribute");
    private final static QName _TunDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunDataQualityAttribute");
    private final static QName _TunFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunFacilityIdAttribute");
    private final static QName _TunFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunFacilityTypeAttribute");
    private final static QName _TunFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "tunFacilityAttribute");
    private final static QName _BldgFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bldgFacilityIdAttribute");
    private final static QName _BldgFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bldgFacilityTypeAttribute");
    private final static QName _BldgFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bldgFacilityAttribute");
    private final static QName _BldgDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "bldgDmAttribute");
    private final static QName _LuseFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "luseFacilityIdAttribute");
    private final static QName _LuseFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "luseFacilityTypeAttribute");
    private final static QName _LuseFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "luseFacilityAttribute");
    private final static QName _LuseDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "luseDmAttribute");
    private final static QName _WtrFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "wtrFacilityIdAttribute");
    private final static QName _WtrFacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "wtrFacilityTypeAttribute");
    private final static QName _WtrFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "wtrFacilityAttribute");
    private final static QName _WtrDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "wtrDmAttribute");
    private final static QName _DemDmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "demDmAttribute");
    private final static QName _FacilityTypeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FacilityTypeAttribute");
    private final static QName _FacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FacilityIdAttribute");
    private final static QName _RiverFacilityIdAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RiverFacilityIdAttribute");
    private final static QName _ConstructionBaseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionBaseAttribute");
    private final static QName _ConstructionStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionStructureAttribute");
    private final static QName _EmbankmentAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "EmbankmentAttribute");
    private final static QName _DamAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DamAttribute");
    private final static QName _ConstructionDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionDataQualityAttribute");
    private final static QName _ConstructionRiskAssessmentAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionRiskAssessmentAttribute");
    private final static QName _BridgeStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BridgeStructureAttribute");
    private final static QName _BridgeFunctionalAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BridgeFunctionalAttribute");
    private final static QName _TunnelStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TunnelStructureAttribute");
    private final static QName _TunnelFunctionalAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TunnelFunctionalAttribute");
    private final static QName _FacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FacilityAttribute");
    private final static QName _PortAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortAttribute");
    private final static QName _HarborFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "HarborFacility");
    private final static QName _PortProtectiveFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortProtectiveFacility");
    private final static QName _MooringFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "MooringFacility");
    private final static QName _PortTransportationFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortTransportationFacility");
    private final static QName _NavigationAssistanceFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "NavigationAssistanceFacility");
    private final static QName _CargoHandlingFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CargoHandlingFacility");
    private final static QName _PortPassengerFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortPassengerFacility");
    private final static QName _PortStorageFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortStorageFacility");
    private final static QName _ShipServiceFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ShipServiceFacility");
    private final static QName _PortWasteTreatmentFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortWasteTreatmentFacility");
    private final static QName _PortEnvironmentalImprovementFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortEnvironmentalImprovementFacility");
    private final static QName _PortPollutionControlFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortPollutionControlFacility");
    private final static QName _PortWelfareFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortWelfareFacility");
    private final static QName _PortManagementFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PortManagementFacility");
    private final static QName _CyberportMarinaAndPBS_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CyberportMarinaAndPBS");
    private final static QName _FishingPortAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FishingPortAttribute");
    private final static QName _FishingPortFacility_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FishingPortFacility");
    private final static QName _FishingPortCapacity_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FishingPortCapacity");
    private final static QName _Waterway_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Waterway");
    private final static QName _WaterwayDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterwayDetailAttribute");
    private final static QName _AbstractConstruction_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "AbstractConstruction");
    private final static QName _OtherConstruction_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "OtherConstruction");
    private final static QName __BoundarySurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "_BoundarySurface");
    private final static QName _RoofSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoofSurface");
    private final static QName _WallSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WallSurface");
    private final static QName _GroundSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "GroundSurface");
    private final static QName _OuterCeilingSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "OuterCeilingSurface");
    private final static QName _OuterFloorSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "OuterFloorSurface");
    private final static QName _ClosureSurface_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ClosureSurface");
    private final static QName _ConstructionInstallation_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionInstallation");
    private final static QName _Elevation_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Elevation");
    private final static QName _Height_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Height");
    private final static QName _ConstructionEvent_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ConstructionEvent");
    private final static QName _Occupancy_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Occupancy");
    private final static QName _UndergroundBuilding_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UndergroundBuilding");
    private final static QName _TransportationDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TransportationDataQualityAttribute");
    private final static QName _RailwayRouteAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "railwayRouteAttribute");
    private final static QName _RailwayRouteAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RailwayRouteAttribute");
    private final static QName _RailwayTrackAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "railwayTrackAttribute");
    private final static QName _RailwayTrackAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RailwayTrackAttribute");
    private final static QName _ControlPoint_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ControlPoint");
    private final static QName _ControlPointType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ControlPointType");
    private final static QName _CircularCurveType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CircularCurveType");
    private final static QName _TransitionCurveType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TransitionCurveType");
    private final static QName _VerticalCurveType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "VerticalCurveType");
    private final static QName _SlopeType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "SlopeType");
    private final static QName _TrackAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "trackAttribute");
    private final static QName _TrackAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TrackAttribute");
    private final static QName _SquareUrbanPlanAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "squareUrbanPlanAttribute");
    private final static QName _SquareUrbanPlanAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "SquareUrbanPlanAttribute");
    private final static QName _StationSquareAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "StationSquareAttribute");
    private final static QName _TerminalAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TerminalAttribute");
    private final static QName _UtilityNetworkElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UtilityNetworkElement");
    private final static QName _UtilityLink_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UtilityLink");
    private final static QName _ThematicShape_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ThematicShape");
    private final static QName _LengthAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LengthAttribute");
    private final static QName _UtilityNode_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UtilityNode");
    private final static QName _Appurtenance_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Appurtenance");
    private final static QName _UtilityNodeContainer_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UtilityNodeContainer");
    private final static QName _Manhole_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Manhole");
    private final static QName _Handhole_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Handhole");
    private final static QName _Pipe_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Pipe");
    private final static QName _SewerPipe_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "SewerPipe");
    private final static QName _ThermalPipe_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ThermalPipe");
    private final static QName _WaterPipe_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterPipe");
    private final static QName _OilGasChemicalsPipe_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "OilGasChemicalsPipe");
    private final static QName _Duct_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Duct");
    private final static QName _Cable_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "Cable");
    private final static QName _ElectricityCable_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ElectricityCable");
    private final static QName _TelecommunicationsCable_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TelecommunicationsCable");
    private final static QName _OffsetDepth_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "OffsetDepth");
    private final static QName _MaintenanceHistoryAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "MaintenanceHistoryAttribute");
    private final static QName _IfcBuildingAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcBuildingAttribute");
    private final static QName _IfcBuildingStoreyAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcBuildingStoreyAttribute");
    private final static QName _IfcLandUseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcLandUseAttribute");
    private final static QName _IfcRoomAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcRoomAttribute");
    private final static QName _IfcOpeningAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcOpeningAttribute");
    private final static QName _IfcBoundarySurfaceAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcBoundarySurfaceAttribute");
    private final static QName _IfcBuildingInstallationAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcBuildingInstallationAttribute");
    private final static QName _IfcIntBuildingInstallationAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcIntBuildingInstallationAttribute");
    private final static QName _IfcBuildingFurnitureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "ifcBuildingFurnitureAttribute");
    private final static QName _RoomDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "roomDataQualityAttribute");
    private final static QName _IfcAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcAttribute");
    private final static QName _IfcRoot_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcRoot");
    private final static QName _IfcObjectDefinition_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcObjectDefinition");
    private final static QName _IfcObject_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcObject");
    private final static QName _IfcProduct_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcProduct");
    private final static QName _IfcSpatialStructureElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcSpatialStructureElement");
    private final static QName _IfcBuilding_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcBuilding");
    private final static QName _IfcPsetBuildingCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetBuildingCommon");
    private final static QName _IfcSite_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcSite");
    private final static QName _IfcPsetSiteCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetSiteCommon");
    private final static QName _IfcProject_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcProject");
    private final static QName _IfcGeometricRepresentationContext_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcGeometricRepresentationContext");
    private final static QName _IfcUnit_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcUnit");
    private final static QName _IfcAxis2Placement3D_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcAxis2Placement3D");
    private final static QName _IfcCoordinateReferenceSystem_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcCoordinateReferenceSystem");
    private final static QName _IfcProjectedCRS_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcProjectedCRS");
    private final static QName _IfcMapConversion_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcMapConversion");
    private final static QName _IfcSpace_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcSpace");
    private final static QName _IfcClassificationReference_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcClassificationReference");
    private final static QName _IfcClassification_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcClassification");
    private final static QName _IfcPsetSpaceCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetSpaceCommon");
    private final static QName _IfcSpaceBaseQuantity_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcSpaceBaseQuantity");
    private final static QName _IfcElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcElement");
    private final static QName _IfcBuildingElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcBuildingElement");
    private final static QName _IfcWall_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcWall");
    private final static QName _IfcWallStandardCase_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcWallStandardCase");
    private final static QName _IfcCurtainWall_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcCurtainWall");
    private final static QName _IfcRoof_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcRoof");
    private final static QName _IfcWindow_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcWindow");
    private final static QName _IfcDoor_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcDoor");
    private final static QName _IfcOpeningElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcOpeningElement");
    private final static QName _IfcPsetWindowCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetWindowCommon");
    private final static QName _IfcPsetDoorCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetDoorCommon");
    private final static QName _IfcPsetOpeningElementCommon_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcPsetOpeningElementCommon");
    private final static QName _IfcFurnishingElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcFurnishingElement");
    private final static QName _IfcBuildingStorey_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcBuildingStorey");
    private final static QName _IfcGroup_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcGroup");
    private final static QName _IfcZone_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IfcZone");
    private final static QName _IndoorBuildingAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorBuildingAttribute");
    private final static QName _IndoorBoundarySurfaceAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorBoundarySurfaceAttribute");
    private final static QName _IndoorIntInstallationAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorIntInstallationAttribute");
    private final static QName _IndoorOpeningAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorOpeningAttribute");
    private final static QName _IndoorFutnitureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorFutnitureAttribute");
    private final static QName _IndoorRoomAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorRoomAttribute");
    private final static QName _IndoorStoreyAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "indoorStoreyAttribute");
    private final static QName _IndoorAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorAttribute");
    private final static QName _IndoorFurnishingAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorFurnishingAttribute");
    private final static QName _IndoorZoneAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorZoneAttribute");
    private final static QName _IndoorPublicTagAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorPublicTagAttribute");
    private final static QName _IndoorSpaceAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorSpaceAttribute");
    private final static QName _IndoorFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorFacilityAttribute");
    private final static QName _IndoorStoreyAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorStoreyAttribute");
    private final static QName _IndoorTacatileTileAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorTacatileTileAttribute");
    private final static QName _IndoorUserDefinedAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "IndoorUserDefinedAttribute");
    private final static QName _UserDefinedValue_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "UserDefinedValue");
    private final static QName _RoomAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoomAttribute");
    private final static QName _RoomDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoomDataQualityAttribute");
    private final static QName _DmAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DmAttribute");
    private final static QName _DmElement_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DmElement");
    private final static QName _DmGeometricAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DmGeometricAttribute");
    private final static QName _DmAnnotation_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DmAnnotation");
    private final static QName _LandUseDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LandUseDataQualityAttribute");
    private final static QName _LuseDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "luseDataQualityAttribute");
    private final static QName _PublicLand_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "PublicLand");
    private final static QName _RoadStatus_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "roadStatus");
    private final static QName _RoadType_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoadType");
    private final static QName _BuildingIDAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "buildingIDAttribute");
    private final static QName _BuildingDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "buildingDetailAttribute");
    private final static QName _LargeCustomerFacilityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "largeCustomerFacilityAttribute");
    private final static QName _BuildingDisasterRiskAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "buildingDisasterRiskAttribute");
    private final static QName _KeyValuePairAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "keyValuePairAttribute");
    private final static QName _BuildingDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "buildingDataQualityAttribute");
    private final static QName _BuildingAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingAttribute");
    private final static QName _BuildingIDAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingIDAttribute");
    private final static QName _BuildingDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingDetailAttribute");
    private final static QName _LargeCustomerFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LargeCustomerFacilityAttribute");
    private final static QName _BuildingDisasterRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingDisasterRiskAttribute");
    private final static QName _BuildingFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingFloodingRiskAttribute");
    private final static QName _BuildingRiverFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingRiverFloodingRiskAttribute");
    private final static QName _BuildingTsunamiRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingTsunamiRiskAttribute");
    private final static QName _BuildingInlandFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingInlandFloodingRiskAttribute");
    private final static QName _BuildingHighTideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingHighTideRiskAttribute");
    private final static QName _BuildingLandSlideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingLandSlideRiskAttribute");
    private final static QName _KeyValuePairAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "KeyValuePairAttribute");
    private final static QName _BuildingDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "BuildingDataQualityAttribute");
    private final static QName _LandUseDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "landUseDetailAttribute");
    private final static QName _LandUseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LandUseAttribute");
    private final static QName _LandUseDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LandUseDetailAttribute");
    private final static QName _TrafficVolumeAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "trafficVolumeAttribute");
    private final static QName _RoadStructureAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "roadStructureAttribute");
    private final static QName _TrafficAreaStructureAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "trafficAreaStructureAttribute");
    private final static QName _RoadAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoadAttribute");
    private final static QName _TrafficVolumeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TrafficVolumeAttribute");
    private final static QName _RoadStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RoadStructureAttribute");
    private final static QName _TrafficAreaAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TrafficAreaAttribute");
    private final static QName _TrafficAreaStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TrafficAreaStructureAttribute");
    private final static QName _CityFurnitureDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "cityFurnitureDetailAttribute");
    private final static QName _CityFurnitureDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "cityFurnitureDataQualityAttribute");
    private final static QName _CityFurnitureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CityFurnitureAttribute");
    private final static QName _CityFurnitureDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CityFurnitureDetailAttribute");
    private final static QName _CityFurnitureDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "CityFurnitureDataQualityAttribute");
    private final static QName _VegetationDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "vegetationDataQualityAttribute");
    private final static QName _VegetationAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "VegetationAttribute");
    private final static QName _VegetationDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "VegetationDataQualityAttribute");
    private final static QName _FloodingRiskAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "floodingRiskAttribute");
    private final static QName _WaterBodyAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyAttribute");
    private final static QName _WaterBodyFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyFloodingRiskAttribute");
    private final static QName _WaterBodyRiverFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyRiverFloodingRiskAttribute");
    private final static QName _WaterBodyTsunamiRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyTsunamiRiskAttribute");
    private final static QName _WaterBodyHighTideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyHighTideRiskAttribute");
    private final static QName _WaterBodyInlandFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyInlandFloodingRiskAttribute");
    private final static QName _DisasterRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "DisasterRiskAttribute");
    private final static QName _FloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "FloodingRiskAttribute");
    private final static QName _RiverFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "RiverFloodingRiskAttribute");
    private final static QName _TsunamiRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "TsunamiRiskAttribute");
    private final static QName _InlandFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "InlandFloodingRiskAttribute");
    private final static QName _HighTideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "HighTideRiskAttribute");
    private final static QName _LandSlideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "LandSlideRiskAttribute");
    private final static QName _FiscalYearOfPublication_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "fiscalYearOfPublication");
    private final static QName _Language_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "language");
    private final static QName _WaterBodyDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "waterBodyDetailAttribute");
    private final static QName _WaterBodyDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/3.0", "WaterBodyDetailAttribute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.geospatial.iur._3_0.uro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConstructionBaseAttributePropertyType }
     * 
     */
    public ConstructionBaseAttributePropertyType createConstructionBaseAttributePropertyType() {
        return new ConstructionBaseAttributePropertyType();
    }

    /**
     * Create an instance of {@link FacilityIdAttributePropertyType }
     * 
     */
    public FacilityIdAttributePropertyType createFacilityIdAttributePropertyType() {
        return new FacilityIdAttributePropertyType();
    }

    /**
     * Create an instance of {@link FacilityTypeAttributePropertyType }
     * 
     */
    public FacilityTypeAttributePropertyType createFacilityTypeAttributePropertyType() {
        return new FacilityTypeAttributePropertyType();
    }

    /**
     * Create an instance of {@link FacilityAttributePropertyType }
     * 
     */
    public FacilityAttributePropertyType createFacilityAttributePropertyType() {
        return new FacilityAttributePropertyType();
    }

    /**
     * Create an instance of {@link BridgeStructureAttributePropertyType }
     * 
     */
    public BridgeStructureAttributePropertyType createBridgeStructureAttributePropertyType() {
        return new BridgeStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link BridgeFunctionalAttributePropertyType }
     * 
     */
    public BridgeFunctionalAttributePropertyType createBridgeFunctionalAttributePropertyType() {
        return new BridgeFunctionalAttributePropertyType();
    }

    /**
     * Create an instance of {@link ConstructionRiskAssessmentAttributePropertyType }
     * 
     */
    public ConstructionRiskAssessmentAttributePropertyType createConstructionRiskAssessmentAttributePropertyType() {
        return new ConstructionRiskAssessmentAttributePropertyType();
    }

    /**
     * Create an instance of {@link DisasterRiskAttributePropertyType }
     * 
     */
    public DisasterRiskAttributePropertyType createDisasterRiskAttributePropertyType() {
        return new DisasterRiskAttributePropertyType();
    }

    /**
     * Create an instance of {@link DmAttributePropertyType }
     * 
     */
    public DmAttributePropertyType createDmAttributePropertyType() {
        return new DmAttributePropertyType();
    }

    /**
     * Create an instance of {@link ConstructionDataQualityAttributePropertyType }
     * 
     */
    public ConstructionDataQualityAttributePropertyType createConstructionDataQualityAttributePropertyType() {
        return new ConstructionDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link TransportationDataQualityAttributePropertyType }
     * 
     */
    public TransportationDataQualityAttributePropertyType createTransportationDataQualityAttributePropertyType() {
        return new TransportationDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link TunnelStructureAttributePropertyType }
     * 
     */
    public TunnelStructureAttributePropertyType createTunnelStructureAttributePropertyType() {
        return new TunnelStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link TunnelFunctionalAttributePropertyType }
     * 
     */
    public TunnelFunctionalAttributePropertyType createTunnelFunctionalAttributePropertyType() {
        return new TunnelFunctionalAttributePropertyType();
    }

    /**
     * Create an instance of {@link FacilityTypeAttributeType }
     * 
     */
    public FacilityTypeAttributeType createFacilityTypeAttributeType() {
        return new FacilityTypeAttributeType();
    }

    /**
     * Create an instance of {@link FacilityIdAttributeType }
     * 
     */
    public FacilityIdAttributeType createFacilityIdAttributeType() {
        return new FacilityIdAttributeType();
    }

    /**
     * Create an instance of {@link RiverFacilityIdAttributeType }
     * 
     */
    public RiverFacilityIdAttributeType createRiverFacilityIdAttributeType() {
        return new RiverFacilityIdAttributeType();
    }

    /**
     * Create an instance of {@link ConstructionBaseAttributeType }
     * 
     */
    public ConstructionBaseAttributeType createConstructionBaseAttributeType() {
        return new ConstructionBaseAttributeType();
    }

    /**
     * Create an instance of {@link ConstructionStructureAttributeType }
     * 
     */
    public ConstructionStructureAttributeType createConstructionStructureAttributeType() {
        return new ConstructionStructureAttributeType();
    }

    /**
     * Create an instance of {@link EmbankmentAttributeType }
     * 
     */
    public EmbankmentAttributeType createEmbankmentAttributeType() {
        return new EmbankmentAttributeType();
    }

    /**
     * Create an instance of {@link DamAttributeType }
     * 
     */
    public DamAttributeType createDamAttributeType() {
        return new DamAttributeType();
    }

    /**
     * Create an instance of {@link ConstructionDataQualityAttributeType }
     * 
     */
    public ConstructionDataQualityAttributeType createConstructionDataQualityAttributeType() {
        return new ConstructionDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link ConstructionRiskAssessmentAttributeType }
     * 
     */
    public ConstructionRiskAssessmentAttributeType createConstructionRiskAssessmentAttributeType() {
        return new ConstructionRiskAssessmentAttributeType();
    }

    /**
     * Create an instance of {@link BridgeStructureAttributeType }
     * 
     */
    public BridgeStructureAttributeType createBridgeStructureAttributeType() {
        return new BridgeStructureAttributeType();
    }

    /**
     * Create an instance of {@link BridgeFunctionalAttributeType }
     * 
     */
    public BridgeFunctionalAttributeType createBridgeFunctionalAttributeType() {
        return new BridgeFunctionalAttributeType();
    }

    /**
     * Create an instance of {@link TunnelStructureAttributeType }
     * 
     */
    public TunnelStructureAttributeType createTunnelStructureAttributeType() {
        return new TunnelStructureAttributeType();
    }

    /**
     * Create an instance of {@link TunnelFunctionalAttributeType }
     * 
     */
    public TunnelFunctionalAttributeType createTunnelFunctionalAttributeType() {
        return new TunnelFunctionalAttributeType();
    }

    /**
     * Create an instance of {@link HarborFacilityType }
     * 
     */
    public HarborFacilityType createHarborFacilityType() {
        return new HarborFacilityType();
    }

    /**
     * Create an instance of {@link PortProtectiveFacilityType }
     * 
     */
    public PortProtectiveFacilityType createPortProtectiveFacilityType() {
        return new PortProtectiveFacilityType();
    }

    /**
     * Create an instance of {@link MooringFacilityType }
     * 
     */
    public MooringFacilityType createMooringFacilityType() {
        return new MooringFacilityType();
    }

    /**
     * Create an instance of {@link PortTransportationFacilityType }
     * 
     */
    public PortTransportationFacilityType createPortTransportationFacilityType() {
        return new PortTransportationFacilityType();
    }

    /**
     * Create an instance of {@link NavigationAssistanceFacilityType }
     * 
     */
    public NavigationAssistanceFacilityType createNavigationAssistanceFacilityType() {
        return new NavigationAssistanceFacilityType();
    }

    /**
     * Create an instance of {@link CargoHandlingFacilityType }
     * 
     */
    public CargoHandlingFacilityType createCargoHandlingFacilityType() {
        return new CargoHandlingFacilityType();
    }

    /**
     * Create an instance of {@link PortPassengerFacilityType }
     * 
     */
    public PortPassengerFacilityType createPortPassengerFacilityType() {
        return new PortPassengerFacilityType();
    }

    /**
     * Create an instance of {@link PortStorageFacilityType }
     * 
     */
    public PortStorageFacilityType createPortStorageFacilityType() {
        return new PortStorageFacilityType();
    }

    /**
     * Create an instance of {@link ShipServiceFacilityType }
     * 
     */
    public ShipServiceFacilityType createShipServiceFacilityType() {
        return new ShipServiceFacilityType();
    }

    /**
     * Create an instance of {@link PortWasteTreatmentFacilityType }
     * 
     */
    public PortWasteTreatmentFacilityType createPortWasteTreatmentFacilityType() {
        return new PortWasteTreatmentFacilityType();
    }

    /**
     * Create an instance of {@link PortEnvironmentalImprovementFacilityType }
     * 
     */
    public PortEnvironmentalImprovementFacilityType createPortEnvironmentalImprovementFacilityType() {
        return new PortEnvironmentalImprovementFacilityType();
    }

    /**
     * Create an instance of {@link PortPollutionControlFacilityType }
     * 
     */
    public PortPollutionControlFacilityType createPortPollutionControlFacilityType() {
        return new PortPollutionControlFacilityType();
    }

    /**
     * Create an instance of {@link PortWelfareFacilityType }
     * 
     */
    public PortWelfareFacilityType createPortWelfareFacilityType() {
        return new PortWelfareFacilityType();
    }

    /**
     * Create an instance of {@link PortManagementFacilityType }
     * 
     */
    public PortManagementFacilityType createPortManagementFacilityType() {
        return new PortManagementFacilityType();
    }

    /**
     * Create an instance of {@link CyberportMarinaAndPBSType }
     * 
     */
    public CyberportMarinaAndPBSType createCyberportMarinaAndPBSType() {
        return new CyberportMarinaAndPBSType();
    }

    /**
     * Create an instance of {@link FishingPortFacilityType }
     * 
     */
    public FishingPortFacilityType createFishingPortFacilityType() {
        return new FishingPortFacilityType();
    }

    /**
     * Create an instance of {@link FishingPortCapacityType }
     * 
     */
    public FishingPortCapacityType createFishingPortCapacityType() {
        return new FishingPortCapacityType();
    }

    /**
     * Create an instance of {@link WaterwayType }
     * 
     */
    public WaterwayType createWaterwayType() {
        return new WaterwayType();
    }

    /**
     * Create an instance of {@link WaterwayDetailAttributeType }
     * 
     */
    public WaterwayDetailAttributeType createWaterwayDetailAttributeType() {
        return new WaterwayDetailAttributeType();
    }

    /**
     * Create an instance of {@link AbstractConstructionType }
     * 
     */
    public AbstractConstructionType createAbstractConstructionType() {
        return new AbstractConstructionType();
    }

    /**
     * Create an instance of {@link OtherConstructionType }
     * 
     */
    public OtherConstructionType createOtherConstructionType() {
        return new OtherConstructionType();
    }

    /**
     * Create an instance of {@link RoofSurfaceType }
     * 
     */
    public RoofSurfaceType createRoofSurfaceType() {
        return new RoofSurfaceType();
    }

    /**
     * Create an instance of {@link WallSurfaceType }
     * 
     */
    public WallSurfaceType createWallSurfaceType() {
        return new WallSurfaceType();
    }

    /**
     * Create an instance of {@link GroundSurfaceType }
     * 
     */
    public GroundSurfaceType createGroundSurfaceType() {
        return new GroundSurfaceType();
    }

    /**
     * Create an instance of {@link OuterCeilingSurfaceType }
     * 
     */
    public OuterCeilingSurfaceType createOuterCeilingSurfaceType() {
        return new OuterCeilingSurfaceType();
    }

    /**
     * Create an instance of {@link OuterFloorSurfaceType }
     * 
     */
    public OuterFloorSurfaceType createOuterFloorSurfaceType() {
        return new OuterFloorSurfaceType();
    }

    /**
     * Create an instance of {@link ClosureSurfaceType }
     * 
     */
    public ClosureSurfaceType createClosureSurfaceType() {
        return new ClosureSurfaceType();
    }

    /**
     * Create an instance of {@link ConstructionInstallationType }
     * 
     */
    public ConstructionInstallationType createConstructionInstallationType() {
        return new ConstructionInstallationType();
    }

    /**
     * Create an instance of {@link ElevationType }
     * 
     */
    public ElevationType createElevationType() {
        return new ElevationType();
    }

    /**
     * Create an instance of {@link HeightType }
     * 
     */
    public HeightType createHeightType() {
        return new HeightType();
    }

    /**
     * Create an instance of {@link ConstructionEventType }
     * 
     */
    public ConstructionEventType createConstructionEventType() {
        return new ConstructionEventType();
    }

    /**
     * Create an instance of {@link OccupancyType }
     * 
     */
    public OccupancyType createOccupancyType() {
        return new OccupancyType();
    }

    /**
     * Create an instance of {@link UndergroundBuildingType }
     * 
     */
    public UndergroundBuildingType createUndergroundBuildingType() {
        return new UndergroundBuildingType();
    }

    /**
     * Create an instance of {@link TransportationDataQualityAttributeType }
     * 
     */
    public TransportationDataQualityAttributeType createTransportationDataQualityAttributeType() {
        return new TransportationDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link RailwayRouteAttributePropertyType }
     * 
     */
    public RailwayRouteAttributePropertyType createRailwayRouteAttributePropertyType() {
        return new RailwayRouteAttributePropertyType();
    }

    /**
     * Create an instance of {@link RailwayRouteAttributeType }
     * 
     */
    public RailwayRouteAttributeType createRailwayRouteAttributeType() {
        return new RailwayRouteAttributeType();
    }

    /**
     * Create an instance of {@link RailwayTrackAttributePropertyType }
     * 
     */
    public RailwayTrackAttributePropertyType createRailwayTrackAttributePropertyType() {
        return new RailwayTrackAttributePropertyType();
    }

    /**
     * Create an instance of {@link RailwayTrackAttributeType }
     * 
     */
    public RailwayTrackAttributeType createRailwayTrackAttributeType() {
        return new RailwayTrackAttributeType();
    }

    /**
     * Create an instance of {@link ControlPointType }
     * 
     */
    public ControlPointType createControlPointType() {
        return new ControlPointType();
    }

    /**
     * Create an instance of {@link ControlPointTypeType }
     * 
     */
    public ControlPointTypeType createControlPointTypeType() {
        return new ControlPointTypeType();
    }

    /**
     * Create an instance of {@link CircularCurveTypeType }
     * 
     */
    public CircularCurveTypeType createCircularCurveTypeType() {
        return new CircularCurveTypeType();
    }

    /**
     * Create an instance of {@link TransitionCurveTypeType }
     * 
     */
    public TransitionCurveTypeType createTransitionCurveTypeType() {
        return new TransitionCurveTypeType();
    }

    /**
     * Create an instance of {@link VerticalCurveTypeType }
     * 
     */
    public VerticalCurveTypeType createVerticalCurveTypeType() {
        return new VerticalCurveTypeType();
    }

    /**
     * Create an instance of {@link SlopeTypeType }
     * 
     */
    public SlopeTypeType createSlopeTypeType() {
        return new SlopeTypeType();
    }

    /**
     * Create an instance of {@link TrackAttributePropertyType }
     * 
     */
    public TrackAttributePropertyType createTrackAttributePropertyType() {
        return new TrackAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrackAttributeType }
     * 
     */
    public TrackAttributeType createTrackAttributeType() {
        return new TrackAttributeType();
    }

    /**
     * Create an instance of {@link SquareUrbanPlanAttributePropertyType }
     * 
     */
    public SquareUrbanPlanAttributePropertyType createSquareUrbanPlanAttributePropertyType() {
        return new SquareUrbanPlanAttributePropertyType();
    }

    /**
     * Create an instance of {@link SquareUrbanPlanAttributeType }
     * 
     */
    public SquareUrbanPlanAttributeType createSquareUrbanPlanAttributeType() {
        return new SquareUrbanPlanAttributeType();
    }

    /**
     * Create an instance of {@link StationSquareAttributeType }
     * 
     */
    public StationSquareAttributeType createStationSquareAttributeType() {
        return new StationSquareAttributeType();
    }

    /**
     * Create an instance of {@link TerminalAttributeType }
     * 
     */
    public TerminalAttributeType createTerminalAttributeType() {
        return new TerminalAttributeType();
    }

    /**
     * Create an instance of {@link ThematicShapeType }
     * 
     */
    public ThematicShapeType createThematicShapeType() {
        return new ThematicShapeType();
    }

    /**
     * Create an instance of {@link LengthAttributeType }
     * 
     */
    public LengthAttributeType createLengthAttributeType() {
        return new LengthAttributeType();
    }

    /**
     * Create an instance of {@link AppurtenanceType }
     * 
     */
    public AppurtenanceType createAppurtenanceType() {
        return new AppurtenanceType();
    }

    /**
     * Create an instance of {@link ManholeType }
     * 
     */
    public ManholeType createManholeType() {
        return new ManholeType();
    }

    /**
     * Create an instance of {@link HandholeType }
     * 
     */
    public HandholeType createHandholeType() {
        return new HandholeType();
    }

    /**
     * Create an instance of {@link PipeType }
     * 
     */
    public PipeType createPipeType() {
        return new PipeType();
    }

    /**
     * Create an instance of {@link SewerPipeType }
     * 
     */
    public SewerPipeType createSewerPipeType() {
        return new SewerPipeType();
    }

    /**
     * Create an instance of {@link ThermalPipeType }
     * 
     */
    public ThermalPipeType createThermalPipeType() {
        return new ThermalPipeType();
    }

    /**
     * Create an instance of {@link WaterPipeType }
     * 
     */
    public WaterPipeType createWaterPipeType() {
        return new WaterPipeType();
    }

    /**
     * Create an instance of {@link OilGasChemicalsPipeType }
     * 
     */
    public OilGasChemicalsPipeType createOilGasChemicalsPipeType() {
        return new OilGasChemicalsPipeType();
    }

    /**
     * Create an instance of {@link DuctType }
     * 
     */
    public DuctType createDuctType() {
        return new DuctType();
    }

    /**
     * Create an instance of {@link CableType }
     * 
     */
    public CableType createCableType() {
        return new CableType();
    }

    /**
     * Create an instance of {@link ElectricityCableType }
     * 
     */
    public ElectricityCableType createElectricityCableType() {
        return new ElectricityCableType();
    }

    /**
     * Create an instance of {@link TelecommunicationsCableType }
     * 
     */
    public TelecommunicationsCableType createTelecommunicationsCableType() {
        return new TelecommunicationsCableType();
    }

    /**
     * Create an instance of {@link OffsetDepthType }
     * 
     */
    public OffsetDepthType createOffsetDepthType() {
        return new OffsetDepthType();
    }

    /**
     * Create an instance of {@link MaintenanceHistoryAttributeType }
     * 
     */
    public MaintenanceHistoryAttributeType createMaintenanceHistoryAttributeType() {
        return new MaintenanceHistoryAttributeType();
    }

    /**
     * Create an instance of {@link IfcAttributePropertyType }
     * 
     */
    public IfcAttributePropertyType createIfcAttributePropertyType() {
        return new IfcAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoomDataQualityAttributePropertyType }
     * 
     */
    public RoomDataQualityAttributePropertyType createRoomDataQualityAttributePropertyType() {
        return new RoomDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link IfcBuildingType }
     * 
     */
    public IfcBuildingType createIfcBuildingType() {
        return new IfcBuildingType();
    }

    /**
     * Create an instance of {@link IfcPsetBuildingCommonType }
     * 
     */
    public IfcPsetBuildingCommonType createIfcPsetBuildingCommonType() {
        return new IfcPsetBuildingCommonType();
    }

    /**
     * Create an instance of {@link IfcSiteType }
     * 
     */
    public IfcSiteType createIfcSiteType() {
        return new IfcSiteType();
    }

    /**
     * Create an instance of {@link IfcPsetSiteCommonType }
     * 
     */
    public IfcPsetSiteCommonType createIfcPsetSiteCommonType() {
        return new IfcPsetSiteCommonType();
    }

    /**
     * Create an instance of {@link IfcProjectType }
     * 
     */
    public IfcProjectType createIfcProjectType() {
        return new IfcProjectType();
    }

    /**
     * Create an instance of {@link IfcGeometricRepresentationContextType }
     * 
     */
    public IfcGeometricRepresentationContextType createIfcGeometricRepresentationContextType() {
        return new IfcGeometricRepresentationContextType();
    }

    /**
     * Create an instance of {@link IfcUnitType }
     * 
     */
    public IfcUnitType createIfcUnitType() {
        return new IfcUnitType();
    }

    /**
     * Create an instance of {@link IfcAxis2Placement3DType }
     * 
     */
    public IfcAxis2Placement3DType createIfcAxis2Placement3DType() {
        return new IfcAxis2Placement3DType();
    }

    /**
     * Create an instance of {@link IfcCoordinateReferenceSystemType }
     * 
     */
    public IfcCoordinateReferenceSystemType createIfcCoordinateReferenceSystemType() {
        return new IfcCoordinateReferenceSystemType();
    }

    /**
     * Create an instance of {@link IfcProjectedCRSType }
     * 
     */
    public IfcProjectedCRSType createIfcProjectedCRSType() {
        return new IfcProjectedCRSType();
    }

    /**
     * Create an instance of {@link IfcMapConversionType }
     * 
     */
    public IfcMapConversionType createIfcMapConversionType() {
        return new IfcMapConversionType();
    }

    /**
     * Create an instance of {@link IfcSpaceType }
     * 
     */
    public IfcSpaceType createIfcSpaceType() {
        return new IfcSpaceType();
    }

    /**
     * Create an instance of {@link IfcClassificationReferenceType }
     * 
     */
    public IfcClassificationReferenceType createIfcClassificationReferenceType() {
        return new IfcClassificationReferenceType();
    }

    /**
     * Create an instance of {@link IfcClassificationType }
     * 
     */
    public IfcClassificationType createIfcClassificationType() {
        return new IfcClassificationType();
    }

    /**
     * Create an instance of {@link IfcPsetSpaceCommonType }
     * 
     */
    public IfcPsetSpaceCommonType createIfcPsetSpaceCommonType() {
        return new IfcPsetSpaceCommonType();
    }

    /**
     * Create an instance of {@link IfcSpaceBaseQuantityType }
     * 
     */
    public IfcSpaceBaseQuantityType createIfcSpaceBaseQuantityType() {
        return new IfcSpaceBaseQuantityType();
    }

    /**
     * Create an instance of {@link IfcBuildingElementType }
     * 
     */
    public IfcBuildingElementType createIfcBuildingElementType() {
        return new IfcBuildingElementType();
    }

    /**
     * Create an instance of {@link IfcWallType }
     * 
     */
    public IfcWallType createIfcWallType() {
        return new IfcWallType();
    }

    /**
     * Create an instance of {@link IfcWallStandardCaseType }
     * 
     */
    public IfcWallStandardCaseType createIfcWallStandardCaseType() {
        return new IfcWallStandardCaseType();
    }

    /**
     * Create an instance of {@link IfcCurtainWallType }
     * 
     */
    public IfcCurtainWallType createIfcCurtainWallType() {
        return new IfcCurtainWallType();
    }

    /**
     * Create an instance of {@link IfcRoofType }
     * 
     */
    public IfcRoofType createIfcRoofType() {
        return new IfcRoofType();
    }

    /**
     * Create an instance of {@link IfcWindowType }
     * 
     */
    public IfcWindowType createIfcWindowType() {
        return new IfcWindowType();
    }

    /**
     * Create an instance of {@link IfcDoorType }
     * 
     */
    public IfcDoorType createIfcDoorType() {
        return new IfcDoorType();
    }

    /**
     * Create an instance of {@link IfcOpeningElementType }
     * 
     */
    public IfcOpeningElementType createIfcOpeningElementType() {
        return new IfcOpeningElementType();
    }

    /**
     * Create an instance of {@link IfcPsetWindowCommonType }
     * 
     */
    public IfcPsetWindowCommonType createIfcPsetWindowCommonType() {
        return new IfcPsetWindowCommonType();
    }

    /**
     * Create an instance of {@link IfcPsetDoorCommonType }
     * 
     */
    public IfcPsetDoorCommonType createIfcPsetDoorCommonType() {
        return new IfcPsetDoorCommonType();
    }

    /**
     * Create an instance of {@link IfcPsetOpeningElementCommonType }
     * 
     */
    public IfcPsetOpeningElementCommonType createIfcPsetOpeningElementCommonType() {
        return new IfcPsetOpeningElementCommonType();
    }

    /**
     * Create an instance of {@link IfcFurnishingElementType }
     * 
     */
    public IfcFurnishingElementType createIfcFurnishingElementType() {
        return new IfcFurnishingElementType();
    }

    /**
     * Create an instance of {@link IfcBuildingStoreyType }
     * 
     */
    public IfcBuildingStoreyType createIfcBuildingStoreyType() {
        return new IfcBuildingStoreyType();
    }

    /**
     * Create an instance of {@link IfcGroupType }
     * 
     */
    public IfcGroupType createIfcGroupType() {
        return new IfcGroupType();
    }

    /**
     * Create an instance of {@link IfcZoneType }
     * 
     */
    public IfcZoneType createIfcZoneType() {
        return new IfcZoneType();
    }

    /**
     * Create an instance of {@link IndoorAttributePropertyType }
     * 
     */
    public IndoorAttributePropertyType createIndoorAttributePropertyType() {
        return new IndoorAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorFurnishingAttributeType }
     * 
     */
    public IndoorFurnishingAttributeType createIndoorFurnishingAttributeType() {
        return new IndoorFurnishingAttributeType();
    }

    /**
     * Create an instance of {@link IndoorZoneAttributeType }
     * 
     */
    public IndoorZoneAttributeType createIndoorZoneAttributeType() {
        return new IndoorZoneAttributeType();
    }

    /**
     * Create an instance of {@link IndoorPublicTagAttributeType }
     * 
     */
    public IndoorPublicTagAttributeType createIndoorPublicTagAttributeType() {
        return new IndoorPublicTagAttributeType();
    }

    /**
     * Create an instance of {@link IndoorSpaceAttributeType }
     * 
     */
    public IndoorSpaceAttributeType createIndoorSpaceAttributeType() {
        return new IndoorSpaceAttributeType();
    }

    /**
     * Create an instance of {@link IndoorFacilityAttributeType }
     * 
     */
    public IndoorFacilityAttributeType createIndoorFacilityAttributeType() {
        return new IndoorFacilityAttributeType();
    }

    /**
     * Create an instance of {@link IndoorStoreyAttributeType }
     * 
     */
    public IndoorStoreyAttributeType createIndoorStoreyAttributeType() {
        return new IndoorStoreyAttributeType();
    }

    /**
     * Create an instance of {@link IndoorTacatileTileAttributeType }
     * 
     */
    public IndoorTacatileTileAttributeType createIndoorTacatileTileAttributeType() {
        return new IndoorTacatileTileAttributeType();
    }

    /**
     * Create an instance of {@link IndoorUserDefinedAttributeType }
     * 
     */
    public IndoorUserDefinedAttributeType createIndoorUserDefinedAttributeType() {
        return new IndoorUserDefinedAttributeType();
    }

    /**
     * Create an instance of {@link UserDefinedValueType }
     * 
     */
    public UserDefinedValueType createUserDefinedValueType() {
        return new UserDefinedValueType();
    }

    /**
     * Create an instance of {@link RoomDataQualityAttributeType }
     * 
     */
    public RoomDataQualityAttributeType createRoomDataQualityAttributeType() {
        return new RoomDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link DmElementType }
     * 
     */
    public DmElementType createDmElementType() {
        return new DmElementType();
    }

    /**
     * Create an instance of {@link DmGeometricAttributeType }
     * 
     */
    public DmGeometricAttributeType createDmGeometricAttributeType() {
        return new DmGeometricAttributeType();
    }

    /**
     * Create an instance of {@link DmAnnotationType }
     * 
     */
    public DmAnnotationType createDmAnnotationType() {
        return new DmAnnotationType();
    }

    /**
     * Create an instance of {@link LandUseDataQualityAttributeType }
     * 
     */
    public LandUseDataQualityAttributeType createLandUseDataQualityAttributeType() {
        return new LandUseDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link LandUseDataQualityAttributePropertyType }
     * 
     */
    public LandUseDataQualityAttributePropertyType createLandUseDataQualityAttributePropertyType() {
        return new LandUseDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link PublicLandType }
     * 
     */
    public PublicLandType createPublicLandType() {
        return new PublicLandType();
    }

    /**
     * Create an instance of {@link RoadTypePropertyType }
     * 
     */
    public RoadTypePropertyType createRoadTypePropertyType() {
        return new RoadTypePropertyType();
    }

    /**
     * Create an instance of {@link RoadTypeType }
     * 
     */
    public RoadTypeType createRoadTypeType() {
        return new RoadTypeType();
    }

    /**
     * Create an instance of {@link BuildingIDAttributePropertyType }
     * 
     */
    public BuildingIDAttributePropertyType createBuildingIDAttributePropertyType() {
        return new BuildingIDAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDetailAttributePropertyType }
     * 
     */
    public BuildingDetailAttributePropertyType createBuildingDetailAttributePropertyType() {
        return new BuildingDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilityAttributePropertyType }
     * 
     */
    public LargeCustomerFacilityAttributePropertyType createLargeCustomerFacilityAttributePropertyType() {
        return new LargeCustomerFacilityAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDisasterRiskAttributePropertyType }
     * 
     */
    public BuildingDisasterRiskAttributePropertyType createBuildingDisasterRiskAttributePropertyType() {
        return new BuildingDisasterRiskAttributePropertyType();
    }

    /**
     * Create an instance of {@link KeyValuePairAttributePropertyType }
     * 
     */
    public KeyValuePairAttributePropertyType createKeyValuePairAttributePropertyType() {
        return new KeyValuePairAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDataQualityAttributePropertyType }
     * 
     */
    public BuildingDataQualityAttributePropertyType createBuildingDataQualityAttributePropertyType() {
        return new BuildingDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingIDAttributeType }
     * 
     */
    public BuildingIDAttributeType createBuildingIDAttributeType() {
        return new BuildingIDAttributeType();
    }

    /**
     * Create an instance of {@link BuildingDetailAttributeType }
     * 
     */
    public BuildingDetailAttributeType createBuildingDetailAttributeType() {
        return new BuildingDetailAttributeType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilityAttributeType }
     * 
     */
    public LargeCustomerFacilityAttributeType createLargeCustomerFacilityAttributeType() {
        return new LargeCustomerFacilityAttributeType();
    }

    /**
     * Create an instance of {@link BuildingRiverFloodingRiskAttributeType }
     * 
     */
    public BuildingRiverFloodingRiskAttributeType createBuildingRiverFloodingRiskAttributeType() {
        return new BuildingRiverFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingTsunamiRiskAttributeType }
     * 
     */
    public BuildingTsunamiRiskAttributeType createBuildingTsunamiRiskAttributeType() {
        return new BuildingTsunamiRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingInlandFloodingRiskAttributeType }
     * 
     */
    public BuildingInlandFloodingRiskAttributeType createBuildingInlandFloodingRiskAttributeType() {
        return new BuildingInlandFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingHighTideRiskAttributeType }
     * 
     */
    public BuildingHighTideRiskAttributeType createBuildingHighTideRiskAttributeType() {
        return new BuildingHighTideRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingLandSlideRiskAttributeType }
     * 
     */
    public BuildingLandSlideRiskAttributeType createBuildingLandSlideRiskAttributeType() {
        return new BuildingLandSlideRiskAttributeType();
    }

    /**
     * Create an instance of {@link KeyValuePairAttributeType }
     * 
     */
    public KeyValuePairAttributeType createKeyValuePairAttributeType() {
        return new KeyValuePairAttributeType();
    }

    /**
     * Create an instance of {@link BuildingDataQualityAttributeType }
     * 
     */
    public BuildingDataQualityAttributeType createBuildingDataQualityAttributeType() {
        return new BuildingDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link LandUseDetailAttributePropertyType }
     * 
     */
    public LandUseDetailAttributePropertyType createLandUseDetailAttributePropertyType() {
        return new LandUseDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link LandUseDetailAttributeType }
     * 
     */
    public LandUseDetailAttributeType createLandUseDetailAttributeType() {
        return new LandUseDetailAttributeType();
    }

    /**
     * Create an instance of {@link TrafficVolumeAttributePropertyType }
     * 
     */
    public TrafficVolumeAttributePropertyType createTrafficVolumeAttributePropertyType() {
        return new TrafficVolumeAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoadStructureAttributePropertyType }
     * 
     */
    public RoadStructureAttributePropertyType createRoadStructureAttributePropertyType() {
        return new RoadStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficAreaStructureAttributePropertyType }
     * 
     */
    public TrafficAreaStructureAttributePropertyType createTrafficAreaStructureAttributePropertyType() {
        return new TrafficAreaStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficVolumeAttributeType }
     * 
     */
    public TrafficVolumeAttributeType createTrafficVolumeAttributeType() {
        return new TrafficVolumeAttributeType();
    }

    /**
     * Create an instance of {@link RoadStructureAttributeType }
     * 
     */
    public RoadStructureAttributeType createRoadStructureAttributeType() {
        return new RoadStructureAttributeType();
    }

    /**
     * Create an instance of {@link TrafficAreaStructureAttributeType }
     * 
     */
    public TrafficAreaStructureAttributeType createTrafficAreaStructureAttributeType() {
        return new TrafficAreaStructureAttributeType();
    }

    /**
     * Create an instance of {@link CityFurnitureDetailAttributePropertyType }
     * 
     */
    public CityFurnitureDetailAttributePropertyType createCityFurnitureDetailAttributePropertyType() {
        return new CityFurnitureDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureDataQualityAttributePropertyType }
     * 
     */
    public CityFurnitureDataQualityAttributePropertyType createCityFurnitureDataQualityAttributePropertyType() {
        return new CityFurnitureDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureDetailAttributeType }
     * 
     */
    public CityFurnitureDetailAttributeType createCityFurnitureDetailAttributeType() {
        return new CityFurnitureDetailAttributeType();
    }

    /**
     * Create an instance of {@link CityFurnitureDataQualityAttributeType }
     * 
     */
    public CityFurnitureDataQualityAttributeType createCityFurnitureDataQualityAttributeType() {
        return new CityFurnitureDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link VegetationDataQualityAttributePropertyType }
     * 
     */
    public VegetationDataQualityAttributePropertyType createVegetationDataQualityAttributePropertyType() {
        return new VegetationDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link VegetationDataQualityAttributeType }
     * 
     */
    public VegetationDataQualityAttributeType createVegetationDataQualityAttributeType() {
        return new VegetationDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyFloodingRiskAttributePropertyType }
     * 
     */
    public WaterBodyFloodingRiskAttributePropertyType createWaterBodyFloodingRiskAttributePropertyType() {
        return new WaterBodyFloodingRiskAttributePropertyType();
    }

    /**
     * Create an instance of {@link WaterBodyFloodingRiskAttributeType }
     * 
     */
    public WaterBodyFloodingRiskAttributeType createWaterBodyFloodingRiskAttributeType() {
        return new WaterBodyFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyRiverFloodingRiskAttributeType }
     * 
     */
    public WaterBodyRiverFloodingRiskAttributeType createWaterBodyRiverFloodingRiskAttributeType() {
        return new WaterBodyRiverFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyTsunamiRiskAttributeType }
     * 
     */
    public WaterBodyTsunamiRiskAttributeType createWaterBodyTsunamiRiskAttributeType() {
        return new WaterBodyTsunamiRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyHighTideRiskAttributeType }
     * 
     */
    public WaterBodyHighTideRiskAttributeType createWaterBodyHighTideRiskAttributeType() {
        return new WaterBodyHighTideRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyInlandFloodingRiskAttributeType }
     * 
     */
    public WaterBodyInlandFloodingRiskAttributeType createWaterBodyInlandFloodingRiskAttributeType() {
        return new WaterBodyInlandFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link RiverFloodingRiskAttributeType }
     * 
     */
    public RiverFloodingRiskAttributeType createRiverFloodingRiskAttributeType() {
        return new RiverFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link TsunamiRiskAttributeType }
     * 
     */
    public TsunamiRiskAttributeType createTsunamiRiskAttributeType() {
        return new TsunamiRiskAttributeType();
    }

    /**
     * Create an instance of {@link InlandFloodingRiskAttributeType }
     * 
     */
    public InlandFloodingRiskAttributeType createInlandFloodingRiskAttributeType() {
        return new InlandFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link HighTideRiskAttributeType }
     * 
     */
    public HighTideRiskAttributeType createHighTideRiskAttributeType() {
        return new HighTideRiskAttributeType();
    }

    /**
     * Create an instance of {@link LandSlideRiskAttributeType }
     * 
     */
    public LandSlideRiskAttributeType createLandSlideRiskAttributeType() {
        return new LandSlideRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyDetailAttributePropertyType }
     * 
     */
    public WaterBodyDetailAttributePropertyType createWaterBodyDetailAttributePropertyType() {
        return new WaterBodyDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link WaterBodyDetailAttributeType }
     * 
     */
    public WaterBodyDetailAttributeType createWaterBodyDetailAttributeType() {
        return new WaterBodyDetailAttributeType();
    }

    /**
     * Create an instance of {@link RiverFacilityIdAttributePropertyType }
     * 
     */
    public RiverFacilityIdAttributePropertyType createRiverFacilityIdAttributePropertyType() {
        return new RiverFacilityIdAttributePropertyType();
    }

    /**
     * Create an instance of {@link ConstructionStructureAttributePropertyType }
     * 
     */
    public ConstructionStructureAttributePropertyType createConstructionStructureAttributePropertyType() {
        return new ConstructionStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link EmbankmentAttributePropertyType }
     * 
     */
    public EmbankmentAttributePropertyType createEmbankmentAttributePropertyType() {
        return new EmbankmentAttributePropertyType();
    }

    /**
     * Create an instance of {@link DamAttributePropertyType }
     * 
     */
    public DamAttributePropertyType createDamAttributePropertyType() {
        return new DamAttributePropertyType();
    }

    /**
     * Create an instance of {@link PortAttributePropertyType }
     * 
     */
    public PortAttributePropertyType createPortAttributePropertyType() {
        return new PortAttributePropertyType();
    }

    /**
     * Create an instance of {@link HarborFacilityPropertyType }
     * 
     */
    public HarborFacilityPropertyType createHarborFacilityPropertyType() {
        return new HarborFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortProtectiveFacilityPropertyType }
     * 
     */
    public PortProtectiveFacilityPropertyType createPortProtectiveFacilityPropertyType() {
        return new PortProtectiveFacilityPropertyType();
    }

    /**
     * Create an instance of {@link MooringFacilityPropertyType }
     * 
     */
    public MooringFacilityPropertyType createMooringFacilityPropertyType() {
        return new MooringFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortTransportationFacilityPropertyType }
     * 
     */
    public PortTransportationFacilityPropertyType createPortTransportationFacilityPropertyType() {
        return new PortTransportationFacilityPropertyType();
    }

    /**
     * Create an instance of {@link NavigationAssistanceFacilityPropertyType }
     * 
     */
    public NavigationAssistanceFacilityPropertyType createNavigationAssistanceFacilityPropertyType() {
        return new NavigationAssistanceFacilityPropertyType();
    }

    /**
     * Create an instance of {@link CargoHandlingFacilityPropertyType }
     * 
     */
    public CargoHandlingFacilityPropertyType createCargoHandlingFacilityPropertyType() {
        return new CargoHandlingFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortPassengerFacilityPropertyType }
     * 
     */
    public PortPassengerFacilityPropertyType createPortPassengerFacilityPropertyType() {
        return new PortPassengerFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortStorageFacilityPropertyType }
     * 
     */
    public PortStorageFacilityPropertyType createPortStorageFacilityPropertyType() {
        return new PortStorageFacilityPropertyType();
    }

    /**
     * Create an instance of {@link ShipServiceFacilityPropertyType }
     * 
     */
    public ShipServiceFacilityPropertyType createShipServiceFacilityPropertyType() {
        return new ShipServiceFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortWasteTreatmentFacilityPropertyType }
     * 
     */
    public PortWasteTreatmentFacilityPropertyType createPortWasteTreatmentFacilityPropertyType() {
        return new PortWasteTreatmentFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortEnvironmentalImprovementFacilityPropertyType }
     * 
     */
    public PortEnvironmentalImprovementFacilityPropertyType createPortEnvironmentalImprovementFacilityPropertyType() {
        return new PortEnvironmentalImprovementFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortPollutionControlFacilityPropertyType }
     * 
     */
    public PortPollutionControlFacilityPropertyType createPortPollutionControlFacilityPropertyType() {
        return new PortPollutionControlFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortWelfareFacilityPropertyType }
     * 
     */
    public PortWelfareFacilityPropertyType createPortWelfareFacilityPropertyType() {
        return new PortWelfareFacilityPropertyType();
    }

    /**
     * Create an instance of {@link PortManagementFacilityPropertyType }
     * 
     */
    public PortManagementFacilityPropertyType createPortManagementFacilityPropertyType() {
        return new PortManagementFacilityPropertyType();
    }

    /**
     * Create an instance of {@link CyberportMarinaAndPBSPropertyType }
     * 
     */
    public CyberportMarinaAndPBSPropertyType createCyberportMarinaAndPBSPropertyType() {
        return new CyberportMarinaAndPBSPropertyType();
    }

    /**
     * Create an instance of {@link FishingPortAttributePropertyType }
     * 
     */
    public FishingPortAttributePropertyType createFishingPortAttributePropertyType() {
        return new FishingPortAttributePropertyType();
    }

    /**
     * Create an instance of {@link FishingPortFacilityPropertyType }
     * 
     */
    public FishingPortFacilityPropertyType createFishingPortFacilityPropertyType() {
        return new FishingPortFacilityPropertyType();
    }

    /**
     * Create an instance of {@link FishingPortCapacityPropertyType }
     * 
     */
    public FishingPortCapacityPropertyType createFishingPortCapacityPropertyType() {
        return new FishingPortCapacityPropertyType();
    }

    /**
     * Create an instance of {@link WaterwayPropertyType }
     * 
     */
    public WaterwayPropertyType createWaterwayPropertyType() {
        return new WaterwayPropertyType();
    }

    /**
     * Create an instance of {@link WaterwayDetailAttributePropertyType }
     * 
     */
    public WaterwayDetailAttributePropertyType createWaterwayDetailAttributePropertyType() {
        return new WaterwayDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link AbstractConstructionPropertyType }
     * 
     */
    public AbstractConstructionPropertyType createAbstractConstructionPropertyType() {
        return new AbstractConstructionPropertyType();
    }

    /**
     * Create an instance of {@link OtherConstructionPropertyType }
     * 
     */
    public OtherConstructionPropertyType createOtherConstructionPropertyType() {
        return new OtherConstructionPropertyType();
    }

    /**
     * Create an instance of {@link _BoundarySurfacePropertyType }
     * 
     */
    public _BoundarySurfacePropertyType create_BoundarySurfacePropertyType() {
        return new _BoundarySurfacePropertyType();
    }

    /**
     * Create an instance of {@link RoofSurfacePropertyType }
     * 
     */
    public RoofSurfacePropertyType createRoofSurfacePropertyType() {
        return new RoofSurfacePropertyType();
    }

    /**
     * Create an instance of {@link WallSurfacePropertyType }
     * 
     */
    public WallSurfacePropertyType createWallSurfacePropertyType() {
        return new WallSurfacePropertyType();
    }

    /**
     * Create an instance of {@link GroundSurfacePropertyType }
     * 
     */
    public GroundSurfacePropertyType createGroundSurfacePropertyType() {
        return new GroundSurfacePropertyType();
    }

    /**
     * Create an instance of {@link OuterCeilingSurfacePropertyType }
     * 
     */
    public OuterCeilingSurfacePropertyType createOuterCeilingSurfacePropertyType() {
        return new OuterCeilingSurfacePropertyType();
    }

    /**
     * Create an instance of {@link OuterFloorSurfacePropertyType }
     * 
     */
    public OuterFloorSurfacePropertyType createOuterFloorSurfacePropertyType() {
        return new OuterFloorSurfacePropertyType();
    }

    /**
     * Create an instance of {@link ClosureSurfacePropertyType }
     * 
     */
    public ClosureSurfacePropertyType createClosureSurfacePropertyType() {
        return new ClosureSurfacePropertyType();
    }

    /**
     * Create an instance of {@link ConstructionInstallationPropertyType }
     * 
     */
    public ConstructionInstallationPropertyType createConstructionInstallationPropertyType() {
        return new ConstructionInstallationPropertyType();
    }

    /**
     * Create an instance of {@link ElevationPropertyType }
     * 
     */
    public ElevationPropertyType createElevationPropertyType() {
        return new ElevationPropertyType();
    }

    /**
     * Create an instance of {@link HeightPropertyType }
     * 
     */
    public HeightPropertyType createHeightPropertyType() {
        return new HeightPropertyType();
    }

    /**
     * Create an instance of {@link ConstructionEventPropertyType }
     * 
     */
    public ConstructionEventPropertyType createConstructionEventPropertyType() {
        return new ConstructionEventPropertyType();
    }

    /**
     * Create an instance of {@link OccupancyPropertyType }
     * 
     */
    public OccupancyPropertyType createOccupancyPropertyType() {
        return new OccupancyPropertyType();
    }

    /**
     * Create an instance of {@link UndergroundBuildingPropertyType }
     * 
     */
    public UndergroundBuildingPropertyType createUndergroundBuildingPropertyType() {
        return new UndergroundBuildingPropertyType();
    }

    /**
     * Create an instance of {@link ControlPointPropertyType }
     * 
     */
    public ControlPointPropertyType createControlPointPropertyType() {
        return new ControlPointPropertyType();
    }

    /**
     * Create an instance of {@link ControlPointTypePropertyType }
     * 
     */
    public ControlPointTypePropertyType createControlPointTypePropertyType() {
        return new ControlPointTypePropertyType();
    }

    /**
     * Create an instance of {@link CircularCurveTypePropertyType }
     * 
     */
    public CircularCurveTypePropertyType createCircularCurveTypePropertyType() {
        return new CircularCurveTypePropertyType();
    }

    /**
     * Create an instance of {@link TransitionCurveTypePropertyType }
     * 
     */
    public TransitionCurveTypePropertyType createTransitionCurveTypePropertyType() {
        return new TransitionCurveTypePropertyType();
    }

    /**
     * Create an instance of {@link VerticalCurveTypePropertyType }
     * 
     */
    public VerticalCurveTypePropertyType createVerticalCurveTypePropertyType() {
        return new VerticalCurveTypePropertyType();
    }

    /**
     * Create an instance of {@link SlopeTypePropertyType }
     * 
     */
    public SlopeTypePropertyType createSlopeTypePropertyType() {
        return new SlopeTypePropertyType();
    }

    /**
     * Create an instance of {@link StationSquareAttributePropertyType }
     * 
     */
    public StationSquareAttributePropertyType createStationSquareAttributePropertyType() {
        return new StationSquareAttributePropertyType();
    }

    /**
     * Create an instance of {@link TerminalAttributePropertyType }
     * 
     */
    public TerminalAttributePropertyType createTerminalAttributePropertyType() {
        return new TerminalAttributePropertyType();
    }

    /**
     * Create an instance of {@link UtilityNetworkElementPropertyType }
     * 
     */
    public UtilityNetworkElementPropertyType createUtilityNetworkElementPropertyType() {
        return new UtilityNetworkElementPropertyType();
    }

    /**
     * Create an instance of {@link UtilityLinkPropertyType }
     * 
     */
    public UtilityLinkPropertyType createUtilityLinkPropertyType() {
        return new UtilityLinkPropertyType();
    }

    /**
     * Create an instance of {@link ThematicShapePropertyType }
     * 
     */
    public ThematicShapePropertyType createThematicShapePropertyType() {
        return new ThematicShapePropertyType();
    }

    /**
     * Create an instance of {@link LengthAttributePropertyType }
     * 
     */
    public LengthAttributePropertyType createLengthAttributePropertyType() {
        return new LengthAttributePropertyType();
    }

    /**
     * Create an instance of {@link UtilityNodePropertyType }
     * 
     */
    public UtilityNodePropertyType createUtilityNodePropertyType() {
        return new UtilityNodePropertyType();
    }

    /**
     * Create an instance of {@link AppurtenancePropertyType }
     * 
     */
    public AppurtenancePropertyType createAppurtenancePropertyType() {
        return new AppurtenancePropertyType();
    }

    /**
     * Create an instance of {@link UtilityNodeContainerPropertyType }
     * 
     */
    public UtilityNodeContainerPropertyType createUtilityNodeContainerPropertyType() {
        return new UtilityNodeContainerPropertyType();
    }

    /**
     * Create an instance of {@link ManholePropertyType }
     * 
     */
    public ManholePropertyType createManholePropertyType() {
        return new ManholePropertyType();
    }

    /**
     * Create an instance of {@link HandholePropertyType }
     * 
     */
    public HandholePropertyType createHandholePropertyType() {
        return new HandholePropertyType();
    }

    /**
     * Create an instance of {@link PipePropertyType }
     * 
     */
    public PipePropertyType createPipePropertyType() {
        return new PipePropertyType();
    }

    /**
     * Create an instance of {@link SewerPipePropertyType }
     * 
     */
    public SewerPipePropertyType createSewerPipePropertyType() {
        return new SewerPipePropertyType();
    }

    /**
     * Create an instance of {@link ThermalPipePropertyType }
     * 
     */
    public ThermalPipePropertyType createThermalPipePropertyType() {
        return new ThermalPipePropertyType();
    }

    /**
     * Create an instance of {@link WaterPipePropertyType }
     * 
     */
    public WaterPipePropertyType createWaterPipePropertyType() {
        return new WaterPipePropertyType();
    }

    /**
     * Create an instance of {@link OilGasChemicalsPipePropertyType }
     * 
     */
    public OilGasChemicalsPipePropertyType createOilGasChemicalsPipePropertyType() {
        return new OilGasChemicalsPipePropertyType();
    }

    /**
     * Create an instance of {@link DuctPropertyType }
     * 
     */
    public DuctPropertyType createDuctPropertyType() {
        return new DuctPropertyType();
    }

    /**
     * Create an instance of {@link CablePropertyType }
     * 
     */
    public CablePropertyType createCablePropertyType() {
        return new CablePropertyType();
    }

    /**
     * Create an instance of {@link ElectricityCablePropertyType }
     * 
     */
    public ElectricityCablePropertyType createElectricityCablePropertyType() {
        return new ElectricityCablePropertyType();
    }

    /**
     * Create an instance of {@link TelecommunicationsCablePropertyType }
     * 
     */
    public TelecommunicationsCablePropertyType createTelecommunicationsCablePropertyType() {
        return new TelecommunicationsCablePropertyType();
    }

    /**
     * Create an instance of {@link OffsetDepthPropertyType }
     * 
     */
    public OffsetDepthPropertyType createOffsetDepthPropertyType() {
        return new OffsetDepthPropertyType();
    }

    /**
     * Create an instance of {@link MaintenanceHistoryAttributePropertyType }
     * 
     */
    public MaintenanceHistoryAttributePropertyType createMaintenanceHistoryAttributePropertyType() {
        return new MaintenanceHistoryAttributePropertyType();
    }

    /**
     * Create an instance of {@link IfcRootPropertyType }
     * 
     */
    public IfcRootPropertyType createIfcRootPropertyType() {
        return new IfcRootPropertyType();
    }

    /**
     * Create an instance of {@link IfcObjectDefinitionPropertyType }
     * 
     */
    public IfcObjectDefinitionPropertyType createIfcObjectDefinitionPropertyType() {
        return new IfcObjectDefinitionPropertyType();
    }

    /**
     * Create an instance of {@link IfcObjectPropertyType }
     * 
     */
    public IfcObjectPropertyType createIfcObjectPropertyType() {
        return new IfcObjectPropertyType();
    }

    /**
     * Create an instance of {@link IfcProductPropertyType }
     * 
     */
    public IfcProductPropertyType createIfcProductPropertyType() {
        return new IfcProductPropertyType();
    }

    /**
     * Create an instance of {@link IfcSpatialStructureElementPropertyType }
     * 
     */
    public IfcSpatialStructureElementPropertyType createIfcSpatialStructureElementPropertyType() {
        return new IfcSpatialStructureElementPropertyType();
    }

    /**
     * Create an instance of {@link IfcBuildingPropertyType }
     * 
     */
    public IfcBuildingPropertyType createIfcBuildingPropertyType() {
        return new IfcBuildingPropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetBuildingCommonPropertyType }
     * 
     */
    public IfcPsetBuildingCommonPropertyType createIfcPsetBuildingCommonPropertyType() {
        return new IfcPsetBuildingCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcSitePropertyType }
     * 
     */
    public IfcSitePropertyType createIfcSitePropertyType() {
        return new IfcSitePropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetSiteCommonPropertyType }
     * 
     */
    public IfcPsetSiteCommonPropertyType createIfcPsetSiteCommonPropertyType() {
        return new IfcPsetSiteCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcProjectPropertyType }
     * 
     */
    public IfcProjectPropertyType createIfcProjectPropertyType() {
        return new IfcProjectPropertyType();
    }

    /**
     * Create an instance of {@link IfcGeometricRepresentationContextPropertyType }
     * 
     */
    public IfcGeometricRepresentationContextPropertyType createIfcGeometricRepresentationContextPropertyType() {
        return new IfcGeometricRepresentationContextPropertyType();
    }

    /**
     * Create an instance of {@link IfcUnitPropertyType }
     * 
     */
    public IfcUnitPropertyType createIfcUnitPropertyType() {
        return new IfcUnitPropertyType();
    }

    /**
     * Create an instance of {@link IfcAxis2Placement3DPropertyType }
     * 
     */
    public IfcAxis2Placement3DPropertyType createIfcAxis2Placement3DPropertyType() {
        return new IfcAxis2Placement3DPropertyType();
    }

    /**
     * Create an instance of {@link IfcCoordinateReferenceSystemPropertyType }
     * 
     */
    public IfcCoordinateReferenceSystemPropertyType createIfcCoordinateReferenceSystemPropertyType() {
        return new IfcCoordinateReferenceSystemPropertyType();
    }

    /**
     * Create an instance of {@link IfcProjectedCRSPropertyType }
     * 
     */
    public IfcProjectedCRSPropertyType createIfcProjectedCRSPropertyType() {
        return new IfcProjectedCRSPropertyType();
    }

    /**
     * Create an instance of {@link IfcMapConversionPropertyType }
     * 
     */
    public IfcMapConversionPropertyType createIfcMapConversionPropertyType() {
        return new IfcMapConversionPropertyType();
    }

    /**
     * Create an instance of {@link IfcCoordinateReferenceSystemSelectType }
     * 
     */
    public IfcCoordinateReferenceSystemSelectType createIfcCoordinateReferenceSystemSelectType() {
        return new IfcCoordinateReferenceSystemSelectType();
    }

    /**
     * Create an instance of {@link IfcSpacePropertyType }
     * 
     */
    public IfcSpacePropertyType createIfcSpacePropertyType() {
        return new IfcSpacePropertyType();
    }

    /**
     * Create an instance of {@link IfcClassificationReferencePropertyType }
     * 
     */
    public IfcClassificationReferencePropertyType createIfcClassificationReferencePropertyType() {
        return new IfcClassificationReferencePropertyType();
    }

    /**
     * Create an instance of {@link IfcClassificationPropertyType }
     * 
     */
    public IfcClassificationPropertyType createIfcClassificationPropertyType() {
        return new IfcClassificationPropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetSpaceCommonPropertyType }
     * 
     */
    public IfcPsetSpaceCommonPropertyType createIfcPsetSpaceCommonPropertyType() {
        return new IfcPsetSpaceCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcSpaceBaseQuantityPropertyType }
     * 
     */
    public IfcSpaceBaseQuantityPropertyType createIfcSpaceBaseQuantityPropertyType() {
        return new IfcSpaceBaseQuantityPropertyType();
    }

    /**
     * Create an instance of {@link IfcElementPropertyType }
     * 
     */
    public IfcElementPropertyType createIfcElementPropertyType() {
        return new IfcElementPropertyType();
    }

    /**
     * Create an instance of {@link IfcBuildingElementPropertyType }
     * 
     */
    public IfcBuildingElementPropertyType createIfcBuildingElementPropertyType() {
        return new IfcBuildingElementPropertyType();
    }

    /**
     * Create an instance of {@link IfcWallPropertyType }
     * 
     */
    public IfcWallPropertyType createIfcWallPropertyType() {
        return new IfcWallPropertyType();
    }

    /**
     * Create an instance of {@link IfcWallStandardCasePropertyType }
     * 
     */
    public IfcWallStandardCasePropertyType createIfcWallStandardCasePropertyType() {
        return new IfcWallStandardCasePropertyType();
    }

    /**
     * Create an instance of {@link IfcCurtainWallPropertyType }
     * 
     */
    public IfcCurtainWallPropertyType createIfcCurtainWallPropertyType() {
        return new IfcCurtainWallPropertyType();
    }

    /**
     * Create an instance of {@link IfcRoofPropertyType }
     * 
     */
    public IfcRoofPropertyType createIfcRoofPropertyType() {
        return new IfcRoofPropertyType();
    }

    /**
     * Create an instance of {@link IfcWindowPropertyType }
     * 
     */
    public IfcWindowPropertyType createIfcWindowPropertyType() {
        return new IfcWindowPropertyType();
    }

    /**
     * Create an instance of {@link IfcDoorPropertyType }
     * 
     */
    public IfcDoorPropertyType createIfcDoorPropertyType() {
        return new IfcDoorPropertyType();
    }

    /**
     * Create an instance of {@link IfcOpeningElementPropertyType }
     * 
     */
    public IfcOpeningElementPropertyType createIfcOpeningElementPropertyType() {
        return new IfcOpeningElementPropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetWindowCommonPropertyType }
     * 
     */
    public IfcPsetWindowCommonPropertyType createIfcPsetWindowCommonPropertyType() {
        return new IfcPsetWindowCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetDoorCommonPropertyType }
     * 
     */
    public IfcPsetDoorCommonPropertyType createIfcPsetDoorCommonPropertyType() {
        return new IfcPsetDoorCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcPsetOpeningElementCommonPropertyType }
     * 
     */
    public IfcPsetOpeningElementCommonPropertyType createIfcPsetOpeningElementCommonPropertyType() {
        return new IfcPsetOpeningElementCommonPropertyType();
    }

    /**
     * Create an instance of {@link IfcFurnishingElementPropertyType }
     * 
     */
    public IfcFurnishingElementPropertyType createIfcFurnishingElementPropertyType() {
        return new IfcFurnishingElementPropertyType();
    }

    /**
     * Create an instance of {@link IfcBuildingStoreyPropertyType }
     * 
     */
    public IfcBuildingStoreyPropertyType createIfcBuildingStoreyPropertyType() {
        return new IfcBuildingStoreyPropertyType();
    }

    /**
     * Create an instance of {@link IfcGroupPropertyType }
     * 
     */
    public IfcGroupPropertyType createIfcGroupPropertyType() {
        return new IfcGroupPropertyType();
    }

    /**
     * Create an instance of {@link IfcZonePropertyType }
     * 
     */
    public IfcZonePropertyType createIfcZonePropertyType() {
        return new IfcZonePropertyType();
    }

    /**
     * Create an instance of {@link IndoorFurnishingAttributePropertyType }
     * 
     */
    public IndoorFurnishingAttributePropertyType createIndoorFurnishingAttributePropertyType() {
        return new IndoorFurnishingAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorZoneAttributePropertyType }
     * 
     */
    public IndoorZoneAttributePropertyType createIndoorZoneAttributePropertyType() {
        return new IndoorZoneAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorPublicTagAttributePropertyType }
     * 
     */
    public IndoorPublicTagAttributePropertyType createIndoorPublicTagAttributePropertyType() {
        return new IndoorPublicTagAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorSpaceAttributePropertyType }
     * 
     */
    public IndoorSpaceAttributePropertyType createIndoorSpaceAttributePropertyType() {
        return new IndoorSpaceAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorFacilityAttributePropertyType }
     * 
     */
    public IndoorFacilityAttributePropertyType createIndoorFacilityAttributePropertyType() {
        return new IndoorFacilityAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorStoreyAttributePropertyType }
     * 
     */
    public IndoorStoreyAttributePropertyType createIndoorStoreyAttributePropertyType() {
        return new IndoorStoreyAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorTacatileTileAttributePropertyType }
     * 
     */
    public IndoorTacatileTileAttributePropertyType createIndoorTacatileTileAttributePropertyType() {
        return new IndoorTacatileTileAttributePropertyType();
    }

    /**
     * Create an instance of {@link IndoorUserDefinedAttributePropertyType }
     * 
     */
    public IndoorUserDefinedAttributePropertyType createIndoorUserDefinedAttributePropertyType() {
        return new IndoorUserDefinedAttributePropertyType();
    }

    /**
     * Create an instance of {@link UserDefinedValuePropertyType }
     * 
     */
    public UserDefinedValuePropertyType createUserDefinedValuePropertyType() {
        return new UserDefinedValuePropertyType();
    }

    /**
     * Create an instance of {@link RoomAttributePropertyType }
     * 
     */
    public RoomAttributePropertyType createRoomAttributePropertyType() {
        return new RoomAttributePropertyType();
    }

    /**
     * Create an instance of {@link DmElementPropertyType }
     * 
     */
    public DmElementPropertyType createDmElementPropertyType() {
        return new DmElementPropertyType();
    }

    /**
     * Create an instance of {@link DmGeometricAttributePropertyType }
     * 
     */
    public DmGeometricAttributePropertyType createDmGeometricAttributePropertyType() {
        return new DmGeometricAttributePropertyType();
    }

    /**
     * Create an instance of {@link DmAnnotationPropertyType }
     * 
     */
    public DmAnnotationPropertyType createDmAnnotationPropertyType() {
        return new DmAnnotationPropertyType();
    }

    /**
     * Create an instance of {@link PublicLandPropertyType }
     * 
     */
    public PublicLandPropertyType createPublicLandPropertyType() {
        return new PublicLandPropertyType();
    }

    /**
     * Create an instance of {@link BuildingAttributePropertyType }
     * 
     */
    public BuildingAttributePropertyType createBuildingAttributePropertyType() {
        return new BuildingAttributePropertyType();
    }

    /**
     * Create an instance of {@link LandUseAttributePropertyType }
     * 
     */
    public LandUseAttributePropertyType createLandUseAttributePropertyType() {
        return new LandUseAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoadAttributePropertyType }
     * 
     */
    public RoadAttributePropertyType createRoadAttributePropertyType() {
        return new RoadAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficAreaAttributePropertyType }
     * 
     */
    public TrafficAreaAttributePropertyType createTrafficAreaAttributePropertyType() {
        return new TrafficAreaAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureAttributePropertyType }
     * 
     */
    public CityFurnitureAttributePropertyType createCityFurnitureAttributePropertyType() {
        return new CityFurnitureAttributePropertyType();
    }

    /**
     * Create an instance of {@link VegetationAttributePropertyType }
     * 
     */
    public VegetationAttributePropertyType createVegetationAttributePropertyType() {
        return new VegetationAttributePropertyType();
    }

    /**
     * Create an instance of {@link WaterBodyAttributePropertyType }
     * 
     */
    public WaterBodyAttributePropertyType createWaterBodyAttributePropertyType() {
        return new WaterBodyAttributePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridBaseAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<ConstructionBaseAttributePropertyType> createBridBaseAttribute(ConstructionBaseAttributePropertyType value) {
        return new JAXBElement<ConstructionBaseAttributePropertyType>(_BridBaseAttribute_QNAME, ConstructionBaseAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<FacilityIdAttributePropertyType> createBridFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_BridFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<FacilityTypeAttributePropertyType> createBridFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_BridFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<FacilityAttributePropertyType> createBridFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_BridFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BridgeStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<BridgeStructureAttributePropertyType> createBridStructureAttribute(BridgeStructureAttributePropertyType value) {
        return new JAXBElement<BridgeStructureAttributePropertyType>(_BridStructureAttribute_QNAME, BridgeStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeFunctionalAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BridgeFunctionalAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridFunctionalAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<BridgeFunctionalAttributePropertyType> createBridFunctionalAttribute(BridgeFunctionalAttributePropertyType value) {
        return new JAXBElement<BridgeFunctionalAttributePropertyType>(_BridFunctionalAttribute_QNAME, BridgeFunctionalAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridRiskAssessmentAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<ConstructionRiskAssessmentAttributePropertyType> createBridRiskAssessmentAttribute(ConstructionRiskAssessmentAttributePropertyType value) {
        return new JAXBElement<ConstructionRiskAssessmentAttributePropertyType>(_BridRiskAssessmentAttribute_QNAME, ConstructionRiskAssessmentAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridDisasterRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<DisasterRiskAttributePropertyType> createBridDisasterRiskAttribute(DisasterRiskAttributePropertyType value) {
        return new JAXBElement<DisasterRiskAttributePropertyType>(_BridDisasterRiskAttribute_QNAME, DisasterRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<DmAttributePropertyType> createBridDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_BridDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bridDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/bridge/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBridge")
    public JAXBElement<ConstructionDataQualityAttributePropertyType> createBridDataQualityAttribute(ConstructionDataQualityAttributePropertyType value) {
        return new JAXBElement<ConstructionDataQualityAttributePropertyType>(_BridDataQualityAttribute_QNAME, ConstructionDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "frnFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<FacilityIdAttributePropertyType> createFrnFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_FrnFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "frnFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<FacilityTypeAttributePropertyType> createFrnFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_FrnFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "frnFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<FacilityAttributePropertyType> createFrnFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_FrnFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "frnDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<DmAttributePropertyType> createFrnDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_FrnDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tranFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTransportationComplex")
    public JAXBElement<FacilityIdAttributePropertyType> createTranFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_TranFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tranFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTransportationComplex")
    public JAXBElement<FacilityTypeAttributePropertyType> createTranFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_TranFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tranFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTransportationComplex")
    public JAXBElement<FacilityAttributePropertyType> createTranFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_TranFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tranDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTransportationObject")
    public JAXBElement<DmAttributePropertyType> createTranDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_TranDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportationDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tranDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTransportationComplex")
    public JAXBElement<TransportationDataQualityAttributePropertyType> createTranDataQualityAttribute(TransportationDataQualityAttributePropertyType value) {
        return new JAXBElement<TransportationDataQualityAttributePropertyType>(_TranDataQualityAttribute_QNAME, TransportationDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "vegFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<FacilityIdAttributePropertyType> createVegFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_VegFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "vegFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<FacilityTypeAttributePropertyType> createVegFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_VegFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "vegFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<FacilityAttributePropertyType> createVegFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_VegFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "vegDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<DmAttributePropertyType> createVegDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_VegDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunBaseAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<ConstructionBaseAttributePropertyType> createTunBaseAttribute(ConstructionBaseAttributePropertyType value) {
        return new JAXBElement<ConstructionBaseAttributePropertyType>(_TunBaseAttribute_QNAME, ConstructionBaseAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TunnelStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TunnelStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<TunnelStructureAttributePropertyType> createTunStructureAttribute(TunnelStructureAttributePropertyType value) {
        return new JAXBElement<TunnelStructureAttributePropertyType>(_TunStructureAttribute_QNAME, TunnelStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TunnelFunctionalAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TunnelFunctionalAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunFunctionalAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<TunnelFunctionalAttributePropertyType> createTunFunctionalAttribute(TunnelFunctionalAttributePropertyType value) {
        return new JAXBElement<TunnelFunctionalAttributePropertyType>(_TunFunctionalAttribute_QNAME, TunnelFunctionalAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunRiskAssessmentAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<ConstructionRiskAssessmentAttributePropertyType> createTunRiskAssessmentAttribute(ConstructionRiskAssessmentAttributePropertyType value) {
        return new JAXBElement<ConstructionRiskAssessmentAttributePropertyType>(_TunRiskAssessmentAttribute_QNAME, ConstructionRiskAssessmentAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunDisasterRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<DisasterRiskAttributePropertyType> createTunDisasterRiskAttribute(DisasterRiskAttributePropertyType value) {
        return new JAXBElement<DisasterRiskAttributePropertyType>(_TunDisasterRiskAttribute_QNAME, DisasterRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<DmAttributePropertyType> createTunDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_TunDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<ConstructionDataQualityAttributePropertyType> createTunDataQualityAttribute(ConstructionDataQualityAttributePropertyType value) {
        return new JAXBElement<ConstructionDataQualityAttributePropertyType>(_TunDataQualityAttribute_QNAME, ConstructionDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<FacilityIdAttributePropertyType> createTunFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_TunFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<FacilityTypeAttributePropertyType> createTunFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_TunFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "tunFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/tunnel/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractTunnel")
    public JAXBElement<FacilityAttributePropertyType> createTunFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_TunFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bldgFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<FacilityIdAttributePropertyType> createBldgFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_BldgFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bldgFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<FacilityTypeAttributePropertyType> createBldgFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_BldgFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bldgFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<FacilityAttributePropertyType> createBldgFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_BldgFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "bldgDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<DmAttributePropertyType> createBldgDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_BldgDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "luseFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<FacilityIdAttributePropertyType> createLuseFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_LuseFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "luseFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<FacilityTypeAttributePropertyType> createLuseFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_LuseFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "luseFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<FacilityAttributePropertyType> createLuseFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_LuseFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "luseDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<DmAttributePropertyType> createLuseDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_LuseDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "wtrFacilityIdAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<FacilityIdAttributePropertyType> createWtrFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        return new JAXBElement<FacilityIdAttributePropertyType>(_WtrFacilityIdAttribute_QNAME, FacilityIdAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "wtrFacilityTypeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<FacilityTypeAttributePropertyType> createWtrFacilityTypeAttribute(FacilityTypeAttributePropertyType value) {
        return new JAXBElement<FacilityTypeAttributePropertyType>(_WtrFacilityTypeAttribute_QNAME, FacilityTypeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "wtrFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<FacilityAttributePropertyType> createWtrFacilityAttribute(FacilityAttributePropertyType value) {
        return new JAXBElement<FacilityAttributePropertyType>(_WtrFacilityAttribute_QNAME, FacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "wtrDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<DmAttributePropertyType> createWtrDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_WtrDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "demDmAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/relief/2.0", substitutionHeadName = "_GenericApplicationPropertyOfReliefComponent")
    public JAXBElement<DmAttributePropertyType> createDemDmAttribute(DmAttributePropertyType value) {
        return new JAXBElement<DmAttributePropertyType>(_DemDmAttribute_QNAME, DmAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityTypeAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FacilityTypeAttribute")
    public JAXBElement<FacilityTypeAttributeType> createFacilityTypeAttribute(FacilityTypeAttributeType value) {
        return new JAXBElement<FacilityTypeAttributeType>(_FacilityTypeAttribute_QNAME, FacilityTypeAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityIdAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FacilityIdAttribute")
    public JAXBElement<FacilityIdAttributeType> createFacilityIdAttribute(FacilityIdAttributeType value) {
        return new JAXBElement<FacilityIdAttributeType>(_FacilityIdAttribute_QNAME, FacilityIdAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiverFacilityIdAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RiverFacilityIdAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RiverFacilityIdAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FacilityIdAttribute")
    public JAXBElement<RiverFacilityIdAttributeType> createRiverFacilityIdAttribute(RiverFacilityIdAttributeType value) {
        return new JAXBElement<RiverFacilityIdAttributeType>(_RiverFacilityIdAttribute_QNAME, RiverFacilityIdAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionBaseAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionBaseAttribute")
    public JAXBElement<ConstructionBaseAttributeType> createConstructionBaseAttribute(ConstructionBaseAttributeType value) {
        return new JAXBElement<ConstructionBaseAttributeType>(_ConstructionBaseAttribute_QNAME, ConstructionBaseAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionStructureAttribute")
    public JAXBElement<ConstructionStructureAttributeType> createConstructionStructureAttribute(ConstructionStructureAttributeType value) {
        return new JAXBElement<ConstructionStructureAttributeType>(_ConstructionStructureAttribute_QNAME, ConstructionStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbankmentAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmbankmentAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "EmbankmentAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "ConstructionStructureAttribute")
    public JAXBElement<EmbankmentAttributeType> createEmbankmentAttribute(EmbankmentAttributeType value) {
        return new JAXBElement<EmbankmentAttributeType>(_EmbankmentAttribute_QNAME, EmbankmentAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DamAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DamAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DamAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "ConstructionStructureAttribute")
    public JAXBElement<DamAttributeType> createDamAttribute(DamAttributeType value) {
        return new JAXBElement<DamAttributeType>(_DamAttribute_QNAME, DamAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionDataQualityAttribute")
    public JAXBElement<ConstructionDataQualityAttributeType> createConstructionDataQualityAttribute(ConstructionDataQualityAttributeType value) {
        return new JAXBElement<ConstructionDataQualityAttributeType>(_ConstructionDataQualityAttribute_QNAME, ConstructionDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionRiskAssessmentAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionRiskAssessmentAttribute")
    public JAXBElement<ConstructionRiskAssessmentAttributeType> createConstructionRiskAssessmentAttribute(ConstructionRiskAssessmentAttributeType value) {
        return new JAXBElement<ConstructionRiskAssessmentAttributeType>(_ConstructionRiskAssessmentAttribute_QNAME, ConstructionRiskAssessmentAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BridgeStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BridgeStructureAttribute")
    public JAXBElement<BridgeStructureAttributeType> createBridgeStructureAttribute(BridgeStructureAttributeType value) {
        return new JAXBElement<BridgeStructureAttributeType>(_BridgeStructureAttribute_QNAME, BridgeStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BridgeFunctionalAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BridgeFunctionalAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BridgeFunctionalAttribute")
    public JAXBElement<BridgeFunctionalAttributeType> createBridgeFunctionalAttribute(BridgeFunctionalAttributeType value) {
        return new JAXBElement<BridgeFunctionalAttributeType>(_BridgeFunctionalAttribute_QNAME, BridgeFunctionalAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TunnelStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TunnelStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TunnelStructureAttribute")
    public JAXBElement<TunnelStructureAttributeType> createTunnelStructureAttribute(TunnelStructureAttributeType value) {
        return new JAXBElement<TunnelStructureAttributeType>(_TunnelStructureAttribute_QNAME, TunnelStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TunnelFunctionalAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TunnelFunctionalAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TunnelFunctionalAttribute")
    public JAXBElement<TunnelFunctionalAttributeType> createTunnelFunctionalAttribute(TunnelFunctionalAttributeType value) {
        return new JAXBElement<TunnelFunctionalAttributeType>(_TunnelFunctionalAttribute_QNAME, TunnelFunctionalAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacilityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacilityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FacilityAttribute")
    public JAXBElement<FacilityAttributeType> createFacilityAttribute(FacilityAttributeType value) {
        return new JAXBElement<FacilityAttributeType>(_FacilityAttribute_QNAME, FacilityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FacilityAttribute")
    public JAXBElement<PortAttributeType> createPortAttribute(PortAttributeType value) {
        return new JAXBElement<PortAttributeType>(_PortAttribute_QNAME, PortAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HarborFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "HarborFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<HarborFacilityType> createHarborFacility(HarborFacilityType value) {
        return new JAXBElement<HarborFacilityType>(_HarborFacility_QNAME, HarborFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortProtectiveFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortProtectiveFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortProtectiveFacilityType> createPortProtectiveFacility(PortProtectiveFacilityType value) {
        return new JAXBElement<PortProtectiveFacilityType>(_PortProtectiveFacility_QNAME, PortProtectiveFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MooringFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "MooringFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<MooringFacilityType> createMooringFacility(MooringFacilityType value) {
        return new JAXBElement<MooringFacilityType>(_MooringFacility_QNAME, MooringFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortTransportationFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortTransportationFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortTransportationFacilityType> createPortTransportationFacility(PortTransportationFacilityType value) {
        return new JAXBElement<PortTransportationFacilityType>(_PortTransportationFacility_QNAME, PortTransportationFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NavigationAssistanceFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "NavigationAssistanceFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<NavigationAssistanceFacilityType> createNavigationAssistanceFacility(NavigationAssistanceFacilityType value) {
        return new JAXBElement<NavigationAssistanceFacilityType>(_NavigationAssistanceFacility_QNAME, NavigationAssistanceFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargoHandlingFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CargoHandlingFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<CargoHandlingFacilityType> createCargoHandlingFacility(CargoHandlingFacilityType value) {
        return new JAXBElement<CargoHandlingFacilityType>(_CargoHandlingFacility_QNAME, CargoHandlingFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortPassengerFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortPassengerFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortPassengerFacilityType> createPortPassengerFacility(PortPassengerFacilityType value) {
        return new JAXBElement<PortPassengerFacilityType>(_PortPassengerFacility_QNAME, PortPassengerFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortStorageFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortStorageFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortStorageFacilityType> createPortStorageFacility(PortStorageFacilityType value) {
        return new JAXBElement<PortStorageFacilityType>(_PortStorageFacility_QNAME, PortStorageFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShipServiceFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ShipServiceFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<ShipServiceFacilityType> createShipServiceFacility(ShipServiceFacilityType value) {
        return new JAXBElement<ShipServiceFacilityType>(_ShipServiceFacility_QNAME, ShipServiceFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortWasteTreatmentFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortWasteTreatmentFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortWasteTreatmentFacilityType> createPortWasteTreatmentFacility(PortWasteTreatmentFacilityType value) {
        return new JAXBElement<PortWasteTreatmentFacilityType>(_PortWasteTreatmentFacility_QNAME, PortWasteTreatmentFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortEnvironmentalImprovementFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortEnvironmentalImprovementFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortEnvironmentalImprovementFacilityType> createPortEnvironmentalImprovementFacility(PortEnvironmentalImprovementFacilityType value) {
        return new JAXBElement<PortEnvironmentalImprovementFacilityType>(_PortEnvironmentalImprovementFacility_QNAME, PortEnvironmentalImprovementFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortPollutionControlFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortPollutionControlFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortPollutionControlFacilityType> createPortPollutionControlFacility(PortPollutionControlFacilityType value) {
        return new JAXBElement<PortPollutionControlFacilityType>(_PortPollutionControlFacility_QNAME, PortPollutionControlFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortWelfareFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortWelfareFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortWelfareFacilityType> createPortWelfareFacility(PortWelfareFacilityType value) {
        return new JAXBElement<PortWelfareFacilityType>(_PortWelfareFacility_QNAME, PortWelfareFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortManagementFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PortManagementFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<PortManagementFacilityType> createPortManagementFacility(PortManagementFacilityType value) {
        return new JAXBElement<PortManagementFacilityType>(_PortManagementFacility_QNAME, PortManagementFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CyberportMarinaAndPBSType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CyberportMarinaAndPBS", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "PortAttribute")
    public JAXBElement<CyberportMarinaAndPBSType> createCyberportMarinaAndPBS(CyberportMarinaAndPBSType value) {
        return new JAXBElement<CyberportMarinaAndPBSType>(_CyberportMarinaAndPBS_QNAME, CyberportMarinaAndPBSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FishingPortAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FishingPortAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FishingPortAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FacilityAttribute")
    public JAXBElement<FishingPortAttributeType> createFishingPortAttribute(FishingPortAttributeType value) {
        return new JAXBElement<FishingPortAttributeType>(_FishingPortAttribute_QNAME, FishingPortAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FishingPortFacilityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FishingPortFacilityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FishingPortFacility", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FishingPortAttribute")
    public JAXBElement<FishingPortFacilityType> createFishingPortFacility(FishingPortFacilityType value) {
        return new JAXBElement<FishingPortFacilityType>(_FishingPortFacility_QNAME, FishingPortFacilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FishingPortCapacityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FishingPortCapacityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FishingPortCapacity", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FishingPortAttribute")
    public JAXBElement<FishingPortCapacityType> createFishingPortCapacity(FishingPortCapacityType value) {
        return new JAXBElement<FishingPortCapacityType>(_FishingPortCapacity_QNAME, FishingPortCapacityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterwayType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Waterway", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "TransportationComplex")
    public JAXBElement<WaterwayType> createWaterway(WaterwayType value) {
        return new JAXBElement<WaterwayType>(_Waterway_QNAME, WaterwayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterwayDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterwayDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterwayDetailAttribute")
    public JAXBElement<WaterwayDetailAttributeType> createWaterwayDetailAttribute(WaterwayDetailAttributeType value) {
        return new JAXBElement<WaterwayDetailAttributeType>(_WaterwayDetailAttribute_QNAME, WaterwayDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AbstractConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "AbstractConstruction", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<AbstractConstructionType> createAbstractConstruction(AbstractConstructionType value) {
        return new JAXBElement<AbstractConstructionType>(_AbstractConstruction_QNAME, AbstractConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherConstructionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherConstructionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "OtherConstruction", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "AbstractConstruction")
    public JAXBElement<OtherConstructionType> createOtherConstruction(OtherConstructionType value) {
        return new JAXBElement<OtherConstructionType>(_OtherConstruction_QNAME, OtherConstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link _BoundarySurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link _BoundarySurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "_BoundarySurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<_BoundarySurfaceType> create_BoundarySurface(_BoundarySurfaceType value) {
        return new JAXBElement<_BoundarySurfaceType>(__BoundarySurface_QNAME, _BoundarySurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoofSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoofSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoofSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<RoofSurfaceType> createRoofSurface(RoofSurfaceType value) {
        return new JAXBElement<RoofSurfaceType>(_RoofSurface_QNAME, RoofSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WallSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WallSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WallSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<WallSurfaceType> createWallSurface(WallSurfaceType value) {
        return new JAXBElement<WallSurfaceType>(_WallSurface_QNAME, WallSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroundSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "GroundSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<GroundSurfaceType> createGroundSurface(GroundSurfaceType value) {
        return new JAXBElement<GroundSurfaceType>(_GroundSurface_QNAME, GroundSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OuterCeilingSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OuterCeilingSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "OuterCeilingSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<OuterCeilingSurfaceType> createOuterCeilingSurface(OuterCeilingSurfaceType value) {
        return new JAXBElement<OuterCeilingSurfaceType>(_OuterCeilingSurface_QNAME, OuterCeilingSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OuterFloorSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OuterFloorSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "OuterFloorSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<OuterFloorSurfaceType> createOuterFloorSurface(OuterFloorSurfaceType value) {
        return new JAXBElement<OuterFloorSurfaceType>(_OuterFloorSurface_QNAME, OuterFloorSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosureSurfaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClosureSurfaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ClosureSurface", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<ClosureSurfaceType> createClosureSurface(ClosureSurfaceType value) {
        return new JAXBElement<ClosureSurfaceType>(_ClosureSurface_QNAME, ClosureSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionInstallationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionInstallationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionInstallation", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<ConstructionInstallationType> createConstructionInstallation(ConstructionInstallationType value) {
        return new JAXBElement<ConstructionInstallationType>(_ConstructionInstallation_QNAME, ConstructionInstallationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElevationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Elevation")
    public JAXBElement<ElevationType> createElevation(ElevationType value) {
        return new JAXBElement<ElevationType>(_Elevation_QNAME, ElevationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HeightType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Height")
    public JAXBElement<HeightType> createHeight(HeightType value) {
        return new JAXBElement<HeightType>(_Height_QNAME, HeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstructionEventType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstructionEventType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ConstructionEvent")
    public JAXBElement<ConstructionEventType> createConstructionEvent(ConstructionEventType value) {
        return new JAXBElement<ConstructionEventType>(_ConstructionEvent_QNAME, ConstructionEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccupancyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OccupancyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Occupancy")
    public JAXBElement<OccupancyType> createOccupancy(OccupancyType value) {
        return new JAXBElement<OccupancyType>(_Occupancy_QNAME, OccupancyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndergroundBuildingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UndergroundBuildingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UndergroundBuilding", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_AbstractBuilding")
    public JAXBElement<UndergroundBuildingType> createUndergroundBuilding(UndergroundBuildingType value) {
        return new JAXBElement<UndergroundBuildingType>(_UndergroundBuilding_QNAME, UndergroundBuildingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportationDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TransportationDataQualityAttribute")
    public JAXBElement<TransportationDataQualityAttributeType> createTransportationDataQualityAttribute(TransportationDataQualityAttributeType value) {
        return new JAXBElement<TransportationDataQualityAttributeType>(_TransportationDataQualityAttribute_QNAME, TransportationDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailwayRouteAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RailwayRouteAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "railwayRouteAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRailway")
    public JAXBElement<RailwayRouteAttributePropertyType> createRailwayRouteAttributeProperty(RailwayRouteAttributePropertyType value) {
        return new JAXBElement<RailwayRouteAttributePropertyType>(_RailwayRouteAttributeProperty_QNAME, RailwayRouteAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailwayRouteAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RailwayRouteAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RailwayRouteAttribute")
    public JAXBElement<RailwayRouteAttributeType> createRailwayRouteAttribute(RailwayRouteAttributeType value) {
        return new JAXBElement<RailwayRouteAttributeType>(_RailwayRouteAttribute_QNAME, RailwayRouteAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailwayTrackAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RailwayTrackAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "railwayTrackAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTrafficArea")
    public JAXBElement<RailwayTrackAttributePropertyType> createRailwayTrackAttributeProperty(RailwayTrackAttributePropertyType value) {
        return new JAXBElement<RailwayTrackAttributePropertyType>(_RailwayTrackAttributeProperty_QNAME, RailwayTrackAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailwayTrackAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RailwayTrackAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RailwayTrackAttribute")
    public JAXBElement<RailwayTrackAttributeType> createRailwayTrackAttribute(RailwayTrackAttributeType value) {
        return new JAXBElement<RailwayTrackAttributeType>(_RailwayTrackAttribute_QNAME, RailwayTrackAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlPointType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ControlPoint")
    public JAXBElement<ControlPointType> createControlPoint(ControlPointType value) {
        return new JAXBElement<ControlPointType>(_ControlPoint_QNAME, ControlPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlPointTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlPointTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ControlPointType")
    public JAXBElement<ControlPointTypeType> createControlPointType(ControlPointTypeType value) {
        return new JAXBElement<ControlPointTypeType>(_ControlPointType_QNAME, ControlPointTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircularCurveTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CircularCurveTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CircularCurveType")
    public JAXBElement<CircularCurveTypeType> createCircularCurveType(CircularCurveTypeType value) {
        return new JAXBElement<CircularCurveTypeType>(_CircularCurveType_QNAME, CircularCurveTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionCurveTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitionCurveTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TransitionCurveType")
    public JAXBElement<TransitionCurveTypeType> createTransitionCurveType(TransitionCurveTypeType value) {
        return new JAXBElement<TransitionCurveTypeType>(_TransitionCurveType_QNAME, TransitionCurveTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCurveTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerticalCurveTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "VerticalCurveType")
    public JAXBElement<VerticalCurveTypeType> createVerticalCurveType(VerticalCurveTypeType value) {
        return new JAXBElement<VerticalCurveTypeType>(_VerticalCurveType_QNAME, VerticalCurveTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlopeTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SlopeTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "SlopeType")
    public JAXBElement<SlopeTypeType> createSlopeType(SlopeTypeType value) {
        return new JAXBElement<SlopeTypeType>(_SlopeType_QNAME, SlopeTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrackAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "trackAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTrack")
    public JAXBElement<TrackAttributePropertyType> createTrackAttributeProperty(TrackAttributePropertyType value) {
        return new JAXBElement<TrackAttributePropertyType>(_TrackAttributeProperty_QNAME, TrackAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrackAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TrackAttribute")
    public JAXBElement<TrackAttributeType> createTrackAttribute(TrackAttributeType value) {
        return new JAXBElement<TrackAttributeType>(_TrackAttribute_QNAME, TrackAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareUrbanPlanAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareUrbanPlanAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "squareUrbanPlanAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfSquare")
    public JAXBElement<SquareUrbanPlanAttributePropertyType> createSquareUrbanPlanAttributeProperty(SquareUrbanPlanAttributePropertyType value) {
        return new JAXBElement<SquareUrbanPlanAttributePropertyType>(_SquareUrbanPlanAttributeProperty_QNAME, SquareUrbanPlanAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareUrbanPlanAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SquareUrbanPlanAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "SquareUrbanPlanAttribute")
    public JAXBElement<SquareUrbanPlanAttributeType> createSquareUrbanPlanAttribute(SquareUrbanPlanAttributeType value) {
        return new JAXBElement<SquareUrbanPlanAttributeType>(_SquareUrbanPlanAttribute_QNAME, SquareUrbanPlanAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationSquareAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StationSquareAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "StationSquareAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "SquareUrbanPlanAttribute")
    public JAXBElement<StationSquareAttributeType> createStationSquareAttribute(StationSquareAttributeType value) {
        return new JAXBElement<StationSquareAttributeType>(_StationSquareAttribute_QNAME, StationSquareAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TerminalAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TerminalAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "SquareUrbanPlanAttribute")
    public JAXBElement<TerminalAttributeType> createTerminalAttribute(TerminalAttributeType value) {
        return new JAXBElement<TerminalAttributeType>(_TerminalAttribute_QNAME, TerminalAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityNetworkElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UtilityNetworkElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UtilityNetworkElement", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "CityFurniture")
    public JAXBElement<UtilityNetworkElementType> createUtilityNetworkElement(UtilityNetworkElementType value) {
        return new JAXBElement<UtilityNetworkElementType>(_UtilityNetworkElement_QNAME, UtilityNetworkElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityLinkType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UtilityLinkType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UtilityLink", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNetworkElement")
    public JAXBElement<UtilityLinkType> createUtilityLink(UtilityLinkType value) {
        return new JAXBElement<UtilityLinkType>(_UtilityLink_QNAME, UtilityLinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThematicShapeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThematicShapeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ThematicShape")
    public JAXBElement<ThematicShapeType> createThematicShape(ThematicShapeType value) {
        return new JAXBElement<ThematicShapeType>(_ThematicShape_QNAME, ThematicShapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LengthAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LengthAttribute")
    public JAXBElement<LengthAttributeType> createLengthAttribute(LengthAttributeType value) {
        return new JAXBElement<LengthAttributeType>(_LengthAttribute_QNAME, LengthAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityNodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UtilityNodeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UtilityNode", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNetworkElement")
    public JAXBElement<UtilityNodeType> createUtilityNode(UtilityNodeType value) {
        return new JAXBElement<UtilityNodeType>(_UtilityNode_QNAME, UtilityNodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppurtenanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppurtenanceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Appurtenance", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNode")
    public JAXBElement<AppurtenanceType> createAppurtenance(AppurtenanceType value) {
        return new JAXBElement<AppurtenanceType>(_Appurtenance_QNAME, AppurtenanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityNodeContainerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UtilityNodeContainerType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UtilityNodeContainer", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNetworkElement")
    public JAXBElement<UtilityNodeContainerType> createUtilityNodeContainer(UtilityNodeContainerType value) {
        return new JAXBElement<UtilityNodeContainerType>(_UtilityNodeContainer_QNAME, UtilityNodeContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManholeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManholeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Manhole", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNodeContainer")
    public JAXBElement<ManholeType> createManhole(ManholeType value) {
        return new JAXBElement<ManholeType>(_Manhole_QNAME, ManholeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandholeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HandholeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Handhole", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityNodeContainer")
    public JAXBElement<HandholeType> createHandhole(HandholeType value) {
        return new JAXBElement<HandholeType>(_Handhole_QNAME, HandholeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PipeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PipeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Pipe", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityLink")
    public JAXBElement<PipeType> createPipe(PipeType value) {
        return new JAXBElement<PipeType>(_Pipe_QNAME, PipeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SewerPipeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SewerPipeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "SewerPipe", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Pipe")
    public JAXBElement<SewerPipeType> createSewerPipe(SewerPipeType value) {
        return new JAXBElement<SewerPipeType>(_SewerPipe_QNAME, SewerPipeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermalPipeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ThermalPipeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ThermalPipe", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Pipe")
    public JAXBElement<ThermalPipeType> createThermalPipe(ThermalPipeType value) {
        return new JAXBElement<ThermalPipeType>(_ThermalPipe_QNAME, ThermalPipeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterPipeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterPipeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterPipe", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Pipe")
    public JAXBElement<WaterPipeType> createWaterPipe(WaterPipeType value) {
        return new JAXBElement<WaterPipeType>(_WaterPipe_QNAME, WaterPipeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OilGasChemicalsPipeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OilGasChemicalsPipeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "OilGasChemicalsPipe", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Pipe")
    public JAXBElement<OilGasChemicalsPipeType> createOilGasChemicalsPipe(OilGasChemicalsPipeType value) {
        return new JAXBElement<OilGasChemicalsPipeType>(_OilGasChemicalsPipe_QNAME, OilGasChemicalsPipeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuctType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DuctType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Duct", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityLink")
    public JAXBElement<DuctType> createDuct(DuctType value) {
        return new JAXBElement<DuctType>(_Duct_QNAME, DuctType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CableType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CableType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "Cable", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "UtilityLink")
    public JAXBElement<CableType> createCable(CableType value) {
        return new JAXBElement<CableType>(_Cable_QNAME, CableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricityCableType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricityCableType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ElectricityCable", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Cable")
    public JAXBElement<ElectricityCableType> createElectricityCable(ElectricityCableType value) {
        return new JAXBElement<ElectricityCableType>(_ElectricityCable_QNAME, ElectricityCableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelecommunicationsCableType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TelecommunicationsCableType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TelecommunicationsCable", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "Cable")
    public JAXBElement<TelecommunicationsCableType> createTelecommunicationsCable(TelecommunicationsCableType value) {
        return new JAXBElement<TelecommunicationsCableType>(_TelecommunicationsCable_QNAME, TelecommunicationsCableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffsetDepthType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OffsetDepthType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "OffsetDepth")
    public JAXBElement<OffsetDepthType> createOffsetDepth(OffsetDepthType value) {
        return new JAXBElement<OffsetDepthType>(_OffsetDepth_QNAME, OffsetDepthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceHistoryAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaintenanceHistoryAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "MaintenanceHistoryAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FacilityAttribute")
    public JAXBElement<MaintenanceHistoryAttributeType> createMaintenanceHistoryAttribute(MaintenanceHistoryAttributeType value) {
        return new JAXBElement<MaintenanceHistoryAttributeType>(_MaintenanceHistoryAttribute_QNAME, MaintenanceHistoryAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcBuildingAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<IfcAttributePropertyType> createIfcBuildingAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcBuildingAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcBuildingStoreyAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<IfcAttributePropertyType> createIfcBuildingStoreyAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcBuildingStoreyAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcLandUseAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<IfcAttributePropertyType> createIfcLandUseAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcLandUseAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcRoomAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoom")
    public JAXBElement<IfcAttributePropertyType> createIfcRoomAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcRoomAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcOpeningAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfOpening")
    public JAXBElement<IfcAttributePropertyType> createIfcOpeningAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcOpeningAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcBoundarySurfaceAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBoundarySurface")
    public JAXBElement<IfcAttributePropertyType> createIfcBoundarySurfaceAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcBoundarySurfaceAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcBuildingInstallationAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBuildingInstallation")
    public JAXBElement<IfcAttributePropertyType> createIfcBuildingInstallationAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcBuildingInstallationAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcIntBuildingInstallationAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfIntBuildingInstallation")
    public JAXBElement<IfcAttributePropertyType> createIfcIntBuildingInstallationAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcIntBuildingInstallationAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "ifcBuildingFurnitureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBuildingFurniture")
    public JAXBElement<IfcAttributePropertyType> createIfcBuildingFurnitureAttribute(IfcAttributePropertyType value) {
        return new JAXBElement<IfcAttributePropertyType>(_IfcBuildingFurnitureAttribute_QNAME, IfcAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "roomDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoom")
    public JAXBElement<RoomDataQualityAttributePropertyType> createRoomDataQualityAttributeProperty(RoomDataQualityAttributePropertyType value) {
        return new JAXBElement<RoomDataQualityAttributePropertyType>(_RoomDataQualityAttributeProperty_QNAME, RoomDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcAttribute")
    public JAXBElement<IfcAttributeType> createIfcAttribute(IfcAttributeType value) {
        return new JAXBElement<IfcAttributeType>(_IfcAttribute_QNAME, IfcAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcRoot", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcRootType> createIfcRoot(IfcRootType value) {
        return new JAXBElement<IfcRootType>(_IfcRoot_QNAME, IfcRootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcObjectDefinition", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcRoot")
    public JAXBElement<IfcObjectDefinitionType> createIfcObjectDefinition(IfcObjectDefinitionType value) {
        return new JAXBElement<IfcObjectDefinitionType>(_IfcObjectDefinition_QNAME, IfcObjectDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcObject", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcObjectDefinition")
    public JAXBElement<IfcObjectType> createIfcObject(IfcObjectType value) {
        return new JAXBElement<IfcObjectType>(_IfcObject_QNAME, IfcObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcProduct", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcObject")
    public JAXBElement<IfcProductType> createIfcProduct(IfcProductType value) {
        return new JAXBElement<IfcProductType>(_IfcProduct_QNAME, IfcProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcSpatialStructureElement", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcProduct")
    public JAXBElement<IfcSpatialStructureElementType> createIfcSpatialStructureElement(IfcSpatialStructureElementType value) {
        return new JAXBElement<IfcSpatialStructureElementType>(_IfcSpatialStructureElement_QNAME, IfcSpatialStructureElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcBuilding", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcSpatialStructureElement")
    public JAXBElement<IfcBuildingType> createIfcBuilding(IfcBuildingType value) {
        return new JAXBElement<IfcBuildingType>(_IfcBuilding_QNAME, IfcBuildingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetBuildingCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetBuildingCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetBuildingCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetBuildingCommonType> createIfcPsetBuildingCommon(IfcPsetBuildingCommonType value) {
        return new JAXBElement<IfcPsetBuildingCommonType>(_IfcPsetBuildingCommon_QNAME, IfcPsetBuildingCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcSite", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcSpatialStructureElement")
    public JAXBElement<IfcSiteType> createIfcSite(IfcSiteType value) {
        return new JAXBElement<IfcSiteType>(_IfcSite_QNAME, IfcSiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetSiteCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetSiteCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetSiteCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetSiteCommonType> createIfcPsetSiteCommon(IfcPsetSiteCommonType value) {
        return new JAXBElement<IfcPsetSiteCommonType>(_IfcPsetSiteCommon_QNAME, IfcPsetSiteCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcProject", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcObject")
    public JAXBElement<IfcProjectType> createIfcProject(IfcProjectType value) {
        return new JAXBElement<IfcProjectType>(_IfcProject_QNAME, IfcProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcGeometricRepresentationContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcGeometricRepresentationContextType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcGeometricRepresentationContext")
    public JAXBElement<IfcGeometricRepresentationContextType> createIfcGeometricRepresentationContext(IfcGeometricRepresentationContextType value) {
        return new JAXBElement<IfcGeometricRepresentationContextType>(_IfcGeometricRepresentationContext_QNAME, IfcGeometricRepresentationContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcUnit")
    public JAXBElement<IfcUnitType> createIfcUnit(IfcUnitType value) {
        return new JAXBElement<IfcUnitType>(_IfcUnit_QNAME, IfcUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcAxis2Placement3DType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcAxis2Placement3DType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcAxis2Placement3D")
    public JAXBElement<IfcAxis2Placement3DType> createIfcAxis2Placement3D(IfcAxis2Placement3DType value) {
        return new JAXBElement<IfcAxis2Placement3DType>(_IfcAxis2Placement3D_QNAME, IfcAxis2Placement3DType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcCoordinateReferenceSystem", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcCoordinateReferenceSystemType> createIfcCoordinateReferenceSystem(IfcCoordinateReferenceSystemType value) {
        return new JAXBElement<IfcCoordinateReferenceSystemType>(_IfcCoordinateReferenceSystem_QNAME, IfcCoordinateReferenceSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcProjectedCRS", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcCoordinateReferenceSystem")
    public JAXBElement<IfcProjectedCRSType> createIfcProjectedCRS(IfcProjectedCRSType value) {
        return new JAXBElement<IfcProjectedCRSType>(_IfcProjectedCRS_QNAME, IfcProjectedCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcMapConversionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcMapConversionType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcMapConversion", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcMapConversionType> createIfcMapConversion(IfcMapConversionType value) {
        return new JAXBElement<IfcMapConversionType>(_IfcMapConversion_QNAME, IfcMapConversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcSpace", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcSpatialStructureElement")
    public JAXBElement<IfcSpaceType> createIfcSpace(IfcSpaceType value) {
        return new JAXBElement<IfcSpaceType>(_IfcSpace_QNAME, IfcSpaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcClassificationReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcClassificationReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcClassificationReference", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcClassificationReferenceType> createIfcClassificationReference(IfcClassificationReferenceType value) {
        return new JAXBElement<IfcClassificationReferenceType>(_IfcClassificationReference_QNAME, IfcClassificationReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcClassificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcClassificationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcClassification")
    public JAXBElement<IfcClassificationType> createIfcClassification(IfcClassificationType value) {
        return new JAXBElement<IfcClassificationType>(_IfcClassification_QNAME, IfcClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetSpaceCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetSpaceCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetSpaceCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetSpaceCommonType> createIfcPsetSpaceCommon(IfcPsetSpaceCommonType value) {
        return new JAXBElement<IfcPsetSpaceCommonType>(_IfcPsetSpaceCommon_QNAME, IfcPsetSpaceCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcSpaceBaseQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcSpaceBaseQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcSpaceBaseQuantity", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcSpaceBaseQuantityType> createIfcSpaceBaseQuantity(IfcSpaceBaseQuantityType value) {
        return new JAXBElement<IfcSpaceBaseQuantityType>(_IfcSpaceBaseQuantity_QNAME, IfcSpaceBaseQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcElement", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcProduct")
    public JAXBElement<IfcElementType> createIfcElement(IfcElementType value) {
        return new JAXBElement<IfcElementType>(_IfcElement_QNAME, IfcElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcBuildingElement", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcElement")
    public JAXBElement<IfcBuildingElementType> createIfcBuildingElement(IfcBuildingElementType value) {
        return new JAXBElement<IfcBuildingElementType>(_IfcBuildingElement_QNAME, IfcBuildingElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcWall", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcBuildingElement")
    public JAXBElement<IfcWallType> createIfcWall(IfcWallType value) {
        return new JAXBElement<IfcWallType>(_IfcWall_QNAME, IfcWallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcWallStandardCase", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcWall")
    public JAXBElement<IfcWallStandardCaseType> createIfcWallStandardCase(IfcWallStandardCaseType value) {
        return new JAXBElement<IfcWallStandardCaseType>(_IfcWallStandardCase_QNAME, IfcWallStandardCaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcCurtainWall", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcBuildingElement")
    public JAXBElement<IfcCurtainWallType> createIfcCurtainWall(IfcCurtainWallType value) {
        return new JAXBElement<IfcCurtainWallType>(_IfcCurtainWall_QNAME, IfcCurtainWallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcRoof", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcBuildingElement")
    public JAXBElement<IfcRoofType> createIfcRoof(IfcRoofType value) {
        return new JAXBElement<IfcRoofType>(_IfcRoof_QNAME, IfcRoofType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcWindow", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcBuildingElement")
    public JAXBElement<IfcWindowType> createIfcWindow(IfcWindowType value) {
        return new JAXBElement<IfcWindowType>(_IfcWindow_QNAME, IfcWindowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcDoor", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcBuildingElement")
    public JAXBElement<IfcDoorType> createIfcDoor(IfcDoorType value) {
        return new JAXBElement<IfcDoorType>(_IfcDoor_QNAME, IfcDoorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcOpeningElement", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcElement")
    public JAXBElement<IfcOpeningElementType> createIfcOpeningElement(IfcOpeningElementType value) {
        return new JAXBElement<IfcOpeningElementType>(_IfcOpeningElement_QNAME, IfcOpeningElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetWindowCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetWindowCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetWindowCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetWindowCommonType> createIfcPsetWindowCommon(IfcPsetWindowCommonType value) {
        return new JAXBElement<IfcPsetWindowCommonType>(_IfcPsetWindowCommon_QNAME, IfcPsetWindowCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetDoorCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetDoorCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetDoorCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetDoorCommonType> createIfcPsetDoorCommon(IfcPsetDoorCommonType value) {
        return new JAXBElement<IfcPsetDoorCommonType>(_IfcPsetDoorCommon_QNAME, IfcPsetDoorCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcPsetOpeningElementCommonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcPsetOpeningElementCommonType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcPsetOpeningElementCommon", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcAttribute")
    public JAXBElement<IfcPsetOpeningElementCommonType> createIfcPsetOpeningElementCommon(IfcPsetOpeningElementCommonType value) {
        return new JAXBElement<IfcPsetOpeningElementCommonType>(_IfcPsetOpeningElementCommon_QNAME, IfcPsetOpeningElementCommonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcFurnishingElement", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcElement")
    public JAXBElement<IfcFurnishingElementType> createIfcFurnishingElement(IfcFurnishingElementType value) {
        return new JAXBElement<IfcFurnishingElementType>(_IfcFurnishingElement_QNAME, IfcFurnishingElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcBuildingStorey", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcSpatialStructureElement")
    public JAXBElement<IfcBuildingStoreyType> createIfcBuildingStorey(IfcBuildingStoreyType value) {
        return new JAXBElement<IfcBuildingStoreyType>(_IfcBuildingStorey_QNAME, IfcBuildingStoreyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcGroup", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcObject")
    public JAXBElement<IfcGroupType> createIfcGroup(IfcGroupType value) {
        return new JAXBElement<IfcGroupType>(_IfcGroup_QNAME, IfcGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IfcZone", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IfcGroup")
    public JAXBElement<IfcZoneType> createIfcZone(IfcZoneType value) {
        return new JAXBElement<IfcZoneType>(_IfcZone_QNAME, IfcZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorBuildingAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<IndoorAttributePropertyType> createIndoorBuildingAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorBuildingAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorBoundarySurfaceAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBoundarySurface")
    public JAXBElement<IndoorAttributePropertyType> createIndoorBoundarySurfaceAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorBoundarySurfaceAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorIntInstallationAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfIntBuildingInstallation")
    public JAXBElement<IndoorAttributePropertyType> createIndoorIntInstallationAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorIntInstallationAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorOpeningAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfOpening")
    public JAXBElement<IndoorAttributePropertyType> createIndoorOpeningAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorOpeningAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorFutnitureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfBuildingFurniture")
    public JAXBElement<IndoorAttributePropertyType> createIndoorFutnitureAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorFutnitureAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorRoomAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoom")
    public JAXBElement<IndoorAttributePropertyType> createIndoorRoomAttribute(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorRoomAttribute_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "indoorStoreyAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<IndoorAttributePropertyType> createIndoorStoreyAttributeProperty(IndoorAttributePropertyType value) {
        return new JAXBElement<IndoorAttributePropertyType>(_IndoorStoreyAttributeProperty_QNAME, IndoorAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorAttribute")
    public JAXBElement<IndoorAttributeType> createIndoorAttribute(IndoorAttributeType value) {
        return new JAXBElement<IndoorAttributeType>(_IndoorAttribute_QNAME, IndoorAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorFurnishingAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorFurnishingAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorFurnishingAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorFurnishingAttributeType> createIndoorFurnishingAttribute(IndoorFurnishingAttributeType value) {
        return new JAXBElement<IndoorFurnishingAttributeType>(_IndoorFurnishingAttribute_QNAME, IndoorFurnishingAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorZoneAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorZoneAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorZoneAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorZoneAttributeType> createIndoorZoneAttribute(IndoorZoneAttributeType value) {
        return new JAXBElement<IndoorZoneAttributeType>(_IndoorZoneAttribute_QNAME, IndoorZoneAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorPublicTagAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorPublicTagAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorPublicTagAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorPublicTagAttributeType> createIndoorPublicTagAttribute(IndoorPublicTagAttributeType value) {
        return new JAXBElement<IndoorPublicTagAttributeType>(_IndoorPublicTagAttribute_QNAME, IndoorPublicTagAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorSpaceAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorSpaceAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorSpaceAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorSpaceAttributeType> createIndoorSpaceAttribute(IndoorSpaceAttributeType value) {
        return new JAXBElement<IndoorSpaceAttributeType>(_IndoorSpaceAttribute_QNAME, IndoorSpaceAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorFacilityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorFacilityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorFacilityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorFacilityAttributeType> createIndoorFacilityAttribute(IndoorFacilityAttributeType value) {
        return new JAXBElement<IndoorFacilityAttributeType>(_IndoorFacilityAttribute_QNAME, IndoorFacilityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorStoreyAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorStoreyAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorStoreyAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorStoreyAttributeType> createIndoorStoreyAttribute(IndoorStoreyAttributeType value) {
        return new JAXBElement<IndoorStoreyAttributeType>(_IndoorStoreyAttribute_QNAME, IndoorStoreyAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorTacatileTileAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorTacatileTileAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorTacatileTileAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorTacatileTileAttributeType> createIndoorTacatileTileAttribute(IndoorTacatileTileAttributeType value) {
        return new JAXBElement<IndoorTacatileTileAttributeType>(_IndoorTacatileTileAttribute_QNAME, IndoorTacatileTileAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndoorUserDefinedAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndoorUserDefinedAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "IndoorUserDefinedAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "IndoorAttribute")
    public JAXBElement<IndoorUserDefinedAttributeType> createIndoorUserDefinedAttribute(IndoorUserDefinedAttributeType value) {
        return new JAXBElement<IndoorUserDefinedAttributeType>(_IndoorUserDefinedAttribute_QNAME, IndoorUserDefinedAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedValueType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDefinedValueType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "UserDefinedValue")
    public JAXBElement<UserDefinedValueType> createUserDefinedValue(UserDefinedValueType value) {
        return new JAXBElement<UserDefinedValueType>(_UserDefinedValue_QNAME, UserDefinedValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoomAttribute")
    public JAXBElement<RoomAttributeType> createRoomAttribute(RoomAttributeType value) {
        return new JAXBElement<RoomAttributeType>(_RoomAttribute_QNAME, RoomAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoomDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "RoomAttribute")
    public JAXBElement<RoomDataQualityAttributeType> createRoomDataQualityAttribute(RoomDataQualityAttributeType value) {
        return new JAXBElement<RoomDataQualityAttributeType>(_RoomDataQualityAttribute_QNAME, RoomDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DmAttribute")
    public JAXBElement<DmAttributeType> createDmAttribute(DmAttributeType value) {
        return new JAXBElement<DmAttributeType>(_DmAttribute_QNAME, DmAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmElementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmElementType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DmElement")
    public JAXBElement<DmElementType> createDmElement(DmElementType value) {
        return new JAXBElement<DmElementType>(_DmElement_QNAME, DmElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmGeometricAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmGeometricAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DmGeometricAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "DmAttribute")
    public JAXBElement<DmGeometricAttributeType> createDmGeometricAttribute(DmGeometricAttributeType value) {
        return new JAXBElement<DmGeometricAttributeType>(_DmGeometricAttribute_QNAME, DmGeometricAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmAnnotationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DmAnnotationType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DmAnnotation", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "DmAttribute")
    public JAXBElement<DmAnnotationType> createDmAnnotation(DmAnnotationType value) {
        return new JAXBElement<DmAnnotationType>(_DmAnnotation_QNAME, DmAnnotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LandUseDataQualityAttribute")
    public JAXBElement<LandUseDataQualityAttributeType> createLandUseDataQualityAttribute(LandUseDataQualityAttributeType value) {
        return new JAXBElement<LandUseDataQualityAttributeType>(_LandUseDataQualityAttribute_QNAME, LandUseDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "luseDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<LandUseDataQualityAttributePropertyType> createLuseDataQualityAttribute(LandUseDataQualityAttributePropertyType value) {
        return new JAXBElement<LandUseDataQualityAttributePropertyType>(_LuseDataQualityAttribute_QNAME, LandUseDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicLandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublicLandType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "PublicLand", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "LandUse")
    public JAXBElement<PublicLandType> createPublicLand(PublicLandType value) {
        return new JAXBElement<PublicLandType>(_PublicLand_QNAME, PublicLandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadTypePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadTypePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "roadStatus", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<RoadTypePropertyType> createRoadStatus(RoadTypePropertyType value) {
        return new JAXBElement<RoadTypePropertyType>(_RoadStatus_QNAME, RoadTypePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadTypeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadTypeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoadType")
    public JAXBElement<RoadTypeType> createRoadType(RoadTypeType value) {
        return new JAXBElement<RoadTypeType>(_RoadType_QNAME, RoadTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "buildingIDAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingIDAttributePropertyType> createBuildingIDAttributeProperty(BuildingIDAttributePropertyType value) {
        return new JAXBElement<BuildingIDAttributePropertyType>(_BuildingIDAttributeProperty_QNAME, BuildingIDAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "buildingDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDetailAttributePropertyType> createBuildingDetailAttributeProperty(BuildingDetailAttributePropertyType value) {
        return new JAXBElement<BuildingDetailAttributePropertyType>(_BuildingDetailAttributeProperty_QNAME, BuildingDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "largeCustomerFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<LargeCustomerFacilityAttributePropertyType> createLargeCustomerFacilityAttributeProperty(LargeCustomerFacilityAttributePropertyType value) {
        return new JAXBElement<LargeCustomerFacilityAttributePropertyType>(_LargeCustomerFacilityAttributeProperty_QNAME, LargeCustomerFacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "buildingDisasterRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDisasterRiskAttributePropertyType> createBuildingDisasterRiskAttributeProperty(BuildingDisasterRiskAttributePropertyType value) {
        return new JAXBElement<BuildingDisasterRiskAttributePropertyType>(_BuildingDisasterRiskAttributeProperty_QNAME, BuildingDisasterRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "keyValuePairAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<KeyValuePairAttributePropertyType> createKeyValuePairAttributeProperty(KeyValuePairAttributePropertyType value) {
        return new JAXBElement<KeyValuePairAttributePropertyType>(_KeyValuePairAttributeProperty_QNAME, KeyValuePairAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "buildingDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDataQualityAttributePropertyType> createBuildingDataQualityAttributeProperty(BuildingDataQualityAttributePropertyType value) {
        return new JAXBElement<BuildingDataQualityAttributePropertyType>(_BuildingDataQualityAttributeProperty_QNAME, BuildingDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingAttribute")
    public JAXBElement<BuildingAttributeType> createBuildingAttribute(BuildingAttributeType value) {
        return new JAXBElement<BuildingAttributeType>(_BuildingAttribute_QNAME, BuildingAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingIDAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingIDAttributeType> createBuildingIDAttribute(BuildingIDAttributeType value) {
        return new JAXBElement<BuildingIDAttributeType>(_BuildingIDAttribute_QNAME, BuildingIDAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDetailAttributeType> createBuildingDetailAttribute(BuildingDetailAttributeType value) {
        return new JAXBElement<BuildingDetailAttributeType>(_BuildingDetailAttribute_QNAME, BuildingDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LargeCustomerFacilityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<LargeCustomerFacilityAttributeType> createLargeCustomerFacilityAttribute(LargeCustomerFacilityAttributeType value) {
        return new JAXBElement<LargeCustomerFacilityAttributeType>(_LargeCustomerFacilityAttribute_QNAME, LargeCustomerFacilityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingDisasterRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDisasterRiskAttributeType> createBuildingDisasterRiskAttribute(BuildingDisasterRiskAttributeType value) {
        return new JAXBElement<BuildingDisasterRiskAttributeType>(_BuildingDisasterRiskAttribute_QNAME, BuildingDisasterRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingDisasterRiskAttribute")
    public JAXBElement<BuildingFloodingRiskAttributeType> createBuildingFloodingRiskAttribute(BuildingFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingFloodingRiskAttributeType>(_BuildingFloodingRiskAttribute_QNAME, BuildingFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingRiverFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingRiverFloodingRiskAttributeType> createBuildingRiverFloodingRiskAttribute(BuildingRiverFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingRiverFloodingRiskAttributeType>(_BuildingRiverFloodingRiskAttribute_QNAME, BuildingRiverFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingTsunamiRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingTsunamiRiskAttributeType> createBuildingTsunamiRiskAttribute(BuildingTsunamiRiskAttributeType value) {
        return new JAXBElement<BuildingTsunamiRiskAttributeType>(_BuildingTsunamiRiskAttribute_QNAME, BuildingTsunamiRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingInlandFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingInlandFloodingRiskAttributeType> createBuildingInlandFloodingRiskAttribute(BuildingInlandFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingInlandFloodingRiskAttributeType>(_BuildingInlandFloodingRiskAttribute_QNAME, BuildingInlandFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingHighTideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingHighTideRiskAttributeType> createBuildingHighTideRiskAttribute(BuildingHighTideRiskAttributeType value) {
        return new JAXBElement<BuildingHighTideRiskAttributeType>(_BuildingHighTideRiskAttribute_QNAME, BuildingHighTideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingLandSlideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingDisasterRiskAttribute")
    public JAXBElement<BuildingLandSlideRiskAttributeType> createBuildingLandSlideRiskAttribute(BuildingLandSlideRiskAttributeType value) {
        return new JAXBElement<BuildingLandSlideRiskAttributeType>(_BuildingLandSlideRiskAttribute_QNAME, BuildingLandSlideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "KeyValuePairAttribute")
    public JAXBElement<KeyValuePairAttributeType> createKeyValuePairAttribute(KeyValuePairAttributeType value) {
        return new JAXBElement<KeyValuePairAttributeType>(_KeyValuePairAttribute_QNAME, KeyValuePairAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "BuildingDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDataQualityAttributeType> createBuildingDataQualityAttribute(BuildingDataQualityAttributeType value) {
        return new JAXBElement<BuildingDataQualityAttributeType>(_BuildingDataQualityAttribute_QNAME, BuildingDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "landUseDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<LandUseDetailAttributePropertyType> createLandUseDetailAttributeProperty(LandUseDetailAttributePropertyType value) {
        return new JAXBElement<LandUseDetailAttributePropertyType>(_LandUseDetailAttributeProperty_QNAME, LandUseDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LandUseAttribute")
    public JAXBElement<LandUseAttributeType> createLandUseAttribute(LandUseAttributeType value) {
        return new JAXBElement<LandUseAttributeType>(_LandUseAttribute_QNAME, LandUseAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LandUseDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "LandUseAttribute")
    public JAXBElement<LandUseDetailAttributeType> createLandUseDetailAttribute(LandUseDetailAttributeType value) {
        return new JAXBElement<LandUseDetailAttributeType>(_LandUseDetailAttribute_QNAME, LandUseDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "trafficVolumeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<TrafficVolumeAttributePropertyType> createTrafficVolumeAttributeProperty(TrafficVolumeAttributePropertyType value) {
        return new JAXBElement<TrafficVolumeAttributePropertyType>(_TrafficVolumeAttributeProperty_QNAME, TrafficVolumeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "roadStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<RoadStructureAttributePropertyType> createRoadStructureAttributeProperty(RoadStructureAttributePropertyType value) {
        return new JAXBElement<RoadStructureAttributePropertyType>(_RoadStructureAttributeProperty_QNAME, RoadStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "trafficAreaStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTrafficArea")
    public JAXBElement<TrafficAreaStructureAttributePropertyType> createTrafficAreaStructureAttributeProperty(TrafficAreaStructureAttributePropertyType value) {
        return new JAXBElement<TrafficAreaStructureAttributePropertyType>(_TrafficAreaStructureAttributeProperty_QNAME, TrafficAreaStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoadAttribute")
    public JAXBElement<RoadAttributeType> createRoadAttribute(RoadAttributeType value) {
        return new JAXBElement<RoadAttributeType>(_RoadAttribute_QNAME, RoadAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TrafficVolumeAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "RoadAttribute")
    public JAXBElement<TrafficVolumeAttributeType> createTrafficVolumeAttribute(TrafficVolumeAttributeType value) {
        return new JAXBElement<TrafficVolumeAttributeType>(_TrafficVolumeAttribute_QNAME, TrafficVolumeAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RoadStructureAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "RoadAttribute")
    public JAXBElement<RoadStructureAttributeType> createRoadStructureAttribute(RoadStructureAttributeType value) {
        return new JAXBElement<RoadStructureAttributeType>(_RoadStructureAttribute_QNAME, RoadStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TrafficAreaAttribute")
    public JAXBElement<TrafficAreaAttributeType> createTrafficAreaAttribute(TrafficAreaAttributeType value) {
        return new JAXBElement<TrafficAreaAttributeType>(_TrafficAreaAttribute_QNAME, TrafficAreaAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TrafficAreaStructureAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "TrafficAreaAttribute")
    public JAXBElement<TrafficAreaStructureAttributeType> createTrafficAreaStructureAttribute(TrafficAreaStructureAttributeType value) {
        return new JAXBElement<TrafficAreaStructureAttributeType>(_TrafficAreaStructureAttribute_QNAME, TrafficAreaStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "cityFurnitureDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<CityFurnitureDetailAttributePropertyType> createCityFurnitureDetailAttributeProperty(CityFurnitureDetailAttributePropertyType value) {
        return new JAXBElement<CityFurnitureDetailAttributePropertyType>(_CityFurnitureDetailAttributeProperty_QNAME, CityFurnitureDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "cityFurnitureDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<CityFurnitureDataQualityAttributePropertyType> createCityFurnitureDataQualityAttributeProperty(CityFurnitureDataQualityAttributePropertyType value) {
        return new JAXBElement<CityFurnitureDataQualityAttributePropertyType>(_CityFurnitureDataQualityAttributeProperty_QNAME, CityFurnitureDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureAttributeType> createCityFurnitureAttribute(CityFurnitureAttributeType value) {
        return new JAXBElement<CityFurnitureAttributeType>(_CityFurnitureAttribute_QNAME, CityFurnitureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CityFurnitureDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureDetailAttributeType> createCityFurnitureDetailAttribute(CityFurnitureDetailAttributeType value) {
        return new JAXBElement<CityFurnitureDetailAttributeType>(_CityFurnitureDetailAttribute_QNAME, CityFurnitureDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "CityFurnitureDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureDataQualityAttributeType> createCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttributeType value) {
        return new JAXBElement<CityFurnitureDataQualityAttributeType>(_CityFurnitureDataQualityAttribute_QNAME, CityFurnitureDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "vegetationDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<VegetationDataQualityAttributePropertyType> createVegetationDataQualityAttributeProperty(VegetationDataQualityAttributePropertyType value) {
        return new JAXBElement<VegetationDataQualityAttributePropertyType>(_VegetationDataQualityAttributeProperty_QNAME, VegetationDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "VegetationAttribute")
    public JAXBElement<VegetationAttributeType> createVegetationAttribute(VegetationAttributeType value) {
        return new JAXBElement<VegetationAttributeType>(_VegetationAttribute_QNAME, VegetationAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "VegetationDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "VegetationAttribute")
    public JAXBElement<VegetationDataQualityAttributeType> createVegetationDataQualityAttribute(VegetationDataQualityAttributeType value) {
        return new JAXBElement<VegetationDataQualityAttributeType>(_VegetationDataQualityAttribute_QNAME, VegetationDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "floodingRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<WaterBodyFloodingRiskAttributePropertyType> createFloodingRiskAttributeProperty(WaterBodyFloodingRiskAttributePropertyType value) {
        return new JAXBElement<WaterBodyFloodingRiskAttributePropertyType>(_FloodingRiskAttributeProperty_QNAME, WaterBodyFloodingRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyAttribute")
    public JAXBElement<WaterBodyAttributeType> createWaterBodyAttribute(WaterBodyAttributeType value) {
        return new JAXBElement<WaterBodyAttributeType>(_WaterBodyAttribute_QNAME, WaterBodyAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "WaterBodyAttribute")
    public JAXBElement<WaterBodyFloodingRiskAttributeType> createWaterBodyFloodingRiskAttribute(WaterBodyFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyFloodingRiskAttributeType>(_WaterBodyFloodingRiskAttribute_QNAME, WaterBodyFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyRiverFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyRiverFloodingRiskAttributeType> createWaterBodyRiverFloodingRiskAttribute(WaterBodyRiverFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyRiverFloodingRiskAttributeType>(_WaterBodyRiverFloodingRiskAttribute_QNAME, WaterBodyRiverFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyTsunamiRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyTsunamiRiskAttributeType> createWaterBodyTsunamiRiskAttribute(WaterBodyTsunamiRiskAttributeType value) {
        return new JAXBElement<WaterBodyTsunamiRiskAttributeType>(_WaterBodyTsunamiRiskAttribute_QNAME, WaterBodyTsunamiRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyHighTideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyHighTideRiskAttributeType> createWaterBodyHighTideRiskAttribute(WaterBodyHighTideRiskAttributeType value) {
        return new JAXBElement<WaterBodyHighTideRiskAttributeType>(_WaterBodyHighTideRiskAttribute_QNAME, WaterBodyHighTideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyInlandFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyInlandFloodingRiskAttributeType> createWaterBodyInlandFloodingRiskAttribute(WaterBodyInlandFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyInlandFloodingRiskAttributeType>(_WaterBodyInlandFloodingRiskAttribute_QNAME, WaterBodyInlandFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisasterRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "DisasterRiskAttribute")
    public JAXBElement<DisasterRiskAttributeType> createDisasterRiskAttribute(DisasterRiskAttributeType value) {
        return new JAXBElement<DisasterRiskAttributeType>(_DisasterRiskAttribute_QNAME, DisasterRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "FloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "DisasterRiskAttribute")
    public JAXBElement<FloodingRiskAttributeType> createFloodingRiskAttribute(FloodingRiskAttributeType value) {
        return new JAXBElement<FloodingRiskAttributeType>(_FloodingRiskAttribute_QNAME, FloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiverFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RiverFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "RiverFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FloodingRiskAttribute")
    public JAXBElement<RiverFloodingRiskAttributeType> createRiverFloodingRiskAttribute(RiverFloodingRiskAttributeType value) {
        return new JAXBElement<RiverFloodingRiskAttributeType>(_RiverFloodingRiskAttribute_QNAME, RiverFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TsunamiRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TsunamiRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "TsunamiRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FloodingRiskAttribute")
    public JAXBElement<TsunamiRiskAttributeType> createTsunamiRiskAttribute(TsunamiRiskAttributeType value) {
        return new JAXBElement<TsunamiRiskAttributeType>(_TsunamiRiskAttribute_QNAME, TsunamiRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlandFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InlandFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "InlandFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FloodingRiskAttribute")
    public JAXBElement<InlandFloodingRiskAttributeType> createInlandFloodingRiskAttribute(InlandFloodingRiskAttributeType value) {
        return new JAXBElement<InlandFloodingRiskAttributeType>(_InlandFloodingRiskAttribute_QNAME, InlandFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighTideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HighTideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "HighTideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "FloodingRiskAttribute")
    public JAXBElement<HighTideRiskAttributeType> createHighTideRiskAttribute(HighTideRiskAttributeType value) {
        return new JAXBElement<HighTideRiskAttributeType>(_HighTideRiskAttribute_QNAME, HighTideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandSlideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandSlideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "LandSlideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/3.0", substitutionHeadName = "DisasterRiskAttribute")
    public JAXBElement<LandSlideRiskAttributeType> createLandSlideRiskAttribute(LandSlideRiskAttributeType value) {
        return new JAXBElement<LandSlideRiskAttributeType>(_LandSlideRiskAttribute_QNAME, LandSlideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "fiscalYearOfPublication", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<XMLGregorianCalendar> createFiscalYearOfPublication(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FiscalYearOfPublication_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "language", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<CodeType> createLanguage(CodeType value) {
        return new JAXBElement<CodeType>(_Language_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "waterBodyDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<WaterBodyDetailAttributePropertyType> createWaterBodyDetailAttributeProperty(WaterBodyDetailAttributePropertyType value) {
        return new JAXBElement<WaterBodyDetailAttributePropertyType>(_WaterBodyDetailAttributeProperty_QNAME, WaterBodyDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/3.0", name = "WaterBodyDetailAttribute")
    public JAXBElement<WaterBodyDetailAttributeType> createWaterBodyDetailAttribute(WaterBodyDetailAttributeType value) {
        return new JAXBElement<WaterBodyDetailAttributeType>(_WaterBodyDetailAttribute_QNAME, WaterBodyDetailAttributeType.class, null, value);
    }

}
