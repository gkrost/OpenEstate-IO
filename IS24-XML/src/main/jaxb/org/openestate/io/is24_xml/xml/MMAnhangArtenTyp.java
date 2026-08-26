package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration der bekannten Anhangarten.
 * 
 * <p>Java class for MMAnhangArtenTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MMAnhangArtenTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="bild"/>
 *     <enumeration value="video"/>
 *     <enumeration value="link"/>
 *     <enumeration value="grundrissBild"/>
 *     <enumeration value="grundrissPDF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MMAnhangArtenTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum MMAnhangArtenTyp {

    @XmlEnumValue("bild")
    BILD("bild"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("link")
    LINK("link"),
    @XmlEnumValue("grundrissBild")
    GRUNDRISS_BILD("grundrissBild"),
    @XmlEnumValue("grundrissPDF")
    GRUNDRISS_PDF("grundrissPDF");
    private final String value;

    MMAnhangArtenTyp(String v) {
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
    public static MMAnhangArtenTyp fromValue(String v) {
        for (MMAnhangArtenTyp c: MMAnhangArtenTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
