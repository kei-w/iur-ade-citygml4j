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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FishingPortFacility extends FishingPortAttribute {
    private Code facilityDetailsType;
    private String portName;
    private Code portType;
    private String address;
    private String designatedArea;
    private List<String> designation;
    private List<String> designatedAdministrator;
    private List<String> referenceNumber;
    private Code grantType;
    private String administrator;
    private String facilityManager;
    private Code structureType;
    private Code mainMaterial;
    private String otherStructure;
    private Length length;
    private Length width;
    private Length ceilingHeight;
    private Length depth;
    private Measure area;
    private String otherSizeDescription;
    private LocalDate dateOfConstructionOrAcquisition;
    private Integer cost;
    private String note;

    public Code getFacilityDetailsType() {
        return facilityDetailsType;
    }

    public void setFacilityDetailsType(Code facilityDetailsType) {
        this.facilityDetailsType = ModelObjects.setParent(facilityDetailsType, this);
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public Code getPortType() {
        return portType;
    }

    public void setPortType(Code portType) {
        this.portType = ModelObjects.setParent(portType, this);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignatedArea() {
        return designatedArea;
    }

    public void setDesignatedArea(String designatedArea) {
        this.designatedArea = designatedArea;
    }

    public List<String> getDesignation() {
        if (designation == null)
            designation = new ArrayList<>();

        return designation;
    }

    public void setDesignation(List<String> designation) {
        this.designation = designation;
    }

    public List<String> getDesignatedAdministrator() {
        if (designatedAdministrator == null)
            designatedAdministrator = new ArrayList<>();

        return designatedAdministrator;
    }

    public void setDesignatedAdministrator(List<String> designatedAdministrator) {
        this.designatedAdministrator = designatedAdministrator;
    }

    public List<String> getReferenceNumber() {
        if (referenceNumber == null)
            referenceNumber = new ArrayList<>();

        return referenceNumber;
    }

    public void setReferenceNumber(List<String> referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Code getGrantType() {
        return grantType;
    }

    public void setGrantType(Code grantType) {
        this.grantType = ModelObjects.setParent(grantType, this);
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getFacilityManager() {
        return facilityManager;
    }

    public void setFacilityManager(String facilityManager) {
        this.facilityManager = facilityManager;
    }

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
    }

    public Code getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Code mainMaterial) {
        this.mainMaterial = ModelObjects.setParent(mainMaterial, this);
    }

    public String getOtherStructure() {
        return otherStructure;
    }

    public void setOtherStructure(String otherStructure) {
        this.otherStructure = otherStructure;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public Length getWidth() {
        return width;
    }

    public void setWidth(Length width) {
        this.width = ModelObjects.setParent(width, this);
    }

    public Length getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Length ceilingHeight) {
        this.ceilingHeight = ModelObjects.setParent(ceilingHeight, this);
    }

    public Length getDepth() {
        return depth;
    }

    public void setDepth(Length depth) {
        this.depth = ModelObjects.setParent(depth, this);
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public String getOtherSizeDescription() {
        return otherSizeDescription;
    }

    public void setOtherSizeDescription(String otherSizeDescription) {
        this.otherSizeDescription = otherSizeDescription;
    }

    public LocalDate getDateOfConstructionOrAcquisition() {
        return dateOfConstructionOrAcquisition;
    }

    public void setDateOfConstructionOrAcquisition(LocalDate dateOfConstructionOrAcquisition) {
        this.dateOfConstructionOrAcquisition = dateOfConstructionOrAcquisition;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FishingPortFacility copy = target == null ? new FishingPortFacility() : (FishingPortFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FishingPortFacility(), copyBuilder);
    }
}
