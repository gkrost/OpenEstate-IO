package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Buero/Praxis
 * 
 * <p>Java class for BueroPraxisKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BueroPraxisKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Loft"/>
 *     <enumeration value="Atelier"/>
 *     <enumeration value="Buero"/>
 *     <enumeration value="BueroEtage"/>
 *     <enumeration value="Buerohaus"/>
 *     <enumeration value="Buerozentrum"/>
 *     <enumeration value="BueroUndLagerGebaeude"/>
 *     <enumeration value="Praxis"/>
 *     <enumeration value="PraxisEtage"/>
 *     <enumeration value="PraxisHaus"/>
 *     <enumeration value="GewerbeZentrum"/>
 *     <enumeration value="WohnUndGeschaeftsgebaeude"/>
 *     <enumeration value="BueroUndGeschaeftsgebaeude"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BueroPraxisKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum BueroPraxisKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Atelier")
    ATELIER("Atelier"),
    @XmlEnumValue("Buero")
    BUERO("Buero"),
    @XmlEnumValue("BueroEtage")
    BUERO_ETAGE("BueroEtage"),
    @XmlEnumValue("Buerohaus")
    BUEROHAUS("Buerohaus"),
    @XmlEnumValue("Buerozentrum")
    BUEROZENTRUM("Buerozentrum"),
    @XmlEnumValue("BueroUndLagerGebaeude")
    BUERO_UND_LAGER_GEBAEUDE("BueroUndLagerGebaeude"),
    @XmlEnumValue("Praxis")
    PRAXIS("Praxis"),
    @XmlEnumValue("PraxisEtage")
    PRAXIS_ETAGE("PraxisEtage"),
    @XmlEnumValue("PraxisHaus")
    PRAXIS_HAUS("PraxisHaus"),
    @XmlEnumValue("GewerbeZentrum")
    GEWERBE_ZENTRUM("GewerbeZentrum"),
    @XmlEnumValue("WohnUndGeschaeftsgebaeude")
    WOHN_UND_GESCHAEFTSGEBAEUDE("WohnUndGeschaeftsgebaeude"),
    @XmlEnumValue("BueroUndGeschaeftsgebaeude")
    BUERO_UND_GESCHAEFTSGEBAEUDE("BueroUndGeschaeftsgebaeude");
    private final String value;

    BueroPraxisKategorienTyp(String v) {
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
    public static BueroPraxisKategorienTyp fromValue(String v) {
        for (BueroPraxisKategorienTyp c: BueroPraxisKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
