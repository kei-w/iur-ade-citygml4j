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
import org.citygml4j.ade.iur.model.urf.BoundaryProperty;
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
import org.citygml4j.ade.iur.model.urt.DataTypePropertyElement;
import org.citygml4j.ade.iur.model.urt.FareAttribute;
import org.citygml4j.ade.iur.model.urt.FareRule;
import org.citygml4j.ade.iur.model.urt.Frequency;
import org.citygml4j.ade.iur.model.urt.Level;
import org.citygml4j.ade.iur.model.urt.Office;
import org.citygml4j.ade.iur.model.urt.Pathway;
import org.citygml4j.ade.iur.model.urt.PointProperty;
import org.citygml4j.ade.iur.model.urt.PublicTransit;
import org.citygml4j.ade.iur.model.urt.Route;
import org.citygml4j.ade.iur.model.urt.Shape;
import org.citygml4j.ade.iur.model.urt.Stop;
import org.citygml4j.ade.iur.model.urt.StopTime;
import org.citygml4j.ade.iur.model.urt.Transfer;
import org.citygml4j.ade.iur.model.urt.Translation;
import org.citygml4j.ade.iur.model.urt.TranslationJP;
import org.citygml4j.ade.iur.model.urt.Trip;
import org.citygml4j.model.citygml.ade.binding.ADEWalker;
import org.citygml4j.model.citygml.building.AbstractBuilding;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.gml.feature.AbstractFeature;
import org.citygml4j.model.gml.feature.FeatureProperty;

import java.util.ArrayList;

public class GMLFunctionWalker<T> implements ADEWalker<org.citygml4j.util.walker.GMLFunctionWalker<T>> {
    private org.citygml4j.util.walker.GMLFunctionWalker<T> walker;

    @Override
    public void setParentWalker(org.citygml4j.util.walker.GMLFunctionWalker<T> walker) {
        this.walker = walker;
    }

