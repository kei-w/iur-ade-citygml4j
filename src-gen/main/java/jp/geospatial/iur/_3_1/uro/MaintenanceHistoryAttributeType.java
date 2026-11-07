//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for MaintenanceHistoryAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceHistoryAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}FacilityAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maintenanceType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="maintenanceFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="maintenanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceHistoryAttributeType", propOrder = {
    "maintenanceType",
    "maintenanceFiscalYear",
    "maintenanceYear",
    "maintenanceDate",
    "status",
    "description"
})
public class MaintenanceHistoryAttributeType
    extends FacilityAttributeType
{

    @XmlElement(required = true)
    protected CodeType maintenanceType;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar maintenanceFiscalYear;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar maintenanceYear;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maintenanceDate;
    protected String status;
    protected StringOrRefType description;

    /**
     * Gets the value of the maintenanceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Sets the value of the maintenanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaintenanceType(CodeType value) {
        this.maintenanceType = value;
    }

    public boolean isSetMaintenanceType() {
        return (this.maintenanceType!= null);
    }

    /**
     * Gets the value of the maintenanceFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceFiscalYear() {
        return maintenanceFiscalYear;
    }

    /**
     * Sets the value of the maintenanceFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceFiscalYear(XMLGregorianCalendar value) {
        this.maintenanceFiscalYear = value;
    }

    public boolean isSetMaintenanceFiscalYear() {
        return (this.maintenanceFiscalYear!= null);
    }

    /**
     * Gets the value of the maintenanceYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceYear() {
        return maintenanceYear;
    }

    /**
     * Sets the value of the maintenanceYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceYear(XMLGregorianCalendar value) {
        this.maintenanceYear = value;
    }

    public boolean isSetMaintenanceYear() {
        return (this.maintenanceYear!= null);
    }

    /**
     * Gets the value of the maintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * Sets the value of the maintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceDate(XMLGregorianCalendar value) {
        this.maintenanceDate = value;
    }

    public boolean isSetMaintenanceDate() {
        return (this.maintenanceDate!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDescription(StringOrRefType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

}
