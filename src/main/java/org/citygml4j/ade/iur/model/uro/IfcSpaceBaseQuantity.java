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

public class IfcSpaceBaseQuantity extends IfcAttribute {
    private Length nominalHeight;
    private Length clearHeight;
    private Length finishCeilingHeight;
    private Length grossPerimeter;
    private Length netPerimeter;
    private Measure grossCeilingArea;
    private Measure grossFloorArea;
    private Measure netCeilingArea;
    private Measure netFloorArea;
    private Measure grossWallArea;
    private Measure netWallArea;
    private Measure grossVolume;
    private Measure netVolume;

    public Length getNominalHeight() {
        return nominalHeight;
    }

    public void setNominalHeight(Length nominalHeight) {
        this.nominalHeight = ModelObjects.setParent(nominalHeight, this);
    }

    public Length getClearHeight() {
        return clearHeight;
    }

    public void setClearHeight(Length clearHeight) {
        this.clearHeight = ModelObjects.setParent(clearHeight, this);
    }

    public Length getFinishCeilingHeight() {
        return finishCeilingHeight;
    }

    public void setFinishCeilingHeight(Length finishCeilingHeight) {
        this.finishCeilingHeight = ModelObjects.setParent(finishCeilingHeight, this);
    }

    public Length getGrossPerimeter() {
        return grossPerimeter;
    }

    public void setGrossPerimeter(Length grossPerimeter) {
        this.grossPerimeter = ModelObjects.setParent(grossPerimeter, this);
    }

    public Length getNetPerimeter() {
        return netPerimeter;
    }

    public void setNetPerimeter(Length netPerimeter) {
        this.netPerimeter = ModelObjects.setParent(netPerimeter, this);
    }

    public Measure getGrossCeilingArea() {
        return grossCeilingArea;
    }

    public void setGrossCeilingArea(Measure grossCeilingArea) {
        this.grossCeilingArea = ModelObjects.setParent(grossCeilingArea, this);
    }

    public Measure getGrossFloorArea() {
        return grossFloorArea;
    }

    public void setGrossFloorArea(Measure grossFloorArea) {
        this.grossFloorArea = ModelObjects.setParent(grossFloorArea, this);
    }

    public Measure getNetCeilingArea() {
        return netCeilingArea;
    }

    public void setNetCeilingArea(Measure netCeilingArea) {
        this.netCeilingArea = ModelObjects.setParent(netCeilingArea, this);
    }

    public Measure getNetFloorArea() {
        return netFloorArea;
    }

    public void setNetFloorArea(Measure netFloorArea) {
        this.netFloorArea = ModelObjects.setParent(netFloorArea, this);
    }

    public Measure getGrossWallArea() {
        return grossWallArea;
    }

    public void setGrossWallArea(Measure grossWallArea) {
        this.grossWallArea = ModelObjects.setParent(grossWallArea, this);
    }

    public Measure getNetWallArea() {
        return netWallArea;
    }

    public void setNetWallArea(Measure netWallArea) {
        this.netWallArea = ModelObjects.setParent(netWallArea, this);
    }

    public Measure getGrossVolume() {
        return grossVolume;
    }

    public void setGrossVolume(Measure grossVolume) {
        this.grossVolume = ModelObjects.setParent(grossVolume, this);
    }

    public Measure getNetVolume() {
        return netVolume;
    }

    public void setNetVolume(Measure netVolume) {
        this.netVolume = ModelObjects.setParent(netVolume, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcSpaceBaseQuantity copy = target == null ? new IfcSpaceBaseQuantity() : (IfcSpaceBaseQuantity) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcSpaceBaseQuantity(), copyBuilder);
    }
}
