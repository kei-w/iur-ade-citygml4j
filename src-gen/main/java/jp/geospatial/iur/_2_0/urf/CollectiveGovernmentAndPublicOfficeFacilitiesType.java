//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for CollectiveGovernmentAndPublicOfficeFacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectiveGovernmentAndPublicOfficeFacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="publicFacilitiesAllocationPolicy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledExecutor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectiveGovernmentAndPublicOfficeFacilitiesType", propOrder = {
    "buildingCoverageRate",
    "floorAreaRate",
    "publicFacilitiesAllocationPolicy",
    "scheduledExecutor"
})
public class CollectiveGovernmentAndPublicOfficeFacilitiesType
    extends UrbanFacilityType
{

    protected Double buildingCoverageRate;
    protected Double floorAreaRate;
    protected StringOrRefType publicFacilitiesAllocationPolicy;
    protected String scheduledExecutor;

    /**
     * Gets the value of the buildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    /**
     * Sets the value of the buildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildingCoverageRate(Double value) {
        this.buildingCoverageRate = value;
    }

    public boolean isSetBuildingCoverageRate() {
        return (this.buildingCoverageRate!= null);
    }

    /**
     * Gets the value of the floorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloorAreaRate() {
        return floorAreaRate;
    }

    /**
     * Sets the value of the floorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloorAreaRate(Double value) {
        this.floorAreaRate = value;
    }

    public boolean isSetFloorAreaRate() {
        return (this.floorAreaRate!= null);
    }

    /**
     * Gets the value of the publicFacilitiesAllocationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicFacilitiesAllocationPolicy() {
        return publicFacilitiesAllocationPolicy;
    }

    /**
     * Sets the value of the publicFacilitiesAllocationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicFacilitiesAllocationPolicy(StringOrRefType value) {
        this.publicFacilitiesAllocationPolicy = value;
    }

    public boolean isSetPublicFacilitiesAllocationPolicy() {
        return (this.publicFacilitiesAllocationPolicy!= null);
    }

    /**
     * Gets the value of the scheduledExecutor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledExecutor() {
        return scheduledExecutor;
    }

    /**
     * Sets the value of the scheduledExecutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledExecutor(String value) {
        this.scheduledExecutor = value;
    }

    public boolean isSetScheduledExecutor() {
        return (this.scheduledExecutor!= null);
    }

}
