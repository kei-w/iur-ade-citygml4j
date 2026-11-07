//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * 都市計画区域
 * 
 * <p>Java class for UrbanPlanningAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanPlanningAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaClassification" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="reasonForAreaClassification" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="policyForAreaClassification" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="purposeForUrbanPlan" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="policyForUrbanPlanDecision" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="cityArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="cityPopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanPlanningAreaType", propOrder = {
    "areaClassification",
    "reasonForAreaClassification",
    "policyForAreaClassification",
    "purposeForUrbanPlan",
    "policyForUrbanPlanDecision",
    "population",
    "cityArea",
    "cityPopulation"
})
public class UrbanPlanningAreaType
    extends ZoneType
{

    @XmlElement(required = true)
    protected CodeType areaClassification;
    protected StringOrRefType reasonForAreaClassification;
    protected StringOrRefType policyForAreaClassification;
    protected StringOrRefType purposeForUrbanPlan;
    protected StringOrRefType policyForUrbanPlanDecision;
    protected BigInteger population;
    protected MeasureType cityArea;
    protected BigInteger cityPopulation;

    /**
     * Gets the value of the areaClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaClassification() {
        return areaClassification;
    }

    /**
     * Sets the value of the areaClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaClassification(CodeType value) {
        this.areaClassification = value;
    }

    public boolean isSetAreaClassification() {
        return (this.areaClassification!= null);
    }

    /**
     * Gets the value of the reasonForAreaClassification property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReasonForAreaClassification() {
        return reasonForAreaClassification;
    }

    /**
     * Sets the value of the reasonForAreaClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReasonForAreaClassification(StringOrRefType value) {
        this.reasonForAreaClassification = value;
    }

    public boolean isSetReasonForAreaClassification() {
        return (this.reasonForAreaClassification!= null);
    }

    /**
     * Gets the value of the policyForAreaClassification property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPolicyForAreaClassification() {
        return policyForAreaClassification;
    }

    /**
     * Sets the value of the policyForAreaClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPolicyForAreaClassification(StringOrRefType value) {
        this.policyForAreaClassification = value;
    }

    public boolean isSetPolicyForAreaClassification() {
        return (this.policyForAreaClassification!= null);
    }

    /**
     * Gets the value of the purposeForUrbanPlan property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPurposeForUrbanPlan() {
        return purposeForUrbanPlan;
    }

    /**
     * Sets the value of the purposeForUrbanPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPurposeForUrbanPlan(StringOrRefType value) {
        this.purposeForUrbanPlan = value;
    }

    public boolean isSetPurposeForUrbanPlan() {
        return (this.purposeForUrbanPlan!= null);
    }

    /**
     * Gets the value of the policyForUrbanPlanDecision property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPolicyForUrbanPlanDecision() {
        return policyForUrbanPlanDecision;
    }

    /**
     * Sets the value of the policyForUrbanPlanDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPolicyForUrbanPlanDecision(StringOrRefType value) {
        this.policyForUrbanPlanDecision = value;
    }

    public boolean isSetPolicyForUrbanPlanDecision() {
        return (this.policyForUrbanPlanDecision!= null);
    }

    /**
     * Gets the value of the population property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPopulation(BigInteger value) {
        this.population = value;
    }

    public boolean isSetPopulation() {
        return (this.population!= null);
    }

    /**
     * Gets the value of the cityArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCityArea() {
        return cityArea;
    }

    /**
     * Sets the value of the cityArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCityArea(MeasureType value) {
        this.cityArea = value;
    }

    public boolean isSetCityArea() {
        return (this.cityArea!= null);
    }

    /**
     * Gets the value of the cityPopulation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCityPopulation() {
        return cityPopulation;
    }

    /**
     * Sets the value of the cityPopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCityPopulation(BigInteger value) {
        this.cityPopulation = value;
    }

    public boolean isSetCityPopulation() {
        return (this.cityPopulation!= null);
    }

}
