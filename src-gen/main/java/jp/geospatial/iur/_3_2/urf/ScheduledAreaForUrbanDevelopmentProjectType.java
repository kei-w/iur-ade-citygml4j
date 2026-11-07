//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduledAreaForUrbanDevelopmentProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledAreaForUrbanDevelopmentProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}ZoneType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduledExecutor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledAreaForUrbanDevelopmentProjectType", propOrder = {
    "scheduledExecutor"
})
@XmlSeeAlso({
    ScheduledAreaForCollectiveGovernmentAndPublicOfficeFacilitiesType.class,
    ScheduledAreaForCollectiveHousingFacilitiesType.class,
    ScheduledAreaForDistributionBusinessParkType.class,
    ScheduledAreaForIndustrialParkDevelopmentProjectsType.class,
    ScheduledAreaForNewHousingAndUrbanDevelopmentProjectsType.class,
    ScheduledAreaForNewUrbanInfrastructureProjectsType.class
})
public class ScheduledAreaForUrbanDevelopmentProjectType
    extends ZoneType
{

    @XmlElement(required = true)
    protected String scheduledExecutor;

    /**
     * Gets the value of the scheduledExecutor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledExecutor() {
        return scheduledExecutor;
    }

    /**
     * Sets the value of the scheduledExecutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledExecutor(String value) {
        this.scheduledExecutor = value;
    }

    public boolean isSetScheduledExecutor() {
        return (this.scheduledExecutor!= null);
    }

}
