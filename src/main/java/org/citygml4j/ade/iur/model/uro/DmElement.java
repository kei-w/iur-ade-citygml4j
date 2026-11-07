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

import java.time.YearMonth;

public class DmElement extends AbstractDataType {
    private Code locationType;
    private Code infoType;
    private String elementKey;
    private String hierarchyLevel;
    private Code dataType;
    private Code annotationType;
    private Code precisionType;
    private Code dislocationType;
    private Code breakType;
    private String attributeValue;
    private Code attributeType;
    private String attributeValueType;
    private YearMonth creationDate;
    private YearMonth updateDate;
    private YearMonth terminationDate;
    private String freeSpace;

    public Code getLocationType() {
        return locationType;
    }

    public void setLocationType(Code locationType) {
        this.locationType = ModelObjects.setParent(locationType, this);
    }

    public Code getInfoType() {
        return infoType;
    }

    public void setInfoType(Code infoType) {
        this.infoType = ModelObjects.setParent(infoType, this);
    }

    public String getElementKey() {
        return elementKey;
    }

    public void setElementKey(String elementKey) {
        this.elementKey = elementKey;
    }

    public String getHierarchyLevel() {
        return hierarchyLevel;
    }

    public void setHierarchyLevel(String hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    public Code getDataType() {
        return dataType;
    }

    public void setDataType(Code dataType) {
        this.dataType = ModelObjects.setParent(dataType, this);
    }

    public Code getAnnotationType() {
        return annotationType;
    }

    public void setAnnotationType(Code annotationType) {
        this.annotationType = ModelObjects.setParent(annotationType, this);
    }

    public Code getPrecisionType() {
        return precisionType;
    }

    public void setPrecisionType(Code precisionType) {
        this.precisionType = ModelObjects.setParent(precisionType, this);
    }

    public Code getDislocationType() {
        return dislocationType;
    }

    public void setDislocationType(Code dislocationType) {
        this.dislocationType = ModelObjects.setParent(dislocationType, this);
    }

    public Code getBreakType() {
        return breakType;
    }

    public void setBreakType(Code breakType) {
        this.breakType = ModelObjects.setParent(breakType, this);
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public Code getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(Code attributeType) {
        this.attributeType = ModelObjects.setParent(attributeType, this);
    }

    public String getAttributeValueType() {
        return attributeValueType;
    }

    public void setAttributeValueType(String attributeValueType) {
        this.attributeValueType = attributeValueType;
    }

    public YearMonth getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(YearMonth creationDate) {
        this.creationDate = creationDate;
    }

    public YearMonth getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(YearMonth updateDate) {
        this.updateDate = updateDate;
    }

    public YearMonth getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(YearMonth terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(String freeSpace) {
        this.freeSpace = freeSpace;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DmElement copy = target == null ? new DmElement() : (DmElement) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DmElement(), copyBuilder);
    }
}
