package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Zulieferungsarten fuer Einzelhandel
 * 
 * <p>Java class for ZulieferungTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ZulieferungTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="DirekterZugang"/>
 *     <enumeration value="KeineDirekteAnfahrt"/>
 *     <enumeration value="PKW-Zufahrt"/>
 *     <enumeration value="VonVorn"/>
 *     <enumeration value="VonHinten"/>
 *     <enumeration value="Ganztaegig"/>
 *     <enumeration value="Vormittags"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ZulieferungTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum ZulieferungTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("DirekterZugang")
    DIREKTER_ZUGANG("DirekterZugang"),
    @XmlEnumValue("KeineDirekteAnfahrt")
    KEINE_DIREKTE_ANFAHRT("KeineDirekteAnfahrt"),
    @XmlEnumValue("PKW-Zufahrt")
    PKW_ZUFAHRT("PKW-Zufahrt"),
    @XmlEnumValue("VonVorn")
    VON_VORN("VonVorn"),
    @XmlEnumValue("VonHinten")
    VON_HINTEN("VonHinten"),
    @XmlEnumValue("Ganztaegig")
    GANZTAEGIG("Ganztaegig"),
    @XmlEnumValue("Vormittags")
    VORMITTAGS("Vormittags");
    private final String value;

    ZulieferungTyp(String v) {
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
    public static ZulieferungTyp fromValue(String v) {
        for (ZulieferungTyp c: ZulieferungTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
