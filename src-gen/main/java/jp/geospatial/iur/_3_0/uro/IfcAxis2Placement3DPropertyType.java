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
 * <p>Java class for IfcAxis2Placement3DPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcAxis2Placement3DPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}IfcAxis2Placement3D"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcAxis2Placement3DPropertyType", propOrder = {
    "ifcAxis2Placement3D"
})
public class IfcAxis2Placement3DPropertyType {

    @XmlElement(name = "IfcAxis2Placement3D", required = true)
    protected IfcAxis2Placement3DType ifcAxis2Placement3D;

    /**
     * Gets the value of the ifcAxis2Placement3D property.
     * 
     * @return
     *     possible object is
     *     {@link IfcAxis2Placement3DType }
     *     
     */
    public IfcAxis2Placement3DType getIfcAxis2Placement3D() {
        return ifcAxis2Placement3D;
    }

    /**
     * Sets the value of the ifcAxis2Placement3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcAxis2Placement3DType }
     *     
     */
    public void setIfcAxis2Placement3D(IfcAxis2Placement3DType value) {
        this.ifcAxis2Placement3D = value;
    }

    public boolean isSetIfcAxis2Placement3D() {
        return (this.ifcAxis2Placement3D!= null);
    }

}
