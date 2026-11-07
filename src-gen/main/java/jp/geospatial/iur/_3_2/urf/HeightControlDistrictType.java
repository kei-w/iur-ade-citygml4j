//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for HeightControlDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeightControlDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightControlDistrictType", propOrder = {
    "maximumBuildingHeight",
    "minimumBuildingHeight"
})
public class HeightControlDistrictType
    extends DistrictsAndZonesType
{

    protected LengthType maximumBuildingHeight;
    protected LengthType minimumBuildingHeight;

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

}
