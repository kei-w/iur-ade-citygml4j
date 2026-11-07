//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcGeometricRepresentationContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcGeometricRepresentationContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contextType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coordinateSpaceDimension" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="worldCoordinateSystem" type="{https://www.geospatial.jp/iur/uro/3.0}IfcAxis2Placement3DPropertyType"/&gt;
 *         &lt;element name="trueNorth" type="{http://www.opengis.net/gml}doubleList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcGeometricRepresentationContextType", propOrder = {
    "contextIdentifier",
    "contextType",
    "coordinateSpaceDimension",
    "precision",
    "worldCoordinateSystem",
    "trueNorth"
})
public class IfcGeometricRepresentationContextType {

    protected String contextIdentifier;
    protected String contextType;
    protected BigInteger coordinateSpaceDimension;
    protected Double precision;
    @XmlElement(required = true)
    protected IfcAxis2Placement3DPropertyType worldCoordinateSystem;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> trueNorth;

    /**
     * Gets the value of the contextIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextIdentifier() {
        return contextIdentifier;
    }

    /**
     * Sets the value of the contextIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextIdentifier(String value) {
        this.contextIdentifier = value;
    }

    public boolean isSetContextIdentifier() {
        return (this.contextIdentifier!= null);
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextType(String value) {
        this.contextType = value;
    }

    public boolean isSetContextType() {
        return (this.contextType!= null);
    }

    /**
     * Gets the value of the coordinateSpaceDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoordinateSpaceDimension() {
        return coordinateSpaceDimension;
    }

    /**
     * Sets the value of the coordinateSpaceDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoordinateSpaceDimension(BigInteger value) {
        this.coordinateSpaceDimension = value;
    }

    public boolean isSetCoordinateSpaceDimension() {
        return (this.coordinateSpaceDimension!= null);
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecision(Double value) {
        this.precision = value;
    }

    public boolean isSetPrecision() {
        return (this.precision!= null);
    }

    /**
     * Gets the value of the worldCoordinateSystem property.
     * 
     * @return
     *     possible object is
     *     {@link IfcAxis2Placement3DPropertyType }
     *     
     */
    public IfcAxis2Placement3DPropertyType getWorldCoordinateSystem() {
        return worldCoordinateSystem;
    }

    /**
     * Sets the value of the worldCoordinateSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcAxis2Placement3DPropertyType }
     *     
     */
    public void setWorldCoordinateSystem(IfcAxis2Placement3DPropertyType value) {
        this.worldCoordinateSystem = value;
    }

    public boolean isSetWorldCoordinateSystem() {
        return (this.worldCoordinateSystem!= null);
    }

    /**
     * Gets the value of the trueNorth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trueNorth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrueNorth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTrueNorth() {
        if (trueNorth == null) {
            trueNorth = new ArrayList<Double>();
        }
        return this.trueNorth;
    }

    public boolean isSetTrueNorth() {
        return ((this.trueNorth!= null)&&(!this.trueNorth.isEmpty()));
    }

    public void unsetTrueNorth() {
        this.trueNorth = null;
    }

}
