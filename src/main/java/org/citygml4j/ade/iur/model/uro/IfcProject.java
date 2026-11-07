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
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class IfcProject extends IfcObject {
    private String longName;
    private String phase;
    private IfcGeometricRepresentationContextProperty representationContexts;
    private List<IfcUnitProperty> unitsInContext;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public IfcGeometricRepresentationContextProperty getRepresentationContexts() {
        return representationContexts;
    }

    public void setRepresentationContexts(IfcGeometricRepresentationContextProperty representationContexts) {
        this.representationContexts = ModelObjects.setParent(representationContexts, this);
    }

    public List<IfcUnitProperty> getUnitsInContext() {
        if (unitsInContext == null)
            unitsInContext = new ChildList<>(this);

        return unitsInContext;
    }

    public void setUnitsInContext(List<IfcUnitProperty> unitsInContext) {
        this.unitsInContext = ModelObjects.setParent(unitsInContext, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcProject copy = target == null ? new IfcProject() : (IfcProject) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcProject(), copyBuilder);
    }
}
