//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryRecordTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryRecordTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.1}SummaryRecordType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryRecordTypePropertyType", propOrder = {
    "summaryRecordType"
})
public class SummaryRecordTypePropertyType {

    @XmlElement(name = "SummaryRecordType", required = true)
    protected SummaryRecordTypeType summaryRecordType;

    /**
     * Gets the value of the summaryRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryRecordTypeType }
     *     
     */
    public SummaryRecordTypeType getSummaryRecordType() {
        return summaryRecordType;
    }

    /**
     * Sets the value of the summaryRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryRecordTypeType }
     *     
     */
    public void setSummaryRecordType(SummaryRecordTypeType value) {
        this.summaryRecordType = value;
    }

    public boolean isSetSummaryRecordType() {
        return (this.summaryRecordType!= null);
    }

}
