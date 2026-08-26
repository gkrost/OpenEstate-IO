package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for visibility</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="visibility">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="basic"/>
 *     <enumeration value="premium"/>
 *     <enumeration value="top"/>
 *     <enumeration value="showcase"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "visibility")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum VisibilityType {

    @XmlEnumValue("basic")
    BASIC("basic"),
    @XmlEnumValue("premium")
    PREMIUM("premium"),
    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("showcase")
    SHOWCASE("showcase");
    private final String value;

    VisibilityType(String v) {
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
    public static VisibilityType fromValue(String v) {
        for (VisibilityType c: VisibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
