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


/**
 * <p>Java class for IndoorFurnishingAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndoorFurnishingAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IndoorAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorFurnishingAttributeType", propOrder = {
    "floorId"
})
public class IndoorFurnishingAttributeType
    extends IndoorAttributeType
{

    protected String floorId;

    /**
     * Gets the value of the floorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorId() {
        return floorId;
    }

    /**
     * Sets the value of the floorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorId(String value) {
        this.floorId = value;
    }

    public boolean isSetFloorId() {
        return (this.floorId!= null);
    }

}
