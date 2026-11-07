//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for AgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementType", propOrder = {
    "applicableArea",
    "expiration"
})
public class AgreementType
    extends ZoneType
{

    protected MeasureType applicableArea;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiration;

    /**
     * Gets the value of the applicableArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getApplicableArea() {
        return applicableArea;
    }

    /**
     * Sets the value of the applicableArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setApplicableArea(MeasureType value) {
        this.applicableArea = value;
    }

    public boolean isSetApplicableArea() {
        return (this.applicableArea!= null);
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

    public boolean isSetExpiration() {
        return (this.expiration!= null);
    }

}
