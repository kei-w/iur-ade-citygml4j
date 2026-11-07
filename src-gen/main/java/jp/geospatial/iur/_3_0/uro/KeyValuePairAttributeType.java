//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for KeyValuePairAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="key" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="codeValue" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *           &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="intValue" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="doubleValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *           &lt;element name="measuredValue" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *           &lt;element name="dateValue" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="uriValue" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairAttributeType", propOrder = {
    "key",
    "codeValue",
    "stringValue",
    "intValue",
    "doubleValue",
    "measuredValue",
    "dateValue",
    "uriValue"
})
public class KeyValuePairAttributeType {

    @XmlElement(required = true)
    protected CodeType key;
    protected CodeType codeValue;
    protected String stringValue;
    protected BigInteger intValue;
    protected Double doubleValue;
    protected MeasureType measuredValue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    @XmlSchemaType(name = "anyURI")
    protected String uriValue;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setKey(CodeType value) {
        this.key = value;
    }

    public boolean isSetKey() {
        return (this.key!= null);
    }

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCodeValue(CodeType value) {
        this.codeValue = value;
    }

    public boolean isSetCodeValue() {
        return (this.codeValue!= null);
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    public boolean isSetStringValue() {
        return (this.stringValue!= null);
    }

    /**
     * Gets the value of the intValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntValue() {
        return intValue;
    }

    /**
     * Sets the value of the intValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntValue(BigInteger value) {
        this.intValue = value;
    }

    public boolean isSetIntValue() {
        return (this.intValue!= null);
    }

    /**
     * Gets the value of the doubleValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Sets the value of the doubleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleValue(Double value) {
        this.doubleValue = value;
    }

    public boolean isSetDoubleValue() {
        return (this.doubleValue!= null);
    }

    /**
     * Gets the value of the measuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMeasuredValue() {
        return measuredValue;
    }

    /**
     * Sets the value of the measuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMeasuredValue(MeasureType value) {
        this.measuredValue = value;
    }

    public boolean isSetMeasuredValue() {
        return (this.measuredValue!= null);
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    public boolean isSetDateValue() {
        return (this.dateValue!= null);
    }

    /**
     * Gets the value of the uriValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriValue() {
        return uriValue;
    }

    /**
     * Sets the value of the uriValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriValue(String value) {
        this.uriValue = value;
    }

    public boolean isSetUriValue() {
        return (this.uriValue!= null);
    }

}
