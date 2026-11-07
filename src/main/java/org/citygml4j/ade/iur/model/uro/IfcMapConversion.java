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
import org.citygml4j.model.gml.measures.Length;

public class IfcMapConversion extends IfcAttribute {
    private IfcCoordinateReferenceSystemSelect sourceCRS;
    private IfcCoordinateReferenceSystemProperty targetCRS;
    private Length eastings;
    private Length northings;
    private Length orthogonalHeight;
    private Double xAxisAbscissa;
    private Double xAxisOrdinate;
    private Double scale;

    public IfcCoordinateReferenceSystemSelect getSourceCRS() {
        return sourceCRS;
    }

    public void setSourceCRS(IfcCoordinateReferenceSystemSelect sourceCRS) {
        this.sourceCRS = ModelObjects.setParent(sourceCRS, this);
    }

    public IfcCoordinateReferenceSystemProperty getTargetCRS() {
        return targetCRS;
    }

    public void setTargetCRS(IfcCoordinateReferenceSystemProperty targetCRS) {
        this.targetCRS = ModelObjects.setParent(targetCRS, this);
    }

    public Length getEastings() {
        return eastings;
    }

    public void setEastings(Length eastings) {
        this.eastings = ModelObjects.setParent(eastings, this);
    }

    public Length getNorthings() {
        return northings;
    }

    public void setNorthings(Length northings) {
        this.northings = ModelObjects.setParent(northings, this);
    }

    public Length getOrthogonalHeight() {
        return orthogonalHeight;
    }

    public void setOrthogonalHeight(Length orthogonalHeight) {
        this.orthogonalHeight = ModelObjects.setParent(orthogonalHeight, this);
    }

    public Double getXAxisAbscissa() {
        return xAxisAbscissa;
    }

    public void setXAxisAbscissa(Double xAxisAbscissa) {
        this.xAxisAbscissa = xAxisAbscissa;
    }

    public Double getXAxisOrdinate() {
        return xAxisOrdinate;
    }

    public void setXAxisOrdinate(Double xAxisOrdinate) {
        this.xAxisOrdinate = xAxisOrdinate;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        IfcMapConversion copy = target == null ? new IfcMapConversion() : (IfcMapConversion) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new IfcMapConversion(), copyBuilder);
    }
}
