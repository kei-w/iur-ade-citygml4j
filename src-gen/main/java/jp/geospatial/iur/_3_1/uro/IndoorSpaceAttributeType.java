//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for IndoorSpaceAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndoorSpaceAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.1}IndoorAttributeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="suite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tollType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorSpaceAttributeType", propOrder = {
    "floorId",
    "isRestricted",
    "suite",
    "isPublic",
    "tollType"
})
public class IndoorSpaceAttributeType
    extends IndoorAttributeType
{

    protected String floorId;
    protected Boolean isRestricted;
    protected String suite;
    protected Boolean isPublic;
    protected CodeType tollType;

    /**
     * Gets the value of the floorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorId() {
        return floorId;
    }

    /**
     * Sets the value of the floorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorId(String value) {
        this.floorId = value;
    }

    public boolean isSetFloorId() {
        return (this.floorId!= null);
    }

    /**
     * Gets the value of the isRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestricted() {
        return isRestricted;
    }

    /**
     * Sets the value of the isRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestricted(Boolean value) {
        this.isRestricted = value;
    }

    public boolean isSetIsRestricted() {
        return (this.isRestricted!= null);
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuite(String value) {
        this.suite = value;
    }

    public boolean isSetSuite() {
        return (this.suite!= null);
    }

    /**
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    public boolean isSetIsPublic() {
        return (this.isPublic!= null);
    }

    /**
     * Gets the value of the tollType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTollType() {
        return tollType;
    }

    /**
     * Sets the value of the tollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTollType(CodeType value) {
        this.tollType = value;
    }

    public boolean isSetTollType() {
        return (this.tollType!= null);
    }

}
