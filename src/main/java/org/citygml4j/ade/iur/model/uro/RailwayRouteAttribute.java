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

import java.util.ArrayList;
import java.util.List;

public class RailwayRouteAttribute extends AbstractDataType {
    private Code operatorType;
    private String operator;
    private List<String> alternativeName;
    private Code railwayType;
    private String startStation;
    private String endStation;

    public Code getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Code operatorType) {
        this.operatorType = ModelObjects.setParent(operatorType, this);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<String> getAlternativeName() {
        if (alternativeName == null)
            alternativeName = new ArrayList<>();

        return alternativeName;
    }

    public void setAlternativeName(List<String> alternativeName) {
        this.alternativeName = alternativeName;
    }

    public Code getRailwayType() {
        return railwayType;
    }

    public void setRailwayType(Code railwayType) {
        this.railwayType = ModelObjects.setParent(railwayType, this);
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RailwayRouteAttribute copy = target == null ? new RailwayRouteAttribute() : (RailwayRouteAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RailwayRouteAttribute(), copyBuilder);
    }
}
