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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EconomicActivityTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicActivityTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfOffices" type="{https://www.geospatial.jp/iur/urf/3.2}EconomicActivitySumTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberOfEmployees" type="{https://www.geospatial.jp/iur/urf/3.2}EconomicActivitySumTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="retailSales" type="{https://www.geospatial.jp/iur/urf/3.2}EconomicActivitySumTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="manufactureShipments" type="{https://www.geospatial.jp/iur/urf/3.2}EconomicActivitySumTypePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicActivityTypeType", propOrder = {
    "numberOfOffices",
    "numberOfEmployees",
    "retailSales",
    "manufactureShipments"
})
public class EconomicActivityTypeType {

    protected List<EconomicActivitySumTypePropertyType> numberOfOffices;
    protected List<EconomicActivitySumTypePropertyType> numberOfEmployees;
    protected List<EconomicActivitySumTypePropertyType> retailSales;
    protected List<EconomicActivitySumTypePropertyType> manufactureShipments;

    /**
     * Gets the value of the numberOfOffices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfOffices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfOffices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicActivitySumTypePropertyType }
     * 
     * 
     */
    public List<EconomicActivitySumTypePropertyType> getNumberOfOffices() {
        if (numberOfOffices == null) {
            numberOfOffices = new ArrayList<EconomicActivitySumTypePropertyType>();
        }
        return this.numberOfOffices;
    }

    public boolean isSetNumberOfOffices() {
        return ((this.numberOfOffices!= null)&&(!this.numberOfOffices.isEmpty()));
    }

    public void unsetNumberOfOffices() {
        this.numberOfOffices = null;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfEmployees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicActivitySumTypePropertyType }
     * 
     * 
     */
    public List<EconomicActivitySumTypePropertyType> getNumberOfEmployees() {
        if (numberOfEmployees == null) {
            numberOfEmployees = new ArrayList<EconomicActivitySumTypePropertyType>();
        }
        return this.numberOfEmployees;
    }

    public boolean isSetNumberOfEmployees() {
        return ((this.numberOfEmployees!= null)&&(!this.numberOfEmployees.isEmpty()));
    }

    public void unsetNumberOfEmployees() {
        this.numberOfEmployees = null;
    }

    /**
     * Gets the value of the retailSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicActivitySumTypePropertyType }
     * 
     * 
     */
    public List<EconomicActivitySumTypePropertyType> getRetailSales() {
        if (retailSales == null) {
            retailSales = new ArrayList<EconomicActivitySumTypePropertyType>();
        }
        return this.retailSales;
    }

    public boolean isSetRetailSales() {
        return ((this.retailSales!= null)&&(!this.retailSales.isEmpty()));
    }

    public void unsetRetailSales() {
        this.retailSales = null;
    }

    /**
     * Gets the value of the manufactureShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufactureShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufactureShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicActivitySumTypePropertyType }
     * 
     * 
     */
    public List<EconomicActivitySumTypePropertyType> getManufactureShipments() {
        if (manufactureShipments == null) {
            manufactureShipments = new ArrayList<EconomicActivitySumTypePropertyType>();
        }
        return this.manufactureShipments;
    }

    public boolean isSetManufactureShipments() {
        return ((this.manufactureShipments!= null)&&(!this.manufactureShipments.isEmpty()));
    }

    public void unsetManufactureShipments() {
        this.manufactureShipments = null;
    }

}
