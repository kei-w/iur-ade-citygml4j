//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingPlaceAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingPlaceAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeysAboveGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="storeysBelowGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPlaceAttributeType", propOrder = {
    "storeysAboveGround",
    "storeysBelowGround"
})
public class ParkingPlaceAttributeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysAboveGround;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysBelowGround;

    /**
     * Gets the value of the storeysAboveGround property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreysAboveGround() {
        return storeysAboveGround;
    }

    /**
     * Sets the value of the storeysAboveGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreysAboveGround(BigInteger value) {
        this.storeysAboveGround = value;
    }

    public boolean isSetStoreysAboveGround() {
        return (this.storeysAboveGround!= null);
    }

    /**
     * Gets the value of the storeysBelowGround property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreysBelowGround() {
        return storeysBelowGround;
    }

    /**
     * Sets the value of the storeysBelowGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreysBelowGround(BigInteger value) {
        this.storeysBelowGround = value;
    }

    public boolean isSetStoreysBelowGround() {
        return (this.storeysBelowGround!= null);
    }

}
