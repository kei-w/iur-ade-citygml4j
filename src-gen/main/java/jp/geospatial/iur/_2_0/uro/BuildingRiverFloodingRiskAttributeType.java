//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 11:13:19 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for BuildingRiverFloodingRiskAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingRiverFloodingRiskAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/2.0}BuildingFloodingRiskAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adminType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="scale" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="duration" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingRiverFloodingRiskAttributeType", propOrder = {
    "adminType",
    "scale",
    "duration"
})
public class BuildingRiverFloodingRiskAttributeType
    extends BuildingFloodingRiskAttributeType
{

    @XmlElement(required = true)
    protected CodeType adminType;
    @XmlElement(required = true)
    protected CodeType scale;
    protected MeasureType duration;

    /**
     * Gets the value of the adminType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAdminType() {
        return adminType;
    }

    /**
     * Sets the value of the adminType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAdminType(CodeType value) {
        this.adminType = value;
    }

    public boolean isSetAdminType() {
        return (this.adminType!= null);
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setScale(CodeType value) {
        this.scale = value;
    }

    public boolean isSetScale() {
        return (this.scale!= null);
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDuration(MeasureType value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

}
