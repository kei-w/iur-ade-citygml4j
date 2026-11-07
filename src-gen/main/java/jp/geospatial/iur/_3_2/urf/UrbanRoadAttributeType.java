//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UrbanRoadAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanRoadAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeTypeNumber" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="routeSizeNumber" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="routeSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roadType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfLanes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="roadStructure" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="structureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="crossType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="trafficPlazas" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="structuralDetails" type="{https://www.geospatial.jp/iur/urf/3.2}StructureDetailsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanRoadAttributeType", propOrder = {
    "routeTypeNumber",
    "routeSizeNumber",
    "routeSerialNumber",
    "roadType",
    "numberOfLanes",
    "roadStructure",
    "structureType",
    "crossType",
    "trafficPlazas",
    "structuralDetails"
})
public class UrbanRoadAttributeType {

    protected CodeType routeTypeNumber;
    protected CodeType routeSizeNumber;
    protected String routeSerialNumber;
    protected CodeType roadType;
    protected BigInteger numberOfLanes;
    protected StringOrRefType roadStructure;
    protected CodeType structureType;
    protected CodeType crossType;
    protected CodeType trafficPlazas;
    protected List<StructureDetailsPropertyType> structuralDetails;

    /**
     * Gets the value of the routeTypeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRouteTypeNumber() {
        return routeTypeNumber;
    }

    /**
     * Sets the value of the routeTypeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRouteTypeNumber(CodeType value) {
        this.routeTypeNumber = value;
    }

    public boolean isSetRouteTypeNumber() {
        return (this.routeTypeNumber!= null);
    }

    /**
     * Gets the value of the routeSizeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRouteSizeNumber() {
        return routeSizeNumber;
    }

    /**
     * Sets the value of the routeSizeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRouteSizeNumber(CodeType value) {
        this.routeSizeNumber = value;
    }

    public boolean isSetRouteSizeNumber() {
        return (this.routeSizeNumber!= null);
    }

    /**
     * Gets the value of the routeSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteSerialNumber() {
        return routeSerialNumber;
    }

    /**
     * Sets the value of the routeSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteSerialNumber(String value) {
        this.routeSerialNumber = value;
    }

    public boolean isSetRouteSerialNumber() {
        return (this.routeSerialNumber!= null);
    }

    /**
     * Gets the value of the roadType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRoadType() {
        return roadType;
    }

    /**
     * Sets the value of the roadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRoadType(CodeType value) {
        this.roadType = value;
    }

    public boolean isSetRoadType() {
        return (this.roadType!= null);
    }

    /**
     * Gets the value of the numberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLanes() {
        return numberOfLanes;
    }

    /**
     * Sets the value of the numberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLanes(BigInteger value) {
        this.numberOfLanes = value;
    }

    public boolean isSetNumberOfLanes() {
        return (this.numberOfLanes!= null);
    }

    /**
     * Gets the value of the roadStructure property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getRoadStructure() {
        return roadStructure;
    }

    /**
     * Sets the value of the roadStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setRoadStructure(StringOrRefType value) {
        this.roadStructure = value;
    }

    public boolean isSetRoadStructure() {
        return (this.roadStructure!= null);
    }

    /**
     * Gets the value of the structureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStructureType() {
        return structureType;
    }

    /**
     * Sets the value of the structureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStructureType(CodeType value) {
        this.structureType = value;
    }

    public boolean isSetStructureType() {
        return (this.structureType!= null);
    }

    /**
     * Gets the value of the crossType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCrossType() {
        return crossType;
    }

    /**
     * Sets the value of the crossType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCrossType(CodeType value) {
        this.crossType = value;
    }

    public boolean isSetCrossType() {
        return (this.crossType!= null);
    }

    /**
     * Gets the value of the trafficPlazas property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTrafficPlazas() {
        return trafficPlazas;
    }

    /**
     * Sets the value of the trafficPlazas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTrafficPlazas(CodeType value) {
        this.trafficPlazas = value;
    }

    public boolean isSetTrafficPlazas() {
        return (this.trafficPlazas!= null);
    }

    /**
     * Gets the value of the structuralDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structuralDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructuralDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructureDetailsPropertyType }
     * 
     * 
     */
    public List<StructureDetailsPropertyType> getStructuralDetails() {
        if (structuralDetails == null) {
            structuralDetails = new ArrayList<StructureDetailsPropertyType>();
        }
        return this.structuralDetails;
    }

    public boolean isSetStructuralDetails() {
        return ((this.structuralDetails!= null)&&(!this.structuralDetails.isEmpty()));
    }

    public void unsetStructuralDetails() {
        this.structuralDetails = null;
    }

}
