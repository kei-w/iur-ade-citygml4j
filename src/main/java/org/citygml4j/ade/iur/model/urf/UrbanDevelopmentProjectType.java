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
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;

public class UrbanDevelopmentProjectType extends AbstractDataType {
    private String id;
    private LocalDate dateOfDecision;
    private String projectName;
    private Measure plannedArea;
    private Measure ongoingArea;
    private Double costUpToLastFiscalYear;
    private Double cost;
    private Measure completedArea;
    private String projectPeriod;
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDateOfDecision() {
        return dateOfDecision;
    }

    public void setDateOfDecision(LocalDate dateOfDecision) {
        this.dateOfDecision = dateOfDecision;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Measure getPlannedArea() {
        return plannedArea;
    }

    public void setPlannedArea(Measure plannedArea) {
        this.plannedArea = ModelObjects.setParent(plannedArea, this);
    }

    public Measure getOngoingArea() {
        return ongoingArea;
    }

    public void setOngoingArea(Measure ongoingArea) {
        this.ongoingArea = ModelObjects.setParent(ongoingArea, this);
    }

    public Double getCostUpToLastFiscalYear() {
        return costUpToLastFiscalYear;
    }

    public void setCostUpToLastFiscalYear(Double costUpToLastFiscalYear) {
        this.costUpToLastFiscalYear = costUpToLastFiscalYear;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Measure getCompletedArea() {
        return completedArea;
    }

    public void setCompletedArea(Measure completedArea) {
        this.completedArea = ModelObjects.setParent(completedArea, this);
    }

    public String getProjectPeriod() {
        return projectPeriod;
    }

    public void setProjectPeriod(String projectPeriod) {
        this.projectPeriod = projectPeriod;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrbanDevelopmentProjectType copy = target == null ? new UrbanDevelopmentProjectType() : (UrbanDevelopmentProjectType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrbanDevelopmentProjectType(), copyBuilder);
    }
}
