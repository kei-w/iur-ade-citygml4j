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

import java.util.ArrayList;
import java.util.List;

public class FacilityIdAttribute extends AbstractDataType {
    private String id;
    private String partId;
    private String branchId;
    private List<Code> prefecture;
    private List<Code> city;
    private String route;
    private String startPost;
    private String endPost;
    private Double startLat;
    private Double startLong;
    private List<String> alternativeName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
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

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStartPost() {
        return startPost;
    }

    public void setStartPost(String startPost) {
        this.startPost = startPost;
    }

    public String getEndPost() {
        return endPost;
    }

    public void setEndPost(String endPost) {
        this.endPost = endPost;
    }

    public Double getStartLat() {
        return startLat;
    }

    public void setStartLat(Double startLat) {
        this.startLat = startLat;
    }

    public Double getStartLong() {
        return startLong;
    }

    public void setStartLong(Double startLong) {
        this.startLong = startLong;
    }

    public List<String> getAlternativeName() {
        if (alternativeName == null)
            alternativeName = new ArrayList<>();

        return alternativeName;
    }

    public void setAlternativeName(List<String> alternativeName) {
        this.alternativeName = alternativeName;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        FacilityIdAttribute copy = target == null ? new FacilityIdAttribute() : (FacilityIdAttribute) target;
        return ObjectCopier.copyTo(this, copy, FacilityIdAttribute.class, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new FacilityIdAttribute(), copyBuilder);
    }
}
