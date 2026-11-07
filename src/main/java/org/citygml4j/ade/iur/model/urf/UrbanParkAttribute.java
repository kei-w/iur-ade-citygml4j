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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalDate;
import java.util.List;

public class UrbanParkAttribute extends AbstractDataType {
    private Code parkCode;
    private LocalDate startFrom;
    private List<BreakdownOfNominalAreaProperty> breakdownOfNominalArea;

    public Code getParkCode() {
        return parkCode;
    }

    public void setParkCode(Code parkCode) {
        this.parkCode = ModelObjects.setParent(parkCode, this);
    }

    public LocalDate getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(LocalDate startFrom) {
        this.startFrom = startFrom;
    }

    public List<BreakdownOfNominalAreaProperty> getBreakdownOfNominalArea() {
        if (breakdownOfNominalArea == null)
            breakdownOfNominalArea = new ChildList<>(this);

        return breakdownOfNominalArea;
    }

    public void setBreakdownOfNominalArea(List<BreakdownOfNominalAreaProperty> breakdownOfNominalArea) {
        this.breakdownOfNominalArea = ModelObjects.setParent(breakdownOfNominalArea, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrbanParkAttribute copy = target == null ? new UrbanParkAttribute() : (UrbanParkAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrbanParkAttribute(), copyBuilder);
    }
}
