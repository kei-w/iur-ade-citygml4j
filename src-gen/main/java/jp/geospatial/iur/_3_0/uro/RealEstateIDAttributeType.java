//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 11:52:47 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealEstateIDAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateIDAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}BuildingAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realEstateIDOfBuilding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfBuildingUnitOwnership" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="realEstateIDOfBuildingUnitOwnership" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRealEstateIDOfLand" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="realEstateIDOfLand" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matchingScore" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateIDAttributeType", propOrder = {
    "realEstateIDOfBuilding",
    "numberOfBuildingUnitOwnership",
    "realEstateIDOfBuildingUnitOwnership",
    "numberOfRealEstateIDOfLand",
    "realEstateIDOfLand",
    "matchingScore"
})
public class RealEstateIDAttributeType
    extends BuildingAttributeType
{

    @XmlElement(required = true)
    protected String realEstateIDOfBuilding;
    protected BigInteger numberOfBuildingUnitOwnership;
    protected List<String> realEstateIDOfBuildingUnitOwnership;
    protected BigInteger numberOfRealEstateIDOfLand;
    protected List<String> realEstateIDOfLand;
    @XmlElement(required = true)
    protected BigInteger matchingScore;

    /**
     * Gets the value of the realEstateIDOfBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealEstateIDOfBuilding() {
        return realEstateIDOfBuilding;
    }

    /**
     * Sets the value of the realEstateIDOfBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealEstateIDOfBuilding(String value) {
        this.realEstateIDOfBuilding = value;
    }

    public boolean isSetRealEstateIDOfBuilding() {
        return (this.realEstateIDOfBuilding!= null);
    }

    /**
     * Gets the value of the numberOfBuildingUnitOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBuildingUnitOwnership() {
        return numberOfBuildingUnitOwnership;
    }

    /**
     * Sets the value of the numberOfBuildingUnitOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBuildingUnitOwnership(BigInteger value) {
        this.numberOfBuildingUnitOwnership = value;
    }

    public boolean isSetNumberOfBuildingUnitOwnership() {
        return (this.numberOfBuildingUnitOwnership!= null);
    }

    /**
     * Gets the value of the realEstateIDOfBuildingUnitOwnership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateIDOfBuildingUnitOwnership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateIDOfBuildingUnitOwnership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRealEstateIDOfBuildingUnitOwnership() {
        if (realEstateIDOfBuildingUnitOwnership == null) {
            realEstateIDOfBuildingUnitOwnership = new ArrayList<String>();
        }
        return this.realEstateIDOfBuildingUnitOwnership;
    }

    public boolean isSetRealEstateIDOfBuildingUnitOwnership() {
        return ((this.realEstateIDOfBuildingUnitOwnership!= null)&&(!this.realEstateIDOfBuildingUnitOwnership.isEmpty()));
    }

    public void unsetRealEstateIDOfBuildingUnitOwnership() {
        this.realEstateIDOfBuildingUnitOwnership = null;
    }

    /**
     * Gets the value of the numberOfRealEstateIDOfLand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRealEstateIDOfLand() {
        return numberOfRealEstateIDOfLand;
    }

    /**
     * Sets the value of the numberOfRealEstateIDOfLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRealEstateIDOfLand(BigInteger value) {
        this.numberOfRealEstateIDOfLand = value;
    }

    public boolean isSetNumberOfRealEstateIDOfLand() {
        return (this.numberOfRealEstateIDOfLand!= null);
    }

    /**
     * Gets the value of the realEstateIDOfLand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateIDOfLand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateIDOfLand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRealEstateIDOfLand() {
        if (realEstateIDOfLand == null) {
            realEstateIDOfLand = new ArrayList<String>();
        }
        return this.realEstateIDOfLand;
    }

    public boolean isSetRealEstateIDOfLand() {
        return ((this.realEstateIDOfLand!= null)&&(!this.realEstateIDOfLand.isEmpty()));
    }

    public void unsetRealEstateIDOfLand() {
        this.realEstateIDOfLand = null;
    }

    /**
     * Gets the value of the matchingScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchingScore() {
        return matchingScore;
    }

    /**
     * Sets the value of the matchingScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchingScore(BigInteger value) {
        this.matchingScore = value;
    }

    public boolean isSetMatchingScore() {
        return (this.matchingScore!= null);
    }

}
