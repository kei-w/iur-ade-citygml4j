//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

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
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
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
    UseDistrictType.class,
    SpecialUseDistrictType.class,
    SpecialUseRestrictionDistrictType.class,
    ExceptionalFloorAreaRateDistrictType.class,
    HighRiseResidentialAttractionDistrictType.class,
    HeightControlDistrictType.class,
    HighLevelUseDistrictType.class,
    SpecifiedBlockType.class,
    SpecialUrbanRenaissanceDistrictType.class,
    HousingControlAreaType.class,
    ResidentialEnvironmentImprovementDistrictType.class,
    SpecialUseAttractionDistrictType.class,
    FirePreventionDistrictType.class,
    SpecifiedDisasterPreventionBlockImprovementZoneType.class,
    LandscapeZoneType.class,
    ScenicDistrictType.class,
    ParkingPlaceDevelopmentZoneType.class,
    PortZoneType.class,
    SpecialZoneForPreservationOfHistoricalLandscapeType.class,
    ZoneForPreservationOfHistoricalLandscapeType.class,
    GreenSpaceConservationDistrictType.class,
    SpecialGreenSpaceConservationDistrictType.class,
    TreePlantingDistrictType.class,
    DistributionBusinessZoneType.class,
    ProductiveGreenZoneType.class,
    ConservationZoneForClustersOfTraditionalStructuresType.class,
    AircraftNoiseControlZoneType.class
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
