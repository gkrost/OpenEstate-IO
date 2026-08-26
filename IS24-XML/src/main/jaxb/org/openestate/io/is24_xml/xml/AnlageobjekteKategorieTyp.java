package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Anlageobjekte
 * 
 * <p>Java class for AnlageobjekteKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AnlageobjekteKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Einfamilienhaus"/>
 *     <enumeration value="Mehrfamilienhaus"/>
 *     <enumeration value="Eigentumswohnung"/>
 *     <enumeration value="Einkaufszentrum"/>
 *     <enumeration value="Gaststaette"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Freizeitanlage"/>
 *     <enumeration value="Gewerbeeinheit"/>
 *     <enumeration value="Buerogebaeude"/>
 *     <enumeration value="Geschaeftshaus"/>
 *     <enumeration value="Gewerbeanwesen"/>
 *     <enumeration value="HalleLager"/>
 *     <enumeration value="Industrieanwesen"/>
 *     <enumeration value="LadenVerkaufsflaeche"/>
 *     <enumeration value="Servicecenter"/>
 *     <enumeration value="Sonstige"/>
 *     <enumeration value="Supermarkt"/>
 *     <enumeration value="WohnGeschaeftshaus"/>
 *     <enumeration value="Wohnanlage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AnlageobjekteKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum AnlageobjekteKategorieTyp {

    @XmlEnumValue("Einfamilienhaus")
    EINFAMILIENHAUS("Einfamilienhaus"),
    @XmlEnumValue("Mehrfamilienhaus")
    MEHRFAMILIENHAUS("Mehrfamilienhaus"),
    @XmlEnumValue("Eigentumswohnung")
    EIGENTUMSWOHNUNG("Eigentumswohnung"),
    @XmlEnumValue("Einkaufszentrum")
    EINKAUFSZENTRUM("Einkaufszentrum"),
    @XmlEnumValue("Gaststaette")
    GASTSTAETTE("Gaststaette"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Freizeitanlage")
    FREIZEITANLAGE("Freizeitanlage"),
    @XmlEnumValue("Gewerbeeinheit")
    GEWERBEEINHEIT("Gewerbeeinheit"),
    @XmlEnumValue("Buerogebaeude")
    BUEROGEBAEUDE("Buerogebaeude"),
    @XmlEnumValue("Geschaeftshaus")
    GESCHAEFTSHAUS("Geschaeftshaus"),
    @XmlEnumValue("Gewerbeanwesen")
    GEWERBEANWESEN("Gewerbeanwesen"),
    @XmlEnumValue("HalleLager")
    HALLE_LAGER("HalleLager"),
    @XmlEnumValue("Industrieanwesen")
    INDUSTRIEANWESEN("Industrieanwesen"),
    @XmlEnumValue("LadenVerkaufsflaeche")
    LADEN_VERKAUFSFLAECHE("LadenVerkaufsflaeche"),
    @XmlEnumValue("Servicecenter")
    SERVICECENTER("Servicecenter"),
    @XmlEnumValue("Sonstige")
    SONSTIGE("Sonstige"),
    @XmlEnumValue("Supermarkt")
    SUPERMARKT("Supermarkt"),
    @XmlEnumValue("WohnGeschaeftshaus")
    WOHN_GESCHAEFTSHAUS("WohnGeschaeftshaus"),
    @XmlEnumValue("Wohnanlage")
    WOHNANLAGE("Wohnanlage");
    private final String value;

    AnlageobjekteKategorieTyp(String v) {
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
    public static AnlageobjekteKategorieTyp fromValue(String v) {
        for (AnlageobjekteKategorieTyp c: AnlageobjekteKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
