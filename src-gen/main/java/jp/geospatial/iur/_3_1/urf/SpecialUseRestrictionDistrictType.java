//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for SpecialUseRestrictionDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialUseRestrictionDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildingRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="otherRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialUseRestrictionDistrictType", propOrder = {
    "buildingRestrictions",
    "otherRestrictions"
})
public class SpecialUseRestrictionDistrictType
    extends DistrictsAndZonesType
{

    protected StringOrRefType buildingRestrictions;
    protected StringOrRefType otherRestrictions;

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

}
