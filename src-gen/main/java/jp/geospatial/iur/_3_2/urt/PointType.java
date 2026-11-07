//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.PointPropertyType;


/**
 * <p>Java class for PointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="point" type="{http://www.opengis.net/gml}PointPropertyType"/&gt;
 *         &lt;element name="pointSequence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="pointDistanceTraveled" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointType", propOrder = {
    "latitude",
    "longitude",
    "point",
    "pointSequence",
    "pointDistanceTraveled"
})
public class PointType {

    protected double latitude;
    protected double longitude;
    @XmlElement(required = true)
    protected PointPropertyType point;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pointSequence;
    protected Double pointDistanceTraveled;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    public boolean isSetLatitude() {
        return true;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    public boolean isSetLongitude() {
        return true;
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
     * Gets the value of the pointSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointSequence() {
        return pointSequence;
    }

    /**
     * Sets the value of the pointSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointSequence(BigInteger value) {
        this.pointSequence = value;
    }

    public boolean isSetPointSequence() {
        return (this.pointSequence!= null);
    }

    /**
     * Gets the value of the pointDistanceTraveled property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointDistanceTraveled() {
        return pointDistanceTraveled;
    }

    /**
     * Sets the value of the pointDistanceTraveled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointDistanceTraveled(Double value) {
        this.pointDistanceTraveled = value;
    }

    public boolean isSetPointDistanceTraveled() {
        return (this.pointDistanceTraveled!= null);
    }

}
