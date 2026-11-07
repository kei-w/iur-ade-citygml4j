//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractCityObjectType;
import net.opengis.gml.GeometryPropertyType;


/**
 * <p>Java class for AbstractConstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractConstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractCityObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionOfConstruction" type="{https://www.geospatial.jp/iur/uro/3.1}ConditionOfConstructionValue" minOccurs="0"/&gt;
 *         &lt;element name="dateOfConstruction" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateOfDemolition" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="constructionEvent" type="{https://www.geospatial.jp/iur/uro/3.1}ConstructionEventPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="elevation" type="{https://www.geospatial.jp/iur/uro/3.1}ElevationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{https://www.geospatial.jp/iur/uro/3.1}HeightPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="occupancy" type="{https://www.geospatial.jp/iur/uro/3.1}OccupancyPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityTypeAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}FacilityTypeAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityIdAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}FacilityIdAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consFacilityAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}FacilityAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consBaseAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}ConstructionBaseAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consStructureAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}ConstructionStructureAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consDisasterRiskAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}DisasterRiskAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consDmAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}DmAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="consDataQualityAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}DataQualityAttributePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="consKeyValuePairAttribute" type="{https://www.geospatial.jp/iur/uro/3.1}KeyValuePairAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lod0Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod1Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod2Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod3Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="lod4Geometry" type="{http://www.opengis.net/gml}GeometryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="boundedBy" type="{https://www.geospatial.jp/iur/uro/3.1}_BoundarySurfacePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constructionInstallation" type="{https://www.geospatial.jp/iur/uro/3.1}ConstructionInstallationPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractConstructionType", propOrder = {
    "rest"
})
@XmlSeeAlso({
    OtherConstructionType.class
})
public class AbstractConstructionType
    extends AbstractCityObjectType
{

    @XmlElementRefs({
        @XmlElementRef(name = "conditionOfConstruction", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateOfConstruction", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateOfDemolition", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "constructionEvent", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "elevation", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "height", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "occupancy", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consFacilityTypeAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consFacilityIdAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consFacilityAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consBaseAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consStructureAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consDisasterRiskAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consDmAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consDataQualityAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "consKeyValuePairAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lod0Geometry", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lod1Geometry", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lod2Geometry", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lod3Geometry", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lod4Geometry", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "boundedBy", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "constructionInstallation", namespace = "https://www.geospatial.jp/iur/uro/3.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BoundedBy" is used by two different parts of a schema. See: 
     * line 1777 of file:/D:/Tools/ade-xjc-2.10.0/ade-xjc-2.10.0/iur-3.1/schemas/urbanObject.xsd
     * line 28 of file:/D:/Tools/ade-xjc-2.10.0/ade-xjc-2.10.0/schemas/gml/3.1.1/base/feature.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ConditionOfConstructionValue }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstructionEventPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElevationPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link HeightPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link OccupancyPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityTypeAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityIdAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilityAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstructionBaseAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstructionStructureAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisasterRiskAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataQualityAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyValuePairAttributePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link _BoundarySurfacePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstructionInstallationPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
