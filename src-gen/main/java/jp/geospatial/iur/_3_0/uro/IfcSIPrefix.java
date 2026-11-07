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
 * <p>Java class for IfcSIPrefix.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcSIPrefix"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXA"/&gt;
 *     &lt;enumeration value="PETA"/&gt;
 *     &lt;enumeration value="TERA"/&gt;
 *     &lt;enumeration value="GIGA"/&gt;
 *     &lt;enumeration value="MEGA"/&gt;
 *     &lt;enumeration value="KILO"/&gt;
 *     &lt;enumeration value="HECTO"/&gt;
 *     &lt;enumeration value="DECA"/&gt;
 *     &lt;enumeration value="DECI"/&gt;
 *     &lt;enumeration value="CENTI"/&gt;
 *     &lt;enumeration value="MILLI"/&gt;
 *     &lt;enumeration value="MICRO"/&gt;
 *     &lt;enumeration value="NANO"/&gt;
 *     &lt;enumeration value="PICO"/&gt;
 *     &lt;enumeration value="FEMTO"/&gt;
 *     &lt;enumeration value="ATTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IfcSIPrefix")
@XmlEnum
public enum IfcSIPrefix {

    EXA,
    PETA,
    TERA,
    GIGA,
    MEGA,
    KILO,
    HECTO,
    DECA,
    DECI,
    CENTI,
    MILLI,
    MICRO,
    NANO,
    PICO,
    FEMTO,
    ATTO;

    public String value() {
        return name();
    }

    public static IfcSIPrefix fromValue(String v) {
        return valueOf(v);
    }

}
