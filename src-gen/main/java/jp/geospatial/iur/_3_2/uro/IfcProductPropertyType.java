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
 * <p>Java class for IfcProductPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcProductPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}IfcProduct"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcProductPropertyType", propOrder = {
    "ifcProduct"
})
public class IfcProductPropertyType {

    @XmlElementRef(name = "IfcProduct", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends IfcProductType> ifcProduct;

    /**
     * Gets the value of the ifcProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     
     */
    public JAXBElement<? extends IfcProductType> getIfcProduct() {
        return ifcProduct;
    }

    /**
     * Sets the value of the ifcProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcDoorType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcCurtainWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWindowType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallStandardCaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcWallType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcRoofType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcOpeningElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcFurnishingElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingStoreyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcBuildingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSiteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcSpatialStructureElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IfcProductType }{@code >}
     *     
     */
    public void setIfcProduct(JAXBElement<? extends IfcProductType> value) {
        this.ifcProduct = value;
    }

    public boolean isSetIfcProduct() {
        return (this.ifcProduct!= null);
    }

}
