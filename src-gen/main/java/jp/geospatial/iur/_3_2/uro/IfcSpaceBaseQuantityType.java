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
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcSpaceBaseQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSpaceBaseQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nominalHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="clearHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="finishCeilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="grossPerimeter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="netPerimeter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="grossCeilingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netCeilingArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="grossWallArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="netWallArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
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
@XmlType(name = "IfcSpaceBaseQuantityType", propOrder = {
    "nominalHeight",
    "clearHeight",
    "finishCeilingHeight",
    "grossPerimeter",
    "netPerimeter",
    "grossCeilingArea",
    "grossFloorArea",
    "netCeilingArea",
    "netFloorArea",
    "grossWallArea",
    "netWallArea",
    "grossVolume",
    "netVolume"
})
public class IfcSpaceBaseQuantityType
    extends IfcAttributeType
{

    protected LengthType nominalHeight;
    protected LengthType clearHeight;
    protected LengthType finishCeilingHeight;
    protected LengthType grossPerimeter;
    protected LengthType netPerimeter;
    protected MeasureType grossCeilingArea;
    protected MeasureType grossFloorArea;
    protected MeasureType netCeilingArea;
    protected MeasureType netFloorArea;
    protected MeasureType grossWallArea;
    protected MeasureType netWallArea;
    protected MeasureType grossVolume;
    protected MeasureType netVolume;

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
     * Gets the value of the clearHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getClearHeight() {
        return clearHeight;
    }

    /**
     * Sets the value of the clearHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setClearHeight(LengthType value) {
        this.clearHeight = value;
    }

    public boolean isSetClearHeight() {
        return (this.clearHeight!= null);
    }

    /**
     * Gets the value of the finishCeilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getFinishCeilingHeight() {
        return finishCeilingHeight;
    }

    /**
     * Sets the value of the finishCeilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setFinishCeilingHeight(LengthType value) {
        this.finishCeilingHeight = value;
    }

    public boolean isSetFinishCeilingHeight() {
        return (this.finishCeilingHeight!= null);
    }

    /**
     * Gets the value of the grossPerimeter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getGrossPerimeter() {
        return grossPerimeter;
    }

    /**
     * Sets the value of the grossPerimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setGrossPerimeter(LengthType value) {
        this.grossPerimeter = value;
    }

    public boolean isSetGrossPerimeter() {
        return (this.grossPerimeter!= null);
    }

    /**
     * Gets the value of the netPerimeter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getNetPerimeter() {
        return netPerimeter;
    }

    /**
     * Sets the value of the netPerimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setNetPerimeter(LengthType value) {
        this.netPerimeter = value;
    }

    public boolean isSetNetPerimeter() {
        return (this.netPerimeter!= null);
    }

    /**
     * Gets the value of the grossCeilingArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossCeilingArea() {
        return grossCeilingArea;
    }

    /**
     * Sets the value of the grossCeilingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossCeilingArea(MeasureType value) {
        this.grossCeilingArea = value;
    }

    public boolean isSetGrossCeilingArea() {
        return (this.grossCeilingArea!= null);
    }

    /**
     * Gets the value of the grossFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossFloorArea() {
        return grossFloorArea;
    }

    /**
     * Sets the value of the grossFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossFloorArea(MeasureType value) {
        this.grossFloorArea = value;
    }

    public boolean isSetGrossFloorArea() {
        return (this.grossFloorArea!= null);
    }

    /**
     * Gets the value of the netCeilingArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetCeilingArea() {
        return netCeilingArea;
    }

    /**
     * Sets the value of the netCeilingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetCeilingArea(MeasureType value) {
        this.netCeilingArea = value;
    }

    public boolean isSetNetCeilingArea() {
        return (this.netCeilingArea!= null);
    }

    /**
     * Gets the value of the netFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetFloorArea() {
        return netFloorArea;
    }

    /**
     * Sets the value of the netFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetFloorArea(MeasureType value) {
        this.netFloorArea = value;
    }

    public boolean isSetNetFloorArea() {
        return (this.netFloorArea!= null);
    }

    /**
     * Gets the value of the grossWallArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWallArea() {
        return grossWallArea;
    }

    /**
     * Sets the value of the grossWallArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWallArea(MeasureType value) {
        this.grossWallArea = value;
    }

    public boolean isSetGrossWallArea() {
        return (this.grossWallArea!= null);
    }

    /**
     * Gets the value of the netWallArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWallArea() {
        return netWallArea;
    }

    /**
     * Sets the value of the netWallArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWallArea(MeasureType value) {
        this.netWallArea = value;
    }

    public boolean isSetNetWallArea() {
        return (this.netWallArea!= null);
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
