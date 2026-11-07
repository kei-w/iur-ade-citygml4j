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

public class IfcBuildingElement extends IfcElement {
    private Code elementType;
    private Code predefinedType;
    private Code shapeType;
    private Integer numberOfRiser;
    private Integer numberOfTreads;
    private Length riserHeight;
    private Length treadLength;
    private IfcTransportElementTypeEnum operationType;
    private Measure capacityByWeight;
    private Integer capacityByNumber;

    public Code getElementType() {
        return elementType;
    }

    public void setElementType(Code elementType) {
        this.elementType = ModelObjects.setParent(elementType, this);
    }

    public Code getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(Code predefinedType) {
        this.predefinedType = ModelObjects.setParent(predefinedType, this);
    }

    public Code getShapeType() {
        return shapeType;
    }

    public void setShapeType(Code shapeType) {
        this.shapeType = ModelObjects.setParent(shapeType, this);
    }

    public Integer getNumberOfRiser() {
        return numberOfRiser;
    }

    public void setNumberOfRiser(Integer numberOfRiser) {
        this.numberOfRiser = numberOfRiser;
    }

    public Integer getNumberOfTreads() {
        return numberOfTreads;
    }

    public void setNumberOfTreads(Integer numberOfTreads) {
        this.numberOfTreads = numberOfTreads;
    }

    public Length getRiserHeight() {
        return riserHeight;
    }

    public void setRiserHeight(Length riserHeight) {
        this.riserHeight = ModelObjects.setParent(riserHeight, this);
    }

    public Length getTreadLength() {
        return treadLength;
    }

    public void setTreadLength(Length treadLength) {
        this.treadLength = ModelObjects.setParent(treadLength, this);
    }

    public IfcTransportElementTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcTransportElementTypeEnum operationType) {
        this.operationType = operationType;
    }

    public Measure getCapacityByWeight() {
        return capacityByWeight;
    }

    public void setCapacityByWeight(Measure capacityByWeight) {
        this.capacityByWeight = ModelObjects.setParent(capacityByWeight, this);
    }

    public Integer getCapacityByNumber() {
        return capacityByNumber;
    }

    public void setCapacityByNumber(Integer capacityByNumber) {
        this.capacityByNumber = capacityByNumber;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcBuildingElement copy = target == null ? new IfcBuildingElement() : (IfcBuildingElement) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, IfcBuildingElement.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcBuildingElement(), copyBuilder);
    }
}
