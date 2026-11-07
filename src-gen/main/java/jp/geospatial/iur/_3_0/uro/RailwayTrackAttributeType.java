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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.GeometricComplexPropertyType;


/**
 * <p>Java class for RailwayTrackAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailwayTrackAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directionType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="trackType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="startPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alignmentType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="lod2Network" type="{http://www.opengis.net/gml}GeometricComplexPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod3Network" type="{http://www.opengis.net/gml}GeometricComplexPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="controlPoint" type="{https://www.geospatial.jp/iur/uro/3.0}ControlPointPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailwayTrackAttributeType", propOrder = {
    "routeName",
    "directionType",
    "trackType",
    "startPost",
    "endPost",
    "alignmentType",
    "lod2Network",
    "lod3Network",
    "controlPoint"
})
public class RailwayTrackAttributeType {

    protected String routeName;
    protected CodeType directionType;
    protected CodeType trackType;
    protected String startPost;
    protected String endPost;
    protected CodeType alignmentType;
    protected GeometricComplexPropertyType lod2Network;
    protected GeometricComplexPropertyType lod3Network;
    protected List<ControlPointPropertyType> controlPoint;

    /**
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    public boolean isSetRouteName() {
        return (this.routeName!= null);
    }

    /**
     * Gets the value of the directionType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDirectionType() {
        return directionType;
    }

    /**
     * Sets the value of the directionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDirectionType(CodeType value) {
        this.directionType = value;
    }

    public boolean isSetDirectionType() {
        return (this.directionType!= null);
    }

    /**
     * Gets the value of the trackType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTrackType() {
        return trackType;
    }

    /**
     * Sets the value of the trackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTrackType(CodeType value) {
        this.trackType = value;
    }

    public boolean isSetTrackType() {
        return (this.trackType!= null);
    }

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
     * Gets the value of the alignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAlignmentType() {
        return alignmentType;
    }

    /**
     * Sets the value of the alignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAlignmentType(CodeType value) {
        this.alignmentType = value;
    }

    public boolean isSetAlignmentType() {
        return (this.alignmentType!= null);
    }

    /**
     * Gets the value of the lod2Network property.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexPropertyType }
     *     
     */
    public GeometricComplexPropertyType getLod2Network() {
        return lod2Network;
    }

    /**
     * Sets the value of the lod2Network property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexPropertyType }
     *     
     */
    public void setLod2Network(GeometricComplexPropertyType value) {
        this.lod2Network = value;
    }

    public boolean isSetLod2Network() {
        return (this.lod2Network!= null);
    }

    /**
     * Gets the value of the lod3Network property.
     * 
     * @return
     *     possible object is
     *     {@link GeometricComplexPropertyType }
     *     
     */
    public GeometricComplexPropertyType getLod3Network() {
        return lod3Network;
    }

    /**
     * Sets the value of the lod3Network property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometricComplexPropertyType }
     *     
     */
    public void setLod3Network(GeometricComplexPropertyType value) {
        this.lod3Network = value;
    }

    public boolean isSetLod3Network() {
        return (this.lod3Network!= null);
    }

    /**
     * Gets the value of the controlPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlPointPropertyType }
     * 
     * 
     */
    public List<ControlPointPropertyType> getControlPoint() {
        if (controlPoint == null) {
            controlPoint = new ArrayList<ControlPointPropertyType>();
        }
        return this.controlPoint;
    }

    public boolean isSetControlPoint() {
        return ((this.controlPoint!= null)&&(!this.controlPoint.isEmpty()));
    }

    public void unsetControlPoint() {
        this.controlPoint = null;
    }

}
