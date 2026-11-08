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

import jp.geospatial.iur._3_1.urf.*;
import net.opengis.citygml._2.AbstractCityObjectType;
import org.citygml4j.ade.iur.bind.Marshaller;
import org.citygml4j.ade.iur.model.urf.*;
import org.citygml4j.ade.iur.model.urf.ThreeDimensionalExtent;
import org.citygml4j.ade.iur.model.urf.UrbanDevelopmentProjectType;
import org.citygml4j.ade.iur.model.urf.WeatherObservationType;
import org.citygml4j.builder.jaxb.marshal.citygml.ade.ADEMarshallerHelper;
import org.citygml4j.model.citygml.ade.binding.ADEMarshaller;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.util.mapper.TypeMapper;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;

public class UrbanFunctionMarshaller implements ADEMarshaller {
    private final Marshaller marshaller;
    private final ObjectFactory factory = new ObjectFactory();
    private ADEMarshallerHelper helper;
    private TypeMapper<JAXBElement<?>> elementMapper;
    private TypeMapper<Object> typeMapper;

    public UrbanFunctionMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    private synchronized TypeMapper<JAXBElement<?>> getElementMapper() {
        if (elementMapper == null) {
            elementMapper = TypeMapper.<JAXBElement<?>>create()
                    .with(Zone.class, this::createZone)
                    .with(UrbanPlanningArea.class, this::createUrbanPlanningArea)
                    .with(QuasiUrbanPlanningArea.class, this::createQuasiUrbanPlanningArea)
                    .with(AreaClassification.class, this::createAreaClassification)
                    .with(DistrictsAndZones.class, this::createDistrictsAndZones)
                    .with(UseDistrict.class, this::createUseDistrict)
                    .with(SpecialUseDistrict.class, this::createSpecialUseDistrict)
                    .with(SpecialUseRestrictionDistrict.class, this::createSpecialUseRestrictionDistrict)
                    .with(ExceptionalFloorAreaRateDistrict.class, this::createExceptionalFloorAreaRateDistrict)
                    .with(HighRiseResidentialAttractionDistrict.class, this::createHighRiseResidentialAttractionDistrict)
                    .with(HeightControlDistrict.class, this::createHeightControlDistrict)
                    .with(HighLevelUseDistrict.class, this::createHighLevelUseDistrict)
                    .with(SpecifiedBlock.class, this::createSpecifiedBlock)
                    .with(SpecialUrbanRenaissanceDistrict.class, this::createSpecialUrbanRenaissanceDistrict)
                    .with(HousingControlArea.class, this::createHousingControlArea)
                    .with(ResidentialEnvironmentImprovementDistrict.class, this::createResidentialEnvironmentImprovementDistrict)
                    .with(SpecialUseAttractionDistrict.class, this::createSpecialUseAttractionDistrict)
                    .with(FirePreventionDistrict.class, this::createFirePreventionDistrict)
                    .with(SpecifiedDisasterPreventionBlockImprovementZone.class, this::createSpecifiedDisasterPreventionBlockImprovementZone)
                    .with(LandscapeZone.class, this::createLandscapeZone)
                    .with(ScenicDistrict.class, this::createScenicDistrict)
                    .with(ParkingPlaceDevelopmentZone.class, this::createParkingPlaceDevelopmentZone)
                    .with(PortZone.class, this::createPortZone)
                    .with(SpecialZoneForPreservationOfHistoricalLandscape.class, this::createSpecialZoneForPreservationOfHistoricalLandscape)
                    .with(ZoneForPreservationOfHistoricalLandscape.class, this::createZoneForPreservationOfHistoricalLandscape)
                    .with(GreenSpaceConservationDistrict.class, this::createGreenSpaceConservationDistrict)
                    .with(SpecialGreenSpaceConservationDistrict.class, this::createSpecialGreenSpaceConservationDistrict)
                    .with(TreePlantingDistrict.class, this::createTreePlantingDistrict)
                    .with(DistributionBusinessZone.class, this::createDistributionBusinessZone)
                    .with(ProductiveGreenZone.class, this::createProductiveGreenZone)
                    .with(ConservationZoneForClustersOfTraditionalStructures.class, this::createConservationZoneForClustersOfTraditionalStructures)
                    .with(AircraftNoiseControlZone.class, this::createAircraftNoiseControlZone)
                    .with(ProjectPromotionArea.class, this::createProjectPromotionArea)
                    .with(UrbanRedevelopmentPromotionArea.class, this::createUrbanRedevelopmentPromotionArea)
                    .with(LandReadjustmentPromotionArea.class, this::createLandReadjustmentPromotionArea)
                    .with(ResidentialBlockConstructionPromotionArea.class, this::createResidentialBlockConstructionPromotionArea)
                    .with(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment.class, this::createLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment)
                    .with(UnusedLandUsePromotionArea.class, this::createUnusedLandUsePromotionArea)
                    .with(UrbanDisasterRecoveryPromotionArea.class, this::createUrbanDisasterRecoveryPromotionArea)
                    .with(UrbanDevelopmentProject.class, this::createUrbanDevelopmentProject)
                    .with(LandReadjustmentProject.class, this::createLandReadjustmentProject)
                    .with(NewHousingAndUrbanDevelopmentProject.class, this::createNewHousingAndUrbanDevelopmentProject)
                    .with(IndustrialParkDevelopmentProject.class, this::createIndustrialParkDevelopmentProject)
                    .with(UrbanRedevelopmentProject.class, this::createUrbanRedevelopmentProject)
                    .with(NewUrbanInfrastructureProject.class, this::createNewUrbanInfrastructureProject)
                    .with(ResidentialBlockConstructionProject.class, this::createResidentialBlockConstructionProject)
                    .with(DisasterPreventionBlockImprovementProject.class, this::createDisasterPreventionBlockImprovementProject)
                    .with(UrbanRenewalProject.class, this::createUrbanRenewalProject)
                    .with(ScheduledAreaForUrbanDevelopmentProject.class, this::createScheduledAreaForUrbanDevelopmentProject)
                    .with(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects.class, this::createScheduledAreaForNewHousingAndUrbanDevelopmentProjects)
                    .with(ScheduledAreaForIndustrialParkDevelopmentProjects.class, this::createScheduledAreaForIndustrialParkDevelopmentProjects)
                    .with(ScheduledAreaForNewUrbanInfrastructureProjects.class, this::createScheduledAreaForNewUrbanInfrastructureProjects)
                    .with(ScheduledAreaForCollectiveHousingFacilities.class, this::createScheduledAreaForCollectiveHousingFacilities)
                    .with(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities.class, this::createScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(ScheduledAreaForDistributionBusinessPark.class, this::createScheduledAreaForDistributionBusinessPark)
                    .with(UrbanFacility.class, this::createUrbanFacility)
                    .with(TrafficFacility.class, this::createTrafficFacility)
                    .with(UrbanRoadAttribute.class, this::createUrbanRoadAttribute)
                    .with(StructureDetails.class, this::createStructureDetails)
                    .with(UrbanRapidTransitRailroadAttribute.class, this::createUrbanRapidTransitRailroadAttribute)
                    .with(ParkingPlaceAttribute.class, this::createParkingPlaceAttribute)
                    .with(VehicleTerminalAttribute.class, this::createVehicleTerminalAttribute)
                    .with(OpenSpaceForPublicUse.class, this::createOpenSpaceForPublicUse)
                    .with(ParkAttribute.class, this::createParkAttribute)
                    .with(SupplyFacility.class, this::createSupplyFacility)
                    .with(WaterWorksAttribute.class, this::createWaterWorksAttribute)
                    .with(TreatmentFacility.class, this::createTreatmentFacility)
                    .with(SewerSystemAttribute.class, this::createSewerSystemAttribute)
                    .with(Waterway.class, this::createWaterway)
                    .with(EducationalAndCulturalFacility.class, this::createEducationalAndCulturalFacility)
                    .with(MedicalFacility.class, this::createMedicalFacility)
                    .with(SocialWelfareFacility.class, this::createSocialWelfareFacility)
                    .with(MarketsSlaughterhousesCrematoria.class, this::createMarketsSlaughterhousesCrematoria)
                    .with(CollectiveHousingFacilities.class, this::createCollectiveHousingFacilities)
                    .with(CollectiveGovernmentAndPublicOfficeFacilities.class, this::createCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(CollectiveUrbanDisasterPreventionFacilities.class, this::createCollectiveUrbanDisasterPreventionFacilities)
                    .with(DistributionBusinessPark.class, this::createDistributionBusinessPark)
                    .with(UrbanFacilityStipulatedByCabinetOrder.class, this::createUrbanFacilityStipulatedByCabinetOrder)
                    .with(TelecommunicationFacility.class, this::createTelecommunicationFacility)
                    .with(WindProtectionFacility.class, this::createWindProtectionFacility)
                    .with(FireProtectionFacility.class, this::createFireProtectionFacility)
                    .with(FloodPreventionFacility.class, this::createFloodPreventionFacility)
                    .with(SnowProtectionFacility.class, this::createSnowProtectionFacility)
                    .with(SandControlFacility.class, this::createSandControlFacility)
                    .with(TideFacility.class, this::createTideFacility)
                    .with(CollectiveFacilitiesForTsunamiDisasterPrevention.class, this::createCollectiveFacilitiesForTsunamiDisasterPrevention)
                    .with(CollectiveFacilitiesForReconstructionAndRevitalization.class, this::createCollectiveFacilitiesForReconstructionAndRevitalization)
                    .with(CollectiveFacilitiesForReconstruction.class, this::createCollectiveFacilitiesForReconstruction)
                    .with(ThreeDimensionalExtent.class, this::createThreeDimensionalExtent)
                    .with(DistrictPlan.class, this::createDistrictPlan)
                    .with(DisasterPreventionBlockImprovementZonePlan.class, this::createDisasterPreventionBlockImprovementZonePlan)
                    .with(ZonalDisasterPreventionFacility.class, this::createZonalDisasterPreventionFacility)
                    .with(HistoricSceneryMaintenanceAndImprovementDistrictPlan.class, this::createHistoricSceneryMaintenanceAndImprovementDistrictPlan)
                    .with(RoadsideDistrictPlan.class, this::createRoadsideDistrictPlan)
                    .with(RuralDistrictPlan.class, this::createRuralDistrictPlan)
                    .with(DistrictDevelopmentPlan.class, this::createDistrictDevelopmentPlan)
                    .with(SpecifiedBuildingZoneImprovementPlan.class, this::createSpecifiedBuildingZoneImprovementPlan)
                    .with(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan.class, this::createDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan)
                    .with(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict.class, this::createDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict)
                    .with(RoadsideDistrictImprovementPlan.class, this::createRoadsideDistrictImprovementPlan)
                    .with(RuralDistrictImprovementPlan.class, this::createRuralDistrictImprovementPlan)
                    .with(DistrictFacility.class, this::createDistrictFacility)
                    .with(RoadsideDistrictFacility.class, this::createRoadsideDistrictFacility)
                    .with(RuralDistrictFacility.class, this::createRuralDistrictFacility)
                    .with(District.class, this::createDistrict)
                    .with(PromotionDistrict.class, this::createPromotionDistrict)
                    .with(UrgentUrbanRenewalArea.class, this::createUrgentUrbanRenewalArea)
                    .with(SpecifiedUrgentUrbanRenewalArea.class, this::createSpecifiedUrgentUrbanRenewalArea)
                    .with(GlobalHubCityDevelopmentProject.class, this::createGlobalHubCityDevelopmentProject)
                    .with(PrivateUrbanRenewalProjectPlan.class, this::createPrivateUrbanRenewalProjectPlan)
                    .with(Agreement.class, this::createAgreement)
                    .with(Regulation.class, this::createRegulation)
                    .with(SedimentDisasterProneArea.class, this::createSedimentDisasterProneArea)
                    .with(UnclassifiedBlankArea.class, this::createUnclassifiedBlankArea)
                    .with(UnclassifiedUseDistrict.class, this::createUnclassifiedUseDistrict)
                    .with(ResidenceAttractionArea.class, this::createResidenceAttractionArea)
                    .with(UrbanFunctionAttractionArea.class, this::createUrbanFunctionAttractionArea)
                    .with(Boundary.class, this::createBoundary)
                    .with(UrbanParkAttribute.class, this::createUrbanParkAttribute)
                    .with(BreakdownOfNominalArea.class, this::createBreakdownOfNominalArea)
                    .with(Administration.class, this::createAdministration)
                    .with(DisasterDamage.class, this::createDisasterDamage)
                    .with(Pollution.class, this::createPollution)
                    .with(ObservationPoint.class, this::createObservationPoint)
                    .with(DisasterPreventionBase.class, this::createDisasterPreventionBase)
                    .with(Recreations.class, this::createRecreations)
                    .with(HubCity.class, this::createHubCity)
                    .with(LandUseDiversion.class, this::createLandUseDiversion)
                    .with(FarmlandConversionType.class, this::createFarmlandConversionType)
                    .with(ForestConversionType.class, this::createForestConversionType)
                    .with(Urbanization.class, this::createUrbanization)
                    .with(DID.class, this::createDID)
                    .with(CensusBlock.class, this::createCensusBlock)
                    .with(PopulationType.class, this::createPopulationType)
                    .with(PopulationByAgeAndSexType.class, this::createPopulationByAgeAndSexType)
                    .with(DaytimePopulationType.class, this::createDaytimePopulationType)
                    .with(EconomicActivityType.class, this::createEconomicActivityType)
                    .with(EconomicActivitySumType.class, this::createEconomicActivitySumType)
                    .with(DevelopmentProject.class, this::createDevelopmentProject)
                    .with(ResidentialDevelopmentType.class, this::createResidentialDevelopmentType)
                    .with(UrbanDevelopmentProjectType.class, this::createUrbanDevelopmentProjectType)
                    .with(AgriculturalDevelopmentProjectType.class, this::createAgriculturalDevelopmentProjectType)
                    .with(NewHousing.class, this::createNewHousing)
                    .with(UrbanFacilityStatus.class, this::createUrbanFacilityStatus)
                    .with(PublicTransitFacility.class, this::createPublicTransitFacility)
                    .with(LandPrice.class, this::createLandPrice)
                    .with(ValueByCodes.class, this::createValueByCodes)
                    .with(NaturalConditions.class, this::createNaturalConditions)
                    .with(WeatherObservation.class, this::createWeatherObservation)
                    .with(WeatherObservationType.class, this::createWeatherObservationType)
                    .with(GreenSpace.class, this::createGreenSpace)
                    .with(DistributionOfFloraAndFauna.class, this::createDistributionOfFloraAndFauna)
                    .with(ScenicResource.class, this::createScenicResource);
        }

        return elementMapper;
    }

    private synchronized TypeMapper<Object> getTypeMapper() {
        if (typeMapper == null) {
            typeMapper = TypeMapper.create()
                    .with(Zone.class, this::marshalZone)
                    .with(UrbanPlanningArea.class, this::marshalUrbanPlanningArea)
                    .with(QuasiUrbanPlanningArea.class, this::marshalQuasiUrbanPlanningArea)
                    .with(AreaClassification.class, this::marshalAreaClassification)
                    .with(DistrictsAndZones.class, this::marshalDistrictsAndZones)
                    .with(UseDistrict.class, this::marshalUseDistrict)
                    .with(SpecialUseDistrict.class, this::marshalSpecialUseDistrict)
                    .with(SpecialUseRestrictionDistrict.class, this::marshalSpecialUseRestrictionDistrict)
                    .with(ExceptionalFloorAreaRateDistrict.class, this::marshalExceptionalFloorAreaRateDistrict)
                    .with(HighRiseResidentialAttractionDistrict.class, this::marshalHighRiseResidentialAttractionDistrict)
                    .with(HeightControlDistrict.class, this::marshalHeightControlDistrict)
                    .with(HighLevelUseDistrict.class, this::marshalHighLevelUseDistrict)
                    .with(SpecifiedBlock.class, this::marshalSpecifiedBlock)
                    .with(SpecialUrbanRenaissanceDistrict.class, this::marshalSpecialUrbanRenaissanceDistrict)
                    .with(SpecialUrbanRenaissanceDistrictProperty.class, this::marshalSpecialUrbanRenaissanceDistrictProperty)
                    .with(HousingControlArea.class, this::marshalHousingControlArea)
                    .with(ResidentialEnvironmentImprovementDistrict.class, this::marshalResidentialEnvironmentImprovementDistrict)
                    .with(SpecialUseAttractionDistrict.class, this::marshalSpecialUseAttractionDistrict)
                    .with(FirePreventionDistrict.class, this::marshalFirePreventionDistrict)
                    .with(SpecifiedDisasterPreventionBlockImprovementZone.class, this::marshalSpecifiedDisasterPreventionBlockImprovementZone)
                    .with(LandscapeZone.class, this::marshalLandscapeZone)
                    .with(ScenicDistrict.class, this::marshalScenicDistrict)
                    .with(ParkingPlaceDevelopmentZone.class, this::marshalParkingPlaceDevelopmentZone)
                    .with(PortZone.class, this::marshalPortZone)
                    .with(SpecialZoneForPreservationOfHistoricalLandscape.class, this::marshalSpecialZoneForPreservationOfHistoricalLandscape)
                    .with(ZoneForPreservationOfHistoricalLandscape.class, this::marshalZoneForPreservationOfHistoricalLandscape)
                    .with(GreenSpaceConservationDistrict.class, this::marshalGreenSpaceConservationDistrict)
                    .with(SpecialGreenSpaceConservationDistrict.class, this::marshalSpecialGreenSpaceConservationDistrict)
                    .with(TreePlantingDistrict.class, this::marshalTreePlantingDistrict)
                    .with(DistributionBusinessZone.class, this::marshalDistributionBusinessZone)
                    .with(ProductiveGreenZone.class, this::marshalProductiveGreenZone)
                    .with(ConservationZoneForClustersOfTraditionalStructures.class, this::marshalConservationZoneForClustersOfTraditionalStructures)
                    .with(AircraftNoiseControlZone.class, this::marshalAircraftNoiseControlZone)
                    .with(ProjectPromotionArea.class, this::marshalProjectPromotionArea)
                    .with(UrbanRedevelopmentPromotionArea.class, this::marshalUrbanRedevelopmentPromotionArea)
                    .with(LandReadjustmentPromotionArea.class, this::marshalLandReadjustmentPromotionArea)
                    .with(ResidentialBlockConstructionPromotionArea.class, this::marshalResidentialBlockConstructionPromotionArea)
                    .with(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment.class, this::marshalLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment)
                    .with(UnusedLandUsePromotionArea.class, this::marshalUnusedLandUsePromotionArea)
                    .with(UrbanDisasterRecoveryPromotionArea.class, this::marshalUrbanDisasterRecoveryPromotionArea)
                    .with(UrbanDevelopmentProject.class, this::marshalUrbanDevelopmentProject)
                    .with(LandReadjustmentProject.class, this::marshalLandReadjustmentProject)
                    .with(NewHousingAndUrbanDevelopmentProject.class, this::marshalNewHousingAndUrbanDevelopmentProject)
                    .with(IndustrialParkDevelopmentProject.class, this::marshalIndustrialParkDevelopmentProject)
                    .with(UrbanRedevelopmentProject.class, this::marshalUrbanRedevelopmentProject)
                    .with(NewUrbanInfrastructureProject.class, this::marshalNewUrbanInfrastructureProject)
                    .with(ResidentialBlockConstructionProject.class, this::marshalResidentialBlockConstructionProject)
                    .with(DisasterPreventionBlockImprovementProject.class, this::marshalDisasterPreventionBlockImprovementProject)
                    .with(UrbanRenewalProject.class, this::marshalUrbanRenewalProject)
                    .with(ScheduledAreaForUrbanDevelopmentProject.class, this::marshalScheduledAreaForUrbanDevelopmentProject)
                    .with(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects.class, this::marshalScheduledAreaForNewHousingAndUrbanDevelopmentProjects)
                    .with(ScheduledAreaForIndustrialParkDevelopmentProjects.class, this::marshalScheduledAreaForIndustrialParkDevelopmentProjects)
                    .with(ScheduledAreaForNewUrbanInfrastructureProjects.class, this::marshalScheduledAreaForNewUrbanInfrastructureProjects)
                    .with(ScheduledAreaForCollectiveHousingFacilities.class, this::marshalScheduledAreaForCollectiveHousingFacilities)
                    .with(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities.class, this::marshalScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(ScheduledAreaForDistributionBusinessPark.class, this::marshalScheduledAreaForDistributionBusinessPark)
                    .with(UrbanFacility.class, this::marshalUrbanFacility)
                    .with(TrafficFacility.class, this::marshalTrafficFacility)
                    .with(UrbanRoadAttribute.class, this::marshalUrbanRoadAttribute)
                    .with(UrbanRoadAttributeProperty.class, this::marshalUrbanRoadAttributeProperty)
                    .with(StructureDetails.class, this::marshalStructureDetails)
                    .with(StructureDetailsProperty.class, this::marshalStructureDetailsProperty)
                    .with(UrbanRapidTransitRailroadAttribute.class, this::marshalUrbanRapidTransitRailroadAttribute)
                    .with(UrbanRapidTransitRailroadAttributeProperty.class, this::marshalUrbanRapidTransitRailroadAttributeProperty)
                    .with(ParkingPlaceAttribute.class, this::marshalParkingPlaceAttribute)
                    .with(ParkingPlaceAttributeProperty.class, this::marshalParkingPlaceAttributeProperty)
                    .with(VehicleTerminalAttribute.class, this::marshalVehicleTerminalAttribute)
                    .with(VehicleTerminalAttributeProperty.class, this::marshalVehicleTerminalAttributeProperty)
                    .with(OpenSpaceForPublicUse.class, this::marshalOpenSpaceForPublicUse)
                    .with(ParkAttribute.class, this::marshalParkAttribute)
                    .with(ParkAttributeProperty.class, this::marshalParkAttributeProperty)
                    .with(SupplyFacility.class, this::marshalSupplyFacility)
                    .with(WaterWorksAttribute.class, this::marshalWaterWorksAttribute)
                    .with(WaterWorksAttributeProperty.class, this::marshalWaterWorksAttributeProperty)
                    .with(TreatmentFacility.class, this::marshalTreatmentFacility)
                    .with(SewerSystemAttribute.class, this::marshalSewerSystemAttribute)
                    .with(SewerSystemAttributeProperty.class, this::marshalSewerSystemAttributeProperty)
                    .with(Waterway.class, this::marshalWaterway)
                    .with(EducationalAndCulturalFacility.class, this::marshalEducationalAndCulturalFacility)
                    .with(MedicalFacility.class, this::marshalMedicalFacility)
                    .with(SocialWelfareFacility.class, this::marshalSocialWelfareFacility)
                    .with(MarketsSlaughterhousesCrematoria.class, this::marshalMarketsSlaughterhousesCrematoria)
                    .with(CollectiveHousingFacilities.class, this::marshalCollectiveHousingFacilities)
                    .with(CollectiveGovernmentAndPublicOfficeFacilities.class, this::marshalCollectiveGovernmentAndPublicOfficeFacilities)
                    .with(CollectiveUrbanDisasterPreventionFacilities.class, this::marshalCollectiveUrbanDisasterPreventionFacilities)
                    .with(DistributionBusinessPark.class, this::marshalDistributionBusinessPark)
                    .with(UrbanFacilityStipulatedByCabinetOrder.class, this::marshalUrbanFacilityStipulatedByCabinetOrder)
                    .with(TelecommunicationFacility.class, this::marshalTelecommunicationFacility)
                    .with(WindProtectionFacility.class, this::marshalWindProtectionFacility)
                    .with(FireProtectionFacility.class, this::marshalFireProtectionFacility)
                    .with(FloodPreventionFacility.class, this::marshalFloodPreventionFacility)
                    .with(SnowProtectionFacility.class, this::marshalSnowProtectionFacility)
                    .with(SandControlFacility.class, this::marshalSandControlFacility)
                    .with(TideFacility.class, this::marshalTideFacility)
                    .with(CollectiveFacilitiesForTsunamiDisasterPrevention.class, this::marshalCollectiveFacilitiesForTsunamiDisasterPrevention)
                    .with(CollectiveFacilitiesForReconstructionAndRevitalization.class, this::marshalCollectiveFacilitiesForReconstructionAndRevitalization)
                    .with(CollectiveFacilitiesForReconstruction.class, this::marshalCollectiveFacilitiesForReconstruction)
                    .with(ThreeDimensionalExtent.class, this::marshalThreeDimensionalExtent)
                    .with(ThreeDimensionalExtentProperty.class, this::marshalThreeDimensionalExtentProperty)
                    .with(DistrictPlan.class, this::marshalDistrictPlan)
                    .with(DisasterPreventionBlockImprovementZonePlan.class, this::marshalDisasterPreventionBlockImprovementZonePlan)
                    .with(ZonalDisasterPreventionFacility.class, this::marshalZonalDisasterPreventionFacility)
                    .with(ZonalDisasterPreventionFacilityProperty.class, this::marshalZonalDisasterPreventionFacilityProperty)
                    .with(HistoricSceneryMaintenanceAndImprovementDistrictPlan.class, this::marshalHistoricSceneryMaintenanceAndImprovementDistrictPlan)
                    .with(RoadsideDistrictPlan.class, this::marshalRoadsideDistrictPlan)
                    .with(RuralDistrictPlan.class, this::marshalRuralDistrictPlan)
                    .with(DistrictDevelopmentPlan.class, this::marshalDistrictDevelopmentPlan)
                    .with(SpecifiedBuildingZoneImprovementPlan.class, this::marshalSpecifiedBuildingZoneImprovementPlan)
                    .with(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan.class, this::marshalDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan)
                    .with(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict.class, this::marshalDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict)
                    .with(RoadsideDistrictImprovementPlan.class, this::marshalRoadsideDistrictImprovementPlan)
                    .with(RuralDistrictImprovementPlan.class, this::marshalRuralDistrictImprovementPlan)
                    .with(DistrictDevelopmentPlanProperty.class, this::marshalDistrictDevelopmentPlanProperty)
                    .with(DistrictFacility.class, this::marshalDistrictFacility)
                    .with(RoadsideDistrictFacility.class, this::marshalRoadsideDistrictFacility)
                    .with(RuralDistrictFacility.class, this::marshalRuralDistrictFacility)
                    .with(DistrictFacilityProperty.class, this::marshalDistrictFacilityProperty)
                    .with(District.class, this::marshalDistrict)
                    .with(DistrictProperty.class, this::marshalDistrictProperty)
                    .with(PromotionDistrict.class, this::marshalPromotionDistrict)
                    .with(PromotionDistrictProperty.class, this::marshalPromotionDistrictProperty)
                    .with(UrgentUrbanRenewalArea.class, this::marshalUrgentUrbanRenewalArea)
                    .with(SpecifiedUrgentUrbanRenewalArea.class, this::marshalSpecifiedUrgentUrbanRenewalArea)
                    .with(SpecifiedUrgentUrbanRenewalAreaProperty.class, this::marshalSpecifiedUrgentUrbanRenewalAreaProperty)
                    .with(GlobalHubCityDevelopmentProject.class, this::marshalGlobalHubCityDevelopmentProject)
                    .with(GlobalHubCityDevelopmentProjectProperty.class, this::marshalGlobalHubCityDevelopmentProjectProperty)
                    .with(PrivateUrbanRenewalProjectPlan.class, this::marshalPrivateUrbanRenewalProjectPlan)
                    .with(PrivateUrbanRenewalProjectPlanProperty.class, this::marshalPrivateUrbanRenewalProjectPlanProperty)
                    .with(Agreement.class, this::marshalAgreement)
                    .with(Regulation.class, this::marshalRegulation)
                    .with(SedimentDisasterProneArea.class, this::marshalSedimentDisasterProneArea)
                    .with(UnclassifiedBlankArea.class, this::marshalUnclassifiedBlankArea)
                    .with(UnclassifiedUseDistrict.class, this::marshalUnclassifiedUseDistrict)
                    .with(ResidenceAttractionArea.class, this::marshalResidenceAttractionArea)
                    .with(UrbanFunctionAttractionArea.class, this::marshalUrbanFunctionAttractionArea)
                    .with(Boundary.class, this::marshalBoundary)
                    .with(BoundaryProperty.class, this::marshalBoundaryProperty)
                    .with(UrbanParkAttribute.class, this::marshalUrbanParkAttribute)
                    .with(UrbanParkAttributeProperty.class, this::marshalUrbanParkAttributeProperty)
                    .with(BreakdownOfNominalArea.class, this::marshalBreakdownOfNominalArea)
                    .with(BreakdownOfNominalAreaProperty.class, this::marshalBreakdownOfNominalAreaProperty)
                    .with(Administration.class, this::marshalAdministration)
                    .with(DisasterDamage.class, this::marshalDisasterDamage)
                    .with(Pollution.class, this::marshalPollution)
                    .with(ObservationPoint.class, this::marshalObservationPoint)
                    .with(ObservationPointProperty.class, this::marshalObservationPointProperty)
                    .with(DisasterPreventionBase.class, this::marshalDisasterPreventionBase)
                    .with(Recreations.class, this::marshalRecreations)
                    .with(HubCity.class, this::marshalHubCity)
                    .with(LandUseDiversion.class, this::marshalLandUseDiversion)
                    .with(FarmlandConversionType.class, this::marshalFarmlandConversionType)
                    .with(FarmlandConversionTypeProperty.class, this::marshalFarmlandConversionTypeProperty)
                    .with(ForestConversionType.class, this::marshalForestConversionType)
                    .with(ForestConversionTypeProperty.class, this::marshalForestConversionTypeProperty)
                    .with(Urbanization.class, this::marshalUrbanization)
                    .with(DID.class, this::marshalDID)
                    .with(CensusBlock.class, this::marshalCensusBlock)
                    .with(PopulationType.class, this::marshalPopulationType)
                    .with(PopulationTypeProperty.class, this::marshalPopulationTypeProperty)
                    .with(PopulationByAgeAndSexType.class, this::marshalPopulationByAgeAndSexType)
                    .with(PopulationByAgeAndSexTypeProperty.class, this::marshalPopulationByAgeAndSexTypeProperty)
                    .with(DaytimePopulationType.class, this::marshalDaytimePopulationType)
                    .with(DaytimePopulationTypeProperty.class, this::marshalDaytimePopulationTypeProperty)
                    .with(EconomicActivityType.class, this::marshalEconomicActivityType)
                    .with(EconomicActivityTypeProperty.class, this::marshalEconomicActivityTypeProperty)
                    .with(EconomicActivitySumType.class, this::marshalEconomicActivitySumType)
                    .with(EconomicActivitySumTypeProperty.class, this::marshalEconomicActivitySumTypeProperty)
                    .with(DevelopmentProject.class, this::marshalDevelopmentProject)
                    .with(ResidentialDevelopmentType.class, this::marshalResidentialDevelopmentType)
                    .with(ResidentialDevelopmentTypeProperty.class, this::marshalResidentialDevelopmentTypeProperty)
                    .with(UrbanDevelopmentProjectType.class, this::marshalUrbanDevelopmentProjectType)
                    .with(UrbanDevelopmentProjectTypeProperty.class, this::marshalUrbanDevelopmentProjectTypeProperty)
                    .with(AgriculturalDevelopmentProjectType.class, this::marshalAgriculturalDevelopmentProjectType)
                    .with(AgriculturalDevelopmentProjectTypeProperty.class, this::marshalAgriculturalDevelopmentProjectTypeProperty)
                    .with(NewHousing.class, this::marshalNewHousing)
                    .with(UrbanFacilityStatus.class, this::marshalUrbanFacilityStatus)
                    .with(PublicTransitFacility.class, this::marshalPublicTransitFacility)
                    .with(LandPrice.class, this::marshalLandPrice)
                    .with(ValueByCodes.class, this::marshalValueByCodes)
                    .with(ValueByCodesProperty.class, this::marshalValueByCodesProperty)
                    .with(NaturalConditions.class, this::marshalNaturalConditions)
                    .with(WeatherObservation.class, this::marshalWeatherObservation)
                    .with(WeatherObservationType.class, this::marshalWeatherObservationType)
                    .with(WeatherObservationTypeProperty.class, this::marshalWeatherObservationTypeProperty)
                    .with(GreenSpace.class, this::marshalGreenSpace)
                    .with(DistributionOfFloraAndFauna.class, this::marshalDistributionOfFloraAndFauna)
                    .with(ScenicResource.class, this::marshalScenicResource)
                    .with(TargetProperty.class, this::marshalTargetProperty);
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

    private void marshalUrbanFunction(UrbanFunction src, UrbanFunctionType dest) {
        helper.getCore200Marshaller().marshalAbstractCityObject(src, dest);

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        for (Code function : src.getFunction())
            dest.getFunction().add(helper.getGMLMarshaller().marshalCode(function));

        for (Code usage : src.getUsage())
            dest.getUsage().add(helper.getGMLMarshaller().marshalCode(usage));

        if (src.getValidFrom() != null)
            dest.setValidFrom(marshaller.toCalendar(src.getValidFrom()));

        if (src.getValidFromType() != null)
            dest.setValidFromType(helper.getGMLMarshaller().marshalCode(src.getValidFromType()));

        if (src.getEnactmentFiscalYear() != null)
            dest.setEnactmentFiscalYear(marshaller.toCalendar(src.getEnactmentFiscalYear()));

        if (src.getValidTo() != null)
            dest.setValidTo(marshaller.toCalendar(src.getValidTo()));

        if (src.getValidToType() != null)
            dest.setValidToType(helper.getGMLMarshaller().marshalCode(src.getValidToType()));

        if (src.getExpirationFiscalYear() != null)
            dest.setExpirationFiscalYear(marshaller.toCalendar(src.getExpirationFiscalYear()));

        dest.setLegalGrounds(src.getLegalGrounds());
        dest.setCustodian(src.getCustodian());
        dest.setNotificationNumber(src.getNotificationNumber());

        if (src.getFinalNotificationDate() != null)
            dest.setFinalNotificationDate(marshaller.toCalendar(src.getFinalNotificationDate()));

        dest.setFinalNotificationNumber(src.getFinalNotificationNumber());

        if (src.getUrbanPlanType() != null)
            dest.setUrbanPlanType(helper.getGMLMarshaller().marshalCode(src.getUrbanPlanType()));

        if (src.getAreaClassificationType() != null)
            dest.setAreaClassificationType(helper.getGMLMarshaller().marshalCode(src.getAreaClassificationType()));

        if (src.getNominalArea() != null)
            dest.setNominalArea(helper.getGMLMarshaller().marshalMeasure(src.getNominalArea()));

        if (src.getPrefecture() != null)
            dest.setPrefecture(helper.getGMLMarshaller().marshalCode(src.getPrefecture()));

        if (src.getCity() != null)
            dest.setCity(helper.getGMLMarshaller().marshalCode(src.getCity()));

        dest.setReference(src.getReference());

        if (src.getReason() != null)
            dest.setReason(helper.getGMLMarshaller().marshalStringOrRef(src.getReason()));

        if (src.getNote() != null)
            dest.setNote(helper.getGMLMarshaller().marshalStringOrRef(src.getNote()));

        if (src.getSurveyYear() != null)
            dest.setSurveyYear(marshaller.toCalendar(src.getSurveyYear()));

        if (src.getLodMinus2MultiSurface() != null)
            dest.setLodMinus2MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLodMinus2MultiSurface()));

        if (src.getLodMinus1MultiSurface() != null)
            dest.setLodMinus1MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLodMinus1MultiSurface()));

        if (src.getLod0MultiSurface() != null)
            dest.setLod0MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod0MultiSurface()));

