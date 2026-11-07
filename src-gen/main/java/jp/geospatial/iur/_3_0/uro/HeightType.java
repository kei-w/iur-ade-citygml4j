//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * 第3.2版修正
 * 
 * <p>Java class for HeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="highReference" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="lowReference" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="status" type="{https://www.geospatial.jp/iur/uro/3.0}HeightStatusValue"/&gt;
 *         &lt;element name="value" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightType", propOrder = {
    "highReference",
    "lowReference",
    "status",
    "value"
})
public class HeightType {

    @XmlElement(required = true)
    protected CodeType highReference;
    @XmlElement(required = true)
    protected CodeType lowReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected HeightStatusValue status;
    @XmlElement(required = true)
    protected LengthType value;

    /**
     * Gets the value of the highReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getHighReference() {
        return highReference;
    }

    /**
     * Sets the value of the highReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setHighReference(CodeType value) {
        this.highReference = value;
    }

    public boolean isSetHighReference() {
        return (this.highReference!= null);
    }

    /**
     * Gets the value of the lowReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLowReference() {
        return lowReference;
    }

    /**
     * Sets the value of the lowReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLowReference(CodeType value) {
        this.lowReference = value;
    }

    public boolean isSetLowReference() {
        return (this.lowReference!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link HeightStatusValue }
     *     
     */
    public HeightStatusValue getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightStatusValue }
     *     
     */
    public void setStatus(HeightStatusValue value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setValue(LengthType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

}
