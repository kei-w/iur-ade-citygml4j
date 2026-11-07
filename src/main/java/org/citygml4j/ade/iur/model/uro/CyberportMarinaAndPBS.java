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

public class CyberportMarinaAndPBS extends PortAttribute {
    private Code geologicalType;
    private String obstructingStructures;
    private Length mainPartLength;
    private Length totalLength;
    private Length waveDissipatorLength;
    private Length facilityWidth;
    private Length apronWidth;
    private String restrictionStructure;
    private Length plannedDepth;
    private Length currentDepth;
    private Measure innerTotalFloorArea;
    private Measure innerOfSiteArea;
    private Measure outerOfTotalFloorArea;
    private Measure outerSiteArea;
    private Length ceilingHeight;
    private Measure gravityResistant;
    private Code form;
    private Code areaType;
    private Code mainVessels;
    private Boolean isDredged;
    private Measure mooringPostWeight;
    private Integer numberOfMooringPosts;
    private Integer resistantMaterial;
    private Integer lighting;
    private Integer stairs;
    private String lifesaving;
    private Integer lifesavingNumber;
    private Length bumper;
    private Integer numberOfVehicleBoardings;
    private Length vehicleBoardingWidth;
    private String shipType;
    private Integer numberOfSeats;
    private Code mainCargo;
    private Integer storageCapacity;
    private Code storageCapacityUnit;
    private Code structureType;
    private Code mainMaterial;
    private Integer totalCost;
    private Integer subsidy;
    private String note;

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

    public Length getMainPartLength() {
        return mainPartLength;
    }

    public void setMainPartLength(Length mainPartLength) {
        this.mainPartLength = ModelObjects.setParent(mainPartLength, this);
    }

    public Length getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(Length totalLength) {
        this.totalLength = ModelObjects.setParent(totalLength, this);
    }

    public Length getWaveDissipatorLength() {
        return waveDissipatorLength;
    }

    public void setWaveDissipatorLength(Length waveDissipatorLength) {
        this.waveDissipatorLength = ModelObjects.setParent(waveDissipatorLength, this);
    }

    public Length getFacilityWidth() {
        return facilityWidth;
    }

    public void setFacilityWidth(Length facilityWidth) {
        this.facilityWidth = ModelObjects.setParent(facilityWidth, this);
    }

    public Length getApronWidth() {
        return apronWidth;
    }

    public void setApronWidth(Length apronWidth) {
        this.apronWidth = ModelObjects.setParent(apronWidth, this);
    }

    public String getRestrictionStructure() {
        return restrictionStructure;
    }

    public void setRestrictionStructure(String restrictionStructure) {
        this.restrictionStructure = restrictionStructure;
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

    public Length getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Length ceilingHeight) {
        this.ceilingHeight = ModelObjects.setParent(ceilingHeight, this);
    }

    public Measure getGravityResistant() {
        return gravityResistant;
    }

    public void setGravityResistant(Measure gravityResistant) {
        this.gravityResistant = ModelObjects.setParent(gravityResistant, this);
    }

    public Code getForm() {
        return form;
    }

    public void setForm(Code form) {
        this.form = ModelObjects.setParent(form, this);
    }

    public Code getAreaType() {
        return areaType;
    }

    public void setAreaType(Code areaType) {
        this.areaType = ModelObjects.setParent(areaType, this);
    }

    public Code getMainVessels() {
        return mainVessels;
    }

    public void setMainVessels(Code mainVessels) {
        this.mainVessels = ModelObjects.setParent(mainVessels, this);
    }

    public Boolean getIsDredged() {
        return isDredged;
    }

    public void setIsDredged(Boolean isDredged) {
        this.isDredged = isDredged;
    }

    public Measure getMooringPostWeight() {
        return mooringPostWeight;
    }

    public void setMooringPostWeight(Measure mooringPostWeight) {
        this.mooringPostWeight = ModelObjects.setParent(mooringPostWeight, this);
    }

    public Integer getNumberOfMooringPosts() {
        return numberOfMooringPosts;
    }

    public void setNumberOfMooringPosts(Integer numberOfMooringPosts) {
        this.numberOfMooringPosts = numberOfMooringPosts;
    }

    public Integer getResistantMaterial() {
        return resistantMaterial;
    }

    public void setResistantMaterial(Integer resistantMaterial) {
        this.resistantMaterial = resistantMaterial;
    }

    public Integer getLighting() {
        return lighting;
    }

    public void setLighting(Integer lighting) {
        this.lighting = lighting;
    }

    public Integer getStairs() {
        return stairs;
    }

    public void setStairs(Integer stairs) {
        this.stairs = stairs;
    }

    public String getLifesaving() {
        return lifesaving;
    }

    public void setLifesaving(String lifesaving) {
        this.lifesaving = lifesaving;
    }

    public Integer getLifesavingNumber() {
        return lifesavingNumber;
    }

    public void setLifesavingNumber(Integer lifesavingNumber) {
        this.lifesavingNumber = lifesavingNumber;
    }

    public Length getBumper() {
        return bumper;
    }

    public void setBumper(Length bumper) {
        this.bumper = ModelObjects.setParent(bumper, this);
    }

    public Integer getNumberOfVehicleBoardings() {
        return numberOfVehicleBoardings;
    }

    public void setNumberOfVehicleBoardings(Integer numberOfVehicleBoardings) {
        this.numberOfVehicleBoardings = numberOfVehicleBoardings;
    }

    public Length getVehicleBoardingWidth() {
        return vehicleBoardingWidth;
    }

    public void setVehicleBoardingWidth(Length vehicleBoardingWidth) {
        this.vehicleBoardingWidth = ModelObjects.setParent(vehicleBoardingWidth, this);
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
        CyberportMarinaAndPBS copy = target == null ? new CyberportMarinaAndPBS() : (CyberportMarinaAndPBS) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CyberportMarinaAndPBS(), copyBuilder);
    }
}
