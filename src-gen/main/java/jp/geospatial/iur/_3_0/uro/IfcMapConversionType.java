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
import net.opengis.gml.LengthType;


/**
 * <p>Java class for IfcMapConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcMapConversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceCRS" type="{https://www.geospatial.jp/iur/uro/3.0}IfcCoordinateReferenceSystemSelectType" minOccurs="0"/&gt;
 *         &lt;element name="targetCRS" type="{https://www.geospatial.jp/iur/uro/3.0}IfcCoordinateReferenceSystemPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="eastings" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="northings" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="orthogonalHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="xAxisAbscissa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="xAxisOrdinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcMapConversionType", propOrder = {
    "sourceCRS",
    "targetCRS",
    "eastings",
    "northings",
    "orthogonalHeight",
    "xAxisAbscissa",
    "xAxisOrdinate",
    "scale"
})
public class IfcMapConversionType
    extends IfcAttributeType
{

    protected IfcCoordinateReferenceSystemSelectType sourceCRS;
    protected IfcCoordinateReferenceSystemPropertyType targetCRS;
    protected LengthType eastings;
    protected LengthType northings;
    protected LengthType orthogonalHeight;
    protected Double xAxisAbscissa;
    protected Double xAxisOrdinate;
    protected Double scale;

    /**
     * Gets the value of the sourceCRS property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCoordinateReferenceSystemSelectType }
     *     
     */
    public IfcCoordinateReferenceSystemSelectType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * Sets the value of the sourceCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCoordinateReferenceSystemSelectType }
     *     
     */
    public void setSourceCRS(IfcCoordinateReferenceSystemSelectType value) {
        this.sourceCRS = value;
    }

    public boolean isSetSourceCRS() {
        return (this.sourceCRS!= null);
    }

    /**
     * Gets the value of the targetCRS property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCoordinateReferenceSystemPropertyType }
     *     
     */
    public IfcCoordinateReferenceSystemPropertyType getTargetCRS() {
        return targetCRS;
    }

    /**
     * Sets the value of the targetCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCoordinateReferenceSystemPropertyType }
     *     
     */
    public void setTargetCRS(IfcCoordinateReferenceSystemPropertyType value) {
        this.targetCRS = value;
    }

    public boolean isSetTargetCRS() {
        return (this.targetCRS!= null);
    }

    /**
     * Gets the value of the eastings property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getEastings() {
        return eastings;
    }

    /**
     * Sets the value of the eastings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setEastings(LengthType value) {
        this.eastings = value;
    }

    public boolean isSetEastings() {
        return (this.eastings!= null);
    }

    /**
     * Gets the value of the northings property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getNorthings() {
        return northings;
    }

    /**
     * Sets the value of the northings property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setNorthings(LengthType value) {
        this.northings = value;
    }

    public boolean isSetNorthings() {
        return (this.northings!= null);
    }

    /**
     * Gets the value of the orthogonalHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOrthogonalHeight() {
        return orthogonalHeight;
    }

    /**
     * Sets the value of the orthogonalHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOrthogonalHeight(LengthType value) {
        this.orthogonalHeight = value;
    }

    public boolean isSetOrthogonalHeight() {
        return (this.orthogonalHeight!= null);
    }

    /**
     * Gets the value of the xAxisAbscissa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisAbscissa() {
        return xAxisAbscissa;
    }

    /**
     * Sets the value of the xAxisAbscissa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisAbscissa(Double value) {
        this.xAxisAbscissa = value;
    }

    public boolean isSetXAxisAbscissa() {
        return (this.xAxisAbscissa!= null);
    }

    /**
     * Gets the value of the xAxisOrdinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXAxisOrdinate() {
        return xAxisOrdinate;
    }

    /**
     * Sets the value of the xAxisOrdinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXAxisOrdinate(Double value) {
        this.xAxisOrdinate = value;
    }

    public boolean isSetXAxisOrdinate() {
        return (this.xAxisOrdinate!= null);
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScale(Double value) {
        this.scale = value;
    }

    public boolean isSetScale() {
        return (this.scale!= null);
    }

}
