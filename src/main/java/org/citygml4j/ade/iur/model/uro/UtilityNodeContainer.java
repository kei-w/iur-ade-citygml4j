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
import org.citygml4j.model.gml.measures.Length;

import java.util.ArrayList;
import java.util.List;

public abstract class UtilityNodeContainer extends UtilityNetworkElement {
    private Code containerType;
    private Length innerDiamiterLong;
    private Length outerDiamiterLong;
    private Length innerDiamiterShort;
    private Length outerDiamiterShort;
    private Length depth;
    private List<String> appurtenance;
    private Double rotationAngle;

    public Code getContainerType() {
        return containerType;
    }

    public void setContainerType(Code containerType) {
        this.containerType = ModelObjects.setParent(containerType, this);
    }

    public Length getInnerDiamiterLong() {
        return innerDiamiterLong;
    }

    public void setInnerDiamiterLong(Length innerDiamiterLong) {
        this.innerDiamiterLong = ModelObjects.setParent(innerDiamiterLong, this);
    }

    public Length getOuterDiamiterLong() {
        return outerDiamiterLong;
    }

    public void setOuterDiamiterLong(Length outerDiamiterLong) {
        this.outerDiamiterLong = ModelObjects.setParent(outerDiamiterLong, this);
    }

    public Length getInnerDiamiterShort() {
        return innerDiamiterShort;
    }

    public void setInnerDiamiterShort(Length innerDiamiterShort) {
        this.innerDiamiterShort = ModelObjects.setParent(innerDiamiterShort, this);
    }

    public Length getOuterDiamiterShort() {
        return outerDiamiterShort;
    }

    public void setOuterDiamiterShort(Length outerDiamiterShort) {
        this.outerDiamiterShort = ModelObjects.setParent(outerDiamiterShort, this);
    }

    public Length getDepth() {
        return depth;
    }

    public void setDepth(Length depth) {
        this.depth = ModelObjects.setParent(depth, this);
    }

    public List<String> getAppurtenance() {
        if (appurtenance == null)
            appurtenance = new ArrayList<>();

        return appurtenance;
    }

    public void setAppurtenance(List<String> appurtenance) {
        this.appurtenance = appurtenance;
    }

    public Double getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        UtilityNodeContainer copy = (UtilityNodeContainer) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UtilityNodeContainer.class, copyBuilder);
    }
}
