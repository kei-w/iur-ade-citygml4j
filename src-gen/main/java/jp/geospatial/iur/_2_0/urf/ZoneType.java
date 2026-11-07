//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * zoning district
 * 
 * <p>Java class for ZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boundary" type="{https://www.geospatial.jp/iur/urf/2.0}BoundaryPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneType", propOrder = {
    "boundary",
    "locationDescription"
})
@XmlSeeAlso({
    UrbanPlanningAreaType.class,
    QuasiUrbanPlanningAreaType.class,
    AreaClassificationType.class,
    DistrictsAndZonesType.class,
    ProjectPromotionAreaType.class,
    UnusedLandUsePromotionAreaType.class,
    UrbanDisasterRecoveryPromotionAreaType.class,
    UrbanDevelopmentProjectType.class,
    ScheduledAreaForUrbanDevelopmentProjectType.class,
    UrbanFacilityType.class,
    AbstractDistrictPlanType.class,
    DistrictDevelopmentPlanType.class,
    DistrictType.class,
    ZonalDisasterPreventionFacilityType.class,
    DistrictFacilityType.class,
    PromotionDistrictType.class,
    UrgentUrbanRenewalAreaType.class,
    PrivateUrbanRenewalProjectPlanType.class,
    GlobalHubCityDevelopmentProjectType.class,
    AgreementType.class,
    RegulationType.class,
    DevelopmentProjectType.class,
    SedimentDisasterProneAreaType.class
})
public abstract class ZoneType
    extends UrbanFunctionType
{

    protected List<BoundaryPropertyType> boundary;
    @XmlElement(name = "location")
    protected String locationDescription;

    /**
     * Gets the value of the boundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoundaryPropertyType }
     * 
     * 
     */
    public List<BoundaryPropertyType> getBoundary() {
        if (boundary == null) {
            boundary = new ArrayList<BoundaryPropertyType>();
        }
        return this.boundary;
    }

    public boolean isSetBoundary() {
        return ((this.boundary!= null)&&(!this.boundary.isEmpty()));
    }

    public void unsetBoundary() {
        this.boundary = null;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    public boolean isSetLocationDescription() {
        return (this.locationDescription!= null);
    }

}
