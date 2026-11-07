//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 17:18:22 JST 2026
//


package jp.geospatial.iur._3_1.uro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionOfConstructionValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionOfConstructionValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="declined"/&gt;
 *     &lt;enumeration value="demolished"/&gt;
 *     &lt;enumeration value="functional"/&gt;
 *     &lt;enumeration value="projected"/&gt;
 *     &lt;enumeration value="underConstruction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionOfConstructionValue")
@XmlEnum
public enum ConditionOfConstructionValue {

    @XmlEnumValue("declined")
    DECLINED("declined"),
    @XmlEnumValue("demolished")
    DEMOLISHED("demolished"),
    @XmlEnumValue("functional")
    FUNCTIONAL("functional"),
    @XmlEnumValue("projected")
    PROJECTED("projected"),
    @XmlEnumValue("underConstruction")
    UNDER_CONSTRUCTION("underConstruction");
    private final String value;

    ConditionOfConstructionValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionOfConstructionValue fromValue(String v) {
        for (ConditionOfConstructionValue c: ConditionOfConstructionValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
