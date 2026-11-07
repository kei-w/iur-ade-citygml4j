//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UrbanRedevelopmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanRedevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanDevelopmentProjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicFacilityAllocation" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="developmentPlan" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="housingTarget" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="siteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHousing" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanRedevelopmentProjectType", propOrder = {
    "publicFacilityAllocation",
    "developmentPlan",
    "housingTarget",
    "siteArea",
    "totalFloorArea",
    "numberOfHousing"
})
public class UrbanRedevelopmentProjectType
    extends UrbanDevelopmentProjectType
{

    @XmlElement(required = true)
    protected StringOrRefType publicFacilityAllocation;
    @XmlElement(required = true)
    protected StringOrRefType developmentPlan;
    protected StringOrRefType housingTarget;
    protected MeasureType siteArea;
    protected MeasureType totalFloorArea;
    protected BigInteger numberOfHousing;

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

    /**
     * Gets the value of the housingTarget property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getHousingTarget() {
        return housingTarget;
    }

    /**
     * Sets the value of the housingTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setHousingTarget(StringOrRefType value) {
        this.housingTarget = value;
    }

    public boolean isSetHousingTarget() {
        return (this.housingTarget!= null);
    }

    /**
     * Gets the value of the siteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSiteArea() {
        return siteArea;
    }

    /**
     * Sets the value of the siteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSiteArea(MeasureType value) {
        this.siteArea = value;
    }

    public boolean isSetSiteArea() {
        return (this.siteArea!= null);
    }

    /**
     * Gets the value of the totalFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalFloorArea() {
        return totalFloorArea;
    }

    /**
     * Sets the value of the totalFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalFloorArea(MeasureType value) {
        this.totalFloorArea = value;
    }

    public boolean isSetTotalFloorArea() {
        return (this.totalFloorArea!= null);
    }

    /**
     * Gets the value of the numberOfHousing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHousing() {
        return numberOfHousing;
    }

    /**
     * Sets the value of the numberOfHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHousing(BigInteger value) {
        this.numberOfHousing = value;
    }

    public boolean isSetNumberOfHousing() {
        return (this.numberOfHousing!= null);
    }

}
