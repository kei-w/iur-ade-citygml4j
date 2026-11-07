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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;

import java.time.LocalDate;

public class KeyValuePair extends AbstractDataType {
    private Code key;
    private String stringValue;
    private Integer intValue;
    private Double doubleValue;
    private Code codeValue;
    private Measure measuredValue;
    private LocalDate dateValue;
    private String uriValue;

    public Code getKey() {
        return key;
    }

    public void setKey(Code key) {
        this.key = ModelObjects.setParent(key, this);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Code getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(Code codeValue) {
        this.codeValue = ModelObjects.setParent(codeValue, this);
    }

    public Measure getMeasuredValue() {
        return measuredValue;
    }

    public void setMeasuredValue(Measure measuredValue) {
        this.measuredValue = ModelObjects.setParent(measuredValue, this);
    }

    public LocalDate getDateValue() {
        return dateValue;
    }

    public void setDateValue(LocalDate dateValue) {
        this.dateValue = dateValue;
    }

    public String getUriValue() {
        return uriValue;
    }

    public void setUriValue(String uriValue) {
        this.uriValue = uriValue;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        KeyValuePair copy = target == null ? new KeyValuePair() : (KeyValuePair) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new KeyValuePair(), copyBuilder);
    }
}
