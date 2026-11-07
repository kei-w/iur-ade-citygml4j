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
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

import java.util.List;

public class IfcAxis2Placement3D extends AbstractDataType {
    private PointProperty location;
    private List<Double> axis;
    private List<Double> refDirection;

    public PointProperty getLocation() {
        return location;
    }

    public void setLocation(PointProperty location) {
        this.location = ModelObjects.setParent(location, this);
    }

    public List<Double> getAxis() {
        return axis;
    }

    public void setAxis(List<Double> axis) {
        this.axis = axis;
    }

    public List<Double> getRefDirection() {
        return refDirection;
    }

    public void setRefDirection(List<Double> refDirection) {
        this.refDirection = refDirection;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcAxis2Placement3D copy = target == null ? new IfcAxis2Placement3D() : (IfcAxis2Placement3D) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcAxis2Placement3D(), copyBuilder);
    }
}
