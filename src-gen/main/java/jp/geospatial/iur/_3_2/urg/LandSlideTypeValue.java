//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sun Nov 08 02:39:21 JST 2026
//


package jp.geospatial.iur._3_2.urg;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LandSlideTypeValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LandSlideTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="土石流"/&gt;
 *     &lt;enumeration value="土石流（土砂流）"/&gt;
 *     &lt;enumeration value="土石流（山腹崩壊・土砂流）"/&gt;
 *     &lt;enumeration value="土石流（山腹崩壊）"/&gt;
 *     &lt;enumeration value="土石流（山林火災）"/&gt;
 *     &lt;enumeration value="土石流（流木堆積、えん堤基礎部損傷）"/&gt;
 *     &lt;enumeration value="土石流（噴火）"/&gt;
 *     &lt;enumeration value="土石流（施設災害）"/&gt;
 *     &lt;enumeration value="土石流（その他（民地盛土河川流出）"/&gt;
 *     &lt;enumeration value="土石流（その他（洪水））"/&gt;
 *     &lt;enumeration value="土石流（その他（河道内堆積物の泥流化）"/&gt;
 *     &lt;enumeration value="土石流（その他）"/&gt;
 *     &lt;enumeration value="がけ崩れ"/&gt;
 *     &lt;enumeration value="地すべり）"/&gt;
 *     &lt;enumeration value="雪崩（表層）"/&gt;
 *     &lt;enumeration value="雪崩（全層傷）"/&gt;
 *     &lt;enumeration value="雪崩"/&gt;
 *     &lt;enumeration value="山林火災（計上なし）"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LandSlideTypeValue")
@XmlEnum
public enum LandSlideTypeValue {

    土石流("\u571f\u77f3\u6d41"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u571f\u7802\u6d41\uff09")
    土石流_土砂流_("\u571f\u77f3\u6d41\uff08\u571f\u7802\u6d41\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u5c71\u8179\u5d29\u58ca\u30fb\u571f\u7802\u6d41\uff09")
    土石流_山腹崩壊_土砂流_("\u571f\u77f3\u6d41\uff08\u5c71\u8179\u5d29\u58ca\u30fb\u571f\u7802\u6d41\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u5c71\u8179\u5d29\u58ca\uff09")
    土石流_山腹崩壊_("\u571f\u77f3\u6d41\uff08\u5c71\u8179\u5d29\u58ca\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u5c71\u6797\u706b\u707d\uff09")
    土石流_山林火災_("\u571f\u77f3\u6d41\uff08\u5c71\u6797\u706b\u707d\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u6d41\u6728\u5806\u7a4d\u3001\u3048\u3093\u5824\u57fa\u790e\u90e8\u640d\u50b7\uff09")
    土石流_流木堆積_えん堤基礎部損傷_("\u571f\u77f3\u6d41\uff08\u6d41\u6728\u5806\u7a4d\u3001\u3048\u3093\u5824\u57fa\u790e\u90e8\u640d\u50b7\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u5674\u706b\uff09")
    土石流_噴火_("\u571f\u77f3\u6d41\uff08\u5674\u706b\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u65bd\u8a2d\u707d\u5bb3\uff09")
    土石流_施設災害_("\u571f\u77f3\u6d41\uff08\u65bd\u8a2d\u707d\u5bb3\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6c11\u5730\u76db\u571f\u6cb3\u5ddd\u6d41\u51fa\uff09")
    土石流_その他_民地盛土河川流出_("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6c11\u5730\u76db\u571f\u6cb3\u5ddd\u6d41\u51fa\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6d2a\u6c34\uff09\uff09")
    土石流_その他_洪水__("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6d2a\u6c34\uff09\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6cb3\u9053\u5185\u5806\u7a4d\u7269\u306e\u6ce5\u6d41\u5316\uff09")
    土石流_その他_河道内堆積物の泥流化_("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff08\u6cb3\u9053\u5185\u5806\u7a4d\u7269\u306e\u6ce5\u6d41\u5316\uff09"),
    @XmlEnumValue("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff09")
    土石流_その他_("\u571f\u77f3\u6d41\uff08\u305d\u306e\u4ed6\uff09"),
    がけ崩れ("\u304c\u3051\u5d29\u308c"),
    @XmlEnumValue("\u5730\u3059\u3079\u308a\uff09")
    地すべり_("\u5730\u3059\u3079\u308a\uff09"),
    @XmlEnumValue("\u96ea\u5d29\uff08\u8868\u5c64\uff09")
    雪崩_表層_("\u96ea\u5d29\uff08\u8868\u5c64\uff09"),
    @XmlEnumValue("\u96ea\u5d29\uff08\u5168\u5c64\u50b7\uff09")
    雪崩_全層傷_("\u96ea\u5d29\uff08\u5168\u5c64\u50b7\uff09"),
    雪崩("\u96ea\u5d29"),
    @XmlEnumValue("\u5c71\u6797\u706b\u707d\uff08\u8a08\u4e0a\u306a\u3057\uff09")
    山林火災_計上なし_("\u5c71\u6797\u706b\u707d\uff08\u8a08\u4e0a\u306a\u3057\uff09");
    private final String value;

    LandSlideTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandSlideTypeValue fromValue(String v) {
        for (LandSlideTypeValue c: LandSlideTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
