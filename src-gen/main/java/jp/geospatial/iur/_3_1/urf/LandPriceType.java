//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for LandPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointCodeOfLastYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fiscalYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="landPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="variability" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="isSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAddressChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isAcreageChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUseChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBuildingStructureChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSupplyFacilitiesChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDistanceFromStationChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUseDistrictChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFirePreventionChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUrbanPlanAreaChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBuildingCoverageRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isFloorAreaRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acreage" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="useStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildingStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="water" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sewerage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="shape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="depthRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="storeysAboveGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="storeysBelowGround" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="frontageRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontageRoadDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontageRoadWidth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="stationSquare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontageRoadSurface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sideRoad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sideRoadDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transportationFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surroundings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromStation" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="useDistrict" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="firePrevention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanAreaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heightControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="park" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="extraFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSame" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="selectionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="landPriceHistory" type="{https://www.geospatial.jp/iur/urf/3.1}ValueByCodesPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attributeHistory" type="{https://www.geospatial.jp/iur/urf/3.1}ValueByCodesPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandPriceType", propOrder = {
    "pointCode",
    "pointCodeOfLastYear",
    "fiscalYear",
    "landPrice",
    "variability",
    "isSelected",
    "isAddressChanged",
    "isAcreageChanged",
    "isUseChanged",
    "isBuildingStructureChanged",
    "isSupplyFacilitiesChanged",
    "isDistanceFromStationChanged",
    "isUseDistrictChanged",
    "isFirePreventionChanged",
    "isUrbanPlanAreaChanged",
    "isBuildingCoverageRateChanged",
    "isFloorAreaRateChanged",
    "cityCode",
    "cityName",
    "locationDescription",
    "address",
    "acreage",
    "useStatus",
    "useStatusDescription",
    "useType",
    "buildingStructure",
    "water",
    "gas",
    "sewerage",
    "shape",
    "frontageRate",
    "depthRate",
    "storeysAboveGround",
    "storeysBelowGround",
    "frontageRoad",
    "frontageRoadDirection",
    "frontageRoadWidth",
    "stationSquare",
    "frontageRoadSurface",
    "sideRoad",
    "sideRoadDirection",
    "transportationFacilities",
    "surroundings",
    "stationName",
    "distanceFromStation",
    "useDistrict",
    "firePrevention",
    "urbanPlanAreaType",
    "heightControl",
    "forest",
    "park",
    "buildingCoverageRate",
    "floorAreaRate",
    "extraFloorAreaRate",
    "isSame",
    "selectionStatus",
    "landPriceHistory",
    "attributeHistory"
})
public class LandPriceType
    extends UrbanFunctionType
{

    @XmlElement(required = true)
    protected String pointCode;
    protected String pointCodeOfLastYear;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar fiscalYear;
    protected BigInteger landPrice;
    protected Double variability;
    protected Boolean isSelected;
    protected Boolean isAddressChanged;
    protected Boolean isAcreageChanged;
    protected Boolean isUseChanged;
    protected Boolean isBuildingStructureChanged;
    protected Boolean isSupplyFacilitiesChanged;
    protected Boolean isDistanceFromStationChanged;
    protected Boolean isUseDistrictChanged;
    protected Boolean isFirePreventionChanged;
    protected Boolean isUrbanPlanAreaChanged;
    protected Boolean isBuildingCoverageRateChanged;
    protected Boolean isFloorAreaRateChanged;
    protected List<CodeType> cityCode;
    protected String cityName;
    @XmlElement(name = "location")
    protected String locationDescription;
    protected String address;
    protected MeasureType acreage;
    protected List<String> useStatus;
    protected String useStatusDescription;
    protected String useType;
    protected String buildingStructure;
    protected Boolean water;
    protected Boolean gas;
    protected Boolean sewerage;
    protected String shape;
    protected Double frontageRate;
    protected Double depthRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysAboveGround;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storeysBelowGround;
    protected String frontageRoad;
    protected String frontageRoadDirection;
    protected LengthType frontageRoadWidth;
    protected String stationSquare;
    protected String frontageRoadSurface;
    protected String sideRoad;
    protected String sideRoadDirection;
    protected String transportationFacilities;
    protected String surroundings;
    protected String stationName;
    protected LengthType distanceFromStation;
    protected CodeType useDistrict;
    protected String firePrevention;
    protected String urbanPlanAreaType;
    protected String heightControl;
    protected String forest;
    protected String park;
    protected BigInteger buildingCoverageRate;
    protected BigInteger floorAreaRate;
    protected String extraFloorAreaRate;
    protected Boolean isSame;
    protected String selectionStatus;
    protected List<ValueByCodesPropertyType> landPriceHistory;
    protected List<ValueByCodesPropertyType> attributeHistory;

    /**
     * Gets the value of the pointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointCode() {
        return pointCode;
    }

    /**
     * Sets the value of the pointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointCode(String value) {
        this.pointCode = value;
    }

    public boolean isSetPointCode() {
        return (this.pointCode!= null);
    }

    /**
     * Gets the value of the pointCodeOfLastYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointCodeOfLastYear() {
        return pointCodeOfLastYear;
    }

    /**
     * Sets the value of the pointCodeOfLastYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointCodeOfLastYear(String value) {
        this.pointCodeOfLastYear = value;
    }

    public boolean isSetPointCodeOfLastYear() {
        return (this.pointCodeOfLastYear!= null);
    }

    /**
     * Gets the value of the fiscalYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYear() {
        return fiscalYear;
    }

    /**
     * Sets the value of the fiscalYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYear(XMLGregorianCalendar value) {
        this.fiscalYear = value;
    }

    public boolean isSetFiscalYear() {
        return (this.fiscalYear!= null);
    }

    /**
     * Gets the value of the landPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLandPrice() {
        return landPrice;
    }

    /**
     * Sets the value of the landPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLandPrice(BigInteger value) {
        this.landPrice = value;
    }

    public boolean isSetLandPrice() {
        return (this.landPrice!= null);
    }

    /**
     * Gets the value of the variability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVariability() {
        return variability;
    }

    /**
     * Sets the value of the variability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVariability(Double value) {
        this.variability = value;
    }

    public boolean isSetVariability() {
        return (this.variability!= null);
    }

    /**
     * Gets the value of the isSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelected(Boolean value) {
        this.isSelected = value;
    }

    public boolean isSetIsSelected() {
        return (this.isSelected!= null);
    }

    /**
     * Gets the value of the isAddressChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddressChanged() {
        return isAddressChanged;
    }

    /**
     * Sets the value of the isAddressChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddressChanged(Boolean value) {
        this.isAddressChanged = value;
    }

    public boolean isSetIsAddressChanged() {
        return (this.isAddressChanged!= null);
    }

    /**
     * Gets the value of the isAcreageChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcreageChanged() {
        return isAcreageChanged;
    }

    /**
     * Sets the value of the isAcreageChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcreageChanged(Boolean value) {
        this.isAcreageChanged = value;
    }

    public boolean isSetIsAcreageChanged() {
        return (this.isAcreageChanged!= null);
    }

    /**
     * Gets the value of the isUseChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUseChanged() {
        return isUseChanged;
    }

    /**
     * Sets the value of the isUseChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseChanged(Boolean value) {
        this.isUseChanged = value;
    }

    public boolean isSetIsUseChanged() {
        return (this.isUseChanged!= null);
    }

    /**
     * Gets the value of the isBuildingStructureChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBuildingStructureChanged() {
        return isBuildingStructureChanged;
    }

    /**
     * Sets the value of the isBuildingStructureChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBuildingStructureChanged(Boolean value) {
        this.isBuildingStructureChanged = value;
    }

    public boolean isSetIsBuildingStructureChanged() {
        return (this.isBuildingStructureChanged!= null);
    }

    /**
     * Gets the value of the isSupplyFacilitiesChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplyFacilitiesChanged() {
        return isSupplyFacilitiesChanged;
    }

    /**
     * Sets the value of the isSupplyFacilitiesChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplyFacilitiesChanged(Boolean value) {
        this.isSupplyFacilitiesChanged = value;
    }

    public boolean isSetIsSupplyFacilitiesChanged() {
        return (this.isSupplyFacilitiesChanged!= null);
    }

    /**
     * Gets the value of the isDistanceFromStationChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDistanceFromStationChanged() {
        return isDistanceFromStationChanged;
    }

    /**
     * Sets the value of the isDistanceFromStationChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDistanceFromStationChanged(Boolean value) {
        this.isDistanceFromStationChanged = value;
    }

    public boolean isSetIsDistanceFromStationChanged() {
        return (this.isDistanceFromStationChanged!= null);
    }

    /**
     * Gets the value of the isUseDistrictChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUseDistrictChanged() {
        return isUseDistrictChanged;
    }

    /**
     * Sets the value of the isUseDistrictChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseDistrictChanged(Boolean value) {
        this.isUseDistrictChanged = value;
    }

    public boolean isSetIsUseDistrictChanged() {
        return (this.isUseDistrictChanged!= null);
    }

    /**
     * Gets the value of the isFirePreventionChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFirePreventionChanged() {
        return isFirePreventionChanged;
    }

    /**
     * Sets the value of the isFirePreventionChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirePreventionChanged(Boolean value) {
        this.isFirePreventionChanged = value;
    }

    public boolean isSetIsFirePreventionChanged() {
        return (this.isFirePreventionChanged!= null);
    }

    /**
     * Gets the value of the isUrbanPlanAreaChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUrbanPlanAreaChanged() {
        return isUrbanPlanAreaChanged;
    }

    /**
     * Sets the value of the isUrbanPlanAreaChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUrbanPlanAreaChanged(Boolean value) {
        this.isUrbanPlanAreaChanged = value;
    }

    public boolean isSetIsUrbanPlanAreaChanged() {
        return (this.isUrbanPlanAreaChanged!= null);
    }

    /**
     * Gets the value of the isBuildingCoverageRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBuildingCoverageRateChanged() {
        return isBuildingCoverageRateChanged;
    }

    /**
     * Sets the value of the isBuildingCoverageRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBuildingCoverageRateChanged(Boolean value) {
        this.isBuildingCoverageRateChanged = value;
    }

    public boolean isSetIsBuildingCoverageRateChanged() {
        return (this.isBuildingCoverageRateChanged!= null);
    }

    /**
     * Gets the value of the isFloorAreaRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFloorAreaRateChanged() {
        return isFloorAreaRateChanged;
    }

    /**
     * Sets the value of the isFloorAreaRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFloorAreaRateChanged(Boolean value) {
        this.isFloorAreaRateChanged = value;
    }

    public boolean isSetIsFloorAreaRateChanged() {
        return (this.isFloorAreaRateChanged!= null);
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCityCode() {
        if (cityCode == null) {
            cityCode = new ArrayList<CodeType>();
        }
        return this.cityCode;
    }

    public boolean isSetCityCode() {
        return ((this.cityCode!= null)&&(!this.cityCode.isEmpty()));
    }

    public void unsetCityCode() {
        this.cityCode = null;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    public boolean isSetCityName() {
        return (this.cityName!= null);
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    public boolean isSetLocationDescription() {
        return (this.locationDescription!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the acreage property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAcreage() {
        return acreage;
    }

    /**
     * Sets the value of the acreage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAcreage(MeasureType value) {
        this.acreage = value;
    }

    public boolean isSetAcreage() {
        return (this.acreage!= null);
    }

    /**
     * Gets the value of the useStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUseStatus() {
        if (useStatus == null) {
            useStatus = new ArrayList<String>();
        }
        return this.useStatus;
    }

    public boolean isSetUseStatus() {
        return ((this.useStatus!= null)&&(!this.useStatus.isEmpty()));
    }

    public void unsetUseStatus() {
        this.useStatus = null;
    }

    /**
     * Gets the value of the useStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseStatusDescription() {
        return useStatusDescription;
    }

    /**
     * Sets the value of the useStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseStatusDescription(String value) {
        this.useStatusDescription = value;
    }

    public boolean isSetUseStatusDescription() {
        return (this.useStatusDescription!= null);
    }

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
    }

    public boolean isSetUseType() {
        return (this.useType!= null);
    }

    /**
     * Gets the value of the buildingStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingStructure() {
        return buildingStructure;
    }

    /**
     * Sets the value of the buildingStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingStructure(String value) {
        this.buildingStructure = value;
    }

    public boolean isSetBuildingStructure() {
        return (this.buildingStructure!= null);
    }

    /**
     * Gets the value of the water property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWater() {
        return water;
    }

    /**
     * Sets the value of the water property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWater(Boolean value) {
        this.water = value;
    }

    public boolean isSetWater() {
        return (this.water!= null);
    }

    /**
     * Gets the value of the gas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGas() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGas(Boolean value) {
        this.gas = value;
    }

    public boolean isSetGas() {
        return (this.gas!= null);
    }

    /**
     * Gets the value of the sewerage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSewerage() {
        return sewerage;
    }

    /**
     * Sets the value of the sewerage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSewerage(Boolean value) {
        this.sewerage = value;
    }

    public boolean isSetSewerage() {
        return (this.sewerage!= null);
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    public boolean isSetShape() {
        return (this.shape!= null);
    }

    /**
     * Gets the value of the frontageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFrontageRate() {
        return frontageRate;
    }

    /**
     * Sets the value of the frontageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFrontageRate(Double value) {
        this.frontageRate = value;
    }

    public boolean isSetFrontageRate() {
        return (this.frontageRate!= null);
    }

    /**
     * Gets the value of the depthRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepthRate() {
        return depthRate;
    }

    /**
     * Sets the value of the depthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepthRate(Double value) {
        this.depthRate = value;
    }

    public boolean isSetDepthRate() {
        return (this.depthRate!= null);
    }

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
     * Gets the value of the frontageRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontageRoad() {
        return frontageRoad;
    }

    /**
     * Sets the value of the frontageRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontageRoad(String value) {
        this.frontageRoad = value;
    }

    public boolean isSetFrontageRoad() {
        return (this.frontageRoad!= null);
    }

    /**
     * Gets the value of the frontageRoadDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontageRoadDirection() {
        return frontageRoadDirection;
    }

    /**
     * Sets the value of the frontageRoadDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontageRoadDirection(String value) {
        this.frontageRoadDirection = value;
    }

    public boolean isSetFrontageRoadDirection() {
        return (this.frontageRoadDirection!= null);
    }

    /**
     * Gets the value of the frontageRoadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getFrontageRoadWidth() {
        return frontageRoadWidth;
    }

    /**
     * Sets the value of the frontageRoadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setFrontageRoadWidth(LengthType value) {
        this.frontageRoadWidth = value;
    }

    public boolean isSetFrontageRoadWidth() {
        return (this.frontageRoadWidth!= null);
    }

    /**
     * Gets the value of the stationSquare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationSquare() {
        return stationSquare;
    }

    /**
     * Sets the value of the stationSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationSquare(String value) {
        this.stationSquare = value;
    }

    public boolean isSetStationSquare() {
        return (this.stationSquare!= null);
    }

    /**
     * Gets the value of the frontageRoadSurface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontageRoadSurface() {
        return frontageRoadSurface;
    }

    /**
     * Sets the value of the frontageRoadSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontageRoadSurface(String value) {
        this.frontageRoadSurface = value;
    }

    public boolean isSetFrontageRoadSurface() {
        return (this.frontageRoadSurface!= null);
    }

    /**
     * Gets the value of the sideRoad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideRoad() {
        return sideRoad;
    }

    /**
     * Sets the value of the sideRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideRoad(String value) {
        this.sideRoad = value;
    }

    public boolean isSetSideRoad() {
        return (this.sideRoad!= null);
    }

    /**
     * Gets the value of the sideRoadDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideRoadDirection() {
        return sideRoadDirection;
    }

    /**
     * Sets the value of the sideRoadDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideRoadDirection(String value) {
        this.sideRoadDirection = value;
    }

    public boolean isSetSideRoadDirection() {
        return (this.sideRoadDirection!= null);
    }

    /**
     * Gets the value of the transportationFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationFacilities() {
        return transportationFacilities;
    }

    /**
     * Sets the value of the transportationFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationFacilities(String value) {
        this.transportationFacilities = value;
    }

    public boolean isSetTransportationFacilities() {
        return (this.transportationFacilities!= null);
    }

    /**
     * Gets the value of the surroundings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurroundings() {
        return surroundings;
    }

    /**
     * Sets the value of the surroundings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurroundings(String value) {
        this.surroundings = value;
    }

    public boolean isSetSurroundings() {
        return (this.surroundings!= null);
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    public boolean isSetStationName() {
        return (this.stationName!= null);
    }

    /**
     * Gets the value of the distanceFromStation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDistanceFromStation() {
        return distanceFromStation;
    }

    /**
     * Sets the value of the distanceFromStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDistanceFromStation(LengthType value) {
        this.distanceFromStation = value;
    }

    public boolean isSetDistanceFromStation() {
        return (this.distanceFromStation!= null);
    }

    /**
     * Gets the value of the useDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUseDistrict() {
        return useDistrict;
    }

    /**
     * Sets the value of the useDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUseDistrict(CodeType value) {
        this.useDistrict = value;
    }

    public boolean isSetUseDistrict() {
        return (this.useDistrict!= null);
    }

    /**
     * Gets the value of the firePrevention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirePrevention() {
        return firePrevention;
    }

    /**
     * Sets the value of the firePrevention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirePrevention(String value) {
        this.firePrevention = value;
    }

    public boolean isSetFirePrevention() {
        return (this.firePrevention!= null);
    }

    /**
     * Gets the value of the urbanPlanAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanPlanAreaType() {
        return urbanPlanAreaType;
    }

    /**
     * Sets the value of the urbanPlanAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanPlanAreaType(String value) {
        this.urbanPlanAreaType = value;
    }

    public boolean isSetUrbanPlanAreaType() {
        return (this.urbanPlanAreaType!= null);
    }

    /**
     * Gets the value of the heightControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeightControl() {
        return heightControl;
    }

    /**
     * Sets the value of the heightControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeightControl(String value) {
        this.heightControl = value;
    }

    public boolean isSetHeightControl() {
        return (this.heightControl!= null);
    }

    /**
     * Gets the value of the forest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForest() {
        return forest;
    }

    /**
     * Sets the value of the forest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForest(String value) {
        this.forest = value;
    }

    public boolean isSetForest() {
        return (this.forest!= null);
    }

    /**
     * Gets the value of the park property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPark() {
        return park;
    }

    /**
     * Sets the value of the park property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPark(String value) {
        this.park = value;
    }

    public boolean isSetPark() {
        return (this.park!= null);
    }

    /**
     * Gets the value of the buildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    /**
     * Sets the value of the buildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuildingCoverageRate(BigInteger value) {
        this.buildingCoverageRate = value;
    }

    public boolean isSetBuildingCoverageRate() {
        return (this.buildingCoverageRate!= null);
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
     * Gets the value of the extraFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFloorAreaRate() {
        return extraFloorAreaRate;
    }

    /**
     * Sets the value of the extraFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFloorAreaRate(String value) {
        this.extraFloorAreaRate = value;
    }

    public boolean isSetExtraFloorAreaRate() {
        return (this.extraFloorAreaRate!= null);
    }

    /**
     * Gets the value of the isSame property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSame() {
        return isSame;
    }

    /**
     * Sets the value of the isSame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSame(Boolean value) {
        this.isSame = value;
    }

    public boolean isSetIsSame() {
        return (this.isSame!= null);
    }

    /**
     * Gets the value of the selectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionStatus() {
        return selectionStatus;
    }

    /**
     * Sets the value of the selectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionStatus(String value) {
        this.selectionStatus = value;
    }

    public boolean isSetSelectionStatus() {
        return (this.selectionStatus!= null);
    }

    /**
     * Gets the value of the landPriceHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landPriceHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandPriceHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueByCodesPropertyType }
     * 
     * 
     */
    public List<ValueByCodesPropertyType> getLandPriceHistory() {
        if (landPriceHistory == null) {
            landPriceHistory = new ArrayList<ValueByCodesPropertyType>();
        }
        return this.landPriceHistory;
    }

    public boolean isSetLandPriceHistory() {
        return ((this.landPriceHistory!= null)&&(!this.landPriceHistory.isEmpty()));
    }

    public void unsetLandPriceHistory() {
        this.landPriceHistory = null;
    }

    /**
     * Gets the value of the attributeHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueByCodesPropertyType }
     * 
     * 
     */
    public List<ValueByCodesPropertyType> getAttributeHistory() {
        if (attributeHistory == null) {
            attributeHistory = new ArrayList<ValueByCodesPropertyType>();
        }
        return this.attributeHistory;
    }

    public boolean isSetAttributeHistory() {
        return ((this.attributeHistory!= null)&&(!this.attributeHistory.isEmpty()));
    }

    public void unsetAttributeHistory() {
        this.attributeHistory = null;
    }

}
