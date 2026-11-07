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
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for BreakdownOfNominalAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BreakdownOfNominalAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="breakdown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="areaInSquareMeter" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownOfNominalAreaType", propOrder = {
    "breakdown",
    "areaInSquareMeter"
})
public class BreakdownOfNominalAreaType {

    @XmlElement(required = true)
    protected String breakdown;
    @XmlElement(required = true)
    protected MeasureType areaInSquareMeter;

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakdown(String value) {
        this.breakdown = value;
    }

    public boolean isSetBreakdown() {
        return (this.breakdown!= null);
    }

    /**
     * Gets the value of the areaInSquareMeter property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaInSquareMeter() {
        return areaInSquareMeter;
    }

    /**
     * Sets the value of the areaInSquareMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaInSquareMeter(MeasureType value) {
        this.areaInSquareMeter = value;
    }

    public boolean isSetAreaInSquareMeter() {
        return (this.areaInSquareMeter!= null);
    }

}
