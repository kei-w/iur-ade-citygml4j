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

public class IfcPsetDoorCommon extends IfcAttribute {
    private String reference;
    private String acousticRating;
    private String firerating;
    private String securityRating;
    private Boolean isExternal;
    private Double infiltration;
    private Double thermalTransmittance;
    private Double glazingAreaFraction;
    private Boolean handicapAccessible;
    private Boolean fireExit;
    private Boolean selfClosing;
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

    public String getFirerating() {
        return firerating;
    }

    public void setFirerating(String firerating) {
        this.firerating = firerating;
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

    public Boolean getHandicapAccessible() {
        return handicapAccessible;
    }

    public void setHandicapAccessible(Boolean handicapAccessible) {
        this.handicapAccessible = handicapAccessible;
    }

    public Boolean getFireExit() {
        return fireExit;
    }

    public void setFireExit(Boolean fireExit) {
        this.fireExit = fireExit;
    }

    public Boolean getSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(Boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public Boolean getSmokeStop() {
        return smokeStop;
    }

    public void setSmokeStop(Boolean smokeStop) {
        this.smokeStop = smokeStop;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcPsetDoorCommon copy = target == null ? new IfcPsetDoorCommon() : (IfcPsetDoorCommon) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcPsetDoorCommon(), copyBuilder);
    }
}
