//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for ControlPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="parameter" type="{https://www.geospatial.jp/iur/uro/3.2}ControlPointTypePropertyType"/&gt;
 *         &lt;element name="startPoint" type="{http://www.opengis.net/gml}PointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="endPoint" type="{http://www.opengis.net/gml}PointPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlPointType", propOrder = {
    "startPost",
    "endPost",
    "function",
    "parameter",
    "startPoint",
    "endPoint"
})
public class ControlPointType {

    protected String startPost;
    protected String endPost;
    @XmlElement(required = true)
    protected CodeType function;
    @XmlElement(required = true)
    protected ControlPointTypePropertyType parameter;
    protected PointPropertyType startPoint;
    protected PointPropertyType endPoint;

    /**
     * Gets the value of the startPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPost() {
        return startPost;
    }

    /**
     * Sets the value of the startPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPost(String value) {
        this.startPost = value;
    }

    public boolean isSetStartPost() {
        return (this.startPost!= null);
    }

    /**
     * Gets the value of the endPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPost() {
        return endPost;
    }

    /**
     * Sets the value of the endPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPost(String value) {
        this.endPost = value;
    }

    public boolean isSetEndPost() {
        return (this.endPost!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFunction(CodeType value) {
        this.function = value;
    }

    public boolean isSetFunction() {
        return (this.function!= null);
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link ControlPointTypePropertyType }
     *     
     */
    public ControlPointTypePropertyType getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlPointTypePropertyType }
     *     
     */
    public void setParameter(ControlPointTypePropertyType value) {
        this.parameter = value;
    }

    public boolean isSetParameter() {
        return (this.parameter!= null);
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setStartPoint(PointPropertyType value) {
        this.startPoint = value;
    }

    public boolean isSetStartPoint() {
        return (this.startPoint!= null);
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setEndPoint(PointPropertyType value) {
        this.endPoint = value;
    }

    public boolean isSetEndPoint() {
        return (this.endPoint!= null);
    }

}
