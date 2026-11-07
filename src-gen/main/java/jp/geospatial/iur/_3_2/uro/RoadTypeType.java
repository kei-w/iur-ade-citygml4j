//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for RoadTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="isTemporary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="roadType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="widthType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="isTollRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="separator" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="isHighWay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadTypeType", propOrder = {
    "id",
    "creationDate",
    "isTemporary",
    "roadType",
    "widthType",
    "isTollRoad",
    "separator",
    "isHighWay"
})
public class RoadTypeType {

    protected String id;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    protected Boolean isTemporary;
    protected CodeType roadType;
    protected CodeType widthType;
    protected Boolean isTollRoad;
    protected LengthType separator;
    protected Boolean isHighWay;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    public boolean isSetCreationDate() {
        return (this.creationDate!= null);
    }

    /**
     * Gets the value of the isTemporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemporary() {
        return isTemporary;
    }

    /**
     * Sets the value of the isTemporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemporary(Boolean value) {
        this.isTemporary = value;
    }

    public boolean isSetIsTemporary() {
        return (this.isTemporary!= null);
    }

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRoadType(CodeType value) {
        this.roadType = value;
    }

    public boolean isSetRoadType() {
        return (this.roadType!= null);
    }

    /**
     * Gets the value of the widthType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWidthType() {
        return widthType;
    }

    /**
     * Sets the value of the widthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWidthType(CodeType value) {
        this.widthType = value;
    }

    public boolean isSetWidthType() {
        return (this.widthType!= null);
    }

    /**
     * Gets the value of the isTollRoad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTollRoad() {
        return isTollRoad;
    }

    /**
     * Sets the value of the isTollRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTollRoad(Boolean value) {
        this.isTollRoad = value;
    }

    public boolean isSetIsTollRoad() {
        return (this.isTollRoad!= null);
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSeparator(LengthType value) {
        this.separator = value;
    }

    public boolean isSetSeparator() {
        return (this.separator!= null);
    }

    /**
     * Gets the value of the isHighWay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHighWay() {
        return isHighWay;
    }

    /**
     * Sets the value of the isHighWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHighWay(Boolean value) {
        this.isHighWay = value;
    }

    public boolean isSetIsHighWay() {
        return (this.isHighWay!= null);
    }

}
