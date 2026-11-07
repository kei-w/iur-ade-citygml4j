//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for ConstructionBaseAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionBaseAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adminType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="administorator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adminOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="installerType" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="installer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="structureOrdinance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constructionStartYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="completionYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/&gt;
 *         &lt;element name="facilityAge" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionBaseAttributeType", propOrder = {
    "adminType",
    "administorator",
    "adminOffice",
    "operatorType",
    "installerType",
    "installer",
    "structureOrdinance",
    "specification",
    "kana",
    "constructionStartYear",
    "completionYear",
    "facilityAge",
    "update",
    "purpose"
})
public class ConstructionBaseAttributeType {

    protected CodeType adminType;
    protected String administorator;
    protected String adminOffice;
    protected CodeType operatorType;
    protected CodeType installerType;
    protected String installer;
    protected String structureOrdinance;
    protected String specification;
    protected String kana;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar constructionStartYear;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar completionYear;
    protected BigInteger facilityAge;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar update;
    protected CodeType purpose;

    /**
     * Gets the value of the adminType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAdminType() {
        return adminType;
    }

    /**
     * Sets the value of the adminType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAdminType(CodeType value) {
        this.adminType = value;
    }

    public boolean isSetAdminType() {
        return (this.adminType!= null);
    }

    /**
     * Gets the value of the administorator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministorator() {
        return administorator;
    }

    /**
     * Sets the value of the administorator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministorator(String value) {
        this.administorator = value;
    }

    public boolean isSetAdministorator() {
        return (this.administorator!= null);
    }

    /**
     * Gets the value of the adminOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminOffice() {
        return adminOffice;
    }

    /**
     * Sets the value of the adminOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminOffice(String value) {
        this.adminOffice = value;
    }

    public boolean isSetAdminOffice() {
        return (this.adminOffice!= null);
    }

    /**
     * Gets the value of the operatorType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getOperatorType() {
        return operatorType;
    }

    /**
     * Sets the value of the operatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setOperatorType(CodeType value) {
        this.operatorType = value;
    }

    public boolean isSetOperatorType() {
        return (this.operatorType!= null);
    }

    /**
     * Gets the value of the installerType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getInstallerType() {
        return installerType;
    }

    /**
     * Sets the value of the installerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setInstallerType(CodeType value) {
        this.installerType = value;
    }

    public boolean isSetInstallerType() {
        return (this.installerType!= null);
    }

    /**
     * Gets the value of the installer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstaller() {
        return installer;
    }

    /**
     * Sets the value of the installer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstaller(String value) {
        this.installer = value;
    }

    public boolean isSetInstaller() {
        return (this.installer!= null);
    }

    /**
     * Gets the value of the structureOrdinance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureOrdinance() {
        return structureOrdinance;
    }

    /**
     * Sets the value of the structureOrdinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureOrdinance(String value) {
        this.structureOrdinance = value;
    }

    public boolean isSetStructureOrdinance() {
        return (this.structureOrdinance!= null);
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

    /**
     * Gets the value of the kana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKana() {
        return kana;
    }

    /**
     * Sets the value of the kana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKana(String value) {
        this.kana = value;
    }

    public boolean isSetKana() {
        return (this.kana!= null);
    }

    /**
     * Gets the value of the constructionStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConstructionStartYear() {
        return constructionStartYear;
    }

    /**
     * Sets the value of the constructionStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConstructionStartYear(XMLGregorianCalendar value) {
        this.constructionStartYear = value;
    }

    public boolean isSetConstructionStartYear() {
        return (this.constructionStartYear!= null);
    }

    /**
     * Gets the value of the completionYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionYear() {
        return completionYear;
    }

    /**
     * Sets the value of the completionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionYear(XMLGregorianCalendar value) {
        this.completionYear = value;
    }

    public boolean isSetCompletionYear() {
        return (this.completionYear!= null);
    }

    /**
     * Gets the value of the facilityAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFacilityAge() {
        return facilityAge;
    }

    /**
     * Sets the value of the facilityAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFacilityAge(BigInteger value) {
        this.facilityAge = value;
    }

    public boolean isSetFacilityAge() {
        return (this.facilityAge!= null);
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdate(XMLGregorianCalendar value) {
        this.update = value;
    }

    public boolean isSetUpdate() {
        return (this.update!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPurpose(CodeType value) {
        this.purpose = value;
    }

    public boolean isSetPurpose() {
        return (this.purpose!= null);
    }

}
