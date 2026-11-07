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

package org.citygml4j.ade.iur.model.urg;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class StatusOfSiteSeeing extends StatisticalGrid {
    private Integer numOfHotels;
    private Integer numOfRyokan;
    private Integer numOfPublicInn;
    private Integer numOfInn;
    private Integer numOfCotage;
    private Integer numOfTempleHotel;
    private Integer numOfRentaVilla;
    private Integer numOfYouthHostel;
    private Integer numOfCapsuleHotel;
    private Integer numOfTrainingCenter;
    private Integer totalAccomodations;
    private Integer totalCapacity;
    private Integer totalRooms;

    public Integer getNumOfHotels() {
        return numOfHotels;
    }

    public void setNumOfHotels(Integer numOfHotels) {
        this.numOfHotels = numOfHotels;
    }

    public Integer getNumOfRyokan() {
        return numOfRyokan;
    }

    public void setNumOfRyokan(Integer numOfRyokan) {
        this.numOfRyokan = numOfRyokan;
    }

    public Integer getNumOfPublicInn() {
        return numOfPublicInn;
    }

    public void setNumOfPublicInn(Integer numOfPublicInn) {
        this.numOfPublicInn = numOfPublicInn;
    }

    public Integer getNumOfInn() {
        return numOfInn;
    }

    public void setNumOfInn(Integer numOfInn) {
        this.numOfInn = numOfInn;
    }

    public Integer getNumOfCotage() {
        return numOfCotage;
    }

    public void setNumOfCotage(Integer numOfCotage) {
        this.numOfCotage = numOfCotage;
    }

    public Integer getNumOfTempleHotel() {
        return numOfTempleHotel;
    }

    public void setNumOfTempleHotel(Integer numOfTempleHotel) {
        this.numOfTempleHotel = numOfTempleHotel;
    }

    public Integer getNumOfRentaVilla() {
        return numOfRentaVilla;
    }

    public void setNumOfRentaVilla(Integer numOfRentaVilla) {
        this.numOfRentaVilla = numOfRentaVilla;
    }

    public Integer getNumOfYouthHostel() {
        return numOfYouthHostel;
    }

    public void setNumOfYouthHostel(Integer numOfYouthHostel) {
        this.numOfYouthHostel = numOfYouthHostel;
    }

    public Integer getNumOfCapsuleHotel() {
        return numOfCapsuleHotel;
    }

    public void setNumOfCapsuleHotel(Integer numOfCapsuleHotel) {
        this.numOfCapsuleHotel = numOfCapsuleHotel;
    }

    public Integer getNumOfTrainingCenter() {
        return numOfTrainingCenter;
    }

    public void setNumOfTrainingCenter(Integer numOfTrainingCenter) {
        this.numOfTrainingCenter = numOfTrainingCenter;
    }

    public Integer getTotalAccomodations() {
        return totalAccomodations;
    }

    public void setTotalAccomodations(Integer totalAccomodations) {
        this.totalAccomodations = totalAccomodations;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Integer getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Integer totalRooms) {
        this.totalRooms = totalRooms;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        StatusOfSiteSeeing copy = target == null ? new StatusOfSiteSeeing() : (StatusOfSiteSeeing) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new StatusOfSiteSeeing(), copyBuilder);
    }
}
