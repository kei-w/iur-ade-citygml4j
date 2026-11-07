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


/**
 * <p>Java class for PopulationTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}PopulationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationTypePropertyType", propOrder = {
    "populationType"
})
public class PopulationTypePropertyType {

    @XmlElement(name = "PopulationType", required = true)
    protected PopulationTypeType populationType;

    /**
     * Gets the value of the populationType property.
     * 
     * @return
     *     possible object is
     *     {@link PopulationTypeType }
     *     
     */
    public PopulationTypeType getPopulationType() {
        return populationType;
    }

    /**
     * Sets the value of the populationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationTypeType }
     *     
     */
    public void setPopulationType(PopulationTypeType value) {
        this.populationType = value;
    }

    public boolean isSetPopulationType() {
        return (this.populationType!= null);
    }

}
