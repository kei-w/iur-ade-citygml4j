//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for IndoorTacatileTileAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndoorTacatileTileAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IndoorAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="roof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorTacatileTileAttributeType", propOrder = {
    "startNode",
    "endNode",
    "category",
    "roof",
    "floorId"
})
public class IndoorTacatileTileAttributeType
    extends IndoorAttributeType
{

    protected String startNode;
    protected String endNode;
    protected CodeType category;
    protected String roof;
    protected String floorId;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCategory(CodeType value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the roof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoof() {
        return roof;
    }

    /**
     * Sets the value of the roof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoof(String value) {
        this.roof = value;
    }

    public boolean isSetRoof() {
        return (this.roof!= null);
    }

    /**
     * Gets the value of the floorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorId() {
        return floorId;
    }

    /**
     * Sets the value of the floorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorId(String value) {
        this.floorId = value;
    }

    public boolean isSetFloorId() {
        return (this.floorId!= null);
    }

}
