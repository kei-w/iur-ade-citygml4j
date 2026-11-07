//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.StringOrRefType;


/**
 * <p>Java class for GlobalHubCityDevelopmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalHubCityDevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="implementationBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="implementationPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plan" type="{http://www.opengis.net/gml}StringOrRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalHubCityDevelopmentProjectType", propOrder = {
    "implementationBody",
    "implementationPeriod",
    "plan"
})
public class GlobalHubCityDevelopmentProjectType
    extends ZoneType
{

    protected String implementationBody;
    protected String implementationPeriod;
    protected StringOrRefType plan;

    /**
     * Gets the value of the implementationBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementationBody() {
        return implementationBody;
    }

    /**
     * Sets the value of the implementationBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementationBody(String value) {
        this.implementationBody = value;
    }

    public boolean isSetImplementationBody() {
        return (this.implementationBody!= null);
    }

    /**
     * Gets the value of the implementationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementationPeriod() {
        return implementationPeriod;
    }

    /**
     * Sets the value of the implementationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementationPeriod(String value) {
        this.implementationPeriod = value;
    }

    public boolean isSetImplementationPeriod() {
        return (this.implementationPeriod!= null);
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setPlan(StringOrRefType value) {
        this.plan = value;
    }

    public boolean isSetPlan() {
        return (this.plan!= null);
    }

}
