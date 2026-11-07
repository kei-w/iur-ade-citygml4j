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
import org.citygml4j.model.citygml.ade.binding.ADEModelObject;
import org.citygml4j.model.citygml.core.AbstractCityObject;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.AbstractGeometry;
import org.citygml4j.model.gml.geometry.GeometryProperty;
import org.citygml4j.util.bbox.BoundingBoxOptions;
import org.citygml4j.util.bbox.SimpleBoundingBoxCalculator;

import java.time.LocalDate;
import java.util.List;

public class AbstractConstruction extends AbstractCityObject implements ADEModelObject {
    private ConditionOfConstructionValue conditionOfConstruction;
    private LocalDate dateOfConstruction;
    private LocalDate dateOfDemolition;
    private List<ConstructionEventProperty> constructionEvent;
    private List<ElevationProperty> elevation;
    private List<HeightProperty> height;
    private List<OccupancyProperty> occupancy;
    private List<FacilityTypeAttributeProperty> consFacilityTypeAttribute;
    private FacilityIdAttributeProperty consFacilityIdAttribute;
    private List<FacilityAttributeProperty> consFacilityAttribute;
    private ConstructionBaseAttributeProperty consBaseAttribute;
    private ConstructionStructureAttributeProperty consStructureAttribute;
    private List<DisasterRiskAttributeProperty> consDisasterRiskAttribute;
    private List<DmAttributeProperty> consDmAttribute;
    private DataQualityAttributeProperty consDataQualityAttribute;
    private List<KeyValuePairAttributeProperty> consKeyValuePairAttribute;
    private GeometryProperty<? extends AbstractGeometry> lod0Geometry;
    private GeometryProperty<? extends AbstractGeometry> lod1Geometry;
    private GeometryProperty<? extends AbstractGeometry> lod2Geometry;
    private GeometryProperty<? extends AbstractGeometry> lod3Geometry;
    private GeometryProperty<? extends AbstractGeometry> lod4Geometry;
    private List<AbstractBoundarySurfaceProperty> boundedBySurface;
    private List<ConstructionInstallationProperty> constructionInstallation;

    public ConditionOfConstructionValue getConditionOfConstruction() {
        return conditionOfConstruction;
    }

    public void setConditionOfConstruction(ConditionOfConstructionValue conditionOfConstruction) {
        this.conditionOfConstruction = conditionOfConstruction;
    }

