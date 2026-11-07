//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for DevelopmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainPurpose" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="benefitArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="benefitPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="plannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="ongoingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="completedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDecision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDesignationForTemporaryReplotting" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentProjectType", propOrder = {
    "status",
    "mainPurpose",
    "benefitArea",
    "benefitPeriod",
    "cost",
    "plannedArea",
    "ongoingArea",
    "completedArea",
    "dateOfDecision",
    "dateOfDesignationForTemporaryReplotting"
})
public class DevelopmentProjectType
    extends ZoneType
{

    protected CodeType status;
    protected CodeType mainPurpose;
    protected MeasureType benefitArea;
    protected String benefitPeriod;
    protected BigInteger cost;
    protected MeasureType plannedArea;
    protected MeasureType ongoingArea;
    protected MeasureType completedArea;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecision;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDesignationForTemporaryReplotting;

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
     * Gets the value of the mainPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainPurpose() {
        return mainPurpose;
    }

    /**
     * Sets the value of the mainPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainPurpose(CodeType value) {
        this.mainPurpose = value;
    }

    public boolean isSetMainPurpose() {
        return (this.mainPurpose!= null);
    }

    /**
     * Gets the value of the benefitArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBenefitArea() {
        return benefitArea;
    }

    /**
     * Sets the value of the benefitArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBenefitArea(MeasureType value) {
        this.benefitArea = value;
    }

    public boolean isSetBenefitArea() {
        return (this.benefitArea!= null);
    }

    /**
     * Gets the value of the benefitPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPeriod() {
        return benefitPeriod;
    }

    /**
     * Sets the value of the benefitPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPeriod(String value) {
        this.benefitPeriod = value;
    }

    public boolean isSetBenefitPeriod() {
        return (this.benefitPeriod!= null);
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCost(BigInteger value) {
        this.cost = value;
    }

    public boolean isSetCost() {
        return (this.cost!= null);
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
     * Gets the value of the dateOfDesignationForTemporaryReplotting property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDesignationForTemporaryReplotting() {
        return dateOfDesignationForTemporaryReplotting;
    }

    /**
     * Sets the value of the dateOfDesignationForTemporaryReplotting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDesignationForTemporaryReplotting(XMLGregorianCalendar value) {
        this.dateOfDesignationForTemporaryReplotting = value;
    }

    public boolean isSetDateOfDesignationForTemporaryReplotting() {
        return (this.dateOfDesignationForTemporaryReplotting!= null);
    }

}
