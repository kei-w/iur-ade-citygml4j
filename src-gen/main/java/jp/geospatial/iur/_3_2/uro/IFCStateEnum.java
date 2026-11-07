//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 07 12:50:58 JST 2026
//


package jp.geospatial.iur._3_2.uro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IFCStateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IFCStateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="READWRITE"/&gt;
 *     &lt;enumeration value="READONLY"/&gt;
 *     &lt;enumeration value="LOCKED"/&gt;
 *     &lt;enumeration value="READWHITELOCKED"/&gt;
 *     &lt;enumeration value="READONLYLOCKED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IFCStateEnum")
@XmlEnum
public enum IFCStateEnum {

    READWRITE,
    READONLY,
    LOCKED,
    READWHITELOCKED,
    READONLYLOCKED;

    public String value() {
        return name();
    }

    public static IFCStateEnum fromValue(String v) {
        return valueOf(v);
    }

}
