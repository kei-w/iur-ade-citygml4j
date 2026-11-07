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
 * <p>Java class for NumberOfHouseholdsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfHouseholdsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urg/3.1}NumberOfHouseholds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfHouseholdsPropertyType", propOrder = {
    "numberOfHouseholds"
})
public class NumberOfHouseholdsPropertyType {

    @XmlElement(name = "NumberOfHouseholds", required = true)
    protected NumberOfHouseholdsType numberOfHouseholds;

    /**
     * Gets the value of the numberOfHouseholds property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfHouseholdsType }
     *     
     */
    public NumberOfHouseholdsType getNumberOfHouseholds() {
        return numberOfHouseholds;
    }

    /**
     * Sets the value of the numberOfHouseholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfHouseholdsType }
     *     
     */
    public void setNumberOfHouseholds(NumberOfHouseholdsType value) {
        this.numberOfHouseholds = value;
    }

    public boolean isSetNumberOfHouseholds() {
        return (this.numberOfHouseholds!= null);
    }

}
