//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcPsetSpaceCommonPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetSpaceCommonPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}IfcPsetSpaceCommon"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetSpaceCommonPropertyType", propOrder = {
    "ifcPsetSpaceCommon"
})
public class IfcPsetSpaceCommonPropertyType {

    @XmlElement(name = "IfcPsetSpaceCommon", required = true)
    protected IfcPsetSpaceCommonType ifcPsetSpaceCommon;

    /**
     * Gets the value of the ifcPsetSpaceCommon property.
     * 
     * @return
     *     possible object is
     *     {@link IfcPsetSpaceCommonType }
     *     
     */
    public IfcPsetSpaceCommonType getIfcPsetSpaceCommon() {
        return ifcPsetSpaceCommon;
    }

    /**
     * Sets the value of the ifcPsetSpaceCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcPsetSpaceCommonType }
     *     
     */
    public void setIfcPsetSpaceCommon(IfcPsetSpaceCommonType value) {
        this.ifcPsetSpaceCommon = value;
    }

    public boolean isSetIfcPsetSpaceCommon() {
        return (this.ifcPsetSpaceCommon!= null);
    }

}
