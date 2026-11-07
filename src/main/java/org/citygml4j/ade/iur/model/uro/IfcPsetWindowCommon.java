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

public class IfcPsetWindowCommon extends IfcAttribute {
    private String reference;
    private String acousticRating;
    private String fireRating;
    private String securityRating;
    private Boolean isExternal;
    private Double infiltration;
    private Double thermalTransmittance;
    private Double glazingAreaFraction;
    private Boolean smokeStop;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAcousticRating() {
        return acousticRating;
    }

    public void setAcousticRating(String acousticRating) {
        this.acousticRating = acousticRating;
    }

    public String getFireRating() {
        return fireRating;
    }

    public void setFireRating(String fireRating) {
        this.fireRating = fireRating;
    }

    public String getSecurityRating() {
        return securityRating;
    }

    public void setSecurityRating(String securityRating) {
        this.securityRating = securityRating;
    }

    public Boolean getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    public Double getInfiltration() {
        return infiltration;
    }

    public void setInfiltration(Double infiltration) {
        this.infiltration = infiltration;
    }

    public Double getThermalTransmittance() {
        return thermalTransmittance;
    }

    public void setThermalTransmittance(Double thermalTransmittance) {
        this.thermalTransmittance = thermalTransmittance;
    }

    public Double getGlazingAreaFraction() {
        return glazingAreaFraction;
    }

    public void setGlazingAreaFraction(Double glazingAreaFraction) {
        this.glazingAreaFraction = glazingAreaFraction;
    }

    public Boolean getSmokeStop() {
        return smokeStop;
    }

    public void setSmokeStop(Boolean smokeStop) {
        this.smokeStop = smokeStop;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcPsetWindowCommon copy = target == null ? new IfcPsetWindowCommon() : (IfcPsetWindowCommon) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcPsetWindowCommon(), copyBuilder);
    }
}
