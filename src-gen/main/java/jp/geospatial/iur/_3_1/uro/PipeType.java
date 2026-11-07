//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for PipeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PipeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}UtilityLinkType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="innerDiameter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="outerDiameter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="sleeveType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PipeType", propOrder = {
    "innerDiameter",
    "outerDiameter",
    "sleeveType"
})
@XmlSeeAlso({
    SewerPipeType.class,
    ThermalPipeType.class,
    WaterPipeType.class,
    OilGasChemicalsPipeType.class
})
public class PipeType
    extends UtilityLinkType
{

    protected LengthType innerDiameter;
    protected LengthType outerDiameter;
    protected CodeType sleeveType;

    /**
     * Gets the value of the innerDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerDiameter() {
        return innerDiameter;
    }

    /**
     * Sets the value of the innerDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerDiameter(LengthType value) {
        this.innerDiameter = value;
    }

    public boolean isSetInnerDiameter() {
        return (this.innerDiameter!= null);
    }

    /**
     * Gets the value of the outerDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOuterDiameter() {
        return outerDiameter;
    }

    /**
     * Sets the value of the outerDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOuterDiameter(LengthType value) {
        this.outerDiameter = value;
    }

    public boolean isSetOuterDiameter() {
        return (this.outerDiameter!= null);
    }

    /**
     * Gets the value of the sleeveType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSleeveType() {
        return sleeveType;
    }

    /**
     * Sets the value of the sleeveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSleeveType(CodeType value) {
        this.sleeveType = value;
    }

    public boolean isSetSleeveType() {
        return (this.sleeveType!= null);
    }

}
