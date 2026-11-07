//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for UrgentUrbanRenewalAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrgentUrbanRenewalAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="developmentPolicy" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *         &lt;element name="privateProject" type="{https://www.geospatial.jp/iur/urf/2.0}PrivateUrbanRenewalProjectPlanPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specifiedArea" type="{https://www.geospatial.jp/iur/urf/2.0}SpecifiedUrgentUrbanRenewalAreaPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specialDistrict" type="{https://www.geospatial.jp/iur/urf/2.0}SpecialUrbanRenaissanceDistrictPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrgentUrbanRenewalAreaType", propOrder = {
    "developmentPolicy",
    "privateProject",
    "specifiedArea",
    "specialDistrict"
})
@XmlSeeAlso({
    SpecifiedUrgentUrbanRenewalAreaType.class
})
public class UrgentUrbanRenewalAreaType
    extends ZoneType
{

    protected StringOrRefType developmentPolicy;
    protected List<PrivateUrbanRenewalProjectPlanPropertyType> privateProject;
    protected List<SpecifiedUrgentUrbanRenewalAreaPropertyType> specifiedArea;
    protected List<SpecialUrbanRenaissanceDistrictPropertyType> specialDistrict;

    /**
     * Gets the value of the developmentPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDevelopmentPolicy() {
        return developmentPolicy;
    }

    /**
     * Sets the value of the developmentPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDevelopmentPolicy(StringOrRefType value) {
        this.developmentPolicy = value;
    }

    public boolean isSetDevelopmentPolicy() {
        return (this.developmentPolicy!= null);
    }

    /**
     * Gets the value of the privateProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privateProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateUrbanRenewalProjectPlanPropertyType }
     * 
     * 
     */
    public List<PrivateUrbanRenewalProjectPlanPropertyType> getPrivateProject() {
        if (privateProject == null) {
            privateProject = new ArrayList<PrivateUrbanRenewalProjectPlanPropertyType>();
        }
        return this.privateProject;
    }

    public boolean isSetPrivateProject() {
        return ((this.privateProject!= null)&&(!this.privateProject.isEmpty()));
    }

    public void unsetPrivateProject() {
        this.privateProject = null;
    }

    /**
     * Gets the value of the specifiedArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedUrgentUrbanRenewalAreaPropertyType }
     * 
     * 
     */
    public List<SpecifiedUrgentUrbanRenewalAreaPropertyType> getSpecifiedArea() {
        if (specifiedArea == null) {
            specifiedArea = new ArrayList<SpecifiedUrgentUrbanRenewalAreaPropertyType>();
        }
        return this.specifiedArea;
    }

    public boolean isSetSpecifiedArea() {
        return ((this.specifiedArea!= null)&&(!this.specifiedArea.isEmpty()));
    }

    public void unsetSpecifiedArea() {
        this.specifiedArea = null;
    }

    /**
     * Gets the value of the specialDistrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDistrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialUrbanRenaissanceDistrictPropertyType }
     * 
     * 
     */
    public List<SpecialUrbanRenaissanceDistrictPropertyType> getSpecialDistrict() {
        if (specialDistrict == null) {
            specialDistrict = new ArrayList<SpecialUrbanRenaissanceDistrictPropertyType>();
        }
        return this.specialDistrict;
    }

    public boolean isSetSpecialDistrict() {
        return ((this.specialDistrict!= null)&&(!this.specialDistrict.isEmpty()));
    }

    public void unsetSpecialDistrict() {
        this.specialDistrict = null;
    }

}
