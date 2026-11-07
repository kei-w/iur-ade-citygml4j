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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UseDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UseDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="minimumSiteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="wallSetbackDistance" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="buildingHeightLimits" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="buildingRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="otherRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="setbackRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="frontRoadRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="adjacentLandRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="northDirectionRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="shadeRegulation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseDistrictType", propOrder = {
    "floorAreaRate",
    "minimumSiteArea",
    "buildingCoverageRate",
    "wallSetbackDistance",
    "buildingHeightLimits",
    "buildingRestrictions",
    "otherRestrictions",
    "setbackRestrictions",
    "frontRoadRestrictions",
    "adjacentLandRestrictions",
    "northDirectionRestrictions",
    "shadeRegulation"
})
public class UseDistrictType
    extends DistrictsAndZonesType
{

    @XmlElement(required = true)
    protected BigInteger floorAreaRate;
    protected MeasureType minimumSiteArea;
    protected BigInteger buildingCoverageRate;
    protected StringOrRefType wallSetbackDistance;
    protected LengthType buildingHeightLimits;
    protected StringOrRefType buildingRestrictions;
    protected StringOrRefType otherRestrictions;
    protected StringOrRefType setbackRestrictions;
    protected StringOrRefType frontRoadRestrictions;
    protected StringOrRefType adjacentLandRestrictions;
    protected StringOrRefType northDirectionRestrictions;
    protected StringOrRefType shadeRegulation;

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
     * Gets the value of the minimumSiteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumSiteArea() {
        return minimumSiteArea;
    }

    /**
     * Sets the value of the minimumSiteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumSiteArea(MeasureType value) {
        this.minimumSiteArea = value;
    }

    public boolean isSetMinimumSiteArea() {
        return (this.minimumSiteArea!= null);
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
     * Gets the value of the wallSetbackDistance property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getWallSetbackDistance() {
        return wallSetbackDistance;
    }

    /**
     * Sets the value of the wallSetbackDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setWallSetbackDistance(StringOrRefType value) {
        this.wallSetbackDistance = value;
    }

    public boolean isSetWallSetbackDistance() {
        return (this.wallSetbackDistance!= null);
    }

    /**
     * Gets the value of the buildingHeightLimits property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBuildingHeightLimits() {
        return buildingHeightLimits;
    }

    /**
     * Sets the value of the buildingHeightLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBuildingHeightLimits(LengthType value) {
        this.buildingHeightLimits = value;
    }

    public boolean isSetBuildingHeightLimits() {
        return (this.buildingHeightLimits!= null);
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
     * Gets the value of the otherRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getOtherRestrictions() {
        return otherRestrictions;
    }

    /**
     * Sets the value of the otherRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setOtherRestrictions(StringOrRefType value) {
        this.otherRestrictions = value;
    }

    public boolean isSetOtherRestrictions() {
        return (this.otherRestrictions!= null);
    }

    /**
     * Gets the value of the setbackRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSetbackRestrictions() {
        return setbackRestrictions;
    }

    /**
     * Sets the value of the setbackRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSetbackRestrictions(StringOrRefType value) {
        this.setbackRestrictions = value;
    }

    public boolean isSetSetbackRestrictions() {
        return (this.setbackRestrictions!= null);
    }

    /**
     * Gets the value of the frontRoadRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getFrontRoadRestrictions() {
        return frontRoadRestrictions;
    }

    /**
     * Sets the value of the frontRoadRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setFrontRoadRestrictions(StringOrRefType value) {
        this.frontRoadRestrictions = value;
    }

    public boolean isSetFrontRoadRestrictions() {
        return (this.frontRoadRestrictions!= null);
    }

    /**
     * Gets the value of the adjacentLandRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getAdjacentLandRestrictions() {
        return adjacentLandRestrictions;
    }

    /**
     * Sets the value of the adjacentLandRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setAdjacentLandRestrictions(StringOrRefType value) {
        this.adjacentLandRestrictions = value;
    }

    public boolean isSetAdjacentLandRestrictions() {
        return (this.adjacentLandRestrictions!= null);
    }

    /**
     * Gets the value of the northDirectionRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getNorthDirectionRestrictions() {
        return northDirectionRestrictions;
    }

    /**
     * Sets the value of the northDirectionRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setNorthDirectionRestrictions(StringOrRefType value) {
        this.northDirectionRestrictions = value;
    }

    public boolean isSetNorthDirectionRestrictions() {
        return (this.northDirectionRestrictions!= null);
    }

    /**
     * Gets the value of the shadeRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getShadeRegulation() {
        return shadeRegulation;
    }

    /**
     * Sets the value of the shadeRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setShadeRegulation(StringOrRefType value) {
        this.shadeRegulation = value;
    }

    public boolean isSetShadeRegulation() {
        return (this.shadeRegulation!= null);
    }

}
