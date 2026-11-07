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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.base.StringOrRef;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalDate;
import java.time.Year;

public class MaintenanceHistoryAttribute extends FacilityAttribute {
    private Code maintenanceType;
    private Year maintenanceFiscalYear;
    private Year maintenanceYear;
    private LocalDate maintenanceDate;
    private String status;
    private StringOrRef description;

    public Code getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(Code maintenanceType) {
        this.maintenanceType = ModelObjects.setParent(maintenanceType, this);
    }

    public Year getMaintenanceFiscalYear() {
        return maintenanceFiscalYear;
    }

    public void setMaintenanceFiscalYear(Year maintenanceFiscalYear) {
        this.maintenanceFiscalYear = maintenanceFiscalYear;
    }

    public Year getMaintenanceYear() {
        return maintenanceYear;
    }

    public void setMaintenanceYear(Year maintenanceYear) {
        this.maintenanceYear = maintenanceYear;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StringOrRef getDescription() {
        return description;
    }

    public void setDescription(StringOrRef description) {
        this.description = ModelObjects.setParent(description, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        MaintenanceHistoryAttribute copy = target == null ? new MaintenanceHistoryAttribute() : (MaintenanceHistoryAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new MaintenanceHistoryAttribute(), copyBuilder);
    }
}
