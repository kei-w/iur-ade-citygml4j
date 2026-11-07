//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:01:11 JST 2026
//


package jp.geospatial.iur._3_1.urg;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell with population values
 * 
 * <p>Java class for PopulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urg/3.1}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="daytimeOfficeCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeSchoolCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeUnder15" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeOver15" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="agriculturalWorker" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="nonCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="naturalIncrease" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="births" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deaths" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="socialIncrease" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="moveFrom" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="moveTo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="increasement" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="malePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="femalePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="populationByAgeAndSex" type="{https://www.geospatial.jp/iur/urg/3.1}PopulationByAgeAndSexPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationType", propOrder = {
    "total",
    "daytimePopulation",
    "daytimePopulationDensity",
    "daytimeOfficeCommuter",
    "daytimeSchoolCommuter",
    "daytimeUnder15",
    "daytimeOver15",
    "agriculturalWorker",
    "nonCommuter",
    "naturalIncrease",
    "births",
    "deaths",
    "socialIncrease",
    "moveFrom",
    "moveTo",
    "increasement",
    "malePopulation",
    "femalePopulation",
    "populationByAgeAndSex"
})
public class PopulationType
    extends StatisticalGridType
{

    protected BigInteger total;
    protected BigInteger daytimePopulation;
    protected Double daytimePopulationDensity;
    protected BigInteger daytimeOfficeCommuter;
    protected BigInteger daytimeSchoolCommuter;
    protected BigInteger daytimeUnder15;
    protected BigInteger daytimeOver15;
    protected BigInteger agriculturalWorker;
    protected BigInteger nonCommuter;
    protected BigInteger naturalIncrease;
    protected BigInteger births;
    protected BigInteger deaths;
    protected BigInteger socialIncrease;
    protected BigInteger moveFrom;
    protected BigInteger moveTo;
    protected BigInteger increasement;
    protected BigInteger malePopulation;
    protected BigInteger femalePopulation;
    protected List<PopulationByAgeAndSexPropertyType> populationByAgeAndSex;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    public boolean isSetTotal() {
        return (this.total!= null);
    }

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
     * Gets the value of the daytimeOfficeCommuter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimeOfficeCommuter() {
        return daytimeOfficeCommuter;
    }

    /**
     * Sets the value of the daytimeOfficeCommuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimeOfficeCommuter(BigInteger value) {
        this.daytimeOfficeCommuter = value;
    }

    public boolean isSetDaytimeOfficeCommuter() {
        return (this.daytimeOfficeCommuter!= null);
    }

    /**
     * Gets the value of the daytimeSchoolCommuter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimeSchoolCommuter() {
        return daytimeSchoolCommuter;
    }

    /**
     * Sets the value of the daytimeSchoolCommuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimeSchoolCommuter(BigInteger value) {
        this.daytimeSchoolCommuter = value;
    }

    public boolean isSetDaytimeSchoolCommuter() {
        return (this.daytimeSchoolCommuter!= null);
    }

    /**
     * Gets the value of the daytimeUnder15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimeUnder15() {
        return daytimeUnder15;
    }

    /**
     * Sets the value of the daytimeUnder15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimeUnder15(BigInteger value) {
        this.daytimeUnder15 = value;
    }

    public boolean isSetDaytimeUnder15() {
        return (this.daytimeUnder15 != null);
    }

    /**
     * Gets the value of the daytimeOver15 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaytimeOver15() {
        return daytimeOver15;
    }

    /**
     * Sets the value of the daytimeOver15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaytimeOver15(BigInteger value) {
        this.daytimeOver15 = value;
    }

    public boolean isSetDaytimeOver15() {
        return (this.daytimeOver15 != null);
    }

    /**
     * Gets the value of the agriculturalWorker property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgriculturalWorker() {
        return agriculturalWorker;
    }

    /**
     * Sets the value of the agriculturalWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgriculturalWorker(BigInteger value) {
        this.agriculturalWorker = value;
    }

    public boolean isSetAgriculturalWorker() {
        return (this.agriculturalWorker!= null);
    }

    /**
     * Gets the value of the nonCommuter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonCommuter() {
        return nonCommuter;
    }

    /**
     * Sets the value of the nonCommuter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonCommuter(BigInteger value) {
        this.nonCommuter = value;
    }

    public boolean isSetNonCommuter() {
        return (this.nonCommuter!= null);
    }

    /**
     * Gets the value of the naturalIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNaturalIncrease() {
        return naturalIncrease;
    }

    /**
     * Sets the value of the naturalIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNaturalIncrease(BigInteger value) {
        this.naturalIncrease = value;
    }

    public boolean isSetNaturalIncrease() {
        return (this.naturalIncrease!= null);
    }

    /**
     * Gets the value of the births property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBirths() {
        return births;
    }

    /**
     * Sets the value of the births property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBirths(BigInteger value) {
        this.births = value;
    }

    public boolean isSetBirths() {
        return (this.births!= null);
    }

    /**
     * Gets the value of the deaths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeaths() {
        return deaths;
    }

    /**
     * Sets the value of the deaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeaths(BigInteger value) {
        this.deaths = value;
    }

    public boolean isSetDeaths() {
        return (this.deaths!= null);
    }

    /**
     * Gets the value of the socialIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSocialIncrease() {
        return socialIncrease;
    }

    /**
     * Sets the value of the socialIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSocialIncrease(BigInteger value) {
        this.socialIncrease = value;
    }

    public boolean isSetSocialIncrease() {
        return (this.socialIncrease!= null);
    }

    /**
     * Gets the value of the moveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveFrom() {
        return moveFrom;
    }

    /**
     * Sets the value of the moveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveFrom(BigInteger value) {
        this.moveFrom = value;
    }

    public boolean isSetMoveFrom() {
        return (this.moveFrom!= null);
    }

    /**
     * Gets the value of the moveTo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveTo() {
        return moveTo;
    }

    /**
     * Sets the value of the moveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveTo(BigInteger value) {
        this.moveTo = value;
    }

    public boolean isSetMoveTo() {
        return (this.moveTo!= null);
    }

    /**
     * Gets the value of the increasement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncreasement() {
        return increasement;
    }

    /**
     * Sets the value of the increasement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncreasement(BigInteger value) {
        this.increasement = value;
    }

    public boolean isSetIncreasement() {
        return (this.increasement!= null);
    }

    /**
     * Gets the value of the malePopulation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePopulation() {
        return malePopulation;
    }

    /**
     * Sets the value of the malePopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePopulation(BigInteger value) {
        this.malePopulation = value;
    }

    public boolean isSetMalePopulation() {
        return (this.malePopulation!= null);
    }

    /**
     * Gets the value of the femalePopulation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePopulation() {
        return femalePopulation;
    }

    /**
     * Sets the value of the femalePopulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePopulation(BigInteger value) {
        this.femalePopulation = value;
    }

    public boolean isSetFemalePopulation() {
        return (this.femalePopulation!= null);
    }

    /**
     * Gets the value of the populationByAgeAndSex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the populationByAgeAndSex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulationByAgeAndSex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopulationByAgeAndSexPropertyType }
     * 
     * 
     */
    public List<PopulationByAgeAndSexPropertyType> getPopulationByAgeAndSex() {
        if (populationByAgeAndSex == null) {
            populationByAgeAndSex = new ArrayList<PopulationByAgeAndSexPropertyType>();
        }
        return this.populationByAgeAndSex;
    }

    public boolean isSetPopulationByAgeAndSex() {
        return ((this.populationByAgeAndSex!= null)&&(!this.populationByAgeAndSex.isEmpty()));
    }

    public void unsetPopulationByAgeAndSex() {
        this.populationByAgeAndSex = null;
    }

}
