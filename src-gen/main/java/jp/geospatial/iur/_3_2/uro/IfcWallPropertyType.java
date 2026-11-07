//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcWallPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcWallPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}IfcWall"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcWallPropertyType", propOrder = {
    "ifcWall"
})
public class IfcWallPropertyType {

    @XmlElementRef(name = "IfcWall", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends IfcWallType> ifcWall;

    /**
     * Gets the value of the ifcWall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcWallType> getIfcWall() {
        return ifcWall;
    }

    /**
     * Sets the value of the ifcWall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     
     */
    public void setIfcWall(JAXBElement<? extends IfcWallType> value) {
        this.ifcWall = value;
    }

    public boolean isSetIfcWall() {
        return (this.ifcWall!= null);
    }

}
