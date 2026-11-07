//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for UtilityNodeContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityNodeContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}UtilityNetworkElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="containerType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="innerDiameterLong" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="outerDiameterLong" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="innerDiameterShort" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="outerDiameterShort" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="depth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="appurtenance" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rotationAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityNodeContainerType", propOrder = {
    "containerType",
    "innerDiameterLong",
    "outerDiameterLong",
    "innerDiameterShort",
    "outerDiameterShort",
    "depth",
    "appurtenance",
    "rotationAngle"
})
@XmlSeeAlso({
    HandholeType.class,
    ManholeType.class
})
public abstract class UtilityNodeContainerType
    extends UtilityNetworkElementType
{

    protected CodeType containerType;
    protected LengthType innerDiameterLong;
    protected LengthType outerDiameterLong;
    protected LengthType innerDiameterShort;
    protected LengthType outerDiameterShort;
    protected LengthType depth;
    protected List<String> appurtenance;
    protected Double rotationAngle;

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContainerType(CodeType value) {
        this.containerType = value;
    }

    public boolean isSetContainerType() {
        return (this.containerType!= null);
    }

    /**
     * Gets the value of the innerDiameterLong property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerDiameterLong() {
        return innerDiameterLong;
    }

    /**
     * Sets the value of the innerDiameterLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerDiameterLong(LengthType value) {
        this.innerDiameterLong = value;
    }

    public boolean isSetInnerDiameterLong() {
        return (this.innerDiameterLong!= null);
    }

    /**
     * Gets the value of the outerDiameterLong property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOuterDiameterLong() {
        return outerDiameterLong;
    }

    /**
     * Sets the value of the outerDiameterLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOuterDiameterLong(LengthType value) {
        this.outerDiameterLong = value;
    }

    public boolean isSetOuterDiameterLong() {
        return (this.outerDiameterLong!= null);
    }

    /**
     * Gets the value of the innerDiameterShort property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerDiameterShort() {
        return innerDiameterShort;
    }

    /**
     * Sets the value of the innerDiameterShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerDiameterShort(LengthType value) {
        this.innerDiameterShort = value;
    }

    public boolean isSetInnerDiameterShort() {
        return (this.innerDiameterShort!= null);
    }

    /**
     * Gets the value of the outerDiameterShort property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOuterDiameterShort() {
        return outerDiameterShort;
    }

    /**
     * Sets the value of the outerDiameterShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOuterDiameterShort(LengthType value) {
        this.outerDiameterShort = value;
    }

    public boolean isSetOuterDiameterShort() {
        return (this.outerDiameterShort!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDepth(LengthType value) {
        this.depth = value;
    }

    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Gets the value of the appurtenance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appurtenance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppurtenance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAppurtenance() {
        if (appurtenance == null) {
            appurtenance = new ArrayList<String>();
        }
        return this.appurtenance;
    }

    public boolean isSetAppurtenance() {
        return ((this.appurtenance!= null)&&(!this.appurtenance.isEmpty()));
    }

    public void unsetAppurtenance() {
        this.appurtenance = null;
    }

    /**
     * Gets the value of the rotationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotationAngle() {
        return rotationAngle;
    }

    /**
     * Sets the value of the rotationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotationAngle(Double value) {
        this.rotationAngle = value;
    }

    public boolean isSetRotationAngle() {
        return (this.rotationAngle!= null);
    }

}
