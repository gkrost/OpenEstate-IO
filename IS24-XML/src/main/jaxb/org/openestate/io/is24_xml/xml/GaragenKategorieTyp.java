package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Garagentypen
 * 
 * <p>Java class for GaragenKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GaragenKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Garage"/>
 *     <enumeration value="Tiefgarage"/>
 *     <enumeration value="Parkhaus"/>
 *     <enumeration value="Carport"/>
 *     <enumeration value="Aussenstellplatz"/>
 *     <enumeration value="Duplex"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GaragenKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GaragenKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Tiefgarage")
    TIEFGARAGE("Tiefgarage"),
    @XmlEnumValue("Parkhaus")
    PARKHAUS("Parkhaus"),
    @XmlEnumValue("Carport")
    CARPORT("Carport"),
    @XmlEnumValue("Aussenstellplatz")
    AUSSENSTELLPLATZ("Aussenstellplatz"),
    @XmlEnumValue("Duplex")
    DUPLEX("Duplex");
    private final String value;

    GaragenKategorieTyp(String v) {
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
    public static GaragenKategorieTyp fromValue(String v) {
        for (GaragenKategorieTyp c: GaragenKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
