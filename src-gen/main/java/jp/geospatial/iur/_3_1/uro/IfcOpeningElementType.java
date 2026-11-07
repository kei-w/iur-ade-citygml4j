//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcOpeningElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcOpeningElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IfcElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nominalArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="nominalVolume" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcOpeningElementType", propOrder = {
    "nominalArea",
    "nominalVolume"
})
public class IfcOpeningElementType
    extends IfcElementType
{

    protected MeasureType nominalArea;
    protected MeasureType nominalVolume;

    /**
     * Gets the value of the nominalArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalArea() {
        return nominalArea;
    }

    /**
     * Sets the value of the nominalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalArea(MeasureType value) {
        this.nominalArea = value;
    }

    public boolean isSetNominalArea() {
        return (this.nominalArea!= null);
    }

    /**
     * Gets the value of the nominalVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNominalVolume() {
        return nominalVolume;
    }

    /**
     * Sets the value of the nominalVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNominalVolume(MeasureType value) {
        this.nominalVolume = value;
    }

    public boolean isSetNominalVolume() {
        return (this.nominalVolume!= null);
    }

}
