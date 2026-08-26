package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BebaubarNachTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BebaubarNachTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unbekannt"/>
 *     <enumeration value="§30BauGB"/>
 *     <enumeration value="§34BauGB"/>
 *     <enumeration value="§35BauGB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BebaubarNachTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum BebaubarNachTyp {

    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt"),

    /**
     * Bebauung nach Bebauungsplan
     * 
     */
    @XmlEnumValue("\u00a730BauGB")
    BAUGB_30("\u00a730BauGB"),

    /**
     * Nachbarbebauung
     * 
     */
    @XmlEnumValue("\u00a734BauGB")
    BAUGB_34("\u00a734BauGB"),

    /**
     * Aussengebiet
     * 
     */
    @XmlEnumValue("\u00a735BauGB")
    BAUGB_35("\u00a735BauGB");
    private final String value;

    BebaubarNachTyp(String v) {
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
    public static BebaubarNachTyp fromValue(String v) {
        for (BebaubarNachTyp c: BebaubarNachTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
