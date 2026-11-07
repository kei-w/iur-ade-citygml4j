//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.go.kantei.iur._1_4.urg;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell with the number of households
 * 
 * <p>Java class for HouseholdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOrdinaryHousehold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numberOfHouseholdsByOwnership" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfHouseholdsByStructure" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}NumberOfHouseholdsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfMainHousehold" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdsType", propOrder = {
    "numberOfOrdinaryHousehold",
    "numberOfHouseholdsByOwnership",
    "numberOfHouseholdsByStructure",
    "numberOfMainHousehold"
})
public class HouseholdsType
    extends StatisticalGridType
{

    @XmlElement(required = true)
    protected BigInteger numberOfOrdinaryHousehold;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByOwnership;
    protected List<NumberOfHouseholdsPropertyType> numberOfHouseholdsByStructure;
    @XmlElement(required = true)
    protected BigInteger numberOfMainHousehold;

    /**
     * Gets the value of the numberOfOrdinaryHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOrdinaryHousehold() {
        return numberOfOrdinaryHousehold;
    }

    /**
     * Sets the value of the numberOfOrdinaryHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOrdinaryHousehold(BigInteger value) {
        this.numberOfOrdinaryHousehold = value;
    }

    public boolean isSetNumberOfOrdinaryHousehold() {
        return (this.numberOfOrdinaryHousehold!= null);
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
     * Gets the value of the numberOfHouseholdsByStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfHouseholdsByStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfHouseholdsByStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfHouseholdsPropertyType }
     * 
     * 
     */
    public List<NumberOfHouseholdsPropertyType> getNumberOfHouseholdsByStructure() {
        if (numberOfHouseholdsByStructure == null) {
            numberOfHouseholdsByStructure = new ArrayList<NumberOfHouseholdsPropertyType>();
        }
        return this.numberOfHouseholdsByStructure;
    }

    public boolean isSetNumberOfHouseholdsByStructure() {
        return ((this.numberOfHouseholdsByStructure!= null)&&(!this.numberOfHouseholdsByStructure.isEmpty()));
    }

    public void unsetNumberOfHouseholdsByStructure() {
        this.numberOfHouseholdsByStructure = null;
    }

    /**
     * Gets the value of the numberOfMainHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMainHousehold() {
        return numberOfMainHousehold;
    }

    /**
     * Sets the value of the numberOfMainHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMainHousehold(BigInteger value) {
        this.numberOfMainHousehold = value;
    }

    public boolean isSetNumberOfMainHousehold() {
        return (this.numberOfMainHousehold!= null);
    }

}
