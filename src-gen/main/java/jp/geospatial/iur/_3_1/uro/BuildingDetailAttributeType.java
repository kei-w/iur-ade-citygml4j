//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:03:47 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for BuildingDetailAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingDetailAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}BuildingAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serialNumberOfBuildingCertification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="totalFloorArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingFootprintArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingRoofEdgeArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="developmentArea" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="buildingStructureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="buildingStructureOrgType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="fireproofStructureType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="implementingBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="urbanPlanType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="areaClassificationType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="districtsAndZonesType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="landUseType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="majorUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="majorUsage2" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="orgUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="orgUsage2" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="detailedUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="detailedUsage2" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="detailedUsage3" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="groundFloorUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="secondFloorUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="thirdFloorUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="basementUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="basementFirstUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="basementSecondUsage" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="vacancy" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="buildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="floorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="specifiedBuildingCoverageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="specifiedFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="standardFloorAreaRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="buildingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="eaveHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surveyYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingDetailAttributeType", propOrder = {
    "serialNumberOfBuildingCertification",
    "siteArea",
    "totalFloorArea",
    "buildingFootprintArea",
    "buildingRoofEdgeArea",
    "developmentArea",
    "buildingStructureType",
    "buildingStructureOrgType",
    "fireproofStructureType",
    "implementingBody",
    "urbanPlanType",
    "areaClassificationType",
    "districtsAndZonesType",
    "landUseType",
    "reference",
    "majorUsage",
    "majorUsage2",
    "orgUsage",
    "orgUsage2",
    "detailedUsage",
    "detailedUsage2",
    "detailedUsage3",
    "groundFloorUsage",
    "secondFloorUsage",
    "thirdFloorUsage",
    "basementUsage",
    "basementFirstUsage",
    "basementSecondUsage",
    "vacancy",
    "buildingCoverageRate",
    "floorAreaRate",
    "specifiedBuildingCoverageRate",
    "specifiedFloorAreaRate",
    "standardFloorAreaRate",
    "buildingHeight",
    "eaveHeight",
    "note",
    "surveyYear"
})
public class BuildingDetailAttributeType
    extends BuildingAttributeType
{

    protected String serialNumberOfBuildingCertification;
    protected MeasureType siteArea;
    protected MeasureType totalFloorArea;
    protected MeasureType buildingFootprintArea;
    protected MeasureType buildingRoofEdgeArea;
    protected MeasureType developmentArea;
    protected CodeType buildingStructureType;
    protected CodeType buildingStructureOrgType;
    protected CodeType fireproofStructureType;
    protected String implementingBody;
    protected CodeType urbanPlanType;
    protected CodeType areaClassificationType;
    protected List<CodeType> districtsAndZonesType;
    protected CodeType landUseType;
    protected String reference;
    protected CodeType majorUsage;
    protected CodeType majorUsage2;
    protected CodeType orgUsage;
    protected CodeType orgUsage2;
    protected CodeType detailedUsage;
    protected CodeType detailedUsage2;
    protected CodeType detailedUsage3;
    protected CodeType groundFloorUsage;
    protected CodeType secondFloorUsage;
    protected CodeType thirdFloorUsage;
    protected CodeType basementUsage;
    protected CodeType basementFirstUsage;
    protected CodeType basementSecondUsage;
    protected CodeType vacancy;
    protected Double buildingCoverageRate;
    protected Double floorAreaRate;
    protected Double specifiedBuildingCoverageRate;
    protected Double specifiedFloorAreaRate;
    protected Double standardFloorAreaRate;
    protected LengthType buildingHeight;
    protected LengthType eaveHeight;
    protected String note;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar surveyYear;

    /**
     * Gets the value of the serialNumberOfBuildingCertification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberOfBuildingCertification() {
        return serialNumberOfBuildingCertification;
    }

    /**
     * Sets the value of the serialNumberOfBuildingCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberOfBuildingCertification(String value) {
        this.serialNumberOfBuildingCertification = value;
    }

    public boolean isSetSerialNumberOfBuildingCertification() {
        return (this.serialNumberOfBuildingCertification!= null);
    }

    /**
     * Gets the value of the siteArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSiteArea() {
        return siteArea;
    }

    /**
     * Sets the value of the siteArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSiteArea(MeasureType value) {
        this.siteArea = value;
    }

    public boolean isSetSiteArea() {
        return (this.siteArea!= null);
    }

    /**
     * Gets the value of the totalFloorArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalFloorArea() {
        return totalFloorArea;
    }

    /**
     * Sets the value of the totalFloorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalFloorArea(MeasureType value) {
        this.totalFloorArea = value;
    }

    public boolean isSetTotalFloorArea() {
        return (this.totalFloorArea!= null);
    }

    /**
     * Gets the value of the buildingFootprintArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBuildingFootprintArea() {
        return buildingFootprintArea;
    }

    /**
     * Sets the value of the buildingFootprintArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBuildingFootprintArea(MeasureType value) {
        this.buildingFootprintArea = value;
    }

    public boolean isSetBuildingFootprintArea() {
        return (this.buildingFootprintArea!= null);
    }

    /**
     * Gets the value of the buildingRoofEdgeArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getBuildingRoofEdgeArea() {
        return buildingRoofEdgeArea;
    }

    /**
     * Sets the value of the buildingRoofEdgeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setBuildingRoofEdgeArea(MeasureType value) {
        this.buildingRoofEdgeArea = value;
    }

    public boolean isSetBuildingRoofEdgeArea() {
        return (this.buildingRoofEdgeArea!= null);
    }

    /**
     * Gets the value of the developmentArea property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDevelopmentArea() {
        return developmentArea;
    }

    /**
     * Sets the value of the developmentArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDevelopmentArea(MeasureType value) {
        this.developmentArea = value;
    }

    public boolean isSetDevelopmentArea() {
        return (this.developmentArea!= null);
    }

    /**
     * Gets the value of the buildingStructureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBuildingStructureType() {
        return buildingStructureType;
    }

    /**
     * Sets the value of the buildingStructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBuildingStructureType(CodeType value) {
        this.buildingStructureType = value;
    }

    public boolean isSetBuildingStructureType() {
        return (this.buildingStructureType!= null);
    }

    /**
     * Gets the value of the buildingStructureOrgType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBuildingStructureOrgType() {
        return buildingStructureOrgType;
    }

    /**
     * Sets the value of the buildingStructureOrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBuildingStructureOrgType(CodeType value) {
        this.buildingStructureOrgType = value;
    }

    public boolean isSetBuildingStructureOrgType() {
        return (this.buildingStructureOrgType!= null);
    }

    /**
     * Gets the value of the fireproofStructureType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFireproofStructureType() {
        return fireproofStructureType;
    }

    /**
     * Sets the value of the fireproofStructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFireproofStructureType(CodeType value) {
        this.fireproofStructureType = value;
    }

    public boolean isSetFireproofStructureType() {
        return (this.fireproofStructureType!= null);
    }

    /**
     * Gets the value of the implementingBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementingBody() {
        return implementingBody;
    }

    /**
     * Sets the value of the implementingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementingBody(String value) {
        this.implementingBody = value;
    }

    public boolean isSetImplementingBody() {
        return (this.implementingBody!= null);
    }

    /**
     * Gets the value of the urbanPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUrbanPlanType() {
        return urbanPlanType;
    }

    /**
     * Sets the value of the urbanPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUrbanPlanType(CodeType value) {
        this.urbanPlanType = value;
    }

    public boolean isSetUrbanPlanType() {
        return (this.urbanPlanType!= null);
    }

    /**
     * Gets the value of the areaClassificationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAreaClassificationType() {
        return areaClassificationType;
    }

    /**
     * Sets the value of the areaClassificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAreaClassificationType(CodeType value) {
        this.areaClassificationType = value;
    }

    public boolean isSetAreaClassificationType() {
        return (this.areaClassificationType!= null);
    }

    /**
     * Gets the value of the districtsAndZonesType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the districtsAndZonesType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrictsAndZonesType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getDistrictsAndZonesType() {
        if (districtsAndZonesType == null) {
            districtsAndZonesType = new ArrayList<CodeType>();
        }
        return this.districtsAndZonesType;
    }

    public boolean isSetDistrictsAndZonesType() {
        return ((this.districtsAndZonesType!= null)&&(!this.districtsAndZonesType.isEmpty()));
    }

    public void unsetDistrictsAndZonesType() {
        this.districtsAndZonesType = null;
    }

    /**
     * Gets the value of the landUseType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLandUseType() {
        return landUseType;
    }

    /**
     * Sets the value of the landUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLandUseType(CodeType value) {
        this.landUseType = value;
    }

    public boolean isSetLandUseType() {
        return (this.landUseType!= null);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference!= null);
    }

    /**
     * Gets the value of the majorUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMajorUsage() {
        return majorUsage;
    }

    /**
     * Sets the value of the majorUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMajorUsage(CodeType value) {
        this.majorUsage = value;
    }

    public boolean isSetMajorUsage() {
        return (this.majorUsage!= null);
    }

    /**
     * Gets the value of the majorUsage2 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMajorUsage2() {
        return majorUsage2;
    }

    /**
     * Sets the value of the majorUsage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMajorUsage2(CodeType value) {
        this.majorUsage2 = value;
    }

    public boolean isSetMajorUsage2() {
        return (this.majorUsage2 != null);
    }

    /**
     * Gets the value of the orgUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOrgUsage() {
        return orgUsage;
    }

    /**
     * Sets the value of the orgUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOrgUsage(CodeType value) {
        this.orgUsage = value;
    }

    public boolean isSetOrgUsage() {
        return (this.orgUsage!= null);
    }

    /**
     * Gets the value of the orgUsage2 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOrgUsage2() {
        return orgUsage2;
    }

    /**
     * Sets the value of the orgUsage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOrgUsage2(CodeType value) {
        this.orgUsage2 = value;
    }

    public boolean isSetOrgUsage2() {
        return (this.orgUsage2 != null);
    }

    /**
     * Gets the value of the detailedUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetailedUsage() {
        return detailedUsage;
    }

    /**
     * Sets the value of the detailedUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetailedUsage(CodeType value) {
        this.detailedUsage = value;
    }

    public boolean isSetDetailedUsage() {
        return (this.detailedUsage!= null);
    }

    /**
     * Gets the value of the detailedUsage2 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetailedUsage2() {
        return detailedUsage2;
    }

    /**
     * Sets the value of the detailedUsage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetailedUsage2(CodeType value) {
        this.detailedUsage2 = value;
    }

    public boolean isSetDetailedUsage2() {
        return (this.detailedUsage2 != null);
    }

    /**
     * Gets the value of the detailedUsage3 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDetailedUsage3() {
        return detailedUsage3;
    }

    /**
     * Sets the value of the detailedUsage3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDetailedUsage3(CodeType value) {
        this.detailedUsage3 = value;
    }

    public boolean isSetDetailedUsage3() {
        return (this.detailedUsage3 != null);
    }

    /**
     * Gets the value of the groundFloorUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGroundFloorUsage() {
        return groundFloorUsage;
    }

    /**
     * Sets the value of the groundFloorUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGroundFloorUsage(CodeType value) {
        this.groundFloorUsage = value;
    }

    public boolean isSetGroundFloorUsage() {
        return (this.groundFloorUsage!= null);
    }

    /**
     * Gets the value of the secondFloorUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSecondFloorUsage() {
        return secondFloorUsage;
    }

    /**
     * Sets the value of the secondFloorUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSecondFloorUsage(CodeType value) {
        this.secondFloorUsage = value;
    }

    public boolean isSetSecondFloorUsage() {
        return (this.secondFloorUsage!= null);
    }

    /**
     * Gets the value of the thirdFloorUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getThirdFloorUsage() {
        return thirdFloorUsage;
    }

    /**
     * Sets the value of the thirdFloorUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setThirdFloorUsage(CodeType value) {
        this.thirdFloorUsage = value;
    }

    public boolean isSetThirdFloorUsage() {
        return (this.thirdFloorUsage!= null);
    }

    /**
     * Gets the value of the basementUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBasementUsage() {
        return basementUsage;
    }

    /**
     * Sets the value of the basementUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBasementUsage(CodeType value) {
        this.basementUsage = value;
    }

    public boolean isSetBasementUsage() {
        return (this.basementUsage!= null);
    }

    /**
     * Gets the value of the basementFirstUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBasementFirstUsage() {
        return basementFirstUsage;
    }

    /**
     * Sets the value of the basementFirstUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBasementFirstUsage(CodeType value) {
        this.basementFirstUsage = value;
    }

    public boolean isSetBasementFirstUsage() {
        return (this.basementFirstUsage!= null);
    }

    /**
     * Gets the value of the basementSecondUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBasementSecondUsage() {
        return basementSecondUsage;
    }

    /**
     * Sets the value of the basementSecondUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBasementSecondUsage(CodeType value) {
        this.basementSecondUsage = value;
    }

    public boolean isSetBasementSecondUsage() {
        return (this.basementSecondUsage!= null);
    }

    /**
     * Gets the value of the vacancy property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVacancy() {
        return vacancy;
    }

    /**
     * Sets the value of the vacancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVacancy(CodeType value) {
        this.vacancy = value;
    }

    public boolean isSetVacancy() {
        return (this.vacancy!= null);
    }

    /**
     * Gets the value of the buildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildingCoverageRate() {
        return buildingCoverageRate;
    }

    /**
     * Sets the value of the buildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildingCoverageRate(Double value) {
        this.buildingCoverageRate = value;
    }

    public boolean isSetBuildingCoverageRate() {
        return (this.buildingCoverageRate!= null);
    }

    /**
     * Gets the value of the floorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloorAreaRate() {
        return floorAreaRate;
    }

    /**
     * Sets the value of the floorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloorAreaRate(Double value) {
        this.floorAreaRate = value;
    }

    public boolean isSetFloorAreaRate() {
        return (this.floorAreaRate!= null);
    }

    /**
     * Gets the value of the specifiedBuildingCoverageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpecifiedBuildingCoverageRate() {
        return specifiedBuildingCoverageRate;
    }

    /**
     * Sets the value of the specifiedBuildingCoverageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpecifiedBuildingCoverageRate(Double value) {
        this.specifiedBuildingCoverageRate = value;
    }

    public boolean isSetSpecifiedBuildingCoverageRate() {
        return (this.specifiedBuildingCoverageRate!= null);
    }

    /**
     * Gets the value of the specifiedFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpecifiedFloorAreaRate() {
        return specifiedFloorAreaRate;
    }

    /**
     * Sets the value of the specifiedFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpecifiedFloorAreaRate(Double value) {
        this.specifiedFloorAreaRate = value;
    }

    public boolean isSetSpecifiedFloorAreaRate() {
        return (this.specifiedFloorAreaRate!= null);
    }

    /**
     * Gets the value of the standardFloorAreaRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardFloorAreaRate() {
        return standardFloorAreaRate;
    }

    /**
     * Sets the value of the standardFloorAreaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardFloorAreaRate(Double value) {
        this.standardFloorAreaRate = value;
    }

    public boolean isSetStandardFloorAreaRate() {
        return (this.standardFloorAreaRate!= null);
    }

    /**
     * Gets the value of the buildingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getBuildingHeight() {
        return buildingHeight;
    }

    /**
     * Sets the value of the buildingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setBuildingHeight(LengthType value) {
        this.buildingHeight = value;
    }

    public boolean isSetBuildingHeight() {
        return (this.buildingHeight!= null);
    }

    /**
     * Gets the value of the eaveHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getEaveHeight() {
        return eaveHeight;
    }

    /**
     * Sets the value of the eaveHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setEaveHeight(LengthType value) {
        this.eaveHeight = value;
    }

    public boolean isSetEaveHeight() {
        return (this.eaveHeight!= null);
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean isSetNote() {
        return (this.note!= null);
    }

    /**
     * Gets the value of the surveyYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyYear() {
        return surveyYear;
    }

    /**
     * Sets the value of the surveyYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyYear(XMLGregorianCalendar value) {
        this.surveyYear = value;
    }

    public boolean isSetSurveyYear() {
        return (this.surveyYear!= null);
    }

}
