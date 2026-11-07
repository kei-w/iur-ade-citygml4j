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
import org.citygml4j.model.gml.geometry.primitives.PointProperty;

public class ControlPoint extends AbstractDataType {
    private String startPost;
    private String endPost;
    private Code function;
    private ControlPointTypeProperty parameter;
    private PointProperty startPoint;
    private PointProperty endPoint;

    public String getStartPost() {
        return startPost;
    }

    public void setStartPost(String startPost) {
        this.startPost = startPost;
    }

    public String getEndPost() {
        return endPost;
    }

    public void setEndPost(String endPost) {
        this.endPost = endPost;
    }

    public Code getFunction() {
        return function;
    }

    public void setFunction(Code function) {
        this.function = ModelObjects.setParent(function, this);
    }

    public ControlPointTypeProperty getParameter() {
        return parameter;
    }

    public void setParameter(ControlPointTypeProperty parameter) {
        this.parameter = ModelObjects.setParent(parameter, this);
    }

    public PointProperty getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(PointProperty startPoint) {
        this.startPoint = ModelObjects.setParent(startPoint, this);
    }

    public PointProperty getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(PointProperty endPoint) {
        this.endPoint = ModelObjects.setParent(endPoint, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ControlPoint copy = target == null ? new ControlPoint() : (ControlPoint) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ControlPoint(), copyBuilder);
    }
}
