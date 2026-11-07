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
import org.citygml4j.model.gml.measures.Length;

public class TransitionCurveType extends AbstractDataType {
    private Length intersection;
    private Length distance;
    private Length curveLength;

    public Length getIntersection() {
        return intersection;
    }

    public void setIntersection(Length intersection) {
        this.intersection = ModelObjects.setParent(intersection, this);
    }

    public Length getDistance() {
        return distance;
    }

    public void setDistance(Length distance) {
        this.distance = ModelObjects.setParent(distance, this);
    }

    public Length getCurveLength() {
        return curveLength;
    }

    public void setCurveLength(Length curveLength) {
        this.curveLength = ModelObjects.setParent(curveLength, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TransitionCurveType copy = target == null ? new TransitionCurveType() : (TransitionCurveType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TransitionCurveType(), copyBuilder);
    }
}
