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

package org.citygml4j.ade.iur.walker;

import org.citygml4j.ade.iur.model.urf.AbstractDistrictPlan;
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
import org.citygml4j.ade.iur.model.urf.DistrictDevelopmentPlanProperty;
import org.citygml4j.ade.iur.model.urf.DistrictFacility;
import org.citygml4j.ade.iur.model.urf.DistrictFacilityProperty;
import org.citygml4j.ade.iur.model.urf.DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan;
import org.citygml4j.ade.iur.model.urf.DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict;
import org.citygml4j.ade.iur.model.urf.DistrictPlan;
import org.citygml4j.ade.iur.model.urf.DistrictProperty;
import org.citygml4j.ade.iur.model.urf.DistrictsAndZones;
import org.citygml4j.ade.iur.model.urf.EducationalAndCulturalFacility;
import org.citygml4j.ade.iur.model.urf.ExceptionalFloorAreaRateDistrict;
import org.citygml4j.ade.iur.model.urf.FirePreventionDistrict;
import org.citygml4j.ade.iur.model.urf.FireProtectionFacility;
import org.citygml4j.ade.iur.model.urf.FloodPreventionFacility;
import org.citygml4j.ade.iur.model.urf.GlobalHubCityDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.GlobalHubCityDevelopmentProjectProperty;
import org.citygml4j.ade.iur.model.urf.GreenSpace;
import org.citygml4j.ade.iur.model.urf.GreenSpaceConservationDistrict;
import org.citygml4j.ade.iur.model.urf.HeightControlDistrict;
import org.citygml4j.ade.iur.model.urf.HighLevelUseDistrict;
import org.citygml4j.ade.iur.model.urf.HighRiseResidentialAttractionDistrict;
import org.citygml4j.ade.iur.model.urf.HistoricSceneryMaintenanceAndImprovementDistrictPlan;
import org.citygml4j.ade.iur.model.urf.HousingControlArea;
import org.citygml4j.ade.iur.model.urf.HubCity;
import org.citygml4j.ade.iur.model.urf.IndustrialParkDevelopmentProject;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentProject;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentPromotionArea;
import org.citygml4j.ade.iur.model.urf.LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment;
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
import org.citygml4j.ade.iur.model.urf.PrivateUrbanRenewalProjectPlanProperty;
import org.citygml4j.ade.iur.model.urf.ProductiveGreenZone;
import org.citygml4j.ade.iur.model.urf.ProjectPromotionArea;
import org.citygml4j.ade.iur.model.urf.PromotionDistrict;
import org.citygml4j.ade.iur.model.urf.PromotionDistrictProperty;
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
import org.citygml4j.ade.iur.model.urf.SpecialUrbanRenaissanceDistrictProperty;
import org.citygml4j.ade.iur.model.urf.SpecialUseAttractionDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUseDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialUseRestrictionDistrict;
import org.citygml4j.ade.iur.model.urf.SpecialZoneForPreservationOfHistoricalLandscape;
import org.citygml4j.ade.iur.model.urf.SpecifiedBlock;
import org.citygml4j.ade.iur.model.urf.SpecifiedBuildingZoneImprovementPlan;
import org.citygml4j.ade.iur.model.urf.SpecifiedDisasterPreventionBlockImprovementZone;
import org.citygml4j.ade.iur.model.urf.SpecifiedUrgentUrbanRenewalArea;
import org.citygml4j.ade.iur.model.urf.SpecifiedUrgentUrbanRenewalAreaProperty;
import org.citygml4j.ade.iur.model.urf.SupplyFacility;
import org.citygml4j.ade.iur.model.urf.Target;
import org.citygml4j.ade.iur.model.urf.TelecommunicationFacility;
import org.citygml4j.ade.iur.model.urf.ThreeDimensionalExtent;
import org.citygml4j.ade.iur.model.urf.ThreeDimensionalExtentProperty;
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
import org.citygml4j.ade.iur.model.urf.UrbanFunction;
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
import org.citygml4j.ade.iur.model.urf.ZonalDisasterPreventionFacilityProperty;
import org.citygml4j.ade.iur.model.urf.Zone;
import org.citygml4j.ade.iur.model.urf.ZoneForPreservationOfHistoricalLandscape;
import org.citygml4j.ade.iur.model.urg.GenericGridCell;
import org.citygml4j.ade.iur.model.urg.Households;
import org.citygml4j.ade.iur.model.urg.LandslideDisaster;
import org.citygml4j.ade.iur.model.urg.OfficesAndEmployees;
import org.citygml4j.ade.iur.model.urg.Population;
import org.citygml4j.ade.iur.model.urg.PublicTransitAccessibility;
import org.citygml4j.ade.iur.model.urg.StatisticalGrid;
import org.citygml4j.ade.iur.model.urg.StatusOfSiteSeeing;
import org.citygml4j.ade.iur.model.uro.AbstractBoundarySurface;
import org.citygml4j.ade.iur.model.uro.AbstractBoundarySurfaceProperty;
import org.citygml4j.ade.iur.model.uro.AbstractConstruction;
import org.citygml4j.ade.iur.model.uro.AbstractPointCloud;
import org.citygml4j.ade.iur.model.uro.ClosureSurface;
import org.citygml4j.ade.iur.model.uro.ConstructionInstallation;
import org.citygml4j.ade.iur.model.uro.ConstructionInstallationProperty;
import org.citygml4j.ade.iur.model.uro.GroundSurface;
import org.citygml4j.ade.iur.model.uro.OtherConstruction;
import org.citygml4j.ade.iur.model.uro.OuterCeilingSurface;
import org.citygml4j.ade.iur.model.uro.OuterFloorSurface;
import org.citygml4j.ade.iur.model.uro.PointCloud;
import org.citygml4j.ade.iur.model.uro.RoofSurface;
import org.citygml4j.ade.iur.model.uro.UndergroundBuilding;
import org.citygml4j.ade.iur.model.uro.WallSurface;
import org.citygml4j.ade.iur.model.urt.Agency;
import org.citygml4j.ade.iur.model.urt.Attribution;
import org.citygml4j.ade.iur.model.urt.Calendar;
import org.citygml4j.ade.iur.model.urt.CalendarDate;
import org.citygml4j.ade.iur.model.urt.FareAttribute;
import org.citygml4j.ade.iur.model.urt.Level;
import org.citygml4j.ade.iur.model.urt.Office;
import org.citygml4j.ade.iur.model.urt.Pathway;
import org.citygml4j.ade.iur.model.urt.PublicTransit;
import org.citygml4j.ade.iur.model.urt.Route;
import org.citygml4j.ade.iur.model.urt.Shape;
import org.citygml4j.ade.iur.model.urt.Stop;
import org.citygml4j.ade.iur.model.urt.TranslationJP;
import org.citygml4j.ade.iur.model.urt.Trip;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.building.AbstractBuilding;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;

