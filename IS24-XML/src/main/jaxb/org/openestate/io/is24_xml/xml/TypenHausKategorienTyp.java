package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Typenhaeuser
 * 
 * <p>Java class for TypenHausKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TypenHausKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Blockhaus"/>
 *     <enumeration value="Bungalow"/>
 *     <enumeration value="Doppelhaus"/>
 *     <enumeration value="Einfamilienhaus"/>
 *     <enumeration value="Fachwerkhaus"/>
 *     <enumeration value="Holzhaus"/>
 *     <enumeration value="Landhaus"/>
 *     <enumeration value="Mehrfamilienhaus"/>
 *     <enumeration value="Villa"/>
 *     <enumeration value="Reihenhaus"/>
 *     <enumeration value="Zweifamilienhaus"/>
 *     <enumeration value="EinfamilienhausMitEinliegerwohnung"/>
 *     <enumeration value="keineAngabe"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypenHausKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum TypenHausKategorienTyp {

    @XmlEnumValue("Blockhaus")
    BLOCKHAUS("Blockhaus"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Doppelhaus")
    DOPPELHAUS("Doppelhaus"),
    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Fachwerkhaus")
    FACHWERKHAUS("Fachwerkhaus"),
    @XmlEnumValue("Holzhaus")
    HOLZHAUS("Holzhaus"),
    @XmlEnumValue("Landhaus")
    LANDHAUS("Landhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Reihenhaus")
    REIHENHAUS("Reihenhaus"),
    @XmlEnumValue("Zweifamilienhaus")
    ZWEIFAMILIENHAUS("Zweifamilienhaus"),
    @XmlEnumValue("EinfamilienhausMitEinliegerwohnung")
    EINFAMILIENHAUS_MIT_EINLIEGERWOHNUNG("EinfamilienhausMitEinliegerwohnung"),
    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe");
    private final String value;

    TypenHausKategorienTyp(String v) {
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
    public static TypenHausKategorienTyp fromValue(String v) {
        for (TypenHausKategorienTyp c: TypenHausKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
