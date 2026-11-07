//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for LandPricePerLandUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandPricePerLandUseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="landUse" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="landPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandPricePerLandUseType", propOrder = {
    "landUse",
    "landPrice"
})
public class LandPricePerLandUseType {

    @XmlElement(required = true)
    protected CodeType landUse;
    protected BigInteger landPrice;

    /**
     * Gets the value of the landUse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLandUse() {
        return landUse;
    }

    /**
     * Sets the value of the landUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLandUse(CodeType value) {
        this.landUse = value;
    }

    public boolean isSetLandUse() {
        return (this.landUse!= null);
    }

    /**
     * Gets the value of the landPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLandPrice() {
        return landPrice;
    }

    /**
     * Sets the value of the landPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLandPrice(BigInteger value) {
        this.landPrice = value;
    }

    public boolean isSetLandPrice() {
        return (this.landPrice!= null);
    }

}
