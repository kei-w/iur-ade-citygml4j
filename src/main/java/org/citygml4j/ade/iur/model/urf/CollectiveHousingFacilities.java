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

public class CollectiveHousingFacilities extends UrbanFacility {
    private Double buildingCoverageRate;
    private Double floorAreaRate;
    private Integer numberOfLowRiseHousing;
    private Integer numberOfMiddleRiseHousing;
    private Integer numberOfHighRiseHousing;
    private Integer totalNumberOfHousing;
    private StringOrRef publicFacilitiesAllocationPolicy;
    private String scheduledExecutor;

    public Double getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    public void setBuildingCoverageRate(Double buildingCoverageRate) {
        this.buildingCoverageRate = buildingCoverageRate;
    }

    public Double getFloorAreaRate() {
        return floorAreaRate;
    }

    public void setFloorAreaRate(Double floorAreaRate) {
        this.floorAreaRate = floorAreaRate;
    }

    public Integer getNumberOfLowRiseHousing() {
        return numberOfLowRiseHousing;
    }

    public void setNumberOfLowRiseHousing(Integer numberOfLowRiseHousing) {
        this.numberOfLowRiseHousing = numberOfLowRiseHousing;
    }

    public Integer getNumberOfMiddleRiseHousing() {
        return numberOfMiddleRiseHousing;
    }

    public void setNumberOfMiddleRiseHousing(Integer numberOfMiddleRiseHousing) {
        this.numberOfMiddleRiseHousing = numberOfMiddleRiseHousing;
    }

    public Integer getNumberOfHighRiseHousing() {
        return numberOfHighRiseHousing;
    }

    public void setNumberOfHighRiseHousing(Integer numberOfHighRiseHousing) {
        this.numberOfHighRiseHousing = numberOfHighRiseHousing;
    }

    public Integer getTotalNumberOfHousing() {
        return totalNumberOfHousing;
    }

    public void setTotalNumberOfHousing(Integer totalNumberOfHousing) {
        this.totalNumberOfHousing = totalNumberOfHousing;
    }

    public StringOrRef getPublicFacilitiesAllocationPolicy() {
        return publicFacilitiesAllocationPolicy;
    }

    public void setPublicFacilitiesAllocationPolicy(StringOrRef publicFacilitiesAllocationPolicy) {
        this.publicFacilitiesAllocationPolicy = ModelObjects.setParent(publicFacilitiesAllocationPolicy, this);
    }

    public String getScheduledExecutor() {
        return scheduledExecutor;
    }

    public void setScheduledExecutor(String scheduledExecutor) {
        this.scheduledExecutor = scheduledExecutor;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        CollectiveHousingFacilities copy = target == null ? new CollectiveHousingFacilities() : (CollectiveHousingFacilities) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CollectiveHousingFacilities(), copyBuilder);
    }
}
