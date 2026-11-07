//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for TranslationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.2}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tableName" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{https://www.geospatial.jp/iur/urt/3.2}PublicTransitPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="recordSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationType", propOrder = {
    "tableName",
    "fieldName",
    "language",
    "translation",
    "fieldValue",
    "recordId",
    "recordSubId"
})
public class TranslationType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    protected CodeType tableName;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected CodeType language;
    @XmlElement(required = true)
    protected String translation;
    protected String fieldValue;
    protected PublicTransitPropertyType recordId;
    protected String recordSubId;

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTableName(CodeType value) {
        this.tableName = value;
    }

    public boolean isSetTableName() {
        return (this.tableName!= null);
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public boolean isSetFieldName() {
        return (this.fieldName!= null);
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLanguage(CodeType value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    public boolean isSetTranslation() {
        return (this.translation!= null);
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    public boolean isSetFieldValue() {
        return (this.fieldValue!= null);
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link PublicTransitPropertyType }
     *     
     */
    public PublicTransitPropertyType getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicTransitPropertyType }
     *     
     */
    public void setRecordId(PublicTransitPropertyType value) {
        this.recordId = value;
    }

    public boolean isSetRecordId() {
        return (this.recordId!= null);
    }

    /**
     * Gets the value of the recordSubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordSubId() {
        return recordSubId;
    }

    /**
     * Sets the value of the recordSubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordSubId(String value) {
        this.recordSubId = value;
    }

    public boolean isSetRecordSubId() {
        return (this.recordSubId!= null);
    }

}
