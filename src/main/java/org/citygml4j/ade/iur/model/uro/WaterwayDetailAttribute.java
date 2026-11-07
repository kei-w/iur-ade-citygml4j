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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

import java.util.ArrayList;
import java.util.List;

public class WaterwayDetailAttribute extends AbstractDataType {
    private String routeId;
    private Code routeDirection;
    private Length minimumWidth;
    private Length maximumWidth;
    private Length length;
    private String navigation;
    private Length plannedDepth;
    private Measure speedLimit;
    private List<String> targetShipType;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public Code getRouteDirection() {
        return routeDirection;
    }

    public void setRouteDirection(Code routeDirection) {
        this.routeDirection = ModelObjects.setParent(routeDirection, this);
    }

    public Length getMinimumWidth() {
        return minimumWidth;
    }

    public void setMinimumWidth(Length minimumWidth) {
        this.minimumWidth = ModelObjects.setParent(minimumWidth, this);
    }

    public Length getMaximumWidth() {
        return maximumWidth;
    }

    public void setMaximumWidth(Length maximumWidth) {
        this.maximumWidth = ModelObjects.setParent(maximumWidth, this);
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public Length getPlannedDepth() {
        return plannedDepth;
    }

    public void setPlannedDepth(Length plannedDepth) {
        this.plannedDepth = ModelObjects.setParent(plannedDepth, this);
    }

    public Measure getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Measure speedLimit) {
        this.speedLimit = ModelObjects.setParent(speedLimit, this);
    }

    public List<String> getTargetShipType() {
        if (targetShipType == null)
            targetShipType = new ArrayList<>();

        return targetShipType;
    }

    public void setTargetShipType(List<String> targetShipType) {
        this.targetShipType = targetShipType;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WaterwayDetailAttribute copy = target == null ? new WaterwayDetailAttribute() : (WaterwayDetailAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WaterwayDetailAttribute(), copyBuilder);
    }
}
