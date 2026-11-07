//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:01:11 JST 2026
//


package jp.geospatial.iur._3_1.urg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfAnnualDiversionsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfAnnualDiversionsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urg/3.1}NumberOfAnnualDiversions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfAnnualDiversionsPropertyType", propOrder = {
    "numberOfAnnualDiversions"
})
public class NumberOfAnnualDiversionsPropertyType {

    @XmlElement(name = "NumberOfAnnualDiversions", required = true)
    protected NumberOfAnnualDiversionsType numberOfAnnualDiversions;

    /**
     * Gets the value of the numberOfAnnualDiversions property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfAnnualDiversionsType }
     *     
     */
    public NumberOfAnnualDiversionsType getNumberOfAnnualDiversions() {
        return numberOfAnnualDiversions;
    }

    /**
     * Sets the value of the numberOfAnnualDiversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfAnnualDiversionsType }
     *     
     */
    public void setNumberOfAnnualDiversions(NumberOfAnnualDiversionsType value) {
        this.numberOfAnnualDiversions = value;
    }

    public boolean isSetNumberOfAnnualDiversions() {
        return (this.numberOfAnnualDiversions!= null);
    }

}
