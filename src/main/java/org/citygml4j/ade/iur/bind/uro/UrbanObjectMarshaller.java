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
                    .with(BuildingRiverFloodingRiskAttribute.class, this::createBuildingRiverFloodingRiskAttribute)
                    .with(BuildingTsunamiRiskAttribute.class, this::createBuildingTsunamiRiskAttribute)
                    .with(BuildingInlandFloodingRiskAttribute.class, this::createBuildingInlandFloodingRiskAttribute)
                    .with(BuildingHighTideRiskAttribute.class, this::createBuildingHighTideRiskAttribute)
                    .with(BuildingLandSlideRiskAttribute.class, this::createBuildingLandSlideRiskAttribute)
                    .with(BuildingDisasterRiskAttributePropertyElement.class, this::createBuildingDisasterRiskAttributePropertyElement)
                    .with(KeyValuePairAttribute.class, this::createKeyValuePairAttribute)
                    .with(KeyValuePairAttributePropertyElement.class, this::createKeyValuePairAttributePropertyElement)
                    .with(BuildingDataQualityAttribute.class, this::createBuildingDataQualityAttribute)
                    .with(BuildingDataQualityAttributePropertyElement.class, this::createBuildingDataQualityAttributePropertyElement)
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
                    .with(BuildingDataQualityAttributeProperty.class, this::marshalBuildingDataQualityAttributeProperty);
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

    @SuppressWarnings("unchecked")
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

        if (src.isSetCodeValue())
            dest.setCodeValue(helper.getGMLMarshaller().marshalCode(src.getCodeValue()));
        else if (src.isSetStringValue())
            dest.setStringValue(src.getStringValue());
        else if (src.isSetIntValue())
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));
        else if (src.isSetDoubleValue())
            dest.setDoubleValue(src.getDoubleValue());
        else if (src.isSetMeasuredValue())
            dest.setMeasuredValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasuredValue()));
        else if (src.isSetDateValue())
            dest.setDateValue(marshaller.toCalendar(src.getDateValue()));
        else if (src.isSetUriValue())
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

    private JAXBElement<?> createBuildingDisasterRiskAttributePropertyElement(BuildingDisasterRiskAttributePropertyElement src) {
        return factory.createBuildingDisasterRiskAttributeProperty(marshalBuildingDisasterRiskAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createKeyValuePairAttribute(KeyValuePairAttribute src) {
        return factory.createKeyValuePairAttribute(marshalKeyValuePairAttribute(src));
    }

    private JAXBElement<?> createKeyValuePairAttributePropertyElement(KeyValuePairAttributePropertyElement src) {
        return factory.createKeyValuePairAttributeProperty(marshalKeyValuePairAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createBuildingDataQualityAttribute(BuildingDataQualityAttribute src) {
        return factory.createBuildingDataQualityAttribute(marshalBuildingDataQualityAttribute(src));
    }

    private JAXBElement<?> createBuildingDataQualityAttributePropertyElement(BuildingDataQualityAttributePropertyElement src) {
        return factory.createBuildingDataQualityAttributeProperty(marshalBuildingDataQualityAttributeProperty(src.getValue()));
    }

    private JAXBElement<?> createFiscalYearOfPublicationProperty(FiscalYearOfPublicationProperty src) {
        return factory.createFiscalYearOfPublication(marshaller.toCalendar(src.getValue()));
    }

    private JAXBElement<?> createLanguageProperty(LanguageProperty src) {
        return factory.createLanguage(helper.getGMLMarshaller().marshalCode(src.getValue()));
    }
}
