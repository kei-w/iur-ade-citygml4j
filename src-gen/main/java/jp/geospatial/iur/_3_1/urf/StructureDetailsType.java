//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for StructureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viaLocations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="minimumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="standardWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="crossType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureDetailsType", propOrder = {
    "startLocation",
    "endLocation",
    "viaLocations",
    "length",
    "structureType",
    "minimumWidth",
    "maximumWidth",
    "standardWidth",
    "crossType"
})
public class StructureDetailsType {

    @XmlElement(required = true)
    protected String startLocation;
    @XmlElement(required = true)
    protected String endLocation;
    protected String viaLocations;
    protected LengthType length;
    protected CodeType structureType;
    protected LengthType minimumWidth;
    protected LengthType maximumWidth;
    protected LengthType standardWidth;
    protected CodeType crossType;

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocation(String value) {
        this.startLocation = value;
    }

    public boolean isSetStartLocation() {
        return (this.startLocation!= null);
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocation(String value) {
        this.endLocation = value;
    }

    public boolean isSetEndLocation() {
        return (this.endLocation!= null);
    }

    /**
     * Gets the value of the viaLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaLocations() {
        return viaLocations;
    }

    /**
     * Sets the value of the viaLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaLocations(String value) {
        this.viaLocations = value;
    }

    public boolean isSetViaLocations() {
        return (this.viaLocations!= null);
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
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructureType(CodeType value) {
        this.structureType = value;
    }

    public boolean isSetStructureType() {
        return (this.structureType!= null);
    }

    /**
     * Gets the value of the minimumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumWidth() {
        return minimumWidth;
    }

    /**
     * Sets the value of the minimumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumWidth(LengthType value) {
        this.minimumWidth = value;
    }

    public boolean isSetMinimumWidth() {
        return (this.minimumWidth!= null);
    }

    /**
     * Gets the value of the maximumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumWidth() {
        return maximumWidth;
    }

    /**
     * Sets the value of the maximumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumWidth(LengthType value) {
        this.maximumWidth = value;
    }

    public boolean isSetMaximumWidth() {
        return (this.maximumWidth!= null);
    }

    /**
     * Gets the value of the standardWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getStandardWidth() {
        return standardWidth;
    }

    /**
     * Sets the value of the standardWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setStandardWidth(LengthType value) {
        this.standardWidth = value;
    }

    public boolean isSetStandardWidth() {
        return (this.standardWidth!= null);
    }

    /**
     * Gets the value of the crossType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCrossType() {
        return crossType;
    }

    /**
     * Sets the value of the crossType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCrossType(CodeType value) {
        this.crossType = value;
    }

    public boolean isSetCrossType() {
        return (this.crossType!= null);
    }

}
