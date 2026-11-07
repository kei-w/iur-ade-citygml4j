//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for TerminalAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}SquareUrbanPlanAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminalType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfBerthsPlanned" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfBerthsInService" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="userType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalAttributeType", propOrder = {
    "terminalType",
    "structure",
    "numberOfBerthsPlanned",
    "numberOfBerthsInService",
    "userType"
})
public class TerminalAttributeType
    extends SquareUrbanPlanAttributeType
{

    protected CodeType terminalType;
    protected String structure;
    protected BigInteger numberOfBerthsPlanned;
    protected BigInteger numberOfBerthsInService;
    protected CodeType userType;

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTerminalType(CodeType value) {
        this.terminalType = value;
    }

    public boolean isSetTerminalType() {
        return (this.terminalType!= null);
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructure(String value) {
        this.structure = value;
    }

    public boolean isSetStructure() {
        return (this.structure!= null);
    }

    /**
     * Gets the value of the numberOfBerthsPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBerthsPlanned() {
        return numberOfBerthsPlanned;
    }

    /**
     * Sets the value of the numberOfBerthsPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBerthsPlanned(BigInteger value) {
        this.numberOfBerthsPlanned = value;
    }

    public boolean isSetNumberOfBerthsPlanned() {
        return (this.numberOfBerthsPlanned!= null);
    }

    /**
     * Gets the value of the numberOfBerthsInService property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBerthsInService() {
        return numberOfBerthsInService;
    }

    /**
     * Sets the value of the numberOfBerthsInService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBerthsInService(BigInteger value) {
        this.numberOfBerthsInService = value;
    }

    public boolean isSetNumberOfBerthsInService() {
        return (this.numberOfBerthsInService!= null);
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUserType(CodeType value) {
        this.userType = value;
    }

    public boolean isSetUserType() {
        return (this.userType!= null);
    }

}
