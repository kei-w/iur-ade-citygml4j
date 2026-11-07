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

public class UseDistrict extends DistrictsAndZones {
    private Integer floorAreaRate;
    private Measure minimumSiteArea;
    private Integer buildingCoverageRate;
    private StringOrRef wallSetbackDistance;
    private Length buildingHeightLimits;
    private StringOrRef buildingRestrictions;
    private StringOrRef otherRestrictions;
    private StringOrRef setbackRestrictions;
    private StringOrRef frontRoadRestrictions;
    private StringOrRef adjacentLandRestrictions;
    private StringOrRef northDirectionRestrictions;
    private StringOrRef shadeRegulation;

    public Integer getFloorAreaRate() {
        return floorAreaRate;
    }

    public void setFloorAreaRate(Integer floorAreaRate) {
        this.floorAreaRate = floorAreaRate;
    }

    public Measure getMinimumSiteArea() {
        return minimumSiteArea;
    }

    public void setMinimumSiteArea(Measure minimumSiteArea) {
        this.minimumSiteArea = ModelObjects.setParent(minimumSiteArea, this);
    }

    public Integer getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    public void setBuildingCoverageRate(Integer buildingCoverageRate) {
        this.buildingCoverageRate = buildingCoverageRate;
    }

    public StringOrRef getWallSetbackDistance() {
        return wallSetbackDistance;
    }

    public void setWallSetbackDistance(StringOrRef wallSetbackDistance) {
        this.wallSetbackDistance = ModelObjects.setParent(wallSetbackDistance, this);
    }

    public Length getBuildingHeightLimits() {
        return buildingHeightLimits;
    }

    public void setBuildingHeightLimits(Length buildingHeightLimits) {
        this.buildingHeightLimits = ModelObjects.setParent(buildingHeightLimits, this);
    }

    public StringOrRef getBuildingRestrictions() {
        return buildingRestrictions;
    }

    public void setBuildingRestrictions(StringOrRef buildingRestrictions) {
        this.buildingRestrictions = ModelObjects.setParent(buildingRestrictions, this);
    }

    public StringOrRef getOtherRestrictions() {
        return otherRestrictions;
    }

    public void setOtherRestrictions(StringOrRef otherRestrictions) {
        this.otherRestrictions = ModelObjects.setParent(otherRestrictions, this);
    }

    public StringOrRef getSetbackRestrictions() {
        return setbackRestrictions;
    }

    public void setSetbackRestrictions(StringOrRef setbackRestrictions) {
        this.setbackRestrictions = ModelObjects.setParent(setbackRestrictions, this);
    }

    public StringOrRef getFrontRoadRestrictions() {
        return frontRoadRestrictions;
    }

    public void setFrontRoadRestrictions(StringOrRef frontRoadRestrictions) {
        this.frontRoadRestrictions = ModelObjects.setParent(frontRoadRestrictions, this);
    }

    public StringOrRef getAdjacentLandRestrictions() {
        return adjacentLandRestrictions;
    }

    public void setAdjacentLandRestrictions(StringOrRef adjacentLandRestrictions) {
        this.adjacentLandRestrictions = ModelObjects.setParent(adjacentLandRestrictions, this);
    }

    public StringOrRef getNorthDirectionRestrictions() {
        return northDirectionRestrictions;
    }

    public void setNorthDirectionRestrictions(StringOrRef northDirectionRestrictions) {
        this.northDirectionRestrictions = ModelObjects.setParent(northDirectionRestrictions, this);
    }

    public StringOrRef getShadeRegulation() {
        return shadeRegulation;
    }

    public void setShadeRegulation(StringOrRef shadeRegulation) {
        this.shadeRegulation = ModelObjects.setParent(shadeRegulation, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UseDistrict copy = target == null ? new UseDistrict() : (UseDistrict) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UseDistrict(), copyBuilder);
    }
}
