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
import net.opengis.gml.LengthType;


/**
 * 第3.2版修正
 * 
 * <p>Java class for CircularCurveTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CircularCurveTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="radius" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="intersection" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cutLength" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *         &lt;element name="curveLength" type="{http://www.opengis.net/gml}LengthType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircularCurveTypeType", propOrder = {
    "radius",
    "intersection",
    "cutLength",
    "curveLength"
})
public class CircularCurveTypeType {

    @XmlElement(required = true)
    protected LengthType radius;
    protected double intersection;
    @XmlElement(required = true)
    protected LengthType cutLength;
    @XmlElement(required = true)
    protected LengthType curveLength;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    public boolean isSetRadius() {
        return (this.radius!= null);
    }

    /**
     * Gets the value of the intersection property.
     * 
     */
    public double getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     */
    public void setIntersection(double value) {
        this.intersection = value;
    }

    public boolean isSetIntersection() {
        return true;
    }

    /**
     * Gets the value of the cutLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCutLength() {
        return cutLength;
    }

    /**
     * Sets the value of the cutLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCutLength(LengthType value) {
        this.cutLength = value;
    }

    public boolean isSetCutLength() {
        return (this.cutLength!= null);
    }

    /**
     * Gets the value of the curveLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCurveLength() {
        return curveLength;
    }

    /**
     * Sets the value of the curveLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCurveLength(LengthType value) {
        this.curveLength = value;
    }

    public boolean isSetCurveLength() {
        return (this.curveLength!= null);
    }

}
