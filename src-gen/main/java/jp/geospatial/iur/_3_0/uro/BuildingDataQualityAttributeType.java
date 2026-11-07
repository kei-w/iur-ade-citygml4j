//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for BuildingDataQualityAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingDataQualityAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}BuildingAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srcScale" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geometrySrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="thematicSrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appearanceSrcDesc" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lod1HeightType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="lodType" type="{https://www.geospatial.jp/iur/uro/3.0}BuildingLODType" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingDataQualityAttributeType", propOrder = {
    "srcScale",
    "geometrySrcDesc",
    "thematicSrcDesc",
    "appearanceSrcDesc",
    "lod1HeightType",
    "lodType"
})
public class BuildingDataQualityAttributeType
    extends BuildingAttributeType
{

    protected List<CodeType> srcScale;
    protected List<CodeType> geometrySrcDesc;
    protected List<CodeType> thematicSrcDesc;
    protected List<CodeType> appearanceSrcDesc;
    @XmlElement(required = true)
    protected CodeType lod1HeightType;
    protected List<String> lodType;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getLodType() {
        if (lodType == null) {
            lodType = new ArrayList<String>();
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
