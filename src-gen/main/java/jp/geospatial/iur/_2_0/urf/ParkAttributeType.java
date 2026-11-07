//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ParkAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkTypeNumber" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="parkSizeNumber" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="parkSerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkAttributeType", propOrder = {
    "parkTypeNumber",
    "parkSizeNumber",
    "parkSerialNumber"
})
public class ParkAttributeType {

    protected CodeType parkTypeNumber;
    protected CodeType parkSizeNumber;
    protected BigInteger parkSerialNumber;

    /**
     * Gets the value of the parkTypeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkTypeNumber() {
        return parkTypeNumber;
    }

    /**
     * Sets the value of the parkTypeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkTypeNumber(CodeType value) {
        this.parkTypeNumber = value;
    }

    public boolean isSetParkTypeNumber() {
        return (this.parkTypeNumber!= null);
    }

    /**
     * Gets the value of the parkSizeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkSizeNumber() {
        return parkSizeNumber;
    }

    /**
     * Sets the value of the parkSizeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkSizeNumber(CodeType value) {
        this.parkSizeNumber = value;
    }

    public boolean isSetParkSizeNumber() {
        return (this.parkSizeNumber!= null);
    }

    /**
     * Gets the value of the parkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkSerialNumber() {
        return parkSerialNumber;
    }

    /**
     * Sets the value of the parkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkSerialNumber(BigInteger value) {
        this.parkSerialNumber = value;
    }

    public boolean isSetParkSerialNumber() {
        return (this.parkSerialNumber!= null);
    }

}
