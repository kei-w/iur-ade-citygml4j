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
 * <p>Java class for RuralDistrictImprovementPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuralDistrictImprovementPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}DistrictDevelopmentPlanType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruralDistrictFacilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuralDistrictImprovementPlanType", propOrder = {
    "ruralDistrictFacilitiesAllocation"
})
public class RuralDistrictImprovementPlanType
    extends DistrictDevelopmentPlanType
{

    protected StringOrRefType ruralDistrictFacilitiesAllocation;

    /**
     * Gets the value of the ruralDistrictFacilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRuralDistrictFacilitiesAllocation() {
        return ruralDistrictFacilitiesAllocation;
    }

    /**
     * Sets the value of the ruralDistrictFacilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRuralDistrictFacilitiesAllocation(StringOrRefType value) {
        this.ruralDistrictFacilitiesAllocation = value;
    }

    public boolean isSetRuralDistrictFacilitiesAllocation() {
        return (this.ruralDistrictFacilitiesAllocation!= null);
    }

}
