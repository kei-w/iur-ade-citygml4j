//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfFacilitiesPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfFacilitiesPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}NumberOfFacilities"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfFacilitiesPropertyType", propOrder = {
    "numberOfFacilities"
})
public class NumberOfFacilitiesPropertyType {

    @XmlElement(name = "NumberOfFacilities", required = true)
    protected NumberOfFacilitiesType numberOfFacilities;

    /**
     * Gets the value of the numberOfFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfFacilitiesType }
     *     
     */
    public NumberOfFacilitiesType getNumberOfFacilities() {
        return numberOfFacilities;
    }

    /**
     * Sets the value of the numberOfFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfFacilitiesType }
     *     
     */
    public void setNumberOfFacilities(NumberOfFacilitiesType value) {
        this.numberOfFacilities = value;
    }

    public boolean isSetNumberOfFacilities() {
        return (this.numberOfFacilities!= null);
    }

}
