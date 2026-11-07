//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcBuildingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcBuildingElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="predefinedType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="shapeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRiser" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfTreads" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="riserHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="treadLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="operationType" type="{https://www.geospatial.jp/iur/uro/3.0}IfcTransportElementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="capacityByWeight" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="capacityByNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcBuildingElementType", propOrder = {
    "elementType",
    "predefinedType",
    "shapeType",
    "numberOfRiser",
    "numberOfTreads",
    "riserHeight",
    "treadLength",
    "operationType",
    "capacityByWeight",
    "capacityByNumber"
})
@XmlSeeAlso({
    IfcWallType.class,
    IfcCurtainWallType.class,
    IfcRoofType.class,
    IfcWindowType.class,
    IfcDoorType.class
})
public class IfcBuildingElementType
    extends IfcElementType
{

    protected CodeType elementType;
    protected CodeType predefinedType;
    protected CodeType shapeType;
    protected BigInteger numberOfRiser;
    protected BigInteger numberOfTreads;
    protected LengthType riserHeight;
    protected LengthType treadLength;
    @XmlSchemaType(name = "string")
    protected IfcTransportElementTypeEnum operationType;
    protected MeasureType capacityByWeight;
    protected BigInteger capacityByNumber;

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setElementType(CodeType value) {
        this.elementType = value;
    }

    public boolean isSetElementType() {
        return (this.elementType!= null);
    }

    /**
     * Gets the value of the predefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPredefinedType() {
        return predefinedType;
    }

    /**
     * Sets the value of the predefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPredefinedType(CodeType value) {
        this.predefinedType = value;
    }

    public boolean isSetPredefinedType() {
        return (this.predefinedType!= null);
    }

    /**
     * Gets the value of the shapeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getShapeType() {
        return shapeType;
    }

    /**
     * Sets the value of the shapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setShapeType(CodeType value) {
        this.shapeType = value;
    }

    public boolean isSetShapeType() {
        return (this.shapeType!= null);
    }

    /**
     * Gets the value of the numberOfRiser property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRiser() {
        return numberOfRiser;
    }

    /**
     * Sets the value of the numberOfRiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRiser(BigInteger value) {
        this.numberOfRiser = value;
    }

    public boolean isSetNumberOfRiser() {
        return (this.numberOfRiser!= null);
    }

    /**
     * Gets the value of the numberOfTreads property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTreads() {
        return numberOfTreads;
    }

    /**
     * Sets the value of the numberOfTreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTreads(BigInteger value) {
        this.numberOfTreads = value;
    }

    public boolean isSetNumberOfTreads() {
        return (this.numberOfTreads!= null);
    }

    /**
     * Gets the value of the riserHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRiserHeight() {
        return riserHeight;
    }

    /**
     * Sets the value of the riserHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRiserHeight(LengthType value) {
        this.riserHeight = value;
    }

    public boolean isSetRiserHeight() {
        return (this.riserHeight!= null);
    }

    /**
     * Gets the value of the treadLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getTreadLength() {
        return treadLength;
    }

    /**
     * Sets the value of the treadLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setTreadLength(LengthType value) {
        this.treadLength = value;
    }

    public boolean isSetTreadLength() {
        return (this.treadLength!= null);
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link IfcTransportElementTypeEnum }
     *     
     */
    public IfcTransportElementTypeEnum getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcTransportElementTypeEnum }
     *     
     */
    public void setOperationType(IfcTransportElementTypeEnum value) {
        this.operationType = value;
    }

    public boolean isSetOperationType() {
        return (this.operationType!= null);
    }

    /**
     * Gets the value of the capacityByWeight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getCapacityByWeight() {
        return capacityByWeight;
    }

    /**
     * Sets the value of the capacityByWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setCapacityByWeight(MeasureType value) {
        this.capacityByWeight = value;
    }

    public boolean isSetCapacityByWeight() {
        return (this.capacityByWeight!= null);
    }

    /**
     * Gets the value of the capacityByNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacityByNumber() {
        return capacityByNumber;
    }

    /**
     * Sets the value of the capacityByNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacityByNumber(BigInteger value) {
        this.capacityByNumber = value;
    }

    public boolean isSetCapacityByNumber() {
        return (this.capacityByNumber!= null);
    }

}
