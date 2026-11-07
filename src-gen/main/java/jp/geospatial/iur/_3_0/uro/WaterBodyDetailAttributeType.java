//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for WaterBodyDetailAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterBodyDetailAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waterSystemCode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="riverCode" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="adminType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="flowDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maximumDepth" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="waterSurfaceElevation" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="measurementYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="prefecture" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterBodyDetailAttributeType", propOrder = {
    "kana",
    "waterSystemCode",
    "riverCode",
    "adminType",
    "flowDirection",
    "maximumDepth",
    "waterSurfaceElevation",
    "area",
    "measurementYearMonth",
    "prefecture",
    "city"
})
public class WaterBodyDetailAttributeType {

    protected String kana;
    protected CodeType waterSystemCode;
    protected CodeType riverCode;
    protected CodeType adminType;
    protected Boolean flowDirection;
    protected LengthType maximumDepth;
    protected LengthType waterSurfaceElevation;
    protected MeasureType area;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar measurementYearMonth;
    protected List<CodeType> prefecture;
    protected List<CodeType> city;

    /**
     * Gets the value of the kana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKana() {
        return kana;
    }

    /**
     * Sets the value of the kana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKana(String value) {
        this.kana = value;
    }

    public boolean isSetKana() {
        return (this.kana!= null);
    }

    /**
     * Gets the value of the waterSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getWaterSystemCode() {
        return waterSystemCode;
    }

    /**
     * Sets the value of the waterSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setWaterSystemCode(CodeType value) {
        this.waterSystemCode = value;
    }

    public boolean isSetWaterSystemCode() {
        return (this.waterSystemCode!= null);
    }

    /**
     * Gets the value of the riverCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRiverCode() {
        return riverCode;
    }

    /**
     * Sets the value of the riverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRiverCode(CodeType value) {
        this.riverCode = value;
    }

    public boolean isSetRiverCode() {
        return (this.riverCode!= null);
    }

    /**
     * Gets the value of the adminType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAdminType() {
        return adminType;
    }

    /**
     * Sets the value of the adminType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAdminType(CodeType value) {
        this.adminType = value;
    }

    public boolean isSetAdminType() {
        return (this.adminType!= null);
    }

    /**
     * Gets the value of the flowDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlowDirection() {
        return flowDirection;
    }

    /**
     * Sets the value of the flowDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlowDirection(Boolean value) {
        this.flowDirection = value;
    }

    public boolean isSetFlowDirection() {
        return (this.flowDirection!= null);
    }

    /**
     * Gets the value of the maximumDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMaximumDepth() {
        return maximumDepth;
    }

    /**
     * Sets the value of the maximumDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMaximumDepth(LengthType value) {
        this.maximumDepth = value;
    }

    public boolean isSetMaximumDepth() {
        return (this.maximumDepth!= null);
    }

    /**
     * Gets the value of the waterSurfaceElevation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getWaterSurfaceElevation() {
        return waterSurfaceElevation;
    }

    /**
     * Sets the value of the waterSurfaceElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setWaterSurfaceElevation(LengthType value) {
        this.waterSurfaceElevation = value;
    }

    public boolean isSetWaterSurfaceElevation() {
        return (this.waterSurfaceElevation!= null);
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setArea(MeasureType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the measurementYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementYearMonth() {
        return measurementYearMonth;
    }

    /**
     * Sets the value of the measurementYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementYearMonth(XMLGregorianCalendar value) {
        this.measurementYearMonth = value;
    }

    public boolean isSetMeasurementYearMonth() {
        return (this.measurementYearMonth!= null);
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

}
