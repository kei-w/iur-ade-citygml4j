//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for HarborFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HarborFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geologicalType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="obstructingStructures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="structuralLimitations" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="plannedDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="currentDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="isDredged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="areaType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="innerArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="outerArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="subsidy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HarborFacilityType", propOrder = {
    "geologicalType",
    "obstructingStructures",
    "structuralLimitations",
    "length",
    "minimumWidth",
    "maximumWidth",
    "plannedDepth",
    "currentDepth",
    "isDredged",
    "areaType",
    "innerArea",
    "outerArea",
    "totalCost",
    "subsidy",
    "note"
})
public class HarborFacilityType
    extends PortAttributeType
{

    protected CodeType geologicalType;
    protected String obstructingStructures;
    protected LengthType structuralLimitations;
    protected LengthType length;
    protected LengthType minimumWidth;
    protected LengthType maximumWidth;
    protected LengthType plannedDepth;
    protected LengthType currentDepth;
    protected Boolean isDredged;
    protected CodeType areaType;
    protected MeasureType innerArea;
    protected MeasureType outerArea;
    protected BigInteger totalCost;
    protected BigInteger subsidy;
    protected List<String> note;

    /**
     * Gets the value of the geologicalType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGeologicalType() {
        return geologicalType;
    }

    /**
     * Sets the value of the geologicalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGeologicalType(CodeType value) {
        this.geologicalType = value;
    }

    public boolean isSetGeologicalType() {
        return (this.geologicalType!= null);
    }

    /**
     * Gets the value of the obstructingStructures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObstructingStructures() {
        return obstructingStructures;
    }

    /**
     * Sets the value of the obstructingStructures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObstructingStructures(String value) {
        this.obstructingStructures = value;
    }

    public boolean isSetObstructingStructures() {
        return (this.obstructingStructures!= null);
    }

    /**
     * Gets the value of the structuralLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getStructuralLimitations() {
        return structuralLimitations;
    }

    /**
     * Sets the value of the structuralLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setStructuralLimitations(LengthType value) {
        this.structuralLimitations = value;
    }

    public boolean isSetStructuralLimitations() {
        return (this.structuralLimitations!= null);
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
     * Gets the value of the currentDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCurrentDepth() {
        return currentDepth;
    }

    /**
     * Sets the value of the currentDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCurrentDepth(LengthType value) {
        this.currentDepth = value;
    }

    public boolean isSetCurrentDepth() {
        return (this.currentDepth!= null);
    }

    /**
     * Gets the value of the isDredged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDredged() {
        return isDredged;
    }

    /**
     * Sets the value of the isDredged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDredged(Boolean value) {
        this.isDredged = value;
    }

    public boolean isSetIsDredged() {
        return (this.isDredged!= null);
    }

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaType(CodeType value) {
        this.areaType = value;
    }

    public boolean isSetAreaType() {
        return (this.areaType!= null);
    }

    /**
     * Gets the value of the innerArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInnerArea() {
        return innerArea;
    }

    /**
     * Sets the value of the innerArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInnerArea(MeasureType value) {
        this.innerArea = value;
    }

    public boolean isSetInnerArea() {
        return (this.innerArea!= null);
    }

    /**
     * Gets the value of the outerArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getOuterArea() {
        return outerArea;
    }

    /**
     * Sets the value of the outerArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setOuterArea(MeasureType value) {
        this.outerArea = value;
    }

    public boolean isSetOuterArea() {
        return (this.outerArea!= null);
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost(BigInteger value) {
        this.totalCost = value;
    }

    public boolean isSetTotalCost() {
        return (this.totalCost!= null);
    }

    /**
     * Gets the value of the subsidy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubsidy() {
        return subsidy;
    }

    /**
     * Sets the value of the subsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubsidy(BigInteger value) {
        this.subsidy = value;
    }

    public boolean isSetSubsidy() {
        return (this.subsidy!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNote() {
        if (note == null) {
            note = new ArrayList<String>();
        }
        return this.note;
    }

    public boolean isSetNote() {
        return ((this.note!= null)&&(!this.note.isEmpty()));
    }

    public void unsetNote() {
        this.note = null;
    }

}
