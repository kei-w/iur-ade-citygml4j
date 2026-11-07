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

public class PortStorageFacility extends PortAttribute {
    private Measure innerTotalFloorArea;
    private Measure innerOfSiteArea;
    private Measure outerOfTotalFloorArea;
    private Measure outerSiteArea;
    private Code mainCargo;
    private Integer storageCapacity;
    private Code storageCapacityUnit;
    private Code mainMaterial;
    private Integer totalCost;
    private String note;

    public Measure getInnerTotalFloorArea() {
        return innerTotalFloorArea;
    }

    public void setInnerTotalFloorArea(Measure innerTotalFloorArea) {
        this.innerTotalFloorArea = ModelObjects.setParent(innerTotalFloorArea, this);
    }

    public Measure getInnerOfSiteArea() {
        return innerOfSiteArea;
    }

    public void setInnerOfSiteArea(Measure innerOfSiteArea) {
        this.innerOfSiteArea = ModelObjects.setParent(innerOfSiteArea, this);
    }

    public Measure getOuterOfTotalFloorArea() {
        return outerOfTotalFloorArea;
    }

    public void setOuterOfTotalFloorArea(Measure outerOfTotalFloorArea) {
        this.outerOfTotalFloorArea = ModelObjects.setParent(outerOfTotalFloorArea, this);
    }

    public Measure getOuterSiteArea() {
        return outerSiteArea;
    }

    public void setOuterSiteArea(Measure outerSiteArea) {
        this.outerSiteArea = ModelObjects.setParent(outerSiteArea, this);
    }

    public Code getMainCargo() {
        return mainCargo;
    }

    public void setMainCargo(Code mainCargo) {
        this.mainCargo = ModelObjects.setParent(mainCargo, this);
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Code getStorageCapacityUnit() {
        return storageCapacityUnit;
    }

    public void setStorageCapacityUnit(Code storageCapacityUnit) {
        this.storageCapacityUnit = ModelObjects.setParent(storageCapacityUnit, this);
    }

    public Code getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Code mainMaterial) {
        this.mainMaterial = ModelObjects.setParent(mainMaterial, this);
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PortStorageFacility copy = target == null ? new PortStorageFacility() : (PortStorageFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PortStorageFacility(), copyBuilder);
    }
}
