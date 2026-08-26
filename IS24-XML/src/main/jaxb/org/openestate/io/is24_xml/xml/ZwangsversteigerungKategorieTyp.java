package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZwangsversteigerungKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ZwangsversteigerungKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Eigentumswohnung"/>
 *     <enumeration value="Ein/Mehrfamilienhaus"/>
 *     <enumeration value="Gewerbe/Anlage"/>
 *     <enumeration value="Grundstueck"/>
 *     <enumeration value="Garage/Sonstige"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ZwangsversteigerungKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum ZwangsversteigerungKategorieTyp {

    @XmlEnumValue("Eigentumswohnung")
    EIGENTUMSWOHNUNG("Eigentumswohnung"),
    @XmlEnumValue("Ein/Mehrfamilienhaus")
    EFH_MFH("Ein/Mehrfamilienhaus"),
    @XmlEnumValue("Gewerbe/Anlage")
    GEWERBE_ANLAGE("Gewerbe/Anlage"),
    @XmlEnumValue("Grundstueck")
    GRUNDSTUECK("Grundstueck"),
    @XmlEnumValue("Garage/Sonstige")
    GARAGE_SONSTIGES("Garage/Sonstige");
    private final String value;

    ZwangsversteigerungKategorieTyp(String v) {
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
    public static ZwangsversteigerungKategorieTyp fromValue(String v) {
        for (ZwangsversteigerungKategorieTyp c: ZwangsversteigerungKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
