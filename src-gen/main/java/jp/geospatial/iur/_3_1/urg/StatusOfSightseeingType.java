//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:01:11 JST 2026
//


package jp.geospatial.iur._3_1.urg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusOfSightseeingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusOfSightseeingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urg/3.1}StatisticalGridType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numOfHotels" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfRyokan" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfPublicInn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfInn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfCotage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfTempleHotel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfRentaVilla" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfYouthHostel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfCapsuleHotel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numOfTrainingCenter" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalAccomodations" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalCapacity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalRooms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOfSightseeingType", propOrder = {
    "numOfHotels",
    "numOfRyokan",
    "numOfPublicInn",
    "numOfInn",
    "numOfCotage",
    "numOfTempleHotel",
    "numOfRentaVilla",
    "numOfYouthHostel",
    "numOfCapsuleHotel",
    "numOfTrainingCenter",
    "totalAccomodations",
    "totalCapacity",
    "totalRooms"
})
public class StatusOfSightseeingType
    extends StatisticalGridType
{

    protected BigInteger numOfHotels;
    protected BigInteger numOfRyokan;
    protected BigInteger numOfPublicInn;
    protected BigInteger numOfInn;
    protected BigInteger numOfCotage;
    protected BigInteger numOfTempleHotel;
    protected BigInteger numOfRentaVilla;
    protected BigInteger numOfYouthHostel;
    protected BigInteger numOfCapsuleHotel;
    protected BigInteger numOfTrainingCenter;
    protected BigInteger totalAccomodations;
    protected BigInteger totalCapacity;
    protected BigInteger totalRooms;

    /**
     * Gets the value of the numOfHotels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfHotels() {
        return numOfHotels;
    }

    /**
     * Sets the value of the numOfHotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfHotels(BigInteger value) {
        this.numOfHotels = value;
    }

    public boolean isSetNumOfHotels() {
        return (this.numOfHotels!= null);
    }

    /**
     * Gets the value of the numOfRyokan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfRyokan() {
        return numOfRyokan;
    }

    /**
     * Sets the value of the numOfRyokan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfRyokan(BigInteger value) {
        this.numOfRyokan = value;
    }

    public boolean isSetNumOfRyokan() {
        return (this.numOfRyokan!= null);
    }

    /**
     * Gets the value of the numOfPublicInn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfPublicInn() {
        return numOfPublicInn;
    }

    /**
     * Sets the value of the numOfPublicInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfPublicInn(BigInteger value) {
        this.numOfPublicInn = value;
    }

    public boolean isSetNumOfPublicInn() {
        return (this.numOfPublicInn!= null);
    }

    /**
     * Gets the value of the numOfInn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfInn() {
        return numOfInn;
    }

    /**
     * Sets the value of the numOfInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfInn(BigInteger value) {
        this.numOfInn = value;
    }

    public boolean isSetNumOfInn() {
        return (this.numOfInn!= null);
    }

    /**
     * Gets the value of the numOfCotage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfCotage() {
        return numOfCotage;
    }

    /**
     * Sets the value of the numOfCotage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfCotage(BigInteger value) {
        this.numOfCotage = value;
    }

    public boolean isSetNumOfCotage() {
        return (this.numOfCotage!= null);
    }

    /**
     * Gets the value of the numOfTempleHotel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfTempleHotel() {
        return numOfTempleHotel;
    }

    /**
     * Sets the value of the numOfTempleHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfTempleHotel(BigInteger value) {
        this.numOfTempleHotel = value;
    }

    public boolean isSetNumOfTempleHotel() {
        return (this.numOfTempleHotel!= null);
    }

    /**
     * Gets the value of the numOfRentaVilla property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfRentaVilla() {
        return numOfRentaVilla;
    }

    /**
     * Sets the value of the numOfRentaVilla property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfRentaVilla(BigInteger value) {
        this.numOfRentaVilla = value;
    }

    public boolean isSetNumOfRentaVilla() {
        return (this.numOfRentaVilla!= null);
    }

    /**
     * Gets the value of the numOfYouthHostel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfYouthHostel() {
        return numOfYouthHostel;
    }

    /**
     * Sets the value of the numOfYouthHostel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfYouthHostel(BigInteger value) {
        this.numOfYouthHostel = value;
    }

    public boolean isSetNumOfYouthHostel() {
        return (this.numOfYouthHostel!= null);
    }

    /**
     * Gets the value of the numOfCapsuleHotel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfCapsuleHotel() {
        return numOfCapsuleHotel;
    }

    /**
     * Sets the value of the numOfCapsuleHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfCapsuleHotel(BigInteger value) {
        this.numOfCapsuleHotel = value;
    }

    public boolean isSetNumOfCapsuleHotel() {
        return (this.numOfCapsuleHotel!= null);
    }

    /**
     * Gets the value of the numOfTrainingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfTrainingCenter() {
        return numOfTrainingCenter;
    }

    /**
     * Sets the value of the numOfTrainingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfTrainingCenter(BigInteger value) {
        this.numOfTrainingCenter = value;
    }

    public boolean isSetNumOfTrainingCenter() {
        return (this.numOfTrainingCenter!= null);
    }

    /**
     * Gets the value of the totalAccomodations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAccomodations() {
        return totalAccomodations;
    }

    /**
     * Sets the value of the totalAccomodations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAccomodations(BigInteger value) {
        this.totalAccomodations = value;
    }

    public boolean isSetTotalAccomodations() {
        return (this.totalAccomodations!= null);
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    public boolean isSetTotalCapacity() {
        return (this.totalCapacity!= null);
    }

    /**
     * Gets the value of the totalRooms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRooms() {
        return totalRooms;
    }

    /**
     * Sets the value of the totalRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRooms(BigInteger value) {
        this.totalRooms = value;
    }

    public boolean isSetTotalRooms() {
        return (this.totalRooms!= null);
    }

}
