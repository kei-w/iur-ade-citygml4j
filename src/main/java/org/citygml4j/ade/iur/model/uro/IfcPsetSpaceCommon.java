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
import org.citygml4j.model.gml.basicTypes.Measure;

public class IfcPsetSpaceCommon extends IfcAttribute {
    private String reference;
    private String category;
    private String floorCovering;
    private String wallCovering;
    private String ceilingCovering;
    private String skirtingBoard;
    private Measure grossPlannedArea;
    private Measure netPlannedArea;
    private Boolean publiclyAccessible;
    private Boolean handicapAccessible;
    private Boolean concealedFlooring;
    private Boolean concealedCeiling;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFloorCovering() {
        return floorCovering;
    }

    public void setFloorCovering(String floorCovering) {
        this.floorCovering = floorCovering;
    }

    public String getWallCovering() {
        return wallCovering;
    }

    public void setWallCovering(String wallCovering) {
        this.wallCovering = wallCovering;
    }

    public String getCeilingCovering() {
        return ceilingCovering;
    }

    public void setCeilingCovering(String ceilingCovering) {
        this.ceilingCovering = ceilingCovering;
    }

    public String getSkirtingBoard() {
        return skirtingBoard;
    }

    public void setSkirtingBoard(String skirtingBoard) {
        this.skirtingBoard = skirtingBoard;
    }

    public Measure getGrossPlannedArea() {
        return grossPlannedArea;
    }

    public void setGrossPlannedArea(Measure grossPlannedArea) {
        this.grossPlannedArea = ModelObjects.setParent(grossPlannedArea, this);
    }

    public Measure getNetPlannedArea() {
        return netPlannedArea;
    }

    public void setNetPlannedArea(Measure netPlannedArea) {
        this.netPlannedArea = ModelObjects.setParent(netPlannedArea, this);
    }

    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public Boolean getHandicapAccessible() {
        return handicapAccessible;
    }

    public void setHandicapAccessible(Boolean handicapAccessible) {
        this.handicapAccessible = handicapAccessible;
    }

    public Boolean getConcealedFlooring() {
        return concealedFlooring;
    }

    public void setConcealedFlooring(Boolean concealedFlooring) {
        this.concealedFlooring = concealedFlooring;
    }

    public Boolean getConcealedCeiling() {
        return concealedCeiling;
    }

    public void setConcealedCeiling(Boolean concealedCeiling) {
        this.concealedCeiling = concealedCeiling;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcPsetSpaceCommon copy = target == null ? new IfcPsetSpaceCommon() : (IfcPsetSpaceCommon) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcPsetSpaceCommon(), copyBuilder);
    }
}
