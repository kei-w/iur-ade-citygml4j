//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for NewHousingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewHousingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}_UrbanFunctionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="purpose" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="developer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yearOfConstruction" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewHousingType", propOrder = {
    "identifier",
    "purpose",
    "developer",
    "yearOfConstruction"
})
public class NewHousingType
    extends _UrbanFunctionType
{

    @XmlElement(name = "id", required = true)
    protected String identifier;
    protected List<CodeType> purpose;
    protected String developer;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfConstruction;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    public boolean isSetIdentifier() {
        return (this.identifier!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<CodeType>();
        }
        return this.purpose;
    }

    public boolean isSetPurpose() {
        return ((this.purpose!= null)&&(!this.purpose.isEmpty()));
    }

    public void unsetPurpose() {
        this.purpose = null;
    }

    /**
     * Gets the value of the developer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * Sets the value of the developer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloper(String value) {
        this.developer = value;
    }

    public boolean isSetDeveloper() {
        return (this.developer!= null);
    }

    /**
     * Gets the value of the yearOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * Sets the value of the yearOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfConstruction(XMLGregorianCalendar value) {
        this.yearOfConstruction = value;
    }

    public boolean isSetYearOfConstruction() {
        return (this.yearOfConstruction!= null);
    }

}
