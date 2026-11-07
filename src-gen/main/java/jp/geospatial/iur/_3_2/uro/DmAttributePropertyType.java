//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DmAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DmAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.2}DmAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DmAttributePropertyType", propOrder = {
    "dmAttribute"
})
public class DmAttributePropertyType {

    @XmlElementRef(name = "DmAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends DmAttributeType> dmAttribute;

    /**
     * Gets the value of the dmAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DmAnnotationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmGeometricAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends DmAttributeType> getDmAttribute() {
        return dmAttribute;
    }

    /**
     * Sets the value of the dmAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DmAnnotationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmGeometricAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DmAttributeType }{@code >}
     *     
     */
    public void setDmAttribute(JAXBElement<? extends DmAttributeType> value) {
        this.dmAttribute = value;
    }

    public boolean isSetDmAttribute() {
        return (this.dmAttribute!= null);
    }

}
