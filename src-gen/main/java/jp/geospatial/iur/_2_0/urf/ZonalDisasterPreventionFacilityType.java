//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ZonalDisasterPreventionFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZonalDisasterPreventionFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZonalDisasterPreventionFacilityType", propOrder = {
    "facilityType"
})
public class ZonalDisasterPreventionFacilityType
    extends ZoneType
{

    @XmlElement(required = true)
    protected CodeType facilityType;

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFacilityType(CodeType value) {
        this.facilityType = value;
    }

    public boolean isSetFacilityType() {
        return (this.facilityType!= null);
    }

}
