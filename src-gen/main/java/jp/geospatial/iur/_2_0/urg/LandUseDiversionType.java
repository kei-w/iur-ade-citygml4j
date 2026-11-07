//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:49:19 JST 2026
//


package jp.geospatial.iur._2_0.urg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * grid cell with the number and area of land use diversion
 * 
 * <p>Java class for LandUseDiversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandUseDiversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urg/2.0}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfAnnualDiversion" type="{https://www.geospatial.jp/iur/urg/2.0}NumberOfAnnualDiversionsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaOfAnnualDiversion" type="{https://www.geospatial.jp/iur/urg/2.0}AreaOfAnnualDiversionsPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandUseDiversionType", propOrder = {
    "numberOfAnnualDiversion",
    "areaOfAnnualDiversion"
})
public class LandUseDiversionType
    extends StatisticalGridType
{

    protected List<NumberOfAnnualDiversionsPropertyType> numberOfAnnualDiversion;
    protected List<AreaOfAnnualDiversionsPropertyType> areaOfAnnualDiversion;

    /**
     * Gets the value of the numberOfAnnualDiversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAnnualDiversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAnnualDiversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAnnualDiversionsPropertyType }
     * 
     * 
     */
    public List<NumberOfAnnualDiversionsPropertyType> getNumberOfAnnualDiversion() {
        if (numberOfAnnualDiversion == null) {
            numberOfAnnualDiversion = new ArrayList<NumberOfAnnualDiversionsPropertyType>();
        }
        return this.numberOfAnnualDiversion;
    }

    public boolean isSetNumberOfAnnualDiversion() {
        return ((this.numberOfAnnualDiversion!= null)&&(!this.numberOfAnnualDiversion.isEmpty()));
    }

    public void unsetNumberOfAnnualDiversion() {
        this.numberOfAnnualDiversion = null;
    }

    /**
     * Gets the value of the areaOfAnnualDiversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaOfAnnualDiversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaOfAnnualDiversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaOfAnnualDiversionsPropertyType }
     * 
     * 
     */
    public List<AreaOfAnnualDiversionsPropertyType> getAreaOfAnnualDiversion() {
        if (areaOfAnnualDiversion == null) {
            areaOfAnnualDiversion = new ArrayList<AreaOfAnnualDiversionsPropertyType>();
        }
        return this.areaOfAnnualDiversion;
    }

    public boolean isSetAreaOfAnnualDiversion() {
        return ((this.areaOfAnnualDiversion!= null)&&(!this.areaOfAnnualDiversion.isEmpty()));
    }

    public void unsetAreaOfAnnualDiversion() {
        this.areaOfAnnualDiversion = null;
    }

}
