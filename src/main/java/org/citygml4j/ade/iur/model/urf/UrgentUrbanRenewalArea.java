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
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.base.StringOrRef;

import java.util.List;

public class UrgentUrbanRenewalArea extends Zone {
    private StringOrRef developmentPolicy;
    private List<PrivateUrbanRenewalProjectPlanProperty> privateProject;
    private List<SpecifiedUrgentUrbanRenewalAreaProperty> specifiedArea;
    private List<SpecialUrbanRenaissanceDistrictProperty> specialDistrict;

    public StringOrRef getDevelopmentPolicy() {
        return developmentPolicy;
    }

    public void setDevelopmentPolicy(StringOrRef developmentPolicy) {
        this.developmentPolicy = ModelObjects.setParent(developmentPolicy, this);
    }

    public List<PrivateUrbanRenewalProjectPlanProperty> getPrivateProject() {
        if (privateProject == null)
            privateProject = new ChildList<>(this);

        return privateProject;
    }

    public void setPrivateProject(List<PrivateUrbanRenewalProjectPlanProperty> privateProject) {
        this.privateProject = ModelObjects.setParent(privateProject, this);
    }

    public List<SpecifiedUrgentUrbanRenewalAreaProperty> getSpecifiedArea() {
        if (specifiedArea == null)
            specifiedArea = new ChildList<>(this);

        return specifiedArea;
    }

    public void setSpecifiedArea(List<SpecifiedUrgentUrbanRenewalAreaProperty> specifiedArea) {
        this.specifiedArea = ModelObjects.setParent(specifiedArea, this);
    }

    public List<SpecialUrbanRenaissanceDistrictProperty> getSpecialDistrict() {
        if (specialDistrict == null)
            specialDistrict = new ChildList<>(this);

        return specialDistrict;
    }

    public void setSpecialDistrict(List<SpecialUrbanRenaissanceDistrictProperty> specialDistrict) {
        this.specialDistrict = ModelObjects.setParent(specialDistrict, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        UrgentUrbanRenewalArea copy = target == null ? new UrgentUrbanRenewalArea() : (UrgentUrbanRenewalArea) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UrgentUrbanRenewalArea.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new UrgentUrbanRenewalArea(), copyBuilder);
    }
}
