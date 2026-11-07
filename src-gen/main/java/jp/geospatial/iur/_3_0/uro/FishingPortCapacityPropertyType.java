//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FishingPortCapacityPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FishingPortCapacityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}FishingPortCapacity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FishingPortCapacityPropertyType", propOrder = {
    "fishingPortCapacity"
})
public class FishingPortCapacityPropertyType {

    @XmlElement(name = "FishingPortCapacity", required = true)
    protected FishingPortCapacityType fishingPortCapacity;

    /**
     * Gets the value of the fishingPortCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link FishingPortCapacityType }
     *     
     */
    public FishingPortCapacityType getFishingPortCapacity() {
        return fishingPortCapacity;
    }

    /**
     * Sets the value of the fishingPortCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FishingPortCapacityType }
     *     
     */
    public void setFishingPortCapacity(FishingPortCapacityType value) {
        this.fishingPortCapacity = value;
    }

    public boolean isSetFishingPortCapacity() {
        return (this.fishingPortCapacity!= null);
    }

}
