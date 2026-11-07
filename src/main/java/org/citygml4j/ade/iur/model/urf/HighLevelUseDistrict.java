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
import org.citygml4j.model.gml.basicTypes.Measure;

import java.util.ArrayList;
import java.util.List;

public class HighLevelUseDistrict extends DistrictsAndZones {
    private List<Double> maximumFloorAreaRate;
    private List<Double> minimumFloorAreaRate;
    private List<Double> maximumBuildingCoverageRate;
    private List<Measure> minimumBuildingArea;
    private StringOrRef setbackSize;

    public List<Double> getMaximumFloorAreaRate() {
        if (maximumFloorAreaRate == null)
            maximumFloorAreaRate = new ArrayList<>();

        return maximumFloorAreaRate;
    }

    public void setMaximumFloorAreaRate(List<Double> maximumFloorAreaRate) {
        this.maximumFloorAreaRate = maximumFloorAreaRate;
    }

    public List<Double> getMinimumFloorAreaRate() {
        if (minimumFloorAreaRate == null)
            minimumFloorAreaRate = new ArrayList<>();

        return minimumFloorAreaRate;
    }

    public void setMinimumFloorAreaRate(List<Double> minimumFloorAreaRate) {
        this.minimumFloorAreaRate = minimumFloorAreaRate;
    }

    public List<Double> getMaximumBuildingCoverageRate() {
        if (maximumBuildingCoverageRate == null)
            maximumBuildingCoverageRate = new ArrayList<>();

        return maximumBuildingCoverageRate;
    }

    public void setMaximumBuildingCoverageRate(List<Double> maximumBuildingCoverageRate) {
        this.maximumBuildingCoverageRate = maximumBuildingCoverageRate;
    }

    public List<Measure> getMinimumBuildingArea() {
        if (minimumBuildingArea == null)
            minimumBuildingArea = new ChildList<>(this);

        return minimumBuildingArea;
    }

    public void setMinimumBuildingArea(List<Measure> minimumBuildingArea) {
        this.minimumBuildingArea = ModelObjects.setParent(minimumBuildingArea, this);
    }

    public StringOrRef getSetbackSize() {
        return setbackSize;
    }

    public void setSetbackSize(StringOrRef setbackSize) {
        this.setbackSize = ModelObjects.setParent(setbackSize, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HighLevelUseDistrict copy = target == null ? new HighLevelUseDistrict() : (HighLevelUseDistrict) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HighLevelUseDistrict(), copyBuilder);
    }
}
