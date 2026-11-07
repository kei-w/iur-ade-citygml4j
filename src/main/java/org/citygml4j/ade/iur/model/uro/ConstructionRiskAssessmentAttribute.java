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

import java.time.LocalDate;
import java.time.Year;

public class ConstructionRiskAssessmentAttribute extends AbstractDataType {
    private Year surveyYear;
    private Code riskType;
    private Code status;
    private LocalDate referenceDate;

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    public Code getRiskType() {
        return riskType;
    }

    public void setRiskType(Code riskType) {
        this.riskType = ModelObjects.setParent(riskType, this);
    }

    public Code getStatus() {
        return status;
    }

    public void setStatus(Code status) {
        this.status = ModelObjects.setParent(status, this);
    }

    public LocalDate getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(LocalDate referenceDate) {
        this.referenceDate = referenceDate;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ConstructionRiskAssessmentAttribute copy = target == null ? new ConstructionRiskAssessmentAttribute() : (ConstructionRiskAssessmentAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ConstructionRiskAssessmentAttribute(), copyBuilder);
    }
}
