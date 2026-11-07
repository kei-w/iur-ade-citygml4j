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

public class PointCloudSpecAttribute extends AbstractDataType {
    private Code classifier;
    private List<Code> function;
    private Code srcScale;
    private Length srcRequiredHorizontalAccuracy;
    private Length srcRequiredVerticalAccuracy;
    private Measure srcRequiredPointDensity;
    private List<Code> srcFilteringCriteria;
    private Measure srcGridInterval;
    private Boolean isIntensity;
    private List<Code> spectralBandSet;
    private Boolean isReturnInfo;
    private Boolean isStandardClassification;
    private List<Code> customClassificationType;
    private Code pointCloudAssociationMethod;
    private Code pointSubsamplingInfo;

    public Code getClassifier() {
        return classifier;
    }

    public void setClassifier(Code classifier) {
        this.classifier = ModelObjects.setParent(classifier, this);
    }

    public List<Code> getFunction() {
        if (function == null)
            function = new ChildList<>(this);

        return function;
    }

    public void setFunction(List<Code> function) {
        this.function = ModelObjects.setParent(function, this);
    }

    public Code getSrcScale() {
        return srcScale;
    }

    public void setSrcScale(Code srcScale) {
        this.srcScale = ModelObjects.setParent(srcScale, this);
    }

    public Length getSrcRequiredHorizontalAccuracy() {
        return srcRequiredHorizontalAccuracy;
    }

    public void setSrcRequiredHorizontalAccuracy(Length srcRequiredHorizontalAccuracy) {
        this.srcRequiredHorizontalAccuracy = ModelObjects.setParent(srcRequiredHorizontalAccuracy, this);
    }

    public Length getSrcRequiredVerticalAccuracy() {
        return srcRequiredVerticalAccuracy;
    }

    public void setSrcRequiredVerticalAccuracy(Length srcRequiredVerticalAccuracy) {
        this.srcRequiredVerticalAccuracy = ModelObjects.setParent(srcRequiredVerticalAccuracy, this);
    }

    public Measure getSrcRequiredPointDensity() {
        return srcRequiredPointDensity;
    }

    public void setSrcRequiredPointDensity(Measure srcRequiredPointDensity) {
        this.srcRequiredPointDensity = ModelObjects.setParent(srcRequiredPointDensity, this);
    }

    public List<Code> getSrcFilteringCriteria() {
        if (srcFilteringCriteria == null)
            srcFilteringCriteria = new ChildList<>(this);

        return srcFilteringCriteria;
    }

    public void setSrcFilteringCriteria(List<Code> srcFilteringCriteria) {
        this.srcFilteringCriteria = ModelObjects.setParent(srcFilteringCriteria, this);
    }

    public Measure getSrcGridInterval() {
        return srcGridInterval;
    }

    public void setSrcGridInterval(Measure srcGridInterval) {
        this.srcGridInterval = ModelObjects.setParent(srcGridInterval, this);
    }

    public Boolean getIsIntensity() {
        return isIntensity;
    }

    public void setIsIntensity(Boolean isIntensity) {
        this.isIntensity = isIntensity;
    }

    public List<Code> getSpectralBandSet() {
        if (spectralBandSet == null)
            spectralBandSet = new ChildList<>(this);

        return spectralBandSet;
    }

    public void setSpectralBandSet(List<Code> spectralBandSet) {
        this.spectralBandSet = ModelObjects.setParent(spectralBandSet, this);
    }

    public Boolean getIsReturnInfo() {
        return isReturnInfo;
    }

    public void setIsReturnInfo(Boolean isReturnInfo) {
        this.isReturnInfo = isReturnInfo;
    }

    public Boolean getIsStandardClassification() {
        return isStandardClassification;
    }

    public void setIsStandardClassification(Boolean isStandardClassification) {
        this.isStandardClassification = isStandardClassification;
    }

    public List<Code> getCustomClassificationType() {
        if (customClassificationType == null)
            customClassificationType = new ChildList<>(this);

        return customClassificationType;
    }

    public void setCustomClassificationType(List<Code> customClassificationType) {
        this.customClassificationType = ModelObjects.setParent(customClassificationType, this);
    }

    public Code getPointCloudAssociationMethod() {
        return pointCloudAssociationMethod;
    }

    public void setPointCloudAssociationMethod(Code pointCloudAssociationMethod) {
        this.pointCloudAssociationMethod = ModelObjects.setParent(pointCloudAssociationMethod, this);
    }

    public Code getPointSubsamplingInfo() {
        return pointSubsamplingInfo;
    }

    public void setPointSubsamplingInfo(Code pointSubsamplingInfo) {
        this.pointSubsamplingInfo = ModelObjects.setParent(pointSubsamplingInfo, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PointCloudSpecAttribute copy = target == null ? new PointCloudSpecAttribute() : (PointCloudSpecAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PointCloudSpecAttribute(), copyBuilder);
    }
}
