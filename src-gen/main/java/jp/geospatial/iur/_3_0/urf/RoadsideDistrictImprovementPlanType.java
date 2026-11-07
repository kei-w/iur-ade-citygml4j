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
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for RoadsideDistrictImprovementPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideDistrictImprovementPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}DistrictDevelopmentPlanType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideDistrictFacilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideDistrictImprovementPlanType", propOrder = {
    "roadsideDistrictFacilitiesAllocation"
})
public class RoadsideDistrictImprovementPlanType
    extends DistrictDevelopmentPlanType
{

    protected StringOrRefType roadsideDistrictFacilitiesAllocation;

    /**
     * Gets the value of the roadsideDistrictFacilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRoadsideDistrictFacilitiesAllocation() {
        return roadsideDistrictFacilitiesAllocation;
    }

    /**
     * Sets the value of the roadsideDistrictFacilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRoadsideDistrictFacilitiesAllocation(StringOrRefType value) {
        this.roadsideDistrictFacilitiesAllocation = value;
    }

    public boolean isSetRoadsideDistrictFacilitiesAllocation() {
        return (this.roadsideDistrictFacilitiesAllocation!= null);
    }

}
