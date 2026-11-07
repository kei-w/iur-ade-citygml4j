//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;
import net.opengis.gml.MultiPointPropertyType;


/**
 * <p>Java class for PointCloudType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointCloudType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.2}AbstractPointCloudType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mimeType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="pointFile" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="pointFileSrsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="points" type="{http://www.opengis.net/gml}MultiPointPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="pointCloudSpecAttribute" type="{https://www.geospatial.jp/iur/uro/3.2}PointCloudSpecAttributePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCloudType", propOrder = {
    "mimeType",
    "pointFile",
    "pointFileSrsName",
    "points",
    "pointCloudSpecAttribute"
})
public class PointCloudType
    extends AbstractPointCloudType
{

    protected CodeType mimeType;
    @XmlSchemaType(name = "anyURI")
    protected String pointFile;
    protected String pointFileSrsName;
    protected MultiPointPropertyType points;
    protected PointCloudSpecAttributePropertyType pointCloudSpecAttribute;

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMimeType(CodeType value) {
        this.mimeType = value;
    }

    public boolean isSetMimeType() {
        return (this.mimeType!= null);
    }

    /**
     * Gets the value of the pointFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointFile() {
        return pointFile;
    }

    /**
     * Sets the value of the pointFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointFile(String value) {
        this.pointFile = value;
    }

    public boolean isSetPointFile() {
        return (this.pointFile!= null);
    }

    /**
     * Gets the value of the pointFileSrsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointFileSrsName() {
        return pointFileSrsName;
    }

    /**
     * Sets the value of the pointFileSrsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointFileSrsName(String value) {
        this.pointFileSrsName = value;
    }

    public boolean isSetPointFileSrsName() {
        return (this.pointFileSrsName!= null);
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public MultiPointPropertyType getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPointPropertyType }
     *     
     */
    public void setPoints(MultiPointPropertyType value) {
        this.points = value;
    }

    public boolean isSetPoints() {
        return (this.points!= null);
    }

    /**
     * Gets the value of the pointCloudSpecAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link PointCloudSpecAttributePropertyType }
     *     
     */
    public PointCloudSpecAttributePropertyType getPointCloudSpecAttribute() {
        return pointCloudSpecAttribute;
    }

    /**
     * Sets the value of the pointCloudSpecAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCloudSpecAttributePropertyType }
     *     
     */
    public void setPointCloudSpecAttribute(PointCloudSpecAttributePropertyType value) {
        this.pointCloudSpecAttribute = value;
    }

    public boolean isSetPointCloudSpecAttribute() {
        return (this.pointCloudSpecAttribute!= null);
    }

}
