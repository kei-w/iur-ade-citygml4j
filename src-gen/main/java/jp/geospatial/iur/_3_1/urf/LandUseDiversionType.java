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
 * <p>Java class for LandUseDiversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandUseDiversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmlandConversionType" type="{https://www.geospatial.jp/iur/urf/3.1}FarmlandConversionTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="forestConversionType" type="{https://www.geospatial.jp/iur/urf/3.1}ForestConversionTypePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandUseDiversionType", propOrder = {
    "farmlandConversionType",
    "forestConversionType"
})
public class LandUseDiversionType
    extends UrbanFunctionType
{

    protected FarmlandConversionTypePropertyType farmlandConversionType;
    protected ForestConversionTypePropertyType forestConversionType;

    /**
     * Gets the value of the farmlandConversionType property.
     * 
     * @return
     *     possible object is
     *     {@link FarmlandConversionTypePropertyType }
     *     
     */
    public FarmlandConversionTypePropertyType getFarmlandConversionType() {
        return farmlandConversionType;
    }

    /**
     * Sets the value of the farmlandConversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmlandConversionTypePropertyType }
     *     
     */
    public void setFarmlandConversionType(FarmlandConversionTypePropertyType value) {
        this.farmlandConversionType = value;
    }

    public boolean isSetFarmlandConversionType() {
        return (this.farmlandConversionType!= null);
    }

    /**
     * Gets the value of the forestConversionType property.
     * 
     * @return
     *     possible object is
     *     {@link ForestConversionTypePropertyType }
     *     
     */
    public ForestConversionTypePropertyType getForestConversionType() {
        return forestConversionType;
    }

    /**
     * Sets the value of the forestConversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForestConversionTypePropertyType }
     *     
     */
    public void setForestConversionType(ForestConversionTypePropertyType value) {
        this.forestConversionType = value;
    }

    public boolean isSetForestConversionType() {
        return (this.forestConversionType!= null);
    }

}
