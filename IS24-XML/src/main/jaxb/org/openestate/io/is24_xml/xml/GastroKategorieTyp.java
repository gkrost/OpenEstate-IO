package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Gastronomie/Hotels
 * 
 * <p>Java class for GastroKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GastroKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Barbetrieb"/>
 *     <enumeration value="Caffee"/>
 *     <enumeration value="Diskothek"/>
 *     <enumeration value="Gaestehaus"/>
 *     <enumeration value="Gaststaette"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Hotelanwesen"/>
 *     <enumeration value="HotelGarni"/>
 *     <enumeration value="Pension"/>
 *     <enumeration value="Restaurant"/>
 *     <enumeration value="Ferienbungalow"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GastroKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum GastroKategorieTyp {


    /**
     * umfasst: Barbetrieb/Lounge
     * 
     */
    @XmlEnumValue("Barbetrieb")
    BARBETRIEB("Barbetrieb"),
    @XmlEnumValue("Caffee")
    CAFFEE("Caffee"),

    /**
     * umfasst: Club/Diskothek
     * 
     */
    @XmlEnumValue("Diskothek")
    DISKOTHEK("Diskothek"),
    @XmlEnumValue("Gaestehaus")
    GAESTEHAUS("Gaestehaus"),
    @XmlEnumValue("Gaststaette")
    GASTSTAETTE("Gaststaette"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Hotelanwesen")
    HOTELANWESEN("Hotelanwesen"),
    @XmlEnumValue("HotelGarni")
    HOTEL_GARNI("HotelGarni"),
    @XmlEnumValue("Pension")
    PENSION("Pension"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Ferienbungalow")
    FERIENBUNGALOW("Ferienbungalow");
    private final String value;

    GastroKategorieTyp(String v) {
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
    public static GastroKategorieTyp fromValue(String v) {
        for (GastroKategorieTyp c: GastroKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
