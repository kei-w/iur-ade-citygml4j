//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for DistrictsAndZonesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictsAndZonesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaInTotal" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictsAndZonesType", propOrder = {
    "areaInTotal"
})
@XmlSeeAlso({
    AircraftNoiseControlZoneType.class,
    ConservationZoneForClustersOfTraditionalStructuresType.class,
    DistributionBusinessZoneType.class,
    ExceptionalFloorAreaRateDistrictType.class,
    FirePreventionDistrictType.class,
    GreenSpaceConservationDistrictType.class,
    HeightControlDistrictType.class,
    HighLevelUseDistrictType.class,
    HighRiseResidentialAttractionDistrictType.class,
    HousingControlAreaType.class,
    LandscapeZoneType.class,
    ParkingPlaceDevelopmentZoneType.class,
    PortZoneType.class,
    ProductiveGreenZoneType.class,
    ResidentialEnvironmentImprovementDistrictType.class,
    ScenicDistrictType.class,
    SpecialGreenSpaceConservationDistrictType.class,
    SpecialUrbanRenaissanceDistrictType.class,
    SpecialUseAttractionDistrictType.class,
    SpecialUseDistrictType.class,
    SpecialUseRestrictionDistrictType.class,
    SpecialZoneForPreservationOfHistoricalLandscapeType.class,
    SpecifiedBlockType.class,
    SpecifiedDisasterPreventionBlockImprovementZoneType.class,
    TreePlantingDistrictType.class,
    UseDistrictType.class,
    ZoneForPreservationOfHistoricalLandscapeType.class
})
public class DistrictsAndZonesType
    extends ZoneType
{

    protected MeasureType areaInTotal;

    /**
     * Gets the value of the areaInTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAreaInTotal() {
        return areaInTotal;
    }

    /**
     * Sets the value of the areaInTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAreaInTotal(MeasureType value) {
        this.areaInTotal = value;
    }

    public boolean isSetAreaInTotal() {
        return (this.areaInTotal!= null);
    }

}
