package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Operation auf eine Immobilie beim Import im Aktionsmodus
 * 
 * <p>Java class for AktionsTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AktionsTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="importieren"/>
 *     <enumeration value="aktualisieren"/>
 *     <enumeration value="loeschen"/>
 *     <enumeration value="ignorieren"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AktionsTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum AktionsTyp {

    @XmlEnumValue("importieren")
    IMPORTIEREN("importieren"),
    @XmlEnumValue("aktualisieren")
    AKTUALISIEREN("aktualisieren"),
    @XmlEnumValue("loeschen")
    LOESCHEN("loeschen"),
    @XmlEnumValue("ignorieren")
    IGNORIEREN("ignorieren");
    private final String value;

    AktionsTyp(String v) {
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
    public static AktionsTyp fromValue(String v) {
        for (AktionsTyp c: AktionsTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
