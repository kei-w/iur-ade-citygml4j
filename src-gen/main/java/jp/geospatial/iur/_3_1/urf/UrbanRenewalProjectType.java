//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UrbanRenewalProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanRenewalProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanDevelopmentProjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="storeysAboveGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="storeysBelowGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="setbackSize" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="buildingUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanRenewalProjectType", propOrder = {
    "storeysAboveGround",
    "storeysBelowGround",
    "setbackSize",
    "floorAreaRate",
    "buildingUsage",
    "siteArea"
})
public class UrbanRenewalProjectType
    extends UrbanDevelopmentProjectType
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysAboveGround;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysBelowGround;
    protected StringOrRefType setbackSize;
    protected BigInteger floorAreaRate;
    protected String buildingUsage;
    protected MeasureType siteArea;

    /**
     * Gets the value of the storeysAboveGround property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreysAboveGround() {
        return storeysAboveGround;
    }

    /**
     * Sets the value of the storeysAboveGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreysAboveGround(BigInteger value) {
        this.storeysAboveGround = value;
    }

    public boolean isSetStoreysAboveGround() {
        return (this.storeysAboveGround!= null);
    }

    /**
     * Gets the value of the storeysBelowGround property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoreysBelowGround() {
        return storeysBelowGround;
    }

    /**
     * Sets the value of the storeysBelowGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoreysBelowGround(BigInteger value) {
        this.storeysBelowGround = value;
    }

    public boolean isSetStoreysBelowGround() {
        return (this.storeysBelowGround!= null);
    }

    /**
     * Gets the value of the setbackSize property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSetbackSize() {
        return setbackSize;
    }

    /**
     * Sets the value of the setbackSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSetbackSize(StringOrRefType value) {
        this.setbackSize = value;
    }

    public boolean isSetSetbackSize() {
        return (this.setbackSize!= null);
    }

    /**
     * Gets the value of the floorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloorAreaRate() {
        return floorAreaRate;
    }

    /**
     * Sets the value of the floorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloorAreaRate(BigInteger value) {
        this.floorAreaRate = value;
    }

    public boolean isSetFloorAreaRate() {
        return (this.floorAreaRate!= null);
    }

    /**
     * Gets the value of the buildingUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingUsage() {
        return buildingUsage;
    }

    /**
     * Sets the value of the buildingUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingUsage(String value) {
        this.buildingUsage = value;
    }

    public boolean isSetBuildingUsage() {
        return (this.buildingUsage!= null);
    }

    /**
     * Gets the value of the siteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSiteArea() {
        return siteArea;
    }

    /**
     * Sets the value of the siteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSiteArea(MeasureType value) {
        this.siteArea = value;
    }

    public boolean isSetSiteArea() {
        return (this.siteArea!= null);
    }

}
