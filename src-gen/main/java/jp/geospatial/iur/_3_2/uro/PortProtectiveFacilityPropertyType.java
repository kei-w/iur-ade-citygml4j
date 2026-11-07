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
 * <p>Java class for PortProtectiveFacilityPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortProtectiveFacilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}PortProtectiveFacility"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortProtectiveFacilityPropertyType", propOrder = {
    "portProtectiveFacility"
})
public class PortProtectiveFacilityPropertyType {

    @XmlElement(name = "PortProtectiveFacility", required = true)
    protected PortProtectiveFacilityType portProtectiveFacility;

    /**
     * Gets the value of the portProtectiveFacility property.
     * 
     * @return
     *     possible object is
     *     {@link PortProtectiveFacilityType }
     *     
     */
    public PortProtectiveFacilityType getPortProtectiveFacility() {
        return portProtectiveFacility;
    }

    /**
     * Sets the value of the portProtectiveFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortProtectiveFacilityType }
     *     
     */
    public void setPortProtectiveFacility(PortProtectiveFacilityType value) {
        this.portProtectiveFacility = value;
    }

    public boolean isSetPortProtectiveFacility() {
        return (this.portProtectiveFacility!= null);
    }

}
