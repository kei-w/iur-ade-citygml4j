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
 * <p>Java class for ParkAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.1}ParkAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkAttributePropertyType", propOrder = {
    "parkAttribute"
})
public class ParkAttributePropertyType {

    @XmlElement(name = "ParkAttribute", required = true)
    protected ParkAttributeType parkAttribute;

    /**
     * Gets the value of the parkAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ParkAttributeType }
     *     
     */
    public ParkAttributeType getParkAttribute() {
        return parkAttribute;
    }

    /**
     * Sets the value of the parkAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkAttributeType }
     *     
     */
    public void setParkAttribute(ParkAttributeType value) {
        this.parkAttribute = value;
    }

    public boolean isSetParkAttribute() {
        return (this.parkAttribute!= null);
    }

}
