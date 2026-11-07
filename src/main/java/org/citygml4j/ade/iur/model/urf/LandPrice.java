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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.Measure;
import org.citygml4j.model.gml.measures.Length;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class LandPrice extends UrbanFunction {
    private String pointCode;
    private String pointCodeOfLastYear;
    private Year fiscalYear;
    private Integer landPrice;
    private Double variability;
    private Boolean isSelected;
    private Boolean isAddressChanged;
    private Boolean isAcreageChanged;
    private Boolean isUseChanged;
    private Boolean isBuildingStructureChanged;
    private Boolean isSupplyFacilitiesChanged;
    private Boolean isDistanceFromStationChanged;
    private Boolean isUseDistrictChanged;
    private Boolean isFirePreventionChanged;
    private Boolean isUrbanPlanAreaChanged;
    private Boolean isBuildingCoverageRateChanged;
    private Boolean isFloorAreaRateChanged;
    private List<Code> cityCode;
    private String cityName;
    private String locationDescription;
    private String address;
    private Measure acreage;
    private List<String> useStatus;
    private String useStatusDescription;
    private String useType;
    private String buildingStructure;
    private Boolean water;
    private Boolean gas;
    private Boolean sewerage;
    private String shape;
    private Double frontageRate;
    private Double depthRate;
    private Integer storeysAboveGround;
    private Integer storeysBelowGround;
    private String frontageRoad;
    private String frontageRoadDirection;
    private Length frontageRoadWidth;
    private String stationSquare;
    private String frontageRoadSurface;
    private String sideRoad;
    private String sideRoadDirection;
    private String transportationFacilities;
    private String surroundings;
    private String stationName;
    private Length distanceFromStation;
    private Code useDistrict;
    private String firePrevention;
    private String urbanPlanAreaType;
    private String heightControl;
    private String forest;
    private String park;
    private Integer buildingCoverageRate;
    private Integer floorAreaRate;
    private String extraFloorAreaRate;
    private Boolean isSame;
    private String selectionStatus;
    private List<ValueByCodesProperty> landPriceHistory;
    private List<ValueByCodesProperty> attributeHistory;

    public String getPointCode() {
        return pointCode;
    }

    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    public String getPointCodeOfLastYear() {
        return pointCodeOfLastYear;
    }

    public void setPointCodeOfLastYear(String pointCodeOfLastYear) {
        this.pointCodeOfLastYear = pointCodeOfLastYear;
    }

    public Year getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Year fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Integer getLandPrice() {
        return landPrice;
    }

    public void setLandPrice(Integer landPrice) {
        this.landPrice = landPrice;
    }

    public Double getVariability() {
        return variability;
    }

    public void setVariability(Double variability) {
        this.variability = variability;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getIsAddressChanged() {
        return isAddressChanged;
    }

    public void setIsAddressChanged(Boolean isAddressChanged) {
        this.isAddressChanged = isAddressChanged;
    }

    public Boolean getIsAcreageChanged() {
        return isAcreageChanged;
    }

    public void setIsAcreageChanged(Boolean isAcreageChanged) {
        this.isAcreageChanged = isAcreageChanged;
    }

    public Boolean getIsUseChanged() {
        return isUseChanged;
    }

    public void setIsUseChanged(Boolean isUseChanged) {
        this.isUseChanged = isUseChanged;
    }

    public Boolean getIsBuildingStructureChanged() {
        return isBuildingStructureChanged;
    }

    public void setIsBuildingStructureChanged(Boolean isBuildingStructureChanged) {
        this.isBuildingStructureChanged = isBuildingStructureChanged;
    }

    public Boolean getIsSupplyFacilitiesChanged() {
        return isSupplyFacilitiesChanged;
    }

    public void setIsSupplyFacilitiesChanged(Boolean isSupplyFacilitiesChanged) {
        this.isSupplyFacilitiesChanged = isSupplyFacilitiesChanged;
    }

    public Boolean getIsDistanceFromStationChanged() {
        return isDistanceFromStationChanged;
    }

    public void setIsDistanceFromStationChanged(Boolean isDistanceFromStationChanged) {
        this.isDistanceFromStationChanged = isDistanceFromStationChanged;
    }

    public Boolean getIsUseDistrictChanged() {
        return isUseDistrictChanged;
    }

    public void setIsUseDistrictChanged(Boolean isUseDistrictChanged) {
        this.isUseDistrictChanged = isUseDistrictChanged;
    }

    public Boolean getIsFirePreventionChanged() {
        return isFirePreventionChanged;
    }

    public void setIsFirePreventionChanged(Boolean isFirePreventionChanged) {
        this.isFirePreventionChanged = isFirePreventionChanged;
    }

    public Boolean getIsUrbanPlanAreaChanged() {
        return isUrbanPlanAreaChanged;
    }

    public void setIsUrbanPlanAreaChanged(Boolean isUrbanPlanAreaChanged) {
        this.isUrbanPlanAreaChanged = isUrbanPlanAreaChanged;
    }

    public Boolean getIsBuildingCoverageRateChanged() {
        return isBuildingCoverageRateChanged;
    }

    public void setIsBuildingCoverageRateChanged(Boolean isBuildingCoverageRateChanged) {
        this.isBuildingCoverageRateChanged = isBuildingCoverageRateChanged;
    }

    public Boolean getIsFloorAreaRateChanged() {
        return isFloorAreaRateChanged;
    }

    public void setIsFloorAreaRateChanged(Boolean isFloorAreaRateChanged) {
        this.isFloorAreaRateChanged = isFloorAreaRateChanged;
    }

    public List<Code> getCityCode() {
        if (cityCode == null)
            cityCode = new ChildList<>(this);

        return cityCode;
    }

    public void setCityCode(List<Code> cityCode) {
        this.cityCode = ModelObjects.setParent(cityCode, this);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Measure getAcreage() {
        return acreage;
    }

    public void setAcreage(Measure acreage) {
        this.acreage = ModelObjects.setParent(acreage, this);
    }

    public List<String> getUseStatus() {
        if (useStatus == null)
            useStatus = new ArrayList<>();

        return useStatus;
    }

    public void setUseStatus(List<String> useStatus) {
        this.useStatus = useStatus;
    }

    public String getUseStatusDescription() {
        return useStatusDescription;
    }

    public void setUseStatusDescription(String useStatusDescription) {
        this.useStatusDescription = useStatusDescription;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getBuildingStructure() {
        return buildingStructure;
    }

    public void setBuildingStructure(String buildingStructure) {
        this.buildingStructure = buildingStructure;
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean getGas() {
        return gas;
    }

    public void setGas(Boolean gas) {
        this.gas = gas;
    }

    public Boolean getSewerage() {
        return sewerage;
    }

    public void setSewerage(Boolean sewerage) {
        this.sewerage = sewerage;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Double getFrontageRate() {
        return frontageRate;
    }

    public void setFrontageRate(Double frontageRate) {
        this.frontageRate = frontageRate;
    }

    public Double getDepthRate() {
        return depthRate;
    }

    public void setDepthRate(Double depthRate) {
        this.depthRate = depthRate;
    }

    public Integer getStoreysAboveGround() {
        return storeysAboveGround;
    }

    public void setStoreysAboveGround(Integer storeysAboveGround) {
        this.storeysAboveGround = storeysAboveGround;
    }

    public Integer getStoreysBelowGround() {
        return storeysBelowGround;
    }

    public void setStoreysBelowGround(Integer storeysBelowGround) {
        this.storeysBelowGround = storeysBelowGround;
    }

    public String getFrontageRoad() {
        return frontageRoad;
    }

    public void setFrontageRoad(String frontageRoad) {
        this.frontageRoad = frontageRoad;
    }

    public String getFrontageRoadDirection() {
        return frontageRoadDirection;
    }

    public void setFrontageRoadDirection(String frontageRoadDirection) {
        this.frontageRoadDirection = frontageRoadDirection;
    }

    public Length getFrontageRoadWidth() {
        return frontageRoadWidth;
    }

    public void setFrontageRoadWidth(Length frontageRoadWidth) {
        this.frontageRoadWidth = ModelObjects.setParent(frontageRoadWidth, this);
    }

    public String getStationSquare() {
        return stationSquare;
    }

    public void setStationSquare(String stationSquare) {
        this.stationSquare = stationSquare;
    }

    public String getFrontageRoadSurface() {
        return frontageRoadSurface;
    }

    public void setFrontageRoadSurface(String frontageRoadSurface) {
        this.frontageRoadSurface = frontageRoadSurface;
    }

    public String getSideRoad() {
        return sideRoad;
    }

    public void setSideRoad(String sideRoad) {
        this.sideRoad = sideRoad;
    }

    public String getSideRoadDirection() {
        return sideRoadDirection;
    }

    public void setSideRoadDirection(String sideRoadDirection) {
        this.sideRoadDirection = sideRoadDirection;
    }

    public String getTransportationFacilities() {
        return transportationFacilities;
    }

    public void setTransportationFacilities(String transportationFacilities) {
        this.transportationFacilities = transportationFacilities;
    }

    public String getSurroundings() {
        return surroundings;
    }

    public void setSurroundings(String surroundings) {
        this.surroundings = surroundings;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Length getDistanceFromStation() {
        return distanceFromStation;
    }

    public void setDistanceFromStation(Length distanceFromStation) {
        this.distanceFromStation = ModelObjects.setParent(distanceFromStation, this);
    }

    public Code getUseDistrict() {
        return useDistrict;
    }

    public void setUseDistrict(Code useDistrict) {
        this.useDistrict = ModelObjects.setParent(useDistrict, this);
    }

    public String getFirePrevention() {
        return firePrevention;
    }

    public void setFirePrevention(String firePrevention) {
        this.firePrevention = firePrevention;
    }

    public String getUrbanPlanAreaType() {
        return urbanPlanAreaType;
    }

    public void setUrbanPlanAreaType(String urbanPlanAreaType) {
        this.urbanPlanAreaType = urbanPlanAreaType;
    }

    public String getHeightControl() {
        return heightControl;
    }

    public void setHeightControl(String heightControl) {
        this.heightControl = heightControl;
    }

    public String getForest() {
        return forest;
    }

    public void setForest(String forest) {
        this.forest = forest;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public Integer getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    public void setBuildingCoverageRate(Integer buildingCoverageRate) {
        this.buildingCoverageRate = buildingCoverageRate;
    }

    public Integer getFloorAreaRate() {
        return floorAreaRate;
    }

    public void setFloorAreaRate(Integer floorAreaRate) {
        this.floorAreaRate = floorAreaRate;
    }

    public String getExtraFloorAreaRate() {
        return extraFloorAreaRate;
    }

    public void setExtraFloorAreaRate(String extraFloorAreaRate) {
        this.extraFloorAreaRate = extraFloorAreaRate;
    }

    public Boolean getIsSame() {
        return isSame;
    }

    public void setIsSame(Boolean isSame) {
        this.isSame = isSame;
    }

    public String getSelectionStatus() {
        return selectionStatus;
    }

    public void setSelectionStatus(String selectionStatus) {
        this.selectionStatus = selectionStatus;
    }

    public List<ValueByCodesProperty> getLandPriceHistory() {
        if (landPriceHistory == null)
            landPriceHistory = new ChildList<>(this);

        return landPriceHistory;
    }

    public void setLandPriceHistory(List<ValueByCodesProperty> landPriceHistory) {
        this.landPriceHistory = ModelObjects.setParent(landPriceHistory, this);
    }

    public List<ValueByCodesProperty> getAttributeHistory() {
        if (attributeHistory == null)
            attributeHistory = new ChildList<>(this);

        return attributeHistory;
    }

    public void setAttributeHistory(List<ValueByCodesProperty> attributeHistory) {
        this.attributeHistory = ModelObjects.setParent(attributeHistory, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        LandPrice copy = target == null ? new LandPrice() : (LandPrice) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new LandPrice(), copyBuilder);
    }
}
