//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for FacilityIdAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityIdAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startLat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="startLong" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="alternativeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityIdAttributeType", propOrder = {
    "id",
    "partId",
    "branchId",
    "prefecture",
    "city",
    "route",
    "startPost",
    "endPost",
    "startLat",
    "startLong",
    "alternativeName"
})
@XmlSeeAlso({
    RiverFacilityIdAttributeType.class
})
public class FacilityIdAttributeType {

    protected String id;
    protected String partId;
    protected String branchId;
    protected List<CodeType> prefecture;
    protected List<CodeType> city;
    protected String route;
    protected String startPost;
    protected String endPost;
    protected Double startLat;
    protected Double startLong;
    protected List<String> alternativeName;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the partId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartId() {
        return partId;
    }

    /**
     * Sets the value of the partId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartId(String value) {
        this.partId = value;
    }

    public boolean isSetPartId() {
        return (this.partId!= null);
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    public boolean isSetBranchId() {
        return (this.branchId!= null);
    }

    /**
     * Gets the value of the prefecture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefecture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefecture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPrefecture() {
        if (prefecture == null) {
            prefecture = new ArrayList<CodeType>();
        }
        return this.prefecture;
    }

    public boolean isSetPrefecture() {
        return ((this.prefecture!= null)&&(!this.prefecture.isEmpty()));
    }

    public void unsetPrefecture() {
        this.prefecture = null;
    }

    /**
     * Gets the value of the city property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the city property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCity() {
        if (city == null) {
            city = new ArrayList<CodeType>();
        }
        return this.city;
    }

    public boolean isSetCity() {
        return ((this.city!= null)&&(!this.city.isEmpty()));
    }

    public void unsetCity() {
        this.city = null;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    public boolean isSetRoute() {
        return (this.route!= null);
    }

    /**
     * Gets the value of the startPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPost() {
        return startPost;
    }

    /**
     * Sets the value of the startPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPost(String value) {
        this.startPost = value;
    }

    public boolean isSetStartPost() {
        return (this.startPost!= null);
    }

    /**
     * Gets the value of the endPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPost() {
        return endPost;
    }

    /**
     * Sets the value of the endPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPost(String value) {
        this.endPost = value;
    }

    public boolean isSetEndPost() {
        return (this.endPost!= null);
    }

    /**
     * Gets the value of the startLat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartLat() {
        return startLat;
    }

    /**
     * Sets the value of the startLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartLat(Double value) {
        this.startLat = value;
    }

    public boolean isSetStartLat() {
        return (this.startLat!= null);
    }

    /**
     * Gets the value of the startLong property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStartLong() {
        return startLong;
    }

    /**
     * Sets the value of the startLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStartLong(Double value) {
        this.startLong = value;
    }

    public boolean isSetStartLong() {
        return (this.startLong!= null);
    }

    /**
     * Gets the value of the alternativeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternativeName() {
        if (alternativeName == null) {
            alternativeName = new ArrayList<String>();
        }
        return this.alternativeName;
    }

    public boolean isSetAlternativeName() {
        return ((this.alternativeName!= null)&&(!this.alternativeName.isEmpty()));
    }

    public void unsetAlternativeName() {
        this.alternativeName = null;
    }

}
