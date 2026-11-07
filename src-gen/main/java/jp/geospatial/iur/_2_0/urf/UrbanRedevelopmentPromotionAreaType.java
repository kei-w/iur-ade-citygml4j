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
 * <p>Java class for UrbanRedevelopmentPromotionAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanRedevelopmentPromotionAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ProjectPromotionAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicFacilities" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="unitArea" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanRedevelopmentPromotionAreaType", propOrder = {
    "publicFacilities",
    "unitArea"
})
public class UrbanRedevelopmentPromotionAreaType
    extends ProjectPromotionAreaType
{

    @XmlElement(required = true)
    protected StringOrRefType publicFacilities;
    @XmlElement(required = true)
    protected StringOrRefType unitArea;

    /**
     * Gets the value of the publicFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicFacilities() {
        return publicFacilities;
    }

    /**
     * Sets the value of the publicFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicFacilities(StringOrRefType value) {
        this.publicFacilities = value;
    }

    public boolean isSetPublicFacilities() {
        return (this.publicFacilities!= null);
    }

    /**
     * Gets the value of the unitArea property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getUnitArea() {
        return unitArea;
    }

    /**
     * Sets the value of the unitArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setUnitArea(StringOrRefType value) {
        this.unitArea = value;
    }

    public boolean isSetUnitArea() {
        return (this.unitArea!= null);
    }

}
