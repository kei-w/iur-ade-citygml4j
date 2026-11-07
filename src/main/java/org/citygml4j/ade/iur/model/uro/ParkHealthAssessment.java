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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.Year;

public class ParkHealthAssessment extends AbstractDataType {
    private Year assessmentFiscalYear;
    private String deteriorationStatus;
    private Code condition;
    private Code urgency;

    public Year getAssessmentFiscalYear() {
        return assessmentFiscalYear;
    }

    public void setAssessmentFiscalYear(Year assessmentFiscalYear) {
        this.assessmentFiscalYear = assessmentFiscalYear;
    }

    public String getDeteriorationStatus() {
        return deteriorationStatus;
    }

    public void setDeteriorationStatus(String deteriorationStatus) {
        this.deteriorationStatus = deteriorationStatus;
    }

    public Code getCondition() {
        return condition;
    }

    public void setCondition(Code condition) {
        this.condition = ModelObjects.setParent(condition, this);
    }

    public Code getUrgency() {
        return urgency;
    }

    public void setUrgency(Code urgency) {
        this.urgency = ModelObjects.setParent(urgency, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ParkHealthAssessment copy = target == null ? new ParkHealthAssessment() : (ParkHealthAssessment) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ParkHealthAssessment(), copyBuilder);
    }
}
