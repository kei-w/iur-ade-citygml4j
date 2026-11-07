//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleTerminalAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleTerminalAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}VehicleTerminalAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleTerminalAttributePropertyType", propOrder = {
    "vehicleTerminalAttribute"
})
public class VehicleTerminalAttributePropertyType {

    @XmlElement(name = "VehicleTerminalAttribute", required = true)
    protected VehicleTerminalAttributeType vehicleTerminalAttribute;

    /**
     * Gets the value of the vehicleTerminalAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTerminalAttributeType }
     *     
     */
    public VehicleTerminalAttributeType getVehicleTerminalAttribute() {
        return vehicleTerminalAttribute;
    }

    /**
     * Sets the value of the vehicleTerminalAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTerminalAttributeType }
     *     
     */
    public void setVehicleTerminalAttribute(VehicleTerminalAttributeType value) {
        this.vehicleTerminalAttribute = value;
    }

    public boolean isSetVehicleTerminalAttribute() {
        return (this.vehicleTerminalAttribute!= null);
    }

}
