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
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

import java.time.YearMonth;
import java.util.List;

public class WaterBodyDetailAttribute extends AbstractDataType {
    private String kana;
    private Code waterSystemCode;
    private Code riverCode;
    private Code adminType;
    private Boolean flowDirection;
    private Length maximumDepth;
    private Length waterSurfaceElevation;
    private Measure area;
    private YearMonth measurementYearMonth;
    private List<Code> prefecture;
    private List<Code> city;

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public Code getWaterSystemCode() {
        return waterSystemCode;
    }

    public void setWaterSystemCode(Code waterSystemCode) {
        this.waterSystemCode = ModelObjects.setParent(waterSystemCode, this);
    }

    public Code getRiverCode() {
        return riverCode;
    }

    public void setRiverCode(Code riverCode) {
        this.riverCode = ModelObjects.setParent(riverCode, this);
    }

    public Code getAdminType() {
        return adminType;
    }

    public void setAdminType(Code adminType) {
        this.adminType = ModelObjects.setParent(adminType, this);
    }

    public Boolean getFlowDirection() {
        return flowDirection;
    }

    public void setFlowDirection(Boolean flowDirection) {
        this.flowDirection = flowDirection;
    }

    public Length getMaximumDepth() {
        return maximumDepth;
    }

    public void setMaximumDepth(Length maximumDepth) {
        this.maximumDepth = ModelObjects.setParent(maximumDepth, this);
    }

    public Length getWaterSurfaceElevation() {
        return waterSurfaceElevation;
    }

    public void setWaterSurfaceElevation(Length waterSurfaceElevation) {
        this.waterSurfaceElevation = ModelObjects.setParent(waterSurfaceElevation, this);
    }

    public Measure getArea() {
        return area;
    }

    public void setArea(Measure area) {
        this.area = ModelObjects.setParent(area, this);
    }

    public YearMonth getMeasurementYearMonth() {
        return measurementYearMonth;
    }

    public void setMeasurementYearMonth(YearMonth measurementYearMonth) {
        this.measurementYearMonth = measurementYearMonth;
    }

    public List<Code> getPrefecture() {
        if (prefecture == null)
            prefecture = new ChildList<>(this);

        return prefecture;
    }

    public void setPrefecture(List<Code> prefecture) {
        this.prefecture = ModelObjects.setParent(prefecture, this);
    }

    public List<Code> getCity() {
        if (city == null)
            city = new ChildList<>(this);

        return city;
    }

    public void setCity(List<Code> city) {
        this.city = ModelObjects.setParent(city, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WaterBodyDetailAttribute copy = target == null ? new WaterBodyDetailAttribute() : (WaterBodyDetailAttribute) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WaterBodyDetailAttribute(), copyBuilder);
    }
}
