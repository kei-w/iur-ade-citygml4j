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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}IfcObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="representationContexts" type="{https://www.geospatial.jp/iur/uro/3.0}IfcGeometricRepresentationContextPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="unitsInContext" type="{https://www.geospatial.jp/iur/uro/3.0}IfcUnitPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcProjectType", propOrder = {
    "longName",
    "phase",
    "representationContexts",
    "unitsInContext"
})
public class IfcProjectType
    extends IfcObjectType
{

    protected String longName;
    protected String phase;
    protected IfcGeometricRepresentationContextPropertyType representationContexts;
    protected List<IfcUnitPropertyType> unitsInContext;

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    public boolean isSetLongName() {
        return (this.longName!= null);
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    public boolean isSetPhase() {
        return (this.phase!= null);
    }

    /**
     * Gets the value of the representationContexts property.
     * 
     * @return
     *     possible object is
     *     {@link IfcGeometricRepresentationContextPropertyType }
     *     
     */
    public IfcGeometricRepresentationContextPropertyType getRepresentationContexts() {
        return representationContexts;
    }

    /**
     * Sets the value of the representationContexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcGeometricRepresentationContextPropertyType }
     *     
     */
    public void setRepresentationContexts(IfcGeometricRepresentationContextPropertyType value) {
        this.representationContexts = value;
    }

    public boolean isSetRepresentationContexts() {
        return (this.representationContexts!= null);
    }

    /**
     * Gets the value of the unitsInContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsInContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsInContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IfcUnitPropertyType }
     * 
     * 
     */
    public List<IfcUnitPropertyType> getUnitsInContext() {
        if (unitsInContext == null) {
            unitsInContext = new ArrayList<IfcUnitPropertyType>();
        }
        return this.unitsInContext;
    }

    public boolean isSetUnitsInContext() {
        return ((this.unitsInContext!= null)&&(!this.unitsInContext.isEmpty()));
    }

    public void unsetUnitsInContext() {
        this.unitsInContext = null;
    }

}
