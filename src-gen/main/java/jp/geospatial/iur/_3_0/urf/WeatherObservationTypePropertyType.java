//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherObservationTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherObservationTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urf/3.0}WeatherObservationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherObservationTypePropertyType", propOrder = {
    "weatherObservationType"
})
public class WeatherObservationTypePropertyType {

    @XmlElement(name = "WeatherObservationType", required = true)
    protected WeatherObservationTypeType weatherObservationType;

    /**
     * Gets the value of the weatherObservationType property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherObservationTypeType }
     *     
     */
    public WeatherObservationTypeType getWeatherObservationType() {
        return weatherObservationType;
    }

    /**
     * Sets the value of the weatherObservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherObservationTypeType }
     *     
     */
    public void setWeatherObservationType(WeatherObservationTypeType value) {
        this.weatherObservationType = value;
    }

    public boolean isSetWeatherObservationType() {
        return (this.weatherObservationType!= null);
    }

}
