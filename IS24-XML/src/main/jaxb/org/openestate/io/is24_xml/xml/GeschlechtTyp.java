package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Geschlechttyp fuer allgemeine WohnObjekte
 * 
 * <p>Java class for GeschlechtTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GeschlechtTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="nurMaenner"/>
 *     <enumeration value="nurFrauen"/>
 *     <enumeration value="keineEinschraenkung"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GeschlechtTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GeschlechtTyp {

    @XmlEnumValue("nurMaenner")
    NUR_MAENNER("nurMaenner"),
    @XmlEnumValue("nurFrauen")
    NUR_FRAUEN("nurFrauen"),
    @XmlEnumValue("keineEinschraenkung")
    KEINE_EINSCHRAENKUNG("keineEinschraenkung");
    private final String value;

    GeschlechtTyp(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static GeschlechtTyp fromValue(String v) {
        for (GeschlechtTyp c: GeschlechtTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
