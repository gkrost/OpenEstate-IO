package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for heat</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="heat">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Assente"/>
 *     <enumeration value="Autonomo"/>
 *     <enumeration value="Centralizzato"/>
 *     <enumeration value="Teleriscaldamento"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "heat")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum HeatType {

    @XmlEnumValue("Assente")
    ASSENTE("Assente"),
    @XmlEnumValue("Autonomo")
    AUTONOMO("Autonomo"),
    @XmlEnumValue("Centralizzato")
    CENTRALIZZATO("Centralizzato"),
    @XmlEnumValue("Teleriscaldamento")
    TELERISCALDAMENTO("Teleriscaldamento");
    private final String value;

    HeatType(String v) {
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
    public static HeatType fromValue(String v) {
        for (HeatType c: HeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
