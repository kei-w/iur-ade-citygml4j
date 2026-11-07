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

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.Year;

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
                    .with(RealEstateIDAttributeType.class, this::unmarshalRealEstateIDAttribute)
                    .with(RealEstateIDAttributePropertyType.class, this::unmarshalRealEstateIDAttributeProperty)
                    .with(BuildingUsecaseAttributeType.class, this::unmarshalBuildingUsecaseAttribute)
                    .with(BuildingUsecaseAttributePropertyType.class, this::unmarshalBuildingUsecaseAttributeProperty)
                    .with(RiverFloodingRiskAttributeType.class, this::unmarshalRiverFloodingRiskAttribute)
                    .with(TsunamiRiskAttributeType.class, this::unmarshalTsunamiRiskAttribute)
                    .with(HighTideRiskAttributeType.class, this::unmarshalHighTideRiskAttribute)
                    .with(InlandFloodingRiskAttributeType.class, this::unmarshalInlandFloodingRiskAttribute)
                    .with(ReservoirFloodingRiskAttributeType.class, this::unmarshalReservoirFloodingRiskAttribute)
                    .with(LandSlideRiskAttributeType.class, this::unmarshalLandSlideRiskAttribute)
                    .with(DisasterRiskAttributePropertyType.class, this::unmarshalDisasterRiskAttributeProperty)
                    .with(KeyValuePairAttributeType.class, this::unmarshalKeyValuePairAttribute)
                    .with(KeyValuePairAttributePropertyType.class, this::unmarshalKeyValuePairAttributeProperty)
                    .with(DataQualityAttributeType.class, this::unmarshalDataQualityAttribute)
                    .with(DataQualityAttributePropertyType.class, this::unmarshalDataQualityAttributeProperty)
                    .with(PublicSurveyDataQualityAttributeType.class, this::unmarshalPublicSurveyDataQualityAttribute)
                    .with(PublicSurveyDataQualityAttributePropertyType.class, this::unmarshalPublicSurveyDataQualityAttributeProperty);
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
            case "bldgDisasterRiskAttribute":
                return new BldgDisasterRiskAttributePropertyElement(unmarshalDisasterRiskAttributeProperty((DisasterRiskAttributePropertyType) value));
            case "bldgKeyValuePairAttribute":
                return new BldgKeyValuePairAttributePropertyElement(unmarshalKeyValuePairAttributeProperty((KeyValuePairAttributePropertyType) value));
            case "bldgDataQualityAttribute":
                return new BldgDataQualityAttributePropertyElement(unmarshalDataQualityAttributeProperty((DataQualityAttributePropertyType) value));
            case "bldgRealEstateIDAttribute":
                return new BldgRealEstateIDAttributePropertyElement(unmarshalRealEstateIDAttributeProperty((RealEstateIDAttributePropertyType) value));
            case "bldgUsecaseAttribute":
                return new BldgUsecaseAttributePropertyElement(unmarshalBuildingUsecaseAttributeProperty((BuildingUsecaseAttributePropertyType) value));
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

        if (src.isSetRealEstateIDOfBuildingUnitOwnership())
            dest.getRealEstateIDOfBuildingUnitOwnership().addAll(src.getRealEstateIDOfBuildingUnitOwnership());

        if (src.isSetNumberOfRealEstateIDOfLand())
            dest.setNumberOfRealEstateIDOfLand(src.getNumberOfRealEstateIDOfLand().intValue());

        if (src.isSetRealEstateIDOfLand())
            dest.getRealEstateIDOfLand().addAll(src.getRealEstateIDOfLand());

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

    private HighTideRiskAttribute unmarshalHighTideRiskAttribute(HighTideRiskAttributeType src) throws MissingADESchemaException {
        HighTideRiskAttribute dest = new HighTideRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private InlandFloodingRiskAttribute unmarshalInlandFloodingRiskAttribute(InlandFloodingRiskAttributeType src) throws MissingADESchemaException {
        InlandFloodingRiskAttribute dest = new InlandFloodingRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
        return dest;
    }

    private ReservoirFloodingRiskAttribute unmarshalReservoirFloodingRiskAttribute(ReservoirFloodingRiskAttributeType src) throws MissingADESchemaException {
        ReservoirFloodingRiskAttribute dest = new ReservoirFloodingRiskAttribute();
        unmarshalFloodingRiskAttribute(src, dest);
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
}
