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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for RepairsBeforeParkHealthAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairsBeforeParkHealthAssessmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="repair" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="repairFiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepairsBeforeParkHealthAssessmentType", propOrder = {
    "repair",
    "repairFiscalYear"
})
public class RepairsBeforeParkHealthAssessmentType {

    @XmlElement(required = true)
    protected CodeType repair;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar repairFiscalYear;

    /**
     * Gets the value of the repair property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRepair() {
        return repair;
    }

    /**
     * Sets the value of the repair property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRepair(CodeType value) {
        this.repair = value;
    }

    public boolean isSetRepair() {
        return (this.repair!= null);
    }

    /**
     * Gets the value of the repairFiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepairFiscalYear() {
        return repairFiscalYear;
    }

    /**
     * Sets the value of the repairFiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepairFiscalYear(XMLGregorianCalendar value) {
        this.repairFiscalYear = value;
    }

    public boolean isSetRepairFiscalYear() {
        return (this.repairFiscalYear!= null);
    }

}
