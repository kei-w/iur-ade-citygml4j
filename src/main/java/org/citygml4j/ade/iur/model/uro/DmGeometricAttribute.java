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
import org.citygml4j.model.gml.measures.Length;

public class DmGeometricAttribute extends DmAttribute {
    private Code geometryType;
    private Code mapLevel;
    private Code shapeType;
    private Boolean visibility;
    private Boolean is3d;
    private Boolean isInstallation;
    private Boolean isEdited;
    private Boolean isSupplementarySymbol;
    private Double angle;
    private Length elevation;
    private GeometryProperty<? extends AbstractGeometry> lod0Geometry;

    public Code getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(Code geometryType) {
        this.geometryType = ModelObjects.setParent(geometryType, this);
    }

    public Code getMapLevel() {
        return mapLevel;
    }

    public void setMapLevel(Code mapLevel) {
        this.mapLevel = ModelObjects.setParent(mapLevel, this);
    }

    public Code getShapeType() {
        return shapeType;
    }

    public void setShapeType(Code shapeType) {
        this.shapeType = ModelObjects.setParent(shapeType, this);
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Boolean getIs3d() {
        return is3d;
    }

    public void setIs3d(Boolean is3d) {
        this.is3d = is3d;
    }

    public Boolean getIsInstallation() {
        return isInstallation;
    }

    public void setIsInstallation(Boolean isInstallation) {
        this.isInstallation = isInstallation;
    }

    public Boolean getIsEdited() {
        return isEdited;
    }

    public void setIsEdited(Boolean isEdited) {
        this.isEdited = isEdited;
    }

    public Boolean getIsSupplementarySymbol() {
        return isSupplementarySymbol;
    }

    public void setIsSupplementarySymbol(Boolean isSupplementarySymbol) {
        this.isSupplementarySymbol = isSupplementarySymbol;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public Length getElevation() {
        return elevation;
    }

    public void setElevation(Length elevation) {
        this.elevation = ModelObjects.setParent(elevation, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod0Geometry() {
        return lod0Geometry;
    }

    public void setLod0Geometry(GeometryProperty<? extends AbstractGeometry> lod0Geometry) {
        this.lod0Geometry = ModelObjects.setParent(lod0Geometry, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DmGeometricAttribute copy = target == null ? new DmGeometricAttribute() : (DmGeometricAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DmGeometricAttribute(), copyBuilder);
    }
}
