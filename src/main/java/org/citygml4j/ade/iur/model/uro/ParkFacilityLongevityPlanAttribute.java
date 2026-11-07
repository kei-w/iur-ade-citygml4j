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
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.Year;
import java.util.List;

public class ParkFacilityLongevityPlanAttribute extends FacilityAttribute {
    private Code parkCode;
    private Code parkName;
    private Code parkType;
    private Code facilityName;
    private String facilityNameOptional;
    private String specificFacilityName;
    private NumberOfFacilitiesProperty numberOfFacilities;
    private String size;
    private Code mainMaterial;
    private String mainMaterialOptional;
    private Year installationYear;
    private Integer disposalLimitPeriod;
    private Integer expectedUsagePeriod;
    private RepairsBeforeParkHealthAssessmentProperty repairsBeforeParkHealthAssessment;
    private List<ParkHealthAssessmentProperty> parkHealthAssessment;
    private Code managementType;
    private Year expectedRenewalYearWithMeasures;
    private List<LongevityMeasuresProperty> longevityMeasures;
    private String noteForLongevity;

    public Code getParkCode() {
        return parkCode;
    }

    public void setParkCode(Code parkCode) {
        this.parkCode = ModelObjects.setParent(parkCode, this);
    }

    public Code getParkName() {
        return parkName;
    }

    public void setParkName(Code parkName) {
        this.parkName = ModelObjects.setParent(parkName, this);
    }

    public Code getParkType() {
        return parkType;
    }

    public void setParkType(Code parkType) {
        this.parkType = ModelObjects.setParent(parkType, this);
    }

    public Code getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(Code facilityName) {
        this.facilityName = ModelObjects.setParent(facilityName, this);
    }

    public String getFacilityNameOptional() {
        return facilityNameOptional;
    }

    public void setFacilityNameOptional(String facilityNameOptional) {
        this.facilityNameOptional = facilityNameOptional;
    }

    public String getSpecificFacilityName() {
        return specificFacilityName;
    }

    public void setSpecificFacilityName(String specificFacilityName) {
        this.specificFacilityName = specificFacilityName;
    }

    public NumberOfFacilitiesProperty getNumberOfFacilities() {
        return numberOfFacilities;
    }

    public void setNumberOfFacilities(NumberOfFacilitiesProperty numberOfFacilities) {
        this.numberOfFacilities = ModelObjects.setParent(numberOfFacilities, this);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Code getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Code mainMaterial) {
        this.mainMaterial = ModelObjects.setParent(mainMaterial, this);
    }

    public String getMainMaterialOptional() {
        return mainMaterialOptional;
    }

    public void setMainMaterialOptional(String mainMaterialOptional) {
        this.mainMaterialOptional = mainMaterialOptional;
    }

    public Year getInstallationYear() {
        return installationYear;
    }

    public void setInstallationYear(Year installationYear) {
        this.installationYear = installationYear;
    }

    public Integer getDisposalLimitPeriod() {
        return disposalLimitPeriod;
    }

    public void setDisposalLimitPeriod(Integer disposalLimitPeriod) {
        this.disposalLimitPeriod = disposalLimitPeriod;
    }

    public Integer getExpectedUsagePeriod() {
        return expectedUsagePeriod;
    }

    public void setExpectedUsagePeriod(Integer expectedUsagePeriod) {
        this.expectedUsagePeriod = expectedUsagePeriod;
    }

    public RepairsBeforeParkHealthAssessmentProperty getRepairsBeforeParkHealthAssessment() {
        return repairsBeforeParkHealthAssessment;
    }

    public void setRepairsBeforeParkHealthAssessment(RepairsBeforeParkHealthAssessmentProperty repairsBeforeParkHealthAssessment) {
        this.repairsBeforeParkHealthAssessment = ModelObjects.setParent(repairsBeforeParkHealthAssessment, this);
    }

    public List<ParkHealthAssessmentProperty> getParkHealthAssessment() {
        if (parkHealthAssessment == null)
            parkHealthAssessment = new ChildList<>(this);

        return parkHealthAssessment;
    }

    public void setParkHealthAssessment(List<ParkHealthAssessmentProperty> parkHealthAssessment) {
        this.parkHealthAssessment = ModelObjects.setParent(parkHealthAssessment, this);
    }

    public Code getManagementType() {
        return managementType;
    }

    public void setManagementType(Code managementType) {
        this.managementType = ModelObjects.setParent(managementType, this);
    }

    public Year getExpectedRenewalYearWithMeasures() {
        return expectedRenewalYearWithMeasures;
    }

    public void setExpectedRenewalYearWithMeasures(Year expectedRenewalYearWithMeasures) {
        this.expectedRenewalYearWithMeasures = expectedRenewalYearWithMeasures;
    }

    public List<LongevityMeasuresProperty> getLongevityMeasures() {
        if (longevityMeasures == null)
            longevityMeasures = new ChildList<>(this);

        return longevityMeasures;
    }

    public void setLongevityMeasures(List<LongevityMeasuresProperty> longevityMeasures) {
        this.longevityMeasures = ModelObjects.setParent(longevityMeasures, this);
    }

    public String getNoteForLongevity() {
        return noteForLongevity;
    }

    public void setNoteForLongevity(String noteForLongevity) {
        this.noteForLongevity = noteForLongevity;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ParkFacilityLongevityPlanAttribute copy = target == null ? new ParkFacilityLongevityPlanAttribute() : (ParkFacilityLongevityPlanAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ParkFacilityLongevityPlanAttribute(), copyBuilder);
    }
}
