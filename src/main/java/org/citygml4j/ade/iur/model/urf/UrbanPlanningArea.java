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
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

public class UrbanPlanningArea extends Zone {
    private Code areaClassification;
    private StringOrRef reasonForAreaClassification;
    private StringOrRef policyForAreaClassification;
    private StringOrRef purposeForUrbanPlan;
    private StringOrRef policyForUrbanPlanDecision;
    private Integer population;
    private Measure cityArea;
    private Integer cityPopulation;

    public Code getAreaClassification() {
        return areaClassification;
    }

    public void setAreaClassification(Code areaClassification) {
        this.areaClassification = ModelObjects.setParent(areaClassification, this);
    }

    public StringOrRef getReasonForAreaClassification() {
        return reasonForAreaClassification;
    }

    public void setReasonForAreaClassification(StringOrRef reasonForAreaClassification) {
        this.reasonForAreaClassification = ModelObjects.setParent(reasonForAreaClassification, this);
    }

    public StringOrRef getPolicyForAreaClassification() {
        return policyForAreaClassification;
    }

    public void setPolicyForAreaClassification(StringOrRef policyForAreaClassification) {
        this.policyForAreaClassification = ModelObjects.setParent(policyForAreaClassification, this);
    }

    public StringOrRef getPurposeForUrbanPlan() {
        return purposeForUrbanPlan;
    }

    public void setPurposeForUrbanPlan(StringOrRef purposeForUrbanPlan) {
        this.purposeForUrbanPlan = ModelObjects.setParent(purposeForUrbanPlan, this);
    }

    public StringOrRef getPolicyForUrbanPlanDecision() {
        return policyForUrbanPlanDecision;
    }

    public void setPolicyForUrbanPlanDecision(StringOrRef policyForUrbanPlanDecision) {
        this.policyForUrbanPlanDecision = ModelObjects.setParent(policyForUrbanPlanDecision, this);
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Measure getCityArea() {
        return cityArea;
    }

    public void setCityArea(Measure cityArea) {
        this.cityArea = ModelObjects.setParent(cityArea, this);
    }

    public Integer getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(Integer cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrbanPlanningArea copy = target == null ? new UrbanPlanningArea() : (UrbanPlanningArea) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrbanPlanningArea(), copyBuilder);
    }
}