    // uro feature types (generated)
    public T apply(AbstractConstruction abstractConstruction) {
        T object = walker.apply((AbstractCityObject) abstractConstruction);
        if (object != null)
            return object;

        if (abstractConstruction.getLod0Geometry() != null) {
            object = walker.apply(abstractConstruction.getLod0Geometry());
            if (object != null)
                return object;
        }

        if (abstractConstruction.getLod1Geometry() != null) {
            object = walker.apply(abstractConstruction.getLod1Geometry());
            if (object != null)
                return object;
        }

        if (abstractConstruction.getLod2Geometry() != null) {
            object = walker.apply(abstractConstruction.getLod2Geometry());
            if (object != null)
                return object;
        }

        if (abstractConstruction.getLod3Geometry() != null) {
            object = walker.apply(abstractConstruction.getLod3Geometry());
            if (object != null)
                return object;
        }

        if (abstractConstruction.getLod4Geometry() != null) {
            object = walker.apply(abstractConstruction.getLod4Geometry());
            if (object != null)
                return object;
        }

        for (AbstractBoundarySurfaceProperty property : new ArrayList<>(abstractConstruction.getBoundedBySurface())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        for (ConstructionInstallationProperty property : new ArrayList<>(abstractConstruction.getConstructionInstallation())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(AbstractPointCloud abstractPointCloud) {
        T object = walker.apply((AbstractFeature) abstractPointCloud);
        if (object != null)
            return object;

        return null;
    }

    public T apply(AbstractBoundarySurface abstractBoundarySurface) {
        T object = walker.apply((AbstractCityObject) abstractBoundarySurface);
        if (object != null)
            return object;

        if (abstractBoundarySurface.getLod2MultiSurface() != null) {
            object = walker.apply(abstractBoundarySurface.getLod2MultiSurface());
            if (object != null)
                return object;
        }

        if (abstractBoundarySurface.getLod3MultiSurface() != null) {
            object = walker.apply(abstractBoundarySurface.getLod3MultiSurface());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(ClosureSurface closureSurface) {
        return apply((AbstractBoundarySurface) closureSurface);
    }

    public T apply(ConstructionInstallation constructionInstallation) {
        T object = walker.apply((AbstractCityObject) constructionInstallation);
        if (object != null)
            return object;

        if (constructionInstallation.getLod2Geometry() != null) {
            object = walker.apply(constructionInstallation.getLod2Geometry());
            if (object != null)
                return object;
        }

        if (constructionInstallation.getLod3Geometry() != null) {
            object = walker.apply(constructionInstallation.getLod3Geometry());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(GroundSurface groundSurface) {
        return apply((AbstractBoundarySurface) groundSurface);
    }

    public T apply(OtherConstruction otherConstruction) {
        return apply((AbstractConstruction) otherConstruction);
    }

    public T apply(OuterCeilingSurface outerCeilingSurface) {
        return apply((AbstractBoundarySurface) outerCeilingSurface);
    }

    public T apply(OuterFloorSurface outerFloorSurface) {
        return apply((AbstractBoundarySurface) outerFloorSurface);
    }

    public T apply(PointCloud pointCloud) {
        T object = apply((AbstractPointCloud) pointCloud);
        if (object != null)
            return object;

        if (pointCloud.getPoints() != null) {
            object = walker.apply(pointCloud.getPoints());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(RoofSurface roofSurface) {
        return apply((AbstractBoundarySurface) roofSurface);
    }

    public T apply(UndergroundBuilding undergroundBuilding) {
        T object = walker.apply((AbstractBuilding) undergroundBuilding);
        if (object != null)
            return object;

        return null;
    }

    public T apply(WallSurface wallSurface) {
        return apply((AbstractBoundarySurface) wallSurface);
    }

    public T apply(UrbanFunction urbanFunction) {
        T object = walker.apply((AbstractCityObject) urbanFunction);
        if (object != null)
            return object;

        if (urbanFunction.getLodMinus2MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLodMinus2MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLodMinus1MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLodMinus1MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod0MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLod0MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod1MultiSurface() != null) {
            object = walker.apply(urbanFunction.getLod1MultiSurface());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLodMinus2MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLodMinus2MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLodMinus1MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLodMinus1MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod0MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLod0MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod1MultiCurve() != null) {
            object = walker.apply(urbanFunction.getLod1MultiCurve());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLodMinus2MultiPoint() != null) {
            object = walker.apply(urbanFunction.getLodMinus2MultiPoint());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLodMinus1MultiPoint() != null) {
            object = walker.apply(urbanFunction.getLodMinus1MultiPoint());
            if (object != null)
                return object;
        }

        if (urbanFunction.getLod0MultiPoint() != null) {
            object = walker.apply(urbanFunction.getLod0MultiPoint());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Administration administration) {
        return apply((UrbanFunction) administration);
    }

    public T apply(Zone zone) {
        T object = apply((UrbanFunction) zone);
        if (object != null)
            return object;

        for (BoundaryProperty property : new ArrayList<>(zone.getBoundary()))
            if (property.getObject() != null && property.getObject().getLocation() != null) {
            object = walker.apply(property.getObject().getLocation());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Agreement agreement) {
        return apply((Zone) agreement);
    }

    public T apply(DistrictsAndZones districtsAndZones) {
        return apply((Zone) districtsAndZones);
    }

    public T apply(AircraftNoiseControlZone aircraftNoiseControlZone) {
        return apply((DistrictsAndZones) aircraftNoiseControlZone);
    }

    public T apply(AreaClassification areaClassification) {
        return apply((Zone) areaClassification);
    }

    public T apply(CensusBlock censusBlock) {
        return apply((UrbanFunction) censusBlock);
    }

    public T apply(UrbanFacility urbanFacility) {
        T object = apply((Zone) urbanFacility);
        if (object != null)
            return object;

        for (ThreeDimensionalExtentProperty property : new ArrayList<>(urbanFacility.getThreeDimensionalExtent())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(CollectiveFacilitiesForReconstruction collectiveFacilitiesForReconstruction) {
        return apply((UrbanFacility) collectiveFacilitiesForReconstruction);
    }

    public T apply(CollectiveFacilitiesForReconstructionAndRevitalization collectiveFacilitiesForReconstructionAndRevitalization) {
        return apply((UrbanFacility) collectiveFacilitiesForReconstructionAndRevitalization);
    }

    public T apply(CollectiveFacilitiesForTsunamiDisasterPrevention collectiveFacilitiesForTsunamiDisasterPrevention) {
        return apply((UrbanFacility) collectiveFacilitiesForTsunamiDisasterPrevention);
    }

    public T apply(CollectiveGovernmentAndPublicOfficeFacilities collectiveGovernmentAndPublicOfficeFacilities) {
        return apply((UrbanFacility) collectiveGovernmentAndPublicOfficeFacilities);
    }

    public T apply(CollectiveHousingFacilities collectiveHousingFacilities) {
        return apply((UrbanFacility) collectiveHousingFacilities);
    }

    public T apply(CollectiveUrbanDisasterPreventionFacilities collectiveUrbanDisasterPreventionFacilities) {
        return apply((UrbanFacility) collectiveUrbanDisasterPreventionFacilities);
    }

    public T apply(ConservationZoneForClustersOfTraditionalStructures conservationZoneForClustersOfTraditionalStructures) {
        return apply((DistrictsAndZones) conservationZoneForClustersOfTraditionalStructures);
    }

    public T apply(DID dID) {
        return apply((UrbanFunction) dID);
    }

    public T apply(DevelopmentProject developmentProject) {
        return apply((UrbanFunction) developmentProject);
    }

    public T apply(DisasterDamage disasterDamage) {
        return apply((UrbanFunction) disasterDamage);
    }

    public T apply(DisasterPreventionBase disasterPreventionBase) {
        return apply((UrbanFunction) disasterPreventionBase);
    }

    public T apply(UrbanDevelopmentProject urbanDevelopmentProject) {
        return apply((Zone) urbanDevelopmentProject);
    }

    public T apply(DisasterPreventionBlockImprovementProject disasterPreventionBlockImprovementProject) {
        return apply((UrbanDevelopmentProject) disasterPreventionBlockImprovementProject);
    }

    public T apply(AbstractDistrictPlan abstractDistrictPlan) {
        T object = apply((Zone) abstractDistrictPlan);
        if (object != null)
            return object;

        for (DistrictDevelopmentPlanProperty property : new ArrayList<>(abstractDistrictPlan.getDistrictDevelopmentPlan())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        for (PromotionDistrictProperty property : new ArrayList<>(abstractDistrictPlan.getPromotionDistrict())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(DisasterPreventionBlockImprovementZonePlan disasterPreventionBlockImprovementZonePlan) {
        T object = apply((AbstractDistrictPlan) disasterPreventionBlockImprovementZonePlan);
        if (object != null)
            return object;

        for (ZonalDisasterPreventionFacilityProperty property : new ArrayList<>(disasterPreventionBlockImprovementZonePlan.getZonalDisasterPreventionFacilities())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(DistributionBusinessPark distributionBusinessPark) {
        return apply((UrbanFacility) distributionBusinessPark);
    }

    public T apply(DistributionBusinessZone distributionBusinessZone) {
        return apply((DistrictsAndZones) distributionBusinessZone);
    }

    public T apply(DistributionOfFloraAndFauna distributionOfFloraAndFauna) {
        return apply((UrbanFunction) distributionOfFloraAndFauna);
    }

    public T apply(District district) {
        return apply((Zone) district);
    }

    public T apply(DistrictDevelopmentPlan districtDevelopmentPlan) {
        T object = apply((Zone) districtDevelopmentPlan);
        if (object != null)
            return object;

        for (DistrictFacilityProperty property : new ArrayList<>(districtDevelopmentPlan.getDistrictFacility())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        for (DistrictProperty property : new ArrayList<>(districtDevelopmentPlan.getDistrict())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(DistrictFacility districtFacility) {
        return apply((Zone) districtFacility);
    }

    public T apply(DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlan districtImprovementPlanForDisasterPreventionBlockImprovementZonePlan) {
        return apply((DistrictDevelopmentPlan) districtImprovementPlanForDisasterPreventionBlockImprovementZonePlan);
    }

    public T apply(DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict districtImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict) {
        return apply((DistrictDevelopmentPlan) districtImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrict);
    }

    public T apply(DistrictPlan districtPlan) {
        return apply((AbstractDistrictPlan) districtPlan);
    }

    public T apply(EducationalAndCulturalFacility educationalAndCulturalFacility) {
        return apply((UrbanFacility) educationalAndCulturalFacility);
    }

    public T apply(ExceptionalFloorAreaRateDistrict exceptionalFloorAreaRateDistrict) {
        return apply((DistrictsAndZones) exceptionalFloorAreaRateDistrict);
    }

    public T apply(FirePreventionDistrict firePreventionDistrict) {
        return apply((DistrictsAndZones) firePreventionDistrict);
    }

    public T apply(UrbanFacilityStipulatedByCabinetOrder urbanFacilityStipulatedByCabinetOrder) {
        return apply((UrbanFacility) urbanFacilityStipulatedByCabinetOrder);
    }

    public T apply(FireProtectionFacility fireProtectionFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) fireProtectionFacility);
    }

    public T apply(FloodPreventionFacility floodPreventionFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) floodPreventionFacility);
    }

    public T apply(GlobalHubCityDevelopmentProject globalHubCityDevelopmentProject) {
        return apply((Zone) globalHubCityDevelopmentProject);
    }

    public T apply(GreenSpace greenSpace) {
        return apply((UrbanFunction) greenSpace);
    }

    public T apply(GreenSpaceConservationDistrict greenSpaceConservationDistrict) {
        return apply((DistrictsAndZones) greenSpaceConservationDistrict);
    }

    public T apply(HeightControlDistrict heightControlDistrict) {
        return apply((DistrictsAndZones) heightControlDistrict);
    }

    public T apply(HighLevelUseDistrict highLevelUseDistrict) {
        return apply((DistrictsAndZones) highLevelUseDistrict);
    }

    public T apply(HighRiseResidentialAttractionDistrict highRiseResidentialAttractionDistrict) {
        return apply((DistrictsAndZones) highRiseResidentialAttractionDistrict);
    }

    public T apply(HistoricSceneryMaintenanceAndImprovementDistrictPlan historicSceneryMaintenanceAndImprovementDistrictPlan) {
        return apply((AbstractDistrictPlan) historicSceneryMaintenanceAndImprovementDistrictPlan);
    }

    public T apply(HousingControlArea housingControlArea) {
        return apply((DistrictsAndZones) housingControlArea);
    }

    public T apply(HubCity hubCity) {
        return apply((UrbanFunction) hubCity);
    }

    public T apply(IndustrialParkDevelopmentProject industrialParkDevelopmentProject) {
        return apply((UrbanDevelopmentProject) industrialParkDevelopmentProject);
    }

    public T apply(org.citygml4j.ade.iur.model.urf.LandPrice landPrice) {
        return apply((UrbanFunction) landPrice);
    }

    public T apply(LandReadjustmentProject landReadjustmentProject) {
        return apply((UrbanDevelopmentProject) landReadjustmentProject);
    }

    public T apply(ProjectPromotionArea projectPromotionArea) {
        return apply((Zone) projectPromotionArea);
    }

    public T apply(LandReadjustmentPromotionArea landReadjustmentPromotionArea) {
        return apply((ProjectPromotionArea) landReadjustmentPromotionArea);
    }

    public T apply(LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment landReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment) {
        return apply((ProjectPromotionArea) landReadjustmentPromotionAreasForCoreBusinessUrbanDevelopment);
    }

    public T apply(org.citygml4j.ade.iur.model.urf.LandUseDiversion landUseDiversion) {
        return apply((UrbanFunction) landUseDiversion);
    }

    public T apply(LandscapeZone landscapeZone) {
        return apply((DistrictsAndZones) landscapeZone);
    }

    public T apply(MarketsSlaughterhousesCrematoria marketsSlaughterhousesCrematoria) {
        return apply((UrbanFacility) marketsSlaughterhousesCrematoria);
    }

    public T apply(MedicalFacility medicalFacility) {
        return apply((UrbanFacility) medicalFacility);
    }

    public T apply(NaturalConditions naturalConditions) {
        return apply((UrbanFunction) naturalConditions);
    }

    public T apply(NewHousing newHousing) {
        return apply((UrbanFunction) newHousing);
    }

    public T apply(NewHousingAndUrbanDevelopmentProject newHousingAndUrbanDevelopmentProject) {
        return apply((UrbanDevelopmentProject) newHousingAndUrbanDevelopmentProject);
    }

    public T apply(NewUrbanInfrastructureProject newUrbanInfrastructureProject) {
        return apply((UrbanDevelopmentProject) newUrbanInfrastructureProject);
    }

    public T apply(OpenSpaceForPublicUse openSpaceForPublicUse) {
        return apply((UrbanFacility) openSpaceForPublicUse);
    }

    public T apply(ParkingPlaceDevelopmentZone parkingPlaceDevelopmentZone) {
        return apply((DistrictsAndZones) parkingPlaceDevelopmentZone);
    }

    public T apply(Pollution pollution) {
        T object = apply((UrbanFunction) pollution);
        if (object != null)
            return object;

        if (pollution.getObservationPoint() != null && pollution.getObservationPoint().getObject() != null && pollution.getObservationPoint().getObject().getLod0MultiPoint() != null) {
            object = walker.apply(pollution.getObservationPoint().getObject().getLod0MultiPoint());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(PortZone portZone) {
        return apply((DistrictsAndZones) portZone);
    }

    public T apply(PrivateUrbanRenewalProjectPlan privateUrbanRenewalProjectPlan) {
        return apply((Zone) privateUrbanRenewalProjectPlan);
    }

    public T apply(ProductiveGreenZone productiveGreenZone) {
        return apply((DistrictsAndZones) productiveGreenZone);
    }

    public T apply(PromotionDistrict promotionDistrict) {
        return apply((Zone) promotionDistrict);
    }

    public T apply(PublicTransitFacility publicTransitFacility) {
        return apply((UrbanFunction) publicTransitFacility);
    }

    public T apply(QuasiUrbanPlanningArea quasiUrbanPlanningArea) {
        return apply((Zone) quasiUrbanPlanningArea);
    }

    public T apply(Recreations recreations) {
        return apply((UrbanFunction) recreations);
    }

    public T apply(Regulation regulation) {
        return apply((Zone) regulation);
    }

    public T apply(ResidenceAttractionArea residenceAttractionArea) {
        return apply((Zone) residenceAttractionArea);
    }

    public T apply(ResidentialBlockConstructionProject residentialBlockConstructionProject) {
        return apply((UrbanDevelopmentProject) residentialBlockConstructionProject);
    }

    public T apply(ResidentialBlockConstructionPromotionArea residentialBlockConstructionPromotionArea) {
        return apply((ProjectPromotionArea) residentialBlockConstructionPromotionArea);
    }

    public T apply(ResidentialEnvironmentImprovementDistrict residentialEnvironmentImprovementDistrict) {
        return apply((DistrictsAndZones) residentialEnvironmentImprovementDistrict);
    }

    public T apply(RoadsideDistrictFacility roadsideDistrictFacility) {
        return apply((DistrictFacility) roadsideDistrictFacility);
    }

    public T apply(RoadsideDistrictImprovementPlan roadsideDistrictImprovementPlan) {
        return apply((DistrictDevelopmentPlan) roadsideDistrictImprovementPlan);
    }

    public T apply(RoadsideDistrictPlan roadsideDistrictPlan) {
        return apply((AbstractDistrictPlan) roadsideDistrictPlan);
    }

    public T apply(RuralDistrictFacility ruralDistrictFacility) {
        return apply((DistrictFacility) ruralDistrictFacility);
    }

    public T apply(RuralDistrictImprovementPlan ruralDistrictImprovementPlan) {
        return apply((DistrictDevelopmentPlan) ruralDistrictImprovementPlan);
    }

    public T apply(RuralDistrictPlan ruralDistrictPlan) {
        return apply((AbstractDistrictPlan) ruralDistrictPlan);
    }

    public T apply(SandControlFacility sandControlFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) sandControlFacility);
    }

    public T apply(ScenicDistrict scenicDistrict) {
        return apply((DistrictsAndZones) scenicDistrict);
    }

    public T apply(ScenicResource scenicResource) {
        return apply((UrbanFunction) scenicResource);
    }

    public T apply(ScheduledAreaForUrbanDevelopmentProject scheduledAreaForUrbanDevelopmentProject) {
        return apply((Zone) scheduledAreaForUrbanDevelopmentProject);
    }

    public T apply(ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities scheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForCollectiveGovernmentAndPublicOfficeFacilities);
    }

    public T apply(ScheduledAreaForCollectiveHousingFacilities scheduledAreaForCollectiveHousingFacilities) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForCollectiveHousingFacilities);
    }

    public T apply(ScheduledAreaForDistributionBusinessPark scheduledAreaForDistributionBusinessPark) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForDistributionBusinessPark);
    }

    public T apply(ScheduledAreaForIndustrialParkDevelopmentProjects scheduledAreaForIndustrialParkDevelopmentProjects) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForIndustrialParkDevelopmentProjects);
    }

    public T apply(ScheduledAreaForNewHousingAndUrbanDevelopmentProjects scheduledAreaForNewHousingAndUrbanDevelopmentProjects) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForNewHousingAndUrbanDevelopmentProjects);
    }

    public T apply(ScheduledAreaForNewUrbanInfrastructureProjects scheduledAreaForNewUrbanInfrastructureProjects) {
        return apply((ScheduledAreaForUrbanDevelopmentProject) scheduledAreaForNewUrbanInfrastructureProjects);
    }

    public T apply(SedimentDisasterProneArea sedimentDisasterProneArea) {
        return apply((Zone) sedimentDisasterProneArea);
    }

    public T apply(SnowProtectionFacility snowProtectionFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) snowProtectionFacility);
    }

    public T apply(SocialWelfareFacility socialWelfareFacility) {
        return apply((UrbanFacility) socialWelfareFacility);
    }

    public T apply(SpecialGreenSpaceConservationDistrict specialGreenSpaceConservationDistrict) {
        return apply((DistrictsAndZones) specialGreenSpaceConservationDistrict);
    }

    public T apply(SpecialUrbanRenaissanceDistrict specialUrbanRenaissanceDistrict) {
        return apply((DistrictsAndZones) specialUrbanRenaissanceDistrict);
    }

    public T apply(SpecialUseAttractionDistrict specialUseAttractionDistrict) {
        return apply((DistrictsAndZones) specialUseAttractionDistrict);
    }

    public T apply(SpecialUseDistrict specialUseDistrict) {
        return apply((DistrictsAndZones) specialUseDistrict);
    }

    public T apply(SpecialUseRestrictionDistrict specialUseRestrictionDistrict) {
        return apply((DistrictsAndZones) specialUseRestrictionDistrict);
    }

    public T apply(SpecialZoneForPreservationOfHistoricalLandscape specialZoneForPreservationOfHistoricalLandscape) {
        return apply((DistrictsAndZones) specialZoneForPreservationOfHistoricalLandscape);
    }

    public T apply(SpecifiedBlock specifiedBlock) {
        return apply((DistrictsAndZones) specifiedBlock);
    }

    public T apply(SpecifiedBuildingZoneImprovementPlan specifiedBuildingZoneImprovementPlan) {
        return apply((DistrictDevelopmentPlan) specifiedBuildingZoneImprovementPlan);
    }

    public T apply(SpecifiedDisasterPreventionBlockImprovementZone specifiedDisasterPreventionBlockImprovementZone) {
        return apply((DistrictsAndZones) specifiedDisasterPreventionBlockImprovementZone);
    }

    public T apply(UrgentUrbanRenewalArea urgentUrbanRenewalArea) {
        T object = apply((Zone) urgentUrbanRenewalArea);
        if (object != null)
            return object;

        for (PrivateUrbanRenewalProjectPlanProperty property : new ArrayList<>(urgentUrbanRenewalArea.getPrivateProject())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        for (SpecifiedUrgentUrbanRenewalAreaProperty property : new ArrayList<>(urgentUrbanRenewalArea.getSpecifiedArea())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        for (SpecialUrbanRenaissanceDistrictProperty property : new ArrayList<>(urgentUrbanRenewalArea.getSpecialDistrict())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(SpecifiedUrgentUrbanRenewalArea specifiedUrgentUrbanRenewalArea) {
        T object = apply((UrgentUrbanRenewalArea) specifiedUrgentUrbanRenewalArea);
        if (object != null)
            return object;

        for (GlobalHubCityDevelopmentProjectProperty property : new ArrayList<>(specifiedUrgentUrbanRenewalArea.getDevelopmentProject())) {
            object = walker.apply((FeatureProperty<?>) property);
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(SupplyFacility supplyFacility) {
        return apply((UrbanFacility) supplyFacility);
    }

    public T apply(Target target) {
        T object = walker.apply((AbstractFeature) target);
        if (object != null)
            return object;

        return null;
    }

    public T apply(TelecommunicationFacility telecommunicationFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) telecommunicationFacility);
    }

    public T apply(ThreeDimensionalExtent threeDimensionalExtent) {
        return apply((UrbanFunction) threeDimensionalExtent);
    }

    public T apply(TideFacility tideFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) tideFacility);
    }

    public T apply(TrafficFacility trafficFacility) {
        return apply((UrbanFacility) trafficFacility);
    }

    public T apply(TreatmentFacility treatmentFacility) {
        return apply((UrbanFacility) treatmentFacility);
    }

    public T apply(TreePlantingDistrict treePlantingDistrict) {
        return apply((DistrictsAndZones) treePlantingDistrict);
    }

    public T apply(UnclassifiedBlankArea unclassifiedBlankArea) {
        return apply((Zone) unclassifiedBlankArea);
    }

    public T apply(UnclassifiedUseDistrict unclassifiedUseDistrict) {
        return apply((Zone) unclassifiedUseDistrict);
    }

    public T apply(UnusedLandUsePromotionArea unusedLandUsePromotionArea) {
        return apply((Zone) unusedLandUsePromotionArea);
    }

    public T apply(UrbanDisasterRecoveryPromotionArea urbanDisasterRecoveryPromotionArea) {
        return apply((Zone) urbanDisasterRecoveryPromotionArea);
    }

    public T apply(UrbanFacilityStatus urbanFacilityStatus) {
        return apply((UrbanFunction) urbanFacilityStatus);
    }

    public T apply(UrbanFunctionAttractionArea urbanFunctionAttractionArea) {
        return apply((Zone) urbanFunctionAttractionArea);
    }

    public T apply(UrbanPlanningArea urbanPlanningArea) {
        return apply((Zone) urbanPlanningArea);
    }

    public T apply(UrbanRedevelopmentProject urbanRedevelopmentProject) {
        return apply((UrbanDevelopmentProject) urbanRedevelopmentProject);
    }

    public T apply(UrbanRedevelopmentPromotionArea urbanRedevelopmentPromotionArea) {
        return apply((ProjectPromotionArea) urbanRedevelopmentPromotionArea);
    }

    public T apply(UrbanRenewalProject urbanRenewalProject) {
        return apply((UrbanDevelopmentProject) urbanRenewalProject);
    }

    public T apply(Urbanization urbanization) {
        return apply((UrbanFunction) urbanization);
    }

    public T apply(UseDistrict useDistrict) {
        return apply((DistrictsAndZones) useDistrict);
    }

    public T apply(Waterway waterway) {
        return apply((UrbanFacility) waterway);
    }

    public T apply(WeatherObservation weatherObservation) {
        return apply((UrbanFunction) weatherObservation);
    }

    public T apply(WindProtectionFacility windProtectionFacility) {
        return apply((UrbanFacilityStipulatedByCabinetOrder) windProtectionFacility);
    }

    public T apply(ZonalDisasterPreventionFacility zonalDisasterPreventionFacility) {
        return apply((Zone) zonalDisasterPreventionFacility);
    }

    public T apply(ZoneForPreservationOfHistoricalLandscape zoneForPreservationOfHistoricalLandscape) {
        return apply((DistrictsAndZones) zoneForPreservationOfHistoricalLandscape);
    }

    public T apply(StatisticalGrid statisticalGrid) {
        T object = walker.apply((AbstractCityObject) statisticalGrid);
        if (object != null)
            return object;

        if (statisticalGrid.getLodMinus1MultiSurface() != null) {
            object = walker.apply(statisticalGrid.getLodMinus1MultiSurface());
            if (object != null)
                return object;
        }

        if (statisticalGrid.getLodMinus2MultiSurface() != null) {
            object = walker.apply(statisticalGrid.getLodMinus2MultiSurface());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Population population) {
        return apply((StatisticalGrid) population);
    }

    public T apply(PublicTransitAccessibility publicTransitAccessibility) {
        return apply((StatisticalGrid) publicTransitAccessibility);
    }

    public T apply(org.citygml4j.ade.iur.model.urg.LandPrice landPrice) {
        return apply((StatisticalGrid) landPrice);
    }

    public T apply(org.citygml4j.ade.iur.model.urg.LandUseDiversion landUseDiversion) {
        return apply((StatisticalGrid) landUseDiversion);
    }

    public T apply(Households households) {
        return apply((StatisticalGrid) households);
    }

    public T apply(OfficesAndEmployees officesAndEmployees) {
        return apply((StatisticalGrid) officesAndEmployees);
    }

    public T apply(GenericGridCell genericGridCell) {
        return apply((StatisticalGrid) genericGridCell);
    }

    public T apply(StatusOfSiteSeeing statusOfSiteSeeing) {
        return apply((StatisticalGrid) statusOfSiteSeeing);
    }

    public T apply(LandslideDisaster landslideDisaster) {
        return apply((StatisticalGrid) landslideDisaster);
    }

    public T apply(PublicTransit publicTransit) {
        T object = walker.apply((AbstractCityObject) publicTransit);
        if (object != null)
            return object;

        return null;
    }

    public T apply(Route route) {
        T object = apply((PublicTransit) route);
        if (object != null)
            return object;

        if (route.getAgency() != null) {
            object = walker.apply((FeatureProperty<?>) route.getAgency());
            if (object != null)
                return object;
        }

        if (route.getParentRoute() != null) {
            object = walker.apply((FeatureProperty<?>) route.getParentRoute());
            if (object != null)
                return object;
        }

        if (route.getLod0MultiCurve() != null) {
            object = walker.apply(route.getLod0MultiCurve());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Agency agency) {
        return apply((PublicTransit) agency);
    }

    public T apply(Stop stop) {
        T object = apply((PublicTransit) stop);
        if (object != null)
            return object;

        if (stop.getPoint() != null) {
            object = walker.apply(stop.getPoint());
            if (object != null)
                return object;
        }

        if (stop.getParentStation() != null) {
            object = walker.apply((FeatureProperty<?>) stop.getParentStation());
            if (object != null)
                return object;
        }

        if (stop.getLevel() != null) {
            object = walker.apply((FeatureProperty<?>) stop.getLevel());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Level level) {
        return apply((PublicTransit) level);
    }

    public T apply(Trip trip) {
        T object = apply((PublicTransit) trip);
        if (object != null)
            return object;

        if (trip.getRoute() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getRoute());
            if (object != null)
                return object;
        }

        if (trip.getCalendar() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getCalendar());
            if (object != null)
                return object;
        }

        if (trip.getCalendarDate() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getCalendarDate());
            if (object != null)
                return object;
        }

        if (trip.getOffice() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getOffice());
            if (object != null)
                return object;
        }

        if (trip.getShape() != null) {
            object = walker.apply((FeatureProperty<?>) trip.getShape());
            if (object != null)
                return object;
        }

        if (trip.getLod0MultiCurve() != null) {
            object = walker.apply(trip.getLod0MultiCurve());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Shape shape) {
        T object = apply((PublicTransit) shape);
        if (object != null)
            return object;

        for (PointProperty property : new ArrayList<>(shape.getPoint()))
            if (property.getObject() != null && property.getObject().getPoint() != null) {
            object = walker.apply(property.getObject().getPoint());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Office office) {
        return apply((PublicTransit) office);
    }

    public T apply(Calendar calendar) {
        return apply((PublicTransit) calendar);
    }

    public T apply(CalendarDate calendarDate) {
        T object = apply((PublicTransit) calendarDate);
        if (object != null)
            return object;

        if (calendarDate.getCalendar() != null) {
            object = walker.apply((FeatureProperty<?>) calendarDate.getCalendar());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(FareAttribute fareAttribute) {
        T object = apply((PublicTransit) fareAttribute);
        if (object != null)
            return object;

        if (fareAttribute.getAgency() != null) {
            object = walker.apply((FeatureProperty<?>) fareAttribute.getAgency());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Pathway pathway) {
        T object = apply((PublicTransit) pathway);
        if (object != null)
            return object;

        if (pathway.getFrom() != null) {
            object = walker.apply((FeatureProperty<?>) pathway.getFrom());
            if (object != null)
                return object;
        }

        if (pathway.getTo() != null) {
            object = walker.apply((FeatureProperty<?>) pathway.getTo());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(TranslationJP translationJP) {
        return apply((PublicTransit) translationJP);
    }

    public T apply(Attribution attribution) {
        T object = apply((PublicTransit) attribution);
        if (object != null)
            return object;

        if (attribution.getAgency() != null) {
            object = walker.apply((FeatureProperty<?>) attribution.getAgency());
            if (object != null)
                return object;
        }

        if (attribution.getRoute() != null) {
            object = walker.apply((FeatureProperty<?>) attribution.getRoute());
            if (object != null)
                return object;
        }

        if (attribution.getTrip() != null) {
            object = walker.apply((FeatureProperty<?>) attribution.getTrip());
            if (object != null)
                return object;
        }

        return null;
    }

    public T apply(Translation translation) {
        if (translation.getRecordId() != null)
            return walker.apply((FeatureProperty<?>) translation.getRecordId());

        return null;
    }

    public T apply(Transfer transfer) {
        if (transfer.getFrom() != null) {
            T object = walker.apply((FeatureProperty<?>) transfer.getFrom());
            if (object != null)
                return object;
        }

        if (transfer.getTo() != null)
            return walker.apply((FeatureProperty<?>) transfer.getTo());

        return null;
    }

    public T apply(Frequency frequency) {
        if (frequency.getTrip() != null)
            return walker.apply((FeatureProperty<?>) frequency.getTrip());

        return null;
    }

    public T apply(StopTime stopTime) {
        if (stopTime.getTrip() != null) {
            T object = walker.apply((FeatureProperty<?>) stopTime.getTrip());
            if (object != null)
                return object;
        }

        if (stopTime.getStop() != null)
            return walker.apply((FeatureProperty<?>) stopTime.getStop());

        return null;
    }

    public T apply(FareRule fareRule) {
        if (fareRule.getFare() != null) {
            T object = walker.apply((FeatureProperty<?>) fareRule.getFare());
            if (object != null)
                return object;
        }

        if (fareRule.getRoute() != null)
            return walker.apply((FeatureProperty<?>) fareRule.getRoute());

        return null;
    }

    public T apply(DataTypePropertyElement property) {
        return property.isSetValue() && property.getValue().getObject() != null ?
                walker.apply(property.getValue().getObject()) :
                null;
    }
}
