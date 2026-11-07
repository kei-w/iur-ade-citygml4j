//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcGroupPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcGroupPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}IfcGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcGroupPropertyType", propOrder = {
    "ifcGroup"
})
public class IfcGroupPropertyType {

    @XmlElementRef(name = "IfcGroup", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class)
    protected JAXBElement<? extends IfcGroupType> ifcGroup;

    /**
     * Gets the value of the ifcGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcGroupType> getIfcGroup() {
        return ifcGroup;
    }

    /**
     * Sets the value of the ifcGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     
     */
    public void setIfcGroup(JAXBElement<? extends IfcGroupType> value) {
        this.ifcGroup = value;
    }

    public boolean isSetIfcGroup() {
        return (this.ifcGroup!= null);
    }

}
