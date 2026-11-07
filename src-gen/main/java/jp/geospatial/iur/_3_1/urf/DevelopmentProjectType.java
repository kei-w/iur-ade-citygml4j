//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevelopmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="residentialDevelopmentType" type="{https://www.geospatial.jp/iur/urf/3.1}ResidentialDevelopmentTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="urbanDevelopmentType" type="{https://www.geospatial.jp/iur/urf/3.1}UrbanDevelopmentProjectTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="agriculturalDevelopmentType" type="{https://www.geospatial.jp/iur/urf/3.1}AgriculturalDevelopmentProjectTypePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentProjectType", propOrder = {
    "residentialDevelopmentType",
    "urbanDevelopmentType",
    "agriculturalDevelopmentType"
})
public class DevelopmentProjectType
    extends UrbanFunctionType
{

    protected ResidentialDevelopmentTypePropertyType residentialDevelopmentType;
    protected UrbanDevelopmentProjectTypePropertyType urbanDevelopmentType;
    protected AgriculturalDevelopmentProjectTypePropertyType agriculturalDevelopmentType;

    /**
     * Gets the value of the residentialDevelopmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentialDevelopmentTypePropertyType }
     *     
     */
    public ResidentialDevelopmentTypePropertyType getResidentialDevelopmentType() {
        return residentialDevelopmentType;
    }

    /**
     * Sets the value of the residentialDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentialDevelopmentTypePropertyType }
     *     
     */
    public void setResidentialDevelopmentType(ResidentialDevelopmentTypePropertyType value) {
        this.residentialDevelopmentType = value;
    }

    public boolean isSetResidentialDevelopmentType() {
        return (this.residentialDevelopmentType!= null);
    }

    /**
     * Gets the value of the urbanDevelopmentType property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanDevelopmentProjectTypePropertyType }
     *     
     */
    public UrbanDevelopmentProjectTypePropertyType getUrbanDevelopmentType() {
        return urbanDevelopmentType;
    }

    /**
     * Sets the value of the urbanDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanDevelopmentProjectTypePropertyType }
     *     
     */
    public void setUrbanDevelopmentType(UrbanDevelopmentProjectTypePropertyType value) {
        this.urbanDevelopmentType = value;
    }

    public boolean isSetUrbanDevelopmentType() {
        return (this.urbanDevelopmentType!= null);
    }

    /**
     * Gets the value of the agriculturalDevelopmentType property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalDevelopmentProjectTypePropertyType }
     *     
     */
    public AgriculturalDevelopmentProjectTypePropertyType getAgriculturalDevelopmentType() {
        return agriculturalDevelopmentType;
    }

    /**
     * Sets the value of the agriculturalDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalDevelopmentProjectTypePropertyType }
     *     
     */
    public void setAgriculturalDevelopmentType(AgriculturalDevelopmentProjectTypePropertyType value) {
        this.agriculturalDevelopmentType = value;
    }

    public boolean isSetAgriculturalDevelopmentType() {
        return (this.agriculturalDevelopmentType!= null);
    }

}
