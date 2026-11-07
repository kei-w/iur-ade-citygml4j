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
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="useRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="maximumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumSiteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="minimumGroundHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="setbackSize" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="strucuturePlacementRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="maximumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumFloorHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="buildingDesignRestriction" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="minimumGreeningRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fenceGuideline" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="restrictionsForFireProtection" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="restrictionsForNoiseProtection" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="minimumFrontageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictType", propOrder = {
    "buildingRestrictions",
    "useRestrictions",
    "maximumFloorAreaRate",
    "minimumFloorAreaRate",
    "maximumBuildingCoverageRate",
    "minimumBuildingCoverageRate",
    "minimumSiteArea",
    "minimumBuildingArea",
    "minimumGroundHeight",
    "setbackSize",
    "strucuturePlacementRestrictions",
    "maximumBuildingHeight",
    "minimumBuildingHeight",
    "minimumFloorHeight",
    "buildingDesignRestriction",
    "minimumGreeningRate",
    "fenceGuideline",
    "restrictionsForFireProtection",
    "restrictionsForNoiseProtection",
    "minimumFrontageRate"
})
public class DistrictType
    extends ZoneType
{

    protected StringOrRefType buildingRestrictions;
    protected StringOrRefType useRestrictions;
    protected Double maximumFloorAreaRate;
    protected Double minimumFloorAreaRate;
    protected Double maximumBuildingCoverageRate;
    protected Double minimumBuildingCoverageRate;
    protected MeasureType minimumSiteArea;
    protected MeasureType minimumBuildingArea;
    protected LengthType minimumGroundHeight;
    protected StringOrRefType setbackSize;
    protected StringOrRefType strucuturePlacementRestrictions;
    protected LengthType maximumBuildingHeight;
    protected LengthType minimumBuildingHeight;
    protected LengthType minimumFloorHeight;
    protected StringOrRefType buildingDesignRestriction;
    protected Double minimumGreeningRate;
    protected StringOrRefType fenceGuideline;
    protected StringOrRefType restrictionsForFireProtection;
    protected StringOrRefType restrictionsForNoiseProtection;
    protected Double minimumFrontageRate;

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
     * Gets the value of the useRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getUseRestrictions() {
        return useRestrictions;
    }

    /**
     * Sets the value of the useRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setUseRestrictions(StringOrRefType value) {
        this.useRestrictions = value;
    }

    public boolean isSetUseRestrictions() {
        return (this.useRestrictions!= null);
    }

    /**
     * Gets the value of the maximumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumFloorAreaRate() {
        return maximumFloorAreaRate;
    }

    /**
     * Sets the value of the maximumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumFloorAreaRate(Double value) {
        this.maximumFloorAreaRate = value;
    }

    public boolean isSetMaximumFloorAreaRate() {
        return (this.maximumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the minimumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumFloorAreaRate() {
        return minimumFloorAreaRate;
    }

    /**
     * Sets the value of the minimumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumFloorAreaRate(Double value) {
        this.minimumFloorAreaRate = value;
    }

    public boolean isSetMinimumFloorAreaRate() {
        return (this.minimumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the maximumBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumBuildingCoverageRate() {
        return maximumBuildingCoverageRate;
    }

    /**
     * Sets the value of the maximumBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumBuildingCoverageRate(Double value) {
        this.maximumBuildingCoverageRate = value;
    }

    public boolean isSetMaximumBuildingCoverageRate() {
        return (this.maximumBuildingCoverageRate!= null);
    }

    /**
     * Gets the value of the minimumBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumBuildingCoverageRate() {
        return minimumBuildingCoverageRate;
    }

    /**
     * Sets the value of the minimumBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumBuildingCoverageRate(Double value) {
        this.minimumBuildingCoverageRate = value;
    }

    public boolean isSetMinimumBuildingCoverageRate() {
        return (this.minimumBuildingCoverageRate!= null);
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
     * Gets the value of the minimumBuildingArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumBuildingArea() {
        return minimumBuildingArea;
    }

    /**
     * Sets the value of the minimumBuildingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumBuildingArea(MeasureType value) {
        this.minimumBuildingArea = value;
    }

    public boolean isSetMinimumBuildingArea() {
        return (this.minimumBuildingArea!= null);
    }

    /**
     * Gets the value of the minimumGroundHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumGroundHeight() {
        return minimumGroundHeight;
    }

    /**
     * Sets the value of the minimumGroundHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumGroundHeight(LengthType value) {
        this.minimumGroundHeight = value;
    }

    public boolean isSetMinimumGroundHeight() {
        return (this.minimumGroundHeight!= null);
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
     * Gets the value of the strucuturePlacementRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getStrucuturePlacementRestrictions() {
        return strucuturePlacementRestrictions;
    }

    /**
     * Sets the value of the strucuturePlacementRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setStrucuturePlacementRestrictions(StringOrRefType value) {
        this.strucuturePlacementRestrictions = value;
    }

    public boolean isSetStrucuturePlacementRestrictions() {
        return (this.strucuturePlacementRestrictions!= null);
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
     * Gets the value of the minimumFloorHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumFloorHeight() {
        return minimumFloorHeight;
    }

    /**
     * Sets the value of the minimumFloorHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumFloorHeight(LengthType value) {
        this.minimumFloorHeight = value;
    }

    public boolean isSetMinimumFloorHeight() {
        return (this.minimumFloorHeight!= null);
    }

    /**
     * Gets the value of the buildingDesignRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getBuildingDesignRestriction() {
        return buildingDesignRestriction;
    }

    /**
     * Sets the value of the buildingDesignRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setBuildingDesignRestriction(StringOrRefType value) {
        this.buildingDesignRestriction = value;
    }

    public boolean isSetBuildingDesignRestriction() {
        return (this.buildingDesignRestriction!= null);
    }

    /**
     * Gets the value of the minimumGreeningRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumGreeningRate() {
        return minimumGreeningRate;
    }

    /**
     * Sets the value of the minimumGreeningRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumGreeningRate(Double value) {
        this.minimumGreeningRate = value;
    }

    public boolean isSetMinimumGreeningRate() {
        return (this.minimumGreeningRate!= null);
    }

    /**
     * Gets the value of the fenceGuideline property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getFenceGuideline() {
        return fenceGuideline;
    }

    /**
     * Sets the value of the fenceGuideline property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setFenceGuideline(StringOrRefType value) {
        this.fenceGuideline = value;
    }

    public boolean isSetFenceGuideline() {
        return (this.fenceGuideline!= null);
    }

    /**
     * Gets the value of the restrictionsForFireProtection property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRestrictionsForFireProtection() {
        return restrictionsForFireProtection;
    }

    /**
     * Sets the value of the restrictionsForFireProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRestrictionsForFireProtection(StringOrRefType value) {
        this.restrictionsForFireProtection = value;
    }

    public boolean isSetRestrictionsForFireProtection() {
        return (this.restrictionsForFireProtection!= null);
    }

    /**
     * Gets the value of the restrictionsForNoiseProtection property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRestrictionsForNoiseProtection() {
        return restrictionsForNoiseProtection;
    }

    /**
     * Sets the value of the restrictionsForNoiseProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRestrictionsForNoiseProtection(StringOrRefType value) {
        this.restrictionsForNoiseProtection = value;
    }

    public boolean isSetRestrictionsForNoiseProtection() {
        return (this.restrictionsForNoiseProtection!= null);
    }

    /**
     * Gets the value of the minimumFrontageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumFrontageRate() {
        return minimumFrontageRate;
    }

    /**
     * Sets the value of the minimumFrontageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumFrontageRate(Double value) {
        this.minimumFrontageRate = value;
    }

    public boolean isSetMinimumFrontageRate() {
        return (this.minimumFrontageRate!= null);
    }

}
