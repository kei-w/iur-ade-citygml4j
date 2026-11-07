//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcUnitPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcUnitPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}IfcUnit"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcUnitPropertyType", propOrder = {
    "ifcUnit"
})
public class IfcUnitPropertyType {

    @XmlElement(name = "IfcUnit", required = true)
    protected IfcUnitType ifcUnit;

    /**
     * Gets the value of the ifcUnit property.
     * 
     * @return
     *     possible object is
     *     {@link IfcUnitType }
     *     
     */
    public IfcUnitType getIfcUnit() {
        return ifcUnit;
    }

    /**
     * Sets the value of the ifcUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcUnitType }
     *     
     */
    public void setIfcUnit(IfcUnitType value) {
        this.ifcUnit = value;
    }

    public boolean isSetIfcUnit() {
        return (this.ifcUnit!= null);
    }

}
