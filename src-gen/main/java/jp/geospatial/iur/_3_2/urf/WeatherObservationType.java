//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherObservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherObservationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}_UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherObservationType" type="{https://www.geospatial.jp/iur/urf/3.2}WeatherObservationTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherObservationType", propOrder = {
    "weatherObservationType"
})
public class WeatherObservationType
    extends _UrbanFunctionType
{

    protected List<WeatherObservationTypePropertyType> weatherObservationType;

    /**
     * Gets the value of the weatherObservationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherObservationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherObservationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherObservationTypePropertyType }
     * 
     * 
     */
    public List<WeatherObservationTypePropertyType> getWeatherObservationType() {
        if (weatherObservationType == null) {
            weatherObservationType = new ArrayList<WeatherObservationTypePropertyType>();
        }
        return this.weatherObservationType;
    }

    public boolean isSetWeatherObservationType() {
        return ((this.weatherObservationType!= null)&&(!this.weatherObservationType.isEmpty()));
    }

    public void unsetWeatherObservationType() {
        this.weatherObservationType = null;
    }

}
