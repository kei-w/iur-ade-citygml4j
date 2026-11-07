//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml._2.AddressPropertyType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for IfcBuildingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcBuildingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}IfcSpatialStructureElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elevationOfRefHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="elevationOfTerrain" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="buildingAddress" type="{http://www.opengis.net/citygml/2.0}AddressPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcBuildingType", propOrder = {
    "elevationOfRefHeight",
    "elevationOfTerrain",
    "buildingAddress"
})
public class IfcBuildingType
    extends IfcSpatialStructureElementType
{

    protected LengthType elevationOfRefHeight;
    protected LengthType elevationOfTerrain;
    protected AddressPropertyType buildingAddress;

    /**
     * Gets the value of the elevationOfRefHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getElevationOfRefHeight() {
        return elevationOfRefHeight;
    }

    /**
     * Sets the value of the elevationOfRefHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setElevationOfRefHeight(LengthType value) {
        this.elevationOfRefHeight = value;
    }

    public boolean isSetElevationOfRefHeight() {
        return (this.elevationOfRefHeight!= null);
    }

    /**
     * Gets the value of the elevationOfTerrain property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getElevationOfTerrain() {
        return elevationOfTerrain;
    }

    /**
     * Sets the value of the elevationOfTerrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setElevationOfTerrain(LengthType value) {
        this.elevationOfTerrain = value;
    }

    public boolean isSetElevationOfTerrain() {
        return (this.elevationOfTerrain!= null);
    }

    /**
     * Gets the value of the buildingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyType }
     *     
     */
    public AddressPropertyType getBuildingAddress() {
        return buildingAddress;
    }

    /**
     * Sets the value of the buildingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyType }
     *     
     */
    public void setBuildingAddress(AddressPropertyType value) {
        this.buildingAddress = value;
    }

    public boolean isSetBuildingAddress() {
        return (this.buildingAddress!= null);
    }

}
