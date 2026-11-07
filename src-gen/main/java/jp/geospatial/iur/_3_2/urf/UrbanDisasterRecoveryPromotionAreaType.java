//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UrbanDisasterRecoveryPromotionAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanDisasterRecoveryPromotionAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="emergencyRecoveryPolicy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="plannedProjectType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanDisasterRecoveryPromotionAreaType", propOrder = {
    "expirationDate",
    "emergencyRecoveryPolicy",
    "plannedProjectType"
})
public class UrbanDisasterRecoveryPromotionAreaType
    extends ZoneType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected StringOrRefType emergencyRecoveryPolicy;
    protected CodeType plannedProjectType;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    public boolean isSetExpirationDate() {
        return (this.expirationDate!= null);
    }

    /**
     * Gets the value of the emergencyRecoveryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getEmergencyRecoveryPolicy() {
        return emergencyRecoveryPolicy;
    }

    /**
     * Sets the value of the emergencyRecoveryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setEmergencyRecoveryPolicy(StringOrRefType value) {
        this.emergencyRecoveryPolicy = value;
    }

    public boolean isSetEmergencyRecoveryPolicy() {
        return (this.emergencyRecoveryPolicy!= null);
    }

    /**
     * Gets the value of the plannedProjectType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPlannedProjectType() {
        return plannedProjectType;
    }

    /**
     * Sets the value of the plannedProjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPlannedProjectType(CodeType value) {
        this.plannedProjectType = value;
    }

    public boolean isSetPlannedProjectType() {
        return (this.plannedProjectType!= null);
    }

}
