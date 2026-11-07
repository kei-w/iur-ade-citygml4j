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

public class PortPollutionControlFacility extends PortAttribute {
    private Length length;
    private Length width;
    private Measure crossSectionalArea;
    private Measure area;
    private Length height;
    private Code mainMaterial;
    private Integer totalCost;
    private Integer subsidy;
    private String note;

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

    public Measure getCrossSectionalArea() {
        return crossSectionalArea;
    }

    public void setCrossSectionalArea(Measure crossSectionalArea) {
        this.crossSectionalArea = ModelObjects.setParent(crossSectionalArea, this);
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public Length getHeight() {
        return height;
    }

    public void setHeight(Length height) {
        this.height = ModelObjects.setParent(height, this);
    }

    public Code getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(Code mainMaterial) {
        this.mainMaterial = ModelObjects.setParent(mainMaterial, this);
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
        PortPollutionControlFacility copy = target == null ? new PortPollutionControlFacility() : (PortPollutionControlFacility) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PortPollutionControlFacility(), copyBuilder);
    }
}
