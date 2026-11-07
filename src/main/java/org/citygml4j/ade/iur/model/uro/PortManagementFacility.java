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
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.Year;

public class PortManagementFacility extends PortAttribute {
    private Measure totalFloorArea;
    private Integer numberOfShipTypes;
    private Code unitOfShipType;
    private Integer loadingCapacity;
    private Year acquisitionYear;
    private String usage;
    private Integer totalCost;
    private Integer subsidy;
    private String note;

    public Measure getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(Measure totalFloorArea) {
        this.totalFloorArea = ModelObjects.setParent(totalFloorArea, this);
    }

    public Integer getNumberOfShipTypes() {
        return numberOfShipTypes;
    }

    public void setNumberOfShipTypes(Integer numberOfShipTypes) {
        this.numberOfShipTypes = numberOfShipTypes;
    }

    public Code getUnitOfShipType() {
        return unitOfShipType;
    }

    public void setUnitOfShipType(Code unitOfShipType) {
        this.unitOfShipType = ModelObjects.setParent(unitOfShipType, this);
    }

    public Integer getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(Integer loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public Year getAcquisitionYear() {
        return acquisitionYear;
    }

    public void setAcquisitionYear(Year acquisitionYear) {
        this.acquisitionYear = acquisitionYear;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(Integer subsidy) {
        this.subsidy = subsidy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PortManagementFacility copy = target == null ? new PortManagementFacility() : (PortManagementFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PortManagementFacility(), copyBuilder);
    }
}
