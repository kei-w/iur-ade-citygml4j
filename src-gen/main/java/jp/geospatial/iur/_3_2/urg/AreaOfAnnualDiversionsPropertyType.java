//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaOfAnnualDiversionsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaOfAnnualDiversionsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urg/3.2}AreaOfAnnualDiversions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaOfAnnualDiversionsPropertyType", propOrder = {
    "areaOfAnnualDiversions"
})
public class AreaOfAnnualDiversionsPropertyType {

    @XmlElement(name = "AreaOfAnnualDiversions", required = true)
    protected AreaOfAnnualDiversionsType areaOfAnnualDiversions;

    /**
     * Gets the value of the areaOfAnnualDiversions property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfAnnualDiversionsType }
     *     
     */
    public AreaOfAnnualDiversionsType getAreaOfAnnualDiversions() {
        return areaOfAnnualDiversions;
    }

    /**
     * Sets the value of the areaOfAnnualDiversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfAnnualDiversionsType }
     *     
     */
    public void setAreaOfAnnualDiversions(AreaOfAnnualDiversionsType value) {
        this.areaOfAnnualDiversions = value;
    }

    public boolean isSetAreaOfAnnualDiversions() {
        return (this.areaOfAnnualDiversions!= null);
    }

}
