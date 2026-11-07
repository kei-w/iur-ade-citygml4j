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

import java.util.ArrayList;
import java.util.List;

public class HarborFacility extends PortAttribute {
    private Code geologicalType;
    private String obstructingStructures;
    private Length structuralLimitations;
    private Length length;
    private Length minimumWidth;
    private Length maximumWidth;
    private Length plannedDepth;
    private Length currentDepth;
    private Boolean isDredged;
    private Code areaType;
    private Measure innerArea;
    private Measure outerArea;
    private Integer totalCost;
    private Integer subsidy;
    private List<String> note;

    public Code getGeologicalType() {
        return geologicalType;
    }

    public void setGeologicalType(Code geologicalType) {
        this.geologicalType = ModelObjects.setParent(geologicalType, this);
    }

    public String getObstructingStructures() {
        return obstructingStructures;
    }

    public void setObstructingStructures(String obstructingStructures) {
        this.obstructingStructures = obstructingStructures;
    }

    public Length getStructuralLimitations() {
        return structuralLimitations;
    }

    public void setStructuralLimitations(Length structuralLimitations) {
        this.structuralLimitations = ModelObjects.setParent(structuralLimitations, this);
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public Length getMinimumWidth() {
        return minimumWidth;
    }

    public void setMinimumWidth(Length minimumWidth) {
        this.minimumWidth = ModelObjects.setParent(minimumWidth, this);
    }

    public Length getMaximumWidth() {
        return maximumWidth;
    }

    public void setMaximumWidth(Length maximumWidth) {
        this.maximumWidth = ModelObjects.setParent(maximumWidth, this);
    }

    public Length getPlannedDepth() {
        return plannedDepth;
    }

    public void setPlannedDepth(Length plannedDepth) {
        this.plannedDepth = ModelObjects.setParent(plannedDepth, this);
    }

    public Length getCurrentDepth() {
        return currentDepth;
    }

    public void setCurrentDepth(Length currentDepth) {
        this.currentDepth = ModelObjects.setParent(currentDepth, this);
    }

    public Boolean getIsDredged() {
        return isDredged;
    }

    public void setIsDredged(Boolean isDredged) {
        this.isDredged = isDredged;
    }

    public Code getAreaType() {
        return areaType;
    }

    public void setAreaType(Code areaType) {
        this.areaType = ModelObjects.setParent(areaType, this);
    }

    public Measure getInnerArea() {
        return innerArea;
    }

    public void setInnerArea(Measure innerArea) {
        this.innerArea = ModelObjects.setParent(innerArea, this);
    }

    public Measure getOuterArea() {
        return outerArea;
    }

    public void setOuterArea(Measure outerArea) {
        this.outerArea = ModelObjects.setParent(outerArea, this);
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

    public List<String> getNote() {
        if (note == null)
            note = new ArrayList<>();

        return note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        HarborFacility copy = target == null ? new HarborFacility() : (HarborFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new HarborFacility(), copyBuilder);
    }
}
