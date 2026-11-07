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
import net.opengis.gml.CodeType;


/**
 * 第3.2版修正
 * 
 * <p>Java class for AppurtenanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppurtenanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}UtilityNodeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appurtenanceType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppurtenanceType", propOrder = {
    "appurtenanceType"
})
public class AppurtenanceType
    extends UtilityNodeType
{

    protected CodeType appurtenanceType;

    /**
     * Gets the value of the appurtenanceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAppurtenanceType() {
        return appurtenanceType;
    }

    /**
     * Sets the value of the appurtenanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAppurtenanceType(CodeType value) {
        this.appurtenanceType = value;
    }

    public boolean isSetAppurtenanceType() {
        return (this.appurtenanceType!= null);
    }

}
