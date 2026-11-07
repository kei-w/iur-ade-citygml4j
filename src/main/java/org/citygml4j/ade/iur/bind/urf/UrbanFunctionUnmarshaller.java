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

package org.citygml4j.ade.iur.bind.urf;

import jp.geospatial.iur._2_0.urf.*;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import org.citygml4j.ade.iur.model.urf.*;
import org.citygml4j.ade.iur.model.urf.ThreeDimensionalExtent;
import org.citygml4j.builder.jaxb.unmarshal.citygml.ade.ADEUnmarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.ade.binding.ADEUnmarshaller;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.util.mapper.CheckedTypeMapper;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

import java.time.LocalDate;
import java.time.Year;
import javax.xml.bind.JAXBElement;

public class UrbanFunctionUnmarshaller implements ADEUnmarshaller {
    private ADEUnmarshallerHelper helper;
    private CheckedTypeMapper<ADEModelObject> typeMapper;

    private synchronized CheckedTypeMapper<ADEModelObject> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = CheckedTypeMapper.<ADEModelObject>create()
                    .with(UrbanPlanningAreaType.class, this::unmarshalUrbanPlanningArea)
                    .with(QuasiUrbanPlanningAreaType.class, this::unmarshalQuasiUrbanPlanningArea)
                    .with(AreaClassificationType.class, this::unmarshalAreaClassification)
                    .with(DistrictsAndZonesType.class, this::unmarshalDistrictsAndZones)
                    .with(UseDistrictType.class, this::unmarshalUseDistrict)
                    .with(SpecialUseDistrictType.class, this::unmarshalSpecialUseDistrict)
                    .with(SpecialUseRestrictionDistrictType.class, this::unmarshalSpecialUseRestrictionDistrict)
                    .with(ExceptionalFloorAreaRateDistrictType.class, this::unmarshalExceptionalFloorAreaRateDistrict)
                    .with(HighRiseResidentialAttractionDistrictType.class, this::unmarshalHighRiseResidentialAttractionDistrict)
                    .with(HeightControlDistrictType.class, this::unmarshalHeightControlDistrict)
                    .with(HighLevelUseDistrictType.class, this::unmarshalHighLevelUseDistrict)
                    .with(SpecifiedBlockType.class, this::unmarshalSpecifiedBlock)
                    .with(SpecialUrbanRenaissanceDistrictType.class, this::unmarshalSpecialUrbanRenaissanceDistrict)
                    .with(SpecialUrbanRenaissanceDistrictPropertyType.class, this::unmarshalSpecialUrbanRenaissanceDistrictProperty)
                    .with(HousingControlAreaType.class, this::unmarshalHousingControlArea)
                    .with(ResidentialEnvironmentImprovementDistrictType.class, this::unmarshalResidentialEnvironmentImprovementDistrict)
                    .with(SpecialUseAttractionDistrictType.class, this::unmarshalSpecialUseAttractionDistrict)
                    .with(FirePreventionDistrictType.class, this::unmarshalFirePreventionDistrict)
                    .with(SpecifiedDisasterPreventionBlockImprovementZoneType.class, this::unmarshalSpecifiedDisasterPreventionBlockImprovementZone)
                    .with(LandscapeZoneType.class, this::unmarshalLandscapeZone)
                    .with(ScenicDistrictType.class, this::unmarshalScenicDistrict)
                    .with(ParkingPlaceDevelopmentZoneType.class, this::unmarshalParkingPlaceDevelopmentZone)
                    .with(PortZoneType.class, this::unmarshalPortZone)
                    .with(SpecialZoneForPreservationOfHistoricalLandscapeType.class, this::unmarshalSpecialZoneForPreservationOfHistoricalLandscape)
                    .with(ZoneForPreservationOfHistoricalLandscapeType.class, this::unmarshalZoneForPreservationOfHistoricalLandscape)
                    .with(GreenSpaceConservationDistrictType.class, this::unmarshalGreenSpaceConservationDistrict)
                    .with(SpecialGreenSpaceConservationDistrictType.class, this::unmarshalSpecialGreenSpaceConservationDistrict)
                    .with(TreePlantingDistrictType.class, this::unmarshalTreePlantingDistrict)
                    .with(DistributionBusinessZoneType.class, this::unmarshalDistributionBusinessZone)
                    .with(ProductiveGreenZoneType.class, this::unmarshalProductiveGreenZone)
                    .with(ConservationZoneForClustersOfTraditionalStructuresType.class, this::unmarshalConservationZoneForClustersOfTraditionalStructures)
                    .with(AircraftNoiseControlZoneType.class, this::unmarshalAircraftNoiseControlZone)
                    .with(ProjectPromotionAreaType.class, this::unmarshalProjectPromotionArea)
                    .with(UrbanRedevelopmentPromotionAreaType.class, this::unmarshalUrbanRedevelopmentPromotionArea)
                    .with(LandReadjustmentPromotionAreaType.class, this::unmarshalLandReadjustmentPromotionArea)
                    .with(ResidentialBlockConstructionPromotionAreaType.class, this::unmarshalResidentialBlockConstructionPromotionArea)
                    .with(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType.class, this::unmarshalLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment)
                    .with(UnusedLandUsePromotionAreaType.class, this::unmarshalUnusedLandUsePromotionArea)
                    .with(UrbanDisasterRecoveryPromotionAreaType.class, this::unmarshalUrbanDisasterRecoveryPromotionArea)
                    .with(UrbanDevelopmentProjectType.class, this::unmarshalUrbanDevelopmentProject)
                    .with(LandReadjustmentProjectType.class, this::unmarshalLandReadjustmentProject)
                    .with(NewHousingAndUrbanDevelopmentProjectType.class, this::unmarshalNewHousingAndUrbanDevelopmentProject)
                    .with(IndustrialParkDevelopmentProjectType.class, this::unmarshalIndustrialParkDevelopmentProject)
                    .with(UrbanRedevelopmentProjectType.class, this::unmarshalUrbanRedevelopmentProject)
                    .with(NewUrbanInfrastructureProjectType.class, this::unmarshalNewUrbanInfrastructureProject)
                    .with(ResidentialBlockConstructionProjectType.class, this::unmarshalResidentialBlockConstructionProject)
                    .with(DisasterPreventionBlockImprovementProjectType.class, this::unmarshalDisasterPreventionBlockImprovementProject)
                    .with(UrbanRenewalProjectType.class, this::unmarshalUrbanRenewalProject)
                    .with(ScheduledAreaForUrbanDevelopmentProjectType.class, this::unmarshalScheduledAreaForUrbanDevelopmentProject)
                    .with(ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType.class, this::unmarshalScheduledAreaForNewHousingAndUrbanDevelopmentProjects)
                    .with(ScheduledAreaForIndustrialParkDevelopmentProjectsType.class, this::unmarshalScheduledAreaForIndustrialParkDevelopmentProjects)
                    .with(ScheduledAreaForNewUrbanInfrastructureProjectsType.class, this::unmarshalScheduledAreaForNewUrbanInfrastructureProjects)
                    .with(ScheduledAreaForCollectiveHousingFacilitiesType.class, this::unmarshalScheduledAreaForCollectiveHousingFacilities)
                    .with(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType.class, this::unmarshalScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(ScheduledAreaForDistributionBusinessParkType.class, this::unmarshalScheduledAreaForDistributionBusinessPark)
                    .with(UrbanFacilityType.class, this::unmarshalUrbanFacility)
                    .with(TrafficFacilityType.class, this::unmarshalTrafficFacility)
                    .with(UrbanRoadAttributeType.class, this::unmarshalUrbanRoadAttribute)
                    .with(UrbanRoadAttributePropertyType.class, this::unmarshalUrbanRoadAttributeProperty)
                    .with(StructureDetailsType.class, this::unmarshalStructureDetails)
                    .with(StructureDetailsPropertyType.class, this::unmarshalStructureDetailsProperty)
                    .with(UrbanRapidTransitRailroadAttributeType.class, this::unmarshalUrbanRapidTransitRailroadAttribute)
                    .with(UrbanRapidTransitRailroadAttributePropertyType.class, this::unmarshalUrbanRapidTransitRailroadAttributeProperty)
                    .with(ParkingPlaceAttributeType.class, this::unmarshalParkingPlaceAttribute)
                    .with(ParkingPlaceAttributePropertyType.class, this::unmarshalParkingPlaceAttributeProperty)
                    .with(VehicleTerminalAttributeType.class, this::unmarshalVehicleTerminalAttribute)
                    .with(VehicleTerminalAttributePropertyType.class, this::unmarshalVehicleTerminalAttributeProperty)
                    .with(OpenSpaceForPublicUseType.class, this::unmarshalOpenSpaceForPublicUse)
                    .with(ParkAttributeType.class, this::unmarshalParkAttribute)
                    .with(ParkAttributePropertyType.class, this::unmarshalParkAttributeProperty)
                    .with(SupplyFacilityType.class, this::unmarshalSupplyFacility)
                    .with(WaterWorksAttributeType.class, this::unmarshalWaterWorksAttribute)
                    .with(WaterWorksAttributePropertyType.class, this::unmarshalWaterWorksAttributeProperty)
                    .with(TreatmentFacilityType.class, this::unmarshalTreatmentFacility)
                    .with(SewerSystemAttributeType.class, this::unmarshalSewerSystemAttribute)
                    .with(SewerSystemAttributePropertyType.class, this::unmarshalSewerSystemAttributeProperty)
                    .with(WaterwayType.class, this::unmarshalWaterway)
                    .with(EducationalAndCulturalFacilityType.class, this::unmarshalEducationalAndCulturalFacility)
                    .with(MedicalFacilityType.class, this::unmarshalMedicalFacility)
                    .with(SocialWelfareFacilityType.class, this::unmarshalSocialWelfareFacility)
                    .with(MarketsSlaughterhousesCrematoriaType.class, this::unmarshalMarketsSlaughterhousesCrematoria)
                    .with(CollectiveHousingFacilitiesType.class, this::unmarshalCollectiveHousingFacilities)
                    .with(CollectiveGovernmentAndPublicOfficeFacilitiesType.class, this::unmarshalCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(CollectiveUrbanDisasterPreventionFacilitiesType.class, this::unmarshalCollectiveUrbanDisasterPreventionFacilities)
                    .with(DistributionBusinessParkType.class, this::unmarshalDistributionBusinessPark)
                    .with(UrbanFacilityStipulatedByCabinetOrderType.class, this::unmarshalUrbanFacilityStipulatedByCabinetOrder)
                    .with(TelecommunicationFacilityType.class, this::unmarshalTelecommunicationFacility)
                    .with(WindProtectionFacilityType.class, this::unmarshalWindProtectionFacility)
                    .with(FireProtectionFacilityType.class, this::unmarshalFireProtectionFacility)
                    .with(FloodPreventionFacilityType.class, this::unmarshalFloodPreventionFacility)
                    .with(SnowProtectionFacilityType.class, this::unmarshalSnowProtectionFacility)
                    .with(SandControlFacilityType.class, this::unmarshalSandControlFacility)
                    .with(TideFacilityType.class, this::unmarshalTideFacility)
                    .with(CollectiveFacilitiesForTsunamiDisasterPreventionType.class, this::unmarshalCollectiveFacilitiesForTsunamiDisasterPrevention)
                    .with(CollectiveFacilitiesForReconstructionAndRevitalizationType.class, this::unmarshalCollectiveFacilitiesForReconstructionAndRevitalization)
                    .with(CollectiveFacilitiesForReconstructionType.class, this::unmarshalCollectiveFacilitiesForReconstruction)
                    .with(jp.geospatial.iur._2_0.urf.ThreeDimensionalExtent.class, this::unmarshalThreeDimensionalExtent)
                    .with(ThreeDimensionalExtentPropertyType.class, this::unmarshalThreeDimensionalExtentProperty)
                    .with(DistrictPlanType.class, this::unmarshalDistrictPlan)
                    .with(DisasterPreventionBlockImprovementZonePlanType.class, this::unmarshalDisasterPreventionBlockImprovementZonePlan)
                    .with(ZonalDisasterPreventionFacilityType.class, this::unmarshalZonalDisasterPreventionFacility)
                    .with(ZonalDisasterPreventionFacilityPropertyType.class, this::unmarshalZonalDisasterPreventionFacilityProperty)
                    .with(HistoricSceneryMaintenanceAndImprovementDistrictPlanType.class, this::unmarshalHistoricSceneryMaintenanceAndImprovementDistrictPlan)
                    .with(RoadsideDistrictPlanType.class, this::unmarshalRoadsideDistrictPlan)
                    .with(RuralDistrictPlanType.class, this::unmarshalRuralDistrictPlan)
                    .with(DistrictDevelopmentPlanType.class, this::unmarshalDistrictDevelopmentPlan)
                    .with(SpecifiedBuildingZoneImprovementPlanType.class, this::unmarshalSpecifiedBuildingZoneImprovementPlan)
                    .with(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType.class, this::unmarshalDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan)
                    .with(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType.class, this::unmarshalDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict)
                    .with(RoadsideDistrictImprovementPlanType.class, this::unmarshalRoadsideDistrictImprovementPlan)
                    .with(RuralDistrictImprovementPlanType.class, this::unmarshalRuralDistrictImprovementPlan)
                    .with(DistrictDevelopmentPlanPropertyType.class, this::unmarshalDistrictDevelopmentPlanProperty)
                    .with(DistrictFacilityType.class, this::unmarshalDistrictFacility)
                    .with(RoadsideDistrictFacilityType.class, this::unmarshalRoadsideDistrictFacility)
                    .with(RuralDistrictFacilityType.class, this::unmarshalRuralDistrictFacility)
                    .with(DistrictFacilityPropertyType.class, this::unmarshalDistrictFacilityProperty)
                    .with(DistrictType.class, this::unmarshalDistrict)
                    .with(DistrictPropertyType.class, this::unmarshalDistrictProperty)
                    .with(PromotionDistrictType.class, this::unmarshalPromotionDistrict)
                    .with(PromotionDistrictPropertyType.class, this::unmarshalPromotionDistrictProperty)
                    .with(UrgentUrbanRenewalAreaType.class, this::unmarshalUrgentUrbanRenewalArea)
                    .with(SpecifiedUrgentUrbanRenewalAreaType.class, this::unmarshalSpecifiedUrgentUrbanRenewalArea)
                    .with(SpecifiedUrgentUrbanRenewalAreaPropertyType.class, this::unmarshalSpecifiedUrgentUrbanRenewalAreaProperty)
                    .with(GlobalHubCityDevelopmentProjectType.class, this::unmarshalGlobalHubCityDevelopmentProject)
                    .with(GlobalHubCityDevelopmentProjectPropertyType.class, this::unmarshalGlobalHubCityDevelopmentProjectProperty)
                    .with(PrivateUrbanRenewalProjectPlanType.class, this::unmarshalPrivateUrbanRenewalProjectPlan)
                    .with(PrivateUrbanRenewalProjectPlanPropertyType.class, this::unmarshalPrivateUrbanRenewalProjectPlanProperty)
                    .with(AgreementType.class, this::unmarshalAgreement)
                    .with(RegulationType.class, this::unmarshalRegulation)
                    .with(DevelopmentProjectType.class, this::unmarshalDevelopmentProject)
                    .with(SedimentDisasterProneAreaType.class, this::unmarshalSedimentDisasterProneArea)
                    .with(BoundaryType.class, this::unmarshalBoundary)
                    .with(BoundaryPropertyType.class, this::unmarshalBoundaryProperty)
                    .with(AdministrationType.class, this::unmarshalAdministration)
                    .with(CensusBlockType.class, this::unmarshalCensusBlock)
                    .with(NumberOfHouseholdsType.class, this::unmarshalNumberOfHouseholds)
                    .with(NumberOfHouseholdsPropertyType.class, this::unmarshalNumberOfHouseholdsProperty)
                    .with(DisasterDamageType.class, this::unmarshalDisasterDamage)
                    .with(PollutionType.class, this::unmarshalPollution)
                    .with(DisasterPreventionBaseType.class, this::unmarshalDisasterPreventionBase)
                    .with(RecreationsType.class, this::unmarshalRecreations)
                    .with(HubCityType.class, this::unmarshalHubCity)
                    .with(LandUseDiversionType.class, this::unmarshalLandUseDiversion)
                    .with(UrbanizationType.class, this::unmarshalUrbanization)
                    .with(PublicTransitFacilityType.class, this::unmarshalPublicTransitFacility)
                    .with(TargetPropertyType.class, this::unmarshalTargetProperty);
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

        }

        // all other types
        return unmarshal(value);
    }

