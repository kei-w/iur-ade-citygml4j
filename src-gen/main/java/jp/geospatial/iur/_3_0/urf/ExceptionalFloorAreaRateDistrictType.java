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
 * <p>Java class for ExceptionalFloorAreaRateDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionalFloorAreaRateDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingHeightLimits" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionalFloorAreaRateDistrictType", propOrder = {
    "buildingHeightLimits"
})
public class ExceptionalFloorAreaRateDistrictType
    extends DistrictsAndZonesType
{

    protected LengthType buildingHeightLimits;

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

}
