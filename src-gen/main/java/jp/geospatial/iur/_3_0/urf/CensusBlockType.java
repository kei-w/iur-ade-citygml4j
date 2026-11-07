//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CensusBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CensusBlockType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="townName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blockName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="populationType" type="{https://www.geospatial.jp/iur/urf/3.0}PopulationTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="daytimePopulationType" type="{https://www.geospatial.jp/iur/urf/3.0}DaytimePopulationTypePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="economicActivityType" type="{https://www.geospatial.jp/iur/urf/3.0}EconomicActivityTypePropertyType" minOccurs="0"/&gt;
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
    "townName",
    "blockName",
    "populationType",
    "daytimePopulationType",
    "economicActivityType"
})
public class CensusBlockType
    extends UrbanFunctionType
{

    protected String townName;
    protected String blockName;
    protected PopulationTypePropertyType populationType;
    protected DaytimePopulationTypePropertyType daytimePopulationType;
    protected EconomicActivityTypePropertyType economicActivityType;

    /**
     * Gets the value of the townName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownName() {
        return townName;
    }

    /**
     * Sets the value of the townName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownName(String value) {
        this.townName = value;
    }

    public boolean isSetTownName() {
        return (this.townName!= null);
    }

    /**
     * Gets the value of the blockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * Sets the value of the blockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockName(String value) {
        this.blockName = value;
    }

    public boolean isSetBlockName() {
        return (this.blockName!= null);
    }

    /**
     * Gets the value of the populationType property.
     * 
     * @return
     *     possible object is
     *     {@link PopulationTypePropertyType }
     *     
     */
    public PopulationTypePropertyType getPopulationType() {
        return populationType;
    }

    /**
     * Sets the value of the populationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopulationTypePropertyType }
     *     
     */
    public void setPopulationType(PopulationTypePropertyType value) {
        this.populationType = value;
    }

    public boolean isSetPopulationType() {
        return (this.populationType!= null);
    }

    /**
     * Gets the value of the daytimePopulationType property.
     * 
     * @return
     *     possible object is
     *     {@link DaytimePopulationTypePropertyType }
     *     
     */
    public DaytimePopulationTypePropertyType getDaytimePopulationType() {
        return daytimePopulationType;
    }

    /**
     * Sets the value of the daytimePopulationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaytimePopulationTypePropertyType }
     *     
     */
    public void setDaytimePopulationType(DaytimePopulationTypePropertyType value) {
        this.daytimePopulationType = value;
    }

    public boolean isSetDaytimePopulationType() {
        return (this.daytimePopulationType!= null);
    }

    /**
     * Gets the value of the economicActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicActivityTypePropertyType }
     *     
     */
    public EconomicActivityTypePropertyType getEconomicActivityType() {
        return economicActivityType;
    }

    /**
     * Sets the value of the economicActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicActivityTypePropertyType }
     *     
     */
    public void setEconomicActivityType(EconomicActivityTypePropertyType value) {
        this.economicActivityType = value;
    }

    public boolean isSetEconomicActivityType() {
        return (this.economicActivityType!= null);
    }

}