import java.util.ArrayList;

public class FeatureWalker implements ADEWalker<org.citygml4j.util.walker.FeatureWalker> {
    private org.citygml4j.util.walker.FeatureWalker walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.FeatureWalker walker) {
        this.walker = walker;
    }

    // uro feature types (generated)
    public void visit(AbstractConstruction abstractConstruction) {
        walker.visit((AbstractCityObject) abstractConstruction);

        for (AbstractBoundarySurfaceProperty property : new ArrayList<>(abstractConstruction.getBoundedBySurface()))
            walker.visit((FeatureProperty<?>) property);

        for (ConstructionInstallationProperty property : new ArrayList<>(abstractConstruction.getConstructionInstallation()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(AbstractPointCloud abstractPointCloud) {
        walker.visit((AbstractFeature) abstractPointCloud);
    }

    public void visit(AbstractBoundarySurface abstractBoundarySurface) {
        walker.visit((AbstractCityObject) abstractBoundarySurface);
    }

    public void visit(ClosureSurface closureSurface) {
        visit((AbstractBoundarySurface) closureSurface);
    }

    public void visit(ConstructionInstallation constructionInstallation) {
        walker.visit((AbstractCityObject) constructionInstallation);
    }

    public void visit(GroundSurface groundSurface) {
        visit((AbstractBoundarySurface) groundSurface);
    }

    public void visit(OtherConstruction otherConstruction) {
        visit((AbstractConstruction) otherConstruction);
    }

    public void visit(OuterCeilingSurface outerCeilingSurface) {
        visit((AbstractBoundarySurface) outerCeilingSurface);
    }

    public void visit(OuterFloorSurface outerFloorSurface) {
        visit((AbstractBoundarySurface) outerFloorSurface);
    }

    public void visit(PointCloud pointCloud) {
        visit((AbstractPointCloud) pointCloud);
    }

    public void visit(RoofSurface roofSurface) {
        visit((AbstractBoundarySurface) roofSurface);
    }

    public void visit(UndergroundBuilding undergroundBuilding) {
        walker.visit((AbstractBuilding) undergroundBuilding);
    }

    public void visit(WallSurface wallSurface) {
        visit((AbstractBoundarySurface) wallSurface);
    }

    public void visit(UrbanFunction urbanFunction) {
        walker.visit((AbstractCityObject) urbanFunction);
    }

    public void visit(Administration administration) {
        visit((UrbanFunction) administration);
    }

    public void visit(Zone zone) {
        visit((UrbanFunction) zone);
    }

    public void visit(Agreement agreement) {
        visit((Zone) agreement);
    }

    public void visit(DistrictsAndZones districtsAndZones) {
        visit((Zone) districtsAndZones);
    }

    public void visit(AircraftNoiseControlZone aircraftNoiseControlZone) {
        visit((DistrictsAndZones) aircraftNoiseControlZone);
    }

    public void visit(AreaClassification areaClassification) {
        visit((Zone) areaClassification);
    }

    public void visit(CensusBlock censusBlock) {
        visit((UrbanFunction) censusBlock);
    }

    public void visit(UrbanFacility urbanFacility) {
        visit((Zone) urbanFacility);

        for (ThreeDimensionalExtentProperty property : new ArrayList<>(urbanFacility.getThreeDimensionalExtent()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(CollectiveFacilitiesForReconstruction collectiveFacilitiesForReconstruction) {
        visit((UrbanFacility) collectiveFacilitiesForReconstruction);
    }

    public void visit(CollectiveFacilitiesForReconstructionAndRevitalization collectiveFacilitiesForReconstructionAndRevitalization) {
        visit((UrbanFacility) collectiveFacilitiesForReconstructionAndRevitalization);
    }

    public void visit(CollectiveFacilitiesForTsunamiDisasterPrevention collectiveFacilitiesForTsunamiDisasterPrevention) {
        visit((UrbanFacility) collectiveFacilitiesForTsunamiDisasterPrevention);
    }

    public void visit(CollectiveGovernmentAndPublicOfficeFacilities collectiveGovernmentAndPublicOfficeFacilities) {
        visit((UrbanFacility) collectiveGovernmentAndPublicOfficeFacilities);
    }

    public void visit(CollectiveHousingFacilities collectiveHousingFacilities) {
        visit((UrbanFacility) collectiveHousingFacilities);
    }

    public void visit(CollectiveUrbanDisasterPreventionFacilities collectiveUrbanDisasterPreventionFacilities) {
        visit((UrbanFacility) collectiveUrbanDisasterPreventionFacilities);
    }

    public void visit(ConservationZoneForClustersOfTraditionalStructures conservationZoneForClustersOfTraditionalStructures) {
        visit((DistrictsAndZones) conservationZoneForClustersOfTraditionalStructures);
    }

    public void visit(DID dID) {
        visit((UrbanFunction) dID);
    }

    public void visit(DevelopmentProject developmentProject) {
        visit((UrbanFunction) developmentProject);
    }

    public void visit(DisasterDamage disasterDamage) {
        visit((UrbanFunction) disasterDamage);
    }

    public void visit(DisasterPreventionBase disasterPreventionBase) {
        visit((UrbanFunction) disasterPreventionBase);
    }

    public void visit(UrbanDevelopmentProject urbanDevelopmentProject) {
        visit((Zone) urbanDevelopmentProject);
    }

    public void visit(DisasterPreventionBlockImprovementProject disasterPreventionBlockImprovementProject) {
        visit((UrbanDevelopmentProject) disasterPreventionBlockImprovementProject);
    }

    public void visit(AbstractDistrictPlan abstractDistrictPlan) {
        visit((Zone) abstractDistrictPlan);

        for (DistrictDevelopmentPlanProperty property : new ArrayList<>(abstractDistrictPlan.getDistrictDevelopmentPlan()))
            walker.visit((FeatureProperty<?>) property);

        for (PromotionDistrictProperty property : new ArrayList<>(abstractDistrictPlan.getPromotionDistrict()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(DisasterPreventionBlockImprovementZonePlan disasterPreventionBlockImprovementZonePlan) {
        visit((AbstractDistrictPlan) disasterPreventionBlockImprovementZonePlan);

        for (ZonalDisasterPreventionFacilityProperty property : new ArrayList<>(disasterPreventionBlockImprovementZonePlan.getZonalDisasterPreventionFacilities()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(DistributionBusinessPark distributionBusinessPark) {
        visit((UrbanFacility) distributionBusinessPark);
    }

    public void visit(DistributionBusinessZone distributionBusinessZone) {
        visit((DistrictsAndZones) distributionBusinessZone);
    }

    public void visit(DistributionOfFloraAndFauna distributionOfFloraAndFauna) {
        visit((UrbanFunction) distributionOfFloraAndFauna);
    }

    public void visit(District district) {
        visit((Zone) district);
    }

    public void visit(DistrictDevelopmentPlan districtDevelopmentPlan) {
        visit((Zone) districtDevelopmentPlan);

        for (DistrictFacilityProperty property : new ArrayList<>(districtDevelopmentPlan.getDistrictFacility()))
            walker.visit((FeatureProperty<?>) property);

        for (DistrictProperty property : new ArrayList<>(districtDevelopmentPlan.getDistrict()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(DistrictFacility districtFacility) {
        visit((Zone) districtFacility);
    }

    public void visit(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan districtImprovementPlanForDisasterPreventionBlockImprovementZonePlan) {
        visit((DistrictDevelopmentPlan) districtImprovementPlanForDisasterPreventionBlockImprovementZonePlan);
    }

    public void visit(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict districtImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict) {
        visit((DistrictDevelopmentPlan) districtImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict);
    }

    public void visit(DistrictPlan districtPlan) {
        visit((AbstractDistrictPlan) districtPlan);
    }

    public void visit(EducationalAndCulturalFacility educationalAndCulturalFacility) {
        visit((UrbanFacility) educationalAndCulturalFacility);
    }

    public void visit(ExceptionalFloorAreaRateDistrict exceptionalFloorAreaRateDistrict) {
        visit((DistrictsAndZones) exceptionalFloorAreaRateDistrict);
    }

    public void visit(FirePreventionDistrict firePreventionDistrict) {
        visit((DistrictsAndZones) firePreventionDistrict);
    }

    public void visit(UrbanFacilityStipulatedByCabinetOrder urbanFacilityStipulatedByCabinetOrder) {
        visit((UrbanFacility) urbanFacilityStipulatedByCabinetOrder);
    }

    public void visit(FireProtectionFacility fireProtectionFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) fireProtectionFacility);
    }

    public void visit(FloodPreventionFacility floodPreventionFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) floodPreventionFacility);
    }

    public void visit(GlobalHubCityDevelopmentProject globalHubCityDevelopmentProject) {
        visit((Zone) globalHubCityDevelopmentProject);
    }

    public void visit(GreenSpace greenSpace) {
        visit((UrbanFunction) greenSpace);
    }

    public void visit(GreenSpaceConservationDistrict greenSpaceConservationDistrict) {
        visit((DistrictsAndZones) greenSpaceConservationDistrict);
    }

    public void visit(HeightControlDistrict heightControlDistrict) {
        visit((DistrictsAndZones) heightControlDistrict);
    }

    public void visit(HighLevelUseDistrict highLevelUseDistrict) {
        visit((DistrictsAndZones) highLevelUseDistrict);
    }

    public void visit(HighRiseResidentialAttractionDistrict highRiseResidentialAttractionDistrict) {
        visit((DistrictsAndZones) highRiseResidentialAttractionDistrict);
    }

    public void visit(HistoricSceneryMaintenanceAndImprovementDistrictPlan historicSceneryMaintenanceAndImprovementDistrictPlan) {
        visit((AbstractDistrictPlan) historicSceneryMaintenanceAndImprovementDistrictPlan);
    }

    public void visit(HousingControlArea housingControlArea) {
        visit((DistrictsAndZones) housingControlArea);
    }

    public void visit(HubCity hubCity) {
        visit((UrbanFunction) hubCity);
    }

    public void visit(IndustrialParkDevelopmentProject industrialParkDevelopmentProject) {
        visit((UrbanDevelopmentProject) industrialParkDevelopmentProject);
    }

    public void visit(org.citygml4j.ade.iur.model.urf.LandPrice landPrice) {
        visit((UrbanFunction) landPrice);
    }

    public void visit(LandReadjustmentProject landReadjustmentProject) {
        visit((UrbanDevelopmentProject) landReadjustmentProject);
    }

    public void visit(ProjectPromotionArea projectPromotionArea) {
        visit((Zone) projectPromotionArea);
    }

    public void visit(LandReadjustmentPromotionArea landReadjustmentPromotionArea) {
        visit((ProjectPromotionArea) landReadjustmentPromotionArea);
    }

    public void visit(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment landReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment) {
        visit((ProjectPromotionArea) landReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment);
    }

    public void visit(org.citygml4j.ade.iur.model.urf.LandUseDiversion landUseDiversion) {
        visit((UrbanFunction) landUseDiversion);
    }

    public void visit(LandscapeZone landscapeZone) {
        visit((DistrictsAndZones) landscapeZone);
    }

    public void visit(MarketsSlaughterhousesCrematoria marketsSlaughterhousesCrematoria) {
        visit((UrbanFacility) marketsSlaughterhousesCrematoria);
    }

    public void visit(MedicalFacility medicalFacility) {
        visit((UrbanFacility) medicalFacility);
    }

    public void visit(NaturalConditions naturalConditions) {
        visit((UrbanFunction) naturalConditions);
    }

    public void visit(NewHousing newHousing) {
        visit((UrbanFunction) newHousing);
    }

    public void visit(NewHousingAndUrbanDevelopmentProject newHousingAndUrbanDevelopmentProject) {
        visit((UrbanDevelopmentProject) newHousingAndUrbanDevelopmentProject);
    }

    public void visit(NewUrbanInfrastructureProject newUrbanInfrastructureProject) {
        visit((UrbanDevelopmentProject) newUrbanInfrastructureProject);
    }

    public void visit(OpenSpaceForPublicUse openSpaceForPublicUse) {
        visit((UrbanFacility) openSpaceForPublicUse);
    }

    public void visit(ParkingPlaceDevelopmentZone parkingPlaceDevelopmentZone) {
        visit((DistrictsAndZones) parkingPlaceDevelopmentZone);
    }

    public void visit(Pollution pollution) {
        visit((UrbanFunction) pollution);
    }

    public void visit(PortZone portZone) {
        visit((DistrictsAndZones) portZone);
    }

    public void visit(PrivateUrbanRenewalProjectPlan privateUrbanRenewalProjectPlan) {
        visit((Zone) privateUrbanRenewalProjectPlan);
    }

    public void visit(ProductiveGreenZone productiveGreenZone) {
        visit((DistrictsAndZones) productiveGreenZone);
    }

    public void visit(PromotionDistrict promotionDistrict) {
        visit((Zone) promotionDistrict);
    }

    public void visit(PublicTransitFacility publicTransitFacility) {
        visit((UrbanFunction) publicTransitFacility);
    }

    public void visit(QuasiUrbanPlanningArea quasiUrbanPlanningArea) {
        visit((Zone) quasiUrbanPlanningArea);
    }

    public void visit(Recreations recreations) {
        visit((UrbanFunction) recreations);
    }

    public void visit(Regulation regulation) {
        visit((Zone) regulation);
    }

    public void visit(ResidenceAttractionArea residenceAttractionArea) {
        visit((Zone) residenceAttractionArea);
    }

    public void visit(ResidentialBlockConstructionProject residentialBlockConstructionProject) {
        visit((UrbanDevelopmentProject) residentialBlockConstructionProject);
    }

    public void visit(ResidentialBlockConstructionPromotionArea residentialBlockConstructionPromotionArea) {
        visit((ProjectPromotionArea) residentialBlockConstructionPromotionArea);
    }

    public void visit(ResidentialEnvironmentImprovementDistrict residentialEnvironmentImprovementDistrict) {
        visit((DistrictsAndZones) residentialEnvironmentImprovementDistrict);
    }

    public void visit(RoadsideDistrictFacility roadsideDistrictFacility) {
        visit((DistrictFacility) roadsideDistrictFacility);
    }

    public void visit(RoadsideDistrictImprovementPlan roadsideDistrictImprovementPlan) {
        visit((DistrictDevelopmentPlan) roadsideDistrictImprovementPlan);
    }

    public void visit(RoadsideDistrictPlan roadsideDistrictPlan) {
        visit((AbstractDistrictPlan) roadsideDistrictPlan);
    }

    public void visit(RuralDistrictFacility ruralDistrictFacility) {
        visit((DistrictFacility) ruralDistrictFacility);
    }

    public void visit(RuralDistrictImprovementPlan ruralDistrictImprovementPlan) {
        visit((DistrictDevelopmentPlan) ruralDistrictImprovementPlan);
    }

    public void visit(RuralDistrictPlan ruralDistrictPlan) {
        visit((AbstractDistrictPlan) ruralDistrictPlan);
    }

    public void visit(SandControlFacility sandControlFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) sandControlFacility);
    }

    public void visit(ScenicDistrict scenicDistrict) {
        visit((DistrictsAndZones) scenicDistrict);
    }

    public void visit(ScenicResource scenicResource) {
        visit((UrbanFunction) scenicResource);
    }

    public void visit(ScheduledAreaForUrbanDevelopmentProject scheduledAreaForUrbanDevelopmentProject) {
        visit((Zone) scheduledAreaForUrbanDevelopmentProject);
    }

    public void visit(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities scheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities);
    }

    public void visit(ScheduledAreaForCollectiveHousingFacilities scheduledAreaForCollectiveHousingFacilities) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForCollectiveHousingFacilities);
    }

    public void visit(ScheduledAreaForDistributionBusinessPark scheduledAreaForDistributionBusinessPark) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForDistributionBusinessPark);
    }

    public void visit(ScheduledAreaForIndustrialParkDevelopmentProjects scheduledAreaForIndustrialParkDevelopmentProjects) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForIndustrialParkDevelopmentProjects);
    }

    public void visit(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects scheduledAreaForNewHousingAndUrbanDevelopmentProjects) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForNewHousingAndUrbanDevelopmentProjects);
    }

    public void visit(ScheduledAreaForNewUrbanInfrastructureProjects scheduledAreaForNewUrbanInfrastructureProjects) {
        visit((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForNewUrbanInfrastructureProjects);
    }

    public void visit(SedimentDisasterProneArea sedimentDisasterProneArea) {
        visit((Zone) sedimentDisasterProneArea);
    }

    public void visit(SnowProtectionFacility snowProtectionFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) snowProtectionFacility);
    }

    public void visit(SocialWelfareFacility socialWelfareFacility) {
        visit((UrbanFacility) socialWelfareFacility);
    }

    public void visit(SpecialGreenSpaceConservationDistrict specialGreenSpaceConservationDistrict) {
        visit((DistrictsAndZones) specialGreenSpaceConservationDistrict);
    }

    public void visit(SpecialUrbanRenaissanceDistrict specialUrbanRenaissanceDistrict) {
        visit((DistrictsAndZones) specialUrbanRenaissanceDistrict);
    }

    public void visit(SpecialUseAttractionDistrict specialUseAttractionDistrict) {
        visit((DistrictsAndZones) specialUseAttractionDistrict);
    }

    public void visit(SpecialUseDistrict specialUseDistrict) {
        visit((DistrictsAndZones) specialUseDistrict);
    }

    public void visit(SpecialUseRestrictionDistrict specialUseRestrictionDistrict) {
        visit((DistrictsAndZones) specialUseRestrictionDistrict);
    }

    public void visit(SpecialZoneForPreservationOfHistoricalLandscape specialZoneForPreservationOfHistoricalLandscape) {
        visit((DistrictsAndZones) specialZoneForPreservationOfHistoricalLandscape);
    }

    public void visit(SpecifiedBlock specifiedBlock) {
        visit((DistrictsAndZones) specifiedBlock);
    }

    public void visit(SpecifiedBuildingZoneImprovementPlan specifiedBuildingZoneImprovementPlan) {
        visit((DistrictDevelopmentPlan) specifiedBuildingZoneImprovementPlan);
    }

    public void visit(SpecifiedDisasterPreventionBlockImprovementZone specifiedDisasterPreventionBlockImprovementZone) {
        visit((DistrictsAndZones) specifiedDisasterPreventionBlockImprovementZone);
    }

    public void visit(UrgentUrbanRenewalArea urgentUrbanRenewalArea) {
        visit((Zone) urgentUrbanRenewalArea);

        for (PrivateUrbanRenewalProjectPlanProperty property : new ArrayList<>(urgentUrbanRenewalArea.getPrivateProject()))
            walker.visit((FeatureProperty<?>) property);

        for (SpecifiedUrgentUrbanRenewalAreaProperty property : new ArrayList<>(urgentUrbanRenewalArea.getSpecifiedArea()))
            walker.visit((FeatureProperty<?>) property);

        for (SpecialUrbanRenaissanceDistrictProperty property : new ArrayList<>(urgentUrbanRenewalArea.getSpecialDistrict()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(SpecifiedUrgentUrbanRenewalArea specifiedUrgentUrbanRenewalArea) {
        visit((UrgentUrbanRenewalArea) specifiedUrgentUrbanRenewalArea);

        for (GlobalHubCityDevelopmentProjectProperty property : new ArrayList<>(specifiedUrgentUrbanRenewalArea.getDevelopmentProject()))
            walker.visit((FeatureProperty<?>) property);
    }

    public void visit(SupplyFacility supplyFacility) {
        visit((UrbanFacility) supplyFacility);
    }

    public void visit(Target target) {
        walker.visit((AbstractFeature) target);
    }

    public void visit(TelecommunicationFacility telecommunicationFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) telecommunicationFacility);
    }

    public void visit(ThreeDimensionalExtent threeDimensionalExtent) {
        visit((UrbanFunction) threeDimensionalExtent);
    }

    public void visit(TideFacility tideFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) tideFacility);
    }

    public void visit(TrafficFacility trafficFacility) {
        visit((UrbanFacility) trafficFacility);
    }

    public void visit(TreatmentFacility treatmentFacility) {
        visit((UrbanFacility) treatmentFacility);
    }

    public void visit(TreePlantingDistrict treePlantingDistrict) {
        visit((DistrictsAndZones) treePlantingDistrict);
    }

    public void visit(UnclassifiedBlankArea unclassifiedBlankArea) {
        visit((Zone) unclassifiedBlankArea);
    }

    public void visit(UnclassifiedUseDistrict unclassifiedUseDistrict) {
        visit((Zone) unclassifiedUseDistrict);
    }

    public void visit(UnusedLandUsePromotionArea unusedLandUsePromotionArea) {
        visit((Zone) unusedLandUsePromotionArea);
    }

    public void visit(UrbanDisasterRecoveryPromotionArea urbanDisasterRecoveryPromotionArea) {
        visit((Zone) urbanDisasterRecoveryPromotionArea);
    }

    public void visit(UrbanFacilityStatus urbanFacilityStatus) {
        visit((UrbanFunction) urbanFacilityStatus);
    }

    public void visit(UrbanFunctionAttractionArea urbanFunctionAttractionArea) {
        visit((Zone) urbanFunctionAttractionArea);
    }

    public void visit(UrbanPlanningArea urbanPlanningArea) {
        visit((Zone) urbanPlanningArea);
    }

    public void visit(UrbanRedevelopmentProject urbanRedevelopmentProject) {
        visit((UrbanDevelopmentProject) urbanRedevelopmentProject);
    }

    public void visit(UrbanRedevelopmentPromotionArea urbanRedevelopmentPromotionArea) {
        visit((ProjectPromotionArea) urbanRedevelopmentPromotionArea);
    }

    public void visit(UrbanRenewalProject urbanRenewalProject) {
        visit((UrbanDevelopmentProject) urbanRenewalProject);
    }

    public void visit(Urbanization urbanization) {
        visit((UrbanFunction) urbanization);
    }

    public void visit(UseDistrict useDistrict) {
        visit((DistrictsAndZones) useDistrict);
    }

    public void visit(Waterway waterway) {
        visit((UrbanFacility) waterway);
    }

    public void visit(WeatherObservation weatherObservation) {
        visit((UrbanFunction) weatherObservation);
    }

    public void visit(WindProtectionFacility windProtectionFacility) {
        visit((UrbanFacilityStipulatedByCabinetOrder) windProtectionFacility);
    }

    public void visit(ZonalDisasterPreventionFacility zonalDisasterPreventionFacility) {
        visit((Zone) zonalDisasterPreventionFacility);
    }

    public void visit(ZoneForPreservationOfHistoricalLandscape zoneForPreservationOfHistoricalLandscape) {
        visit((DistrictsAndZones) zoneForPreservationOfHistoricalLandscape);
    }

    public void visit(StatisticalGrid statisticalGrid) {
        walker.visit((AbstractCityObject) statisticalGrid);
    }

    public void visit(Population population) {
        visit((StatisticalGrid) population);
    }

    public void visit(PublicTransitAccessibility publicTransitAccessibility) {
        visit((StatisticalGrid) publicTransitAccessibility);
    }

    public void visit(org.citygml4j.ade.iur.model.urg.LandPrice landPrice) {
        visit((StatisticalGrid) landPrice);
    }

    public void visit(org.citygml4j.ade.iur.model.urg.LandUseDiversion landUseDiversion) {
        visit((StatisticalGrid) landUseDiversion);
    }

    public void visit(Households households) {
        visit((StatisticalGrid) households);
    }

    public void visit(OfficesAndEmployees officesAndEmployees) {
        visit((StatisticalGrid) officesAndEmployees);
    }

    public void visit(GenericGridCell genericGridCell) {
        visit((StatisticalGrid) genericGridCell);
    }

    public void visit(StatusOfSiteSeeing statusOfSiteSeeing) {
        visit((StatisticalGrid) statusOfSiteSeeing);
    }

    public void visit(LandslideDisaster landslideDisaster) {
        visit((StatisticalGrid) landslideDisaster);
    }

    public void visit(PublicTransit publicTransit) {
        walker.visit((AbstractCityObject) publicTransit);
    }

    public void visit(Route route) {
        visit((PublicTransit) route);

        if (route.getAgency() != null)
            walker.visit((FeatureProperty<?>) route.getAgency());

        if (route.getParentRoute() != null)
            walker.visit((FeatureProperty<?>) route.getParentRoute());
    }

    public void visit(Agency agency) {
        visit((PublicTransit) agency);
    }

    public void visit(Stop stop) {
        visit((PublicTransit) stop);

        if (stop.getParentStation() != null)
            walker.visit((FeatureProperty<?>) stop.getParentStation());

        if (stop.getLevel() != null)
            walker.visit((FeatureProperty<?>) stop.getLevel());
    }

    public void visit(Level level) {
        visit((PublicTransit) level);
    }

    public void visit(Trip trip) {
        visit((PublicTransit) trip);

        if (trip.getRoute() != null)
            walker.visit((FeatureProperty<?>) trip.getRoute());

        if (trip.getCalendar() != null)
            walker.visit((FeatureProperty<?>) trip.getCalendar());

        if (trip.getCalendarDate() != null)
            walker.visit((FeatureProperty<?>) trip.getCalendarDate());

        if (trip.getOffice() != null)
            walker.visit((FeatureProperty<?>) trip.getOffice());

        if (trip.getShape() != null)
            walker.visit((FeatureProperty<?>) trip.getShape());
    }

    public void visit(Shape shape) {
        visit((PublicTransit) shape);
    }

    public void visit(Office office) {
        visit((PublicTransit) office);
    }

    public void visit(Calendar calendar) {
        visit((PublicTransit) calendar);
    }

    public void visit(CalendarDate calendarDate) {
        visit((PublicTransit) calendarDate);

        if (calendarDate.getCalendar() != null)
            walker.visit((FeatureProperty<?>) calendarDate.getCalendar());
    }

    public void visit(FareAttribute fareAttribute) {
        visit((PublicTransit) fareAttribute);

        if (fareAttribute.getAgency() != null)
            walker.visit((FeatureProperty<?>) fareAttribute.getAgency());
    }

    public void visit(Pathway pathway) {
        visit((PublicTransit) pathway);

        if (pathway.getFrom() != null)
            walker.visit((FeatureProperty<?>) pathway.getFrom());

        if (pathway.getTo() != null)
            walker.visit((FeatureProperty<?>) pathway.getTo());
    }

    public void visit(TranslationJP translationJP) {
        visit((PublicTransit) translationJP);
    }

    public void visit(Attribution attribution) {
        visit((PublicTransit) attribution);

        if (attribution.getAgency() != null)
            walker.visit((FeatureProperty<?>) attribution.getAgency());

        if (attribution.getRoute() != null)
            walker.visit((FeatureProperty<?>) attribution.getRoute());

        if (attribution.getTrip() != null)
            walker.visit((FeatureProperty<?>) attribution.getTrip());
    }
}
