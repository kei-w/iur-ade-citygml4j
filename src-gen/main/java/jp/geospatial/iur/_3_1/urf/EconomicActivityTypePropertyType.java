//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EconomicActivityTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicActivityTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.1}EconomicActivityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicActivityTypePropertyType", propOrder = {
    "economicActivityType"
})
public class EconomicActivityTypePropertyType {

    @XmlElement(name = "EconomicActivityType", required = true)
    protected EconomicActivityTypeType economicActivityType;

    /**
     * Gets the value of the economicActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicActivityTypeType }
     *     
     */
    public EconomicActivityTypeType getEconomicActivityType() {
        return economicActivityType;
    }

    /**
     * Sets the value of the economicActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicActivityTypeType }
     *     
     */
    public void setEconomicActivityType(EconomicActivityTypeType value) {
        this.economicActivityType = value;
    }

    public boolean isSetEconomicActivityType() {
        return (this.economicActivityType!= null);
    }

}
