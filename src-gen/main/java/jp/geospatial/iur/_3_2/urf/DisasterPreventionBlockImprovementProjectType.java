//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DisasterPreventionBlockImprovementProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisasterPreventionBlockImprovementProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanDevelopmentProjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disasterPreventionPublicFacilityAllocation" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="otherPublicFacilityAllocation" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="developmentPlan" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisasterPreventionBlockImprovementProjectType", propOrder = {
    "disasterPreventionPublicFacilityAllocation",
    "otherPublicFacilityAllocation",
    "developmentPlan"
})
public class DisasterPreventionBlockImprovementProjectType
    extends UrbanDevelopmentProjectType
{

    @XmlElement(required = true)
    protected StringOrRefType disasterPreventionPublicFacilityAllocation;
    @XmlElement(required = true)
    protected StringOrRefType otherPublicFacilityAllocation;
    @XmlElement(required = true)
    protected StringOrRefType developmentPlan;

    /**
     * Gets the value of the disasterPreventionPublicFacilityAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDisasterPreventionPublicFacilityAllocation() {
        return disasterPreventionPublicFacilityAllocation;
    }

    /**
     * Sets the value of the disasterPreventionPublicFacilityAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDisasterPreventionPublicFacilityAllocation(StringOrRefType value) {
        this.disasterPreventionPublicFacilityAllocation = value;
    }

    public boolean isSetDisasterPreventionPublicFacilityAllocation() {
        return (this.disasterPreventionPublicFacilityAllocation!= null);
    }

    /**
     * Gets the value of the otherPublicFacilityAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getOtherPublicFacilityAllocation() {
        return otherPublicFacilityAllocation;
    }

    /**
     * Sets the value of the otherPublicFacilityAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setOtherPublicFacilityAllocation(StringOrRefType value) {
        this.otherPublicFacilityAllocation = value;
    }

    public boolean isSetOtherPublicFacilityAllocation() {
        return (this.otherPublicFacilityAllocation!= null);
    }

    /**
     * Gets the value of the developmentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDevelopmentPlan() {
        return developmentPlan;
    }

    /**
     * Sets the value of the developmentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDevelopmentPlan(StringOrRefType value) {
        this.developmentPlan = value;
    }

    public boolean isSetDevelopmentPlan() {
        return (this.developmentPlan!= null);
    }

}
