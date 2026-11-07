//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.go.kantei.iur._1_4.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MultiCurvePropertyType;


/**
 * <p>Java class for TripType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headsign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directionId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="blockId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wheelchairAccessible" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="bikeAllowed" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType"/&gt;
 *         &lt;element name="calendar" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="calendarDate" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}CalendarDatePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="office" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}OfficePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="shape" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}ShapePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod0MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripType", propOrder = {
    "headsign",
    "shortName",
    "directionId",
    "blockId",
    "wheelchairAccessible",
    "bikeAllowed",
    "symbol",
    "route",
    "calendar",
    "calendarDate",
    "office",
    "shape",
    "lod0MultiCurve"
})
public class TripType
    extends PublicTransitType
{

    protected String headsign;
    protected String shortName;
    protected CodeType directionId;
    protected String blockId;
    protected CodeType wheelchairAccessible;
    protected CodeType bikeAllowed;
    protected String symbol;
    @XmlElement(required = true)
    protected RoutePropertyType route;
    protected CalendarPropertyType calendar;
    protected CalendarDatePropertyType calendarDate;
    protected OfficePropertyType office;
    protected ShapePropertyType shape;
    protected MultiCurvePropertyType lod0MultiCurve;

    /**
     * Gets the value of the headsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadsign() {
        return headsign;
    }

    /**
     * Sets the value of the headsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadsign(String value) {
        this.headsign = value;
    }

    public boolean isSetHeadsign() {
        return (this.headsign!= null);
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    public boolean isSetShortName() {
        return (this.shortName!= null);
    }

    /**
     * Gets the value of the directionId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDirectionId() {
        return directionId;
    }

    /**
     * Sets the value of the directionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDirectionId(CodeType value) {
        this.directionId = value;
    }

    public boolean isSetDirectionId() {
        return (this.directionId!= null);
    }

    /**
     * Gets the value of the blockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockId() {
        return blockId;
    }

    /**
     * Sets the value of the blockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockId(String value) {
        this.blockId = value;
    }

    public boolean isSetBlockId() {
        return (this.blockId!= null);
    }

    /**
     * Gets the value of the wheelchairAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    /**
     * Sets the value of the wheelchairAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWheelchairAccessible(CodeType value) {
        this.wheelchairAccessible = value;
    }

    public boolean isSetWheelchairAccessible() {
        return (this.wheelchairAccessible!= null);
    }

    /**
     * Gets the value of the bikeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBikeAllowed() {
        return bikeAllowed;
    }

    /**
     * Sets the value of the bikeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBikeAllowed(CodeType value) {
        this.bikeAllowed = value;
    }

    public boolean isSetBikeAllowed() {
        return (this.bikeAllowed!= null);
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    public boolean isSetSymbol() {
        return (this.symbol!= null);
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePropertyType }
     *     
     */
    public RoutePropertyType getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePropertyType }
     *     
     */
    public void setRoute(RoutePropertyType value) {
        this.route = value;
    }

    public boolean isSetRoute() {
        return (this.route!= null);
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarPropertyType }
     *     
     */
    public CalendarPropertyType getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarPropertyType }
     *     
     */
    public void setCalendar(CalendarPropertyType value) {
        this.calendar = value;
    }

    public boolean isSetCalendar() {
        return (this.calendar!= null);
    }

    /**
     * Gets the value of the calendarDate property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDatePropertyType }
     *     
     */
    public CalendarDatePropertyType getCalendarDate() {
        return calendarDate;
    }

    /**
     * Sets the value of the calendarDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDatePropertyType }
     *     
     */
    public void setCalendarDate(CalendarDatePropertyType value) {
        this.calendarDate = value;
    }

    public boolean isSetCalendarDate() {
        return (this.calendarDate!= null);
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link OfficePropertyType }
     *     
     */
    public OfficePropertyType getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficePropertyType }
     *     
     */
    public void setOffice(OfficePropertyType value) {
        this.office = value;
    }

    public boolean isSetOffice() {
        return (this.office!= null);
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link ShapePropertyType }
     *     
     */
    public ShapePropertyType getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapePropertyType }
     *     
     */
    public void setShape(ShapePropertyType value) {
        this.shape = value;
    }

    public boolean isSetShape() {
        return (this.shape!= null);
    }

    /**
     * Gets the value of the lod0MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod0MultiCurve() {
        return lod0MultiCurve;
    }

    /**
     * Sets the value of the lod0MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod0MultiCurve(MultiCurvePropertyType value) {
        this.lod0MultiCurve = value;
    }

    public boolean isSetLod0MultiCurve() {
        return (this.lod0MultiCurve!= null);
    }

}
