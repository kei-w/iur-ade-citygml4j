//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for BridgeStructureAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BridgeStructureAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="material" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="bridgeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="weightRestriction" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="heightRestriction" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="widthRestriction" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="underGirderHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="slopeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="escalator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BridgeStructureAttributeType", propOrder = {
    "material",
    "bridgeType",
    "length",
    "width",
    "area",
    "weightRestriction",
    "heightRestriction",
    "widthRestriction",
    "underGirderHeight",
    "slopeType",
    "escalator"
})
public class BridgeStructureAttributeType {

    protected CodeType material;
    protected CodeType bridgeType;
    protected LengthType length;
    protected LengthType width;
    protected MeasureType area;
    protected MeasureType weightRestriction;
    protected LengthType heightRestriction;
    protected LengthType widthRestriction;
    protected LengthType underGirderHeight;
    protected CodeType slopeType;
    protected Boolean escalator;

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaterial(CodeType value) {
        this.material = value;
    }

    public boolean isSetMaterial() {
        return (this.material!= null);
    }

    /**
     * Gets the value of the bridgeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBridgeType() {
        return bridgeType;
    }

    /**
     * Sets the value of the bridgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBridgeType(CodeType value) {
        this.bridgeType = value;
    }

    public boolean isSetBridgeType() {
        return (this.bridgeType!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWidth(LengthType value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setArea(MeasureType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the weightRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightRestriction() {
        return weightRestriction;
    }

    /**
     * Sets the value of the weightRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightRestriction(MeasureType value) {
        this.weightRestriction = value;
    }

    public boolean isSetWeightRestriction() {
        return (this.weightRestriction!= null);
    }

    /**
     * Gets the value of the heightRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getHeightRestriction() {
        return heightRestriction;
    }

    /**
     * Sets the value of the heightRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setHeightRestriction(LengthType value) {
        this.heightRestriction = value;
    }

    public boolean isSetHeightRestriction() {
        return (this.heightRestriction!= null);
    }

    /**
     * Gets the value of the widthRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWidthRestriction() {
        return widthRestriction;
    }

    /**
     * Sets the value of the widthRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWidthRestriction(LengthType value) {
        this.widthRestriction = value;
    }

    public boolean isSetWidthRestriction() {
        return (this.widthRestriction!= null);
    }

    /**
     * Gets the value of the underGirderHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getUnderGirderHeight() {
        return underGirderHeight;
    }

    /**
     * Sets the value of the underGirderHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setUnderGirderHeight(LengthType value) {
        this.underGirderHeight = value;
    }

    public boolean isSetUnderGirderHeight() {
        return (this.underGirderHeight!= null);
    }

    /**
     * Gets the value of the slopeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSlopeType() {
        return slopeType;
    }

    /**
     * Sets the value of the slopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSlopeType(CodeType value) {
        this.slopeType = value;
    }

    public boolean isSetSlopeType() {
        return (this.slopeType!= null);
    }

    /**
     * Gets the value of the escalator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscalator() {
        return escalator;
    }

    /**
     * Sets the value of the escalator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscalator(Boolean value) {
        this.escalator = value;
    }

    public boolean isSetEscalator() {
        return (this.escalator!= null);
    }

}
