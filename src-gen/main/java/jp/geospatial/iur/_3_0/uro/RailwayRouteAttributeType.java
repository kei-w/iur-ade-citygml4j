//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for RailwayRouteAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailwayRouteAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatorType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alternativeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="railwayType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="startStation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endStation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailwayRouteAttributeType", propOrder = {
    "operatorType",
    "operator",
    "alternativeName",
    "railwayType",
    "startStation",
    "endStation"
})
public class RailwayRouteAttributeType {

    @XmlElement(required = true)
    protected CodeType operatorType;
    @XmlElement(required = true)
    protected String operator;
    protected List<String> alternativeName;
    @XmlElement(required = true)
    protected CodeType railwayType;
    @XmlElement(required = true)
    protected String startStation;
    @XmlElement(required = true)
    protected String endStation;

    /**
     * Gets the value of the operatorType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOperatorType() {
        return operatorType;
    }

    /**
     * Sets the value of the operatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOperatorType(CodeType value) {
        this.operatorType = value;
    }

    public boolean isSetOperatorType() {
        return (this.operatorType!= null);
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    public boolean isSetOperator() {
        return (this.operator!= null);
    }

    /**
     * Gets the value of the alternativeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternativeName() {
        if (alternativeName == null) {
            alternativeName = new ArrayList<String>();
        }
        return this.alternativeName;
    }

    public boolean isSetAlternativeName() {
        return ((this.alternativeName!= null)&&(!this.alternativeName.isEmpty()));
    }

    public void unsetAlternativeName() {
        this.alternativeName = null;
    }

    /**
     * Gets the value of the railwayType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRailwayType() {
        return railwayType;
    }

    /**
     * Sets the value of the railwayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRailwayType(CodeType value) {
        this.railwayType = value;
    }

    public boolean isSetRailwayType() {
        return (this.railwayType!= null);
    }

    /**
     * Gets the value of the startStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStation() {
        return startStation;
    }

    /**
     * Sets the value of the startStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStation(String value) {
        this.startStation = value;
    }

    public boolean isSetStartStation() {
        return (this.startStation!= null);
    }

    /**
     * Gets the value of the endStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndStation() {
        return endStation;
    }

    /**
     * Sets the value of the endStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndStation(String value) {
        this.endStation = value;
    }

    public boolean isSetEndStation() {
        return (this.endStation!= null);
    }

}
