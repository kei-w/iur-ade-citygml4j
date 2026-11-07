//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PopulationTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="population" type="{https://www.geospatial.jp/iur/urf/3.0}PopulationByAgeAndSexTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="populationDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationTypeType", propOrder = {
    "population",
    "populationDensity"
})
public class PopulationTypeType {

    protected List<PopulationByAgeAndSexTypePropertyType> population;
    protected Double populationDensity;

    /**
     * Gets the value of the population property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the population property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopulation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopulationByAgeAndSexTypePropertyType }
     * 
     * 
     */
    public List<PopulationByAgeAndSexTypePropertyType> getPopulation() {
        if (population == null) {
            population = new ArrayList<PopulationByAgeAndSexTypePropertyType>();
        }
        return this.population;
    }

    public boolean isSetPopulation() {
        return ((this.population!= null)&&(!this.population.isEmpty()));
    }

    public void unsetPopulation() {
        this.population = null;
    }

    /**
     * Gets the value of the populationDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPopulationDensity() {
        return populationDensity;
    }

    /**
     * Sets the value of the populationDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPopulationDensity(Double value) {
        this.populationDensity = value;
    }

    public boolean isSetPopulationDensity() {
        return (this.populationDensity!= null);
    }

}