    public LocalDate getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(LocalDate dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public LocalDate getDateOfDemolition() {
        return dateOfDemolition;
    }

    public void setDateOfDemolition(LocalDate dateOfDemolition) {
        this.dateOfDemolition = dateOfDemolition;
    }

    public List<ConstructionEventProperty> getConstructionEvent() {
        if (constructionEvent == null)
            constructionEvent = new ChildList<>(this);

        return constructionEvent;
    }

    public void setConstructionEvent(List<ConstructionEventProperty> constructionEvent) {
        this.constructionEvent = ModelObjects.setParent(constructionEvent, this);
    }

    public List<ElevationProperty> getElevation() {
        if (elevation == null)
            elevation = new ChildList<>(this);

        return elevation;
    }

    public void setElevation(List<ElevationProperty> elevation) {
        this.elevation = ModelObjects.setParent(elevation, this);
    }

    public List<HeightProperty> getHeight() {
        if (height == null)
            height = new ChildList<>(this);

        return height;
    }

    public void setHeight(List<HeightProperty> height) {
        this.height = ModelObjects.setParent(height, this);
    }

    public List<OccupancyProperty> getOccupancy() {
        if (occupancy == null)
            occupancy = new ChildList<>(this);

        return occupancy;
    }

    public void setOccupancy(List<OccupancyProperty> occupancy) {
        this.occupancy = ModelObjects.setParent(occupancy, this);
    }

    public List<FacilityTypeAttributeProperty> getConsFacilityTypeAttribute() {
        if (consFacilityTypeAttribute == null)
            consFacilityTypeAttribute = new ChildList<>(this);

        return consFacilityTypeAttribute;
    }

    public void setConsFacilityTypeAttribute(List<FacilityTypeAttributeProperty> consFacilityTypeAttribute) {
        this.consFacilityTypeAttribute = ModelObjects.setParent(consFacilityTypeAttribute, this);
    }

    public FacilityIdAttributeProperty getConsFacilityIdAttribute() {
        return consFacilityIdAttribute;
    }

    public void setConsFacilityIdAttribute(FacilityIdAttributeProperty consFacilityIdAttribute) {
        this.consFacilityIdAttribute = ModelObjects.setParent(consFacilityIdAttribute, this);
    }

    public List<FacilityAttributeProperty> getConsFacilityAttribute() {
        if (consFacilityAttribute == null)
            consFacilityAttribute = new ChildList<>(this);

        return consFacilityAttribute;
    }

    public void setConsFacilityAttribute(List<FacilityAttributeProperty> consFacilityAttribute) {
        this.consFacilityAttribute = ModelObjects.setParent(consFacilityAttribute, this);
    }

    public ConstructionBaseAttributeProperty getConsBaseAttribute() {
        return consBaseAttribute;
    }

    public void setConsBaseAttribute(ConstructionBaseAttributeProperty consBaseAttribute) {
        this.consBaseAttribute = ModelObjects.setParent(consBaseAttribute, this);
    }

    public ConstructionStructureAttributeProperty getConsStructureAttribute() {
        return consStructureAttribute;
    }

    public void setConsStructureAttribute(ConstructionStructureAttributeProperty consStructureAttribute) {
        this.consStructureAttribute = ModelObjects.setParent(consStructureAttribute, this);
    }

    public List<DisasterRiskAttributeProperty> getConsDisasterRiskAttribute() {
        if (consDisasterRiskAttribute == null)
            consDisasterRiskAttribute = new ChildList<>(this);

        return consDisasterRiskAttribute;
    }

    public void setConsDisasterRiskAttribute(List<DisasterRiskAttributeProperty> consDisasterRiskAttribute) {
        this.consDisasterRiskAttribute = ModelObjects.setParent(consDisasterRiskAttribute, this);
    }

    public List<DmAttributeProperty> getConsDmAttribute() {
        if (consDmAttribute == null)
            consDmAttribute = new ChildList<>(this);

        return consDmAttribute;
    }

    public void setConsDmAttribute(List<DmAttributeProperty> consDmAttribute) {
        this.consDmAttribute = ModelObjects.setParent(consDmAttribute, this);
    }

    public DataQualityAttributeProperty getConsDataQualityAttribute() {
        return consDataQualityAttribute;
    }

    public void setConsDataQualityAttribute(DataQualityAttributeProperty consDataQualityAttribute) {
        this.consDataQualityAttribute = ModelObjects.setParent(consDataQualityAttribute, this);
    }

    public List<KeyValuePairAttributeProperty> getConsKeyValuePairAttribute() {
        if (consKeyValuePairAttribute == null)
            consKeyValuePairAttribute = new ChildList<>(this);

        return consKeyValuePairAttribute;
    }

    public void setConsKeyValuePairAttribute(List<KeyValuePairAttributeProperty> consKeyValuePairAttribute) {
        this.consKeyValuePairAttribute = ModelObjects.setParent(consKeyValuePairAttribute, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod0Geometry() {
        return lod0Geometry;
    }

    public void setLod0Geometry(GeometryProperty<? extends AbstractGeometry> lod0Geometry) {
        this.lod0Geometry = ModelObjects.setParent(lod0Geometry, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod1Geometry() {
        return lod1Geometry;
    }

    public void setLod1Geometry(GeometryProperty<? extends AbstractGeometry> lod1Geometry) {
        this.lod1Geometry = ModelObjects.setParent(lod1Geometry, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod2Geometry() {
        return lod2Geometry;
    }

    public void setLod2Geometry(GeometryProperty<? extends AbstractGeometry> lod2Geometry) {
        this.lod2Geometry = ModelObjects.setParent(lod2Geometry, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod3Geometry() {
        return lod3Geometry;
    }

    public void setLod3Geometry(GeometryProperty<? extends AbstractGeometry> lod3Geometry) {
        this.lod3Geometry = ModelObjects.setParent(lod3Geometry, this);
    }

    public GeometryProperty<? extends AbstractGeometry> getLod4Geometry() {
        return lod4Geometry;
    }

    public void setLod4Geometry(GeometryProperty<? extends AbstractGeometry> lod4Geometry) {
        this.lod4Geometry = ModelObjects.setParent(lod4Geometry, this);
    }

    public List<AbstractBoundarySurfaceProperty> getBoundedBySurface() {
        if (boundedBySurface == null)
            boundedBySurface = new ChildList<>(this);

        return boundedBySurface;
    }

    public void setBoundedBySurface(List<AbstractBoundarySurfaceProperty> boundedBySurface) {
        this.boundedBySurface = ModelObjects.setParent(boundedBySurface, this);
    }

    public List<ConstructionInstallationProperty> getConstructionInstallation() {
        if (constructionInstallation == null)
            constructionInstallation = new ChildList<>(this);

        return constructionInstallation;
    }

    public void setConstructionInstallation(List<ConstructionInstallationProperty> constructionInstallation) {
        this.constructionInstallation = ModelObjects.setParent(constructionInstallation, this);
    }

    @Override
    public BoundingShape calcBoundedBy(BoundingBoxOptions options) {
        return SimpleBoundingBoxCalculator.calcBoundedBy(this, options);
    }

    @Override
    public LodRepresentation getLodRepresentation() {
        LodRepresentation lodRepresentation = new LodRepresentation();
        lodRepresentation.addRepresentation(0, lod0Geometry);
        lodRepresentation.addRepresentation(1, lod1Geometry);
        lodRepresentation.addRepresentation(2, lod2Geometry);
        lodRepresentation.addRepresentation(3, lod3Geometry);
        lodRepresentation.addRepresentation(4, lod4Geometry);

        return lodRepresentation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        AbstractConstruction copy = target == null ? new AbstractConstruction() : (AbstractConstruction) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, AbstractConstruction.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new AbstractConstruction(), copyBuilder);
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
