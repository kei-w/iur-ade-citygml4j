//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcClassificationReferencePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcClassificationReferencePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}IfcClassificationReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcClassificationReferencePropertyType", propOrder = {
    "ifcClassificationReference"
})
public class IfcClassificationReferencePropertyType {

    @XmlElement(name = "IfcClassificationReference", required = true)
    protected IfcClassificationReferenceType ifcClassificationReference;

    /**
     * Gets the value of the ifcClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link IfcClassificationReferenceType }
     *     
     */
    public IfcClassificationReferenceType getIfcClassificationReference() {
        return ifcClassificationReference;
    }

    /**
     * Sets the value of the ifcClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcClassificationReferenceType }
     *     
     */
    public void setIfcClassificationReference(IfcClassificationReferenceType value) {
        this.ifcClassificationReference = value;
    }

    public boolean isSetIfcClassificationReference() {
        return (this.ifcClassificationReference!= null);
    }

}
