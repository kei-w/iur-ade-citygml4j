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

package org.citygml4j.ade.iur.model.urf;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.base.StringOrRef;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.aggregates.MultiCurveProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiPointProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

public abstract class UrbanFunction extends AbstractCityObject implements ADEModelObject {
    private Code classifier;
    private List<Code> function;
    private List<Code> usage;
    private LocalDate validFrom;
    private Code validFromType;
    private Year enactmentFiscalYear;
    private LocalDate validTo;
    private Code validToType;
    private Year expirationFiscalYear;
    private String legalGrounds;
    private String custodian;
    private String notificationNumber;
    private LocalDate finalNotificationDate;
    private String finalNotificationNumber;
    private Code urbanPlanType;
    private Code areaClassificationType;
    private Measure nominalArea;
    private Code prefecture;
    private Code city;
    private String reference;
    private StringOrRef reason;
    private StringOrRef note;
    private Year surveyYear;
    private MultiSurfaceProperty lodMinus2MultiSurface;
    private MultiSurfaceProperty lodMinus1MultiSurface;
    private MultiSurfaceProperty lod0MultiSurface;
    private MultiSurfaceProperty lod1MultiSurface;
    private MultiCurveProperty lodMinus2MultiCurve;
    private MultiCurveProperty lodMinus1MultiCurve;
    private MultiCurveProperty lod0MultiCurve;
    private MultiCurveProperty lod1MultiCurve;
    private MultiPointProperty lodMinus2MultiPoint;
    private MultiPointProperty lodMinus1MultiPoint;
    private MultiPointProperty lod0MultiPoint;
    private List<TargetProperty> target;

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

    public List<Code> getUsage() {
        if (usage == null)
            usage = new ChildList<>(this);

        return usage;
    }

