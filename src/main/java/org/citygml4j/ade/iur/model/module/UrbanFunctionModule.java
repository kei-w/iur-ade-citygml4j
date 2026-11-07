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

package org.citygml4j.ade.iur.model.module;

import org.citygml4j.ade.iur.model.urf.Administration;
import org.citygml4j.ade.iur.model.urf.Agreement;
import org.citygml4j.ade.iur.model.urf.AircraftNoiseControlZone;
import org.citygml4j.ade.iur.model.urf.AreaClassification;
import org.citygml4j.ade.iur.model.urf.CensusBlock;
import org.citygml4j.ade.iur.model.urf.CollectiveFacilitiesForReconstruction;
import org.citygml4j.ade.iur.model.urf.CollectiveFacilitiesForReconstructionAndRevitalization;
import org.citygml4j.ade.iur.model.urf.CollectiveFacilitiesForTsunamiDisasterPrevention;
import org.citygml4j.ade.iur.model.urf.CollectiveGovernmentAndPublicOfficeFacilities;
import org.citygml4j.ade.iur.model.urf.CollectiveHousingFacilities;
import org.citygml4j.ade.iur.model.urf.CollectiveUrbanDisasterPreventionFacilities;
import org.citygml4j.ade.iur.model.urf.ConservationZoneForClustersOfTraditionalStructures;
import org.citygml4j.ade.iur.model.urf.DID;
import org.citygml4j.ade.iur.model.urf.DevelopmentProject;
import org.citygml4j.ade.iur.model.urf.DisasterDamage;
import org.citygml4j.ade.iur.model.urf.DisasterPreventionBase;
import org.citygml4j.ade.iur.model.urf.DisasterPreventionBlockImprovementProject;
import org.citygml4j.ade.iur.model.urf.DisasterPreventionBlockImprovementZonePlan;
import org.citygml4j.ade.iur.model.urf.DistributionBusinessPark;
import org.citygml4j.ade.iur.model.urf.DistributionBusinessZone;
import org.citygml4j.ade.iur.model.urf.DistributionOfFloraAndFauna;
import org.citygml4j.ade.iur.model.urf.District;
import org.citygml4j.ade.iur.model.urf.DistrictDevelopmentPlan;
import org.citygml4j.ade.iur.model.urf.DistrictFacility;
import org.citygml4j.ade.iur.model.urf.DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan;
import org.citygml4j.ade.iur.model.urf.DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict;
import org.citygml4j.ade.iur.model.urf.DistrictPlan;
import org.citygml4j.ade.iur.model.urf.DistrictsAndZones;
import org.citygml4j.ade.iur.model.urf.EducationalAndCulturalFacility;
import org.citygml4j.ade.iur.model.urf.ExceptionalFloorAreaRateDistrict;
import org.citygml4j.ade.iur.model.urf.FirePreventionDistrict;
import org.citygml4j.ade.iur.model.urf.FireProtectionFacility;
import org.citygml4j.ade.iur.model.urf.FloodPreventionFacility;
import org.citygml4j.ade.iur.model.urf.GlobalHubCityDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.GreenSpace;
import org.citygml4j.ade.iur.model.urf.GreenSpaceConservationDistrict;
import org.citygml4j.ade.iur.model.urf.HeightControlDistrict;
import org.citygml4j.ade.iur.model.urf.HighLevelUseDistrict;
import org.citygml4j.ade.iur.model.urf.HighRiseResidentialAttractionDistrict;
import org.citygml4j.ade.iur.model.urf.HistoricSceneryMaintenanceAndImprovementDistrictPlan;
import org.citygml4j.ade.iur.model.urf.HousingControlArea;
import org.citygml4j.ade.iur.model.urf.HubCity;
import org.citygml4j.ade.iur.model.urf.IndustrialParkDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.LandPrice;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentProject;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentPromotionArea;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment;
import org.citygml4j.ade.iur.model.urf.LandUseDiversion;
import org.citygml4j.ade.iur.model.urf.LandscapeZone;
import org.citygml4j.ade.iur.model.urf.MarketsSlaughterhousesCrematoria;
import org.citygml4j.ade.iur.model.urf.MedicalFacility;
import org.citygml4j.ade.iur.model.urf.NaturalConditions;
import org.citygml4j.ade.iur.model.urf.NewHousing;
import org.citygml4j.ade.iur.model.urf.NewHousingAndUrbanDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.NewUrbanInfrastructureProject;
import org.citygml4j.ade.iur.model.urf.OpenSpaceForPublicUse;
import org.citygml4j.ade.iur.model.urf.ParkingPlaceDevelopmentZone;
import org.citygml4j.ade.iur.model.urf.Pollution;
import org.citygml4j.ade.iur.model.urf.PortZone;
import org.citygml4j.ade.iur.model.urf.PrivateUrbanRenewalProjectPlan;
import org.citygml4j.ade.iur.model.urf.ProductiveGreenZone;
import org.citygml4j.ade.iur.model.urf.ProjectPromotionArea;
import org.citygml4j.ade.iur.model.urf.PromotionDistrict;
import org.citygml4j.ade.iur.model.urf.PublicTransitFacility;
import org.citygml4j.ade.iur.model.urf.QuasiUrbanPlanningArea;
import org.citygml4j.ade.iur.model.urf.Recreations;
import org.citygml4j.ade.iur.model.urf.Regulation;
import org.citygml4j.ade.iur.model.urf.ResidenceAttractionArea;
import org.citygml4j.ade.iur.model.urf.ResidentialBlockConstructionProject;
import org.citygml4j.ade.iur.model.urf.ResidentialBlockConstructionPromotionArea;
import org.citygml4j.ade.iur.model.urf.ResidentialEnvironmentImprovementDistrict;
import org.citygml4j.ade.iur.model.urf.RoadsideDistrictFacility;
import org.citygml4j.ade.iur.model.urf.RoadsideDistrictImprovementPlan;
import org.citygml4j.ade.iur.model.urf.RoadsideDistrictPlan;
import org.citygml4j.ade.iur.model.urf.RuralDistrictFacility;
import org.citygml4j.ade.iur.model.urf.RuralDistrictImprovementPlan;
import org.citygml4j.ade.iur.model.urf.RuralDistrictPlan;
import org.citygml4j.ade.iur.model.urf.SandControlFacility;
import org.citygml4j.ade.iur.model.urf.ScenicDistrict;
import org.citygml4j.ade.iur.model.urf.ScenicResource;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForCollectiveHousingFacilities;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForDistributionBusinessPark;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForIndustrialParkDevelopmentProjects;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForNewHousingAndUrbanDevelopmentProjects;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForNewUrbanInfrastructureProjects;
import org.citygml4j.ade.iur.model.urf.ScheduledAreaForUrbanDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.SedimentDisasterProneArea;
import org.citygml4j.ade.iur.model.urf.SnowProtectionFacility;
import org.citygml4j.ade.iur.model.urf.SocialWelfareFacility;
import org.citygml4j.ade.iur.model.urf.SpecialGreenSpaceConservationDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUrbanRenaissanceDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUseAttractionDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUseDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUseRestrictionDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialZoneForPreservationOfHistoricalLandscape;
import org.citygml4j.ade.iur.model.urf.SpecifiedBlock;
import org.citygml4j.ade.iur.model.urf.SpecifiedBuildingZoneImprovementPlan;
import org.citygml4j.ade.iur.model.urf.SpecifiedDisasterPreventionBlockImprovementZone;
import org.citygml4j.ade.iur.model.urf.SpecifiedUrgentUrbanRenewalArea;
import org.citygml4j.ade.iur.model.urf.SupplyFacility;
import org.citygml4j.ade.iur.model.urf.TelecommunicationFacility;
import org.citygml4j.ade.iur.model.urf.ThreeDimensionalExtent;
import org.citygml4j.ade.iur.model.urf.TideFacility;
import org.citygml4j.ade.iur.model.urf.TrafficFacility;
import org.citygml4j.ade.iur.model.urf.TreatmentFacility;
import org.citygml4j.ade.iur.model.urf.TreePlantingDistrict;
import org.citygml4j.ade.iur.model.urf.UnclassifiedBlankArea;
import org.citygml4j.ade.iur.model.urf.UnclassifiedUseDistrict;
import org.citygml4j.ade.iur.model.urf.UnusedLandUsePromotionArea;
import org.citygml4j.ade.iur.model.urf.UrbanDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.UrbanDisasterRecoveryPromotionArea;
import org.citygml4j.ade.iur.model.urf.UrbanFacility;
import org.citygml4j.ade.iur.model.urf.UrbanFacilityStatus;
import org.citygml4j.ade.iur.model.urf.UrbanFacilityStipulatedByCabinetOrder;
import org.citygml4j.ade.iur.model.urf.UrbanFunctionAttractionArea;
import org.citygml4j.ade.iur.model.urf.UrbanPlanningArea;
import org.citygml4j.ade.iur.model.urf.UrbanRedevelopmentProject;
import org.citygml4j.ade.iur.model.urf.UrbanRedevelopmentPromotionArea;
import org.citygml4j.ade.iur.model.urf.UrbanRenewalProject;
import org.citygml4j.ade.iur.model.urf.Urbanization;
import org.citygml4j.ade.iur.model.urf.UrgentUrbanRenewalArea;
import org.citygml4j.ade.iur.model.urf.UseDistrict;
import org.citygml4j.ade.iur.model.urf.Waterway;
import org.citygml4j.ade.iur.model.urf.WeatherObservation;
import org.citygml4j.ade.iur.model.urf.WindProtectionFacility;
import org.citygml4j.ade.iur.model.urf.ZonalDisasterPreventionFacility;
import org.citygml4j.ade.iur.model.urf.Zone;
import org.citygml4j.ade.iur.model.urf.ZoneForPreservationOfHistoricalLandscape;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.module.ade.ADEModule;
import org.citygml4j.model.module.citygml.CityGMLVersion;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;

