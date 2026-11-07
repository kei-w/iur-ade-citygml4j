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

public class DataQualityAttribute extends AbstractDataType {
    private List<Code> geometrySrcDescLod0;
    private List<Code> geometrySrcDescLod1;
    private List<Code> geometrySrcDescLod2;
    private List<Code> geometrySrcDescLod3;
    private List<Code> geometrySrcDescLod4;
    private List<Code> thematicSrcDesc;
    private List<Code> appearanceSrcDescLod0;
    private List<Code> appearanceSrcDescLod1;
    private List<Code> appearanceSrcDescLod2;
    private List<Code> appearanceSrcDescLod3;
    private List<Code> appearanceSrcDescLod4;
    private List<Code> lodType;
    private Code lod1HeightType;
    private String tranDataAcquisition;
    private PublicSurveyDataQualityAttributeProperty publicSurveyDataQualityAttribute;

    public List<Code> getGeometrySrcDescLod0() {
        if (geometrySrcDescLod0 == null)
            geometrySrcDescLod0 = new ChildList<>(this);

        return geometrySrcDescLod0;
    }

    public void setGeometrySrcDescLod0(List<Code> geometrySrcDescLod0) {
        this.geometrySrcDescLod0 = ModelObjects.setParent(geometrySrcDescLod0, this);
    }

    public List<Code> getGeometrySrcDescLod1() {
        if (geometrySrcDescLod1 == null)
            geometrySrcDescLod1 = new ChildList<>(this);

        return geometrySrcDescLod1;
    }

    public void setGeometrySrcDescLod1(List<Code> geometrySrcDescLod1) {
        this.geometrySrcDescLod1 = ModelObjects.setParent(geometrySrcDescLod1, this);
    }

    public List<Code> getGeometrySrcDescLod2() {
        if (geometrySrcDescLod2 == null)
            geometrySrcDescLod2 = new ChildList<>(this);

        return geometrySrcDescLod2;
    }

    public void setGeometrySrcDescLod2(List<Code> geometrySrcDescLod2) {
        this.geometrySrcDescLod2 = ModelObjects.setParent(geometrySrcDescLod2, this);
    }

    public List<Code> getGeometrySrcDescLod3() {
        if (geometrySrcDescLod3 == null)
            geometrySrcDescLod3 = new ChildList<>(this);

        return geometrySrcDescLod3;
    }

    public void setGeometrySrcDescLod3(List<Code> geometrySrcDescLod3) {
        this.geometrySrcDescLod3 = ModelObjects.setParent(geometrySrcDescLod3, this);
    }

    public List<Code> getGeometrySrcDescLod4() {
        if (geometrySrcDescLod4 == null)
            geometrySrcDescLod4 = new ChildList<>(this);

        return geometrySrcDescLod4;
    }

    public void setGeometrySrcDescLod4(List<Code> geometrySrcDescLod4) {
        this.geometrySrcDescLod4 = ModelObjects.setParent(geometrySrcDescLod4, this);
    }

    public List<Code> getThematicSrcDesc() {
        if (thematicSrcDesc == null)
            thematicSrcDesc = new ChildList<>(this);

        return thematicSrcDesc;
    }

    public void setThematicSrcDesc(List<Code> thematicSrcDesc) {
        this.thematicSrcDesc = ModelObjects.setParent(thematicSrcDesc, this);
    }

    public List<Code> getAppearanceSrcDescLod0() {
        if (appearanceSrcDescLod0 == null)
            appearanceSrcDescLod0 = new ChildList<>(this);

        return appearanceSrcDescLod0;
    }

    public void setAppearanceSrcDescLod0(List<Code> appearanceSrcDescLod0) {
        this.appearanceSrcDescLod0 = ModelObjects.setParent(appearanceSrcDescLod0, this);
    }

    public List<Code> getAppearanceSrcDescLod1() {
        if (appearanceSrcDescLod1 == null)
            appearanceSrcDescLod1 = new ChildList<>(this);

        return appearanceSrcDescLod1;
    }

    public void setAppearanceSrcDescLod1(List<Code> appearanceSrcDescLod1) {
        this.appearanceSrcDescLod1 = ModelObjects.setParent(appearanceSrcDescLod1, this);
    }

    public List<Code> getAppearanceSrcDescLod2() {
        if (appearanceSrcDescLod2 == null)
            appearanceSrcDescLod2 = new ChildList<>(this);

        return appearanceSrcDescLod2;
    }

    public void setAppearanceSrcDescLod2(List<Code> appearanceSrcDescLod2) {
        this.appearanceSrcDescLod2 = ModelObjects.setParent(appearanceSrcDescLod2, this);
    }

    public List<Code> getAppearanceSrcDescLod3() {
        if (appearanceSrcDescLod3 == null)
            appearanceSrcDescLod3 = new ChildList<>(this);

        return appearanceSrcDescLod3;
    }

    public void setAppearanceSrcDescLod3(List<Code> appearanceSrcDescLod3) {
        this.appearanceSrcDescLod3 = ModelObjects.setParent(appearanceSrcDescLod3, this);
    }

    public List<Code> getAppearanceSrcDescLod4() {
        if (appearanceSrcDescLod4 == null)
            appearanceSrcDescLod4 = new ChildList<>(this);

        return appearanceSrcDescLod4;
    }

    public void setAppearanceSrcDescLod4(List<Code> appearanceSrcDescLod4) {
        this.appearanceSrcDescLod4 = ModelObjects.setParent(appearanceSrcDescLod4, this);
    }

    public List<Code> getLodType() {
        if (lodType == null)
            lodType = new ChildList<>(this);

        return lodType;
    }

    public void setLodType(List<Code> lodType) {
        this.lodType = ModelObjects.setParent(lodType, this);
    }

    public Code getLod1HeightType() {
        return lod1HeightType;
    }

    public void setLod1HeightType(Code lod1HeightType) {
        this.lod1HeightType = ModelObjects.setParent(lod1HeightType, this);
    }

    public String getTranDataAcquisition() {
        return tranDataAcquisition;
    }

    public void setTranDataAcquisition(String tranDataAcquisition) {
        this.tranDataAcquisition = tranDataAcquisition;
    }

    public PublicSurveyDataQualityAttributeProperty getPublicSurveyDataQualityAttribute() {
        return publicSurveyDataQualityAttribute;
    }

    public void setPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttributeProperty publicSurveyDataQualityAttribute) {
        this.publicSurveyDataQualityAttribute = ModelObjects.setParent(publicSurveyDataQualityAttribute, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DataQualityAttribute copy = target == null ? new DataQualityAttribute() : (DataQualityAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DataQualityAttribute(), copyBuilder);
    }
}
