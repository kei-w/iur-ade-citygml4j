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
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

import java.util.List;

public class TunnelStructureAttribute extends AbstractDataType {
    private Code tunnelType;
    private Code tunnelSubtype;
    private List<Code> mouthType;
    private Length length;
    private Length width;
    private Measure area;
    private Length innerHeight;
    private Length effectiveHeight;
    private Code slopeType;

    public Code getTunnelType() {
        return tunnelType;
    }

    public void setTunnelType(Code tunnelType) {
        this.tunnelType = ModelObjects.setParent(tunnelType, this);
    }

    public Code getTunnelSubtype() {
        return tunnelSubtype;
    }

    public void setTunnelSubtype(Code tunnelSubtype) {
        this.tunnelSubtype = ModelObjects.setParent(tunnelSubtype, this);
    }

    public List<Code> getMouthType() {
        if (mouthType == null)
            mouthType = new ChildList<>(this);

        return mouthType;
    }

    public void setMouthType(List<Code> mouthType) {
        this.mouthType = ModelObjects.setParent(mouthType, this);
    }

    public Length getLength() {
        return length;
    }

    public void setLength(Length length) {
        this.length = ModelObjects.setParent(length, this);
    }

    public Length getWidth() {
        return width;
    }

    public void setWidth(Length width) {
        this.width = ModelObjects.setParent(width, this);
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public Length getInnerHeight() {
        return innerHeight;
    }

    public void setInnerHeight(Length innerHeight) {
        this.innerHeight = ModelObjects.setParent(innerHeight, this);
    }

    public Length getEffectiveHeight() {
        return effectiveHeight;
    }

    public void setEffectiveHeight(Length effectiveHeight) {
        this.effectiveHeight = ModelObjects.setParent(effectiveHeight, this);
    }

    public Code getSlopeType() {
        return slopeType;
    }

    public void setSlopeType(Code slopeType) {
        this.slopeType = ModelObjects.setParent(slopeType, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TunnelStructureAttribute copy = target == null ? new TunnelStructureAttribute() : (TunnelStructureAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TunnelStructureAttribute(), copyBuilder);
    }
}
