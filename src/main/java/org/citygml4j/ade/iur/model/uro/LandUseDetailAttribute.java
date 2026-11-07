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
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.Year;
import java.util.List;

public class LandUseDetailAttribute extends LandUseAttribute {
    private Code orgLandUse;
    private Measure nominalArea;
    private Code ownerType;
    private String owner;
    private Measure areaInSquareMeter;
    private Measure areaInHa;
    private Double buildingCoverageRate;
    private Double floorAreaRate;
    private Double specifiedBuildingCoverageRate;
    private Double specifiedFloorAreaRate;
    private Double standardFloorAreaRate;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private List<Code> districtsAndZonesType;
    private Code prefecture;
    private Code city;
    private String reference;
    private String note;
    private Year surveyYear;

    public Code getOrgLandUse() {
        return orgLandUse;
    }

    public void setOrgLandUse(Code orgLandUse) {
        this.orgLandUse = ModelObjects.setParent(orgLandUse, this);
    }

    public Measure getNominalArea() {
        return nominalArea;
    }

    public void setNominalArea(Measure nominalArea) {
        this.nominalArea = ModelObjects.setParent(nominalArea, this);
    }

    public Code getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Code ownerType) {
        this.ownerType = ModelObjects.setParent(ownerType, this);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Measure getAreaInSquareMeter() {
        return areaInSquareMeter;
    }

    public void setAreaInSquareMeter(Measure areaInSquareMeter) {
        this.areaInSquareMeter = ModelObjects.setParent(areaInSquareMeter, this);
    }

    public Measure getAreaInHa() {
        return areaInHa;
    }

    public void setAreaInHa(Measure areaInHa) {
        this.areaInHa = ModelObjects.setParent(areaInHa, this);
    }

    public Double getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    public void setBuildingCoverageRate(Double buildingCoverageRate) {
        this.buildingCoverageRate = buildingCoverageRate;
    }

    public Double getFloorAreaRate() {
        return floorAreaRate;
    }

    public void setFloorAreaRate(Double floorAreaRate) {
        this.floorAreaRate = floorAreaRate;
    }

    public Double getSpecifiedBuildingCoverageRate() {
        return specifiedBuildingCoverageRate;
    }

    public void setSpecifiedBuildingCoverageRate(Double specifiedBuildingCoverageRate) {
        this.specifiedBuildingCoverageRate = specifiedBuildingCoverageRate;
    }

    public Double getSpecifiedFloorAreaRate() {
        return specifiedFloorAreaRate;
    }

    public void setSpecifiedFloorAreaRate(Double specifiedFloorAreaRate) {
        this.specifiedFloorAreaRate = specifiedFloorAreaRate;
    }

    public Double getStandardFloorAreaRate() {
        return standardFloorAreaRate;
    }

    public void setStandardFloorAreaRate(Double standardFloorAreaRate) {
        this.standardFloorAreaRate = standardFloorAreaRate;
    }

    public Code getUrbanPlanType() {
        return urbanPlanType;
    }

    public void setUrbanPlanType(Code urbanPlanType) {
        this.urbanPlanType = ModelObjects.setParent(urbanPlanType, this);
    }

    public Code getAreaClassificationType() {
        return areaClassificationType;
    }

    public void setAreaClassificationType(Code areaClassificationType) {
        this.areaClassificationType = ModelObjects.setParent(areaClassificationType, this);
    }

    public List<Code> getDistrictsAndZonesType() {
        if (districtsAndZonesType == null)
            districtsAndZonesType = new ChildList<>(this);

        return districtsAndZonesType;
    }

    public void setDistrictsAndZonesType(List<Code> districtsAndZonesType) {
        this.districtsAndZonesType = ModelObjects.setParent(districtsAndZonesType, this);
    }

    public Code getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(Code prefecture) {
        this.prefecture = ModelObjects.setParent(prefecture, this);
    }

    public Code getCity() {
        return city;
    }

    public void setCity(Code city) {
        this.city = ModelObjects.setParent(city, this);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandUseDetailAttribute copy = target == null ? new LandUseDetailAttribute() : (LandUseDetailAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandUseDetailAttribute(), copyBuilder);
    }
}
