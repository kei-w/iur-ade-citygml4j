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
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for AgriculturalDevelopmentProjectTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgriculturalDevelopmentProjectTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="implementationBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benefitArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="benefitAreaInUrbanArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="startFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="measureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="benefitPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AgriculturalDevelopmentProjectTypeType", propOrder = {
    "id",
    "blockName",
    "projectType",
    "implementationBody",
    "benefitArea",
    "benefitAreaInUrbanArea",
    "startFiscalYear",
    "status",
    "measureType",
    "benefitPeriod",
    "note"
})
public class AgriculturalDevelopmentProjectTypeType {

    @XmlElement(required = true)
    protected String id;
    protected String blockName;
    protected CodeType projectType;
    protected String implementationBody;
    protected MeasureType benefitArea;
    protected MeasureType benefitAreaInUrbanArea;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar startFiscalYear;
    protected CodeType status;
    protected CodeType measureType;
    protected String benefitPeriod;
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
     * Gets the value of the blockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * Sets the value of the blockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockName(String value) {
        this.blockName = value;
    }

    public boolean isSetBlockName() {
        return (this.blockName!= null);
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setProjectType(CodeType value) {
        this.projectType = value;
    }

    public boolean isSetProjectType() {
        return (this.projectType!= null);
    }

    /**
     * Gets the value of the implementationBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementationBody() {
        return implementationBody;
    }

    /**
     * Sets the value of the implementationBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementationBody(String value) {
        this.implementationBody = value;
    }

    public boolean isSetImplementationBody() {
        return (this.implementationBody!= null);
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
     * Gets the value of the benefitAreaInUrbanArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBenefitAreaInUrbanArea() {
        return benefitAreaInUrbanArea;
    }

    /**
     * Sets the value of the benefitAreaInUrbanArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBenefitAreaInUrbanArea(MeasureType value) {
        this.benefitAreaInUrbanArea = value;
    }

    public boolean isSetBenefitAreaInUrbanArea() {
        return (this.benefitAreaInUrbanArea!= null);
    }

    /**
     * Gets the value of the startFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartFiscalYear() {
        return startFiscalYear;
    }

    /**
     * Sets the value of the startFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartFiscalYear(XMLGregorianCalendar value) {
        this.startFiscalYear = value;
    }

    public boolean isSetStartFiscalYear() {
        return (this.startFiscalYear!= null);
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
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMeasureType(CodeType value) {
        this.measureType = value;
    }

    public boolean isSetMeasureType() {
        return (this.measureType!= null);
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
