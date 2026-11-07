//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

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
 * <p>Java class for UrbanParkAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanParkAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkCode" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="breakdownOfNominalArea" type="{https://www.geospatial.jp/iur/urf/3.1}BreakdownOfNominalAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanParkAttributeType", propOrder = {
    "parkCode",
    "startFrom",
    "breakdownOfNominalArea"
})
public class UrbanParkAttributeType {

    @XmlElement(required = true)
    protected CodeType parkCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startFrom;
    protected List<BreakdownOfNominalAreaPropertyType> breakdownOfNominalArea;

    /**
     * Gets the value of the parkCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getParkCode() {
        return parkCode;
    }

    /**
     * Sets the value of the parkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setParkCode(CodeType value) {
        this.parkCode = value;
    }

    public boolean isSetParkCode() {
        return (this.parkCode!= null);
    }

    /**
     * Gets the value of the startFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartFrom(XMLGregorianCalendar value) {
        this.startFrom = value;
    }

    public boolean isSetStartFrom() {
        return (this.startFrom!= null);
    }

    /**
     * Gets the value of the breakdownOfNominalArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdownOfNominalArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakdownOfNominalArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownOfNominalAreaPropertyType }
     * 
     * 
     */
    public List<BreakdownOfNominalAreaPropertyType> getBreakdownOfNominalArea() {
        if (breakdownOfNominalArea == null) {
            breakdownOfNominalArea = new ArrayList<BreakdownOfNominalAreaPropertyType>();
        }
        return this.breakdownOfNominalArea;
    }

    public boolean isSetBreakdownOfNominalArea() {
        return ((this.breakdownOfNominalArea!= null)&&(!this.breakdownOfNominalArea.isEmpty()));
    }

    public void unsetBreakdownOfNominalArea() {
        this.breakdownOfNominalArea = null;
    }

}
