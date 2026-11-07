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
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.complexes.GeometricComplexProperty;

import java.util.List;

public class RailwayTrackAttribute extends AbstractDataType {
    private String routeName;
    private Code directionType;
    private Code trackType;
    private String startPost;
    private String endPost;
    private Code alignmentType;
    private GeometricComplexProperty lod2Network;
    private GeometricComplexProperty lod3Network;
    private List<ControlPointProperty> controlPoint;

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Code getDirectionType() {
        return directionType;
    }

    public void setDirectionType(Code directionType) {
        this.directionType = ModelObjects.setParent(directionType, this);
    }

    public Code getTrackType() {
        return trackType;
    }

    public void setTrackType(Code trackType) {
        this.trackType = ModelObjects.setParent(trackType, this);
    }

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

    public Code getAlignmentType() {
        return alignmentType;
    }

    public void setAlignmentType(Code alignmentType) {
        this.alignmentType = ModelObjects.setParent(alignmentType, this);
    }

    public GeometricComplexProperty getLod2Network() {
        return lod2Network;
    }

    public void setLod2Network(GeometricComplexProperty lod2Network) {
        this.lod2Network = ModelObjects.setParent(lod2Network, this);
    }

    public GeometricComplexProperty getLod3Network() {
        return lod3Network;
    }

    public void setLod3Network(GeometricComplexProperty lod3Network) {
        this.lod3Network = ModelObjects.setParent(lod3Network, this);
    }

    public List<ControlPointProperty> getControlPoint() {
        if (controlPoint == null)
            controlPoint = new ChildList<>(this);

        return controlPoint;
    }

    public void setControlPoint(List<ControlPointProperty> controlPoint) {
        this.controlPoint = ModelObjects.setParent(controlPoint, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RailwayTrackAttribute copy = target == null ? new RailwayTrackAttribute() : (RailwayTrackAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RailwayTrackAttribute(), copyBuilder);
    }
}
