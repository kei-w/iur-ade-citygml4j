//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for CollectiveFacilitiesForTsunamiDisasterPreventionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectiveFacilitiesForTsunamiDisasterPreventionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="housingFacilities" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="supecificBusinessFacilities" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="publicFacilities" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="utilityFacilities" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="maximumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="minimumBuildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="maximumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minimumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectiveFacilitiesForTsunamiDisasterPreventionType", propOrder = {
    "housingFacilities",
    "supecificBusinessFacilities",
    "publicFacilities",
    "utilityFacilities",
    "maximumBuildingHeight",
    "minimumBuildingHeight",
    "maximumFloorAreaRate",
    "minimumFloorAreaRate",
    "maximumBuildingCoverageRate"
})
public class CollectiveFacilitiesForTsunamiDisasterPreventionType
    extends UrbanFacilityType
{

    protected StringOrRefType housingFacilities;
    protected StringOrRefType supecificBusinessFacilities;
    protected StringOrRefType publicFacilities;
    protected StringOrRefType utilityFacilities;
    protected LengthType maximumBuildingHeight;
    protected LengthType minimumBuildingHeight;
    protected Double maximumFloorAreaRate;
    protected Double minimumFloorAreaRate;
    protected Double maximumBuildingCoverageRate;

    /**
     * Gets the value of the housingFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getHousingFacilities() {
        return housingFacilities;
    }

    /**
     * Sets the value of the housingFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setHousingFacilities(StringOrRefType value) {
        this.housingFacilities = value;
    }

    public boolean isSetHousingFacilities() {
        return (this.housingFacilities!= null);
    }

    /**
     * Gets the value of the supecificBusinessFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSupecificBusinessFacilities() {
        return supecificBusinessFacilities;
    }

    /**
     * Sets the value of the supecificBusinessFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSupecificBusinessFacilities(StringOrRefType value) {
        this.supecificBusinessFacilities = value;
    }

    public boolean isSetSupecificBusinessFacilities() {
        return (this.supecificBusinessFacilities!= null);
    }

    /**
     * Gets the value of the publicFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPublicFacilities() {
        return publicFacilities;
    }

    /**
     * Sets the value of the publicFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPublicFacilities(StringOrRefType value) {
        this.publicFacilities = value;
    }

    public boolean isSetPublicFacilities() {
        return (this.publicFacilities!= null);
    }

    /**
     * Gets the value of the utilityFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getUtilityFacilities() {
        return utilityFacilities;
    }

    /**
     * Sets the value of the utilityFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setUtilityFacilities(StringOrRefType value) {
        this.utilityFacilities = value;
    }

    public boolean isSetUtilityFacilities() {
        return (this.utilityFacilities!= null);
    }

    /**
     * Gets the value of the maximumBuildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumBuildingHeight() {
        return maximumBuildingHeight;
    }

    /**
     * Sets the value of the maximumBuildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumBuildingHeight(LengthType value) {
        this.maximumBuildingHeight = value;
    }

    public boolean isSetMaximumBuildingHeight() {
        return (this.maximumBuildingHeight!= null);
    }

    /**
     * Gets the value of the minimumBuildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumBuildingHeight() {
        return minimumBuildingHeight;
    }

    /**
     * Sets the value of the minimumBuildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumBuildingHeight(LengthType value) {
        this.minimumBuildingHeight = value;
    }

    public boolean isSetMinimumBuildingHeight() {
        return (this.minimumBuildingHeight!= null);
    }

    /**
     * Gets the value of the maximumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumFloorAreaRate() {
        return maximumFloorAreaRate;
    }

    /**
     * Sets the value of the maximumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumFloorAreaRate(Double value) {
        this.maximumFloorAreaRate = value;
    }

    public boolean isSetMaximumFloorAreaRate() {
        return (this.maximumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the minimumFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumFloorAreaRate() {
        return minimumFloorAreaRate;
    }

    /**
     * Sets the value of the minimumFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumFloorAreaRate(Double value) {
        this.minimumFloorAreaRate = value;
    }

    public boolean isSetMinimumFloorAreaRate() {
        return (this.minimumFloorAreaRate!= null);
    }

    /**
     * Gets the value of the maximumBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumBuildingCoverageRate() {
        return maximumBuildingCoverageRate;
    }

    /**
     * Sets the value of the maximumBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumBuildingCoverageRate(Double value) {
        this.maximumBuildingCoverageRate = value;
    }

    public boolean isSetMaximumBuildingCoverageRate() {
        return (this.maximumBuildingCoverageRate!= null);
    }

}
