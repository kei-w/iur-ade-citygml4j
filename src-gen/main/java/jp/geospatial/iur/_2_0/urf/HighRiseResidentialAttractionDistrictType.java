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
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for HighRiseResidentialAttractionDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighRiseResidentialAttractionDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumSiteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighRiseResidentialAttractionDistrictType", propOrder = {
    "floorAreaRate",
    "maximumBuildingCoverageRate",
    "minimumSiteArea"
})
public class HighRiseResidentialAttractionDistrictType
    extends DistrictsAndZonesType
{

    protected double floorAreaRate;
    protected Double maximumBuildingCoverageRate;
    protected MeasureType minimumSiteArea;

    /**
     * Gets the value of the floorAreaRate property.
     * 
     */
    public double getFloorAreaRate() {
        return floorAreaRate;
    }

    /**
     * Sets the value of the floorAreaRate property.
     * 
     */
    public void setFloorAreaRate(double value) {
        this.floorAreaRate = value;
    }

    public boolean isSetFloorAreaRate() {
        return true;
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

}
