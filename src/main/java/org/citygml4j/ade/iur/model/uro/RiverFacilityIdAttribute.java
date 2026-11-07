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
import org.citygml4j.model.gml.measures.Length;

public class RiverFacilityIdAttribute extends FacilityIdAttribute {
    private Code riverCode;
    private String riverName;
    private Code sideType;
    private Length leftPost;
    private Length leftDistance;
    private Length rightPost;
    private Length rightDistance;
    private Length leftStartPost;
    private Length leftStartDistance;
    private Length leftEndPost;
    private Length lefEndDistance;
    private Length rightStartPost;
    private Length rightStartDistance;
    private Length rightEndPost;
    private Length rightEndDistance;

    public Code getRiverCode() {
        return riverCode;
    }

    public void setRiverCode(Code riverCode) {
        this.riverCode = ModelObjects.setParent(riverCode, this);
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName;
    }

    public Code getSideType() {
        return sideType;
    }

    public void setSideType(Code sideType) {
        this.sideType = ModelObjects.setParent(sideType, this);
    }

    public Length getLeftPost() {
        return leftPost;
    }

    public void setLeftPost(Length leftPost) {
        this.leftPost = ModelObjects.setParent(leftPost, this);
    }

    public Length getLeftDistance() {
        return leftDistance;
    }

    public void setLeftDistance(Length leftDistance) {
        this.leftDistance = ModelObjects.setParent(leftDistance, this);
    }

    public Length getRightPost() {
        return rightPost;
    }

    public void setRightPost(Length rightPost) {
        this.rightPost = ModelObjects.setParent(rightPost, this);
    }

    public Length getRightDistance() {
        return rightDistance;
    }

    public void setRightDistance(Length rightDistance) {
        this.rightDistance = ModelObjects.setParent(rightDistance, this);
    }

    public Length getLeftStartPost() {
        return leftStartPost;
    }

    public void setLeftStartPost(Length leftStartPost) {
        this.leftStartPost = ModelObjects.setParent(leftStartPost, this);
    }

    public Length getLeftStartDistance() {
        return leftStartDistance;
    }

    public void setLeftStartDistance(Length leftStartDistance) {
        this.leftStartDistance = ModelObjects.setParent(leftStartDistance, this);
    }

    public Length getLeftEndPost() {
        return leftEndPost;
    }

    public void setLeftEndPost(Length leftEndPost) {
        this.leftEndPost = ModelObjects.setParent(leftEndPost, this);
    }

    public Length getLefEndDistance() {
        return lefEndDistance;
    }

    public void setLefEndDistance(Length lefEndDistance) {
        this.lefEndDistance = ModelObjects.setParent(lefEndDistance, this);
    }

    public Length getRightStartPost() {
        return rightStartPost;
    }

    public void setRightStartPost(Length rightStartPost) {
        this.rightStartPost = ModelObjects.setParent(rightStartPost, this);
    }

    public Length getRightStartDistance() {
        return rightStartDistance;
    }

    public void setRightStartDistance(Length rightStartDistance) {
        this.rightStartDistance = ModelObjects.setParent(rightStartDistance, this);
    }

    public Length getRightEndPost() {
        return rightEndPost;
    }

    public void setRightEndPost(Length rightEndPost) {
        this.rightEndPost = ModelObjects.setParent(rightEndPost, this);
    }

    public Length getRightEndDistance() {
        return rightEndDistance;
    }

    public void setRightEndDistance(Length rightEndDistance) {
        this.rightEndDistance = ModelObjects.setParent(rightEndDistance, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RiverFacilityIdAttribute copy = target == null ? new RiverFacilityIdAttribute() : (RiverFacilityIdAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RiverFacilityIdAttribute(), copyBuilder);
    }
}
