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
import jp.geospatial.iur._3_0.uro.DmAttributePropertyType;


/**
 * <p>Java class for AdministrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdministrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.0}UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urfDmAttribute" type="{https://www.geospatial.jp/iur/uro/3.0}DmAttributePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministrationType", propOrder = {
    "urfDmAttribute"
})
public class AdministrationType
    extends UrbanFunctionType
{

    protected List<DmAttributePropertyType> urfDmAttribute;

    /**
     * Gets the value of the urfDmAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urfDmAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrfDmAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmAttributePropertyType }
     * 
     * 
     */
    public List<DmAttributePropertyType> getUrfDmAttribute() {
        if (urfDmAttribute == null) {
            urfDmAttribute = new ArrayList<DmAttributePropertyType>();
        }
        return this.urfDmAttribute;
    }

    public boolean isSetUrfDmAttribute() {
        return ((this.urfDmAttribute!= null)&&(!this.urfDmAttribute.isEmpty()));
    }

    public void unsetUrfDmAttribute() {
        this.urfDmAttribute = null;
    }

}
