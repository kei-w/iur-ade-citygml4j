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
import org.citygml4j.model.citygml.core.AddressProperty;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.measures.Length;

public class IfcBuilding extends IfcSpatialStructureElement {
    private Length elevationOfRefHeight;
    private Length elevationOfTerrain;
    private AddressProperty buildingAddress;

    public Length getElevationOfRefHeight() {
        return elevationOfRefHeight;
    }

    public void setElevationOfRefHeight(Length elevationOfRefHeight) {
        this.elevationOfRefHeight = ModelObjects.setParent(elevationOfRefHeight, this);
    }

    public Length getElevationOfTerrain() {
        return elevationOfTerrain;
    }

    public void setElevationOfTerrain(Length elevationOfTerrain) {
        this.elevationOfTerrain = ModelObjects.setParent(elevationOfTerrain, this);
    }

    public AddressProperty getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(AddressProperty buildingAddress) {
        this.buildingAddress = ModelObjects.setParent(buildingAddress, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcBuilding copy = target == null ? new IfcBuilding() : (IfcBuilding) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcBuilding(), copyBuilder);
    }
}
