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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UrbanFacilityStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanFacilityStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfDecision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="facilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isImplemented" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="costUptToLastYear" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="completedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanFacilityStatusType", propOrder = {
    "identifier",
    "dateOfDecision",
    "facilityName",
    "isPlanned",
    "isImplemented",
    "costUptToLastYear",
    "totalCost",
    "isCompleted",
    "startDate",
    "completedDate"
})
public class UrbanFacilityStatusType
    extends UrbanFunctionType
{

    @XmlElement(name = "id", required = true)
    protected String identifier;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecision;
    protected String facilityName;
    protected Boolean isPlanned;
    protected Boolean isImplemented;
    protected Double costUptToLastYear;
    protected Double totalCost;
    protected String isCompleted;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar completedDate;

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
     * Gets the value of the dateOfDecision property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDecision() {
        return dateOfDecision;
    }

    /**
     * Sets the value of the dateOfDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDecision(XMLGregorianCalendar value) {
        this.dateOfDecision = value;
    }

    public boolean isSetDateOfDecision() {
        return (this.dateOfDecision!= null);
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    public boolean isSetFacilityName() {
        return (this.facilityName!= null);
    }

    /**
     * Gets the value of the isPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlanned() {
        return isPlanned;
    }

    /**
     * Sets the value of the isPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlanned(Boolean value) {
        this.isPlanned = value;
    }

    public boolean isSetIsPlanned() {
        return (this.isPlanned!= null);
    }

    /**
     * Gets the value of the isImplemented property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImplemented() {
        return isImplemented;
    }

    /**
     * Sets the value of the isImplemented property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImplemented(Boolean value) {
        this.isImplemented = value;
    }

    public boolean isSetIsImplemented() {
        return (this.isImplemented!= null);
    }

    /**
     * Gets the value of the costUptToLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostUptToLastYear() {
        return costUptToLastYear;
    }

    /**
     * Sets the value of the costUptToLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostUptToLastYear(Double value) {
        this.costUptToLastYear = value;
    }

    public boolean isSetCostUptToLastYear() {
        return (this.costUptToLastYear!= null);
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCost(Double value) {
        this.totalCost = value;
    }

    public boolean isSetTotalCost() {
        return (this.totalCost!= null);
    }

    /**
     * Gets the value of the isCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCompleted(String value) {
        this.isCompleted = value;
    }

    public boolean isSetIsCompleted() {
        return (this.isCompleted!= null);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDate(XMLGregorianCalendar value) {
        this.completedDate = value;
    }

    public boolean isSetCompletedDate() {
        return (this.completedDate!= null);
    }

}
