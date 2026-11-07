//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterWorksAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterWorksAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterWorksAttributeType", propOrder = {
    "startLocation",
    "endLocation"
})
public class WaterWorksAttributeType {

    protected String startLocation;
    protected String endLocation;

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocation(String value) {
        this.startLocation = value;
    }

    public boolean isSetStartLocation() {
        return (this.startLocation!= null);
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocation(String value) {
        this.endLocation = value;
    }

    public boolean isSetEndLocation() {
        return (this.endLocation!= null);
    }

}
