//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for DmElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DmElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="infoType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="elementKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="annotationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="precisionType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dislocationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="breakType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attributeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="attributeValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="freeSpace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DmElementType", propOrder = {
    "locationType",
    "infoType",
    "elementKey",
    "hierarchyLevel",
    "dataType",
    "annotationType",
    "precisionType",
    "dislocationType",
    "breakType",
    "attributeValue",
    "attributeType",
    "attributeValueType",
    "creationDate",
    "updateDate",
    "terminationDate",
    "freeSpace"
})
public class DmElementType {

    protected CodeType locationType;
    protected CodeType infoType;
    protected String elementKey;
    protected String hierarchyLevel;
    protected CodeType dataType;
    protected CodeType annotationType;
    protected CodeType precisionType;
    protected CodeType dislocationType;
    protected CodeType breakType;
    protected String attributeValue;
    protected CodeType attributeType;
    protected String attributeValueType;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar updateDate;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar terminationDate;
    protected String freeSpace;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationType(CodeType value) {
        this.locationType = value;
    }

    public boolean isSetLocationType() {
        return (this.locationType!= null);
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInfoType(CodeType value) {
        this.infoType = value;
    }

    public boolean isSetInfoType() {
        return (this.infoType!= null);
    }

    /**
     * Gets the value of the elementKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementKey() {
        return elementKey;
    }

    /**
     * Sets the value of the elementKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementKey(String value) {
        this.elementKey = value;
    }

    public boolean isSetElementKey() {
        return (this.elementKey!= null);
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyLevel(String value) {
        this.hierarchyLevel = value;
    }

    public boolean isSetHierarchyLevel() {
        return (this.hierarchyLevel!= null);
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDataType(CodeType value) {
        this.dataType = value;
    }

    public boolean isSetDataType() {
        return (this.dataType!= null);
    }

    /**
     * Gets the value of the annotationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAnnotationType() {
        return annotationType;
    }

    /**
     * Sets the value of the annotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAnnotationType(CodeType value) {
        this.annotationType = value;
    }

    public boolean isSetAnnotationType() {
        return (this.annotationType!= null);
    }

    /**
     * Gets the value of the precisionType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPrecisionType() {
        return precisionType;
    }

    /**
     * Sets the value of the precisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPrecisionType(CodeType value) {
        this.precisionType = value;
    }

    public boolean isSetPrecisionType() {
        return (this.precisionType!= null);
    }

    /**
     * Gets the value of the dislocationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDislocationType() {
        return dislocationType;
    }

    /**
     * Sets the value of the dislocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDislocationType(CodeType value) {
        this.dislocationType = value;
    }

    public boolean isSetDislocationType() {
        return (this.dislocationType!= null);
    }

    /**
     * Gets the value of the breakType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBreakType() {
        return breakType;
    }

    /**
     * Sets the value of the breakType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBreakType(CodeType value) {
        this.breakType = value;
    }

    public boolean isSetBreakType() {
        return (this.breakType!= null);
    }

    /**
     * Gets the value of the attributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValue(String value) {
        this.attributeValue = value;
    }

    public boolean isSetAttributeValue() {
        return (this.attributeValue!= null);
    }

    /**
     * Gets the value of the attributeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAttributeType() {
        return attributeType;
    }

    /**
     * Sets the value of the attributeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAttributeType(CodeType value) {
        this.attributeType = value;
    }

    public boolean isSetAttributeType() {
        return (this.attributeType!= null);
    }

    /**
     * Gets the value of the attributeValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeValueType() {
        return attributeValueType;
    }

    /**
     * Sets the value of the attributeValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeValueType(String value) {
        this.attributeValueType = value;
    }

    public boolean isSetAttributeValueType() {
        return (this.attributeValueType!= null);
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    public boolean isSetCreationDate() {
        return (this.creationDate!= null);
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    public boolean isSetUpdateDate() {
        return (this.updateDate!= null);
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    public boolean isSetTerminationDate() {
        return (this.terminationDate!= null);
    }

    /**
     * Gets the value of the freeSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeSpace() {
        return freeSpace;
    }

    /**
     * Sets the value of the freeSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeSpace(String value) {
        this.freeSpace = value;
    }

    public boolean isSetFreeSpace() {
        return (this.freeSpace!= null);
    }

}
