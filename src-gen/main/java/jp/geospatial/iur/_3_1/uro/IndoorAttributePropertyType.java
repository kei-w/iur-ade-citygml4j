//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndoorAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndoorAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}IndoorAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorAttributePropertyType", propOrder = {
    "indoorAttribute"
})
public class IndoorAttributePropertyType {

    @XmlElementRef(name = "IndoorAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class)
    protected JAXBElement<? extends IndoorAttributeType> indoorAttribute;

    /**
     * Gets the value of the indoorAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IndoorPublicTagAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorUserDefinedAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorZoneAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorTactileTileAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorSpaceAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFurnishingAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFacilityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorStoreyAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends IndoorAttributeType> getIndoorAttribute() {
        return indoorAttribute;
    }

    /**
     * Sets the value of the indoorAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IndoorPublicTagAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorUserDefinedAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorZoneAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorTactileTileAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorSpaceAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFurnishingAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFacilityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorStoreyAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorAttributeType }{@code >}
     *     
     */
    public void setIndoorAttribute(JAXBElement<? extends IndoorAttributeType> value) {
        this.indoorAttribute = value;
    }

    public boolean isSetIndoorAttribute() {
        return (this.indoorAttribute!= null);
    }

}
