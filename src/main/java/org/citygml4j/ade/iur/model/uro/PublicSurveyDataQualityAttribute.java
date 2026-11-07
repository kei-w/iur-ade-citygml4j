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

import java.util.List;

public class PublicSurveyDataQualityAttribute extends AbstractDataType {
    private Code srcScaleLod0;
    private Code srcScaleLod1;
    private Code srcScaleLod2;
    private Code srcScaleLod3;
    private Code srcScaleLod4;
    private List<Code> publicSurveySrcDescLod0;
    private List<Code> publicSurveySrcDescLod1;
    private List<Code> publicSurveySrcDescLod2;
    private List<Code> publicSurveySrcDescLod3;
    private List<Code> publicSurveySrcDescLod4;

    public Code getSrcScaleLod0() {
        return srcScaleLod0;
    }

    public void setSrcScaleLod0(Code srcScaleLod0) {
        this.srcScaleLod0 = ModelObjects.setParent(srcScaleLod0, this);
    }

    public Code getSrcScaleLod1() {
        return srcScaleLod1;
    }

    public void setSrcScaleLod1(Code srcScaleLod1) {
        this.srcScaleLod1 = ModelObjects.setParent(srcScaleLod1, this);
    }

    public Code getSrcScaleLod2() {
        return srcScaleLod2;
    }

    public void setSrcScaleLod2(Code srcScaleLod2) {
        this.srcScaleLod2 = ModelObjects.setParent(srcScaleLod2, this);
    }

    public Code getSrcScaleLod3() {
        return srcScaleLod3;
    }

    public void setSrcScaleLod3(Code srcScaleLod3) {
        this.srcScaleLod3 = ModelObjects.setParent(srcScaleLod3, this);
    }

    public Code getSrcScaleLod4() {
        return srcScaleLod4;
    }

    public void setSrcScaleLod4(Code srcScaleLod4) {
        this.srcScaleLod4 = ModelObjects.setParent(srcScaleLod4, this);
    }

    public List<Code> getPublicSurveySrcDescLod0() {
        if (publicSurveySrcDescLod0 == null)
            publicSurveySrcDescLod0 = new ChildList<>(this);

        return publicSurveySrcDescLod0;
    }

    public void setPublicSurveySrcDescLod0(List<Code> publicSurveySrcDescLod0) {
        this.publicSurveySrcDescLod0 = ModelObjects.setParent(publicSurveySrcDescLod0, this);
    }

    public List<Code> getPublicSurveySrcDescLod1() {
        if (publicSurveySrcDescLod1 == null)
            publicSurveySrcDescLod1 = new ChildList<>(this);

        return publicSurveySrcDescLod1;
    }

    public void setPublicSurveySrcDescLod1(List<Code> publicSurveySrcDescLod1) {
        this.publicSurveySrcDescLod1 = ModelObjects.setParent(publicSurveySrcDescLod1, this);
    }

    public List<Code> getPublicSurveySrcDescLod2() {
        if (publicSurveySrcDescLod2 == null)
            publicSurveySrcDescLod2 = new ChildList<>(this);

        return publicSurveySrcDescLod2;
    }

    public void setPublicSurveySrcDescLod2(List<Code> publicSurveySrcDescLod2) {
        this.publicSurveySrcDescLod2 = ModelObjects.setParent(publicSurveySrcDescLod2, this);
    }

    public List<Code> getPublicSurveySrcDescLod3() {
        if (publicSurveySrcDescLod3 == null)
            publicSurveySrcDescLod3 = new ChildList<>(this);

        return publicSurveySrcDescLod3;
    }

    public void setPublicSurveySrcDescLod3(List<Code> publicSurveySrcDescLod3) {
        this.publicSurveySrcDescLod3 = ModelObjects.setParent(publicSurveySrcDescLod3, this);
    }

    public List<Code> getPublicSurveySrcDescLod4() {
        if (publicSurveySrcDescLod4 == null)
            publicSurveySrcDescLod4 = new ChildList<>(this);

        return publicSurveySrcDescLod4;
    }

    public void setPublicSurveySrcDescLod4(List<Code> publicSurveySrcDescLod4) {
        this.publicSurveySrcDescLod4 = ModelObjects.setParent(publicSurveySrcDescLod4, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PublicSurveyDataQualityAttribute copy = target == null ? new PublicSurveyDataQualityAttribute() : (PublicSurveyDataQualityAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PublicSurveyDataQualityAttribute(), copyBuilder);
    }
}
