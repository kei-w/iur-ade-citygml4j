//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 11:13:19 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadDataQualityAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadDataQualityAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/2.0}RoadDataQualityAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadDataQualityAttributePropertyType", propOrder = {
    "roadDataQualityAttribute"
})
public class RoadDataQualityAttributePropertyType {

    @XmlElement(name = "RoadDataQualityAttribute", required = true)
    protected RoadDataQualityAttributeType roadDataQualityAttribute;

    /**
     * Gets the value of the roadDataQualityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link RoadDataQualityAttributeType }
     *     
     */
    public RoadDataQualityAttributeType getRoadDataQualityAttribute() {
        return roadDataQualityAttribute;
    }

    /**
     * Sets the value of the roadDataQualityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadDataQualityAttributeType }
     *     
     */
    public void setRoadDataQualityAttribute(RoadDataQualityAttributeType value) {
        this.roadDataQualityAttribute = value;
    }

    public boolean isSetRoadDataQualityAttribute() {
        return (this.roadDataQualityAttribute!= null);
    }

}
