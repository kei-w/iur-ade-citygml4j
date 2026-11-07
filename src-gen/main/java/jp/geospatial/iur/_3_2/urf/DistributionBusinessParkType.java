//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DistributionBusinessParkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionBusinessParkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distributionBusinessPark" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="publicAndUtilityFacilities" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maximumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="setbackSize" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
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
@XmlType(name = "DistributionBusinessParkType", propOrder = {
    "distributionBusinessPark",
    "publicAndUtilityFacilities",
    "buildingCoverageRate",
    "floorAreaRate",
    "maximumBuildingHeight",
    "minimumBuildingHeight",
    "setbackSize",
    "scheduledExecutor"
})
public class DistributionBusinessParkType
    extends UrbanFacilityType
{

    protected StringOrRefType distributionBusinessPark;
    protected StringOrRefType publicAndUtilityFacilities;
    protected BigInteger buildingCoverageRate;
    protected BigInteger floorAreaRate;
    protected LengthType maximumBuildingHeight;
    protected LengthType minimumBuildingHeight;
    protected StringOrRefType setbackSize;
    protected String scheduledExecutor;

    /**
     * Gets the value of the distributionBusinessPark property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDistributionBusinessPark() {
        return distributionBusinessPark;
    }

    /**
     * Sets the value of the distributionBusinessPark property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDistributionBusinessPark(StringOrRefType value) {
        this.distributionBusinessPark = value;
    }

    public boolean isSetDistributionBusinessPark() {
        return (this.distributionBusinessPark!= null);
    }

    /**
     * Gets the value of the publicAndUtilityFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicAndUtilityFacilities() {
        return publicAndUtilityFacilities;
    }

    /**
     * Sets the value of the publicAndUtilityFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicAndUtilityFacilities(StringOrRefType value) {
        this.publicAndUtilityFacilities = value;
    }

    public boolean isSetPublicAndUtilityFacilities() {
        return (this.publicAndUtilityFacilities!= null);
    }

    /**
     * Gets the value of the buildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    /**
     * Sets the value of the buildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuildingCoverageRate(BigInteger value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloorAreaRate() {
        return floorAreaRate;
    }

    /**
     * Sets the value of the floorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloorAreaRate(BigInteger value) {
        this.floorAreaRate = value;
    }

    public boolean isSetFloorAreaRate() {
        return (this.floorAreaRate!= null);
    }

    /**
     * Gets the value of the maximumBuildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumBuildingHeight() {
        return maximumBuildingHeight;
    }

    /**
     * Sets the value of the maximumBuildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumBuildingHeight(LengthType value) {
        this.maximumBuildingHeight = value;
    }

    public boolean isSetMaximumBuildingHeight() {
        return (this.maximumBuildingHeight!= null);
    }

    /**
     * Gets the value of the minimumBuildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumBuildingHeight() {
        return minimumBuildingHeight;
    }

    /**
     * Sets the value of the minimumBuildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumBuildingHeight(LengthType value) {
        this.minimumBuildingHeight = value;
    }

    public boolean isSetMinimumBuildingHeight() {
        return (this.minimumBuildingHeight!= null);
    }

    /**
     * Gets the value of the setbackSize property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSetbackSize() {
        return setbackSize;
    }

    /**
     * Sets the value of the setbackSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSetbackSize(StringOrRefType value) {
        this.setbackSize = value;
    }

    public boolean isSetSetbackSize() {
        return (this.setbackSize!= null);
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
