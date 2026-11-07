//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcProjectedCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcProjectedCRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcCoordinateReferenceSystemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapProjection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcProjectedCRSType", propOrder = {
    "mapUnit",
    "mapProjection",
    "mapZone"
})
public class IfcProjectedCRSType
    extends IfcCoordinateReferenceSystemType
{

    protected String mapUnit;
    protected String mapProjection;
    protected String mapZone;

    /**
     * Gets the value of the mapUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUnit() {
        return mapUnit;
    }

    /**
     * Sets the value of the mapUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUnit(String value) {
        this.mapUnit = value;
    }

    public boolean isSetMapUnit() {
        return (this.mapUnit!= null);
    }

    /**
     * Gets the value of the mapProjection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapProjection() {
        return mapProjection;
    }

    /**
     * Sets the value of the mapProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapProjection(String value) {
        this.mapProjection = value;
    }

    public boolean isSetMapProjection() {
        return (this.mapProjection!= null);
    }

    /**
     * Gets the value of the mapZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapZone() {
        return mapZone;
    }

    /**
     * Sets the value of the mapZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapZone(String value) {
        this.mapZone = value;
    }

    public boolean isSetMapZone() {
        return (this.mapZone!= null);
    }

}
