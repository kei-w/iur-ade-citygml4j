//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcRootPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcRootPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}IfcRoot"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcRootPropertyType", propOrder = {
    "ifcRoot"
})
public class IfcRootPropertyType {

    @XmlElementRef(name = "IfcRoot", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends IfcRootType> ifcRoot;

    /**
     * Gets the value of the ifcRoot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcRootType> getIfcRoot() {
        return ifcRoot;
    }

    /**
     * Sets the value of the ifcRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     *     
     */
    public void setIfcRoot(JAXBElement<? extends IfcRootType> value) {
        this.ifcRoot = value;
    }

    public boolean isSetIfcRoot() {
        return (this.ifcRoot!= null);
    }

}
