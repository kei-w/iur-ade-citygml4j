//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.GeometryPropertyType;


/**
 * <p>Java class for DmAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DmAnnotationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}DmAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometryType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="shapeType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isVertical" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="orientation" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="linewidth" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="spacing" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="lod0anchorPoint" type="{http://www.opengis.net/gml}GeometryPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DmAnnotationType", propOrder = {
    "geometryType",
    "shapeType",
    "label",
    "isVertical",
    "size",
    "orientation",
    "linewidth",
    "spacing",
    "lod0AnchorPoint"
})
public class DmAnnotationType
    extends DmAttributeType
{

    @XmlElement(required = true)
    protected CodeType geometryType;
    @XmlElement(required = true)
    protected CodeType shapeType;
    @XmlElement(required = true)
    protected String label;
    protected boolean isVertical;
    @XmlElement(required = true)
    protected BigInteger size;
    @XmlElement(required = true)
    protected BigInteger orientation;
    @XmlElement(required = true)
    protected BigInteger linewidth;
    @XmlElement(required = true)
    protected BigInteger spacing;
    @XmlElement(name = "lod0anchorPoint", required = true)
    protected GeometryPropertyType lod0AnchorPoint;

    /**
     * Gets the value of the geometryType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGeometryType() {
        return geometryType;
    }

    /**
     * Sets the value of the geometryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGeometryType(CodeType value) {
        this.geometryType = value;
    }

    public boolean isSetGeometryType() {
        return (this.geometryType!= null);
    }

    /**
     * Gets the value of the shapeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getShapeType() {
        return shapeType;
    }

    /**
     * Sets the value of the shapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setShapeType(CodeType value) {
        this.shapeType = value;
    }

    public boolean isSetShapeType() {
        return (this.shapeType!= null);
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    public boolean isSetLabel() {
        return (this.label!= null);
    }

    /**
     * Gets the value of the isVertical property.
     * 
     */
    public boolean isIsVertical() {
        return isVertical;
    }

    /**
     * Sets the value of the isVertical property.
     * 
     */
    public void setIsVertical(boolean value) {
        this.isVertical = value;
    }

    public boolean isSetIsVertical() {
        return true;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    public boolean isSetSize() {
        return (this.size!= null);
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrientation(BigInteger value) {
        this.orientation = value;
    }

    public boolean isSetOrientation() {
        return (this.orientation!= null);
    }

    /**
     * Gets the value of the linewidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinewidth() {
        return linewidth;
    }

    /**
     * Sets the value of the linewidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinewidth(BigInteger value) {
        this.linewidth = value;
    }

    public boolean isSetLinewidth() {
        return (this.linewidth!= null);
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpacing(BigInteger value) {
        this.spacing = value;
    }

    public boolean isSetSpacing() {
        return (this.spacing!= null);
    }

    /**
     * Gets the value of the lod0AnchorPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod0AnchorPoint() {
        return lod0AnchorPoint;
    }

    /**
     * Sets the value of the lod0AnchorPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod0AnchorPoint(GeometryPropertyType value) {
        this.lod0AnchorPoint = value;
    }

    public boolean isSetLod0AnchorPoint() {
        return (this.lod0AnchorPoint!= null);
    }

}
