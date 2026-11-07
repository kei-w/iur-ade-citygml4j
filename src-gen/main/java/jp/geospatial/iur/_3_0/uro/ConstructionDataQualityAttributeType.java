//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ConstructionDataQualityAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionDataQualityAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srcScale" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geometrySrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thematicSrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataAcquisition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="photoScale" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lod1HeightType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="lodType" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionDataQualityAttributeType", propOrder = {
    "srcScale",
    "geometrySrcDesc",
    "thematicSrcDesc",
    "appearanceSrcDesc",
    "dataAcquisition",
    "photoScale",
    "lod1HeightType",
    "lodType"
})
public class ConstructionDataQualityAttributeType {

    protected List<CodeType> srcScale;
    protected List<CodeType> geometrySrcDesc;
    protected List<CodeType> thematicSrcDesc;
    protected List<CodeType> appearanceSrcDesc;
    protected String dataAcquisition;
    protected BigInteger photoScale;
    protected CodeType lod1HeightType;
    protected List<CodeType> lodType;

    /**
     * Gets the value of the srcScale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcScale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcScale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSrcScale() {
        if (srcScale == null) {
            srcScale = new ArrayList<CodeType>();
        }
        return this.srcScale;
    }

    public boolean isSetSrcScale() {
        return ((this.srcScale!= null)&&(!this.srcScale.isEmpty()));
    }

    public void unsetSrcScale() {
        this.srcScale = null;
    }

    /**
     * Gets the value of the geometrySrcDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometrySrcDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometrySrcDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getGeometrySrcDesc() {
        if (geometrySrcDesc == null) {
            geometrySrcDesc = new ArrayList<CodeType>();
        }
        return this.geometrySrcDesc;
    }

    public boolean isSetGeometrySrcDesc() {
        return ((this.geometrySrcDesc!= null)&&(!this.geometrySrcDesc.isEmpty()));
    }

    public void unsetGeometrySrcDesc() {
        this.geometrySrcDesc = null;
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
     * Gets the value of the appearanceSrcDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appearanceSrcDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppearanceSrcDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getAppearanceSrcDesc() {
        if (appearanceSrcDesc == null) {
            appearanceSrcDesc = new ArrayList<CodeType>();
        }
        return this.appearanceSrcDesc;
    }

    public boolean isSetAppearanceSrcDesc() {
        return ((this.appearanceSrcDesc!= null)&&(!this.appearanceSrcDesc.isEmpty()));
    }

    public void unsetAppearanceSrcDesc() {
        this.appearanceSrcDesc = null;
    }

    /**
     * Gets the value of the dataAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAcquisition() {
        return dataAcquisition;
    }

    /**
     * Sets the value of the dataAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAcquisition(String value) {
        this.dataAcquisition = value;
    }

    public boolean isSetDataAcquisition() {
        return (this.dataAcquisition!= null);
    }

    /**
     * Gets the value of the photoScale property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPhotoScale() {
        return photoScale;
    }

    /**
     * Sets the value of the photoScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPhotoScale(BigInteger value) {
        this.photoScale = value;
    }

    public boolean isSetPhotoScale() {
        return (this.photoScale!= null);
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

}
