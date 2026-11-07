//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ValueByCodesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueByCodesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="intValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doubleValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="measureValue" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueByCodesType", propOrder = {
    "clazz",
    "intValue",
    "stringValue",
    "doubleValue",
    "measureValue"
})
public class ValueByCodesType {

    @XmlElement(name = "class", required = true)
    protected List<CodeType> clazz;
    protected BigInteger intValue;
    protected String stringValue;
    protected Double doubleValue;
    protected MeasureType measureValue;

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<CodeType>();
        }
        return this.clazz;
    }

    public boolean isSetClazz() {
        return ((this.clazz!= null)&&(!this.clazz.isEmpty()));
    }

    public void unsetClazz() {
        this.clazz = null;
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
     * Gets the value of the measureValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMeasureValue() {
        return measureValue;
    }

    /**
     * Sets the value of the measureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMeasureValue(MeasureType value) {
        this.measureValue = value;
    }

    public boolean isSetMeasureValue() {
        return (this.measureValue!= null);
    }

}
