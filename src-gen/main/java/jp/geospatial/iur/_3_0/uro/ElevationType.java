//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.DirectPositionType;


/**
 * 第3.2版修正
 * 
 * <p>Java class for ElevationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElevationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elevationReference" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="elevationValue" type="{http://www.opengis.net/gml}DirectPositionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevationType", propOrder = {
    "elevationReference",
    "elevationValue"
})
public class ElevationType {

    @XmlElement(required = true)
    protected CodeType elevationReference;
    @XmlElement(required = true)
    protected DirectPositionType elevationValue;

    /**
     * Gets the value of the elevationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getElevationReference() {
        return elevationReference;
    }

    /**
     * Sets the value of the elevationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setElevationReference(CodeType value) {
        this.elevationReference = value;
    }

    public boolean isSetElevationReference() {
        return (this.elevationReference!= null);
    }

    /**
     * Gets the value of the elevationValue property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getElevationValue() {
        return elevationValue;
    }

    /**
     * Sets the value of the elevationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setElevationValue(DirectPositionType value) {
        this.elevationValue = value;
    }

    public boolean isSetElevationValue() {
        return (this.elevationValue!= null);
    }

}
