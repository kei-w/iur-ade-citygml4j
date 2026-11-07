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
                    .with(BridgeStructureAttribute.class, this::createBridgeStructureAttribute)
                    .with(BridgeFunctionalAttribute.class, this::createBridgeFunctionalAttribute)
                    .with(ConstructionRiskAssessmentAttribute.class, this::createConstructionRiskAssessmentAttribute)
                    .with(RiverFloodingRiskAttribute.class, this::createRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttribute.class, this::createTsunamiRiskAttribute)
                    .with(InlandFloodingRiskAttribute.class, this::createInlandFloodingRiskAttribute)
                    .with(HighTideRiskAttribute.class, this::createHighTideRiskAttribute)
                    .with(ReservoirFloodingRiskAttribute.class, this::createReservoirFloodingRiskAttribute)
                    .with(LandSlideRiskAttribute.class, this::createLandSlideRiskAttribute)
                    .with(DataQualityAttribute.class, this::createDataQualityAttribute)
                    .with(PublicSurveyDataQualityAttribute.class, this::createPublicSurveyDataQualityAttribute)
                    .with(KeyValuePairAttribute.class, this::createKeyValuePairAttribute)
                    .with(BuildingIDAttribute.class, this::createBuildingIDAttribute)
                    .with(BuildingDetailAttribute.class, this::createBuildingDetailAttribute)
                    .with(LargeCustomerFacilityAttribute.class, this::createLargeCustomerFacilityAttribute)
                    .with(RealEstateIDAttribute.class, this::createRealEstateIDAttribute)
                    .with(BuildingUsecaseAttribute.class, this::createBuildingUsecaseAttribute)
                    .with(CityFurnitureDetailAttribute.class, this::createCityFurnitureDetailAttribute)
                    .with(LandUseDetailAttribute.class, this::createLandUseDetailAttribute)
                    .with(TrafficObjectUsecaseAttribute.class, this::createTrafficObjectUsecaseAttribute)
                    .with(TrafficVolumeAttribute.class, this::createTrafficVolumeAttribute)
                    .with(RoadStructureAttribute.class, this::createRoadStructureAttribute)
                    .with(RoadType.class, this::createRoadType)
                    .with(RailwayRouteAttribute.class, this::createRailwayRouteAttribute)
                    .with(TrackAttribute.class, this::createTrackAttribute)
                    .with(SquareUrbanPlanAttribute.class, this::createSquareUrbanPlanAttribute)
                    .with(StationSquareAttribute.class, this::createStationSquareAttribute)
                    .with(TerminalAttribute.class, this::createTerminalAttribute)
                    .with(RailwayTrackAttribute.class, this::createRailwayTrackAttribute)
                    .with(ControlPoint.class, this::createControlPoint)
                    .with(ControlPointParameter.class, this::createControlPointParameter)
                    .with(CircularCurveType.class, this::createCircularCurveType)
                    .with(TransitionCurveType.class, this::createTransitionCurveType)
                    .with(SlopeType.class, this::createSlopeType)
                    .with(VerticalCurveType.class, this::createVerticalCurveType)
                    .with(TrafficAreaStructureAttribute.class, this::createTrafficAreaStructureAttribute)
                    .with(TunnelStructureAttribute.class, this::createTunnelStructureAttribute)
                    .with(TunnelFunctionalAttribute.class, this::createTunnelFunctionalAttribute)
                    .with(WaterBodyDetailAttribute.class, this::createWaterBodyDetailAttribute)
                    .with(BridBaseAttributePropertyElement.class, this::createBridBaseAttributePropertyElement)
                    .with(BridFacilityIdAttributePropertyElement.class, this::createBridFacilityIdAttributePropertyElement)
                    .with(BridFacilityTypeAttributePropertyElement.class, this::createBridFacilityTypeAttributePropertyElement)
                    .with(BridStructureAttributePropertyElement.class, this::createBridStructureAttributePropertyElement)
                    .with(BridFunctionalAttributePropertyElement.class, this::createBridFunctionalAttributePropertyElement)
                    .with(BridRiskAssessmentAttributePropertyElement.class, this::createBridRiskAssessmentAttributePropertyElement)
                    .with(BridDisasterRiskAttributePropertyElement.class, this::createBridDisasterRiskAttributePropertyElement)
                    .with(BridDataQualityAttributePropertyElement.class, this::createBridDataQualityAttributePropertyElement)
                    .with(BridKeyValuePairAttributePropertyElement.class, this::createBridKeyValuePairAttributePropertyElement)
                    .with(BuildingIDAttributePropertyElement.class, this::createBuildingIDAttributePropertyElement)
                    .with(BuildingDetailAttributePropertyElement.class, this::createBuildingDetailAttributePropertyElement)
                    .with(LargeCustomerFacilityAttributePropertyElement.class, this::createLargeCustomerFacilityAttributePropertyElement)
                    .with(BldgDisasterRiskAttributePropertyElement.class, this::createBldgDisasterRiskAttributePropertyElement)
                    .with(BldgKeyValuePairAttributePropertyElement.class, this::createBldgKeyValuePairAttributePropertyElement)
                    .with(BldgDataQualityAttributePropertyElement.class, this::createBldgDataQualityAttributePropertyElement)
                    .with(BldgFacilityIdAttributePropertyElement.class, this::createBldgFacilityIdAttributePropertyElement)
                    .with(BldgFacilityTypeAttributePropertyElement.class, this::createBldgFacilityTypeAttributePropertyElement)
                    .with(BldgRealEstateIDAttributePropertyElement.class, this::createBldgRealEstateIDAttributePropertyElement)
                    .with(BldgUsecaseAttributePropertyElement.class, this::createBldgUsecaseAttributePropertyElement)
                    .with(FrnFacilityIdAttributePropertyElement.class, this::createFrnFacilityIdAttributePropertyElement)
                    .with(FrnFacilityTypeAttributePropertyElement.class, this::createFrnFacilityTypeAttributePropertyElement)
                    .with(CityFurnitureDetailAttributePropertyElement.class, this::createCityFurnitureDetailAttributePropertyElement)
                    .with(FrnDataQualityAttributePropertyElement.class, this::createFrnDataQualityAttributePropertyElement)
                    .with(FrnKeyValuePairAttributePropertyElement.class, this::createFrnKeyValuePairAttributePropertyElement)
                    .with(LandUseDetailAttributePropertyElement.class, this::createLandUseDetailAttributePropertyElement)
                    .with(LuseFacilityIdAttributePropertyElement.class, this::createLuseFacilityIdAttributePropertyElement)
                    .with(LuseFacilityTypeAttributePropertyElement.class, this::createLuseFacilityTypeAttributePropertyElement)
                    .with(LuseDataQualityAttributePropertyElement.class, this::createLuseDataQualityAttributePropertyElement)
                    .with(LuseKeyValuePairAttributePropertyElement.class, this::createLuseKeyValuePairAttributePropertyElement)
                    .with(DemDataQualityAttributePropertyElement.class, this::createDemDataQualityAttributePropertyElement)
                    .with(DemKeyValuePairAttributePropertyElement.class, this::createDemKeyValuePairAttributePropertyElement)
                    .with(TranFacilityIdAttributePropertyElement.class, this::createTranFacilityIdAttributePropertyElement)
                    .with(TranFacilityTypeAttributePropertyElement.class, this::createTranFacilityTypeAttributePropertyElement)
                    .with(TranUsecaseAttributePropertyElement.class, this::createTranUsecaseAttributePropertyElement)
                    .with(TranKeyValuePairAttributePropertyElement.class, this::createTranKeyValuePairAttributePropertyElement)
                    .with(TranDataQualityAttributePropertyElement.class, this::createTranDataQualityAttributePropertyElement)
                    .with(TrafficVolumeAttributePropertyElement.class, this::createTrafficVolumeAttributePropertyElement)
                    .with(RoadStructureAttributePropertyElement.class, this::createRoadStructureAttributePropertyElement)
                    .with(RoadStatusPropertyElement.class, this::createRoadStatusPropertyElement)
                    .with(RailwayRouteAttributePropertyElement.class, this::createRailwayRouteAttributePropertyElement)
                    .with(TrackAttributePropertyElement.class, this::createTrackAttributePropertyElement)
                    .with(SquareUrbanPlanAttributePropertyElement.class, this::createSquareUrbanPlanAttributePropertyElement)
                    .with(RailwayTrackAttributePropertyElement.class, this::createRailwayTrackAttributePropertyElement)
                    .with(TrafficAreaStructureAttributePropertyElement.class, this::createTrafficAreaStructureAttributePropertyElement)
                    .with(TunBaseAttributePropertyElement.class, this::createTunBaseAttributePropertyElement)
                    .with(TunStructureAttributePropertyElement.class, this::createTunStructureAttributePropertyElement)
                    .with(TunFunctionalAttributePropertyElement.class, this::createTunFunctionalAttributePropertyElement)
                    .with(TunRiskAssessmentAttributePropertyElement.class, this::createTunRiskAssessmentAttributePropertyElement)
                    .with(TunDisasterRiskAttributePropertyElement.class, this::createTunDisasterRiskAttributePropertyElement)
                    .with(TunDataQualityAttributePropertyElement.class, this::createTunDataQualityAttributePropertyElement)
                    .with(TunFacilityIdAttributePropertyElement.class, this::createTunFacilityIdAttributePropertyElement)
                    .with(TunFacilityTypeAttributePropertyElement.class, this::createTunFacilityTypeAttributePropertyElement)
                    .with(TunKeyValuePairAttributePropertyElement.class, this::createTunKeyValuePairAttributePropertyElement)
                    .with(VegFacilityIdAttributePropertyElement.class, this::createVegFacilityIdAttributePropertyElement)
                    .with(VegFacilityTypeAttributePropertyElement.class, this::createVegFacilityTypeAttributePropertyElement)
                    .with(VegDataQualityAttributePropertyElement.class, this::createVegDataQualityAttributePropertyElement)
                    .with(VegKeyValuePairAttributePropertyElement.class, this::createVegKeyValuePairAttributePropertyElement)
                    .with(FloodingRiskAttributePropertyElement.class, this::createFloodingRiskAttributePropertyElement)
                    .with(WtrFacilityIdAttributePropertyElement.class, this::createWtrFacilityIdAttributePropertyElement)
                    .with(WtrFacilityTypeAttributePropertyElement.class, this::createWtrFacilityTypeAttributePropertyElement)
                    .with(WaterBodyDetailAttributePropertyElement.class, this::createWaterBodyDetailAttributePropertyElement)
                    .with(WtrDataQualityAttributePropertyElement.class, this::createWtrDataQualityAttributePropertyElement)
                    .with(WtrKeyValuePairAttributePropertyElement.class, this::createWtrKeyValuePairAttributePropertyElement)
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
                    .with(ReservoirFloodingRiskAttribute.class, this::marshalReservoirFloodingRiskAttribute)
                    .with(FloodingRiskAttributeProperty.class, this::marshalFloodingRiskAttributeProperty)
                    .with(LandSlideRiskAttribute.class, this::marshalLandSlideRiskAttribute)
                    .with(DisasterRiskAttributeProperty.class, this::marshalDisasterRiskAttributeProperty)
                    .with(DataQualityAttribute.class, this::marshalDataQualityAttribute)
                    .with(DataQualityAttributeProperty.class, this::marshalDataQualityAttributeProperty)
                    .with(PublicSurveyDataQualityAttribute.class, this::marshalPublicSurveyDataQualityAttribute)
                    .with(PublicSurveyDataQualityAttributeProperty.class, this::marshalPublicSurveyDataQualityAttributeProperty)
                    .with(KeyValuePairAttribute.class, this::marshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributeProperty.class, this::marshalKeyValuePairAttributeProperty)
                    .with(BuildingIDAttribute.class, this::marshalBuildingIDAttribute)
                    .with(BuildingIDAttributeProperty.class, this::marshalBuildingIDAttributeProperty)
                    .with(BuildingDetailAttribute.class, this::marshalBuildingDetailAttribute)
                    .with(BuildingDetailAttributeProperty.class, this::marshalBuildingDetailAttributeProperty)
                    .with(LargeCustomerFacilityAttribute.class, this::marshalLargeCustomerFacilityAttribute)
                    .with(LargeCustomerFacilityAttributeProperty.class, this::marshalLargeCustomerFacilityAttributeProperty)
                    .with(RealEstateIDAttribute.class, this::marshalRealEstateIDAttribute)
                    .with(RealEstateIDAttributeProperty.class, this::marshalRealEstateIDAttributeProperty)
                    .with(BuildingUsecaseAttribute.class, this::marshalBuildingUsecaseAttribute)
                    .with(BuildingUsecaseAttributeProperty.class, this::marshalBuildingUsecaseAttributeProperty)
                    .with(CityFurnitureDetailAttribute.class, this::marshalCityFurnitureDetailAttribute)
                    .with(CityFurnitureDetailAttributeProperty.class, this::marshalCityFurnitureDetailAttributeProperty)
                    .with(LandUseDetailAttribute.class, this::marshalLandUseDetailAttribute)
                    .with(LandUseDetailAttributeProperty.class, this::marshalLandUseDetailAttributeProperty)
                    .with(TrafficObjectUsecaseAttribute.class, this::marshalTrafficObjectUsecaseAttribute)
                    .with(TrafficObjectUsecaseAttributeProperty.class, this::marshalTrafficObjectUsecaseAttributeProperty)
                    .with(TrafficVolumeAttribute.class, this::marshalTrafficVolumeAttribute)
                    .with(TrafficVolumeAttributeProperty.class, this::marshalTrafficVolumeAttributeProperty)
                    .with(RoadStructureAttribute.class, this::marshalRoadStructureAttribute)
                    .with(RoadStructureAttributeProperty.class, this::marshalRoadStructureAttributeProperty)
                    .with(RoadType.class, this::marshalRoadType)
                    .with(RoadTypeProperty.class, this::marshalRoadTypeProperty)
                    .with(RailwayRouteAttribute.class, this::marshalRailwayRouteAttribute)
                    .with(RailwayRouteAttributeProperty.class, this::marshalRailwayRouteAttributeProperty)
                    .with(TrackAttribute.class, this::marshalTrackAttribute)
                    .with(TrackAttributeProperty.class, this::marshalTrackAttributeProperty)
                    .with(SquareUrbanPlanAttribute.class, this::marshalSquareUrbanPlanAttribute)
                    .with(StationSquareAttribute.class, this::marshalStationSquareAttribute)
                    .with(TerminalAttribute.class, this::marshalTerminalAttribute)
                    .with(SquareUrbanPlanAttributeProperty.class, this::marshalSquareUrbanPlanAttributeProperty)
                    .with(RailwayTrackAttribute.class, this::marshalRailwayTrackAttribute)
                    .with(RailwayTrackAttributeProperty.class, this::marshalRailwayTrackAttributeProperty)
                    .with(ControlPoint.class, this::marshalControlPoint)
                    .with(ControlPointProperty.class, this::marshalControlPointProperty)
                    .with(ControlPointParameter.class, this::marshalControlPointParameter)
                    .with(ControlPointTypeProperty.class, this::marshalControlPointTypeProperty)
                    .with(CircularCurveType.class, this::marshalCircularCurveType)
                    .with(CircularCurveTypeProperty.class, this::marshalCircularCurveTypeProperty)
                    .with(TransitionCurveType.class, this::marshalTransitionCurveType)
                    .with(TransitionCurveTypeProperty.class, this::marshalTransitionCurveTypeProperty)
                    .with(SlopeType.class, this::marshalSlopeType)
                    .with(SlopeTypeProperty.class, this::marshalSlopeTypeProperty)
                    .with(VerticalCurveType.class, this::marshalVerticalCurveType)
                    .with(VerticalCurveTypeProperty.class, this::marshalVerticalCurveTypeProperty)
                    .with(TrafficAreaStructureAttribute.class, this::marshalTrafficAreaStructureAttribute)
                    .with(TrafficAreaStructureAttributeProperty.class, this::marshalTrafficAreaStructureAttributeProperty)
                    .with(TunnelStructureAttribute.class, this::marshalTunnelStructureAttribute)
                    .with(TunnelStructureAttributeProperty.class, this::marshalTunnelStructureAttributeProperty)
                    .with(TunnelFunctionalAttribute.class, this::marshalTunnelFunctionalAttribute)
                    .with(TunnelFunctionalAttributeProperty.class, this::marshalTunnelFunctionalAttributeProperty)
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

        if (src.getLeftEndDistance() != null)
            dest.setLeftEndDistance(helper.getGMLMarshaller().marshalLength(src.getLeftEndDistance()));

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

    private ReservoirFloodingRiskAttributeType marshalReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttribute src) {
        ReservoirFloodingRiskAttributeType dest = factory.createReservoirFloodingRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private FloodingRiskAttributePropertyType marshalFloodingRiskAttributeProperty(FloodingRiskAttributeProperty src) {
        FloodingRiskAttributePropertyType dest = factory.createFloodingRiskAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof FloodingRiskAttributeType)
                dest.setFloodingRiskAttribute((JAXBElement<? extends FloodingRiskAttributeType>) elem);
        }

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

    private DataQualityAttributeType marshalDataQualityAttribute(DataQualityAttribute src) {
        DataQualityAttributeType dest = factory.createDataQualityAttributeType();

        for (Code geometrySrcDescLod0 : src.getGeometrySrcDescLod0())
            dest.getGeometrySrcDescLod0().add(helper.getGMLMarshaller().marshalCode(geometrySrcDescLod0));

        for (Code geometrySrcDescLod1 : src.getGeometrySrcDescLod1())
            dest.getGeometrySrcDescLod1().add(helper.getGMLMarshaller().marshalCode(geometrySrcDescLod1));

        for (Code geometrySrcDescLod2 : src.getGeometrySrcDescLod2())
            dest.getGeometrySrcDescLod2().add(helper.getGMLMarshaller().marshalCode(geometrySrcDescLod2));

        for (Code geometrySrcDescLod3 : src.getGeometrySrcDescLod3())
            dest.getGeometrySrcDescLod3().add(helper.getGMLMarshaller().marshalCode(geometrySrcDescLod3));

        for (Code geometrySrcDescLod4 : src.getGeometrySrcDescLod4())
            dest.getGeometrySrcDescLod4().add(helper.getGMLMarshaller().marshalCode(geometrySrcDescLod4));

        for (Code thematicSrcDesc : src.getThematicSrcDesc())
            dest.getThematicSrcDesc().add(helper.getGMLMarshaller().marshalCode(thematicSrcDesc));

        for (Code appearanceSrcDescLod0 : src.getAppearanceSrcDescLod0())
            dest.getAppearanceSrcDescLod0().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDescLod0));

        for (Code appearanceSrcDescLod1 : src.getAppearanceSrcDescLod1())
            dest.getAppearanceSrcDescLod1().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDescLod1));

        for (Code appearanceSrcDescLod2 : src.getAppearanceSrcDescLod2())
            dest.getAppearanceSrcDescLod2().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDescLod2));

        for (Code appearanceSrcDescLod3 : src.getAppearanceSrcDescLod3())
            dest.getAppearanceSrcDescLod3().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDescLod3));

        for (Code appearanceSrcDescLod4 : src.getAppearanceSrcDescLod4())
            dest.getAppearanceSrcDescLod4().add(helper.getGMLMarshaller().marshalCode(appearanceSrcDescLod4));

        for (Code lodType : src.getLodType())
            dest.getLodType().add(helper.getGMLMarshaller().marshalCode(lodType));

        if (src.getLod1HeightType() != null)
            dest.setLod1HeightType(helper.getGMLMarshaller().marshalCode(src.getLod1HeightType()));

        dest.setTranDataAcquisition(src.getTranDataAcquisition());

        if (src.getPublicSurveyDataQualityAttribute() != null)
            dest.setPublicSurveyDataQualityAttribute(marshalPublicSurveyDataQualityAttributeProperty(src.getPublicSurveyDataQualityAttribute()));

        return dest;
    }

    private DataQualityAttributePropertyType marshalDataQualityAttributeProperty(DataQualityAttributeProperty src) {
        DataQualityAttributePropertyType dest = factory.createDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setDataQualityAttribute(marshalDataQualityAttribute(src.getObject()));

        return dest;
    }

    private PublicSurveyDataQualityAttributeType marshalPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttribute src) {
        PublicSurveyDataQualityAttributeType dest = factory.createPublicSurveyDataQualityAttributeType();

        if (src.getSrcScaleLod0() != null)
            dest.setSrcScaleLod0(helper.getGMLMarshaller().marshalCode(src.getSrcScaleLod0()));

        if (src.getSrcScaleLod1() != null)
            dest.setSrcScaleLod1(helper.getGMLMarshaller().marshalCode(src.getSrcScaleLod1()));

        if (src.getSrcScaleLod2() != null)
            dest.setSrcScaleLod2(helper.getGMLMarshaller().marshalCode(src.getSrcScaleLod2()));

        if (src.getSrcScaleLod3() != null)
            dest.setSrcScaleLod3(helper.getGMLMarshaller().marshalCode(src.getSrcScaleLod3()));

        if (src.getSrcScaleLod4() != null)
            dest.setSrcScaleLod4(helper.getGMLMarshaller().marshalCode(src.getSrcScaleLod4()));

        for (Code publicSurveySrcDescLod0 : src.getPublicSurveySrcDescLod0())
            dest.getPublicSurveySrcDescLod0().add(helper.getGMLMarshaller().marshalCode(publicSurveySrcDescLod0));

        for (Code publicSurveySrcDescLod1 : src.getPublicSurveySrcDescLod1())
            dest.getPublicSurveySrcDescLod1().add(helper.getGMLMarshaller().marshalCode(publicSurveySrcDescLod1));

        for (Code publicSurveySrcDescLod2 : src.getPublicSurveySrcDescLod2())
            dest.getPublicSurveySrcDescLod2().add(helper.getGMLMarshaller().marshalCode(publicSurveySrcDescLod2));

        for (Code publicSurveySrcDescLod3 : src.getPublicSurveySrcDescLod3())
            dest.getPublicSurveySrcDescLod3().add(helper.getGMLMarshaller().marshalCode(publicSurveySrcDescLod3));

        for (Code publicSurveySrcDescLod4 : src.getPublicSurveySrcDescLod4())
            dest.getPublicSurveySrcDescLod4().add(helper.getGMLMarshaller().marshalCode(publicSurveySrcDescLod4));

        return dest;
    }

    private PublicSurveyDataQualityAttributePropertyType marshalPublicSurveyDataQualityAttributeProperty(PublicSurveyDataQualityAttributeProperty src) {
        PublicSurveyDataQualityAttributePropertyType dest = factory.createPublicSurveyDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setPublicSurveyDataQualityAttribute(marshalPublicSurveyDataQualityAttribute(src.getObject()));

        return dest;
    }

    private KeyValuePairAttributeType marshalKeyValuePairAttribute(KeyValuePairAttribute src) {
        KeyValuePairAttributeType dest = factory.createKeyValuePairAttributeType();

        if (src.getKey() != null)
            dest.setKey(helper.getGMLMarshaller().marshalCode(src.getKey()));

        if (src.getCodeValue() != null)
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));

        return dest;
    }

    private KeyValuePairAttributePropertyType marshalKeyValuePairAttributeProperty(KeyValuePairAttributeProperty src) {
        KeyValuePairAttributePropertyType dest = factory.createKeyValuePairAttributePropertyType();

        if (src.isSetObject())
            dest.setKeyValuePairAttribute(marshalKeyValuePairAttribute(src.getObject()));

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

    private RealEstateIDAttributeType marshalRealEstateIDAttribute(RealEstateIDAttribute src) {
        RealEstateIDAttributeType dest = factory.createRealEstateIDAttributeType();

        dest.setRealEstateIDOfBuilding(src.getRealEstateIDOfBuilding());

        if (src.getNumberOfBuildingUnitOwnership() != null)
            dest.setNumberOfBuildingUnitOwnership(BigInteger.valueOf(src.getNumberOfBuildingUnitOwnership()));

        for (String realEstateIDOfBuildingUnitOwnership : src.getRealEstateIDOfBuildingUnitOwnership())
            dest.getRealEstateIDOfBuildingUnitOwnership().add(realEstateIDOfBuildingUnitOwnership);

        if (src.getNumberOfRealEstateIDOfLand() != null)
            dest.setNumberOfRealEstateIDOfLand(BigInteger.valueOf(src.getNumberOfRealEstateIDOfLand()));

        for (String realEstateIDOfLand : src.getRealEstateIDOfLand())
            dest.getRealEstateIDOfLand().add(realEstateIDOfLand);

        if (src.getMatchingScore() != null)
            dest.setMatchingScore(BigInteger.valueOf(src.getMatchingScore()));

        return dest;
    }

    private RealEstateIDAttributePropertyType marshalRealEstateIDAttributeProperty(RealEstateIDAttributeProperty src) {
        RealEstateIDAttributePropertyType dest = factory.createRealEstateIDAttributePropertyType();

        if (src.isSetObject())
            dest.setRealEstateIDAttribute(marshalRealEstateIDAttribute(src.getObject()));

        return dest;
    }

    private BuildingUsecaseAttributeType marshalBuildingUsecaseAttribute(BuildingUsecaseAttribute src) {
        BuildingUsecaseAttributeType dest = factory.createBuildingUsecaseAttributeType();

        if (src.getIsTemporal() != null)
            dest.setIsTemporal(helper.getGMLMarshaller().marshalCode(src.getIsTemporal()));

        if (src.getFloorHeight() != null)
            dest.setFloorHeight(helper.getGMLMarshaller().marshalLength(src.getFloorHeight()));

        dest.setIsGroundFloorOpen(src.getIsGroundFloorOpen());

        return dest;
    }

    private BuildingUsecaseAttributePropertyType marshalBuildingUsecaseAttributeProperty(BuildingUsecaseAttributeProperty src) {
        BuildingUsecaseAttributePropertyType dest = factory.createBuildingUsecaseAttributePropertyType();

        if (src.isSetObject())
            dest.setBuildingUsecaseAttribute(marshalBuildingUsecaseAttribute(src.getObject()));

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

    private TrafficObjectUsecaseAttributeType marshalTrafficObjectUsecaseAttribute(TrafficObjectUsecaseAttribute src) {
        TrafficObjectUsecaseAttributeType dest = factory.createTrafficObjectUsecaseAttributeType();

        if (src.getMinWidth() != null)
            dest.setMinWidth(helper.getGMLMarshaller().marshalLength(src.getMinWidth()));

        if (src.getMaxWidth() != null)
            dest.setMaxWidth(helper.getGMLMarshaller().marshalLength(src.getMaxWidth()));

        return dest;
    }

    private TrafficObjectUsecaseAttributePropertyType marshalTrafficObjectUsecaseAttributeProperty(TrafficObjectUsecaseAttributeProperty src) {
        TrafficObjectUsecaseAttributePropertyType dest = factory.createTrafficObjectUsecaseAttributePropertyType();

        if (src.isSetObject())
            dest.setTrafficObjectUsecaseAttribute(marshalTrafficObjectUsecaseAttribute(src.getObject()));

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

        if (src.getParameter() != null)
            dest.setParameter(marshalControlPointTypeProperty(src.getParameter()));

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

    private ControlPointTypeType marshalControlPointParameter(ControlPointParameter src) {
        ControlPointTypeType dest = factory.createControlPointTypeType();

        if (src.getCircularCurve() != null)
            dest.setCircularCurve(marshalCircularCurveTypeProperty(src.getCircularCurve()));

        if (src.getTransitionCurve() != null)
            dest.setTransitionCurve(marshalTransitionCurveTypeProperty(src.getTransitionCurve()));

        if (src.getSlopeType() != null)
            dest.setSlopeType(marshalSlopeTypeProperty(src.getSlopeType()));

        if (src.getVerticalCurve() != null)
            dest.setVerticalCurve(marshalVerticalCurveTypeProperty(src.getVerticalCurve()));

        return dest;
    }

    private ControlPointTypePropertyType marshalControlPointTypeProperty(ControlPointTypeProperty src) {
        ControlPointTypePropertyType dest = factory.createControlPointTypePropertyType();

        if (src.isSetObject())
            dest.setControlPointType(marshalControlPointParameter(src.getObject()));

        return dest;
    }

    private CircularCurveTypeType marshalCircularCurveType(CircularCurveType src) {
        CircularCurveTypeType dest = factory.createCircularCurveTypeType();

        if (src.getRadius() != null)
            dest.setRadius(helper.getGMLMarshaller().marshalLength(src.getRadius()));

        if (src.getIntersection() != null)
            dest.setIntersection(src.getIntersection());

        if (src.getCutLength() != null)
            dest.setCutLength(helper.getGMLMarshaller().marshalLength(src.getCutLength()));

        if (src.getCurveLength() != null)
            dest.setCurveLength(helper.getGMLMarshaller().marshalLength(src.getCurveLength()));

        return dest;
    }

    private CircularCurveTypePropertyType marshalCircularCurveTypeProperty(CircularCurveTypeProperty src) {
        CircularCurveTypePropertyType dest = factory.createCircularCurveTypePropertyType();

        if (src.isSetObject())
            dest.setCircularCurveType(marshalCircularCurveType(src.getObject()));

        return dest;
    }

    private TransitionCurveTypeType marshalTransitionCurveType(TransitionCurveType src) {
        TransitionCurveTypeType dest = factory.createTransitionCurveTypeType();

        if (src.getIntersection() != null)
            dest.setIntersection(helper.getGMLMarshaller().marshalLength(src.getIntersection()));

        if (src.getDistance() != null)
            dest.setDistance(helper.getGMLMarshaller().marshalLength(src.getDistance()));

        if (src.getCurveLength() != null)
            dest.setCurveLength(helper.getGMLMarshaller().marshalLength(src.getCurveLength()));

        return dest;
    }

    private TransitionCurveTypePropertyType marshalTransitionCurveTypeProperty(TransitionCurveTypeProperty src) {
        TransitionCurveTypePropertyType dest = factory.createTransitionCurveTypePropertyType();

        if (src.isSetObject())
            dest.setTransitionCurveType(marshalTransitionCurveType(src.getObject()));

        return dest;
    }

    private SlopeTypeType marshalSlopeType(SlopeType src) {
        SlopeTypeType dest = factory.createSlopeTypeType();

        if (src.getAngle() != null)
            dest.setAngle(src.getAngle());

        if (src.getElevation() != null)
            dest.setElevation(helper.getGMLMarshaller().marshalLength(src.getElevation()));

        return dest;
    }

    private SlopeTypePropertyType marshalSlopeTypeProperty(SlopeTypeProperty src) {
        SlopeTypePropertyType dest = factory.createSlopeTypePropertyType();

        if (src.isSetObject())
            dest.setSlopeType(marshalSlopeType(src.getObject()));

        return dest;
    }

    private VerticalCurveTypeType marshalVerticalCurveType(VerticalCurveType src) {
        VerticalCurveTypeType dest = factory.createVerticalCurveTypeType();

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getVerticalDistance() != null)
            dest.setVerticalDistance(helper.getGMLMarshaller().marshalLength(src.getVerticalDistance()));

        return dest;
    }

    private VerticalCurveTypePropertyType marshalVerticalCurveTypeProperty(VerticalCurveTypeProperty src) {
        VerticalCurveTypePropertyType dest = factory.createVerticalCurveTypePropertyType();

        if (src.isSetObject())
            dest.setVerticalCurveType(marshalVerticalCurveType(src.getObject()));

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

    private JAXBElement<?> createReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttribute src) {
        return factory.createReservoirFloodingRiskAttribute(marshalReservoirFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createLandSlideRiskAttribute(LandSlideRiskAttribute src) {
        return factory.createLandSlideRiskAttribute(marshalLandSlideRiskAttribute(src));
    }

    private JAXBElement<?> createDataQualityAttribute(DataQualityAttribute src) {
        return factory.createDataQualityAttribute(marshalDataQualityAttribute(src));
    }

    private JAXBElement<?> createPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttribute src) {
        return factory.createPublicSurveyDataQualityAttribute(marshalPublicSurveyDataQualityAttribute(src));
    }

    private JAXBElement<?> createKeyValuePairAttribute(KeyValuePairAttribute src) {
        return factory.createKeyValuePairAttribute(marshalKeyValuePairAttribute(src));
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

    private JAXBElement<?> createRealEstateIDAttribute(RealEstateIDAttribute src) {
        return factory.createRealEstateIDAttribute(marshalRealEstateIDAttribute(src));
    }

    private JAXBElement<?> createBuildingUsecaseAttribute(BuildingUsecaseAttribute src) {
        return factory.createBuildingUsecaseAttribute(marshalBuildingUsecaseAttribute(src));
    }

    private JAXBElement<?> createCityFurnitureDetailAttribute(CityFurnitureDetailAttribute src) {
        return factory.createCityFurnitureDetailAttribute(marshalCityFurnitureDetailAttribute(src));
    }

    private JAXBElement<?> createLandUseDetailAttribute(LandUseDetailAttribute src) {
        return factory.createLandUseDetailAttribute(marshalLandUseDetailAttribute(src));
    }

    private JAXBElement<?> createTrafficObjectUsecaseAttribute(TrafficObjectUsecaseAttribute src) {
        return factory.createTrafficObjectUsecaseAttribute(marshalTrafficObjectUsecaseAttribute(src));
    }

    private JAXBElement<?> createTrafficVolumeAttribute(TrafficVolumeAttribute src) {
        return factory.createTrafficVolumeAttribute(marshalTrafficVolumeAttribute(src));
    }

    private JAXBElement<?> createRoadStructureAttribute(RoadStructureAttribute src) {
        return factory.createRoadStructureAttribute(marshalRoadStructureAttribute(src));
    }

    private JAXBElement<?> createRoadType(RoadType src) {
        return factory.createRoadType(marshalRoadType(src));
    }

    private JAXBElement<?> createRailwayRouteAttribute(RailwayRouteAttribute src) {
        return factory.createRailwayRouteAttribute(marshalRailwayRouteAttribute(src));
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

    private JAXBElement<?> createRailwayTrackAttribute(RailwayTrackAttribute src) {
        return factory.createRailwayTrackAttribute(marshalRailwayTrackAttribute(src));
    }

    private JAXBElement<?> createControlPoint(ControlPoint src) {
        return factory.createControlPoint(marshalControlPoint(src));
    }

    private JAXBElement<?> createControlPointParameter(ControlPointParameter src) {
        return factory.createControlPointType(marshalControlPointParameter(src));
    }

    private JAXBElement<?> createCircularCurveType(CircularCurveType src) {
        return factory.createCircularCurveType(marshalCircularCurveType(src));
    }

    private JAXBElement<?> createTransitionCurveType(TransitionCurveType src) {
        return factory.createTransitionCurveType(marshalTransitionCurveType(src));
    }

    private JAXBElement<?> createSlopeType(SlopeType src) {
        return factory.createSlopeType(marshalSlopeType(src));
    }

    private JAXBElement<?> createVerticalCurveType(VerticalCurveType src) {
        return factory.createVerticalCurveType(marshalVerticalCurveType(src));
    }

    private JAXBElement<?> createTrafficAreaStructureAttribute(TrafficAreaStructureAttribute src) {
        return factory.createTrafficAreaStructureAttribute(marshalTrafficAreaStructureAttribute(src));
    }

    private JAXBElement<?> createTunnelStructureAttribute(TunnelStructureAttribute src) {
        return factory.createTunnelStructureAttribute(marshalTunnelStructureAttribute(src));
    }

    private JAXBElement<?> createTunnelFunctionalAttribute(TunnelFunctionalAttribute src) {
        return factory.createTunnelFunctionalAttribute(marshalTunnelFunctionalAttribute(src));
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

    private JAXBElement<?> createBridDataQualityAttributePropertyElement(BridDataQualityAttributePropertyElement src) {
        return factory.createBridDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBridKeyValuePairAttributePropertyElement(BridKeyValuePairAttributePropertyElement src) {
        return factory.createBridKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
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

    private JAXBElement<?> createBldgDisasterRiskAttributePropertyElement(BldgDisasterRiskAttributePropertyElement src) {
        return factory.createBldgDisasterRiskAttribute(marshalDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgKeyValuePairAttributePropertyElement(BldgKeyValuePairAttributePropertyElement src) {
        return factory.createBldgKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgDataQualityAttributePropertyElement(BldgDataQualityAttributePropertyElement src) {
        return factory.createBldgDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgFacilityIdAttributePropertyElement(BldgFacilityIdAttributePropertyElement src) {
        return factory.createBldgFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgFacilityTypeAttributePropertyElement(BldgFacilityTypeAttributePropertyElement src) {
        return factory.createBldgFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgRealEstateIDAttributePropertyElement(BldgRealEstateIDAttributePropertyElement src) {
        return factory.createBldgRealEstateIDAttribute(marshalRealEstateIDAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBldgUsecaseAttributePropertyElement(BldgUsecaseAttributePropertyElement src) {
        return factory.createBldgUsecaseAttribute(marshalBuildingUsecaseAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnFacilityIdAttributePropertyElement(FrnFacilityIdAttributePropertyElement src) {
        return factory.createFrnFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnFacilityTypeAttributePropertyElement(FrnFacilityTypeAttributePropertyElement src) {
        return factory.createFrnFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createCityFurnitureDetailAttributePropertyElement(CityFurnitureDetailAttributePropertyElement src) {
        return factory.createCityFurnitureDetailAttributeProperty(marshalCityFurnitureDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnDataQualityAttributePropertyElement(FrnDataQualityAttributePropertyElement src) {
        return factory.createFrnDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFrnKeyValuePairAttributePropertyElement(FrnKeyValuePairAttributePropertyElement src) {
        return factory.createFrnKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLandUseDetailAttributePropertyElement(LandUseDetailAttributePropertyElement src) {
        return factory.createLandUseDetailAttributeProperty(marshalLandUseDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseFacilityIdAttributePropertyElement(LuseFacilityIdAttributePropertyElement src) {
        return factory.createLuseFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseFacilityTypeAttributePropertyElement(LuseFacilityTypeAttributePropertyElement src) {
        return factory.createLuseFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseDataQualityAttributePropertyElement(LuseDataQualityAttributePropertyElement src) {
        return factory.createLuseDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLuseKeyValuePairAttributePropertyElement(LuseKeyValuePairAttributePropertyElement src) {
        return factory.createLuseKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createDemDataQualityAttributePropertyElement(DemDataQualityAttributePropertyElement src) {
        return factory.createDemDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createDemKeyValuePairAttributePropertyElement(DemKeyValuePairAttributePropertyElement src) {
        return factory.createDemKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranFacilityIdAttributePropertyElement(TranFacilityIdAttributePropertyElement src) {
        return factory.createTranFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranFacilityTypeAttributePropertyElement(TranFacilityTypeAttributePropertyElement src) {
        return factory.createTranFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranUsecaseAttributePropertyElement(TranUsecaseAttributePropertyElement src) {
        return factory.createTranUsecaseAttribute(marshalTrafficObjectUsecaseAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranKeyValuePairAttributePropertyElement(TranKeyValuePairAttributePropertyElement src) {
        return factory.createTranKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTranDataQualityAttributePropertyElement(TranDataQualityAttributePropertyElement src) {
        return factory.createTranDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrafficVolumeAttributePropertyElement(TrafficVolumeAttributePropertyElement src) {
        return factory.createTrafficVolumeAttributeProperty(marshalTrafficVolumeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRoadStructureAttributePropertyElement(RoadStructureAttributePropertyElement src) {
        return factory.createRoadStructureAttributeProperty(marshalRoadStructureAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRoadStatusPropertyElement(RoadStatusPropertyElement src) {
        return factory.createRoadStatus(marshalRoadTypeProperty(src.getValue()));
    }

    private JAXBElement<?> createRailwayRouteAttributePropertyElement(RailwayRouteAttributePropertyElement src) {
        return factory.createRailwayRouteAttributeProperty(marshalRailwayRouteAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrackAttributePropertyElement(TrackAttributePropertyElement src) {
        return factory.createTrackAttributeProperty(marshalTrackAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createSquareUrbanPlanAttributePropertyElement(SquareUrbanPlanAttributePropertyElement src) {
        return factory.createSquareUrbanPlanAttributeProperty(marshalSquareUrbanPlanAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRailwayTrackAttributePropertyElement(RailwayTrackAttributePropertyElement src) {
        return factory.createRailwayTrackAttributeProperty(marshalRailwayTrackAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTrafficAreaStructureAttributePropertyElement(TrafficAreaStructureAttributePropertyElement src) {
        return factory.createTrafficAreaStructureAttributeProperty(marshalTrafficAreaStructureAttributeProperty(src.getValue()));
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

    private JAXBElement<?> createTunDataQualityAttributePropertyElement(TunDataQualityAttributePropertyElement src) {
        return factory.createTunDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFacilityIdAttributePropertyElement(TunFacilityIdAttributePropertyElement src) {
        return factory.createTunFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunFacilityTypeAttributePropertyElement(TunFacilityTypeAttributePropertyElement src) {
        return factory.createTunFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createTunKeyValuePairAttributePropertyElement(TunKeyValuePairAttributePropertyElement src) {
        return factory.createTunKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegFacilityIdAttributePropertyElement(VegFacilityIdAttributePropertyElement src) {
        return factory.createVegFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegFacilityTypeAttributePropertyElement(VegFacilityTypeAttributePropertyElement src) {
        return factory.createVegFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegDataQualityAttributePropertyElement(VegDataQualityAttributePropertyElement src) {
        return factory.createVegDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createVegKeyValuePairAttributePropertyElement(VegKeyValuePairAttributePropertyElement src) {
        return factory.createVegKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFloodingRiskAttributePropertyElement(FloodingRiskAttributePropertyElement src) {
        return factory.createFloodingRiskAttributeProperty(marshalFloodingRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrFacilityIdAttributePropertyElement(WtrFacilityIdAttributePropertyElement src) {
        return factory.createWtrFacilityIdAttribute(marshalFacilityIdAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrFacilityTypeAttributePropertyElement(WtrFacilityTypeAttributePropertyElement src) {
        return factory.createWtrFacilityTypeAttribute(marshalFacilityTypeAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWaterBodyDetailAttributePropertyElement(WaterBodyDetailAttributePropertyElement src) {
        return factory.createWaterBodyDetailAttributeProperty(marshalWaterBodyDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrDataQualityAttributePropertyElement(WtrDataQualityAttributePropertyElement src) {
        return factory.createWtrDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createWtrKeyValuePairAttributePropertyElement(WtrKeyValuePairAttributePropertyElement src) {
        return factory.createWtrKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
