//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanRapidTransitRailroadAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanRapidTransitRailroadAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/2.0}UrbanRapidTransitRailroadAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanRapidTransitRailroadAttributePropertyType", propOrder = {
    "urbanRapidTransitRailroadAttribute"
})
public class UrbanRapidTransitRailroadAttributePropertyType {

    @XmlElement(name = "UrbanRapidTransitRailroadAttribute", required = true)
    protected UrbanRapidTransitRailroadAttributeType urbanRapidTransitRailroadAttribute;

    /**
     * Gets the value of the urbanRapidTransitRailroadAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanRapidTransitRailroadAttributeType }
     *     
     */
    public UrbanRapidTransitRailroadAttributeType getUrbanRapidTransitRailroadAttribute() {
        return urbanRapidTransitRailroadAttribute;
    }

    /**
     * Sets the value of the urbanRapidTransitRailroadAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanRapidTransitRailroadAttributeType }
     *     
     */
    public void setUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttributeType value) {
        this.urbanRapidTransitRailroadAttribute = value;
    }

    public boolean isSetUrbanRapidTransitRailroadAttribute() {
        return (this.urbanRapidTransitRailroadAttribute!= null);
    }

}
