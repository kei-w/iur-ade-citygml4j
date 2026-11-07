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


/**
 * <p>Java class for SupplyFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="waterWorksAttribute" type="{https://www.geospatial.jp/iur/urf/3.2}WaterWorksAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyFacilityType", propOrder = {
    "waterWorksAttribute"
})
public class SupplyFacilityType
    extends UrbanFacilityType
{

    protected WaterWorksAttributePropertyType waterWorksAttribute;

    /**
     * Gets the value of the waterWorksAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link WaterWorksAttributePropertyType }
     *     
     */
    public WaterWorksAttributePropertyType getWaterWorksAttribute() {
        return waterWorksAttribute;
    }

    /**
     * Sets the value of the waterWorksAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterWorksAttributePropertyType }
     *     
     */
    public void setWaterWorksAttribute(WaterWorksAttributePropertyType value) {
        this.waterWorksAttribute = value;
    }

    public boolean isSetWaterWorksAttribute() {
        return (this.waterWorksAttribute!= null);
    }

}
