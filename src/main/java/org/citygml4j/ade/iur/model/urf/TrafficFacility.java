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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.measures.Length;

public class TrafficFacility extends UrbanFacility {
    private String startLocation;
    private String endLocation;
    private String viaLocations;
    private Length length;
    private Length width;
    private UrbanRoadAttributeProperty urbanRoadAttribute;
    private UrbanRapidTransitRailroadAttributeProperty urbanRapidTransitRailroadAttribute;
    private ParkingPlaceAttributeProperty parkingPlaceAttribute;
    private VehicleTerminalAttributeProperty vehicleTerminalAttribute;

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getViaLocations() {
        return viaLocations;
    }

    public void setViaLocations(String viaLocations) {
        this.viaLocations = viaLocations;
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

    public UrbanRoadAttributeProperty getUrbanRoadAttribute() {
        return urbanRoadAttribute;
    }

    public void setUrbanRoadAttribute(UrbanRoadAttributeProperty urbanRoadAttribute) {
        this.urbanRoadAttribute = ModelObjects.setParent(urbanRoadAttribute, this);
    }

    public UrbanRapidTransitRailroadAttributeProperty getUrbanRapidTransitRailroadAttribute() {
        return urbanRapidTransitRailroadAttribute;
    }

    public void setUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttributeProperty urbanRapidTransitRailroadAttribute) {
        this.urbanRapidTransitRailroadAttribute = ModelObjects.setParent(urbanRapidTransitRailroadAttribute, this);
    }

    public ParkingPlaceAttributeProperty getParkingPlaceAttribute() {
        return parkingPlaceAttribute;
    }

    public void setParkingPlaceAttribute(ParkingPlaceAttributeProperty parkingPlaceAttribute) {
        this.parkingPlaceAttribute = ModelObjects.setParent(parkingPlaceAttribute, this);
    }

    public VehicleTerminalAttributeProperty getVehicleTerminalAttribute() {
        return vehicleTerminalAttribute;
    }

    public void setVehicleTerminalAttribute(VehicleTerminalAttributeProperty vehicleTerminalAttribute) {
        this.vehicleTerminalAttribute = ModelObjects.setParent(vehicleTerminalAttribute, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TrafficFacility copy = target == null ? new TrafficFacility() : (TrafficFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrafficFacility(), copyBuilder);
    }
}