public class UrbanFunctionModule extends ADEModule {
    public static final UrbanFunctionModule v3_1 = new UrbanFunctionModule();

    private final Map<String, Class<? extends AbstractFeature>> features;

    private UrbanFunctionModule() {
        super("https://www.geospatial.jp/iur/urf/3.1",
                "urf",
                "https://www.geospatial.jp/iur/schemas/urf/3.1/urbanFunction.xsd",
                CityGMLVersion.v2_0_0);

        features = new HashMap<>();
        features.put("Zone", Zone.class);
        features.put("ThreeDimensionalExtent", ThreeDimensionalExtent.class);
        features.put("UrbanPlanningArea", UrbanPlanningArea.class);
        features.put("QuasiUrbanPlanningArea", QuasiUrbanPlanningArea.class);
        features.put("AreaClassification", AreaClassification.class);
        features.put("DistrictsAndZones", DistrictsAndZones.class);
        features.put("UseDistrict", UseDistrict.class);
        features.put("SpecialUseDistrict", SpecialUseDistrict.class);
        features.put("SpecialUseRestrictionDistrict", SpecialUseRestrictionDistrict.class);
        features.put("ExceptionalFloorAreaRateDistrict", ExceptionalFloorAreaRateDistrict.class);
        features.put("HighRiseResidentialAttractionDistrict", HighRiseResidentialAttractionDistrict.class);
        features.put("HeightControlDistrict", HeightControlDistrict.class);
        features.put("HighLevelUseDistrict", HighLevelUseDistrict.class);
        features.put("SpecifiedBlock", SpecifiedBlock.class);
        features.put("SpecialUrbanRenaissanceDistrict", SpecialUrbanRenaissanceDistrict.class);
        features.put("HousingControlArea", HousingControlArea.class);
        features.put("ResidentialEnvironmentImprovementDistrict", ResidentialEnvironmentImprovementDistrict.class);
        features.put("SpecialUseAttractionDistrict", SpecialUseAttractionDistrict.class);
        features.put("FirePreventionDistrict", FirePreventionDistrict.class);
        features.put("SpecifiedDisasterPreventionBlockImprovementZone", SpecifiedDisasterPreventionBlockImprovementZone.class);
        features.put("LandscapeZone", LandscapeZone.class);
        features.put("ScenicDistrict", ScenicDistrict.class);
        features.put("ParkingPlaceDevelopmentZone", ParkingPlaceDevelopmentZone.class);
        features.put("PortZone", PortZone.class);
        features.put("SpecialZoneForPreservationOfHistoricalLandscape", SpecialZoneForPreservationOfHistoricalLandscape.class);
        features.put("ZoneForPreservationOfHistoricalLandscape", ZoneForPreservationOfHistoricalLandscape.class);
        features.put("GreenSpaceConservationDistrict", GreenSpaceConservationDistrict.class);
        features.put("SpecialGreenSpaceConservationDistrict", SpecialGreenSpaceConservationDistrict.class);
        features.put("TreePlantingDistrict", TreePlantingDistrict.class);
        features.put("DistributionBusinessZone", DistributionBusinessZone.class);
        features.put("ProductiveGreenZone", ProductiveGreenZone.class);
        features.put("ConservationZoneForClustersOfTraditionalStructures", ConservationZoneForClustersOfTraditionalStructures.class);
        features.put("AircraftNoiseControlZone", AircraftNoiseControlZone.class);
        features.put("ProjectPromotionArea", ProjectPromotionArea.class);
        features.put("UrbanRedevelopmentPromotionArea", UrbanRedevelopmentPromotionArea.class);
        features.put("LandReadjustmentPromotionArea", LandReadjustmentPromotionArea.class);
        features.put("ResidentialBlockConstructionPromotionArea", ResidentialBlockConstructionPromotionArea.class);
        features.put("LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment", LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment.class);
        features.put("UnusedLandUsePromotionArea", UnusedLandUsePromotionArea.class);
        features.put("UrbanDisasterRecoveryPromotionArea", UrbanDisasterRecoveryPromotionArea.class);
        features.put("UrbanDevelopmentProject", UrbanDevelopmentProject.class);
        features.put("LandReadjustmentProject", LandReadjustmentProject.class);
        features.put("NewHousingAndUrbanDevelopmentProject", NewHousingAndUrbanDevelopmentProject.class);
        features.put("IndustrialParkDevelopmentProject", IndustrialParkDevelopmentProject.class);
        features.put("UrbanRedevelopmentProject", UrbanRedevelopmentProject.class);
        features.put("NewUrbanInfrastructureProject", NewUrbanInfrastructureProject.class);
        features.put("ResidentialBlockConstructionProject", ResidentialBlockConstructionProject.class);
        features.put("DisasterPreventionBlockImprovementProject", DisasterPreventionBlockImprovementProject.class);
        features.put("UrbanRenewalProject", UrbanRenewalProject.class);
        features.put("ScheduledAreaForUrbanDevelopmentProject", ScheduledAreaForUrbanDevelopmentProject.class);
        features.put("ScheduledAreaForNewHousingAndUrbanDevelopmentProjects", ScheduledAreaForNewHousingAndUrbanDevelopmentProjects.class);
        features.put("ScheduledAreaForIndustrialParkDevelopmentProjects", ScheduledAreaForIndustrialParkDevelopmentProjects.class);
        features.put("ScheduledAreaForNewUrbanInfrastructureProjects", ScheduledAreaForNewUrbanInfrastructureProjects.class);
        features.put("ScheduledAreaForCollectiveHousingFacilities", ScheduledAreaForCollectiveHousingFacilities.class);
        features.put("ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities", ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities.class);
        features.put("ScheduledAreaForDistributionBusinessPark", ScheduledAreaForDistributionBusinessPark.class);
        features.put("UrbanFacility", UrbanFacility.class);
        features.put("TrafficFacility", TrafficFacility.class);
        features.put("OpenSpaceForPublicUse", OpenSpaceForPublicUse.class);
        features.put("SupplyFacility", SupplyFacility.class);
        features.put("TreatmentFacility", TreatmentFacility.class);
        features.put("Waterway", Waterway.class);
        features.put("EducationalAndCulturalFacility", EducationalAndCulturalFacility.class);
        features.put("MedicalFacility", MedicalFacility.class);
        features.put("SocialWelfareFacility", SocialWelfareFacility.class);
        features.put("MarketsSlaughterhousesCrematoria", MarketsSlaughterhousesCrematoria.class);
        features.put("CollectiveHousingFacilities", CollectiveHousingFacilities.class);
        features.put("CollectiveGovernmentAndPublicOfficeFacilities", CollectiveGovernmentAndPublicOfficeFacilities.class);
        features.put("CollectiveUrbanDisasterPreventionFacilities", CollectiveUrbanDisasterPreventionFacilities.class);
        features.put("DistributionBusinessPark", DistributionBusinessPark.class);
        features.put("UrbanFacilityStipulatedByCabinetOrder", UrbanFacilityStipulatedByCabinetOrder.class);
        features.put("TelecommunicationFacility", TelecommunicationFacility.class);
        features.put("WindProtectionFacility", WindProtectionFacility.class);
        features.put("FireProtectionFacility", FireProtectionFacility.class);
        features.put("FloodPreventionFacility", FloodPreventionFacility.class);
        features.put("SnowProtectionFacility", SnowProtectionFacility.class);
        features.put("SandControlFacility", SandControlFacility.class);
        features.put("TideFacility", TideFacility.class);
        features.put("CollectiveFacilitiesForTsunamiDisasterPrevention", CollectiveFacilitiesForTsunamiDisasterPrevention.class);
        features.put("CollectiveFacilitiesForReconstructionAndRevitalization", CollectiveFacilitiesForReconstructionAndRevitalization.class);
        features.put("CollectiveFacilitiesForReconstruction", CollectiveFacilitiesForReconstruction.class);
        features.put("DistrictPlan", DistrictPlan.class);
        features.put("DisasterPreventionBlockImprovementZonePlan", DisasterPreventionBlockImprovementZonePlan.class);
        features.put("HistoricSceneryMaintenanceAndImprovementDistrictPlan", HistoricSceneryMaintenanceAndImprovementDistrictPlan.class);
        features.put("RoadsideDistrictPlan", RoadsideDistrictPlan.class);
        features.put("RuralDistrictPlan", RuralDistrictPlan.class);
        features.put("DistrictDevelopmentPlan", DistrictDevelopmentPlan.class);
        features.put("SpecifiedBuildingZoneImprovementPlan", SpecifiedBuildingZoneImprovementPlan.class);
        features.put("DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan", DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan.class);
        features.put("DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict", DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict.class);
        features.put("RoadsideDistrictImprovementPlan", RoadsideDistrictImprovementPlan.class);
        features.put("RuralDistrictImprovementPlan", RuralDistrictImprovementPlan.class);
        features.put("District", District.class);
        features.put("DistrictFacility", DistrictFacility.class);
        features.put("ZonalDisasterPreventionFacility", ZonalDisasterPreventionFacility.class);
        features.put("RoadsideDistrictFacility", RoadsideDistrictFacility.class);
        features.put("RuralDistrictFacility", RuralDistrictFacility.class);
        features.put("PromotionDistrict", PromotionDistrict.class);
        features.put("UrgentUrbanRenewalArea", UrgentUrbanRenewalArea.class);
        features.put("SpecifiedUrgentUrbanRenewalArea", SpecifiedUrgentUrbanRenewalArea.class);
        features.put("PrivateUrbanRenewalProjectPlan", PrivateUrbanRenewalProjectPlan.class);
        features.put("GlobalHubCityDevelopmentProject", GlobalHubCityDevelopmentProject.class);
        features.put("Administration", Administration.class);
        features.put("Agreement", Agreement.class);
        features.put("Regulation", Regulation.class);
        features.put("DisasterDamage", DisasterDamage.class);
        features.put("Pollution", Pollution.class);
        features.put("DisasterPreventionBase", DisasterPreventionBase.class);
        features.put("Recreations", Recreations.class);
        features.put("HubCity", HubCity.class);
        features.put("LandUseDiversion", LandUseDiversion.class);
        features.put("Urbanization", Urbanization.class);
        features.put("SedimentDisasterProneArea", SedimentDisasterProneArea.class);
        features.put("DID", DID.class);
        features.put("CensusBlock", CensusBlock.class);
        features.put("UnclassifiedBlankArea", UnclassifiedBlankArea.class);
        features.put("UnclassifiedUseDistrict", UnclassifiedUseDistrict.class);
        features.put("ResidenceAttractionArea", ResidenceAttractionArea.class);
        features.put("UrbanFunctionAttractionArea", UrbanFunctionAttractionArea.class);
        features.put("DevelopmentProject", DevelopmentProject.class);
        features.put("NewHousing", NewHousing.class);
        features.put("UrbanFacilityStatus", UrbanFacilityStatus.class);
        features.put("PublicTransitFacility", PublicTransitFacility.class);
        features.put("LandPrice", LandPrice.class);
        features.put("NaturalConditions", NaturalConditions.class);
        features.put("WeatherObservation", WeatherObservation.class);
        features.put("GreenSpace", GreenSpace.class);
        features.put("DistributionOfFloraAndFauna", DistributionOfFloraAndFauna.class);
        features.put("ScenicResource", ScenicResource.class);
    }

