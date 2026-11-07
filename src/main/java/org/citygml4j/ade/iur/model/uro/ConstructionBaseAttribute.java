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
import org.citygml4j.model.gml.basicTypes.Code;

import java.time.LocalDate;
import java.time.Year;

public class ConstructionBaseAttribute extends AbstractDataType {
    private Code adminType;
    private String administrator;
    private String adminOffice;
    private Code operatorType;
    private Code installerType;
    private String installer;
    private String structureOrdinance;
    private String specification;
    private String kana;
    private Year constructionStartYear;
    private Year completionYear;
    private Integer facilityAge;
    private LocalDate update;
    private Code purpose;

    public Code getAdminType() {
        return adminType;
    }

    public void setAdminType(Code adminType) {
        this.adminType = ModelObjects.setParent(adminType, this);
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getAdminOffice() {
        return adminOffice;
    }

    public void setAdminOffice(String adminOffice) {
        this.adminOffice = adminOffice;
    }

    public Code getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Code operatorType) {
        this.operatorType = ModelObjects.setParent(operatorType, this);
    }

    public Code getInstallerType() {
        return installerType;
    }

    public void setInstallerType(Code installerType) {
        this.installerType = ModelObjects.setParent(installerType, this);
    }

    public String getInstaller() {
        return installer;
    }

    public void setInstaller(String installer) {
        this.installer = installer;
    }

    public String getStructureOrdinance() {
        return structureOrdinance;
    }

    public void setStructureOrdinance(String structureOrdinance) {
        this.structureOrdinance = structureOrdinance;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public Year getConstructionStartYear() {
        return constructionStartYear;
    }

    public void setConstructionStartYear(Year constructionStartYear) {
        this.constructionStartYear = constructionStartYear;
    }

    public Year getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(Year completionYear) {
        this.completionYear = completionYear;
    }

    public Integer getFacilityAge() {
        return facilityAge;
    }

    public void setFacilityAge(Integer facilityAge) {
        this.facilityAge = facilityAge;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public Code getPurpose() {
        return purpose;
    }

    public void setPurpose(Code purpose) {
        this.purpose = ModelObjects.setParent(purpose, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        ConstructionBaseAttribute copy = target == null ? new ConstructionBaseAttribute() : (ConstructionBaseAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new ConstructionBaseAttribute(), copyBuilder);
    }
}
