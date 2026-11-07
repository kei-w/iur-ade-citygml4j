//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for IfcPsetSiteCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcPsetSiteCommonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buildableArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingHeightLimit" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcPsetSiteCommonType", propOrder = {
    "buildableArea",
    "totalArea",
    "buildingHeightLimit"
})
public class IfcPsetSiteCommonType
    extends IfcAttributeType
{

    protected MeasureType buildableArea;
    protected MeasureType totalArea;
    protected LengthType buildingHeightLimit;

    /**
     * Gets the value of the buildableArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBuildableArea() {
        return buildableArea;
    }

    /**
     * Sets the value of the buildableArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBuildableArea(MeasureType value) {
        this.buildableArea = value;
    }

    public boolean isSetBuildableArea() {
        return (this.buildableArea!= null);
    }

    /**
     * Gets the value of the totalArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalArea(MeasureType value) {
        this.totalArea = value;
    }

    public boolean isSetTotalArea() {
        return (this.totalArea!= null);
    }

    /**
     * Gets the value of the buildingHeightLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBuildingHeightLimit() {
        return buildingHeightLimit;
    }

    /**
     * Sets the value of the buildingHeightLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBuildingHeightLimit(LengthType value) {
        this.buildingHeightLimit = value;
    }

    public boolean isSetBuildingHeightLimit() {
        return (this.buildingHeightLimit!= null);
    }

}
