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
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for DisasterPreventionBlockImprovementZonePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisasterPreventionBlockImprovementZonePlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}AbstractDistrictPlanType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zonalDisasterPreventionFacilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="specifiedZonalDisasterPreventionFacilitiesAllocation" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="zonalDisasterPreventionFacilities" type="{https://www.geospatial.jp/iur/urf/3.0}ZonalDisasterPreventionFacilityPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisasterPreventionBlockImprovementZonePlanType", propOrder = {
    "zonalDisasterPreventionFacilitiesAllocation",
    "specifiedZonalDisasterPreventionFacilitiesAllocation",
    "zonalDisasterPreventionFacilities"
})
public class DisasterPreventionBlockImprovementZonePlanType
    extends AbstractDistrictPlanType
{

    protected StringOrRefType zonalDisasterPreventionFacilitiesAllocation;
    protected StringOrRefType specifiedZonalDisasterPreventionFacilitiesAllocation;
    protected List<ZonalDisasterPreventionFacilityPropertyType> zonalDisasterPreventionFacilities;

    /**
     * Gets the value of the zonalDisasterPreventionFacilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getZonalDisasterPreventionFacilitiesAllocation() {
        return zonalDisasterPreventionFacilitiesAllocation;
    }

    /**
     * Sets the value of the zonalDisasterPreventionFacilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setZonalDisasterPreventionFacilitiesAllocation(StringOrRefType value) {
        this.zonalDisasterPreventionFacilitiesAllocation = value;
    }

    public boolean isSetZonalDisasterPreventionFacilitiesAllocation() {
        return (this.zonalDisasterPreventionFacilitiesAllocation!= null);
    }

    /**
     * Gets the value of the specifiedZonalDisasterPreventionFacilitiesAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getSpecifiedZonalDisasterPreventionFacilitiesAllocation() {
        return specifiedZonalDisasterPreventionFacilitiesAllocation;
    }

    /**
     * Sets the value of the specifiedZonalDisasterPreventionFacilitiesAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setSpecifiedZonalDisasterPreventionFacilitiesAllocation(StringOrRefType value) {
        this.specifiedZonalDisasterPreventionFacilitiesAllocation = value;
    }

    public boolean isSetSpecifiedZonalDisasterPreventionFacilitiesAllocation() {
        return (this.specifiedZonalDisasterPreventionFacilitiesAllocation!= null);
    }

    /**
     * Gets the value of the zonalDisasterPreventionFacilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zonalDisasterPreventionFacilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZonalDisasterPreventionFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZonalDisasterPreventionFacilityPropertyType }
     * 
     * 
     */
    public List<ZonalDisasterPreventionFacilityPropertyType> getZonalDisasterPreventionFacilities() {
        if (zonalDisasterPreventionFacilities == null) {
            zonalDisasterPreventionFacilities = new ArrayList<ZonalDisasterPreventionFacilityPropertyType>();
        }
        return this.zonalDisasterPreventionFacilities;
    }

    public boolean isSetZonalDisasterPreventionFacilities() {
        return ((this.zonalDisasterPreventionFacilities!= null)&&(!this.zonalDisasterPreventionFacilities.isEmpty()));
    }

    public void unsetZonalDisasterPreventionFacilities() {
        this.zonalDisasterPreventionFacilities = null;
    }

}
