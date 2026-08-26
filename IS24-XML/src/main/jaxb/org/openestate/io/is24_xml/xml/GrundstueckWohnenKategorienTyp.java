package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Nutzungsart (Objektkategorie 2) fuer Grundstuecke/Wohnen
 * 
 * <p>Java class for GrundstueckWohnenKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GrundstueckWohnenKategorienTyp">
 *   <restriction base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckKategorienTyp">
 *     <enumeration value="Wohnen"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GrundstueckWohnenKategorienTyp")
@XmlEnum(GrundstueckKategorienTyp.class)
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GrundstueckWohnenKategorienTyp {

    @XmlEnumValue("Wohnen")
    WOHNEN(GrundstueckKategorienTyp.WOHNEN);
    private final GrundstueckKategorienTyp value;

    GrundstueckWohnenKategorienTyp(GrundstueckKategorienTyp v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public GrundstueckKategorienTyp value() {
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
    public static GrundstueckWohnenKategorienTyp fromValue(GrundstueckKategorienTyp v) {
        for (GrundstueckWohnenKategorienTyp c: GrundstueckWohnenKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
