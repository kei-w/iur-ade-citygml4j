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
import net.opengis.gml.CodeType;


/**
 * <p>Java class for IfcClassificationReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcClassificationReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="itemReference" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referencedSource" type="{https://www.geospatial.jp/iur/uro/3.2}IfcClassificationPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcClassificationReferenceType", propOrder = {
    "location",
    "itemReference",
    "name",
    "referencedSource"
})
public class IfcClassificationReferenceType
    extends IfcAttributeType
{

    @XmlSchemaType(name = "anyURI")
    protected String location;
    protected CodeType itemReference;
    protected String name;
    protected IfcClassificationPropertyType referencedSource;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the itemReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getItemReference() {
        return itemReference;
    }

    /**
     * Sets the value of the itemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setItemReference(CodeType value) {
        this.itemReference = value;
    }

    public boolean isSetItemReference() {
        return (this.itemReference!= null);
    }

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
     * Gets the value of the referencedSource property.
     * 
     * @return
     *     possible object is
     *     {@link IfcClassificationPropertyType }
     *     
     */
    public IfcClassificationPropertyType getReferencedSource() {
        return referencedSource;
    }

    /**
     * Sets the value of the referencedSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcClassificationPropertyType }
     *     
     */
    public void setReferencedSource(IfcClassificationPropertyType value) {
        this.referencedSource = value;
    }

    public boolean isSetReferencedSource() {
        return (this.referencedSource!= null);
    }

}
