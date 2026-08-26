package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Energiestandard von Typenhaeusern
 * 
 * <p>Java class for EnergiestandardTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EnergiestandardTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KeineAngabe"/>
 *     <enumeration value="NiedrigenergiehausKfW40"/>
 *     <enumeration value="NiedriegenergiehausKfW60"/>
 *     <enumeration value="Passivhaus"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergiestandardTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum EnergiestandardTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("NiedrigenergiehausKfW40")
    NIEDRIGENERGIEHAUS_KF_W_40("NiedrigenergiehausKfW40"),
    @XmlEnumValue("NiedriegenergiehausKfW60")
    NIEDRIEGENERGIEHAUS_KF_W_60("NiedriegenergiehausKfW60"),
    @XmlEnumValue("Passivhaus")
    PASSIVHAUS("Passivhaus");
    private final String value;

    EnergiestandardTyp(String v) {
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
    public static EnergiestandardTyp fromValue(String v) {
        for (EnergiestandardTyp c: EnergiestandardTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
