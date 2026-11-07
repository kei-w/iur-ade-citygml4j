//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PollutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}_UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="damagedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="observationPoint" type="{https://www.geospatial.jp/iur/urf/3.2}ObservationPointPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionType", propOrder = {
    "identifier",
    "year",
    "cause",
    "damagedArea",
    "observationPoint"
})
public class PollutionType
    extends _UrbanFunctionType
{

    @XmlElement(name = "id", required = true)
    protected String identifier;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    protected String cause;
    protected MeasureType damagedArea;
    protected ObservationPointPropertyType observationPoint;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    public boolean isSetYear() {
        return (this.year!= null);
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

    public boolean isSetCause() {
        return (this.cause!= null);
    }

    /**
     * Gets the value of the damagedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDamagedArea() {
        return damagedArea;
    }

    /**
     * Sets the value of the damagedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDamagedArea(MeasureType value) {
        this.damagedArea = value;
    }

    public boolean isSetDamagedArea() {
        return (this.damagedArea!= null);
    }

    /**
     * Gets the value of the observationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationPointPropertyType }
     *     
     */
    public ObservationPointPropertyType getObservationPoint() {
        return observationPoint;
    }

    /**
     * Sets the value of the observationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationPointPropertyType }
     *     
     */
    public void setObservationPoint(ObservationPointPropertyType value) {
        this.observationPoint = value;
    }

    public boolean isSetObservationPoint() {
        return (this.observationPoint!= null);
    }

}
