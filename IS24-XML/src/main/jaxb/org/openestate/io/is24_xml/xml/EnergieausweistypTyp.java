package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EnergieausweistypTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EnergieausweistypTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KeineAngabe"/>
 *     <enumeration value="Endenergiebedarf"/>
 *     <enumeration value="Energieverbrauchskennwert"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergieausweistypTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum EnergieausweistypTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("Endenergiebedarf")
    ENDENERGIEBEDARF("Endenergiebedarf"),
    @XmlEnumValue("Energieverbrauchskennwert")
    ENERGIEVERBRAUCHSKENNWERT("Energieverbrauchskennwert");
    private final String value;

    EnergieausweistypTyp(String v) {
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
    public static EnergieausweistypTyp fromValue(String v) {
        for (EnergieausweistypTyp c: EnergieausweistypTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
