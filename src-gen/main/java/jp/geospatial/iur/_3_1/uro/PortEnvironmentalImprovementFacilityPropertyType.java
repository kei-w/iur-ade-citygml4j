//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortEnvironmentalImprovementFacilityPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortEnvironmentalImprovementFacilityPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.1}PortEnvironmentalImprovementFacility"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortEnvironmentalImprovementFacilityPropertyType", propOrder = {
    "portEnvironmentalImprovementFacility"
})
public class PortEnvironmentalImprovementFacilityPropertyType {

    @XmlElement(name = "PortEnvironmentalImprovementFacility", required = true)
    protected PortEnvironmentalImprovementFacilityType portEnvironmentalImprovementFacility;

    /**
     * Gets the value of the portEnvironmentalImprovementFacility property.
     * 
     * @return
     *     possible object is
     *     {@link PortEnvironmentalImprovementFacilityType }
     *     
     */
    public PortEnvironmentalImprovementFacilityType getPortEnvironmentalImprovementFacility() {
        return portEnvironmentalImprovementFacility;
    }

    /**
     * Sets the value of the portEnvironmentalImprovementFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortEnvironmentalImprovementFacilityType }
     *     
     */
    public void setPortEnvironmentalImprovementFacility(PortEnvironmentalImprovementFacilityType value) {
        this.portEnvironmentalImprovementFacility = value;
    }

    public boolean isSetPortEnvironmentalImprovementFacility() {
        return (this.portEnvironmentalImprovementFacility!= null);
    }

}
