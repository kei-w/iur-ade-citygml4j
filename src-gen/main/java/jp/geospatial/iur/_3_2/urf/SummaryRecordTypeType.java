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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for SummaryRecordTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryRecordTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}UrbanPlanningBasicSurveyRecordType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classCode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="classLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{https://www.geospatial.jp/iur/urf/3.2}ValueByCodesPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryRecordTypeType", propOrder = {
    "classCode",
    "classLabel",
    "item"
})
public class SummaryRecordTypeType
    extends UrbanPlanningBasicSurveyRecordType
{

    protected CodeType classCode;
    protected String classLabel;
    @XmlElement(required = true)
    protected List<ValueByCodesPropertyType> item;

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClassCode(CodeType value) {
        this.classCode = value;
    }

    public boolean isSetClassCode() {
        return (this.classCode!= null);
    }

    /**
     * Gets the value of the classLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassLabel() {
        return classLabel;
    }

    /**
     * Sets the value of the classLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassLabel(String value) {
        this.classLabel = value;
    }

    public boolean isSetClassLabel() {
        return (this.classLabel!= null);
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueByCodesPropertyType }
     * 
     * 
     */
    public List<ValueByCodesPropertyType> getItem() {
        if (item == null) {
            item = new ArrayList<ValueByCodesPropertyType>();
        }
        return this.item;
    }

    public boolean isSetItem() {
        return ((this.item!= null)&&(!this.item.isEmpty()));
    }

    public void unsetItem() {
        this.item = null;
    }

}
