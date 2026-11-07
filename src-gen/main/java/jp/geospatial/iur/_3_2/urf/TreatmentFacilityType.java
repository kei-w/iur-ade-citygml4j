//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreatmentFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreatmentFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sewerSystemsAttribute" type="{https://www.geospatial.jp/iur/urf/3.2}SewerSystemAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreatmentFacilityType", propOrder = {
    "sewerSystemsAttribute"
})
public class TreatmentFacilityType
    extends UrbanFacilityType
{

    protected SewerSystemAttributePropertyType sewerSystemsAttribute;

    /**
     * Gets the value of the sewerSystemsAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link SewerSystemAttributePropertyType }
     *     
     */
    public SewerSystemAttributePropertyType getSewerSystemsAttribute() {
        return sewerSystemsAttribute;
    }

    /**
     * Sets the value of the sewerSystemsAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link SewerSystemAttributePropertyType }
     *     
     */
    public void setSewerSystemsAttribute(SewerSystemAttributePropertyType value) {
        this.sewerSystemsAttribute = value;
    }

    public boolean isSetSewerSystemsAttribute() {
        return (this.sewerSystemsAttribute!= null);
    }

}
