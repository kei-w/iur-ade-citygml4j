//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for ProjectPromotionAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectPromotionAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="developmentPolicy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="publicFacilitiesPlans" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectPromotionAreaType", propOrder = {
    "developmentPolicy",
    "publicFacilitiesPlans"
})
@XmlSeeAlso({
    UrbanRedevelopmentPromotionAreaType.class,
    LandReadjustmentPromotionAreaType.class,
    ResidentialBlockConstructionPromotionAreaType.class,
    LandReadjustmentPromotionAreasForCoreBusinessUrbanDevelopmentType.class
})
public class ProjectPromotionAreaType
    extends ZoneType
{

    protected StringOrRefType developmentPolicy;
    protected StringOrRefType publicFacilitiesPlans;

    /**
     * Gets the value of the developmentPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDevelopmentPolicy() {
        return developmentPolicy;
    }

    /**
     * Sets the value of the developmentPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDevelopmentPolicy(StringOrRefType value) {
        this.developmentPolicy = value;
    }

    public boolean isSetDevelopmentPolicy() {
        return (this.developmentPolicy!= null);
    }

    /**
     * Gets the value of the publicFacilitiesPlans property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicFacilitiesPlans() {
        return publicFacilitiesPlans;
    }

    /**
     * Sets the value of the publicFacilitiesPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicFacilitiesPlans(StringOrRefType value) {
        this.publicFacilitiesPlans = value;
    }

    public boolean isSetPublicFacilitiesPlans() {
        return (this.publicFacilitiesPlans!= null);
    }

}
