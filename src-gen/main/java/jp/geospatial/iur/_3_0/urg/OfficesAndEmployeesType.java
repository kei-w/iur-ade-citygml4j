//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:44:33 JST 2026
//


package jp.geospatial.iur._3_0.urg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficesAndEmployeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficesAndEmployeesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urg/3.0}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOffices" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="salesAmount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficesAndEmployeesType", propOrder = {
    "numberOfOffices",
    "numberOfEmployees",
    "salesAmount"
})
public class OfficesAndEmployeesType
    extends StatisticalGridType
{

    protected BigInteger numberOfOffices;
    protected BigInteger numberOfEmployees;
    protected BigInteger salesAmount;

    /**
     * Gets the value of the numberOfOffices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * Sets the value of the numberOfOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfOffices(BigInteger value) {
        this.numberOfOffices = value;
    }

    public boolean isSetNumberOfOffices() {
        return (this.numberOfOffices!= null);
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEmployees(BigInteger value) {
        this.numberOfEmployees = value;
    }

    public boolean isSetNumberOfEmployees() {
        return (this.numberOfEmployees!= null);
    }

    /**
     * Gets the value of the salesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesAmount() {
        return salesAmount;
    }

    /**
     * Sets the value of the salesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesAmount(BigInteger value) {
        this.salesAmount = value;
    }

    public boolean isSetSalesAmount() {
        return (this.salesAmount!= null);
    }

}
