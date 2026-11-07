//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaytimePopulationTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaytimePopulationTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="daytimePopulation" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="daytimeOfficeCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeSchoolCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeUnder15" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="daytimeOver15" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="agriculturalWorker" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="nonCommuter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaytimePopulationTypeType", propOrder = {
    "daytimePopulation",
    "daytimePopulationDensity",
    "daytimeOfficeCommuter",
    "daytimeSchoolCommuter",
    "daytimeUnder15",
    "daytimeOver15",
    "agriculturalWorker",
    "nonCommuter"
})
public class DaytimePopulationTypeType {

    protected BigInteger daytimePopulation;
    protected Double daytimePopulationDensity;
    protected BigInteger daytimeOfficeCommuter;
    protected BigInteger daytimeSchoolCommuter;
    protected BigInteger daytimeUnder15;
    protected BigInteger daytimeOver15;
    protected BigInteger agriculturalWorker;
    protected BigInteger nonCommuter;

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

}
