//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructureDetailsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructureDetailsPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.2}StructureDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructureDetailsPropertyType", propOrder = {
    "structureDetails"
})
public class StructureDetailsPropertyType {

    @XmlElement(name = "StructureDetails", required = true)
    protected StructureDetailsType structureDetails;

    /**
     * Gets the value of the structureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructureDetailsType }
     *     
     */
    public StructureDetailsType getStructureDetails() {
        return structureDetails;
    }

    /**
     * Sets the value of the structureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureDetailsType }
     *     
     */
    public void setStructureDetails(StructureDetailsType value) {
        this.structureDetails = value;
    }

    public boolean isSetStructureDetails() {
        return (this.structureDetails!= null);
    }

}
