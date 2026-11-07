//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for SpecialUrbanRenaissanceDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialUrbanRenaissanceDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useToBeInduced" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="maximumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="minimumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="minimumBuildingArea" type="{http://www.opengis.net/gml}MeasureType"/&gt;
 *         &lt;element name="maximumBuildingHeight" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="setbackSize" type="{http://www.opengis.net/gml}StringOrRefType"/&gt;
 *         &lt;element name="otherRestrictions" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialUrbanRenaissanceDistrictType", propOrder = {
    "useToBeInduced",
    "maximumFloorAreaRate",
    "minimumFloorAreaRate",
    "maximumBuildingCoverageRate",
    "minimumBuildingArea",
    "maximumBuildingHeight",
    "setbackSize",
    "otherRestrictions"
})
public class SpecialUrbanRenaissanceDistrictType
    extends DistrictsAndZonesType
{

    @XmlElement(required = true)
    protected StringOrRefType useToBeInduced;
    @XmlElement(required = true)
    protected BigInteger maximumFloorAreaRate;
    @XmlElement(required = true)
    protected BigInteger minimumFloorAreaRate;
    @XmlElement(required = true)
    protected BigInteger maximumBuildingCoverageRate;
    @XmlElement(required = true)
    protected MeasureType minimumBuildingArea;
    @XmlElement(required = true)
    protected StringOrRefType maximumBuildingHeight;
    @XmlElement(required = true)
    protected StringOrRefType setbackSize;
    protected StringOrRefType otherRestrictions;

    /**
     * Gets the value of the useToBeInduced property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getUseToBeInduced() {
        return useToBeInduced;
    }

    /**
     * Sets the value of the useToBeInduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setUseToBeInduced(StringOrRefType value) {
        this.useToBeInduced = value;
    }

    public boolean isSetUseToBeInduced() {
        return (this.useToBeInduced!= null);
    }

    /**
     * Gets the value of the maximumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumFloorAreaRate() {
        return maximumFloorAreaRate;
    }

    /**
     * Sets the value of the maximumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumFloorAreaRate(BigInteger value) {
        this.maximumFloorAreaRate = value;
    }

    public boolean isSetMaximumFloorAreaRate() {
        return (this.maximumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the minimumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumFloorAreaRate() {
        return minimumFloorAreaRate;
    }

    /**
     * Sets the value of the minimumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumFloorAreaRate(BigInteger value) {
        this.minimumFloorAreaRate = value;
    }

    public boolean isSetMinimumFloorAreaRate() {
        return (this.minimumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the maximumBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumBuildingCoverageRate() {
        return maximumBuildingCoverageRate;
    }

    /**
     * Sets the value of the maximumBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumBuildingCoverageRate(BigInteger value) {
        this.maximumBuildingCoverageRate = value;
    }

    public boolean isSetMaximumBuildingCoverageRate() {
        return (this.maximumBuildingCoverageRate!= null);
    }

    /**
     * Gets the value of the minimumBuildingArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumBuildingArea() {
        return minimumBuildingArea;
    }

    /**
     * Sets the value of the minimumBuildingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumBuildingArea(MeasureType value) {
        this.minimumBuildingArea = value;
    }

    public boolean isSetMinimumBuildingArea() {
        return (this.minimumBuildingArea!= null);
    }

    /**
     * Gets the value of the maximumBuildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getMaximumBuildingHeight() {
        return maximumBuildingHeight;
    }

    /**
     * Sets the value of the maximumBuildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setMaximumBuildingHeight(StringOrRefType value) {
        this.maximumBuildingHeight = value;
    }

    public boolean isSetMaximumBuildingHeight() {
        return (this.maximumBuildingHeight!= null);
    }

    /**
     * Gets the value of the setbackSize property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSetbackSize() {
        return setbackSize;
    }

    /**
     * Sets the value of the setbackSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSetbackSize(StringOrRefType value) {
        this.setbackSize = value;
    }

    public boolean isSetSetbackSize() {
        return (this.setbackSize!= null);
    }

    /**
     * Gets the value of the otherRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getOtherRestrictions() {
        return otherRestrictions;
    }

    /**
     * Sets the value of the otherRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setOtherRestrictions(StringOrRefType value) {
        this.otherRestrictions = value;
    }

    public boolean isSetOtherRestrictions() {
        return (this.otherRestrictions!= null);
    }

}
