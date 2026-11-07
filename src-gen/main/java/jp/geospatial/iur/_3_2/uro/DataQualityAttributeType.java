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


/**
 * <p>Java class for DataQualityAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataQualityAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometrySrcDescLod0" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geometrySrcDescLod1" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="geometrySrcDescLod2" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geometrySrcDescLod3" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geometrySrcDescLod4" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thematicSrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDescLod0" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDescLod1" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDescLod2" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDescLod3" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDescLod4" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lodType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lod1HeightType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="tranDataAcquisition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveyDataQualityAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}PublicSurveyDataQualityAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataQualityAttributeType", propOrder = {
    "geometrySrcDescLod0",
    "geometrySrcDescLod1",
    "geometrySrcDescLod2",
    "geometrySrcDescLod3",
    "geometrySrcDescLod4",
    "thematicSrcDesc",
    "appearanceSrcDescLod0",
    "appearanceSrcDescLod1",
    "appearanceSrcDescLod2",
    "appearanceSrcDescLod3",
    "appearanceSrcDescLod4",
    "lodType",
    "lod1HeightType",
    "tranDataAcquisition",
    "publicSurveyDataQualityAttribute"
})
public class DataQualityAttributeType {

    protected List<CodeType> geometrySrcDescLod0;
    @XmlElement(required = true)
    protected List<CodeType> geometrySrcDescLod1;
    protected List<CodeType> geometrySrcDescLod2;
    protected List<CodeType> geometrySrcDescLod3;
    protected List<CodeType> geometrySrcDescLod4;
    protected List<CodeType> thematicSrcDesc;
    protected List<CodeType> appearanceSrcDescLod0;
    protected List<CodeType> appearanceSrcDescLod1;
    protected List<CodeType> appearanceSrcDescLod2;
    protected List<CodeType> appearanceSrcDescLod3;
    protected List<CodeType> appearanceSrcDescLod4;
    protected List<CodeType> lodType;
    protected CodeType lod1HeightType;
    protected String tranDataAcquisition;
    protected PublicSurveyDataQualityAttributePropertyType publicSurveyDataQualityAttribute;

    /**
     * Gets the value of the geometrySrcDescLod0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDescLod0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDescLod0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDescLod0() {
        if (geometrySrcDescLod0 == null) {
            geometrySrcDescLod0 = new ArrayList<CodeType>();
        }
        return this.geometrySrcDescLod0;
    }

    public boolean isSetGeometrySrcDescLod0() {
        return ((this.geometrySrcDescLod0 != null)&&(!this.geometrySrcDescLod0 .isEmpty()));
    }

    public void unsetGeometrySrcDescLod0() {
        this.geometrySrcDescLod0 = null;
    }

    /**
     * Gets the value of the geometrySrcDescLod1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDescLod1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDescLod1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDescLod1() {
        if (geometrySrcDescLod1 == null) {
            geometrySrcDescLod1 = new ArrayList<CodeType>();
        }
        return this.geometrySrcDescLod1;
    }

    public boolean isSetGeometrySrcDescLod1() {
        return ((this.geometrySrcDescLod1 != null)&&(!this.geometrySrcDescLod1 .isEmpty()));
    }

    public void unsetGeometrySrcDescLod1() {
        this.geometrySrcDescLod1 = null;
    }

    /**
     * Gets the value of the geometrySrcDescLod2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDescLod2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDescLod2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDescLod2() {
        if (geometrySrcDescLod2 == null) {
            geometrySrcDescLod2 = new ArrayList<CodeType>();
        }
        return this.geometrySrcDescLod2;
    }

    public boolean isSetGeometrySrcDescLod2() {
        return ((this.geometrySrcDescLod2 != null)&&(!this.geometrySrcDescLod2 .isEmpty()));
    }

    public void unsetGeometrySrcDescLod2() {
        this.geometrySrcDescLod2 = null;
    }

    /**
     * Gets the value of the geometrySrcDescLod3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDescLod3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDescLod3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDescLod3() {
        if (geometrySrcDescLod3 == null) {
            geometrySrcDescLod3 = new ArrayList<CodeType>();
        }
        return this.geometrySrcDescLod3;
    }

    public boolean isSetGeometrySrcDescLod3() {
        return ((this.geometrySrcDescLod3 != null)&&(!this.geometrySrcDescLod3 .isEmpty()));
    }

    public void unsetGeometrySrcDescLod3() {
        this.geometrySrcDescLod3 = null;
    }

    /**
     * Gets the value of the geometrySrcDescLod4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDescLod4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDescLod4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDescLod4() {
        if (geometrySrcDescLod4 == null) {
            geometrySrcDescLod4 = new ArrayList<CodeType>();
        }
        return this.geometrySrcDescLod4;
    }

    public boolean isSetGeometrySrcDescLod4() {
        return ((this.geometrySrcDescLod4 != null)&&(!this.geometrySrcDescLod4 .isEmpty()));
    }

    public void unsetGeometrySrcDescLod4() {
        this.geometrySrcDescLod4 = null;
    }

    /**
     * Gets the value of the thematicSrcDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thematicSrcDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThematicSrcDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getThematicSrcDesc() {
        if (thematicSrcDesc == null) {
            thematicSrcDesc = new ArrayList<CodeType>();
        }
        return this.thematicSrcDesc;
    }

    public boolean isSetThematicSrcDesc() {
        return ((this.thematicSrcDesc!= null)&&(!this.thematicSrcDesc.isEmpty()));
    }

    public void unsetThematicSrcDesc() {
        this.thematicSrcDesc = null;
    }

    /**
     * Gets the value of the appearanceSrcDescLod0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDescLod0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDescLod0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDescLod0() {
        if (appearanceSrcDescLod0 == null) {
            appearanceSrcDescLod0 = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDescLod0;
    }

    public boolean isSetAppearanceSrcDescLod0() {
        return ((this.appearanceSrcDescLod0 != null)&&(!this.appearanceSrcDescLod0 .isEmpty()));
    }

    public void unsetAppearanceSrcDescLod0() {
        this.appearanceSrcDescLod0 = null;
    }

    /**
     * Gets the value of the appearanceSrcDescLod1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDescLod1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDescLod1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDescLod1() {
        if (appearanceSrcDescLod1 == null) {
            appearanceSrcDescLod1 = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDescLod1;
    }

    public boolean isSetAppearanceSrcDescLod1() {
        return ((this.appearanceSrcDescLod1 != null)&&(!this.appearanceSrcDescLod1 .isEmpty()));
    }

    public void unsetAppearanceSrcDescLod1() {
        this.appearanceSrcDescLod1 = null;
    }

    /**
     * Gets the value of the appearanceSrcDescLod2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDescLod2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDescLod2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDescLod2() {
        if (appearanceSrcDescLod2 == null) {
            appearanceSrcDescLod2 = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDescLod2;
    }

    public boolean isSetAppearanceSrcDescLod2() {
        return ((this.appearanceSrcDescLod2 != null)&&(!this.appearanceSrcDescLod2 .isEmpty()));
    }

    public void unsetAppearanceSrcDescLod2() {
        this.appearanceSrcDescLod2 = null;
    }

    /**
     * Gets the value of the appearanceSrcDescLod3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDescLod3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDescLod3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDescLod3() {
        if (appearanceSrcDescLod3 == null) {
            appearanceSrcDescLod3 = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDescLod3;
    }

    public boolean isSetAppearanceSrcDescLod3() {
        return ((this.appearanceSrcDescLod3 != null)&&(!this.appearanceSrcDescLod3 .isEmpty()));
    }

    public void unsetAppearanceSrcDescLod3() {
        this.appearanceSrcDescLod3 = null;
    }

    /**
     * Gets the value of the appearanceSrcDescLod4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDescLod4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDescLod4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDescLod4() {
        if (appearanceSrcDescLod4 == null) {
            appearanceSrcDescLod4 = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDescLod4;
    }

    public boolean isSetAppearanceSrcDescLod4() {
        return ((this.appearanceSrcDescLod4 != null)&&(!this.appearanceSrcDescLod4 .isEmpty()));
    }

    public void unsetAppearanceSrcDescLod4() {
        this.appearanceSrcDescLod4 = null;
    }

    /**
     * Gets the value of the lodType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lodType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLodType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getLodType() {
        if (lodType == null) {
            lodType = new ArrayList<CodeType>();
        }
        return this.lodType;
    }

    public boolean isSetLodType() {
        return ((this.lodType!= null)&&(!this.lodType.isEmpty()));
    }

    public void unsetLodType() {
        this.lodType = null;
    }

    /**
     * Gets the value of the lod1HeightType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLod1HeightType() {
        return lod1HeightType;
    }

    /**
     * Sets the value of the lod1HeightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLod1HeightType(CodeType value) {
        this.lod1HeightType = value;
    }

    public boolean isSetLod1HeightType() {
        return (this.lod1HeightType!= null);
    }

    /**
     * Gets the value of the tranDataAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDataAcquisition() {
        return tranDataAcquisition;
    }

    /**
     * Sets the value of the tranDataAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDataAcquisition(String value) {
        this.tranDataAcquisition = value;
    }

    public boolean isSetTranDataAcquisition() {
        return (this.tranDataAcquisition!= null);
    }

    /**
     * Gets the value of the publicSurveyDataQualityAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link PublicSurveyDataQualityAttributePropertyType }
     *     
     */
    public PublicSurveyDataQualityAttributePropertyType getPublicSurveyDataQualityAttribute() {
        return publicSurveyDataQualityAttribute;
    }

    /**
     * Sets the value of the publicSurveyDataQualityAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicSurveyDataQualityAttributePropertyType }
     *     
     */
    public void setPublicSurveyDataQualityAttribute(PublicSurveyDataQualityAttributePropertyType value) {
        this.publicSurveyDataQualityAttribute = value;
    }

    public boolean isSetPublicSurveyDataQualityAttribute() {
        return (this.publicSurveyDataQualityAttribute!= null);
    }

}
