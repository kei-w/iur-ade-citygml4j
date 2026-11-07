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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for UtilityLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}UtilityNetworkElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeStartNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeEndNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maxDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maxWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="offset" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="material" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="lengthAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}LengthAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityLinkType", propOrder = {
    "routeStartNode",
    "startNode",
    "routeEndNode",
    "endNode",
    "depth",
    "minDepth",
    "maxDepth",
    "maxWidth",
    "offset",
    "material",
    "lengthAttribute"
})
@XmlSeeAlso({
    PipeType.class,
    DuctType.class,
    CableType.class
})
public abstract class UtilityLinkType
    extends UtilityNetworkElementType
{

    protected String routeStartNode;
    protected String startNode;
    protected String routeEndNode;
    protected String endNode;
    protected LengthType depth;
    protected LengthType minDepth;
    protected LengthType maxDepth;
    protected LengthType maxWidth;
    protected LengthType offset;
    protected CodeType material;
    protected List<LengthAttributePropertyType> lengthAttribute;

    /**
     * Gets the value of the routeStartNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteStartNode() {
        return routeStartNode;
    }

    /**
     * Sets the value of the routeStartNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteStartNode(String value) {
        this.routeStartNode = value;
    }

    public boolean isSetRouteStartNode() {
        return (this.routeStartNode!= null);
    }

    /**
     * Gets the value of the startNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNode() {
        return startNode;
    }

    /**
     * Sets the value of the startNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNode(String value) {
        this.startNode = value;
    }

    public boolean isSetStartNode() {
        return (this.startNode!= null);
    }

    /**
     * Gets the value of the routeEndNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteEndNode() {
        return routeEndNode;
    }

    /**
     * Sets the value of the routeEndNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteEndNode(String value) {
        this.routeEndNode = value;
    }

    public boolean isSetRouteEndNode() {
        return (this.routeEndNode!= null);
    }

    /**
     * Gets the value of the endNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNode() {
        return endNode;
    }

    /**
     * Sets the value of the endNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNode(String value) {
        this.endNode = value;
    }

    public boolean isSetEndNode() {
        return (this.endNode!= null);
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDepth(LengthType value) {
        this.depth = value;
    }

    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Gets the value of the minDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinDepth() {
        return minDepth;
    }

    /**
     * Sets the value of the minDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinDepth(LengthType value) {
        this.minDepth = value;
    }

    public boolean isSetMinDepth() {
        return (this.minDepth!= null);
    }

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaxDepth() {
        return maxDepth;
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaxDepth(LengthType value) {
        this.maxDepth = value;
    }

    public boolean isSetMaxDepth() {
        return (this.maxDepth!= null);
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaxWidth(LengthType value) {
        this.maxWidth = value;
    }

    public boolean isSetMaxWidth() {
        return (this.maxWidth!= null);
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOffset(LengthType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaterial(CodeType value) {
        this.material = value;
    }

    public boolean isSetMaterial() {
        return (this.material!= null);
    }

    /**
     * Gets the value of the lengthAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthAttributePropertyType }
     * 
     * 
     */
    public List<LengthAttributePropertyType> getLengthAttribute() {
        if (lengthAttribute == null) {
            lengthAttribute = new ArrayList<LengthAttributePropertyType>();
        }
        return this.lengthAttribute;
    }

    public boolean isSetLengthAttribute() {
        return ((this.lengthAttribute!= null)&&(!this.lengthAttribute.isEmpty()));
    }

    public void unsetLengthAttribute() {
        this.lengthAttribute = null;
    }

}
