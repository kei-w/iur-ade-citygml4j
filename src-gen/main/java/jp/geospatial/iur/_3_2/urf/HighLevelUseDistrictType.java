//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for HighLevelUseDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighLevelUseDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="minimumFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="maximumBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="minimumBuildingArea" type="{http://www.opengis.net/gml}MeasureType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="setbackSize" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighLevelUseDistrictType", propOrder = {
    "maximumFloorAreaRate",
    "minimumFloorAreaRate",
    "maximumBuildingCoverageRate",
    "minimumBuildingArea",
    "setbackSize"
})
public class HighLevelUseDistrictType
    extends DistrictsAndZonesType
{

    @XmlElement(required = true)
    protected List<BigInteger> maximumFloorAreaRate;
    @XmlElement(required = true)
    protected List<BigInteger> minimumFloorAreaRate;
    @XmlElement(required = true)
    protected List<BigInteger> maximumBuildingCoverageRate;
    @XmlElement(required = true)
    protected List<MeasureType> minimumBuildingArea;
    protected StringOrRefType setbackSize;

    /**
     * Gets the value of the maximumFloorAreaRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumFloorAreaRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumFloorAreaRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getMaximumFloorAreaRate() {
        if (maximumFloorAreaRate == null) {
            maximumFloorAreaRate = new ArrayList<BigInteger>();
        }
        return this.maximumFloorAreaRate;
    }

    public boolean isSetMaximumFloorAreaRate() {
        return ((this.maximumFloorAreaRate!= null)&&(!this.maximumFloorAreaRate.isEmpty()));
    }

    public void unsetMaximumFloorAreaRate() {
        this.maximumFloorAreaRate = null;
    }

    /**
     * Gets the value of the minimumFloorAreaRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumFloorAreaRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumFloorAreaRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getMinimumFloorAreaRate() {
        if (minimumFloorAreaRate == null) {
            minimumFloorAreaRate = new ArrayList<BigInteger>();
        }
        return this.minimumFloorAreaRate;
    }

    public boolean isSetMinimumFloorAreaRate() {
        return ((this.minimumFloorAreaRate!= null)&&(!this.minimumFloorAreaRate.isEmpty()));
    }

    public void unsetMinimumFloorAreaRate() {
        this.minimumFloorAreaRate = null;
    }

    /**
     * Gets the value of the maximumBuildingCoverageRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumBuildingCoverageRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumBuildingCoverageRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getMaximumBuildingCoverageRate() {
        if (maximumBuildingCoverageRate == null) {
            maximumBuildingCoverageRate = new ArrayList<BigInteger>();
        }
        return this.maximumBuildingCoverageRate;
    }

    public boolean isSetMaximumBuildingCoverageRate() {
        return ((this.maximumBuildingCoverageRate!= null)&&(!this.maximumBuildingCoverageRate.isEmpty()));
    }

    public void unsetMaximumBuildingCoverageRate() {
        this.maximumBuildingCoverageRate = null;
    }

    /**
     * Gets the value of the minimumBuildingArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumBuildingArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumBuildingArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureType }
     * 
     * 
     */
    public List<MeasureType> getMinimumBuildingArea() {
        if (minimumBuildingArea == null) {
            minimumBuildingArea = new ArrayList<MeasureType>();
        }
        return this.minimumBuildingArea;
    }

    public boolean isSetMinimumBuildingArea() {
        return ((this.minimumBuildingArea!= null)&&(!this.minimumBuildingArea.isEmpty()));
    }

    public void unsetMinimumBuildingArea() {
        this.minimumBuildingArea = null;
    }

    /**
     * Gets the value of the setbackSize property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSetbackSize() {
        return setbackSize;
    }

    /**
     * Sets the value of the setbackSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSetbackSize(StringOrRefType value) {
        this.setbackSize = value;
    }

    public boolean isSetSetbackSize() {
        return (this.setbackSize!= null);
    }

}
