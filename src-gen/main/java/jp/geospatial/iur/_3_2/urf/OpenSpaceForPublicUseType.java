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
 * <p>Java class for OpenSpaceForPublicUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenSpaceForPublicUseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkAttribute" type="{https://www.geospatial.jp/iur/urf/3.2}ParkAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenSpaceForPublicUseType", propOrder = {
    "parkAttribute"
})
public class OpenSpaceForPublicUseType
    extends UrbanFacilityType
{

    protected ParkAttributePropertyType parkAttribute;

    /**
     * Gets the value of the parkAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ParkAttributePropertyType }
     *     
     */
    public ParkAttributePropertyType getParkAttribute() {
        return parkAttribute;
    }

    /**
     * Sets the value of the parkAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkAttributePropertyType }
     *     
     */
    public void setParkAttribute(ParkAttributePropertyType value) {
        this.parkAttribute = value;
    }

    public boolean isSetParkAttribute() {
        return (this.parkAttribute!= null);
    }

}