    @Override
    public URL getSchemaResource() {
        return UrbanFunctionModule.class.getResource("/org/citygml4j/ade/iur/schema/urbanFunction.xsd");
    }

    @Override
    public List<String> getJAXBPackageNames() {
        return Collections.singletonList("jp.geospatial.iur._3_1.urf");
    }

    public String getModelPackageName() {
        return "org.citygml4j.ade.iur.model.urf";
    }

    @Override
    public boolean hasFeatureProperty(String name) {
        return "developmentProject".equals(name) || "district".equals(name) || "districtDevelopmentPlan".equals(name) || "districtFacility".equals(name) || "privateProject".equals(name) || "promotionDistrict".equals(name) || "specialDistrict".equals(name) || "specifiedArea".equals(name) || "target".equals(name) || "threeDimensionalExtent".equals(name) || "zonalDisasterPreventionFacilities".equals(name);
    }

    @Override
    public boolean hasFeature(String name) {
        return features.containsKey(name);
    }

    @Override
    public Class<? extends AbstractFeature> getFeatureClass(String name) {
        return features.get(name);
    }

    @Override
    public QName getFeatureName(Class<? extends AbstractFeature> featureClass) {
        for (Map.Entry<String, Class<? extends AbstractFeature>> entry : features.entrySet()) {
            if (entry.getValue() == featureClass)
                return new QName(getNamespaceURI(), entry.getKey());
        }

        return null;
    }

    @Override
    public Map<String, Class<? extends AbstractFeature>> getFeatures() {
        return new HashMap<>(features);
    }

    @Override
    public boolean isTopLevelFeature(String name) {
        return false;
    }
}
