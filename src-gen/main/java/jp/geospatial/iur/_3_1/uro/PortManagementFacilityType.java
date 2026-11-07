//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PortManagementFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortManagementFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}PortAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="numberOfShipTypes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="unitOfShipType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="loadingCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="acquisitionYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="subsidy" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortManagementFacilityType", propOrder = {
    "totalFloorArea",
    "numberOfShipTypes",
    "unitOfShipType",
    "loadingCapacity",
    "acquisitionYear",
    "usage",
    "totalCost",
    "subsidy",
    "note"
})
public class PortManagementFacilityType
    extends PortAttributeType
{

    protected MeasureType totalFloorArea;
    protected BigInteger numberOfShipTypes;
    protected CodeType unitOfShipType;
    protected BigInteger loadingCapacity;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar acquisitionYear;
    protected String usage;
    protected BigInteger totalCost;
    protected BigInteger subsidy;
    protected String note;

    /**
     * Gets the value of the totalFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalFloorArea() {
        return totalFloorArea;
    }

    /**
     * Sets the value of the totalFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalFloorArea(MeasureType value) {
        this.totalFloorArea = value;
    }

    public boolean isSetTotalFloorArea() {
        return (this.totalFloorArea!= null);
    }

    /**
     * Gets the value of the numberOfShipTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfShipTypes() {
        return numberOfShipTypes;
    }

    /**
     * Sets the value of the numberOfShipTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfShipTypes(BigInteger value) {
        this.numberOfShipTypes = value;
    }

    public boolean isSetNumberOfShipTypes() {
        return (this.numberOfShipTypes!= null);
    }

    /**
     * Gets the value of the unitOfShipType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUnitOfShipType() {
        return unitOfShipType;
    }

    /**
     * Sets the value of the unitOfShipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUnitOfShipType(CodeType value) {
        this.unitOfShipType = value;
    }

    public boolean isSetUnitOfShipType() {
        return (this.unitOfShipType!= null);
    }

    /**
     * Gets the value of the loadingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoadingCapacity() {
        return loadingCapacity;
    }

    /**
     * Sets the value of the loadingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoadingCapacity(BigInteger value) {
        this.loadingCapacity = value;
    }

    public boolean isSetLoadingCapacity() {
        return (this.loadingCapacity!= null);
    }

    /**
     * Gets the value of the acquisitionYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionYear() {
        return acquisitionYear;
    }

    /**
     * Sets the value of the acquisitionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionYear(XMLGregorianCalendar value) {
        this.acquisitionYear = value;
    }

    public boolean isSetAcquisitionYear() {
        return (this.acquisitionYear!= null);
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    public boolean isSetUsage() {
        return (this.usage!= null);
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCost(BigInteger value) {
        this.totalCost = value;
    }

    public boolean isSetTotalCost() {
        return (this.totalCost!= null);
    }

    /**
     * Gets the value of the subsidy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubsidy() {
        return subsidy;
    }

    /**
     * Sets the value of the subsidy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubsidy(BigInteger value) {
        this.subsidy = value;
    }

    public boolean isSetSubsidy() {
        return (this.subsidy!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

}
