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
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for DamAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DamAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}ConstructionStructureAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="damCode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="totalWaterStorage" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DamAttributeType", propOrder = {
    "damCode",
    "totalWaterStorage"
})
public class DamAttributeType
    extends ConstructionStructureAttributeType
{

    protected CodeType damCode;
    protected MeasureType totalWaterStorage;

    /**
     * Gets the value of the damCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDamCode() {
        return damCode;
    }

    /**
     * Sets the value of the damCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDamCode(CodeType value) {
        this.damCode = value;
    }

    public boolean isSetDamCode() {
        return (this.damCode!= null);
    }

    /**
     * Gets the value of the totalWaterStorage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalWaterStorage() {
        return totalWaterStorage;
    }

    /**
     * Sets the value of the totalWaterStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalWaterStorage(MeasureType value) {
        this.totalWaterStorage = value;
    }

    public boolean isSetTotalWaterStorage() {
        return (this.totalWaterStorage!= null);
    }

}
