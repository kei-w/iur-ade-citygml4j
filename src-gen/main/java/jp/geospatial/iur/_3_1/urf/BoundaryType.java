//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MultiCurvePropertyType;


/**
 * <p>Java class for BoundaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offset" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="offsetDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundaryType", propOrder = {
    "clazz",
    "function",
    "usage",
    "offset",
    "offsetDirection",
    "location"
})
public class BoundaryType {

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected List<CodeType> function;
    protected List<CodeType> usage;
    protected LengthType offset;
    protected String offsetDirection;
    protected MultiCurvePropertyType location;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<CodeType>();
        }
        return this.usage;
    }

    public boolean isSetUsage() {
        return ((this.usage!= null)&&(!this.usage.isEmpty()));
    }

    public void unsetUsage() {
        this.usage = null;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOffset(LengthType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
    }

    /**
     * Gets the value of the offsetDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetDirection() {
        return offsetDirection;
    }

    /**
     * Sets the value of the offsetDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetDirection(String value) {
        this.offsetDirection = value;
    }

    public boolean isSetOffsetDirection() {
        return (this.offsetDirection!= null);
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLocation(MultiCurvePropertyType value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

}
