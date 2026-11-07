//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:44:33 JST 2026
//


package jp.geospatial.iur._3_0.urt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * extended file in GTFS-JP
 * 
 * <p>Java class for TranslationJPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslationJPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.0}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="language" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationJPType", propOrder = {
    "language",
    "translation"
})
public class TranslationJPType
    extends PublicTransitType
{

    @XmlElement(required = true)
    protected CodeType language;
    @XmlElement(required = true)
    protected String translation;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLanguage(CodeType value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    public boolean isSetTranslation() {
        return (this.translation!= null);
    }

}
