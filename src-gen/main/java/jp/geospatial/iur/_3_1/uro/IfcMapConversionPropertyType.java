//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcMapConversionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMapConversionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}IfcMapConversion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMapConversionPropertyType", propOrder = {
    "ifcMapConversion"
})
public class IfcMapConversionPropertyType {

    @XmlElement(name = "IfcMapConversion", required = true)
    protected IfcMapConversionType ifcMapConversion;

    /**
     * Gets the value of the ifcMapConversion property.
     * 
     * @return
     *     possible object is
     *     {@link IfcMapConversionType }
     *     
     */
    public IfcMapConversionType getIfcMapConversion() {
        return ifcMapConversion;
    }

    /**
     * Sets the value of the ifcMapConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcMapConversionType }
     *     
     */
    public void setIfcMapConversion(IfcMapConversionType value) {
        this.ifcMapConversion = value;
    }

    public boolean isSetIfcMapConversion() {
        return (this.ifcMapConversion!= null);
    }

}
