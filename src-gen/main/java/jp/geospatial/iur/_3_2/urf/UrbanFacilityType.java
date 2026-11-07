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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrbanFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrbanFacilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="threeDimensionalExtent" type="{https://www.geospatial.jp/iur/urf/3.2}ThreeDimensionalExtentPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrbanFacilityType", propOrder = {
    "number",
    "threeDimensionalExtent"
})
@XmlSeeAlso({
    CollectiveFacilitiesForReconstructionType.class,
    CollectiveFacilitiesForReconstructionAndRevitalizationType.class,
    CollectiveFacilitiesForTsunamiDisasterPreventionType.class,
    CollectiveGovernmentAndPublicOfficeFacilitiesType.class,
    CollectiveHousingFacilitiesType.class,
    CollectiveUrbanDisasterPreventionFacilitiesType.class,
    DistributionBusinessParkType.class,
    EducationalAndCulturalFacilityType.class,
    MarketsSlaughterhousesCrematoriaType.class,
    MedicalFacilityType.class,
    OpenSpaceForPublicUseType.class,
    SocialWelfareFacilityType.class,
    SupplyFacilityType.class,
    TrafficFacilityType.class,
    TreatmentFacilityType.class,
    WaterwayType.class,
    UrbanFacilityStipulatedByCabinetOrderType.class
})
public class UrbanFacilityType
    extends ZoneType
{

    protected String number;
    protected List<ThreeDimensionalExtentPropertyType> threeDimensionalExtent;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    public boolean isSetNumber() {
        return (this.number!= null);
    }

    /**
     * Gets the value of the threeDimensionalExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDimensionalExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDimensionalExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThreeDimensionalExtentPropertyType }
     * 
     * 
     */
    public List<ThreeDimensionalExtentPropertyType> getThreeDimensionalExtent() {
        if (threeDimensionalExtent == null) {
            threeDimensionalExtent = new ArrayList<ThreeDimensionalExtentPropertyType>();
        }
        return this.threeDimensionalExtent;
    }

    public boolean isSetThreeDimensionalExtent() {
        return ((this.threeDimensionalExtent!= null)&&(!this.threeDimensionalExtent.isEmpty()));
    }

    public void unsetThreeDimensionalExtent() {
        this.threeDimensionalExtent = null;
    }

}
