package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WGGroesse</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WGGroesse">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="2"/>
 *     <enumeration value="3"/>
 *     <enumeration value="4"/>
 *     <enumeration value="5"/>
 *     <enumeration value="6"/>
 *     <enumeration value="7"/>
 *     <enumeration value="8"/>
 *     <enumeration value="9"/>
 *     <enumeration value="10"/>
 *     <enumeration value="11+"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WGGroesse")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum WGGroesse {

    @XmlEnumValue("2")
    PERSONS_02("2"),
    @XmlEnumValue("3")
    PERSONS_03("3"),
    @XmlEnumValue("4")
    PERSONS_04("4"),
    @XmlEnumValue("5")
    PERSONS_05("5"),
    @XmlEnumValue("6")
    PERSONS_06("6"),
    @XmlEnumValue("7")
    PERSONS_07("7"),
    @XmlEnumValue("8")
    PERSONS_08("8"),
    @XmlEnumValue("9")
    PERSONS_09("9"),
    @XmlEnumValue("10")
    PERSONS_10("10"),
    @XmlEnumValue("11+")
    PERSONS_11_PLUS("11+");
    private final String value;

    WGGroesse(String v) {
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
    public static WGGroesse fromValue(String v) {
        for (WGGroesse c: WGGroesse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
