//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcCoordinateReferenceSystemSelectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcCoordinateReferenceSystemSelectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="crs" type="{https://www.geospatial.jp/iur/uro/3.0}IfcCoordinateReferenceSystemPropertyType"/&gt;
 *         &lt;element name="context" type="{https://www.geospatial.jp/iur/uro/3.0}IfcGeometricRepresentationContextPropertyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcCoordinateReferenceSystemSelectType", propOrder = {
    "crs",
    "context"
})
public class IfcCoordinateReferenceSystemSelectType {

    protected IfcCoordinateReferenceSystemPropertyType crs;
    protected IfcGeometricRepresentationContextPropertyType context;

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link IfcCoordinateReferenceSystemPropertyType }
     *     
     */
    public IfcCoordinateReferenceSystemPropertyType getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcCoordinateReferenceSystemPropertyType }
     *     
     */
    public void setCrs(IfcCoordinateReferenceSystemPropertyType value) {
        this.crs = value;
    }

    public boolean isSetCrs() {
        return (this.crs!= null);
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link IfcGeometricRepresentationContextPropertyType }
     *     
     */
    public IfcGeometricRepresentationContextPropertyType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcGeometricRepresentationContextPropertyType }
     *     
     */
    public void setContext(IfcGeometricRepresentationContextPropertyType value) {
        this.context = value;
    }

    public boolean isSetContext() {
        return (this.context!= null);
    }

}
