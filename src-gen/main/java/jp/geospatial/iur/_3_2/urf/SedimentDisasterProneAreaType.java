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
import net.opengis.gml.CodeType;


/**
 * <p>Java class for SedimentDisasterProneAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SedimentDisasterProneAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disasterType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="areaType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="zoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zoneName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SedimentDisasterProneAreaType", propOrder = {
    "disasterType",
    "areaType",
    "zoneNumber",
    "zoneName",
    "status"
})
public class SedimentDisasterProneAreaType
    extends ZoneType
{

    @XmlElement(required = true)
    protected CodeType disasterType;
    @XmlElement(required = true)
    protected CodeType areaType;
    @XmlElement(required = true)
    protected String zoneNumber;
    @XmlElement(required = true)
    protected String zoneName;
    protected CodeType status;

    /**
     * Gets the value of the disasterType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDisasterType() {
        return disasterType;
    }

    /**
     * Sets the value of the disasterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDisasterType(CodeType value) {
        this.disasterType = value;
    }

    public boolean isSetDisasterType() {
        return (this.disasterType!= null);
    }

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaType(CodeType value) {
        this.areaType = value;
    }

    public boolean isSetAreaType() {
        return (this.areaType!= null);
    }

    /**
     * Gets the value of the zoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneNumber(String value) {
        this.zoneNumber = value;
    }

    public boolean isSetZoneNumber() {
        return (this.zoneNumber!= null);
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

    public boolean isSetZoneName() {
        return (this.zoneName!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

}
