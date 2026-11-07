//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakdownOfNominalAreaPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakdownOfNominalAreaPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.1}BreakdownOfNominalArea"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownOfNominalAreaPropertyType", propOrder = {
    "breakdownOfNominalArea"
})
public class BreakdownOfNominalAreaPropertyType {

    @XmlElement(name = "BreakdownOfNominalArea", required = true)
    protected BreakdownOfNominalAreaType breakdownOfNominalArea;

    /**
     * Gets the value of the breakdownOfNominalArea property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownOfNominalAreaType }
     *     
     */
    public BreakdownOfNominalAreaType getBreakdownOfNominalArea() {
        return breakdownOfNominalArea;
    }

    /**
     * Sets the value of the breakdownOfNominalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownOfNominalAreaType }
     *     
     */
    public void setBreakdownOfNominalArea(BreakdownOfNominalAreaType value) {
        this.breakdownOfNominalArea = value;
    }

    public boolean isSetBreakdownOfNominalArea() {
        return (this.breakdownOfNominalArea!= null);
    }

}
