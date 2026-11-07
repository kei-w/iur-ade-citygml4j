//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:59:35 JST 2026
//


package jp.go.kantei.iur._1_4.urg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValuePairPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur/urg/1.4}KeyValuePair"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairPropertyType", propOrder = {
    "keyValuePair"
})
public class KeyValuePairPropertyType {

    @XmlElement(name = "KeyValuePair", required = true)
    protected KeyValuePairType keyValuePair;

    /**
     * Gets the value of the keyValuePair property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairType }
     *     
     */
    public KeyValuePairType getKeyValuePair() {
        return keyValuePair;
    }

    /**
     * Sets the value of the keyValuePair property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairType }
     *     
     */
    public void setKeyValuePair(KeyValuePairType value) {
        this.keyValuePair = value;
    }

    public boolean isSetKeyValuePair() {
        return (this.keyValuePair!= null);
    }

}
