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
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class EconomicActivityType extends AbstractDataType {
    private List<EconomicActivitySumTypeProperty> numberOfOfficers;
    private List<EconomicActivitySumTypeProperty> numberOfEmployees;
    private List<EconomicActivitySumTypeProperty> retailSales;
    private List<EconomicActivitySumTypeProperty> manufactureShipments;

    public List<EconomicActivitySumTypeProperty> getNumberOfOfficers() {
        if (numberOfOfficers == null)
            numberOfOfficers = new ChildList<>(this);

        return numberOfOfficers;
    }

    public void setNumberOfOfficers(List<EconomicActivitySumTypeProperty> numberOfOfficers) {
        this.numberOfOfficers = ModelObjects.setParent(numberOfOfficers, this);
    }

    public List<EconomicActivitySumTypeProperty> getNumberOfEmployees() {
        if (numberOfEmployees == null)
            numberOfEmployees = new ChildList<>(this);

        return numberOfEmployees;
    }

    public void setNumberOfEmployees(List<EconomicActivitySumTypeProperty> numberOfEmployees) {
        this.numberOfEmployees = ModelObjects.setParent(numberOfEmployees, this);
    }

    public List<EconomicActivitySumTypeProperty> getRetailSales() {
        if (retailSales == null)
            retailSales = new ChildList<>(this);

        return retailSales;
    }

    public void setRetailSales(List<EconomicActivitySumTypeProperty> retailSales) {
        this.retailSales = ModelObjects.setParent(retailSales, this);
    }

    public List<EconomicActivitySumTypeProperty> getManufactureShipments() {
        if (manufactureShipments == null)
            manufactureShipments = new ChildList<>(this);

        return manufactureShipments;
    }

    public void setManufactureShipments(List<EconomicActivitySumTypeProperty> manufactureShipments) {
        this.manufactureShipments = ModelObjects.setParent(manufactureShipments, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        EconomicActivityType copy = target == null ? new EconomicActivityType() : (EconomicActivityType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new EconomicActivityType(), copyBuilder);
    }
}
