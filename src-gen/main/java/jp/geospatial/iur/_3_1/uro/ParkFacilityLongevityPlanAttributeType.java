//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ParkFacilityLongevityPlanAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkFacilityLongevityPlanAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}FacilityAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkCode" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="parkName" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="parkType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="facilityName" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="facilityNameOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specificFacilityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfFacilities" type="{https://www.geospatial.jp/iur/uro/3.1}NumberOfFacilitiesPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterial" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterialOptional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installationYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *         &lt;element name="disposalLimitPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="expectedUsagePeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="repairsBeforeParkHealthAssessment" type="{https://www.geospatial.jp/iur/uro/3.1}RepairsBeforeParkHealthAssessmentPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="parkHealthAssessment" type="{https://www.geospatial.jp/iur/uro/3.1}ParkHealthAssessmentPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="managementType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="expectedRenewalYearWithMeasures" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="longevityMeasures" type="{https://www.geospatial.jp/iur/uro/3.1}LongevityMeasuresPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="noteForLongevity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkFacilityLongevityPlanAttributeType", propOrder = {
    "parkCode",
    "parkName",
    "parkType",
    "facilityName",
    "facilityNameOptional",
    "specificFacilityName",
    "numberOfFacilities",
    "size",
    "mainMaterial",
    "mainMaterialOptional",
    "installationYear",
    "disposalLimitPeriod",
    "expectedUsagePeriod",
    "repairsBeforeParkHealthAssessment",
    "parkHealthAssessment",
    "managementType",
    "expectedRenewalYearWithMeasures",
    "longevityMeasures",
    "noteForLongevity"
})
public class ParkFacilityLongevityPlanAttributeType
    extends FacilityAttributeType
{

    @XmlElement(required = true)
    protected CodeType parkCode;
    @XmlElement(required = true)
    protected CodeType parkName;
    @XmlElement(required = true)
    protected CodeType parkType;
    protected CodeType facilityName;
    protected String facilityNameOptional;
    @XmlElement(required = true)
    protected String specificFacilityName;
    protected NumberOfFacilitiesPropertyType numberOfFacilities;
    protected String size;
    protected CodeType mainMaterial;
    protected String mainMaterialOptional;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar installationYear;
    protected BigInteger disposalLimitPeriod;
    protected BigInteger expectedUsagePeriod;
    protected RepairsBeforeParkHealthAssessmentPropertyType repairsBeforeParkHealthAssessment;
    protected List<ParkHealthAssessmentPropertyType> parkHealthAssessment;
    protected CodeType managementType;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar expectedRenewalYearWithMeasures;
    protected List<LongevityMeasuresPropertyType> longevityMeasures;
    protected String noteForLongevity;

    /**
     * Gets the value of the parkCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkCode() {
        return parkCode;
    }

    /**
     * Sets the value of the parkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkCode(CodeType value) {
        this.parkCode = value;
    }

    public boolean isSetParkCode() {
        return (this.parkCode!= null);
    }

    /**
     * Gets the value of the parkName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkName() {
        return parkName;
    }

    /**
     * Sets the value of the parkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkName(CodeType value) {
        this.parkName = value;
    }

    public boolean isSetParkName() {
        return (this.parkName!= null);
    }

    /**
     * Gets the value of the parkType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkType() {
        return parkType;
    }

    /**
     * Sets the value of the parkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkType(CodeType value) {
        this.parkType = value;
    }

    public boolean isSetParkType() {
        return (this.parkType!= null);
    }

    /**
     * Gets the value of the facilityName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFacilityName() {
        return facilityName;
    }

    /**
     * Sets the value of the facilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFacilityName(CodeType value) {
        this.facilityName = value;
    }

    public boolean isSetFacilityName() {
        return (this.facilityName!= null);
    }

    /**
     * Gets the value of the facilityNameOptional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityNameOptional() {
        return facilityNameOptional;
    }

    /**
     * Sets the value of the facilityNameOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityNameOptional(String value) {
        this.facilityNameOptional = value;
    }

    public boolean isSetFacilityNameOptional() {
        return (this.facilityNameOptional!= null);
    }

    /**
     * Gets the value of the specificFacilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFacilityName() {
        return specificFacilityName;
    }

    /**
     * Sets the value of the specificFacilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFacilityName(String value) {
        this.specificFacilityName = value;
    }

    public boolean isSetSpecificFacilityName() {
        return (this.specificFacilityName!= null);
    }

    /**
     * Gets the value of the numberOfFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfFacilitiesPropertyType }
     *     
     */
    public NumberOfFacilitiesPropertyType getNumberOfFacilities() {
        return numberOfFacilities;
    }

    /**
     * Sets the value of the numberOfFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfFacilitiesPropertyType }
     *     
     */
    public void setNumberOfFacilities(NumberOfFacilitiesPropertyType value) {
        this.numberOfFacilities = value;
    }

    public boolean isSetNumberOfFacilities() {
        return (this.numberOfFacilities!= null);
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    public boolean isSetSize() {
        return (this.size!= null);
    }

    /**
     * Gets the value of the mainMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainMaterial() {
        return mainMaterial;
    }

    /**
     * Sets the value of the mainMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainMaterial(CodeType value) {
        this.mainMaterial = value;
    }

    public boolean isSetMainMaterial() {
        return (this.mainMaterial!= null);
    }

    /**
     * Gets the value of the mainMaterialOptional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainMaterialOptional() {
        return mainMaterialOptional;
    }

    /**
     * Sets the value of the mainMaterialOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainMaterialOptional(String value) {
        this.mainMaterialOptional = value;
    }

    public boolean isSetMainMaterialOptional() {
        return (this.mainMaterialOptional!= null);
    }

    /**
     * Gets the value of the installationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallationYear() {
        return installationYear;
    }

    /**
     * Sets the value of the installationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallationYear(XMLGregorianCalendar value) {
        this.installationYear = value;
    }

    public boolean isSetInstallationYear() {
        return (this.installationYear!= null);
    }

    /**
     * Gets the value of the disposalLimitPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisposalLimitPeriod() {
        return disposalLimitPeriod;
    }

    /**
     * Sets the value of the disposalLimitPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisposalLimitPeriod(BigInteger value) {
        this.disposalLimitPeriod = value;
    }

    public boolean isSetDisposalLimitPeriod() {
        return (this.disposalLimitPeriod!= null);
    }

    /**
     * Gets the value of the expectedUsagePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedUsagePeriod() {
        return expectedUsagePeriod;
    }

    /**
     * Sets the value of the expectedUsagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedUsagePeriod(BigInteger value) {
        this.expectedUsagePeriod = value;
    }

    public boolean isSetExpectedUsagePeriod() {
        return (this.expectedUsagePeriod!= null);
    }

    /**
     * Gets the value of the repairsBeforeParkHealthAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link RepairsBeforeParkHealthAssessmentPropertyType }
     *     
     */
    public RepairsBeforeParkHealthAssessmentPropertyType getRepairsBeforeParkHealthAssessment() {
        return repairsBeforeParkHealthAssessment;
    }

    /**
     * Sets the value of the repairsBeforeParkHealthAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairsBeforeParkHealthAssessmentPropertyType }
     *     
     */
    public void setRepairsBeforeParkHealthAssessment(RepairsBeforeParkHealthAssessmentPropertyType value) {
        this.repairsBeforeParkHealthAssessment = value;
    }

    public boolean isSetRepairsBeforeParkHealthAssessment() {
        return (this.repairsBeforeParkHealthAssessment!= null);
    }

    /**
     * Gets the value of the parkHealthAssessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkHealthAssessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkHealthAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkHealthAssessmentPropertyType }
     * 
     * 
     */
    public List<ParkHealthAssessmentPropertyType> getParkHealthAssessment() {
        if (parkHealthAssessment == null) {
            parkHealthAssessment = new ArrayList<ParkHealthAssessmentPropertyType>();
        }
        return this.parkHealthAssessment;
    }

    public boolean isSetParkHealthAssessment() {
        return ((this.parkHealthAssessment!= null)&&(!this.parkHealthAssessment.isEmpty()));
    }

    public void unsetParkHealthAssessment() {
        this.parkHealthAssessment = null;
    }

    /**
     * Gets the value of the managementType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getManagementType() {
        return managementType;
    }

    /**
     * Sets the value of the managementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setManagementType(CodeType value) {
        this.managementType = value;
    }

    public boolean isSetManagementType() {
        return (this.managementType!= null);
    }

    /**
     * Gets the value of the expectedRenewalYearWithMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedRenewalYearWithMeasures() {
        return expectedRenewalYearWithMeasures;
    }

    /**
     * Sets the value of the expectedRenewalYearWithMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedRenewalYearWithMeasures(XMLGregorianCalendar value) {
        this.expectedRenewalYearWithMeasures = value;
    }

    public boolean isSetExpectedRenewalYearWithMeasures() {
        return (this.expectedRenewalYearWithMeasures!= null);
    }

    /**
     * Gets the value of the longevityMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longevityMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongevityMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongevityMeasuresPropertyType }
     * 
     * 
     */
    public List<LongevityMeasuresPropertyType> getLongevityMeasures() {
        if (longevityMeasures == null) {
            longevityMeasures = new ArrayList<LongevityMeasuresPropertyType>();
        }
        return this.longevityMeasures;
    }

    public boolean isSetLongevityMeasures() {
        return ((this.longevityMeasures!= null)&&(!this.longevityMeasures.isEmpty()));
    }

    public void unsetLongevityMeasures() {
        this.longevityMeasures = null;
    }

    /**
     * Gets the value of the noteForLongevity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteForLongevity() {
        return noteForLongevity;
    }

    /**
     * Sets the value of the noteForLongevity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteForLongevity(String value) {
        this.noteForLongevity = value;
    }

    public boolean isSetNoteForLongevity() {
        return (this.noteForLongevity!= null);
    }

}
