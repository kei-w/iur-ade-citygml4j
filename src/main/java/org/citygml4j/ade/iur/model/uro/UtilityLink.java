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
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.measures.Length;

import java.util.List;

public abstract class UtilityLink extends UtilityNetworkElement {
    private String routeStartNode;
    private String startNode;
    private String routeEndNode;
    private String endNode;
    private Length depth;
    private Length minDepth;
    private Length maxDepth;
    private Length maxWidth;
    private Length offset;
    private Code material;
    private List<LengthAttributeProperty> lengthAttribute;

    public String getRouteStartNode() {
        return routeStartNode;
    }

    public void setRouteStartNode(String routeStartNode) {
        this.routeStartNode = routeStartNode;
    }

    public String getStartNode() {
        return startNode;
    }

    public void setStartNode(String startNode) {
        this.startNode = startNode;
    }

    public String getRouteEndNode() {
        return routeEndNode;
    }

    public void setRouteEndNode(String routeEndNode) {
        this.routeEndNode = routeEndNode;
    }

    public String getEndNode() {
        return endNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode;
    }

    public Length getDepth() {
        return depth;
    }

    public void setDepth(Length depth) {
        this.depth = ModelObjects.setParent(depth, this);
    }

    public Length getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(Length minDepth) {
        this.minDepth = ModelObjects.setParent(minDepth, this);
    }

    public Length getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Length maxDepth) {
        this.maxDepth = ModelObjects.setParent(maxDepth, this);
    }

    public Length getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Length maxWidth) {
        this.maxWidth = ModelObjects.setParent(maxWidth, this);
    }

    public Length getOffset() {
        return offset;
    }

    public void setOffset(Length offset) {
        this.offset = ModelObjects.setParent(offset, this);
    }

    public Code getMaterial() {
        return material;
    }

    public void setMaterial(Code material) {
        this.material = ModelObjects.setParent(material, this);
    }

    public List<LengthAttributeProperty> getLengthAttribute() {
        if (lengthAttribute == null)
            lengthAttribute = new ChildList<>(this);

        return lengthAttribute;
    }

    public void setLengthAttribute(List<LengthAttributeProperty> lengthAttribute) {
        this.lengthAttribute = ModelObjects.setParent(lengthAttribute, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        if (target == null)
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

        UtilityLink copy = (UtilityLink) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, UtilityLink.class, copyBuilder);
    }
}
