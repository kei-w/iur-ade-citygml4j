//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.LengthType;


/**
 * <p>Java class for TrafficFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanFacilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaLocations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="urbanRoadAttribute" type="{https://www.geospatial.jp/iur/urf/2.0}UrbanRoadAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="urbanRapidTransitRailroadAttribute" type="{https://www.geospatial.jp/iur/urf/2.0}UrbanRapidTransitRailroadAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="parkingPlaceAttribute" type="{https://www.geospatial.jp/iur/urf/2.0}ParkingPlaceAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="vehicleTerminalAttribute" type="{https://www.geospatial.jp/iur/urf/2.0}VehicleTerminalAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFacilityType", propOrder = {
    "startLocation",
    "endLocation",
    "viaLocations",
    "length",
    "width",
    "urbanRoadAttribute",
    "urbanRapidTransitRailroadAttribute",
    "parkingPlaceAttribute",
    "vehicleTerminalAttribute"
})
public class TrafficFacilityType
    extends UrbanFacilityType
{

    protected String startLocation;
    protected String endLocation;
    protected String viaLocations;
    protected LengthType length;
    protected LengthType width;
    protected UrbanRoadAttributePropertyType urbanRoadAttribute;
    protected UrbanRapidTransitRailroadAttributePropertyType urbanRapidTransitRailroadAttribute;
    protected ParkingPlaceAttributePropertyType parkingPlaceAttribute;
    protected VehicleTerminalAttributePropertyType vehicleTerminalAttribute;

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartLocation(String value) {
        this.startLocation = value;
    }

    public boolean isSetStartLocation() {
        return (this.startLocation!= null);
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLocation(String value) {
        this.endLocation = value;
    }

    public boolean isSetEndLocation() {
        return (this.endLocation!= null);
    }

    /**
     * Gets the value of the viaLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaLocations() {
        return viaLocations;
    }

    /**
     * Sets the value of the viaLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaLocations(String value) {
        this.viaLocations = value;
    }

    public boolean isSetViaLocations() {
        return (this.viaLocations!= null);
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
    }

    public boolean isSetLength() {
        return (this.length!= null);
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWidth(LengthType value) {
        this.width = value;
    }

    public boolean isSetWidth() {
        return (this.width!= null);
    }

    /**
     * Gets the value of the urbanRoadAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanRoadAttributePropertyType }
     *     
     */
    public UrbanRoadAttributePropertyType getUrbanRoadAttribute() {
        return urbanRoadAttribute;
    }

    /**
     * Sets the value of the urbanRoadAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanRoadAttributePropertyType }
     *     
     */
    public void setUrbanRoadAttribute(UrbanRoadAttributePropertyType value) {
        this.urbanRoadAttribute = value;
    }

    public boolean isSetUrbanRoadAttribute() {
        return (this.urbanRoadAttribute!= null);
    }

    /**
     * Gets the value of the urbanRapidTransitRailroadAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanRapidTransitRailroadAttributePropertyType }
     *     
     */
    public UrbanRapidTransitRailroadAttributePropertyType getUrbanRapidTransitRailroadAttribute() {
        return urbanRapidTransitRailroadAttribute;
    }

    /**
     * Sets the value of the urbanRapidTransitRailroadAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanRapidTransitRailroadAttributePropertyType }
     *     
     */
    public void setUrbanRapidTransitRailroadAttribute(UrbanRapidTransitRailroadAttributePropertyType value) {
        this.urbanRapidTransitRailroadAttribute = value;
    }

    public boolean isSetUrbanRapidTransitRailroadAttribute() {
        return (this.urbanRapidTransitRailroadAttribute!= null);
    }

    /**
     * Gets the value of the parkingPlaceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPlaceAttributePropertyType }
     *     
     */
    public ParkingPlaceAttributePropertyType getParkingPlaceAttribute() {
        return parkingPlaceAttribute;
    }

    /**
     * Sets the value of the parkingPlaceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPlaceAttributePropertyType }
     *     
     */
    public void setParkingPlaceAttribute(ParkingPlaceAttributePropertyType value) {
        this.parkingPlaceAttribute = value;
    }

    public boolean isSetParkingPlaceAttribute() {
        return (this.parkingPlaceAttribute!= null);
    }

    /**
     * Gets the value of the vehicleTerminalAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTerminalAttributePropertyType }
     *     
     */
    public VehicleTerminalAttributePropertyType getVehicleTerminalAttribute() {
        return vehicleTerminalAttribute;
    }

    /**
     * Sets the value of the vehicleTerminalAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTerminalAttributePropertyType }
     *     
     */
    public void setVehicleTerminalAttribute(VehicleTerminalAttributePropertyType value) {
        this.vehicleTerminalAttribute = value;
    }

    public boolean isSetVehicleTerminalAttribute() {
        return (this.vehicleTerminalAttribute!= null);
    }

}
