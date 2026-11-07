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

import javax.xml.bind.JAXBElement;
import java.math.BigInteger;

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
                    .with(BuildingIDAttributePropertyElement.class, this::createBuildingIDAttributePropertyElement)
                    .with(BuildingDetailAttribute.class, this::createBuildingDetailAttribute)
                    .with(BuildingDetailAttributePropertyElement.class, this::createBuildingDetailAttributePropertyElement)
                    .with(LargeCustomerFacilityAttribute.class, this::createLargeCustomerFacilityAttribute)
                    .with(LargeCustomerFacilityAttributePropertyElement.class, this::createLargeCustomerFacilityAttributePropertyElement)
                    .with(RealEstateIDAttribute.class, this::createRealEstateIDAttribute)
                    .with(BldgRealEstateIDAttributePropertyElement.class, this::createBldgRealEstateIDAttributePropertyElement)
                    .with(BuildingUsecaseAttribute.class, this::createBuildingUsecaseAttribute)
                    .with(BldgUsecaseAttributePropertyElement.class, this::createBldgUsecaseAttributePropertyElement)
                    .with(RiverFloodingRiskAttribute.class, this::createRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttribute.class, this::createTsunamiRiskAttribute)
                    .with(HighTideRiskAttribute.class, this::createHighTideRiskAttribute)
                    .with(InlandFloodingRiskAttribute.class, this::createInlandFloodingRiskAttribute)
                    .with(ReservoirFloodingRiskAttribute.class, this::createReservoirFloodingRiskAttribute)
                    .with(LandSlideRiskAttribute.class, this::createLandSlideRiskAttribute)
                    .with(BldgDisasterRiskAttributePropertyElement.class, this::createBldgDisasterRiskAttributePropertyElement)
                    .with(KeyValuePairAttribute.class, this::createKeyValuePairAttribute)
                    .with(BldgKeyValuePairAttributePropertyElement.class, this::createBldgKeyValuePairAttributePropertyElement)
                    .with(DataQualityAttribute.class, this::createDataQualityAttribute)
                    .with(BldgDataQualityAttributePropertyElement.class, this::createBldgDataQualityAttributePropertyElement)
                    .with(PublicSurveyDataQualityAttribute.class, this::createPublicSurveyDataQualityAttribute)
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
                    .with(RealEstateIDAttribute.class, this::marshalRealEstateIDAttribute)
                    .with(RealEstateIDAttributeProperty.class, this::marshalRealEstateIDAttributeProperty)
                    .with(BuildingUsecaseAttribute.class, this::marshalBuildingUsecaseAttribute)
                    .with(BuildingUsecaseAttributeProperty.class, this::marshalBuildingUsecaseAttributeProperty)
                    .with(RiverFloodingRiskAttribute.class, this::marshalRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttribute.class, this::marshalTsunamiRiskAttribute)
                    .with(HighTideRiskAttribute.class, this::marshalHighTideRiskAttribute)
                    .with(InlandFloodingRiskAttribute.class, this::marshalInlandFloodingRiskAttribute)
                    .with(ReservoirFloodingRiskAttribute.class, this::marshalReservoirFloodingRiskAttribute)
                    .with(LandSlideRiskAttribute.class, this::marshalLandSlideRiskAttribute)
                    .with(DisasterRiskAttributeProperty.class, this::marshalDisasterRiskAttributeProperty)
                    .with(KeyValuePairAttribute.class, this::marshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributeProperty.class, this::marshalKeyValuePairAttributeProperty)
                    .with(DataQualityAttribute.class, this::marshalDataQualityAttribute)
                    .with(DataQualityAttributeProperty.class, this::marshalDataQualityAttributeProperty)
                    .with(PublicSurveyDataQualityAttribute.class, this::marshalPublicSurveyDataQualityAttribute)
                    .with(PublicSurveyDataQualityAttributeProperty.class, this::marshalPublicSurveyDataQualityAttributeProperty);
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

    private HighTideRiskAttributeType marshalHighTideRiskAttribute(HighTideRiskAttribute src) {
        HighTideRiskAttributeType dest = factory.createHighTideRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private InlandFloodingRiskAttributeType marshalInlandFloodingRiskAttribute(InlandFloodingRiskAttribute src) {
        InlandFloodingRiskAttributeType dest = factory.createInlandFloodingRiskAttributeType();
        marshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private ReservoirFloodingRiskAttributeType marshalReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttribute src) {
        ReservoirFloodingRiskAttributeType dest = factory.createReservoirFloodingRiskAttributeType();
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

    @SuppressWarnings("unchecked")
    private DisasterRiskAttributePropertyType marshalDisasterRiskAttributeProperty(DisasterRiskAttributeProperty src) {
        DisasterRiskAttributePropertyType dest = factory.createDisasterRiskAttributePropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof DisasterRiskAttributeType)
                dest.setDisasterRiskAttribute((JAXBElement<? extends DisasterRiskAttributeType>) elem);
        }

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

    private JAXBElement<?> createBuildingIDAttribute(BuildingIDAttribute src) {
        return factory.createBuildingIDAttribute(marshalBuildingIDAttribute(src));
    }

    private JAXBElement<?> createBuildingIDAttributePropertyElement(BuildingIDAttributePropertyElement src) {
        return factory.createBuildingIDAttributeProperty(marshalBuildingIDAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingDetailAttribute(BuildingDetailAttribute src) {
        return factory.createBuildingDetailAttribute(marshalBuildingDetailAttribute(src));
    }

    private JAXBElement<?> createBuildingDetailAttributePropertyElement(BuildingDetailAttributePropertyElement src) {
        return factory.createBuildingDetailAttributeProperty(marshalBuildingDetailAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createLargeCustomerFacilityAttribute(LargeCustomerFacilityAttribute src) {
        return factory.createLargeCustomerFacilityAttribute(marshalLargeCustomerFacilityAttribute(src));
    }

    private JAXBElement<?> createLargeCustomerFacilityAttributePropertyElement(LargeCustomerFacilityAttributePropertyElement src) {
        return factory.createLargeCustomerFacilityAttributeProperty(marshalLargeCustomerFacilityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRealEstateIDAttribute(RealEstateIDAttribute src) {
        return factory.createRealEstateIDAttribute(marshalRealEstateIDAttribute(src));
    }

    private JAXBElement<?> createBldgRealEstateIDAttributePropertyElement(BldgRealEstateIDAttributePropertyElement src) {
        return factory.createBldgRealEstateIDAttribute(marshalRealEstateIDAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingUsecaseAttribute(BuildingUsecaseAttribute src) {
        return factory.createBuildingUsecaseAttribute(marshalBuildingUsecaseAttribute(src));
    }

    private JAXBElement<?> createBldgUsecaseAttributePropertyElement(BldgUsecaseAttributePropertyElement src) {
        return factory.createBldgUsecaseAttribute(marshalBuildingUsecaseAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createRiverFloodingRiskAttribute(RiverFloodingRiskAttribute src) {
        return factory.createRiverFloodingRiskAttribute(marshalRiverFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createTsunamiRiskAttribute(TsunamiRiskAttribute src) {
        return factory.createTsunamiRiskAttribute(marshalTsunamiRiskAttribute(src));
    }

    private JAXBElement<?> createHighTideRiskAttribute(HighTideRiskAttribute src) {
        return factory.createHighTideRiskAttribute(marshalHighTideRiskAttribute(src));
    }

    private JAXBElement<?> createInlandFloodingRiskAttribute(InlandFloodingRiskAttribute src) {
        return factory.createInlandFloodingRiskAttribute(marshalInlandFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttribute src) {
        return factory.createReservoirFloodingRiskAttribute(marshalReservoirFloodingRiskAttribute(src));
    }

    private JAXBElement<?> createLandSlideRiskAttribute(LandSlideRiskAttribute src) {
        return factory.createLandSlideRiskAttribute(marshalLandSlideRiskAttribute(src));
    }

    private JAXBElement<?> createBldgDisasterRiskAttributePropertyElement(BldgDisasterRiskAttributePropertyElement src) {
        return factory.createBldgDisasterRiskAttribute(marshalDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createKeyValuePairAttribute(KeyValuePairAttribute src) {
        return factory.createKeyValuePairAttribute(marshalKeyValuePairAttribute(src));
    }

    private JAXBElement<?> createBldgKeyValuePairAttributePropertyElement(BldgKeyValuePairAttributePropertyElement src) {
        return factory.createBldgKeyValuePairAttribute(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createDataQualityAttribute(DataQualityAttribute src) {
        return factory.createDataQualityAttribute(marshalDataQualityAttribute(src));
    }

    private JAXBElement<?> createBldgDataQualityAttributePropertyElement(BldgDataQualityAttributePropertyElement src) {
        return factory.createBldgDataQualityAttribute(marshalDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttribute src) {
        return factory.createPublicSurveyDataQualityAttribute(marshalPublicSurveyDataQualityAttribute(src));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
