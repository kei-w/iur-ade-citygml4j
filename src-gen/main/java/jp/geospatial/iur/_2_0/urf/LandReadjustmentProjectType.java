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
 * <p>Java class for LandReadjustmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandReadjustmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanDevelopmentProjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicFacilityAllocation" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="buildingLotDevelopment" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandReadjustmentProjectType", propOrder = {
    "publicFacilityAllocation",
    "buildingLotDevelopment"
})
public class LandReadjustmentProjectType
    extends UrbanDevelopmentProjectType
{

    @XmlElement(required = true)
    protected StringOrRefType publicFacilityAllocation;
    @XmlElement(required = true)
    protected StringOrRefType buildingLotDevelopment;

    /**
     * Gets the value of the publicFacilityAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicFacilityAllocation() {
        return publicFacilityAllocation;
    }

    /**
     * Sets the value of the publicFacilityAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicFacilityAllocation(StringOrRefType value) {
        this.publicFacilityAllocation = value;
    }

    public boolean isSetPublicFacilityAllocation() {
        return (this.publicFacilityAllocation!= null);
    }

    /**
     * Gets the value of the buildingLotDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getBuildingLotDevelopment() {
        return buildingLotDevelopment;
    }

    /**
     * Sets the value of the buildingLotDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setBuildingLotDevelopment(StringOrRefType value) {
        this.buildingLotDevelopment = value;
    }

    public boolean isSetBuildingLotDevelopment() {
        return (this.buildingLotDevelopment!= null);
    }

}
