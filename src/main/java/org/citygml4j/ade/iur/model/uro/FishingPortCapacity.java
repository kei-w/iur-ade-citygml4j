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
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

public class FishingPortCapacity extends FishingPortAttribute {
    private String capacity;
    private Measure weightCapacity;
    private Integer hullForm;
    private Integer shipNumber;
    private Measure waterDepth2m;
    private Measure waterDepth23m;
    private Measure waterDepth36m;
    private Measure waterDepth6m;
    private Length heightAboveAWL;
    private Length heightOnFoundations;
    private Length luminousRange;
    private String luminousColor;
    private Integer candlePower;
    private String lightType;
    private String period;
    private Integer maximumGroundingWeight;
    private Integer handleablePower;
    private Integer maximumWaterSupply;
    private String maximumRefueling;
    private Integer people;
    private String other;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Measure getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(Measure weightCapacity) {
        this.weightCapacity = ModelObjects.setParent(weightCapacity, this);
    }

    public Integer getHullForm() {
        return hullForm;
    }

    public void setHullForm(Integer hullForm) {
        this.hullForm = hullForm;
    }

    public Integer getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(Integer shipNumber) {
        this.shipNumber = shipNumber;
    }

    public Measure getWaterDepth2m() {
        return waterDepth2m;
    }

    public void setWaterDepth2m(Measure waterDepth2m) {
        this.waterDepth2m = ModelObjects.setParent(waterDepth2m, this);
    }

    public Measure getWaterDepth23m() {
        return waterDepth23m;
    }

    public void setWaterDepth23m(Measure waterDepth23m) {
        this.waterDepth23m = ModelObjects.setParent(waterDepth23m, this);
    }

    public Measure getWaterDepth36m() {
        return waterDepth36m;
    }

    public void setWaterDepth36m(Measure waterDepth36m) {
        this.waterDepth36m = ModelObjects.setParent(waterDepth36m, this);
    }

    public Measure getWaterDepth6m() {
        return waterDepth6m;
    }

    public void setWaterDepth6m(Measure waterDepth6m) {
        this.waterDepth6m = ModelObjects.setParent(waterDepth6m, this);
    }

    public Length getHeightAboveAWL() {
        return heightAboveAWL;
    }

    public void setHeightAboveAWL(Length heightAboveAWL) {
        this.heightAboveAWL = ModelObjects.setParent(heightAboveAWL, this);
    }

    public Length getHeightOnFoundations() {
        return heightOnFoundations;
    }

    public void setHeightOnFoundations(Length heightOnFoundations) {
        this.heightOnFoundations = ModelObjects.setParent(heightOnFoundations, this);
    }

    public Length getLuminousRange() {
        return luminousRange;
    }

    public void setLuminousRange(Length luminousRange) {
        this.luminousRange = ModelObjects.setParent(luminousRange, this);
    }

    public String getLuminousColor() {
        return luminousColor;
    }

    public void setLuminousColor(String luminousColor) {
        this.luminousColor = luminousColor;
    }

    public Integer getCandlePower() {
        return candlePower;
    }

    public void setCandlePower(Integer candlePower) {
        this.candlePower = candlePower;
    }

    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getMaximumGroundingWeight() {
        return maximumGroundingWeight;
    }

    public void setMaximumGroundingWeight(Integer maximumGroundingWeight) {
        this.maximumGroundingWeight = maximumGroundingWeight;
    }

    public Integer getHandleablePower() {
        return handleablePower;
    }

    public void setHandleablePower(Integer handleablePower) {
        this.handleablePower = handleablePower;
    }

    public Integer getMaximumWaterSupply() {
        return maximumWaterSupply;
    }

    public void setMaximumWaterSupply(Integer maximumWaterSupply) {
        this.maximumWaterSupply = maximumWaterSupply;
    }

    public String getMaximumRefueling() {
        return maximumRefueling;
    }

    public void setMaximumRefueling(String maximumRefueling) {
        this.maximumRefueling = maximumRefueling;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FishingPortCapacity copy = target == null ? new FishingPortCapacity() : (FishingPortCapacity) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FishingPortCapacity(), copyBuilder);
    }
}