        if (src.getLod1MultiSurface() != null)
            dest.setLod1MultiSurface(helper.getGMLMarshaller().marshalMultiSurfaceProperty(src.getLod1MultiSurface()));

        if (src.getLodMinus2MultiCurve() != null)
            dest.setLodMinus2MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLodMinus2MultiCurve()));

        if (src.getLodMinus1MultiCurve() != null)
            dest.setLodMinus1MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLodMinus1MultiCurve()));

        if (src.getLod0MultiCurve() != null)
            dest.setLod0MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLod0MultiCurve()));

        if (src.getLod1MultiCurve() != null)
            dest.setLod1MultiCurve(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLod1MultiCurve()));

        if (src.getLodMinus2MultiPoint() != null)
            dest.setLodMinus2MultiPoint(helper.getGMLMarshaller().marshalMultiPointProperty(src.getLodMinus2MultiPoint()));

        if (src.getLodMinus1MultiPoint() != null)
            dest.setLodMinus1MultiPoint(helper.getGMLMarshaller().marshalMultiPointProperty(src.getLodMinus1MultiPoint()));

        if (src.getLod0MultiPoint() != null)
            dest.setLod0MultiPoint(helper.getGMLMarshaller().marshalMultiPointProperty(src.getLod0MultiPoint()));

        for (TargetProperty target : src.getTarget())
            dest.getTarget().add(marshalTargetProperty(target));

        for (org.citygml4j.ade.iur.model.uro.KeyValuePairAttributeProperty keyValuePairAttribute : src.getKeyValuePairAttribute())
            dest.getKeyValuePairAttribute().add((jp.geospatial.iur._3_1.uro.KeyValuePairAttributePropertyType) helper.getJAXBMarshaller().marshal(keyValuePairAttribute));

        if (src.getDataQualityAttribute() != null)
            dest.setDataQualityAttribute((jp.geospatial.iur._3_1.uro.DataQualityAttributePropertyType) helper.getJAXBMarshaller().marshal(src.getDataQualityAttribute()));
    }

    private void marshalZone(Zone src, ZoneType dest) {
        marshalUrbanFunction(src, dest);

        for (BoundaryProperty boundary : src.getBoundary())
            dest.getBoundary().add(marshalBoundaryProperty(boundary));

        dest.setLocationDescription(src.getLocationDescription());

        if (src.getUrbanParkAttribute() != null)
            dest.setUrbanParkAttribute(marshalUrbanParkAttributeProperty(src.getUrbanParkAttribute()));
    }

    private ZoneType marshalZone(Zone src) {
        ZoneType dest = factory.createZoneType();
        marshalZone(src, dest);
        return dest;
    }

    private UrbanPlanningAreaType marshalUrbanPlanningArea(UrbanPlanningArea src) {
        UrbanPlanningAreaType dest = factory.createUrbanPlanningAreaType();
        marshalZone(src, dest);

        if (src.getAreaClassification() != null)
            dest.setAreaClassification(helper.getGMLMarshaller().marshalCode(src.getAreaClassification()));

        if (src.getReasonForAreaClassification() != null)
            dest.setReasonForAreaClassification(helper.getGMLMarshaller().marshalStringOrRef(src.getReasonForAreaClassification()));

        if (src.getPolicyForAreaClassification() != null)
            dest.setPolicyForAreaClassification(helper.getGMLMarshaller().marshalStringOrRef(src.getPolicyForAreaClassification()));

        if (src.getPurposeForUrbanPlan() != null)
            dest.setPurposeForUrbanPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getPurposeForUrbanPlan()));

        if (src.getPolicyForUrbanPlanDecision() != null)
            dest.setPolicyForUrbanPlanDecision(helper.getGMLMarshaller().marshalStringOrRef(src.getPolicyForUrbanPlanDecision()));

        if (src.getPopulation() != null)
            dest.setPopulation(BigInteger.valueOf(src.getPopulation()));

        if (src.getCityArea() != null)
            dest.setCityArea(helper.getGMLMarshaller().marshalMeasure(src.getCityArea()));

        if (src.getCityPopulation() != null)
            dest.setCityPopulation(BigInteger.valueOf(src.getCityPopulation()));

        return dest;
    }

    private QuasiUrbanPlanningAreaType marshalQuasiUrbanPlanningArea(QuasiUrbanPlanningArea src) {
        QuasiUrbanPlanningAreaType dest = factory.createQuasiUrbanPlanningAreaType();
        marshalZone(src, dest);

        if (src.getPopulation() != null)
            dest.setPopulation(BigInteger.valueOf(src.getPopulation()));

        if (src.getCityArea() != null)
            dest.setCityArea(helper.getGMLMarshaller().marshalMeasure(src.getCityArea()));

        if (src.getCityPopulation() != null)
            dest.setCityPopulation(BigInteger.valueOf(src.getCityPopulation()));

        return dest;
    }

    private AreaClassificationType marshalAreaClassification(AreaClassification src) {
        AreaClassificationType dest = factory.createAreaClassificationType();
        marshalZone(src, dest);

        if (src.getPopulation() != null)
            dest.setPopulation(BigInteger.valueOf(src.getPopulation()));

        return dest;
    }

    private void marshalDistrictsAndZones(DistrictsAndZones src, DistrictsAndZonesType dest) {
        marshalZone(src, dest);

        if (src.getAreaInTotal() != null)
            dest.setAreaInTotal(helper.getGMLMarshaller().marshalMeasure(src.getAreaInTotal()));
    }

    private DistrictsAndZonesType marshalDistrictsAndZones(DistrictsAndZones src) {
        DistrictsAndZonesType dest = factory.createDistrictsAndZonesType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private UseDistrictType marshalUseDistrict(UseDistrict src) {
        UseDistrictType dest = factory.createUseDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getMinimumSiteArea() != null)
            dest.setMinimumSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumSiteArea()));

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getWallSetbackDistance() != null)
            dest.setWallSetbackDistance(helper.getGMLMarshaller().marshalStringOrRef(src.getWallSetbackDistance()));

        if (src.getBuildingHeightLimits() != null)
            dest.setBuildingHeightLimits(helper.getGMLMarshaller().marshalLength(src.getBuildingHeightLimits()));

        if (src.getBuildingRestrictions() != null)
            dest.setBuildingRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingRestrictions()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        if (src.getSetbackRestrictions() != null)
            dest.setSetbackRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackRestrictions()));

        if (src.getFrontRoadRestrictions() != null)
            dest.setFrontRoadRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getFrontRoadRestrictions()));

        if (src.getAdjacentLandRestrictions() != null)
            dest.setAdjacentLandRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getAdjacentLandRestrictions()));

        if (src.getNorthDirectionRestrictions() != null)
            dest.setNorthDirectionRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getNorthDirectionRestrictions()));

        if (src.getShadeRegulation() != null)
            dest.setShadeRegulation(helper.getGMLMarshaller().marshalStringOrRef(src.getShadeRegulation()));

        return dest;
    }

    private SpecialUseDistrictType marshalSpecialUseDistrict(SpecialUseDistrict src) {
        SpecialUseDistrictType dest = factory.createSpecialUseDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getBuildingRestrictions() != null)
            dest.setBuildingRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingRestrictions()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUseRestrictionDistrictType marshalSpecialUseRestrictionDistrict(SpecialUseRestrictionDistrict src) {
        SpecialUseRestrictionDistrictType dest = factory.createSpecialUseRestrictionDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getBuildingRestrictions() != null)
            dest.setBuildingRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingRestrictions()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private ExceptionalFloorAreaRateDistrictType marshalExceptionalFloorAreaRateDistrict(ExceptionalFloorAreaRateDistrict src) {
        ExceptionalFloorAreaRateDistrictType dest = factory.createExceptionalFloorAreaRateDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getBuildingHeightLimits() != null)
            dest.setBuildingHeightLimits(helper.getGMLMarshaller().marshalLength(src.getBuildingHeightLimits()));

        return dest;
    }

    private HighRiseResidentialAttractionDistrictType marshalHighRiseResidentialAttractionDistrict(HighRiseResidentialAttractionDistrict src) {
        HighRiseResidentialAttractionDistrictType dest = factory.createHighRiseResidentialAttractionDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        if (src.getMinimumSiteArea() != null)
            dest.setMinimumSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumSiteArea()));

        return dest;
    }

    private HeightControlDistrictType marshalHeightControlDistrict(HeightControlDistrict src) {
        HeightControlDistrictType dest = factory.createHeightControlDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        return dest;
    }

    private HighLevelUseDistrictType marshalHighLevelUseDistrict(HighLevelUseDistrict src) {
        HighLevelUseDistrictType dest = factory.createHighLevelUseDistrictType();
        marshalDistrictsAndZones(src, dest);

        for (Integer maximumFloorAreaRate : src.getMaximumFloorAreaRate())
            dest.getMaximumFloorAreaRate().add(BigInteger.valueOf(maximumFloorAreaRate));

        for (Integer minimumFloorAreaRate : src.getMinimumFloorAreaRate())
            dest.getMinimumFloorAreaRate().add(BigInteger.valueOf(minimumFloorAreaRate));

        for (Integer maximumBuildingCoverageRate : src.getMaximumBuildingCoverageRate())
            dest.getMaximumBuildingCoverageRate().add(BigInteger.valueOf(maximumBuildingCoverageRate));

        for (Measure minimumBuildingArea : src.getMinimumBuildingArea())
            dest.getMinimumBuildingArea().add(helper.getGMLMarshaller().marshalMeasure(minimumBuildingArea));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        return dest;
    }

    private SpecifiedBlockType marshalSpecifiedBlock(SpecifiedBlock src) {
        SpecifiedBlockType dest = factory.createSpecifiedBlockType();
        marshalDistrictsAndZones(src, dest);

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        return dest;
    }

    private SpecialUrbanRenaissanceDistrictType marshalSpecialUrbanRenaissanceDistrict(SpecialUrbanRenaissanceDistrict src) {
        SpecialUrbanRenaissanceDistrictType dest = factory.createSpecialUrbanRenaissanceDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getUseToBeInduced() != null)
            dest.setUseToBeInduced(helper.getGMLMarshaller().marshalStringOrRef(src.getUseToBeInduced()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        if (src.getMinimumBuildingArea() != null)
            dest.setMinimumBuildingArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumBuildingArea()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalStringOrRef(src.getMaximumBuildingHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUrbanRenaissanceDistrictPropertyType marshalSpecialUrbanRenaissanceDistrictProperty(SpecialUrbanRenaissanceDistrictProperty src) {
        SpecialUrbanRenaissanceDistrictPropertyType dest = factory.createSpecialUrbanRenaissanceDistrictPropertyType();

        if (src.isSetObject())
            dest.setSpecialUrbanRenaissanceDistrict(marshalSpecialUrbanRenaissanceDistrict(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private HousingControlAreaType marshalHousingControlArea(HousingControlArea src) {
        HousingControlAreaType dest = factory.createHousingControlAreaType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private ResidentialEnvironmentImprovementDistrictType marshalResidentialEnvironmentImprovementDistrict(ResidentialEnvironmentImprovementDistrict src) {
        ResidentialEnvironmentImprovementDistrictType dest = factory.createResidentialEnvironmentImprovementDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getUseToBeInduced() != null)
            dest.setUseToBeInduced(helper.getGMLMarshaller().marshalStringOrRef(src.getUseToBeInduced()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalStringOrRef(src.getMaximumBuildingHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private SpecialUseAttractionDistrictType marshalSpecialUseAttractionDistrict(SpecialUseAttractionDistrict src) {
        SpecialUseAttractionDistrictType dest = factory.createSpecialUseAttractionDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getUseToBeInduced() != null)
            dest.setUseToBeInduced(helper.getGMLMarshaller().marshalStringOrRef(src.getUseToBeInduced()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMinimumBuildingArea() != null)
            dest.setMinimumBuildingArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumBuildingArea()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalStringOrRef(src.getMaximumBuildingHeight()));

        if (src.getOtherRestrictions() != null)
            dest.setOtherRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherRestrictions()));

        return dest;
    }

    private FirePreventionDistrictType marshalFirePreventionDistrict(FirePreventionDistrict src) {
        FirePreventionDistrictType dest = factory.createFirePreventionDistrictType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private SpecifiedDisasterPreventionBlockImprovementZoneType marshalSpecifiedDisasterPreventionBlockImprovementZone(SpecifiedDisasterPreventionBlockImprovementZone src) {
        SpecifiedDisasterPreventionBlockImprovementZoneType dest = factory.createSpecifiedDisasterPreventionBlockImprovementZoneType();
        marshalDistrictsAndZones(src, dest);

        if (src.getMinimumSiteArea() != null)
            dest.setMinimumSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumSiteArea()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getMinimumFrontageRate() != null)
            dest.setMinimumFrontageRate(BigInteger.valueOf(src.getMinimumFrontageRate()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        return dest;
    }

    private LandscapeZoneType marshalLandscapeZone(LandscapeZone src) {
        LandscapeZoneType dest = factory.createLandscapeZoneType();
        marshalDistrictsAndZones(src, dest);

        if (src.getBuildingDesignRestriction() != null)
            dest.setBuildingDesignRestriction(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingDesignRestriction()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getMinimumSiteArea() != null)
            dest.setMinimumSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumSiteArea()));

        return dest;
    }

    private ScenicDistrictType marshalScenicDistrict(ScenicDistrict src) {
        ScenicDistrictType dest = factory.createScenicDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getBuildingHeightLimits() != null)
            dest.setBuildingHeightLimits(helper.getGMLMarshaller().marshalLength(src.getBuildingHeightLimits()));

        if (src.getWallSetbackDistanceWithRoad() != null)
            dest.setWallSetbackDistanceWithRoad(helper.getGMLMarshaller().marshalLength(src.getWallSetbackDistanceWithRoad()));

        if (src.getWallSetbackDistanceWithAdjoiningLand() != null)
            dest.setWallSetbackDistanceWithAdjoiningLand(helper.getGMLMarshaller().marshalLength(src.getWallSetbackDistanceWithAdjoiningLand()));

        return dest;
    }

    private ParkingPlaceDevelopmentZoneType marshalParkingPlaceDevelopmentZone(ParkingPlaceDevelopmentZone src) {
        ParkingPlaceDevelopmentZoneType dest = factory.createParkingPlaceDevelopmentZoneType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private PortZoneType marshalPortZone(PortZone src) {
        PortZoneType dest = factory.createPortZoneType();
        marshalDistrictsAndZones(src, dest);

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        return dest;
    }

    private SpecialZoneForPreservationOfHistoricalLandscapeType marshalSpecialZoneForPreservationOfHistoricalLandscape(SpecialZoneForPreservationOfHistoricalLandscape src) {
        SpecialZoneForPreservationOfHistoricalLandscapeType dest = factory.createSpecialZoneForPreservationOfHistoricalLandscapeType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private ZoneForPreservationOfHistoricalLandscapeType marshalZoneForPreservationOfHistoricalLandscape(ZoneForPreservationOfHistoricalLandscape src) {
        ZoneForPreservationOfHistoricalLandscapeType dest = factory.createZoneForPreservationOfHistoricalLandscapeType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private GreenSpaceConservationDistrictType marshalGreenSpaceConservationDistrict(GreenSpaceConservationDistrict src) {
        GreenSpaceConservationDistrictType dest = factory.createGreenSpaceConservationDistrictType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private SpecialGreenSpaceConservationDistrictType marshalSpecialGreenSpaceConservationDistrict(SpecialGreenSpaceConservationDistrict src) {
        SpecialGreenSpaceConservationDistrictType dest = factory.createSpecialGreenSpaceConservationDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getRequirement() != null)
            dest.setRequirement(helper.getGMLMarshaller().marshalCode(src.getRequirement()));

        return dest;
    }

    private TreePlantingDistrictType marshalTreePlantingDistrict(TreePlantingDistrict src) {
        TreePlantingDistrictType dest = factory.createTreePlantingDistrictType();
        marshalDistrictsAndZones(src, dest);

        if (src.getMinimumGreeningRate() != null)
            dest.setMinimumGreeningRate(BigInteger.valueOf(src.getMinimumGreeningRate()));

        return dest;
    }

    private DistributionBusinessZoneType marshalDistributionBusinessZone(DistributionBusinessZone src) {
        DistributionBusinessZoneType dest = factory.createDistributionBusinessZoneType();
        marshalDistrictsAndZones(src, dest);

        if (src.getGuidelinePublicationDate() != null)
            dest.setGuidelinePublicationDate(marshaller.toCalendar(src.getGuidelinePublicationDate()));

        return dest;
    }

    private ProductiveGreenZoneType marshalProductiveGreenZone(ProductiveGreenZone src) {
        ProductiveGreenZoneType dest = factory.createProductiveGreenZoneType();
        marshalDistrictsAndZones(src, dest);

        dest.setZoneNumber(src.getZoneNumber());

        if (src.getSpecification() != null)
            dest.setSpecification(helper.getGMLMarshaller().marshalCode(src.getSpecification()));

        return dest;
    }

    private ConservationZoneForClustersOfTraditionalStructuresType marshalConservationZoneForClustersOfTraditionalStructures(ConservationZoneForClustersOfTraditionalStructures src) {
        ConservationZoneForClustersOfTraditionalStructuresType dest = factory.createConservationZoneForClustersOfTraditionalStructuresType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private AircraftNoiseControlZoneType marshalAircraftNoiseControlZone(AircraftNoiseControlZone src) {
        AircraftNoiseControlZoneType dest = factory.createAircraftNoiseControlZoneType();
        marshalDistrictsAndZones(src, dest);
        return dest;
    }

    private void marshalProjectPromotionArea(ProjectPromotionArea src, ProjectPromotionAreaType dest) {
        marshalZone(src, dest);

        if (src.getDevelopmentPolicy() != null)
            dest.setDevelopmentPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getDevelopmentPolicy()));

        if (src.getPublicFacilitiesPlans() != null)
            dest.setPublicFacilitiesPlans(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilitiesPlans()));
    }

    private ProjectPromotionAreaType marshalProjectPromotionArea(ProjectPromotionArea src) {
        ProjectPromotionAreaType dest = factory.createProjectPromotionAreaType();
        marshalProjectPromotionArea(src, dest);
        return dest;
    }

    private UrbanRedevelopmentPromotionAreaType marshalUrbanRedevelopmentPromotionArea(UrbanRedevelopmentPromotionArea src) {
        UrbanRedevelopmentPromotionAreaType dest = factory.createUrbanRedevelopmentPromotionAreaType();
        marshalProjectPromotionArea(src, dest);

        if (src.getPublicFacilities() != null)
            dest.setPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilities()));

        if (src.getUnitArea() != null)
            dest.setUnitArea(helper.getGMLMarshaller().marshalStringOrRef(src.getUnitArea()));

        return dest;
    }

    private LandReadjustmentPromotionAreaType marshalLandReadjustmentPromotionArea(LandReadjustmentPromotionArea src) {
        LandReadjustmentPromotionAreaType dest = factory.createLandReadjustmentPromotionAreaType();
        marshalProjectPromotionArea(src, dest);
        return dest;
    }

    private ResidentialBlockConstructionPromotionAreaType marshalResidentialBlockConstructionPromotionArea(ResidentialBlockConstructionPromotionArea src) {
        ResidentialBlockConstructionPromotionAreaType dest = factory.createResidentialBlockConstructionPromotionAreaType();
        marshalProjectPromotionArea(src, dest);
        return dest;
    }

    private LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType marshalLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment src) {
        LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType dest = factory.createLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType();
        marshalProjectPromotionArea(src, dest);
        return dest;
    }

    private UnusedLandUsePromotionAreaType marshalUnusedLandUsePromotionArea(UnusedLandUsePromotionArea src) {
        UnusedLandUsePromotionAreaType dest = factory.createUnusedLandUsePromotionAreaType();
        marshalZone(src, dest);
        return dest;
    }

    private UrbanDisasterRecoveryPromotionAreaType marshalUrbanDisasterRecoveryPromotionArea(UrbanDisasterRecoveryPromotionArea src) {
        UrbanDisasterRecoveryPromotionAreaType dest = factory.createUrbanDisasterRecoveryPromotionAreaType();
        marshalZone(src, dest);

        if (src.getExpirationDate() != null)
            dest.setExpirationDate(marshaller.toCalendar(src.getExpirationDate()));

        if (src.getEmergencyRecoveryPolicy() != null)
            dest.setEmergencyRecoveryPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getEmergencyRecoveryPolicy()));

        if (src.getPlannedProjectType() != null)
            dest.setPlannedProjectType(helper.getGMLMarshaller().marshalCode(src.getPlannedProjectType()));

        return dest;
    }

    private void marshalUrbanDevelopmentProject(UrbanDevelopmentProject src, jp.geospatial.iur._3_1.urf.UrbanDevelopmentProjectType dest) {
        marshalZone(src, dest);
        dest.setScheduledExecutor(src.getScheduledExecutor());
    }

    private jp.geospatial.iur._3_1.urf.UrbanDevelopmentProjectType marshalUrbanDevelopmentProject(UrbanDevelopmentProject src) {
        jp.geospatial.iur._3_1.urf.UrbanDevelopmentProjectType dest = factory.createUrbanDevelopmentProjectType();
        marshalUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private LandReadjustmentProjectType marshalLandReadjustmentProject(LandReadjustmentProject src) {
        LandReadjustmentProjectType dest = factory.createLandReadjustmentProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getPublicFacilityAllocation() != null)
            dest.setPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.getBuildingLotDevelopment() != null)
            dest.setBuildingLotDevelopment(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingLotDevelopment()));

        return dest;
    }

    private NewHousingAndUrbanDevelopmentProjectType marshalNewHousingAndUrbanDevelopmentProject(NewHousingAndUrbanDevelopmentProject src) {
        NewHousingAndUrbanDevelopmentProjectType dest = factory.createNewHousingAndUrbanDevelopmentProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getHousing() != null)
            dest.setHousing(helper.getGMLMarshaller().marshalStringOrRef(src.getHousing()));

        if (src.getPublicFacilityAllocation() != null)
            dest.setPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.getResidentialLandUsePlan() != null)
            dest.setResidentialLandUsePlan(helper.getGMLMarshaller().marshalStringOrRef(src.getResidentialLandUsePlan()));

        return dest;
    }

    private IndustrialParkDevelopmentProjectType marshalIndustrialParkDevelopmentProject(IndustrialParkDevelopmentProject src) {
        IndustrialParkDevelopmentProjectType dest = factory.createIndustrialParkDevelopmentProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getPublicFacilityAllocation() != null)
            dest.setPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.getResidentialLandUsePlan() != null)
            dest.setResidentialLandUsePlan(helper.getGMLMarshaller().marshalStringOrRef(src.getResidentialLandUsePlan()));

        return dest;
    }

    private UrbanRedevelopmentProjectType marshalUrbanRedevelopmentProject(UrbanRedevelopmentProject src) {
        UrbanRedevelopmentProjectType dest = factory.createUrbanRedevelopmentProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getPublicFacilityAllocation() != null)
            dest.setPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.getDevelopmentPlan() != null)
            dest.setDevelopmentPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getDevelopmentPlan()));

        if (src.getHousingTarget() != null)
            dest.setHousingTarget(helper.getGMLMarshaller().marshalStringOrRef(src.getHousingTarget()));

        if (src.getSiteArea() != null)
            dest.setSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getSiteArea()));

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        if (src.getNumberOfHousing() != null)
            dest.setNumberOfHousing(BigInteger.valueOf(src.getNumberOfHousing()));

        return dest;
    }

    private NewUrbanInfrastructureProjectType marshalNewUrbanInfrastructureProject(NewUrbanInfrastructureProject src) {
        NewUrbanInfrastructureProjectType dest = factory.createNewUrbanInfrastructureProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getLandForCentralPublicFacilities() != null)
            dest.setLandForCentralPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getLandForCentralPublicFacilities()));

        if (src.getDistrictsAllocation() != null)
            dest.setDistrictsAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getDistrictsAllocation()));

        if (src.getLandUsePlan() != null)
            dest.setLandUsePlan(helper.getGMLMarshaller().marshalStringOrRef(src.getLandUsePlan()));

        return dest;
    }

    private ResidentialBlockConstructionProjectType marshalResidentialBlockConstructionProject(ResidentialBlockConstructionProject src) {
        ResidentialBlockConstructionProjectType dest = factory.createResidentialBlockConstructionProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getPublicFacilityAllocation() != null)
            dest.setPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilityAllocation()));

        if (src.getDevelopmentPlan() != null)
            dest.setDevelopmentPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getDevelopmentPlan()));

        if (src.getSiteArea() != null)
            dest.setSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getSiteArea()));

        if (src.getTotalFloorArea() != null)
            dest.setTotalFloorArea(helper.getGMLMarshaller().marshalMeasure(src.getTotalFloorArea()));

        return dest;
    }

    private DisasterPreventionBlockImprovementProjectType marshalDisasterPreventionBlockImprovementProject(DisasterPreventionBlockImprovementProject src) {
        DisasterPreventionBlockImprovementProjectType dest = factory.createDisasterPreventionBlockImprovementProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getDisasterPreventionPublicFacilityAllocation() != null)
            dest.setDisasterPreventionPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getDisasterPreventionPublicFacilityAllocation()));

        if (src.getOtherPublicFacilityAllocation() != null)
            dest.setOtherPublicFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getOtherPublicFacilityAllocation()));

        if (src.getDevelopmentPlan() != null)
            dest.setDevelopmentPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getDevelopmentPlan()));

        return dest;
    }

    private UrbanRenewalProjectType marshalUrbanRenewalProject(UrbanRenewalProject src) {
        UrbanRenewalProjectType dest = factory.createUrbanRenewalProjectType();
        marshalUrbanDevelopmentProject(src, dest);

        if (src.getStoreysAboveGround() != null)
            dest.setStoreysAboveGround(BigInteger.valueOf(src.getStoreysAboveGround()));

        if (src.getStoreysBelowGround() != null)
            dest.setStoreysBelowGround(BigInteger.valueOf(src.getStoreysBelowGround()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        dest.setBuildingUsage(src.getBuildingUsage());

        if (src.getSiteArea() != null)
            dest.setSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getSiteArea()));

        return dest;
    }

    private void marshalScheduledAreaForUrbanDevelopmentProject(ScheduledAreaForUrbanDevelopmentProject src, ScheduledAreaForUrbanDevelopmentProjectType dest) {
        marshalZone(src, dest);
        dest.setScheduledExecutor(src.getScheduledExecutor());
    }

    private ScheduledAreaForUrbanDevelopmentProjectType marshalScheduledAreaForUrbanDevelopmentProject(ScheduledAreaForUrbanDevelopmentProject src) {
        ScheduledAreaForUrbanDevelopmentProjectType dest = factory.createScheduledAreaForUrbanDevelopmentProjectType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType marshalScheduledAreaForNewHousingAndUrbanDevelopmentProjects(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects src) {
        ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType dest = factory.createScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForIndustrialParkDevelopmentProjectsType marshalScheduledAreaForIndustrialParkDevelopmentProjects(ScheduledAreaForIndustrialParkDevelopmentProjects src) {
        ScheduledAreaForIndustrialParkDevelopmentProjectsType dest = factory.createScheduledAreaForIndustrialParkDevelopmentProjectsType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForNewUrbanInfrastructureProjectsType marshalScheduledAreaForNewUrbanInfrastructureProjects(ScheduledAreaForNewUrbanInfrastructureProjects src) {
        ScheduledAreaForNewUrbanInfrastructureProjectsType dest = factory.createScheduledAreaForNewUrbanInfrastructureProjectsType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForCollectiveHousingFacilitiesType marshalScheduledAreaForCollectiveHousingFacilities(ScheduledAreaForCollectiveHousingFacilities src) {
        ScheduledAreaForCollectiveHousingFacilitiesType dest = factory.createScheduledAreaForCollectiveHousingFacilitiesType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType marshalScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities src) {
        ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType dest = factory.createScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private ScheduledAreaForDistributionBusinessParkType marshalScheduledAreaForDistributionBusinessPark(ScheduledAreaForDistributionBusinessPark src) {
        ScheduledAreaForDistributionBusinessParkType dest = factory.createScheduledAreaForDistributionBusinessParkType();
        marshalScheduledAreaForUrbanDevelopmentProject(src, dest);
        return dest;
    }

    private void marshalUrbanFacility(UrbanFacility src, UrbanFacilityType dest) {
        marshalZone(src, dest);

        dest.setNumber(src.getNumber());

        for (ThreeDimensionalExtentProperty threeDimensionalExtent : src.getThreeDimensionalExtent())
            dest.getThreeDimensionalExtent().add(marshalThreeDimensionalExtentProperty(threeDimensionalExtent));
    }

    private UrbanFacilityType marshalUrbanFacility(UrbanFacility src) {
        UrbanFacilityType dest = factory.createUrbanFacilityType();
        marshalUrbanFacility(src, dest);
        return dest;
    }

    private TrafficFacilityType marshalTrafficFacility(TrafficFacility src) {
        TrafficFacilityType dest = factory.createTrafficFacilityType();
        marshalUrbanFacility(src, dest);

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());
        dest.setViaLocations(src.getViaLocations());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        if (src.getUrbanRoadAttribute() != null)
            dest.setUrbanRoadAttribute(marshalUrbanRoadAttributeProperty(src.getUrbanRoadAttribute()));

        if (src.getUrbanRapidTransitRailroadAttribute() != null)
            dest.setUrbanRapidTransitRailroadAttribute(marshalUrbanRapidTransitRailroadAttributeProperty(src.getUrbanRapidTransitRailroadAttribute()));

        if (src.getParkingPlaceAttribute() != null)
            dest.setParkingPlaceAttribute(marshalParkingPlaceAttributeProperty(src.getParkingPlaceAttribute()));

        if (src.getVehicleTerminalAttribute() != null)
            dest.setVehicleTerminalAttribute(marshalVehicleTerminalAttributeProperty(src.getVehicleTerminalAttribute()));

        return dest;
    }

    private UrbanRoadAttributeType marshalUrbanRoadAttribute(UrbanRoadAttribute src) {
        UrbanRoadAttributeType dest = factory.createUrbanRoadAttributeType();

        if (src.getRouteTypeNumber() != null)
            dest.setRouteTypeNumber(helper.getGMLMarshaller().marshalCode(src.getRouteTypeNumber()));

        if (src.getRouteSizeNumber() != null)
            dest.setRouteSizeNumber(helper.getGMLMarshaller().marshalCode(src.getRouteSizeNumber()));

        dest.setRouteSerialNumber(src.getRouteSerialNumber());

        if (src.getRoadType() != null)
            dest.setRoadType(helper.getGMLMarshaller().marshalCode(src.getRoadType()));

        if (src.getNumberOfLanes() != null)
            dest.setNumberOfLanes(BigInteger.valueOf(src.getNumberOfLanes()));

        if (src.getRoadStructure() != null)
            dest.setRoadStructure(helper.getGMLMarshaller().marshalStringOrRef(src.getRoadStructure()));

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getCrossType() != null)
            dest.setCrossType(helper.getGMLMarshaller().marshalCode(src.getCrossType()));

        if (src.getTrafficPlazas() != null)
            dest.setTrafficPlazas(helper.getGMLMarshaller().marshalCode(src.getTrafficPlazas()));

        for (StructureDetailsProperty structuralDetails : src.getStructuralDetails())
            dest.getStructuralDetails().add(marshalStructureDetailsProperty(structuralDetails));

        return dest;
    }

    private UrbanRoadAttributePropertyType marshalUrbanRoadAttributeProperty(UrbanRoadAttributeProperty src) {
        UrbanRoadAttributePropertyType dest = factory.createUrbanRoadAttributePropertyType();

        if (src.isSetObject())
            dest.setUrbanRoadAttribute(marshalUrbanRoadAttribute(src.getObject()));

        return dest;
    }

    private StructureDetailsType marshalStructureDetails(StructureDetails src) {
        StructureDetailsType dest = factory.createStructureDetailsType();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());
        dest.setViaLocations(src.getViaLocations());

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getMinimumWidth() != null)
            dest.setMinimumWidth(helper.getGMLMarshaller().marshalLength(src.getMinimumWidth()));

        if (src.getMaximumWidth() != null)
            dest.setMaximumWidth(helper.getGMLMarshaller().marshalLength(src.getMaximumWidth()));

        if (src.getStandardWidth() != null)
            dest.setStandardWidth(helper.getGMLMarshaller().marshalLength(src.getStandardWidth()));

        if (src.getCrossType() != null)
            dest.setCrossType(helper.getGMLMarshaller().marshalCode(src.getCrossType()));

        return dest;
    }

    private StructureDetailsPropertyType marshalStructureDetailsProperty(StructureDetailsProperty src) {
        StructureDetailsPropertyType dest = factory.createStructureDetailsPropertyType();

        if (src.isSetObject())
            dest.setStructureDetails(marshalStructureDetails(src.getObject()));

        return dest;
    }

    private UrbanRapidTransitRailroadAttributeType marshalUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttribute src) {
        UrbanRapidTransitRailroadAttributeType dest = factory.createUrbanRapidTransitRailroadAttributeType();

        if (src.getStructureType() != null)
            dest.setStructureType(helper.getGMLMarshaller().marshalCode(src.getStructureType()));

        if (src.getCrossType() != null)
            dest.setCrossType(helper.getGMLMarshaller().marshalCode(src.getCrossType()));

        for (StructureDetailsProperty structuralDetails : src.getStructuralDetails())
            dest.getStructuralDetails().add(marshalStructureDetailsProperty(structuralDetails));

        return dest;
    }

    private UrbanRapidTransitRailroadAttributePropertyType marshalUrbanRapidTransitRailroadAttributeProperty(UrbanRapidTransitRailroadAttributeProperty src) {
        UrbanRapidTransitRailroadAttributePropertyType dest = factory.createUrbanRapidTransitRailroadAttributePropertyType();

        if (src.isSetObject())
            dest.setUrbanRapidTransitRailroadAttribute(marshalUrbanRapidTransitRailroadAttribute(src.getObject()));

        return dest;
    }

    private ParkingPlaceAttributeType marshalParkingPlaceAttribute(ParkingPlaceAttribute src) {
        ParkingPlaceAttributeType dest = factory.createParkingPlaceAttributeType();

        if (src.getStoreysAboveGround() != null)
            dest.setStoreysAboveGround(BigInteger.valueOf(src.getStoreysAboveGround()));

        if (src.getStoreysBelowGround() != null)
            dest.setStoreysBelowGround(BigInteger.valueOf(src.getStoreysBelowGround()));

        return dest;
    }

    private ParkingPlaceAttributePropertyType marshalParkingPlaceAttributeProperty(ParkingPlaceAttributeProperty src) {
        ParkingPlaceAttributePropertyType dest = factory.createParkingPlaceAttributePropertyType();

        if (src.isSetObject())
            dest.setParkingPlaceAttribute(marshalParkingPlaceAttribute(src.getObject()));

        return dest;
    }

    private VehicleTerminalAttributeType marshalVehicleTerminalAttribute(VehicleTerminalAttribute src) {
        VehicleTerminalAttributeType dest = factory.createVehicleTerminalAttributeType();

        if (src.getTerminalType() != null)
            dest.setTerminalType(helper.getGMLMarshaller().marshalCode(src.getTerminalType()));

        return dest;
    }

    private VehicleTerminalAttributePropertyType marshalVehicleTerminalAttributeProperty(VehicleTerminalAttributeProperty src) {
        VehicleTerminalAttributePropertyType dest = factory.createVehicleTerminalAttributePropertyType();

        if (src.isSetObject())
            dest.setVehicleTerminalAttribute(marshalVehicleTerminalAttribute(src.getObject()));

        return dest;
    }

    private OpenSpaceForPublicUseType marshalOpenSpaceForPublicUse(OpenSpaceForPublicUse src) {
        OpenSpaceForPublicUseType dest = factory.createOpenSpaceForPublicUseType();
        marshalUrbanFacility(src, dest);

        if (src.getParkAttribute() != null)
            dest.setParkAttribute(marshalParkAttributeProperty(src.getParkAttribute()));

        return dest;
    }

    private ParkAttributeType marshalParkAttribute(ParkAttribute src) {
        ParkAttributeType dest = factory.createParkAttributeType();

        if (src.getParkTypeNumber() != null)
            dest.setParkTypeNumber(helper.getGMLMarshaller().marshalCode(src.getParkTypeNumber()));

        if (src.getParkSizeNumber() != null)
            dest.setParkSizeNumber(helper.getGMLMarshaller().marshalCode(src.getParkSizeNumber()));

        dest.setParkSerialNumber(src.getParkSerialNumber());

        return dest;
    }

    private ParkAttributePropertyType marshalParkAttributeProperty(ParkAttributeProperty src) {
        ParkAttributePropertyType dest = factory.createParkAttributePropertyType();

        if (src.isSetObject())
            dest.setParkAttribute(marshalParkAttribute(src.getObject()));

        return dest;
    }

    private SupplyFacilityType marshalSupplyFacility(SupplyFacility src) {
        SupplyFacilityType dest = factory.createSupplyFacilityType();
        marshalUrbanFacility(src, dest);

        if (src.getWaterWorksAttribute() != null)
            dest.setWaterWorksAttribute(marshalWaterWorksAttributeProperty(src.getWaterWorksAttribute()));

        return dest;
    }

    private WaterWorksAttributeType marshalWaterWorksAttribute(WaterWorksAttribute src) {
        WaterWorksAttributeType dest = factory.createWaterWorksAttributeType();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        return dest;
    }

    private WaterWorksAttributePropertyType marshalWaterWorksAttributeProperty(WaterWorksAttributeProperty src) {
        WaterWorksAttributePropertyType dest = factory.createWaterWorksAttributePropertyType();

        if (src.isSetObject())
            dest.setWaterWorksAttribute(marshalWaterWorksAttribute(src.getObject()));

        return dest;
    }

    private TreatmentFacilityType marshalTreatmentFacility(TreatmentFacility src) {
        TreatmentFacilityType dest = factory.createTreatmentFacilityType();
        marshalUrbanFacility(src, dest);

        if (src.getSewerSystemsAttribute() != null)
            dest.setSewerSystemsAttribute(marshalSewerSystemAttributeProperty(src.getSewerSystemsAttribute()));

        return dest;
    }

    private SewerSystemAttributeType marshalSewerSystemAttribute(SewerSystemAttribute src) {
        SewerSystemAttributeType dest = factory.createSewerSystemAttributeType();

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        if (src.getSystemType() != null)
            dest.setSystemType(helper.getGMLMarshaller().marshalCode(src.getSystemType()));

        if (src.getDrainageArea() != null)
            dest.setDrainageArea(helper.getGMLMarshaller().marshalStringOrRef(src.getDrainageArea()));

        return dest;
    }

    private SewerSystemAttributePropertyType marshalSewerSystemAttributeProperty(SewerSystemAttributeProperty src) {
        SewerSystemAttributePropertyType dest = factory.createSewerSystemAttributePropertyType();

        if (src.isSetObject())
            dest.setSewerSystemAttribute(marshalSewerSystemAttribute(src.getObject()));

        return dest;
    }

    private WaterwayType marshalWaterway(Waterway src) {
        WaterwayType dest = factory.createWaterwayType();
        marshalUrbanFacility(src, dest);

        dest.setStartLocation(src.getStartLocation());
        dest.setEndLocation(src.getEndLocation());

        if (src.getStructure() != null)
            dest.setStructure(helper.getGMLMarshaller().marshalCode(src.getStructure()));

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));

        return dest;
    }

    private EducationalAndCulturalFacilityType marshalEducationalAndCulturalFacility(EducationalAndCulturalFacility src) {
        EducationalAndCulturalFacilityType dest = factory.createEducationalAndCulturalFacilityType();
        marshalUrbanFacility(src, dest);
        return dest;
    }

    private MedicalFacilityType marshalMedicalFacility(MedicalFacility src) {
        MedicalFacilityType dest = factory.createMedicalFacilityType();
        marshalUrbanFacility(src, dest);
        return dest;
    }

    private SocialWelfareFacilityType marshalSocialWelfareFacility(SocialWelfareFacility src) {
        SocialWelfareFacilityType dest = factory.createSocialWelfareFacilityType();
        marshalUrbanFacility(src, dest);
        return dest;
    }

    private MarketsSlaughterhousesCrematoriaType marshalMarketsSlaughterhousesCrematoria(MarketsSlaughterhousesCrematoria src) {
        MarketsSlaughterhousesCrematoriaType dest = factory.createMarketsSlaughterhousesCrematoriaType();
        marshalUrbanFacility(src, dest);
        return dest;
    }

    private CollectiveHousingFacilitiesType marshalCollectiveHousingFacilities(CollectiveHousingFacilities src) {
        CollectiveHousingFacilitiesType dest = factory.createCollectiveHousingFacilitiesType();
        marshalUrbanFacility(src, dest);

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getNumberOfLowRiseHousing() != null)
            dest.setNumberOfLowRiseHousing(BigInteger.valueOf(src.getNumberOfLowRiseHousing()));

        if (src.getNumberOfMiddleRiseHousing() != null)
            dest.setNumberOfMiddleRiseHousing(BigInteger.valueOf(src.getNumberOfMiddleRiseHousing()));

        if (src.getNumberOfHighRiseHousing() != null)
            dest.setNumberOfHighRiseHousing(BigInteger.valueOf(src.getNumberOfHighRiseHousing()));

        if (src.getTotalNumberOfHousing() != null)
            dest.setTotalNumberOfHousing(BigInteger.valueOf(src.getTotalNumberOfHousing()));

        if (src.getPublicFacilitiesAllocationPolicy() != null)
            dest.setPublicFacilitiesAllocationPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilitiesAllocationPolicy()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private CollectiveGovernmentAndPublicOfficeFacilitiesType marshalCollectiveGovernmentAndPublicOfficeFacilities(CollectiveGovernmentAndPublicOfficeFacilities src) {
        CollectiveGovernmentAndPublicOfficeFacilitiesType dest = factory.createCollectiveGovernmentAndPublicOfficeFacilitiesType();
        marshalUrbanFacility(src, dest);

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getPublicFacilitiesAllocationPolicy() != null)
            dest.setPublicFacilitiesAllocationPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilitiesAllocationPolicy()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private CollectiveUrbanDisasterPreventionFacilitiesType marshalCollectiveUrbanDisasterPreventionFacilities(CollectiveUrbanDisasterPreventionFacilities src) {
        CollectiveUrbanDisasterPreventionFacilitiesType dest = factory.createCollectiveUrbanDisasterPreventionFacilitiesType();
        marshalUrbanFacility(src, dest);

        if (src.getSpecificUtilityAndPublicFacilities() != null)
            dest.setSpecificUtilityAndPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getSpecificUtilityAndPublicFacilities()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        return dest;
    }

    private DistributionBusinessParkType marshalDistributionBusinessPark(DistributionBusinessPark src) {
        DistributionBusinessParkType dest = factory.createDistributionBusinessParkType();
        marshalUrbanFacility(src, dest);

        if (src.getDistributionBusinessPark() != null)
            dest.setDistributionBusinessPark(helper.getGMLMarshaller().marshalStringOrRef(src.getDistributionBusinessPark()));

        if (src.getPublicAndUtilityFacilities() != null)
            dest.setPublicAndUtilityFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicAndUtilityFacilities()));

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        dest.setScheduledExecutor(src.getScheduledExecutor());

        return dest;
    }

    private void marshalUrbanFacilityStipulatedByCabinetOrder(UrbanFacilityStipulatedByCabinetOrder src, UrbanFacilityStipulatedByCabinetOrderType dest) {
        marshalUrbanFacility(src, dest);

        if (src.getLength() != null)
            dest.setLength(helper.getGMLMarshaller().marshalLength(src.getLength()));

        if (src.getWidth() != null)
            dest.setWidth(helper.getGMLMarshaller().marshalLength(src.getWidth()));
    }

    private UrbanFacilityStipulatedByCabinetOrderType marshalUrbanFacilityStipulatedByCabinetOrder(UrbanFacilityStipulatedByCabinetOrder src) {
        UrbanFacilityStipulatedByCabinetOrderType dest = factory.createUrbanFacilityStipulatedByCabinetOrderType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private TelecommunicationFacilityType marshalTelecommunicationFacility(TelecommunicationFacility src) {
        TelecommunicationFacilityType dest = factory.createTelecommunicationFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private WindProtectionFacilityType marshalWindProtectionFacility(WindProtectionFacility src) {
        WindProtectionFacilityType dest = factory.createWindProtectionFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private FireProtectionFacilityType marshalFireProtectionFacility(FireProtectionFacility src) {
        FireProtectionFacilityType dest = factory.createFireProtectionFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private FloodPreventionFacilityType marshalFloodPreventionFacility(FloodPreventionFacility src) {
        FloodPreventionFacilityType dest = factory.createFloodPreventionFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private SnowProtectionFacilityType marshalSnowProtectionFacility(SnowProtectionFacility src) {
        SnowProtectionFacilityType dest = factory.createSnowProtectionFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private SandControlFacilityType marshalSandControlFacility(SandControlFacility src) {
        SandControlFacilityType dest = factory.createSandControlFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private TideFacilityType marshalTideFacility(TideFacility src) {
        TideFacilityType dest = factory.createTideFacilityType();
        marshalUrbanFacilityStipulatedByCabinetOrder(src, dest);
        return dest;
    }

    private CollectiveFacilitiesForTsunamiDisasterPreventionType marshalCollectiveFacilitiesForTsunamiDisasterPrevention(CollectiveFacilitiesForTsunamiDisasterPrevention src) {
        CollectiveFacilitiesForTsunamiDisasterPreventionType dest = factory.createCollectiveFacilitiesForTsunamiDisasterPreventionType();
        marshalUrbanFacility(src, dest);

        if (src.getHousingFacilities() != null)
            dest.setHousingFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getHousingFacilities()));

        if (src.getSupecificBusinessFacilities() != null)
            dest.setSupecificBusinessFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.getPublicFacilities() != null)
            dest.setPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilities()));

        if (src.getUtilityFacilities() != null)
            dest.setUtilityFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getUtilityFacilities()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        return dest;
    }

    private CollectiveFacilitiesForReconstructionAndRevitalizationType marshalCollectiveFacilitiesForReconstructionAndRevitalization(CollectiveFacilitiesForReconstructionAndRevitalization src) {
        CollectiveFacilitiesForReconstructionAndRevitalizationType dest = factory.createCollectiveFacilitiesForReconstructionAndRevitalizationType();
        marshalUrbanFacility(src, dest);

        if (src.getHousingFacilities() != null)
            dest.setHousingFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getHousingFacilities()));

        if (src.getSupecificBusinessFacilities() != null)
            dest.setSupecificBusinessFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.getPublicFacilities() != null)
            dest.setPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilities()));

        if (src.getUtilityFacilities() != null)
            dest.setUtilityFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getUtilityFacilities()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        return dest;
    }

    private CollectiveFacilitiesForReconstructionType marshalCollectiveFacilitiesForReconstruction(CollectiveFacilitiesForReconstruction src) {
        CollectiveFacilitiesForReconstructionType dest = factory.createCollectiveFacilitiesForReconstructionType();
        marshalUrbanFacility(src, dest);

        if (src.getHousingFacilities() != null)
            dest.setHousingFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getHousingFacilities()));

        if (src.getSupecificBusinessFacilities() != null)
            dest.setSupecificBusinessFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getSupecificBusinessFacilities()));

        if (src.getPublicFacilities() != null)
            dest.setPublicFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getPublicFacilities()));

        if (src.getUtilityFacilities() != null)
            dest.setUtilityFacilities(helper.getGMLMarshaller().marshalStringOrRef(src.getUtilityFacilities()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        return dest;
    }

    private jp.geospatial.iur._3_1.urf.ThreeDimensionalExtent marshalThreeDimensionalExtent(ThreeDimensionalExtent src) {
        jp.geospatial.iur._3_1.urf.ThreeDimensionalExtent dest = factory.createThreeDimensionalExtent();
        marshalUrbanFunction(src, dest);

        if (src.getMinimumDistance() != null)
            dest.setMinimumDistance(helper.getGMLMarshaller().marshalLength(src.getMinimumDistance()));

        if (src.getMaximumLoad() != null)
            dest.setMaximumLoad(helper.getGMLMarshaller().marshalMeasure(src.getMaximumLoad()));

        return dest;
    }

    private ThreeDimensionalExtentPropertyType marshalThreeDimensionalExtentProperty(ThreeDimensionalExtentProperty src) {
        ThreeDimensionalExtentPropertyType dest = factory.createThreeDimensionalExtentPropertyType();

        if (src.isSetObject())
            dest.setThreeDimensionalExtent(marshalThreeDimensionalExtent(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalAbstractDistrictPlan(AbstractDistrictPlan src, AbstractDistrictPlanType dest) {
        marshalZone(src, dest);

        if (src.getObjectives() != null)
            dest.setObjectives(helper.getGMLMarshaller().marshalStringOrRef(src.getObjectives()));

        if (src.getPolicy() != null)
            dest.setPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getPolicy()));

        for (DistrictDevelopmentPlanProperty districtDevelopmentPlan : src.getDistrictDevelopmentPlan())
            dest.getDistrictDevelopmentPlan().add(marshalDistrictDevelopmentPlanProperty(districtDevelopmentPlan));

        for (PromotionDistrictProperty promotionDistrict : src.getPromotionDistrict())
            dest.getPromotionDistrict().add(marshalPromotionDistrictProperty(promotionDistrict));
    }

    private DistrictPlanType marshalDistrictPlan(DistrictPlan src) {
        DistrictPlanType dest = factory.createDistrictPlanType();
        marshalAbstractDistrictPlan(src, dest);

        if (src.getFacilityAllocation() != null)
            dest.setFacilityAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getFacilityAllocation()));

        if (src.getLandUsePolicy() != null)
            dest.setLandUsePolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private DisasterPreventionBlockImprovementZonePlanType marshalDisasterPreventionBlockImprovementZonePlan(DisasterPreventionBlockImprovementZonePlan src) {
        DisasterPreventionBlockImprovementZonePlanType dest = factory.createDisasterPreventionBlockImprovementZonePlanType();
        marshalAbstractDistrictPlan(src, dest);

        if (src.getZonalDisasterPreventionFacilitiesAllocation() != null)
            dest.setZonalDisasterPreventionFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getZonalDisasterPreventionFacilitiesAllocation()));

        if (src.getSpecifiedZonalDisasterPreventionFacilitiesAllocation() != null)
            dest.setSpecifiedZonalDisasterPreventionFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getSpecifiedZonalDisasterPreventionFacilitiesAllocation()));

        for (ZonalDisasterPreventionFacilityProperty zonalDisasterPreventionFacilities : src.getZonalDisasterPreventionFacilities())
            dest.getZonalDisasterPreventionFacilities().add(marshalZonalDisasterPreventionFacilityProperty(zonalDisasterPreventionFacilities));

        return dest;
    }

    private ZonalDisasterPreventionFacilityType marshalZonalDisasterPreventionFacility(ZonalDisasterPreventionFacility src) {
        ZonalDisasterPreventionFacilityType dest = factory.createZonalDisasterPreventionFacilityType();
        marshalZone(src, dest);

        if (src.getFacilityType() != null)
            dest.setFacilityType(helper.getGMLMarshaller().marshalCode(src.getFacilityType()));

        return dest;
    }

    private ZonalDisasterPreventionFacilityPropertyType marshalZonalDisasterPreventionFacilityProperty(ZonalDisasterPreventionFacilityProperty src) {
        ZonalDisasterPreventionFacilityPropertyType dest = factory.createZonalDisasterPreventionFacilityPropertyType();

        if (src.isSetObject())
            dest.setZonalDisasterPreventionFacility(marshalZonalDisasterPreventionFacility(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private HistoricSceneryMaintenanceAndImprovementDistrictPlanType marshalHistoricSceneryMaintenanceAndImprovementDistrictPlan(HistoricSceneryMaintenanceAndImprovementDistrictPlan src) {
        HistoricSceneryMaintenanceAndImprovementDistrictPlanType dest = factory.createHistoricSceneryMaintenanceAndImprovementDistrictPlanType();
        marshalAbstractDistrictPlan(src, dest);

        if (src.getLandUsePolicy() != null)
            dest.setLandUsePolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private RoadsideDistrictPlanType marshalRoadsideDistrictPlan(RoadsideDistrictPlan src) {
        RoadsideDistrictPlanType dest = factory.createRoadsideDistrictPlanType();
        marshalAbstractDistrictPlan(src, dest);

        if (src.getFacilitiesAllocation() != null)
            dest.setFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getFacilitiesAllocation()));

        if (src.getLandUsePolicy() != null)
            dest.setLandUsePolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getLandUsePolicy()));

        return dest;
    }

    private RuralDistrictPlanType marshalRuralDistrictPlan(RuralDistrictPlan src) {
        RuralDistrictPlanType dest = factory.createRuralDistrictPlanType();
        marshalAbstractDistrictPlan(src, dest);
        return dest;
    }

    private void marshalDistrictDevelopmentPlan(DistrictDevelopmentPlan src, DistrictDevelopmentPlanType dest) {
        marshalZone(src, dest);

        if (src.getDistrictFacilitiesAllocation() != null)
            dest.setDistrictFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getDistrictFacilitiesAllocation()));

        if (src.getBuildingRestrictions() != null)
            dest.setBuildingRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingRestrictions()));

        if (src.getUrbanGreenSpaceConservation() != null)
            dest.setUrbanGreenSpaceConservation(helper.getGMLMarshaller().marshalStringOrRef(src.getUrbanGreenSpaceConservation()));

        if (src.getActivityRestrictionInFarmland() != null)
            dest.setActivityRestrictionInFarmland(helper.getGMLMarshaller().marshalStringOrRef(src.getActivityRestrictionInFarmland()));

        if (src.getLanduseRestrictions() != null)
            dest.setLanduseRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getLanduseRestrictions()));

        for (DistrictFacilityProperty districtFacility : src.getDistrictFacility())
            dest.getDistrictFacility().add(marshalDistrictFacilityProperty(districtFacility));

        for (DistrictProperty district : src.getDistrict())
            dest.getDistrict().add(marshalDistrictProperty(district));
    }

    private DistrictDevelopmentPlanType marshalDistrictDevelopmentPlan(DistrictDevelopmentPlan src) {
        DistrictDevelopmentPlanType dest = factory.createDistrictDevelopmentPlanType();
        marshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private SpecifiedBuildingZoneImprovementPlanType marshalSpecifiedBuildingZoneImprovementPlan(SpecifiedBuildingZoneImprovementPlan src) {
        SpecifiedBuildingZoneImprovementPlanType dest = factory.createSpecifiedBuildingZoneImprovementPlanType();
        marshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType marshalDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan src) {
        DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType dest = factory.createDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType();
        marshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType marshalDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict src) {
        DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType dest = factory.createDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType();
        marshalDistrictDevelopmentPlan(src, dest);
        return dest;
    }

    private RoadsideDistrictImprovementPlanType marshalRoadsideDistrictImprovementPlan(RoadsideDistrictImprovementPlan src) {
        RoadsideDistrictImprovementPlanType dest = factory.createRoadsideDistrictImprovementPlanType();
        marshalDistrictDevelopmentPlan(src, dest);

        if (src.getRoadsideDistrictFacilitiesAllocation() != null)
            dest.setRoadsideDistrictFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getRoadsideDistrictFacilitiesAllocation()));

        return dest;
    }

    private RuralDistrictImprovementPlanType marshalRuralDistrictImprovementPlan(RuralDistrictImprovementPlan src) {
        RuralDistrictImprovementPlanType dest = factory.createRuralDistrictImprovementPlanType();
        marshalDistrictDevelopmentPlan(src, dest);

        if (src.getRuralDistrictFacilitiesAllocation() != null)
            dest.setRuralDistrictFacilitiesAllocation(helper.getGMLMarshaller().marshalStringOrRef(src.getRuralDistrictFacilitiesAllocation()));

        return dest;
    }

    private DistrictDevelopmentPlanPropertyType marshalDistrictDevelopmentPlanProperty(DistrictDevelopmentPlanProperty src) {
        DistrictDevelopmentPlanPropertyType dest = factory.createDistrictDevelopmentPlanPropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof DistrictDevelopmentPlanType)
                dest.setDistrictDevelopmentPlan((JAXBElement<? extends DistrictDevelopmentPlanType>) elem);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalDistrictFacility(DistrictFacility src, DistrictFacilityType dest) {
        marshalZone(src, dest);
    }

    private DistrictFacilityType marshalDistrictFacility(DistrictFacility src) {
        DistrictFacilityType dest = factory.createDistrictFacilityType();
        marshalDistrictFacility(src, dest);
        return dest;
    }

    private RoadsideDistrictFacilityType marshalRoadsideDistrictFacility(RoadsideDistrictFacility src) {
        RoadsideDistrictFacilityType dest = factory.createRoadsideDistrictFacilityType();
        marshalDistrictFacility(src, dest);
        return dest;
    }

    private RuralDistrictFacilityType marshalRuralDistrictFacility(RuralDistrictFacility src) {
        RuralDistrictFacilityType dest = factory.createRuralDistrictFacilityType();
        marshalDistrictFacility(src, dest);
        return dest;
    }

    private DistrictFacilityPropertyType marshalDistrictFacilityProperty(DistrictFacilityProperty src) {
        DistrictFacilityPropertyType dest = factory.createDistrictFacilityPropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof DistrictFacilityType)
                dest.setDistrictFacility((JAXBElement<? extends DistrictFacilityType>) elem);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private DistrictType marshalDistrict(District src) {
        DistrictType dest = factory.createDistrictType();
        marshalZone(src, dest);

        if (src.getBuildingRestrictions() != null)
            dest.setBuildingRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingRestrictions()));

        if (src.getUseRestrictions() != null)
            dest.setUseRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getUseRestrictions()));

        if (src.getMaximumFloorAreaRate() != null)
            dest.setMaximumFloorAreaRate(BigInteger.valueOf(src.getMaximumFloorAreaRate()));

        if (src.getMinimumFloorAreaRate() != null)
            dest.setMinimumFloorAreaRate(BigInteger.valueOf(src.getMinimumFloorAreaRate()));

        if (src.getMaximumBuildingCoverageRate() != null)
            dest.setMaximumBuildingCoverageRate(BigInteger.valueOf(src.getMaximumBuildingCoverageRate()));

        if (src.getMinimumBuildingCoverageRate() != null)
            dest.setMinimumBuildingCoverageRate(BigInteger.valueOf(src.getMinimumBuildingCoverageRate()));

        if (src.getMinimumSiteArea() != null)
            dest.setMinimumSiteArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumSiteArea()));

        if (src.getMinimumBuildingArea() != null)
            dest.setMinimumBuildingArea(helper.getGMLMarshaller().marshalMeasure(src.getMinimumBuildingArea()));

        if (src.getMinimumGroundHeight() != null)
            dest.setMinimumGroundHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumGroundHeight()));

        if (src.getSetbackSize() != null)
            dest.setSetbackSize(helper.getGMLMarshaller().marshalStringOrRef(src.getSetbackSize()));

        if (src.getStructurePlacementRestrictions() != null)
            dest.setStructurePlacementRestrictions(helper.getGMLMarshaller().marshalStringOrRef(src.getStructurePlacementRestrictions()));

        if (src.getMaximumBuildingHeight() != null)
            dest.setMaximumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMaximumBuildingHeight()));

        if (src.getMinimumBuildingHeight() != null)
            dest.setMinimumBuildingHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumBuildingHeight()));

        if (src.getMinimumFloorHeight() != null)
            dest.setMinimumFloorHeight(helper.getGMLMarshaller().marshalLength(src.getMinimumFloorHeight()));

        if (src.getBuildingDesignRestriction() != null)
            dest.setBuildingDesignRestriction(helper.getGMLMarshaller().marshalStringOrRef(src.getBuildingDesignRestriction()));

        if (src.getMinimumGreeningRate() != null)
            dest.setMinimumGreeningRate(BigInteger.valueOf(src.getMinimumGreeningRate()));

        if (src.getFenceGuideline() != null)
            dest.setFenceGuideline(helper.getGMLMarshaller().marshalStringOrRef(src.getFenceGuideline()));

        if (src.getRestrictionsForFireProtection() != null)
            dest.setRestrictionsForFireProtection(helper.getGMLMarshaller().marshalStringOrRef(src.getRestrictionsForFireProtection()));

        if (src.getRestrictionsForNoiseProtection() != null)
            dest.setRestrictionsForNoiseProtection(helper.getGMLMarshaller().marshalStringOrRef(src.getRestrictionsForNoiseProtection()));

        if (src.getMinimumFrontageRate() != null)
            dest.setMinimumFrontageRate(BigInteger.valueOf(src.getMinimumFrontageRate()));

        return dest;
    }

    private DistrictPropertyType marshalDistrictProperty(DistrictProperty src) {
        DistrictPropertyType dest = factory.createDistrictPropertyType();

        if (src.isSetObject())
            dest.setDistrict(marshalDistrict(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private PromotionDistrictType marshalPromotionDistrict(PromotionDistrict src) {
        PromotionDistrictType dest = factory.createPromotionDistrictType();
        marshalZone(src, dest);
        return dest;
    }

    private PromotionDistrictPropertyType marshalPromotionDistrictProperty(PromotionDistrictProperty src) {
        PromotionDistrictPropertyType dest = factory.createPromotionDistrictPropertyType();

        if (src.isSetObject())
            dest.setPromotionDistrict(marshalPromotionDistrict(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private void marshalUrgentUrbanRenewalArea(UrgentUrbanRenewalArea src, UrgentUrbanRenewalAreaType dest) {
        marshalZone(src, dest);

        if (src.getDevelopmentPolicy() != null)
            dest.setDevelopmentPolicy(helper.getGMLMarshaller().marshalStringOrRef(src.getDevelopmentPolicy()));

        for (PrivateUrbanRenewalProjectPlanProperty privateProject : src.getPrivateProject())
            dest.getPrivateProject().add(marshalPrivateUrbanRenewalProjectPlanProperty(privateProject));

        for (SpecifiedUrgentUrbanRenewalAreaProperty specifiedArea : src.getSpecifiedArea())
            dest.getSpecifiedArea().add(marshalSpecifiedUrgentUrbanRenewalAreaProperty(specifiedArea));

        for (SpecialUrbanRenaissanceDistrictProperty specialDistrict : src.getSpecialDistrict())
            dest.getSpecialDistrict().add(marshalSpecialUrbanRenaissanceDistrictProperty(specialDistrict));
    }

    private UrgentUrbanRenewalAreaType marshalUrgentUrbanRenewalArea(UrgentUrbanRenewalArea src) {
        UrgentUrbanRenewalAreaType dest = factory.createUrgentUrbanRenewalAreaType();
        marshalUrgentUrbanRenewalArea(src, dest);
        return dest;
    }

    private SpecifiedUrgentUrbanRenewalAreaType marshalSpecifiedUrgentUrbanRenewalArea(SpecifiedUrgentUrbanRenewalArea src) {
        SpecifiedUrgentUrbanRenewalAreaType dest = factory.createSpecifiedUrgentUrbanRenewalAreaType();
        marshalUrgentUrbanRenewalArea(src, dest);

        for (GlobalHubCityDevelopmentProjectProperty developmentProject : src.getDevelopmentProject())
            dest.getDevelopmentProject().add(marshalGlobalHubCityDevelopmentProjectProperty(developmentProject));

        return dest;
    }

    private SpecifiedUrgentUrbanRenewalAreaPropertyType marshalSpecifiedUrgentUrbanRenewalAreaProperty(SpecifiedUrgentUrbanRenewalAreaProperty src) {
        SpecifiedUrgentUrbanRenewalAreaPropertyType dest = factory.createSpecifiedUrgentUrbanRenewalAreaPropertyType();

        if (src.isSetObject())
            dest.setSpecifiedUrgentUrbanRenewalArea(marshalSpecifiedUrgentUrbanRenewalArea(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private GlobalHubCityDevelopmentProjectType marshalGlobalHubCityDevelopmentProject(GlobalHubCityDevelopmentProject src) {
        GlobalHubCityDevelopmentProjectType dest = factory.createGlobalHubCityDevelopmentProjectType();
        marshalZone(src, dest);

        dest.setImplementationBody(src.getImplementationBody());
        dest.setImplementationPeriod(src.getImplementationPeriod());

        if (src.getPlan() != null)
            dest.setPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getPlan()));

        return dest;
    }

    private GlobalHubCityDevelopmentProjectPropertyType marshalGlobalHubCityDevelopmentProjectProperty(GlobalHubCityDevelopmentProjectProperty src) {
        GlobalHubCityDevelopmentProjectPropertyType dest = factory.createGlobalHubCityDevelopmentProjectPropertyType();

        if (src.isSetObject())
            dest.setGlobalHubCityDevelopmentProject(marshalGlobalHubCityDevelopmentProject(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private PrivateUrbanRenewalProjectPlanType marshalPrivateUrbanRenewalProjectPlan(PrivateUrbanRenewalProjectPlan src) {
        PrivateUrbanRenewalProjectPlanType dest = factory.createPrivateUrbanRenewalProjectPlanType();
        marshalZone(src, dest);

        dest.setDeveloper(src.getDeveloper());

        if (src.getPlan() != null)
            dest.setPlan(helper.getGMLMarshaller().marshalStringOrRef(src.getPlan()));

        return dest;
    }

    private PrivateUrbanRenewalProjectPlanPropertyType marshalPrivateUrbanRenewalProjectPlanProperty(PrivateUrbanRenewalProjectPlanProperty src) {
        PrivateUrbanRenewalProjectPlanPropertyType dest = factory.createPrivateUrbanRenewalProjectPlanPropertyType();

        if (src.isSetObject())
            dest.setPrivateUrbanRenewalProjectPlan(marshalPrivateUrbanRenewalProjectPlan(src.getObject()));

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private AgreementType marshalAgreement(Agreement src) {
        AgreementType dest = factory.createAgreementType();
        marshalZone(src, dest);

        if (src.getApplicableArea() != null)
            dest.setApplicableArea(helper.getGMLMarshaller().marshalMeasure(src.getApplicableArea()));

        if (src.getExpiration() != null)
            dest.setExpiration(marshaller.toCalendar(src.getExpiration()));

        return dest;
    }

    private RegulationType marshalRegulation(Regulation src) {
        RegulationType dest = factory.createRegulationType();
        marshalZone(src, dest);
        return dest;
    }

    private SedimentDisasterProneAreaType marshalSedimentDisasterProneArea(SedimentDisasterProneArea src) {
        SedimentDisasterProneAreaType dest = factory.createSedimentDisasterProneAreaType();
        marshalZone(src, dest);

        if (src.getDisasterType() != null)
            dest.setDisasterType(helper.getGMLMarshaller().marshalCode(src.getDisasterType()));

        if (src.getAreaType() != null)
            dest.setAreaType(helper.getGMLMarshaller().marshalCode(src.getAreaType()));

        dest.setZoneNumber(src.getZoneNumber());
        dest.setZoneName(src.getZoneName());

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        return dest;
    }

    private UnclassifiedBlankAreaType marshalUnclassifiedBlankArea(UnclassifiedBlankArea src) {
        UnclassifiedBlankAreaType dest = factory.createUnclassifiedBlankAreaType();
        marshalZone(src, dest);
        return dest;
    }

    private UnclassifiedUseDistrictType marshalUnclassifiedUseDistrict(UnclassifiedUseDistrict src) {
        UnclassifiedUseDistrictType dest = factory.createUnclassifiedUseDistrictType();
        marshalZone(src, dest);
        return dest;
    }

    private ResidenceAttractionAreaType marshalResidenceAttractionArea(ResidenceAttractionArea src) {
        ResidenceAttractionAreaType dest = factory.createResidenceAttractionAreaType();
        marshalZone(src, dest);
        return dest;
    }

    private UrbanFunctionAttractionAreaType marshalUrbanFunctionAttractionArea(UrbanFunctionAttractionArea src) {
        UrbanFunctionAttractionAreaType dest = factory.createUrbanFunctionAttractionAreaType();
        marshalZone(src, dest);
        return dest;
    }

    private BoundaryType marshalBoundary(Boundary src) {
        BoundaryType dest = factory.createBoundaryType();

        if (src.getClassifier() != null)
            dest.setClazz(helper.getGMLMarshaller().marshalCode(src.getClassifier()));

        for (Code function : src.getFunction())
            dest.getFunction().add(helper.getGMLMarshaller().marshalCode(function));

        for (Code usage : src.getUsage())
            dest.getUsage().add(helper.getGMLMarshaller().marshalCode(usage));

        if (src.getOffset() != null)
            dest.setOffset(helper.getGMLMarshaller().marshalLength(src.getOffset()));

        dest.setOffsetDirection(src.getOffsetDirection());

        if (src.getLocation() != null)
            dest.setLocation(helper.getGMLMarshaller().marshalMultiCurveProperty(src.getLocation()));

        return dest;
    }

    private BoundaryPropertyType marshalBoundaryProperty(BoundaryProperty src) {
        BoundaryPropertyType dest = factory.createBoundaryPropertyType();

        if (src.isSetObject())
            dest.setBoundary(marshalBoundary(src.getObject()));

        return dest;
    }

    private UrbanParkAttributeType marshalUrbanParkAttribute(UrbanParkAttribute src) {
        UrbanParkAttributeType dest = factory.createUrbanParkAttributeType();

        if (src.getParkCode() != null)
            dest.setParkCode(helper.getGMLMarshaller().marshalCode(src.getParkCode()));

        if (src.getStartFrom() != null)
            dest.setStartFrom(marshaller.toCalendar(src.getStartFrom()));

        for (BreakdownOfNominalAreaProperty breakdownOfNominalArea : src.getBreakdownOfNominalArea())
            dest.getBreakdownOfNominalArea().add(marshalBreakdownOfNominalAreaProperty(breakdownOfNominalArea));

        return dest;
    }

    private UrbanParkAttributePropertyType marshalUrbanParkAttributeProperty(UrbanParkAttributeProperty src) {
        UrbanParkAttributePropertyType dest = factory.createUrbanParkAttributePropertyType();

        if (src.isSetObject())
            dest.setUrbanParkAttribute(marshalUrbanParkAttribute(src.getObject()));

        return dest;
    }

    private BreakdownOfNominalAreaType marshalBreakdownOfNominalArea(BreakdownOfNominalArea src) {
        BreakdownOfNominalAreaType dest = factory.createBreakdownOfNominalAreaType();

        dest.setBreakdown(src.getBreakdown());

        if (src.getAreaInSquareMeter() != null)
            dest.setAreaInSquareMeter(helper.getGMLMarshaller().marshalMeasure(src.getAreaInSquareMeter()));

        return dest;
    }

    private BreakdownOfNominalAreaPropertyType marshalBreakdownOfNominalAreaProperty(BreakdownOfNominalAreaProperty src) {
        BreakdownOfNominalAreaPropertyType dest = factory.createBreakdownOfNominalAreaPropertyType();

        if (src.isSetObject())
            dest.setBreakdownOfNominalArea(marshalBreakdownOfNominalArea(src.getObject()));

        return dest;
    }

    private AdministrationType marshalAdministration(Administration src) {
        AdministrationType dest = factory.createAdministrationType();
        marshalUrbanFunction(src, dest);

        for (org.citygml4j.ade.iur.model.uro.DmAttributeProperty urfDmAttribute : src.getUrfDmAttribute())
            dest.getUrfDmAttribute().add((jp.geospatial.iur._3_1.uro.DmAttributePropertyType) helper.getJAXBMarshaller().marshal(urfDmAttribute));

        return dest;
    }

    private DisasterDamageType marshalDisasterDamage(DisasterDamage src) {
        DisasterDamageType dest = factory.createDisasterDamageType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getDate() != null)
            dest.setDate(marshaller.toCalendar(src.getDate()));

        if (src.getDamagedArea() != null)
            dest.setDamagedArea(helper.getGMLMarshaller().marshalMeasure(src.getDamagedArea()));

        if (src.getNumberOfDamagedHouses() != null)
            dest.setNumberOfDamagedHouses(BigInteger.valueOf(src.getNumberOfDamagedHouses()));

        if (src.getNumberOfHousesFloodedAboveFloorLevel() != null)
            dest.setNumberOfHousesFloodedAboveFloorLevel(BigInteger.valueOf(src.getNumberOfHousesFloodedAboveFloorLevel()));

        if (src.getNumberOfHousesFloodedBelowFloorLevel() != null)
            dest.setNumberOfHousesFloodedBelowFloorLevel(BigInteger.valueOf(src.getNumberOfHousesFloodedBelowFloorLevel()));

        if (src.getMaximumRainfallPerHour() != null)
            dest.setMaximumRainfallPerHour(BigInteger.valueOf(src.getMaximumRainfallPerHour()));

        if (src.getTotalRainfall() != null)
            dest.setTotalRainfall(BigInteger.valueOf(src.getTotalRainfall()));

        return dest;
    }

    private PollutionType marshalPollution(Pollution src) {
        PollutionType dest = factory.createPollutionType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getYear() != null)
            dest.setYear(marshaller.toCalendar(src.getYear()));

        dest.setCause(src.getCause());

        if (src.getDamagedArea() != null)
            dest.setDamagedArea(helper.getGMLMarshaller().marshalMeasure(src.getDamagedArea()));

        if (src.getObservationPoint() != null)
            dest.setObservationPoint(marshalObservationPointProperty(src.getObservationPoint()));

        return dest;
    }

    private ObservationPointType marshalObservationPoint(ObservationPoint src) {
        ObservationPointType dest = factory.createObservationPointType();

        if (src.getLod0MultiPoint() != null)
            dest.setLod0MultiPoint(helper.getGMLMarshaller().marshalMultiPointProperty(src.getLod0MultiPoint()));

        return dest;
    }

    private ObservationPointPropertyType marshalObservationPointProperty(ObservationPointProperty src) {
        ObservationPointPropertyType dest = factory.createObservationPointPropertyType();

        if (src.isSetObject())
            dest.setObservationPoint(marshalObservationPoint(src.getObject()));

        return dest;
    }

    private DisasterPreventionBaseType marshalDisasterPreventionBase(DisasterPreventionBase src) {
        DisasterPreventionBaseType dest = factory.createDisasterPreventionBaseType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        return dest;
    }

    private RecreationsType marshalRecreations(Recreations src) {
        RecreationsType dest = factory.createRecreationsType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getCapacity() != null)
            dest.setCapacity(BigInteger.valueOf(src.getCapacity()));

        if (src.getNumberOfUsers() != null)
            dest.setNumberOfUsers(BigInteger.valueOf(src.getNumberOfUsers()));

        return dest;
    }

    private HubCityType marshalHubCity(HubCity src) {
        HubCityType dest = factory.createHubCityType();
        marshalUrbanFunction(src, dest);
        return dest;
    }

    private LandUseDiversionType marshalLandUseDiversion(LandUseDiversion src) {
        LandUseDiversionType dest = factory.createLandUseDiversionType();
        marshalUrbanFunction(src, dest);

        if (src.getFarmlandConversionType() != null)
            dest.setFarmlandConversionType(marshalFarmlandConversionTypeProperty(src.getFarmlandConversionType()));

        if (src.getForestConversionType() != null)
            dest.setForestConversionType(marshalForestConversionTypeProperty(src.getForestConversionType()));

        return dest;
    }

    private FarmlandConversionTypeType marshalFarmlandConversionType(FarmlandConversionType src) {
        FarmlandConversionTypeType dest = factory.createFarmlandConversionTypeType();

        dest.setId(src.getId());

        if (src.getYearOfDiversion() != null)
            dest.setYearOfDiversion(marshaller.toCalendar(src.getYearOfDiversion()));

        dest.setIsDesignated(src.getIsDesignated());

        return dest;
    }

    private FarmlandConversionTypePropertyType marshalFarmlandConversionTypeProperty(FarmlandConversionTypeProperty src) {
        FarmlandConversionTypePropertyType dest = factory.createFarmlandConversionTypePropertyType();

        if (src.isSetObject())
            dest.setFarmlandConversionType(marshalFarmlandConversionType(src.getObject()));

        return dest;
    }

    private ForestConversionTypeType marshalForestConversionType(ForestConversionType src) {
        ForestConversionTypeType dest = factory.createForestConversionTypeType();

        dest.setId(src.getId());

        if (src.getYearOfDiversion() != null)
            dest.setYearOfDiversion(marshaller.toCalendar(src.getYearOfDiversion()));

        return dest;
    }

    private ForestConversionTypePropertyType marshalForestConversionTypeProperty(ForestConversionTypeProperty src) {
        ForestConversionTypePropertyType dest = factory.createForestConversionTypePropertyType();

        if (src.isSetObject())
            dest.setForestConversionType(marshalForestConversionType(src.getObject()));

        return dest;
    }

    private UrbanizationType marshalUrbanization(Urbanization src) {
        UrbanizationType dest = factory.createUrbanizationType();
        marshalUrbanFunction(src, dest);

        dest.setPeriod(src.getPeriod());
        dest.setResources(src.getResources());

        return dest;
    }

    private DIDType marshalDID(DID src) {
        DIDType dest = factory.createDIDType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getPopulation() != null)
            dest.setPopulation(BigInteger.valueOf(src.getPopulation()));

        dest.setPopulationDensity(src.getPopulationDensity());

        return dest;
    }

    private CensusBlockType marshalCensusBlock(CensusBlock src) {
        CensusBlockType dest = factory.createCensusBlockType();
        marshalUrbanFunction(src, dest);

        dest.setTownName(src.getTownName());
        dest.setBlockName(src.getBlockName());

        if (src.getPopulationType() != null)
            dest.setPopulationType(marshalPopulationTypeProperty(src.getPopulationType()));

        if (src.getDaytimePopulationType() != null)
            dest.setDaytimePopulationType(marshalDaytimePopulationTypeProperty(src.getDaytimePopulationType()));

        if (src.getEconomicActivityType() != null)
            dest.setEconomicActivityType(marshalEconomicActivityTypeProperty(src.getEconomicActivityType()));

        return dest;
    }

    private PopulationTypeType marshalPopulationType(PopulationType src) {
        PopulationTypeType dest = factory.createPopulationTypeType();

        for (PopulationByAgeAndSexTypeProperty population : src.getPopulation())
            dest.getPopulation().add(marshalPopulationByAgeAndSexTypeProperty(population));

        dest.setPopulationDensity(src.getPopulationDensity());

        return dest;
    }

    private PopulationTypePropertyType marshalPopulationTypeProperty(PopulationTypeProperty src) {
        PopulationTypePropertyType dest = factory.createPopulationTypePropertyType();

        if (src.isSetObject())
            dest.setPopulationType(marshalPopulationType(src.getObject()));

        return dest;
    }

    private PopulationByAgeAndSexTypeType marshalPopulationByAgeAndSexType(PopulationByAgeAndSexType src) {
        PopulationByAgeAndSexTypeType dest = factory.createPopulationByAgeAndSexTypeType();

        if (src.getAgeAndSex() != null)
            dest.setAgeAndSex(helper.getGMLMarshaller().marshalCode(src.getAgeAndSex()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private PopulationByAgeAndSexTypePropertyType marshalPopulationByAgeAndSexTypeProperty(PopulationByAgeAndSexTypeProperty src) {
        PopulationByAgeAndSexTypePropertyType dest = factory.createPopulationByAgeAndSexTypePropertyType();

        if (src.isSetObject())
            dest.setPopulationByAgeAndSexType(marshalPopulationByAgeAndSexType(src.getObject()));

        return dest;
    }

    private DaytimePopulationTypeType marshalDaytimePopulationType(DaytimePopulationType src) {
        DaytimePopulationTypeType dest = factory.createDaytimePopulationTypeType();

        if (src.getDaytimePopulation() != null)
            dest.setDaytimePopulation(BigInteger.valueOf(src.getDaytimePopulation()));

        dest.setDaytimePopulationDensity(src.getDaytimePopulationDensity());

        if (src.getDaytimeOfficeCommuter() != null)
            dest.setDaytimeOfficeCommuter(BigInteger.valueOf(src.getDaytimeOfficeCommuter()));

        if (src.getDaytimeSchoolCommuter() != null)
            dest.setDaytimeSchoolCommuter(BigInteger.valueOf(src.getDaytimeSchoolCommuter()));

        if (src.getDaytimeUnder15() != null)
            dest.setDaytimeUnder15(BigInteger.valueOf(src.getDaytimeUnder15()));

        if (src.getDaytimeOver15() != null)
            dest.setDaytimeOver15(BigInteger.valueOf(src.getDaytimeOver15()));

        if (src.getAgriculturalWorker() != null)
            dest.setAgriculturalWorker(BigInteger.valueOf(src.getAgriculturalWorker()));

        if (src.getNonCommuter() != null)
            dest.setNonCommuter(BigInteger.valueOf(src.getNonCommuter()));

        return dest;
    }

    private DaytimePopulationTypePropertyType marshalDaytimePopulationTypeProperty(DaytimePopulationTypeProperty src) {
        DaytimePopulationTypePropertyType dest = factory.createDaytimePopulationTypePropertyType();

        if (src.isSetObject())
            dest.setDaytimePopulationType(marshalDaytimePopulationType(src.getObject()));

        return dest;
    }

    private EconomicActivityTypeType marshalEconomicActivityType(EconomicActivityType src) {
        EconomicActivityTypeType dest = factory.createEconomicActivityTypeType();

        for (EconomicActivitySumTypeProperty numberOfOffices : src.getNumberOfOffices())
            dest.getNumberOfOffices().add(marshalEconomicActivitySumTypeProperty(numberOfOffices));

        for (EconomicActivitySumTypeProperty numberOfEmployees : src.getNumberOfEmployees())
            dest.getNumberOfEmployees().add(marshalEconomicActivitySumTypeProperty(numberOfEmployees));

        for (EconomicActivitySumTypeProperty retailSales : src.getRetailSales())
            dest.getRetailSales().add(marshalEconomicActivitySumTypeProperty(retailSales));

        for (EconomicActivitySumTypeProperty manufactureShipments : src.getManufactureShipments())
            dest.getManufactureShipments().add(marshalEconomicActivitySumTypeProperty(manufactureShipments));

        return dest;
    }

    private EconomicActivityTypePropertyType marshalEconomicActivityTypeProperty(EconomicActivityTypeProperty src) {
        EconomicActivityTypePropertyType dest = factory.createEconomicActivityTypePropertyType();

        if (src.isSetObject())
            dest.setEconomicActivityType(marshalEconomicActivityType(src.getObject()));

        return dest;
    }

    private EconomicActivitySumTypeType marshalEconomicActivitySumType(EconomicActivitySumType src) {
        EconomicActivitySumTypeType dest = factory.createEconomicActivitySumTypeType();

        if (src.getIndustryType() != null)
            dest.setIndustryType(helper.getGMLMarshaller().marshalCode(src.getIndustryType()));

        if (src.getNumber() != null)
            dest.setNumber(BigInteger.valueOf(src.getNumber()));

        return dest;
    }

    private EconomicActivitySumTypePropertyType marshalEconomicActivitySumTypeProperty(EconomicActivitySumTypeProperty src) {
        EconomicActivitySumTypePropertyType dest = factory.createEconomicActivitySumTypePropertyType();

        if (src.isSetObject())
            dest.setEconomicActivitySumType(marshalEconomicActivitySumType(src.getObject()));

        return dest;
    }

    private DevelopmentProjectType marshalDevelopmentProject(DevelopmentProject src) {
        DevelopmentProjectType dest = factory.createDevelopmentProjectType();
        marshalUrbanFunction(src, dest);

        if (src.getResidentialDevelopmentType() != null)
            dest.setResidentialDevelopmentType(marshalResidentialDevelopmentTypeProperty(src.getResidentialDevelopmentType()));

        if (src.getUrbanDevelopmentType() != null)
            dest.setUrbanDevelopmentType(marshalUrbanDevelopmentProjectTypeProperty(src.getUrbanDevelopmentType()));

        if (src.getAgriculturalDevelopmentType() != null)
            dest.setAgriculturalDevelopmentType(marshalAgriculturalDevelopmentProjectTypeProperty(src.getAgriculturalDevelopmentType()));

        return dest;
    }

    private ResidentialDevelopmentTypeType marshalResidentialDevelopmentType(ResidentialDevelopmentType src) {
        ResidentialDevelopmentTypeType dest = factory.createResidentialDevelopmentTypeType();

        dest.setId(src.getId());

        if (src.getArea() != null)
            dest.setArea(helper.getGMLMarshaller().marshalMeasure(src.getArea()));

        dest.setProjectPeriod(src.getProjectPeriod());
        dest.setPurpose(src.getPurpose());

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        dest.setNote(src.getNote());

        return dest;
    }

    private ResidentialDevelopmentTypePropertyType marshalResidentialDevelopmentTypeProperty(ResidentialDevelopmentTypeProperty src) {
        ResidentialDevelopmentTypePropertyType dest = factory.createResidentialDevelopmentTypePropertyType();

        if (src.isSetObject())
            dest.setResidentialDevelopmentType(marshalResidentialDevelopmentType(src.getObject()));

        return dest;
    }

    private UrbanDevelopmentProjectTypeType marshalUrbanDevelopmentProjectType(UrbanDevelopmentProjectType src) {
        UrbanDevelopmentProjectTypeType dest = factory.createUrbanDevelopmentProjectTypeType();

        dest.setId(src.getId());

        if (src.getDateOfDecision() != null)
            dest.setDateOfDecision(marshaller.toCalendar(src.getDateOfDecision()));

        dest.setProjectName(src.getProjectName());

        if (src.getPlannedArea() != null)
            dest.setPlannedArea(helper.getGMLMarshaller().marshalMeasure(src.getPlannedArea()));

        if (src.getOngoingArea() != null)
            dest.setOngoingArea(helper.getGMLMarshaller().marshalMeasure(src.getOngoingArea()));

        dest.setCostUpToLastFiscalYear(src.getCostUpToLastFiscalYear());
        dest.setCost(src.getCost());

        if (src.getCompletedArea() != null)
            dest.setCompletedArea(helper.getGMLMarshaller().marshalMeasure(src.getCompletedArea()));

        dest.setProjectPeriod(src.getProjectPeriod());
        dest.setNote(src.getNote());

        return dest;
    }

    private UrbanDevelopmentProjectTypePropertyType marshalUrbanDevelopmentProjectTypeProperty(UrbanDevelopmentProjectTypeProperty src) {
        UrbanDevelopmentProjectTypePropertyType dest = factory.createUrbanDevelopmentProjectTypePropertyType();

        if (src.isSetObject())
            dest.setUrbanDevelopmentProjectType(marshalUrbanDevelopmentProjectType(src.getObject()));

        return dest;
    }

    private AgriculturalDevelopmentProjectTypeType marshalAgriculturalDevelopmentProjectType(AgriculturalDevelopmentProjectType src) {
        AgriculturalDevelopmentProjectTypeType dest = factory.createAgriculturalDevelopmentProjectTypeType();

        dest.setId(src.getId());
        dest.setBlockName(src.getBlockName());

        if (src.getProjectType() != null)
            dest.setProjectType(helper.getGMLMarshaller().marshalCode(src.getProjectType()));

        dest.setImplementationBody(src.getImplementationBody());

        if (src.getBenefitArea() != null)
            dest.setBenefitArea(helper.getGMLMarshaller().marshalMeasure(src.getBenefitArea()));

        if (src.getBenefitAreaInUrbanArea() != null)
            dest.setBenefitAreaInUrbanArea(helper.getGMLMarshaller().marshalMeasure(src.getBenefitAreaInUrbanArea()));

        if (src.getStartFiscalYear() != null)
            dest.setStartFiscalYear(marshaller.toCalendar(src.getStartFiscalYear()));

        if (src.getStatus() != null)
            dest.setStatus(helper.getGMLMarshaller().marshalCode(src.getStatus()));

        if (src.getMeasureType() != null)
            dest.setMeasureType(helper.getGMLMarshaller().marshalCode(src.getMeasureType()));

        dest.setBenefitPeriod(src.getBenefitPeriod());
        dest.setNote(src.getNote());

        return dest;
    }

    private AgriculturalDevelopmentProjectTypePropertyType marshalAgriculturalDevelopmentProjectTypeProperty(AgriculturalDevelopmentProjectTypeProperty src) {
        AgriculturalDevelopmentProjectTypePropertyType dest = factory.createAgriculturalDevelopmentProjectTypePropertyType();

        if (src.isSetObject())
            dest.setAgriculturalDevelopmentProjectType(marshalAgriculturalDevelopmentProjectType(src.getObject()));

        return dest;
    }

    private NewHousingType marshalNewHousing(NewHousing src) {
        NewHousingType dest = factory.createNewHousingType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        for (Code purpose : src.getPurpose())
            dest.getPurpose().add(helper.getGMLMarshaller().marshalCode(purpose));

        dest.setDeveloper(src.getDeveloper());

        if (src.getYearOfConstruction() != null)
            dest.setYearOfConstruction(marshaller.toCalendar(src.getYearOfConstruction()));

        return dest;
    }

    private UrbanFacilityStatusType marshalUrbanFacilityStatus(UrbanFacilityStatus src) {
        UrbanFacilityStatusType dest = factory.createUrbanFacilityStatusType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());

        if (src.getDateOfDecision() != null)
            dest.setDateOfDecision(marshaller.toCalendar(src.getDateOfDecision()));

        dest.setFacilityName(src.getFacilityName());
        dest.setIsPlanned(src.getIsPlanned());
        dest.setIsImplemented(src.getIsImplemented());
        dest.setCostUptToLastYear(src.getCostUptToLastYear());
        dest.setTotalCost(src.getTotalCost());
        dest.setIsCompleted(src.getIsCompleted());

        if (src.getStartDate() != null)
            dest.setStartDate(marshaller.toCalendar(src.getStartDate()));

        if (src.getCompletedDate() != null)
            dest.setCompletedDate(marshaller.toCalendar(src.getCompletedDate()));

        return dest;
    }

    private PublicTransitFacilityType marshalPublicTransitFacility(PublicTransitFacility src) {
        PublicTransitFacilityType dest = factory.createPublicTransitFacilityType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());
        dest.setCompanyName(src.getCompanyName());

        if (src.getCompanyType() != null)
            dest.setCompanyType(helper.getGMLMarshaller().marshalCode(src.getCompanyType()));

        if (src.getFacilityType() != null)
            dest.setFacilityType(helper.getGMLMarshaller().marshalCode(src.getFacilityType()));

        dest.setSecionName(src.getSecionName());

        if (src.getFrequencyOfService() != null)
            dest.setFrequencyOfService(BigInteger.valueOf(src.getFrequencyOfService()));

        if (src.getNumberOfCustomers() != null)
            dest.setNumberOfCustomers(BigInteger.valueOf(src.getNumberOfCustomers()));

        return dest;
    }

    private LandPriceType marshalLandPrice(LandPrice src) {
        LandPriceType dest = factory.createLandPriceType();
        marshalUrbanFunction(src, dest);

        dest.setPointCode(src.getPointCode());
        dest.setPointCodeOfLastYear(src.getPointCodeOfLastYear());

        if (src.getFiscalYear() != null)
            dest.setFiscalYear(marshaller.toCalendar(src.getFiscalYear()));

        if (src.getLandPrice() != null)
            dest.setLandPrice(BigInteger.valueOf(src.getLandPrice()));

        dest.setVariability(src.getVariability());
        dest.setIsSelected(src.getIsSelected());
        dest.setIsAddressChanged(src.getIsAddressChanged());
        dest.setIsAcreageChanged(src.getIsAcreageChanged());
        dest.setIsUseChanged(src.getIsUseChanged());
        dest.setIsBuildingStructureChanged(src.getIsBuildingStructureChanged());
        dest.setIsSupplyFacilitiesChanged(src.getIsSupplyFacilitiesChanged());
        dest.setIsDistanceFromStationChanged(src.getIsDistanceFromStationChanged());
        dest.setIsUseDistrictChanged(src.getIsUseDistrictChanged());
        dest.setIsFirePreventionChanged(src.getIsFirePreventionChanged());
        dest.setIsUrbanPlanAreaChanged(src.getIsUrbanPlanAreaChanged());
        dest.setIsBuildingCoverageRateChanged(src.getIsBuildingCoverageRateChanged());
        dest.setIsFloorAreaRateChanged(src.getIsFloorAreaRateChanged());

        for (Code cityCode : src.getCityCode())
            dest.getCityCode().add(helper.getGMLMarshaller().marshalCode(cityCode));

        dest.setCityName(src.getCityName());
        dest.setLocationDescription(src.getLocationDescription());
        dest.setAddress(src.getAddress());

        if (src.getAcreage() != null)
            dest.setAcreage(helper.getGMLMarshaller().marshalMeasure(src.getAcreage()));

        for (String useStatus : src.getUseStatus())
            dest.getUseStatus().add(useStatus);

        dest.setUseStatusDescription(src.getUseStatusDescription());
        dest.setUseType(src.getUseType());
        dest.setBuildingStructure(src.getBuildingStructure());
        dest.setWater(src.getWater());
        dest.setGas(src.getGas());
        dest.setSewerage(src.getSewerage());
        dest.setShape(src.getShape());
        dest.setFrontageRate(src.getFrontageRate());
        dest.setDepthRate(src.getDepthRate());

        if (src.getStoreysAboveGround() != null)
            dest.setStoreysAboveGround(BigInteger.valueOf(src.getStoreysAboveGround()));

        if (src.getStoreysBelowGround() != null)
            dest.setStoreysBelowGround(BigInteger.valueOf(src.getStoreysBelowGround()));

        dest.setFrontageRoad(src.getFrontageRoad());
        dest.setFrontageRoadDirection(src.getFrontageRoadDirection());

        if (src.getFrontageRoadWidth() != null)
            dest.setFrontageRoadWidth(helper.getGMLMarshaller().marshalLength(src.getFrontageRoadWidth()));

        dest.setStationSquare(src.getStationSquare());
        dest.setFrontageRoadSurface(src.getFrontageRoadSurface());
        dest.setSideRoad(src.getSideRoad());
        dest.setSideRoadDirection(src.getSideRoadDirection());
        dest.setTransportationFacilities(src.getTransportationFacilities());
        dest.setSurroundings(src.getSurroundings());
        dest.setStationName(src.getStationName());

        if (src.getDistanceFromStation() != null)
            dest.setDistanceFromStation(helper.getGMLMarshaller().marshalLength(src.getDistanceFromStation()));

        if (src.getUseDistrict() != null)
            dest.setUseDistrict(helper.getGMLMarshaller().marshalCode(src.getUseDistrict()));

        dest.setFirePrevention(src.getFirePrevention());
        dest.setUrbanPlanAreaType(src.getUrbanPlanAreaType());
        dest.setHeightControl(src.getHeightControl());
        dest.setForest(src.getForest());
        dest.setPark(src.getPark());

        if (src.getBuildingCoverageRate() != null)
            dest.setBuildingCoverageRate(BigInteger.valueOf(src.getBuildingCoverageRate()));

        if (src.getFloorAreaRate() != null)
            dest.setFloorAreaRate(BigInteger.valueOf(src.getFloorAreaRate()));

        dest.setExtraFloorAreaRate(src.getExtraFloorAreaRate());
        dest.setIsSame(src.getIsSame());
        dest.setSelectionStatus(src.getSelectionStatus());

        for (ValueByCodesProperty landPriceHistory : src.getLandPriceHistory())
            dest.getLandPriceHistory().add(marshalValueByCodesProperty(landPriceHistory));

        for (ValueByCodesProperty attributeHistory : src.getAttributeHistory())
            dest.getAttributeHistory().add(marshalValueByCodesProperty(attributeHistory));

        return dest;
    }

    private ValueByCodesType marshalValueByCodes(ValueByCodes src) {
        ValueByCodesType dest = factory.createValueByCodesType();

        for (Code classifier : src.getClassifier())
            dest.getClazz().add(helper.getGMLMarshaller().marshalCode(classifier));

        if (src.getIntValue() != null)
            dest.setIntValue(BigInteger.valueOf(src.getIntValue()));

        dest.setStringValue(src.getStringValue());
        dest.setDoubleValue(src.getDoubleValue());

        if (src.getMeasureValue() != null)
            dest.setMeasureValue(helper.getGMLMarshaller().marshalMeasure(src.getMeasureValue()));

        return dest;
    }

    private ValueByCodesPropertyType marshalValueByCodesProperty(ValueByCodesProperty src) {
        ValueByCodesPropertyType dest = factory.createValueByCodesPropertyType();

        if (src.isSetObject())
            dest.setValueByCodes(marshalValueByCodes(src.getObject()));

        return dest;
    }

    private NaturalConditionsType marshalNaturalConditions(NaturalConditions src) {
        NaturalConditionsType dest = factory.createNaturalConditionsType();
        marshalUrbanFunction(src, dest);
        return dest;
    }

    private jp.geospatial.iur._3_1.urf.WeatherObservationType marshalWeatherObservation(WeatherObservation src) {
        jp.geospatial.iur._3_1.urf.WeatherObservationType dest = factory.createWeatherObservationType();
        marshalUrbanFunction(src, dest);

        for (WeatherObservationTypeProperty weatherObservationType : src.getWeatherObservationType())
            dest.getWeatherObservationType().add(marshalWeatherObservationTypeProperty(weatherObservationType));

        return dest;
    }

    private WeatherObservationTypeType marshalWeatherObservationType(WeatherObservationType src) {
        WeatherObservationTypeType dest = factory.createWeatherObservationTypeType();

        if (src.getDate() != null)
            dest.setDate(marshaller.toCalendar(src.getDate()));

        if (src.getTotalRainfall() != null)
            dest.setTotalRainfall(helper.getGMLMarshaller().marshalLength(src.getTotalRainfall()));

        if (src.getMaxRainfallPerHour() != null)
            dest.setMaxRainfallPerHour(helper.getGMLMarshaller().marshalLength(src.getMaxRainfallPerHour()));

        dest.setAverageTemperature(src.getAverageTemperature());
        dest.setMaxTemperature(src.getMaxTemperature());
        dest.setMinTemperature(src.getMinTemperature());
        dest.setAverageWindSpeed(src.getAverageWindSpeed());

        if (src.getMaxWindDirection() != null)
            dest.setMaxWindDirection(helper.getGMLMarshaller().marshalCode(src.getMaxWindDirection()));

        return dest;
    }

    private WeatherObservationTypePropertyType marshalWeatherObservationTypeProperty(WeatherObservationTypeProperty src) {
        WeatherObservationTypePropertyType dest = factory.createWeatherObservationTypePropertyType();

        if (src.isSetObject())
            dest.setWeatherObservationType(marshalWeatherObservationType(src.getObject()));

        return dest;
    }

    private GreenSpaceType marshalGreenSpace(GreenSpace src) {
        GreenSpaceType dest = factory.createGreenSpaceType();
        marshalUrbanFunction(src, dest);
        return dest;
    }

    private DistributionOfFloraAndFaunaType marshalDistributionOfFloraAndFauna(DistributionOfFloraAndFauna src) {
        DistributionOfFloraAndFaunaType dest = factory.createDistributionOfFloraAndFaunaType();
        marshalUrbanFunction(src, dest);
        return dest;
    }

    private ScenicResourceType marshalScenicResource(ScenicResource src) {
        ScenicResourceType dest = factory.createScenicResourceType();
        marshalUrbanFunction(src, dest);

        dest.setIdentifier(src.getIdentifier());
        dest.setTypeName(src.getTypeName());
        dest.setAddress(src.getAddress());

        return dest;
    }

    private TargetPropertyType marshalTargetProperty(TargetProperty src) {
        TargetPropertyType dest = factory.createTargetPropertyType();

        if (src.getObject() != null) {
            JAXBElement<?> elem = helper.getJAXBMarshaller().marshalJAXBElement(src.getObject());
            if (elem != null && elem.getValue() instanceof AbstractCityObjectType)
                dest.set_CityObject((JAXBElement<? extends AbstractCityObjectType>) elem);
        }

        dest.setRemoteSchema(src.getRemoteSchema());

        if (src.isSetType())
            dest.setType(TypeType.fromValue(src.getType().getValue()));

        dest.setHref(src.getHref());
        dest.setRole(src.getRole());
        dest.setArcrole(src.getArcrole());
        dest.setTitle(src.getTitle());

        if (src.isSetShow())
            dest.setShow(ShowType.fromValue(src.getShow().getValue()));

        if (src.isSetActuate())
            dest.setActuate(ActuateType.fromValue(src.getActuate().getValue()));

        return dest;
    }

    private JAXBElement<?> createZone(Zone src) {
        return factory.createZone(marshalZone(src));
    }

    private JAXBElement<?> createUrbanPlanningArea(UrbanPlanningArea src) {
        return factory.createUrbanPlanningArea(marshalUrbanPlanningArea(src));
    }

    private JAXBElement<?> createQuasiUrbanPlanningArea(QuasiUrbanPlanningArea src) {
        return factory.createQuasiUrbanPlanningArea(marshalQuasiUrbanPlanningArea(src));
    }

    private JAXBElement<?> createAreaClassification(AreaClassification src) {
        return factory.createAreaClassification(marshalAreaClassification(src));
    }

    private JAXBElement<?> createDistrictsAndZones(DistrictsAndZones src) {
        return factory.createDistrictsAndZones(marshalDistrictsAndZones(src));
    }

    private JAXBElement<?> createUseDistrict(UseDistrict src) {
        return factory.createUseDistrict(marshalUseDistrict(src));
    }

    private JAXBElement<?> createSpecialUseDistrict(SpecialUseDistrict src) {
        return factory.createSpecialUseDistrict(marshalSpecialUseDistrict(src));
    }

    private JAXBElement<?> createSpecialUseRestrictionDistrict(SpecialUseRestrictionDistrict src) {
        return factory.createSpecialUseRestrictionDistrict(marshalSpecialUseRestrictionDistrict(src));
    }

    private JAXBElement<?> createExceptionalFloorAreaRateDistrict(ExceptionalFloorAreaRateDistrict src) {
        return factory.createExceptionalFloorAreaRateDistrict(marshalExceptionalFloorAreaRateDistrict(src));
    }

    private JAXBElement<?> createHighRiseResidentialAttractionDistrict(HighRiseResidentialAttractionDistrict src) {
        return factory.createHighRiseResidentialAttractionDistrict(marshalHighRiseResidentialAttractionDistrict(src));
    }

    private JAXBElement<?> createHeightControlDistrict(HeightControlDistrict src) {
        return factory.createHeightControlDistrict(marshalHeightControlDistrict(src));
    }

    private JAXBElement<?> createHighLevelUseDistrict(HighLevelUseDistrict src) {
        return factory.createHighLevelUseDistrict(marshalHighLevelUseDistrict(src));
    }

    private JAXBElement<?> createSpecifiedBlock(SpecifiedBlock src) {
        return factory.createSpecifiedBlock(marshalSpecifiedBlock(src));
    }

    private JAXBElement<?> createSpecialUrbanRenaissanceDistrict(SpecialUrbanRenaissanceDistrict src) {
        return factory.createSpecialUrbanRenaissanceDistrict(marshalSpecialUrbanRenaissanceDistrict(src));
    }

    private JAXBElement<?> createHousingControlArea(HousingControlArea src) {
        return factory.createHousingControlArea(marshalHousingControlArea(src));
    }

    private JAXBElement<?> createResidentialEnvironmentImprovementDistrict(ResidentialEnvironmentImprovementDistrict src) {
        return factory.createResidentialEnvironmentImprovementDistrict(marshalResidentialEnvironmentImprovementDistrict(src));
    }

    private JAXBElement<?> createSpecialUseAttractionDistrict(SpecialUseAttractionDistrict src) {
        return factory.createSpecialUseAttractionDistrict(marshalSpecialUseAttractionDistrict(src));
    }

    private JAXBElement<?> createFirePreventionDistrict(FirePreventionDistrict src) {
        return factory.createFirePreventionDistrict(marshalFirePreventionDistrict(src));
    }

    private JAXBElement<?> createSpecifiedDisasterPreventionBlockImprovementZone(SpecifiedDisasterPreventionBlockImprovementZone src) {
        return factory.createSpecifiedDisasterPreventionBlockImprovementZone(marshalSpecifiedDisasterPreventionBlockImprovementZone(src));
    }

    private JAXBElement<?> createLandscapeZone(LandscapeZone src) {
        return factory.createLandscapeZone(marshalLandscapeZone(src));
    }

    private JAXBElement<?> createScenicDistrict(ScenicDistrict src) {
        return factory.createScenicDistrict(marshalScenicDistrict(src));
    }

    private JAXBElement<?> createParkingPlaceDevelopmentZone(ParkingPlaceDevelopmentZone src) {
        return factory.createParkingPlaceDevelopmentZone(marshalParkingPlaceDevelopmentZone(src));
    }

    private JAXBElement<?> createPortZone(PortZone src) {
        return factory.createPortZone(marshalPortZone(src));
    }

    private JAXBElement<?> createSpecialZoneForPreservationOfHistoricalLandscape(SpecialZoneForPreservationOfHistoricalLandscape src) {
        return factory.createSpecialZoneForPreservationOfHistoricalLandscape(marshalSpecialZoneForPreservationOfHistoricalLandscape(src));
    }

    private JAXBElement<?> createZoneForPreservationOfHistoricalLandscape(ZoneForPreservationOfHistoricalLandscape src) {
        return factory.createZoneForPreservationOfHistoricalLandscape(marshalZoneForPreservationOfHistoricalLandscape(src));
    }

    private JAXBElement<?> createGreenSpaceConservationDistrict(GreenSpaceConservationDistrict src) {
        return factory.createGreenSpaceConservationDistrict(marshalGreenSpaceConservationDistrict(src));
    }

    private JAXBElement<?> createSpecialGreenSpaceConservationDistrict(SpecialGreenSpaceConservationDistrict src) {
        return factory.createSpecialGreenSpaceConservationDistrict(marshalSpecialGreenSpaceConservationDistrict(src));
    }

    private JAXBElement<?> createTreePlantingDistrict(TreePlantingDistrict src) {
        return factory.createTreePlantingDistrict(marshalTreePlantingDistrict(src));
    }

    private JAXBElement<?> createDistributionBusinessZone(DistributionBusinessZone src) {
        return factory.createDistributionBusinessZone(marshalDistributionBusinessZone(src));
    }

    private JAXBElement<?> createProductiveGreenZone(ProductiveGreenZone src) {
        return factory.createProductiveGreenZone(marshalProductiveGreenZone(src));
    }

    private JAXBElement<?> createConservationZoneForClustersOfTraditionalStructures(ConservationZoneForClustersOfTraditionalStructures src) {
        return factory.createConservationZoneForClustersOfTraditionalStructures(marshalConservationZoneForClustersOfTraditionalStructures(src));
    }

    private JAXBElement<?> createAircraftNoiseControlZone(AircraftNoiseControlZone src) {
        return factory.createAircraftNoiseControlZone(marshalAircraftNoiseControlZone(src));
    }

    private JAXBElement<?> createProjectPromotionArea(ProjectPromotionArea src) {
        return factory.createProjectPromotionArea(marshalProjectPromotionArea(src));
    }

    private JAXBElement<?> createUrbanRedevelopmentPromotionArea(UrbanRedevelopmentPromotionArea src) {
        return factory.createUrbanRedevelopmentPromotionArea(marshalUrbanRedevelopmentPromotionArea(src));
    }

    private JAXBElement<?> createLandReadjustmentPromotionArea(LandReadjustmentPromotionArea src) {
        return factory.createLandReadjustmentPromotionArea(marshalLandReadjustmentPromotionArea(src));
    }

    private JAXBElement<?> createResidentialBlockConstructionPromotionArea(ResidentialBlockConstructionPromotionArea src) {
        return factory.createResidentialBlockConstructionPromotionArea(marshalResidentialBlockConstructionPromotionArea(src));
    }

    private JAXBElement<?> createLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment src) {
        return factory.createLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment(marshalLandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment(src));
    }

    private JAXBElement<?> createUnusedLandUsePromotionArea(UnusedLandUsePromotionArea src) {
        return factory.createUnusedLandUsePromotionArea(marshalUnusedLandUsePromotionArea(src));
    }

    private JAXBElement<?> createUrbanDisasterRecoveryPromotionArea(UrbanDisasterRecoveryPromotionArea src) {
        return factory.createUrbanDisasterRecoveryPromotionArea(marshalUrbanDisasterRecoveryPromotionArea(src));
    }

    private JAXBElement<?> createUrbanDevelopmentProject(UrbanDevelopmentProject src) {
        return factory.createUrbanDevelopmentProject(marshalUrbanDevelopmentProject(src));
    }

    private JAXBElement<?> createLandReadjustmentProject(LandReadjustmentProject src) {
        return factory.createLandReadjustmentProject(marshalLandReadjustmentProject(src));
    }

    private JAXBElement<?> createNewHousingAndUrbanDevelopmentProject(NewHousingAndUrbanDevelopmentProject src) {
        return factory.createNewHousingAndUrbanDevelopmentProject(marshalNewHousingAndUrbanDevelopmentProject(src));
    }

    private JAXBElement<?> createIndustrialParkDevelopmentProject(IndustrialParkDevelopmentProject src) {
        return factory.createIndustrialParkDevelopmentProject(marshalIndustrialParkDevelopmentProject(src));
    }

    private JAXBElement<?> createUrbanRedevelopmentProject(UrbanRedevelopmentProject src) {
        return factory.createUrbanRedevelopmentProject(marshalUrbanRedevelopmentProject(src));
    }

    private JAXBElement<?> createNewUrbanInfrastructureProject(NewUrbanInfrastructureProject src) {
        return factory.createNewUrbanInfrastructureProject(marshalNewUrbanInfrastructureProject(src));
    }

    private JAXBElement<?> createResidentialBlockConstructionProject(ResidentialBlockConstructionProject src) {
        return factory.createResidentialBlockConstructionProject(marshalResidentialBlockConstructionProject(src));
    }

    private JAXBElement<?> createDisasterPreventionBlockImprovementProject(DisasterPreventionBlockImprovementProject src) {
        return factory.createDisasterPreventionBlockImprovementProject(marshalDisasterPreventionBlockImprovementProject(src));
    }

    private JAXBElement<?> createUrbanRenewalProject(UrbanRenewalProject src) {
        return factory.createUrbanRenewalProject(marshalUrbanRenewalProject(src));
    }

    private JAXBElement<?> createScheduledAreaForUrbanDevelopmentProject(ScheduledAreaForUrbanDevelopmentProject src) {
        return factory.createScheduledAreaForUrbanDevelopmentProject(marshalScheduledAreaForUrbanDevelopmentProject(src));
    }

    private JAXBElement<?> createScheduledAreaForNewHousingAndUrbanDevelopmentProjects(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects src) {
        return factory.createScheduledAreaForNewHousingAndUrbanDevelopmentProjects(marshalScheduledAreaForNewHousingAndUrbanDevelopmentProjects(src));
    }

    private JAXBElement<?> createScheduledAreaForIndustrialParkDevelopmentProjects(ScheduledAreaForIndustrialParkDevelopmentProjects src) {
        return factory.createScheduledAreaForIndustrialParkDevelopmentProjects(marshalScheduledAreaForIndustrialParkDevelopmentProjects(src));
    }

    private JAXBElement<?> createScheduledAreaForNewUrbanInfrastructureProjects(ScheduledAreaForNewUrbanInfrastructureProjects src) {
        return factory.createScheduledAreaForNewUrbanInfrastructureProjects(marshalScheduledAreaForNewUrbanInfrastructureProjects(src));
    }

    private JAXBElement<?> createScheduledAreaForCollectiveHousingFacilities(ScheduledAreaForCollectiveHousingFacilities src) {
        return factory.createScheduledAreaForCollectiveHousingFacilities(marshalScheduledAreaForCollectiveHousingFacilities(src));
    }

    private JAXBElement<?> createScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities src) {
        return factory.createScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities(marshalScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities(src));
    }

    private JAXBElement<?> createScheduledAreaForDistributionBusinessPark(ScheduledAreaForDistributionBusinessPark src) {
        return factory.createScheduledAreaForDistributionBusinessPark(marshalScheduledAreaForDistributionBusinessPark(src));
    }

    private JAXBElement<?> createUrbanFacility(UrbanFacility src) {
        return factory.createUrbanFacility(marshalUrbanFacility(src));
    }

    private JAXBElement<?> createTrafficFacility(TrafficFacility src) {
        return factory.createTrafficFacility(marshalTrafficFacility(src));
    }

    private JAXBElement<?> createUrbanRoadAttribute(UrbanRoadAttribute src) {
        return factory.createUrbanRoadAttribute(marshalUrbanRoadAttribute(src));
    }

    private JAXBElement<?> createStructureDetails(StructureDetails src) {
        return factory.createStructureDetails(marshalStructureDetails(src));
    }

    private JAXBElement<?> createUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttribute src) {
        return factory.createUrbanRapidTransitRailroadAttribute(marshalUrbanRapidTransitRailroadAttribute(src));
    }

    private JAXBElement<?> createParkingPlaceAttribute(ParkingPlaceAttribute src) {
        return factory.createParkingPlaceAttribute(marshalParkingPlaceAttribute(src));
    }

    private JAXBElement<?> createVehicleTerminalAttribute(VehicleTerminalAttribute src) {
        return factory.createVehicleTerminalAttribute(marshalVehicleTerminalAttribute(src));
    }

    private JAXBElement<?> createOpenSpaceForPublicUse(OpenSpaceForPublicUse src) {
        return factory.createOpenSpaceForPublicUse(marshalOpenSpaceForPublicUse(src));
    }

    private JAXBElement<?> createParkAttribute(ParkAttribute src) {
        return factory.createParkAttribute(marshalParkAttribute(src));
    }

    private JAXBElement<?> createSupplyFacility(SupplyFacility src) {
        return factory.createSupplyFacility(marshalSupplyFacility(src));
    }

    private JAXBElement<?> createWaterWorksAttribute(WaterWorksAttribute src) {
        return factory.createWaterWorksAttribute(marshalWaterWorksAttribute(src));
    }

    private JAXBElement<?> createTreatmentFacility(TreatmentFacility src) {
        return factory.createTreatmentFacility(marshalTreatmentFacility(src));
    }

    private JAXBElement<?> createSewerSystemAttribute(SewerSystemAttribute src) {
        return factory.createSewerSystemAttribute(marshalSewerSystemAttribute(src));
    }

    private JAXBElement<?> createWaterway(Waterway src) {
        return factory.createWaterway(marshalWaterway(src));
    }

    private JAXBElement<?> createEducationalAndCulturalFacility(EducationalAndCulturalFacility src) {
        return factory.createEducationalAndCulturalFacility(marshalEducationalAndCulturalFacility(src));
    }

    private JAXBElement<?> createMedicalFacility(MedicalFacility src) {
        return factory.createMedicalFacility(marshalMedicalFacility(src));
    }

    private JAXBElement<?> createSocialWelfareFacility(SocialWelfareFacility src) {
        return factory.createSocialWelfareFacility(marshalSocialWelfareFacility(src));
    }

    private JAXBElement<?> createMarketsSlaughterhousesCrematoria(MarketsSlaughterhousesCrematoria src) {
        return factory.createMarketsSlaughterhousesCrematoria(marshalMarketsSlaughterhousesCrematoria(src));
    }

    private JAXBElement<?> createCollectiveHousingFacilities(CollectiveHousingFacilities src) {
        return factory.createCollectiveHousingFacilities(marshalCollectiveHousingFacilities(src));
    }

    private JAXBElement<?> createCollectiveGovernmentAndPublicOfficeFacilities(CollectiveGovernmentAndPublicOfficeFacilities src) {
        return factory.createCollectiveGovernmentAndPublicOfficeFacilities(marshalCollectiveGovernmentAndPublicOfficeFacilities(src));
    }

    private JAXBElement<?> createCollectiveUrbanDisasterPreventionFacilities(CollectiveUrbanDisasterPreventionFacilities src) {
        return factory.createCollectiveUrbanDisasterPreventionFacilities(marshalCollectiveUrbanDisasterPreventionFacilities(src));
    }

    private JAXBElement<?> createDistributionBusinessPark(DistributionBusinessPark src) {
        return factory.createDistributionBusinessPark(marshalDistributionBusinessPark(src));
    }

    private JAXBElement<?> createUrbanFacilityStipulatedByCabinetOrder(UrbanFacilityStipulatedByCabinetOrder src) {
        return factory.createUrbanFacilityStipulatedByCabinetOrder(marshalUrbanFacilityStipulatedByCabinetOrder(src));
    }

    private JAXBElement<?> createTelecommunicationFacility(TelecommunicationFacility src) {
        return factory.createTelecommunicationFacility(marshalTelecommunicationFacility(src));
    }

    private JAXBElement<?> createWindProtectionFacility(WindProtectionFacility src) {
        return factory.createWindProtectionFacility(marshalWindProtectionFacility(src));
    }

    private JAXBElement<?> createFireProtectionFacility(FireProtectionFacility src) {
        return factory.createFireProtectionFacility(marshalFireProtectionFacility(src));
    }

    private JAXBElement<?> createFloodPreventionFacility(FloodPreventionFacility src) {
        return factory.createFloodPreventionFacility(marshalFloodPreventionFacility(src));
    }

    private JAXBElement<?> createSnowProtectionFacility(SnowProtectionFacility src) {
        return factory.createSnowProtectionFacility(marshalSnowProtectionFacility(src));
    }

    private JAXBElement<?> createSandControlFacility(SandControlFacility src) {
        return factory.createSandControlFacility(marshalSandControlFacility(src));
    }

    private JAXBElement<?> createTideFacility(TideFacility src) {
        return factory.createTideFacility(marshalTideFacility(src));
    }

    private JAXBElement<?> createCollectiveFacilitiesForTsunamiDisasterPrevention(CollectiveFacilitiesForTsunamiDisasterPrevention src) {
        return factory.createCollectiveFacilitiesForTsunamiDisasterPrevention(marshalCollectiveFacilitiesForTsunamiDisasterPrevention(src));
    }

    private JAXBElement<?> createCollectiveFacilitiesForReconstructionAndRevitalization(CollectiveFacilitiesForReconstructionAndRevitalization src) {
        return factory.createCollectiveFacilitiesForReconstructionAndRevitalization(marshalCollectiveFacilitiesForReconstructionAndRevitalization(src));
    }

    private JAXBElement<?> createCollectiveFacilitiesForReconstruction(CollectiveFacilitiesForReconstruction src) {
        return factory.createCollectiveFacilitiesForReconstruction(marshalCollectiveFacilitiesForReconstruction(src));
    }

    private JAXBElement<?> createThreeDimensionalExtent(ThreeDimensionalExtent src) {
        return factory.createThreeDimensionalExtent(marshalThreeDimensionalExtent(src));
    }

    private JAXBElement<?> createDistrictPlan(DistrictPlan src) {
        return factory.createDistrictPlan(marshalDistrictPlan(src));
    }

    private JAXBElement<?> createDisasterPreventionBlockImprovementZonePlan(DisasterPreventionBlockImprovementZonePlan src) {
        return factory.createDisasterPreventionBlockImprovementZonePlan(marshalDisasterPreventionBlockImprovementZonePlan(src));
    }

    private JAXBElement<?> createZonalDisasterPreventionFacility(ZonalDisasterPreventionFacility src) {
        return factory.createZonalDisasterPreventionFacility(marshalZonalDisasterPreventionFacility(src));
    }

    private JAXBElement<?> createHistoricSceneryMaintenanceAndImprovementDistrictPlan(HistoricSceneryMaintenanceAndImprovementDistrictPlan src) {
        return factory.createHistoricSceneryMaintenanceAndImprovementDistrictPlan(marshalHistoricSceneryMaintenanceAndImprovementDistrictPlan(src));
    }

    private JAXBElement<?> createRoadsideDistrictPlan(RoadsideDistrictPlan src) {
        return factory.createRoadsideDistrictPlan(marshalRoadsideDistrictPlan(src));
    }

    private JAXBElement<?> createRuralDistrictPlan(RuralDistrictPlan src) {
        return factory.createRuralDistrictPlan(marshalRuralDistrictPlan(src));
    }

    private JAXBElement<?> createDistrictDevelopmentPlan(DistrictDevelopmentPlan src) {
        return factory.createDistrictDevelopmentPlan(marshalDistrictDevelopmentPlan(src));
    }

    private JAXBElement<?> createSpecifiedBuildingZoneImprovementPlan(SpecifiedBuildingZoneImprovementPlan src) {
        return factory.createSpecifiedBuildingZoneImprovementPlan(marshalSpecifiedBuildingZoneImprovementPlan(src));
    }

    private JAXBElement<?> createDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan src) {
        return factory.createDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan(marshalDistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan(src));
    }

    private JAXBElement<?> createDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict src) {
        return factory.createDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict(marshalDistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict(src));
    }

    private JAXBElement<?> createRoadsideDistrictImprovementPlan(RoadsideDistrictImprovementPlan src) {
        return factory.createRoadsideDistrictImprovementPlan(marshalRoadsideDistrictImprovementPlan(src));
    }

    private JAXBElement<?> createRuralDistrictImprovementPlan(RuralDistrictImprovementPlan src) {
        return factory.createRuralDistrictImprovementPlan(marshalRuralDistrictImprovementPlan(src));
    }

    private JAXBElement<?> createDistrictFacility(DistrictFacility src) {
        return factory.createDistrictFacility(marshalDistrictFacility(src));
    }

    private JAXBElement<?> createRoadsideDistrictFacility(RoadsideDistrictFacility src) {
        return factory.createRoadsideDistrictFacility(marshalRoadsideDistrictFacility(src));
    }

    private JAXBElement<?> createRuralDistrictFacility(RuralDistrictFacility src) {
        return factory.createRuralDistrictFacility(marshalRuralDistrictFacility(src));
    }

    private JAXBElement<?> createDistrict(District src) {
        return factory.createDistrict(marshalDistrict(src));
    }

    private JAXBElement<?> createPromotionDistrict(PromotionDistrict src) {
        return factory.createPromotionDistrict(marshalPromotionDistrict(src));
    }

    private JAXBElement<?> createUrgentUrbanRenewalArea(UrgentUrbanRenewalArea src) {
        return factory.createUrgentUrbanRenewalArea(marshalUrgentUrbanRenewalArea(src));
    }

    private JAXBElement<?> createSpecifiedUrgentUrbanRenewalArea(SpecifiedUrgentUrbanRenewalArea src) {
        return factory.createSpecifiedUrgentUrbanRenewalArea(marshalSpecifiedUrgentUrbanRenewalArea(src));
    }

    private JAXBElement<?> createGlobalHubCityDevelopmentProject(GlobalHubCityDevelopmentProject src) {
        return factory.createGlobalHubCityDevelopmentProject(marshalGlobalHubCityDevelopmentProject(src));
    }

    private JAXBElement<?> createPrivateUrbanRenewalProjectPlan(PrivateUrbanRenewalProjectPlan src) {
        return factory.createPrivateUrbanRenewalProjectPlan(marshalPrivateUrbanRenewalProjectPlan(src));
    }

    private JAXBElement<?> createAgreement(Agreement src) {
        return factory.createAgreement(marshalAgreement(src));
    }

    private JAXBElement<?> createRegulation(Regulation src) {
        return factory.createRegulation(marshalRegulation(src));
    }

    private JAXBElement<?> createSedimentDisasterProneArea(SedimentDisasterProneArea src) {
        return factory.createSedimentDisasterProneArea(marshalSedimentDisasterProneArea(src));
    }

    private JAXBElement<?> createUnclassifiedBlankArea(UnclassifiedBlankArea src) {
        return factory.createUnclassifiedBlankArea(marshalUnclassifiedBlankArea(src));
    }

    private JAXBElement<?> createUnclassifiedUseDistrict(UnclassifiedUseDistrict src) {
        return factory.createUnclassifiedUseDistrict(marshalUnclassifiedUseDistrict(src));
    }

    private JAXBElement<?> createResidenceAttractionArea(ResidenceAttractionArea src) {
        return factory.createResidenceAttractionArea(marshalResidenceAttractionArea(src));
    }

    private JAXBElement<?> createUrbanFunctionAttractionArea(UrbanFunctionAttractionArea src) {
        return factory.createUrbanFunctionAttractionArea(marshalUrbanFunctionAttractionArea(src));
    }

    private JAXBElement<?> createBoundary(Boundary src) {
        return factory.createBoundary(marshalBoundary(src));
    }

    private JAXBElement<?> createUrbanParkAttribute(UrbanParkAttribute src) {
        return factory.createUrbanParkAttribute(marshalUrbanParkAttribute(src));
    }

    private JAXBElement<?> createBreakdownOfNominalArea(BreakdownOfNominalArea src) {
        return factory.createBreakdownOfNominalArea(marshalBreakdownOfNominalArea(src));
    }

    private JAXBElement<?> createAdministration(Administration src) {
        return factory.createAdministration(marshalAdministration(src));
    }

    private JAXBElement<?> createDisasterDamage(DisasterDamage src) {
        return factory.createDisasterDamage(marshalDisasterDamage(src));
    }

    private JAXBElement<?> createPollution(Pollution src) {
        return factory.createPollution(marshalPollution(src));
    }

    private JAXBElement<?> createObservationPoint(ObservationPoint src) {
        return factory.createObservationPoint(marshalObservationPoint(src));
    }

    private JAXBElement<?> createDisasterPreventionBase(DisasterPreventionBase src) {
        return factory.createDisasterPreventionBase(marshalDisasterPreventionBase(src));
    }

    private JAXBElement<?> createRecreations(Recreations src) {
        return factory.createRecreations(marshalRecreations(src));
    }

    private JAXBElement<?> createHubCity(HubCity src) {
        return factory.createHubCity(marshalHubCity(src));
    }

    private JAXBElement<?> createLandUseDiversion(LandUseDiversion src) {
        return factory.createLandUseDiversion(marshalLandUseDiversion(src));
    }

    private JAXBElement<?> createFarmlandConversionType(FarmlandConversionType src) {
        return factory.createFarmlandConversionType(marshalFarmlandConversionType(src));
    }

    private JAXBElement<?> createForestConversionType(ForestConversionType src) {
        return factory.createForestConversionType(marshalForestConversionType(src));
    }

    private JAXBElement<?> createUrbanization(Urbanization src) {
        return factory.createUrbanization(marshalUrbanization(src));
    }

    private JAXBElement<?> createDID(DID src) {
        return factory.createDID(marshalDID(src));
    }

    private JAXBElement<?> createCensusBlock(CensusBlock src) {
        return factory.createCensusBlock(marshalCensusBlock(src));
    }

    private JAXBElement<?> createPopulationType(PopulationType src) {
        return factory.createPopulationType(marshalPopulationType(src));
    }

    private JAXBElement<?> createPopulationByAgeAndSexType(PopulationByAgeAndSexType src) {
        return factory.createPopulationByAgeAndSexType(marshalPopulationByAgeAndSexType(src));
    }

    private JAXBElement<?> createDaytimePopulationType(DaytimePopulationType src) {
        return factory.createDaytimePopulationType(marshalDaytimePopulationType(src));
    }

    private JAXBElement<?> createEconomicActivityType(EconomicActivityType src) {
        return factory.createEconomicActivityType(marshalEconomicActivityType(src));
    }

    private JAXBElement<?> createEconomicActivitySumType(EconomicActivitySumType src) {
        return factory.createEconomicActivitySumType(marshalEconomicActivitySumType(src));
    }

    private JAXBElement<?> createDevelopmentProject(DevelopmentProject src) {
        return factory.createDevelopmentProject(marshalDevelopmentProject(src));
    }

    private JAXBElement<?> createResidentialDevelopmentType(ResidentialDevelopmentType src) {
        return factory.createResidentialDevelopmentType(marshalResidentialDevelopmentType(src));
    }

    private JAXBElement<?> createUrbanDevelopmentProjectType(UrbanDevelopmentProjectType src) {
        return factory.createUrbanDevelopmentProjectType(marshalUrbanDevelopmentProjectType(src));
    }

    private JAXBElement<?> createAgriculturalDevelopmentProjectType(AgriculturalDevelopmentProjectType src) {
        return factory.createAgriculturalDevelopmentProjectType(marshalAgriculturalDevelopmentProjectType(src));
    }

    private JAXBElement<?> createNewHousing(NewHousing src) {
        return factory.createNewHousing(marshalNewHousing(src));
    }

    private JAXBElement<?> createUrbanFacilityStatus(UrbanFacilityStatus src) {
        return factory.createUrbanFacilityStatus(marshalUrbanFacilityStatus(src));
    }

    private JAXBElement<?> createPublicTransitFacility(PublicTransitFacility src) {
        return factory.createPublicTransitFacility(marshalPublicTransitFacility(src));
    }

    private JAXBElement<?> createLandPrice(LandPrice src) {
        return factory.createLandPrice(marshalLandPrice(src));
    }

    private JAXBElement<?> createValueByCodes(ValueByCodes src) {
        return factory.createValueByCodes(marshalValueByCodes(src));
    }

    private JAXBElement<?> createNaturalConditions(NaturalConditions src) {
        return factory.createNaturalConditions(marshalNaturalConditions(src));
    }

    private JAXBElement<?> createWeatherObservation(WeatherObservation src) {
        return factory.createWeatherObservation(marshalWeatherObservation(src));
    }

    private JAXBElement<?> createWeatherObservationType(WeatherObservationType src) {
        return factory.createWeatherObservationType(marshalWeatherObservationType(src));
    }

    private JAXBElement<?> createGreenSpace(GreenSpace src) {
        return factory.createGreenSpace(marshalGreenSpace(src));
    }

    private JAXBElement<?> createDistributionOfFloraAndFauna(DistributionOfFloraAndFauna src) {
        return factory.createDistributionOfFloraAndFauna(marshalDistributionOfFloraAndFauna(src));
    }

    private JAXBElement<?> createScenicResource(ScenicResource src) {
        return factory.createScenicResource(marshalScenicResource(src));
    }
}
