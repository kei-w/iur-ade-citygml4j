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
 * <p>Java class for IfcSpatialStructureElementPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSpatialStructureElementPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}IfcSpatialStructureElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSpatialStructureElementPropertyType", propOrder = {
    "ifcSpatialStructureElement"
})
public class IfcSpatialStructureElementPropertyType {

    @XmlElementRef(name = "IfcSpatialStructureElement", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends IfcSpatialStructureElementType> ifcSpatialStructureElement;

    /**
     * Gets the value of the ifcSpatialStructureElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcSpatialStructureElementType> getIfcSpatialStructureElement() {
        return ifcSpatialStructureElement;
    }

    /**
     * Sets the value of the ifcSpatialStructureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     
     */
    public void setIfcSpatialStructureElement(JAXBElement<? extends IfcSpatialStructureElementType> value) {
        this.ifcSpatialStructureElement = value;
    }

    public boolean isSetIfcSpatialStructureElement() {
        return (this.ifcSpatialStructureElement!= null);
    }

}
