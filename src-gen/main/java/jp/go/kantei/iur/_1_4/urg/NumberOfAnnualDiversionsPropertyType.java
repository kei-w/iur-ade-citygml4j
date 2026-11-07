//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.go.kantei.iur._1_4.urg;

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
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}NumberOfAnnualDiversions"/&gt;
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
