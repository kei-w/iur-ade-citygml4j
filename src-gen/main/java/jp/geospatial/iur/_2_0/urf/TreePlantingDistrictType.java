//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 20:15:07 JST 2026
//


package jp.geospatial.iur._2_0.urf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreePlantingDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreePlantingDistrictType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.geospatial.jp/iur/urf/2.0}DistrictsAndZonesType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumGreeningRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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

    protected double minimumGreeningRate;

    /**
     * Gets the value of the minimumGreeningRate property.
     * 
     */
    public double getMinimumGreeningRate() {
        return minimumGreeningRate;
    }

    /**
     * Sets the value of the minimumGreeningRate property.
     * 
     */
    public void setMinimumGreeningRate(double value) {
        this.minimumGreeningRate = value;
    }

    public boolean isSetMinimumGreeningRate() {
        return true;
    }

}
