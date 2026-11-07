//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for NewUrbanInfrastructureProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewUrbanInfrastructureProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanDevelopmentProjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landForCentralPublicFacilities" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="districtsAllocation" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="landUsePlan" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewUrbanInfrastructureProjectType", propOrder = {
    "landForCentralPublicFacilities",
    "districtsAllocation",
    "landUsePlan"
})
public class NewUrbanInfrastructureProjectType
    extends UrbanDevelopmentProjectType
{

    @XmlElement(required = true)
    protected StringOrRefType landForCentralPublicFacilities;
    @XmlElement(required = true)
    protected StringOrRefType districtsAllocation;
    @XmlElement(required = true)
    protected StringOrRefType landUsePlan;

    /**
     * Gets the value of the landForCentralPublicFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getLandForCentralPublicFacilities() {
        return landForCentralPublicFacilities;
    }

    /**
     * Sets the value of the landForCentralPublicFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setLandForCentralPublicFacilities(StringOrRefType value) {
        this.landForCentralPublicFacilities = value;
    }

    public boolean isSetLandForCentralPublicFacilities() {
        return (this.landForCentralPublicFacilities!= null);
    }

    /**
     * Gets the value of the districtsAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDistrictsAllocation() {
        return districtsAllocation;
    }

    /**
     * Sets the value of the districtsAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDistrictsAllocation(StringOrRefType value) {
        this.districtsAllocation = value;
    }

    public boolean isSetDistrictsAllocation() {
        return (this.districtsAllocation!= null);
    }

    /**
     * Gets the value of the landUsePlan property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getLandUsePlan() {
        return landUsePlan;
    }

    /**
     * Sets the value of the landUsePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setLandUsePlan(StringOrRefType value) {
        this.landUsePlan = value;
    }

    public boolean isSetLandUsePlan() {
        return (this.landUsePlan!= null);
    }

}
