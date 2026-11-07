//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcPsetSpaceCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetSpaceCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="floorCovering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wallCovering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ceilingCovering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="skirtingBoard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grossPlannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netPlannedArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="publiclyAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="handicapAccessible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="concealedFlooring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="concealedCeiling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetSpaceCommonType", propOrder = {
    "reference",
    "category",
    "floorCovering",
    "wallCovering",
    "ceilingCovering",
    "skirtingBoard",
    "grossPlannedArea",
    "netPlannedArea",
    "publiclyAccessible",
    "handicapAccessible",
    "concealedFlooring",
    "concealedCeiling"
})
public class IfcPsetSpaceCommonType
    extends IfcAttributeType
{

    protected String reference;
    protected String category;
    protected String floorCovering;
    protected String wallCovering;
    protected String ceilingCovering;
    protected String skirtingBoard;
    protected MeasureType grossPlannedArea;
    protected MeasureType netPlannedArea;
    protected Boolean publiclyAccessible;
    protected Boolean handicapAccessible;
    protected Boolean concealedFlooring;
    protected Boolean concealedCeiling;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category!= null);
    }

    /**
     * Gets the value of the floorCovering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorCovering() {
        return floorCovering;
    }

    /**
     * Sets the value of the floorCovering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorCovering(String value) {
        this.floorCovering = value;
    }

    public boolean isSetFloorCovering() {
        return (this.floorCovering!= null);
    }

    /**
     * Gets the value of the wallCovering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWallCovering() {
        return wallCovering;
    }

    /**
     * Sets the value of the wallCovering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWallCovering(String value) {
        this.wallCovering = value;
    }

    public boolean isSetWallCovering() {
        return (this.wallCovering!= null);
    }

    /**
     * Gets the value of the ceilingCovering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeilingCovering() {
        return ceilingCovering;
    }

    /**
     * Sets the value of the ceilingCovering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeilingCovering(String value) {
        this.ceilingCovering = value;
    }

    public boolean isSetCeilingCovering() {
        return (this.ceilingCovering!= null);
    }

    /**
     * Gets the value of the skirtingBoard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkirtingBoard() {
        return skirtingBoard;
    }

    /**
     * Sets the value of the skirtingBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkirtingBoard(String value) {
        this.skirtingBoard = value;
    }

    public boolean isSetSkirtingBoard() {
        return (this.skirtingBoard!= null);
    }

    /**
     * Gets the value of the grossPlannedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossPlannedArea() {
        return grossPlannedArea;
    }

    /**
     * Sets the value of the grossPlannedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossPlannedArea(MeasureType value) {
        this.grossPlannedArea = value;
    }

    public boolean isSetGrossPlannedArea() {
        return (this.grossPlannedArea!= null);
    }

    /**
     * Gets the value of the netPlannedArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetPlannedArea() {
        return netPlannedArea;
    }

    /**
     * Sets the value of the netPlannedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetPlannedArea(MeasureType value) {
        this.netPlannedArea = value;
    }

    public boolean isSetNetPlannedArea() {
        return (this.netPlannedArea!= null);
    }

    /**
     * Gets the value of the publiclyAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * Sets the value of the publiclyAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPubliclyAccessible(Boolean value) {
        this.publiclyAccessible = value;
    }

    public boolean isSetPubliclyAccessible() {
        return (this.publiclyAccessible!= null);
    }

    /**
     * Gets the value of the handicapAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandicapAccessible() {
        return handicapAccessible;
    }

    /**
     * Sets the value of the handicapAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandicapAccessible(Boolean value) {
        this.handicapAccessible = value;
    }

    public boolean isSetHandicapAccessible() {
        return (this.handicapAccessible!= null);
    }

    /**
     * Gets the value of the concealedFlooring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcealedFlooring() {
        return concealedFlooring;
    }

    /**
     * Sets the value of the concealedFlooring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcealedFlooring(Boolean value) {
        this.concealedFlooring = value;
    }

    public boolean isSetConcealedFlooring() {
        return (this.concealedFlooring!= null);
    }

    /**
     * Gets the value of the concealedCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcealedCeiling() {
        return concealedCeiling;
    }

    /**
     * Sets the value of the concealedCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcealedCeiling(Boolean value) {
        this.concealedCeiling = value;
    }

    public boolean isSetConcealedCeiling() {
        return (this.concealedCeiling!= null);
    }

}
