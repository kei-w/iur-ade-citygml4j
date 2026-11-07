//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}RoomAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAttributePropertyType", propOrder = {
    "roomAttribute"
})
public class RoomAttributePropertyType {

    @XmlElementRef(name = "RoomAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends RoomAttributeType> roomAttribute;

    /**
     * Gets the value of the roomAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomDataQualityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends RoomAttributeType> getRoomAttribute() {
        return roomAttribute;
    }

    /**
     * Sets the value of the roomAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomDataQualityAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoomAttributeType }{@code >}
     *     
     */
    public void setRoomAttribute(JAXBElement<? extends RoomAttributeType> value) {
        this.roomAttribute = value;
    }

    public boolean isSetRoomAttribute() {
        return (this.roomAttribute!= null);
    }

}
