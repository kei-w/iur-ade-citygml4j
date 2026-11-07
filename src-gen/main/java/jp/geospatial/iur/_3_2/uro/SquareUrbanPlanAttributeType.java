//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for SquareUrbanPlanAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SquareUrbanPlanAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanningAreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enforcer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDecision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateOfRevision" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaPlanned" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="areaInService" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaImproved" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="areaCompleted" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="projectStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="projectEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="isCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAuthorized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SquareUrbanPlanAttributeType", propOrder = {
    "prefecture",
    "city",
    "urbanPlanningAreaName",
    "enforcer",
    "dateOfDecision",
    "dateOfRevision",
    "areaPlanned",
    "areaInService",
    "remarks",
    "status",
    "areaImproved",
    "areaCompleted",
    "projectStartDate",
    "projectEndDate",
    "isCompleted",
    "isAuthorized",
    "purpose",
    "note"
})
@XmlSeeAlso({
    StationSquareAttributeType.class,
    TerminalAttributeType.class
})
public class SquareUrbanPlanAttributeType {

    protected CodeType prefecture;
    protected CodeType city;
    protected String urbanPlanningAreaName;
    protected List<String> enforcer;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecision;
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> dateOfRevision;
    protected MeasureType areaPlanned;
    protected MeasureType areaInService;
    protected String remarks;
    protected CodeType status;
    protected MeasureType areaImproved;
    protected MeasureType areaCompleted;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectEndDate;
    protected Boolean isCompleted;
    protected Boolean isAuthorized;
    protected String purpose;
    protected String note;

    /**
     * Gets the value of the prefecture property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPrefecture() {
        return prefecture;
    }

    /**
     * Sets the value of the prefecture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPrefecture(CodeType value) {
        this.prefecture = value;
    }

    public boolean isSetPrefecture() {
        return (this.prefecture!= null);
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCity(CodeType value) {
        this.city = value;
    }

    public boolean isSetCity() {
        return (this.city!= null);
    }

    /**
     * Gets the value of the urbanPlanningAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanPlanningAreaName() {
        return urbanPlanningAreaName;
    }

    /**
     * Sets the value of the urbanPlanningAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanPlanningAreaName(String value) {
        this.urbanPlanningAreaName = value;
    }

    public boolean isSetUrbanPlanningAreaName() {
        return (this.urbanPlanningAreaName!= null);
    }

    /**
     * Gets the value of the enforcer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enforcer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnforcer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnforcer() {
        if (enforcer == null) {
            enforcer = new ArrayList<String>();
        }
        return this.enforcer;
    }

    public boolean isSetEnforcer() {
        return ((this.enforcer!= null)&&(!this.enforcer.isEmpty()));
    }

    public void unsetEnforcer() {
        this.enforcer = null;
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
     * Gets the value of the dateOfRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateOfRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateOfRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDateOfRevision() {
        if (dateOfRevision == null) {
            dateOfRevision = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dateOfRevision;
    }

    public boolean isSetDateOfRevision() {
        return ((this.dateOfRevision!= null)&&(!this.dateOfRevision.isEmpty()));
    }

    public void unsetDateOfRevision() {
        this.dateOfRevision = null;
    }

    /**
     * Gets the value of the areaPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaPlanned() {
        return areaPlanned;
    }

    /**
     * Sets the value of the areaPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaPlanned(MeasureType value) {
        this.areaPlanned = value;
    }

    public boolean isSetAreaPlanned() {
        return (this.areaPlanned!= null);
    }

    /**
     * Gets the value of the areaInService property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaInService() {
        return areaInService;
    }

    /**
     * Sets the value of the areaInService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaInService(MeasureType value) {
        this.areaInService = value;
    }

    public boolean isSetAreaInService() {
        return (this.areaInService!= null);
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the areaImproved property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaImproved() {
        return areaImproved;
    }

    /**
     * Sets the value of the areaImproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaImproved(MeasureType value) {
        this.areaImproved = value;
    }

    public boolean isSetAreaImproved() {
        return (this.areaImproved!= null);
    }

    /**
     * Gets the value of the areaCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaCompleted() {
        return areaCompleted;
    }

    /**
     * Sets the value of the areaCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaCompleted(MeasureType value) {
        this.areaCompleted = value;
    }

    public boolean isSetAreaCompleted() {
        return (this.areaCompleted!= null);
    }

    /**
     * Gets the value of the projectStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectStartDate() {
        return projectStartDate;
    }

    /**
     * Sets the value of the projectStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectStartDate(XMLGregorianCalendar value) {
        this.projectStartDate = value;
    }

    public boolean isSetProjectStartDate() {
        return (this.projectStartDate!= null);
    }

    /**
     * Gets the value of the projectEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * Sets the value of the projectEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectEndDate(XMLGregorianCalendar value) {
        this.projectEndDate = value;
    }

    public boolean isSetProjectEndDate() {
        return (this.projectEndDate!= null);
    }

    /**
     * Gets the value of the isCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleted(Boolean value) {
        this.isCompleted = value;
    }

    public boolean isSetIsCompleted() {
        return (this.isCompleted!= null);
    }

    /**
     * Gets the value of the isAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAuthorized() {
        return isAuthorized;
    }

    /**
     * Sets the value of the isAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthorized(Boolean value) {
        this.isAuthorized = value;
    }

    public boolean isSetIsAuthorized() {
        return (this.isAuthorized!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    public boolean isSetPurpose() {
        return (this.purpose!= null);
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
