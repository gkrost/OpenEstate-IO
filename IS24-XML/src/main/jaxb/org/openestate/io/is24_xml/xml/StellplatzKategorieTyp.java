package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Garagen/Stellplatz-Kategorien fuer Garagen/Stellplaetze von Hauser-, Wohnungs- und
 *                 WAZ-Typen
 * 
 * <p>Java class for StellplatzKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StellplatzKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Garage"/>
 *     <enumeration value="AussenStellplatz"/>
 *     <enumeration value="Carport"/>
 *     <enumeration value="Duplex"/>
 *     <enumeration value="Parkhaus"/>
 *     <enumeration value="Tiefgarage"/>
 *     <enumeration value="true"/>
 *     <enumeration value="false"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StellplatzKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum StellplatzKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("AussenStellplatz")
    AUSSEN_STELLPLATZ("AussenStellplatz"),
    @XmlEnumValue("Carport")
    CARPORT("Carport"),
    @XmlEnumValue("Duplex")
    DUPLEX("Duplex"),
    @XmlEnumValue("Parkhaus")
    PARKHAUS("Parkhaus"),
    @XmlEnumValue("Tiefgarage")
    TIEFGARAGE("Tiefgarage"),

    /**
     * entspricht 'keineAngabe' = Kategorie nicht naeher definiert
     *                         (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("true")
    TRUE("true"),

    /**
     * entspricht 'keineAngabe' = kein Garage vorhanden
     *                         (aus Kompatibilitaetsgruenden, wird in zukuenftigen Versionen nicht mehr unterstuetzt)
     * 
     */
    @XmlEnumValue("false")
    FALSE("false");
    private final String value;

    StellplatzKategorieTyp(String v) {
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
    public static StellplatzKategorieTyp fromValue(String v) {
        for (StellplatzKategorieTyp c: StellplatzKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
