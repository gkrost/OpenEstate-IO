package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer WG Zimmer
 * 
 * <p>Java class for WGZimmerKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WGZimmerKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Dachgeschoss"/>
 *     <enumeration value="Loft"/>
 *     <enumeration value="Maisonette"/>
 *     <enumeration value="Penthouse"/>
 *     <enumeration value="Terrassenwohnung"/>
 *     <enumeration value="Erdgeschoss"/>
 *     <enumeration value="Etagenwohnung"/>
 *     <enumeration value="Hochparterre"/>
 *     <enumeration value="Souterrain"/>
 *     <enumeration value="Sonstige"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WGZimmerKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum WGZimmerKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Dachgeschoss")
    DACHGESCHOSS("Dachgeschoss"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Maisonette")
    MAISONETTE("Maisonette"),
    @XmlEnumValue("Penthouse")
    PENTHOUSE("Penthouse"),
    @XmlEnumValue("Terrassenwohnung")
    TERRASSENWOHNUNG("Terrassenwohnung"),
    @XmlEnumValue("Erdgeschoss")
    ERDGESCHOSS("Erdgeschoss"),
    @XmlEnumValue("Etagenwohnung")
    ETAGENWOHNUNG("Etagenwohnung"),
    @XmlEnumValue("Hochparterre")
    HOCHPARTERRE("Hochparterre"),
    @XmlEnumValue("Souterrain")
    SOUTERRAIN("Souterrain"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige");
    private final String value;

    WGZimmerKategorienTyp(String v) {
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
    public static WGZimmerKategorienTyp fromValue(String v) {
        for (WGZimmerKategorienTyp c: WGZimmerKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
