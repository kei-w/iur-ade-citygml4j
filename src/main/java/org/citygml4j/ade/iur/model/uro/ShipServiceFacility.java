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

import java.time.Year;

public class ShipServiceFacility extends PortAttribute {
    private String shipType;
    private Integer supplyAbility;
    private Code supplyAbilityUnit;
    private String mooringPlace;
    private Length length;
    private Length width;
    private Measure area;
    private Year acquisitionYear;
    private Integer totalCost;
    private String note;

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public Integer getSupplyAbility() {
        return supplyAbility;
    }

    public void setSupplyAbility(Integer supplyAbility) {
        this.supplyAbility = supplyAbility;
    }

    public Code getSupplyAbilityUnit() {
        return supplyAbilityUnit;
    }

    public void setSupplyAbilityUnit(Code supplyAbilityUnit) {
        this.supplyAbilityUnit = ModelObjects.setParent(supplyAbilityUnit, this);
    }

    public String getMooringPlace() {
        return mooringPlace;
    }

    public void setMooringPlace(String mooringPlace) {
        this.mooringPlace = mooringPlace;
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

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public Year getAcquisitionYear() {
        return acquisitionYear;
    }

    public void setAcquisitionYear(Year acquisitionYear) {
        this.acquisitionYear = acquisitionYear;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ShipServiceFacility copy = target == null ? new ShipServiceFacility() : (ShipServiceFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ShipServiceFacility(), copyBuilder);
    }
}
