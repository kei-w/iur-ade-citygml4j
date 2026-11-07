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


/**
 * <p>Java class for IfcWindowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcWindowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcBuildingElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="overallWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcWindowType", propOrder = {
    "overallHeight",
    "overallWidth"
})
public class IfcWindowType
    extends IfcBuildingElementType
{

    protected LengthType overallHeight;
    protected LengthType overallWidth;

    /**
     * Gets the value of the overallHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOverallHeight() {
        return overallHeight;
    }

    /**
     * Sets the value of the overallHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOverallHeight(LengthType value) {
        this.overallHeight = value;
    }

    public boolean isSetOverallHeight() {
        return (this.overallHeight!= null);
    }

    /**
     * Gets the value of the overallWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getOverallWidth() {
        return overallWidth;
    }

    /**
     * Sets the value of the overallWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setOverallWidth(LengthType value) {
        this.overallWidth = value;
    }

    public boolean isSetOverallWidth() {
        return (this.overallWidth!= null);
    }

}
