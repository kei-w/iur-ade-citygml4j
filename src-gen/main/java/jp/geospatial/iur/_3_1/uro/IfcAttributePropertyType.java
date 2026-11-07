//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}IfcAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcAttributePropertyType", propOrder = {
    "ifcAttribute"
})
public class IfcAttributePropertyType {

    @XmlElementRef(name = "IfcAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class)
    protected JAXBElement<? extends IfcAttributeType> ifcAttribute;

    /**
     * Gets the value of the ifcAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcPsetSiteCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcMapConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetDoorCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetBuildingCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetWindowCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcClassificationReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetOpeningElementCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetSpaceCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceBaseQuantityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcAttributeType> getIfcAttribute() {
        return ifcAttribute;
    }

    /**
     * Sets the value of the ifcAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcPsetSiteCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProjectedCRSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCoordinateReferenceSystemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcMapConversionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetDoorCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetBuildingCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetWindowCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcClassificationReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetOpeningElementCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcPsetSpaceCommonType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcZoneType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcGroupType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcObjectDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRootType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceBaseQuantityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcAttributeType }{@code >}
     *     
     */
    public void setIfcAttribute(JAXBElement<? extends IfcAttributeType> value) {
        this.ifcAttribute = value;
    }

    public boolean isSetIfcAttribute() {
        return (this.ifcAttribute!= null);
    }

}
