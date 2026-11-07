//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

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
import net.opengis.gml.GeometryPropertyType;


/**
 * <p>Java class for AbstractConstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractConstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionOfConstruction" type="{https://www.geospatial.jp/iur/uro/3.2}ConditionOfConstructionValue" minOccurs="0"/&gt;
 *         &lt;element name="dateOfConstruction" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDemolition" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="constructionEvent" type="{https://www.geospatial.jp/iur/uro/3.2}ConstructionEventPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="elevation" type="{https://www.geospatial.jp/iur/uro/3.2}ElevationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{https://www.geospatial.jp/iur/uro/3.2}HeightPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{https://www.geospatial.jp/iur/uro/3.2}OccupancyPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityTypeAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}FacilityTypeAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityIdAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}FacilityIdAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}FacilityAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consBaseAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}ConstructionBaseAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consStructureAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}ConstructionStructureAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consDisasterRiskAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}DisasterRiskAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consDmAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}DmAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consDataQualityAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}DataQualityAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consKeyValuePairAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}KeyValuePairAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lod0Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod1Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod2Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod3Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod4Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="boundedBy" type="{https://www.geospatial.jp/iur/uro/3.2}_BoundarySurfacePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constructionInstallation" type="{https://www.geospatial.jp/iur/uro/3.2}ConstructionInstallationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractConstructionType", propOrder = {
    "conditionOfConstruction",
    "dateOfConstruction",
    "dateOfDemolition",
    "constructionEvent",
    "elevation",
    "height",
    "occupancy",
    "consFacilityTypeAttribute",
    "consFacilityIdAttribute",
    "consFacilityAttribute",
    "consBaseAttribute",
    "consStructureAttribute",
    "consDisasterRiskAttribute",
    "consDmAttribute",
    "consDataQualityAttribute",
    "consKeyValuePairAttribute",
    "lod0Geometry",
    "lod1Geometry",
    "lod2Geometry",
    "lod3Geometry",
    "lod4Geometry",
    "boundedBySurface",
    "constructionInstallation"
})
@XmlSeeAlso({
    OtherConstructionType.class
})
public abstract class AbstractConstructionType
    extends AbstractCityObjectType
{

    @XmlSchemaType(name = "string")
    protected ConditionOfConstructionValue conditionOfConstruction;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfConstruction;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDemolition;
    protected List<ConstructionEventPropertyType> constructionEvent;
    protected List<ElevationPropertyType> elevation;
    protected List<HeightPropertyType> height;
    protected List<OccupancyPropertyType> occupancy;
    protected List<FacilityTypeAttributePropertyType> consFacilityTypeAttribute;
    protected FacilityIdAttributePropertyType consFacilityIdAttribute;
    protected List<FacilityAttributePropertyType> consFacilityAttribute;
    protected ConstructionBaseAttributePropertyType consBaseAttribute;
    protected ConstructionStructureAttributePropertyType consStructureAttribute;
    protected List<DisasterRiskAttributePropertyType> consDisasterRiskAttribute;
    protected List<DmAttributePropertyType> consDmAttribute;
    protected DataQualityAttributePropertyType consDataQualityAttribute;
    protected List<KeyValuePairAttributePropertyType> consKeyValuePairAttribute;
    protected GeometryPropertyType lod0Geometry;
    protected GeometryPropertyType lod1Geometry;
    protected GeometryPropertyType lod2Geometry;
    protected GeometryPropertyType lod3Geometry;
    protected GeometryPropertyType lod4Geometry;
    @XmlElement(name = "boundedBy")
    protected List<_BoundarySurfacePropertyType> boundedBySurface;
    protected List<ConstructionInstallationPropertyType> constructionInstallation;

    /**
     * Gets the value of the conditionOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionOfConstructionValue }
     *     
     */
    public ConditionOfConstructionValue getConditionOfConstruction() {
        return conditionOfConstruction;
    }

    /**
     * Sets the value of the conditionOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionOfConstructionValue }
     *     
     */
    public void setConditionOfConstruction(ConditionOfConstructionValue value) {
        this.conditionOfConstruction = value;
    }

    public boolean isSetConditionOfConstruction() {
        return (this.conditionOfConstruction!= null);
    }

    /**
     * Gets the value of the dateOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfConstruction() {
        return dateOfConstruction;
    }

    /**
     * Sets the value of the dateOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfConstruction(XMLGregorianCalendar value) {
        this.dateOfConstruction = value;
    }

    public boolean isSetDateOfConstruction() {
        return (this.dateOfConstruction!= null);
    }

    /**
     * Gets the value of the dateOfDemolition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDemolition() {
        return dateOfDemolition;
    }

    /**
     * Sets the value of the dateOfDemolition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDemolition(XMLGregorianCalendar value) {
        this.dateOfDemolition = value;
    }

    public boolean isSetDateOfDemolition() {
        return (this.dateOfDemolition!= null);
    }

    /**
     * Gets the value of the constructionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructionEventPropertyType }
     * 
     * 
     */
    public List<ConstructionEventPropertyType> getConstructionEvent() {
        if (constructionEvent == null) {
            constructionEvent = new ArrayList<ConstructionEventPropertyType>();
        }
        return this.constructionEvent;
    }

    public boolean isSetConstructionEvent() {
        return ((this.constructionEvent!= null)&&(!this.constructionEvent.isEmpty()));
    }

    public void unsetConstructionEvent() {
        this.constructionEvent = null;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elevation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElevation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElevationPropertyType }
     * 
     * 
     */
    public List<ElevationPropertyType> getElevation() {
        if (elevation == null) {
            elevation = new ArrayList<ElevationPropertyType>();
        }
        return this.elevation;
    }

    public boolean isSetElevation() {
        return ((this.elevation!= null)&&(!this.elevation.isEmpty()));
    }

    public void unsetElevation() {
        this.elevation = null;
    }

    /**
     * Gets the value of the height property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the height property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightPropertyType }
     * 
     * 
     */
    public List<HeightPropertyType> getHeight() {
        if (height == null) {
            height = new ArrayList<HeightPropertyType>();
        }
        return this.height;
    }

    public boolean isSetHeight() {
        return ((this.height!= null)&&(!this.height.isEmpty()));
    }

    public void unsetHeight() {
        this.height = null;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupancyPropertyType }
     * 
     * 
     */
    public List<OccupancyPropertyType> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<OccupancyPropertyType>();
        }
        return this.occupancy;
    }

    public boolean isSetOccupancy() {
        return ((this.occupancy!= null)&&(!this.occupancy.isEmpty()));
    }

    public void unsetOccupancy() {
        this.occupancy = null;
    }

    /**
     * Gets the value of the consFacilityTypeAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consFacilityTypeAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsFacilityTypeAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityTypeAttributePropertyType }
     * 
     * 
     */
    public List<FacilityTypeAttributePropertyType> getConsFacilityTypeAttribute() {
        if (consFacilityTypeAttribute == null) {
            consFacilityTypeAttribute = new ArrayList<FacilityTypeAttributePropertyType>();
        }
        return this.consFacilityTypeAttribute;
    }

    public boolean isSetConsFacilityTypeAttribute() {
        return ((this.consFacilityTypeAttribute!= null)&&(!this.consFacilityTypeAttribute.isEmpty()));
    }

    public void unsetConsFacilityTypeAttribute() {
        this.consFacilityTypeAttribute = null;
    }

    /**
     * Gets the value of the consFacilityIdAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityIdAttributePropertyType }
     *     
     */
    public FacilityIdAttributePropertyType getConsFacilityIdAttribute() {
        return consFacilityIdAttribute;
    }

    /**
     * Sets the value of the consFacilityIdAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityIdAttributePropertyType }
     *     
     */
    public void setConsFacilityIdAttribute(FacilityIdAttributePropertyType value) {
        this.consFacilityIdAttribute = value;
    }

    public boolean isSetConsFacilityIdAttribute() {
        return (this.consFacilityIdAttribute!= null);
    }

    /**
     * Gets the value of the consFacilityAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consFacilityAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsFacilityAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityAttributePropertyType }
     * 
     * 
     */
    public List<FacilityAttributePropertyType> getConsFacilityAttribute() {
        if (consFacilityAttribute == null) {
            consFacilityAttribute = new ArrayList<FacilityAttributePropertyType>();
        }
        return this.consFacilityAttribute;
    }

    public boolean isSetConsFacilityAttribute() {
        return ((this.consFacilityAttribute!= null)&&(!this.consFacilityAttribute.isEmpty()));
    }

    public void unsetConsFacilityAttribute() {
        this.consFacilityAttribute = null;
    }

    /**
     * Gets the value of the consBaseAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionBaseAttributePropertyType }
     *     
     */
    public ConstructionBaseAttributePropertyType getConsBaseAttribute() {
        return consBaseAttribute;
    }

    /**
     * Sets the value of the consBaseAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionBaseAttributePropertyType }
     *     
     */
    public void setConsBaseAttribute(ConstructionBaseAttributePropertyType value) {
        this.consBaseAttribute = value;
    }

    public boolean isSetConsBaseAttribute() {
        return (this.consBaseAttribute!= null);
    }

    /**
     * Gets the value of the consStructureAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionStructureAttributePropertyType }
     *     
     */
    public ConstructionStructureAttributePropertyType getConsStructureAttribute() {
        return consStructureAttribute;
    }

    /**
     * Sets the value of the consStructureAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionStructureAttributePropertyType }
     *     
     */
    public void setConsStructureAttribute(ConstructionStructureAttributePropertyType value) {
        this.consStructureAttribute = value;
    }

    public boolean isSetConsStructureAttribute() {
        return (this.consStructureAttribute!= null);
    }

    /**
     * Gets the value of the consDisasterRiskAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consDisasterRiskAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsDisasterRiskAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisasterRiskAttributePropertyType }
     * 
     * 
     */
    public List<DisasterRiskAttributePropertyType> getConsDisasterRiskAttribute() {
        if (consDisasterRiskAttribute == null) {
            consDisasterRiskAttribute = new ArrayList<DisasterRiskAttributePropertyType>();
        }
        return this.consDisasterRiskAttribute;
    }

    public boolean isSetConsDisasterRiskAttribute() {
        return ((this.consDisasterRiskAttribute!= null)&&(!this.consDisasterRiskAttribute.isEmpty()));
    }

    public void unsetConsDisasterRiskAttribute() {
        this.consDisasterRiskAttribute = null;
    }

    /**
     * Gets the value of the consDmAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consDmAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsDmAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmAttributePropertyType }
     * 
     * 
     */
    public List<DmAttributePropertyType> getConsDmAttribute() {
        if (consDmAttribute == null) {
            consDmAttribute = new ArrayList<DmAttributePropertyType>();
        }
        return this.consDmAttribute;
    }

    public boolean isSetConsDmAttribute() {
        return ((this.consDmAttribute!= null)&&(!this.consDmAttribute.isEmpty()));
    }

    public void unsetConsDmAttribute() {
        this.consDmAttribute = null;
    }

    /**
     * Gets the value of the consDataQualityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link DataQualityAttributePropertyType }
     *     
     */
    public DataQualityAttributePropertyType getConsDataQualityAttribute() {
        return consDataQualityAttribute;
    }

    /**
     * Sets the value of the consDataQualityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataQualityAttributePropertyType }
     *     
     */
    public void setConsDataQualityAttribute(DataQualityAttributePropertyType value) {
        this.consDataQualityAttribute = value;
    }

    public boolean isSetConsDataQualityAttribute() {
        return (this.consDataQualityAttribute!= null);
    }

    /**
     * Gets the value of the consKeyValuePairAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consKeyValuePairAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsKeyValuePairAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairAttributePropertyType }
     * 
     * 
     */
    public List<KeyValuePairAttributePropertyType> getConsKeyValuePairAttribute() {
        if (consKeyValuePairAttribute == null) {
            consKeyValuePairAttribute = new ArrayList<KeyValuePairAttributePropertyType>();
        }
        return this.consKeyValuePairAttribute;
    }

    public boolean isSetConsKeyValuePairAttribute() {
        return ((this.consKeyValuePairAttribute!= null)&&(!this.consKeyValuePairAttribute.isEmpty()));
    }

    public void unsetConsKeyValuePairAttribute() {
        this.consKeyValuePairAttribute = null;
    }

    /**
     * Gets the value of the lod0Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod0Geometry() {
        return lod0Geometry;
    }

    /**
     * Sets the value of the lod0Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod0Geometry(GeometryPropertyType value) {
        this.lod0Geometry = value;
    }

    public boolean isSetLod0Geometry() {
        return (this.lod0Geometry!= null);
    }

    /**
     * Gets the value of the lod1Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod1Geometry() {
        return lod1Geometry;
    }

    /**
     * Sets the value of the lod1Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod1Geometry(GeometryPropertyType value) {
        this.lod1Geometry = value;
    }

    public boolean isSetLod1Geometry() {
        return (this.lod1Geometry!= null);
    }

    /**
     * Gets the value of the lod2Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod2Geometry() {
        return lod2Geometry;
    }

    /**
     * Sets the value of the lod2Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod2Geometry(GeometryPropertyType value) {
        this.lod2Geometry = value;
    }

    public boolean isSetLod2Geometry() {
        return (this.lod2Geometry!= null);
    }

    /**
     * Gets the value of the lod3Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod3Geometry() {
        return lod3Geometry;
    }

    /**
     * Sets the value of the lod3Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod3Geometry(GeometryPropertyType value) {
        this.lod3Geometry = value;
    }

    public boolean isSetLod3Geometry() {
        return (this.lod3Geometry!= null);
    }

    /**
     * Gets the value of the lod4Geometry property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getLod4Geometry() {
        return lod4Geometry;
    }

    /**
     * Sets the value of the lod4Geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setLod4Geometry(GeometryPropertyType value) {
        this.lod4Geometry = value;
    }

    public boolean isSetLod4Geometry() {
        return (this.lod4Geometry!= null);
    }

    /**
     * Gets the value of the boundedBySurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundedBySurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundedBySurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _BoundarySurfacePropertyType }
     * 
     * 
     */
    public List<_BoundarySurfacePropertyType> getBoundedBySurface() {
        if (boundedBySurface == null) {
            boundedBySurface = new ArrayList<_BoundarySurfacePropertyType>();
        }
        return this.boundedBySurface;
    }

    public boolean isSetBoundedBySurface() {
        return ((this.boundedBySurface!= null)&&(!this.boundedBySurface.isEmpty()));
    }

    public void unsetBoundedBySurface() {
        this.boundedBySurface = null;
    }

    /**
     * Gets the value of the constructionInstallation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructionInstallation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructionInstallation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructionInstallationPropertyType }
     * 
     * 
     */
    public List<ConstructionInstallationPropertyType> getConstructionInstallation() {
        if (constructionInstallation == null) {
            constructionInstallation = new ArrayList<ConstructionInstallationPropertyType>();
        }
        return this.constructionInstallation;
    }

    public boolean isSetConstructionInstallation() {
        return ((this.constructionInstallation!= null)&&(!this.constructionInstallation.isEmpty()));
    }

    public void unsetConstructionInstallation() {
        this.constructionInstallation = null;
    }

}
