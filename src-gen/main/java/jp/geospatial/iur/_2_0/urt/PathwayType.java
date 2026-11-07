//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:49:19 JST 2026
//


package jp.geospatial.iur._2_0.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for PathwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PathwayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/2.0}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="isBidirectional" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="traversalTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="stairCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="maxSlope" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="signpostedAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversedSignpostedAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{https://www.geospatial.jp/iur/urt/2.0}StopPropertyType"/&gt;
 *         &lt;element name="to" type="{https://www.geospatial.jp/iur/urt/2.0}StopPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathwayType", propOrder = {
    "mode",
    "isBidirectional",
    "length",
    "traversalTime",
    "stairCount",
    "maxSlope",
    "minWidth",
    "signpostedAs",
    "reversedSignpostedAs",
    "from",
    "to"
})
public class PathwayType
    extends PublicTransitType
{

    protected CodeType mode;
    @XmlElement(required = true)
    protected CodeType isBidirectional;
    protected LengthType length;
    protected BigInteger traversalTime;
    protected BigInteger stairCount;
    protected Double maxSlope;
    protected Double minWidth;
    protected String signpostedAs;
    protected String reversedSignpostedAs;
    @XmlElement(required = true)
    protected StopPropertyType from;
    @XmlElement(required = true)
    protected StopPropertyType to;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMode(CodeType value) {
        this.mode = value;
    }

    public boolean isSetMode() {
        return (this.mode!= null);
    }

    /**
     * Gets the value of the isBidirectional property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIsBidirectional() {
        return isBidirectional;
    }

    /**
     * Sets the value of the isBidirectional property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIsBidirectional(CodeType value) {
        this.isBidirectional = value;
    }

    public boolean isSetIsBidirectional() {
        return (this.isBidirectional!= null);
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
     * Gets the value of the traversalTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTraversalTime() {
        return traversalTime;
    }

    /**
     * Sets the value of the traversalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTraversalTime(BigInteger value) {
        this.traversalTime = value;
    }

    public boolean isSetTraversalTime() {
        return (this.traversalTime!= null);
    }

    /**
     * Gets the value of the stairCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStairCount() {
        return stairCount;
    }

    /**
     * Sets the value of the stairCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStairCount(BigInteger value) {
        this.stairCount = value;
    }

    public boolean isSetStairCount() {
        return (this.stairCount!= null);
    }

    /**
     * Gets the value of the maxSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxSlope() {
        return maxSlope;
    }

    /**
     * Sets the value of the maxSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxSlope(Double value) {
        this.maxSlope = value;
    }

    public boolean isSetMaxSlope() {
        return (this.maxSlope!= null);
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinWidth(Double value) {
        this.minWidth = value;
    }

    public boolean isSetMinWidth() {
        return (this.minWidth!= null);
    }

    /**
     * Gets the value of the signpostedAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignpostedAs() {
        return signpostedAs;
    }

    /**
     * Sets the value of the signpostedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignpostedAs(String value) {
        this.signpostedAs = value;
    }

    public boolean isSetSignpostedAs() {
        return (this.signpostedAs!= null);
    }

    /**
     * Gets the value of the reversedSignpostedAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversedSignpostedAs() {
        return reversedSignpostedAs;
    }

    /**
     * Sets the value of the reversedSignpostedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversedSignpostedAs(String value) {
        this.reversedSignpostedAs = value;
    }

    public boolean isSetReversedSignpostedAs() {
        return (this.reversedSignpostedAs!= null);
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setFrom(StopPropertyType value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setTo(StopPropertyType value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
    }

}
