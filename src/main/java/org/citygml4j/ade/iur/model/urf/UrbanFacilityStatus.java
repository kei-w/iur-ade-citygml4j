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

import java.time.LocalDate;

public class UrbanFacilityStatus extends UrbanFunction {
    private String identifier;
    private LocalDate dateOfDecision;
    private String facilityName;
    private Boolean isPlanned;
    private Boolean isImplemented;
    private Double costUptToLastYear;
    private Double totalCost;
    private String isCompleted;
    private LocalDate startDate;
    private LocalDate completedDate;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public LocalDate getDateOfDecision() {
        return dateOfDecision;
    }

    public void setDateOfDecision(LocalDate dateOfDecision) {
        this.dateOfDecision = dateOfDecision;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Boolean getIsPlanned() {
        return isPlanned;
    }

    public void setIsPlanned(Boolean isPlanned) {
        this.isPlanned = isPlanned;
    }

    public Boolean getIsImplemented() {
        return isImplemented;
    }

    public void setIsImplemented(Boolean isImplemented) {
        this.isImplemented = isImplemented;
    }

    public Double getCostUptToLastYear() {
        return costUptToLastYear;
    }

    public void setCostUptToLastYear(Double costUptToLastYear) {
        this.costUptToLastYear = costUptToLastYear;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrbanFacilityStatus copy = target == null ? new UrbanFacilityStatus() : (UrbanFacilityStatus) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrbanFacilityStatus(), copyBuilder);
    }
}
