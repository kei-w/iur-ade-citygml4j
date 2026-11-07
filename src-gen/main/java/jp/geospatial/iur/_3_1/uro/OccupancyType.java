//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for OccupancyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OccupancyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interval" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOccupants" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="occupantType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupancyType", propOrder = {
    "interval",
    "numberOfOccupants",
    "occupantType"
})
public class OccupancyType {

    protected CodeType interval;
    @XmlElement(required = true)
    protected BigInteger numberOfOccupants;
    protected CodeType occupantType;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInterval(CodeType value) {
        this.interval = value;
    }

    public boolean isSetInterval() {
        return (this.interval!= null);
    }

    /**
     * Gets the value of the numberOfOccupants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOccupants() {
        return numberOfOccupants;
    }

    /**
     * Sets the value of the numberOfOccupants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOccupants(BigInteger value) {
        this.numberOfOccupants = value;
    }

    public boolean isSetNumberOfOccupants() {
        return (this.numberOfOccupants!= null);
    }

    /**
     * Gets the value of the occupantType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupantType() {
        return occupantType;
    }

    /**
     * Sets the value of the occupantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupantType(CodeType value) {
        this.occupantType = value;
    }

    public boolean isSetOccupantType() {
        return (this.occupantType!= null);
    }

}
