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

public class ConstructionDataQualityAttribute extends AbstractDataType {
    private List<Code> srcScale;
    private List<Code> geometrySrcDesc;
    private List<Code> thematicSrcDesc;
    private List<Code> appearanceSrcDesc;
    private String dataAcquisition;
    private Integer photoScale;
    private Code lod1HeightType;
    private List<Code> lodType;

    public List<Code> getSrcScale() {
        if (srcScale == null)
            srcScale = new ChildList<>(this);

        return srcScale;
    }

    public void setSrcScale(List<Code> srcScale) {
        this.srcScale = ModelObjects.setParent(srcScale, this);
    }

    public List<Code> getGeometrySrcDesc() {
        if (geometrySrcDesc == null)
            geometrySrcDesc = new ChildList<>(this);

        return geometrySrcDesc;
    }

    public void setGeometrySrcDesc(List<Code> geometrySrcDesc) {
        this.geometrySrcDesc = ModelObjects.setParent(geometrySrcDesc, this);
    }

    public List<Code> getThematicSrcDesc() {
        if (thematicSrcDesc == null)
            thematicSrcDesc = new ChildList<>(this);

        return thematicSrcDesc;
    }

    public void setThematicSrcDesc(List<Code> thematicSrcDesc) {
        this.thematicSrcDesc = ModelObjects.setParent(thematicSrcDesc, this);
    }

    public List<Code> getAppearanceSrcDesc() {
        if (appearanceSrcDesc == null)
            appearanceSrcDesc = new ChildList<>(this);

        return appearanceSrcDesc;
    }

    public void setAppearanceSrcDesc(List<Code> appearanceSrcDesc) {
        this.appearanceSrcDesc = ModelObjects.setParent(appearanceSrcDesc, this);
    }

    public String getDataAcquisition() {
        return dataAcquisition;
    }

    public void setDataAcquisition(String dataAcquisition) {
        this.dataAcquisition = dataAcquisition;
    }

    public Integer getPhotoScale() {
        return photoScale;
    }

    public void setPhotoScale(Integer photoScale) {
        this.photoScale = photoScale;
    }

    public Code getLod1HeightType() {
        return lod1HeightType;
    }

    public void setLod1HeightType(Code lod1HeightType) {
        this.lod1HeightType = ModelObjects.setParent(lod1HeightType, this);
    }

    public List<Code> getLodType() {
        if (lodType == null)
            lodType = new ChildList<>(this);

        return lodType;
    }

    public void setLodType(List<Code> lodType) {
        this.lodType = ModelObjects.setParent(lodType, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ConstructionDataQualityAttribute copy = target == null ? new ConstructionDataQualityAttribute() : (ConstructionDataQualityAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ConstructionDataQualityAttribute(), copyBuilder);
    }
}
