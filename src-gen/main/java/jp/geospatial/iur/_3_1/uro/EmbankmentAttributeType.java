//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for EmbankmentAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbankmentAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}ConstructionStructureAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mainPartLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="ceilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="waveDissipatorLength" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbankmentAttributeType", propOrder = {
    "mainPartLength",
    "ceilingHeight",
    "waveDissipatorLength"
})
public class EmbankmentAttributeType
    extends ConstructionStructureAttributeType
{

    protected LengthType mainPartLength;
    protected LengthType ceilingHeight;
    protected LengthType waveDissipatorLength;

    /**
     * Gets the value of the mainPartLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMainPartLength() {
        return mainPartLength;
    }

    /**
     * Sets the value of the mainPartLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMainPartLength(LengthType value) {
        this.mainPartLength = value;
    }

    public boolean isSetMainPartLength() {
        return (this.mainPartLength!= null);
    }

    /**
     * Gets the value of the ceilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCeilingHeight() {
        return ceilingHeight;
    }

    /**
     * Sets the value of the ceilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCeilingHeight(LengthType value) {
        this.ceilingHeight = value;
    }

    public boolean isSetCeilingHeight() {
        return (this.ceilingHeight!= null);
    }

    /**
     * Gets the value of the waveDissipatorLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWaveDissipatorLength() {
        return waveDissipatorLength;
    }

    /**
     * Sets the value of the waveDissipatorLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWaveDissipatorLength(LengthType value) {
        this.waveDissipatorLength = value;
    }

    public boolean isSetWaveDissipatorLength() {
        return (this.waveDissipatorLength!= null);
    }

}
