//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSitePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSitePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}IfcSite"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSitePropertyType", propOrder = {
    "ifcSite"
})
public class IfcSitePropertyType {

    @XmlElement(name = "IfcSite", required = true)
    protected IfcSiteType ifcSite;

    /**
     * Gets the value of the ifcSite property.
     * 
     * @return
     *     possible object is
     *     {@link IfcSiteType }
     *     
     */
    public IfcSiteType getIfcSite() {
        return ifcSite;
    }

    /**
     * Sets the value of the ifcSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link IfcSiteType }
     *     
     */
    public void setIfcSite(IfcSiteType value) {
        this.ifcSite = value;
    }

    public boolean isSetIfcSite() {
        return (this.ifcSite!= null);
    }

}
