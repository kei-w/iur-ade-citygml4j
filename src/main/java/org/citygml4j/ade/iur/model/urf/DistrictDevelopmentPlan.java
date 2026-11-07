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

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.base.StringOrRef;

import java.util.List;

public class DistrictDevelopmentPlan extends Zone {
    private StringOrRef districtFacilitiesAllocation;
    private StringOrRef buildingRestrictions;
    private StringOrRef urbanGreenSpaceConservation;
    private StringOrRef activityRestrictionInFarmland;
    private StringOrRef landuseRestrictions;
    private List<DistrictFacilityProperty> districtFacility;
    private List<DistrictProperty> district;

    public StringOrRef getDistrictFacilitiesAllocation() {
        return districtFacilitiesAllocation;
    }

    public void setDistrictFacilitiesAllocation(StringOrRef districtFacilitiesAllocation) {
        this.districtFacilitiesAllocation = ModelObjects.setParent(districtFacilitiesAllocation, this);
    }

    public StringOrRef getBuildingRestrictions() {
        return buildingRestrictions;
    }

    public void setBuildingRestrictions(StringOrRef buildingRestrictions) {
        this.buildingRestrictions = ModelObjects.setParent(buildingRestrictions, this);
    }

    public StringOrRef getUrbanGreenSpaceConservation() {
        return urbanGreenSpaceConservation;
    }

    public void setUrbanGreenSpaceConservation(StringOrRef urbanGreenSpaceConservation) {
        this.urbanGreenSpaceConservation = ModelObjects.setParent(urbanGreenSpaceConservation, this);
    }

    public StringOrRef getActivityRestrictionInFarmland() {
        return activityRestrictionInFarmland;
    }

    public void setActivityRestrictionInFarmland(StringOrRef activityRestrictionInFarmland) {
        this.activityRestrictionInFarmland = ModelObjects.setParent(activityRestrictionInFarmland, this);
    }

    public StringOrRef getLanduseRestrictions() {
        return landuseRestrictions;
    }

    public void setLanduseRestrictions(StringOrRef landuseRestrictions) {
        this.landuseRestrictions = ModelObjects.setParent(landuseRestrictions, this);
    }

    public List<DistrictFacilityProperty> getDistrictFacility() {
        if (districtFacility == null)
            districtFacility = new ChildList<>(this);

        return districtFacility;
    }

    public void setDistrictFacility(List<DistrictFacilityProperty> districtFacility) {
        this.districtFacility = ModelObjects.setParent(districtFacility, this);
    }

    public List<DistrictProperty> getDistrict() {
        if (district == null)
            district = new ChildList<>(this);

        return district;
    }

    public void setDistrict(List<DistrictProperty> district) {
        this.district = ModelObjects.setParent(district, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DistrictDevelopmentPlan copy = target == null ? new DistrictDevelopmentPlan() : (DistrictDevelopmentPlan) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, DistrictDevelopmentPlan.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DistrictDevelopmentPlan(), copyBuilder);
    }
}
