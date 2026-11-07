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
import org.citygml4j.model.gml.measures.Length;

import java.time.Year;
import java.util.List;

public class BuildingDetailAttribute extends BuildingAttribute {
    private String serialNumberOfBuildingCertification;
    private Measure siteArea;
    private Measure totalFloorArea;
    private Measure buildingFootprintArea;
    private Measure buildingRoofEdgeArea;
    private Measure developmentArea;
    private Code buildingStructureType;
    private Code buildingStructureOrgType;
    private Code fireproofStructureType;
    private String implementingBody;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private List<Code> districtsAndZonesType;
    private Code landUseType;
    private String reference;
    private Code majorUsage;
    private Code majorUsage2;
    private Code orgUsage;
    private Code orgUsage2;
    private Code detailedUsage;
    private Code detailedUsage2;
    private Code detailedUsage3;
    private Code groundFloorUsage;
    private Code secondFloorUsage;
    private Code thirdFloorUsage;
    private Code basementUsage;
    private Code basementFirstUsage;
    private Code basementSecondUsage;
    private Code vacancy;
    private Double buildingCoverageRate;
    private Double floorAreaRate;
    private Double specifiedBuildingCoverageRate;
    private Double specifiedFloorAreaRate;
    private Double standardFloorAreaRate;
    private Length buildingHeight;
    private Length eaveHeight;
    private String note;
    private Year surveyYear;

    public String getSerialNumberOfBuildingCertification() {
        return serialNumberOfBuildingCertification;
    }

    public void setSerialNumberOfBuildingCertification(String serialNumberOfBuildingCertification) {
        this.serialNumberOfBuildingCertification = serialNumberOfBuildingCertification;
    }

    public Measure getSiteArea() {
        return siteArea;
    }

    public void setSiteArea(Measure siteArea) {
        this.siteArea = ModelObjects.setParent(siteArea, this);
    }

    public Measure getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(Measure totalFloorArea) {
        this.totalFloorArea = ModelObjects.setParent(totalFloorArea, this);
    }

    public Measure getBuildingFootprintArea() {
        return buildingFootprintArea;
    }

    public void setBuildingFootprintArea(Measure buildingFootprintArea) {
        this.buildingFootprintArea = ModelObjects.setParent(buildingFootprintArea, this);
    }

    public Measure getBuildingRoofEdgeArea() {
        return buildingRoofEdgeArea;
    }

    public void setBuildingRoofEdgeArea(Measure buildingRoofEdgeArea) {
        this.buildingRoofEdgeArea = ModelObjects.setParent(buildingRoofEdgeArea, this);
    }

    public Measure getDevelopmentArea() {
        return developmentArea;
    }

    public void setDevelopmentArea(Measure developmentArea) {
        this.developmentArea = ModelObjects.setParent(developmentArea, this);
    }

    public Code getBuildingStructureType() {
        return buildingStructureType;
    }

    public void setBuildingStructureType(Code buildingStructureType) {
        this.buildingStructureType = ModelObjects.setParent(buildingStructureType, this);
    }

    public Code getBuildingStructureOrgType() {
        return buildingStructureOrgType;
    }

    public void setBuildingStructureOrgType(Code buildingStructureOrgType) {
        this.buildingStructureOrgType = ModelObjects.setParent(buildingStructureOrgType, this);
    }

    public Code getFireproofStructureType() {
        return fireproofStructureType;
    }

    public void setFireproofStructureType(Code fireproofStructureType) {
        this.fireproofStructureType = ModelObjects.setParent(fireproofStructureType, this);
    }

    public String getImplementingBody() {
        return implementingBody;
    }

    public void setImplementingBody(String implementingBody) {
        this.implementingBody = implementingBody;
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

    public Code getLandUseType() {
        return landUseType;
    }

    public void setLandUseType(Code landUseType) {
        this.landUseType = ModelObjects.setParent(landUseType, this);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Code getMajorUsage() {
        return majorUsage;
    }

    public void setMajorUsage(Code majorUsage) {
        this.majorUsage = ModelObjects.setParent(majorUsage, this);
    }

    public Code getMajorUsage2() {
        return majorUsage2;
    }

    public void setMajorUsage2(Code majorUsage2) {
        this.majorUsage2 = ModelObjects.setParent(majorUsage2, this);
    }

    public Code getOrgUsage() {
        return orgUsage;
    }

    public void setOrgUsage(Code orgUsage) {
        this.orgUsage = ModelObjects.setParent(orgUsage, this);
    }

    public Code getOrgUsage2() {
        return orgUsage2;
    }

    public void setOrgUsage2(Code orgUsage2) {
        this.orgUsage2 = ModelObjects.setParent(orgUsage2, this);
    }

    public Code getDetailedUsage() {
        return detailedUsage;
    }

    public void setDetailedUsage(Code detailedUsage) {
        this.detailedUsage = ModelObjects.setParent(detailedUsage, this);
    }

    public Code getDetailedUsage2() {
        return detailedUsage2;
    }

    public void setDetailedUsage2(Code detailedUsage2) {
        this.detailedUsage2 = ModelObjects.setParent(detailedUsage2, this);
    }

    public Code getDetailedUsage3() {
        return detailedUsage3;
    }

    public void setDetailedUsage3(Code detailedUsage3) {
        this.detailedUsage3 = ModelObjects.setParent(detailedUsage3, this);
    }

    public Code getGroundFloorUsage() {
        return groundFloorUsage;
    }

    public void setGroundFloorUsage(Code groundFloorUsage) {
        this.groundFloorUsage = ModelObjects.setParent(groundFloorUsage, this);
    }

    public Code getSecondFloorUsage() {
        return secondFloorUsage;
    }

    public void setSecondFloorUsage(Code secondFloorUsage) {
        this.secondFloorUsage = ModelObjects.setParent(secondFloorUsage, this);
    }

    public Code getThirdFloorUsage() {
        return thirdFloorUsage;
    }

    public void setThirdFloorUsage(Code thirdFloorUsage) {
        this.thirdFloorUsage = ModelObjects.setParent(thirdFloorUsage, this);
    }

    public Code getBasementUsage() {
        return basementUsage;
    }

    public void setBasementUsage(Code basementUsage) {
        this.basementUsage = ModelObjects.setParent(basementUsage, this);
    }

    public Code getBasementFirstUsage() {
        return basementFirstUsage;
    }

    public void setBasementFirstUsage(Code basementFirstUsage) {
        this.basementFirstUsage = ModelObjects.setParent(basementFirstUsage, this);
    }

    public Code getBasementSecondUsage() {
        return basementSecondUsage;
    }

    public void setBasementSecondUsage(Code basementSecondUsage) {
        this.basementSecondUsage = ModelObjects.setParent(basementSecondUsage, this);
    }

    public Code getVacancy() {
        return vacancy;
    }

    public void setVacancy(Code vacancy) {
        this.vacancy = ModelObjects.setParent(vacancy, this);
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

    public Length getBuildingHeight() {
        return buildingHeight;
    }

    public void setBuildingHeight(Length buildingHeight) {
        this.buildingHeight = ModelObjects.setParent(buildingHeight, this);
    }

    public Length getEaveHeight() {
        return eaveHeight;
    }

    public void setEaveHeight(Length eaveHeight) {
        this.eaveHeight = ModelObjects.setParent(eaveHeight, this);
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
        BuildingDetailAttribute copy = target == null ? new BuildingDetailAttribute() : (BuildingDetailAttribute) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingDetailAttribute(), copyBuilder);
    }
}
