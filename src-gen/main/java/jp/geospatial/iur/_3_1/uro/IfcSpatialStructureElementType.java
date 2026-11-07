//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSpatialStructureElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSpatialStructureElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IfcProductType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compositionType" type="{https://www.geospatial.jp/iur/uro/3.1}IfcElementCompositionEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSpatialStructureElementType", propOrder = {
    "longName",
    "compositionType"
})
@XmlSeeAlso({
    IfcBuildingType.class,
    IfcSiteType.class,
    IfcSpaceType.class,
    IfcBuildingStoreyType.class
})
public abstract class IfcSpatialStructureElementType
    extends IfcProductType
{

    protected String longName;
    @XmlSchemaType(name = "string")
    protected IfcElementCompositionEnum compositionType;

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    public boolean isSetLongName() {
        return (this.longName!= null);
    }

    /**
     * Gets the value of the compositionType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcElementCompositionEnum }
     *     
     */
    public IfcElementCompositionEnum getCompositionType() {
        return compositionType;
    }

    /**
     * Sets the value of the compositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcElementCompositionEnum }
     *     
     */
    public void setCompositionType(IfcElementCompositionEnum value) {
        this.compositionType = value;
    }

    public boolean isSetCompositionType() {
        return (this.compositionType!= null);
    }

}
