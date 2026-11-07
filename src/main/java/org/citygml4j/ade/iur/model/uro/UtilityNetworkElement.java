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
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.cityfurniture.CityFurniture;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.Year;
import java.util.List;

public abstract class UtilityNetworkElement extends CityFurniture implements ADEModelObject {
    private Code occupierType;
    private Code occupierName;
    private Year year;
    private Code yearType;
    private Code administrator;
    private List<OffsetDepthProperty> offsetDepth;
    private List<ThematicShapeProperty> thematicShape;

    public Code getOccupierType() {
        return occupierType;
    }

    public void setOccupierType(Code occupierType) {
        this.occupierType = ModelObjects.setParent(occupierType, this);
    }

    public Code getOccupierName() {
        return occupierName;
    }

    public void setOccupierName(Code occupierName) {
        this.occupierName = ModelObjects.setParent(occupierName, this);
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Code getYearType() {
        return yearType;
    }

    public void setYearType(Code yearType) {
        this.yearType = ModelObjects.setParent(yearType, this);
    }

    public Code getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Code administrator) {
        this.administrator = ModelObjects.setParent(administrator, this);
    }

    public List<OffsetDepthProperty> getOffsetDepth() {
        if (offsetDepth == null)
            offsetDepth = new ChildList<>(this);

        return offsetDepth;
    }

    public void setOffsetDepth(List<OffsetDepthProperty> offsetDepth) {
        this.offsetDepth = ModelObjects.setParent(offsetDepth, this);
    }

    public List<ThematicShapeProperty> getThematicShape() {
        if (thematicShape == null)
            thematicShape = new ChildList<>(this);

        return thematicShape;
    }

    public void setThematicShape(List<ThematicShapeProperty> thematicShape) {
        this.thematicShape = ModelObjects.setParent(thematicShape, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        UtilityNetworkElement copy = (UtilityNetworkElement) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UtilityNetworkElement.class, copyBuilder);
    }
}
