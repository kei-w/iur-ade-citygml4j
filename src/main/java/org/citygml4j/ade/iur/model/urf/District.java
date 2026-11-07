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
import org.citygml4j.model.gml.base.StringOrRef;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

public class District extends Zone {
    private StringOrRef buildingRestrictions;
    private StringOrRef useRestrictions;
    private Double maximumFloorAreaRate;
    private Double minimumFloorAreaRate;
    private Double maximumBuildingCoverageRate;
    private Double minimumBuildingCoverageRate;
    private Measure minimumSiteArea;
    private Measure minimumBuildingArea;
    private Length minimumGroundHeight;
    private StringOrRef setbackSize;
    private StringOrRef strucuturePlacementRestrictions;
    private Length maximumBuildingHeight;
    private Length minimumBuildingHeight;
    private Length minimumFloorHeight;
    private StringOrRef buildingDesignRestriction;
    private Double minimumGreeningRate;
    private StringOrRef fenceGuideline;
    private StringOrRef restrictionsForFireProtection;
    private StringOrRef restrictionsForNoiseProtection;
    private Double minimumFrontageRate;

    public StringOrRef getBuildingRestrictions() {
        return buildingRestrictions;
    }

    public void setBuildingRestrictions(StringOrRef buildingRestrictions) {
        this.buildingRestrictions = ModelObjects.setParent(buildingRestrictions, this);
    }

    public StringOrRef getUseRestrictions() {
        return useRestrictions;
    }

    public void setUseRestrictions(StringOrRef useRestrictions) {
        this.useRestrictions = ModelObjects.setParent(useRestrictions, this);
    }

    public Double getMaximumFloorAreaRate() {
        return maximumFloorAreaRate;
    }

    public void setMaximumFloorAreaRate(Double maximumFloorAreaRate) {
        this.maximumFloorAreaRate = maximumFloorAreaRate;
    }

    public Double getMinimumFloorAreaRate() {
        return minimumFloorAreaRate;
    }

    public void setMinimumFloorAreaRate(Double minimumFloorAreaRate) {
        this.minimumFloorAreaRate = minimumFloorAreaRate;
    }

    public Double getMaximumBuildingCoverageRate() {
        return maximumBuildingCoverageRate;
    }

    public void setMaximumBuildingCoverageRate(Double maximumBuildingCoverageRate) {
        this.maximumBuildingCoverageRate = maximumBuildingCoverageRate;
    }

    public Double getMinimumBuildingCoverageRate() {
        return minimumBuildingCoverageRate;
    }

    public void setMinimumBuildingCoverageRate(Double minimumBuildingCoverageRate) {
        this.minimumBuildingCoverageRate = minimumBuildingCoverageRate;
    }

    public Measure getMinimumSiteArea() {
        return minimumSiteArea;
    }

    public void setMinimumSiteArea(Measure minimumSiteArea) {
        this.minimumSiteArea = ModelObjects.setParent(minimumSiteArea, this);
    }

    public Measure getMinimumBuildingArea() {
        return minimumBuildingArea;
    }

    public void setMinimumBuildingArea(Measure minimumBuildingArea) {
        this.minimumBuildingArea = ModelObjects.setParent(minimumBuildingArea, this);
    }

    public Length getMinimumGroundHeight() {
        return minimumGroundHeight;
    }

    public void setMinimumGroundHeight(Length minimumGroundHeight) {
        this.minimumGroundHeight = ModelObjects.setParent(minimumGroundHeight, this);
    }

    public StringOrRef getSetbackSize() {
        return setbackSize;
    }

    public void setSetbackSize(StringOrRef setbackSize) {
        this.setbackSize = ModelObjects.setParent(setbackSize, this);
    }

    public StringOrRef getStrucuturePlacementRestrictions() {
        return strucuturePlacementRestrictions;
    }

    public void setStrucuturePlacementRestrictions(StringOrRef strucuturePlacementRestrictions) {
        this.strucuturePlacementRestrictions = ModelObjects.setParent(strucuturePlacementRestrictions, this);
    }

    public Length getMaximumBuildingHeight() {
        return maximumBuildingHeight;
    }

    public void setMaximumBuildingHeight(Length maximumBuildingHeight) {
        this.maximumBuildingHeight = ModelObjects.setParent(maximumBuildingHeight, this);
    }

    public Length getMinimumBuildingHeight() {
        return minimumBuildingHeight;
    }

    public void setMinimumBuildingHeight(Length minimumBuildingHeight) {
        this.minimumBuildingHeight = ModelObjects.setParent(minimumBuildingHeight, this);
    }

    public Length getMinimumFloorHeight() {
        return minimumFloorHeight;
    }

    public void setMinimumFloorHeight(Length minimumFloorHeight) {
        this.minimumFloorHeight = ModelObjects.setParent(minimumFloorHeight, this);
    }

    public StringOrRef getBuildingDesignRestriction() {
        return buildingDesignRestriction;
    }

    public void setBuildingDesignRestriction(StringOrRef buildingDesignRestriction) {
        this.buildingDesignRestriction = ModelObjects.setParent(buildingDesignRestriction, this);
    }

    public Double getMinimumGreeningRate() {
        return minimumGreeningRate;
    }

    public void setMinimumGreeningRate(Double minimumGreeningRate) {
        this.minimumGreeningRate = minimumGreeningRate;
    }

    public StringOrRef getFenceGuideline() {
        return fenceGuideline;
    }

    public void setFenceGuideline(StringOrRef fenceGuideline) {
        this.fenceGuideline = ModelObjects.setParent(fenceGuideline, this);
    }

    public StringOrRef getRestrictionsForFireProtection() {
        return restrictionsForFireProtection;
    }

    public void setRestrictionsForFireProtection(StringOrRef restrictionsForFireProtection) {
        this.restrictionsForFireProtection = ModelObjects.setParent(restrictionsForFireProtection, this);
    }

    public StringOrRef getRestrictionsForNoiseProtection() {
        return restrictionsForNoiseProtection;
    }

    public void setRestrictionsForNoiseProtection(StringOrRef restrictionsForNoiseProtection) {
        this.restrictionsForNoiseProtection = ModelObjects.setParent(restrictionsForNoiseProtection, this);
    }

    public Double getMinimumFrontageRate() {
        return minimumFrontageRate;
    }

    public void setMinimumFrontageRate(Double minimumFrontageRate) {
        this.minimumFrontageRate = minimumFrontageRate;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        District copy = target == null ? new District() : (District) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new District(), copyBuilder);
    }
}
