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

import org.citygml4j.ade.iur.model.common.AbstractDataType;
import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class DaytimePopulationType extends AbstractDataType {
    private Integer daytimePopulation;
    private Double daytimePopulationDensity;
    private Integer daytimeOfficeCommuter;
    private Integer daytimeSchoolCommuter;
    private Integer daytimeUnder15;
    private Integer daytimeOver15;
    private Integer agriculturalWorker;
    private Integer nonCommuter;

    public Integer getDaytimePopulation() {
        return daytimePopulation;
    }

    public void setDaytimePopulation(Integer daytimePopulation) {
        this.daytimePopulation = daytimePopulation;
    }

    public Double getDaytimePopulationDensity() {
        return daytimePopulationDensity;
    }

    public void setDaytimePopulationDensity(Double daytimePopulationDensity) {
        this.daytimePopulationDensity = daytimePopulationDensity;
    }

    public Integer getDaytimeOfficeCommuter() {
        return daytimeOfficeCommuter;
    }

    public void setDaytimeOfficeCommuter(Integer daytimeOfficeCommuter) {
        this.daytimeOfficeCommuter = daytimeOfficeCommuter;
    }

    public Integer getDaytimeSchoolCommuter() {
        return daytimeSchoolCommuter;
    }

    public void setDaytimeSchoolCommuter(Integer daytimeSchoolCommuter) {
        this.daytimeSchoolCommuter = daytimeSchoolCommuter;
    }

    public Integer getDaytimeUnder15() {
        return daytimeUnder15;
    }

    public void setDaytimeUnder15(Integer daytimeUnder15) {
        this.daytimeUnder15 = daytimeUnder15;
    }

    public Integer getDaytimeOver15() {
        return daytimeOver15;
    }

    public void setDaytimeOver15(Integer daytimeOver15) {
        this.daytimeOver15 = daytimeOver15;
    }

    public Integer getAgriculturalWorker() {
        return agriculturalWorker;
    }

    public void setAgriculturalWorker(Integer agriculturalWorker) {
        this.agriculturalWorker = agriculturalWorker;
    }

    public Integer getNonCommuter() {
        return nonCommuter;
    }

    public void setNonCommuter(Integer nonCommuter) {
        this.nonCommuter = nonCommuter;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        DaytimePopulationType copy = target == null ? new DaytimePopulationType() : (DaytimePopulationType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new DaytimePopulationType(), copyBuilder);
    }
}
