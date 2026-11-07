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

public abstract class AbstractDistrictPlan extends Zone {
    private StringOrRef objectives;
    private StringOrRef policy;
    private List<DistrictDevelopmentPlanProperty> districtDevelopmentPlan;
    private List<PromotionDistrictProperty> promotionDistrict;

    public StringOrRef getObjectives() {
        return objectives;
    }

    public void setObjectives(StringOrRef objectives) {
        this.objectives = ModelObjects.setParent(objectives, this);
    }

    public StringOrRef getPolicy() {
        return policy;
    }

    public void setPolicy(StringOrRef policy) {
        this.policy = ModelObjects.setParent(policy, this);
    }

    public List<DistrictDevelopmentPlanProperty> getDistrictDevelopmentPlan() {
        if (districtDevelopmentPlan == null)
            districtDevelopmentPlan = new ChildList<>(this);

        return districtDevelopmentPlan;
    }

    public void setDistrictDevelopmentPlan(List<DistrictDevelopmentPlanProperty> districtDevelopmentPlan) {
        this.districtDevelopmentPlan = ModelObjects.setParent(districtDevelopmentPlan, this);
    }

    public List<PromotionDistrictProperty> getPromotionDistrict() {
        if (promotionDistrict == null)
            promotionDistrict = new ChildList<>(this);

        return promotionDistrict;
    }

    public void setPromotionDistrict(List<PromotionDistrictProperty> promotionDistrict) {
        this.promotionDistrict = ModelObjects.setParent(promotionDistrict, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        AbstractDistrictPlan copy = (AbstractDistrictPlan) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, AbstractDistrictPlan.class, copyBuilder);
    }
}
