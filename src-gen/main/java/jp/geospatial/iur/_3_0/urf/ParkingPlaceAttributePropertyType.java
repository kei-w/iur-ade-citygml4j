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
 * <p>Java class for ParkingPlaceAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingPlaceAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.0}ParkingPlaceAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPlaceAttributePropertyType", propOrder = {
    "parkingPlaceAttribute"
})
public class ParkingPlaceAttributePropertyType {

    @XmlElement(name = "ParkingPlaceAttribute", required = true)
    protected ParkingPlaceAttributeType parkingPlaceAttribute;

    /**
     * Gets the value of the parkingPlaceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPlaceAttributeType }
     *     
     */
    public ParkingPlaceAttributeType getParkingPlaceAttribute() {
        return parkingPlaceAttribute;
    }

    /**
     * Sets the value of the parkingPlaceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPlaceAttributeType }
     *     
     */
    public void setParkingPlaceAttribute(ParkingPlaceAttributeType value) {
        this.parkingPlaceAttribute = value;
    }

    public boolean isSetParkingPlaceAttribute() {
        return (this.parkingPlaceAttribute!= null);
    }

}
