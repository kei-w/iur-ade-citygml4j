//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:54 JST 2026
//


package jp.geospatial.iur._3_0.uro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeightStatusValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeightStatusValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="estimated"/&gt;
 *     &lt;enumeration value="measured"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeightStatusValue")
@XmlEnum
public enum HeightStatusValue {

    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),
    @XmlEnumValue("measured")
    MEASURED("measured");
    private final String value;

    HeightStatusValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightStatusValue fromValue(String v) {
        for (HeightStatusValue c: HeightStatusValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
