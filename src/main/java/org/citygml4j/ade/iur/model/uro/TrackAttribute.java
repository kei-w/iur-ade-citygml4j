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
import org.citygml4j.model.gml.measures.Length;

import java.util.ArrayList;
import java.util.List;

public class TrackAttribute extends AbstractDataType {
    private List<String> alternativeName;
    private Code adminType;
    private Integer relativeLevel;
    private Code widthType;
    private Code structureType;
    private Boolean isTollRoad;
    private Length separator;

    public List<String> getAlternativeName() {
        if (alternativeName == null)
            alternativeName = new ArrayList<>();

        return alternativeName;
    }

    public void setAlternativeName(List<String> alternativeName) {
        this.alternativeName = alternativeName;
    }

    public Code getAdminType() {
        return adminType;
    }

    public void setAdminType(Code adminType) {
        this.adminType = ModelObjects.setParent(adminType, this);
    }

    public Integer getRelativeLevel() {
        return relativeLevel;
    }

    public void setRelativeLevel(Integer relativeLevel) {
        this.relativeLevel = relativeLevel;
    }

    public Code getWidthType() {
        return widthType;
    }

    public void setWidthType(Code widthType) {
        this.widthType = ModelObjects.setParent(widthType, this);
    }

    public Code getStructureType() {
        return structureType;
    }

    public void setStructureType(Code structureType) {
        this.structureType = ModelObjects.setParent(structureType, this);
    }

    public Boolean getIsTollRoad() {
        return isTollRoad;
    }

    public void setIsTollRoad(Boolean isTollRoad) {
        this.isTollRoad = isTollRoad;
    }

    public Length getSeparator() {
        return separator;
    }

    public void setSeparator(Length separator) {
        this.separator = ModelObjects.setParent(separator, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TrackAttribute copy = target == null ? new TrackAttribute() : (TrackAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrackAttribute(), copyBuilder);
    }
}
