//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.go.kantei.iur._1_4.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MultiCurvePropertyType;


/**
 * <p>Java class for RouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}DescriptionPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="originStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viaStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeSortOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="continuousPickup" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="continuousDropOff" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="agency" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}AgencyPropertyType"/&gt;
 *         &lt;element name="parentRoute" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}RoutePropertyType" minOccurs="0"/&gt;
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
@XmlType(name = "RouteType", propOrder = {
    "shortName",
    "longName",
    "routeDescription",
    "type",
    "url",
    "color",
    "textColor",
    "updateDate",
    "originStop",
    "viaStop",
    "destinationStop",
    "routeSortOrder",
    "continuousPickup",
    "continuousDropOff",
    "agency",
    "parentRoute",
    "lod0MultiCurve"
})
public class RouteType
    extends PublicTransitType
{

    protected String shortName;
    protected String longName;
    @XmlElement(name = "description")
    protected DescriptionPropertyType routeDescription;
    @XmlElement(required = true)
    protected CodeType type;
    protected String url;
    protected String color;
    protected String textColor;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    protected String originStop;
    protected String viaStop;
    protected String destinationStop;
    protected BigInteger routeSortOrder;
    protected CodeType continuousPickup;
    protected CodeType continuousDropOff;
    @XmlElement(required = true)
    protected AgencyPropertyType agency;
    protected RoutePropertyType parentRoute;
    protected MultiCurvePropertyType lod0MultiCurve;

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
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    public boolean isSetLongName() {
        return (this.longName!= null);
    }

    /**
     * Gets the value of the routeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionPropertyType }
     *     
     */
    public DescriptionPropertyType getRouteDescription() {
        return routeDescription;
    }

    /**
     * Sets the value of the routeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionPropertyType }
     *     
     */
    public void setRouteDescription(DescriptionPropertyType value) {
        this.routeDescription = value;
    }

    public boolean isSetRouteDescription() {
        return (this.routeDescription!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
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
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    public boolean isSetColor() {
        return (this.color!= null);
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    public boolean isSetTextColor() {
        return (this.textColor!= null);
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    public boolean isSetUpdateDate() {
        return (this.updateDate!= null);
    }

    /**
     * Gets the value of the originStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStop() {
        return originStop;
    }

    /**
     * Sets the value of the originStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStop(String value) {
        this.originStop = value;
    }

    public boolean isSetOriginStop() {
        return (this.originStop!= null);
    }

    /**
     * Gets the value of the viaStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaStop() {
        return viaStop;
    }

    /**
     * Sets the value of the viaStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaStop(String value) {
        this.viaStop = value;
    }

    public boolean isSetViaStop() {
        return (this.viaStop!= null);
    }

    /**
     * Gets the value of the destinationStop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStop() {
        return destinationStop;
    }

    /**
     * Sets the value of the destinationStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStop(String value) {
        this.destinationStop = value;
    }

    public boolean isSetDestinationStop() {
        return (this.destinationStop!= null);
    }

    /**
     * Gets the value of the routeSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteSortOrder() {
        return routeSortOrder;
    }

    /**
     * Sets the value of the routeSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteSortOrder(BigInteger value) {
        this.routeSortOrder = value;
    }

    public boolean isSetRouteSortOrder() {
        return (this.routeSortOrder!= null);
    }

    /**
     * Gets the value of the continuousPickup property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousPickup() {
        return continuousPickup;
    }

    /**
     * Sets the value of the continuousPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousPickup(CodeType value) {
        this.continuousPickup = value;
    }

    public boolean isSetContinuousPickup() {
        return (this.continuousPickup!= null);
    }

    /**
     * Gets the value of the continuousDropOff property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContinuousDropOff() {
        return continuousDropOff;
    }

    /**
     * Sets the value of the continuousDropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContinuousDropOff(CodeType value) {
        this.continuousDropOff = value;
    }

    public boolean isSetContinuousDropOff() {
        return (this.continuousDropOff!= null);
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyPropertyType }
     *     
     */
    public AgencyPropertyType getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyPropertyType }
     *     
     */
    public void setAgency(AgencyPropertyType value) {
        this.agency = value;
    }

    public boolean isSetAgency() {
        return (this.agency!= null);
    }

    /**
     * Gets the value of the parentRoute property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePropertyType }
     *     
     */
    public RoutePropertyType getParentRoute() {
        return parentRoute;
    }

    /**
     * Sets the value of the parentRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePropertyType }
     *     
     */
    public void setParentRoute(RoutePropertyType value) {
        this.parentRoute = value;
    }

    public boolean isSetParentRoute() {
        return (this.parentRoute!= null);
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
