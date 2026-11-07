//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for CollectiveHousingFacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectiveHousingFacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLowRiseHousing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMiddleRiseHousing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHighRiseHousing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfHousing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "CollectiveHousingFacilitiesType", propOrder = {
    "buildingCoverageRate",
    "floorAreaRate",
    "numberOfLowRiseHousing",
    "numberOfMiddleRiseHousing",
    "numberOfHighRiseHousing",
    "totalNumberOfHousing",
    "publicFacilitiesAllocationPolicy",
    "scheduledExecutor"
})
public class CollectiveHousingFacilitiesType
    extends UrbanFacilityType
{

    protected BigInteger buildingCoverageRate;
    protected BigInteger floorAreaRate;
    protected BigInteger numberOfLowRiseHousing;
    protected BigInteger numberOfMiddleRiseHousing;
    protected BigInteger numberOfHighRiseHousing;
    protected BigInteger totalNumberOfHousing;
    protected StringOrRefType publicFacilitiesAllocationPolicy;
    protected String scheduledExecutor;

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
     * Gets the value of the numberOfLowRiseHousing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLowRiseHousing() {
        return numberOfLowRiseHousing;
    }

    /**
     * Sets the value of the numberOfLowRiseHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLowRiseHousing(BigInteger value) {
        this.numberOfLowRiseHousing = value;
    }

    public boolean isSetNumberOfLowRiseHousing() {
        return (this.numberOfLowRiseHousing!= null);
    }

    /**
     * Gets the value of the numberOfMiddleRiseHousing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMiddleRiseHousing() {
        return numberOfMiddleRiseHousing;
    }

    /**
     * Sets the value of the numberOfMiddleRiseHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMiddleRiseHousing(BigInteger value) {
        this.numberOfMiddleRiseHousing = value;
    }

    public boolean isSetNumberOfMiddleRiseHousing() {
        return (this.numberOfMiddleRiseHousing!= null);
    }

    /**
     * Gets the value of the numberOfHighRiseHousing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHighRiseHousing() {
        return numberOfHighRiseHousing;
    }

    /**
     * Sets the value of the numberOfHighRiseHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHighRiseHousing(BigInteger value) {
        this.numberOfHighRiseHousing = value;
    }

    public boolean isSetNumberOfHighRiseHousing() {
        return (this.numberOfHighRiseHousing!= null);
    }

    /**
     * Gets the value of the totalNumberOfHousing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfHousing() {
        return totalNumberOfHousing;
    }

    /**
     * Sets the value of the totalNumberOfHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfHousing(BigInteger value) {
        this.totalNumberOfHousing = value;
    }

    public boolean isSetTotalNumberOfHousing() {
        return (this.totalNumberOfHousing!= null);
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
