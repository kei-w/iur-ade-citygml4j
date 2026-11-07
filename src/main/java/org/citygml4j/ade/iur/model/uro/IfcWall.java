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

public class IfcWall extends IfcBuildingElement {
    private Length nominalLength;
    private Length nominalWidth;
    private Length nominalHeight;
    private Measure grossFootPrintArea;
    private Measure netFootPrintArea;
    private Measure grossSideArea;
    private Measure netSideArea;
    private Measure grossSideAreaLeft;
    private Measure netSideAreaLeft;
    private Measure grossSideAreaRight;
    private Measure netSideAreaRight;
    private Measure grossVolume;
    private Measure netVolume;

    public Length getNominalLength() {
        return nominalLength;
    }

    public void setNominalLength(Length nominalLength) {
        this.nominalLength = ModelObjects.setParent(nominalLength, this);
    }

    public Length getNominalWidth() {
        return nominalWidth;
    }

    public void setNominalWidth(Length nominalWidth) {
        this.nominalWidth = ModelObjects.setParent(nominalWidth, this);
    }

    public Length getNominalHeight() {
        return nominalHeight;
    }

    public void setNominalHeight(Length nominalHeight) {
        this.nominalHeight = ModelObjects.setParent(nominalHeight, this);
    }

    public Measure getGrossFootPrintArea() {
        return grossFootPrintArea;
    }

    public void setGrossFootPrintArea(Measure grossFootPrintArea) {
        this.grossFootPrintArea = ModelObjects.setParent(grossFootPrintArea, this);
    }

    public Measure getNetFootPrintArea() {
        return netFootPrintArea;
    }

    public void setNetFootPrintArea(Measure netFootPrintArea) {
        this.netFootPrintArea = ModelObjects.setParent(netFootPrintArea, this);
    }

    public Measure getGrossSideArea() {
        return grossSideArea;
    }

    public void setGrossSideArea(Measure grossSideArea) {
        this.grossSideArea = ModelObjects.setParent(grossSideArea, this);
    }

    public Measure getNetSideArea() {
        return netSideArea;
    }

    public void setNetSideArea(Measure netSideArea) {
        this.netSideArea = ModelObjects.setParent(netSideArea, this);
    }

    public Measure getGrossSideAreaLeft() {
        return grossSideAreaLeft;
    }

    public void setGrossSideAreaLeft(Measure grossSideAreaLeft) {
        this.grossSideAreaLeft = ModelObjects.setParent(grossSideAreaLeft, this);
    }

    public Measure getNetSideAreaLeft() {
        return netSideAreaLeft;
    }

    public void setNetSideAreaLeft(Measure netSideAreaLeft) {
        this.netSideAreaLeft = ModelObjects.setParent(netSideAreaLeft, this);
    }

    public Measure getGrossSideAreaRight() {
        return grossSideAreaRight;
    }

    public void setGrossSideAreaRight(Measure grossSideAreaRight) {
        this.grossSideAreaRight = ModelObjects.setParent(grossSideAreaRight, this);
    }

    public Measure getNetSideAreaRight() {
        return netSideAreaRight;
    }

    public void setNetSideAreaRight(Measure netSideAreaRight) {
        this.netSideAreaRight = ModelObjects.setParent(netSideAreaRight, this);
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
        IfcWall copy = target == null ? new IfcWall() : (IfcWall) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, IfcWall.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcWall(), copyBuilder);
    }
}
