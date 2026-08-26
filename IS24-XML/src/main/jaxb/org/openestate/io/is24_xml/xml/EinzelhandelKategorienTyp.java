package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Einzelhandel
 * 
 * <p>Java class for EinzelhandelKategorienTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EinzelhandelKategorienTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Ausstellungsflaeche"/>
 *     <enumeration value="Einkaufszentrum"/>
 *     <enumeration value="FactoryOutlet"/>
 *     <enumeration value="Kaufhaus"/>
 *     <enumeration value="Kiosk"/>
 *     <enumeration value="Laden"/>
 *     <enumeration value="SBMarkt"/>
 *     <enumeration value="Verkaufsflaeche"/>
 *     <enumeration value="Verkaufshalle"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EinzelhandelKategorienTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum EinzelhandelKategorienTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Ausstellungsflaeche")
    AUSSTELLUNGSFLAECHE("Ausstellungsflaeche"),
    @XmlEnumValue("Einkaufszentrum")
    EINKAUFSZENTRUM("Einkaufszentrum"),
    @XmlEnumValue("FactoryOutlet")
    FACTORY_OUTLET("FactoryOutlet"),
    @XmlEnumValue("Kaufhaus")
    KAUFHAUS("Kaufhaus"),
    @XmlEnumValue("Kiosk")
    KIOSK("Kiosk"),
    @XmlEnumValue("Laden")
    LADEN("Laden"),
    @XmlEnumValue("SBMarkt")
    SB_MARKT("SBMarkt"),
    @XmlEnumValue("Verkaufsflaeche")
    VERKAUFSFLAECHE("Verkaufsflaeche"),
    @XmlEnumValue("Verkaufshalle")
    VERKAUFSHALLE("Verkaufshalle");
    private final String value;

    EinzelhandelKategorienTyp(String v) {
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
    public static EinzelhandelKategorienTyp fromValue(String v) {
        for (EinzelhandelKategorienTyp c: EinzelhandelKategorienTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
