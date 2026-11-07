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
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.base.StringOrRef;
import org.citygml4j.model.gml.basicTypes.Code;

import java.util.List;

public class UrbanRoadAttribute extends AbstractDataType {
    private Code routeTypeNumber;
    private Code routeSizeNumber;
    private String routeSerialNumber;
    private Code roadType;
    private Integer numberOfLanes;
    private StringOrRef roadStructure;
    private Code structureType;
    private Code crossType;
    private Code trafficPlazas;
    private List<StructureDetailsProperty> structuralDetails;

    public Code getRouteTypeNumber() {
        return routeTypeNumber;
    }

    public void setRouteTypeNumber(Code routeTypeNumber) {
        this.routeTypeNumber = ModelObjects.setParent(routeTypeNumber, this);
    }

    public Code getRouteSizeNumber() {
        return routeSizeNumber;
    }

    public void setRouteSizeNumber(Code routeSizeNumber) {
        this.routeSizeNumber = ModelObjects.setParent(routeSizeNumber, this);
    }

    public String getRouteSerialNumber() {
        return routeSerialNumber;
    }

    public void setRouteSerialNumber(String routeSerialNumber) {
        this.routeSerialNumber = routeSerialNumber;
    }

    public Code getRoadType() {
        return roadType;
    }

    public void setRoadType(Code roadType) {
        this.roadType = ModelObjects.setParent(roadType, this);
    }

    public Integer getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(Integer numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public StringOrRef getRoadStructure() {
        return roadStructure;
    }

    public void setRoadStructure(StringOrRef roadStructure) {
        this.roadStructure = ModelObjects.setParent(roadStructure, this);
    }

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
    }

    public Code getCrossType() {
        return crossType;
    }

    public void setCrossType(Code crossType) {
        this.crossType = ModelObjects.setParent(crossType, this);
    }

    public Code getTrafficPlazas() {
        return trafficPlazas;
    }

    public void setTrafficPlazas(Code trafficPlazas) {
        this.trafficPlazas = ModelObjects.setParent(trafficPlazas, this);
    }

    public List<StructureDetailsProperty> getStructuralDetails() {
        if (structuralDetails == null)
            structuralDetails = new ChildList<>(this);

        return structuralDetails;
    }

    public void setStructuralDetails(List<StructureDetailsProperty> structuralDetails) {
        this.structuralDetails = ModelObjects.setParent(structuralDetails, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrbanRoadAttribute copy = target == null ? new UrbanRoadAttribute() : (UrbanRoadAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrbanRoadAttribute(), copyBuilder);
    }
}
