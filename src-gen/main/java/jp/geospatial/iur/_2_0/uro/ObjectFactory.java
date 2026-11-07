//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 11:13:19 JST 2026
//


package jp.geospatial.iur._2_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import net.opengis.gml.CodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.geospatial.iur._2_0.uro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuildingIDAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "buildingIDAttribute");
    private final static QName _BuildingDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "buildingDetailAttribute");
    private final static QName _LargeCustomerFacilityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "largeCustomerFacilityAttribute");
    private final static QName _BuildingDisasterRiskAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "buildingDisasterRiskAttribute");
    private final static QName _KeyValuePairAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "keyValuePairAttribute");
    private final static QName _BuildingDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "buildingDataQualityAttribute");
    private final static QName _BuildingAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingAttribute");
    private final static QName _BuildingIDAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingIDAttribute");
    private final static QName _BuildingDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingDetailAttribute");
    private final static QName _LargeCustomerFacilityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "LargeCustomerFacilityAttribute");
    private final static QName _BuildingDisasterRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingDisasterRiskAttribute");
    private final static QName _BuildingFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingFloodingRiskAttribute");
    private final static QName _BuildingRiverFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingRiverFloodingRiskAttribute");
    private final static QName _BuildingTsunamiRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingTsunamiRiskAttribute");
    private final static QName _BuildingInlandFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingInlandFloodingRiskAttribute");
    private final static QName _BuildingHighTideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingHighTideRiskAttribute");
    private final static QName _BuildingLandSlideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingLandSlideRiskAttribute");
    private final static QName _KeyValuePairAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "KeyValuePairAttribute");
    private final static QName _BuildingDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "BuildingDataQualityAttribute");
    private final static QName _LandUseDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "landUseDetailAttribute");
    private final static QName _LandUseAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "LandUseAttribute");
    private final static QName _LandUseDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "LandUseDetailAttribute");
    private final static QName _TrafficVolumeAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "trafficVolumeAttribute");
    private final static QName _RoadStructureAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "roadStructureAttribute");
    private final static QName _RoadDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "roadDataQualityAttribute");
    private final static QName _TrafficAreaStructureAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "trafficAreaStructureAttribute");
    private final static QName _RoadAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "RoadAttribute");
    private final static QName _TrafficVolumeAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "TrafficVolumeAttribute");
    private final static QName _RoadStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "RoadStructureAttribute");
    private final static QName _RoadDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "RoadDataQualityAttribute");
    private final static QName _TrafficAreaAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "TrafficAreaAttribute");
    private final static QName _TrafficAreaStructureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "TrafficAreaStructureAttribute");
    private final static QName _CityFurnitureDetailAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "cityFurnitureDetailAttribute");
    private final static QName _CityFurnitureDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "cityFurnitureDataQualityAttribute");
    private final static QName _CityFurnitureAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "CityFurnitureAttribute");
    private final static QName _CityFurnitureDetailAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "CityFurnitureDetailAttribute");
    private final static QName _CityFurnitureDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "CityFurnitureDataQualityAttribute");
    private final static QName _VegetationDataQualityAttributeProperty_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "vegetationDataQualityAttribute");
    private final static QName _VegetationAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "VegetationAttribute");
    private final static QName _VegetationDataQualityAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "VegetationDataQualityAttribute");
    private final static QName _FloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "floodingRiskAttribute");
    private final static QName _WaterBodyAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyAttribute");
    private final static QName _WaterBodyFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyFloodingRiskAttribute");
    private final static QName _WaterBodyRiverFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyRiverFloodingRiskAttribute");
    private final static QName _WaterBodyTsunamiRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyTsunamiRiskAttribute");
    private final static QName _WaterBodyHighTideRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyHighTideRiskAttribute");
    private final static QName _WaterBodyInlandFloodingRiskAttribute_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "WaterBodyInlandFloodingRiskAttribute");
    private final static QName _FiscalYearOfPublication_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "fiscalYearOfPublication");
    private final static QName _Language_QNAME = new QName("https://www.geospatial.jp/iur/uro/2.0", "language");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.geospatial.iur._2_0.uro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuildingIDAttributePropertyType }
     * 
     */
    public BuildingIDAttributePropertyType createBuildingIDAttributePropertyType() {
        return new BuildingIDAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDetailAttributePropertyType }
     * 
     */
    public BuildingDetailAttributePropertyType createBuildingDetailAttributePropertyType() {
        return new BuildingDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilityAttributePropertyType }
     * 
     */
    public LargeCustomerFacilityAttributePropertyType createLargeCustomerFacilityAttributePropertyType() {
        return new LargeCustomerFacilityAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDisasterRiskAttributePropertyType }
     * 
     */
    public BuildingDisasterRiskAttributePropertyType createBuildingDisasterRiskAttributePropertyType() {
        return new BuildingDisasterRiskAttributePropertyType();
    }

    /**
     * Create an instance of {@link KeyValuePairAttributePropertyType }
     * 
     */
    public KeyValuePairAttributePropertyType createKeyValuePairAttributePropertyType() {
        return new KeyValuePairAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingDataQualityAttributePropertyType }
     * 
     */
    public BuildingDataQualityAttributePropertyType createBuildingDataQualityAttributePropertyType() {
        return new BuildingDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link BuildingIDAttributeType }
     * 
     */
    public BuildingIDAttributeType createBuildingIDAttributeType() {
        return new BuildingIDAttributeType();
    }

    /**
     * Create an instance of {@link BuildingDetailAttributeType }
     * 
     */
    public BuildingDetailAttributeType createBuildingDetailAttributeType() {
        return new BuildingDetailAttributeType();
    }

    /**
     * Create an instance of {@link LargeCustomerFacilityAttributeType }
     * 
     */
    public LargeCustomerFacilityAttributeType createLargeCustomerFacilityAttributeType() {
        return new LargeCustomerFacilityAttributeType();
    }

    /**
     * Create an instance of {@link BuildingRiverFloodingRiskAttributeType }
     * 
     */
    public BuildingRiverFloodingRiskAttributeType createBuildingRiverFloodingRiskAttributeType() {
        return new BuildingRiverFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingTsunamiRiskAttributeType }
     * 
     */
    public BuildingTsunamiRiskAttributeType createBuildingTsunamiRiskAttributeType() {
        return new BuildingTsunamiRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingInlandFloodingRiskAttributeType }
     * 
     */
    public BuildingInlandFloodingRiskAttributeType createBuildingInlandFloodingRiskAttributeType() {
        return new BuildingInlandFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingHighTideRiskAttributeType }
     * 
     */
    public BuildingHighTideRiskAttributeType createBuildingHighTideRiskAttributeType() {
        return new BuildingHighTideRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingLandSlideRiskAttributeType }
     * 
     */
    public BuildingLandSlideRiskAttributeType createBuildingLandSlideRiskAttributeType() {
        return new BuildingLandSlideRiskAttributeType();
    }

    /**
     * Create an instance of {@link KeyValuePairAttributeType }
     * 
     */
    public KeyValuePairAttributeType createKeyValuePairAttributeType() {
        return new KeyValuePairAttributeType();
    }

    /**
     * Create an instance of {@link BuildingDataQualityAttributeType }
     * 
     */
    public BuildingDataQualityAttributeType createBuildingDataQualityAttributeType() {
        return new BuildingDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link LandUseDetailAttributePropertyType }
     * 
     */
    public LandUseDetailAttributePropertyType createLandUseDetailAttributePropertyType() {
        return new LandUseDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link LandUseDetailAttributeType }
     * 
     */
    public LandUseDetailAttributeType createLandUseDetailAttributeType() {
        return new LandUseDetailAttributeType();
    }

    /**
     * Create an instance of {@link TrafficVolumeAttributePropertyType }
     * 
     */
    public TrafficVolumeAttributePropertyType createTrafficVolumeAttributePropertyType() {
        return new TrafficVolumeAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoadStructureAttributePropertyType }
     * 
     */
    public RoadStructureAttributePropertyType createRoadStructureAttributePropertyType() {
        return new RoadStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoadDataQualityAttributePropertyType }
     * 
     */
    public RoadDataQualityAttributePropertyType createRoadDataQualityAttributePropertyType() {
        return new RoadDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficAreaStructureAttributePropertyType }
     * 
     */
    public TrafficAreaStructureAttributePropertyType createTrafficAreaStructureAttributePropertyType() {
        return new TrafficAreaStructureAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficVolumeAttributeType }
     * 
     */
    public TrafficVolumeAttributeType createTrafficVolumeAttributeType() {
        return new TrafficVolumeAttributeType();
    }

    /**
     * Create an instance of {@link RoadStructureAttributeType }
     * 
     */
    public RoadStructureAttributeType createRoadStructureAttributeType() {
        return new RoadStructureAttributeType();
    }

    /**
     * Create an instance of {@link RoadDataQualityAttributeType }
     * 
     */
    public RoadDataQualityAttributeType createRoadDataQualityAttributeType() {
        return new RoadDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link TrafficAreaStructureAttributeType }
     * 
     */
    public TrafficAreaStructureAttributeType createTrafficAreaStructureAttributeType() {
        return new TrafficAreaStructureAttributeType();
    }

    /**
     * Create an instance of {@link CityFurnitureDetailAttributePropertyType }
     * 
     */
    public CityFurnitureDetailAttributePropertyType createCityFurnitureDetailAttributePropertyType() {
        return new CityFurnitureDetailAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureDataQualityAttributePropertyType }
     * 
     */
    public CityFurnitureDataQualityAttributePropertyType createCityFurnitureDataQualityAttributePropertyType() {
        return new CityFurnitureDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureDetailAttributeType }
     * 
     */
    public CityFurnitureDetailAttributeType createCityFurnitureDetailAttributeType() {
        return new CityFurnitureDetailAttributeType();
    }

    /**
     * Create an instance of {@link CityFurnitureDataQualityAttributeType }
     * 
     */
    public CityFurnitureDataQualityAttributeType createCityFurnitureDataQualityAttributeType() {
        return new CityFurnitureDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link VegetationDataQualityAttributePropertyType }
     * 
     */
    public VegetationDataQualityAttributePropertyType createVegetationDataQualityAttributePropertyType() {
        return new VegetationDataQualityAttributePropertyType();
    }

    /**
     * Create an instance of {@link VegetationDataQualityAttributeType }
     * 
     */
    public VegetationDataQualityAttributeType createVegetationDataQualityAttributeType() {
        return new VegetationDataQualityAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyFloodingRiskAttributePropertyType }
     * 
     */
    public WaterBodyFloodingRiskAttributePropertyType createWaterBodyFloodingRiskAttributePropertyType() {
        return new WaterBodyFloodingRiskAttributePropertyType();
    }

    /**
     * Create an instance of {@link WaterBodyFloodingRiskAttributeType }
     * 
     */
    public WaterBodyFloodingRiskAttributeType createWaterBodyFloodingRiskAttributeType() {
        return new WaterBodyFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyRiverFloodingRiskAttributeType }
     * 
     */
    public WaterBodyRiverFloodingRiskAttributeType createWaterBodyRiverFloodingRiskAttributeType() {
        return new WaterBodyRiverFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyTsunamiRiskAttributeType }
     * 
     */
    public WaterBodyTsunamiRiskAttributeType createWaterBodyTsunamiRiskAttributeType() {
        return new WaterBodyTsunamiRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyHighTideRiskAttributeType }
     * 
     */
    public WaterBodyHighTideRiskAttributeType createWaterBodyHighTideRiskAttributeType() {
        return new WaterBodyHighTideRiskAttributeType();
    }

    /**
     * Create an instance of {@link WaterBodyInlandFloodingRiskAttributeType }
     * 
     */
    public WaterBodyInlandFloodingRiskAttributeType createWaterBodyInlandFloodingRiskAttributeType() {
        return new WaterBodyInlandFloodingRiskAttributeType();
    }

    /**
     * Create an instance of {@link BuildingAttributePropertyType }
     * 
     */
    public BuildingAttributePropertyType createBuildingAttributePropertyType() {
        return new BuildingAttributePropertyType();
    }

    /**
     * Create an instance of {@link LandUseAttributePropertyType }
     * 
     */
    public LandUseAttributePropertyType createLandUseAttributePropertyType() {
        return new LandUseAttributePropertyType();
    }

    /**
     * Create an instance of {@link RoadAttributePropertyType }
     * 
     */
    public RoadAttributePropertyType createRoadAttributePropertyType() {
        return new RoadAttributePropertyType();
    }

    /**
     * Create an instance of {@link TrafficAreaAttributePropertyType }
     * 
     */
    public TrafficAreaAttributePropertyType createTrafficAreaAttributePropertyType() {
        return new TrafficAreaAttributePropertyType();
    }

    /**
     * Create an instance of {@link CityFurnitureAttributePropertyType }
     * 
     */
    public CityFurnitureAttributePropertyType createCityFurnitureAttributePropertyType() {
        return new CityFurnitureAttributePropertyType();
    }

    /**
     * Create an instance of {@link VegetationAttributePropertyType }
     * 
     */
    public VegetationAttributePropertyType createVegetationAttributePropertyType() {
        return new VegetationAttributePropertyType();
    }

    /**
     * Create an instance of {@link WaterBodyAttributePropertyType }
     * 
     */
    public WaterBodyAttributePropertyType createWaterBodyAttributePropertyType() {
        return new WaterBodyAttributePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "buildingIDAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingIDAttributePropertyType> createBuildingIDAttributeProperty(BuildingIDAttributePropertyType value) {
        return new JAXBElement<BuildingIDAttributePropertyType>(_BuildingIDAttributeProperty_QNAME, BuildingIDAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "buildingDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDetailAttributePropertyType> createBuildingDetailAttributeProperty(BuildingDetailAttributePropertyType value) {
        return new JAXBElement<BuildingDetailAttributePropertyType>(_BuildingDetailAttributeProperty_QNAME, BuildingDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "largeCustomerFacilityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<LargeCustomerFacilityAttributePropertyType> createLargeCustomerFacilityAttributeProperty(LargeCustomerFacilityAttributePropertyType value) {
        return new JAXBElement<LargeCustomerFacilityAttributePropertyType>(_LargeCustomerFacilityAttributeProperty_QNAME, LargeCustomerFacilityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "buildingDisasterRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDisasterRiskAttributePropertyType> createBuildingDisasterRiskAttributeProperty(BuildingDisasterRiskAttributePropertyType value) {
        return new JAXBElement<BuildingDisasterRiskAttributePropertyType>(_BuildingDisasterRiskAttributeProperty_QNAME, BuildingDisasterRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "keyValuePairAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<KeyValuePairAttributePropertyType> createKeyValuePairAttributeProperty(KeyValuePairAttributePropertyType value) {
        return new JAXBElement<KeyValuePairAttributePropertyType>(_KeyValuePairAttributeProperty_QNAME, KeyValuePairAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "buildingDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/building/2.0", substitutionHeadName = "_GenericApplicationPropertyOfAbstractBuilding")
    public JAXBElement<BuildingDataQualityAttributePropertyType> createBuildingDataQualityAttributeProperty(BuildingDataQualityAttributePropertyType value) {
        return new JAXBElement<BuildingDataQualityAttributePropertyType>(_BuildingDataQualityAttributeProperty_QNAME, BuildingDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingAttribute")
    public JAXBElement<BuildingAttributeType> createBuildingAttribute(BuildingAttributeType value) {
        return new JAXBElement<BuildingAttributeType>(_BuildingAttribute_QNAME, BuildingAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingIDAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingIDAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingIDAttributeType> createBuildingIDAttribute(BuildingIDAttributeType value) {
        return new JAXBElement<BuildingIDAttributeType>(_BuildingIDAttribute_QNAME, BuildingIDAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDetailAttributeType> createBuildingDetailAttribute(BuildingDetailAttributeType value) {
        return new JAXBElement<BuildingDetailAttributeType>(_BuildingDetailAttribute_QNAME, BuildingDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LargeCustomerFacilityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "LargeCustomerFacilityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<LargeCustomerFacilityAttributeType> createLargeCustomerFacilityAttribute(LargeCustomerFacilityAttributeType value) {
        return new JAXBElement<LargeCustomerFacilityAttributeType>(_LargeCustomerFacilityAttribute_QNAME, LargeCustomerFacilityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDisasterRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingDisasterRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDisasterRiskAttributeType> createBuildingDisasterRiskAttribute(BuildingDisasterRiskAttributeType value) {
        return new JAXBElement<BuildingDisasterRiskAttributeType>(_BuildingDisasterRiskAttribute_QNAME, BuildingDisasterRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingDisasterRiskAttribute")
    public JAXBElement<BuildingFloodingRiskAttributeType> createBuildingFloodingRiskAttribute(BuildingFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingFloodingRiskAttributeType>(_BuildingFloodingRiskAttribute_QNAME, BuildingFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingRiverFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingRiverFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingRiverFloodingRiskAttributeType> createBuildingRiverFloodingRiskAttribute(BuildingRiverFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingRiverFloodingRiskAttributeType>(_BuildingRiverFloodingRiskAttribute_QNAME, BuildingRiverFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingTsunamiRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingTsunamiRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingTsunamiRiskAttributeType> createBuildingTsunamiRiskAttribute(BuildingTsunamiRiskAttributeType value) {
        return new JAXBElement<BuildingTsunamiRiskAttributeType>(_BuildingTsunamiRiskAttribute_QNAME, BuildingTsunamiRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingInlandFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingInlandFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingInlandFloodingRiskAttributeType> createBuildingInlandFloodingRiskAttribute(BuildingInlandFloodingRiskAttributeType value) {
        return new JAXBElement<BuildingInlandFloodingRiskAttributeType>(_BuildingInlandFloodingRiskAttribute_QNAME, BuildingInlandFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingHighTideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingHighTideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingFloodingRiskAttribute")
    public JAXBElement<BuildingHighTideRiskAttributeType> createBuildingHighTideRiskAttribute(BuildingHighTideRiskAttributeType value) {
        return new JAXBElement<BuildingHighTideRiskAttributeType>(_BuildingHighTideRiskAttribute_QNAME, BuildingHighTideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingLandSlideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingLandSlideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingDisasterRiskAttribute")
    public JAXBElement<BuildingLandSlideRiskAttributeType> createBuildingLandSlideRiskAttribute(BuildingLandSlideRiskAttributeType value) {
        return new JAXBElement<BuildingLandSlideRiskAttributeType>(_BuildingLandSlideRiskAttribute_QNAME, BuildingLandSlideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyValuePairAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "KeyValuePairAttribute")
    public JAXBElement<KeyValuePairAttributeType> createKeyValuePairAttribute(KeyValuePairAttributeType value) {
        return new JAXBElement<KeyValuePairAttributeType>(_KeyValuePairAttribute_QNAME, KeyValuePairAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuildingDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "BuildingDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "BuildingAttribute")
    public JAXBElement<BuildingDataQualityAttributeType> createBuildingDataQualityAttribute(BuildingDataQualityAttributeType value) {
        return new JAXBElement<BuildingDataQualityAttributeType>(_BuildingDataQualityAttribute_QNAME, BuildingDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "landUseDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/landuse/2.0", substitutionHeadName = "_GenericApplicationPropertyOfLandUse")
    public JAXBElement<LandUseDetailAttributePropertyType> createLandUseDetailAttributeProperty(LandUseDetailAttributePropertyType value) {
        return new JAXBElement<LandUseDetailAttributePropertyType>(_LandUseDetailAttributeProperty_QNAME, LandUseDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "LandUseAttribute")
    public JAXBElement<LandUseAttributeType> createLandUseAttribute(LandUseAttributeType value) {
        return new JAXBElement<LandUseAttributeType>(_LandUseAttribute_QNAME, LandUseAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LandUseDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "LandUseDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "LandUseAttribute")
    public JAXBElement<LandUseDetailAttributeType> createLandUseDetailAttribute(LandUseDetailAttributeType value) {
        return new JAXBElement<LandUseDetailAttributeType>(_LandUseDetailAttribute_QNAME, LandUseDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "trafficVolumeAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<TrafficVolumeAttributePropertyType> createTrafficVolumeAttributeProperty(TrafficVolumeAttributePropertyType value) {
        return new JAXBElement<TrafficVolumeAttributePropertyType>(_TrafficVolumeAttributeProperty_QNAME, TrafficVolumeAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "roadStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<RoadStructureAttributePropertyType> createRoadStructureAttributeProperty(RoadStructureAttributePropertyType value) {
        return new JAXBElement<RoadStructureAttributePropertyType>(_RoadStructureAttributeProperty_QNAME, RoadStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "roadDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfRoad")
    public JAXBElement<RoadDataQualityAttributePropertyType> createRoadDataQualityAttributeProperty(RoadDataQualityAttributePropertyType value) {
        return new JAXBElement<RoadDataQualityAttributePropertyType>(_RoadDataQualityAttributeProperty_QNAME, RoadDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "trafficAreaStructureAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/transportation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfTrafficArea")
    public JAXBElement<TrafficAreaStructureAttributePropertyType> createTrafficAreaStructureAttributeProperty(TrafficAreaStructureAttributePropertyType value) {
        return new JAXBElement<TrafficAreaStructureAttributePropertyType>(_TrafficAreaStructureAttributeProperty_QNAME, TrafficAreaStructureAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "RoadAttribute")
    public JAXBElement<RoadAttributeType> createRoadAttribute(RoadAttributeType value) {
        return new JAXBElement<RoadAttributeType>(_RoadAttribute_QNAME, RoadAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficVolumeAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "TrafficVolumeAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "RoadAttribute")
    public JAXBElement<TrafficVolumeAttributeType> createTrafficVolumeAttribute(TrafficVolumeAttributeType value) {
        return new JAXBElement<TrafficVolumeAttributeType>(_TrafficVolumeAttribute_QNAME, TrafficVolumeAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "RoadStructureAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "RoadAttribute")
    public JAXBElement<RoadStructureAttributeType> createRoadStructureAttribute(RoadStructureAttributeType value) {
        return new JAXBElement<RoadStructureAttributeType>(_RoadStructureAttribute_QNAME, RoadStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoadDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "RoadDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "RoadAttribute")
    public JAXBElement<RoadDataQualityAttributeType> createRoadDataQualityAttribute(RoadDataQualityAttributeType value) {
        return new JAXBElement<RoadDataQualityAttributeType>(_RoadDataQualityAttribute_QNAME, RoadDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "TrafficAreaAttribute")
    public JAXBElement<TrafficAreaAttributeType> createTrafficAreaAttribute(TrafficAreaAttributeType value) {
        return new JAXBElement<TrafficAreaAttributeType>(_TrafficAreaAttribute_QNAME, TrafficAreaAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrafficAreaStructureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "TrafficAreaStructureAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "TrafficAreaAttribute")
    public JAXBElement<TrafficAreaStructureAttributeType> createTrafficAreaStructureAttribute(TrafficAreaStructureAttributeType value) {
        return new JAXBElement<TrafficAreaStructureAttributeType>(_TrafficAreaStructureAttribute_QNAME, TrafficAreaStructureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "cityFurnitureDetailAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<CityFurnitureDetailAttributePropertyType> createCityFurnitureDetailAttributeProperty(CityFurnitureDetailAttributePropertyType value) {
        return new JAXBElement<CityFurnitureDetailAttributePropertyType>(_CityFurnitureDetailAttributeProperty_QNAME, CityFurnitureDetailAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "cityFurnitureDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityfurniture/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityFurniture")
    public JAXBElement<CityFurnitureDataQualityAttributePropertyType> createCityFurnitureDataQualityAttributeProperty(CityFurnitureDataQualityAttributePropertyType value) {
        return new JAXBElement<CityFurnitureDataQualityAttributePropertyType>(_CityFurnitureDataQualityAttributeProperty_QNAME, CityFurnitureDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureAttributeType> createCityFurnitureAttribute(CityFurnitureAttributeType value) {
        return new JAXBElement<CityFurnitureAttributeType>(_CityFurnitureAttribute_QNAME, CityFurnitureAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDetailAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "CityFurnitureDetailAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureDetailAttributeType> createCityFurnitureDetailAttribute(CityFurnitureDetailAttributeType value) {
        return new JAXBElement<CityFurnitureDetailAttributeType>(_CityFurnitureDetailAttribute_QNAME, CityFurnitureDetailAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityFurnitureDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "CityFurnitureDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "CityFurnitureAttribute")
    public JAXBElement<CityFurnitureDataQualityAttributeType> createCityFurnitureDataQualityAttribute(CityFurnitureDataQualityAttributeType value) {
        return new JAXBElement<CityFurnitureDataQualityAttributeType>(_CityFurnitureDataQualityAttribute_QNAME, CityFurnitureDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "vegetationDataQualityAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/vegetation/2.0", substitutionHeadName = "_GenericApplicationPropertyOfVegetationObject")
    public JAXBElement<VegetationDataQualityAttributePropertyType> createVegetationDataQualityAttributeProperty(VegetationDataQualityAttributePropertyType value) {
        return new JAXBElement<VegetationDataQualityAttributePropertyType>(_VegetationDataQualityAttributeProperty_QNAME, VegetationDataQualityAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "VegetationAttribute")
    public JAXBElement<VegetationAttributeType> createVegetationAttribute(VegetationAttributeType value) {
        return new JAXBElement<VegetationAttributeType>(_VegetationAttribute_QNAME, VegetationAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VegetationDataQualityAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "VegetationDataQualityAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "VegetationAttribute")
    public JAXBElement<VegetationDataQualityAttributeType> createVegetationDataQualityAttribute(VegetationDataQualityAttributeType value) {
        return new JAXBElement<VegetationDataQualityAttributeType>(_VegetationDataQualityAttribute_QNAME, VegetationDataQualityAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributePropertyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributePropertyType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "floodingRiskAttribute", substitutionHeadNamespace = "http://www.opengis.net/citygml/waterbody/2.0", substitutionHeadName = "_GenericApplicationPropertyOfWaterBody")
    public JAXBElement<WaterBodyFloodingRiskAttributePropertyType> createFloodingRiskAttribute(WaterBodyFloodingRiskAttributePropertyType value) {
        return new JAXBElement<WaterBodyFloodingRiskAttributePropertyType>(_FloodingRiskAttribute_QNAME, WaterBodyFloodingRiskAttributePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyAttribute")
    public JAXBElement<WaterBodyAttributeType> createWaterBodyAttribute(WaterBodyAttributeType value) {
        return new JAXBElement<WaterBodyAttributeType>(_WaterBodyAttribute_QNAME, WaterBodyAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "WaterBodyAttribute")
    public JAXBElement<WaterBodyFloodingRiskAttributeType> createWaterBodyFloodingRiskAttribute(WaterBodyFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyFloodingRiskAttributeType>(_WaterBodyFloodingRiskAttribute_QNAME, WaterBodyFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyRiverFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyRiverFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyRiverFloodingRiskAttributeType> createWaterBodyRiverFloodingRiskAttribute(WaterBodyRiverFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyRiverFloodingRiskAttributeType>(_WaterBodyRiverFloodingRiskAttribute_QNAME, WaterBodyRiverFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyTsunamiRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyTsunamiRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyTsunamiRiskAttributeType> createWaterBodyTsunamiRiskAttribute(WaterBodyTsunamiRiskAttributeType value) {
        return new JAXBElement<WaterBodyTsunamiRiskAttributeType>(_WaterBodyTsunamiRiskAttribute_QNAME, WaterBodyTsunamiRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyHighTideRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyHighTideRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyHighTideRiskAttributeType> createWaterBodyHighTideRiskAttribute(WaterBodyHighTideRiskAttributeType value) {
        return new JAXBElement<WaterBodyHighTideRiskAttributeType>(_WaterBodyHighTideRiskAttribute_QNAME, WaterBodyHighTideRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaterBodyInlandFloodingRiskAttributeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "WaterBodyInlandFloodingRiskAttribute", substitutionHeadNamespace = "https://www.geospatial.jp/iur/uro/2.0", substitutionHeadName = "WaterBodyFloodingRiskAttribute")
    public JAXBElement<WaterBodyInlandFloodingRiskAttributeType> createWaterBodyInlandFloodingRiskAttribute(WaterBodyInlandFloodingRiskAttributeType value) {
        return new JAXBElement<WaterBodyInlandFloodingRiskAttributeType>(_WaterBodyInlandFloodingRiskAttribute_QNAME, WaterBodyInlandFloodingRiskAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "fiscalYearOfPublication", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<XMLGregorianCalendar> createFiscalYearOfPublication(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FiscalYearOfPublication_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.geospatial.jp/iur/uro/2.0", name = "language", substitutionHeadNamespace = "http://www.opengis.net/citygml/cityobjectgroup/2.0", substitutionHeadName = "_GenericApplicationPropertyOfCityObjectGroup")
    public JAXBElement<CodeType> createLanguage(CodeType value) {
        return new JAXBElement<CodeType>(_Language_QNAME, CodeType.class, null, value);
    }

}
