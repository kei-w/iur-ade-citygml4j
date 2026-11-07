//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for RiverFacilityIdAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiverFacilityIdAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}FacilityIdAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="riverCode" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="riverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sideType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="leftPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="leftDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="leftStartPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="leftStartDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="leftEndPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="leftEndDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightStartPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightStartDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightEndPost" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="rightEndDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiverFacilityIdAttributeType", propOrder = {
    "riverCode",
    "riverName",
    "sideType",
    "leftPost",
    "leftDistance",
    "rightPost",
    "rightDistance",
    "leftStartPost",
    "leftStartDistance",
    "leftEndPost",
    "leftEndDistance",
    "rightStartPost",
    "rightStartDistance",
    "rightEndPost",
    "rightEndDistance"
})
public class RiverFacilityIdAttributeType
    extends FacilityIdAttributeType
{

    @XmlElement(required = true)
    protected CodeType riverCode;
    protected String riverName;
    @XmlElement(required = true)
    protected CodeType sideType;
    protected LengthType leftPost;
    protected LengthType leftDistance;
    protected LengthType rightPost;
    protected LengthType rightDistance;
    protected LengthType leftStartPost;
    protected LengthType leftStartDistance;
    protected LengthType leftEndPost;
    protected LengthType leftEndDistance;
    protected LengthType rightStartPost;
    protected LengthType rightStartDistance;
    protected LengthType rightEndPost;
    protected LengthType rightEndDistance;

    /**
     * Gets the value of the riverCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRiverCode() {
        return riverCode;
    }

    /**
     * Sets the value of the riverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRiverCode(CodeType value) {
        this.riverCode = value;
    }

    public boolean isSetRiverCode() {
        return (this.riverCode!= null);
    }

    /**
     * Gets the value of the riverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiverName() {
        return riverName;
    }

    /**
     * Sets the value of the riverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiverName(String value) {
        this.riverName = value;
    }

    public boolean isSetRiverName() {
        return (this.riverName!= null);
    }

    /**
     * Gets the value of the sideType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSideType() {
        return sideType;
    }

    /**
     * Sets the value of the sideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSideType(CodeType value) {
        this.sideType = value;
    }

    public boolean isSetSideType() {
        return (this.sideType!= null);
    }

    /**
     * Gets the value of the leftPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftPost() {
        return leftPost;
    }

    /**
     * Sets the value of the leftPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftPost(LengthType value) {
        this.leftPost = value;
    }

    public boolean isSetLeftPost() {
        return (this.leftPost!= null);
    }

    /**
     * Gets the value of the leftDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftDistance() {
        return leftDistance;
    }

    /**
     * Sets the value of the leftDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftDistance(LengthType value) {
        this.leftDistance = value;
    }

    public boolean isSetLeftDistance() {
        return (this.leftDistance!= null);
    }

    /**
     * Gets the value of the rightPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightPost() {
        return rightPost;
    }

    /**
     * Sets the value of the rightPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightPost(LengthType value) {
        this.rightPost = value;
    }

    public boolean isSetRightPost() {
        return (this.rightPost!= null);
    }

    /**
     * Gets the value of the rightDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightDistance() {
        return rightDistance;
    }

    /**
     * Sets the value of the rightDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightDistance(LengthType value) {
        this.rightDistance = value;
    }

    public boolean isSetRightDistance() {
        return (this.rightDistance!= null);
    }

    /**
     * Gets the value of the leftStartPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftStartPost() {
        return leftStartPost;
    }

    /**
     * Sets the value of the leftStartPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftStartPost(LengthType value) {
        this.leftStartPost = value;
    }

    public boolean isSetLeftStartPost() {
        return (this.leftStartPost!= null);
    }

    /**
     * Gets the value of the leftStartDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftStartDistance() {
        return leftStartDistance;
    }

    /**
     * Sets the value of the leftStartDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftStartDistance(LengthType value) {
        this.leftStartDistance = value;
    }

    public boolean isSetLeftStartDistance() {
        return (this.leftStartDistance!= null);
    }

    /**
     * Gets the value of the leftEndPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftEndPost() {
        return leftEndPost;
    }

    /**
     * Sets the value of the leftEndPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftEndPost(LengthType value) {
        this.leftEndPost = value;
    }

    public boolean isSetLeftEndPost() {
        return (this.leftEndPost!= null);
    }

    /**
     * Gets the value of the leftEndDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLeftEndDistance() {
        return leftEndDistance;
    }

    /**
     * Sets the value of the leftEndDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLeftEndDistance(LengthType value) {
        this.leftEndDistance = value;
    }

    public boolean isSetLeftEndDistance() {
        return (this.leftEndDistance!= null);
    }

    /**
     * Gets the value of the rightStartPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightStartPost() {
        return rightStartPost;
    }

    /**
     * Sets the value of the rightStartPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightStartPost(LengthType value) {
        this.rightStartPost = value;
    }

    public boolean isSetRightStartPost() {
        return (this.rightStartPost!= null);
    }

    /**
     * Gets the value of the rightStartDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightStartDistance() {
        return rightStartDistance;
    }

    /**
     * Sets the value of the rightStartDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightStartDistance(LengthType value) {
        this.rightStartDistance = value;
    }

    public boolean isSetRightStartDistance() {
        return (this.rightStartDistance!= null);
    }

    /**
     * Gets the value of the rightEndPost property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightEndPost() {
        return rightEndPost;
    }

    /**
     * Sets the value of the rightEndPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightEndPost(LengthType value) {
        this.rightEndPost = value;
    }

    public boolean isSetRightEndPost() {
        return (this.rightEndPost!= null);
    }

    /**
     * Gets the value of the rightEndDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRightEndDistance() {
        return rightEndDistance;
    }

    /**
     * Sets the value of the rightEndDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRightEndDistance(LengthType value) {
        this.rightEndDistance = value;
    }

    public boolean isSetRightEndDistance() {
        return (this.rightEndDistance!= null);
    }

}
