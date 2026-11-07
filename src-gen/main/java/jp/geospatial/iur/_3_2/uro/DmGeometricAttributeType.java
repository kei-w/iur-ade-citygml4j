//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for DmGeometricAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DmGeometricAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}DmAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometryType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="mapLevel" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="shapeType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="is3d" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInstallation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isEdited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSupplementarySymbol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="elevation" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="lod0Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DmGeometricAttributeType", propOrder = {
    "geometryType",
    "mapLevel",
    "shapeType",
    "visibility",
    "is3D",
    "isInstallation",
    "isEdited",
    "isSupplementarySymbol",
    "angle",
    "elevation",
    "lod0Geometry"
})
public class DmGeometricAttributeType
    extends DmAttributeType
{

    @XmlElement(required = true)
    protected CodeType geometryType;
    @XmlElement(required = true)
    protected CodeType mapLevel;
    @XmlElement(required = true)
    protected CodeType shapeType;
    protected Boolean visibility;
    @XmlElement(name = "is3d")
    protected Boolean is3D;
    protected Boolean isInstallation;
    protected Boolean isEdited;
    protected Boolean isSupplementarySymbol;
    protected Double angle;
    protected LengthType elevation;
    protected GeometryPropertyType lod0Geometry;

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
     * Gets the value of the mapLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMapLevel() {
        return mapLevel;
    }

    /**
     * Sets the value of the mapLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMapLevel(CodeType value) {
        this.mapLevel = value;
    }

    public boolean isSetMapLevel() {
        return (this.mapLevel!= null);
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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibility(Boolean value) {
        this.visibility = value;
    }

    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Gets the value of the is3D property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs3D() {
        return is3D;
    }

    /**
     * Sets the value of the is3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs3D(Boolean value) {
        this.is3D = value;
    }

    public boolean isSetIs3D() {
        return (this.is3D!= null);
    }

    /**
     * Gets the value of the isInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInstallation() {
        return isInstallation;
    }

    /**
     * Sets the value of the isInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInstallation(Boolean value) {
        this.isInstallation = value;
    }

    public boolean isSetIsInstallation() {
        return (this.isInstallation!= null);
    }

    /**
     * Gets the value of the isEdited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEdited() {
        return isEdited;
    }

    /**
     * Sets the value of the isEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEdited(Boolean value) {
        this.isEdited = value;
    }

    public boolean isSetIsEdited() {
        return (this.isEdited!= null);
    }

    /**
     * Gets the value of the isSupplementarySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplementarySymbol() {
        return isSupplementarySymbol;
    }

    /**
     * Sets the value of the isSupplementarySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplementarySymbol(Boolean value) {
        this.isSupplementarySymbol = value;
    }

    public boolean isSetIsSupplementarySymbol() {
        return (this.isSupplementarySymbol!= null);
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAngle(Double value) {
        this.angle = value;
    }

    public boolean isSetAngle() {
        return (this.angle!= null);
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setElevation(LengthType value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    /**
     * Gets the value of the lod0Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod0Geometry() {
        return lod0Geometry;
    }

    /**
     * Sets the value of the lod0Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod0Geometry(GeometryPropertyType value) {
        this.lod0Geometry = value;
    }

    public boolean isSetLod0Geometry() {
        return (this.lod0Geometry!= null);
    }

}
