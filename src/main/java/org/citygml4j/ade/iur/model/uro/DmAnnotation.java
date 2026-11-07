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
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.geometry.AbstractGeometry;
import org.citygml4j.model.gml.geometry.GeometryProperty;

public class DmAnnotation extends DmAttribute {
    private Code geometryType;
    private Code shapeType;
    private String label;
    private Boolean isVertical;
    private Integer size;
    private Integer orientation;
    private Integer linewidth;
    private Integer spacing;
    private GeometryProperty<? extends AbstractGeometry> lod0anchorPoint;

    public Code getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(Code geometryType) {
        this.geometryType = ModelObjects.setParent(geometryType, this);
    }

    public Code getShapeType() {
        return shapeType;
    }

    public void setShapeType(Code shapeType) {
        this.shapeType = ModelObjects.setParent(shapeType, this);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    public Integer getLinewidth() {
        return linewidth;
    }

    public void setLinewidth(Integer linewidth) {
        this.linewidth = linewidth;
    }

    public Integer getSpacing() {
        return spacing;
    }

    public void setSpacing(Integer spacing) {
        this.spacing = spacing;
    }

    public GeometryProperty<? extends AbstractGeometry> getLod0anchorPoint() {
        return lod0anchorPoint;
    }

    public void setLod0anchorPoint(GeometryProperty<? extends AbstractGeometry> lod0anchorPoint) {
        this.lod0anchorPoint = ModelObjects.setParent(lod0anchorPoint, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DmAnnotation copy = target == null ? new DmAnnotation() : (DmAnnotation) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DmAnnotation(), copyBuilder);
    }
}
