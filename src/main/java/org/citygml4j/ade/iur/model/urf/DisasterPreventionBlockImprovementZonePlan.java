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

public class DisasterPreventionBlockImprovementZonePlan extends AbstractDistrictPlan {
    private StringOrRef zonalDisasterPreventionFacilitiesAllocation;
    private StringOrRef specifiedZonalDisasterPreventionFacilitiesAllocation;
    private List<ZonalDisasterPreventionFacilityProperty> zonalDisasterPreventionFacilities;

    public StringOrRef getZonalDisasterPreventionFacilitiesAllocation() {
        return zonalDisasterPreventionFacilitiesAllocation;
    }

    public void setZonalDisasterPreventionFacilitiesAllocation(StringOrRef zonalDisasterPreventionFacilitiesAllocation) {
        this.zonalDisasterPreventionFacilitiesAllocation = ModelObjects.setParent(zonalDisasterPreventionFacilitiesAllocation, this);
    }

    public StringOrRef getSpecifiedZonalDisasterPreventionFacilitiesAllocation() {
        return specifiedZonalDisasterPreventionFacilitiesAllocation;
    }

    public void setSpecifiedZonalDisasterPreventionFacilitiesAllocation(StringOrRef specifiedZonalDisasterPreventionFacilitiesAllocation) {
        this.specifiedZonalDisasterPreventionFacilitiesAllocation = ModelObjects.setParent(specifiedZonalDisasterPreventionFacilitiesAllocation, this);
    }

    public List<ZonalDisasterPreventionFacilityProperty> getZonalDisasterPreventionFacilities() {
        if (zonalDisasterPreventionFacilities == null)
            zonalDisasterPreventionFacilities = new ChildList<>(this);

        return zonalDisasterPreventionFacilities;
    }

    public void setZonalDisasterPreventionFacilities(List<ZonalDisasterPreventionFacilityProperty> zonalDisasterPreventionFacilities) {
        this.zonalDisasterPreventionFacilities = ModelObjects.setParent(zonalDisasterPreventionFacilities, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DisasterPreventionBlockImprovementZonePlan copy = target == null ? new DisasterPreventionBlockImprovementZonePlan() : (DisasterPreventionBlockImprovementZonePlan) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DisasterPreventionBlockImprovementZonePlan(), copyBuilder);
    }
}
