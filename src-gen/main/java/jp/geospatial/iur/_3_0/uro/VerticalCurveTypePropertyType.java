//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalCurveTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalCurveTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}VerticalCurveType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCurveTypePropertyType", propOrder = {
    "verticalCurveType"
})
public class VerticalCurveTypePropertyType {

    @XmlElement(name = "VerticalCurveType", required = true)
    protected VerticalCurveTypeType verticalCurveType;

    /**
     * Gets the value of the verticalCurveType property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCurveTypeType }
     *     
     */
    public VerticalCurveTypeType getVerticalCurveType() {
        return verticalCurveType;
    }

    /**
     * Sets the value of the verticalCurveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCurveTypeType }
     *     
     */
    public void setVerticalCurveType(VerticalCurveTypeType value) {
        this.verticalCurveType = value;
    }

    public boolean isSetVerticalCurveType() {
        return (this.verticalCurveType!= null);
    }

}
