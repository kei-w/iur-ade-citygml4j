//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EconomicActivitySumTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicActivitySumTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.0}EconomicActivitySumType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicActivitySumTypePropertyType", propOrder = {
    "economicActivitySumType"
})
public class EconomicActivitySumTypePropertyType {

    @XmlElement(name = "EconomicActivitySumType", required = true)
    protected EconomicActivitySumTypeType economicActivitySumType;

    /**
     * Gets the value of the economicActivitySumType property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicActivitySumTypeType }
     *     
     */
    public EconomicActivitySumTypeType getEconomicActivitySumType() {
        return economicActivitySumType;
    }

    /**
     * Sets the value of the economicActivitySumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicActivitySumTypeType }
     *     
     */
    public void setEconomicActivitySumType(EconomicActivitySumTypeType value) {
        this.economicActivitySumType = value;
    }

    public boolean isSetEconomicActivitySumType() {
        return (this.economicActivitySumType!= null);
    }

}
