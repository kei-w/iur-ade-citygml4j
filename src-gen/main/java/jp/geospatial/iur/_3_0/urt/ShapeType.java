//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:44:33 JST 2026
//


package jp.geospatial.iur._3_0.urt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShapeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urt/3.0}PublicTransitType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="point" type="{https://www.geospatial.jp/iur/urt/3.0}PointPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeType", propOrder = {
    "point"
})
public class ShapeType
    extends PublicTransitType
{

    protected List<PointPropertyType> point;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<PointPropertyType> getPoint() {
        if (point == null) {
            point = new ArrayList<PointPropertyType>();
        }
        return this.point;
    }

    public boolean isSetPoint() {
        return ((this.point!= null)&&(!this.point.isEmpty()));
    }

    public void unsetPoint() {
        this.point = null;
    }

}
