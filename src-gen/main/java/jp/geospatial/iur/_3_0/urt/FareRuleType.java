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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for FareRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.0}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="destinationId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="containsId" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="fare" type="{https://www.geospatial.jp/iur/urt/3.0}FareAttributePropertyType"/&gt;
 *         &lt;element name="route" type="{https://www.geospatial.jp/iur/urt/3.0}RoutePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleType", propOrder = {
    "originId",
    "destinationId",
    "containsId",
    "fare",
    "route"
})
public class FareRuleType
    extends PublicTransitDataTypeType
{

    protected CodeType originId;
    protected CodeType destinationId;
    protected CodeType containsId;
    @XmlElement(required = true)
    protected FareAttributePropertyType fare;
    protected RoutePropertyType route;

    /**
     * Gets the value of the originId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOriginId() {
        return originId;
    }

    /**
     * Sets the value of the originId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOriginId(CodeType value) {
        this.originId = value;
    }

    public boolean isSetOriginId() {
        return (this.originId!= null);
    }

    /**
     * Gets the value of the destinationId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDestinationId(CodeType value) {
        this.destinationId = value;
    }

    public boolean isSetDestinationId() {
        return (this.destinationId!= null);
    }

    /**
     * Gets the value of the containsId property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getContainsId() {
        return containsId;
    }

    /**
     * Sets the value of the containsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setContainsId(CodeType value) {
        this.containsId = value;
    }

    public boolean isSetContainsId() {
        return (this.containsId!= null);
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link FareAttributePropertyType }
     *     
     */
    public FareAttributePropertyType getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAttributePropertyType }
     *     
     */
    public void setFare(FareAttributePropertyType value) {
        this.fare = value;
    }

    public boolean isSetFare() {
        return (this.fare!= null);
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

}
