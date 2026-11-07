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
import org.citygml4j.model.gml.base.StringOrRef;
import org.citygml4j.model.gml.basicTypes.Code;

public class SewerSystemAttribute extends AbstractDataType {
    private String startLocation;
    private String endLocation;
    private Code systemType;
    private StringOrRef drainageArea;

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

    public Code getSystemType() {
        return systemType;
    }

    public void setSystemType(Code systemType) {
        this.systemType = ModelObjects.setParent(systemType, this);
    }

    public StringOrRef getDrainageArea() {
        return drainageArea;
    }

    public void setDrainageArea(StringOrRef drainageArea) {
        this.drainageArea = ModelObjects.setParent(drainageArea, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SewerSystemAttribute copy = target == null ? new SewerSystemAttribute() : (SewerSystemAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SewerSystemAttribute(), copyBuilder);
    }
}
