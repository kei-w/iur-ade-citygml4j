//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlPointTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlPointTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="circularCurve" type="{https://www.geospatial.jp/iur/uro/3.2}CircularCurveTypePropertyType"/&gt;
 *         &lt;element name="transitionCurve" type="{https://www.geospatial.jp/iur/uro/3.2}TransitionCurveTypePropertyType"/&gt;
 *         &lt;element name="slopeType" type="{https://www.geospatial.jp/iur/uro/3.2}SlopeTypePropertyType"/&gt;
 *         &lt;element name="verticalCurve" type="{https://www.geospatial.jp/iur/uro/3.2}VerticalCurveTypePropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlPointTypeType", propOrder = {
    "circularCurve",
    "transitionCurve",
    "slopeType",
    "verticalCurve"
})
public class ControlPointTypeType {

    protected CircularCurveTypePropertyType circularCurve;
    protected TransitionCurveTypePropertyType transitionCurve;
    protected SlopeTypePropertyType slopeType;
    protected VerticalCurveTypePropertyType verticalCurve;

    /**
     * Gets the value of the circularCurve property.
     * 
     * @return
     *     possible object is
     *     {@link CircularCurveTypePropertyType }
     *     
     */
    public CircularCurveTypePropertyType getCircularCurve() {
        return circularCurve;
    }

    /**
     * Sets the value of the circularCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircularCurveTypePropertyType }
     *     
     */
    public void setCircularCurve(CircularCurveTypePropertyType value) {
        this.circularCurve = value;
    }

    public boolean isSetCircularCurve() {
        return (this.circularCurve!= null);
    }

    /**
     * Gets the value of the transitionCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TransitionCurveTypePropertyType }
     *     
     */
    public TransitionCurveTypePropertyType getTransitionCurve() {
        return transitionCurve;
    }

    /**
     * Sets the value of the transitionCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionCurveTypePropertyType }
     *     
     */
    public void setTransitionCurve(TransitionCurveTypePropertyType value) {
        this.transitionCurve = value;
    }

    public boolean isSetTransitionCurve() {
        return (this.transitionCurve!= null);
    }

    /**
     * Gets the value of the slopeType property.
     * 
     * @return
     *     possible object is
     *     {@link SlopeTypePropertyType }
     *     
     */
    public SlopeTypePropertyType getSlopeType() {
        return slopeType;
    }

    /**
     * Sets the value of the slopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlopeTypePropertyType }
     *     
     */
    public void setSlopeType(SlopeTypePropertyType value) {
        this.slopeType = value;
    }

    public boolean isSetSlopeType() {
        return (this.slopeType!= null);
    }

    /**
     * Gets the value of the verticalCurve property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCurveTypePropertyType }
     *     
     */
    public VerticalCurveTypePropertyType getVerticalCurve() {
        return verticalCurve;
    }

    /**
     * Sets the value of the verticalCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCurveTypePropertyType }
     *     
     */
    public void setVerticalCurve(VerticalCurveTypePropertyType value) {
        this.verticalCurve = value;
    }

    public boolean isSetVerticalCurve() {
        return (this.verticalCurve!= null);
    }

}
