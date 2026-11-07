//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureType;


/**
 * <p>Java class for PointCloudSpecAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointCloudSpecAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcScale" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="srcRequiredHorizontalAccuracy" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="srcRequiredVerticalAccuracy" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="srcRequiredPointDensity" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="srcFilteringCriteria" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcGridInterval" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="isIntensity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="spectralBandSet" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isReturnInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isStandardClassification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customClassificationType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pointCloudAssociationMethod" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="pointSubsamplingInfo" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCloudSpecAttributeType", propOrder = {
    "clazz",
    "function",
    "srcScale",
    "srcRequiredHorizontalAccuracy",
    "srcRequiredVerticalAccuracy",
    "srcRequiredPointDensity",
    "srcFilteringCriteria",
    "srcGridInterval",
    "isIntensity",
    "spectralBandSet",
    "isReturnInfo",
    "isStandardClassification",
    "customClassificationType",
    "pointCloudAssociationMethod",
    "pointSubsamplingInfo"
})
public class PointCloudSpecAttributeType {

    @XmlElement(name = "class", required = true)
    protected CodeType clazz;
    protected List<CodeType> function;
    protected CodeType srcScale;
    protected LengthType srcRequiredHorizontalAccuracy;
    protected LengthType srcRequiredVerticalAccuracy;
    protected MeasureType srcRequiredPointDensity;
    protected List<CodeType> srcFilteringCriteria;
    protected MeasureType srcGridInterval;
    protected Boolean isIntensity;
    protected List<CodeType> spectralBandSet;
    protected Boolean isReturnInfo;
    protected Boolean isStandardClassification;
    protected List<CodeType> customClassificationType;
    @XmlElement(required = true)
    protected CodeType pointCloudAssociationMethod;
    protected CodeType pointSubsamplingInfo;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * Gets the value of the srcScale property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScale() {
        return srcScale;
    }

    /**
     * Sets the value of the srcScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScale(CodeType value) {
        this.srcScale = value;
    }

    public boolean isSetSrcScale() {
        return (this.srcScale!= null);
    }

    /**
     * Gets the value of the srcRequiredHorizontalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSrcRequiredHorizontalAccuracy() {
        return srcRequiredHorizontalAccuracy;
    }

    /**
     * Sets the value of the srcRequiredHorizontalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSrcRequiredHorizontalAccuracy(LengthType value) {
        this.srcRequiredHorizontalAccuracy = value;
    }

    public boolean isSetSrcRequiredHorizontalAccuracy() {
        return (this.srcRequiredHorizontalAccuracy!= null);
    }

    /**
     * Gets the value of the srcRequiredVerticalAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSrcRequiredVerticalAccuracy() {
        return srcRequiredVerticalAccuracy;
    }

    /**
     * Sets the value of the srcRequiredVerticalAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSrcRequiredVerticalAccuracy(LengthType value) {
        this.srcRequiredVerticalAccuracy = value;
    }

    public boolean isSetSrcRequiredVerticalAccuracy() {
        return (this.srcRequiredVerticalAccuracy!= null);
    }

    /**
     * Gets the value of the srcRequiredPointDensity property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSrcRequiredPointDensity() {
        return srcRequiredPointDensity;
    }

    /**
     * Sets the value of the srcRequiredPointDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSrcRequiredPointDensity(MeasureType value) {
        this.srcRequiredPointDensity = value;
    }

    public boolean isSetSrcRequiredPointDensity() {
        return (this.srcRequiredPointDensity!= null);
    }

    /**
     * Gets the value of the srcFilteringCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcFilteringCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcFilteringCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSrcFilteringCriteria() {
        if (srcFilteringCriteria == null) {
            srcFilteringCriteria = new ArrayList<CodeType>();
        }
        return this.srcFilteringCriteria;
    }

    public boolean isSetSrcFilteringCriteria() {
        return ((this.srcFilteringCriteria!= null)&&(!this.srcFilteringCriteria.isEmpty()));
    }

    public void unsetSrcFilteringCriteria() {
        this.srcFilteringCriteria = null;
    }

    /**
     * Gets the value of the srcGridInterval property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSrcGridInterval() {
        return srcGridInterval;
    }

    /**
     * Sets the value of the srcGridInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSrcGridInterval(MeasureType value) {
        this.srcGridInterval = value;
    }

    public boolean isSetSrcGridInterval() {
        return (this.srcGridInterval!= null);
    }

    /**
     * Gets the value of the isIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntensity() {
        return isIntensity;
    }

    /**
     * Sets the value of the isIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntensity(Boolean value) {
        this.isIntensity = value;
    }

    public boolean isSetIsIntensity() {
        return (this.isIntensity!= null);
    }

    /**
     * Gets the value of the spectralBandSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectralBandSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpectralBandSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSpectralBandSet() {
        if (spectralBandSet == null) {
            spectralBandSet = new ArrayList<CodeType>();
        }
        return this.spectralBandSet;
    }

    public boolean isSetSpectralBandSet() {
        return ((this.spectralBandSet!= null)&&(!this.spectralBandSet.isEmpty()));
    }

    public void unsetSpectralBandSet() {
        this.spectralBandSet = null;
    }

    /**
     * Gets the value of the isReturnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturnInfo() {
        return isReturnInfo;
    }

    /**
     * Sets the value of the isReturnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturnInfo(Boolean value) {
        this.isReturnInfo = value;
    }

    public boolean isSetIsReturnInfo() {
        return (this.isReturnInfo!= null);
    }

    /**
     * Gets the value of the isStandardClassification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStandardClassification() {
        return isStandardClassification;
    }

    /**
     * Sets the value of the isStandardClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStandardClassification(Boolean value) {
        this.isStandardClassification = value;
    }

    public boolean isSetIsStandardClassification() {
        return (this.isStandardClassification!= null);
    }

    /**
     * Gets the value of the customClassificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customClassificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomClassificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCustomClassificationType() {
        if (customClassificationType == null) {
            customClassificationType = new ArrayList<CodeType>();
        }
        return this.customClassificationType;
    }

    public boolean isSetCustomClassificationType() {
        return ((this.customClassificationType!= null)&&(!this.customClassificationType.isEmpty()));
    }

    public void unsetCustomClassificationType() {
        this.customClassificationType = null;
    }

    /**
     * Gets the value of the pointCloudAssociationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPointCloudAssociationMethod() {
        return pointCloudAssociationMethod;
    }

    /**
     * Sets the value of the pointCloudAssociationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPointCloudAssociationMethod(CodeType value) {
        this.pointCloudAssociationMethod = value;
    }

    public boolean isSetPointCloudAssociationMethod() {
        return (this.pointCloudAssociationMethod!= null);
    }

    /**
     * Gets the value of the pointSubsamplingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPointSubsamplingInfo() {
        return pointSubsamplingInfo;
    }

    /**
     * Sets the value of the pointSubsamplingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPointSubsamplingInfo(CodeType value) {
        this.pointSubsamplingInfo = value;
    }

    public boolean isSetPointSubsamplingInfo() {
        return (this.pointSubsamplingInfo!= null);
    }

}
