package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Halle/Produktion
 * 
 * <p>Java class for HalleProduktionKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HalleProduktionKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Ausstellungsflaeche"/>
 *     <enumeration value="Halle"/>
 *     <enumeration value="Hochregallager"/>
 *     <enumeration value="Industriehalle"/>
 *     <enumeration value="IndustriehalleMitFreiflaeche"/>
 *     <enumeration value="Kuehlhaus"/>
 *     <enumeration value="Kuehlregallager"/>
 *     <enumeration value="LagerMitFreiflaeche"/>
 *     <enumeration value="Lagerflaeche"/>
 *     <enumeration value="Lagerhalle"/>
 *     <enumeration value="Serviceflaeche"/>
 *     <enumeration value="Speditionslager"/>
 *     <enumeration value="Werkstatt"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HalleProduktionKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum HalleProduktionKategorieTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Ausstellungsflaeche")
    AUSSTELLUNGSFLAECHE("Ausstellungsflaeche"),
    @XmlEnumValue("Halle")
    HALLE("Halle"),
    @XmlEnumValue("Hochregallager")
    HOCHREGALLAGER("Hochregallager"),
    @XmlEnumValue("Industriehalle")
    INDUSTRIEHALLE("Industriehalle"),
    @XmlEnumValue("IndustriehalleMitFreiflaeche")
    INDUSTRIEHALLE_MIT_FREIFLAECHE("IndustriehalleMitFreiflaeche"),
    @XmlEnumValue("Kuehlhaus")
    KUEHLHAUS("Kuehlhaus"),
    @XmlEnumValue("Kuehlregallager")
    KUEHLREGALLAGER("Kuehlregallager"),
    @XmlEnumValue("LagerMitFreiflaeche")
    LAGER_MIT_FREIFLAECHE("LagerMitFreiflaeche"),
    @XmlEnumValue("Lagerflaeche")
    LAGERFLAECHE("Lagerflaeche"),
    @XmlEnumValue("Lagerhalle")
    LAGERHALLE("Lagerhalle"),
    @XmlEnumValue("Serviceflaeche")
    SERVICEFLAECHE("Serviceflaeche"),
    @XmlEnumValue("Speditionslager")
    SPEDITIONSLAGER("Speditionslager"),
    @XmlEnumValue("Werkstatt")
    WERKSTATT("Werkstatt");
    private final String value;

    HalleProduktionKategorieTyp(String v) {
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
    public static HalleProduktionKategorieTyp fromValue(String v) {
        for (HalleProduktionKategorieTyp c: HalleProduktionKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
