//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MultiPointPropertyType;


/**
 * <p>Java class for ObservationPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lod0MultiPoint" type="{http://www.opengis.net/gml}MultiPointPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationPointType", propOrder = {
    "lod0MultiPoint"
})
public class ObservationPointType {

    @XmlElement(required = true)
    protected MultiPointPropertyType lod0MultiPoint;

    /**
     * Gets the value of the lod0MultiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getLod0MultiPoint() {
        return lod0MultiPoint;
    }

    /**
     * Sets the value of the lod0MultiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setLod0MultiPoint(MultiPointPropertyType value) {
        this.lod0MultiPoint = value;
    }

    public boolean isSetLod0MultiPoint() {
        return (this.lod0MultiPoint!= null);
    }

}
