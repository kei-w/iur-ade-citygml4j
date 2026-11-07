//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:44:33 JST 2026
//


package jp.geospatial.iur._3_0.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for StopType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.0}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ttsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="zoneId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="locationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="wheelchairBoarding" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="platformCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="point" type="{http://www.opengis.net/gml}PointPropertyType"/&gt;
 *         &lt;element name="parentStation" type="{https://www.geospatial.jp/iur/urt/3.0}StopPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{https://www.geospatial.jp/iur/urt/3.0}LevelPropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopType", propOrder = {
    "code",
    "ttsName",
    "latitude",
    "longitude",
    "zoneId",
    "url",
    "locationType",
    "timeZone",
    "wheelchairBoarding",
    "platformCode",
    "point",
    "parentStation",
    "level"
})
public class StopType
    extends PublicTransitType
{

    protected CodeType code;
    protected String ttsName;
    protected Double latitude;
    protected Double longitude;
    protected CodeType zoneId;
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected CodeType locationType;
    protected CodeType timeZone;
    protected CodeType wheelchairBoarding;
    protected String platformCode;
    @XmlElement(required = true)
    protected PointPropertyType point;
    protected StopPropertyType parentStation;
    protected LevelPropertyType level;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    public boolean isSetCode() {
        return (this.code!= null);
    }

    /**
     * Gets the value of the ttsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtsName() {
        return ttsName;
    }

    /**
     * Sets the value of the ttsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtsName(String value) {
        this.ttsName = value;
    }

    public boolean isSetTtsName() {
        return (this.ttsName!= null);
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return (this.latitude!= null);
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return (this.longitude!= null);
    }

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setZoneId(CodeType value) {
        this.zoneId = value;
    }

    public boolean isSetZoneId() {
        return (this.zoneId!= null);
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    public boolean isSetUrl() {
        return (this.url!= null);
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationType(CodeType value) {
        this.locationType = value;
    }

    public boolean isSetLocationType() {
        return (this.locationType!= null);
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTimeZone(CodeType value) {
        this.timeZone = value;
    }

    public boolean isSetTimeZone() {
        return (this.timeZone!= null);
    }

    /**
     * Gets the value of the wheelchairBoarding property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    /**
     * Sets the value of the wheelchairBoarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWheelchairBoarding(CodeType value) {
        this.wheelchairBoarding = value;
    }

    public boolean isSetWheelchairBoarding() {
        return (this.wheelchairBoarding!= null);
    }

    /**
     * Gets the value of the platformCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * Sets the value of the platformCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformCode(String value) {
        this.platformCode = value;
    }

    public boolean isSetPlatformCode() {
        return (this.platformCode!= null);
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPoint(PointPropertyType value) {
        this.point = value;
    }

    public boolean isSetPoint() {
        return (this.point!= null);
    }

    /**
     * Gets the value of the parentStation property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getParentStation() {
        return parentStation;
    }

    /**
     * Sets the value of the parentStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setParentStation(StopPropertyType value) {
        this.parentStation = value;
    }

    public boolean isSetParentStation() {
        return (this.parentStation!= null);
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LevelPropertyType }
     *     
     */
    public LevelPropertyType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelPropertyType }
     *     
     */
    public void setLevel(LevelPropertyType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

}
