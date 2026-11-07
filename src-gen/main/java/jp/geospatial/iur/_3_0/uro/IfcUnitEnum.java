//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:21:15 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcUnitEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcUnitEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABSORBEDDOSEUNIT"/&gt;
 *     &lt;enumeration value="AMOUNTOFSUBSTANCEUNIT"/&gt;
 *     &lt;enumeration value="AREAUNIT"/&gt;
 *     &lt;enumeration value="DOSEEQUIVALENTUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICCAPACITANCEUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICCHARGEUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICCONDUCTANCEUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICCURRENTUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICRESISTANCEUNIT"/&gt;
 *     &lt;enumeration value="ELECTRICVOLTAGEUNIT"/&gt;
 *     &lt;enumeration value="ENERGYUNIT"/&gt;
 *     &lt;enumeration value="FORCEUNIT"/&gt;
 *     &lt;enumeration value="FREQUENCYUNIT"/&gt;
 *     &lt;enumeration value="ILLUMINANCEUNIT"/&gt;
 *     &lt;enumeration value="INDUCTANCEUNIT"/&gt;
 *     &lt;enumeration value="LENGTHUNIT"/&gt;
 *     &lt;enumeration value="LUMINOUSFLUXUNIT"/&gt;
 *     &lt;enumeration value="LUMINOUSINTENSITYUNIT"/&gt;
 *     &lt;enumeration value="MAGNETICFLUXDENSITYUNIT"/&gt;
 *     &lt;enumeration value="MAGNETICFLUXUNIT"/&gt;
 *     &lt;enumeration value="MASSUNIT"/&gt;
 *     &lt;enumeration value="PLANEANGLEUNIT"/&gt;
 *     &lt;enumeration value="POWERUNIT"/&gt;
 *     &lt;enumeration value="PRESSUREUNIT"/&gt;
 *     &lt;enumeration value="RADIOACTIVITYUNIT"/&gt;
 *     &lt;enumeration value="SOLIDANGLEUNIT"/&gt;
 *     &lt;enumeration value="THERMODYNAMICTEMPERATUREUNIT"/&gt;
 *     &lt;enumeration value="TIMEUNIT"/&gt;
 *     &lt;enumeration value="VOLUMEUNIT"/&gt;
 *     &lt;enumeration value="USERDEFINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IfcUnitEnum")
@XmlEnum
public enum IfcUnitEnum {

    ABSORBEDDOSEUNIT,
    AMOUNTOFSUBSTANCEUNIT,
    AREAUNIT,
    DOSEEQUIVALENTUNIT,
    ELECTRICCAPACITANCEUNIT,
    ELECTRICCHARGEUNIT,
    ELECTRICCONDUCTANCEUNIT,
    ELECTRICCURRENTUNIT,
    ELECTRICRESISTANCEUNIT,
    ELECTRICVOLTAGEUNIT,
    ENERGYUNIT,
    FORCEUNIT,
    FREQUENCYUNIT,
    ILLUMINANCEUNIT,
    INDUCTANCEUNIT,
    LENGTHUNIT,
    LUMINOUSFLUXUNIT,
    LUMINOUSINTENSITYUNIT,
    MAGNETICFLUXDENSITYUNIT,
    MAGNETICFLUXUNIT,
    MASSUNIT,
    PLANEANGLEUNIT,
    POWERUNIT,
    PRESSUREUNIT,
    RADIOACTIVITYUNIT,
    SOLIDANGLEUNIT,
    THERMODYNAMICTEMPERATUREUNIT,
    TIMEUNIT,
    VOLUMEUNIT,
    USERDEFINED;

    public String value() {
        return name();
    }

    public static IfcUnitEnum fromValue(String v) {
        return valueOf(v);
    }

}
