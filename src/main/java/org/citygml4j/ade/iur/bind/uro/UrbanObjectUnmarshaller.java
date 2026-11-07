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
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class UrbanObjectUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(BuildingIDAttributeType.class, this::unmarshalBuildingIDAttribute)
                    .with(BuildingIDAttributePropertyType.class, this::unmarshalBuildingIDAttributeProperty)
                    .with(BuildingDetailAttributeType.class, this::unmarshalBuildingDetailAttribute)
                    .with(BuildingDetailAttributePropertyType.class, this::unmarshalBuildingDetailAttributeProperty)
                    .with(LargeCustomerFacilityAttributeType.class, this::unmarshalLargeCustomerFacilityAttribute)
                    .with(LargeCustomerFacilityAttributePropertyType.class, this::unmarshalLargeCustomerFacilityAttributeProperty)
                    .with(BuildingRiverFloodingRiskAttributeType.class, this::unmarshalBuildingRiverFloodingRiskAttribute)
                    .with(BuildingTsunamiRiskAttributeType.class, this::unmarshalBuildingTsunamiRiskAttribute)
                    .with(BuildingInlandFloodingRiskAttributeType.class, this::unmarshalBuildingInlandFloodingRiskAttribute)
                    .with(BuildingHighTideRiskAttributeType.class, this::unmarshalBuildingHighTideRiskAttribute)
                    .with(BuildingLandSlideRiskAttributeType.class, this::unmarshalBuildingLandSlideRiskAttribute)
                    .with(BuildingDisasterRiskAttributePropertyType.class, this::unmarshalBuildingDisasterRiskAttributeProperty)
                    .with(KeyValuePairAttributeType.class, this::unmarshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributePropertyType.class, this::unmarshalKeyValuePairAttributeProperty)
                    .with(BuildingDataQualityAttributeType.class, this::unmarshalBuildingDataQualityAttribute)
                    .with(BuildingDataQualityAttributePropertyType.class, this::unmarshalBuildingDataQualityAttributeProperty)
                    .with(LandUseDetailAttributeType.class, this::unmarshalLandUseDetailAttribute)
                    .with(LandUseDetailAttributePropertyType.class, this::unmarshalLandUseDetailAttributeProperty)
                    .with(TrafficVolumeAttributeType.class, this::unmarshalTrafficVolumeAttribute)
                    .with(TrafficVolumeAttributePropertyType.class, this::unmarshalTrafficVolumeAttributeProperty)
                    .with(RoadStructureAttributeType.class, this::unmarshalRoadStructureAttribute)
                    .with(RoadStructureAttributePropertyType.class, this::unmarshalRoadStructureAttributeProperty)
                    .with(RoadDataQualityAttributeType.class, this::unmarshalRoadDataQualityAttribute)
                    .with(RoadDataQualityAttributePropertyType.class, this::unmarshalRoadDataQualityAttributeProperty)
                    .with(TrafficAreaStructureAttributeType.class, this::unmarshalTrafficAreaStructureAttribute)
                    .with(TrafficAreaStructureAttributePropertyType.class, this::unmarshalTrafficAreaStructureAttributeProperty)
                    .with(CityFurnitureDetailAttributeType.class, this::unmarshalCityFurnitureDetailAttribute)
                    .with(CityFurnitureDetailAttributePropertyType.class, this::unmarshalCityFurnitureDetailAttributeProperty)
                    .with(CityFurnitureDataQualityAttributeType.class, this::unmarshalCityFurnitureDataQualityAttribute)
                    .with(CityFurnitureDataQualityAttributePropertyType.class, this::unmarshalCityFurnitureDataQualityAttributeProperty)
                    .with(VegetationDataQualityAttributeType.class, this::unmarshalVegetationDataQualityAttribute)
                    .with(VegetationDataQualityAttributePropertyType.class, this::unmarshalVegetationDataQualityAttributeProperty)
                    .with(WaterBodyRiverFloodingRiskAttributeType.class, this::unmarshalWaterBodyRiverFloodingRiskAttribute)
                    .with(WaterBodyTsunamiRiskAttributeType.class, this::unmarshalWaterBodyTsunamiRiskAttribute)
                    .with(WaterBodyHighTideRiskAttributeType.class, this::unmarshalWaterBodyHighTideRiskAttribute)
                    .with(WaterBodyInlandFloodingRiskAttributeType.class, this::unmarshalWaterBodyInlandFloodingRiskAttribute)
                    .with(WaterBodyFloodingRiskAttributePropertyType.class, this::unmarshalWaterBodyFloodingRiskAttributeProperty);
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
            case "buildingIDAttribute":
                return new BuildingIDAttributePropertyElement(unmarshalBuildingIDAttributeProperty((BuildingIDAttributePropertyType) value));
            case "buildingDetailAttribute":
                return new BuildingDetailAttributePropertyElement(unmarshalBuildingDetailAttributeProperty((BuildingDetailAttributePropertyType) value));
            case "largeCustomerFacilityAttribute":
                return new LargeCustomerFacilityAttributePropertyElement(unmarshalLargeCustomerFacilityAttributeProperty((LargeCustomerFacilityAttributePropertyType) value));
            case "buildingDisasterRiskAttribute":
                return new BuildingDisasterRiskAttributePropertyElement(unmarshalBuildingDisasterRiskAttributeProperty((BuildingDisasterRiskAttributePropertyType) value));
            case "keyValuePairAttribute":
                return new KeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "buildingDataQualityAttribute":
                return new BuildingDataQualityAttributePropertyElement(unmarshalBuildingDataQualityAttributeProperty((BuildingDataQualityAttributePropertyType) value));
            case "landUseDetailAttribute":
                return new LandUseDetailAttributePropertyElement(unmarshalLandUseDetailAttributeProperty((LandUseDetailAttributePropertyType) value));
            case "trafficVolumeAttribute":
                return new TrafficVolumeAttributePropertyElement(unmarshalTrafficVolumeAttributeProperty((TrafficVolumeAttributePropertyType) value));
            case "roadStructureAttribute":
                return new RoadStructureAttributePropertyElement(unmarshalRoadStructureAttributeProperty((RoadStructureAttributePropertyType) value));
            case "roadDataQualityAttribute":
                return new RoadDataQualityAttributePropertyElement(unmarshalRoadDataQualityAttributeProperty((RoadDataQualityAttributePropertyType) value));
            case "trafficAreaStructureAttribute":
                return new TrafficAreaStructureAttributePropertyElement(unmarshalTrafficAreaStructureAttributeProperty((TrafficAreaStructureAttributePropertyType) value));
            case "cityFurnitureDetailAttribute":
                return new CityFurnitureDetailAttributePropertyElement(unmarshalCityFurnitureDetailAttributeProperty((CityFurnitureDetailAttributePropertyType) value));
            case "cityFurnitureDataQualityAttribute":
                return new CityFurnitureDataQualityAttributePropertyElement(unmarshalCityFurnitureDataQualityAttributeProperty((CityFurnitureDataQualityAttributePropertyType) value));
            case "vegetationDataQualityAttribute":
                return new VegetationDataQualityAttributePropertyElement(unmarshalVegetationDataQualityAttributeProperty((VegetationDataQualityAttributePropertyType) value));
            case "floodingRiskAttribute":
                return new FloodingRiskAttributePropertyElement(unmarshalWaterBodyFloodingRiskAttributeProperty((WaterBodyFloodingRiskAttributePropertyType) value));
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

    private void unmarshalBuildingDisasterRiskAttribute(BuildingDisasterRiskAttributeType src, BuildingDisasterRiskAttribute dest) throws MissingADESchemaException {
        if (src.isSetDescription())
            dest.setDescription(helper.getGMLUnmarshaller().unmarshalCode(src.getDescription()));
    }

    private void unmarshalBuildingFloodingRiskAttribute(BuildingFloodingRiskAttributeType src, BuildingFloodingRiskAttribute dest) throws MissingADESchemaException {
        unmarshalBuildingDisasterRiskAttribute(src, dest);

        if (src.isSetRank())
            dest.setRank(helper.getGMLUnmarshaller().unmarshalCode(src.getRank()));

        if (src.isSetRankOrg())
            dest.setRankOrg(helper.getGMLUnmarshaller().unmarshalCode(src.getRankOrg()));

        if (src.isSetDepth())
            dest.setDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getDepth()));
    }

    private BuildingRiverFloodingRiskAttribute unmarshalBuildingRiverFloodingRiskAttribute(BuildingRiverFloodingRiskAttributeType src) throws MissingADESchemaException {
        BuildingRiverFloodingRiskAttribute dest = new BuildingRiverFloodingRiskAttribute();
        unmarshalBuildingFloodingRiskAttribute(src, dest);

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        if (src.isSetScale())
            dest.setScale(helper.getGMLUnmarshaller().unmarshalCode(src.getScale()));

        if (src.isSetDuration())
            dest.setDuration(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDuration()));

        return dest;
    }

    private BuildingTsunamiRiskAttribute unmarshalBuildingTsunamiRiskAttribute(BuildingTsunamiRiskAttributeType src) throws MissingADESchemaException {
        BuildingTsunamiRiskAttribute dest = new BuildingTsunamiRiskAttribute();
        unmarshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingInlandFloodingRiskAttribute unmarshalBuildingInlandFloodingRiskAttribute(BuildingInlandFloodingRiskAttributeType src) throws MissingADESchemaException {
        BuildingInlandFloodingRiskAttribute dest = new BuildingInlandFloodingRiskAttribute();
        unmarshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingHighTideRiskAttribute unmarshalBuildingHighTideRiskAttribute(BuildingHighTideRiskAttributeType src) throws MissingADESchemaException {
        BuildingHighTideRiskAttribute dest = new BuildingHighTideRiskAttribute();
        unmarshalBuildingFloodingRiskAttribute(src, dest);
        return dest;
    }

    private BuildingLandSlideRiskAttribute unmarshalBuildingLandSlideRiskAttribute(BuildingLandSlideRiskAttributeType src) throws MissingADESchemaException {
        BuildingLandSlideRiskAttribute dest = new BuildingLandSlideRiskAttribute();
        unmarshalBuildingDisasterRiskAttribute(src, dest);

        if (src.isSetAreaType())
            dest.setAreaType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaType()));

        return dest;
    }

    private BuildingDisasterRiskAttributeProperty unmarshalBuildingDisasterRiskAttributeProperty(BuildingDisasterRiskAttributePropertyType src) throws MissingADESchemaException {
        BuildingDisasterRiskAttributeProperty dest = new BuildingDisasterRiskAttributeProperty();

        if (src.isSetBuildingDisasterRiskAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getBuildingDisasterRiskAttribute());
            if (object instanceof BuildingDisasterRiskAttribute)
                dest.setObject((BuildingDisasterRiskAttribute) object);
        }

        return dest;
    }

    private KeyValuePairAttribute unmarshalKeyValuePairAttribute(KeyValuePairAttributeType src) throws MissingADESchemaException {
        KeyValuePairAttribute dest = new KeyValuePairAttribute();

        if (src.isSetKey())
            dest.setKey(helper.getGMLUnmarshaller().unmarshalCode(src.getKey()));

        if (src.isSetCodeValue())
            dest.setCodeValue(helper.getGMLUnmarshaller().unmarshalCode(src.getCodeValue()));

        dest.setStringValue(src.getStringValue());

        if (src.isSetIntValue())
            dest.setIntValue(src.getIntValue().intValue());

        dest.setDoubleValue(src.getDoubleValue());

        if (src.isSetMeasuredValue())
            dest.setMeasuredValue(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMeasuredValue()));

        if (src.isSetDateValue())
            dest.setDateValue(src.getDateValue().toGregorianCalendar().toZonedDateTime().toLocalDate());

        dest.setUriValue(src.getUriValue());

        return dest;
    }

    private KeyValuePairAttributeProperty unmarshalKeyValuePairAttributeProperty(KeyValuePairAttributePropertyType src) throws MissingADESchemaException {
        KeyValuePairAttributeProperty dest = new KeyValuePairAttributeProperty();

        if (src.isSetKeyValuePairAttribute())
            dest.setObject(unmarshalKeyValuePairAttribute(src.getKeyValuePairAttribute()));

        return dest;
    }

    private BuildingDataQualityAttribute unmarshalBuildingDataQualityAttribute(BuildingDataQualityAttributeType src) throws MissingADESchemaException {
        BuildingDataQualityAttribute dest = new BuildingDataQualityAttribute();

        if (src.isSetSrcScale()) {
            for (CodeType srcScale : src.getSrcScale())
                dest.getSrcScale().add(helper.getGMLUnmarshaller().unmarshalCode(srcScale));
        }

        if (src.isSetGeometrySrcDesc()) {
            for (CodeType geometrySrcDesc : src.getGeometrySrcDesc())
                dest.getGeometrySrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDesc));
        }

        if (src.isSetThematicSrcDesc()) {
            for (CodeType thematicSrcDesc : src.getThematicSrcDesc())
                dest.getThematicSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(thematicSrcDesc));
        }

        if (src.isSetAppearanceSrcDesc()) {
            for (CodeType appearanceSrcDesc : src.getAppearanceSrcDesc())
                dest.getAppearanceSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDesc));
        }

        if (src.isSetLod1HeightType())
            dest.setLod1HeightType(helper.getGMLUnmarshaller().unmarshalCode(src.getLod1HeightType()));

        if (src.isSetLodType()) {
            for (String lodType : src.getLodType())
                dest.getLodType().add(lodType);
        }

        return dest;
    }

    private BuildingDataQualityAttributeProperty unmarshalBuildingDataQualityAttributeProperty(BuildingDataQualityAttributePropertyType src) throws MissingADESchemaException {
        BuildingDataQualityAttributeProperty dest = new BuildingDataQualityAttributeProperty();

        if (src.isSetBuildingDataQualityAttribute())
            dest.setObject(unmarshalBuildingDataQualityAttribute(src.getBuildingDataQualityAttribute()));

        return dest;
    }

    private LandUseDetailAttribute unmarshalLandUseDetailAttribute(LandUseDetailAttributeType src) throws MissingADESchemaException {
        LandUseDetailAttribute dest = new LandUseDetailAttribute();

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

    private TrafficVolumeAttribute unmarshalTrafficVolumeAttribute(TrafficVolumeAttributeType src) throws MissingADESchemaException {
        TrafficVolumeAttribute dest = new TrafficVolumeAttribute();

        dest.setSectionID(src.getSectionID());

        if (src.isSetWeekday12HourTrafficVolume())
            dest.setWeekday12hourTrafficVolume(src.getWeekday12HourTrafficVolume().intValue());

        if (src.isSetWeekday24HourTrafficVolume())
            dest.setWeekday24hourTrafficVolume(src.getWeekday24HourTrafficVolume().intValue());

        dest.setLargeVehicleRate(src.getLargeVehicleRate());
        dest.setCongestionRate(src.getCongestionRate());
        dest.setAverageTravelSpeedInCongestion(src.getAverageTravelSpeedInCongestion());
        dest.setAverageInboundTravelSpeedInCongestion(src.getAverageInboundTravelSpeedInCongestion());
        dest.setAverageOutboundTravelSpeedInCongestion(src.getAverageOutboundTravelSpeedInCongestion());
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

    private RoadDataQualityAttribute unmarshalRoadDataQualityAttribute(RoadDataQualityAttributeType src) throws MissingADESchemaException {
        RoadDataQualityAttribute dest = new RoadDataQualityAttribute();

        if (src.isSetSrcScale()) {
            for (CodeType srcScale : src.getSrcScale())
                dest.getSrcScale().add(helper.getGMLUnmarshaller().unmarshalCode(srcScale));
        }

        if (src.isSetGeometrySrcDesc()) {
            for (CodeType geometrySrcDesc : src.getGeometrySrcDesc())
                dest.getGeometrySrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDesc));
        }

        if (src.isSetThematicSrcDesc()) {
            for (CodeType thematicSrcDesc : src.getThematicSrcDesc())
                dest.getThematicSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(thematicSrcDesc));
        }

        if (src.isSetAppearanceSrcDesc()) {
            for (CodeType appearanceSrcDesc : src.getAppearanceSrcDesc())
                dest.getAppearanceSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDesc));
        }

        dest.setLodType(src.getLodType());

        return dest;
    }

    private RoadDataQualityAttributeProperty unmarshalRoadDataQualityAttributeProperty(RoadDataQualityAttributePropertyType src) throws MissingADESchemaException {
        RoadDataQualityAttributeProperty dest = new RoadDataQualityAttributeProperty();

        if (src.isSetRoadDataQualityAttribute())
            dest.setObject(unmarshalRoadDataQualityAttribute(src.getRoadDataQualityAttribute()));

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

    private CityFurnitureDetailAttribute unmarshalCityFurnitureDetailAttribute(CityFurnitureDetailAttributeType src) throws MissingADESchemaException {
        CityFurnitureDetailAttribute dest = new CityFurnitureDetailAttribute();

        dest.setFacilityType(src.getFacilityType());
        dest.setDescription(src.getDescription());

        return dest;
    }

    private CityFurnitureDetailAttributeProperty unmarshalCityFurnitureDetailAttributeProperty(CityFurnitureDetailAttributePropertyType src) throws MissingADESchemaException {
        CityFurnitureDetailAttributeProperty dest = new CityFurnitureDetailAttributeProperty();

        if (src.isSetCityFurnitureDetailAttribute())
            dest.setObject(unmarshalCityFurnitureDetailAttribute(src.getCityFurnitureDetailAttribute()));

        return dest;
    }

    private CityFurnitureDataQualityAttribute unmarshalCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttributeType src) throws MissingADESchemaException {
        CityFurnitureDataQualityAttribute dest = new CityFurnitureDataQualityAttribute();

        if (src.isSetSrcScale()) {
            for (CodeType srcScale : src.getSrcScale())
                dest.getSrcScale().add(helper.getGMLUnmarshaller().unmarshalCode(srcScale));
        }

        if (src.isSetGeometrySrcDesc()) {
            for (CodeType geometrySrcDesc : src.getGeometrySrcDesc())
                dest.getGeometrySrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDesc));
        }

        if (src.isSetThematicSrcDesc()) {
            for (CodeType thematicSrcDesc : src.getThematicSrcDesc())
                dest.getThematicSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(thematicSrcDesc));
        }

        if (src.isSetAppearanceSrcDesc()) {
            for (CodeType appearanceSrcDesc : src.getAppearanceSrcDesc())
                dest.getAppearanceSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDesc));
        }

        if (src.isSetLodType()) {
            for (String lodType : src.getLodType())
                dest.getLodType().add(lodType);
        }

        return dest;
    }

    private CityFurnitureDataQualityAttributeProperty unmarshalCityFurnitureDataQualityAttributeProperty(CityFurnitureDataQualityAttributePropertyType src) throws MissingADESchemaException {
        CityFurnitureDataQualityAttributeProperty dest = new CityFurnitureDataQualityAttributeProperty();

        if (src.isSetCityFurnitureDataQualityAttribute())
            dest.setObject(unmarshalCityFurnitureDataQualityAttribute(src.getCityFurnitureDataQualityAttribute()));

        return dest;
    }

    private VegetationDataQualityAttribute unmarshalVegetationDataQualityAttribute(VegetationDataQualityAttributeType src) throws MissingADESchemaException {
        VegetationDataQualityAttribute dest = new VegetationDataQualityAttribute();

        if (src.isSetSrcScale()) {
            for (CodeType srcScale : src.getSrcScale())
                dest.getSrcScale().add(helper.getGMLUnmarshaller().unmarshalCode(srcScale));
        }

        if (src.isSetGeometrySrcDesc()) {
            for (CodeType geometrySrcDesc : src.getGeometrySrcDesc())
                dest.getGeometrySrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(geometrySrcDesc));
        }

        if (src.isSetThematicSrcDesc()) {
            for (CodeType thematicSrcDesc : src.getThematicSrcDesc())
                dest.getThematicSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(thematicSrcDesc));
        }

        if (src.isSetAppearanceSrcDesc()) {
            for (CodeType appearanceSrcDesc : src.getAppearanceSrcDesc())
                dest.getAppearanceSrcDesc().add(helper.getGMLUnmarshaller().unmarshalCode(appearanceSrcDesc));
        }

        return dest;
    }

    private VegetationDataQualityAttributeProperty unmarshalVegetationDataQualityAttributeProperty(VegetationDataQualityAttributePropertyType src) throws MissingADESchemaException {
        VegetationDataQualityAttributeProperty dest = new VegetationDataQualityAttributeProperty();

        if (src.isSetVegetationDataQualityAttribute())
            dest.setObject(unmarshalVegetationDataQualityAttribute(src.getVegetationDataQualityAttribute()));

        return dest;
    }

    private void unmarshalWaterBodyFloodingRiskAttribute(WaterBodyFloodingRiskAttributeType src, WaterBodyFloodingRiskAttribute dest) throws MissingADESchemaException {
        if (src.isSetDescription())
            dest.setDescription(helper.getGMLUnmarshaller().unmarshalCode(src.getDescription()));

        if (src.isSetRank())
            dest.setRank(helper.getGMLUnmarshaller().unmarshalCode(src.getRank()));

        if (src.isSetRankOrg())
            dest.setRankOrg(helper.getGMLUnmarshaller().unmarshalCode(src.getRankOrg()));

        if (src.isSetDepth())
            dest.setDepth(helper.getGMLUnmarshaller().unmarshalLength(src.getDepth()));
    }

    private WaterBodyRiverFloodingRiskAttribute unmarshalWaterBodyRiverFloodingRiskAttribute(WaterBodyRiverFloodingRiskAttributeType src) throws MissingADESchemaException {
        WaterBodyRiverFloodingRiskAttribute dest = new WaterBodyRiverFloodingRiskAttribute();
        unmarshalWaterBodyFloodingRiskAttribute(src, dest);

        if (src.isSetAdminType())
            dest.setAdminType(helper.getGMLUnmarshaller().unmarshalCode(src.getAdminType()));

        if (src.isSetScale())
            dest.setScale(helper.getGMLUnmarshaller().unmarshalCode(src.getScale()));

        if (src.isSetDuration())
            dest.setDuration(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDuration()));

        return dest;
    }

    private WaterBodyTsunamiRiskAttribute unmarshalWaterBodyTsunamiRiskAttribute(WaterBodyTsunamiRiskAttributeType src) throws MissingADESchemaException {
        WaterBodyTsunamiRiskAttribute dest = new WaterBodyTsunamiRiskAttribute();
        unmarshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyHighTideRiskAttribute unmarshalWaterBodyHighTideRiskAttribute(WaterBodyHighTideRiskAttributeType src) throws MissingADESchemaException {
        WaterBodyHighTideRiskAttribute dest = new WaterBodyHighTideRiskAttribute();
        unmarshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyInlandFloodingRiskAttribute unmarshalWaterBodyInlandFloodingRiskAttribute(WaterBodyInlandFloodingRiskAttributeType src) throws MissingADESchemaException {
        WaterBodyInlandFloodingRiskAttribute dest = new WaterBodyInlandFloodingRiskAttribute();
        unmarshalWaterBodyFloodingRiskAttribute(src, dest);
        return dest;
    }

    private WaterBodyFloodingRiskAttributeProperty unmarshalWaterBodyFloodingRiskAttributeProperty(WaterBodyFloodingRiskAttributePropertyType src) throws MissingADESchemaException {
        WaterBodyFloodingRiskAttributeProperty dest = new WaterBodyFloodingRiskAttributeProperty();

        if (src.isSetWaterBodyFloodingRiskAttribute()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getWaterBodyFloodingRiskAttribute());
            if (object instanceof WaterBodyFloodingRiskAttribute)
                dest.setObject((WaterBodyFloodingRiskAttribute) object);
        }

        return dest;
    }
}
