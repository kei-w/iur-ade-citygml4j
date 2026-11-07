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

public class Pipe extends UtilityLink {
    private Length innerDiamiter;
    private Length outerDiamiter;
    private Code sleeveType;

    public Length getInnerDiamiter() {
        return innerDiamiter;
    }

    public void setInnerDiamiter(Length innerDiamiter) {
        this.innerDiamiter = ModelObjects.setParent(innerDiamiter, this);
    }

    public Length getOuterDiamiter() {
        return outerDiamiter;
    }

    public void setOuterDiamiter(Length outerDiamiter) {
        this.outerDiamiter = ModelObjects.setParent(outerDiamiter, this);
    }

    public Code getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(Code sleeveType) {
        this.sleeveType = ModelObjects.setParent(sleeveType, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Pipe copy = target == null ? new Pipe() : (Pipe) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, Pipe.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Pipe(), copyBuilder);
    }
}
