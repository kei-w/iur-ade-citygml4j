//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for StationSquareAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationSquareAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}SquareUrbanPlanAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="station" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="railwayType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationSquareAttributeType", propOrder = {
    "station",
    "route",
    "railwayType"
})
public class StationSquareAttributeType
    extends SquareUrbanPlanAttributeType
{

    protected List<String> station;
    protected List<String> route;
    protected List<CodeType> railwayType;

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStation() {
        if (station == null) {
            station = new ArrayList<String>();
        }
        return this.station;
    }

    public boolean isSetStation() {
        return ((this.station!= null)&&(!this.station.isEmpty()));
    }

    public void unsetStation() {
        this.station = null;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoute() {
        if (route == null) {
            route = new ArrayList<String>();
        }
        return this.route;
    }

    public boolean isSetRoute() {
        return ((this.route!= null)&&(!this.route.isEmpty()));
    }

    public void unsetRoute() {
        this.route = null;
    }

    /**
     * Gets the value of the railwayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railwayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailwayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getRailwayType() {
        if (railwayType == null) {
            railwayType = new ArrayList<CodeType>();
        }
        return this.railwayType;
    }

    public boolean isSetRailwayType() {
        return ((this.railwayType!= null)&&(!this.railwayType.isEmpty()));
    }

    public void unsetRailwayType() {
        this.railwayType = null;
    }

}
