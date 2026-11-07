//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for DmAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DmAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dmCode" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="meshCode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="dmElement" type="{https://www.geospatial.jp/iur/uro/3.1}DmElementPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DmAttributeType", propOrder = {
    "dmCode",
    "meshCode",
    "dmElement"
})
@XmlSeeAlso({
    DmGeometricAttributeType.class,
    DmAnnotationType.class
})
public abstract class DmAttributeType {

    @XmlElement(required = true)
    protected CodeType dmCode;
    protected CodeType meshCode;
    protected DmElementPropertyType dmElement;

    /**
     * Gets the value of the dmCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDmCode() {
        return dmCode;
    }

    /**
     * Sets the value of the dmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDmCode(CodeType value) {
        this.dmCode = value;
    }

    public boolean isSetDmCode() {
        return (this.dmCode!= null);
    }

    /**
     * Gets the value of the meshCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMeshCode() {
        return meshCode;
    }

    /**
     * Sets the value of the meshCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMeshCode(CodeType value) {
        this.meshCode = value;
    }

    public boolean isSetMeshCode() {
        return (this.meshCode!= null);
    }

    /**
     * Gets the value of the dmElement property.
     * 
     * @return
     *     possible object is
     *     {@link DmElementPropertyType }
     *     
     */
    public DmElementPropertyType getDmElement() {
        return dmElement;
    }

    /**
     * Sets the value of the dmElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmElementPropertyType }
     *     
     */
    public void setDmElement(DmElementPropertyType value) {
        this.dmElement = value;
    }

    public boolean isSetDmElement() {
        return (this.dmElement!= null);
    }

}
