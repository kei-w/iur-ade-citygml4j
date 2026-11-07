//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

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
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for FishingPortFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishingPortFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}FishingPortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityDetailsType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="portType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="designatedArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="designatedAdministrator" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grantType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="administrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="facilityManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterial" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="otherStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="ceilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="depth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="otherSizeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfConstructionOrAcquisition" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishingPortFacilityType", propOrder = {
    "facilityDetailsType",
    "portName",
    "portType",
    "address",
    "designatedArea",
    "designation",
    "designatedAdministrator",
    "referenceNumber",
    "grantType",
    "administrator",
    "facilityManager",
    "structureType",
    "mainMaterial",
    "otherStructure",
    "length",
    "width",
    "ceilingHeight",
    "depth",
    "area",
    "otherSizeDescription",
    "dateOfConstructionOrAcquisition",
    "cost",
    "note"
})
public class FishingPortFacilityType
    extends FishingPortAttributeType
{

    @XmlElement(required = true)
    protected CodeType facilityDetailsType;
    @XmlElement(required = true)
    protected String portName;
    @XmlElement(required = true)
    protected CodeType portType;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String designatedArea;
    protected List<String> designation;
    protected List<String> designatedAdministrator;
    protected List<String> referenceNumber;
    protected CodeType grantType;
    protected String administrator;
    protected String facilityManager;
    protected CodeType structureType;
    protected CodeType mainMaterial;
    protected String otherStructure;
    protected LengthType length;
    protected LengthType width;
    protected LengthType ceilingHeight;
    protected LengthType depth;
    protected MeasureType area;
    protected String otherSizeDescription;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfConstructionOrAcquisition;
    protected BigInteger cost;
    protected String note;

    /**
     * Gets the value of the facilityDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFacilityDetailsType() {
        return facilityDetailsType;
    }

    /**
     * Sets the value of the facilityDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFacilityDetailsType(CodeType value) {
        this.facilityDetailsType = value;
    }

    public boolean isSetFacilityDetailsType() {
        return (this.facilityDetailsType!= null);
    }

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    public boolean isSetPortName() {
        return (this.portName!= null);
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPortType(CodeType value) {
        this.portType = value;
    }

    public boolean isSetPortType() {
        return (this.portType!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the designatedArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignatedArea() {
        return designatedArea;
    }

    /**
     * Sets the value of the designatedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatedArea(String value) {
        this.designatedArea = value;
    }

    public boolean isSetDesignatedArea() {
        return (this.designatedArea!= null);
    }

    /**
     * Gets the value of the designation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDesignation() {
        if (designation == null) {
            designation = new ArrayList<String>();
        }
        return this.designation;
    }

    public boolean isSetDesignation() {
        return ((this.designation!= null)&&(!this.designation.isEmpty()));
    }

    public void unsetDesignation() {
        this.designation = null;
    }

    /**
     * Gets the value of the designatedAdministrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designatedAdministrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignatedAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDesignatedAdministrator() {
        if (designatedAdministrator == null) {
            designatedAdministrator = new ArrayList<String>();
        }
        return this.designatedAdministrator;
    }

    public boolean isSetDesignatedAdministrator() {
        return ((this.designatedAdministrator!= null)&&(!this.designatedAdministrator.isEmpty()));
    }

    public void unsetDesignatedAdministrator() {
        this.designatedAdministrator = null;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<String>();
        }
        return this.referenceNumber;
    }

    public boolean isSetReferenceNumber() {
        return ((this.referenceNumber!= null)&&(!this.referenceNumber.isEmpty()));
    }

    public void unsetReferenceNumber() {
        this.referenceNumber = null;
    }

    /**
     * Gets the value of the grantType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGrantType() {
        return grantType;
    }

    /**
     * Sets the value of the grantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGrantType(CodeType value) {
        this.grantType = value;
    }

    public boolean isSetGrantType() {
        return (this.grantType!= null);
    }

    /**
     * Gets the value of the administrator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    public boolean isSetAdministrator() {
        return (this.administrator!= null);
    }

    /**
     * Gets the value of the facilityManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityManager() {
        return facilityManager;
    }

    /**
     * Sets the value of the facilityManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityManager(String value) {
        this.facilityManager = value;
    }

    public boolean isSetFacilityManager() {
        return (this.facilityManager!= null);
    }

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructureType(CodeType value) {
        this.structureType = value;
    }

    public boolean isSetStructureType() {
        return (this.structureType!= null);
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
     * Gets the value of the otherStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStructure() {
        return otherStructure;
    }

    /**
     * Sets the value of the otherStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStructure(String value) {
        this.otherStructure = value;
    }

    public boolean isSetOtherStructure() {
        return (this.otherStructure!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWidth(LengthType value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the ceilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCeilingHeight() {
        return ceilingHeight;
    }

    /**
     * Sets the value of the ceilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCeilingHeight(LengthType value) {
        this.ceilingHeight = value;
    }

    public boolean isSetCeilingHeight() {
        return (this.ceilingHeight!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDepth(LengthType value) {
        this.depth = value;
    }

    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setArea(MeasureType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the otherSizeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSizeDescription() {
        return otherSizeDescription;
    }

    /**
     * Sets the value of the otherSizeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSizeDescription(String value) {
        this.otherSizeDescription = value;
    }

    public boolean isSetOtherSizeDescription() {
        return (this.otherSizeDescription!= null);
    }

    /**
     * Gets the value of the dateOfConstructionOrAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfConstructionOrAcquisition() {
        return dateOfConstructionOrAcquisition;
    }

    /**
     * Sets the value of the dateOfConstructionOrAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfConstructionOrAcquisition(XMLGregorianCalendar value) {
        this.dateOfConstructionOrAcquisition = value;
    }

    public boolean isSetDateOfConstructionOrAcquisition() {
        return (this.dateOfConstructionOrAcquisition!= null);
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
