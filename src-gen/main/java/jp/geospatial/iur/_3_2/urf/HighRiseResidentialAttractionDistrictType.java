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
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for HighRiseResidentialAttractionDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighRiseResidentialAttractionDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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

    @XmlElement(required = true)
    protected BigInteger floorAreaRate;
    protected BigInteger maximumBuildingCoverageRate;
    protected MeasureType minimumSiteArea;

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
     * Gets the value of the maximumBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumBuildingCoverageRate() {
        return maximumBuildingCoverageRate;
    }

    /**
     * Sets the value of the maximumBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumBuildingCoverageRate(BigInteger value) {
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
