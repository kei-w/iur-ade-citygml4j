//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for TransitionCurveTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitionCurveTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersection" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="distance" type="{http://www.opengis.net/gml}LengthType"/&gt;
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
@XmlType(name = "TransitionCurveTypeType", propOrder = {
    "intersection",
    "distance",
    "curveLength"
})
public class TransitionCurveTypeType {

    @XmlElement(required = true)
    protected MeasureType intersection;
    @XmlElement(required = true)
    protected LengthType distance;
    @XmlElement(required = true)
    protected LengthType curveLength;

    /**
     * Gets the value of the intersection property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setIntersection(MeasureType value) {
        this.intersection = value;
    }

    public boolean isSetIntersection() {
        return (this.intersection!= null);
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDistance(LengthType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
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