    @Override
    public ADEModelObject unmarshal(Object src) throws MissingADESchemaException {
        CheckedTypeMapper<ADEModelObject> typeMapper = getTypeMapper();
        return typeMapper != null ? typeMapper.apply(src) : null;
    }

    private void unmarshalUrbanFunction(UrbanFunctionType src, UrbanFunction dest) throws MissingADESchemaException {
        helper.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetFunction()) {
            for (CodeType function : src.getFunction())
                dest.getFunction().add(helper.getGMLUnmarshaller().unmarshalCode(function));
        }

        if (src.isSetUsage()) {
            for (CodeType usage : src.getUsage())
                dest.getUsage().add(helper.getGMLUnmarshaller().unmarshalCode(usage));
        }

        if (src.isSetValidFrom())
            dest.setValidFrom(src.getValidFrom().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetValidFromType())
            dest.setValidFromType(helper.getGMLUnmarshaller().unmarshalCode(src.getValidFromType()));

        if (src.isSetEnactmentFiscalYear()) {
            LocalDate date = src.getEnactmentFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setEnactmentFiscalYear(Year.of(date.getYear()));
        }

        if (src.isSetValidTo())
            dest.setValidTo(src.getValidTo().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetValidToType())
            dest.setValidToType(helper.getGMLUnmarshaller().unmarshalCode(src.getValidToType()));

        if (src.isSetExpirationFiscalYear()) {
            LocalDate date = src.getExpirationFiscalYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setExpirationFiscalYear(Year.of(date.getYear()));
        }

        dest.setLegalGrounds(src.getLegalGrounds());
        dest.setCustodian(src.getCustodian());
        dest.setNotificationNumber(src.getNotificationNumber());

        if (src.isSetUrbanPlanType())
            dest.setUrbanPlanType(helper.getGMLUnmarshaller().unmarshalCode(src.getUrbanPlanType()));

