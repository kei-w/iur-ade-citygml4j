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
import net.opengis.citygml._2.AddressPropertyType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for IfcSiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSiteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcSpatialStructureElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="refLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="refElevation" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="landTitleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteAddress" type="{http://www.opengis.net/citygml/2.0}AddressPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSiteType", propOrder = {
    "refLongitude",
    "refLatitude",
    "refElevation",
    "landTitleNumber",
    "siteAddress"
})
public class IfcSiteType
    extends IfcSpatialStructureElementType
{

    protected Double refLongitude;
    protected Double refLatitude;
    protected LengthType refElevation;
    protected String landTitleNumber;
    protected AddressPropertyType siteAddress;

    /**
     * Gets the value of the refLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRefLongitude() {
        return refLongitude;
    }

    /**
     * Sets the value of the refLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRefLongitude(Double value) {
        this.refLongitude = value;
    }

    public boolean isSetRefLongitude() {
        return (this.refLongitude!= null);
    }

    /**
     * Gets the value of the refLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRefLatitude() {
        return refLatitude;
    }

    /**
     * Sets the value of the refLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRefLatitude(Double value) {
        this.refLatitude = value;
    }

    public boolean isSetRefLatitude() {
        return (this.refLatitude!= null);
    }

    /**
     * Gets the value of the refElevation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRefElevation() {
        return refElevation;
    }

    /**
     * Sets the value of the refElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRefElevation(LengthType value) {
        this.refElevation = value;
    }

    public boolean isSetRefElevation() {
        return (this.refElevation!= null);
    }

    /**
     * Gets the value of the landTitleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandTitleNumber() {
        return landTitleNumber;
    }

    /**
     * Sets the value of the landTitleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandTitleNumber(String value) {
        this.landTitleNumber = value;
    }

    public boolean isSetLandTitleNumber() {
        return (this.landTitleNumber!= null);
    }

    /**
     * Gets the value of the siteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyType }
     *     
     */
    public AddressPropertyType getSiteAddress() {
        return siteAddress;
    }

    /**
     * Sets the value of the siteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyType }
     *     
     */
    public void setSiteAddress(AddressPropertyType value) {
        this.siteAddress = value;
    }

    public boolean isSetSiteAddress() {
        return (this.siteAddress!= null);
    }

}
