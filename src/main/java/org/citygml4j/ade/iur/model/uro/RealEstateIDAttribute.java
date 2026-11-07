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

import java.util.ArrayList;
import java.util.List;

public class RealEstateIDAttribute extends BuildingAttribute {
    private String realEstateIDOfBuilding;
    private Integer numberOfBuildingUnitOwnership;
    private List<String> realEstateIDOfBuildingUnitOwnership;
    private Integer numberOfRealEstateIDOfLand;
    private List<String> realEstateIDOfLand;
    private Integer matchingScore;

    public String getRealEstateIDOfBuilding() {
        return realEstateIDOfBuilding;
    }

    public void setRealEstateIDOfBuilding(String realEstateIDOfBuilding) {
        this.realEstateIDOfBuilding = realEstateIDOfBuilding;
    }

    public Integer getNumberOfBuildingUnitOwnership() {
        return numberOfBuildingUnitOwnership;
    }

    public void setNumberOfBuildingUnitOwnership(Integer numberOfBuildingUnitOwnership) {
        this.numberOfBuildingUnitOwnership = numberOfBuildingUnitOwnership;
    }

    public List<String> getRealEstateIDOfBuildingUnitOwnership() {
        if (realEstateIDOfBuildingUnitOwnership == null)
            realEstateIDOfBuildingUnitOwnership = new ArrayList<>();

        return realEstateIDOfBuildingUnitOwnership;
    }

    public void setRealEstateIDOfBuildingUnitOwnership(List<String> realEstateIDOfBuildingUnitOwnership) {
        this.realEstateIDOfBuildingUnitOwnership = realEstateIDOfBuildingUnitOwnership;
    }

    public Integer getNumberOfRealEstateIDOfLand() {
        return numberOfRealEstateIDOfLand;
    }

    public void setNumberOfRealEstateIDOfLand(Integer numberOfRealEstateIDOfLand) {
        this.numberOfRealEstateIDOfLand = numberOfRealEstateIDOfLand;
    }

    public List<String> getRealEstateIDOfLand() {
        if (realEstateIDOfLand == null)
            realEstateIDOfLand = new ArrayList<>();

        return realEstateIDOfLand;
    }

    public void setRealEstateIDOfLand(List<String> realEstateIDOfLand) {
        this.realEstateIDOfLand = realEstateIDOfLand;
    }

    public Integer getMatchingScore() {
        return matchingScore;
    }

    public void setMatchingScore(Integer matchingScore) {
        this.matchingScore = matchingScore;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RealEstateIDAttribute copy = target == null ? new RealEstateIDAttribute() : (RealEstateIDAttribute) target;
        super.copyTo(target, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RealEstateIDAttribute(), copyBuilder);
    }
}
