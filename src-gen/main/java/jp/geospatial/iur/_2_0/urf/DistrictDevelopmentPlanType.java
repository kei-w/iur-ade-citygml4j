//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DistrictDevelopmentPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictDevelopmentPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="districtFacilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="buildingRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="urbanGreenSpaceConservation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="activityRestrictionInFarmland" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="landuseRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="districtFacility" type="{https://www.geospatial.jp/iur/urf/2.0}DistrictFacilityPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="district" type="{https://www.geospatial.jp/iur/urf/2.0}DistrictPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictDevelopmentPlanType", propOrder = {
    "districtFacilitiesAllocation",
    "buildingRestrictions",
    "urbanGreenSpaceConservation",
    "activityRestrictionInFarmland",
    "landuseRestrictions",
    "districtFacility",
    "district"
})
@XmlSeeAlso({
    SpecifiedBuildingZoneImprovementPlanType.class,
    DistrictImprovementPlanForDisasterPreventionBlockImprovementZonePlanType.class,
    DistrictImprovementPlanForHistoricSceneryMaintenanceAndImprovementDistrictType.class,
    RoadsideDistrictImprovementPlanType.class,
    RuralDistrictImprovementPlanType.class
})
public class DistrictDevelopmentPlanType
    extends ZoneType
{

    protected StringOrRefType districtFacilitiesAllocation;
    protected StringOrRefType buildingRestrictions;
    protected StringOrRefType urbanGreenSpaceConservation;
    protected StringOrRefType activityRestrictionInFarmland;
    protected StringOrRefType landuseRestrictions;
    protected List<DistrictFacilityPropertyType> districtFacility;
    protected List<DistrictPropertyType> district;

    /**
     * Gets the value of the districtFacilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDistrictFacilitiesAllocation() {
        return districtFacilitiesAllocation;
    }

    /**
     * Sets the value of the districtFacilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDistrictFacilitiesAllocation(StringOrRefType value) {
        this.districtFacilitiesAllocation = value;
    }

    public boolean isSetDistrictFacilitiesAllocation() {
        return (this.districtFacilitiesAllocation!= null);
    }

    /**
     * Gets the value of the buildingRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getBuildingRestrictions() {
        return buildingRestrictions;
    }

    /**
     * Sets the value of the buildingRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setBuildingRestrictions(StringOrRefType value) {
        this.buildingRestrictions = value;
    }

    public boolean isSetBuildingRestrictions() {
        return (this.buildingRestrictions!= null);
    }

    /**
     * Gets the value of the urbanGreenSpaceConservation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getUrbanGreenSpaceConservation() {
        return urbanGreenSpaceConservation;
    }

    /**
     * Sets the value of the urbanGreenSpaceConservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setUrbanGreenSpaceConservation(StringOrRefType value) {
        this.urbanGreenSpaceConservation = value;
    }

    public boolean isSetUrbanGreenSpaceConservation() {
        return (this.urbanGreenSpaceConservation!= null);
    }

    /**
     * Gets the value of the activityRestrictionInFarmland property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getActivityRestrictionInFarmland() {
        return activityRestrictionInFarmland;
    }

    /**
     * Sets the value of the activityRestrictionInFarmland property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setActivityRestrictionInFarmland(StringOrRefType value) {
        this.activityRestrictionInFarmland = value;
    }

    public boolean isSetActivityRestrictionInFarmland() {
        return (this.activityRestrictionInFarmland!= null);
    }

    /**
     * Gets the value of the landuseRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getLanduseRestrictions() {
        return landuseRestrictions;
    }

    /**
     * Sets the value of the landuseRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setLanduseRestrictions(StringOrRefType value) {
        this.landuseRestrictions = value;
    }

    public boolean isSetLanduseRestrictions() {
        return (this.landuseRestrictions!= null);
    }

    /**
     * Gets the value of the districtFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the districtFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrictFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictFacilityPropertyType }
     * 
     * 
     */
    public List<DistrictFacilityPropertyType> getDistrictFacility() {
        if (districtFacility == null) {
            districtFacility = new ArrayList<DistrictFacilityPropertyType>();
        }
        return this.districtFacility;
    }

    public boolean isSetDistrictFacility() {
        return ((this.districtFacility!= null)&&(!this.districtFacility.isEmpty()));
    }

    public void unsetDistrictFacility() {
        this.districtFacility = null;
    }

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictPropertyType }
     * 
     * 
     */
    public List<DistrictPropertyType> getDistrict() {
        if (district == null) {
            district = new ArrayList<DistrictPropertyType>();
        }
        return this.district;
    }

    public boolean isSetDistrict() {
        return ((this.district!= null)&&(!this.district.isEmpty()));
    }

    public void unsetDistrict() {
        this.district = null;
    }

}
