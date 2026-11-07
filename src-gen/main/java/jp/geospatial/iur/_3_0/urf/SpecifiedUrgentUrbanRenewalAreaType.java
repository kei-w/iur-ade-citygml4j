//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:08:29 JST 2026
//


package jp.geospatial.iur._3_0.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecifiedUrgentUrbanRenewalAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedUrgentUrbanRenewalAreaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}UrgentUrbanRenewalAreaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="developmentProject" type="{https://www.geospatial.jp/iur/urf/3.0}GlobalHubCityDevelopmentProjectPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedUrgentUrbanRenewalAreaType", propOrder = {
    "developmentProject"
})
public class SpecifiedUrgentUrbanRenewalAreaType
    extends UrgentUrbanRenewalAreaType
{

    protected List<GlobalHubCityDevelopmentProjectPropertyType> developmentProject;

    /**
     * Gets the value of the developmentProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalHubCityDevelopmentProjectPropertyType }
     * 
     * 
     */
    public List<GlobalHubCityDevelopmentProjectPropertyType> getDevelopmentProject() {
        if (developmentProject == null) {
            developmentProject = new ArrayList<GlobalHubCityDevelopmentProjectPropertyType>();
        }
        return this.developmentProject;
    }

    public boolean isSetDevelopmentProject() {
        return ((this.developmentProject!= null)&&(!this.developmentProject.isEmpty()));
    }

    public void unsetDevelopmentProject() {
        this.developmentProject = null;
    }

}
