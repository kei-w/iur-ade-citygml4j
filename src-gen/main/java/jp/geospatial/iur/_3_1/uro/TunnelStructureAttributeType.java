//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for TunnelStructureAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TunnelStructureAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tunnelType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="tunnelSubtype" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mouthType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="innerHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="effectiveHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="slopeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TunnelStructureAttributeType", propOrder = {
    "tunnelType",
    "tunnelSubtype",
    "mouthType",
    "length",
    "width",
    "area",
    "innerHeight",
    "effectiveHeight",
    "slopeType"
})
public class TunnelStructureAttributeType {

    protected CodeType tunnelType;
    protected CodeType tunnelSubtype;
    protected List<CodeType> mouthType;
    protected LengthType length;
    protected LengthType width;
    protected MeasureType area;
    protected LengthType innerHeight;
    protected LengthType effectiveHeight;
    protected CodeType slopeType;

    /**
     * Gets the value of the tunnelType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTunnelType() {
        return tunnelType;
    }

    /**
     * Sets the value of the tunnelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTunnelType(CodeType value) {
        this.tunnelType = value;
    }

    public boolean isSetTunnelType() {
        return (this.tunnelType!= null);
    }

    /**
     * Gets the value of the tunnelSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTunnelSubtype() {
        return tunnelSubtype;
    }

    /**
     * Sets the value of the tunnelSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTunnelSubtype(CodeType value) {
        this.tunnelSubtype = value;
    }

    public boolean isSetTunnelSubtype() {
        return (this.tunnelSubtype!= null);
    }

    /**
     * Gets the value of the mouthType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mouthType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMouthType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getMouthType() {
        if (mouthType == null) {
            mouthType = new ArrayList<CodeType>();
        }
        return this.mouthType;
    }

    public boolean isSetMouthType() {
        return ((this.mouthType!= null)&&(!this.mouthType.isEmpty()));
    }

    public void unsetMouthType() {
        this.mouthType = null;
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
     * Gets the value of the innerHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerHeight() {
        return innerHeight;
    }

    /**
     * Sets the value of the innerHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerHeight(LengthType value) {
        this.innerHeight = value;
    }

    public boolean isSetInnerHeight() {
        return (this.innerHeight!= null);
    }

    /**
     * Gets the value of the effectiveHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getEffectiveHeight() {
        return effectiveHeight;
    }

    /**
     * Sets the value of the effectiveHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setEffectiveHeight(LengthType value) {
        this.effectiveHeight = value;
    }

    public boolean isSetEffectiveHeight() {
        return (this.effectiveHeight!= null);
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

}
