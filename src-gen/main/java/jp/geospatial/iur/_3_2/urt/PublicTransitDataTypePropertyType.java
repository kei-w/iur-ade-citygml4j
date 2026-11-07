//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicTransitDataTypePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicTransitDataTypePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.geospatial.jp/iur/urt/3.2}_PublicTransitDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicTransitDataTypePropertyType", propOrder = {
    "_PublicTransitDataType"
})
public class PublicTransitDataTypePropertyType {

    @XmlElementRef(name = "_PublicTransitDataType", namespace = "https://www.geospatial.jp/iur/urt/3.2", type = JAXBElement.class)
    protected JAXBElement<? extends PublicTransitDataTypeType> _PublicTransitDataType;

    /**
     * Gets the value of the _PublicTransitDataType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     *     
     */
    public JAXBElement<? extends PublicTransitDataTypeType> get_PublicTransitDataType() {
        return _PublicTransitDataType;
    }

    /**
     * Sets the value of the _PublicTransitDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TranslationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeedInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PublicTransitDataTypeType }{@code >}
     *     
     */
    public void set_PublicTransitDataType(JAXBElement<? extends PublicTransitDataTypeType> value) {
        this._PublicTransitDataType = value;
    }

    public boolean isSet_PublicTransitDataType() {
        return (this._PublicTransitDataType!= null);
    }

}
