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

import jp.geospatial.iur._3_1.uro.*;
import net.opengis.gml.CodeType;
import org.citygml4j.ade.iur.model.uro.*;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class UrbanObjectUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(ConstructionBaseAttributeType.class, this::unmarshalConstructionBaseAttribute)
                    .with(ConstructionBaseAttributePropertyType.class, this::unmarshalConstructionBaseAttributeProperty)
                    .with(FacilityIdAttributeType.class, this::unmarshalFacilityIdAttribute)
                    .with(RiverFacilityIdAttributeType.class, this::unmarshalRiverFacilityIdAttribute)
                    .with(FacilityIdAttributePropertyType.class, this::unmarshalFacilityIdAttributeProperty)
                    .with(FacilityTypeAttributeType.class, this::unmarshalFacilityTypeAttribute)
                    .with(FacilityTypeAttributePropertyType.class, this::unmarshalFacilityTypeAttributeProperty)
                    .with(ParkFacilityLongevityPlanAttributeType.class, this::unmarshalParkFacilityLongevityPlanAttribute)
                    .with(NumberOfFacilitiesType.class, this::unmarshalNumberOfFacilities)
                    .with(NumberOfFacilitiesPropertyType.class, this::unmarshalNumberOfFacilitiesProperty)
                    .with(RepairsBeforeParkHealthAssessmentType.class, this::unmarshalRepairsBeforeParkHealthAssessment)
                    .with(RepairsBeforeParkHealthAssessmentPropertyType.class, this::unmarshalRepairsBeforeParkHealthAssessmentProperty)
                    .with(ParkHealthAssessmentType.class, this::unmarshalParkHealthAssessment)
                    .with(ParkHealthAssessmentPropertyType.class, this::unmarshalParkHealthAssessmentProperty)
                    .with(LongevityMeasuresType.class, this::unmarshalLongevityMeasures)
                    .with(LongevityMeasuresPropertyType.class, this::unmarshalLongevityMeasuresProperty)
                    .with(CountermeasuresCostType.class, this::unmarshalCountermeasuresCost)
                    .with(CountermeasuresCostPropertyType.class, this::unmarshalCountermeasuresCostProperty)
                    .with(HarborFacilityType.class, this::unmarshalHarborFacility)
                    .with(PortProtectiveFacilityType.class, this::unmarshalPortProtectiveFacility)
                    .with(MooringFacilityType.class, this::unmarshalMooringFacility)
                    .with(PortTransportationFacilityType.class, this::unmarshalPortTransportationFacility)
                    .with(NavigationAssistanceFacilityType.class, this::unmarshalNavigationAssistanceFacility)
                    .with(CargoHandlingFacilityType.class, this::unmarshalCargoHandlingFacility)
                    .with(PortPassengerFacilityType.class, this::unmarshalPortPassengerFacility)
                    .with(PortStorageFacilityType.class, this::unmarshalPortStorageFacility)
                    .with(ShipServiceFacilityType.class, this::unmarshalShipServiceFacility)
                    .with(PortWasteTreatmentFacilityType.class, this::unmarshalPortWasteTreatmentFacility)
                    .with(PortEnvironmentalImprovementFacilityType.class, this::unmarshalPortEnvironmentalImprovementFacility)
                    .with(PortPollutionControlFacilityType.class, this::unmarshalPortPollutionControlFacility)
                    .with(PortWelfareFacilityType.class, this::unmarshalPortWelfareFacility)
                    .with(PortManagementFacilityType.class, this::unmarshalPortManagementFacility)
                    .with(CyberportMarinaAndPBSType.class, this::unmarshalCyberportMarinaAndPBS)
                    .with(FishingPortFacilityType.class, this::unmarshalFishingPortFacility)
                    .with(FishingPortCapacityType.class, this::unmarshalFishingPortCapacity)
                    .with(MaintenanceHistoryAttributeType.class, this::unmarshalMaintenanceHistoryAttribute)
                    .with(FacilityAttributePropertyType.class, this::unmarshalFacilityAttributeProperty)
                    .with(BridgeStructureAttributeType.class, this::unmarshalBridgeStructureAttribute)
                    .with(BridgeStructureAttributePropertyType.class, this::unmarshalBridgeStructureAttributeProperty)
                    .with(BridgeFunctionalAttributeType.class, this::unmarshalBridgeFunctionalAttribute)
                    .with(BridgeFunctionalAttributePropertyType.class, this::unmarshalBridgeFunctionalAttributeProperty)
                    .with(ConstructionRiskAssessmentAttributeType.class, this::unmarshalConstructionRiskAssessmentAttribute)
                    .with(ConstructionRiskAssessmentAttributePropertyType.class, this::unmarshalConstructionRiskAssessmentAttributeProperty)
                    .with(RiverFloodingRiskAttributeType.class, this::unmarshalRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttributeType.class, this::unmarshalTsunamiRiskAttribute)
                    .with(InlandFloodingRiskAttributeType.class, this::unmarshalInlandFloodingRiskAttribute)
                    .with(HighTideRiskAttributeType.class, this::unmarshalHighTideRiskAttribute)
                    .with(ReservoirFloodingRiskAttributeType.class, this::unmarshalReservoirFloodingRiskAttribute)
                    .with(FloodingRiskAttributePropertyType.class, this::unmarshalFloodingRiskAttributeProperty)
                    .with(LandSlideRiskAttributeType.class, this::unmarshalLandSlideRiskAttribute)
                    .with(DisasterRiskAttributePropertyType.class, this::unmarshalDisasterRiskAttributeProperty)
                    .with(DataQualityAttributeType.class, this::unmarshalDataQualityAttribute)
                    .with(DataQualityAttributePropertyType.class, this::unmarshalDataQualityAttributeProperty)
                    .with(PublicSurveyDataQualityAttributeType.class, this::unmarshalPublicSurveyDataQualityAttribute)
                    .with(PublicSurveyDataQualityAttributePropertyType.class, this::unmarshalPublicSurveyDataQualityAttributeProperty)
                    .with(KeyValuePairAttributeType.class, this::unmarshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributePropertyType.class, this::unmarshalKeyValuePairAttributeProperty)
                    .with(BuildingIDAttributeType.class, this::unmarshalBuildingIDAttribute)
                    .with(BuildingIDAttributePropertyType.class, this::unmarshalBuildingIDAttributeProperty)
                    .with(BuildingDetailAttributeType.class, this::unmarshalBuildingDetailAttribute)
                    .with(BuildingDetailAttributePropertyType.class, this::unmarshalBuildingDetailAttributeProperty)
                    .with(LargeCustomerFacilityAttributeType.class, this::unmarshalLargeCustomerFacilityAttribute)
                    .with(LargeCustomerFacilityAttributePropertyType.class, this::unmarshalLargeCustomerFacilityAttributeProperty)
                    .with(RealEstateIDAttributeType.class, this::unmarshalRealEstateIDAttribute)
                    .with(RealEstateIDAttributePropertyType.class, this::unmarshalRealEstateIDAttributeProperty)
                    .with(BuildingUsecaseAttributeType.class, this::unmarshalBuildingUsecaseAttribute)
                    .with(BuildingUsecaseAttributePropertyType.class, this::unmarshalBuildingUsecaseAttributeProperty)
                    .with(CityFurnitureDetailAttributeType.class, this::unmarshalCityFurnitureDetailAttribute)
                    .with(CityFurnitureDetailAttributePropertyType.class, this::unmarshalCityFurnitureDetailAttributeProperty)
                    .with(LandUseDetailAttributeType.class, this::unmarshalLandUseDetailAttribute)
                    .with(LandUseDetailAttributePropertyType.class, this::unmarshalLandUseDetailAttributeProperty)
                    .with(TrafficObjectUsecaseAttributeType.class, this::unmarshalTrafficObjectUsecaseAttribute)
                    .with(TrafficObjectUsecaseAttributePropertyType.class, this::unmarshalTrafficObjectUsecaseAttributeProperty)
                    .with(TrafficVolumeAttributeType.class, this::unmarshalTrafficVolumeAttribute)
                    .with(TrafficVolumeAttributePropertyType.class, this::unmarshalTrafficVolumeAttributeProperty)
                    .with(RoadStructureAttributeType.class, this::unmarshalRoadStructureAttribute)
                    .with(RoadStructureAttributePropertyType.class, this::unmarshalRoadStructureAttributeProperty)
                    .with(RoadTypeType.class, this::unmarshalRoadType)
                    .with(RoadTypePropertyType.class, this::unmarshalRoadTypeProperty)
                    .with(RailwayRouteAttributeType.class, this::unmarshalRailwayRouteAttribute)
                    .with(RailwayRouteAttributePropertyType.class, this::unmarshalRailwayRouteAttributeProperty)
                    .with(TrackAttributeType.class, this::unmarshalTrackAttribute)
                    .with(TrackAttributePropertyType.class, this::unmarshalTrackAttributeProperty)
                    .with(SquareUrbanPlanAttributeType.class, this::unmarshalSquareUrbanPlanAttribute)
                    .with(StationSquareAttributeType.class, this::unmarshalStationSquareAttribute)
                    .with(TerminalAttributeType.class, this::unmarshalTerminalAttribute)
                    .with(SquareUrbanPlanAttributePropertyType.class, this::unmarshalSquareUrbanPlanAttributeProperty)
                    .with(RailwayTrackAttributeType.class, this::unmarshalRailwayTrackAttribute)
                    .with(RailwayTrackAttributePropertyType.class, this::unmarshalRailwayTrackAttributeProperty)
                    .with(ControlPointType.class, this::unmarshalControlPoint)
                    .with(ControlPointPropertyType.class, this::unmarshalControlPointProperty)
                    .with(ControlPointTypeType.class, this::unmarshalControlPointParameter)
                    .with(ControlPointTypePropertyType.class, this::unmarshalControlPointTypeProperty)
                    .with(CircularCurveTypeType.class, this::unmarshalCircularCurveType)
                    .with(CircularCurveTypePropertyType.class, this::unmarshalCircularCurveTypeProperty)
                    .with(TransitionCurveTypeType.class, this::unmarshalTransitionCurveType)
                    .with(TransitionCurveTypePropertyType.class, this::unmarshalTransitionCurveTypeProperty)
                    .with(SlopeTypeType.class, this::unmarshalSlopeType)
                    .with(SlopeTypePropertyType.class, this::unmarshalSlopeTypeProperty)
                    .with(VerticalCurveTypeType.class, this::unmarshalVerticalCurveType)
                    .with(VerticalCurveTypePropertyType.class, this::unmarshalVerticalCurveTypeProperty)
                    .with(TrafficAreaStructureAttributeType.class, this::unmarshalTrafficAreaStructureAttribute)
                    .with(TrafficAreaStructureAttributePropertyType.class, this::unmarshalTrafficAreaStructureAttributeProperty)
                    .with(TunnelStructureAttributeType.class, this::unmarshalTunnelStructureAttribute)
                    .with(TunnelStructureAttributePropertyType.class, this::unmarshalTunnelStructureAttributeProperty)
                    .with(TunnelFunctionalAttributeType.class, this::unmarshalTunnelFunctionalAttribute)
                    .with(TunnelFunctionalAttributePropertyType.class, this::unmarshalTunnelFunctionalAttributeProperty)
                    .with(WaterBodyDetailAttributeType.class, this::unmarshalWaterBodyDetailAttribute)
                    .with(WaterBodyDetailAttributePropertyType.class, this::unmarshalWaterBodyDetailAttributeProperty);
        }

        return typeMapper;
    }

    @Override
    public void setADEUnmarshallerHelper(ADEUnmarshallerHelper helper) {
        this.helper = helper;
    }

    @Override
    public ADEModelObject unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
        final Object value = src.getValue();

        // generic application properties
        switch (src.getName().getLocalPart()) {
            case "bridBaseAttribute":
                return new BridBaseAttributePropertyElement(unmarshalConstructionBaseAttributeProperty((ConstructionBaseAttributePropertyType) value));
            case "bridFacilityIdAttribute":
                return new BridFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "bridFacilityTypeAttribute":
                return new BridFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "bridFacilityAttribute":
                return new BridFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "bridStructureAttribute":
                return new BridStructureAttributePropertyElement(unmarshalBridgeStructureAttributeProperty((BridgeStructureAttributePropertyType) value));
            case "bridFunctionalAttribute":
                return new BridFunctionalAttributePropertyElement(unmarshalBridgeFunctionalAttributeProperty((BridgeFunctionalAttributePropertyType) value));
            case "bridRiskAssessmentAttribute":
                return new BridRiskAssessmentAttributePropertyElement(unmarshalConstructionRiskAssessmentAttributeProperty((ConstructionRiskAssessmentAttributePropertyType) value));
            case "bridDisasterRiskAttribute":
                return new BridDisasterRiskAttributePropertyElement(unmarshalDisasterRiskAttributeProperty((DisasterRiskAttributePropertyType) value));
            case "bridDataQualityAttribute":
                return new BridDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "bridKeyValuePairAttribute":
                return new BridKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "buildingIDAttribute":
                return new BuildingIDAttributePropertyElement(unmarshalBuildingIDAttributeProperty((BuildingIDAttributePropertyType) value));
            case "buildingDetailAttribute":
                return new BuildingDetailAttributePropertyElement(unmarshalBuildingDetailAttributeProperty((BuildingDetailAttributePropertyType) value));
            case "largeCustomerFacilityAttribute":
                return new LargeCustomerFacilityAttributePropertyElement(unmarshalLargeCustomerFacilityAttributeProperty((LargeCustomerFacilityAttributePropertyType) value));
            case "bldgDisasterRiskAttribute":
                return new BldgDisasterRiskAttributePropertyElement(unmarshalDisasterRiskAttributeProperty((DisasterRiskAttributePropertyType) value));
            case "bldgKeyValuePairAttribute":
                return new BldgKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "bldgDataQualityAttribute":
                return new BldgDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "bldgFacilityIdAttribute":
                return new BldgFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "bldgFacilityTypeAttribute":
                return new BldgFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "bldgFacilityAttribute":
                return new BldgFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "bldgRealEstateIDAttribute":
                return new BldgRealEstateIDAttributePropertyElement(unmarshalRealEstateIDAttributeProperty((RealEstateIDAttributePropertyType) value));
            case "bldgUsecaseAttribute":
                return new BldgUsecaseAttributePropertyElement(unmarshalBuildingUsecaseAttributeProperty((BuildingUsecaseAttributePropertyType) value));
            case "frnFacilityIdAttribute":
                return new FrnFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "frnFacilityTypeAttribute":
                return new FrnFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "frnFacilityAttribute":
                return new FrnFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "cityFurnitureDetailAttribute":
                return new CityFurnitureDetailAttributePropertyElement(unmarshalCityFurnitureDetailAttributeProperty((CityFurnitureDetailAttributePropertyType) value));
            case "frnDataQualityAttribute":
                return new FrnDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "frnKeyValuePairAttribute":
                return new FrnKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "landUseDetailAttribute":
                return new LandUseDetailAttributePropertyElement(unmarshalLandUseDetailAttributeProperty((LandUseDetailAttributePropertyType) value));
            case "luseFacilityIdAttribute":
                return new LuseFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "luseFacilityTypeAttribute":
                return new LuseFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "luseFacilityAttribute":
                return new LuseFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "luseDataQualityAttribute":
                return new LuseDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "luseKeyValuePairAttribute":
                return new LuseKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "demDataQualityAttribute":
                return new DemDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "demKeyValuePairAttribute":
                return new DemKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "tranFacilityIdAttribute":
                return new TranFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "tranFacilityTypeAttribute":
                return new TranFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "tranFacilityAttribute":
                return new TranFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "tranUsecaseAttribute":
                return new TranUsecaseAttributePropertyElement(unmarshalTrafficObjectUsecaseAttributeProperty((TrafficObjectUsecaseAttributePropertyType) value));
            case "tranKeyValuePairAttribute":
                return new TranKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "tranDataQualityAttribute":
                return new TranDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "trafficVolumeAttribute":
                return new TrafficVolumeAttributePropertyElement(unmarshalTrafficVolumeAttributeProperty((TrafficVolumeAttributePropertyType) value));
            case "roadStructureAttribute":
                return new RoadStructureAttributePropertyElement(unmarshalRoadStructureAttributeProperty((RoadStructureAttributePropertyType) value));
            case "roadStatus":
                return new RoadStatusPropertyElement(unmarshalRoadTypeProperty((RoadTypePropertyType) value));
            case "railwayRouteAttribute":
                return new RailwayRouteAttributePropertyElement(unmarshalRailwayRouteAttributeProperty((RailwayRouteAttributePropertyType) value));
            case "trackAttribute":
                return new TrackAttributePropertyElement(unmarshalTrackAttributeProperty((TrackAttributePropertyType) value));
            case "squareUrbanPlanAttribute":
                return new SquareUrbanPlanAttributePropertyElement(unmarshalSquareUrbanPlanAttributeProperty((SquareUrbanPlanAttributePropertyType) value));
            case "railwayTrackAttribute":
                return new RailwayTrackAttributePropertyElement(unmarshalRailwayTrackAttributeProperty((RailwayTrackAttributePropertyType) value));
            case "trafficAreaStructureAttribute":
                return new TrafficAreaStructureAttributePropertyElement(unmarshalTrafficAreaStructureAttributeProperty((TrafficAreaStructureAttributePropertyType) value));
            case "tunBaseAttribute":
                return new TunBaseAttributePropertyElement(unmarshalConstructionBaseAttributeProperty((ConstructionBaseAttributePropertyType) value));
            case "tunStructureAttribute":
                return new TunStructureAttributePropertyElement(unmarshalTunnelStructureAttributeProperty((TunnelStructureAttributePropertyType) value));
            case "tunFunctionalAttribute":
                return new TunFunctionalAttributePropertyElement(unmarshalTunnelFunctionalAttributeProperty((TunnelFunctionalAttributePropertyType) value));
            case "tunRiskAssessmentAttribute":
                return new TunRiskAssessmentAttributePropertyElement(unmarshalConstructionRiskAssessmentAttributeProperty((ConstructionRiskAssessmentAttributePropertyType) value));
            case "tunDisasterRiskAttribute":
                return new TunDisasterRiskAttributePropertyElement(unmarshalDisasterRiskAttributeProperty((DisasterRiskAttributePropertyType) value));
            case "tunDataQualityAttribute":
                return new TunDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "tunFacilityIdAttribute":
                return new TunFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "tunFacilityTypeAttribute":
                return new TunFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "tunFacilityAttribute":
                return new TunFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "tunKeyValuePairAttribute":
                return new TunKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "vegFacilityIdAttribute":
                return new VegFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "vegFacilityTypeAttribute":
                return new VegFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "vegFacilityAttribute":
                return new VegFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "vegDataQualityAttribute":
                return new VegDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "vegKeyValuePairAttribute":
                return new VegKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "floodingRiskAttribute":
                return new FloodingRiskAttributePropertyElement(unmarshalFloodingRiskAttributeProperty((FloodingRiskAttributePropertyType) value));
            case "wtrFacilityIdAttribute":
                return new WtrFacilityIdAttributePropertyElement(unmarshalFacilityIdAttributeProperty((FacilityIdAttributePropertyType) value));
            case "wtrFacilityTypeAttribute":
                return new WtrFacilityTypeAttributePropertyElement(unmarshalFacilityTypeAttributeProperty((FacilityTypeAttributePropertyType) value));
            case "wtrFacilityAttribute":
                return new WtrFacilityAttributePropertyElement(unmarshalFacilityAttributeProperty((FacilityAttributePropertyType) value));
            case "waterBodyDetailAttribute":
                return new WaterBodyDetailAttributePropertyElement(unmarshalWaterBodyDetailAttributeProperty((WaterBodyDetailAttributePropertyType) value));
            case "wtrDataQualityAttribute":
                return new WtrDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "wtrKeyValuePairAttribute":
                return new WtrKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "fiscalYearOfPublication":
                LocalDate fiscalYearOfPublication = ((XMLGregorianCalendar) value).toGregorianCalendar().toZonedDateTime().toLocalDate();
                return new FiscalYearOfPublicationProperty(Year.of(fiscalYearOfPublication.getYear()));
            case "language":
                return new LanguageProperty(helper.getGMLUnmarshaller().unmarshalCode((CodeType) value));
        }

        // all other types
        return unmarshal(value);
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        CheckedTypeMapper<ADEModelObject> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private ConstructionBaseAttribute unmarshalConstructionBaseAttribute(ConstructionBaseAttributeType src) throws MissingADESchemaException {
        ConstructionBaseAttribute dest = new ConstructionBaseAttribute();

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        dest.setAdministorator(src.getAdministorator());
        dest.setAdminOffice(src.getAdminOffice());

        if (src.isSetOperatorType())
            dest.setOperatorType(helper.getGMLUnmarshaller().unmarshalCode(src.getOperatorType()));

        if (src.isSetInstallerType())
            dest.setInstallerType(helper.getGMLUnmarshaller().unmarshalCode(src.getInstallerType()));

        dest.setInstaller(src.getInstaller());
        dest.setStructureOrdinance(src.getStructureOrdinance());
        dest.setSpecification(src.getSpecification());
        dest.setKana(src.getKana());

        if (src.isSetConstructionStartYear()) {
            LocalDate date = src.getConstructionStartYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setConstructionStartYear(Year.of(date.getYear()));
        }

        if (src.isSetCompletionYear()) {
            LocalDate date = src.getCompletionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setCompletionYear(Year.of(date.getYear()));
        }

        if (src.isSetFacilityAge())
            dest.setFacilityAge(src.getFacilityAge().intValue());

        if (src.isSetUpdate())
            dest.setUpdate(src.getUpdate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetPurpose())
            dest.setPurpose(helper.getGMLUnmarshaller().unmarshalCode(src.getPurpose()));

        return dest;
    }

    private ConstructionBaseAttributeProperty unmarshalConstructionBaseAttributeProperty(ConstructionBaseAttributePropertyType src) throws MissingADESchemaException {
        ConstructionBaseAttributeProperty dest = new ConstructionBaseAttributeProperty();

        if (src.isSetConstructionBaseAttribute())
            dest.setObject(unmarshalConstructionBaseAttribute(src.getConstructionBaseAttribute()));

        return dest;
    }

    private void unmarshalFacilityIdAttribute(FacilityIdAttributeType src, FacilityIdAttribute dest) throws MissingADESchemaException {
        dest.setId(src.getId());
        dest.setPartId(src.getPartId());
        dest.setBranchId(src.getBranchId());

        if (src.isSetPrefecture()) {
            for (CodeType prefecture : src.getPrefecture())
                dest.getPrefecture().add(helper.getGMLUnmarshaller().unmarshalCode(prefecture));
        }

        if (src.isSetCity()) {
            for (CodeType city : src.getCity())
                dest.getCity().add(helper.getGMLUnmarshaller().unmarshalCode(city));
        }

        dest.setRoute(src.getRoute());
        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());
        dest.setStartLat(src.getStartLat());
        dest.setStartLong(src.getStartLong());

        if (src.isSetAlternativeName()) {
            for (String alternativeName : src.getAlternativeName())
                dest.getAlternativeName().add(alternativeName);
        }
    }

    private FacilityIdAttribute unmarshalFacilityIdAttribute(FacilityIdAttributeType src) throws MissingADESchemaException {
        FacilityIdAttribute dest = new FacilityIdAttribute();
        unmarshalFacilityIdAttribute(src, dest);
        return dest;
    }

    private RiverFacilityIdAttribute unmarshalRiverFacilityIdAttribute(RiverFacilityIdAttributeType src) throws MissingADESchemaException {
        RiverFacilityIdAttribute dest = new RiverFacilityIdAttribute();
        unmarshalFacilityIdAttribute(src, dest);

        if (src.isSetRiverCode())
            dest.setRiverCode(helper.getGMLUnmarshaller().unmarshalCode(src.getRiverCode()));

        dest.setRiverName(src.getRiverName());

        if (src.isSetSideType())
            dest.setSideType(helper.getGMLUnmarshaller().unmarshalCode(src.getSideType()));

        if (src.isSetLeftPost())
            dest.setLeftPost(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftPost()));

        if (src.isSetLeftDistance())
            dest.setLeftDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftDistance()));

        if (src.isSetRightPost())
            dest.setRightPost(helper.getGMLUnmarshaller().unmarshalLength(src.getRightPost()));

        if (src.isSetRightDistance())
            dest.setRightDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getRightDistance()));

        if (src.isSetLeftStartPost())
            dest.setLeftStartPost(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftStartPost()));

        if (src.isSetLeftStartDistance())
            dest.setLeftStartDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftStartDistance()));

        if (src.isSetLeftEndPost())
            dest.setLeftEndPost(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftEndPost()));

        if (src.isSetLeftEndDistance())
            dest.setLeftEndDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getLeftEndDistance()));

        if (src.isSetRightStartPost())
            dest.setRightStartPost(helper.getGMLUnmarshaller().unmarshalLength(src.getRightStartPost()));

        if (src.isSetRightStartDistance())
            dest.setRightStartDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getRightStartDistance()));

        if (src.isSetRightEndPost())
            dest.setRightEndPost(helper.getGMLUnmarshaller().unmarshalLength(src.getRightEndPost()));

        if (src.isSetRightEndDistance())
            dest.setRightEndDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getRightEndDistance()));

        return dest;
    }

    private FacilityIdAttributeProperty unmarshalFacilityIdAttributeProperty(FacilityIdAttributePropertyType src) throws MissingADESchemaException {
        FacilityIdAttributeProperty dest = new FacilityIdAttributeProperty();

        if (src.isSetFacilityIdAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getFacilityIdAttribute());
            if (object instanceof FacilityIdAttribute)
                dest.setObject((FacilityIdAttribute) object);
        }

        return dest;
    }

    private FacilityTypeAttribute unmarshalFacilityTypeAttribute(FacilityTypeAttributeType src) throws MissingADESchemaException {
        FacilityTypeAttribute dest = new FacilityTypeAttribute();

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetFunction()) {
            for (CodeType function : src.getFunction())
                dest.getFunction().add(helper.getGMLUnmarshaller().unmarshalCode(function));
        }

        return dest;
    }

    private FacilityTypeAttributeProperty unmarshalFacilityTypeAttributeProperty(FacilityTypeAttributePropertyType src) throws MissingADESchemaException {
        FacilityTypeAttributeProperty dest = new FacilityTypeAttributeProperty();

        if (src.isSetFacilityTypeAttribute())
            dest.setObject(unmarshalFacilityTypeAttribute(src.getFacilityTypeAttribute()));

        return dest;
    }

    private void unmarshalFacilityAttribute(FacilityAttributeType src, FacilityAttribute dest) throws MissingADESchemaException {
        dest.setFacilityId(src.getFacilityId());
    }

    private ParkFacilityLongevityPlanAttribute unmarshalParkFacilityLongevityPlanAttribute(ParkFacilityLongevityPlanAttributeType src) throws MissingADESchemaException {
        ParkFacilityLongevityPlanAttribute dest = new ParkFacilityLongevityPlanAttribute();
        unmarshalFacilityAttribute(src, dest);

        if (src.isSetParkCode())
            dest.setParkCode(helper.getGMLUnmarshaller().unmarshalCode(src.getParkCode()));

        if (src.isSetParkName())
            dest.setParkName(helper.getGMLUnmarshaller().unmarshalCode(src.getParkName()));

        if (src.isSetParkType())
            dest.setParkType(helper.getGMLUnmarshaller().unmarshalCode(src.getParkType()));

        if (src.isSetFacilityName())
            dest.setFacilityName(helper.getGMLUnmarshaller().unmarshalCode(src.getFacilityName()));

        dest.setFacilityNameOptional(src.getFacilityNameOptional());
        dest.setSpecificFacilityName(src.getSpecificFacilityName());

        if (src.isSetNumberOfFacilities())
            dest.setNumberOfFacilities(unmarshalNumberOfFacilitiesProperty(src.getNumberOfFacilities()));

        dest.setSize(src.getSize());

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        dest.setMainMaterialOptional(src.getMainMaterialOptional());

        if (src.isSetInstallationYear()) {
            LocalDate date = src.getInstallationYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setInstallationYear(Year.of(date.getYear()));
        }

        if (src.isSetDisposalLimitPeriod())
            dest.setDisposalLimitPeriod(src.getDisposalLimitPeriod().intValue());

        if (src.isSetExpectedUsagePeriod())
            dest.setExpectedUsagePeriod(src.getExpectedUsagePeriod().intValue());

        if (src.isSetRepairsBeforeParkHealthAssessment())
            dest.setRepairsBeforeParkHealthAssessment(unmarshalRepairsBeforeParkHealthAssessmentProperty(src.getRepairsBeforeParkHealthAssessment()));

        if (src.isSetParkHealthAssessment()) {
            for (ParkHealthAssessmentPropertyType parkHealthAssessment : src.getParkHealthAssessment())
                dest.getParkHealthAssessment().add(unmarshalParkHealthAssessmentProperty(parkHealthAssessment));
        }

        if (src.isSetManagementType())
            dest.setManagementType(helper.getGMLUnmarshaller().unmarshalCode(src.getManagementType()));

        if (src.isSetExpectedRenewalYearWithMeasures()) {
            LocalDate date = src.getExpectedRenewalYearWithMeasures().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setExpectedRenewalYearWithMeasures(Year.of(date.getYear()));
        }

        if (src.isSetLongevityMeasures()) {
            for (LongevityMeasuresPropertyType longevityMeasures : src.getLongevityMeasures())
                dest.getLongevityMeasures().add(unmarshalLongevityMeasuresProperty(longevityMeasures));
        }

        dest.setNoteForLongevity(src.getNoteForLongevity());

        return dest;
    }

    private NumberOfFacilities unmarshalNumberOfFacilities(NumberOfFacilitiesType src) throws MissingADESchemaException {
        NumberOfFacilities dest = new NumberOfFacilities();

        if (src.isSetQuantity())
            dest.setQuantity(src.getQuantity().intValue());

        if (src.isSetQuantityUnit())
            dest.setQuantityUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getQuantityUnit()));

        return dest;
    }

    private NumberOfFacilitiesProperty unmarshalNumberOfFacilitiesProperty(NumberOfFacilitiesPropertyType src) throws MissingADESchemaException {
        NumberOfFacilitiesProperty dest = new NumberOfFacilitiesProperty();

        if (src.isSetNumberOfFacilities())
            dest.setObject(unmarshalNumberOfFacilities(src.getNumberOfFacilities()));

        return dest;
    }

    private RepairsBeforeParkHealthAssessment unmarshalRepairsBeforeParkHealthAssessment(RepairsBeforeParkHealthAssessmentType src) throws MissingADESchemaException {
        RepairsBeforeParkHealthAssessment dest = new RepairsBeforeParkHealthAssessment();

        if (src.isSetRepair())
            dest.setRepair(helper.getGMLUnmarshaller().unmarshalCode(src.getRepair()));

        if (src.isSetRepairFiscalYear()) {
            LocalDate date = src.getRepairFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setRepairFiscalYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private RepairsBeforeParkHealthAssessmentProperty unmarshalRepairsBeforeParkHealthAssessmentProperty(RepairsBeforeParkHealthAssessmentPropertyType src) throws MissingADESchemaException {
        RepairsBeforeParkHealthAssessmentProperty dest = new RepairsBeforeParkHealthAssessmentProperty();

        if (src.isSetRepairsBeforeParkHealthAssessment())
            dest.setObject(unmarshalRepairsBeforeParkHealthAssessment(src.getRepairsBeforeParkHealthAssessment()));

        return dest;
    }

    private ParkHealthAssessment unmarshalParkHealthAssessment(ParkHealthAssessmentType src) throws MissingADESchemaException {
        ParkHealthAssessment dest = new ParkHealthAssessment();

        if (src.isSetAssessmentFiscalYear()) {
            LocalDate date = src.getAssessmentFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAssessmentFiscalYear(Year.of(date.getYear()));
        }

        dest.setDeteriorationStatus(src.getDeteriorationStatus());

        if (src.isSetCondition())
            dest.setCondition(helper.getGMLUnmarshaller().unmarshalCode(src.getCondition()));

        if (src.isSetUrgency())
            dest.setUrgency(helper.getGMLUnmarshaller().unmarshalCode(src.getUrgency()));

        return dest;
    }

    private ParkHealthAssessmentProperty unmarshalParkHealthAssessmentProperty(ParkHealthAssessmentPropertyType src) throws MissingADESchemaException {
        ParkHealthAssessmentProperty dest = new ParkHealthAssessmentProperty();

        if (src.isSetParkHealthAssessment())
            dest.setObject(unmarshalParkHealthAssessment(src.getParkHealthAssessment()));

        return dest;
    }

    private LongevityMeasures unmarshalLongevityMeasures(LongevityMeasuresType src) throws MissingADESchemaException {
        LongevityMeasures dest = new LongevityMeasures();

        if (src.isSetFiscalYearForCountermeasures()) {
            LocalDate date = src.getFiscalYearForCountermeasures().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setFiscalYearForCountermeasures(Year.of(date.getYear()));
        }

        if (src.isSetCountermeasuresCost())
            dest.setCountermeasuresCost(unmarshalCountermeasuresCostProperty(src.getCountermeasuresCost()));

        dest.setDescription(src.getDescription());

        return dest;
    }

    private LongevityMeasuresProperty unmarshalLongevityMeasuresProperty(LongevityMeasuresPropertyType src) throws MissingADESchemaException {
        LongevityMeasuresProperty dest = new LongevityMeasuresProperty();

        if (src.isSetLongevityMeasures())
            dest.setObject(unmarshalLongevityMeasures(src.getLongevityMeasures()));

        return dest;
    }

    private CountermeasuresCost unmarshalCountermeasuresCost(CountermeasuresCostType src) throws MissingADESchemaException {
        CountermeasuresCost dest = new CountermeasuresCost();

        if (src.isSetCost())
            dest.setCost(src.getCost().intValue());

        dest.setCostUnit(src.getCostUnit());

        return dest;
    }

    private CountermeasuresCostProperty unmarshalCountermeasuresCostProperty(CountermeasuresCostPropertyType src) throws MissingADESchemaException {
        CountermeasuresCostProperty dest = new CountermeasuresCostProperty();

        if (src.isSetCountermeasuresCost())
            dest.setObject(unmarshalCountermeasuresCost(src.getCountermeasuresCost()));

        return dest;
    }

    private void unmarshalPortAttribute(PortAttributeType src, PortAttribute dest) throws MissingADESchemaException {
        unmarshalFacilityAttribute(src, dest);

        if (src.isSetPortFacilityDetailsType())
            dest.setPortFacilityDetailsType(helper.getGMLUnmarshaller().unmarshalCode(src.getPortFacilityDetailsType()));

        dest.setPortName(src.getPortName());

        if (src.isSetPortStatus())
            dest.setPortStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getPortStatus()));

        dest.setDistrict(src.getDistrict());

        if (src.isSetGrantType())
            dest.setGrantType(helper.getGMLUnmarshaller().unmarshalCode(src.getGrantType()));

        dest.setIsDesignated(src.isIsDesignated());

        if (src.isSetDegradationLevel())
            dest.setDegradationLevel(src.getDegradationLevel().intValue());
    }

    private HarborFacility unmarshalHarborFacility(HarborFacilityType src) throws MissingADESchemaException {
        HarborFacility dest = new HarborFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetGeologicalType())
            dest.setGeologicalType(helper.getGMLUnmarshaller().unmarshalCode(src.getGeologicalType()));

        dest.setObstructingStructures(src.getObstructingStructures());

        if (src.isSetStructuralLimitations())
            dest.setStructuralLimitations(helper.getGMLUnmarshaller().unmarshalLength(src.getStructuralLimitations()));

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetMinimumWidth())
            dest.setMinimumWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumWidth()));

        if (src.isSetMaximumWidth())
            dest.setMaximumWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumWidth()));

        if (src.isSetPlannedDepth())
            dest.setPlannedDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getPlannedDepth()));

        if (src.isSetCurrentDepth())
            dest.setCurrentDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getCurrentDepth()));

        dest.setIsDredged(src.isIsDredged());

        if (src.isSetAreaType())
            dest.setAreaType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaType()));

        if (src.isSetInnerArea())
            dest.setInnerArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerArea()));

        if (src.isSetOuterArea())
            dest.setOuterArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterArea()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        if (src.isSetNote()) {
            for (String note : src.getNote())
                dest.getNote().add(note);
        }

        return dest;
    }

    private PortProtectiveFacility unmarshalPortProtectiveFacility(PortProtectiveFacilityType src) throws MissingADESchemaException {
        PortProtectiveFacility dest = new PortProtectiveFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        if (src.isSetNote()) {
            for (String note : src.getNote())
                dest.getNote().add(note);
        }

        return dest;
    }

    private MooringFacility unmarshalMooringFacility(MooringFacilityType src) throws MissingADESchemaException {
        MooringFacility dest = new MooringFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetMainPartLength())
            dest.setMainPartLength(helper.getGMLUnmarshaller().unmarshalLength(src.getMainPartLength()));

        if (src.isSetTotalLength())
            dest.setTotalLength(helper.getGMLUnmarshaller().unmarshalLength(src.getTotalLength()));

        if (src.isSetFacilityWidth())
            dest.setFacilityWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getFacilityWidth()));

        if (src.isSetApronWidth())
            dest.setApronWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getApronWidth()));

        if (src.isSetPlannedDepth())
            dest.setPlannedDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getPlannedDepth()));

        if (src.isSetCurrentDepth())
            dest.setCurrentDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getCurrentDepth()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetCeilingHeight())
            dest.setCeilingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getCeilingHeight()));

        if (src.isSetGravityResistant())
            dest.setGravityResistant(helper.getGMLUnmarshaller().unmarshalMeasure(src.getGravityResistant()));

        if (src.isSetForm())
            dest.setForm(helper.getGMLUnmarshaller().unmarshalCode(src.getForm()));

        if (src.isSetMainVessels())
            dest.setMainVessels(helper.getGMLUnmarshaller().unmarshalCode(src.getMainVessels()));

        if (src.isSetMooringPostWeight())
            dest.setMooringPostWeight(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMooringPostWeight()));

        if (src.isSetNumberOfMooringPosts())
            dest.setNumberOfMooringPosts(src.getNumberOfMooringPosts().intValue());

        if (src.isSetResistantMaterial())
            dest.setResistantMaterial(src.getResistantMaterial().intValue());

        if (src.isSetLighting())
            dest.setLighting(src.getLighting().intValue());

        if (src.isSetStairs())
            dest.setStairs(src.getStairs().intValue());

        dest.setLifesavingAppliances(src.getLifesavingAppliances());

        if (src.isSetNumberOfLifesavingAppliances())
            dest.setNumberOfLifesavingAppliances(src.getNumberOfLifesavingAppliances().intValue());

        if (src.isSetBumper())
            dest.setBumper(helper.getGMLUnmarshaller().unmarshalLength(src.getBumper()));

        if (src.isSetNumberOfVehicleBoardings())
            dest.setNumberOfVehicleBoardings(src.getNumberOfVehicleBoardings().intValue());

        if (src.isSetVehicleBoardingWidth())
            dest.setVehicleBoardingWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getVehicleBoardingWidth()));

        dest.setShipType(src.getShipType());

        if (src.isSetNumberOfSeats())
            dest.setNumberOfSeats(src.getNumberOfSeats().intValue());

        if (src.isSetMainCargo())
            dest.setMainCargo(helper.getGMLUnmarshaller().unmarshalCode(src.getMainCargo()));

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortTransportationFacility unmarshalPortTransportationFacility(PortTransportationFacilityType src) throws MissingADESchemaException {
        PortTransportationFacility dest = new PortTransportationFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        dest.setStartingPoint(src.getStartingPoint());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetBeddingWidth())
            dest.setBeddingWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getBeddingWidth()));

        if (src.isSetNumberOfLanes())
            dest.setNumberOfLanes(src.getNumberOfLanes().intValue());

        if (src.isSetParkingLotCapacityOfBus())
            dest.setParkingLotCapacityOfBus(src.getParkingLotCapacityOfBus().intValue());

        if (src.isSetParkingLotCapacityOfCars())
            dest.setParkingLotCapacityOfCars(src.getParkingLotCapacityOfCars().intValue());

        if (src.isSetRouteType())
            dest.setRouteType(helper.getGMLUnmarshaller().unmarshalCode(src.getRouteType()));

        if (src.isSetHeightToDigit())
            dest.setHeightToDigit(helper.getGMLUnmarshaller().unmarshalLength(src.getHeightToDigit()));

        if (src.isSetHeightLimit())
            dest.setHeightLimit(helper.getGMLUnmarshaller().unmarshalLength(src.getHeightLimit()));

        if (src.isSetMinimumWidth())
            dest.setMinimumWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumWidth()));

        if (src.isSetMinimumDepth())
            dest.setMinimumDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumDepth()));

        if (src.isSetNumberOfAircraftParkingSpaces())
            dest.setNumberOfAircraftParkingSpaces(src.getNumberOfAircraftParkingSpaces().intValue());

        if (src.isSetPavementType())
            dest.setPavementType(helper.getGMLUnmarshaller().unmarshalCode(src.getPavementType()));

        if (src.isSetMainCargo())
            dest.setMainCargo(helper.getGMLUnmarshaller().unmarshalCode(src.getMainCargo()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private NavigationAssistanceFacility unmarshalNavigationAssistanceFacility(NavigationAssistanceFacilityType src) throws MissingADESchemaException {
        NavigationAssistanceFacility dest = new NavigationAssistanceFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setSubsidy(src.getSubsidy());
        dest.setNote(src.getNote());

        return dest;
    }

    private CargoHandlingFacility unmarshalCargoHandlingFacility(CargoHandlingFacilityType src) throws MissingADESchemaException {
        CargoHandlingFacility dest = new CargoHandlingFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetMainCargo())
            dest.setMainCargo(helper.getGMLUnmarshaller().unmarshalCode(src.getMainCargo()));

        dest.setMooringFacility(src.getMooringFacility());

        if (src.isSetLiftableLoad())
            dest.setLiftableLoad(helper.getGMLUnmarshaller().unmarshalMeasure(src.getLiftableLoad()));

        if (src.isSetAbility())
            dest.setAbility(src.getAbility().intValue());

        if (src.isSetPackingName())
            dest.setPackingName(helper.getGMLUnmarshaller().unmarshalCode(src.getPackingName()));

        if (src.isSetAcquisitionYear()) {
            LocalDate date = src.getAcquisitionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAcquisitionYear(Year.of(date.getYear()));
        }

        if (src.isSetInnerTotalFloorArea())
            dest.setInnerTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerTotalFloorArea()));

        if (src.isSetInnerOfSiteArea())
            dest.setInnerOfSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerOfSiteArea()));

        if (src.isSetOuterOfTotalFloorArea())
            dest.setOuterOfTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.isSetOuterSiteArea())
            dest.setOuterSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterSiteArea()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortPassengerFacility unmarshalPortPassengerFacility(PortPassengerFacilityType src) throws MissingADESchemaException {
        PortPassengerFacility dest = new PortPassengerFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetAcquisitionYear()) {
            LocalDate date = src.getAcquisitionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAcquisitionYear(Year.of(date.getYear()));
        }

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortStorageFacility unmarshalPortStorageFacility(PortStorageFacilityType src) throws MissingADESchemaException {
        PortStorageFacility dest = new PortStorageFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetInnerTotalFloorArea())
            dest.setInnerTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerTotalFloorArea()));

        if (src.isSetInnerOfSiteArea())
            dest.setInnerOfSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerOfSiteArea()));

        if (src.isSetOuterOfTotalFloorArea())
            dest.setOuterOfTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.isSetOuterSiteArea())
            dest.setOuterSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterSiteArea()));

        if (src.isSetMainCargo())
            dest.setMainCargo(helper.getGMLUnmarshaller().unmarshalCode(src.getMainCargo()));

        if (src.isSetStorageCapacity())
            dest.setStorageCapacity(src.getStorageCapacity().intValue());

        if (src.isSetStorageCapacityUnit())
            dest.setStorageCapacityUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getStorageCapacityUnit()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private ShipServiceFacility unmarshalShipServiceFacility(ShipServiceFacilityType src) throws MissingADESchemaException {
        ShipServiceFacility dest = new ShipServiceFacility();
        unmarshalPortAttribute(src, dest);

        dest.setShipType(src.getShipType());

        if (src.isSetSupplyAbility())
            dest.setSupplyAbility(src.getSupplyAbility().intValue());

        if (src.isSetSupplyAbilityUnit())
            dest.setSupplyAbilityUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getSupplyAbilityUnit()));

        dest.setMooringPlace(src.getMooringPlace());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetAcquisitionYear()) {
            LocalDate date = src.getAcquisitionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAcquisitionYear(Year.of(date.getYear()));
        }

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortWasteTreatmentFacility unmarshalPortWasteTreatmentFacility(PortWasteTreatmentFacilityType src) throws MissingADESchemaException {
        PortWasteTreatmentFacility dest = new PortWasteTreatmentFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetPerimeter())
            dest.setPerimeter(helper.getGMLUnmarshaller().unmarshalLength(src.getPerimeter()));

        if (src.isSetMainPartLength())
            dest.setMainPartLength(helper.getGMLUnmarshaller().unmarshalLength(src.getMainPartLength()));

        if (src.isSetInnerShoreLength())
            dest.setInnerShoreLength(helper.getGMLUnmarshaller().unmarshalLength(src.getInnerShoreLength()));

        if (src.isSetCeilingHeight())
            dest.setCeilingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getCeilingHeight()));

        if (src.isSetWaveDissipatorLength())
            dest.setWaveDissipatorLength(helper.getGMLUnmarshaller().unmarshalLength(src.getWaveDissipatorLength()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetWasteType())
            dest.setWasteType(helper.getGMLUnmarshaller().unmarshalCode(src.getWasteType()));

        if (src.isSetPlannedDisposalArea())
            dest.setPlannedDisposalArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getPlannedDisposalArea()));

        if (src.isSetPlannedDisposalAmount())
            dest.setPlannedDisposalAmount(src.getPlannedDisposalAmount().intValue());

        if (src.isSetReceivingCapacity())
            dest.setReceivingCapacity(src.getReceivingCapacity().intValue());

        dest.setShipType(src.getShipType());

        if (src.isSetUnitOfReceivingCapacity())
            dest.setUnitOfReceivingCapacity(helper.getGMLUnmarshaller().unmarshalCode(src.getUnitOfReceivingCapacity()));

        if (src.isSetAcquisitionYear()) {
            LocalDate date = src.getAcquisitionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAcquisitionYear(Year.of(date.getYear()));
        }

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortEnvironmentalImprovementFacility unmarshalPortEnvironmentalImprovementFacility(PortEnvironmentalImprovementFacilityType src) throws MissingADESchemaException {
        PortEnvironmentalImprovementFacility dest = new PortEnvironmentalImprovementFacility();
        unmarshalPortAttribute(src, dest);

        dest.setUsage(src.getUsage());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetTotalFoorArea())
            dest.setTotalFoorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFoorArea()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortPollutionControlFacility unmarshalPortPollutionControlFacility(PortPollutionControlFacilityType src) throws MissingADESchemaException {
        PortPollutionControlFacility dest = new PortPollutionControlFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetCrossSectionalArea())
            dest.setCrossSectionalArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getCrossSectionalArea()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetHeight())
            dest.setHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getHeight()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortWelfareFacility unmarshalPortWelfareFacility(PortWelfareFacilityType src) throws MissingADESchemaException {
        PortWelfareFacility dest = new PortWelfareFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private PortManagementFacility unmarshalPortManagementFacility(PortManagementFacilityType src) throws MissingADESchemaException {
        PortManagementFacility dest = new PortManagementFacility();
        unmarshalPortAttribute(src, dest);

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetNumberOfShipTypes())
            dest.setNumberOfShipTypes(src.getNumberOfShipTypes().intValue());

        if (src.isSetUnitOfShipType())
            dest.setUnitOfShipType(helper.getGMLUnmarshaller().unmarshalCode(src.getUnitOfShipType()));

        if (src.isSetLoadingCapacity())
            dest.setLoadingCapacity(src.getLoadingCapacity().intValue());

        if (src.isSetAcquisitionYear()) {
            LocalDate date = src.getAcquisitionYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setAcquisitionYear(Year.of(date.getYear()));
        }

        dest.setUsage(src.getUsage());

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private CyberportMarinaAndPBS unmarshalCyberportMarinaAndPBS(CyberportMarinaAndPBSType src) throws MissingADESchemaException {
        CyberportMarinaAndPBS dest = new CyberportMarinaAndPBS();
        unmarshalPortAttribute(src, dest);

        if (src.isSetGeologicalType())
            dest.setGeologicalType(helper.getGMLUnmarshaller().unmarshalCode(src.getGeologicalType()));

        dest.setObstructingStructures(src.getObstructingStructures());

        if (src.isSetMainPartLength())
            dest.setMainPartLength(helper.getGMLUnmarshaller().unmarshalLength(src.getMainPartLength()));

        if (src.isSetTotalLength())
            dest.setTotalLength(helper.getGMLUnmarshaller().unmarshalLength(src.getTotalLength()));

        if (src.isSetWaveDissipatorLength())
            dest.setWaveDissipatorLength(helper.getGMLUnmarshaller().unmarshalLength(src.getWaveDissipatorLength()));

        if (src.isSetFacilityWidth())
            dest.setFacilityWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getFacilityWidth()));

        if (src.isSetApronWidth())
            dest.setApronWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getApronWidth()));

        dest.setRestrictionStructure(src.getRestrictionStructure());

        if (src.isSetPlannedDepth())
            dest.setPlannedDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getPlannedDepth()));

        if (src.isSetCurrentDepth())
            dest.setCurrentDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getCurrentDepth()));

        if (src.isSetInnerTotalFloorArea())
            dest.setInnerTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerTotalFloorArea()));

        if (src.isSetInnerOfSiteArea())
            dest.setInnerOfSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getInnerOfSiteArea()));

        if (src.isSetOuterOfTotalFloorArea())
            dest.setOuterOfTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterOfTotalFloorArea()));

        if (src.isSetOuterSiteArea())
            dest.setOuterSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOuterSiteArea()));

        if (src.isSetCeilingHeight())
            dest.setCeilingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getCeilingHeight()));

        if (src.isSetGravityResistant())
            dest.setGravityResistant(helper.getGMLUnmarshaller().unmarshalMeasure(src.getGravityResistant()));

        if (src.isSetForm())
            dest.setForm(helper.getGMLUnmarshaller().unmarshalCode(src.getForm()));

        if (src.isSetAreaType())
            dest.setAreaType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaType()));

        if (src.isSetMainVessels())
            dest.setMainVessels(helper.getGMLUnmarshaller().unmarshalCode(src.getMainVessels()));

        dest.setIsDredged(src.isIsDredged());

        if (src.isSetMooringPostWeight())
            dest.setMooringPostWeight(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMooringPostWeight()));

        if (src.isSetNumberOfMooringPosts())
            dest.setNumberOfMooringPosts(src.getNumberOfMooringPosts().intValue());

        if (src.isSetResistantMaterial())
            dest.setResistantMaterial(src.getResistantMaterial().intValue());

        if (src.isSetLighting())
            dest.setLighting(src.getLighting().intValue());

        if (src.isSetStairs())
            dest.setStairs(src.getStairs().intValue());

        dest.setLifesaving(src.getLifesaving());

        if (src.isSetLifesavingNumber())
            dest.setLifesavingNumber(src.getLifesavingNumber().intValue());

        if (src.isSetBumper())
            dest.setBumper(helper.getGMLUnmarshaller().unmarshalLength(src.getBumper()));

        if (src.isSetNumberOfVehicleBoardings())
            dest.setNumberOfVehicleBoardings(src.getNumberOfVehicleBoardings().intValue());

        if (src.isSetVehicleBoardingWidth())
            dest.setVehicleBoardingWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getVehicleBoardingWidth()));

        dest.setShipType(src.getShipType());

        if (src.isSetNumberOfSeats())
            dest.setNumberOfSeats(src.getNumberOfSeats().intValue());

        if (src.isSetMainCargo())
            dest.setMainCargo(helper.getGMLUnmarshaller().unmarshalCode(src.getMainCargo()));

        if (src.isSetStorageCapacity())
            dest.setStorageCapacity(src.getStorageCapacity().intValue());

        if (src.isSetStorageCapacityUnit())
            dest.setStorageCapacityUnit(helper.getGMLUnmarshaller().unmarshalCode(src.getStorageCapacityUnit()));

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        if (src.isSetTotalCost())
            dest.setTotalCost(src.getTotalCost().intValue());

        if (src.isSetSubsidy())
            dest.setSubsidy(src.getSubsidy().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private void unmarshalFishingPortAttribute(FishingPortAttributeType src, FishingPortAttribute dest) throws MissingADESchemaException {
        unmarshalFacilityAttribute(src, dest);
    }

    private FishingPortFacility unmarshalFishingPortFacility(FishingPortFacilityType src) throws MissingADESchemaException {
        FishingPortFacility dest = new FishingPortFacility();
        unmarshalFishingPortAttribute(src, dest);

        if (src.isSetFacilityDetailsType())
            dest.setFacilityDetailsType(helper.getGMLUnmarshaller().unmarshalCode(src.getFacilityDetailsType()));

        dest.setPortName(src.getPortName());

        if (src.isSetPortType())
            dest.setPortType(helper.getGMLUnmarshaller().unmarshalCode(src.getPortType()));

        dest.setAddress(src.getAddress());
        dest.setDesignatedArea(src.getDesignatedArea());

        if (src.isSetDesignation()) {
            for (String designation : src.getDesignation())
                dest.getDesignation().add(designation);
        }

        if (src.isSetDesignatedAdministrator()) {
            for (String designatedAdministrator : src.getDesignatedAdministrator())
                dest.getDesignatedAdministrator().add(designatedAdministrator);
        }

        if (src.isSetReferenceNumber()) {
            for (String referenceNumber : src.getReferenceNumber())
                dest.getReferenceNumber().add(referenceNumber);
        }

        if (src.isSetGrantType())
            dest.setGrantType(helper.getGMLUnmarshaller().unmarshalCode(src.getGrantType()));

        dest.setAdministrator(src.getAdministrator());
        dest.setFacilityManager(src.getFacilityManager());

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetMainMaterial())
            dest.setMainMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMainMaterial()));

        dest.setOtherStructure(src.getOtherStructure());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetCeilingHeight())
            dest.setCeilingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getCeilingHeight()));

        if (src.isSetDepth())
            dest.setDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getDepth()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        dest.setOtherSizeDescription(src.getOtherSizeDescription());

        if (src.isSetDateOfConstructionOrAcquisition())
            dest.setDateOfConstructionOrAcquisition(src.getDateOfConstructionOrAcquisition().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetCost())
            dest.setCost(src.getCost().intValue());

        dest.setNote(src.getNote());

        return dest;
    }

    private FishingPortCapacity unmarshalFishingPortCapacity(FishingPortCapacityType src) throws MissingADESchemaException {
        FishingPortCapacity dest = new FishingPortCapacity();
        unmarshalFishingPortAttribute(src, dest);

        dest.setCapacity(src.getCapacity());

        if (src.isSetWeightCapacity())
            dest.setWeightCapacity(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWeightCapacity()));

        if (src.isSetHullForm())
            dest.setHullForm(src.getHullForm().intValue());

        if (src.isSetShipNumber())
            dest.setShipNumber(src.getShipNumber().intValue());

        if (src.isSetWaterDepth2M())
            dest.setWaterDepth2m(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWaterDepth2M()));

        if (src.isSetWaterDepth23M())
            dest.setWaterDepth23m(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWaterDepth23M()));

        if (src.isSetWaterDepth36M())
            dest.setWaterDepth36m(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWaterDepth36M()));

        if (src.isSetWaterDepth6M())
            dest.setWaterDepth6m(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWaterDepth6M()));

        if (src.isSetHeightAboveAWL())
            dest.setHeightAboveAWL(helper.getGMLUnmarshaller().unmarshalLength(src.getHeightAboveAWL()));

        if (src.isSetHeightOnFoundations())
            dest.setHeightOnFoundations(helper.getGMLUnmarshaller().unmarshalLength(src.getHeightOnFoundations()));

        if (src.isSetLuminousRange())
            dest.setLuminousRange(helper.getGMLUnmarshaller().unmarshalLength(src.getLuminousRange()));

        dest.setLuminousColor(src.getLuminousColor());

        if (src.isSetCandlePower())
            dest.setCandlePower(src.getCandlePower().intValue());

        dest.setLightType(src.getLightType());
        dest.setPeriod(src.getPeriod());

        if (src.isSetMaximumGroundingWeight())
            dest.setMaximumGroundingWeight(src.getMaximumGroundingWeight().intValue());

        if (src.isSetHandleablePower())
            dest.setHandleablePower(src.getHandleablePower().intValue());

        if (src.isSetMaximumWaterSupply())
            dest.setMaximumWaterSupply(src.getMaximumWaterSupply().intValue());

        dest.setMaximumRefueling(src.getMaximumRefueling());

        if (src.isSetPeople())
            dest.setPeople(src.getPeople().intValue());

        dest.setOther(src.getOther());

        return dest;
    }

    private MaintenanceHistoryAttribute unmarshalMaintenanceHistoryAttribute(MaintenanceHistoryAttributeType src) throws MissingADESchemaException {
        MaintenanceHistoryAttribute dest = new MaintenanceHistoryAttribute();
        unmarshalFacilityAttribute(src, dest);

        if (src.isSetMaintenanceType())
            dest.setMaintenanceType(helper.getGMLUnmarshaller().unmarshalCode(src.getMaintenanceType()));

        if (src.isSetMaintenanceFiscalYear()) {
            LocalDate date = src.getMaintenanceFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setMaintenanceFiscalYear(Year.of(date.getYear()));
        }

        if (src.isSetMaintenanceYear()) {
            LocalDate date = src.getMaintenanceYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setMaintenanceYear(Year.of(date.getYear()));
        }

        if (src.isSetMaintenanceDate())
            dest.setMaintenanceDate(src.getMaintenanceDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setStatus(src.getStatus());

        if (src.isSetDescription())
            dest.setDescription(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDescription()));

        return dest;
    }

    private FacilityAttributeProperty unmarshalFacilityAttributeProperty(FacilityAttributePropertyType src) throws MissingADESchemaException {
        FacilityAttributeProperty dest = new FacilityAttributeProperty();

        if (src.isSetFacilityAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getFacilityAttribute());
            if (object instanceof FacilityAttribute)
                dest.setObject((FacilityAttribute) object);
        }

        return dest;
    }

    private BridgeStructureAttribute unmarshalBridgeStructureAttribute(BridgeStructureAttributeType src) throws MissingADESchemaException {
        BridgeStructureAttribute dest = new BridgeStructureAttribute();

        if (src.isSetMaterial())
            dest.setMaterial(helper.getGMLUnmarshaller().unmarshalCode(src.getMaterial()));

        if (src.isSetBridgeType())
            dest.setBridgeType(helper.getGMLUnmarshaller().unmarshalCode(src.getBridgeType()));

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetWeightRestriction())
            dest.setWeightRestriction(helper.getGMLUnmarshaller().unmarshalMeasure(src.getWeightRestriction()));

        if (src.isSetHeightRestriction())
            dest.setHeightRestriction(helper.getGMLUnmarshaller().unmarshalLength(src.getHeightRestriction()));

        if (src.isSetWidthRestriction())
            dest.setWidthRestriction(helper.getGMLUnmarshaller().unmarshalLength(src.getWidthRestriction()));

        if (src.isSetUnderGirderHeight())
            dest.setUnderGirderHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getUnderGirderHeight()));

        if (src.isSetSlopeType())
            dest.setSlopeType(helper.getGMLUnmarshaller().unmarshalCode(src.getSlopeType()));

        dest.setEscalator(src.isEscalator());

        return dest;
    }

    private BridgeStructureAttributeProperty unmarshalBridgeStructureAttributeProperty(BridgeStructureAttributePropertyType src) throws MissingADESchemaException {
        BridgeStructureAttributeProperty dest = new BridgeStructureAttributeProperty();

        if (src.isSetBridgeStructureAttribute())
            dest.setObject(unmarshalBridgeStructureAttribute(src.getBridgeStructureAttribute()));

        return dest;
    }

    private BridgeFunctionalAttribute unmarshalBridgeFunctionalAttribute(BridgeFunctionalAttributeType src) throws MissingADESchemaException {
        BridgeFunctionalAttribute dest = new BridgeFunctionalAttribute();

        if (src.isSetDirectionType())
            dest.setDirectionType(helper.getGMLUnmarshaller().unmarshalCode(src.getDirectionType()));

        if (src.isSetUserType())
            dest.setUserType(helper.getGMLUnmarshaller().unmarshalCode(src.getUserType()));

        return dest;
    }

    private BridgeFunctionalAttributeProperty unmarshalBridgeFunctionalAttributeProperty(BridgeFunctionalAttributePropertyType src) throws MissingADESchemaException {
        BridgeFunctionalAttributeProperty dest = new BridgeFunctionalAttributeProperty();

        if (src.isSetBridgeFunctionalAttribute())
            dest.setObject(unmarshalBridgeFunctionalAttribute(src.getBridgeFunctionalAttribute()));

        return dest;
    }

    private ConstructionRiskAssessmentAttribute unmarshalConstructionRiskAssessmentAttribute(ConstructionRiskAssessmentAttributeType src) throws MissingADESchemaException {
        ConstructionRiskAssessmentAttribute dest = new ConstructionRiskAssessmentAttribute();

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        if (src.isSetRiskType())
            dest.setRiskType(helper.getGMLUnmarshaller().unmarshalCode(src.getRiskType()));

        if (src.isSetStatus())
            dest.setStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getStatus()));

        if (src.isSetReferenceDate())
            dest.setReferenceDate(src.getReferenceDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    private ConstructionRiskAssessmentAttributeProperty unmarshalConstructionRiskAssessmentAttributeProperty(ConstructionRiskAssessmentAttributePropertyType src) throws MissingADESchemaException {
        ConstructionRiskAssessmentAttributeProperty dest = new ConstructionRiskAssessmentAttributeProperty();

        if (src.isSetConstructionRiskAssessmentAttribute())
            dest.setObject(unmarshalConstructionRiskAssessmentAttribute(src.getConstructionRiskAssessmentAttribute()));

        return dest;
    }

    private void unmarshalDisasterRiskAttribute(DisasterRiskAttributeType src, DisasterRiskAttribute dest) throws MissingADESchemaException {
        if (src.isSetDescription())
            dest.setDescription(helper.getGMLUnmarshaller().unmarshalCode(src.getDescription()));
    }

    private void unmarshalFloodingRiskAttribute(FloodingRiskAttributeType src, FloodingRiskAttribute dest) throws MissingADESchemaException {
        unmarshalDisasterRiskAttribute(src, dest);

        if (src.isSetRank())
            dest.setRank(helper.getGMLUnmarshaller().unmarshalCode(src.getRank()));

        if (src.isSetRankOrg())
            dest.setRankOrg(helper.getGMLUnmarshaller().unmarshalCode(src.getRankOrg()));

        if (src.isSetDepth())
            dest.setDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getDepth()));
    }

    private RiverFloodingRiskAttribute unmarshalRiverFloodingRiskAttribute(RiverFloodingRiskAttributeType src) throws MissingADESchemaException {
        RiverFloodingRiskAttribute dest = new RiverFloodingRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        if (src.isSetScale())
            dest.setScale(helper.getGMLUnmarshaller().unmarshalCode(src.getScale()));

        if (src.isSetDuration())
            dest.setDuration(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDuration()));

        return dest;
    }

    private TsunamiRiskAttribute unmarshalTsunamiRiskAttribute(TsunamiRiskAttributeType src) throws MissingADESchemaException {
        TsunamiRiskAttribute dest = new TsunamiRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private InlandFloodingRiskAttribute unmarshalInlandFloodingRiskAttribute(InlandFloodingRiskAttributeType src) throws MissingADESchemaException {
        InlandFloodingRiskAttribute dest = new InlandFloodingRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private HighTideRiskAttribute unmarshalHighTideRiskAttribute(HighTideRiskAttributeType src) throws MissingADESchemaException {
        HighTideRiskAttribute dest = new HighTideRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private ReservoirFloodingRiskAttribute unmarshalReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttributeType src) throws MissingADESchemaException {
        ReservoirFloodingRiskAttribute dest = new ReservoirFloodingRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private FloodingRiskAttributeProperty unmarshalFloodingRiskAttributeProperty(FloodingRiskAttributePropertyType src) throws MissingADESchemaException {
        FloodingRiskAttributeProperty dest = new FloodingRiskAttributeProperty();

        if (src.isSetFloodingRiskAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getFloodingRiskAttribute());
            if (object instanceof FloodingRiskAttribute)
                dest.setObject((FloodingRiskAttribute) object);
        }

        return dest;
    }

    private LandSlideRiskAttribute unmarshalLandSlideRiskAttribute(LandSlideRiskAttributeType src) throws MissingADESchemaException {
        LandSlideRiskAttribute dest = new LandSlideRiskAttribute();
        unmarshalDisasterRiskAttribute(src, dest);

        if (src.isSetAreaType())
            dest.setAreaType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaType()));

        return dest;
    }

    private DisasterRiskAttributeProperty unmarshalDisasterRiskAttributeProperty(DisasterRiskAttributePropertyType src) throws MissingADESchemaException {
        DisasterRiskAttributeProperty dest = new DisasterRiskAttributeProperty();

        if (src.isSetDisasterRiskAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getDisasterRiskAttribute());
            if (object instanceof DisasterRiskAttribute)
                dest.setObject((DisasterRiskAttribute) object);
        }

        return dest;
    }

    private DataQualityAttribute unmarshalDataQualityAttribute(DataQualityAttributeType src) throws MissingADESchemaException {
        DataQualityAttribute dest = new DataQualityAttribute();

        if (src.isSetGeometrySrcDescLod0()) {
            for (CodeType geometrySrcDescLod0 : src.getGeometrySrcDescLod0())
                dest.getGeometrySrcDescLod0().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDescLod0));
        }

        if (src.isSetGeometrySrcDescLod1()) {
            for (CodeType geometrySrcDescLod1 : src.getGeometrySrcDescLod1())
                dest.getGeometrySrcDescLod1().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDescLod1));
        }

        if (src.isSetGeometrySrcDescLod2()) {
            for (CodeType geometrySrcDescLod2 : src.getGeometrySrcDescLod2())
                dest.getGeometrySrcDescLod2().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDescLod2));
        }

        if (src.isSetGeometrySrcDescLod3()) {
            for (CodeType geometrySrcDescLod3 : src.getGeometrySrcDescLod3())
                dest.getGeometrySrcDescLod3().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDescLod3));
        }

        if (src.isSetGeometrySrcDescLod4()) {
            for (CodeType geometrySrcDescLod4 : src.getGeometrySrcDescLod4())
                dest.getGeometrySrcDescLod4().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDescLod4));
        }

        if (src.isSetThematicSrcDesc()) {
            for (CodeType thematicSrcDesc : src.getThematicSrcDesc())
                dest.getThematicSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(thematicSrcDesc));
        }

        if (src.isSetAppearanceSrcDescLod0()) {
            for (CodeType appearanceSrcDescLod0 : src.getAppearanceSrcDescLod0())
                dest.getAppearanceSrcDescLod0().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDescLod0));
        }

        if (src.isSetAppearanceSrcDescLod1()) {
            for (CodeType appearanceSrcDescLod1 : src.getAppearanceSrcDescLod1())
                dest.getAppearanceSrcDescLod1().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDescLod1));
        }

        if (src.isSetAppearanceSrcDescLod2()) {
            for (CodeType appearanceSrcDescLod2 : src.getAppearanceSrcDescLod2())
                dest.getAppearanceSrcDescLod2().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDescLod2));
        }

        if (src.isSetAppearanceSrcDescLod3()) {
            for (CodeType appearanceSrcDescLod3 : src.getAppearanceSrcDescLod3())
                dest.getAppearanceSrcDescLod3().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDescLod3));
        }

        if (src.isSetAppearanceSrcDescLod4()) {
            for (CodeType appearanceSrcDescLod4 : src.getAppearanceSrcDescLod4())
                dest.getAppearanceSrcDescLod4().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDescLod4));
        }

        if (src.isSetLodType()) {
            for (CodeType lodType : src.getLodType())
                dest.getLodType().add(helper.getGMLUnmarshaller().unmarshalCode(lodType));
        }

        if (src.isSetLod1HeightType())
            dest.setLod1HeightType(helper.getGMLUnmarshaller().unmarshalCode(src.getLod1HeightType()));

        dest.setTranDataAcquisition(src.getTranDataAcquisition());

        if (src.isSetPublicSurveyDataQualityAttribute())
            dest.setPublicSurveyDataQualityAttribute(unmarshalPublicSurveyDataQualityAttributeProperty(src.getPublicSurveyDataQualityAttribute()));

        return dest;
    }

    private DataQualityAttributeProperty unmarshalDataQualityAttributeProperty(DataQualityAttributePropertyType src) throws MissingADESchemaException {
        DataQualityAttributeProperty dest = new DataQualityAttributeProperty();

        if (src.isSetDataQualityAttribute())
            dest.setObject(unmarshalDataQualityAttribute(src.getDataQualityAttribute()));

        return dest;
    }

    private PublicSurveyDataQualityAttribute unmarshalPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttributeType src) throws MissingADESchemaException {
        PublicSurveyDataQualityAttribute dest = new PublicSurveyDataQualityAttribute();

        if (src.isSetSrcScaleLod0())
            dest.setSrcScaleLod0(helper.getGMLUnmarshaller().unmarshalCode(src.getSrcScaleLod0()));

        if (src.isSetSrcScaleLod1())
            dest.setSrcScaleLod1(helper.getGMLUnmarshaller().unmarshalCode(src.getSrcScaleLod1()));

        if (src.isSetSrcScaleLod2())
            dest.setSrcScaleLod2(helper.getGMLUnmarshaller().unmarshalCode(src.getSrcScaleLod2()));

        if (src.isSetSrcScaleLod3())
            dest.setSrcScaleLod3(helper.getGMLUnmarshaller().unmarshalCode(src.getSrcScaleLod3()));

        if (src.isSetSrcScaleLod4())
            dest.setSrcScaleLod4(helper.getGMLUnmarshaller().unmarshalCode(src.getSrcScaleLod4()));

        if (src.isSetPublicSurveySrcDescLod0()) {
            for (CodeType publicSurveySrcDescLod0 : src.getPublicSurveySrcDescLod0())
                dest.getPublicSurveySrcDescLod0().add(helper.getGMLUnmarshaller().unmarshalCode(publicSurveySrcDescLod0));
        }

        if (src.isSetPublicSurveySrcDescLod1()) {
            for (CodeType publicSurveySrcDescLod1 : src.getPublicSurveySrcDescLod1())
                dest.getPublicSurveySrcDescLod1().add(helper.getGMLUnmarshaller().unmarshalCode(publicSurveySrcDescLod1));
        }

        if (src.isSetPublicSurveySrcDescLod2()) {
            for (CodeType publicSurveySrcDescLod2 : src.getPublicSurveySrcDescLod2())
                dest.getPublicSurveySrcDescLod2().add(helper.getGMLUnmarshaller().unmarshalCode(publicSurveySrcDescLod2));
        }

        if (src.isSetPublicSurveySrcDescLod3()) {
            for (CodeType publicSurveySrcDescLod3 : src.getPublicSurveySrcDescLod3())
                dest.getPublicSurveySrcDescLod3().add(helper.getGMLUnmarshaller().unmarshalCode(publicSurveySrcDescLod3));
        }

        if (src.isSetPublicSurveySrcDescLod4()) {
            for (CodeType publicSurveySrcDescLod4 : src.getPublicSurveySrcDescLod4())
                dest.getPublicSurveySrcDescLod4().add(helper.getGMLUnmarshaller().unmarshalCode(publicSurveySrcDescLod4));
        }

        return dest;
    }

    private PublicSurveyDataQualityAttributeProperty unmarshalPublicSurveyDataQualityAttributeProperty(PublicSurveyDataQualityAttributePropertyType src) throws MissingADESchemaException {
        PublicSurveyDataQualityAttributeProperty dest = new PublicSurveyDataQualityAttributeProperty();

        if (src.isSetPublicSurveyDataQualityAttribute())
            dest.setObject(unmarshalPublicSurveyDataQualityAttribute(src.getPublicSurveyDataQualityAttribute()));

        return dest;
    }

    private KeyValuePairAttribute unmarshalKeyValuePairAttribute(KeyValuePairAttributeType src) throws MissingADESchemaException {
        KeyValuePairAttribute dest = new KeyValuePairAttribute();

        if (src.isSetKey())
            dest.setKey(helper.getGMLUnmarshaller().unmarshalCode(src.getKey()));

        if (src.isSetCodeValue())
            dest.setCodeValue(helper.getGMLUnmarshaller().unmarshalCode(src.getCodeValue()));

        return dest;
    }

    private KeyValuePairAttributeProperty unmarshalKeyValuePairAttributeProperty(KeyValuePairAttributePropertyType src) throws MissingADESchemaException {
        KeyValuePairAttributeProperty dest = new KeyValuePairAttributeProperty();

        if (src.isSetKeyValuePairAttribute())
            dest.setObject(unmarshalKeyValuePairAttribute(src.getKeyValuePairAttribute()));

        return dest;
    }

    private BuildingIDAttribute unmarshalBuildingIDAttribute(BuildingIDAttributeType src) throws MissingADESchemaException {
        BuildingIDAttribute dest = new BuildingIDAttribute();

        dest.setBuildingID(src.getBuildingID());

        if (src.isSetBranchID())
            dest.setBranchID(src.getBranchID().intValue());

        if (src.isSetPartID())
            dest.setPartID(src.getPartID().intValue());

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        return dest;
    }

    private BuildingIDAttributeProperty unmarshalBuildingIDAttributeProperty(BuildingIDAttributePropertyType src) throws MissingADESchemaException {
        BuildingIDAttributeProperty dest = new BuildingIDAttributeProperty();

        if (src.isSetBuildingIDAttribute())
            dest.setObject(unmarshalBuildingIDAttribute(src.getBuildingIDAttribute()));

        return dest;
    }

    private BuildingDetailAttribute unmarshalBuildingDetailAttribute(BuildingDetailAttributeType src) throws MissingADESchemaException {
        BuildingDetailAttribute dest = new BuildingDetailAttribute();

        dest.setSerialNumberOfBuildingCertification(src.getSerialNumberOfBuildingCertification());

        if (src.isSetSiteArea())
            dest.setSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSiteArea()));

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetBuildingFootprintArea())
            dest.setBuildingFootprintArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBuildingFootprintArea()));

        if (src.isSetBuildingRoofEdgeArea())
            dest.setBuildingRoofEdgeArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBuildingRoofEdgeArea()));

        if (src.isSetDevelopmentArea())
            dest.setDevelopmentArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDevelopmentArea()));

        if (src.isSetBuildingStructureType())
            dest.setBuildingStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getBuildingStructureType()));

        if (src.isSetBuildingStructureOrgType())
            dest.setBuildingStructureOrgType(helper.getGMLUnmarshaller().unmarshalCode(src.getBuildingStructureOrgType()));

        if (src.isSetFireproofStructureType())
            dest.setFireproofStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getFireproofStructureType()));

        dest.setImplementingBody(src.getImplementingBody());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetDistrictsAndZonesType()) {
            for (CodeType districtsAndZonesType : src.getDistrictsAndZonesType())
                dest.getDistrictsAndZonesType().add(helper.getGMLUnmarshaller().unmarshalCode(districtsAndZonesType));
        }

        if (src.isSetLandUseType())
            dest.setLandUseType(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUseType()));

        dest.setReference(src.getReference());

        if (src.isSetMajorUsage())
            dest.setMajorUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getMajorUsage()));

        if (src.isSetMajorUsage2())
            dest.setMajorUsage2(helper.getGMLUnmarshaller().unmarshalCode(src.getMajorUsage2()));

        if (src.isSetOrgUsage())
            dest.setOrgUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getOrgUsage()));

        if (src.isSetOrgUsage2())
            dest.setOrgUsage2(helper.getGMLUnmarshaller().unmarshalCode(src.getOrgUsage2()));

        if (src.isSetDetailedUsage())
            dest.setDetailedUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getDetailedUsage()));

        if (src.isSetDetailedUsage2())
            dest.setDetailedUsage2(helper.getGMLUnmarshaller().unmarshalCode(src.getDetailedUsage2()));

        if (src.isSetDetailedUsage3())
            dest.setDetailedUsage3(helper.getGMLUnmarshaller().unmarshalCode(src.getDetailedUsage3()));

        if (src.isSetGroundFloorUsage())
            dest.setGroundFloorUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getGroundFloorUsage()));

        if (src.isSetSecondFloorUsage())
            dest.setSecondFloorUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getSecondFloorUsage()));

        if (src.isSetThirdFloorUsage())
            dest.setThirdFloorUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getThirdFloorUsage()));

        if (src.isSetBasementUsage())
            dest.setBasementUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getBasementUsage()));

        if (src.isSetBasementFirstUsage())
            dest.setBasementFirstUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getBasementFirstUsage()));

        if (src.isSetBasementSecondUsage())
            dest.setBasementSecondUsage(helper.getGMLUnmarshaller().unmarshalCode(src.getBasementSecondUsage()));

        if (src.isSetVacancy())
            dest.setVacancy(helper.getGMLUnmarshaller().unmarshalCode(src.getVacancy()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());
        dest.setSpecifiedBuildingCoverageRate(src.getSpecifiedBuildingCoverageRate());
        dest.setSpecifiedFloorAreaRate(src.getSpecifiedFloorAreaRate());
        dest.setStandardFloorAreaRate(src.getStandardFloorAreaRate());

        if (src.isSetBuildingHeight())
            dest.setBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getBuildingHeight()));

        if (src.isSetEaveHeight())
            dest.setEaveHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getEaveHeight()));

        dest.setNote(src.getNote());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private BuildingDetailAttributeProperty unmarshalBuildingDetailAttributeProperty(BuildingDetailAttributePropertyType src) throws MissingADESchemaException {
        BuildingDetailAttributeProperty dest = new BuildingDetailAttributeProperty();

        if (src.isSetBuildingDetailAttribute())
            dest.setObject(unmarshalBuildingDetailAttribute(src.getBuildingDetailAttribute()));

        return dest;
    }

    private LargeCustomerFacilityAttribute unmarshalLargeCustomerFacilityAttribute(LargeCustomerFacilityAttributeType src) throws MissingADESchemaException {
        LargeCustomerFacilityAttribute dest = new LargeCustomerFacilityAttribute();

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        dest.setName(src.getName());

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        dest.setOwner(src.getOwner());

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetTotalStoreFloorArea())
            dest.setTotalStoreFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalStoreFloorArea()));

        if (src.isSetInauguralDate())
            dest.setInauguralDate(src.getInauguralDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetYearOpened()) {
            LocalDate date = src.getYearOpened().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setYearOpened(Year.of(date.getYear()));
        }

        if (src.isSetYearClosed()) {
            LocalDate date = src.getYearClosed().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setYearClosed(Year.of(date.getYear()));
        }

        dest.setKeyTenants(src.getKeyTenants());
        dest.setAvailability(src.isAvailability());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetDistrictsAndZonesType()) {
            for (CodeType districtsAndZonesType : src.getDistrictsAndZonesType())
                dest.getDistrictsAndZonesType().add(helper.getGMLUnmarshaller().unmarshalCode(districtsAndZonesType));
        }

        if (src.isSetLandUseType())
            dest.setLandUseType(helper.getGMLUnmarshaller().unmarshalCode(src.getLandUseType()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private LargeCustomerFacilityAttributeProperty unmarshalLargeCustomerFacilityAttributeProperty(LargeCustomerFacilityAttributePropertyType src) throws MissingADESchemaException {
        LargeCustomerFacilityAttributeProperty dest = new LargeCustomerFacilityAttributeProperty();

        if (src.isSetLargeCustomerFacilityAttribute())
            dest.setObject(unmarshalLargeCustomerFacilityAttribute(src.getLargeCustomerFacilityAttribute()));

        return dest;
    }

    private RealEstateIDAttribute unmarshalRealEstateIDAttribute(RealEstateIDAttributeType src) throws MissingADESchemaException {
        RealEstateIDAttribute dest = new RealEstateIDAttribute();

        dest.setRealEstateIDOfBuilding(src.getRealEstateIDOfBuilding());

        if (src.isSetNumberOfBuildingUnitOwnership())
            dest.setNumberOfBuildingUnitOwnership(src.getNumberOfBuildingUnitOwnership().intValue());

        if (src.isSetRealEstateIDOfBuildingUnitOwnership()) {
            for (String realEstateIDOfBuildingUnitOwnership : src.getRealEstateIDOfBuildingUnitOwnership())
                dest.getRealEstateIDOfBuildingUnitOwnership().add(realEstateIDOfBuildingUnitOwnership);
        }

        if (src.isSetNumberOfRealEstateIDOfLand())
            dest.setNumberOfRealEstateIDOfLand(src.getNumberOfRealEstateIDOfLand().intValue());

        if (src.isSetRealEstateIDOfLand()) {
            for (String realEstateIDOfLand : src.getRealEstateIDOfLand())
                dest.getRealEstateIDOfLand().add(realEstateIDOfLand);
        }

        if (src.isSetMatchingScore())
            dest.setMatchingScore(src.getMatchingScore().intValue());

        return dest;
    }

    private RealEstateIDAttributeProperty unmarshalRealEstateIDAttributeProperty(RealEstateIDAttributePropertyType src) throws MissingADESchemaException {
        RealEstateIDAttributeProperty dest = new RealEstateIDAttributeProperty();

        if (src.isSetRealEstateIDAttribute())
            dest.setObject(unmarshalRealEstateIDAttribute(src.getRealEstateIDAttribute()));

        return dest;
    }

    private BuildingUsecaseAttribute unmarshalBuildingUsecaseAttribute(BuildingUsecaseAttributeType src) throws MissingADESchemaException {
        BuildingUsecaseAttribute dest = new BuildingUsecaseAttribute();

        if (src.isSetIsTemporal())
            dest.setIsTemporal(helper.getGMLUnmarshaller().unmarshalCode(src.getIsTemporal()));

        if (src.isSetFloorHeight())
            dest.setFloorHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getFloorHeight()));

        dest.setIsGroundFloorOpen(src.isIsGroundFloorOpen());

        return dest;
    }

    private BuildingUsecaseAttributeProperty unmarshalBuildingUsecaseAttributeProperty(BuildingUsecaseAttributePropertyType src) throws MissingADESchemaException {
        BuildingUsecaseAttributeProperty dest = new BuildingUsecaseAttributeProperty();

        if (src.isSetBuildingUsecaseAttribute())
            dest.setObject(unmarshalBuildingUsecaseAttribute(src.getBuildingUsecaseAttribute()));

        return dest;
    }

    private CityFurnitureDetailAttribute unmarshalCityFurnitureDetailAttribute(CityFurnitureDetailAttributeType src) throws MissingADESchemaException {
        CityFurnitureDetailAttribute dest = new CityFurnitureDetailAttribute();

        if (src.isSetFacilityType())
            dest.setFacilityType(helper.getGMLUnmarshaller().unmarshalCode(src.getFacilityType()));

        dest.setDescription(src.getDescription());

        return dest;
    }

    private CityFurnitureDetailAttributeProperty unmarshalCityFurnitureDetailAttributeProperty(CityFurnitureDetailAttributePropertyType src) throws MissingADESchemaException {
        CityFurnitureDetailAttributeProperty dest = new CityFurnitureDetailAttributeProperty();

        if (src.isSetCityFurnitureDetailAttribute())
            dest.setObject(unmarshalCityFurnitureDetailAttribute(src.getCityFurnitureDetailAttribute()));

        return dest;
    }

    private LandUseDetailAttribute unmarshalLandUseDetailAttribute(LandUseDetailAttributeType src) throws MissingADESchemaException {
        LandUseDetailAttribute dest = new LandUseDetailAttribute();

        dest.setId(src.getId());

        if (src.isSetOrgLandUse())
            dest.setOrgLandUse(helper.getGMLUnmarshaller().unmarshalCode(src.getOrgLandUse()));

        if (src.isSetNominalArea())
            dest.setNominalArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getNominalArea()));

        if (src.isSetOwnerType())
            dest.setOwnerType(helper.getGMLUnmarshaller().unmarshalCode(src.getOwnerType()));

        dest.setOwner(src.getOwner());

        if (src.isSetAreaInSquareMeter())
            dest.setAreaInSquareMeter(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaInSquareMeter()));

        if (src.isSetAreaInHa())
            dest.setAreaInHa(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaInHa()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());
        dest.setSpecifiedBuildingCoverageRate(src.getSpecifiedBuildingCoverageRate());
        dest.setSpecifiedFloorAreaRate(src.getSpecifiedFloorAreaRate());
        dest.setStandardFloorAreaRate(src.getStandardFloorAreaRate());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetDistrictsAndZonesType()) {
            for (CodeType districtsAndZonesType : src.getDistrictsAndZonesType())
                dest.getDistrictsAndZonesType().add(helper.getGMLUnmarshaller().unmarshalCode(districtsAndZonesType));
        }

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        dest.setReference(src.getReference());
        dest.setNote(src.getNote());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private LandUseDetailAttributeProperty unmarshalLandUseDetailAttributeProperty(LandUseDetailAttributePropertyType src) throws MissingADESchemaException {
        LandUseDetailAttributeProperty dest = new LandUseDetailAttributeProperty();

        if (src.isSetLandUseDetailAttribute())
            dest.setObject(unmarshalLandUseDetailAttribute(src.getLandUseDetailAttribute()));

        return dest;
    }

    private TrafficObjectUsecaseAttribute unmarshalTrafficObjectUsecaseAttribute(TrafficObjectUsecaseAttributeType src) throws MissingADESchemaException {
        TrafficObjectUsecaseAttribute dest = new TrafficObjectUsecaseAttribute();

        if (src.isSetMinWidth())
            dest.setMinWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMinWidth()));

        if (src.isSetMaxWidth())
            dest.setMaxWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMaxWidth()));

        return dest;
    }

    private TrafficObjectUsecaseAttributeProperty unmarshalTrafficObjectUsecaseAttributeProperty(TrafficObjectUsecaseAttributePropertyType src) throws MissingADESchemaException {
        TrafficObjectUsecaseAttributeProperty dest = new TrafficObjectUsecaseAttributeProperty();

        if (src.isSetTrafficObjectUsecaseAttribute())
            dest.setObject(unmarshalTrafficObjectUsecaseAttribute(src.getTrafficObjectUsecaseAttribute()));

        return dest;
    }

    private TrafficVolumeAttribute unmarshalTrafficVolumeAttribute(TrafficVolumeAttributeType src) throws MissingADESchemaException {
        TrafficVolumeAttribute dest = new TrafficVolumeAttribute();

        dest.setSectionID(src.getSectionID());
        dest.setRouteName(src.getRouteName());

        if (src.isSetWeekday12HourTrafficVolume())
            dest.setWeekday12hourTrafficVolume(src.getWeekday12HourTrafficVolume().intValue());

        if (src.isSetWeekday24HourTrafficVolume())
            dest.setWeekday24hourTrafficVolume(src.getWeekday24HourTrafficVolume().intValue());

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedInCongestion(src.getAverageInboundTravelSpeedInCongestion());
        dest.setAverageOutboundTravelSpeedInCongestion(src.getAverageOutboundTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedNotCongestion(src.getAverageInboundTravelSpeedNotCongestion());
        dest.setAverageOutboundTravelSpeedNotCongestion(src.getAverageOutboundTravelSpeedNotCongestion());
        dest.setObservationPointName(src.getObservationPointName());
        dest.setReference(src.getReference());

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        return dest;
    }

    private TrafficVolumeAttributeProperty unmarshalTrafficVolumeAttributeProperty(TrafficVolumeAttributePropertyType src) throws MissingADESchemaException {
        TrafficVolumeAttributeProperty dest = new TrafficVolumeAttributeProperty();

        if (src.isSetTrafficVolumeAttribute())
            dest.setObject(unmarshalTrafficVolumeAttribute(src.getTrafficVolumeAttribute()));

        return dest;
    }

    private RoadStructureAttribute unmarshalRoadStructureAttribute(RoadStructureAttributeType src) throws MissingADESchemaException {
        RoadStructureAttribute dest = new RoadStructureAttribute();

        if (src.isSetWidthType())
            dest.setWidthType(helper.getGMLUnmarshaller().unmarshalCode(src.getWidthType()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetNumberOfLanes())
            dest.setNumberOfLanes(src.getNumberOfLanes().intValue());

        if (src.isSetSectionType())
            dest.setSectionType(helper.getGMLUnmarshaller().unmarshalCode(src.getSectionType()));

        return dest;
    }

    private RoadStructureAttributeProperty unmarshalRoadStructureAttributeProperty(RoadStructureAttributePropertyType src) throws MissingADESchemaException {
        RoadStructureAttributeProperty dest = new RoadStructureAttributeProperty();

        if (src.isSetRoadStructureAttribute())
            dest.setObject(unmarshalRoadStructureAttribute(src.getRoadStructureAttribute()));

        return dest;
    }

    private RoadType unmarshalRoadType(RoadTypeType src) throws MissingADESchemaException {
        RoadType dest = new RoadType();

        dest.setId(src.getId());

        if (src.isSetCreationDate())
            dest.setCreationDate(src.getCreationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setIsTemporary(src.isIsTemporary());

        if (src.isSetRoadType())
            dest.setRoadType(helper.getGMLUnmarshaller().unmarshalCode(src.getRoadType()));

        if (src.isSetWidthType())
            dest.setWidthType(helper.getGMLUnmarshaller().unmarshalCode(src.getWidthType()));

        dest.setIsTollRoad(src.isIsTollRoad());

        if (src.isSetSeparator())
            dest.setSeparator(helper.getGMLUnmarshaller().unmarshalLength(src.getSeparator()));

        dest.setIsHighWay(src.isIsHighWay());

        return dest;
    }

    private RoadTypeProperty unmarshalRoadTypeProperty(RoadTypePropertyType src) throws MissingADESchemaException {
        RoadTypeProperty dest = new RoadTypeProperty();

        if (src.isSetRoadType())
            dest.setObject(unmarshalRoadType(src.getRoadType()));

        return dest;
    }

    private RailwayRouteAttribute unmarshalRailwayRouteAttribute(RailwayRouteAttributeType src) throws MissingADESchemaException {
        RailwayRouteAttribute dest = new RailwayRouteAttribute();

        if (src.isSetOperatorType())
            dest.setOperatorType(helper.getGMLUnmarshaller().unmarshalCode(src.getOperatorType()));

        dest.setOperator(src.getOperator());

        if (src.isSetAlternativeName()) {
            for (String alternativeName : src.getAlternativeName())
                dest.getAlternativeName().add(alternativeName);
        }

        if (src.isSetRailwayType())
            dest.setRailwayType(helper.getGMLUnmarshaller().unmarshalCode(src.getRailwayType()));

        dest.setStartStation(src.getStartStation());
        dest.setEndStation(src.getEndStation());

        return dest;
    }

    private RailwayRouteAttributeProperty unmarshalRailwayRouteAttributeProperty(RailwayRouteAttributePropertyType src) throws MissingADESchemaException {
        RailwayRouteAttributeProperty dest = new RailwayRouteAttributeProperty();

        if (src.isSetRailwayRouteAttribute())
            dest.setObject(unmarshalRailwayRouteAttribute(src.getRailwayRouteAttribute()));

        return dest;
    }

    private TrackAttribute unmarshalTrackAttribute(TrackAttributeType src) throws MissingADESchemaException {
        TrackAttribute dest = new TrackAttribute();

        if (src.isSetAlternativeName()) {
            for (String alternativeName : src.getAlternativeName())
                dest.getAlternativeName().add(alternativeName);
        }

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        if (src.isSetRelativeLevel())
            dest.setRelativeLevel(src.getRelativeLevel().intValue());

        if (src.isSetWidthType())
            dest.setWidthType(helper.getGMLUnmarshaller().unmarshalCode(src.getWidthType()));

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        dest.setIsTollRoad(src.isIsTollRoad());

        if (src.isSetSeparator())
            dest.setSeparator(helper.getGMLUnmarshaller().unmarshalLength(src.getSeparator()));

        return dest;
    }

    private TrackAttributeProperty unmarshalTrackAttributeProperty(TrackAttributePropertyType src) throws MissingADESchemaException {
        TrackAttributeProperty dest = new TrackAttributeProperty();

        if (src.isSetTrackAttribute())
            dest.setObject(unmarshalTrackAttribute(src.getTrackAttribute()));

        return dest;
    }

    private void unmarshalSquareUrbanPlanAttribute(SquareUrbanPlanAttributeType src, SquareUrbanPlanAttribute dest) throws MissingADESchemaException {
        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        dest.setUrbanPlanningAreaName(src.getUrbanPlanningAreaName());

        if (src.isSetEnforcer()) {
            for (String enforcer : src.getEnforcer())
                dest.getEnforcer().add(enforcer);
        }

        if (src.isSetDateOfDecision())
            dest.setDateOfDecision(src.getDateOfDecision().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetDateOfRevision()) {
            for (XMLGregorianCalendar dateOfRevision : src.getDateOfRevision())
                dest.getDateOfRevision().add(dateOfRevision.toGregorianCalendar().toZonedDateTime().toLocalDate());
        }

        if (src.isSetAreaPlanned())
            dest.setAreaPlanned(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaPlanned()));

        if (src.isSetAreaInService())
            dest.setAreaInService(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaInService()));

        dest.setRemarks(src.getRemarks());

        if (src.isSetStatus())
            dest.setStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getStatus()));

        if (src.isSetAreaImproved())
            dest.setAreaImproved(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaImproved()));

        if (src.isSetAreaCompleted())
            dest.setAreaCompleted(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaCompleted()));

        if (src.isSetProjectStartDate())
            dest.setProjectStartDate(src.getProjectStartDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetProjectEndDate())
            dest.setProjectEndDate(src.getProjectEndDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setIsCompleted(src.isIsCompleted());
        dest.setIsAuthorized(src.isIsAuthorized());
        dest.setPurpose(src.getPurpose());
        dest.setNote(src.getNote());
    }

    private SquareUrbanPlanAttribute unmarshalSquareUrbanPlanAttribute(SquareUrbanPlanAttributeType src) throws MissingADESchemaException {
        SquareUrbanPlanAttribute dest = new SquareUrbanPlanAttribute();
        unmarshalSquareUrbanPlanAttribute(src, dest);
        return dest;
    }

    private StationSquareAttribute unmarshalStationSquareAttribute(StationSquareAttributeType src) throws MissingADESchemaException {
        StationSquareAttribute dest = new StationSquareAttribute();
        unmarshalSquareUrbanPlanAttribute(src, dest);

        if (src.isSetStation()) {
            for (String station : src.getStation())
                dest.getStation().add(station);
        }

        if (src.isSetRoute()) {
            for (String route : src.getRoute())
                dest.getRoute().add(route);
        }

        if (src.isSetRailwayType()) {
            for (CodeType railwayType : src.getRailwayType())
                dest.getRailwayType().add(helper.getGMLUnmarshaller().unmarshalCode(railwayType));
        }

        return dest;
    }

    private TerminalAttribute unmarshalTerminalAttribute(TerminalAttributeType src) throws MissingADESchemaException {
        TerminalAttribute dest = new TerminalAttribute();
        unmarshalSquareUrbanPlanAttribute(src, dest);

        if (src.isSetTerminalType())
            dest.setTerminalType(helper.getGMLUnmarshaller().unmarshalCode(src.getTerminalType()));

        dest.setStructure(src.getStructure());

        if (src.isSetNumberOfBerthsPlanned())
            dest.setNumberOfBerthsPlanned(src.getNumberOfBerthsPlanned().intValue());

        if (src.isSetNumberOfBerthsInService())
            dest.setNumberOfBerthsInService(src.getNumberOfBerthsInService().intValue());

        if (src.isSetUserType())
            dest.setUserType(helper.getGMLUnmarshaller().unmarshalCode(src.getUserType()));

        return dest;
    }

    private SquareUrbanPlanAttributeProperty unmarshalSquareUrbanPlanAttributeProperty(SquareUrbanPlanAttributePropertyType src) throws MissingADESchemaException {
        SquareUrbanPlanAttributeProperty dest = new SquareUrbanPlanAttributeProperty();

        if (src.isSetSquareUrbanPlanAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getSquareUrbanPlanAttribute());
            if (object instanceof SquareUrbanPlanAttribute)
                dest.setObject((SquareUrbanPlanAttribute) object);
        }

        return dest;
    }

    private RailwayTrackAttribute unmarshalRailwayTrackAttribute(RailwayTrackAttributeType src) throws MissingADESchemaException {
        RailwayTrackAttribute dest = new RailwayTrackAttribute();

        dest.setRouteName(src.getRouteName());

        if (src.isSetDirectionType())
            dest.setDirectionType(helper.getGMLUnmarshaller().unmarshalCode(src.getDirectionType()));

        if (src.isSetTrackType())
            dest.setTrackType(helper.getGMLUnmarshaller().unmarshalCode(src.getTrackType()));

        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());

        if (src.isSetAlignmentType())
            dest.setAlignmentType(helper.getGMLUnmarshaller().unmarshalCode(src.getAlignmentType()));

        if (src.isSetLod2Network())
            dest.setLod2Network(helper.getGMLUnmarshaller().unmarshalGeometricComplexProperty(src.getLod2Network()));

        if (src.isSetLod3Network())
            dest.setLod3Network(helper.getGMLUnmarshaller().unmarshalGeometricComplexProperty(src.getLod3Network()));

        if (src.isSetControlPoint()) {
            for (ControlPointPropertyType controlPoint : src.getControlPoint())
                dest.getControlPoint().add(unmarshalControlPointProperty(controlPoint));
        }

        return dest;
    }

    private RailwayTrackAttributeProperty unmarshalRailwayTrackAttributeProperty(RailwayTrackAttributePropertyType src) throws MissingADESchemaException {
        RailwayTrackAttributeProperty dest = new RailwayTrackAttributeProperty();

        if (src.isSetRailwayTrackAttribute())
            dest.setObject(unmarshalRailwayTrackAttribute(src.getRailwayTrackAttribute()));

        return dest;
    }

    private ControlPoint unmarshalControlPoint(ControlPointType src) throws MissingADESchemaException {
        ControlPoint dest = new ControlPoint();

        dest.setStartPost(src.getStartPost());
        dest.setEndPost(src.getEndPost());

        if (src.isSetFunction())
            dest.setFunction(helper.getGMLUnmarshaller().unmarshalCode(src.getFunction()));

        if (src.isSetParameter())
            dest.setParameter(unmarshalControlPointTypeProperty(src.getParameter()));

        if (src.isSetStartPoint())
            dest.setStartPoint(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getStartPoint()));

        if (src.isSetEndPoint())
            dest.setEndPoint(helper.getGMLUnmarshaller().unmarshalPointProperty(src.getEndPoint()));

        return dest;
    }

    private ControlPointProperty unmarshalControlPointProperty(ControlPointPropertyType src) throws MissingADESchemaException {
        ControlPointProperty dest = new ControlPointProperty();

        if (src.isSetControlPoint())
            dest.setObject(unmarshalControlPoint(src.getControlPoint()));

        return dest;
    }

    private ControlPointParameter unmarshalControlPointParameter(ControlPointTypeType src) throws MissingADESchemaException {
        ControlPointParameter dest = new ControlPointParameter();

        if (src.isSetCircularCurve())
            dest.setCircularCurve(unmarshalCircularCurveTypeProperty(src.getCircularCurve()));

        if (src.isSetTransitionCurve())
            dest.setTransitionCurve(unmarshalTransitionCurveTypeProperty(src.getTransitionCurve()));

        if (src.isSetSlopeType())
            dest.setSlopeType(unmarshalSlopeTypeProperty(src.getSlopeType()));

        if (src.isSetVerticalCurve())
            dest.setVerticalCurve(unmarshalVerticalCurveTypeProperty(src.getVerticalCurve()));

        return dest;
    }

    private ControlPointTypeProperty unmarshalControlPointTypeProperty(ControlPointTypePropertyType src) throws MissingADESchemaException {
        ControlPointTypeProperty dest = new ControlPointTypeProperty();

        if (src.isSetControlPointType())
            dest.setObject(unmarshalControlPointParameter(src.getControlPointType()));

        return dest;
    }

    private CircularCurveType unmarshalCircularCurveType(CircularCurveTypeType src) throws MissingADESchemaException {
        CircularCurveType dest = new CircularCurveType();

        if (src.isSetRadius())
            dest.setRadius(helper.getGMLUnmarshaller().unmarshalLength(src.getRadius()));

        if (src.isSetIntersection())
            dest.setIntersection(src.getIntersection());

        if (src.isSetCutLength())
            dest.setCutLength(helper.getGMLUnmarshaller().unmarshalLength(src.getCutLength()));

        if (src.isSetCurveLength())
            dest.setCurveLength(helper.getGMLUnmarshaller().unmarshalLength(src.getCurveLength()));

        return dest;
    }

    private CircularCurveTypeProperty unmarshalCircularCurveTypeProperty(CircularCurveTypePropertyType src) throws MissingADESchemaException {
        CircularCurveTypeProperty dest = new CircularCurveTypeProperty();

        if (src.isSetCircularCurveType())
            dest.setObject(unmarshalCircularCurveType(src.getCircularCurveType()));

        return dest;
    }

    private TransitionCurveType unmarshalTransitionCurveType(TransitionCurveTypeType src) throws MissingADESchemaException {
        TransitionCurveType dest = new TransitionCurveType();

        if (src.isSetIntersection())
            dest.setIntersection(helper.getGMLUnmarshaller().unmarshalLength(src.getIntersection()));

        if (src.isSetDistance())
            dest.setDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getDistance()));

        if (src.isSetCurveLength())
            dest.setCurveLength(helper.getGMLUnmarshaller().unmarshalLength(src.getCurveLength()));

        return dest;
    }

    private TransitionCurveTypeProperty unmarshalTransitionCurveTypeProperty(TransitionCurveTypePropertyType src) throws MissingADESchemaException {
        TransitionCurveTypeProperty dest = new TransitionCurveTypeProperty();

        if (src.isSetTransitionCurveType())
            dest.setObject(unmarshalTransitionCurveType(src.getTransitionCurveType()));

        return dest;
    }

    private SlopeType unmarshalSlopeType(SlopeTypeType src) throws MissingADESchemaException {
        SlopeType dest = new SlopeType();

        if (src.isSetAngle())
            dest.setAngle(src.getAngle());

        if (src.isSetElevation())
            dest.setElevation(helper.getGMLUnmarshaller().unmarshalLength(src.getElevation()));

        return dest;
    }

    private SlopeTypeProperty unmarshalSlopeTypeProperty(SlopeTypePropertyType src) throws MissingADESchemaException {
        SlopeTypeProperty dest = new SlopeTypeProperty();

        if (src.isSetSlopeType())
            dest.setObject(unmarshalSlopeType(src.getSlopeType()));

        return dest;
    }

    private VerticalCurveType unmarshalVerticalCurveType(VerticalCurveTypeType src) throws MissingADESchemaException {
        VerticalCurveType dest = new VerticalCurveType();

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetVerticalDistance())
            dest.setVerticalDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getVerticalDistance()));

        return dest;
    }

    private VerticalCurveTypeProperty unmarshalVerticalCurveTypeProperty(VerticalCurveTypePropertyType src) throws MissingADESchemaException {
        VerticalCurveTypeProperty dest = new VerticalCurveTypeProperty();

        if (src.isSetVerticalCurveType())
            dest.setObject(unmarshalVerticalCurveType(src.getVerticalCurveType()));

        return dest;
    }

    private TrafficAreaStructureAttribute unmarshalTrafficAreaStructureAttribute(TrafficAreaStructureAttributeType src) throws MissingADESchemaException {
        TrafficAreaStructureAttribute dest = new TrafficAreaStructureAttribute();

        if (src.isSetNumberOfLanes())
            dest.setNumberOfLanes(src.getNumberOfLanes().intValue());

        return dest;
    }

    private TrafficAreaStructureAttributeProperty unmarshalTrafficAreaStructureAttributeProperty(TrafficAreaStructureAttributePropertyType src) throws MissingADESchemaException {
        TrafficAreaStructureAttributeProperty dest = new TrafficAreaStructureAttributeProperty();

        if (src.isSetTrafficAreaStructureAttribute())
            dest.setObject(unmarshalTrafficAreaStructureAttribute(src.getTrafficAreaStructureAttribute()));

        return dest;
    }

    private TunnelStructureAttribute unmarshalTunnelStructureAttribute(TunnelStructureAttributeType src) throws MissingADESchemaException {
        TunnelStructureAttribute dest = new TunnelStructureAttribute();

        if (src.isSetTunnelType())
            dest.setTunnelType(helper.getGMLUnmarshaller().unmarshalCode(src.getTunnelType()));

        if (src.isSetTunnelSubtype())
            dest.setTunnelSubtype(helper.getGMLUnmarshaller().unmarshalCode(src.getTunnelSubtype()));

        if (src.isSetMouthType()) {
            for (CodeType mouthType : src.getMouthType())
                dest.getMouthType().add(helper.getGMLUnmarshaller().unmarshalCode(mouthType));
        }

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetInnerHeight())
            dest.setInnerHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getInnerHeight()));

        if (src.isSetEffectiveHeight())
            dest.setEffectiveHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getEffectiveHeight()));

        if (src.isSetSlopeType())
            dest.setSlopeType(helper.getGMLUnmarshaller().unmarshalCode(src.getSlopeType()));

        return dest;
    }

    private TunnelStructureAttributeProperty unmarshalTunnelStructureAttributeProperty(TunnelStructureAttributePropertyType src) throws MissingADESchemaException {
        TunnelStructureAttributeProperty dest = new TunnelStructureAttributeProperty();

        if (src.isSetTunnelStructureAttribute())
            dest.setObject(unmarshalTunnelStructureAttribute(src.getTunnelStructureAttribute()));

        return dest;
    }

    private TunnelFunctionalAttribute unmarshalTunnelFunctionalAttribute(TunnelFunctionalAttributeType src) throws MissingADESchemaException {
        TunnelFunctionalAttribute dest = new TunnelFunctionalAttribute();

        if (src.isSetDirectionType())
            dest.setDirectionType(helper.getGMLUnmarshaller().unmarshalCode(src.getDirectionType()));

        if (src.isSetUserType())
            dest.setUserType(helper.getGMLUnmarshaller().unmarshalCode(src.getUserType()));

        return dest;
    }

    private TunnelFunctionalAttributeProperty unmarshalTunnelFunctionalAttributeProperty(TunnelFunctionalAttributePropertyType src) throws MissingADESchemaException {
        TunnelFunctionalAttributeProperty dest = new TunnelFunctionalAttributeProperty();

        if (src.isSetTunnelFunctionalAttribute())
            dest.setObject(unmarshalTunnelFunctionalAttribute(src.getTunnelFunctionalAttribute()));

        return dest;
    }

    private WaterBodyDetailAttribute unmarshalWaterBodyDetailAttribute(WaterBodyDetailAttributeType src) throws MissingADESchemaException {
        WaterBodyDetailAttribute dest = new WaterBodyDetailAttribute();

        dest.setKana(src.getKana());

        if (src.isSetWaterSystemCode())
            dest.setWaterSystemCode(helper.getGMLUnmarshaller().unmarshalCode(src.getWaterSystemCode()));

        if (src.isSetRiverCode())
            dest.setRiverCode(helper.getGMLUnmarshaller().unmarshalCode(src.getRiverCode()));

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        dest.setFlowDirection(src.isFlowDirection());

        if (src.isSetMaximumDepth())
            dest.setMaximumDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumDepth()));

        if (src.isSetWaterSurfaceElevation())
            dest.setWaterSurfaceElevation(helper.getGMLUnmarshaller().unmarshalLength(src.getWaterSurfaceElevation()));

        if (src.isSetArea())
            dest.setArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getArea()));

        if (src.isSetMeasurementYearMonth()) {
            LocalDate date = src.getMeasurementYearMonth().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setMeasurementYearMonth(YearMonth.of(date.getYear(), date.getMonthValue()));
        }

        if (src.isSetPrefecture()) {
            for (CodeType prefecture : src.getPrefecture())
                dest.getPrefecture().add(helper.getGMLUnmarshaller().unmarshalCode(prefecture));
        }

        if (src.isSetCity()) {
            for (CodeType city : src.getCity())
                dest.getCity().add(helper.getGMLUnmarshaller().unmarshalCode(city));
        }

        return dest;
    }

    private WaterBodyDetailAttributeProperty unmarshalWaterBodyDetailAttributeProperty(WaterBodyDetailAttributePropertyType src) throws MissingADESchemaException {
        WaterBodyDetailAttributeProperty dest = new WaterBodyDetailAttributeProperty();

        if (src.isSetWaterBodyDetailAttribute())
            dest.setObject(unmarshalWaterBodyDetailAttribute(src.getWaterBodyDetailAttribute()));

        return dest;
    }
}
