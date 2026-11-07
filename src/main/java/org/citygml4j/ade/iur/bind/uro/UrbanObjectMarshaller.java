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

import jp.geospatial.iur._2_0.uro.*;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.uro.*;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.util.mapper.TypeMapper;

import java.math.BigInteger;
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
                    .with(RoadDataQualityAttribute.class, this::createRoadDataQualityAttribute)
                    .with(TrafficAreaStructureAttribute.class, this::createTrafficAreaStructureAttribute)
                    .with(CityFurnitureDetailAttribute.class, this::createCityFurnitureDetailAttribute)
                    .with(CityFurnitureDataQualityAttribute.class, this::createCityFurnitureDataQualityAttribute)
                    .with(VegetationDataQualityAttribute.class, this::createVegetationDataQualityAttribute)
                    .with(WaterBodyRiverFloodingRiskAttribute.class, this::createWaterBodyRiverFloodingRiskAttribute)
                    .with(WaterBodyTsunamiRiskAttribute.class, this::createWaterBodyTsunamiRiskAttribute)
                    .with(WaterBodyHighTideRiskAttribute.class, this::createWaterBodyHighTideRiskAttribute)
                    .with(WaterBodyInlandFloodingRiskAttribute.class, this::createWaterBodyInlandFloodingRiskAttribute)
                    .with(BuildingIDAttributePropertyElement.class, this::createBuildingIDAttributePropertyElement)
                    .with(BuildingDetailAttributePropertyElement.class, this::createBuildingDetailAttributePropertyElement)
                    .with(LargeCustomerFacilityAttributePropertyElement.class, this::createLargeCustomerFacilityAttributePropertyElement)
                    .with(BuildingDisasterRiskAttributePropertyElement.class, this::createBuildingDisasterRiskAttributePropertyElement)
                    .with(KeyValuePairAttributePropertyElement.class, this::createKeyValuePairAttributePropertyElement)
                    .with(BuildingDataQualityAttributePropertyElement.class, this::createBuildingDataQualityAttributePropertyElement)
                    .with(LandUseDetailAttributePropertyElement.class, this::createLandUseDetailAttributePropertyElement)
                    .with(TrafficVolumeAttributePropertyElement.class, this::createTrafficVolumeAttributePropertyElement)
                    .with(RoadStructureAttributePropertyElement.class, this::createRoadStructureAttributePropertyElement)
                    .with(RoadDataQualityAttributePropertyElement.class, this::createRoadDataQualityAttributePropertyElement)
                    .with(TrafficAreaStructureAttributePropertyElement.class, this::createTrafficAreaStructureAttributePropertyElement)
                    .with(CityFurnitureDetailAttributePropertyElement.class, this::createCityFurnitureDetailAttributePropertyElement)
                    .with(CityFurnitureDataQualityAttributePropertyElement.class, this::createCityFurnitureDataQualityAttributePropertyElement)
                    .with(VegetationDataQualityAttributePropertyElement.class, this::createVegetationDataQualityAttributePropertyElement)
                    .with(FloodingRiskAttributePropertyElement.class, this::createFloodingRiskAttributePropertyElement)
                    .with(FiscalYearOfPublicationProperty.class, this::createFiscalYearOfPublicationProperty)
                    .with(LanguageProperty.class, this::createLanguageProperty);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
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
                    .with(RoadDataQualityAttribute.class, this::marshalRoadDataQualityAttribute)
                    .with(RoadDataQualityAttributeProperty.class, this::marshalRoadDataQualityAttributeProperty)
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
                    .with(WaterBodyFloodingRiskAttributeProperty.class, this::marshalWaterBodyFloodingRiskAttributeProperty);
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

        if (src.getWeekday12hourTrafficVolume() != null)
            dest.setWeekday12HourTrafficVolume(BigInteger.valueOf(src.getWeekday12hourTrafficVolume()));

        if (src.getWeekday24hourTrafficVolume() != null)
            dest.setWeekday24HourTrafficVolume(BigInteger.valueOf(src.getWeekday24hourTrafficVolume()));

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedInCongestion(src.getAverageInboundTravelSpeedInCongestion());
        dest.setAverageOutboundTravelSpeedInCongestion(src.getAverageOutboundTravelSpeedInCongestion());
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

    private RoadDataQualityAttributeType marshalRoadDataQualityAttribute(RoadDataQualityAttribute src) {
        RoadDataQualityAttributeType dest = factory.createRoadDataQualityAttributeType();

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

    private RoadDataQualityAttributePropertyType marshalRoadDataQualityAttributeProperty(RoadDataQualityAttributeProperty src) {
        RoadDataQualityAttributePropertyType dest = factory.createRoadDataQualityAttributePropertyType();

        if (src.isSetObject())
            dest.setRoadDataQualityAttribute(marshalRoadDataQualityAttribute(src.getObject()));

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

        dest.setFacilityType(src.getFacilityType());
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

        for (String lodType : src.getLodType())
            dest.getLodType().add(lodType);

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

    private JAXBElement<?> createRoadDataQualityAttribute(RoadDataQualityAttribute src) {
        return factory.createRoadDataQualityAttribute(marshalRoadDataQualityAttribute(src));
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

    private JAXBElement<?> createRoadDataQualityAttributePropertyElement(RoadDataQualityAttributePropertyElement src) {
        return factory.createRoadDataQualityAttributeProperty(marshalRoadDataQualityAttributeProperty(src.getValue()));
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
        return factory.createFloodingRiskAttribute(marshalWaterBodyFloodingRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