    public void setUsage(List<Code> usage) {
        this.usage = ModelObjects.setParent(usage, this);
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public Code getValidFromType() {
        return validFromType;
    }

    public void setValidFromType(Code validFromType) {
        this.validFromType = ModelObjects.setParent(validFromType, this);
    }

    public Year getEnactmentFiscalYear() {
        return enactmentFiscalYear;
    }

    public void setEnactmentFiscalYear(Year enactmentFiscalYear) {
        this.enactmentFiscalYear = enactmentFiscalYear;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public Code getValidToType() {
        return validToType;
    }

    public void setValidToType(Code validToType) {
        this.validToType = ModelObjects.setParent(validToType, this);
    }

    public Year getExpirationFiscalYear() {
        return expirationFiscalYear;
    }

    public void setExpirationFiscalYear(Year expirationFiscalYear) {
        this.expirationFiscalYear = expirationFiscalYear;
    }

    public String getLegalGrounds() {
        return legalGrounds;
    }

    public void setLegalGrounds(String legalGrounds) {
        this.legalGrounds = legalGrounds;
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }

    public String getNotificationNumber() {
        return notificationNumber;
    }

    public void setNotificationNumber(String notificationNumber) {
        this.notificationNumber = notificationNumber;
    }

    public LocalDate getFinalNotificationDate() {
        return finalNotificationDate;
    }

    public void setFinalNotificationDate(LocalDate finalNotificationDate) {
        this.finalNotificationDate = finalNotificationDate;
    }

    public String getFinalNotificationNumber() {
        return finalNotificationNumber;
    }

    public void setFinalNotificationNumber(String finalNotificationNumber) {
        this.finalNotificationNumber = finalNotificationNumber;
    }

    public Code getUrbanPlanType() {
        return urbanPlanType;
    }

    public void setUrbanPlanType(Code urbanPlanType) {
        this.urbanPlanType = ModelObjects.setParent(urbanPlanType, this);
    }

    public Code getAreaClassificationType() {
        return areaClassificationType;
    }

    public void setAreaClassificationType(Code areaClassificationType) {
        this.areaClassificationType = ModelObjects.setParent(areaClassificationType, this);
    }

    public Measure getNominalArea() {
        return nominalArea;
    }

    public void setNominalArea(Measure nominalArea) {
        this.nominalArea = ModelObjects.setParent(nominalArea, this);
    }

    public Code getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(Code prefecture) {
        this.prefecture = ModelObjects.setParent(prefecture, this);
    }

    public Code getCity() {
        return city;
    }

    public void setCity(Code city) {
        this.city = ModelObjects.setParent(city, this);
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public StringOrRef getReason() {
        return reason;
    }

    public void setReason(StringOrRef reason) {
        this.reason = ModelObjects.setParent(reason, this);
    }

    public StringOrRef getNote() {
        return note;
    }

    public void setNote(StringOrRef note) {
        this.note = ModelObjects.setParent(note, this);
    }

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    public MultiSurfaceProperty getLodMinus2MultiSurface() {
        return lodMinus2MultiSurface;
    }

    public void setLodMinus2MultiSurface(MultiSurfaceProperty lodMinus2MultiSurface) {
        this.lodMinus2MultiSurface = ModelObjects.setParent(lodMinus2MultiSurface, this);
    }

    public MultiSurfaceProperty getLodMinus1MultiSurface() {
        return lodMinus1MultiSurface;
    }

    public void setLodMinus1MultiSurface(MultiSurfaceProperty lodMinus1MultiSurface) {
        this.lodMinus1MultiSurface = ModelObjects.setParent(lodMinus1MultiSurface, this);
    }

    public MultiSurfaceProperty getLod0MultiSurface() {
        return lod0MultiSurface;
    }

    public void setLod0MultiSurface(MultiSurfaceProperty lod0MultiSurface) {
        this.lod0MultiSurface = ModelObjects.setParent(lod0MultiSurface, this);
    }

    public MultiSurfaceProperty getLod1MultiSurface() {
        return lod1MultiSurface;
    }

    public void setLod1MultiSurface(MultiSurfaceProperty lod1MultiSurface) {
        this.lod1MultiSurface = ModelObjects.setParent(lod1MultiSurface, this);
    }

    public MultiCurveProperty getLodMinus2MultiCurve() {
        return lodMinus2MultiCurve;
    }

    public void setLodMinus2MultiCurve(MultiCurveProperty lodMinus2MultiCurve) {
        this.lodMinus2MultiCurve = ModelObjects.setParent(lodMinus2MultiCurve, this);
    }

    public MultiCurveProperty getLodMinus1MultiCurve() {
        return lodMinus1MultiCurve;
    }

    public void setLodMinus1MultiCurve(MultiCurveProperty lodMinus1MultiCurve) {
        this.lodMinus1MultiCurve = ModelObjects.setParent(lodMinus1MultiCurve, this);
    }

    public MultiCurveProperty getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    public void setLod0MultiCurve(MultiCurveProperty lod0MultiCurve) {
        this.lod0MultiCurve = ModelObjects.setParent(lod0MultiCurve, this);
    }

    public MultiCurveProperty getLod1MultiCurve() {
        return lod1MultiCurve;
    }

    public void setLod1MultiCurve(MultiCurveProperty lod1MultiCurve) {
        this.lod1MultiCurve = ModelObjects.setParent(lod1MultiCurve, this);
    }

    public MultiPointProperty getLodMinus2MultiPoint() {
        return lodMinus2MultiPoint;
    }

    public void setLodMinus2MultiPoint(MultiPointProperty lodMinus2MultiPoint) {
        this.lodMinus2MultiPoint = ModelObjects.setParent(lodMinus2MultiPoint, this);
    }

    public MultiPointProperty getLodMinus1MultiPoint() {
        return lodMinus1MultiPoint;
    }

    public void setLodMinus1MultiPoint(MultiPointProperty lodMinus1MultiPoint) {
        this.lodMinus1MultiPoint = ModelObjects.setParent(lodMinus1MultiPoint, this);
    }

    public MultiPointProperty getLod0MultiPoint() {
        return lod0MultiPoint;
    }

    public void setLod0MultiPoint(MultiPointProperty lod0MultiPoint) {
        this.lod0MultiPoint = ModelObjects.setParent(lod0MultiPoint, this);
    }

    public List<TargetProperty> getTarget() {
        if (target == null)
            target = new ChildList<>(this);

        return target;
    }

    public void setTarget(List<TargetProperty> target) {
        this.target = ModelObjects.setParent(target, this);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(0, lod0MultiSurface);
        lodRepresentation.addRepresentation(1, lod1MultiSurface);
        lodRepresentation.addRepresentation(0, lod0MultiCurve);
        lodRepresentation.addRepresentation(1, lod1MultiCurve);
        lodRepresentation.addRepresentation(0, lod0MultiPoint);

        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        UrbanFunction copy = (UrbanFunction) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UrbanFunction.class, copyBuilder);
    }

    @Override
    public void accept(FeatureVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(FeatureFunctor<T> visitor) {
        return visitor.apply(this);
    }

    @Override
    public void accept(GMLVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public <T> T accept(GMLFunctor<T> visitor) {
        return visitor.apply(this);
    }
}
