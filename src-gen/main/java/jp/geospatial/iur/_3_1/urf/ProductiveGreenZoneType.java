//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.geospatial.iur._3_1.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ProductiveGreenZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductiveGreenZoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.1}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specification" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductiveGreenZoneType", propOrder = {
    "zoneNumber",
    "specification"
})
public class ProductiveGreenZoneType
    extends DistrictsAndZonesType
{

    protected String zoneNumber;
    protected CodeType specification;

    /**
     * Gets the value of the zoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneNumber(String value) {
        this.zoneNumber = value;
    }

    public boolean isSetZoneNumber() {
        return (this.zoneNumber!= null);
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSpecification(CodeType value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

}
