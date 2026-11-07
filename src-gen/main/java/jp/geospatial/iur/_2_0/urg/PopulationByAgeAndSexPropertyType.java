//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:49:19 JST 2026
//


package jp.geospatial.iur._2_0.urg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PopulationByAgeAndSexPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopulationByAgeAndSexPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urg/2.0}PopulationByAgeAndSex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopulationByAgeAndSexPropertyType", propOrder = {
    "populationByAgeAndSex"
})
public class PopulationByAgeAndSexPropertyType {

    @XmlElement(name = "PopulationByAgeAndSex", required = true)
    protected PopulationByAgeAndSexType populationByAgeAndSex;

    /**
     * Gets the value of the populationByAgeAndSex property.
     * 
     * @return
     *     possible object is
     *     {@link PopulationByAgeAndSexType }
     *     
     */
    public PopulationByAgeAndSexType getPopulationByAgeAndSex() {
        return populationByAgeAndSex;
    }

    /**
     * Sets the value of the populationByAgeAndSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationByAgeAndSexType }
     *     
     */
    public void setPopulationByAgeAndSex(PopulationByAgeAndSexType value) {
        this.populationByAgeAndSex = value;
    }

    public boolean isSetPopulationByAgeAndSex() {
        return (this.populationByAgeAndSex!= null);
    }

}
