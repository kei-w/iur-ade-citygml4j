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
 * <p>Java class for SewerPipeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SewerPipeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}PipeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slope" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="invertElevationUpstream" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="invertElevationDownstream" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="flowDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SewerPipeType", propOrder = {
    "slope",
    "invertElevationUpstream",
    "invertElevationDownstream",
    "flowDirection"
})
public class SewerPipeType
    extends PipeType
{

    protected MeasureType slope;
    protected LengthType invertElevationUpstream;
    protected LengthType invertElevationDownstream;
    protected Boolean flowDirection;

    /**
     * Gets the value of the slope property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSlope(MeasureType value) {
        this.slope = value;
    }

    public boolean isSetSlope() {
        return (this.slope!= null);
    }

    /**
     * Gets the value of the invertElevationUpstream property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInvertElevationUpstream() {
        return invertElevationUpstream;
    }

    /**
     * Sets the value of the invertElevationUpstream property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInvertElevationUpstream(LengthType value) {
        this.invertElevationUpstream = value;
    }

    public boolean isSetInvertElevationUpstream() {
        return (this.invertElevationUpstream!= null);
    }

    /**
     * Gets the value of the invertElevationDownstream property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInvertElevationDownstream() {
        return invertElevationDownstream;
    }

    /**
     * Sets the value of the invertElevationDownstream property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInvertElevationDownstream(LengthType value) {
        this.invertElevationDownstream = value;
    }

    public boolean isSetInvertElevationDownstream() {
        return (this.invertElevationDownstream!= null);
    }

    /**
     * Gets the value of the flowDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlowDirection(Boolean value) {
        this.flowDirection = value;
    }

    public boolean isSetFlowDirection() {
        return (this.flowDirection!= null);
    }

}
