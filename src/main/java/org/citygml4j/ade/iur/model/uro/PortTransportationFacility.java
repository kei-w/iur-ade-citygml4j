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

public class PortTransportationFacility extends PortAttribute {
    private Code structureType;
    private String startingPoint;
    private Length length;
    private Measure area;
    private Length beddingWidth;
    private Integer numberOfLanes;
    private Integer parkingLotCapacityOfBus;
    private Integer parkingLotCapacityOfCars;
    private Code routeType;
    private Length heightToDigit;
    private Length heightLimit;
    private Length minimumWidth;
    private Length minimumDepth;
    private Integer numberOfAircraftParkingSpaces;
    private Code pavementType;
    private Code mainCargo;
    private Integer totalCost;
    private Integer subsidy;
    private String note;

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public Length getBeddingWidth() {
        return beddingWidth;
    }

    public void setBeddingWidth(Length beddingWidth) {
        this.beddingWidth = ModelObjects.setParent(beddingWidth, this);
    }

    public Integer getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(Integer numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public Integer getParkingLotCapacityOfBus() {
        return parkingLotCapacityOfBus;
    }

    public void setParkingLotCapacityOfBus(Integer parkingLotCapacityOfBus) {
        this.parkingLotCapacityOfBus = parkingLotCapacityOfBus;
    }

    public Integer getParkingLotCapacityOfCars() {
        return parkingLotCapacityOfCars;
    }

    public void setParkingLotCapacityOfCars(Integer parkingLotCapacityOfCars) {
        this.parkingLotCapacityOfCars = parkingLotCapacityOfCars;
    }

    public Code getRouteType() {
        return routeType;
    }

    public void setRouteType(Code routeType) {
        this.routeType = ModelObjects.setParent(routeType, this);
    }

    public Length getHeightToDigit() {
        return heightToDigit;
    }

    public void setHeightToDigit(Length heightToDigit) {
        this.heightToDigit = ModelObjects.setParent(heightToDigit, this);
    }

    public Length getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(Length heightLimit) {
        this.heightLimit = ModelObjects.setParent(heightLimit, this);
    }

    public Length getMinimumWidth() {
        return minimumWidth;
    }

    public void setMinimumWidth(Length minimumWidth) {
        this.minimumWidth = ModelObjects.setParent(minimumWidth, this);
    }

    public Length getMinimumDepth() {
        return minimumDepth;
    }

    public void setMinimumDepth(Length minimumDepth) {
        this.minimumDepth = ModelObjects.setParent(minimumDepth, this);
    }

    public Integer getNumberOfAircraftParkingSpaces() {
        return numberOfAircraftParkingSpaces;
    }

    public void setNumberOfAircraftParkingSpaces(Integer numberOfAircraftParkingSpaces) {
        this.numberOfAircraftParkingSpaces = numberOfAircraftParkingSpaces;
    }

    public Code getPavementType() {
        return pavementType;
    }

    public void setPavementType(Code pavementType) {
        this.pavementType = ModelObjects.setParent(pavementType, this);
    }

    public Code getMainCargo() {
        return mainCargo;
    }

    public void setMainCargo(Code mainCargo) {
        this.mainCargo = ModelObjects.setParent(mainCargo, this);
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
        PortTransportationFacility copy = target == null ? new PortTransportationFacility() : (PortTransportationFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PortTransportationFacility(), copyBuilder);
    }
}
