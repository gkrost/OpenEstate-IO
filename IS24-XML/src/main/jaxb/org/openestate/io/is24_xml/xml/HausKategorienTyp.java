package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Haeuser
 * 
 * <p>Java class for HausKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HausKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Bungalow"/>
 *     <enumeration value="Doppelhaushaelfte"/>
 *     <enumeration value="Einfamilienhaus"/>
 *     <enumeration value="Mehrfamilienhaus"/>
 *     <enumeration value="Villa"/>
 *     <enumeration value="Reihenhaus"/>
 *     <enumeration value="Reihenmittelhaus"/>
 *     <enumeration value="Reiheneckhaus"/>
 *     <enumeration value="Zweifamilienhaus"/>
 *     <enumeration value="Bauernhaus"/>
 *     <enumeration value="Sonstiges"/>
 *     <enumeration value="BesondereImmobilie"/>
 *     <enumeration value="BurgSchloss"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HausKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum HausKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Doppelhaushaelfte")
    DOPPELHAUSHAELFTE("Doppelhaushaelfte"),
    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen
     *                         'Reihenmittelhaus' oder 'Reiheneckhaus'
     *                         (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("Reihenhaus")
    REIHENHAUS("Reihenhaus"),
    @XmlEnumValue("Reihenmittelhaus")
    REIHENMITTELHAUS("Reihenmittelhaus"),
    @XmlEnumValue("Reiheneckhaus")
    REIHENECKHAUS("Reiheneckhaus"),

    /**
     * aus Kompatibilitaetsgruenden weiter vorhanden: Benutze stattdessen
     *                         'Mehrfamilienhaus'
     *                         (wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("Zweifamilienhaus")
    ZWEIFAMILIENHAUS("Zweifamilienhaus"),
    @XmlEnumValue("Bauernhaus")
    BAUERNHAUS("Bauernhaus"),

    /**
     * Umfasst: Wohnimmobilie (sonstige)
     * 
     */
    @XmlEnumValue("Sonstiges")
    SONSTIGES("Sonstiges"),
    @XmlEnumValue("BesondereImmobilie")
    BESONDERE_IMMOBILIE("BesondereImmobilie"),
    @XmlEnumValue("BurgSchloss")
    BURG_SCHLOSS("BurgSchloss");
    private final String value;

    HausKategorienTyp(String v) {
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
    public static HausKategorienTyp fromValue(String v) {
        for (HausKategorienTyp c: HausKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
