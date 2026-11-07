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
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DistrictPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}AbstractDistrictPlanType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
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
@XmlType(name = "DistrictPlanType", propOrder = {
    "facilityAllocation",
    "landUsePolicy"
})
public class DistrictPlanType
    extends AbstractDistrictPlanType
{

    protected StringOrRefType facilityAllocation;
    protected StringOrRefType landUsePolicy;

    /**
     * Gets the value of the facilityAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getFacilityAllocation() {
        return facilityAllocation;
    }

    /**
     * Sets the value of the facilityAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setFacilityAllocation(StringOrRefType value) {
        this.facilityAllocation = value;
    }

    public boolean isSetFacilityAllocation() {
        return (this.facilityAllocation!= null);
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
