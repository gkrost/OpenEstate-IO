package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="status">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="in costruzione"/>
 *     <enumeration value="nuovo"/>
 *     <enumeration value="abitabile"/>
 *     <enumeration value="ottimo"/>
 *     <enumeration value="buono"/>
 *     <enumeration value="ristrutturato"/>
 *     <enumeration value="da ristrutturare"/>
 *     <enumeration value="discreto"/>
 *     <enumeration value="nd"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "status")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum StatusType {

    @XmlEnumValue("in costruzione")
    IN_COSTRUZIONE("in costruzione"),
    @XmlEnumValue("nuovo")
    NUOVO("nuovo"),
    @XmlEnumValue("abitabile")
    ABITABILE("abitabile"),
    @XmlEnumValue("ottimo")
    OTTIMO("ottimo"),
    @XmlEnumValue("buono")
    BUONO("buono"),
    @XmlEnumValue("ristrutturato")
    RISTRUTTURATO("ristrutturato"),
    @XmlEnumValue("da ristrutturare")
    DA_RISTRUTTURARE("da ristrutturare"),
    @XmlEnumValue("discreto")
    DISCRETO("discreto"),
    @XmlEnumValue("nd")
    ND("nd");
    private final String value;

    StatusType(String v) {
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
    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
