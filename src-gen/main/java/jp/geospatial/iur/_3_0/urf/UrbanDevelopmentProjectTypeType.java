//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for UrbanDevelopmentProjectTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanDevelopmentProjectTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateOfDecision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="ongoingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="costUpToLastFiscalYear" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="completedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="projectPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanDevelopmentProjectTypeType", propOrder = {
    "id",
    "dateOfDecision",
    "projectName",
    "plannedArea",
    "ongoingArea",
    "costUpToLastFiscalYear",
    "cost",
    "completedArea",
    "projectPeriod",
    "note"
})
public class UrbanDevelopmentProjectTypeType {

    @XmlElement(required = true)
    protected String id;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecision;
    @XmlElement(required = true)
    protected String projectName;
    protected MeasureType plannedArea;
    protected MeasureType ongoingArea;
    protected Double costUpToLastFiscalYear;
    protected Double cost;
    protected MeasureType completedArea;
    protected String projectPeriod;
    protected String note;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
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
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    public boolean isSetProjectName() {
        return (this.projectName!= null);
    }

    /**
     * Gets the value of the plannedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPlannedArea() {
        return plannedArea;
    }

    /**
     * Sets the value of the plannedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPlannedArea(MeasureType value) {
        this.plannedArea = value;
    }

    public boolean isSetPlannedArea() {
        return (this.plannedArea!= null);
    }

    /**
     * Gets the value of the ongoingArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOngoingArea() {
        return ongoingArea;
    }

    /**
     * Sets the value of the ongoingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOngoingArea(MeasureType value) {
        this.ongoingArea = value;
    }

    public boolean isSetOngoingArea() {
        return (this.ongoingArea!= null);
    }

    /**
     * Gets the value of the costUpToLastFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostUpToLastFiscalYear() {
        return costUpToLastFiscalYear;
    }

    /**
     * Sets the value of the costUpToLastFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostUpToLastFiscalYear(Double value) {
        this.costUpToLastFiscalYear = value;
    }

    public boolean isSetCostUpToLastFiscalYear() {
        return (this.costUpToLastFiscalYear!= null);
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    public boolean isSetCost() {
        return (this.cost!= null);
    }

    /**
     * Gets the value of the completedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCompletedArea() {
        return completedArea;
    }

    /**
     * Sets the value of the completedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCompletedArea(MeasureType value) {
        this.completedArea = value;
    }

    public boolean isSetCompletedArea() {
        return (this.completedArea!= null);
    }

    /**
     * Gets the value of the projectPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPeriod() {
        return projectPeriod;
    }

    /**
     * Sets the value of the projectPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPeriod(String value) {
        this.projectPeriod = value;
    }

    public boolean isSetProjectPeriod() {
        return (this.projectPeriod!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

}
