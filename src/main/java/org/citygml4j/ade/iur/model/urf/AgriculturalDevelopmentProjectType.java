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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.Year;

public class AgriculturalDevelopmentProjectType extends AbstractDataType {
    private String id;
    private String blockName;
    private Code projectType;
    private String implementationBody;
    private Measure benefitArea;
    private Measure benefitAreaInUrbanArea;
    private Year startFiscalYear;
    private Code status;
    private Code measureType;
    private String benefitPeriod;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Code getProjectType() {
        return projectType;
    }

    public void setProjectType(Code projectType) {
        this.projectType = ModelObjects.setParent(projectType, this);
    }

    public String getImplementationBody() {
        return implementationBody;
    }

    public void setImplementationBody(String implementationBody) {
        this.implementationBody = implementationBody;
    }

    public Measure getBenefitArea() {
        return benefitArea;
    }

    public void setBenefitArea(Measure benefitArea) {
        this.benefitArea = ModelObjects.setParent(benefitArea, this);
    }

    public Measure getBenefitAreaInUrbanArea() {
        return benefitAreaInUrbanArea;
    }

    public void setBenefitAreaInUrbanArea(Measure benefitAreaInUrbanArea) {
        this.benefitAreaInUrbanArea = ModelObjects.setParent(benefitAreaInUrbanArea, this);
    }

    public Year getStartFiscalYear() {
        return startFiscalYear;
    }

    public void setStartFiscalYear(Year startFiscalYear) {
        this.startFiscalYear = startFiscalYear;
    }

    public Code getStatus() {
        return status;
    }

    public void setStatus(Code status) {
        this.status = ModelObjects.setParent(status, this);
    }

    public Code getMeasureType() {
        return measureType;
    }

    public void setMeasureType(Code measureType) {
        this.measureType = ModelObjects.setParent(measureType, this);
    }

    public String getBenefitPeriod() {
        return benefitPeriod;
    }

    public void setBenefitPeriod(String benefitPeriod) {
        this.benefitPeriod = benefitPeriod;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AgriculturalDevelopmentProjectType copy = target == null ? new AgriculturalDevelopmentProjectType() : (AgriculturalDevelopmentProjectType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AgriculturalDevelopmentProjectType(), copyBuilder);
    }
}
