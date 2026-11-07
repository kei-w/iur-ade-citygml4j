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

public class CensusBlock extends UrbanFunction {
    private String townName;
    private String blockName;
    private PopulationTypeProperty populationType;
    private DaytimePopulationTypeProperty daytimePopulationType;
    private EconomicActivityTypeProperty economicActivityType;

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public PopulationTypeProperty getPopulationType() {
        return populationType;
    }

    public void setPopulationType(PopulationTypeProperty populationType) {
        this.populationType = ModelObjects.setParent(populationType, this);
    }

    public DaytimePopulationTypeProperty getDaytimePopulationType() {
        return daytimePopulationType;
    }

    public void setDaytimePopulationType(DaytimePopulationTypeProperty daytimePopulationType) {
        this.daytimePopulationType = ModelObjects.setParent(daytimePopulationType, this);
    }

    public EconomicActivityTypeProperty getEconomicActivityType() {
        return economicActivityType;
    }

    public void setEconomicActivityType(EconomicActivityTypeProperty economicActivityType) {
        this.economicActivityType = ModelObjects.setParent(economicActivityType, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        CensusBlock copy = target == null ? new CensusBlock() : (CensusBlock) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new CensusBlock(), copyBuilder);
    }
}
