//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for WaterwayDetailAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterwayDetailAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="routeDirection" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="minimumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="navigation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plannedDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="speedLimit" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="targetShipType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterwayDetailAttributeType", propOrder = {
    "routeId",
    "routeDirection",
    "minimumWidth",
    "maximumWidth",
    "length",
    "navigation",
    "plannedDepth",
    "speedLimit",
    "targetShipType"
})
public class WaterwayDetailAttributeType {

    @XmlElement(required = true)
    protected String routeId;
    protected CodeType routeDirection;
    protected LengthType minimumWidth;
    protected LengthType maximumWidth;
    protected LengthType length;
    protected String navigation;
    protected LengthType plannedDepth;
    protected MeasureType speedLimit;
    protected List<String> targetShipType;

    /**
     * Gets the value of the routeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * Sets the value of the routeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteId(String value) {
        this.routeId = value;
    }

    public boolean isSetRouteId() {
        return (this.routeId!= null);
    }

    /**
     * Gets the value of the routeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRouteDirection() {
        return routeDirection;
    }

    /**
     * Sets the value of the routeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRouteDirection(CodeType value) {
        this.routeDirection = value;
    }

    public boolean isSetRouteDirection() {
        return (this.routeDirection!= null);
    }

    /**
     * Gets the value of the minimumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumWidth() {
        return minimumWidth;
    }

    /**
     * Sets the value of the minimumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumWidth(LengthType value) {
        this.minimumWidth = value;
    }

    public boolean isSetMinimumWidth() {
        return (this.minimumWidth!= null);
    }

    /**
     * Gets the value of the maximumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumWidth() {
        return maximumWidth;
    }

    /**
     * Sets the value of the maximumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumWidth(LengthType value) {
        this.maximumWidth = value;
    }

    public boolean isSetMaximumWidth() {
        return (this.maximumWidth!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the navigation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigation() {
        return navigation;
    }

    /**
     * Sets the value of the navigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigation(String value) {
        this.navigation = value;
    }

    public boolean isSetNavigation() {
        return (this.navigation!= null);
    }

    /**
     * Gets the value of the plannedDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPlannedDepth() {
        return plannedDepth;
    }

    /**
     * Sets the value of the plannedDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPlannedDepth(LengthType value) {
        this.plannedDepth = value;
    }

    public boolean isSetPlannedDepth() {
        return (this.plannedDepth!= null);
    }

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeedLimit(MeasureType value) {
        this.speedLimit = value;
    }

    public boolean isSetSpeedLimit() {
        return (this.speedLimit!= null);
    }

    /**
     * Gets the value of the targetShipType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetShipType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetShipType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetShipType() {
        if (targetShipType == null) {
            targetShipType = new ArrayList<String>();
        }
        return this.targetShipType;
    }

    public boolean isSetTargetShipType() {
        return ((this.targetShipType!= null)&&(!this.targetShipType.isEmpty()));
    }

    public void unsetTargetShipType() {
        this.targetShipType = null;
    }

}