        if (src.isSetAreaClassificationType())
            dest.setAreaClassificationType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassificationType()));

        if (src.isSetNominalArea())
            dest.setNominalArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getNominalArea()));

        if (src.isSetPrefecture())
            dest.setPrefecture(helper.getGMLUnmarshaller().unmarshalCode(src.getPrefecture()));

        if (src.isSetCity())
            dest.setCity(helper.getGMLUnmarshaller().unmarshalCode(src.getCity()));

        dest.setReference(src.getReference());

        if (src.isSetReason())
            dest.setReason(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getReason()));

        if (src.isSetNote())
            dest.setNote(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getNote()));

        if (src.isSetSurveyYear()) {
            LocalDate date = src.getSurveyYear().toGregorianCalendar().toZonedDateTime().toLocalDate();
            dest.setSurveyYear(Year.of(date.getYear()));
        }

        if (src.isSetLodMinus2MultiSurface())
            dest.setLodMinus2MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLodMinus2MultiSurface()));

        if (src.isSetLodMinus1MultiSurface())
            dest.setLodMinus1MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLodMinus1MultiSurface()));

        if (src.isSetLod0MultiSurface())
            dest.setLod0MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod0MultiSurface()));

        if (src.isSetLod1MultiSurface())
            dest.setLod1MultiSurface(helper.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod1MultiSurface()));

        if (src.isSetLodMinus2MultiCurve())
            dest.setLodMinus2MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLodMinus2MultiCurve()));

        if (src.isSetLodMinus1MultiCurve())
            dest.setLodMinus1MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLodMinus1MultiCurve()));

        if (src.isSetLod0MultiCurve())
            dest.setLod0MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod0MultiCurve()));

        if (src.isSetLod1MultiCurve())
            dest.setLod1MultiCurve(helper.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod1MultiCurve()));

        if (src.isSetLodMinus2MultiPoint())
            dest.setLodMinus2MultiPoint(helper.getGMLUnmarshaller().unmarshalMultiPointProperty(src.getLodMinus2MultiPoint()));

        if (src.isSetLodMinus1MultiPoint())
            dest.setLodMinus1MultiPoint(helper.getGMLUnmarshaller().unmarshalMultiPointProperty(src.getLodMinus1MultiPoint()));

        if (src.isSetLod0MultiPoint())
            dest.setLod0MultiPoint(helper.getGMLUnmarshaller().unmarshalMultiPointProperty(src.getLod0MultiPoint()));

        if (src.isSetTarget()) {
            for (TargetPropertyType target : src.getTarget())
                dest.getTarget().add(unmarshalTargetProperty(target));
        }
    }

    private void unmarshalZone(ZoneType src, Zone dest) throws MissingADESchemaException {
        unmarshalUrbanFunction(src, dest);

        if (src.isSetBoundary()) {
            for (BoundaryPropertyType boundary : src.getBoundary())
                dest.getBoundary().add(unmarshalBoundaryProperty(boundary));
        }

        dest.setLocationDescription(src.getLocationDescription());
    }

    private UrbanPlanningArea unmarshalUrbanPlanningArea(UrbanPlanningAreaType src) throws MissingADESchemaException {
        UrbanPlanningArea dest = new UrbanPlanningArea();
        unmarshalZone(src, dest);

        if (src.isSetAreaClassification())
            dest.setAreaClassification(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaClassification()));

        if (src.isSetReasonForAreaClassification())
            dest.setReasonForAreaClassification(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getReasonForAreaClassification()));

        if (src.isSetPolicyForAreaClassification())
            dest.setPolicyForAreaClassification(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPolicyForAreaClassification()));

        if (src.isSetPurposeForUrbanPlan())
            dest.setPurposeForUrbanPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPurposeForUrbanPlan()));

        if (src.isSetPolicyForUrbanPlanDecision())
            dest.setPolicyForUrbanPlanDecision(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPolicyForUrbanPlanDecision()));

        if (src.isSetPopulation())
            dest.setPopulation(src.getPopulation().intValue());

        if (src.isSetCityArea())
            dest.setCityArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getCityArea()));

        if (src.isSetCityPopulation())
            dest.setCityPopulation(src.getCityPopulation().intValue());

        return dest;
    }

    private QuasiUrbanPlanningArea unmarshalQuasiUrbanPlanningArea(QuasiUrbanPlanningAreaType src) throws MissingADESchemaException {
        QuasiUrbanPlanningArea dest = new QuasiUrbanPlanningArea();
        unmarshalZone(src, dest);

        if (src.isSetPopulation())
            dest.setPopulation(src.getPopulation().intValue());

        if (src.isSetCityArea())
            dest.setCityArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getCityArea()));

        if (src.isSetCityPopulation())
            dest.setCityPopulation(src.getCityPopulation().intValue());

        return dest;
    }

    private AreaClassification unmarshalAreaClassification(AreaClassificationType src) throws MissingADESchemaException {
        AreaClassification dest = new AreaClassification();
        unmarshalZone(src, dest);

        if (src.isSetPopulation())
            dest.setPopulation(src.getPopulation().intValue());

        return dest;
    }

    private void unmarshalDistrictsAndZones(DistrictsAndZonesType src, DistrictsAndZones dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        if (src.isSetAreaInTotal())
            dest.setAreaInTotal(helper.getGMLUnmarshaller().unmarshalMeasure(src.getAreaInTotal()));
    }

    private DistrictsAndZones unmarshalDistrictsAndZones(DistrictsAndZonesType src) throws MissingADESchemaException {
        DistrictsAndZones dest = new DistrictsAndZones();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private UseDistrict unmarshalUseDistrict(UseDistrictType src) throws MissingADESchemaException {
        UseDistrict dest = new UseDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetFloorAreaRate())
            dest.setFloorAreaRate(src.getFloorAreaRate());

        if (src.isSetMinimumSiteArea())
            dest.setMinimumSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumSiteArea()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());

        if (src.isSetWallSetbackDistance())
            dest.setWallSetbackDistance(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getWallSetbackDistance()));

        if (src.isSetBuildingHeightLimits())
            dest.setBuildingHeightLimits(helper.getGMLUnmarshaller().unmarshalLength(src.getBuildingHeightLimits()));

        if (src.isSetBuildingRestrictions())
            dest.setBuildingRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingRestrictions()));

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        if (src.isSetSetbackRestrictions())
            dest.setSetbackRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackRestrictions()));

        if (src.isSetShadeRegulation())
            dest.setShadeRegulation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getShadeRegulation()));

        return dest;
    }

    private SpecialUseDistrict unmarshalSpecialUseDistrict(SpecialUseDistrictType src) throws MissingADESchemaException {
        SpecialUseDistrict dest = new SpecialUseDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetBuildingRestrictions())
            dest.setBuildingRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingRestrictions()));

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUseRestrictionDistrict unmarshalSpecialUseRestrictionDistrict(SpecialUseRestrictionDistrictType src) throws MissingADESchemaException {
        SpecialUseRestrictionDistrict dest = new SpecialUseRestrictionDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetBuildingRestrictions())
            dest.setBuildingRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingRestrictions()));

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private ExceptionalFloorAreaRateDistrict unmarshalExceptionalFloorAreaRateDistrict(ExceptionalFloorAreaRateDistrictType src) throws MissingADESchemaException {
        ExceptionalFloorAreaRateDistrict dest = new ExceptionalFloorAreaRateDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetBuildingHeightLimits())
            dest.setBuildingHeightLimits(helper.getGMLUnmarshaller().unmarshalLength(src.getBuildingHeightLimits()));

        return dest;
    }

    private HighRiseResidentialAttractionDistrict unmarshalHighRiseResidentialAttractionDistrict(HighRiseResidentialAttractionDistrictType src) throws MissingADESchemaException {
        HighRiseResidentialAttractionDistrict dest = new HighRiseResidentialAttractionDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetFloorAreaRate())
            dest.setFloorAreaRate(src.getFloorAreaRate());

        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        if (src.isSetMinimumSiteArea())
            dest.setMinimumSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumSiteArea()));

        return dest;
    }

    private HeightControlDistrict unmarshalHeightControlDistrict(HeightControlDistrictType src) throws MissingADESchemaException {
        HeightControlDistrict dest = new HeightControlDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        return dest;
    }

    private HighLevelUseDistrict unmarshalHighLevelUseDistrict(HighLevelUseDistrictType src) throws MissingADESchemaException {
        HighLevelUseDistrict dest = new HighLevelUseDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetMaximumFloorAreaRate()) {
            for (Double maximumFloorAreaRate : src.getMaximumFloorAreaRate())
                dest.getMaximumFloorAreaRate().add(maximumFloorAreaRate);
        }

        if (src.isSetMinimumFloorAreaRate()) {
            for (Double minimumFloorAreaRate : src.getMinimumFloorAreaRate())
                dest.getMinimumFloorAreaRate().add(minimumFloorAreaRate);
        }

        if (src.isSetMaximumBuildingCoverageRate()) {
            for (Double maximumBuildingCoverageRate : src.getMaximumBuildingCoverageRate())
                dest.getMaximumBuildingCoverageRate().add(maximumBuildingCoverageRate);
        }

        if (src.isSetMinimumBuildingArea()) {
            for (MeasureType minimumBuildingArea : src.getMinimumBuildingArea())
                dest.getMinimumBuildingArea().add(helper.getGMLUnmarshaller().unmarshalMeasure(minimumBuildingArea));
        }

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        return dest;
    }

    private SpecifiedBlock unmarshalSpecifiedBlock(SpecifiedBlockType src) throws MissingADESchemaException {
        SpecifiedBlock dest = new SpecifiedBlock();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetFloorAreaRate())
            dest.setFloorAreaRate(src.getFloorAreaRate());

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        return dest;
    }

    private SpecialUrbanRenaissanceDistrict unmarshalSpecialUrbanRenaissanceDistrict(SpecialUrbanRenaissanceDistrictType src) throws MissingADESchemaException {
        SpecialUrbanRenaissanceDistrict dest = new SpecialUrbanRenaissanceDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetUseToBeInduced())
            dest.setUseToBeInduced(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUseToBeInduced()));

        if (src.isSetMaximumFloorAreaRate())
            dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());

        if (src.isSetMinimumFloorAreaRate())
            dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());

        if (src.isSetMaximumBuildingCoverageRate())
            dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        if (src.isSetMinimumBuildingArea())
            dest.setMinimumBuildingArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumBuildingArea()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getMaximumBuildingHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUrbanRenaissanceDistrictProperty unmarshalSpecialUrbanRenaissanceDistrictProperty(SpecialUrbanRenaissanceDistrictPropertyType src) throws MissingADESchemaException {
        SpecialUrbanRenaissanceDistrictProperty dest = new SpecialUrbanRenaissanceDistrictProperty();

        if (src.isSetSpecialUrbanRenaissanceDistrict())
            dest.setObject(unmarshalSpecialUrbanRenaissanceDistrict(src.getSpecialUrbanRenaissanceDistrict()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private HousingControlArea unmarshalHousingControlArea(HousingControlAreaType src) throws MissingADESchemaException {
        HousingControlArea dest = new HousingControlArea();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private ResidentialEnvironmentImprovementDistrict unmarshalResidentialEnvironmentImprovementDistrict(ResidentialEnvironmentImprovementDistrictType src) throws MissingADESchemaException {
        ResidentialEnvironmentImprovementDistrict dest = new ResidentialEnvironmentImprovementDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetUseToBeInduced())
            dest.setUseToBeInduced(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUseToBeInduced()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getMaximumBuildingHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUseAttractionDistrict unmarshalSpecialUseAttractionDistrict(SpecialUseAttractionDistrictType src) throws MissingADESchemaException {
        SpecialUseAttractionDistrict dest = new SpecialUseAttractionDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetUseToBeInduced())
            dest.setUseToBeInduced(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUseToBeInduced()));

        if (src.isSetMaximumFloorAreaRate())
            dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());

        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());

        if (src.isSetMinimumBuildingArea())
            dest.setMinimumBuildingArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumBuildingArea()));

        dest.setMaximumBuildingHeight(src.getMaximumBuildingHeight());

        if (src.isSetOtherRestrictions())
            dest.setOtherRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private FirePreventionDistrict unmarshalFirePreventionDistrict(FirePreventionDistrictType src) throws MissingADESchemaException {
        FirePreventionDistrict dest = new FirePreventionDistrict();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private SpecifiedDisasterPreventionBlockImprovementZone unmarshalSpecifiedDisasterPreventionBlockImprovementZone(SpecifiedDisasterPreventionBlockImprovementZoneType src) throws MissingADESchemaException {
        SpecifiedDisasterPreventionBlockImprovementZone dest = new SpecifiedDisasterPreventionBlockImprovementZone();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetMinimumSiteArea())
            dest.setMinimumSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumSiteArea()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        dest.setMinimumFrontageRate(src.getMinimumFrontageRate());

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        return dest;
    }

    private LandscapeZone unmarshalLandscapeZone(LandscapeZoneType src) throws MissingADESchemaException {
        LandscapeZone dest = new LandscapeZone();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetBuildingDesignRestriction())
            dest.setBuildingDesignRestriction(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingDesignRestriction()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        if (src.isSetMinimumSiteArea())
            dest.setMinimumSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumSiteArea()));

        return dest;
    }

    private ScenicDistrict unmarshalScenicDistrict(ScenicDistrictType src) throws MissingADESchemaException {
        ScenicDistrict dest = new ScenicDistrict();
        unmarshalDistrictsAndZones(src, dest);

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());

        if (src.isSetBuildingHeightLimits())
            dest.setBuildingHeightLimits(helper.getGMLUnmarshaller().unmarshalLength(src.getBuildingHeightLimits()));

        if (src.isSetWallSetbackDistanceWithRoad())
            dest.setWallSetbackDistanceWithRoad(helper.getGMLUnmarshaller().unmarshalLength(src.getWallSetbackDistanceWithRoad()));

        if (src.isSetWallSetbackDistanceWithAdjoiningLand())
            dest.setWallSetbackDistanceWithAdjoiningLand(helper.getGMLUnmarshaller().unmarshalLength(src.getWallSetbackDistanceWithAdjoiningLand()));

        return dest;
    }

    private ParkingPlaceDevelopmentZone unmarshalParkingPlaceDevelopmentZone(ParkingPlaceDevelopmentZoneType src) throws MissingADESchemaException {
        ParkingPlaceDevelopmentZone dest = new ParkingPlaceDevelopmentZone();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private PortZone unmarshalPortZone(PortZoneType src) throws MissingADESchemaException {
        PortZone dest = new PortZone();
        unmarshalDistrictsAndZones(src, dest);

        dest.setFloorAreaRate(src.getFloorAreaRate());

        return dest;
    }

    private SpecialZoneForPreservationOfHistoricalLandscape unmarshalSpecialZoneForPreservationOfHistoricalLandscape(SpecialZoneForPreservationOfHistoricalLandscapeType src) throws MissingADESchemaException {
        SpecialZoneForPreservationOfHistoricalLandscape dest = new SpecialZoneForPreservationOfHistoricalLandscape();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private ZoneForPreservationOfHistoricalLandscape unmarshalZoneForPreservationOfHistoricalLandscape(ZoneForPreservationOfHistoricalLandscapeType src) throws MissingADESchemaException {
        ZoneForPreservationOfHistoricalLandscape dest = new ZoneForPreservationOfHistoricalLandscape();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private GreenSpaceConservationDistrict unmarshalGreenSpaceConservationDistrict(GreenSpaceConservationDistrictType src) throws MissingADESchemaException {
        GreenSpaceConservationDistrict dest = new GreenSpaceConservationDistrict();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private SpecialGreenSpaceConservationDistrict unmarshalSpecialGreenSpaceConservationDistrict(SpecialGreenSpaceConservationDistrictType src) throws MissingADESchemaException {
        SpecialGreenSpaceConservationDistrict dest = new SpecialGreenSpaceConservationDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetRequirement())
            dest.setRequirement(helper.getGMLUnmarshaller().unmarshalCode(src.getRequirement()));

        return dest;
    }

    private TreePlantingDistrict unmarshalTreePlantingDistrict(TreePlantingDistrictType src) throws MissingADESchemaException {
        TreePlantingDistrict dest = new TreePlantingDistrict();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetMinimumGreeningRate())
            dest.setMinimumGreeningRate(src.getMinimumGreeningRate());

        return dest;
    }

    private DistributionBusinessZone unmarshalDistributionBusinessZone(DistributionBusinessZoneType src) throws MissingADESchemaException {
        DistributionBusinessZone dest = new DistributionBusinessZone();
        unmarshalDistrictsAndZones(src, dest);

        if (src.isSetGuidelinePublicationDate())
            dest.setGuidelinePublicationDate(src.getGuidelinePublicationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    private ProductiveGreenZone unmarshalProductiveGreenZone(ProductiveGreenZoneType src) throws MissingADESchemaException {
        ProductiveGreenZone dest = new ProductiveGreenZone();
        unmarshalDistrictsAndZones(src, dest);

        dest.setZoneNumber(src.getZoneNumber());

        if (src.isSetSpecification())
            dest.setSpecification(helper.getGMLUnmarshaller().unmarshalCode(src.getSpecification()));

        return dest;
    }

    private ConservationZoneForClustersOfTraditionalStructures unmarshalConservationZoneForClustersOfTraditionalStructures(ConservationZoneForClustersOfTraditionalStructuresType src) throws MissingADESchemaException {
        ConservationZoneForClustersOfTraditionalStructures dest = new ConservationZoneForClustersOfTraditionalStructures();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private AircraftNoiseControlZone unmarshalAircraftNoiseControlZone(AircraftNoiseControlZoneType src) throws MissingADESchemaException {
        AircraftNoiseControlZone dest = new AircraftNoiseControlZone();
        unmarshalDistrictsAndZones(src, dest);
        return dest;
    }

    private void unmarshalProjectPromotionArea(ProjectPromotionAreaType src, ProjectPromotionArea dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        if (src.isSetDevelopmentPolicy())
            dest.setDevelopmentPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDevelopmentPolicy()));

        if (src.isSetPublicFacilitiesPlans())
            dest.setPublicFacilitiesPlans(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilitiesPlans()));
    }

    private ProjectPromotionArea unmarshalProjectPromotionArea(ProjectPromotionAreaType src) throws MissingADESchemaException {
        ProjectPromotionArea dest = new ProjectPromotionArea();
        unmarshalProjectPromotionArea(src, dest);
        return dest;
    }

    private UrbanRedevelopmentPromotionArea unmarshalUrbanRedevelopmentPromotionArea(UrbanRedevelopmentPromotionAreaType src) throws MissingADESchemaException {
        UrbanRedevelopmentPromotionArea dest = new UrbanRedevelopmentPromotionArea();
        unmarshalProjectPromotionArea(src, dest);

        if (src.isSetPublicFacilities())
            dest.setPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilities()));

        if (src.isSetUnitArea())
            dest.setUnitArea(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUnitArea()));

        return dest;
    }

    private LandReadjustmentPromotionArea unmarshalLandReadjustmentPromotionArea(LandReadjustmentPromotionAreaType src) throws MissingADESchemaException {
        LandReadjustmentPromotionArea dest = new LandReadjustmentPromotionArea();
        unmarshalProjectPromotionArea(src, dest);
        return dest;
    }

    private ResidentialBlockConstructionPromotionArea unmarshalResidentialBlockConstructionPromotionArea(ResidentialBlockConstructionPromotionAreaType src) throws MissingADESchemaException {
        ResidentialBlockConstructionPromotionArea dest = new ResidentialBlockConstructionPromotionArea();
        unmarshalProjectPromotionArea(src, dest);
        return dest;
    }

    private LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment unmarshalLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType src) throws MissingADESchemaException {
        LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment dest = new LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment();
        unmarshalProjectPromotionArea(src, dest);
        return dest;
    }

    private UnusedLandUsePromotionArea unmarshalUnusedLandUsePromotionArea(UnusedLandUsePromotionAreaType src) throws MissingADESchemaException {
        UnusedLandUsePromotionArea dest = new UnusedLandUsePromotionArea();
        unmarshalZone(src, dest);
        return dest;
    }

    private UrbanDisasterRecoveryPromotionArea unmarshalUrbanDisasterRecoveryPromotionArea(UrbanDisasterRecoveryPromotionAreaType src) throws MissingADESchemaException {
        UrbanDisasterRecoveryPromotionArea dest = new UrbanDisasterRecoveryPromotionArea();
        unmarshalZone(src, dest);

        if (src.isSetExpirationDate())
            dest.setExpirationDate(src.getExpirationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetEmergencyRecoveryPolicy())
            dest.setEmergencyRecoveryPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getEmergencyRecoveryPolicy()));

        if (src.isSetPlannedProjectType())
            dest.setPlannedProjectType(helper.getGMLUnmarshaller().unmarshalCode(src.getPlannedProjectType()));

        return dest;
    }

    private void unmarshalUrbanDevelopmentProject(UrbanDevelopmentProjectType src, UrbanDevelopmentProject dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);
        dest.setScheduledExecutor(src.getScheduledExecutor());
    }

    private UrbanDevelopmentProject unmarshalUrbanDevelopmentProject(UrbanDevelopmentProjectType src) throws MissingADESchemaException {
        UrbanDevelopmentProject dest = new UrbanDevelopmentProject();
        unmarshalUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private LandReadjustmentProject unmarshalLandReadjustmentProject(LandReadjustmentProjectType src) throws MissingADESchemaException {
        LandReadjustmentProject dest = new LandReadjustmentProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetPublicFacilityAllocation())
            dest.setPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.isSetBuildingLotDevelopment())
            dest.setBuildingLotDevelopment(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingLotDevelopment()));

        return dest;
    }

    private NewHousingAndUrbanDevelopmentProject unmarshalNewHousingAndUrbanDevelopmentProject(NewHousingAndUrbanDevelopmentProjectType src) throws MissingADESchemaException {
        NewHousingAndUrbanDevelopmentProject dest = new NewHousingAndUrbanDevelopmentProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetHousing())
            dest.setHousing(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getHousing()));

        if (src.isSetPublicFacilityAllocation())
            dest.setPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.isSetResidentialLandUsePlan())
            dest.setResidentialLandUsePlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getResidentialLandUsePlan()));

        return dest;
    }

    private IndustrialParkDevelopmentProject unmarshalIndustrialParkDevelopmentProject(IndustrialParkDevelopmentProjectType src) throws MissingADESchemaException {
        IndustrialParkDevelopmentProject dest = new IndustrialParkDevelopmentProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetPublicFacilityAllocation())
            dest.setPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.isSetResidentialLandUsePlan())
            dest.setResidentialLandUsePlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getResidentialLandUsePlan()));

        return dest;
    }

    private UrbanRedevelopmentProject unmarshalUrbanRedevelopmentProject(UrbanRedevelopmentProjectType src) throws MissingADESchemaException {
        UrbanRedevelopmentProject dest = new UrbanRedevelopmentProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetPublicFacilityAllocation())
            dest.setPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.isSetDevelopmentPlan())
            dest.setDevelopmentPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDevelopmentPlan()));

        if (src.isSetHousingTarget())
            dest.setHousingTarget(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getHousingTarget()));

        if (src.isSetSiteArea())
            dest.setSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSiteArea()));

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        if (src.isSetNumberOfHousing())
            dest.setNumberOfHousing(src.getNumberOfHousing().intValue());

        return dest;
    }

    private NewUrbanInfrastructureProject unmarshalNewUrbanInfrastructureProject(NewUrbanInfrastructureProjectType src) throws MissingADESchemaException {
        NewUrbanInfrastructureProject dest = new NewUrbanInfrastructureProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetLandForCentralPublicFacilities())
            dest.setLandForCentralPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLandForCentralPublicFacilities()));

        if (src.isSetDistrictsAllocation())
            dest.setDistrictsAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDistrictsAllocation()));

        if (src.isSetLandUsePlan())
            dest.setLandUsePlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLandUsePlan()));

        return dest;
    }

    private ResidentialBlockConstructionProject unmarshalResidentialBlockConstructionProject(ResidentialBlockConstructionProjectType src) throws MissingADESchemaException {
        ResidentialBlockConstructionProject dest = new ResidentialBlockConstructionProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetPublicFacilityAllocation())
            dest.setPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.isSetDevelopmentPlan())
            dest.setDevelopmentPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDevelopmentPlan()));

        if (src.isSetSiteArea())
            dest.setSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSiteArea()));

        if (src.isSetTotalFloorArea())
            dest.setTotalFloorArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getTotalFloorArea()));

        return dest;
    }

    private DisasterPreventionBlockImprovementProject unmarshalDisasterPreventionBlockImprovementProject(DisasterPreventionBlockImprovementProjectType src) throws MissingADESchemaException {
        DisasterPreventionBlockImprovementProject dest = new DisasterPreventionBlockImprovementProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetDisasterPreventionPublicFacilityAllocation())
            dest.setDisasterPreventionPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDisasterPreventionPublicFacilityAllocation()));

        if (src.isSetOtherPublicFacilityAllocation())
            dest.setOtherPublicFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getOtherPublicFacilityAllocation()));

        if (src.isSetDevelopmentPlan())
            dest.setDevelopmentPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDevelopmentPlan()));

        return dest;
    }

    private UrbanRenewalProject unmarshalUrbanRenewalProject(UrbanRenewalProjectType src) throws MissingADESchemaException {
        UrbanRenewalProject dest = new UrbanRenewalProject();
        unmarshalUrbanDevelopmentProject(src, dest);

        if (src.isSetStoreysAboveGround())
            dest.setStoreysAboveGround(src.getStoreysAboveGround().intValue());

        if (src.isSetStoreysBelowGround())
            dest.setStoreysBelowGround(src.getStoreysBelowGround().intValue());

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        dest.setFloorAreaRate(src.getFloorAreaRate());
        dest.setBuildingUsage(src.getBuildingUsage());

        if (src.isSetSiteArea())
            dest.setSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getSiteArea()));

        return dest;
    }

    private void unmarshalScheduledAreaForUrbanDevelopmentProject(ScheduledAreaForUrbanDevelopmentProjectType src, ScheduledAreaForUrbanDevelopmentProject dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);
        dest.setScheduledExecutor(src.getScheduledExecutor());
    }

    private ScheduledAreaForUrbanDevelopmentProject unmarshalScheduledAreaForUrbanDevelopmentProject(ScheduledAreaForUrbanDevelopmentProjectType src) throws MissingADESchemaException {
        ScheduledAreaForUrbanDevelopmentProject dest = new ScheduledAreaForUrbanDevelopmentProject();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForNewHousingAndUrbanDevelopmentProjects unmarshalScheduledAreaForNewHousingAndUrbanDevelopmentProjects(ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType src) throws MissingADESchemaException {
        ScheduledAreaForNewHousingAndUrbanDevelopmentProjects dest = new ScheduledAreaForNewHousingAndUrbanDevelopmentProjects();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForIndustrialParkDevelopmentProjects unmarshalScheduledAreaForIndustrialParkDevelopmentProjects(ScheduledAreaForIndustrialParkDevelopmentProjectsType src) throws MissingADESchemaException {
        ScheduledAreaForIndustrialParkDevelopmentProjects dest = new ScheduledAreaForIndustrialParkDevelopmentProjects();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForNewUrbanInfrastructureProjects unmarshalScheduledAreaForNewUrbanInfrastructureProjects(ScheduledAreaForNewUrbanInfrastructureProjectsType src) throws MissingADESchemaException {
        ScheduledAreaForNewUrbanInfrastructureProjects dest = new ScheduledAreaForNewUrbanInfrastructureProjects();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForCollectiveHousingFacilities unmarshalScheduledAreaForCollectiveHousingFacilities(ScheduledAreaForCollectiveHousingFacilitiesType src) throws MissingADESchemaException {
        ScheduledAreaForCollectiveHousingFacilities dest = new ScheduledAreaForCollectiveHousingFacilities();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities unmarshalScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType src) throws MissingADESchemaException {
        ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities dest = new ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForDistributionBusinessPark unmarshalScheduledAreaForDistributionBusinessPark(ScheduledAreaForDistributionBusinessParkType src) throws MissingADESchemaException {
        ScheduledAreaForDistributionBusinessPark dest = new ScheduledAreaForDistributionBusinessPark();
        unmarshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private void unmarshalUrbanFacility(UrbanFacilityType src, UrbanFacility dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        dest.setNumber(src.getNumber());

        if (src.isSetThreeDimensionalExtent()) {
            for (ThreeDimensionalExtentPropertyType threeDimensionalExtent : src.getThreeDimensionalExtent())
                dest.getThreeDimensionalExtent().add(unmarshalThreeDimensionalExtentProperty(threeDimensionalExtent));
        }
    }

    private UrbanFacility unmarshalUrbanFacility(UrbanFacilityType src) throws MissingADESchemaException {
        UrbanFacility dest = new UrbanFacility();
        unmarshalUrbanFacility(src, dest);
        return dest;
    }

    private TrafficFacility unmarshalTrafficFacility(TrafficFacilityType src) throws MissingADESchemaException {
        TrafficFacility dest = new TrafficFacility();
        unmarshalUrbanFacility(src, dest);

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());
        dest.setViaLocations(src.getViaLocations());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        if (src.isSetUrbanRoadAttribute())
            dest.setUrbanRoadAttribute(unmarshalUrbanRoadAttributeProperty(src.getUrbanRoadAttribute()));

        if (src.isSetUrbanRapidTransitRailroadAttribute())
            dest.setUrbanRapidTransitRailroadAttribute(unmarshalUrbanRapidTransitRailroadAttributeProperty(src.getUrbanRapidTransitRailroadAttribute()));

        if (src.isSetParkingPlaceAttribute())
            dest.setParkingPlaceAttribute(unmarshalParkingPlaceAttributeProperty(src.getParkingPlaceAttribute()));

        if (src.isSetVehicleTerminalAttribute())
            dest.setVehicleTerminalAttribute(unmarshalVehicleTerminalAttributeProperty(src.getVehicleTerminalAttribute()));

        return dest;
    }

    private UrbanRoadAttribute unmarshalUrbanRoadAttribute(UrbanRoadAttributeType src) throws MissingADESchemaException {
        UrbanRoadAttribute dest = new UrbanRoadAttribute();

        if (src.isSetRouteTypeNumber())
            dest.setRouteTypeNumber(helper.getGMLUnmarshaller().unmarshalCode(src.getRouteTypeNumber()));

        if (src.isSetRouteSizeNumber())
            dest.setRouteSizeNumber(helper.getGMLUnmarshaller().unmarshalCode(src.getRouteSizeNumber()));

        if (src.isSetRouteSerialNumber())
            dest.setRouteSerialNumber(src.getRouteSerialNumber().intValue());

        if (src.isSetRoadType())
            dest.setRoadType(helper.getGMLUnmarshaller().unmarshalCode(src.getRoadType()));

        if (src.isSetNumberOfLanes())
            dest.setNumberOfLanes(src.getNumberOfLanes().intValue());

        if (src.isSetRoadStructure())
            dest.setRoadStructure(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getRoadStructure()));

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetCrossType())
            dest.setCrossType(helper.getGMLUnmarshaller().unmarshalCode(src.getCrossType()));

        if (src.isSetTrafficPlazas())
            dest.setTrafficPlazas(helper.getGMLUnmarshaller().unmarshalCode(src.getTrafficPlazas()));

        if (src.isSetStructuralDetails()) {
            for (StructureDetailsPropertyType structuralDetails : src.getStructuralDetails())
                dest.getStructuralDetails().add(unmarshalStructureDetailsProperty(structuralDetails));
        }

        return dest;
    }

    private UrbanRoadAttributeProperty unmarshalUrbanRoadAttributeProperty(UrbanRoadAttributePropertyType src) throws MissingADESchemaException {
        UrbanRoadAttributeProperty dest = new UrbanRoadAttributeProperty();

        if (src.isSetUrbanRoadAttribute())
            dest.setObject(unmarshalUrbanRoadAttribute(src.getUrbanRoadAttribute()));

        return dest;
    }

    private StructureDetails unmarshalStructureDetails(StructureDetailsType src) throws MissingADESchemaException {
        StructureDetails dest = new StructureDetails();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());
        dest.setViaLocations(src.getViaLocations());

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetMinimumWidth())
            dest.setMinimumWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumWidth()));

        if (src.isSetMaximumWidth())
            dest.setMaximumWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumWidth()));

        if (src.isSetStandardWidth())
            dest.setStandardWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getStandardWidth()));

        if (src.isSetCrossType())
            dest.setCrossType(helper.getGMLUnmarshaller().unmarshalCode(src.getCrossType()));

        return dest;
    }

    private StructureDetailsProperty unmarshalStructureDetailsProperty(StructureDetailsPropertyType src) throws MissingADESchemaException {
        StructureDetailsProperty dest = new StructureDetailsProperty();

        if (src.isSetStructureDetails())
            dest.setObject(unmarshalStructureDetails(src.getStructureDetails()));

        return dest;
    }

    private UrbanRapidTransitRailroadAttribute unmarshalUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttributeType src) throws MissingADESchemaException {
        UrbanRapidTransitRailroadAttribute dest = new UrbanRapidTransitRailroadAttribute();

        if (src.isSetStructureType())
            dest.setStructureType(helper.getGMLUnmarshaller().unmarshalCode(src.getStructureType()));

        if (src.isSetCrossType())
            dest.setCrossType(helper.getGMLUnmarshaller().unmarshalCode(src.getCrossType()));

        if (src.isSetStructuralDetails()) {
            for (StructureDetailsPropertyType structuralDetails : src.getStructuralDetails())
                dest.getStructuralDetails().add(unmarshalStructureDetailsProperty(structuralDetails));
        }

        return dest;
    }

    private UrbanRapidTransitRailroadAttributeProperty unmarshalUrbanRapidTransitRailroadAttributeProperty(UrbanRapidTransitRailroadAttributePropertyType src) throws MissingADESchemaException {
        UrbanRapidTransitRailroadAttributeProperty dest = new UrbanRapidTransitRailroadAttributeProperty();

        if (src.isSetUrbanRapidTransitRailroadAttribute())
            dest.setObject(unmarshalUrbanRapidTransitRailroadAttribute(src.getUrbanRapidTransitRailroadAttribute()));

        return dest;
    }

    private ParkingPlaceAttribute unmarshalParkingPlaceAttribute(ParkingPlaceAttributeType src) throws MissingADESchemaException {
        ParkingPlaceAttribute dest = new ParkingPlaceAttribute();

        if (src.isSetStoreysAboveGround())
            dest.setStoreysAboveGround(src.getStoreysAboveGround().intValue());

        if (src.isSetStoreysBelowGround())
            dest.setStoreysBelowGround(src.getStoreysBelowGround().intValue());

        return dest;
    }

    private ParkingPlaceAttributeProperty unmarshalParkingPlaceAttributeProperty(ParkingPlaceAttributePropertyType src) throws MissingADESchemaException {
        ParkingPlaceAttributeProperty dest = new ParkingPlaceAttributeProperty();

        if (src.isSetParkingPlaceAttribute())
            dest.setObject(unmarshalParkingPlaceAttribute(src.getParkingPlaceAttribute()));

        return dest;
    }

    private VehicleTerminalAttribute unmarshalVehicleTerminalAttribute(VehicleTerminalAttributeType src) throws MissingADESchemaException {
        VehicleTerminalAttribute dest = new VehicleTerminalAttribute();

        if (src.isSetTerminalType())
            dest.setTerminalType(helper.getGMLUnmarshaller().unmarshalCode(src.getTerminalType()));

        return dest;
    }

    private VehicleTerminalAttributeProperty unmarshalVehicleTerminalAttributeProperty(VehicleTerminalAttributePropertyType src) throws MissingADESchemaException {
        VehicleTerminalAttributeProperty dest = new VehicleTerminalAttributeProperty();

        if (src.isSetVehicleTerminalAttribute())
            dest.setObject(unmarshalVehicleTerminalAttribute(src.getVehicleTerminalAttribute()));

        return dest;
    }

    private OpenSpaceForPublicUse unmarshalOpenSpaceForPublicUse(OpenSpaceForPublicUseType src) throws MissingADESchemaException {
        OpenSpaceForPublicUse dest = new OpenSpaceForPublicUse();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetParkAttribute())
            dest.setParkAttribute(unmarshalParkAttributeProperty(src.getParkAttribute()));

        return dest;
    }

    private ParkAttribute unmarshalParkAttribute(ParkAttributeType src) throws MissingADESchemaException {
        ParkAttribute dest = new ParkAttribute();

        if (src.isSetParkTypeNumber())
            dest.setParkTypeNumber(helper.getGMLUnmarshaller().unmarshalCode(src.getParkTypeNumber()));

        if (src.isSetParkSizeNumber())
            dest.setParkSizeNumber(helper.getGMLUnmarshaller().unmarshalCode(src.getParkSizeNumber()));

        if (src.isSetParkSerialNumber())
            dest.setParkSerialNumber(src.getParkSerialNumber().intValue());

        return dest;
    }

    private ParkAttributeProperty unmarshalParkAttributeProperty(ParkAttributePropertyType src) throws MissingADESchemaException {
        ParkAttributeProperty dest = new ParkAttributeProperty();

        if (src.isSetParkAttribute())
            dest.setObject(unmarshalParkAttribute(src.getParkAttribute()));

        return dest;
    }

    private SupplyFacility unmarshalSupplyFacility(SupplyFacilityType src) throws MissingADESchemaException {
        SupplyFacility dest = new SupplyFacility();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetWaterWorksAttribute())
            dest.setWaterWorksAttribute(unmarshalWaterWorksAttributeProperty(src.getWaterWorksAttribute()));

        return dest;
    }

    private WaterWorksAttribute unmarshalWaterWorksAttribute(WaterWorksAttributeType src) throws MissingADESchemaException {
        WaterWorksAttribute dest = new WaterWorksAttribute();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        return dest;
    }

    private WaterWorksAttributeProperty unmarshalWaterWorksAttributeProperty(WaterWorksAttributePropertyType src) throws MissingADESchemaException {
        WaterWorksAttributeProperty dest = new WaterWorksAttributeProperty();

        if (src.isSetWaterWorksAttribute())
            dest.setObject(unmarshalWaterWorksAttribute(src.getWaterWorksAttribute()));

        return dest;
    }

    private TreatmentFacility unmarshalTreatmentFacility(TreatmentFacilityType src) throws MissingADESchemaException {
        TreatmentFacility dest = new TreatmentFacility();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetSewerSystemsAttribute())
            dest.setSewerSystemsAttribute(unmarshalSewerSystemAttributeProperty(src.getSewerSystemsAttribute()));

        return dest;
    }

    private SewerSystemAttribute unmarshalSewerSystemAttribute(SewerSystemAttributeType src) throws MissingADESchemaException {
        SewerSystemAttribute dest = new SewerSystemAttribute();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        if (src.isSetSystemType())
            dest.setSystemType(helper.getGMLUnmarshaller().unmarshalCode(src.getSystemType()));

        if (src.isSetDrainageArea())
            dest.setDrainageArea(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDrainageArea()));

        return dest;
    }

    private SewerSystemAttributeProperty unmarshalSewerSystemAttributeProperty(SewerSystemAttributePropertyType src) throws MissingADESchemaException {
        SewerSystemAttributeProperty dest = new SewerSystemAttributeProperty();

        if (src.isSetSewerSystemAttribute())
            dest.setObject(unmarshalSewerSystemAttribute(src.getSewerSystemAttribute()));

        return dest;
    }

    private Waterway unmarshalWaterway(WaterwayType src) throws MissingADESchemaException {
        Waterway dest = new Waterway();
        unmarshalUrbanFacility(src, dest);

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        if (src.isSetStructure())
            dest.setStructure(helper.getGMLUnmarshaller().unmarshalCode(src.getStructure()));

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));

        return dest;
    }

    private EducationalAndCulturalFacility unmarshalEducationalAndCulturalFacility(EducationalAndCulturalFacilityType src) throws MissingADESchemaException {
        EducationalAndCulturalFacility dest = new EducationalAndCulturalFacility();
        unmarshalUrbanFacility(src, dest);
        return dest;
    }

    private MedicalFacility unmarshalMedicalFacility(MedicalFacilityType src) throws MissingADESchemaException {
        MedicalFacility dest = new MedicalFacility();
        unmarshalUrbanFacility(src, dest);
        return dest;
    }

    private SocialWelfareFacility unmarshalSocialWelfareFacility(SocialWelfareFacilityType src) throws MissingADESchemaException {
        SocialWelfareFacility dest = new SocialWelfareFacility();
        unmarshalUrbanFacility(src, dest);
        return dest;
    }

    private MarketsSlaughterhousesCrematoria unmarshalMarketsSlaughterhousesCrematoria(MarketsSlaughterhousesCrematoriaType src) throws MissingADESchemaException {
        MarketsSlaughterhousesCrematoria dest = new MarketsSlaughterhousesCrematoria();
        unmarshalUrbanFacility(src, dest);
        return dest;
    }

    private CollectiveHousingFacilities unmarshalCollectiveHousingFacilities(CollectiveHousingFacilitiesType src) throws MissingADESchemaException {
        CollectiveHousingFacilities dest = new CollectiveHousingFacilities();
        unmarshalUrbanFacility(src, dest);

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());

        if (src.isSetNumberOfLowRiseHousing())
            dest.setNumberOfLowRiseHousing(src.getNumberOfLowRiseHousing().intValue());

        if (src.isSetNumberOfMiddleRiseHousing())
            dest.setNumberOfMiddleRiseHousing(src.getNumberOfMiddleRiseHousing().intValue());

        if (src.isSetNumberOfHighRiseHousing())
            dest.setNumberOfHighRiseHousing(src.getNumberOfHighRiseHousing().intValue());

        if (src.isSetTotalNumberOfHousing())
            dest.setTotalNumberOfHousing(src.getTotalNumberOfHousing().intValue());

        if (src.isSetPublicFacilitiesAllocationPolicy())
            dest.setPublicFacilitiesAllocationPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilitiesAllocationPolicy()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private CollectiveGovernmentAndPublicOfficeFacilities unmarshalCollectiveGovernmentAndPublicOfficeFacilities(CollectiveGovernmentAndPublicOfficeFacilitiesType src) throws MissingADESchemaException {
        CollectiveGovernmentAndPublicOfficeFacilities dest = new CollectiveGovernmentAndPublicOfficeFacilities();
        unmarshalUrbanFacility(src, dest);

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());

        if (src.isSetPublicFacilitiesAllocationPolicy())
            dest.setPublicFacilitiesAllocationPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilitiesAllocationPolicy()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private CollectiveUrbanDisasterPreventionFacilities unmarshalCollectiveUrbanDisasterPreventionFacilities(CollectiveUrbanDisasterPreventionFacilitiesType src) throws MissingADESchemaException {
        CollectiveUrbanDisasterPreventionFacilities dest = new CollectiveUrbanDisasterPreventionFacilities();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetSpecificUtilityAndPublicFacilities())
            dest.setSpecificUtilityAndPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSpecificUtilityAndPublicFacilities()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        return dest;
    }

    private DistributionBusinessPark unmarshalDistributionBusinessPark(DistributionBusinessParkType src) throws MissingADESchemaException {
        DistributionBusinessPark dest = new DistributionBusinessPark();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetDistributionBusinessPark())
            dest.setDistributionBusinessPark(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDistributionBusinessPark()));

        if (src.isSetPublicAndUtilityFacilities())
            dest.setPublicAndUtilityFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicAndUtilityFacilities()));

        dest.setBuildingCoverageRate(src.getBuildingCoverageRate());
        dest.setFloorAreaRate(src.getFloorAreaRate());

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private void unmarshalUrbanFacilityStipulatedByCabinetOrder(UrbanFacilityStipulatedByCabinetOrderType src, UrbanFacilityStipulatedByCabinetOrder dest) throws MissingADESchemaException {
        unmarshalUrbanFacility(src, dest);

        if (src.isSetLength())
            dest.setLength(helper.getGMLUnmarshaller().unmarshalLength(src.getLength()));

        if (src.isSetWidth())
            dest.setWidth(helper.getGMLUnmarshaller().unmarshalLength(src.getWidth()));
    }

    private UrbanFacilityStipulatedByCabinetOrder unmarshalUrbanFacilityStipulatedByCabinetOrder(UrbanFacilityStipulatedByCabinetOrderType src) throws MissingADESchemaException {
        UrbanFacilityStipulatedByCabinetOrder dest = new UrbanFacilityStipulatedByCabinetOrder();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private TelecommunicationFacility unmarshalTelecommunicationFacility(TelecommunicationFacilityType src) throws MissingADESchemaException {
        TelecommunicationFacility dest = new TelecommunicationFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private WindProtectionFacility unmarshalWindProtectionFacility(WindProtectionFacilityType src) throws MissingADESchemaException {
        WindProtectionFacility dest = new WindProtectionFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private FireProtectionFacility unmarshalFireProtectionFacility(FireProtectionFacilityType src) throws MissingADESchemaException {
        FireProtectionFacility dest = new FireProtectionFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private FloodPreventionFacility unmarshalFloodPreventionFacility(FloodPreventionFacilityType src) throws MissingADESchemaException {
        FloodPreventionFacility dest = new FloodPreventionFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private SnowProtectionFacility unmarshalSnowProtectionFacility(SnowProtectionFacilityType src) throws MissingADESchemaException {
        SnowProtectionFacility dest = new SnowProtectionFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private SandControlFacility unmarshalSandControlFacility(SandControlFacilityType src) throws MissingADESchemaException {
        SandControlFacility dest = new SandControlFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private TideFacility unmarshalTideFacility(TideFacilityType src) throws MissingADESchemaException {
        TideFacility dest = new TideFacility();
        unmarshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private CollectiveFacilitiesForTsunamiDisasterPrevention unmarshalCollectiveFacilitiesForTsunamiDisasterPrevention(CollectiveFacilitiesForTsunamiDisasterPreventionType src) throws MissingADESchemaException {
        CollectiveFacilitiesForTsunamiDisasterPrevention dest = new CollectiveFacilitiesForTsunamiDisasterPrevention();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetHousingFacilities())
            dest.setHousingFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getHousingFacilities()));

        if (src.isSetSupecificBusinessFacilities())
            dest.setSupecificBusinessFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.isSetPublicFacilities())
            dest.setPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilities()));

        if (src.isSetUtilityFacilities())
            dest.setUtilityFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUtilityFacilities()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        return dest;
    }

    private CollectiveFacilitiesForReconstructionAndRevitalization unmarshalCollectiveFacilitiesForReconstructionAndRevitalization(CollectiveFacilitiesForReconstructionAndRevitalizationType src) throws MissingADESchemaException {
        CollectiveFacilitiesForReconstructionAndRevitalization dest = new CollectiveFacilitiesForReconstructionAndRevitalization();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetHousingFacilities())
            dest.setHousingFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getHousingFacilities()));

        if (src.isSetSupecificBusinessFacilities())
            dest.setSupecificBusinessFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.isSetPublicFacilities())
            dest.setPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilities()));

        if (src.isSetUtilityFacilities())
            dest.setUtilityFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUtilityFacilities()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        return dest;
    }

    private CollectiveFacilitiesForReconstruction unmarshalCollectiveFacilitiesForReconstruction(CollectiveFacilitiesForReconstructionType src) throws MissingADESchemaException {
        CollectiveFacilitiesForReconstruction dest = new CollectiveFacilitiesForReconstruction();
        unmarshalUrbanFacility(src, dest);

        if (src.isSetHousingFacilities())
            dest.setHousingFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getHousingFacilities()));

        if (src.isSetSupecificBusinessFacilities())
            dest.setSupecificBusinessFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.isSetPublicFacilities())
            dest.setPublicFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPublicFacilities()));

        if (src.isSetUtilityFacilities())
            dest.setUtilityFacilities(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUtilityFacilities()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());

        return dest;
    }

    private ThreeDimensionalExtent unmarshalThreeDimensionalExtent(jp.geospatial.iur._2_0.urf.ThreeDimensionalExtent src) throws MissingADESchemaException {
        ThreeDimensionalExtent dest = new ThreeDimensionalExtent();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetMinimumDistance())
            dest.setMinimumDistance(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumDistance()));

        if (src.isSetMaximumLoad())
            dest.setMaximumLoad(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMaximumLoad()));

        return dest;
    }

    private ThreeDimensionalExtentProperty unmarshalThreeDimensionalExtentProperty(ThreeDimensionalExtentPropertyType src) throws MissingADESchemaException {
        ThreeDimensionalExtentProperty dest = new ThreeDimensionalExtentProperty();

        if (src.isSetThreeDimensionalExtent())
            dest.setObject(unmarshalThreeDimensionalExtent(src.getThreeDimensionalExtent()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalAbstractDistrictPlan(AbstractDistrictPlanType src, AbstractDistrictPlan dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        if (src.isSetObjectives())
            dest.setObjectives(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getObjectives()));

        if (src.isSetPolicy())
            dest.setPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPolicy()));

        if (src.isSetDistrictDevelopmentPlan()) {
            for (DistrictDevelopmentPlanPropertyType districtDevelopmentPlan : src.getDistrictDevelopmentPlan())
                dest.getDistrictDevelopmentPlan().add(unmarshalDistrictDevelopmentPlanProperty(districtDevelopmentPlan));
        }

        if (src.isSetPromotionDistrict()) {
            for (PromotionDistrictPropertyType promotionDistrict : src.getPromotionDistrict())
                dest.getPromotionDistrict().add(unmarshalPromotionDistrictProperty(promotionDistrict));
        }
    }

    private DistrictPlan unmarshalDistrictPlan(DistrictPlanType src) throws MissingADESchemaException {
        DistrictPlan dest = new DistrictPlan();
        unmarshalAbstractDistrictPlan(src, dest);

        if (src.isSetFacilityAllocation())
            dest.setFacilityAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getFacilityAllocation()));

        if (src.isSetLandUsePolicy())
            dest.setLandUsePolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private DisasterPreventionBlockImprovementZonePlan unmarshalDisasterPreventionBlockImprovementZonePlan(DisasterPreventionBlockImprovementZonePlanType src) throws MissingADESchemaException {
        DisasterPreventionBlockImprovementZonePlan dest = new DisasterPreventionBlockImprovementZonePlan();
        unmarshalAbstractDistrictPlan(src, dest);

        if (src.isSetZonalDisasterPreventionFacilitiesAllocation())
            dest.setZonalDisasterPreventionFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getZonalDisasterPreventionFacilitiesAllocation()));

        if (src.isSetSpecifiedZonalDisasterPreventionFacilitiesAllocation())
            dest.setSpecifiedZonalDisasterPreventionFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSpecifiedZonalDisasterPreventionFacilitiesAllocation()));

        if (src.isSetZonalDisasterPreventionFacilities()) {
            for (ZonalDisasterPreventionFacilityPropertyType zonalDisasterPreventionFacilities : src.getZonalDisasterPreventionFacilities())
                dest.getZonalDisasterPreventionFacilities().add(unmarshalZonalDisasterPreventionFacilityProperty(zonalDisasterPreventionFacilities));
        }

        return dest;
    }

    private ZonalDisasterPreventionFacility unmarshalZonalDisasterPreventionFacility(ZonalDisasterPreventionFacilityType src) throws MissingADESchemaException {
        ZonalDisasterPreventionFacility dest = new ZonalDisasterPreventionFacility();
        unmarshalZone(src, dest);

        if (src.isSetFacilityType())
            dest.setFacilityType(helper.getGMLUnmarshaller().unmarshalCode(src.getFacilityType()));

        return dest;
    }

    private ZonalDisasterPreventionFacilityProperty unmarshalZonalDisasterPreventionFacilityProperty(ZonalDisasterPreventionFacilityPropertyType src) throws MissingADESchemaException {
        ZonalDisasterPreventionFacilityProperty dest = new ZonalDisasterPreventionFacilityProperty();

        if (src.isSetZonalDisasterPreventionFacility())
            dest.setObject(unmarshalZonalDisasterPreventionFacility(src.getZonalDisasterPreventionFacility()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private HistoricSceneryMaintenanceAndImprovementDistrictPlan unmarshalHistoricSceneryMaintenanceAndImprovementDistrictPlan(HistoricSceneryMaintenanceAndImprovementDistrictPlanType src) throws MissingADESchemaException {
        HistoricSceneryMaintenanceAndImprovementDistrictPlan dest = new HistoricSceneryMaintenanceAndImprovementDistrictPlan();
        unmarshalAbstractDistrictPlan(src, dest);

        if (src.isSetLandUsePolicy())
            dest.setLandUsePolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private RoadsideDistrictPlan unmarshalRoadsideDistrictPlan(RoadsideDistrictPlanType src) throws MissingADESchemaException {
        RoadsideDistrictPlan dest = new RoadsideDistrictPlan();
        unmarshalAbstractDistrictPlan(src, dest);

        if (src.isSetFacilitiesAllocation())
            dest.setFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getFacilitiesAllocation()));

        if (src.isSetLandUsePolicy())
            dest.setLandUsePolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private RuralDistrictPlan unmarshalRuralDistrictPlan(RuralDistrictPlanType src) throws MissingADESchemaException {
        RuralDistrictPlan dest = new RuralDistrictPlan();
        unmarshalAbstractDistrictPlan(src, dest);
        return dest;
    }

    private void unmarshalDistrictDevelopmentPlan(DistrictDevelopmentPlanType src, DistrictDevelopmentPlan dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        if (src.isSetDistrictFacilitiesAllocation())
            dest.setDistrictFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDistrictFacilitiesAllocation()));

        if (src.isSetBuildingRestrictions())
            dest.setBuildingRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingRestrictions()));

        if (src.isSetUrbanGreenSpaceConservation())
            dest.setUrbanGreenSpaceConservation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUrbanGreenSpaceConservation()));

        if (src.isSetActivityRestrictionInFarmland())
            dest.setActivityRestrictionInFarmland(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getActivityRestrictionInFarmland()));

        if (src.isSetLanduseRestrictions())
            dest.setLanduseRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getLanduseRestrictions()));

        if (src.isSetDistrictFacility()) {
            for (DistrictFacilityPropertyType districtFacility : src.getDistrictFacility())
                dest.getDistrictFacility().add(unmarshalDistrictFacilityProperty(districtFacility));
        }

        if (src.isSetDistrict()) {
            for (DistrictPropertyType district : src.getDistrict())
                dest.getDistrict().add(unmarshalDistrictProperty(district));
        }
    }

    private DistrictDevelopmentPlan unmarshalDistrictDevelopmentPlan(DistrictDevelopmentPlanType src) throws MissingADESchemaException {
        DistrictDevelopmentPlan dest = new DistrictDevelopmentPlan();
        unmarshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private SpecifiedBuildingZoneImprovementPlan unmarshalSpecifiedBuildingZoneImprovementPlan(SpecifiedBuildingZoneImprovementPlanType src) throws MissingADESchemaException {
        SpecifiedBuildingZoneImprovementPlan dest = new SpecifiedBuildingZoneImprovementPlan();
        unmarshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan unmarshalDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType src) throws MissingADESchemaException {
        DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan dest = new DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan();
        unmarshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict unmarshalDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType src) throws MissingADESchemaException {
        DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict dest = new DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict();
        unmarshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private RoadsideDistrictImprovementPlan unmarshalRoadsideDistrictImprovementPlan(RoadsideDistrictImprovementPlanType src) throws MissingADESchemaException {
        RoadsideDistrictImprovementPlan dest = new RoadsideDistrictImprovementPlan();
        unmarshalDistrictDevelopmentPlan(src, dest);

        if (src.isSetRoadsideDistrictFacilitiesAllocation())
            dest.setRoadsideDistrictFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getRoadsideDistrictFacilitiesAllocation()));

        return dest;
    }

    private RuralDistrictImprovementPlan unmarshalRuralDistrictImprovementPlan(RuralDistrictImprovementPlanType src) throws MissingADESchemaException {
        RuralDistrictImprovementPlan dest = new RuralDistrictImprovementPlan();
        unmarshalDistrictDevelopmentPlan(src, dest);

        if (src.isSetRuralDistrictFacilitiesAllocation())
            dest.setRuralDistrictFacilitiesAllocation(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getRuralDistrictFacilitiesAllocation()));

        return dest;
    }

    private DistrictDevelopmentPlanProperty unmarshalDistrictDevelopmentPlanProperty(DistrictDevelopmentPlanPropertyType src) throws MissingADESchemaException {
        DistrictDevelopmentPlanProperty dest = new DistrictDevelopmentPlanProperty();

        if (src.isSetDistrictDevelopmentPlan()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getDistrictDevelopmentPlan());
            if (object instanceof DistrictDevelopmentPlan)
                dest.setObject((DistrictDevelopmentPlan) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalDistrictFacility(DistrictFacilityType src, DistrictFacility dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);
    }

    private DistrictFacility unmarshalDistrictFacility(DistrictFacilityType src) throws MissingADESchemaException {
        DistrictFacility dest = new DistrictFacility();
        unmarshalDistrictFacility(src, dest);
        return dest;
    }

    private RoadsideDistrictFacility unmarshalRoadsideDistrictFacility(RoadsideDistrictFacilityType src) throws MissingADESchemaException {
        RoadsideDistrictFacility dest = new RoadsideDistrictFacility();
        unmarshalDistrictFacility(src, dest);
        return dest;
    }

    private RuralDistrictFacility unmarshalRuralDistrictFacility(RuralDistrictFacilityType src) throws MissingADESchemaException {
        RuralDistrictFacility dest = new RuralDistrictFacility();
        unmarshalDistrictFacility(src, dest);
        return dest;
    }

    private DistrictFacilityProperty unmarshalDistrictFacilityProperty(DistrictFacilityPropertyType src) throws MissingADESchemaException {
        DistrictFacilityProperty dest = new DistrictFacilityProperty();

        if (src.isSetDistrictFacility()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.getDistrictFacility());
            if (object instanceof DistrictFacility)
                dest.setObject((DistrictFacility) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private District unmarshalDistrict(DistrictType src) throws MissingADESchemaException {
        District dest = new District();
        unmarshalZone(src, dest);

        if (src.isSetBuildingRestrictions())
            dest.setBuildingRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingRestrictions()));

        if (src.isSetUseRestrictions())
            dest.setUseRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getUseRestrictions()));

        dest.setMaximumFloorAreaRate(src.getMaximumFloorAreaRate());
        dest.setMinimumFloorAreaRate(src.getMinimumFloorAreaRate());
        dest.setMaximumBuildingCoverageRate(src.getMaximumBuildingCoverageRate());
        dest.setMinimumBuildingCoverageRate(src.getMinimumBuildingCoverageRate());

        if (src.isSetMinimumSiteArea())
            dest.setMinimumSiteArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumSiteArea()));

        if (src.isSetMinimumBuildingArea())
            dest.setMinimumBuildingArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getMinimumBuildingArea()));

        if (src.isSetMinimumGroundHeight())
            dest.setMinimumGroundHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumGroundHeight()));

        if (src.isSetSetbackSize())
            dest.setSetbackSize(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getSetbackSize()));

        if (src.isSetStrucuturePlacementRestrictions())
            dest.setStrucuturePlacementRestrictions(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getStrucuturePlacementRestrictions()));

        if (src.isSetMaximumBuildingHeight())
            dest.setMaximumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMaximumBuildingHeight()));

        if (src.isSetMinimumBuildingHeight())
            dest.setMinimumBuildingHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumBuildingHeight()));

        if (src.isSetMinimumFloorHeight())
            dest.setMinimumFloorHeight(helper.getGMLUnmarshaller().unmarshalLength(src.getMinimumFloorHeight()));

        if (src.isSetBuildingDesignRestriction())
            dest.setBuildingDesignRestriction(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getBuildingDesignRestriction()));

        dest.setMinimumGreeningRate(src.getMinimumGreeningRate());

        if (src.isSetFenceGuideline())
            dest.setFenceGuideline(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getFenceGuideline()));

        if (src.isSetRestrictionsForFireProtection())
            dest.setRestrictionsForFireProtection(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getRestrictionsForFireProtection()));

        if (src.isSetRestrictionsForNoiseProtection())
            dest.setRestrictionsForNoiseProtection(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getRestrictionsForNoiseProtection()));

        dest.setMinimumFrontageRate(src.getMinimumFrontageRate());

        return dest;
    }

    private DistrictProperty unmarshalDistrictProperty(DistrictPropertyType src) throws MissingADESchemaException {
        DistrictProperty dest = new DistrictProperty();

        if (src.isSetDistrict())
            dest.setObject(unmarshalDistrict(src.getDistrict()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private PromotionDistrict unmarshalPromotionDistrict(PromotionDistrictType src) throws MissingADESchemaException {
        PromotionDistrict dest = new PromotionDistrict();
        unmarshalZone(src, dest);
        return dest;
    }

    private PromotionDistrictProperty unmarshalPromotionDistrictProperty(PromotionDistrictPropertyType src) throws MissingADESchemaException {
        PromotionDistrictProperty dest = new PromotionDistrictProperty();

        if (src.isSetPromotionDistrict())
            dest.setObject(unmarshalPromotionDistrict(src.getPromotionDistrict()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private void unmarshalUrgentUrbanRenewalArea(UrgentUrbanRenewalAreaType src, UrgentUrbanRenewalArea dest) throws MissingADESchemaException {
        unmarshalZone(src, dest);

        if (src.isSetDevelopmentPolicy())
            dest.setDevelopmentPolicy(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getDevelopmentPolicy()));

        if (src.isSetPrivateProject()) {
            for (PrivateUrbanRenewalProjectPlanPropertyType privateProject : src.getPrivateProject())
                dest.getPrivateProject().add(unmarshalPrivateUrbanRenewalProjectPlanProperty(privateProject));
        }

        if (src.isSetSpecifiedArea()) {
            for (SpecifiedUrgentUrbanRenewalAreaPropertyType specifiedArea : src.getSpecifiedArea())
                dest.getSpecifiedArea().add(unmarshalSpecifiedUrgentUrbanRenewalAreaProperty(specifiedArea));
        }

        if (src.isSetSpecialDistrict()) {
            for (SpecialUrbanRenaissanceDistrictPropertyType specialDistrict : src.getSpecialDistrict())
                dest.getSpecialDistrict().add(unmarshalSpecialUrbanRenaissanceDistrictProperty(specialDistrict));
        }
    }

    private UrgentUrbanRenewalArea unmarshalUrgentUrbanRenewalArea(UrgentUrbanRenewalAreaType src) throws MissingADESchemaException {
        UrgentUrbanRenewalArea dest = new UrgentUrbanRenewalArea();
        unmarshalUrgentUrbanRenewalArea(src, dest);
        return dest;
    }

    private SpecifiedUrgentUrbanRenewalArea unmarshalSpecifiedUrgentUrbanRenewalArea(SpecifiedUrgentUrbanRenewalAreaType src) throws MissingADESchemaException {
        SpecifiedUrgentUrbanRenewalArea dest = new SpecifiedUrgentUrbanRenewalArea();
        unmarshalUrgentUrbanRenewalArea(src, dest);

        if (src.isSetDevelopmentProject()) {
            for (GlobalHubCityDevelopmentProjectPropertyType developmentProject : src.getDevelopmentProject())
                dest.getDevelopmentProject().add(unmarshalGlobalHubCityDevelopmentProjectProperty(developmentProject));
        }

        return dest;
    }

    private SpecifiedUrgentUrbanRenewalAreaProperty unmarshalSpecifiedUrgentUrbanRenewalAreaProperty(SpecifiedUrgentUrbanRenewalAreaPropertyType src) throws MissingADESchemaException {
        SpecifiedUrgentUrbanRenewalAreaProperty dest = new SpecifiedUrgentUrbanRenewalAreaProperty();

        if (src.isSetSpecifiedUrgentUrbanRenewalArea())
            dest.setObject(unmarshalSpecifiedUrgentUrbanRenewalArea(src.getSpecifiedUrgentUrbanRenewalArea()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private GlobalHubCityDevelopmentProject unmarshalGlobalHubCityDevelopmentProject(GlobalHubCityDevelopmentProjectType src) throws MissingADESchemaException {
        GlobalHubCityDevelopmentProject dest = new GlobalHubCityDevelopmentProject();
        unmarshalZone(src, dest);

        dest.setImplementationBody(src.getImplementationBody());
        dest.setImplementationPeriod(src.getImplementationPeriod());

        if (src.isSetPlan())
            dest.setPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPlan()));

        return dest;
    }

    private GlobalHubCityDevelopmentProjectProperty unmarshalGlobalHubCityDevelopmentProjectProperty(GlobalHubCityDevelopmentProjectPropertyType src) throws MissingADESchemaException {
        GlobalHubCityDevelopmentProjectProperty dest = new GlobalHubCityDevelopmentProjectProperty();

        if (src.isSetGlobalHubCityDevelopmentProject())
            dest.setObject(unmarshalGlobalHubCityDevelopmentProject(src.getGlobalHubCityDevelopmentProject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private PrivateUrbanRenewalProjectPlan unmarshalPrivateUrbanRenewalProjectPlan(PrivateUrbanRenewalProjectPlanType src) throws MissingADESchemaException {
        PrivateUrbanRenewalProjectPlan dest = new PrivateUrbanRenewalProjectPlan();
        unmarshalZone(src, dest);

        dest.setDeveloper(src.getDeveloper());

        if (src.isSetPlan())
            dest.setPlan(helper.getGMLUnmarshaller().unmarshalStringOrRef(src.getPlan()));

        return dest;
    }

    private PrivateUrbanRenewalProjectPlanProperty unmarshalPrivateUrbanRenewalProjectPlanProperty(PrivateUrbanRenewalProjectPlanPropertyType src) throws MissingADESchemaException {
        PrivateUrbanRenewalProjectPlanProperty dest = new PrivateUrbanRenewalProjectPlanProperty();

        if (src.isSetPrivateUrbanRenewalProjectPlan())
            dest.setObject(unmarshalPrivateUrbanRenewalProjectPlan(src.getPrivateUrbanRenewalProjectPlan()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Agreement unmarshalAgreement(AgreementType src) throws MissingADESchemaException {
        Agreement dest = new Agreement();
        unmarshalZone(src, dest);
        return dest;
    }

    private Regulation unmarshalRegulation(RegulationType src) throws MissingADESchemaException {
        Regulation dest = new Regulation();
        unmarshalZone(src, dest);
        return dest;
    }

    private DevelopmentProject unmarshalDevelopmentProject(DevelopmentProjectType src) throws MissingADESchemaException {
        DevelopmentProject dest = new DevelopmentProject();
        unmarshalZone(src, dest);

        if (src.isSetStatus())
            dest.setStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getStatus()));

        if (src.isSetMainPurpose())
            dest.setMainPurpose(helper.getGMLUnmarshaller().unmarshalCode(src.getMainPurpose()));

        if (src.isSetBenefitArea())
            dest.setBenefitArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getBenefitArea()));

        dest.setBenefitPeriod(src.getBenefitPeriod());

        if (src.isSetCost())
            dest.setCost(src.getCost().intValue());

        if (src.isSetPlannedArea())
            dest.setPlannedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getPlannedArea()));

        if (src.isSetOngoingArea())
            dest.setOngoingArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getOngoingArea()));

        if (src.isSetCompletedArea())
            dest.setCompletedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getCompletedArea()));

        if (src.isSetDateOfDecision())
            dest.setDateOfDecision(src.getDateOfDecision().toGregorianCalendar().toZonedDateTime().toLocalDate());

        if (src.isSetDateOfDesignationForTemporaryReplotting())
            dest.setDateOfDesignationForTemporaryReplotting(src.getDateOfDesignationForTemporaryReplotting().toGregorianCalendar().toZonedDateTime().toLocalDate());

        return dest;
    }

    private SedimentDisasterProneArea unmarshalSedimentDisasterProneArea(SedimentDisasterProneAreaType src) throws MissingADESchemaException {
        SedimentDisasterProneArea dest = new SedimentDisasterProneArea();
        unmarshalZone(src, dest);

        if (src.isSetDisasterType())
            dest.setDisasterType(helper.getGMLUnmarshaller().unmarshalCode(src.getDisasterType()));

        if (src.isSetAreaType())
            dest.setAreaType(helper.getGMLUnmarshaller().unmarshalCode(src.getAreaType()));

        dest.setZoneNumber(src.getZoneNumber());
        dest.setZoneName(src.getZoneName());

        if (src.isSetStatus())
            dest.setStatus(helper.getGMLUnmarshaller().unmarshalCode(src.getStatus()));

        return dest;
    }

    private Boundary unmarshalBoundary(BoundaryType src) throws MissingADESchemaException {
        Boundary dest = new Boundary();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetOffset())
            dest.setOffset(helper.getGMLUnmarshaller().unmarshalLength(src.getOffset()));

        dest.setOffsetDirection(src.getOffsetDirection());

        return dest;
    }

    private BoundaryProperty unmarshalBoundaryProperty(BoundaryPropertyType src) throws MissingADESchemaException {
        BoundaryProperty dest = new BoundaryProperty();

        if (src.isSetBoundary())
            dest.setObject(unmarshalBoundary(src.getBoundary()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }

    private Administration unmarshalAdministration(AdministrationType src) throws MissingADESchemaException {
        Administration dest = new Administration();
        unmarshalUrbanFunction(src, dest);
        return dest;
    }

    private CensusBlock unmarshalCensusBlock(CensusBlockType src) throws MissingADESchemaException {
        CensusBlock dest = new CensusBlock();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDaytimePopulation())
            dest.setDaytimePopulation(src.getDaytimePopulation().intValue());

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.isSetNumberOfOrdinaryHouseholds())
            dest.setNumberOfOrdinaryHouseholds(src.getNumberOfOrdinaryHouseholds().intValue());

        if (src.isSetNumberOfHouseholdsByOwnership()) {
            for (NumberOfHouseholdsPropertyType numberOfHouseholdsByOwnership : src.getNumberOfHouseholdsByOwnership())
                dest.getNumberOfHouseholdsByOwnership().add(unmarshalNumberOfHouseholdsProperty(numberOfHouseholdsByOwnership));
        }

        if (src.isSetNumberOfMainHouseholds())
            dest.setNumberOfMainHouseholds(src.getNumberOfMainHouseholds().intValue());

        if (src.isSetNumberOfHouseholdsByStruture()) {
            for (NumberOfHouseholdsPropertyType numberOfHouseholdsByStruture : src.getNumberOfHouseholdsByStruture())
                dest.getNumberOfHouseholdsByStruture().add(unmarshalNumberOfHouseholdsProperty(numberOfHouseholdsByStruture));
        }

        return dest;
    }

    private NumberOfHouseholds unmarshalNumberOfHouseholds(NumberOfHouseholdsType src) throws MissingADESchemaException {
        NumberOfHouseholds dest = new NumberOfHouseholds();

        if (src.isSetClazz())
            dest.setClassifier(helper.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

        if (src.isSetNumber())
            dest.setNumber(src.getNumber().intValue());

        return dest;
    }

    private NumberOfHouseholdsProperty unmarshalNumberOfHouseholdsProperty(NumberOfHouseholdsPropertyType src) throws MissingADESchemaException {
        NumberOfHouseholdsProperty dest = new NumberOfHouseholdsProperty();

        if (src.isSetNumberOfHouseholds())
            dest.setObject(unmarshalNumberOfHouseholds(src.getNumberOfHouseholds()));

        return dest;
    }

    private DisasterDamage unmarshalDisasterDamage(DisasterDamageType src) throws MissingADESchemaException {
        DisasterDamage dest = new DisasterDamage();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDamagedArea())
            dest.setDamagedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDamagedArea()));

        if (src.isSetNumberOfDamagedHouses())
            dest.setNumberOfDamagedHouses(src.getNumberOfDamagedHouses().intValue());

        if (src.isSetNumberOfHousesFloodedAboveFloorLevel())
            dest.setNumberOfHousesFloodedAboveFloorLevel(src.getNumberOfHousesFloodedAboveFloorLevel().intValue());

        if (src.isSetNumberOfHousesFloodedBelowFloorLevel())
            dest.setNumberOfHousesFloodedBelowFloorLevel(src.getNumberOfHousesFloodedBelowFloorLevel().intValue());

        if (src.isSetMaximumRainfallPerHour())
            dest.setMaximumRainfallPerHour(src.getMaximumRainfallPerHour().intValue());

        if (src.isSetTotalRainfall())
            dest.setTotalRainfall(src.getTotalRainfall().intValue());

        return dest;
    }

    private Pollution unmarshalPollution(PollutionType src) throws MissingADESchemaException {
        Pollution dest = new Pollution();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetDamagedArea())
            dest.setDamagedArea(helper.getGMLUnmarshaller().unmarshalMeasure(src.getDamagedArea()));

        dest.setCause(src.getCause());

        return dest;
    }

    private DisasterPreventionBase unmarshalDisasterPreventionBase(DisasterPreventionBaseType src) throws MissingADESchemaException {
        DisasterPreventionBase dest = new DisasterPreventionBase();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        return dest;
    }

    private Recreations unmarshalRecreations(RecreationsType src) throws MissingADESchemaException {
        Recreations dest = new Recreations();
        unmarshalUrbanFunction(src, dest);

        if (src.isSetCapacity())
            dest.setCapacity(src.getCapacity().intValue());

        if (src.isSetNumberOfUsers())
            dest.setNumberOfUsers(src.getNumberOfUsers().intValue());

        return dest;
    }

    private HubCity unmarshalHubCity(HubCityType src) throws MissingADESchemaException {
        HubCity dest = new HubCity();
        unmarshalUrbanFunction(src, dest);
        return dest;
    }

    private LandUseDiversion unmarshalLandUseDiversion(LandUseDiversionType src) throws MissingADESchemaException {
        LandUseDiversion dest = new LandUseDiversion();
        unmarshalUrbanFunction(src, dest);
        return dest;
    }

    private Urbanization unmarshalUrbanization(UrbanizationType src) throws MissingADESchemaException {
        Urbanization dest = new Urbanization();
        unmarshalUrbanFunction(src, dest);

        dest.setPeriod(src.getPeriod());
        dest.setResources(src.getResources());

        return dest;
    }

    private PublicTransitFacility unmarshalPublicTransitFacility(PublicTransitFacilityType src) throws MissingADESchemaException {
        PublicTransitFacility dest = new PublicTransitFacility();
        unmarshalUrbanFunction(src, dest);

        dest.setRouteName(src.getRouteName());
        dest.setSectionName(src.getSectionName());
        dest.setCompanyName(src.getCompanyName());

        if (src.isSetFrequencyOfService())
            dest.setFrequencyOfService(src.getFrequencyOfService().intValue());

        if (src.isSetNumberOfCustomers())
            dest.setNumberOfCustomers(src.getNumberOfCustomers().intValue());

        return dest;
    }

    private TargetProperty unmarshalTargetProperty(TargetPropertyType src) throws MissingADESchemaException {
        TargetProperty dest = new TargetProperty();

        if (src.isSet_CityObject()) {
            ModelObject object = helper.getJAXBUnmarshaller().unmarshal(src.get_CityObject());
            if (object instanceof AbstractCityObject)
                dest.setObject((AbstractCityObject) object);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(XLinkType.fromValue(src.getType().value()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(XLinkShow.fromValue(src.getShow().value()));

        if (src.isSetActuate())
            dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));

        return dest;
    }
}
