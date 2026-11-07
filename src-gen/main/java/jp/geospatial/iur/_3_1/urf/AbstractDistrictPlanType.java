//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for AbstractDistrictPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDistrictPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectives" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="policy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="districtDevelopmentPlan" type="{https://www.geospatial.jp/iur/urf/3.1}DistrictDevelopmentPlanPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promotionDistrict" type="{https://www.geospatial.jp/iur/urf/3.1}PromotionDistrictPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDistrictPlanType", propOrder = {
    "objectives",
    "policy",
    "districtDevelopmentPlan",
    "promotionDistrict"
})
@XmlSeeAlso({
    DistrictPlanType.class,
    DisasterPreventionBlockImprovementZonePlanType.class,
    HistoricSceneryMaintenanceAndImprovementDistrictPlanType.class,
    RoadsideDistrictPlanType.class,
    RuralDistrictPlanType.class
})
public abstract class AbstractDistrictPlanType
    extends ZoneType
{

    protected StringOrRefType objectives;
    protected StringOrRefType policy;
    protected List<DistrictDevelopmentPlanPropertyType> districtDevelopmentPlan;
    protected List<PromotionDistrictPropertyType> promotionDistrict;

    /**
     * Gets the value of the objectives property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getObjectives() {
        return objectives;
    }

    /**
     * Sets the value of the objectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setObjectives(StringOrRefType value) {
        this.objectives = value;
    }

    public boolean isSetObjectives() {
        return (this.objectives!= null);
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPolicy(StringOrRefType value) {
        this.policy = value;
    }

    public boolean isSetPolicy() {
        return (this.policy!= null);
    }

    /**
     * Gets the value of the districtDevelopmentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the districtDevelopmentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrictDevelopmentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistrictDevelopmentPlanPropertyType }
     * 
     * 
     */
    public List<DistrictDevelopmentPlanPropertyType> getDistrictDevelopmentPlan() {
        if (districtDevelopmentPlan == null) {
            districtDevelopmentPlan = new ArrayList<DistrictDevelopmentPlanPropertyType>();
        }
        return this.districtDevelopmentPlan;
    }

    public boolean isSetDistrictDevelopmentPlan() {
        return ((this.districtDevelopmentPlan!= null)&&(!this.districtDevelopmentPlan.isEmpty()));
    }

    public void unsetDistrictDevelopmentPlan() {
        this.districtDevelopmentPlan = null;
    }

    /**
     * Gets the value of the promotionDistrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionDistrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDistrictPropertyType }
     * 
     * 
     */
    public List<PromotionDistrictPropertyType> getPromotionDistrict() {
        if (promotionDistrict == null) {
            promotionDistrict = new ArrayList<PromotionDistrictPropertyType>();
        }
        return this.promotionDistrict;
    }

    public boolean isSetPromotionDistrict() {
        return ((this.promotionDistrict!= null)&&(!this.promotionDistrict.isEmpty()));
    }

    public void unsetPromotionDistrict() {
        this.promotionDistrict = null;
    }

}
