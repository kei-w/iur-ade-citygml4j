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
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.measures.Length;

public class StructureDetails extends AbstractDataType {
    private String startLocation;
    private String endLocation;
    private String viaLocations;
    private Length length;
    private Code structureType;
    private Length minimumWidth;
    private Length maximumWidth;
    private Length standardWidth;
    private Code crossType;

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

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
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

    public Length getStandardWidth() {
        return standardWidth;
    }

    public void setStandardWidth(Length standardWidth) {
        this.standardWidth = ModelObjects.setParent(standardWidth, this);
    }

    public Code getCrossType() {
        return crossType;
    }

    public void setCrossType(Code crossType) {
        this.crossType = ModelObjects.setParent(crossType, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        StructureDetails copy = target == null ? new StructureDetails() : (StructureDetails) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new StructureDetails(), copyBuilder);
    }
}
