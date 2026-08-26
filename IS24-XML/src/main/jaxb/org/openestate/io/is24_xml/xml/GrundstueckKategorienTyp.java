package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Alle Nutzungsarten (Objektkategorie 2) fuer Grundstuecke
 *                 des alten allgemeinen Grundstueckstyps
 * 
 * <p>Java class for GrundstueckKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GrundstueckKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Wohnen"/>
 *     <enumeration value="Gewerbe"/>
 *     <enumeration value="LandForstwirtschaft"/>
 *     <enumeration value="Freizeit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GrundstueckKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GrundstueckKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Wohnen")
    WOHNEN("Wohnen"),
    @XmlEnumValue("Gewerbe")
    GEWERBE("Gewerbe"),
    @XmlEnumValue("LandForstwirtschaft")
    LAND_FORSTWIRTSCHAFT("LandForstwirtschaft"),
    @XmlEnumValue("Freizeit")
    FREIZEIT("Freizeit");
    private final String value;

    GrundstueckKategorienTyp(String v) {
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
    public static GrundstueckKategorienTyp fromValue(String v) {
        for (GrundstueckKategorienTyp c: GrundstueckKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
