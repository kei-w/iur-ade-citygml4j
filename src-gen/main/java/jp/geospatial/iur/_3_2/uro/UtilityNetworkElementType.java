//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml.cityfurniture._2.CityFurnitureType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for UtilityNetworkElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityNetworkElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/cityfurniture/2.0}CityFurnitureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="occupierType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="occupierName" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="yearType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="administrator" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="offsetDepth" type="{https://www.geospatial.jp/iur/uro/3.2}OffsetDepthPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thematicShape" type="{https://www.geospatial.jp/iur/uro/3.2}ThematicShapePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityNetworkElementType", propOrder = {
    "occupierType",
    "occupierName",
    "year",
    "yearType",
    "administrator",
    "offsetDepth",
    "thematicShape"
})
@XmlSeeAlso({
    UtilityNodeType.class,
    UtilityNodeContainerType.class,
    UtilityLinkType.class
})
public abstract class UtilityNetworkElementType
    extends CityFurnitureType
{

    protected CodeType occupierType;
    protected CodeType occupierName;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    protected CodeType yearType;
    protected CodeType administrator;
    protected List<OffsetDepthPropertyType> offsetDepth;
    protected List<ThematicShapePropertyType> thematicShape;

    /**
     * Gets the value of the occupierType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupierType() {
        return occupierType;
    }

    /**
     * Sets the value of the occupierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupierType(CodeType value) {
        this.occupierType = value;
    }

    public boolean isSetOccupierType() {
        return (this.occupierType!= null);
    }

    /**
     * Gets the value of the occupierName property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOccupierName() {
        return occupierName;
    }

    /**
     * Sets the value of the occupierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOccupierName(CodeType value) {
        this.occupierName = value;
    }

    public boolean isSetOccupierName() {
        return (this.occupierName!= null);
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    public boolean isSetYear() {
        return (this.year!= null);
    }

    /**
     * Gets the value of the yearType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getYearType() {
        return yearType;
    }

    /**
     * Sets the value of the yearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setYearType(CodeType value) {
        this.yearType = value;
    }

    public boolean isSetYearType() {
        return (this.yearType!= null);
    }

    /**
     * Gets the value of the administrator property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAdministrator(CodeType value) {
        this.administrator = value;
    }

    public boolean isSetAdministrator() {
        return (this.administrator!= null);
    }

    /**
     * Gets the value of the offsetDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offsetDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffsetDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffsetDepthPropertyType }
     * 
     * 
     */
    public List<OffsetDepthPropertyType> getOffsetDepth() {
        if (offsetDepth == null) {
            offsetDepth = new ArrayList<OffsetDepthPropertyType>();
        }
        return this.offsetDepth;
    }

    public boolean isSetOffsetDepth() {
        return ((this.offsetDepth!= null)&&(!this.offsetDepth.isEmpty()));
    }

    public void unsetOffsetDepth() {
        this.offsetDepth = null;
    }

    /**
     * Gets the value of the thematicShape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thematicShape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThematicShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThematicShapePropertyType }
     * 
     * 
     */
    public List<ThematicShapePropertyType> getThematicShape() {
        if (thematicShape == null) {
            thematicShape = new ArrayList<ThematicShapePropertyType>();
        }
        return this.thematicShape;
    }

    public boolean isSetThematicShape() {
        return ((this.thematicShape!= null)&&(!this.thematicShape.isEmpty()));
    }

    public void unsetThematicShape() {
        this.thematicShape = null;
    }

}
