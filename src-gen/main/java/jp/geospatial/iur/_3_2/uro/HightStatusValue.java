//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 16:43:46 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HightStatusValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HightStatusValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="estimated"/&gt;
 *     &lt;enumeration value="measured"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HightStatusValue")
@XmlEnum
public enum HightStatusValue {

    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),
    @XmlEnumValue("measured")
    MEASURED("measured");
    private final String value;

    HightStatusValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HightStatusValue fromValue(String v) {
        for (HightStatusValue c: HightStatusValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
