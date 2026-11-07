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
import org.citygml4j.model.gml.measures.Length;

import java.time.Year;

public class PortWasteTreatmentFacility extends PortAttribute {
    private Code structureType;
    private Length perimeter;
    private Length mainPartLength;
    private Length innerShoreLength;
    private Length ceilingHeight;
    private Length waveDissipatorLength;
    private Code mainMaterial;
    private Code wasteType;
    private Measure plannedDisposalArea;
    private Integer plannedDisposalAmount;
    private Integer receivingCapacity;
    private String shipType;
    private Code unitOfReceivingCapacity;
    private Year acquisitionYear;
    private Integer totalCost;
    private Integer subsidy;
    private String note;

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
    }

    public Length getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Length perimeter) {
        this.perimeter = ModelObjects.setParent(perimeter, this);
    }

    public Length getMainPartLength() {
        return mainPartLength;
    }

    public void setMainPartLength(Length mainPartLength) {
        this.mainPartLength = ModelObjects.setParent(mainPartLength, this);
    }

    public Length getInnerShoreLength() {
        return innerShoreLength;
    }

    public void setInnerShoreLength(Length innerShoreLength) {
        this.innerShoreLength = ModelObjects.setParent(innerShoreLength, this);
    }

    public Length getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Length ceilingHeight) {
        this.ceilingHeight = ModelObjects.setParent(ceilingHeight, this);
    }

    public Length getWaveDissipatorLength() {
        return waveDissipatorLength;
    }

    public void setWaveDissipatorLength(Length waveDissipatorLength) {
        this.waveDissipatorLength = ModelObjects.setParent(waveDissipatorLength, this);
    }

    public Code getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Code mainMaterial) {
        this.mainMaterial = ModelObjects.setParent(mainMaterial, this);
    }

    public Code getWasteType() {
        return wasteType;
    }

    public void setWasteType(Code wasteType) {
        this.wasteType = ModelObjects.setParent(wasteType, this);
    }

    public Measure getPlannedDisposalArea() {
        return plannedDisposalArea;
    }

    public void setPlannedDisposalArea(Measure plannedDisposalArea) {
        this.plannedDisposalArea = ModelObjects.setParent(plannedDisposalArea, this);
    }

    public Integer getPlannedDisposalAmount() {
        return plannedDisposalAmount;
    }

    public void setPlannedDisposalAmount(Integer plannedDisposalAmount) {
        this.plannedDisposalAmount = plannedDisposalAmount;
    }

    public Integer getReceivingCapacity() {
        return receivingCapacity;
    }

    public void setReceivingCapacity(Integer receivingCapacity) {
        this.receivingCapacity = receivingCapacity;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public Code getUnitOfReceivingCapacity() {
        return unitOfReceivingCapacity;
    }

    public void setUnitOfReceivingCapacity(Code unitOfReceivingCapacity) {
        this.unitOfReceivingCapacity = ModelObjects.setParent(unitOfReceivingCapacity, this);
    }

    public Year getAcquisitionYear() {
        return acquisitionYear;
    }

    public void setAcquisitionYear(Year acquisitionYear) {
        this.acquisitionYear = acquisitionYear;
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
        PortWasteTreatmentFacility copy = target == null ? new PortWasteTreatmentFacility() : (PortWasteTreatmentFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PortWasteTreatmentFacility(), copyBuilder);
    }
}
