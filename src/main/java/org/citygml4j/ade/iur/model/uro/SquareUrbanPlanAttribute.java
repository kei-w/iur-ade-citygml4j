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
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SquareUrbanPlanAttribute extends AbstractDataType {
    private Code prefecture;
    private Code city;
    private String urbanPlanningAreaName;
    private List<String> enforcer;
    private LocalDate dateOfDecision;
    private List<LocalDate> dateOfRevision;
    private Measure areaPlanned;
    private Measure areaInService;
    private String remarks;
    private Code status;
    private Measure areaImproved;
    private Measure areaCompleted;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    private Boolean isCompleted;
    private Boolean isAuthorized;
    private String purpose;
    private String note;

    public Code getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(Code prefecture) {
        this.prefecture = ModelObjects.setParent(prefecture, this);
    }

    public Code getCity() {
        return city;
    }

    public void setCity(Code city) {
        this.city = ModelObjects.setParent(city, this);
    }

    public String getUrbanPlanningAreaName() {
        return urbanPlanningAreaName;
    }

    public void setUrbanPlanningAreaName(String urbanPlanningAreaName) {
        this.urbanPlanningAreaName = urbanPlanningAreaName;
    }

    public List<String> getEnforcer() {
        if (enforcer == null)
            enforcer = new ArrayList<>();

        return enforcer;
    }

    public void setEnforcer(List<String> enforcer) {
        this.enforcer = enforcer;
    }

    public LocalDate getDateOfDecision() {
        return dateOfDecision;
    }

    public void setDateOfDecision(LocalDate dateOfDecision) {
        this.dateOfDecision = dateOfDecision;
    }

    public List<LocalDate> getDateOfRevision() {
        if (dateOfRevision == null)
            dateOfRevision = new ArrayList<>();

        return dateOfRevision;
    }

    public void setDateOfRevision(List<LocalDate> dateOfRevision) {
        this.dateOfRevision = dateOfRevision;
    }

    public Measure getAreaPlanned() {
        return areaPlanned;
    }

    public void setAreaPlanned(Measure areaPlanned) {
        this.areaPlanned = ModelObjects.setParent(areaPlanned, this);
    }

    public Measure getAreaInService() {
        return areaInService;
    }

    public void setAreaInService(Measure areaInService) {
        this.areaInService = ModelObjects.setParent(areaInService, this);
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Code getStatus() {
        return status;
    }

    public void setStatus(Code status) {
        this.status = ModelObjects.setParent(status, this);
    }

    public Measure getAreaImproved() {
        return areaImproved;
    }

    public void setAreaImproved(Measure areaImproved) {
        this.areaImproved = ModelObjects.setParent(areaImproved, this);
    }

    public Measure getAreaCompleted() {
        return areaCompleted;
    }

    public void setAreaCompleted(Measure areaCompleted) {
        this.areaCompleted = ModelObjects.setParent(areaCompleted, this);
    }

    public LocalDate getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(LocalDate projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public LocalDate getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(LocalDate projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SquareUrbanPlanAttribute copy = target == null ? new SquareUrbanPlanAttribute() : (SquareUrbanPlanAttribute) target;
        return ObjectCopier.copyTo(this, copy, SquareUrbanPlanAttribute.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SquareUrbanPlanAttribute(), copyBuilder);
    }
}
