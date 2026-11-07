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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for PublicSurveyDataQualityAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicSurveyDataQualityAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srcScaleLod0" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="srcScaleLod1" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="srcScaleLod2" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="srcScaleLod3" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="srcScaleLod4" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveySrcDescLod0" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveySrcDescLod1" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveySrcDescLod2" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveySrcDescLod3" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="publicSurveySrcDescLod4" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicSurveyDataQualityAttributeType", propOrder = {
    "srcScaleLod0",
    "srcScaleLod1",
    "srcScaleLod2",
    "srcScaleLod3",
    "srcScaleLod4",
    "publicSurveySrcDescLod0",
    "publicSurveySrcDescLod1",
    "publicSurveySrcDescLod2",
    "publicSurveySrcDescLod3",
    "publicSurveySrcDescLod4"
})
public class PublicSurveyDataQualityAttributeType {

    protected CodeType srcScaleLod0;
    protected CodeType srcScaleLod1;
    protected CodeType srcScaleLod2;
    protected CodeType srcScaleLod3;
    protected CodeType srcScaleLod4;
    protected List<CodeType> publicSurveySrcDescLod0;
    protected List<CodeType> publicSurveySrcDescLod1;
    protected List<CodeType> publicSurveySrcDescLod2;
    protected List<CodeType> publicSurveySrcDescLod3;
    protected List<CodeType> publicSurveySrcDescLod4;

    /**
     * Gets the value of the srcScaleLod0 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScaleLod0() {
        return srcScaleLod0;
    }

    /**
     * Sets the value of the srcScaleLod0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScaleLod0(CodeType value) {
        this.srcScaleLod0 = value;
    }

    public boolean isSetSrcScaleLod0() {
        return (this.srcScaleLod0 != null);
    }

    /**
     * Gets the value of the srcScaleLod1 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScaleLod1() {
        return srcScaleLod1;
    }

    /**
     * Sets the value of the srcScaleLod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScaleLod1(CodeType value) {
        this.srcScaleLod1 = value;
    }

    public boolean isSetSrcScaleLod1() {
        return (this.srcScaleLod1 != null);
    }

    /**
     * Gets the value of the srcScaleLod2 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScaleLod2() {
        return srcScaleLod2;
    }

    /**
     * Sets the value of the srcScaleLod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScaleLod2(CodeType value) {
        this.srcScaleLod2 = value;
    }

    public boolean isSetSrcScaleLod2() {
        return (this.srcScaleLod2 != null);
    }

    /**
     * Gets the value of the srcScaleLod3 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScaleLod3() {
        return srcScaleLod3;
    }

    /**
     * Sets the value of the srcScaleLod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScaleLod3(CodeType value) {
        this.srcScaleLod3 = value;
    }

    public boolean isSetSrcScaleLod3() {
        return (this.srcScaleLod3 != null);
    }

    /**
     * Gets the value of the srcScaleLod4 property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSrcScaleLod4() {
        return srcScaleLod4;
    }

    /**
     * Sets the value of the srcScaleLod4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSrcScaleLod4(CodeType value) {
        this.srcScaleLod4 = value;
    }

    public boolean isSetSrcScaleLod4() {
        return (this.srcScaleLod4 != null);
    }

    /**
     * Gets the value of the publicSurveySrcDescLod0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSurveySrcDescLod0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSurveySrcDescLod0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPublicSurveySrcDescLod0() {
        if (publicSurveySrcDescLod0 == null) {
            publicSurveySrcDescLod0 = new ArrayList<CodeType>();
        }
        return this.publicSurveySrcDescLod0;
    }

    public boolean isSetPublicSurveySrcDescLod0() {
        return ((this.publicSurveySrcDescLod0 != null)&&(!this.publicSurveySrcDescLod0 .isEmpty()));
    }

    public void unsetPublicSurveySrcDescLod0() {
        this.publicSurveySrcDescLod0 = null;
    }

    /**
     * Gets the value of the publicSurveySrcDescLod1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSurveySrcDescLod1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSurveySrcDescLod1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPublicSurveySrcDescLod1() {
        if (publicSurveySrcDescLod1 == null) {
            publicSurveySrcDescLod1 = new ArrayList<CodeType>();
        }
        return this.publicSurveySrcDescLod1;
    }

    public boolean isSetPublicSurveySrcDescLod1() {
        return ((this.publicSurveySrcDescLod1 != null)&&(!this.publicSurveySrcDescLod1 .isEmpty()));
    }

    public void unsetPublicSurveySrcDescLod1() {
        this.publicSurveySrcDescLod1 = null;
    }

    /**
     * Gets the value of the publicSurveySrcDescLod2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSurveySrcDescLod2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSurveySrcDescLod2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPublicSurveySrcDescLod2() {
        if (publicSurveySrcDescLod2 == null) {
            publicSurveySrcDescLod2 = new ArrayList<CodeType>();
        }
        return this.publicSurveySrcDescLod2;
    }

    public boolean isSetPublicSurveySrcDescLod2() {
        return ((this.publicSurveySrcDescLod2 != null)&&(!this.publicSurveySrcDescLod2 .isEmpty()));
    }

    public void unsetPublicSurveySrcDescLod2() {
        this.publicSurveySrcDescLod2 = null;
    }

    /**
     * Gets the value of the publicSurveySrcDescLod3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSurveySrcDescLod3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSurveySrcDescLod3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPublicSurveySrcDescLod3() {
        if (publicSurveySrcDescLod3 == null) {
            publicSurveySrcDescLod3 = new ArrayList<CodeType>();
        }
        return this.publicSurveySrcDescLod3;
    }

    public boolean isSetPublicSurveySrcDescLod3() {
        return ((this.publicSurveySrcDescLod3 != null)&&(!this.publicSurveySrcDescLod3 .isEmpty()));
    }

    public void unsetPublicSurveySrcDescLod3() {
        this.publicSurveySrcDescLod3 = null;
    }

    /**
     * Gets the value of the publicSurveySrcDescLod4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicSurveySrcDescLod4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicSurveySrcDescLod4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPublicSurveySrcDescLod4() {
        if (publicSurveySrcDescLod4 == null) {
            publicSurveySrcDescLod4 = new ArrayList<CodeType>();
        }
        return this.publicSurveySrcDescLod4;
    }

    public boolean isSetPublicSurveySrcDescLod4() {
        return ((this.publicSurveySrcDescLod4 != null)&&(!this.publicSurveySrcDescLod4 .isEmpty()));
    }

    public void unsetPublicSurveySrcDescLod4() {
        this.publicSurveySrcDescLod4 = null;
    }

}
