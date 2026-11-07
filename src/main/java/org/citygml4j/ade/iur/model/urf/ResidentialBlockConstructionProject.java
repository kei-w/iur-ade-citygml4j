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

public class ResidentialBlockConstructionProject extends UrbanDevelopmentProject {
    private StringOrRef publicFacilityAllocation;
    private StringOrRef developmentPlan;
    private Measure siteArea;
    private Measure totalFloorArea;

    public StringOrRef getPublicFacilityAllocation() {
        return publicFacilityAllocation;
    }

    public void setPublicFacilityAllocation(StringOrRef publicFacilityAllocation) {
        this.publicFacilityAllocation = ModelObjects.setParent(publicFacilityAllocation, this);
    }

    public StringOrRef getDevelopmentPlan() {
        return developmentPlan;
    }

    public void setDevelopmentPlan(StringOrRef developmentPlan) {
        this.developmentPlan = ModelObjects.setParent(developmentPlan, this);
    }

    public Measure getSiteArea() {
        return siteArea;
    }

    public void setSiteArea(Measure siteArea) {
        this.siteArea = ModelObjects.setParent(siteArea, this);
    }

    public Measure getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(Measure totalFloorArea) {
        this.totalFloorArea = ModelObjects.setParent(totalFloorArea, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ResidentialBlockConstructionProject copy = target == null ? new ResidentialBlockConstructionProject() : (ResidentialBlockConstructionProject) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ResidentialBlockConstructionProject(), copyBuilder);
    }
}
