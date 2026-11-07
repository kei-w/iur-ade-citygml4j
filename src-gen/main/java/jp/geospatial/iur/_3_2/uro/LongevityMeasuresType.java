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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LongevityMeasuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongevityMeasuresType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fiscalYearForCountermeasures" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *         &lt;element name="countermeasuresCost" type="{https://www.geospatial.jp/iur/uro/3.2}CountermeasuresCostPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongevityMeasuresType", propOrder = {
    "fiscalYearForCountermeasures",
    "countermeasuresCost",
    "description"
})
public class LongevityMeasuresType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar fiscalYearForCountermeasures;
    protected CountermeasuresCostPropertyType countermeasuresCost;
    protected String description;

    /**
     * Gets the value of the fiscalYearForCountermeasures property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYearForCountermeasures() {
        return fiscalYearForCountermeasures;
    }

    /**
     * Sets the value of the fiscalYearForCountermeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYearForCountermeasures(XMLGregorianCalendar value) {
        this.fiscalYearForCountermeasures = value;
    }

    public boolean isSetFiscalYearForCountermeasures() {
        return (this.fiscalYearForCountermeasures!= null);
    }

    /**
     * Gets the value of the countermeasuresCost property.
     * 
     * @return
     *     possible object is
     *     {@link CountermeasuresCostPropertyType }
     *     
     */
    public CountermeasuresCostPropertyType getCountermeasuresCost() {
        return countermeasuresCost;
    }

    /**
     * Sets the value of the countermeasuresCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountermeasuresCostPropertyType }
     *     
     */
    public void setCountermeasuresCost(CountermeasuresCostPropertyType value) {
        this.countermeasuresCost = value;
    }

    public boolean isSetCountermeasuresCost() {
        return (this.countermeasuresCost!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

}
