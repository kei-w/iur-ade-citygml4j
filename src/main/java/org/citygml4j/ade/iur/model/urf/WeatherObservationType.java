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
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.measures.Length;

import java.time.LocalDate;

public class WeatherObservationType extends AbstractDataType {
    private LocalDate date;
    private Length totalRainfall;
    private Length maxRainfallPerHour;
    private Double averageTemperature;
    private Double maxTemperature;
    private Double minTemperature;
    private Double averageWindSpeed;
    private Code maxWindDirection;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Length getTotalRainfall() {
        return totalRainfall;
    }

    public void setTotalRainfall(Length totalRainfall) {
        this.totalRainfall = ModelObjects.setParent(totalRainfall, this);
    }

    public Length getMaxRainfallPerHour() {
        return maxRainfallPerHour;
    }

    public void setMaxRainfallPerHour(Length maxRainfallPerHour) {
        this.maxRainfallPerHour = ModelObjects.setParent(maxRainfallPerHour, this);
    }

    public Double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getAverageWindSpeed() {
        return averageWindSpeed;
    }

    public void setAverageWindSpeed(Double averageWindSpeed) {
        this.averageWindSpeed = averageWindSpeed;
    }

    public Code getMaxWindDirection() {
        return maxWindDirection;
    }

    public void setMaxWindDirection(Code maxWindDirection) {
        this.maxWindDirection = ModelObjects.setParent(maxWindDirection, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        WeatherObservationType copy = target == null ? new WeatherObservationType() : (WeatherObservationType) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new WeatherObservationType(), copyBuilder);
    }
}
