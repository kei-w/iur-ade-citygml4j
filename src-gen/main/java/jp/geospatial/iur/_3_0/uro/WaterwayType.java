//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.citygml.transportation._2.TransportationComplexType;


/**
 * <p>Java class for WaterwayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterwayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/citygml/transportation/2.0}TransportationComplexType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="waterwayDetailAttribute" type="{https://www.geospatial.jp/iur/uro/3.0}WaterwayDetailAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaterwayType", propOrder = {
    "waterwayDetailAttribute"
})
public class WaterwayType
    extends TransportationComplexType
{

    protected WaterwayDetailAttributePropertyType waterwayDetailAttribute;

    /**
     * Gets the value of the waterwayDetailAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link WaterwayDetailAttributePropertyType }
     *     
     */
    public WaterwayDetailAttributePropertyType getWaterwayDetailAttribute() {
        return waterwayDetailAttribute;
    }

    /**
     * Sets the value of the waterwayDetailAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterwayDetailAttributePropertyType }
     *     
     */
    public void setWaterwayDetailAttribute(WaterwayDetailAttributePropertyType value) {
        this.waterwayDetailAttribute = value;
    }

    public boolean isSetWaterwayDetailAttribute() {
        return (this.waterwayDetailAttribute!= null);
    }

}
