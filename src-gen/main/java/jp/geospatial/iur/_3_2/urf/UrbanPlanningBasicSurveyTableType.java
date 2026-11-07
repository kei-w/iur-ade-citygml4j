//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

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
 * <p>Java class for UrbanPlanningBasicSurveyTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanPlanningBasicSurveyTableType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dataItemNumber" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="record" type="{https://www.geospatial.jp/iur/urf/3.2}UrbanPlanningBasicSurveyRecordPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanPlanningBasicSurveyTableType", propOrder = {
    "prefecture",
    "city",
    "dataItemNumber",
    "tableName",
    "unit",
    "referenceDate",
    "record"
})
public class UrbanPlanningBasicSurveyTableType {

    @XmlElement(required = true)
    protected CodeType prefecture;
    protected CodeType city;
    @XmlElement(required = true)
    protected CodeType dataItemNumber;
    @XmlElement(required = true)
    protected String tableName;
    protected String unit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(required = true)
    protected List<UrbanPlanningBasicSurveyRecordPropertyType> record;

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
     * Gets the value of the dataItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDataItemNumber() {
        return dataItemNumber;
    }

    /**
     * Sets the value of the dataItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDataItemNumber(CodeType value) {
        this.dataItemNumber = value;
    }

    public boolean isSetDataItemNumber() {
        return (this.dataItemNumber!= null);
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    public boolean isSetTableName() {
        return (this.tableName!= null);
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    public boolean isSetUnit() {
        return (this.unit!= null);
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    public boolean isSetReferenceDate() {
        return (this.referenceDate!= null);
    }

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrbanPlanningBasicSurveyRecordPropertyType }
     * 
     * 
     */
    public List<UrbanPlanningBasicSurveyRecordPropertyType> getRecord() {
        if (record == null) {
            record = new ArrayList<UrbanPlanningBasicSurveyRecordPropertyType>();
        }
        return this.record;
    }

    public boolean isSetRecord() {
        return ((this.record!= null)&&(!this.record.isEmpty()));
    }

    public void unsetRecord() {
        this.record = null;
    }

}
