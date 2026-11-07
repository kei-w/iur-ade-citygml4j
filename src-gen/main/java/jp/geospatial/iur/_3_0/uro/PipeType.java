//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

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
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}UtilityLinkType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="innerDiamiter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="outerDiamiter" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
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
    "innerDiamiter",
    "outerDiamiter",
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

    protected LengthType innerDiamiter;
    protected LengthType outerDiamiter;
    protected CodeType sleeveType;

    /**
     * Gets the value of the innerDiamiter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getInnerDiamiter() {
        return innerDiamiter;
    }

    /**
     * Sets the value of the innerDiamiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setInnerDiamiter(LengthType value) {
        this.innerDiamiter = value;
    }

    public boolean isSetInnerDiamiter() {
        return (this.innerDiamiter!= null);
    }

    /**
     * Gets the value of the outerDiamiter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOuterDiamiter() {
        return outerDiamiter;
    }

    /**
     * Sets the value of the outerDiamiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOuterDiamiter(LengthType value) {
        this.outerDiamiter = value;
    }

    public boolean isSetOuterDiamiter() {
        return (this.outerDiamiter!= null);
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
