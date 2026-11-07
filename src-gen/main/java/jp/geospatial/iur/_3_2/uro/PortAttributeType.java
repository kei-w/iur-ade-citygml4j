//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for PortAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}FacilityAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="portFacilityDetailsType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="portStatus" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grantType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="isDesignated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="degradationLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortAttributeType", propOrder = {
    "portFacilityDetailsType",
    "portName",
    "portStatus",
    "district",
    "grantType",
    "isDesignated",
    "degradationLevel"
})
@XmlSeeAlso({
    CargoHandlingFacilityType.class,
    CyberportMarinaAndPBSType.class,
    HarborFacilityType.class,
    MooringFacilityType.class,
    NavigationAssistanceFacilityType.class,
    PortEnvironmentalImprovementFacilityType.class,
    PortManagementFacilityType.class,
    PortPassengerFacilityType.class,
    PortPollutionControlFacilityType.class,
    PortProtectiveFacilityType.class,
    PortStorageFacilityType.class,
    PortTransportationFacilityType.class,
    PortWasteTreatmentFacilityType.class,
    PortWelfareFacilityType.class,
    ShipServiceFacilityType.class
})
public abstract class PortAttributeType
    extends FacilityAttributeType
{

    @XmlElement(required = true)
    protected CodeType portFacilityDetailsType;
    @XmlElement(required = true)
    protected String portName;
    protected CodeType portStatus;
    protected String district;
    protected CodeType grantType;
    protected Boolean isDesignated;
    protected BigInteger degradationLevel;

    /**
     * Gets the value of the portFacilityDetailsType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPortFacilityDetailsType() {
        return portFacilityDetailsType;
    }

    /**
     * Sets the value of the portFacilityDetailsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPortFacilityDetailsType(CodeType value) {
        this.portFacilityDetailsType = value;
    }

    public boolean isSetPortFacilityDetailsType() {
        return (this.portFacilityDetailsType!= null);
    }

    /**
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    public boolean isSetPortName() {
        return (this.portName!= null);
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPortStatus(CodeType value) {
        this.portStatus = value;
    }

    public boolean isSetPortStatus() {
        return (this.portStatus!= null);
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    public boolean isSetDistrict() {
        return (this.district!= null);
    }

    /**
     * Gets the value of the grantType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGrantType() {
        return grantType;
    }

    /**
     * Sets the value of the grantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGrantType(CodeType value) {
        this.grantType = value;
    }

    public boolean isSetGrantType() {
        return (this.grantType!= null);
    }

    /**
     * Gets the value of the isDesignated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDesignated() {
        return isDesignated;
    }

    /**
     * Sets the value of the isDesignated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDesignated(Boolean value) {
        this.isDesignated = value;
    }

    public boolean isSetIsDesignated() {
        return (this.isDesignated!= null);
    }

    /**
     * Gets the value of the degradationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegradationLevel() {
        return degradationLevel;
    }

    /**
     * Sets the value of the degradationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegradationLevel(BigInteger value) {
        this.degradationLevel = value;
    }

    public boolean isSetDegradationLevel() {
        return (this.degradationLevel!= null);
    }

}
