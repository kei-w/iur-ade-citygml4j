//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcCoordinateReferenceSystemPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcCoordinateReferenceSystemPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}IfcCoordinateReferenceSystem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcCoordinateReferenceSystemPropertyType", propOrder = {
    "ifcCoordinateReferenceSystem"
})
public class IfcCoordinateReferenceSystemPropertyType {

    @XmlElementRef(name = "IfcCoordinateReferenceSystem", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends IfcCoordinateReferenceSystemType> ifcCoordinateReferenceSystem;

    /**
     * Gets the value of the ifcCoordinateReferenceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcCoordinateReferenceSystemType> getIfcCoordinateReferenceSystem() {
        return ifcCoordinateReferenceSystem;
    }

    /**
     * Sets the value of the ifcCoordinateReferenceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     *     
     */
    public void setIfcCoordinateReferenceSystem(JAXBElement<? extends IfcCoordinateReferenceSystemType> value) {
        this.ifcCoordinateReferenceSystem = value;
    }

    public boolean isSetIfcCoordinateReferenceSystem() {
        return (this.ifcCoordinateReferenceSystem!= null);
    }

}
