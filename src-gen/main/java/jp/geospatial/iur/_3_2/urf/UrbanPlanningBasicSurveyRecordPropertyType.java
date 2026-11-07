//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanPlanningBasicSurveyRecordPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanPlanningBasicSurveyRecordPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}UrbanPlanningBasicSurveyRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanPlanningBasicSurveyRecordPropertyType", propOrder = {
    "urbanPlanningBasicSurveyRecord"
})
public class UrbanPlanningBasicSurveyRecordPropertyType {

    @XmlElementRef(name = "UrbanPlanningBasicSurveyRecord", namespace = "https://www.geospatial.jp/iur/urf/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends UrbanPlanningBasicSurveyRecordType> urbanPlanningBasicSurveyRecord;

    /**
     * Gets the value of the urbanPlanningBasicSurveyRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemRecordTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SummaryRecordTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningBasicSurveyRecordType }{@code >}
     *     
     */
    public JAXBElement<? extends UrbanPlanningBasicSurveyRecordType> getUrbanPlanningBasicSurveyRecord() {
        return urbanPlanningBasicSurveyRecord;
    }

    /**
     * Sets the value of the urbanPlanningBasicSurveyRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemRecordTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SummaryRecordTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UrbanPlanningBasicSurveyRecordType }{@code >}
     *     
     */
    public void setUrbanPlanningBasicSurveyRecord(JAXBElement<? extends UrbanPlanningBasicSurveyRecordType> value) {
        this.urbanPlanningBasicSurveyRecord = value;
    }

    public boolean isSetUrbanPlanningBasicSurveyRecord() {
        return (this.urbanPlanningBasicSurveyRecord!= null);
    }

}
