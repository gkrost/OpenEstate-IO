package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Nutzungsart (Objektkategorie 2) fuer Grundstuecke/Gewerbe
 * 
 * <p>Java class for GrundstueckGewerbeKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GrundstueckGewerbeKategorienTyp">
 *   <restriction base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckKategorienTyp">
 *     <enumeration value="Gewerbe"/>
 *     <enumeration value="LandForstwirtschaft"/>
 *     <enumeration value="Freizeit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GrundstueckGewerbeKategorienTyp")
@XmlEnum(GrundstueckKategorienTyp.class)
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GrundstueckGewerbeKategorienTyp {

    @XmlEnumValue("Gewerbe")
    GEWERBE(GrundstueckKategorienTyp.GEWERBE),
    @XmlEnumValue("LandForstwirtschaft")
    LAND_FORSTWIRTSCHAFT(GrundstueckKategorienTyp.LAND_FORSTWIRTSCHAFT),
    @XmlEnumValue("Freizeit")
    FREIZEIT(GrundstueckKategorienTyp.FREIZEIT);
    private final GrundstueckKategorienTyp value;

    GrundstueckGewerbeKategorienTyp(GrundstueckKategorienTyp v) {
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
    public static GrundstueckGewerbeKategorienTyp fromValue(GrundstueckKategorienTyp v) {
        for (GrundstueckGewerbeKategorienTyp c: GrundstueckGewerbeKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
