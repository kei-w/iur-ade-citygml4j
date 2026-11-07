//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PortWasteTreatmentFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortWasteTreatmentFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="perimeter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="mainPartLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="innerShoreLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="ceilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="waveDissipatorLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="mainMaterial" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="wasteType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="plannedDisposalArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="plannedDisposalAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="receivingCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="shipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfReceivingCapacity" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="subsidy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortWasteTreatmentFacilityType", propOrder = {
    "structureType",
    "perimeter",
    "mainPartLength",
    "innerShoreLength",
    "ceilingHeight",
    "waveDissipatorLength",
    "mainMaterial",
    "wasteType",
    "plannedDisposalArea",
    "plannedDisposalAmount",
    "receivingCapacity",
    "shipType",
    "unitOfReceivingCapacity",
    "acquisitionYear",
    "totalCost",
    "subsidy",
    "note"
})
public class PortWasteTreatmentFacilityType
    extends PortAttributeType
{

    protected CodeType structureType;
    protected LengthType perimeter;
    protected LengthType mainPartLength;
    protected LengthType innerShoreLength;
    protected LengthType ceilingHeight;
    protected LengthType waveDissipatorLength;
    protected CodeType mainMaterial;
    protected CodeType wasteType;
    protected MeasureType plannedDisposalArea;
    protected BigInteger plannedDisposalAmount;
    protected BigInteger receivingCapacity;
    protected String shipType;
    protected CodeType unitOfReceivingCapacity;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar acquisitionYear;
    protected BigInteger totalCost;
    protected BigInteger subsidy;
    protected String note;

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructureType(CodeType value) {
        this.structureType = value;
    }

    public boolean isSetStructureType() {
        return (this.structureType!= null);
    }

    /**
     * Gets the value of the perimeter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPerimeter() {
        return perimeter;
    }

    /**
     * Sets the value of the perimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPerimeter(LengthType value) {
        this.perimeter = value;
    }

    public boolean isSetPerimeter() {
        return (this.perimeter!= null);
    }

    /**
     * Gets the value of the mainPartLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMainPartLength() {
        return mainPartLength;
    }

    /**
     * Sets the value of the mainPartLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMainPartLength(LengthType value) {
        this.mainPartLength = value;
    }

    public boolean isSetMainPartLength() {
        return (this.mainPartLength!= null);
    }

    /**
     * Gets the value of the innerShoreLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerShoreLength() {
        return innerShoreLength;
    }

    /**
     * Sets the value of the innerShoreLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerShoreLength(LengthType value) {
        this.innerShoreLength = value;
    }

    public boolean isSetInnerShoreLength() {
        return (this.innerShoreLength!= null);
    }

    /**
     * Gets the value of the ceilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCeilingHeight() {
        return ceilingHeight;
    }

    /**
     * Sets the value of the ceilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCeilingHeight(LengthType value) {
        this.ceilingHeight = value;
    }

    public boolean isSetCeilingHeight() {
        return (this.ceilingHeight!= null);
    }

    /**
     * Gets the value of the waveDissipatorLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWaveDissipatorLength() {
        return waveDissipatorLength;
    }

    /**
     * Sets the value of the waveDissipatorLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWaveDissipatorLength(LengthType value) {
        this.waveDissipatorLength = value;
    }

    public boolean isSetWaveDissipatorLength() {
        return (this.waveDissipatorLength!= null);
    }

    /**
     * Gets the value of the mainMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMainMaterial() {
        return mainMaterial;
    }

    /**
     * Sets the value of the mainMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMainMaterial(CodeType value) {
        this.mainMaterial = value;
    }

    public boolean isSetMainMaterial() {
        return (this.mainMaterial!= null);
    }

    /**
     * Gets the value of the wasteType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWasteType() {
        return wasteType;
    }

    /**
     * Sets the value of the wasteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWasteType(CodeType value) {
        this.wasteType = value;
    }

    public boolean isSetWasteType() {
        return (this.wasteType!= null);
    }

    /**
     * Gets the value of the plannedDisposalArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPlannedDisposalArea() {
        return plannedDisposalArea;
    }

    /**
     * Sets the value of the plannedDisposalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPlannedDisposalArea(MeasureType value) {
        this.plannedDisposalArea = value;
    }

    public boolean isSetPlannedDisposalArea() {
        return (this.plannedDisposalArea!= null);
    }

    /**
     * Gets the value of the plannedDisposalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlannedDisposalAmount() {
        return plannedDisposalAmount;
    }

    /**
     * Sets the value of the plannedDisposalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlannedDisposalAmount(BigInteger value) {
        this.plannedDisposalAmount = value;
    }

    public boolean isSetPlannedDisposalAmount() {
        return (this.plannedDisposalAmount!= null);
    }

    /**
     * Gets the value of the receivingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReceivingCapacity() {
        return receivingCapacity;
    }

    /**
     * Sets the value of the receivingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReceivingCapacity(BigInteger value) {
        this.receivingCapacity = value;
    }

    public boolean isSetReceivingCapacity() {
        return (this.receivingCapacity!= null);
    }

    /**
     * Gets the value of the shipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * Sets the value of the shipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    public boolean isSetShipType() {
        return (this.shipType!= null);
    }

    /**
     * Gets the value of the unitOfReceivingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUnitOfReceivingCapacity() {
        return unitOfReceivingCapacity;
    }

    /**
     * Sets the value of the unitOfReceivingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUnitOfReceivingCapacity(CodeType value) {
        this.unitOfReceivingCapacity = value;
    }

    public boolean isSetUnitOfReceivingCapacity() {
        return (this.unitOfReceivingCapacity!= null);
    }

    /**
     * Gets the value of the acquisitionYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionYear() {
        return acquisitionYear;
    }

    /**
     * Sets the value of the acquisitionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionYear(XMLGregorianCalendar value) {
        this.acquisitionYear = value;
    }

    public boolean isSetAcquisitionYear() {
        return (this.acquisitionYear!= null);
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

}
