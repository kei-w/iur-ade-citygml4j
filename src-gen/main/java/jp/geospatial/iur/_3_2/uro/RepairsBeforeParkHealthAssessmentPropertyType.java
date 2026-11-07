//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepairsBeforeParkHealthAssessmentPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairsBeforeParkHealthAssessmentPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}RepairsBeforeParkHealthAssessment"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairsBeforeParkHealthAssessmentPropertyType", propOrder = {
    "repairsBeforeParkHealthAssessment"
})
public class RepairsBeforeParkHealthAssessmentPropertyType {

    @XmlElement(name = "RepairsBeforeParkHealthAssessment", required = true)
    protected RepairsBeforeParkHealthAssessmentType repairsBeforeParkHealthAssessment;

    /**
     * Gets the value of the repairsBeforeParkHealthAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link RepairsBeforeParkHealthAssessmentType }
     *     
     */
    public RepairsBeforeParkHealthAssessmentType getRepairsBeforeParkHealthAssessment() {
        return repairsBeforeParkHealthAssessment;
    }

    /**
     * Sets the value of the repairsBeforeParkHealthAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairsBeforeParkHealthAssessmentType }
     *     
     */
    public void setRepairsBeforeParkHealthAssessment(RepairsBeforeParkHealthAssessmentType value) {
        this.repairsBeforeParkHealthAssessment = value;
    }

    public boolean isSetRepairsBeforeParkHealthAssessment() {
        return (this.repairsBeforeParkHealthAssessment!= null);
    }

}
