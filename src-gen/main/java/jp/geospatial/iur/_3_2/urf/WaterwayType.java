//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for WaterwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterwayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterwayType", propOrder = {
    "startLocation",
    "endLocation",
    "structure",
    "length",
    "width"
})
public class WaterwayType
    extends UrbanFacilityType
{

    protected String startLocation;
    protected String endLocation;
    protected CodeType structure;
    protected LengthType length;
    protected LengthType width;

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
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructure(CodeType value) {
        this.structure = value;
    }

    public boolean isSetStructure() {
        return (this.structure!= null);
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

}
