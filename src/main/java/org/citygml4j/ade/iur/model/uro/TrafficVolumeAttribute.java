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

import java.time.Year;

public class TrafficVolumeAttribute extends RoadAttribute {
    private String sectionID;
    private Integer weekday12hourTrafficVolume;
    private Integer weekday24hourTrafficVolume;
    private Double largeVehicleRate;
    private Double congestionRate;
    private Double averageTravelSpeedInCongestion;
    private Double averageInboundTravelSpeedInCongestion;
    private Double averageOutboundTravelSpeedInCongestion;
    private String observationPointName;
    private String reference;
    private Year surveyYear;

    public String getSectionID() {
        return sectionID;
    }

    public void setSectionID(String sectionID) {
        this.sectionID = sectionID;
    }

    public Integer getWeekday12hourTrafficVolume() {
        return weekday12hourTrafficVolume;
    }

    public void setWeekday12hourTrafficVolume(Integer weekday12hourTrafficVolume) {
        this.weekday12hourTrafficVolume = weekday12hourTrafficVolume;
    }

    public Integer getWeekday24hourTrafficVolume() {
        return weekday24hourTrafficVolume;
    }

    public void setWeekday24hourTrafficVolume(Integer weekday24hourTrafficVolume) {
        this.weekday24hourTrafficVolume = weekday24hourTrafficVolume;
    }

    public Double getLargeVehicleRate() {
        return largeVehicleRate;
    }

    public void setLargeVehicleRate(Double largeVehicleRate) {
        this.largeVehicleRate = largeVehicleRate;
    }

    public Double getCongestionRate() {
        return congestionRate;
    }

    public void setCongestionRate(Double congestionRate) {
        this.congestionRate = congestionRate;
    }

    public Double getAverageTravelSpeedInCongestion() {
        return averageTravelSpeedInCongestion;
    }

    public void setAverageTravelSpeedInCongestion(Double averageTravelSpeedInCongestion) {
        this.averageTravelSpeedInCongestion = averageTravelSpeedInCongestion;
    }

    public Double getAverageInboundTravelSpeedInCongestion() {
        return averageInboundTravelSpeedInCongestion;
    }

    public void setAverageInboundTravelSpeedInCongestion(Double averageInboundTravelSpeedInCongestion) {
        this.averageInboundTravelSpeedInCongestion = averageInboundTravelSpeedInCongestion;
    }

    public Double getAverageOutboundTravelSpeedInCongestion() {
        return averageOutboundTravelSpeedInCongestion;
    }

    public void setAverageOutboundTravelSpeedInCongestion(Double averageOutboundTravelSpeedInCongestion) {
        this.averageOutboundTravelSpeedInCongestion = averageOutboundTravelSpeedInCongestion;
    }

    public String getObservationPointName() {
        return observationPointName;
    }

    public void setObservationPointName(String observationPointName) {
        this.observationPointName = observationPointName;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Year getSurveyYear() {
        return surveyYear;
    }

    public void setSurveyYear(Year surveyYear) {
        this.surveyYear = surveyYear;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        TrafficVolumeAttribute copy = target == null ? new TrafficVolumeAttribute() : (TrafficVolumeAttribute) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new TrafficVolumeAttribute(), copyBuilder);
    }
}
