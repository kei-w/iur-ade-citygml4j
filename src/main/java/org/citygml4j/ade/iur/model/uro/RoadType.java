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

import java.time.LocalDate;

public class RoadType extends AbstractDataType {
    private String id;
    private LocalDate creationDate;
    private Boolean isTemporary;
    private Code roadType;
    private Code widthType;
    private Boolean isTollRoad;
    private Length separator;
    private Boolean isHighWay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getIsTemporary() {
        return isTemporary;
    }

    public void setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
    }

    public Code getRoadType() {
        return roadType;
    }

    public void setRoadType(Code roadType) {
        this.roadType = ModelObjects.setParent(roadType, this);
    }

    public Code getWidthType() {
        return widthType;
    }

    public void setWidthType(Code widthType) {
        this.widthType = ModelObjects.setParent(widthType, this);
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

    public Boolean getIsHighWay() {
        return isHighWay;
    }

    public void setIsHighWay(Boolean isHighWay) {
        this.isHighWay = isHighWay;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RoadType copy = target == null ? new RoadType() : (RoadType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RoadType(), copyBuilder);
    }
}
