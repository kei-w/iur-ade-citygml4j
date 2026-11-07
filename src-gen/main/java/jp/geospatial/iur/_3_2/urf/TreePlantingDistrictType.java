//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 19:58:08 JST 2026
//


package jp.geospatial.iur._3_2.urf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreePlantingDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreePlantingDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/3.2}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumGreeningRate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreePlantingDistrictType", propOrder = {
    "minimumGreeningRate"
})
public class TreePlantingDistrictType
    extends DistrictsAndZonesType
{

    @XmlElement(required = true)
    protected BigInteger minimumGreeningRate;

    /**
     * Gets the value of the minimumGreeningRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumGreeningRate() {
        return minimumGreeningRate;
    }

    /**
     * Sets the value of the minimumGreeningRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumGreeningRate(BigInteger value) {
        this.minimumGreeningRate = value;
    }

    public boolean isSetMinimumGreeningRate() {
        return (this.minimumGreeningRate!= null);
    }

}
