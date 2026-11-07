//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcCoordinateReferenceSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcCoordinateReferenceSystemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="geodeticDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verticalDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcCoordinateReferenceSystemType", propOrder = {
    "name",
    "description",
    "geodeticDatum",
    "verticalDatum"
})
@XmlSeeAlso({
    IfcProjectedCRSType.class
})
public class IfcCoordinateReferenceSystemType
    extends IfcAttributeType
{

    protected String name;
    protected String description;
    protected String geodeticDatum;
    protected String verticalDatum;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the geodeticDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeodeticDatum() {
        return geodeticDatum;
    }

    /**
     * Sets the value of the geodeticDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeodeticDatum(String value) {
        this.geodeticDatum = value;
    }

    public boolean isSetGeodeticDatum() {
        return (this.geodeticDatum!= null);
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalDatum(String value) {
        this.verticalDatum = value;
    }

    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

}
