//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Block for census survey
 * 
 * <p>Java class for CensusBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusBlockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="daytimePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numberOfOrdinaryHouseholds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByOwnership" type="{https://www.geospatial.jp/iur/urf/2.0}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMainHouseholds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByStruture" type="{https://www.geospatial.jp/iur/urf/2.0}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CensusBlockType", propOrder = {
    "daytimePopulation",
    "daytimePopulationDensity",
    "numberOfOrdinaryHouseholds",
    "numberOfHouseholdsByOwnership",
    "numberOfMainHouseholds",
    "numberOfHouseholdsByStruture"
})
public class CensusBlockType
    extends UrbanFunctionType
{

    protected BigInteger daytimePopulation;
    protected Double daytimePopulationDensity;
    protected BigInteger numberOfOrdinaryHouseholds;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByOwnership;
    protected BigInteger numberOfMainHouseholds;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByStruture;

    /**
     * Gets the value of the daytimePopulation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimePopulation() {
        return daytimePopulation;
    }

    /**
     * Sets the value of the daytimePopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimePopulation(BigInteger value) {
        this.daytimePopulation = value;
    }

    public boolean isSetDaytimePopulation() {
        return (this.daytimePopulation!= null);
    }

    /**
     * Gets the value of the daytimePopulationDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDaytimePopulationDensity() {
        return daytimePopulationDensity;
    }

    /**
     * Sets the value of the daytimePopulationDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDaytimePopulationDensity(Double value) {
        this.daytimePopulationDensity = value;
    }

    public boolean isSetDaytimePopulationDensity() {
        return (this.daytimePopulationDensity!= null);
    }

    /**
     * Gets the value of the numberOfOrdinaryHouseholds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOrdinaryHouseholds() {
        return numberOfOrdinaryHouseholds;
    }

    /**
     * Sets the value of the numberOfOrdinaryHouseholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOrdinaryHouseholds(BigInteger value) {
        this.numberOfOrdinaryHouseholds = value;
    }

    public boolean isSetNumberOfOrdinaryHouseholds() {
        return (this.numberOfOrdinaryHouseholds!= null);
    }

    /**
     * Gets the value of the numberOfHouseholdsByOwnership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByOwnership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByOwnership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByOwnership() {
        if (numberOfHouseholdsByOwnership == null) {
            numberOfHouseholdsByOwnership = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByOwnership;
    }

    public boolean isSetNumberOfHouseholdsByOwnership() {
        return ((this.numberOfHouseholdsByOwnership!= null)&&(!this.numberOfHouseholdsByOwnership.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByOwnership() {
        this.numberOfHouseholdsByOwnership = null;
    }

    /**
     * Gets the value of the numberOfMainHouseholds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMainHouseholds() {
        return numberOfMainHouseholds;
    }

    /**
     * Sets the value of the numberOfMainHouseholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMainHouseholds(BigInteger value) {
        this.numberOfMainHouseholds = value;
    }

    public boolean isSetNumberOfMainHouseholds() {
        return (this.numberOfMainHouseholds!= null);
    }

    /**
     * Gets the value of the numberOfHouseholdsByStruture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByStruture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByStruture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByStruture() {
        if (numberOfHouseholdsByStruture == null) {
            numberOfHouseholdsByStruture = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByStruture;
    }

    public boolean isSetNumberOfHouseholdsByStruture() {
        return ((this.numberOfHouseholdsByStruture!= null)&&(!this.numberOfHouseholdsByStruture.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByStruture() {
        this.numberOfHouseholdsByStruture = null;
    }

}
