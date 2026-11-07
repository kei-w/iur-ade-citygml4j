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

public class SpecifiedDisasterPreventionBlockImprovementZone extends DistrictsAndZones {
    private Measure minimumSiteArea;
    private StringOrRef setbackSize;
    private Double minimumFrontageRate;
    private Length minimumBuildingHeight;

    public Measure getMinimumSiteArea() {
        return minimumSiteArea;
    }

    public void setMinimumSiteArea(Measure minimumSiteArea) {
        this.minimumSiteArea = ModelObjects.setParent(minimumSiteArea, this);
    }

    public StringOrRef getSetbackSize() {
        return setbackSize;
    }

    public void setSetbackSize(StringOrRef setbackSize) {
        this.setbackSize = ModelObjects.setParent(setbackSize, this);
    }

    public Double getMinimumFrontageRate() {
        return minimumFrontageRate;
    }

    public void setMinimumFrontageRate(Double minimumFrontageRate) {
        this.minimumFrontageRate = minimumFrontageRate;
    }

    public Length getMinimumBuildingHeight() {
        return minimumBuildingHeight;
    }

    public void setMinimumBuildingHeight(Length minimumBuildingHeight) {
        this.minimumBuildingHeight = ModelObjects.setParent(minimumBuildingHeight, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SpecifiedDisasterPreventionBlockImprovementZone copy = target == null ? new SpecifiedDisasterPreventionBlockImprovementZone() : (SpecifiedDisasterPreventionBlockImprovementZone) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SpecifiedDisasterPreventionBlockImprovementZone(), copyBuilder);
    }
}
