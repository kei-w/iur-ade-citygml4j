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

package org.citygml4j.ade.iur.model.uro;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.Year;

public class IfcPsetBuildingCommon extends IfcAttribute {
    private String buildingId;
    private Boolean isPermanentId;
    private String mainFireUse;
    private String ancillaryFireUse;
    private Boolean sprinklerProtection;
    private Boolean sprinklerProtectionAutomatic;
    private Code occupancyType;
    private Measure grossPlannedArea;
    private Integer numberOfStoreys;
    private Year yearOfConstruction;
    private Boolean isLandmarked;

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public Boolean getIsPermanentId() {
        return isPermanentId;
    }

    public void setIsPermanentId(Boolean isPermanentId) {
        this.isPermanentId = isPermanentId;
    }

    public String getMainFireUse() {
        return mainFireUse;
    }

    public void setMainFireUse(String mainFireUse) {
        this.mainFireUse = mainFireUse;
    }

    public String getAncillaryFireUse() {
        return ancillaryFireUse;
    }

    public void setAncillaryFireUse(String ancillaryFireUse) {
        this.ancillaryFireUse = ancillaryFireUse;
    }

    public Boolean getSprinklerProtection() {
        return sprinklerProtection;
    }

    public void setSprinklerProtection(Boolean sprinklerProtection) {
        this.sprinklerProtection = sprinklerProtection;
    }

    public Boolean getSprinklerProtectionAutomatic() {
        return sprinklerProtectionAutomatic;
    }

    public void setSprinklerProtectionAutomatic(Boolean sprinklerProtectionAutomatic) {
        this.sprinklerProtectionAutomatic = sprinklerProtectionAutomatic;
    }

    public Code getOccupancyType() {
        return occupancyType;
    }

    public void setOccupancyType(Code occupancyType) {
        this.occupancyType = ModelObjects.setParent(occupancyType, this);
    }

    public Measure getGrossPlannedArea() {
        return grossPlannedArea;
    }

    public void setGrossPlannedArea(Measure grossPlannedArea) {
        this.grossPlannedArea = ModelObjects.setParent(grossPlannedArea, this);
    }

    public Integer getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(Integer numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    public Year getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Year yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public Boolean getIsLandmarked() {
        return isLandmarked;
    }

    public void setIsLandmarked(Boolean isLandmarked) {
        this.isLandmarked = isLandmarked;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcPsetBuildingCommon copy = target == null ? new IfcPsetBuildingCommon() : (IfcPsetBuildingCommon) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcPsetBuildingCommon(), copyBuilder);
    }
}
