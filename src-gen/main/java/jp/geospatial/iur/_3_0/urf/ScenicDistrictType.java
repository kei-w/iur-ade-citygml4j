//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for ScenicDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScenicDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buildingHeightLimits" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="wallSetbackDistanceWithRoad" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="wallSetbackDistanceWithAdjoiningLand" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScenicDistrictType", propOrder = {
    "buildingCoverageRate",
    "buildingHeightLimits",
    "wallSetbackDistanceWithRoad",
    "wallSetbackDistanceWithAdjoiningLand"
})
public class ScenicDistrictType
    extends DistrictsAndZonesType
{

    protected Double buildingCoverageRate;
    protected LengthType buildingHeightLimits;
    protected LengthType wallSetbackDistanceWithRoad;
    protected LengthType wallSetbackDistanceWithAdjoiningLand;

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
     * Gets the value of the wallSetbackDistanceWithRoad property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWallSetbackDistanceWithRoad() {
        return wallSetbackDistanceWithRoad;
    }

    /**
     * Sets the value of the wallSetbackDistanceWithRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWallSetbackDistanceWithRoad(LengthType value) {
        this.wallSetbackDistanceWithRoad = value;
    }

    public boolean isSetWallSetbackDistanceWithRoad() {
        return (this.wallSetbackDistanceWithRoad!= null);
    }

    /**
     * Gets the value of the wallSetbackDistanceWithAdjoiningLand property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWallSetbackDistanceWithAdjoiningLand() {
        return wallSetbackDistanceWithAdjoiningLand;
    }

    /**
     * Sets the value of the wallSetbackDistanceWithAdjoiningLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWallSetbackDistanceWithAdjoiningLand(LengthType value) {
        this.wallSetbackDistanceWithAdjoiningLand = value;
    }

    public boolean isSetWallSetbackDistanceWithAdjoiningLand() {
        return (this.wallSetbackDistanceWithAdjoiningLand!= null);
    }

}
