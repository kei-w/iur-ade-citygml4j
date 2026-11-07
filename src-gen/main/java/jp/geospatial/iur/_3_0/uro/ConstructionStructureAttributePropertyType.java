//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionStructureAttributePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionStructureAttributePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/uro/3.0}ConstructionStructureAttribute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionStructureAttributePropertyType", propOrder = {
    "constructionStructureAttribute"
})
public class ConstructionStructureAttributePropertyType {

    @XmlElementRef(name = "ConstructionStructureAttribute", namespace = "https://www.geospatial.jp/iur/uro/3.0", type = JAXBElement.class)
    protected JAXBElement<? extends ConstructionStructureAttributeType> constructionStructureAttribute;

    /**
     * Gets the value of the constructionStructureAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmbankmentAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DamAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConstructionStructureAttributeType }{@code >}
     *     
     */
    public JAXBElement<? extends ConstructionStructureAttributeType> getConstructionStructureAttribute() {
        return constructionStructureAttribute;
    }

    /**
     * Sets the value of the constructionStructureAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmbankmentAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DamAttributeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConstructionStructureAttributeType }{@code >}
     *     
     */
    public void setConstructionStructureAttribute(JAXBElement<? extends ConstructionStructureAttributeType> value) {
        this.constructionStructureAttribute = value;
    }

    public boolean isSetConstructionStructureAttribute() {
        return (this.constructionStructureAttribute!= null);
    }

}
