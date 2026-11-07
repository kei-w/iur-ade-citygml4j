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
 * <p>Java class for RoadsideDistrictPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideDistrictPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}AbstractDistrictPlanType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="landUsePolicy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideDistrictPlanType", propOrder = {
    "facilitiesAllocation",
    "landUsePolicy"
})
public class RoadsideDistrictPlanType
    extends AbstractDistrictPlanType
{

    protected StringOrRefType facilitiesAllocation;
    protected StringOrRefType landUsePolicy;

    /**
     * Gets the value of the facilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getFacilitiesAllocation() {
        return facilitiesAllocation;
    }

    /**
     * Sets the value of the facilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setFacilitiesAllocation(StringOrRefType value) {
        this.facilitiesAllocation = value;
    }

    public boolean isSetFacilitiesAllocation() {
        return (this.facilitiesAllocation!= null);
    }

    /**
     * Gets the value of the landUsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getLandUsePolicy() {
        return landUsePolicy;
    }

    /**
     * Sets the value of the landUsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setLandUsePolicy(StringOrRefType value) {
        this.landUsePolicy = value;
    }

    public boolean isSetLandUsePolicy() {
        return (this.landUsePolicy!= null);
    }

}
