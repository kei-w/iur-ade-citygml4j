//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtilityNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityNodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/uro/3.0}UtilityNetworkElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="previousLink" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nextLink" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rotationAngle" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityNodeType", propOrder = {
    "previousLink",
    "nextLink",
    "rotationAngle"
})
@XmlSeeAlso({
    AppurtenanceType.class
})
public abstract class UtilityNodeType
    extends UtilityNetworkElementType
{

    protected List<String> previousLink;
    protected List<String> nextLink;
    protected Double rotationAngle;

    /**
     * Gets the value of the previousLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreviousLink() {
        if (previousLink == null) {
            previousLink = new ArrayList<String>();
        }
        return this.previousLink;
    }

    public boolean isSetPreviousLink() {
        return ((this.previousLink!= null)&&(!this.previousLink.isEmpty()));
    }

    public void unsetPreviousLink() {
        this.previousLink = null;
    }

    /**
     * Gets the value of the nextLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNextLink() {
        if (nextLink == null) {
            nextLink = new ArrayList<String>();
        }
        return this.nextLink;
    }

    public boolean isSetNextLink() {
        return ((this.nextLink!= null)&&(!this.nextLink.isEmpty()));
    }

    public void unsetNextLink() {
        this.nextLink = null;
    }

    /**
     * Gets the value of the rotationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRotationAngle() {
        return rotationAngle;
    }

    /**
     * Sets the value of the rotationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRotationAngle(Double value) {
        this.rotationAngle = value;
    }

    public boolean isSetRotationAngle() {
        return (this.rotationAngle!= null);
    }

}
