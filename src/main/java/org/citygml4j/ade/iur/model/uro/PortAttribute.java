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

public abstract class PortAttribute extends FacilityAttribute {
    private Code portFacilityDetailsType;
    private String portName;
    private Code portStatus;
    private String district;
    private Code grantType;
    private Boolean isDesignated;
    private Integer degradationLevel;

    public Code getPortFacilityDetailsType() {
        return portFacilityDetailsType;
    }

    public void setPortFacilityDetailsType(Code portFacilityDetailsType) {
        this.portFacilityDetailsType = ModelObjects.setParent(portFacilityDetailsType, this);
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public Code getPortStatus() {
        return portStatus;
    }

    public void setPortStatus(Code portStatus) {
        this.portStatus = ModelObjects.setParent(portStatus, this);
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Code getGrantType() {
        return grantType;
    }

    public void setGrantType(Code grantType) {
        this.grantType = ModelObjects.setParent(grantType, this);
    }

    public Boolean getIsDesignated() {
        return isDesignated;
    }

    public void setIsDesignated(Boolean isDesignated) {
        this.isDesignated = isDesignated;
    }

    public Integer getDegradationLevel() {
        return degradationLevel;
    }

    public void setDegradationLevel(Integer degradationLevel) {
        this.degradationLevel = degradationLevel;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        PortAttribute copy = (PortAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, PortAttribute.class, copyBuilder);
    }
}
