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
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for BuildingUsecaseAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingUsecaseAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}BuildingAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTemporal" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="floorHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="isGroundFloorOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingUsecaseAttributeType", propOrder = {
    "isTemporal",
    "floorHeight",
    "isGroundFloorOpen"
})
public class BuildingUsecaseAttributeType
    extends BuildingAttributeType
{

    protected CodeType isTemporal;
    protected LengthType floorHeight;
    protected Boolean isGroundFloorOpen;

    /**
     * Gets the value of the isTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getIsTemporal() {
        return isTemporal;
    }

    /**
     * Sets the value of the isTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setIsTemporal(CodeType value) {
        this.isTemporal = value;
    }

    public boolean isSetIsTemporal() {
        return (this.isTemporal!= null);
    }

    /**
     * Gets the value of the floorHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getFloorHeight() {
        return floorHeight;
    }

    /**
     * Sets the value of the floorHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setFloorHeight(LengthType value) {
        this.floorHeight = value;
    }

    public boolean isSetFloorHeight() {
        return (this.floorHeight!= null);
    }

    /**
     * Gets the value of the isGroundFloorOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroundFloorOpen() {
        return isGroundFloorOpen;
    }

    /**
     * Sets the value of the isGroundFloorOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroundFloorOpen(Boolean value) {
        this.isGroundFloorOpen = value;
    }

    public boolean isSetIsGroundFloorOpen() {
        return (this.isGroundFloorOpen!= null);
    }

}
