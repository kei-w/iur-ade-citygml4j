/*
 * iur-ade-citygml4j - i-Urban Revitalization ADE module for citygml4j
 * https://github.com/citygml4j/iur-ade-citygml4j
 *
 * iur-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Virtual City Systems
 * https://vc.systems/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.iur.bind.uro;

import jp.geospatial.iur._3_0.uro.*;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.uro.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.util.mapper.TypeMapper;

import java.math.BigInteger;
import java.time.LocalDate;
import javax.xml.bind.JAXBElement;

public class UrbanObjectMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public UrbanObjectMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(ConstructionBaseAttribute.class, this::createConstructionBaseAttribute)
                    .with(FacilityIdAttribute.class, this::createFacilityIdAttribute)
                    .with(RiverFacilityIdAttribute.class, this::createRiverFacilityIdAttribute)
                    .with(FacilityTypeAttribute.class, this::createFacilityTypeAttribute)
                    .with(HarborFacility.class, this::createHarborFacility)
                    .with(PortProtectiveFacility.class, this::createPortProtectiveFacility)
                    .with(MooringFacility.class, this::createMooringFacility)
                    .with(PortTransportationFacility.class, this::createPortTransportationFacility)
                    .with(NavigationAssistanceFacility.class, this::createNavigationAssistanceFacility)
                    .with(CargoHandlingFacility.class, this::createCargoHandlingFacility)
                    .with(PortPassengerFacility.class, this::createPortPassengerFacility)
                    .with(PortStorageFacility.class, this::createPortStorageFacility)
                    .with(ShipServiceFacility.class, this::createShipServiceFacility)
                    .with(PortWasteTreatmentFacility.class, this::createPortWasteTreatmentFacility)
                    .with(PortEnvironmentalImprovementFacility.class, this::createPortEnvironmentalImprovementFacility)
                    .with(PortPollutionControlFacility.class, this::createPortPollutionControlFacility)
                    .with(PortWelfareFacility.class, this::createPortWelfareFacility)
                    .with(PortManagementFacility.class, this::createPortManagementFacility)
                    .with(CyberportMarinaAndPBS.class, this::createCyberportMarinaAndPBS)
                    .with(FishingPortFacility.class, this::createFishingPortFacility)
                    .with(FishingPortCapacity.class, this::createFishingPortCapacity)
                    .with(MaintenanceHistoryAttribute.class, this::createMaintenanceHistoryAttribute)
                    .with(BridgeStructureAttribute.class, this::createBridgeStructureAttribute)
                    .with(BridgeFunctionalAttribute.class, this::createBridgeFunctionalAttribute)
                    .with(ConstructionRiskAssessmentAttribute.class, this::createConstructionRiskAssessmentAttribute)
                    .with(RiverFloodingRiskAttribute.class, this::createRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttribute.class, this::createTsunamiRiskAttribute)
                    .with(InlandFloodingRiskAttribute.class, this::createInlandFloodingRiskAttribute)
                    .with(HighTideRiskAttribute.class, this::createHighTideRiskAttribute)
                    .with(LandSlideRiskAttribute.class, this::createLandSlideRiskAttribute)
                    .with(DmGeometricAttribute.class, this::createDmGeometricAttribute)
                    .with(DmAnnotation.class, this::createDmAnnotation)
                    .with(DmElement.class, this::createDmElement)
                    .with(ConstructionDataQualityAttribute.class, this::createConstructionDataQualityAttribute)
                    .with(TransportationDataQualityAttribute.class, this::createTransportationDataQualityAttribute)
                    .with(TunnelStructureAttribute.class, this::createTunnelStructureAttribute)
                    .with(TunnelFunctionalAttribute.class, this::createTunnelFunctionalAttribute)
                    .with(RailwayRouteAttribute.class, this::createRailwayRouteAttribute)
                    .with(RailwayTrackAttribute.class, this::createRailwayTrackAttribute)
                    .with(ControlPoint.class, this::createControlPoint)
                    .with(TrackAttribute.class, this::createTrackAttribute)
                    .with(SquareUrbanPlanAttribute.class, this::createSquareUrbanPlanAttribute)
                    .with(StationSquareAttribute.class, this::createStationSquareAttribute)
                    .with(TerminalAttribute.class, this::createTerminalAttribute)
                    .with(IfcBuilding.class, this::createIfcBuilding)
                    .with(IfcSite.class, this::createIfcSite)
                    .with(IfcSpace.class, this::createIfcSpace)
                    .with(IfcBuildingStorey.class, this::createIfcBuildingStorey)
                    .with(IfcBuildingElement.class, this::createIfcBuildingElement)
                    .with(IfcWall.class, this::createIfcWall)
                    .with(IfcWallStandardCase.class, this::createIfcWallStandardCase)
                    .with(IfcCurtainWall.class, this::createIfcCurtainWall)
                    .with(IfcRoof.class, this::createIfcRoof)
                    .with(IfcWindow.class, this::createIfcWindow)
                    .with(IfcDoor.class, this::createIfcDoor)
                    .with(IfcOpeningElement.class, this::createIfcOpeningElement)
                    .with(IfcFurnishingElement.class, this::createIfcFurnishingElement)
                    .with(IfcProject.class, this::createIfcProject)
                    .with(IfcGeometricRepresentationContext.class, this::createIfcGeometricRepresentationContext)
                    .with(IfcAxis2Placement3D.class, this::createIfcAxis2Placement3D)
                    .with(IfcUnit.class, this::createIfcUnit)
                    .with(IfcGroup.class, this::createIfcGroup)
                    .with(IfcZone.class, this::createIfcZone)
                    .with(IfcPsetBuildingCommon.class, this::createIfcPsetBuildingCommon)
                    .with(IfcPsetSiteCommon.class, this::createIfcPsetSiteCommon)
                    .with(IfcCoordinateReferenceSystem.class, this::createIfcCoordinateReferenceSystem)
                    .with(IfcProjectedCRS.class, this::createIfcProjectedCRS)
                    .with(IfcMapConversion.class, this::createIfcMapConversion)
                    .with(IfcClassificationReference.class, this::createIfcClassificationReference)
                    .with(IfcClassification.class, this::createIfcClassification)
                    .with(IfcPsetSpaceCommon.class, this::createIfcPsetSpaceCommon)
                    .with(IfcSpaceBaseQuantity.class, this::createIfcSpaceBaseQuantity)
                    .with(IfcPsetWindowCommon.class, this::createIfcPsetWindowCommon)
                    .with(IfcPsetDoorCommon.class, this::createIfcPsetDoorCommon)
                    .with(IfcPsetOpeningElementCommon.class, this::createIfcPsetOpeningElementCommon)
                    .with(RoomDataQualityAttribute.class, this::createRoomDataQualityAttribute)
                    .with(IndoorFurnishingAttribute.class, this::createIndoorFurnishingAttribute)
                    .with(IndoorZoneAttribute.class, this::createIndoorZoneAttribute)
                    .with(IndoorPublicTagAttribute.class, this::createIndoorPublicTagAttribute)
                    .with(IndoorSpaceAttribute.class, this::createIndoorSpaceAttribute)
                    .with(IndoorFacilityAttribute.class, this::createIndoorFacilityAttribute)
                    .with(IndoorStoreyAttribute.class, this::createIndoorStoreyAttribute)
                    .with(IndoorTacatileTileAttribute.class, this::createIndoorTacatileTileAttribute)
                    .with(IndoorUserDefinedAttribute.class, this::createIndoorUserDefinedAttribute)
                    .with(UserDefinedValue.class, this::createUserDefinedValue)
                    .with(LandUseDataQualityAttribute.class, this::createLandUseDataQualityAttribute)
                    .with(RoadType.class, this::createRoadType)
                    .with(BuildingIDAttribute.class, this::createBuildingIDAttribute)
                    .with(BuildingDetailAttribute.class, this::createBuildingDetailAttribute)
                    .with(LargeCustomerFacilityAttribute.class, this::createLargeCustomerFacilityAttribute)
                    .with(BuildingRiverFloodingRiskAttribute.class, this::createBuildingRiverFloodingRiskAttribute)
                    .with(BuildingTsunamiRiskAttribute.class, this::createBuildingTsunamiRiskAttribute)
                    .with(BuildingInlandFloodingRiskAttribute.class, this::createBuildingInlandFloodingRiskAttribute)
                    .with(BuildingHighTideRiskAttribute.class, this::createBuildingHighTideRiskAttribute)
                    .with(BuildingLandSlideRiskAttribute.class, this::createBuildingLandSlideRiskAttribute)
                    .with(KeyValuePairAttribute.class, this::createKeyValuePairAttribute)
                    .with(BuildingDataQualityAttribute.class, this::createBuildingDataQualityAttribute)
                    .with(LandUseDetailAttribute.class, this::createLandUseDetailAttribute)
                    .with(TrafficVolumeAttribute.class, this::createTrafficVolumeAttribute)
                    .with(RoadStructureAttribute.class, this::createRoadStructureAttribute)
                    .with(TrafficAreaStructureAttribute.class, this::createTrafficAreaStructureAttribute)
                    .with(CityFurnitureDetailAttribute.class, this::createCityFurnitureDetailAttribute)
                    .with(CityFurnitureDataQualityAttribute.class, this::createCityFurnitureDataQualityAttribute)
                    .with(VegetationDataQualityAttribute.class, this::createVegetationDataQualityAttribute)
                    .with(WaterBodyRiverFloodingRiskAttribute.class, this::createWaterBodyRiverFloodingRiskAttribute)
                    .with(WaterBodyTsunamiRiskAttribute.class, this::createWaterBodyTsunamiRiskAttribute)
                    .with(WaterBodyHighTideRiskAttribute.class, this::createWaterBodyHighTideRiskAttribute)
                    .with(WaterBodyInlandFloodingRiskAttribute.class, this::createWaterBodyInlandFloodingRiskAttribute)
                    .with(WaterBodyDetailAttribute.class, this::createWaterBodyDetailAttribute)
                    .with(BridBaseAttributePropertyElement.class, this::createBridBaseAttributePropertyElement)
                    .with(BridFacilityIdAttributePropertyElement.class, this::createBridFacilityIdAttributePropertyElement)
                    .with(BridFacilityTypeAttributePropertyElement.class, this::createBridFacilityTypeAttributePropertyElement)
                    .with(BridFacilityAttributePropertyElement.class, this::createBridFacilityAttributePropertyElement)
                    .with(BridStructureAttributePropertyElement.class, this::createBridStructureAttributePropertyElement)
                    .with(BridFunctionalAttributePropertyElement.class, this::createBridFunctionalAttributePropertyElement)
                    .with(BridRiskAssessmentAttributePropertyElement.class, this::createBridRiskAssessmentAttributePropertyElement)
                    .with(BridDisasterRiskAttributePropertyElement.class, this::createBridDisasterRiskAttributePropertyElement)
                    .with(BridDmAttributePropertyElement.class, this::createBridDmAttributePropertyElement)
                    .with(BridDataQualityAttributePropertyElement.class, this::createBridDataQualityAttributePropertyElement)
                    .with(FrnFacilityIdAttributePropertyElement.class, this::createFrnFacilityIdAttributePropertyElement)
                    .with(FrnFacilityTypeAttributePropertyElement.class, this::createFrnFacilityTypeAttributePropertyElement)
                    .with(FrnFacilityAttributePropertyElement.class, this::createFrnFacilityAttributePropertyElement)
                    .with(FrnDmAttributePropertyElement.class, this::createFrnDmAttributePropertyElement)
                    .with(TranFacilityIdAttributePropertyElement.class, this::createTranFacilityIdAttributePropertyElement)
                    .with(TranFacilityTypeAttributePropertyElement.class, this::createTranFacilityTypeAttributePropertyElement)
                    .with(TranFacilityAttributePropertyElement.class, this::createTranFacilityAttributePropertyElement)
                    .with(TranDmAttributePropertyElement.class, this::createTranDmAttributePropertyElement)
                    .with(TranDataQualityAttributePropertyElement.class, this::createTranDataQualityAttributePropertyElement)
                    .with(VegFacilityIdAttributePropertyElement.class, this::createVegFacilityIdAttributePropertyElement)
                    .with(VegFacilityTypeAttributePropertyElement.class, this::createVegFacilityTypeAttributePropertyElement)
                    .with(VegFacilityAttributePropertyElement.class, this::createVegFacilityAttributePropertyElement)
                    .with(VegDmAttributePropertyElement.class, this::createVegDmAttributePropertyElement)
                    .with(TunBaseAttributePropertyElement.class, this::createTunBaseAttributePropertyElement)
                    .with(TunStructureAttributePropertyElement.class, this::createTunStructureAttributePropertyElement)
                    .with(TunFunctionalAttributePropertyElement.class, this::createTunFunctionalAttributePropertyElement)
                    .with(TunRiskAssessmentAttributePropertyElement.class, this::createTunRiskAssessmentAttributePropertyElement)
                    .with(TunDisasterRiskAttributePropertyElement.class, this::createTunDisasterRiskAttributePropertyElement)
                    .with(TunDmAttributePropertyElement.class, this::createTunDmAttributePropertyElement)
                    .with(TunDataQualityAttributePropertyElement.class, this::createTunDataQualityAttributePropertyElement)
                    .with(TunFacilityIdAttributePropertyElement.class, this::createTunFacilityIdAttributePropertyElement)
                    .with(TunFacilityTypeAttributePropertyElement.class, this::createTunFacilityTypeAttributePropertyElement)
                    .with(TunFacilityAttributePropertyElement.class, this::createTunFacilityAttributePropertyElement)
                    .with(BldgFacilityIdAttributePropertyElement.class, this::createBldgFacilityIdAttributePropertyElement)
                    .with(BldgFacilityTypeAttributePropertyElement.class, this::createBldgFacilityTypeAttributePropertyElement)
                    .with(BldgFacilityAttributePropertyElement.class, this::createBldgFacilityAttributePropertyElement)
                    .with(BldgDmAttributePropertyElement.class, this::createBldgDmAttributePropertyElement)
                    .with(LuseFacilityIdAttributePropertyElement.class, this::createLuseFacilityIdAttributePropertyElement)
                    .with(LuseFacilityTypeAttributePropertyElement.class, this::createLuseFacilityTypeAttributePropertyElement)
                    .with(LuseFacilityAttributePropertyElement.class, this::createLuseFacilityAttributePropertyElement)
                    .with(LuseDmAttributePropertyElement.class, this::createLuseDmAttributePropertyElement)
                    .with(WtrFacilityIdAttributePropertyElement.class, this::createWtrFacilityIdAttributePropertyElement)
                    .with(WtrFacilityTypeAttributePropertyElement.class, this::createWtrFacilityTypeAttributePropertyElement)
                    .with(WtrFacilityAttributePropertyElement.class, this::createWtrFacilityAttributePropertyElement)
                    .with(WtrDmAttributePropertyElement.class, this::createWtrDmAttributePropertyElement)
                    .with(DemDmAttributePropertyElement.class, this::createDemDmAttributePropertyElement)
                    .with(RailwayRouteAttributePropertyElement.class, this::createRailwayRouteAttributePropertyElement)
                    .with(RailwayTrackAttributePropertyElement.class, this::createRailwayTrackAttributePropertyElement)
                    .with(TrackAttributePropertyElement.class, this::createTrackAttributePropertyElement)
                    .with(SquareUrbanPlanAttributePropertyElement.class, this::createSquareUrbanPlanAttributePropertyElement)
                    .with(IfcBuildingAttributePropertyElement.class, this::createIfcBuildingAttributePropertyElement)
                    .with(IfcBuildingStoreyAttributePropertyElement.class, this::createIfcBuildingStoreyAttributePropertyElement)
                    .with(IfcLandUseAttributePropertyElement.class, this::createIfcLandUseAttributePropertyElement)
                    .with(IfcRoomAttributePropertyElement.class, this::createIfcRoomAttributePropertyElement)
                    .with(IfcOpeningAttributePropertyElement.class, this::createIfcOpeningAttributePropertyElement)
                    .with(IfcBoundarySurfaceAttributePropertyElement.class, this::createIfcBoundarySurfaceAttributePropertyElement)
                    .with(IfcBuildingInstallationAttributePropertyElement.class, this::createIfcBuildingInstallationAttributePropertyElement)
                    .with(IfcIntBuildingInstallationAttributePropertyElement.class, this::createIfcIntBuildingInstallationAttributePropertyElement)
                    .with(IfcBuildingFurnitureAttributePropertyElement.class, this::createIfcBuildingFurnitureAttributePropertyElement)
                    .with(RoomDataQualityAttributePropertyElement.class, this::createRoomDataQualityAttributePropertyElement)
                    .with(IndoorBuildingAttributePropertyElement.class, this::createIndoorBuildingAttributePropertyElement)
                    .with(IndoorBoundarySurfaceAttributePropertyElement.class, this::createIndoorBoundarySurfaceAttributePropertyElement)
                    .with(IndoorIntInstallationAttributePropertyElement.class, this::createIndoorIntInstallationAttributePropertyElement)
                    .with(IndoorOpeningAttributePropertyElement.class, this::createIndoorOpeningAttributePropertyElement)
                    .with(IndoorFutnitureAttributePropertyElement.class, this::createIndoorFutnitureAttributePropertyElement)
                    .with(IndoorRoomAttributePropertyElement.class, this::createIndoorRoomAttributePropertyElement)
                    .with(IndoorStoreyAttributePropertyElement.class, this::createIndoorStoreyAttributePropertyElement)
                    .with(LuseDataQualityAttributePropertyElement.class, this::createLuseDataQualityAttributePropertyElement)
                    .with(RoadStatusPropertyElement.class, this::createRoadStatusPropertyElement)
                    .with(BuildingIDAttributePropertyElement.class, this::createBuildingIDAttributePropertyElement)
                    .with(BuildingDetailAttributePropertyElement.class, this::createBuildingDetailAttributePropertyElement)
                    .with(LargeCustomerFacilityAttributePropertyElement.class, this::createLargeCustomerFacilityAttributePropertyElement)
                    .with(BuildingDisasterRiskAttributePropertyElement.class, this::createBuildingDisasterRiskAttributePropertyElement)
                    .with(KeyValuePairAttributePropertyElement.class, this::createKeyValuePairAttributePropertyElement)
                    .with(BuildingDataQualityAttributePropertyElement.class, this::createBuildingDataQualityAttributePropertyElement)
                    .with(LandUseDetailAttributePropertyElement.class, this::createLandUseDetailAttributePropertyElement)
                    .with(TrafficVolumeAttributePropertyElement.class, this::createTrafficVolumeAttributePropertyElement)
                    .with(RoadStructureAttributePropertyElement.class, this::createRoadStructureAttributePropertyElement)
                    .with(TrafficAreaStructureAttributePropertyElement.class, this::createTrafficAreaStructureAttributePropertyElement)
                    .with(CityFurnitureDetailAttributePropertyElement.class, this::createCityFurnitureDetailAttributePropertyElement)
                    .with(CityFurnitureDataQualityAttributePropertyElement.class, this::createCityFurnitureDataQualityAttributePropertyElement)
                    .with(VegetationDataQualityAttributePropertyElement.class, this::createVegetationDataQualityAttributePropertyElement)
                    .with(FloodingRiskAttributePropertyElement.class, this::createFloodingRiskAttributePropertyElement)
                    .with(WaterBodyDetailAttributePropertyElement.class, this::createWaterBodyDetailAttributePropertyElement)
                    .with(FiscalYearOfPublicationProperty.class, this::createFiscalYearOfPublicationProperty)
                    .with(LanguageProperty.class, this::createLanguageProperty);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(ConstructionBaseAttribute.class, this::marshalConstructionBaseAttribute)
                    .with(ConstructionBaseAttributeProperty.class, this::marshalConstructionBaseAttributeProperty)
                    .with(FacilityIdAttribute.class, this::marshalFacilityIdAttribute)
                    .with(RiverFacilityIdAttribute.class, this::marshalRiverFacilityIdAttribute)
                    .with(FacilityIdAttributeProperty.class, this::marshalFacilityIdAttributeProperty)
                    .with(FacilityTypeAttribute.class, this::marshalFacilityTypeAttribute)
                    .with(FacilityTypeAttributeProperty.class, this::marshalFacilityTypeAttributeProperty)
                    .with(HarborFacility.class, this::marshalHarborFacility)
                    .with(PortProtectiveFacility.class, this::marshalPortProtectiveFacility)
                    .with(MooringFacility.class, this::marshalMooringFacility)
                    .with(PortTransportationFacility.class, this::marshalPortTransportationFacility)
                    .with(NavigationAssistanceFacility.class, this::marshalNavigationAssistanceFacility)
                    .with(CargoHandlingFacility.class, this::marshalCargoHandlingFacility)
                    .with(PortPassengerFacility.class, this::marshalPortPassengerFacility)
                    .with(PortStorageFacility.class, this::marshalPortStorageFacility)
                    .with(ShipServiceFacility.class, this::marshalShipServiceFacility)
                    .with(PortWasteTreatmentFacility.class, this::marshalPortWasteTreatmentFacility)
                    .with(PortEnvironmentalImprovementFacility.class, this::marshalPortEnvironmentalImprovementFacility)
                    .with(PortPollutionControlFacility.class, this::marshalPortPollutionControlFacility)
                    .with(PortWelfareFacility.class, this::marshalPortWelfareFacility)
                    .with(PortManagementFacility.class, this::marshalPortManagementFacility)
                    .with(CyberportMarinaAndPBS.class, this::marshalCyberportMarinaAndPBS)
                    .with(FishingPortFacility.class, this::marshalFishingPortFacility)
                    .with(FishingPortCapacity.class, this::marshalFishingPortCapacity)
                    .with(MaintenanceHistoryAttribute.class, this::marshalMaintenanceHistoryAttribute)
                    .with(FacilityAttributeProperty.class, this::marshalFacilityAttributeProperty)
                    .with(BridgeStructureAttribute.class, this::marshalBridgeStructureAttribute)
                    .with(BridgeStructureAttributeProperty.class, this::marshalBridgeStructureAttributeProperty)
                    .with(BridgeFunctionalAttribute.class, this::marshalBridgeFunctionalAttribute)
                    .with(BridgeFunctionalAttributeProperty.class, this::marshalBridgeFunctionalAttributeProperty)
                    .with(ConstructionRiskAssessmentAttribute.class, this::marshalConstructionRiskAssessmentAttribute)
                    .with(ConstructionRiskAssessmentAttributeProperty.class, this::marshalConstructionRiskAssessmentAttributeProperty)
                    .with(RiverFloodingRiskAttribute.class, this::marshalRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttribute.class, this::marshalTsunamiRiskAttribute)
                    .with(InlandFloodingRiskAttribute.class, this::marshalInlandFloodingRiskAttribute)
                    .with(HighTideRiskAttribute.class, this::marshalHighTideRiskAttribute)
                    .with(LandSlideRiskAttribute.class, this::marshalLandSlideRiskAttribute)
                    .with(DisasterRiskAttributeProperty.class, this::marshalDisasterRiskAttributeProperty)
                    .with(DmGeometricAttribute.class, this::marshalDmGeometricAttribute)
                    .with(DmAnnotation.class, this::marshalDmAnnotation)
                    .with(DmAttributeProperty.class, this::marshalDmAttributeProperty)
                    .with(DmElement.class, this::marshalDmElement)
                    .with(DmElementProperty.class, this::marshalDmElementProperty)
                    .with(ConstructionDataQualityAttribute.class, this::marshalConstructionDataQualityAttribute)
                    .with(ConstructionDataQualityAttributeProperty.class, this::marshalConstructionDataQualityAttributeProperty)
                    .with(TransportationDataQualityAttribute.class, this::marshalTransportationDataQualityAttribute)
                    .with(TransportationDataQualityAttributeProperty.class, this::marshalTransportationDataQualityAttributeProperty)
                    .with(TunnelStructureAttribute.class, this::marshalTunnelStructureAttribute)
                    .with(TunnelStructureAttributeProperty.class, this::marshalTunnelStructureAttributeProperty)
                    .with(TunnelFunctionalAttribute.class, this::marshalTunnelFunctionalAttribute)
                    .with(TunnelFunctionalAttributeProperty.class, this::marshalTunnelFunctionalAttributeProperty)
                    .with(RailwayRouteAttribute.class, this::marshalRailwayRouteAttribute)
                    .with(RailwayRouteAttributeProperty.class, this::marshalRailwayRouteAttributeProperty)
                    .with(RailwayTrackAttribute.class, this::marshalRailwayTrackAttribute)
                    .with(RailwayTrackAttributeProperty.class, this::marshalRailwayTrackAttributeProperty)
                    .with(ControlPoint.class, this::marshalControlPoint)
                    .with(ControlPointProperty.class, this::marshalControlPointProperty)
                    .with(TrackAttribute.class, this::marshalTrackAttribute)
                    .with(TrackAttributeProperty.class, this::marshalTrackAttributeProperty)
                    .with(SquareUrbanPlanAttribute.class, this::marshalSquareUrbanPlanAttribute)
                    .with(StationSquareAttribute.class, this::marshalStationSquareAttribute)
                    .with(TerminalAttribute.class, this::marshalTerminalAttribute)
                    .with(SquareUrbanPlanAttributeProperty.class, this::marshalSquareUrbanPlanAttributeProperty)
                    .with(IfcBuilding.class, this::marshalIfcBuilding)
                    .with(IfcSite.class, this::marshalIfcSite)
                    .with(IfcSpace.class, this::marshalIfcSpace)
                    .with(IfcBuildingStorey.class, this::marshalIfcBuildingStorey)
                    .with(IfcBuildingElement.class, this::marshalIfcBuildingElement)
                    .with(IfcWall.class, this::marshalIfcWall)
                    .with(IfcWallStandardCase.class, this::marshalIfcWallStandardCase)
                    .with(IfcCurtainWall.class, this::marshalIfcCurtainWall)
                    .with(IfcRoof.class, this::marshalIfcRoof)
                    .with(IfcWindow.class, this::marshalIfcWindow)
                    .with(IfcDoor.class, this::marshalIfcDoor)
                    .with(IfcOpeningElement.class, this::marshalIfcOpeningElement)
                    .with(IfcFurnishingElement.class, this::marshalIfcFurnishingElement)
                    .with(IfcProject.class, this::marshalIfcProject)
                    .with(IfcGeometricRepresentationContext.class, this::marshalIfcGeometricRepresentationContext)
                    .with(IfcGeometricRepresentationContextProperty.class, this::marshalIfcGeometricRepresentationContextProperty)
                    .with(IfcAxis2Placement3D.class, this::marshalIfcAxis2Placement3D)
                    .with(IfcAxis2Placement3DProperty.class, this::marshalIfcAxis2Placement3DProperty)
                    .with(IfcUnit.class, this::marshalIfcUnit)
                    .with(IfcUnitProperty.class, this::marshalIfcUnitProperty)
                    .with(IfcGroup.class, this::marshalIfcGroup)
                    .with(IfcZone.class, this::marshalIfcZone)
                    .with(IfcPsetBuildingCommon.class, this::marshalIfcPsetBuildingCommon)
                    .with(IfcPsetSiteCommon.class, this::marshalIfcPsetSiteCommon)
                    .with(IfcCoordinateReferenceSystem.class, this::marshalIfcCoordinateReferenceSystem)
                    .with(IfcProjectedCRS.class, this::marshalIfcProjectedCRS)
                    .with(IfcCoordinateReferenceSystemProperty.class, this::marshalIfcCoordinateReferenceSystemProperty)
                    .with(IfcMapConversion.class, this::marshalIfcMapConversion)
                    .with(IfcCoordinateReferenceSystemSelect.class, this::marshalIfcCoordinateReferenceSystemSelect)
                    .with(IfcClassificationReference.class, this::marshalIfcClassificationReference)
                    .with(IfcClassification.class, this::marshalIfcClassification)
                    .with(IfcClassificationProperty.class, this::marshalIfcClassificationProperty)
                    .with(IfcPsetSpaceCommon.class, this::marshalIfcPsetSpaceCommon)
                    .with(IfcSpaceBaseQuantity.class, this::marshalIfcSpaceBaseQuantity)
                    .with(IfcPsetWindowCommon.class, this::marshalIfcPsetWindowCommon)
                    .with(IfcPsetDoorCommon.class, this::marshalIfcPsetDoorCommon)
                    .with(IfcPsetOpeningElementCommon.class, this::marshalIfcPsetOpeningElementCommon)
                    .with(IfcAttributeProperty.class, this::marshalIfcAttributeProperty)
                    .with(RoomDataQualityAttribute.class, this::marshalRoomDataQualityAttribute)
                    .with(RoomDataQualityAttributeProperty.class, this::marshalRoomDataQualityAttributeProperty)
                    .with(IndoorFurnishingAttribute.class, this::marshalIndoorFurnishingAttribute)
                    .with(IndoorZoneAttribute.class, this::marshalIndoorZoneAttribute)
                    .with(IndoorPublicTagAttribute.class, this::marshalIndoorPublicTagAttribute)
                    .with(IndoorSpaceAttribute.class, this::marshalIndoorSpaceAttribute)
                    .with(IndoorFacilityAttribute.class, this::marshalIndoorFacilityAttribute)
                    .with(IndoorStoreyAttribute.class, this::marshalIndoorStoreyAttribute)
                    .with(IndoorTacatileTileAttribute.class, this::marshalIndoorTacatileTileAttribute)
                    .with(IndoorUserDefinedAttribute.class, this::marshalIndoorUserDefinedAttribute)
                    .with(UserDefinedValue.class, this::marshalUserDefinedValue)
                    .with(UserDefinedValueProperty.class, this::marshalUserDefinedValueProperty)
                    .with(IndoorAttributeProperty.class, this::marshalIndoorAttributeProperty)
                    .with(LandUseDataQualityAttribute.class, this::marshalLandUseDataQualityAttribute)
                    .with(LandUseDataQualityAttributeProperty.class, this::marshalLandUseDataQualityAttributeProperty)
                    .with(RoadType.class, this::marshalRoadType)
                    .with(RoadTypeProperty.class, this::marshalRoadTypeProperty)
                    .with(BuildingIDAttribute.class, this::marshalBuildingIDAttribute)
                    .with(BuildingIDAttributeProperty.class, this::marshalBuildingIDAttributeProperty)
                    .with(BuildingDetailAttribute.class, this::marshalBuildingDetailAttribute)
                    .with(BuildingDetailAttributeProperty.class, this::marshalBuildingDetailAttributeProperty)
                    .with(LargeCustomerFacilityAttribute.class, this::marshalLargeCustomerFacilityAttribute)
                    .with(LargeCustomerFacilityAttributeProperty.class, this::marshalLargeCustomerFacilityAttributeProperty)
                    .with(BuildingRiverFloodingRiskAttribute.class, this::marshalBuildingRiverFloodingRiskAttribute)
                    .with(BuildingTsunamiRiskAttribute.class, this::marshalBuildingTsunamiRiskAttribute)
                    .with(BuildingInlandFloodingRiskAttribute.class, this::marshalBuildingInlandFloodingRiskAttribute)
                    .with(BuildingHighTideRiskAttribute.class, this::marshalBuildingHighTideRiskAttribute)
                    .with(BuildingLandSlideRiskAttribute.class, this::marshalBuildingLandSlideRiskAttribute)
                    .with(BuildingDisasterRiskAttributeProperty.class, this::marshalBuildingDisasterRiskAttributeProperty)
                    .with(KeyValuePairAttribute.class, this::marshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributeProperty.class, this::marshalKeyValuePairAttributeProperty)
                    .with(BuildingDataQualityAttribute.class, this::marshalBuildingDataQualityAttribute)
                    .with(BuildingDataQualityAttributeProperty.class, this::marshalBuildingDataQualityAttributeProperty)
                    .with(LandUseDetailAttribute.class, this::marshalLandUseDetailAttribute)
                    .with(LandUseDetailAttributeProperty.class, this::marshalLandUseDetailAttributeProperty)
                    .with(TrafficVolumeAttribute.class, this::marshalTrafficVolumeAttribute)
                    .with(TrafficVolumeAttributeProperty.class, this::marshalTrafficVolumeAttributeProperty)
                    .with(RoadStructureAttribute.class, this::marshalRoadStructureAttribute)
                    .with(RoadStructureAttributeProperty.class, this::marshalRoadStructureAttributeProperty)
                    .with(TrafficAreaStructureAttribute.class, this::marshalTrafficAreaStructureAttribute)
                    .with(TrafficAreaStructureAttributeProperty.class, this::marshalTrafficAreaStructureAttributeProperty)
                    .with(CityFurnitureDetailAttribute.class, this::marshalCityFurnitureDetailAttribute)
                    .with(CityFurnitureDetailAttributeProperty.class, this::marshalCityFurnitureDetailAttributeProperty)
                    .with(CityFurnitureDataQualityAttribute.class, this::marshalCityFurnitureDataQualityAttribute)
                    .with(CityFurnitureDataQualityAttributeProperty.class, this::marshalCityFurnitureDataQualityAttributeProperty)
                    .with(VegetationDataQualityAttribute.class, this::marshalVegetationDataQualityAttribute)
                    .with(VegetationDataQualityAttributeProperty.class, this::marshalVegetationDataQualityAttributeProperty)
                    .with(WaterBodyRiverFloodingRiskAttribute.class, this::marshalWaterBodyRiverFloodingRiskAttribute)
                    .with(WaterBodyTsunamiRiskAttribute.class, this::marshalWaterBodyTsunamiRiskAttribute)
                    .with(WaterBodyHighTideRiskAttribute.class, this::marshalWaterBodyHighTideRiskAttribute)
                    .with(WaterBodyInlandFloodingRiskAttribute.class, this::marshalWaterBodyInlandFloodingRiskAttribute)
                    .with(WaterBodyFloodingRiskAttributeProperty.class, this::marshalWaterBodyFloodingRiskAttributeProperty)
                    .with(WaterBodyDetailAttribute.class, this::marshalWaterBodyDetailAttribute)
                    .with(WaterBodyDetailAttributeProperty.class, this::marshalWaterBodyDetailAttributeProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEMarshallerHelper(ADEMarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public JAXBElement<?> marshalJAXBElement(ADEModelObject src) {
        TypeMapper<JAXBElement<?>> elementMapper = getElementMapper();
        return elementMapper != null ? elementMapper.apply(src) : null;
    }

    @Override
    public Object marshal(ADEModelObject src) {
        TypeMapper<Object> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private ConstructionBaseAttributeType marshalConstructionBaseAttribute(ConstructionBaseAttribute src) {
        ConstructionBaseAttributeType dest = factory.createConstructionBaseAttributeType();

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        dest.setAdministorator(src.getAdministorator());
        dest.setAdminOffice(src.getAdminOffice());

        if (src.getOperatorType() != null)
            dest.setOperatorType(helper.getGMLMarshaller().marshalCode(src.getOperatorType()));

        if (src.getInstallerType() != null)
            dest.setInstallerType(helper.getGMLMarshaller().marshalCode(src.getInstallerType()));

        dest.setInstaller(src.getInstaller());
        dest.setStructureOrdinance(src.getStructureOrdinance());
        dest.setSpecification(src.getSpecification());
        dest.setKana(src.getKana());

        if (src.getConstructionStartYear() != null)
            dest.setConstructionStartYear(marshaller.toCalendar(src.getConstructionStartYear()));

        if (src.getCompletionYear() != null)
            dest.setCompletionYear(marshaller.toCalendar(src.getCompletionYear()));

        if (src.getFacilityAge() != null)
            dest.setFacilityAge(BigInteger.valueOf(src.getFacilityAge()));

        if (src.getUpdate() != null)
            dest.setUpdate(marshaller.toCalendar(src.getUpdate()));

        if (src.getPurpose() != null)
            dest.setPurpose(helper.getGMLMarshaller().marshalCode(src.getPurpose()));

        return dest;
    }

    private ConstructionBaseAttributePropertyType marshalConstructionBaseAttributeProperty(ConstructionBaseAttributeProperty src) {
        ConstructionBaseAttributePropertyType dest = factory.createConstructionBaseAttributePropertyType();

        if (src.isSetObject())
            dest.setConstructionBaseAttribute(marshalConstructionBaseAttribute(src.getObject()));

        return dest;
    }

    private void marshalFacilityIdAttribute(FacilityIdAttribute src, FacilityIdAttributeType dest) {
        dest.setId(src.getId());
        dest.setPartId(src.getPartId());
        dest.setBranchId(src.getBranchId());

        for (Code prefecture : src.getPrefecture())
            dest.getPrefecture().add(helper.getGMLMarshaller().marshalCode(prefecture));

        for (Code city : src.getCity())
            dest.getCity().add(helper.getGMLMarshaller().marshalCode(city));

        dest.setRoute(src.getRoute());
        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());
        dest.setStartLat(src.getStartLat());
        dest.setStartLong(src.getStartLong());

        for (String alternativeName : src.getAlternativeName())
            dest.getAlternativeName().add(alternativeName);
    }

    private FacilityIdAttributeType marshalFacilityIdAttribute(FacilityIdAttribute src) {
        FacilityIdAttributeType dest = factory.createFacilityIdAttributeType();
        marshalFacilityIdAttribute(src, dest);
        return dest;
    }

    private RiverFacilityIdAttributeType marshalRiverFacilityIdAttribute(RiverFacilityIdAttribute src) {
        RiverFacilityIdAttributeType dest = factory.createRiverFacilityIdAttributeType();
        marshalFacilityIdAttribute(src, dest);

        if (src.getRiverCode() != null)
            dest.setRiverCode(helper.getGMLMarshaller().marshalCode(src.getRiverCode()));

        dest.setRiverName(src.getRiverName());

        if (src.getSideType() != null)
            dest.setSideType(helper.getGMLMarshaller().marshalCode(src.getSideType()));

        if (src.getLeftPost() != null)
            dest.setLeftPost(helper.getGMLMarshaller().marshalLength(src.getLeftPost()));

        if (src.getLeftDistance() != null)
            dest.setLeftDistance(helper.getGMLMarshaller().marshalLength(src.getLeftDistance()));

        if (src.getRightPost() != null)
            dest.setRightPost(helper.getGMLMarshaller().marshalLength(src.getRightPost()));

        if (src.getRightDistance() != null)
            dest.setRightDistance(helper.getGMLMarshaller().marshalLength(src.getRightDistance()));

        if (src.getLeftStartPost() != null)
            dest.setLeftStartPost(helper.getGMLMarshaller().marshalLength(src.getLeftStartPost()));

        if (src.getLeftStartDistance() != null)
            dest.setLeftStartDistance(helper.getGMLMarshaller().marshalLength(src.getLeftStartDistance()));

        if (src.getLeftEndPost() != null)
            dest.setLeftEndPost(helper.getGMLMarshaller().marshalLength(src.getLeftEndPost()));

        if (src.getLefEndDistance() != null)
            dest.setLefEndDistance(helper.getGMLMarshaller().marshalLength(src.getLefEndDistance()));

        if (src.getRightStartPost() != null)
            dest.setRightStartPost(helper.getGMLMarshaller().marshalLength(src.getRightStartPost()));

        if (src.getRightStartDistance() != null)
            dest.setRightStartDistance(helper.getGMLMarshaller().marshalLength(src.getRightStartDistance()));

        if (src.getRightEndPost() != null)
            dest.setRightEndPost(helper.getGMLMarshaller().marshalLength(src.getRightEndPost()));

        if (src.getRightEndDistance() != null)
            dest.setRightEndDistance(helper.getGMLMarshaller().marshalLength(src.getRightEndDistance()));

        return dest;
    }

    private FacilityIdAttributePropertyType marshalFacilityIdAttributeProperty(FacilityIdAttributeProperty src) {
        FacilityIdAttributePropertyType dest = factory.createFacilityIdAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof FacilityIdAttributeType)
                dest.setFacilityIdAttribute((JAXBElement<? extends FacilityIdAttributeType>) elem);
        }

        return dest;
    }

    private FacilityTypeAttributeType marshalFacilityTypeAttribute(FacilityTypeAttribute src) {
        FacilityTypeAttributeType dest = factory.createFacilityTypeAttributeType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        for (Code function : src.getFunction())
            dest.getFunction().add(helper.getGMLMarshaller().marshalCode(function));

        return dest;
    }

    private FacilityTypeAttributePropertyType marshalFacilityTypeAttributeProperty(FacilityTypeAttributeProperty src) {
        FacilityTypeAttributePropertyType dest = factory.createFacilityTypeAttributePropertyType();

        if (src.isSetObject())
            dest.setFacilityTypeAttribute(marshalFacilityTypeAttribute(src.getObject()));

        return dest;
    }

    private void marshalFacilityAttribute(FacilityAttribute src, FacilityAttributeType dest) {
        dest.setFacilityId(src.getFacilityId());
    }

    private void marshalPortAttribute(PortAttribute src, PortAttributeType dest) {
        marshalFacilityAttribute(src, dest);

        if (src.getPortFacilityDetailsType() != null)
            dest.setPortFacilityDetailsType(helper.getGMLMarshaller().marshalCode(src.getPortFacilityDetailsType()));

        dest.setPortName(src.getPortName());

        if (src.getPortStatus() != null)
            dest.setPortStatus(helper.getGMLMarshaller().marshalCode(src.getPortStatus()));

        dest.setDistrict(src.getDistrict());

        if (src.getGrantType() != null)
            dest.setGrantType(helper.getGMLMarshaller().marshalCode(src.getGrantType()));

        dest.setIsDesignated(src.getIsDesignated());

        if (src.getDegradationLevel() != null)
            dest.setDegradationLevel(BigInteger.valueOf(src.getDegradationLevel()));
    }

    private HarborFacilityType marshalHarborFacility(HarborFacility src) {
        HarborFacilityType dest = factory.createHarborFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getGeologicalType() != null)
            dest.setGeologicalType(helper.getGMLMarshaller().marshalCode(src.getGeologicalType()));

        dest.setObstructingStructures(src.getObstructingStructures());

        if (src.getStructuralLimitations() != null)
            dest.setStructuralLimitations(helper.getGMLMarshaller().marshalLength(src.getStructuralLimitations()));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getMinimumWidth() != null)
            dest.setMinimumWidth(helper.getGMLMarshaller().marshalLength(src.getMinimumWidth()));

        if (src.getMaximumWidth() != null)
            dest.setMaximumWidth(helper.getGMLMarshaller().marshalLength(src.getMaximumWidth()));

        if (src.getPlannedDepth() != null)
            dest.setPlannedDepth(helper.getGMLMarshaller().marshalLength(src.getPlannedDepth()));

        if (src.getCurrentDepth() != null)
            dest.setCurrentDepth(helper.getGMLMarshaller().marshalLength(src.getCurrentDepth()));

        dest.setIsDredged(src.getIsDredged());

        if (src.getAreaType() != null)
            dest.setAreaType(helper.getGMLMarshaller().marshalCode(src.getAreaType()));

        if (src.getInnerArea() != null)
            dest.setInnerArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerArea()));

        if (src.getOuterArea() != null)
            dest.setOuterArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterArea()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        for (String note : src.getNote())
            dest.getNote().add(note);

        return dest;
    }

    private PortProtectiveFacilityType marshalPortProtectiveFacility(PortProtectiveFacility src) {
        PortProtectiveFacilityType dest = factory.createPortProtectiveFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        for (String note : src.getNote())
            dest.getNote().add(note);

        return dest;
    }

    private MooringFacilityType marshalMooringFacility(MooringFacility src) {
        MooringFacilityType dest = factory.createMooringFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getMainPartLength() != null)
            dest.setMainPartLength(helper.getGMLMarshaller().marshalLength(src.getMainPartLength()));

        if (src.getTotalLength() != null)
            dest.setTotalLength(helper.getGMLMarshaller().marshalLength(src.getTotalLength()));

        if (src.getFacilityWidth() != null)
            dest.setFacilityWidth(helper.getGMLMarshaller().marshalLength(src.getFacilityWidth()));

        if (src.getApronWidth() != null)
            dest.setApronWidth(helper.getGMLMarshaller().marshalLength(src.getApronWidth()));

        if (src.getPlannedDepth() != null)
            dest.setPlannedDepth(helper.getGMLMarshaller().marshalLength(src.getPlannedDepth()));

        if (src.getCurrentDepth() != null)
            dest.setCurrentDepth(helper.getGMLMarshaller().marshalLength(src.getCurrentDepth()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getCeilingHeight() != null)
            dest.setCeilingHeight(helper.getGMLMarshaller().marshalLength(src.getCeilingHeight()));

        if (src.getGravityResistant() != null)
            dest.setGravityResistant(helper.getGMLMarshaller().marshalMeasure(src.getGravityResistant()));

        if (src.getForm() != null)
            dest.setForm(helper.getGMLMarshaller().marshalCode(src.getForm()));

        if (src.getMainVessels() != null)
            dest.setMainVessels(helper.getGMLMarshaller().marshalCode(src.getMainVessels()));

        if (src.getMooringPostWeight() != null)
            dest.setMooringPostWeight(helper.getGMLMarshaller().marshalMeasure(src.getMooringPostWeight()));

        if (src.getNumberOfMooringPosts() != null)
            dest.setNumberOfMooringPosts(BigInteger.valueOf(src.getNumberOfMooringPosts()));

        if (src.getResistantMaterial() != null)
            dest.setResistantMaterial(BigInteger.valueOf(src.getResistantMaterial()));

        if (src.getLighting() != null)
            dest.setLighting(BigInteger.valueOf(src.getLighting()));

        if (src.getStairs() != null)
            dest.setStairs(BigInteger.valueOf(src.getStairs()));

        dest.setLifesavingAppliances(src.getLifesavingAppliances());

        if (src.getNumberOfLifesavingAppliances() != null)
            dest.setNumberOfLifesavingAppliances(BigInteger.valueOf(src.getNumberOfLifesavingAppliances()));

        if (src.getBumper() != null)
            dest.setBumper(helper.getGMLMarshaller().marshalLength(src.getBumper()));

        if (src.getNumberOfVehicleBoardings() != null)
            dest.setNumberOfVehicleBoardings(BigInteger.valueOf(src.getNumberOfVehicleBoardings()));

        if (src.getVehicleBoardingWidth() != null)
            dest.setVehicleBoardingWidth(helper.getGMLMarshaller().marshalLength(src.getVehicleBoardingWidth()));

        dest.setShipType(src.getShipType());

        if (src.getNumberOfSeats() != null)
            dest.setNumberOfSeats(BigInteger.valueOf(src.getNumberOfSeats()));

        if (src.getMainCargo() != null)
            dest.setMainCargo(helper.getGMLMarshaller().marshalCode(src.getMainCargo()));

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortTransportationFacilityType marshalPortTransportationFacility(PortTransportationFacility src) {
        PortTransportationFacilityType dest = factory.createPortTransportationFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        dest.setStartingPoint(src.getStartingPoint());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getBeddingWidth() != null)
            dest.setBeddingWidth(helper.getGMLMarshaller().marshalLength(src.getBeddingWidth()));

        if (src.getNumberOfLanes() != null)
            dest.setNumberOfLanes(BigInteger.valueOf(src.getNumberOfLanes()));

        if (src.getParkingLotCapacityOfBus() != null)
            dest.setParkingLotCapacityOfBus(BigInteger.valueOf(src.getParkingLotCapacityOfBus()));

        if (src.getParkingLotCapacityOfCars() != null)
            dest.setParkingLotCapacityOfCars(BigInteger.valueOf(src.getParkingLotCapacityOfCars()));

        if (src.getRouteType() != null)
            dest.setRouteType(helper.getGMLMarshaller().marshalCode(src.getRouteType()));

        if (src.getHeightToDigit() != null)
            dest.setHeightToDigit(helper.getGMLMarshaller().marshalLength(src.getHeightToDigit()));

        if (src.getHeightLimit() != null)
            dest.setHeightLimit(helper.getGMLMarshaller().marshalLength(src.getHeightLimit()));

        if (src.getMinimumWidth() != null)
            dest.setMinimumWidth(helper.getGMLMarshaller().marshalLength(src.getMinimumWidth()));

        if (src.getMinimumDepth() != null)
            dest.setMinimumDepth(helper.getGMLMarshaller().marshalLength(src.getMinimumDepth()));

        if (src.getNumberOfAircraftParkingSpaces() != null)
            dest.setNumberOfAircraftParkingSpaces(BigInteger.valueOf(src.getNumberOfAircraftParkingSpaces()));

        if (src.getPavementType() != null)
            dest.setPavementType(helper.getGMLMarshaller().marshalCode(src.getPavementType()));

        if (src.getMainCargo() != null)
            dest.setMainCargo(helper.getGMLMarshaller().marshalCode(src.getMainCargo()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private NavigationAssistanceFacilityType marshalNavigationAssistanceFacility(NavigationAssistanceFacility src) {
        NavigationAssistanceFacilityType dest = factory.createNavigationAssistanceFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setSubsidy(src.getSubsidy());
        dest.setNote(src.getNote());

        return dest;
    }

    private CargoHandlingFacilityType marshalCargoHandlingFacility(CargoHandlingFacility src) {
        CargoHandlingFacilityType dest = factory.createCargoHandlingFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getMainCargo() != null)
            dest.setMainCargo(helper.getGMLMarshaller().marshalCode(src.getMainCargo()));

        dest.setMooringFacility(src.getMooringFacility());

        if (src.getLiftableLoad() != null)
            dest.setLiftableLoad(helper.getGMLMarshaller().marshalMeasure(src.getLiftableLoad()));

        if (src.getAbility() != null)
            dest.setAbility(BigInteger.valueOf(src.getAbility()));

        if (src.getPackingName() != null)
            dest.setPackingName(helper.getGMLMarshaller().marshalCode(src.getPackingName()));

        if (src.getAcquisitionYear() != null)
            dest.setAcquisitionYear(marshaller.toCalendar(src.getAcquisitionYear()));

        if (src.getInnerTotalFloorArea() != null)
            dest.setInnerTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerTotalFloorArea()));

        if (src.getInnerOfSiteArea() != null)
            dest.setInnerOfSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerOfSiteArea()));

        if (src.getOuterOfTotalFloorArea() != null)
            dest.setOuterOfTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.getOuterSiteArea() != null)
            dest.setOuterSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterSiteArea()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortPassengerFacilityType marshalPortPassengerFacility(PortPassengerFacility src) {
        PortPassengerFacilityType dest = factory.createPortPassengerFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getAcquisitionYear() != null)
            dest.setAcquisitionYear(marshaller.toCalendar(src.getAcquisitionYear()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortStorageFacilityType marshalPortStorageFacility(PortStorageFacility src) {
        PortStorageFacilityType dest = factory.createPortStorageFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getInnerTotalFloorArea() != null)
            dest.setInnerTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerTotalFloorArea()));

        if (src.getInnerOfSiteArea() != null)
            dest.setInnerOfSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerOfSiteArea()));

        if (src.getOuterOfTotalFloorArea() != null)
            dest.setOuterOfTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.getOuterSiteArea() != null)
            dest.setOuterSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterSiteArea()));

        if (src.getMainCargo() != null)
            dest.setMainCargo(helper.getGMLMarshaller().marshalCode(src.getMainCargo()));

        if (src.getStorageCapacity() != null)
            dest.setStorageCapacity(BigInteger.valueOf(src.getStorageCapacity()));

        if (src.getStorageCapacityUnit() != null)
            dest.setStorageCapacityUnit(helper.getGMLMarshaller().marshalCode(src.getStorageCapacityUnit()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private ShipServiceFacilityType marshalShipServiceFacility(ShipServiceFacility src) {
        ShipServiceFacilityType dest = factory.createShipServiceFacilityType();
        marshalPortAttribute(src, dest);

        dest.setShipType(src.getShipType());

        if (src.getSupplyAbility() != null)
            dest.setSupplyAbility(BigInteger.valueOf(src.getSupplyAbility()));

        if (src.getSupplyAbilityUnit() != null)
            dest.setSupplyAbilityUnit(helper.getGMLMarshaller().marshalCode(src.getSupplyAbilityUnit()));

        dest.setMooringPlace(src.getMooringPlace());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getAcquisitionYear() != null)
            dest.setAcquisitionYear(marshaller.toCalendar(src.getAcquisitionYear()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortWasteTreatmentFacilityType marshalPortWasteTreatmentFacility(PortWasteTreatmentFacility src) {
        PortWasteTreatmentFacilityType dest = factory.createPortWasteTreatmentFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getPerimeter() != null)
            dest.setPerimeter(helper.getGMLMarshaller().marshalLength(src.getPerimeter()));

        if (src.getMainPartLength() != null)
            dest.setMainPartLength(helper.getGMLMarshaller().marshalLength(src.getMainPartLength()));

        if (src.getInnerShoreLength() != null)
            dest.setInnerShoreLength(helper.getGMLMarshaller().marshalLength(src.getInnerShoreLength()));

        if (src.getCeilingHeight() != null)
            dest.setCeilingHeight(helper.getGMLMarshaller().marshalLength(src.getCeilingHeight()));

        if (src.getWaveDissipatorLength() != null)
            dest.setWaveDissipatorLength(helper.getGMLMarshaller().marshalLength(src.getWaveDissipatorLength()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getWasteType() != null)
            dest.setWasteType(helper.getGMLMarshaller().marshalCode(src.getWasteType()));

        if (src.getPlannedDisposalArea() != null)
            dest.setPlannedDisposalArea(helper.getGMLMarshaller().marshalMeasure(src.getPlannedDisposalArea()));

        if (src.getPlannedDisposalAmount() != null)
            dest.setPlannedDisposalAmount(BigInteger.valueOf(src.getPlannedDisposalAmount()));

        if (src.getReceivingCapacity() != null)
            dest.setReceivingCapacity(BigInteger.valueOf(src.getReceivingCapacity()));

        dest.setShipType(src.getShipType());

        if (src.getUnitOfReceivingCapacity() != null)
            dest.setUnitOfReceivingCapacity(helper.getGMLMarshaller().marshalCode(src.getUnitOfReceivingCapacity()));

        if (src.getAcquisitionYear() != null)
            dest.setAcquisitionYear(marshaller.toCalendar(src.getAcquisitionYear()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortEnvironmentalImprovementFacilityType marshalPortEnvironmentalImprovementFacility(PortEnvironmentalImprovementFacility src) {
        PortEnvironmentalImprovementFacilityType dest = factory.createPortEnvironmentalImprovementFacilityType();
        marshalPortAttribute(src, dest);

        dest.setUsage(src.getUsage());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getTotalFoorArea() != null)
            dest.setTotalFoorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFoorArea()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortPollutionControlFacilityType marshalPortPollutionControlFacility(PortPollutionControlFacility src) {
        PortPollutionControlFacilityType dest = factory.createPortPollutionControlFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getCrossSectionalArea() != null)
            dest.setCrossSectionalArea(helper.getGMLMarshaller().marshalMeasure(src.getCrossSectionalArea()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getHeight() != null)
            dest.setHeight(helper.getGMLMarshaller().marshalLength(src.getHeight()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortWelfareFacilityType marshalPortWelfareFacility(PortWelfareFacility src) {
        PortWelfareFacilityType dest = factory.createPortWelfareFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private PortManagementFacilityType marshalPortManagementFacility(PortManagementFacility src) {
        PortManagementFacilityType dest = factory.createPortManagementFacilityType();
        marshalPortAttribute(src, dest);

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getNumberOfShipTypes() != null)
            dest.setNumberOfShipTypes(BigInteger.valueOf(src.getNumberOfShipTypes()));

        if (src.getUnitOfShipType() != null)
            dest.setUnitOfShipType(helper.getGMLMarshaller().marshalCode(src.getUnitOfShipType()));

        if (src.getLoadingCapacity() != null)
            dest.setLoadingCapacity(BigInteger.valueOf(src.getLoadingCapacity()));

        if (src.getAcquisitionYear() != null)
            dest.setAcquisitionYear(marshaller.toCalendar(src.getAcquisitionYear()));

        dest.setUsage(src.getUsage());

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private CyberportMarinaAndPBSType marshalCyberportMarinaAndPBS(CyberportMarinaAndPBS src) {
        CyberportMarinaAndPBSType dest = factory.createCyberportMarinaAndPBSType();
        marshalPortAttribute(src, dest);

        if (src.getGeologicalType() != null)
            dest.setGeologicalType(helper.getGMLMarshaller().marshalCode(src.getGeologicalType()));

        dest.setObstructingStructures(src.getObstructingStructures());

        if (src.getMainPartLength() != null)
            dest.setMainPartLength(helper.getGMLMarshaller().marshalLength(src.getMainPartLength()));

        if (src.getTotalLength() != null)
            dest.setTotalLength(helper.getGMLMarshaller().marshalLength(src.getTotalLength()));

        if (src.getWaveDissipatorLength() != null)
            dest.setWaveDissipatorLength(helper.getGMLMarshaller().marshalLength(src.getWaveDissipatorLength()));

        if (src.getFacilityWidth() != null)
            dest.setFacilityWidth(helper.getGMLMarshaller().marshalLength(src.getFacilityWidth()));

        if (src.getApronWidth() != null)
            dest.setApronWidth(helper.getGMLMarshaller().marshalLength(src.getApronWidth()));

        dest.setRestrictionStructure(src.getRestrictionStructure());

        if (src.getPlannedDepth() != null)
            dest.setPlannedDepth(helper.getGMLMarshaller().marshalLength(src.getPlannedDepth()));

        if (src.getCurrentDepth() != null)
            dest.setCurrentDepth(helper.getGMLMarshaller().marshalLength(src.getCurrentDepth()));

        if (src.getInnerTotalFloorArea() != null)
            dest.setInnerTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerTotalFloorArea()));

        if (src.getInnerOfSiteArea() != null)
            dest.setInnerOfSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getInnerOfSiteArea()));

        if (src.getOuterOfTotalFloorArea() != null)
            dest.setOuterOfTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.getOuterSiteArea() != null)
            dest.setOuterSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getOuterSiteArea()));

        if (src.getCeilingHeight() != null)
            dest.setCeilingHeight(helper.getGMLMarshaller().marshalLength(src.getCeilingHeight()));

        if (src.getGravityResistant() != null)
            dest.setGravityResistant(helper.getGMLMarshaller().marshalMeasure(src.getGravityResistant()));

        if (src.getForm() != null)
            dest.setForm(helper.getGMLMarshaller().marshalCode(src.getForm()));

        if (src.getAreaType() != null)
            dest.setAreaType(helper.getGMLMarshaller().marshalCode(src.getAreaType()));

        if (src.getMainVessels() != null)
            dest.setMainVessels(helper.getGMLMarshaller().marshalCode(src.getMainVessels()));

        dest.setIsDredged(src.getIsDredged());

        if (src.getMooringPostWeight() != null)
            dest.setMooringPostWeight(helper.getGMLMarshaller().marshalMeasure(src.getMooringPostWeight()));

        if (src.getNumberOfMooringPosts() != null)
            dest.setNumberOfMooringPosts(BigInteger.valueOf(src.getNumberOfMooringPosts()));

        if (src.getResistantMaterial() != null)
            dest.setResistantMaterial(BigInteger.valueOf(src.getResistantMaterial()));

        if (src.getLighting() != null)
            dest.setLighting(BigInteger.valueOf(src.getLighting()));

        if (src.getStairs() != null)
            dest.setStairs(BigInteger.valueOf(src.getStairs()));

        dest.setLifesaving(src.getLifesaving());

        if (src.getLifesavingNumber() != null)
            dest.setLifesavingNumber(BigInteger.valueOf(src.getLifesavingNumber()));

        if (src.getBumper() != null)
            dest.setBumper(helper.getGMLMarshaller().marshalLength(src.getBumper()));

        if (src.getNumberOfVehicleBoardings() != null)
            dest.setNumberOfVehicleBoardings(BigInteger.valueOf(src.getNumberOfVehicleBoardings()));

        if (src.getVehicleBoardingWidth() != null)
            dest.setVehicleBoardingWidth(helper.getGMLMarshaller().marshalLength(src.getVehicleBoardingWidth()));

        dest.setShipType(src.getShipType());

        if (src.getNumberOfSeats() != null)
            dest.setNumberOfSeats(BigInteger.valueOf(src.getNumberOfSeats()));

        if (src.getMainCargo() != null)
            dest.setMainCargo(helper.getGMLMarshaller().marshalCode(src.getMainCargo()));

        if (src.getStorageCapacity() != null)
            dest.setStorageCapacity(BigInteger.valueOf(src.getStorageCapacity()));

        if (src.getStorageCapacityUnit() != null)
            dest.setStorageCapacityUnit(helper.getGMLMarshaller().marshalCode(src.getStorageCapacityUnit()));

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        if (src.getTotalCost() != null)
            dest.setTotalCost(BigInteger.valueOf(src.getTotalCost()));

        if (src.getSubsidy() != null)
            dest.setSubsidy(BigInteger.valueOf(src.getSubsidy()));

        dest.setNote(src.getNote());

        return dest;
    }

    private void marshalFishingPortAttribute(FishingPortAttribute src, FishingPortAttributeType dest) {
        marshalFacilityAttribute(src, dest);
    }

    private FishingPortFacilityType marshalFishingPortFacility(FishingPortFacility src) {
        FishingPortFacilityType dest = factory.createFishingPortFacilityType();
        marshalFishingPortAttribute(src, dest);

        if (src.getFacilityDetailsType() != null)
            dest.setFacilityDetailsType(helper.getGMLMarshaller().marshalCode(src.getFacilityDetailsType()));

        dest.setPortName(src.getPortName());

        if (src.getPortType() != null)
            dest.setPortType(helper.getGMLMarshaller().marshalCode(src.getPortType()));

        dest.setAddress(src.getAddress());
        dest.setDesignatedArea(src.getDesignatedArea());

        for (String designation : src.getDesignation())
            dest.getDesignation().add(designation);

        for (String designatedAdministrator : src.getDesignatedAdministrator())
            dest.getDesignatedAdministrator().add(designatedAdministrator);

        for (String referenceNumber : src.getReferenceNumber())
            dest.getReferenceNumber().add(referenceNumber);

        if (src.getGrantType() != null)
            dest.setGrantType(helper.getGMLMarshaller().marshalCode(src.getGrantType()));

        dest.setAdministrator(src.getAdministrator());
        dest.setFacilityManager(src.getFacilityManager());

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getMainMaterial() != null)
            dest.setMainMaterial(helper.getGMLMarshaller().marshalCode(src.getMainMaterial()));

        dest.setOtherStructure(src.getOtherStructure());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getCeilingHeight() != null)
            dest.setCeilingHeight(helper.getGMLMarshaller().marshalLength(src.getCeilingHeight()));

        if (src.getDepth() != null)
            dest.setDepth(helper.getGMLMarshaller().marshalLength(src.getDepth()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        dest.setOtherSizeDescription(src.getOtherSizeDescription());

        if (src.getDateOfConstructionOrAcquisition() != null)
            dest.setDateOfConstructionOrAcquisition(marshaller.toCalendar(src.getDateOfConstructionOrAcquisition()));

        if (src.getCost() != null)
            dest.setCost(BigInteger.valueOf(src.getCost()));

        dest.setNote(src.getNote());

        return dest;
    }

    private FishingPortCapacityType marshalFishingPortCapacity(FishingPortCapacity src) {
        FishingPortCapacityType dest = factory.createFishingPortCapacityType();
        marshalFishingPortAttribute(src, dest);

        dest.setCapacity(src.getCapacity());

        if (src.getWeightCapacity() != null)
            dest.setWeightCapacity(helper.getGMLMarshaller().marshalMeasure(src.getWeightCapacity()));

        if (src.getHullForm() != null)
            dest.setHullForm(BigInteger.valueOf(src.getHullForm()));

        if (src.getShipNumber() != null)
            dest.setShipNumber(BigInteger.valueOf(src.getShipNumber()));

        if (src.getWaterDepth2m() != null)
            dest.setWaterDepth2M(helper.getGMLMarshaller().marshalMeasure(src.getWaterDepth2m()));

        if (src.getWaterDepth23m() != null)
            dest.setWaterDepth23M(helper.getGMLMarshaller().marshalMeasure(src.getWaterDepth23m()));

        if (src.getWaterDepth36m() != null)
            dest.setWaterDepth36M(helper.getGMLMarshaller().marshalMeasure(src.getWaterDepth36m()));

        if (src.getWaterDepth6m() != null)
            dest.setWaterDepth6M(helper.getGMLMarshaller().marshalMeasure(src.getWaterDepth6m()));

        if (src.getHeightAboveAWL() != null)
            dest.setHeightAboveAWL(helper.getGMLMarshaller().marshalLength(src.getHeightAboveAWL()));

        if (src.getHeightOnFoundations() != null)
            dest.setHeightOnFoundations(helper.getGMLMarshaller().marshalLength(src.getHeightOnFoundations()));

        if (src.getLuminousRange() != null)
            dest.setLuminousRange(helper.getGMLMarshaller().marshalLength(src.getLuminousRange()));

        dest.setLuminousColor(src.getLuminousColor());

        if (src.getCandlePower() != null)
            dest.setCandlePower(BigInteger.valueOf(src.getCandlePower()));

        dest.setLightType(src.getLightType());
        dest.setPeriod(src.getPeriod());

        if (src.getMaximumGroundingWeight() != null)
            dest.setMaximumGroundingWeight(BigInteger.valueOf(src.getMaximumGroundingWeight()));

        if (src.getHandleablePower() != null)
            dest.setHandleablePower(BigInteger.valueOf(src.getHandleablePower()));

        if (src.getMaximumWaterSupply() != null)
            dest.setMaximumWaterSupply(BigInteger.valueOf(src.getMaximumWaterSupply()));

        dest.setMaximumRefueling(src.getMaximumRefueling());

        if (src.getPeople() != null)
            dest.setPeople(BigInteger.valueOf(src.getPeople()));

        dest.setOther(src.getOther());

        return dest;
    }

    private MaintenanceHistoryAttributeType marshalMaintenanceHistoryAttribute(MaintenanceHistoryAttribute src) {
        MaintenanceHistoryAttributeType dest = factory.createMaintenanceHistoryAttributeType();
        marshalFacilityAttribute(src, dest);

        if (src.getMaintenanceType() != null)
            dest.setMaintenanceType(helper.getGMLMarshaller().marshalCode(src.getMaintenanceType()));

        if (src.getMaintenanceFiscalYear() != null)
            dest.setMaintenanceFiscalYear(marshaller.toCalendar(src.getMaintenanceFiscalYear()));

        if (src.getMaintenanceYear() != null)
            dest.setMaintenanceYear(marshaller.toCalendar(src.getMaintenanceYear()));

        if (src.getMaintenanceDate() != null)
            dest.setMaintenanceDate(marshaller.toCalendar(src.getMaintenanceDate()));

        dest.setStatus(src.getStatus());

        if (src.getDescription() != null)
            dest.setDescription(helper.getGMLMarshaller().marshalStringOrRef(src.getDescription()));

        return dest;
    }

    private FacilityAttributePropertyType marshalFacilityAttributeProperty(FacilityAttributeProperty src) {
        FacilityAttributePropertyType dest = factory.createFacilityAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof FacilityAttributeType)
                dest.setFacilityAttribute((JAXBElement<? extends FacilityAttributeType>) elem);
        }

        return dest;
    }

    private BridgeStructureAttributeType marshalBridgeStructureAttribute(BridgeStructureAttribute src) {
        BridgeStructureAttributeType dest = factory.createBridgeStructureAttributeType();

        if (src.getMaterial() != null)
            dest.setMaterial(helper.getGMLMarshaller().marshalCode(src.getMaterial()));

        if (src.getBridgeType() != null)
            dest.setBridgeType(helper.getGMLMarshaller().marshalCode(src.getBridgeType()));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getWeightRestriction() != null)
            dest.setWeightRestriction(helper.getGMLMarshaller().marshalMeasure(src.getWeightRestriction()));

        if (src.getHeightRestriction() != null)
            dest.setHeightRestriction(helper.getGMLMarshaller().marshalLength(src.getHeightRestriction()));

        if (src.getWidthRestriction() != null)
            dest.setWidthRestriction(helper.getGMLMarshaller().marshalLength(src.getWidthRestriction()));

        if (src.getUnderGirderHeight() != null)
            dest.setUnderGirderHeight(helper.getGMLMarshaller().marshalLength(src.getUnderGirderHeight()));

        if (src.getSlopeType() != null)
            dest.setSlopeType(helper.getGMLMarshaller().marshalCode(src.getSlopeType()));

        dest.setEscalator(src.getEscalator());

        return dest;
    }

    private BridgeStructureAttributePropertyType marshalBridgeStructureAttributeProperty(BridgeStructureAttributeProperty src) {
        BridgeStructureAttributePropertyType dest = factory.createBridgeStructureAttributePropertyType();

        if (src.isSetObject())
            dest.setBridgeStructureAttribute(marshalBridgeStructureAttribute(src.getObject()));

        return dest;
    }

    private BridgeFunctionalAttributeType marshalBridgeFunctionalAttribute(BridgeFunctionalAttribute src) {
        BridgeFunctionalAttributeType dest = factory.createBridgeFunctionalAttributeType();

        if (src.getDirectionType() != null)
            dest.setDirectionType(helper.getGMLMarshaller().marshalCode(src.getDirectionType()));

        if (src.getUserType() != null)
            dest.setUserType(helper.getGMLMarshaller().marshalCode(src.getUserType()));

        return dest;
    }

    private BridgeFunctionalAttributePropertyType marshalBridgeFunctionalAttributeProperty(BridgeFunctionalAttributeProperty src) {
        BridgeFunctionalAttributePropertyType dest = factory.createBridgeFunctionalAttributePropertyType();

        if (src.isSetObject())
            dest.setBridgeFunctionalAttribute(marshalBridgeFunctionalAttribute(src.getObject()));

        return dest;
    }

    private ConstructionRiskAssessmentAttributeType marshalConstructionRiskAssessmentAttribute(ConstructionRiskAssessmentAttribute src) {
        ConstructionRiskAssessmentAttributeType dest = factory.createConstructionRiskAssessmentAttributeType();

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        if (src.getRiskType() != null)
            dest.setRiskType(helper.getGMLMarshaller().marshalCode(src.getRiskType()));

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        if (src.getReferenceDate() != null)
            dest.setReferenceDate(marshaller.toCalendar(src.getReferenceDate()));

        return dest;
    }

    private ConstructionRiskAssessmentAttributePropertyType marshalConstructionRiskAssessmentAttributeProperty(ConstructionRiskAssessmentAttributeProperty src) {
        ConstructionRiskAssessmentAttributePropertyType dest = factory.createConstructionRiskAssessmentAttributePropertyType();

        if (src.isSetObject())
            dest.setConstructionRiskAssessmentAttribute(marshalConstructionRiskAssessmentAttribute(src.getObject()));

        return dest;
    }

    private void marshalDisasterRiskAttribute(DisasterRiskAttribute src, DisasterRiskAttributeType dest) {
        if (src.getDescription() != null)
            dest.setDescription(helper.getGMLMarshaller().marshalCode(src.getDescription()));
    }

    private void marshalFloodingRiskAttribute(FloodingRiskAttribute src, FloodingRiskAttributeType dest) {
        marshalDisasterRiskAttribute(src, dest);

        if (src.getRank() != null)
            dest.setRank(helper.getGMLMarshaller().marshalCode(src.getRank()));

        if (src.getRankOrg() != null)
            dest.setRankOrg(helper.getGMLMarshaller().marshalCode(src.getRankOrg()));

        if (src.getDepth() != null)
            dest.setDepth(helper.getGMLMarshaller().marshalLength(src.getDepth()));
    }

    private RiverFloodingRiskAttributeType marshalRiverFloodingRiskAttribute(RiverFloodingRiskAttribute src) {
        RiverFloodingRiskAttributeType dest = factory.createRiverFloodingRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        if (src.getScale() != null)
            dest.setScale(helper.getGMLMarshaller().marshalCode(src.getScale()));

        if (src.getDuration() != null)
            dest.setDuration(helper.getGMLMarshaller().marshalMeasure(src.getDuration()));

        return dest;
    }

    private TsunamiRiskAttributeType marshalTsunamiRiskAttribute(TsunamiRiskAttribute src) {
        TsunamiRiskAttributeType dest = factory.createTsunamiRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private InlandFloodingRiskAttributeType marshalInlandFloodingRiskAttribute(InlandFloodingRiskAttribute src) {
        InlandFloodingRiskAttributeType dest = factory.createInlandFloodingRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private HighTideRiskAttributeType marshalHighTideRiskAttribute(HighTideRiskAttribute src) {
        HighTideRiskAttributeType dest = factory.createHighTideRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private LandSlideRiskAttributeType marshalLandSlideRiskAttribute(LandSlideRiskAttribute src) {
        LandSlideRiskAttributeType dest = factory.createLandSlideRiskAttributeType();
        marshalDisasterRiskAttribute(src, dest);

        if (src.getAreaType() != null)
            dest.setAreaType(helper.getGMLMarshaller().marshalCode(src.getAreaType()));

        return dest;
    }

    private DisasterRiskAttributePropertyType marshalDisasterRiskAttributeProperty(DisasterRiskAttributeProperty src) {
        DisasterRiskAttributePropertyType dest = factory.createDisasterRiskAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof DisasterRiskAttributeType)
                dest.setDisasterRiskAttribute((JAXBElement<? extends DisasterRiskAttributeType>) elem);
        }

        return dest;
    }

    private void marshalDmAttribute(DmAttribute src, DmAttributeType dest) {
        if (src.getDmCode() != null)
            dest.setDmCode(helper.getGMLMarshaller().marshalCode(src.getDmCode()));

        if (src.getMeshCode() != null)
            dest.setMeshCode(helper.getGMLMarshaller().marshalCode(src.getMeshCode()));

        if (src.getDmElement() != null)
            dest.setDmElement(marshalDmElementProperty(src.getDmElement()));
    }

    private DmGeometricAttributeType marshalDmGeometricAttribute(DmGeometricAttribute src) {
        DmGeometricAttributeType dest = factory.createDmGeometricAttributeType();
        marshalDmAttribute(src, dest);

        if (src.getGeometryType() != null)
            dest.setGeometryType(helper.getGMLMarshaller().marshalCode(src.getGeometryType()));

        if (src.getMapLevel() != null)
            dest.setMapLevel(helper.getGMLMarshaller().marshalCode(src.getMapLevel()));

        if (src.getShapeType() != null)
            dest.setShapeType(helper.getGMLMarshaller().marshalCode(src.getShapeType()));

        dest.setVisibility(src.getVisibility());
        dest.setIs3D(src.getIs3d());
        dest.setIsInstallation(src.getIsInstallation());
        dest.setIsEdited(src.getIsEdited());
        dest.setIsSupplementarySymbol(src.getIsSupplementarySymbol());
        dest.setAngle(src.getAngle());

        if (src.getElevation() != null)
            dest.setElevation(helper.getGMLMarshaller().marshalLength(src.getElevation()));

        if (src.getLod0Geometry() != null)
            dest.setLod0Geometry(helper.getGMLMarshaller().marshalGeometryProperty(src.getLod0Geometry()));

        return dest;
    }

    private DmAnnotationType marshalDmAnnotation(DmAnnotation src) {
        DmAnnotationType dest = factory.createDmAnnotationType();
        marshalDmAttribute(src, dest);

        if (src.getGeometryType() != null)
            dest.setGeometryType(helper.getGMLMarshaller().marshalCode(src.getGeometryType()));

        if (src.getShapeType() != null)
            dest.setShapeType(helper.getGMLMarshaller().marshalCode(src.getShapeType()));

        dest.setLabel(src.getLabel());

        if (src.getIsVertical() != null)
            dest.setIsVertical(src.getIsVertical());

        if (src.getSize() != null)
            dest.setSize(BigInteger.valueOf(src.getSize()));

        if (src.getOrientation() != null)
            dest.setOrientation(BigInteger.valueOf(src.getOrientation()));

        if (src.getLinewidth() != null)
            dest.setLinewidth(BigInteger.valueOf(src.getLinewidth()));

        if (src.getSpacing() != null)
            dest.setSpacing(BigInteger.valueOf(src.getSpacing()));

        if (src.getLod0anchorPoint() != null)
            dest.setLod0AnchorPoint(helper.getGMLMarshaller().marshalGeometryProperty(src.getLod0anchorPoint()));

        return dest;
    }

    private DmAttributePropertyType marshalDmAttributeProperty(DmAttributeProperty src) {
        DmAttributePropertyType dest = factory.createDmAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof DmAttributeType)
                dest.setDmAttribute((JAXBElement<? extends DmAttributeType>) elem);
        }

        return dest;
    }

    private DmElementType marshalDmElement(DmElement src) {
        DmElementType dest = factory.createDmElementType();

        if (src.getLocationType() != null)
            dest.setLocationType(helper.getGMLMarshaller().marshalCode(src.getLocationType()));

        if (src.getInfoType() != null)
            dest.setInfoType(helper.getGMLMarshaller().marshalCode(src.getInfoType()));

        dest.setElementKey(src.getElementKey());
        dest.setHierarchyLevel(src.getHierarchyLevel());

        if (src.getDataType() != null)
            dest.setDataType(helper.getGMLMarshaller().marshalCode(src.getDataType()));

        if (src.getAnnotationType() != null)
            dest.setAnnotationType(helper.getGMLMarshaller().marshalCode(src.getAnnotationType()));

        if (src.getPrecisionType() != null)
            dest.setPrecisionType(helper.getGMLMarshaller().marshalCode(src.getPrecisionType()));

        if (src.getDislocationType() != null)
            dest.setDislocationType(helper.getGMLMarshaller().marshalCode(src.getDislocationType()));

        if (src.getBreakType() != null)
            dest.setBreakType(helper.getGMLMarshaller().marshalCode(src.getBreakType()));

        dest.setAttributeValue(src.getAttributeValue());

        if (src.getAttributeType() != null)
            dest.setAttributeType(helper.getGMLMarshaller().marshalCode(src.getAttributeType()));

        dest.setAttributeValueType(src.getAttributeValueType());

        if (src.getCreationDate() != null)
            dest.setCreationDate(marshaller.toCalendar(src.getCreationDate()));

        if (src.getUpdateDate() != null)
            dest.setUpdateDate(marshaller.toCalendar(src.getUpdateDate()));

        if (src.getTerminationDate() != null)
            dest.setTerminationDate(marshaller.toCalendar(src.getTerminationDate()));

        dest.setFreeSpace(src.getFreeSpace());

        return dest;
    }

    private DmElementPropertyType marshalDmElementProperty(DmElementProperty src) {
        DmElementPropertyType dest = factory.createDmElementPropertyType();

        if (src.isSetObject())
            dest.setDmElement(marshalDmElement(src.getObject()));

        return dest;
    }

    private ConstructionDataQualityAttributeType marshalConstructionDataQualityAttribute(ConstructionDataQualityAttribute src) {
        ConstructionDataQualityAttributeType dest = factory.createConstructionDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        dest.setDataAcquisition(src.getDataAcquisition());

        if (src.getPhotoScale() != null)
            dest.setPhotoScale(BigInteger.valueOf(src.getPhotoScale()));

        if (src.getLod1HeightType() != null)
            dest.setLod1HeightType(helper.getGMLMarshaller().marshalCode(src.getLod1HeightType()));

        for (Code lodType : src.getLodType())
            dest.getLodType().add(helper.getGMLMarshaller().marshalCode(lodType));

        return dest;
    }

    private ConstructionDataQualityAttributePropertyType marshalConstructionDataQualityAttributeProperty(ConstructionDataQualityAttributeProperty src) {
        ConstructionDataQualityAttributePropertyType dest = factory.createConstructionDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setConstructionDataQualityAttribute(marshalConstructionDataQualityAttribute(src.getObject()));

        return dest;
    }

    private TransportationDataQualityAttributeType marshalTransportationDataQualityAttribute(TransportationDataQualityAttribute src) {
        TransportationDataQualityAttributeType dest = factory.createTransportationDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        if (src.getLodType() != null)
            dest.setLodType(helper.getGMLMarshaller().marshalCode(src.getLodType()));

        return dest;
    }

    private TransportationDataQualityAttributePropertyType marshalTransportationDataQualityAttributeProperty(TransportationDataQualityAttributeProperty src) {
        TransportationDataQualityAttributePropertyType dest = factory.createTransportationDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setTransportationDataQualityAttribute(marshalTransportationDataQualityAttribute(src.getObject()));

        return dest;
    }

    private TunnelStructureAttributeType marshalTunnelStructureAttribute(TunnelStructureAttribute src) {
        TunnelStructureAttributeType dest = factory.createTunnelStructureAttributeType();

        if (src.getTunnelType() != null)
            dest.setTunnelType(helper.getGMLMarshaller().marshalCode(src.getTunnelType()));

        if (src.getTunnelSubtype() != null)
            dest.setTunnelSubtype(helper.getGMLMarshaller().marshalCode(src.getTunnelSubtype()));

        for (Code mouthType : src.getMouthType())
            dest.getMouthType().add(helper.getGMLMarshaller().marshalCode(mouthType));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getInnerHeight() != null)
            dest.setInnerHeight(helper.getGMLMarshaller().marshalLength(src.getInnerHeight()));

        if (src.getEffectiveHeight() != null)
            dest.setEffectiveHeight(helper.getGMLMarshaller().marshalLength(src.getEffectiveHeight()));

        if (src.getSlopeType() != null)
            dest.setSlopeType(helper.getGMLMarshaller().marshalCode(src.getSlopeType()));

        return dest;
    }

    private TunnelStructureAttributePropertyType marshalTunnelStructureAttributeProperty(TunnelStructureAttributeProperty src) {
        TunnelStructureAttributePropertyType dest = factory.createTunnelStructureAttributePropertyType();

        if (src.isSetObject())
            dest.setTunnelStructureAttribute(marshalTunnelStructureAttribute(src.getObject()));

        return dest;
    }

    private TunnelFunctionalAttributeType marshalTunnelFunctionalAttribute(TunnelFunctionalAttribute src) {
        TunnelFunctionalAttributeType dest = factory.createTunnelFunctionalAttributeType();

        if (src.getDirectionType() != null)
            dest.setDirectionType(helper.getGMLMarshaller().marshalCode(src.getDirectionType()));

        if (src.getUserType() != null)
            dest.setUserType(helper.getGMLMarshaller().marshalCode(src.getUserType()));

        return dest;
    }

    private TunnelFunctionalAttributePropertyType marshalTunnelFunctionalAttributeProperty(TunnelFunctionalAttributeProperty src) {
        TunnelFunctionalAttributePropertyType dest = factory.createTunnelFunctionalAttributePropertyType();

        if (src.isSetObject())
            dest.setTunnelFunctionalAttribute(marshalTunnelFunctionalAttribute(src.getObject()));

        return dest;
    }

    private RailwayRouteAttributeType marshalRailwayRouteAttribute(RailwayRouteAttribute src) {
        RailwayRouteAttributeType dest = factory.createRailwayRouteAttributeType();

        if (src.getOperatorType() != null)
            dest.setOperatorType(helper.getGMLMarshaller().marshalCode(src.getOperatorType()));

        dest.setOperator(src.getOperator());

        for (String alternativeName : src.getAlternativeName())
            dest.getAlternativeName().add(alternativeName);

        if (src.getRailwayType() != null)
            dest.setRailwayType(helper.getGMLMarshaller().marshalCode(src.getRailwayType()));

        dest.setStartStation(src.getStartStation());
        dest.setEndStation(src.getEndStation());

        return dest;
    }

    private RailwayRouteAttributePropertyType marshalRailwayRouteAttributeProperty(RailwayRouteAttributeProperty src) {
        RailwayRouteAttributePropertyType dest = factory.createRailwayRouteAttributePropertyType();

        if (src.isSetObject())
            dest.setRailwayRouteAttribute(marshalRailwayRouteAttribute(src.getObject()));

        return dest;
    }

    private RailwayTrackAttributeType marshalRailwayTrackAttribute(RailwayTrackAttribute src) {
        RailwayTrackAttributeType dest = factory.createRailwayTrackAttributeType();

        dest.setRouteName(src.getRouteName());

        if (src.getDirectionType() != null)
            dest.setDirectionType(helper.getGMLMarshaller().marshalCode(src.getDirectionType()));

        if (src.getTrackType() != null)
            dest.setTrackType(helper.getGMLMarshaller().marshalCode(src.getTrackType()));

        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());

        if (src.getAlignmentType() != null)
            dest.setAlignmentType(helper.getGMLMarshaller().marshalCode(src.getAlignmentType()));

        if (src.getLod2Network() != null)
            dest.setLod2Network(helper.getGMLMarshaller().marshalGeometricComplexProperty(src.getLod2Network()));

        if (src.getLod3Network() != null)
            dest.setLod3Network(helper.getGMLMarshaller().marshalGeometricComplexProperty(src.getLod3Network()));

        for (ControlPointProperty controlPoint : src.getControlPoint())
            dest.getControlPoint().add(marshalControlPointProperty(controlPoint));

        return dest;
    }

    private RailwayTrackAttributePropertyType marshalRailwayTrackAttributeProperty(RailwayTrackAttributeProperty src) {
        RailwayTrackAttributePropertyType dest = factory.createRailwayTrackAttributePropertyType();

        if (src.isSetObject())
            dest.setRailwayTrackAttribute(marshalRailwayTrackAttribute(src.getObject()));

        return dest;
    }

    private ControlPointType marshalControlPoint(ControlPoint src) {
        ControlPointType dest = factory.createControlPointType();

        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());

        if (src.getFunction() != null)
            dest.setFunction(helper.getGMLMarshaller().marshalCode(src.getFunction()));

        if (src.getStartPoint() != null)
            dest.setStartPoint(helper.getGMLMarshaller().marshalPointProperty(src.getStartPoint()));

        if (src.getEndPoint() != null)
            dest.setEndPoint(helper.getGMLMarshaller().marshalPointProperty(src.getEndPoint()));

        return dest;
    }

    private ControlPointPropertyType marshalControlPointProperty(ControlPointProperty src) {
        ControlPointPropertyType dest = factory.createControlPointPropertyType();

        if (src.isSetObject())
            dest.setControlPoint(marshalControlPoint(src.getObject()));

        return dest;
    }

    private TrackAttributeType marshalTrackAttribute(TrackAttribute src) {
        TrackAttributeType dest = factory.createTrackAttributeType();

        for (String alternativeName : src.getAlternativeName())
            dest.getAlternativeName().add(alternativeName);

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        if (src.getRelativeLevel() != null)
            dest.setRelativeLevel(BigInteger.valueOf(src.getRelativeLevel()));

        if (src.getWidthType() != null)
            dest.setWidthType(helper.getGMLMarshaller().marshalCode(src.getWidthType()));

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        dest.setIsTollRoad(src.getIsTollRoad());

        if (src.getSeparator() != null)
            dest.setSeparator(helper.getGMLMarshaller().marshalLength(src.getSeparator()));

        return dest;
    }

    private TrackAttributePropertyType marshalTrackAttributeProperty(TrackAttributeProperty src) {
        TrackAttributePropertyType dest = factory.createTrackAttributePropertyType();

        if (src.isSetObject())
            dest.setTrackAttribute(marshalTrackAttribute(src.getObject()));

        return dest;
    }

    private void marshalSquareUrbanPlanAttribute(SquareUrbanPlanAttribute src, SquareUrbanPlanAttributeType dest) {
        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        dest.setUrbanPlanningAreaName(src.getUrbanPlanningAreaName());

        for (String enforcer : src.getEnforcer())
            dest.getEnforcer().add(enforcer);

        if (src.getDateOfDecision() != null)
            dest.setDateOfDecision(marshaller.toCalendar(src.getDateOfDecision()));

        for (LocalDate dateOfRevision : src.getDateOfRevision())
            dest.getDateOfRevision().add(marshaller.toCalendar(dateOfRevision));

        if (src.getAreaPlanned() != null)
            dest.setAreaPlanned(helper.getGMLMarshaller().marshalMeasure(src.getAreaPlanned()));

        if (src.getAreaInService() != null)
            dest.setAreaInService(helper.getGMLMarshaller().marshalMeasure(src.getAreaInService()));

        dest.setRemarks(src.getRemarks());

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        if (src.getAreaImproved() != null)
            dest.setAreaImproved(helper.getGMLMarshaller().marshalMeasure(src.getAreaImproved()));

        if (src.getAreaCompleted() != null)
            dest.setAreaCompleted(helper.getGMLMarshaller().marshalMeasure(src.getAreaCompleted()));

        if (src.getProjectStartDate() != null)
            dest.setProjectStartDate(marshaller.toCalendar(src.getProjectStartDate()));

        if (src.getProjectEndDate() != null)
            dest.setProjectEndDate(marshaller.toCalendar(src.getProjectEndDate()));

        dest.setIsCompleted(src.getIsCompleted());
        dest.setIsAuthorized(src.getIsAuthorized());
        dest.setPurpose(src.getPurpose());
        dest.setNote(src.getNote());
    }

    private SquareUrbanPlanAttributeType marshalSquareUrbanPlanAttribute(SquareUrbanPlanAttribute src) {
        SquareUrbanPlanAttributeType dest = factory.createSquareUrbanPlanAttributeType();
        marshalSquareUrbanPlanAttribute(src, dest);
        return dest;
    }

    private StationSquareAttributeType marshalStationSquareAttribute(StationSquareAttribute src) {
        StationSquareAttributeType dest = factory.createStationSquareAttributeType();
        marshalSquareUrbanPlanAttribute(src, dest);

        for (String station : src.getStation())
            dest.getStation().add(station);

        for (String route : src.getRoute())
            dest.getRoute().add(route);

        for (Code railwayType : src.getRailwayType())
            dest.getRailwayType().add(helper.getGMLMarshaller().marshalCode(railwayType));

        return dest;
    }

    private TerminalAttributeType marshalTerminalAttribute(TerminalAttribute src) {
        TerminalAttributeType dest = factory.createTerminalAttributeType();
        marshalSquareUrbanPlanAttribute(src, dest);

        if (src.getTerminalType() != null)
            dest.setTerminalType(helper.getGMLMarshaller().marshalCode(src.getTerminalType()));

        dest.setStructure(src.getStructure());

        if (src.getNumberOfBerthsPlanned() != null)
            dest.setNumberOfBerthsPlanned(BigInteger.valueOf(src.getNumberOfBerthsPlanned()));

        if (src.getNumberOfBerthsInService() != null)
            dest.setNumberOfBerthsInService(BigInteger.valueOf(src.getNumberOfBerthsInService()));

        if (src.getUserType() != null)
            dest.setUserType(helper.getGMLMarshaller().marshalCode(src.getUserType()));

        return dest;
    }

    private SquareUrbanPlanAttributePropertyType marshalSquareUrbanPlanAttributeProperty(SquareUrbanPlanAttributeProperty src) {
        SquareUrbanPlanAttributePropertyType dest = factory.createSquareUrbanPlanAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof SquareUrbanPlanAttributeType)
                dest.setSquareUrbanPlanAttribute((JAXBElement<? extends SquareUrbanPlanAttributeType>) elem);
        }

        return dest;
    }

    private void marshalIfcRoot(IfcRoot src, IfcRootType dest) {
        dest.setGlobalId(src.getGlobalId());
        dest.setName(src.getName());
        dest.setDescription(src.getDescription());
    }

    private void marshalIfcObjectDefinition(IfcObjectDefinition src, IfcObjectDefinitionType dest) {
        marshalIfcRoot(src, dest);
    }

    private void marshalIfcObject(IfcObject src, IfcObjectType dest) {
        marshalIfcObjectDefinition(src, dest);
        dest.setObjectType(src.getObjectType());
    }

    private void marshalIfcProduct(IfcProduct src, IfcProductType dest) {
        marshalIfcObject(src, dest);
    }

    private void marshalIfcSpatialStructureElement(IfcSpatialStructureElement src, IfcSpatialStructureElementType dest) {
        marshalIfcProduct(src, dest);

        dest.setLongName(src.getLongName());

        if (src.getCompositionType() != null)
            dest.setCompositionType(jp.geospatial.iur._3_0.uro.IfcElementCompositionEnum.fromValue(src.getCompositionType().value()));
    }

    private IfcBuildingType marshalIfcBuilding(IfcBuilding src) {
        IfcBuildingType dest = factory.createIfcBuildingType();
        marshalIfcSpatialStructureElement(src, dest);

        if (src.getElevationOfRefHeight() != null)
            dest.setElevationOfRefHeight(helper.getGMLMarshaller().marshalLength(src.getElevationOfRefHeight()));

        if (src.getElevationOfTerrain() != null)
            dest.setElevationOfTerrain(helper.getGMLMarshaller().marshalLength(src.getElevationOfTerrain()));

        if (src.getBuildingAddress() != null)
            dest.setBuildingAddress(helper.getCore200Marshaller().marshalAddressProperty(src.getBuildingAddress()));

        return dest;
    }

    private IfcSiteType marshalIfcSite(IfcSite src) {
        IfcSiteType dest = factory.createIfcSiteType();
        marshalIfcSpatialStructureElement(src, dest);

        dest.setRefLongitude(src.getRefLongitude());
        dest.setRefLatitude(src.getRefLatitude());

        if (src.getRefElevation() != null)
            dest.setRefElevation(helper.getGMLMarshaller().marshalLength(src.getRefElevation()));

        dest.setLandTitleNumber(src.getLandTitleNumber());

        if (src.getSiteAddress() != null)
            dest.setSiteAddress(helper.getCore200Marshaller().marshalAddressProperty(src.getSiteAddress()));

        return dest;
    }

    private IfcSpaceType marshalIfcSpace(IfcSpace src) {
        IfcSpaceType dest = factory.createIfcSpaceType();
        marshalIfcSpatialStructureElement(src, dest);

        if (src.getInteriorOrExteriorSpace() != null)
            dest.setInteriorOrExteriorSpace(jp.geospatial.iur._3_0.uro.IfcInternalOrExternalEnum.fromValue(src.getInteriorOrExteriorSpace().value()));

        if (src.getElevationWithFlooring() != null)
            dest.setElevationWithFlooring(helper.getGMLMarshaller().marshalLength(src.getElevationWithFlooring()));

        return dest;
    }

    private IfcBuildingStoreyType marshalIfcBuildingStorey(IfcBuildingStorey src) {
        IfcBuildingStoreyType dest = factory.createIfcBuildingStoreyType();
        marshalIfcSpatialStructureElement(src, dest);

        if (src.getElevation() != null)
            dest.setElevation(helper.getGMLMarshaller().marshalLength(src.getElevation()));

        return dest;
    }

    private void marshalIfcElement(IfcElement src, IfcElementType dest) {
        marshalIfcProduct(src, dest);
        dest.setTag(src.getTag());
    }

    private void marshalIfcBuildingElement(IfcBuildingElement src, IfcBuildingElementType dest) {
        marshalIfcElement(src, dest);

        if (src.getElementType() != null)
            dest.setElementType(helper.getGMLMarshaller().marshalCode(src.getElementType()));

        if (src.getPredefinedType() != null)
            dest.setPredefinedType(helper.getGMLMarshaller().marshalCode(src.getPredefinedType()));

        if (src.getShapeType() != null)
            dest.setShapeType(helper.getGMLMarshaller().marshalCode(src.getShapeType()));

        if (src.getNumberOfRiser() != null)
            dest.setNumberOfRiser(BigInteger.valueOf(src.getNumberOfRiser()));

        if (src.getNumberOfTreads() != null)
            dest.setNumberOfTreads(BigInteger.valueOf(src.getNumberOfTreads()));

        if (src.getRiserHeight() != null)
            dest.setRiserHeight(helper.getGMLMarshaller().marshalLength(src.getRiserHeight()));

        if (src.getTreadLength() != null)
            dest.setTreadLength(helper.getGMLMarshaller().marshalLength(src.getTreadLength()));

        if (src.getOperationType() != null)
            dest.setOperationType(jp.geospatial.iur._3_0.uro.IfcTransportElementTypeEnum.fromValue(src.getOperationType().value()));

        if (src.getCapacityByWeight() != null)
            dest.setCapacityByWeight(helper.getGMLMarshaller().marshalMeasure(src.getCapacityByWeight()));

        if (src.getCapacityByNumber() != null)
            dest.setCapacityByNumber(BigInteger.valueOf(src.getCapacityByNumber()));
    }

    private IfcBuildingElementType marshalIfcBuildingElement(IfcBuildingElement src) {
        IfcBuildingElementType dest = factory.createIfcBuildingElementType();
        marshalIfcBuildingElement(src, dest);
        return dest;
    }

    private void marshalIfcWall(IfcWall src, IfcWallType dest) {
        marshalIfcBuildingElement(src, dest);

        if (src.getNominalLength() != null)
            dest.setNominalLength(helper.getGMLMarshaller().marshalLength(src.getNominalLength()));

        if (src.getNominalWidth() != null)
            dest.setNominalWidth(helper.getGMLMarshaller().marshalLength(src.getNominalWidth()));

        if (src.getNominalHeight() != null)
            dest.setNominalHeight(helper.getGMLMarshaller().marshalLength(src.getNominalHeight()));

        if (src.getGrossFootPrintArea() != null)
            dest.setGrossFootPrintArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossFootPrintArea()));

        if (src.getNetFootPrintArea() != null)
            dest.setNetFootPrintArea(helper.getGMLMarshaller().marshalMeasure(src.getNetFootPrintArea()));

        if (src.getGrossSideArea() != null)
            dest.setGrossSideArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossSideArea()));

        if (src.getNetSideArea() != null)
            dest.setNetSideArea(helper.getGMLMarshaller().marshalMeasure(src.getNetSideArea()));

        if (src.getGrossSideAreaLeft() != null)
            dest.setGrossSideAreaLeft(helper.getGMLMarshaller().marshalMeasure(src.getGrossSideAreaLeft()));

        if (src.getNetSideAreaLeft() != null)
            dest.setNetSideAreaLeft(helper.getGMLMarshaller().marshalMeasure(src.getNetSideAreaLeft()));

        if (src.getGrossSideAreaRight() != null)
            dest.setGrossSideAreaRight(helper.getGMLMarshaller().marshalMeasure(src.getGrossSideAreaRight()));

        if (src.getNetSideAreaRight() != null)
            dest.setNetSideAreaRight(helper.getGMLMarshaller().marshalMeasure(src.getNetSideAreaRight()));

        if (src.getGrossVolume() != null)
            dest.setGrossVolume(helper.getGMLMarshaller().marshalMeasure(src.getGrossVolume()));

        if (src.getNetVolume() != null)
            dest.setNetVolume(helper.getGMLMarshaller().marshalMeasure(src.getNetVolume()));
    }

    private IfcWallType marshalIfcWall(IfcWall src) {
        IfcWallType dest = factory.createIfcWallType();
        marshalIfcWall(src, dest);
        return dest;
    }

    private IfcWallStandardCaseType marshalIfcWallStandardCase(IfcWallStandardCase src) {
        IfcWallStandardCaseType dest = factory.createIfcWallStandardCaseType();
        marshalIfcWall(src, dest);
        return dest;
    }

    private IfcCurtainWallType marshalIfcCurtainWall(IfcCurtainWall src) {
        IfcCurtainWallType dest = factory.createIfcCurtainWallType();
        marshalIfcBuildingElement(src, dest);
        return dest;
    }

    private IfcRoofType marshalIfcRoof(IfcRoof src) {
        IfcRoofType dest = factory.createIfcRoofType();
        marshalIfcBuildingElement(src, dest);
        return dest;
    }

    private IfcWindowType marshalIfcWindow(IfcWindow src) {
        IfcWindowType dest = factory.createIfcWindowType();
        marshalIfcBuildingElement(src, dest);

        if (src.getOverallHeight() != null)
            dest.setOverallHeight(helper.getGMLMarshaller().marshalLength(src.getOverallHeight()));

        if (src.getOverallWidth() != null)
            dest.setOverallWidth(helper.getGMLMarshaller().marshalLength(src.getOverallWidth()));

        return dest;
    }

    private IfcDoorType marshalIfcDoor(IfcDoor src) {
        IfcDoorType dest = factory.createIfcDoorType();
        marshalIfcBuildingElement(src, dest);

        if (src.getOverallHeight() != null)
            dest.setOverallHeight(helper.getGMLMarshaller().marshalLength(src.getOverallHeight()));

        if (src.getOverallWidth() != null)
            dest.setOverallWidth(helper.getGMLMarshaller().marshalLength(src.getOverallWidth()));

        return dest;
    }

    private IfcOpeningElementType marshalIfcOpeningElement(IfcOpeningElement src) {
        IfcOpeningElementType dest = factory.createIfcOpeningElementType();
        marshalIfcElement(src, dest);

        if (src.getNominalArea() != null)
            dest.setNominalArea(helper.getGMLMarshaller().marshalMeasure(src.getNominalArea()));

        if (src.getNominalVolume() != null)
            dest.setNominalVolume(helper.getGMLMarshaller().marshalMeasure(src.getNominalVolume()));

        return dest;
    }

    private IfcFurnishingElementType marshalIfcFurnishingElement(IfcFurnishingElement src) {
        IfcFurnishingElementType dest = factory.createIfcFurnishingElementType();
        marshalIfcElement(src, dest);
        return dest;
    }

    private IfcProjectType marshalIfcProject(IfcProject src) {
        IfcProjectType dest = factory.createIfcProjectType();
        marshalIfcObject(src, dest);

        dest.setLongName(src.getLongName());
        dest.setPhase(src.getPhase());

        if (src.getRepresentationContexts() != null)
            dest.setRepresentationContexts(marshalIfcGeometricRepresentationContextProperty(src.getRepresentationContexts()));

        for (IfcUnitProperty unitsInContext : src.getUnitsInContext())
            dest.getUnitsInContext().add(marshalIfcUnitProperty(unitsInContext));

        return dest;
    }

    private IfcGeometricRepresentationContextType marshalIfcGeometricRepresentationContext(IfcGeometricRepresentationContext src) {
        IfcGeometricRepresentationContextType dest = factory.createIfcGeometricRepresentationContextType();

        dest.setContextIdentifier(src.getContextIdentifier());
        dest.setContextType(src.getContextType());

        if (src.getCoordinateSpaceDimension() != null)
            dest.setCoordinateSpaceDimension(BigInteger.valueOf(src.getCoordinateSpaceDimension()));

        dest.setPrecision(src.getPrecision());

        if (src.getWorldCoordinateSystem() != null)
            dest.setWorldCoordinateSystem(marshalIfcAxis2Placement3DProperty(src.getWorldCoordinateSystem()));

        for (Double trueNorth : src.getTrueNorth())
            dest.getTrueNorth().add(trueNorth);

        return dest;
    }

    private IfcGeometricRepresentationContextPropertyType marshalIfcGeometricRepresentationContextProperty(IfcGeometricRepresentationContextProperty src) {
        IfcGeometricRepresentationContextPropertyType dest = factory.createIfcGeometricRepresentationContextPropertyType();

        if (src.isSetObject())
            dest.setIfcGeometricRepresentationContext(marshalIfcGeometricRepresentationContext(src.getObject()));

        return dest;
    }

    private IfcAxis2Placement3DType marshalIfcAxis2Placement3D(IfcAxis2Placement3D src) {
        IfcAxis2Placement3DType dest = factory.createIfcAxis2Placement3DType();

        if (src.getLocation() != null)
            dest.setLocation(helper.getGMLMarshaller().marshalPointProperty(src.getLocation()));

        for (Double axis : src.getAxis())
            dest.getAxis().add(axis);

        for (Double refDirection : src.getRefDirection())
            dest.getRefDirection().add(refDirection);

        return dest;
    }

    private IfcAxis2Placement3DPropertyType marshalIfcAxis2Placement3DProperty(IfcAxis2Placement3DProperty src) {
        IfcAxis2Placement3DPropertyType dest = factory.createIfcAxis2Placement3DPropertyType();

        if (src.isSetObject())
            dest.setIfcAxis2Placement3D(marshalIfcAxis2Placement3D(src.getObject()));

        return dest;
    }

    private IfcUnitType marshalIfcUnit(IfcUnit src) {
        IfcUnitType dest = factory.createIfcUnitType();

        if (src.getDimensions() != null)
            dest.setDimensions(BigInteger.valueOf(src.getDimensions()));

        if (src.getUnitType() != null)
            dest.setUnitType(jp.geospatial.iur._3_0.uro.IfcUnitEnum.fromValue(src.getUnitType().value()));

        dest.setPerfix(src.getPerfix());
        dest.setName(src.getName());

        return dest;
    }

    private IfcUnitPropertyType marshalIfcUnitProperty(IfcUnitProperty src) {
        IfcUnitPropertyType dest = factory.createIfcUnitPropertyType();

        if (src.isSetObject())
            dest.setIfcUnit(marshalIfcUnit(src.getObject()));

        return dest;
    }

    private void marshalIfcGroup(IfcGroup src, IfcGroupType dest) {
        marshalIfcObject(src, dest);
    }

    private IfcGroupType marshalIfcGroup(IfcGroup src) {
        IfcGroupType dest = factory.createIfcGroupType();
        marshalIfcGroup(src, dest);
        return dest;
    }

    private IfcZoneType marshalIfcZone(IfcZone src) {
        IfcZoneType dest = factory.createIfcZoneType();
        marshalIfcGroup(src, dest);
        return dest;
    }

    private IfcPsetBuildingCommonType marshalIfcPsetBuildingCommon(IfcPsetBuildingCommon src) {
        IfcPsetBuildingCommonType dest = factory.createIfcPsetBuildingCommonType();

        dest.setBuildingId(src.getBuildingId());
        dest.setIsPermanentId(src.getIsPermanentId());
        dest.setMainFireUse(src.getMainFireUse());
        dest.setAncillaryFireUse(src.getAncillaryFireUse());
        dest.setSprinklerProtection(src.getSprinklerProtection());
        dest.setSprinklerProtectionAutomatic(src.getSprinklerProtectionAutomatic());

        if (src.getOccupancyType() != null)
            dest.setOccupancyType(helper.getGMLMarshaller().marshalCode(src.getOccupancyType()));

        if (src.getGrossPlannedArea() != null)
            dest.setGrossPlannedArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossPlannedArea()));

        if (src.getNumberOfStoreys() != null)
            dest.setNumberOfStoreys(BigInteger.valueOf(src.getNumberOfStoreys()));

        if (src.getYearOfConstruction() != null)
            dest.setYearOfConstruction(marshaller.toCalendar(src.getYearOfConstruction()));

        dest.setIsLandmarked(src.getIsLandmarked());

        return dest;
    }

    private IfcPsetSiteCommonType marshalIfcPsetSiteCommon(IfcPsetSiteCommon src) {
        IfcPsetSiteCommonType dest = factory.createIfcPsetSiteCommonType();

        if (src.getBuildableArea() != null)
            dest.setBuildableArea(helper.getGMLMarshaller().marshalMeasure(src.getBuildableArea()));

        if (src.getTotalArea() != null)
            dest.setTotalArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalArea()));

        if (src.getBuildingHeightLimit() != null)
            dest.setBuildingHeightLimit(helper.getGMLMarshaller().marshalLength(src.getBuildingHeightLimit()));

        return dest;
    }

    private void marshalIfcCoordinateReferenceSystem(IfcCoordinateReferenceSystem src, IfcCoordinateReferenceSystemType dest) {
        dest.setName(src.getName());
        dest.setDescription(src.getDescription());
        dest.setGeodeticDatum(src.getGeodeticDatum());
        dest.setVerticalDatum(src.getVerticalDatum());
    }

    private IfcCoordinateReferenceSystemType marshalIfcCoordinateReferenceSystem(IfcCoordinateReferenceSystem src) {
        IfcCoordinateReferenceSystemType dest = factory.createIfcCoordinateReferenceSystemType();
        marshalIfcCoordinateReferenceSystem(src, dest);
        return dest;
    }

    private IfcProjectedCRSType marshalIfcProjectedCRS(IfcProjectedCRS src) {
        IfcProjectedCRSType dest = factory.createIfcProjectedCRSType();
        marshalIfcCoordinateReferenceSystem(src, dest);

        dest.setMapUnit(src.getMapUnit());
        dest.setMapProjection(src.getMapProjection());
        dest.setMapZone(src.getMapZone());

        return dest;
    }

    private IfcCoordinateReferenceSystemPropertyType marshalIfcCoordinateReferenceSystemProperty(IfcCoordinateReferenceSystemProperty src) {
        IfcCoordinateReferenceSystemPropertyType dest = factory.createIfcCoordinateReferenceSystemPropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof IfcCoordinateReferenceSystemType)
                dest.setIfcCoordinateReferenceSystem((JAXBElement<? extends IfcCoordinateReferenceSystemType>) elem);
        }

        return dest;
    }

    private IfcMapConversionType marshalIfcMapConversion(IfcMapConversion src) {
        IfcMapConversionType dest = factory.createIfcMapConversionType();

        if (src.getSourceCRS() != null)
            dest.setSourceCRS(marshalIfcCoordinateReferenceSystemSelect(src.getSourceCRS()));

        if (src.getTargetCRS() != null)
            dest.setTargetCRS(marshalIfcCoordinateReferenceSystemProperty(src.getTargetCRS()));

        if (src.getEastings() != null)
            dest.setEastings(helper.getGMLMarshaller().marshalLength(src.getEastings()));

        if (src.getNorthings() != null)
            dest.setNorthings(helper.getGMLMarshaller().marshalLength(src.getNorthings()));

        if (src.getOrthogonalHeight() != null)
            dest.setOrthogonalHeight(helper.getGMLMarshaller().marshalLength(src.getOrthogonalHeight()));

        dest.setXAxisAbscissa(src.getXAxisAbscissa());
        dest.setXAxisOrdinate(src.getXAxisOrdinate());
        dest.setScale(src.getScale());

        return dest;
    }

    private IfcCoordinateReferenceSystemSelectType marshalIfcCoordinateReferenceSystemSelect(IfcCoordinateReferenceSystemSelect src) {
        IfcCoordinateReferenceSystemSelectType dest = factory.createIfcCoordinateReferenceSystemSelectType();

        if (src.getCrs() != null)
            dest.setCrs(marshalIfcCoordinateReferenceSystemProperty(src.getCrs()));

        if (src.getContext() != null)
            dest.setContext(marshalIfcGeometricRepresentationContextProperty(src.getContext()));

        return dest;
    }

    private IfcClassificationReferenceType marshalIfcClassificationReference(IfcClassificationReference src) {
        IfcClassificationReferenceType dest = factory.createIfcClassificationReferenceType();

        dest.setLocation(src.getLocation());

        if (src.getItemReference() != null)
            dest.setItemReference(helper.getGMLMarshaller().marshalCode(src.getItemReference()));

        dest.setName(src.getName());

        if (src.getReferenceSource() != null)
            dest.setReferenceSource(marshalIfcClassificationProperty(src.getReferenceSource()));

        return dest;
    }

    private IfcClassificationType marshalIfcClassification(IfcClassification src) {
        IfcClassificationType dest = factory.createIfcClassificationType();

        dest.setSource(src.getSource());
        dest.setEdition(src.getEdition());

        if (src.getEditionDate() != null)
            dest.setEditionDate(marshaller.toCalendar(src.getEditionDate()));

        dest.setName(src.getName());

        return dest;
    }

    private IfcClassificationPropertyType marshalIfcClassificationProperty(IfcClassificationProperty src) {
        IfcClassificationPropertyType dest = factory.createIfcClassificationPropertyType();

        if (src.isSetObject())
            dest.setIfcClassification(marshalIfcClassification(src.getObject()));

        return dest;
    }

    private IfcPsetSpaceCommonType marshalIfcPsetSpaceCommon(IfcPsetSpaceCommon src) {
        IfcPsetSpaceCommonType dest = factory.createIfcPsetSpaceCommonType();

        dest.setReference(src.getReference());
        dest.setCategory(src.getCategory());
        dest.setFloorCovering(src.getFloorCovering());
        dest.setWallCovering(src.getWallCovering());
        dest.setCeilingCovering(src.getCeilingCovering());
        dest.setSkirtingBoard(src.getSkirtingBoard());

        if (src.getGrossPlannedArea() != null)
            dest.setGrossPlannedArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossPlannedArea()));

        if (src.getNetPlannedArea() != null)
            dest.setNetPlannedArea(helper.getGMLMarshaller().marshalMeasure(src.getNetPlannedArea()));

        dest.setPubliclyAccessible(src.getPubliclyAccessible());
        dest.setHandicapAccessible(src.getHandicapAccessible());
        dest.setConcealedFlooring(src.getConcealedFlooring());
        dest.setConcealedCeiling(src.getConcealedCeiling());

        return dest;
    }

    private IfcSpaceBaseQuantityType marshalIfcSpaceBaseQuantity(IfcSpaceBaseQuantity src) {
        IfcSpaceBaseQuantityType dest = factory.createIfcSpaceBaseQuantityType();

        if (src.getNominalHeight() != null)
            dest.setNominalHeight(helper.getGMLMarshaller().marshalLength(src.getNominalHeight()));

        if (src.getClearHeight() != null)
            dest.setClearHeight(helper.getGMLMarshaller().marshalLength(src.getClearHeight()));

        if (src.getFinishCeilingHeight() != null)
            dest.setFinishCeilingHeight(helper.getGMLMarshaller().marshalLength(src.getFinishCeilingHeight()));

        if (src.getGrossPerimeter() != null)
            dest.setGrossPerimeter(helper.getGMLMarshaller().marshalLength(src.getGrossPerimeter()));

        if (src.getNetPerimeter() != null)
            dest.setNetPerimeter(helper.getGMLMarshaller().marshalLength(src.getNetPerimeter()));

        if (src.getGrossCeilingArea() != null)
            dest.setGrossCeilingArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossCeilingArea()));

        if (src.getGrossFloorArea() != null)
            dest.setGrossFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossFloorArea()));

        if (src.getNetCeilingArea() != null)
            dest.setNetCeilingArea(helper.getGMLMarshaller().marshalMeasure(src.getNetCeilingArea()));

        if (src.getNetFloorArea() != null)
            dest.setNetFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getNetFloorArea()));

        if (src.getGrossWallArea() != null)
            dest.setGrossWallArea(helper.getGMLMarshaller().marshalMeasure(src.getGrossWallArea()));

        if (src.getNetWallArea() != null)
            dest.setNetWallArea(helper.getGMLMarshaller().marshalMeasure(src.getNetWallArea()));

        if (src.getGrossVolume() != null)
            dest.setGrossVolume(helper.getGMLMarshaller().marshalMeasure(src.getGrossVolume()));

        if (src.getNetVolume() != null)
            dest.setNetVolume(helper.getGMLMarshaller().marshalMeasure(src.getNetVolume()));

        return dest;
    }

    private IfcPsetWindowCommonType marshalIfcPsetWindowCommon(IfcPsetWindowCommon src) {
        IfcPsetWindowCommonType dest = factory.createIfcPsetWindowCommonType();

        dest.setReference(src.getReference());
        dest.setAcousticRating(src.getAcousticRating());
        dest.setFireRating(src.getFireRating());
        dest.setSecurityRating(src.getSecurityRating());
        dest.setIsExternal(src.getIsExternal());
        dest.setInfiltration(src.getInfiltration());
        dest.setThermalTransmittance(src.getThermalTransmittance());
        dest.setGlazingAreaFraction(src.getGlazingAreaFraction());
        dest.setSmokeStop(src.getSmokeStop());

        return dest;
    }

    private IfcPsetDoorCommonType marshalIfcPsetDoorCommon(IfcPsetDoorCommon src) {
        IfcPsetDoorCommonType dest = factory.createIfcPsetDoorCommonType();

        dest.setReference(src.getReference());
        dest.setAcousticRating(src.getAcousticRating());
        dest.setFirerating(src.getFirerating());
        dest.setSecurityRating(src.getSecurityRating());
        dest.setIsExternal(src.getIsExternal());
        dest.setInfiltration(src.getInfiltration());
        dest.setThermalTransmittance(src.getThermalTransmittance());
        dest.setGlazingAreaFraction(src.getGlazingAreaFraction());
        dest.setHandicapAccessible(src.getHandicapAccessible());
        dest.setFireExit(src.getFireExit());
        dest.setSelfClosing(src.getSelfClosing());
        dest.setSmokeStop(src.getSmokeStop());

        return dest;
    }

    private IfcPsetOpeningElementCommonType marshalIfcPsetOpeningElementCommon(IfcPsetOpeningElementCommon src) {
        IfcPsetOpeningElementCommonType dest = factory.createIfcPsetOpeningElementCommonType();

        dest.setReference(src.getReference());
        dest.setPurpose(src.getPurpose());
        dest.setFireExit(src.getFireExit());
        dest.setProtectedOpening(src.getProtectedOpening());
        dest.setParallelJambs(src.getParallelJambs());

        return dest;
    }

    private IfcAttributePropertyType marshalIfcAttributeProperty(IfcAttributeProperty src) {
        IfcAttributePropertyType dest = factory.createIfcAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof IfcAttributeType)
                dest.setIfcAttribute((JAXBElement<? extends IfcAttributeType>) elem);
        }

        return dest;
    }

    private RoomDataQualityAttributeType marshalRoomDataQualityAttribute(RoomDataQualityAttribute src) {
        RoomDataQualityAttributeType dest = factory.createRoomDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        dest.setLodType(src.getLodType());

        return dest;
    }

    private RoomDataQualityAttributePropertyType marshalRoomDataQualityAttributeProperty(RoomDataQualityAttributeProperty src) {
        RoomDataQualityAttributePropertyType dest = factory.createRoomDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setRoomDataQualityAttribute(marshalRoomDataQualityAttribute(src.getObject()));

        return dest;
    }

    private void marshalIndoorAttribute(IndoorAttribute src, IndoorAttributeType dest) {
        if (src.getSource() != null)
            dest.setSource(helper.getGMLMarshaller().marshalCode(src.getSource()));
    }

    private IndoorFurnishingAttributeType marshalIndoorFurnishingAttribute(IndoorFurnishingAttribute src) {
        IndoorFurnishingAttributeType dest = factory.createIndoorFurnishingAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setFloorId(src.getFloorId());

        return dest;
    }

    private IndoorZoneAttributeType marshalIndoorZoneAttribute(IndoorZoneAttribute src) {
        IndoorZoneAttributeType dest = factory.createIndoorZoneAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setFloorId(src.getFloorId());

        return dest;
    }

    private IndoorPublicTagAttributeType marshalIndoorPublicTagAttribute(IndoorPublicTagAttribute src) {
        IndoorPublicTagAttributeType dest = factory.createIndoorPublicTagAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setUcode(src.getUcode());

        return dest;
    }

    private IndoorSpaceAttributeType marshalIndoorSpaceAttribute(IndoorSpaceAttribute src) {
        IndoorSpaceAttributeType dest = factory.createIndoorSpaceAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setFloorId(src.getFloorId());
        dest.setIsRestricted(src.getIsRestricted());
        dest.setSuite(src.getSuite());
        dest.setIsPublic(src.getIsPublic());

        if (src.getTollType() != null)
            dest.setTollType(helper.getGMLMarshaller().marshalCode(src.getTollType()));

        return dest;
    }

    private IndoorFacilityAttributeType marshalIndoorFacilityAttribute(IndoorFacilityAttribute src) {
        IndoorFacilityAttributeType dest = factory.createIndoorFacilityAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setWeekdayHours(src.getWeekdayHours());
        dest.setWeekendHours(src.getWeekendHours());
        dest.setPhone(src.getPhone());
        dest.setWebsite(src.getWebsite());

        return dest;
    }

    private IndoorStoreyAttributeType marshalIndoorStoreyAttribute(IndoorStoreyAttribute src) {
        IndoorStoreyAttributeType dest = factory.createIndoorStoreyAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setCategory(src.getCategory());
        dest.setOrdinal(src.getOrdinal());

        return dest;
    }

    private IndoorTacatileTileAttributeType marshalIndoorTacatileTileAttribute(IndoorTacatileTileAttribute src) {
        IndoorTacatileTileAttributeType dest = factory.createIndoorTacatileTileAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setStartNode(src.getStartNode());
        dest.setEndNode(src.getEndNode());

        if (src.getCategory() != null)
            dest.setCategory(helper.getGMLMarshaller().marshalCode(src.getCategory()));

        dest.setRoof(src.getRoof());
        dest.setFloorId(src.getFloorId());

        return dest;
    }

    private IndoorUserDefinedAttributeType marshalIndoorUserDefinedAttribute(IndoorUserDefinedAttribute src) {
        IndoorUserDefinedAttributeType dest = factory.createIndoorUserDefinedAttributeType();
        marshalIndoorAttribute(src, dest);

        dest.setName(src.getName());

        if (src.getNominalValue() != null)
            dest.setNominalValue(marshalUserDefinedValueProperty(src.getNominalValue()));

        dest.setDescription(src.getDescription());
        dest.setUnit(src.getUnit());

        return dest;
    }

    private UserDefinedValueType marshalUserDefinedValue(UserDefinedValue src) {
        UserDefinedValueType dest = factory.createUserDefinedValueType();

        dest.setStringValue(src.getStringValue());

        if (src.getIntValue() != null)
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));

        dest.setDoubleValue(src.getDoubleValue());

        if (src.getCodeValue() != null)
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));

        if (src.getDateValue() != null)
            dest.setDateValue(marshaller.toCalendar(src.getDateValue()));

        dest.setUriValue(src.getUriValue());

        if (src.getMeasuredValue() != null)
            dest.setMeasuredValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasuredValue()));

        return dest;
    }

    private UserDefinedValuePropertyType marshalUserDefinedValueProperty(UserDefinedValueProperty src) {
        UserDefinedValuePropertyType dest = factory.createUserDefinedValuePropertyType();

        if (src.isSetObject())
            dest.setUserDefinedValue(marshalUserDefinedValue(src.getObject()));

        return dest;
    }

    private IndoorAttributePropertyType marshalIndoorAttributeProperty(IndoorAttributeProperty src) {
        IndoorAttributePropertyType dest = factory.createIndoorAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof IndoorAttributeType)
                dest.setIndoorAttribute((JAXBElement<? extends IndoorAttributeType>) elem);
        }

        return dest;
    }

    private LandUseDataQualityAttributeType marshalLandUseDataQualityAttribute(LandUseDataQualityAttribute src) {
        LandUseDataQualityAttributeType dest = factory.createLandUseDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        return dest;
    }

    private LandUseDataQualityAttributePropertyType marshalLandUseDataQualityAttributeProperty(LandUseDataQualityAttributeProperty src) {
        LandUseDataQualityAttributePropertyType dest = factory.createLandUseDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setLandUseDataQualityAttribute(marshalLandUseDataQualityAttribute(src.getObject()));

        return dest;
    }

    private RoadTypeType marshalRoadType(RoadType src) {
        RoadTypeType dest = factory.createRoadTypeType();

        dest.setId(src.getId());

        if (src.getCreationDate() != null)
            dest.setCreationDate(marshaller.toCalendar(src.getCreationDate()));

        dest.setIsTemporary(src.getIsTemporary());

        if (src.getRoadType() != null)
            dest.setRoadType(helper.getGMLMarshaller().marshalCode(src.getRoadType()));

        if (src.getWidthType() != null)
            dest.setWidthType(helper.getGMLMarshaller().marshalCode(src.getWidthType()));

        dest.setIsTollRoad(src.getIsTollRoad());

        if (src.getSeparator() != null)
            dest.setSeparator(helper.getGMLMarshaller().marshalLength(src.getSeparator()));

        dest.setIsHighWay(src.getIsHighWay());

        return dest;
    }

    private RoadTypePropertyType marshalRoadTypeProperty(RoadTypeProperty src) {
        RoadTypePropertyType dest = factory.createRoadTypePropertyType();

        if (src.isSetObject())
            dest.setRoadType(marshalRoadType(src.getObject()));

        return dest;
    }

    private BuildingIDAttributeType marshalBuildingIDAttribute(BuildingIDAttribute src) {
        BuildingIDAttributeType dest = factory.createBuildingIDAttributeType();

        dest.setBuildingID(src.getBuildingID());

        if (src.getBranchID() != null)
            dest.setBranchID(BigInteger.valueOf(src.getBranchID()));

        if (src.getPartID() != null)
            dest.setPartID(BigInteger.valueOf(src.getPartID()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        return dest;
    }

    private BuildingIDAttributePropertyType marshalBuildingIDAttributeProperty(BuildingIDAttributeProperty src) {
        BuildingIDAttributePropertyType dest = factory.createBuildingIDAttributePropertyType();

        if (src.isSetObject())
            dest.setBuildingIDAttribute(marshalBuildingIDAttribute(src.getObject()));

        return dest;
    }

    private BuildingDetailAttributeType marshalBuildingDetailAttribute(BuildingDetailAttribute src) {
        BuildingDetailAttributeType dest = factory.createBuildingDetailAttributeType();

        dest.setSerialNumberOfBuildingCertification(src.getSerialNumberOfBuildingCertification());

        if (src.getSiteArea() != null)
            dest.setSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getSiteArea()));

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getBuildingFootprintArea() != null)
            dest.setBuildingFootprintArea(helper.getGMLMarshaller().marshalMeasure(src.getBuildingFootprintArea()));

        if (src.getBuildingRoofEdgeArea() != null)
            dest.setBuildingRoofEdgeArea(helper.getGMLMarshaller().marshalMeasure(src.getBuildingRoofEdgeArea()));

        if (src.getDevelopmentArea() != null)
            dest.setDevelopmentArea(helper.getGMLMarshaller().marshalMeasure(src.getDevelopmentArea()));

        if (src.getBuildingStructureType() != null)
            dest.setBuildingStructureType(helper.getGMLMarshaller().marshalCode(src.getBuildingStructureType()));

        if (src.getBuildingStructureOrgType() != null)
            dest.setBuildingStructureOrgType(helper.getGMLMarshaller().marshalCode(src.getBuildingStructureOrgType()));

        if (src.getFireproofStructureType() != null)
            dest.setFireproofStructureType(helper.getGMLMarshaller().marshalCode(src.getFireproofStructureType()));

        dest.setImplementingBody(src.getImplementingBody());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        for (Code districtsAndZonesType : src.getDistrictsAndZonesType())
            dest.getDistrictsAndZonesType().add(helper.getGMLMarshaller().marshalCode(districtsAndZonesType));

        if (src.getLandUseType() != null)
            dest.setLandUseType(helper.getGMLMarshaller().marshalCode(src.getLandUseType()));

        dest.setReference(src.getReference());

        if (src.getMajorUsage() != null)
            dest.setMajorUsage(helper.getGMLMarshaller().marshalCode(src.getMajorUsage()));

        if (src.getMajorUsage2() != null)
            dest.setMajorUsage2(helper.getGMLMarshaller().marshalCode(src.getMajorUsage2()));

        if (src.getOrgUsage() != null)
            dest.setOrgUsage(helper.getGMLMarshaller().marshalCode(src.getOrgUsage()));

        if (src.getOrgUsage2() != null)
            dest.setOrgUsage2(helper.getGMLMarshaller().marshalCode(src.getOrgUsage2()));

        if (src.getDetailedUsage() != null)
            dest.setDetailedUsage(helper.getGMLMarshaller().marshalCode(src.getDetailedUsage()));

        if (src.getDetailedUsage2() != null)
            dest.setDetailedUsage2(helper.getGMLMarshaller().marshalCode(src.getDetailedUsage2()));

        if (src.getDetailedUsage3() != null)
            dest.setDetailedUsage3(helper.getGMLMarshaller().marshalCode(src.getDetailedUsage3()));

        if (src.getGroundFloorUsage() != null)
            dest.setGroundFloorUsage(helper.getGMLMarshaller().marshalCode(src.getGroundFloorUsage()));

        if (src.getSecondFloorUsage() != null)
            dest.setSecondFloorUsage(helper.getGMLMarshaller().marshalCode(src.getSecondFloorUsage()));

        if (src.getThirdFloorUsage() != null)
            dest.setThirdFloorUsage(helper.getGMLMarshaller().marshalCode(src.getThirdFloorUsage()));

        if (src.getBasementUsage() != null)
            dest.setBasementUsage(helper.getGMLMarshaller().marshalCode(src.getBasementUsage()));

        if (src.getBasementFirstUsage() != null)
            dest.setBasementFirstUsage(helper.getGMLMarshaller().marshalCode(src.getBasementFirstUsage()));

        if (src.getBasementSecondUsage() != null)
            dest.setBasementSecondUsage(helper.getGMLMarshaller().marshalCode(src.getBasementSecondUsage()));

        if (src.getVacancy() != null)
            dest.setVacancy(helper.getGMLMarshaller().marshalCode(src.getVacancy()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());
        dest.setSpecifiedBuildingCoverageRate(src.getSpecifiedBuildingCoverageRate());
        dest.setSpecifiedFloorAreaRate(src.getSpecifiedFloorAreaRate());
        dest.setStandardFloorAreaRate(src.getStandardFloorAreaRate());

        if (src.getBuildingHeight() != null)
            dest.setBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getBuildingHeight()));

        if (src.getEaveHeight() != null)
            dest.setEaveHeight(helper.getGMLMarshaller().marshalLength(src.getEaveHeight()));

        dest.setNote(src.getNote());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        return dest;
    }

    private BuildingDetailAttributePropertyType marshalBuildingDetailAttributeProperty(BuildingDetailAttributeProperty src) {
        BuildingDetailAttributePropertyType dest = factory.createBuildingDetailAttributePropertyType();

        if (src.isSetObject())
            dest.setBuildingDetailAttribute(marshalBuildingDetailAttribute(src.getObject()));

        return dest;
    }

    private LargeCustomerFacilityAttributeType marshalLargeCustomerFacilityAttribute(LargeCustomerFacilityAttribute src) {
        LargeCustomerFacilityAttributeType dest = factory.createLargeCustomerFacilityAttributeType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        dest.setName(src.getName());

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        dest.setOwner(src.getOwner());

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getTotalStoreFloorArea() != null)
            dest.setTotalStoreFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalStoreFloorArea()));

        if (src.getInauguralDate() != null)
            dest.setInauguralDate(marshaller.toCalendar(src.getInauguralDate()));

        if (src.getYearOpened() != null)
            dest.setYearOpened(marshaller.toCalendar(src.getYearOpened()));

        if (src.getYearClosed() != null)
            dest.setYearClosed(marshaller.toCalendar(src.getYearClosed()));

        dest.setKeyTenants(src.getKeyTenants());
        dest.setAvailability(src.getAvailability());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        for (Code districtsAndZonesType : src.getDistrictsAndZonesType())
            dest.getDistrictsAndZonesType().add(helper.getGMLMarshaller().marshalCode(districtsAndZonesType));

        if (src.getLandUseType() != null)
            dest.setLandUseType(helper.getGMLMarshaller().marshalCode(src.getLandUseType()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        return dest;
    }

    private LargeCustomerFacilityAttributePropertyType marshalLargeCustomerFacilityAttributeProperty(LargeCustomerFacilityAttributeProperty src) {
        LargeCustomerFacilityAttributePropertyType dest = factory.createLargeCustomerFacilityAttributePropertyType();

        if (src.isSetObject())
            dest.setLargeCustomerFacilityAttribute(marshalLargeCustomerFacilityAttribute(src.getObject()));

        return dest;
    }

    private void marshalBuildingDisasterRiskAttribute(BuildingDisasterRiskAttribute src, BuildingDisasterRiskAttributeType dest) {
        if (src.getDescription() != null)
            dest.setDescription(helper.getGMLMarshaller().marshalCode(src.getDescription()));
    }

    private void marshalBuildingFloodingRiskAttribute(BuildingFloodingRiskAttribute src, BuildingFloodingRiskAttributeType dest) {
        marshalBuildingDisasterRiskAttribute(src, dest);

        if (src.getRank() != null)
            dest.setRank(helper.getGMLMarshaller().marshalCode(src.getRank()));

        if (src.getRankOrg() != null)
            dest.setRankOrg(helper.getGMLMarshaller().marshalCode(src.getRankOrg()));

        if (src.getDepth() != null)
            dest.setDepth(helper.getGMLMarshaller().marshalLength(src.getDepth()));
    }

    private BuildingRiverFloodingRiskAttributeType marshalBuildingRiverFloodingRiskAttribute(BuildingRiverFloodingRiskAttribute src) {
        BuildingRiverFloodingRiskAttributeType dest = factory.createBuildingRiverFloodingRiskAttributeType();
        marshalBuildingFloodingRiskAttribute(src, dest);

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        if (src.getScale() != null)
            dest.setScale(helper.getGMLMarshaller().marshalCode(src.getScale()));

        if (src.getDuration() != null)
            dest.setDuration(helper.getGMLMarshaller().marshalMeasure(src.getDuration()));

        return dest;
    }

    private BuildingTsunamiRiskAttributeType marshalBuildingTsunamiRiskAttribute(BuildingTsunamiRiskAttribute src) {
        BuildingTsunamiRiskAttributeType dest = factory.createBuildingTsunamiRiskAttributeType();
        marshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingInlandFloodingRiskAttributeType marshalBuildingInlandFloodingRiskAttribute(BuildingInlandFloodingRiskAttribute src) {
        BuildingInlandFloodingRiskAttributeType dest = factory.createBuildingInlandFloodingRiskAttributeType();
        marshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingHighTideRiskAttributeType marshalBuildingHighTideRiskAttribute(BuildingHighTideRiskAttribute src) {
        BuildingHighTideRiskAttributeType dest = factory.createBuildingHighTideRiskAttributeType();
        marshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingLandSlideRiskAttributeType marshalBuildingLandSlideRiskAttribute(BuildingLandSlideRiskAttribute src) {
        BuildingLandSlideRiskAttributeType dest = factory.createBuildingLandSlideRiskAttributeType();
        marshalBuildingDisasterRiskAttribute(src, dest);

        if (src.getAreaType() != null)
            dest.setAreaType(helper.getGMLMarshaller().marshalCode(src.getAreaType()));

        return dest;
    }

    private BuildingDisasterRiskAttributePropertyType marshalBuildingDisasterRiskAttributeProperty(BuildingDisasterRiskAttributeProperty src) {
        BuildingDisasterRiskAttributePropertyType dest = factory.createBuildingDisasterRiskAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof BuildingDisasterRiskAttributeType)
                dest.setBuildingDisasterRiskAttribute((JAXBElement<? extends BuildingDisasterRiskAttributeType>) elem);
        }

        return dest;
    }

    private KeyValuePairAttributeType marshalKeyValuePairAttribute(KeyValuePairAttribute src) {
        KeyValuePairAttributeType dest = factory.createKeyValuePairAttributeType();

        if (src.getKey() != null)
            dest.setKey(helper.getGMLMarshaller().marshalCode(src.getKey()));

        if (src.getCodeValue() != null)
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));

        dest.setStringValue(src.getStringValue());

        if (src.getIntValue() != null)
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));

        dest.setDoubleValue(src.getDoubleValue());

        if (src.getMeasuredValue() != null)
            dest.setMeasuredValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasuredValue()));

        if (src.getDateValue() != null)
            dest.setDateValue(marshaller.toCalendar(src.getDateValue()));

        dest.setUriValue(src.getUriValue());

        return dest;
    }

    private KeyValuePairAttributePropertyType marshalKeyValuePairAttributeProperty(KeyValuePairAttributeProperty src) {
        KeyValuePairAttributePropertyType dest = factory.createKeyValuePairAttributePropertyType();

        if (src.isSetObject())
            dest.setKeyValuePairAttribute(marshalKeyValuePairAttribute(src.getObject()));

        return dest;
    }

    private BuildingDataQualityAttributeType marshalBuildingDataQualityAttribute(BuildingDataQualityAttribute src) {
        BuildingDataQualityAttributeType dest = factory.createBuildingDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        if (src.getLod1HeightType() != null)
            dest.setLod1HeightType(helper.getGMLMarshaller().marshalCode(src.getLod1HeightType()));

        for (String lodType : src.getLodType())
            dest.getLodType().add(lodType);

        return dest;
    }

    private BuildingDataQualityAttributePropertyType marshalBuildingDataQualityAttributeProperty(BuildingDataQualityAttributeProperty src) {
        BuildingDataQualityAttributePropertyType dest = factory.createBuildingDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setBuildingDataQualityAttribute(marshalBuildingDataQualityAttribute(src.getObject()));

        return dest;
    }

    private LandUseDetailAttributeType marshalLandUseDetailAttribute(LandUseDetailAttribute src) {
        LandUseDetailAttributeType dest = factory.createLandUseDetailAttributeType();

        dest.setId(src.getId());

        if (src.getOrgLandUse() != null)
            dest.setOrgLandUse(helper.getGMLMarshaller().marshalCode(src.getOrgLandUse()));

        if (src.getNominalArea() != null)
            dest.setNominalArea(helper.getGMLMarshaller().marshalMeasure(src.getNominalArea()));

        if (src.getOwnerType() != null)
            dest.setOwnerType(helper.getGMLMarshaller().marshalCode(src.getOwnerType()));

        dest.setOwner(src.getOwner());

        if (src.getAreaInSquareMeter() != null)
            dest.setAreaInSquareMeter(helper.getGMLMarshaller().marshalMeasure(src.getAreaInSquareMeter()));

        if (src.getAreaInHa() != null)
            dest.setAreaInHa(helper.getGMLMarshaller().marshalMeasure(src.getAreaInHa()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());
        dest.setSpecifiedBuildingCoverageRate(src.getSpecifiedBuildingCoverageRate());
        dest.setSpecifiedFloorAreaRate(src.getSpecifiedFloorAreaRate());
        dest.setStandardFloorAreaRate(src.getStandardFloorAreaRate());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        for (Code districtsAndZonesType : src.getDistrictsAndZonesType())
            dest.getDistrictsAndZonesType().add(helper.getGMLMarshaller().marshalCode(districtsAndZonesType));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        return dest;
    }

    private LandUseDetailAttributePropertyType marshalLandUseDetailAttributeProperty(LandUseDetailAttributeProperty src) {
        LandUseDetailAttributePropertyType dest = factory.createLandUseDetailAttributePropertyType();

        if (src.isSetObject())
            dest.setLandUseDetailAttribute(marshalLandUseDetailAttribute(src.getObject()));

        return dest;
    }

    private TrafficVolumeAttributeType marshalTrafficVolumeAttribute(TrafficVolumeAttribute src) {
        TrafficVolumeAttributeType dest = factory.createTrafficVolumeAttributeType();

        dest.setSectionID(src.getSectionID());
        dest.setRouteName(src.getRouteName());

        if (src.getWeekday12hourTrafficVolume() != null)
            dest.setWeekday12HourTrafficVolume(BigInteger.valueOf(src.getWeekday12hourTrafficVolume()));

        if (src.getWeekday24hourTrafficVolume() != null)
            dest.setWeekday24HourTrafficVolume(BigInteger.valueOf(src.getWeekday24hourTrafficVolume()));

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedInCongestion(src.getAverageInboundTravelSpeedInCongestion());
        dest.setAverageOutboundTravelSpeedInCongestion(src.getAverageOutboundTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedNotCongestion(src.getAverageInboundTravelSpeedNotCongestion());
        dest.setAverageOutboundTravelSpeedNotCongestion(src.getAverageOutboundTravelSpeedNotCongestion());
        dest.setObservationPointName(src.getObservationPointName());
        dest.setReference(src.getReference());

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        return dest;
    }

    private TrafficVolumeAttributePropertyType marshalTrafficVolumeAttributeProperty(TrafficVolumeAttributeProperty src) {
        TrafficVolumeAttributePropertyType dest = factory.createTrafficVolumeAttributePropertyType();

        if (src.isSetObject())
            dest.setTrafficVolumeAttribute(marshalTrafficVolumeAttribute(src.getObject()));

        return dest;
    }

    private RoadStructureAttributeType marshalRoadStructureAttribute(RoadStructureAttribute src) {
        RoadStructureAttributeType dest = factory.createRoadStructureAttributeType();

        if (src.getWidthType() != null)
            dest.setWidthType(helper.getGMLMarshaller().marshalCode(src.getWidthType()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getNumberOfLanes() != null)
            dest.setNumberOfLanes(BigInteger.valueOf(src.getNumberOfLanes()));

        if (src.getSectionType() != null)
            dest.setSectionType(helper.getGMLMarshaller().marshalCode(src.getSectionType()));

        return dest;
    }

    private RoadStructureAttributePropertyType marshalRoadStructureAttributeProperty(RoadStructureAttributeProperty src) {
        RoadStructureAttributePropertyType dest = factory.createRoadStructureAttributePropertyType();

        if (src.isSetObject())
            dest.setRoadStructureAttribute(marshalRoadStructureAttribute(src.getObject()));

        return dest;
    }

    private TrafficAreaStructureAttributeType marshalTrafficAreaStructureAttribute(TrafficAreaStructureAttribute src) {
        TrafficAreaStructureAttributeType dest = factory.createTrafficAreaStructureAttributeType();

        if (src.getNumberOfLanes() != null)
            dest.setNumberOfLanes(BigInteger.valueOf(src.getNumberOfLanes()));

        return dest;
    }

    private TrafficAreaStructureAttributePropertyType marshalTrafficAreaStructureAttributeProperty(TrafficAreaStructureAttributeProperty src) {
        TrafficAreaStructureAttributePropertyType dest = factory.createTrafficAreaStructureAttributePropertyType();

        if (src.isSetObject())
            dest.setTrafficAreaStructureAttribute(marshalTrafficAreaStructureAttribute(src.getObject()));

        return dest;
    }

    private CityFurnitureDetailAttributeType marshalCityFurnitureDetailAttribute(CityFurnitureDetailAttribute src) {
        CityFurnitureDetailAttributeType dest = factory.createCityFurnitureDetailAttributeType();

        if (src.getFacilityType() != null)
            dest.setFacilityType(helper.getGMLMarshaller().marshalCode(src.getFacilityType()));

        dest.setDescription(src.getDescription());

        return dest;
    }

    private CityFurnitureDetailAttributePropertyType marshalCityFurnitureDetailAttributeProperty(CityFurnitureDetailAttributeProperty src) {
        CityFurnitureDetailAttributePropertyType dest = factory.createCityFurnitureDetailAttributePropertyType();

        if (src.isSetObject())
            dest.setCityFurnitureDetailAttribute(marshalCityFurnitureDetailAttribute(src.getObject()));

        return dest;
    }

    private CityFurnitureDataQualityAttributeType marshalCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttribute src) {
        CityFurnitureDataQualityAttributeType dest = factory.createCityFurnitureDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        dest.setLodType(src.getLodType());

        return dest;
    }

    private CityFurnitureDataQualityAttributePropertyType marshalCityFurnitureDataQualityAttributeProperty(CityFurnitureDataQualityAttributeProperty src) {
        CityFurnitureDataQualityAttributePropertyType dest = factory.createCityFurnitureDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setCityFurnitureDataQualityAttribute(marshalCityFurnitureDataQualityAttribute(src.getObject()));

        return dest;
    }

    private VegetationDataQualityAttributeType marshalVegetationDataQualityAttribute(VegetationDataQualityAttribute src) {
        VegetationDataQualityAttributeType dest = factory.createVegetationDataQualityAttributeType();

        for (Code srcScale : src.getSrcScale())
            dest.getSrcScale().add(helper.getGMLMarshaller().marshalCode(srcScale));

        for (Code geometrySrcDesc : src.getGeometrySrcDesc())
            dest.getGeometrySrcDesc().add(helper.getGMLMarshaller().marshalCode(geometrySrcDesc));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDesc : src.getAppearanceSrcDesc())
            dest.getAppearanceSrcDesc().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDesc));

        return dest;
    }

    private VegetationDataQualityAttributePropertyType marshalVegetationDataQualityAttributeProperty(VegetationDataQualityAttributeProperty src) {
        VegetationDataQualityAttributePropertyType dest = factory.createVegetationDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setVegetationDataQualityAttribute(marshalVegetationDataQualityAttribute(src.getObject()));

        return dest;
    }

    private void marshalWaterBodyFloodingRiskAttribute(WaterBodyFloodingRiskAttribute src, WaterBodyFloodingRiskAttributeType dest) {
        if (src.getDescription() != null)
            dest.setDescription(helper.getGMLMarshaller().marshalCode(src.getDescription()));

        if (src.getRank() != null)
            dest.setRank(helper.getGMLMarshaller().marshalCode(src.getRank()));

        if (src.getRankOrg() != null)
            dest.setRankOrg(helper.getGMLMarshaller().marshalCode(src.getRankOrg()));

        if (src.getDepth() != null)
            dest.setDepth(helper.getGMLMarshaller().marshalLength(src.getDepth()));
    }

    private WaterBodyRiverFloodingRiskAttributeType marshalWaterBodyRiverFloodingRiskAttribute(WaterBodyRiverFloodingRiskAttribute src) {
        WaterBodyRiverFloodingRiskAttributeType dest = factory.createWaterBodyRiverFloodingRiskAttributeType();
        marshalWaterBodyFloodingRiskAttribute(src, dest);

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        if (src.getScale() != null)
            dest.setScale(helper.getGMLMarshaller().marshalCode(src.getScale()));

        if (src.getDuration() != null)
            dest.setDuration(helper.getGMLMarshaller().marshalMeasure(src.getDuration()));

        return dest;
    }

    private WaterBodyTsunamiRiskAttributeType marshalWaterBodyTsunamiRiskAttribute(WaterBodyTsunamiRiskAttribute src) {
        WaterBodyTsunamiRiskAttributeType dest = factory.createWaterBodyTsunamiRiskAttributeType();
        marshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyHighTideRiskAttributeType marshalWaterBodyHighTideRiskAttribute(WaterBodyHighTideRiskAttribute src) {
        WaterBodyHighTideRiskAttributeType dest = factory.createWaterBodyHighTideRiskAttributeType();
        marshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyInlandFloodingRiskAttributeType marshalWaterBodyInlandFloodingRiskAttribute(WaterBodyInlandFloodingRiskAttribute src) {
        WaterBodyInlandFloodingRiskAttributeType dest = factory.createWaterBodyInlandFloodingRiskAttributeType();
        marshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyFloodingRiskAttributePropertyType marshalWaterBodyFloodingRiskAttributeProperty(WaterBodyFloodingRiskAttributeProperty src) {
        WaterBodyFloodingRiskAttributePropertyType dest = factory.createWaterBodyFloodingRiskAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof WaterBodyFloodingRiskAttributeType)
                dest.setWaterBodyFloodingRiskAttribute((JAXBElement<? extends WaterBodyFloodingRiskAttributeType>) elem);
        }

        return dest;
    }

    private WaterBodyDetailAttributeType marshalWaterBodyDetailAttribute(WaterBodyDetailAttribute src) {
        WaterBodyDetailAttributeType dest = factory.createWaterBodyDetailAttributeType();

        dest.setKana(src.getKana());

        if (src.getWaterSystemCode() != null)
            dest.setWaterSystemCode(helper.getGMLMarshaller().marshalCode(src.getWaterSystemCode()));

        if (src.getRiverCode() != null)
            dest.setRiverCode(helper.getGMLMarshaller().marshalCode(src.getRiverCode()));

        if (src.getAdminType() != null)
            dest.setAdminType(helper.getGMLMarshaller().marshalCode(src.getAdminType()));

        dest.setFlowDirection(src.getFlowDirection());

        if (src.getMaximumDepth() != null)
            dest.setMaximumDepth(helper.getGMLMarshaller().marshalLength(src.getMaximumDepth()));

        if (src.getWaterSurfaceElevation() != null)
            dest.setWaterSurfaceElevation(helper.getGMLMarshaller().marshalLength(src.getWaterSurfaceElevation()));

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        if (src.getMeasurementYearMonth() != null)
            dest.setMeasurementYearMonth(marshaller.toCalendar(src.getMeasurementYearMonth()));

        for (Code prefecture : src.getPrefecture())
            dest.getPrefecture().add(helper.getGMLMarshaller().marshalCode(prefecture));

        for (Code city : src.getCity())
            dest.getCity().add(helper.getGMLMarshaller().marshalCode(city));

        return dest;
    }

    private WaterBodyDetailAttributePropertyType marshalWaterBodyDetailAttributeProperty(WaterBodyDetailAttributeProperty src) {
        WaterBodyDetailAttributePropertyType dest = factory.createWaterBodyDetailAttributePropertyType();

        if (src.isSetObject())
            dest.setWaterBodyDetailAttribute(marshalWaterBodyDetailAttribute(src.getObject()));

        return dest;
    }

    private JAXBElement<?> createConstructionBaseAttribute(ConstructionBaseAttribute src) {
        return factory.createConstructionBaseAttribute(marshalConstructionBaseAttribute(src));
    }

    private JAXBElement<?> createFacilityIdAttribute(FacilityIdAttribute src) {
        return factory.createFacilityIdAttribute(marshalFacilityIdAttribute(src));
    }

    private JAXBElement<?> createRiverFacilityIdAttribute(RiverFacilityIdAttribute src) {
        return factory.createRiverFacilityIdAttribute(marshalRiverFacilityIdAttribute(src));
    }

    private JAXBElement<?> createFacilityTypeAttribute(FacilityTypeAttribute src) {
        return factory.createFacilityTypeAttribute(marshalFacilityTypeAttribute(src));
    }

    private JAXBElement<?> createHarborFacility(HarborFacility src) {
        return factory.createHarborFacility(marshalHarborFacility(src));
    }

    private JAXBElement<?> createPortProtectiveFacility(PortProtectiveFacility src) {
        return factory.createPortProtectiveFacility(marshalPortProtectiveFacility(src));
    }

    private JAXBElement<?> createMooringFacility(MooringFacility src) {
        return factory.createMooringFacility(marshalMooringFacility(src));
    }

    private JAXBElement<?> createPortTransportationFacility(PortTransportationFacility src) {
        return factory.createPortTransportationFacility(marshalPortTransportationFacility(src));
    }

    private JAXBElement<?> createNavigationAssistanceFacility(NavigationAssistanceFacility src) {
        return factory.createNavigationAssistanceFacility(marshalNavigationAssistanceFacility(src));
    }

    private JAXBElement<?> createCargoHandlingFacility(CargoHandlingFacility src) {
        return factory.createCargoHandlingFacility(marshalCargoHandlingFacility(src));
    }

    private JAXBElement<?> createPortPassengerFacility(PortPassengerFacility src) {
        return factory.createPortPassengerFacility(marshalPortPassengerFacility(src));
    }

    private JAXBElement<?> createPortStorageFacility(PortStorageFacility src) {
        return factory.createPortStorageFacility(marshalPortStorageFacility(src));
    }

    private JAXBElement<?> createShipServiceFacility(ShipServiceFacility src) {
        return factory.createShipServiceFacility(marshalShipServiceFacility(src));
    }

    private JAXBElement<?> createPortWasteTreatmentFacility(PortWasteTreatmentFacility src) {
        return factory.createPortWasteTreatmentFacility(marshalPortWasteTreatmentFacility(src));
    }

    private JAXBElement<?> createPortEnvironmentalImprovementFacility(PortEnvironmentalImprovementFacility src) {
        return factory.createPortEnvironmentalImprovementFacility(marshalPortEnvironmentalImprovementFacility(src));
    }

    private JAXBElement<?> createPortPollutionControlFacility(PortPollutionControlFacility src) {
        return factory.createPortPollutionControlFacility(marshalPortPollutionControlFacility(src));
    }

    private JAXBElement<?> createPortWelfareFacility(PortWelfareFacility src) {
        return factory.createPortWelfareFacility(marshalPortWelfareFacility(src));
    }

    private JAXBElement<?> createPortManagementFacility(PortManagementFacility src) {
        return factory.createPortManagementFacility(marshalPortManagementFacility(src));
    }

    private JAXBElement<?> createCyberportMarinaAndPBS(CyberportMarinaAndPBS src) {
        return factory.createCyberportMarinaAndPBS(marshalCyberportMarinaAndPBS(src));
    }

    private JAXBElement<?> createFishingPortFacility(FishingPortFacility src) {
        return factory.createFishingPortFacility(marshalFishingPortFacility(src));
    }

    private JAXBElement<?> createFishingPortCapacity(FishingPortCapacity src) {
        return factory.createFishingPortCapacity(marshalFishingPortCapacity(src));
    }

    private JAXBElement<?> createMaintenanceHistoryAttribute(MaintenanceHistoryAttribute src) {
        return factory.createMaintenanceHistoryAttribute(marshalMaintenanceHistoryAttribute(src));
    }

    private JAXBElement<?> createBridgeStructureAttribute(BridgeStructureAttribute src) {
        return factory.createBridgeStructureAttribute(marshalBridgeStructureAttribute(src));
    }

    private JAXBElement<?> createBridgeFunctionalAttribute(BridgeFunctionalAttribute src) {
        return factory.createBridgeFunctionalAttribute(marshalBridgeFunctionalAttribute(src));
    }

    private JAXBElement<?> createConstructionRiskAssessmentAttribute(ConstructionRiskAssessmentAttribute src) {
        return factory.createConstructionRiskAssessmentAttribute(marshalConstructionRiskAssessmentAttribute(src));
    }

    private JAXBElement<?> createRiverFloodingRiskAttribute(RiverFloodingRiskAttribute src) {
        return factory.createRiverFloodingRiskAttribute(marshalRiverFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createTsunamiRiskAttribute(TsunamiRiskAttribute src) {
        return factory.createTsunamiRiskAttribute(marshalTsunamiRiskAttribute(src));
    }

    private JAXBElement<?> createInlandFloodingRiskAttribute(InlandFloodingRiskAttribute src) {
        return factory.createInlandFloodingRiskAttribute(marshalInlandFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createHighTideRiskAttribute(HighTideRiskAttribute src) {
        return factory.createHighTideRiskAttribute(marshalHighTideRiskAttribute(src));
    }

    private JAXBElement<?> createLandSlideRiskAttribute(LandSlideRiskAttribute src) {
        return factory.createLandSlideRiskAttribute(marshalLandSlideRiskAttribute(src));
    }

    private JAXBElement<?> createDmGeometricAttribute(DmGeometricAttribute src) {
        return factory.createDmGeometricAttribute(marshalDmGeometricAttribute(src));
    }

    private JAXBElement<?> createDmAnnotation(DmAnnotation src) {
        return factory.createDmAnnotation(marshalDmAnnotation(src));
    }

    private JAXBElement<?> createDmElement(DmElement src) {
        return factory.createDmElement(marshalDmElement(src));
    }

    private JAXBElement<?> createConstructionDataQualityAttribute(ConstructionDataQualityAttribute src) {
        return factory.createConstructionDataQualityAttribute(marshalConstructionDataQualityAttribute(src));
    }

    private JAXBElement<?> createTransportationDataQualityAttribute(TransportationDataQualityAttribute src) {
        return factory.createTransportationDataQualityAttribute(marshalTransportationDataQualityAttribute(src));
    }

    private JAXBElement<?> createTunnelStructureAttribute(TunnelStructureAttribute src) {
        return factory.createTunnelStructureAttribute(marshalTunnelStructureAttribute(src));
    }

    private JAXBElement<?> createTunnelFunctionalAttribute(TunnelFunctionalAttribute src) {
        return factory.createTunnelFunctionalAttribute(marshalTunnelFunctionalAttribute(src));
    }

    private JAXBElement<?> createRailwayRouteAttribute(RailwayRouteAttribute src) {
        return factory.createRailwayRouteAttribute(marshalRailwayRouteAttribute(src));
    }

    private JAXBElement<?> createRailwayTrackAttribute(RailwayTrackAttribute src) {
        return factory.createRailwayTrackAttribute(marshalRailwayTrackAttribute(src));
    }

    private JAXBElement<?> createControlPoint(ControlPoint src) {
        return factory.createControlPoint(marshalControlPoint(src));
    }

    private JAXBElement<?> createTrackAttribute(TrackAttribute src) {
        return factory.createTrackAttribute(marshalTrackAttribute(src));
    }

    private JAXBElement<?> createSquareUrbanPlanAttribute(SquareUrbanPlanAttribute src) {
        return factory.createSquareUrbanPlanAttribute(marshalSquareUrbanPlanAttribute(src));
    }

    private JAXBElement<?> createStationSquareAttribute(StationSquareAttribute src) {
        return factory.createStationSquareAttribute(marshalStationSquareAttribute(src));
    }

    private JAXBElement<?> createTerminalAttribute(TerminalAttribute src) {
        return factory.createTerminalAttribute(marshalTerminalAttribute(src));
    }

    private JAXBElement<?> createIfcBuilding(IfcBuilding src) {
        return factory.createIfcBuilding(marshalIfcBuilding(src));
    }

    private JAXBElement<?> createIfcSite(IfcSite src) {
        return factory.createIfcSite(marshalIfcSite(src));
    }

    private JAXBElement<?> createIfcSpace(IfcSpace src) {
        return factory.createIfcSpace(marshalIfcSpace(src));
    }

    private JAXBElement<?> createIfcBuildingStorey(IfcBuildingStorey src) {
        return factory.createIfcBuildingStorey(marshalIfcBuildingStorey(src));
    }

    private JAXBElement<?> createIfcBuildingElement(IfcBuildingElement src) {
        return factory.createIfcBuildingElement(marshalIfcBuildingElement(src));
    }

    private JAXBElement<?> createIfcWall(IfcWall src) {
        return factory.createIfcWall(marshalIfcWall(src));
    }

    private JAXBElement<?> createIfcWallStandardCase(IfcWallStandardCase src) {
        return factory.createIfcWallStandardCase(marshalIfcWallStandardCase(src));
    }

    private JAXBElement<?> createIfcCurtainWall(IfcCurtainWall src) {
        return factory.createIfcCurtainWall(marshalIfcCurtainWall(src));
    }

    private JAXBElement<?> createIfcRoof(IfcRoof src) {
        return factory.createIfcRoof(marshalIfcRoof(src));
    }

    private JAXBElement<?> createIfcWindow(IfcWindow src) {
        return factory.createIfcWindow(marshalIfcWindow(src));
    }

    private JAXBElement<?> createIfcDoor(IfcDoor src) {
        return factory.createIfcDoor(marshalIfcDoor(src));
    }

    private JAXBElement<?> createIfcOpeningElement(IfcOpeningElement src) {
        return factory.createIfcOpeningElement(marshalIfcOpeningElement(src));
    }

    private JAXBElement<?> createIfcFurnishingElement(IfcFurnishingElement src) {
        return factory.createIfcFurnishingElement(marshalIfcFurnishingElement(src));
    }

    private JAXBElement<?> createIfcProject(IfcProject src) {
        return factory.createIfcProject(marshalIfcProject(src));
    }

    private JAXBElement<?> createIfcGeometricRepresentationContext(IfcGeometricRepresentationContext src) {
        return factory.createIfcGeometricRepresentationContext(marshalIfcGeometricRepresentationContext(src));
    }

    private JAXBElement<?> createIfcAxis2Placement3D(IfcAxis2Placement3D src) {
        return factory.createIfcAxis2Placement3D(marshalIfcAxis2Placement3D(src));
    }

    private JAXBElement<?> createIfcUnit(IfcUnit src) {
        return factory.createIfcUnit(marshalIfcUnit(src));
    }

    private JAXBElement<?> createIfcGroup(IfcGroup src) {
        return factory.createIfcGroup(marshalIfcGroup(src));
    }

    private JAXBElement<?> createIfcZone(IfcZone src) {
        return factory.createIfcZone(marshalIfcZone(src));
    }

    private JAXBElement<?> createIfcPsetBuildingCommon(IfcPsetBuildingCommon src) {
        return factory.createIfcPsetBuildingCommon(marshalIfcPsetBuildingCommon(src));
    }

    private JAXBElement<?> createIfcPsetSiteCommon(IfcPsetSiteCommon src) {
        return factory.createIfcPsetSiteCommon(marshalIfcPsetSiteCommon(src));
    }

    private JAXBElement<?> createIfcCoordinateReferenceSystem(IfcCoordinateReferenceSystem src) {
        return factory.createIfcCoordinateReferenceSystem(marshalIfcCoordinateReferenceSystem(src));
    }

    private JAXBElement<?> createIfcProjectedCRS(IfcProjectedCRS src) {
        return factory.createIfcProjectedCRS(marshalIfcProjectedCRS(src));
    }

    private JAXBElement<?> createIfcMapConversion(IfcMapConversion src) {
        return factory.createIfcMapConversion(marshalIfcMapConversion(src));
    }

    private JAXBElement<?> createIfcClassificationReference(IfcClassificationReference src) {
        return factory.createIfcClassificationReference(marshalIfcClassificationReference(src));
    }

    private JAXBElement<?> createIfcClassification(IfcClassification src) {
        return factory.createIfcClassification(marshalIfcClassification(src));
    }

    private JAXBElement<?> createIfcPsetSpaceCommon(IfcPsetSpaceCommon src) {
        return factory.createIfcPsetSpaceCommon(marshalIfcPsetSpaceCommon(src));
    }

    private JAXBElement<?> createIfcSpaceBaseQuantity(IfcSpaceBaseQuantity src) {
        return factory.createIfcSpaceBaseQuantity(marshalIfcSpaceBaseQuantity(src));
    }

    private JAXBElement<?> createIfcPsetWindowCommon(IfcPsetWindowCommon src) {
        return factory.createIfcPsetWindowCommon(marshalIfcPsetWindowCommon(src));
    }

    private JAXBElement<?> createIfcPsetDoorCommon(IfcPsetDoorCommon src) {
        return factory.createIfcPsetDoorCommon(marshalIfcPsetDoorCommon(src));
    }

    private JAXBElement<?> createIfcPsetOpeningElementCommon(IfcPsetOpeningElementCommon src) {
        return factory.createIfcPsetOpeningElementCommon(marshalIfcPsetOpeningElementCommon(src));
    }

    private JAXBElement<?> createRoomDataQualityAttribute(RoomDataQualityAttribute src) {
        return factory.createRoomDataQualityAttribute(marshalRoomDataQualityAttribute(src));
    }

    private JAXBElement<?> createIndoorFurnishingAttribute(IndoorFurnishingAttribute src) {
        return factory.createIndoorFurnishingAttribute(marshalIndoorFurnishingAttribute(src));
    }

    private JAXBElement<?> createIndoorZoneAttribute(IndoorZoneAttribute src) {
        return factory.createIndoorZoneAttribute(marshalIndoorZoneAttribute(src));
    }

    private JAXBElement<?> createIndoorPublicTagAttribute(IndoorPublicTagAttribute src) {
        return factory.createIndoorPublicTagAttribute(marshalIndoorPublicTagAttribute(src));
    }

    private JAXBElement<?> createIndoorSpaceAttribute(IndoorSpaceAttribute src) {
        return factory.createIndoorSpaceAttribute(marshalIndoorSpaceAttribute(src));
    }

    private JAXBElement<?> createIndoorFacilityAttribute(IndoorFacilityAttribute src) {
        return factory.createIndoorFacilityAttribute(marshalIndoorFacilityAttribute(src));
    }

    private JAXBElement<?> createIndoorStoreyAttribute(IndoorStoreyAttribute src) {
        return factory.createIndoorStoreyAttribute(marshalIndoorStoreyAttribute(src));
    }

    private JAXBElement<?> createIndoorTacatileTileAttribute(IndoorTacatileTileAttribute src) {
        return factory.createIndoorTacatileTileAttribute(marshalIndoorTacatileTileAttribute(src));
    }

    private JAXBElement<?> createIndoorUserDefinedAttribute(IndoorUserDefinedAttribute src) {
        return factory.createIndoorUserDefinedAttribute(marshalIndoorUserDefinedAttribute(src));
    }

    private JAXBElement<?> createUserDefinedValue(UserDefinedValue src) {
        return factory.createUserDefinedValue(marshalUserDefinedValue(src));
    }

    private JAXBElement<?> createLandUseDataQualityAttribute(LandUseDataQualityAttribute src) {
        return factory.createLandUseDataQualityAttribute(marshalLandUseDataQualityAttribute(src));
    }

    private JAXBElement<?> createRoadType(RoadType src) {
        return factory.createRoadType(marshalRoadType(src));
    }

    private JAXBElement<?> createBuildingIDAttribute(BuildingIDAttribute src) {
        return factory.createBuildingIDAttribute(marshalBuildingIDAttribute(src));
    }

    private JAXBElement<?> createBuildingDetailAttribute(BuildingDetailAttribute src) {
        return factory.createBuildingDetailAttribute(marshalBuildingDetailAttribute(src));
    }

    private JAXBElement<?> createLargeCustomerFacilityAttribute(LargeCustomerFacilityAttribute src) {
        return factory.createLargeCustomerFacilityAttribute(marshalLargeCustomerFacilityAttribute(src));
    }

    private JAXBElement<?> createBuildingRiverFloodingRiskAttribute(BuildingRiverFloodingRiskAttribute src) {
        return factory.createBuildingRiverFloodingRiskAttribute(marshalBuildingRiverFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createBuildingTsunamiRiskAttribute(BuildingTsunamiRiskAttribute src) {
        return factory.createBuildingTsunamiRiskAttribute(marshalBuildingTsunamiRiskAttribute(src));
    }

    private JAXBElement<?> createBuildingInlandFloodingRiskAttribute(BuildingInlandFloodingRiskAttribute src) {
        return factory.createBuildingInlandFloodingRiskAttribute(marshalBuildingInlandFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createBuildingHighTideRiskAttribute(BuildingHighTideRiskAttribute src) {
        return factory.createBuildingHighTideRiskAttribute(marshalBuildingHighTideRiskAttribute(src));
    }

    private JAXBElement<?> createBuildingLandSlideRiskAttribute(BuildingLandSlideRiskAttribute src) {
        return factory.createBuildingLandSlideRiskAttribute(marshalBuildingLandSlideRiskAttribute(src));
    }

    private JAXBElement<?> createKeyValuePairAttribute(KeyValuePairAttribute src) {
        return factory.createKeyValuePairAttribute(marshalKeyValuePairAttribute(src));
    }

    private JAXBElement<?> createBuildingDataQualityAttribute(BuildingDataQualityAttribute src) {
        return factory.createBuildingDataQualityAttribute(marshalBuildingDataQualityAttribute(src));
    }

    private JAXBElement<?> createLandUseDetailAttribute(LandUseDetailAttribute src) {
        return factory.createLandUseDetailAttribute(marshalLandUseDetailAttribute(src));
    }

    private JAXBElement<?> createTrafficVolumeAttribute(TrafficVolumeAttribute src) {
        return factory.createTrafficVolumeAttribute(marshalTrafficVolumeAttribute(src));
    }

    private JAXBElement<?> createRoadStructureAttribute(RoadStructureAttribute src) {
        return factory.createRoadStructureAttribute(marshalRoadStructureAttribute(src));
    }

    private JAXBElement<?> createTrafficAreaStructureAttribute(TrafficAreaStructureAttribute src) {
        return factory.createTrafficAreaStructureAttribute(marshalTrafficAreaStructureAttribute(src));
    }

    private JAXBElement<?> createCityFurnitureDetailAttribute(CityFurnitureDetailAttribute src) {
        return factory.createCityFurnitureDetailAttribute(marshalCityFurnitureDetailAttribute(src));
    }

    private JAXBElement<?> createCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttribute src) {
        return factory.createCityFurnitureDataQualityAttribute(marshalCityFurnitureDataQualityAttribute(src));
    }

    private JAXBElement<?> createVegetationDataQualityAttribute(VegetationDataQualityAttribute src) {
        return factory.createVegetationDataQualityAttribute(marshalVegetationDataQualityAttribute(src));
    }

    private JAXBElement<?> createWaterBodyRiverFloodingRiskAttribute(WaterBodyRiverFloodingRiskAttribute src) {
        return factory.createWaterBodyRiverFloodingRiskAttribute(marshalWaterBodyRiverFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createWaterBodyTsunamiRiskAttribute(WaterBodyTsunamiRiskAttribute src) {
        return factory.createWaterBodyTsunamiRiskAttribute(marshalWaterBodyTsunamiRiskAttribute(src));
    }

    private JAXBElement<?> createWaterBodyHighTideRiskAttribute(WaterBodyHighTideRiskAttribute src) {
        return factory.createWaterBodyHighTideRiskAttribute(marshalWaterBodyHighTideRiskAttribute(src));
    }

    private JAXBElement<?> createWaterBodyInlandFloodingRiskAttribute(WaterBodyInlandFloodingRiskAttribute src) {
        return factory.createWaterBodyInlandFloodingRiskAttribute(marshalWaterBodyInlandFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createWaterBodyDetailAttribute(WaterBodyDetailAttribute src) {
        return factory.createWaterBodyDetailAttribute(marshalWaterBodyDetailAttribute(src));
    }

    private JAXBElement<?> createBridBaseAttributePropertyElement(BridBaseAttributePropertyElement src) {
        return factory.createBridBaseAttribute(marshalConstructionBaseAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridFacilityIdAttributePropertyElement(BridFacilityIdAttributePropertyElement src) {
        return factory.createBridFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridFacilityTypeAttributePropertyElement(BridFacilityTypeAttributePropertyElement src) {
        return factory.createBridFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridFacilityAttributePropertyElement(BridFacilityAttributePropertyElement src) {
        return factory.createBridFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridStructureAttributePropertyElement(BridStructureAttributePropertyElement src) {
        return factory.createBridStructureAttribute(marshalBridgeStructureAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridFunctionalAttributePropertyElement(BridFunctionalAttributePropertyElement src) {
        return factory.createBridFunctionalAttribute(marshalBridgeFunctionalAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridRiskAssessmentAttributePropertyElement(BridRiskAssessmentAttributePropertyElement src) {
        return factory.createBridRiskAssessmentAttribute(marshalConstructionRiskAssessmentAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridDisasterRiskAttributePropertyElement(BridDisasterRiskAttributePropertyElement src) {
        return factory.createBridDisasterRiskAttribute(marshalDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridDmAttributePropertyElement(BridDmAttributePropertyElement src) {
        return factory.createBridDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridDataQualityAttributePropertyElement(BridDataQualityAttributePropertyElement src) {
        return factory.createBridDataQualityAttribute(marshalConstructionDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnFacilityIdAttributePropertyElement(FrnFacilityIdAttributePropertyElement src) {
        return factory.createFrnFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnFacilityTypeAttributePropertyElement(FrnFacilityTypeAttributePropertyElement src) {
        return factory.createFrnFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnFacilityAttributePropertyElement(FrnFacilityAttributePropertyElement src) {
        return factory.createFrnFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnDmAttributePropertyElement(FrnDmAttributePropertyElement src) {
        return factory.createFrnDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranFacilityIdAttributePropertyElement(TranFacilityIdAttributePropertyElement src) {
        return factory.createTranFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranFacilityTypeAttributePropertyElement(TranFacilityTypeAttributePropertyElement src) {
        return factory.createTranFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranFacilityAttributePropertyElement(TranFacilityAttributePropertyElement src) {
        return factory.createTranFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranDmAttributePropertyElement(TranDmAttributePropertyElement src) {
        return factory.createTranDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranDataQualityAttributePropertyElement(TranDataQualityAttributePropertyElement src) {
        return factory.createTranDataQualityAttribute(marshalTransportationDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegFacilityIdAttributePropertyElement(VegFacilityIdAttributePropertyElement src) {
        return factory.createVegFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegFacilityTypeAttributePropertyElement(VegFacilityTypeAttributePropertyElement src) {
        return factory.createVegFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegFacilityAttributePropertyElement(VegFacilityAttributePropertyElement src) {
        return factory.createVegFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegDmAttributePropertyElement(VegDmAttributePropertyElement src) {
        return factory.createVegDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunBaseAttributePropertyElement(TunBaseAttributePropertyElement src) {
        return factory.createTunBaseAttribute(marshalConstructionBaseAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunStructureAttributePropertyElement(TunStructureAttributePropertyElement src) {
        return factory.createTunStructureAttribute(marshalTunnelStructureAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFunctionalAttributePropertyElement(TunFunctionalAttributePropertyElement src) {
        return factory.createTunFunctionalAttribute(marshalTunnelFunctionalAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunRiskAssessmentAttributePropertyElement(TunRiskAssessmentAttributePropertyElement src) {
        return factory.createTunRiskAssessmentAttribute(marshalConstructionRiskAssessmentAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunDisasterRiskAttributePropertyElement(TunDisasterRiskAttributePropertyElement src) {
        return factory.createTunDisasterRiskAttribute(marshalDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunDmAttributePropertyElement(TunDmAttributePropertyElement src) {
        return factory.createTunDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunDataQualityAttributePropertyElement(TunDataQualityAttributePropertyElement src) {
        return factory.createTunDataQualityAttribute(marshalConstructionDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFacilityIdAttributePropertyElement(TunFacilityIdAttributePropertyElement src) {
        return factory.createTunFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFacilityTypeAttributePropertyElement(TunFacilityTypeAttributePropertyElement src) {
        return factory.createTunFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFacilityAttributePropertyElement(TunFacilityAttributePropertyElement src) {
        return factory.createTunFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgFacilityIdAttributePropertyElement(BldgFacilityIdAttributePropertyElement src) {
        return factory.createBldgFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgFacilityTypeAttributePropertyElement(BldgFacilityTypeAttributePropertyElement src) {
        return factory.createBldgFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgFacilityAttributePropertyElement(BldgFacilityAttributePropertyElement src) {
        return factory.createBldgFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgDmAttributePropertyElement(BldgDmAttributePropertyElement src) {
        return factory.createBldgDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseFacilityIdAttributePropertyElement(LuseFacilityIdAttributePropertyElement src) {
        return factory.createLuseFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseFacilityTypeAttributePropertyElement(LuseFacilityTypeAttributePropertyElement src) {
        return factory.createLuseFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseFacilityAttributePropertyElement(LuseFacilityAttributePropertyElement src) {
        return factory.createLuseFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseDmAttributePropertyElement(LuseDmAttributePropertyElement src) {
        return factory.createLuseDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrFacilityIdAttributePropertyElement(WtrFacilityIdAttributePropertyElement src) {
        return factory.createWtrFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrFacilityTypeAttributePropertyElement(WtrFacilityTypeAttributePropertyElement src) {
        return factory.createWtrFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrFacilityAttributePropertyElement(WtrFacilityAttributePropertyElement src) {
        return factory.createWtrFacilityAttribute(marshalFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrDmAttributePropertyElement(WtrDmAttributePropertyElement src) {
        return factory.createWtrDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createDemDmAttributePropertyElement(DemDmAttributePropertyElement src) {
        return factory.createDemDmAttribute(marshalDmAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRailwayRouteAttributePropertyElement(RailwayRouteAttributePropertyElement src) {
        return factory.createRailwayRouteAttributeProperty(marshalRailwayRouteAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRailwayTrackAttributePropertyElement(RailwayTrackAttributePropertyElement src) {
        return factory.createRailwayTrackAttributeProperty(marshalRailwayTrackAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrackAttributePropertyElement(TrackAttributePropertyElement src) {
        return factory.createTrackAttributeProperty(marshalTrackAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createSquareUrbanPlanAttributePropertyElement(SquareUrbanPlanAttributePropertyElement src) {
        return factory.createSquareUrbanPlanAttributeProperty(marshalSquareUrbanPlanAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcBuildingAttributePropertyElement(IfcBuildingAttributePropertyElement src) {
        return factory.createIfcBuildingAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcBuildingStoreyAttributePropertyElement(IfcBuildingStoreyAttributePropertyElement src) {
        return factory.createIfcBuildingStoreyAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcLandUseAttributePropertyElement(IfcLandUseAttributePropertyElement src) {
        return factory.createIfcLandUseAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcRoomAttributePropertyElement(IfcRoomAttributePropertyElement src) {
        return factory.createIfcRoomAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcOpeningAttributePropertyElement(IfcOpeningAttributePropertyElement src) {
        return factory.createIfcOpeningAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcBoundarySurfaceAttributePropertyElement(IfcBoundarySurfaceAttributePropertyElement src) {
        return factory.createIfcBoundarySurfaceAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcBuildingInstallationAttributePropertyElement(IfcBuildingInstallationAttributePropertyElement src) {
        return factory.createIfcBuildingInstallationAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcIntBuildingInstallationAttributePropertyElement(IfcIntBuildingInstallationAttributePropertyElement src) {
        return factory.createIfcIntBuildingInstallationAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIfcBuildingFurnitureAttributePropertyElement(IfcBuildingFurnitureAttributePropertyElement src) {
        return factory.createIfcBuildingFurnitureAttribute(marshalIfcAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRoomDataQualityAttributePropertyElement(RoomDataQualityAttributePropertyElement src) {
        return factory.createRoomDataQualityAttributeProperty(marshalRoomDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorBuildingAttributePropertyElement(IndoorBuildingAttributePropertyElement src) {
        return factory.createIndoorBuildingAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorBoundarySurfaceAttributePropertyElement(IndoorBoundarySurfaceAttributePropertyElement src) {
        return factory.createIndoorBoundarySurfaceAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorIntInstallationAttributePropertyElement(IndoorIntInstallationAttributePropertyElement src) {
        return factory.createIndoorIntInstallationAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorOpeningAttributePropertyElement(IndoorOpeningAttributePropertyElement src) {
        return factory.createIndoorOpeningAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorFutnitureAttributePropertyElement(IndoorFutnitureAttributePropertyElement src) {
        return factory.createIndoorFutnitureAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorRoomAttributePropertyElement(IndoorRoomAttributePropertyElement src) {
        return factory.createIndoorRoomAttribute(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createIndoorStoreyAttributePropertyElement(IndoorStoreyAttributePropertyElement src) {
        return factory.createIndoorStoreyAttributeProperty(marshalIndoorAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseDataQualityAttributePropertyElement(LuseDataQualityAttributePropertyElement src) {
        return factory.createLuseDataQualityAttribute(marshalLandUseDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRoadStatusPropertyElement(RoadStatusPropertyElement src) {
        return factory.createRoadStatus(marshalRoadTypeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingIDAttributePropertyElement(BuildingIDAttributePropertyElement src) {
        return factory.createBuildingIDAttributeProperty(marshalBuildingIDAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingDetailAttributePropertyElement(BuildingDetailAttributePropertyElement src) {
        return factory.createBuildingDetailAttributeProperty(marshalBuildingDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLargeCustomerFacilityAttributePropertyElement(LargeCustomerFacilityAttributePropertyElement src) {
        return factory.createLargeCustomerFacilityAttributeProperty(marshalLargeCustomerFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingDisasterRiskAttributePropertyElement(BuildingDisasterRiskAttributePropertyElement src) {
        return factory.createBuildingDisasterRiskAttributeProperty(marshalBuildingDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createKeyValuePairAttributePropertyElement(KeyValuePairAttributePropertyElement src) {
        return factory.createKeyValuePairAttributeProperty(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingDataQualityAttributePropertyElement(BuildingDataQualityAttributePropertyElement src) {
        return factory.createBuildingDataQualityAttributeProperty(marshalBuildingDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLandUseDetailAttributePropertyElement(LandUseDetailAttributePropertyElement src) {
        return factory.createLandUseDetailAttributeProperty(marshalLandUseDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrafficVolumeAttributePropertyElement(TrafficVolumeAttributePropertyElement src) {
        return factory.createTrafficVolumeAttributeProperty(marshalTrafficVolumeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRoadStructureAttributePropertyElement(RoadStructureAttributePropertyElement src) {
        return factory.createRoadStructureAttributeProperty(marshalRoadStructureAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrafficAreaStructureAttributePropertyElement(TrafficAreaStructureAttributePropertyElement src) {
        return factory.createTrafficAreaStructureAttributeProperty(marshalTrafficAreaStructureAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createCityFurnitureDetailAttributePropertyElement(CityFurnitureDetailAttributePropertyElement src) {
        return factory.createCityFurnitureDetailAttributeProperty(marshalCityFurnitureDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createCityFurnitureDataQualityAttributePropertyElement(CityFurnitureDataQualityAttributePropertyElement src) {
        return factory.createCityFurnitureDataQualityAttributeProperty(marshalCityFurnitureDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegetationDataQualityAttributePropertyElement(VegetationDataQualityAttributePropertyElement src) {
        return factory.createVegetationDataQualityAttributeProperty(marshalVegetationDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFloodingRiskAttributePropertyElement(FloodingRiskAttributePropertyElement src) {
        return factory.createFloodingRiskAttributeProperty(marshalWaterBodyFloodingRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWaterBodyDetailAttributePropertyElement(WaterBodyDetailAttributePropertyElement src) {
        return factory.createWaterBodyDetailAttributeProperty(marshalWaterBodyDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
