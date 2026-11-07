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
import org.citygml4j.model.gml.basicTypes.Measure;

public class BuildingRiverFloodingRiskAttribute extends BuildingFloodingRiskAttribute {
    private Code adminType;
    private Code scale;
    private Measure duration;

    public Code getAdminType() {
        return adminType;
    }

    public void setAdminType(Code adminType) {
        this.adminType = ModelObjects.setParent(adminType, this);
    }

    public Code getScale() {
        return scale;
    }

    public void setScale(Code scale) {
        this.scale = ModelObjects.setParent(scale, this);
    }

    public Measure getDuration() {
        return duration;
    }

    public void setDuration(Measure duration) {
        this.duration = ModelObjects.setParent(duration, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        BuildingRiverFloodingRiskAttribute copy = target == null ? new BuildingRiverFloodingRiskAttribute() : (BuildingRiverFloodingRiskAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new BuildingRiverFloodingRiskAttribute(), copyBuilder);
    }
}
