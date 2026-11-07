//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcWallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcWallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcBuildingElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nominalLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="nominalWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="nominalHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="grossFootPrintArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netFootPrintArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossSideArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netSideArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossSideAreaLeft" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netSideAreaLeft" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossSideAreaRight" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netSideAreaRight" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossVolume" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netVolume" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcWallType", propOrder = {
    "nominalLength",
    "nominalWidth",
    "nominalHeight",
    "grossFootPrintArea",
    "netFootPrintArea",
    "grossSideArea",
    "netSideArea",
    "grossSideAreaLeft",
    "netSideAreaLeft",
    "grossSideAreaRight",
    "netSideAreaRight",
    "grossVolume",
    "netVolume"
})
@XmlSeeAlso({
    IfcWallStandardCaseType.class
})
public class IfcWallType
    extends IfcBuildingElementType
{

    protected LengthType nominalLength;
    protected LengthType nominalWidth;
    protected LengthType nominalHeight;
    protected MeasureType grossFootPrintArea;
    protected MeasureType netFootPrintArea;
    protected MeasureType grossSideArea;
    protected MeasureType netSideArea;
    protected MeasureType grossSideAreaLeft;
    protected MeasureType netSideAreaLeft;
    protected MeasureType grossSideAreaRight;
    protected MeasureType netSideAreaRight;
    protected MeasureType grossVolume;
    protected MeasureType netVolume;

    /**
     * Gets the value of the nominalLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getNominalLength() {
        return nominalLength;
    }

    /**
     * Sets the value of the nominalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setNominalLength(LengthType value) {
        this.nominalLength = value;
    }

    public boolean isSetNominalLength() {
        return (this.nominalLength!= null);
    }

    /**
     * Gets the value of the nominalWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getNominalWidth() {
        return nominalWidth;
    }

    /**
     * Sets the value of the nominalWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setNominalWidth(LengthType value) {
        this.nominalWidth = value;
    }

    public boolean isSetNominalWidth() {
        return (this.nominalWidth!= null);
    }

    /**
     * Gets the value of the nominalHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getNominalHeight() {
        return nominalHeight;
    }

    /**
     * Sets the value of the nominalHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setNominalHeight(LengthType value) {
        this.nominalHeight = value;
    }

    public boolean isSetNominalHeight() {
        return (this.nominalHeight!= null);
    }

    /**
     * Gets the value of the grossFootPrintArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossFootPrintArea() {
        return grossFootPrintArea;
    }

    /**
     * Sets the value of the grossFootPrintArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossFootPrintArea(MeasureType value) {
        this.grossFootPrintArea = value;
    }

    public boolean isSetGrossFootPrintArea() {
        return (this.grossFootPrintArea!= null);
    }

    /**
     * Gets the value of the netFootPrintArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetFootPrintArea() {
        return netFootPrintArea;
    }

    /**
     * Sets the value of the netFootPrintArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetFootPrintArea(MeasureType value) {
        this.netFootPrintArea = value;
    }

    public boolean isSetNetFootPrintArea() {
        return (this.netFootPrintArea!= null);
    }

    /**
     * Gets the value of the grossSideArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossSideArea() {
        return grossSideArea;
    }

    /**
     * Sets the value of the grossSideArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossSideArea(MeasureType value) {
        this.grossSideArea = value;
    }

    public boolean isSetGrossSideArea() {
        return (this.grossSideArea!= null);
    }

    /**
     * Gets the value of the netSideArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetSideArea() {
        return netSideArea;
    }

    /**
     * Sets the value of the netSideArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetSideArea(MeasureType value) {
        this.netSideArea = value;
    }

    public boolean isSetNetSideArea() {
        return (this.netSideArea!= null);
    }

    /**
     * Gets the value of the grossSideAreaLeft property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossSideAreaLeft() {
        return grossSideAreaLeft;
    }

    /**
     * Sets the value of the grossSideAreaLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossSideAreaLeft(MeasureType value) {
        this.grossSideAreaLeft = value;
    }

    public boolean isSetGrossSideAreaLeft() {
        return (this.grossSideAreaLeft!= null);
    }

    /**
     * Gets the value of the netSideAreaLeft property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetSideAreaLeft() {
        return netSideAreaLeft;
    }

    /**
     * Sets the value of the netSideAreaLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetSideAreaLeft(MeasureType value) {
        this.netSideAreaLeft = value;
    }

    public boolean isSetNetSideAreaLeft() {
        return (this.netSideAreaLeft!= null);
    }

    /**
     * Gets the value of the grossSideAreaRight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossSideAreaRight() {
        return grossSideAreaRight;
    }

    /**
     * Sets the value of the grossSideAreaRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossSideAreaRight(MeasureType value) {
        this.grossSideAreaRight = value;
    }

    public boolean isSetGrossSideAreaRight() {
        return (this.grossSideAreaRight!= null);
    }

    /**
     * Gets the value of the netSideAreaRight property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetSideAreaRight() {
        return netSideAreaRight;
    }

    /**
     * Sets the value of the netSideAreaRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetSideAreaRight(MeasureType value) {
        this.netSideAreaRight = value;
    }

    public boolean isSetNetSideAreaRight() {
        return (this.netSideAreaRight!= null);
    }

    /**
     * Gets the value of the grossVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossVolume() {
        return grossVolume;
    }

    /**
     * Sets the value of the grossVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossVolume(MeasureType value) {
        this.grossVolume = value;
    }

    public boolean isSetGrossVolume() {
        return (this.grossVolume!= null);
    }

    /**
     * Gets the value of the netVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetVolume() {
        return netVolume;
    }

    /**
     * Sets the value of the netVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetVolume(MeasureType value) {
        this.netVolume = value;
    }

    public boolean isSetNetVolume() {
        return (this.netVolume!= null);
    }

}
