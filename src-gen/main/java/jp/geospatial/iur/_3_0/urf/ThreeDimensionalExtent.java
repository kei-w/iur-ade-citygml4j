//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for ThreeDimensionalExtent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDimensionalExtent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumDistance" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumLoad" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDimensionalExtent", propOrder = {
    "minimumDistance",
    "maximumLoad"
})
public class ThreeDimensionalExtent
    extends UrbanFunctionType
{

    protected LengthType minimumDistance;
    protected MeasureType maximumLoad;

    /**
     * Gets the value of the minimumDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumDistance() {
        return minimumDistance;
    }

    /**
     * Sets the value of the minimumDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumDistance(LengthType value) {
        this.minimumDistance = value;
    }

    public boolean isSetMinimumDistance() {
        return (this.minimumDistance!= null);
    }

    /**
     * Gets the value of the maximumLoad property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumLoad() {
        return maximumLoad;
    }

    /**
     * Sets the value of the maximumLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumLoad(MeasureType value) {
        this.maximumLoad = value;
    }

    public boolean isSetMaximumLoad() {
        return (this.maximumLoad!= null);
    }

}
