//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.go.kantei.iur._1_4.urt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.CodeType;


/**
 * <p>Java class for TransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}PublicTransitDataTypeType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferType" type="{http://www.opengis.net/gml}CodeType"/&gt;
 *         &lt;element name="minTransferTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType"/&gt;
 *         &lt;element name="to" type="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urt/1.4}StopPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferType", propOrder = {
    "transferType",
    "minTransferTime",
    "from",
    "to"
})
public class TransferType
    extends PublicTransitDataTypeType
{

    @XmlElement(required = true)
    protected CodeType transferType;
    protected BigInteger minTransferTime;
    @XmlElement(required = true)
    protected StopPropertyType from;
    @XmlElement(required = true)
    protected StopPropertyType to;

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransferType(CodeType value) {
        this.transferType = value;
    }

    public boolean isSetTransferType() {
        return (this.transferType!= null);
    }

    /**
     * Gets the value of the minTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTransferTime() {
        return minTransferTime;
    }

    /**
     * Sets the value of the minTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinTransferTime(BigInteger value) {
        this.minTransferTime = value;
    }

    public boolean isSetMinTransferTime() {
        return (this.minTransferTime!= null);
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setFrom(StopPropertyType value) {
        this.from = value;
    }

    public boolean isSetFrom() {
        return (this.from!= null);
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link StopPropertyType }
     *     
     */
    public StopPropertyType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPropertyType }
     *     
     */
    public void setTo(StopPropertyType value) {
        this.to = value;
    }

    public boolean isSetTo() {
        return (this.to!= null);
    }

}
