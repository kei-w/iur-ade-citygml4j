//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiPointPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.StringOrRefType;


/**
 * The root type for urban function. As subclass of _CityObject, an
 * 				_UrbanFunction inherits all attributes and relations, in particular description, an
 * 				id, names and description from _AbstractFeature. 
 * 
 * <p>Java class for UrbanFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanFunctionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="validFromType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="enactmentFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="validToType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="expirationFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="legalGrounds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custodian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="nominalArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod1MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod1MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-2MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod-1MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{https://www.geospatial.jp/iur/urf/2.0}TargetPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanFunctionType", propOrder = {
    "clazz",
    "function",
    "usage",
    "validFrom",
    "validFromType",
    "enactmentFiscalYear",
    "validTo",
    "validToType",
    "expirationFiscalYear",
    "legalGrounds",
    "custodian",
    "notificationNumber",
    "urbanPlanType",
    "areaClassificationType",
    "nominalArea",
    "prefecture",
    "city",
    "reference",
    "reason",
    "note",
    "surveyYear",
    "lodMinus2MultiSurface",
    "lodMinus1MultiSurface",
    "lod0MultiSurface",
    "lod1MultiSurface",
    "lodMinus2MultiCurve",
    "lodMinus1MultiCurve",
    "lod0MultiCurve",
    "lod1MultiCurve",
    "lodMinus2MultiPoint",
    "lodMinus1MultiPoint",
    "lod0MultiPoint",
    "target"
})
@XmlSeeAlso({
    BoundaryType.class,
    ThreeDimensionalExtent.class,
    AdministrationType.class,
    CensusBlockType.class,
    DisasterDamageType.class,
    PollutionType.class,
    DisasterPreventionBaseType.class,
    RecreationsType.class,
    HubCityType.class,
    LandUseDiversionType.class,
    UrbanizationType.class,
    PublicTransitFacilityType.class,
    ZoneType.class
})
public abstract class UrbanFunctionType
    extends AbstractCityObjectType
{

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected List<CodeType> function;
    protected List<CodeType> usage;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    protected CodeType validFromType;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar enactmentFiscalYear;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    protected CodeType validToType;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar expirationFiscalYear;
    protected String legalGrounds;
    protected String custodian;
    protected String notificationNumber;
    protected CodeType urbanPlanType;
    protected CodeType areaClassificationType;
    protected MeasureType nominalArea;
    protected CodeType prefecture;
    protected CodeType city;
    @XmlSchemaType(name = "anyURI")
    protected String reference;
    protected StringOrRefType reason;
    protected StringOrRefType note;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;
    @XmlElement(name = "lod-2MultiSurface")
    protected MultiSurfacePropertyType lodMinus2MultiSurface;
    @XmlElement(name = "lod-1MultiSurface")
    protected MultiSurfacePropertyType lodMinus1MultiSurface;
    protected MultiSurfacePropertyType lod0MultiSurface;
    protected MultiSurfacePropertyType lod1MultiSurface;
    @XmlElement(name = "lod-2MultiCurve")
    protected MultiCurvePropertyType lodMinus2MultiCurve;
    @XmlElement(name = "lod-1MultiCurve")
    protected MultiCurvePropertyType lodMinus1MultiCurve;
    protected MultiCurvePropertyType lod0MultiCurve;
    protected MultiCurvePropertyType lod1MultiCurve;
    @XmlElement(name = "lod-2MultiPoint")
    protected MultiPointPropertyType lodMinus2MultiPoint;
    @XmlElement(name = "lod-1MultiPoint")
    protected MultiPointPropertyType lodMinus1MultiPoint;
    protected MultiPointPropertyType lod0MultiPoint;
    protected List<TargetPropertyType> target;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<CodeType>();
        }
        return this.usage;
    }

    public boolean isSetUsage() {
        return ((this.usage!= null)&&(!this.usage.isEmpty()));
    }

    public void unsetUsage() {
        this.usage = null;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    public boolean isSetValidFrom() {
        return (this.validFrom!= null);
    }

    /**
     * Gets the value of the validFromType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getValidFromType() {
        return validFromType;
    }

    /**
     * Sets the value of the validFromType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setValidFromType(CodeType value) {
        this.validFromType = value;
    }

    public boolean isSetValidFromType() {
        return (this.validFromType!= null);
    }

    /**
     * Gets the value of the enactmentFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnactmentFiscalYear() {
        return enactmentFiscalYear;
    }

    /**
     * Sets the value of the enactmentFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnactmentFiscalYear(XMLGregorianCalendar value) {
        this.enactmentFiscalYear = value;
    }

    public boolean isSetEnactmentFiscalYear() {
        return (this.enactmentFiscalYear!= null);
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    public boolean isSetValidTo() {
        return (this.validTo!= null);
    }

    /**
     * Gets the value of the validToType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getValidToType() {
        return validToType;
    }

    /**
     * Sets the value of the validToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setValidToType(CodeType value) {
        this.validToType = value;
    }

    public boolean isSetValidToType() {
        return (this.validToType!= null);
    }

    /**
     * Gets the value of the expirationFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationFiscalYear() {
        return expirationFiscalYear;
    }

    /**
     * Sets the value of the expirationFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationFiscalYear(XMLGregorianCalendar value) {
        this.expirationFiscalYear = value;
    }

    public boolean isSetExpirationFiscalYear() {
        return (this.expirationFiscalYear!= null);
    }

    /**
     * Gets the value of the legalGrounds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalGrounds() {
        return legalGrounds;
    }

    /**
     * Sets the value of the legalGrounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalGrounds(String value) {
        this.legalGrounds = value;
    }

    public boolean isSetLegalGrounds() {
        return (this.legalGrounds!= null);
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodian(String value) {
        this.custodian = value;
    }

    public boolean isSetCustodian() {
        return (this.custodian!= null);
    }

    /**
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
    }

    public boolean isSetNotificationNumber() {
        return (this.notificationNumber!= null);
    }

    /**
     * Gets the value of the urbanPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUrbanPlanType() {
        return urbanPlanType;
    }

    /**
     * Sets the value of the urbanPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUrbanPlanType(CodeType value) {
        this.urbanPlanType = value;
    }

    public boolean isSetUrbanPlanType() {
        return (this.urbanPlanType!= null);
    }

    /**
     * Gets the value of the areaClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaClassificationType() {
        return areaClassificationType;
    }

    /**
     * Sets the value of the areaClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaClassificationType(CodeType value) {
        this.areaClassificationType = value;
    }

    public boolean isSetAreaClassificationType() {
        return (this.areaClassificationType!= null);
    }

    /**
     * Gets the value of the nominalArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalArea() {
        return nominalArea;
    }

    /**
     * Sets the value of the nominalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalArea(MeasureType value) {
        this.nominalArea = value;
    }

    public boolean isSetNominalArea() {
        return (this.nominalArea!= null);
    }

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
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReason(StringOrRefType value) {
        this.reason = value;
    }

    public boolean isSetReason() {
        return (this.reason!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setNote(StringOrRefType value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

    /**
     * Gets the value of the surveyYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyYear() {
        return surveyYear;
    }

    /**
     * Sets the value of the surveyYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyYear(XMLGregorianCalendar value) {
        this.surveyYear = value;
    }

    public boolean isSetSurveyYear() {
        return (this.surveyYear!= null);
    }

    /**
     * Gets the value of the lodMinus2MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLodMinus2MultiSurface() {
        return lodMinus2MultiSurface;
    }

    /**
     * Sets the value of the lodMinus2MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLodMinus2MultiSurface(MultiSurfacePropertyType value) {
        this.lodMinus2MultiSurface = value;
    }

    public boolean isSetLodMinus2MultiSurface() {
        return (this.lodMinus2MultiSurface!= null);
    }

    /**
     * Gets the value of the lodMinus1MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLodMinus1MultiSurface() {
        return lodMinus1MultiSurface;
    }

    /**
     * Sets the value of the lodMinus1MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLodMinus1MultiSurface(MultiSurfacePropertyType value) {
        this.lodMinus1MultiSurface = value;
    }

    public boolean isSetLodMinus1MultiSurface() {
        return (this.lodMinus1MultiSurface!= null);
    }

    /**
     * Gets the value of the lod0MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod0MultiSurface() {
        return lod0MultiSurface;
    }

    /**
     * Sets the value of the lod0MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod0MultiSurface(MultiSurfacePropertyType value) {
        this.lod0MultiSurface = value;
    }

    public boolean isSetLod0MultiSurface() {
        return (this.lod0MultiSurface!= null);
    }

    /**
     * Gets the value of the lod1MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod1MultiSurface() {
        return lod1MultiSurface;
    }

    /**
     * Sets the value of the lod1MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod1MultiSurface(MultiSurfacePropertyType value) {
        this.lod1MultiSurface = value;
    }

    public boolean isSetLod1MultiSurface() {
        return (this.lod1MultiSurface!= null);
    }

    /**
     * Gets the value of the lodMinus2MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLodMinus2MultiCurve() {
        return lodMinus2MultiCurve;
    }

    /**
     * Sets the value of the lodMinus2MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLodMinus2MultiCurve(MultiCurvePropertyType value) {
        this.lodMinus2MultiCurve = value;
    }

    public boolean isSetLodMinus2MultiCurve() {
        return (this.lodMinus2MultiCurve!= null);
    }

    /**
     * Gets the value of the lodMinus1MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLodMinus1MultiCurve() {
        return lodMinus1MultiCurve;
    }

    /**
     * Sets the value of the lodMinus1MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLodMinus1MultiCurve(MultiCurvePropertyType value) {
        this.lodMinus1MultiCurve = value;
    }

    public boolean isSetLodMinus1MultiCurve() {
        return (this.lodMinus1MultiCurve!= null);
    }

    /**
     * Gets the value of the lod0MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    /**
     * Sets the value of the lod0MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod0MultiCurve(MultiCurvePropertyType value) {
        this.lod0MultiCurve = value;
    }

    public boolean isSetLod0MultiCurve() {
        return (this.lod0MultiCurve!= null);
    }

    /**
     * Gets the value of the lod1MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod1MultiCurve() {
        return lod1MultiCurve;
    }

    /**
     * Sets the value of the lod1MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod1MultiCurve(MultiCurvePropertyType value) {
        this.lod1MultiCurve = value;
    }

    public boolean isSetLod1MultiCurve() {
        return (this.lod1MultiCurve!= null);
    }

    /**
     * Gets the value of the lodMinus2MultiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLodMinus2MultiPoint() {
        return lodMinus2MultiPoint;
    }

    /**
     * Sets the value of the lodMinus2MultiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLodMinus2MultiPoint(MultiPointPropertyType value) {
        this.lodMinus2MultiPoint = value;
    }

    public boolean isSetLodMinus2MultiPoint() {
        return (this.lodMinus2MultiPoint!= null);
    }

    /**
     * Gets the value of the lodMinus1MultiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLodMinus1MultiPoint() {
        return lodMinus1MultiPoint;
    }

    /**
     * Sets the value of the lodMinus1MultiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLodMinus1MultiPoint(MultiPointPropertyType value) {
        this.lodMinus1MultiPoint = value;
    }

    public boolean isSetLodMinus1MultiPoint() {
        return (this.lodMinus1MultiPoint!= null);
    }

    /**
     * Gets the value of the lod0MultiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLod0MultiPoint() {
        return lod0MultiPoint;
    }

    /**
     * Sets the value of the lod0MultiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLod0MultiPoint(MultiPointPropertyType value) {
        this.lod0MultiPoint = value;
    }

    public boolean isSetLod0MultiPoint() {
        return (this.lod0MultiPoint!= null);
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetPropertyType }
     * 
     * 
     */
    public List<TargetPropertyType> getTarget() {
        if (target == null) {
            target = new ArrayList<TargetPropertyType>();
        }
        return this.target;
    }

    public boolean isSetTarget() {
        return ((this.target!= null)&&(!this.target.isEmpty()));
    }

    public void unsetTarget() {
        this.target = null;
    }

}
