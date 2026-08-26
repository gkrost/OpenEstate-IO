package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for furniture</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="furniture">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Arredato"/>
 *     <enumeration value="Non Arredato"/>
 *     <enumeration value="Parzialmente Arredato"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "furniture")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum FurnitureType {

    @XmlEnumValue("Arredato")
    ARREDATO("Arredato"),
    @XmlEnumValue("Non Arredato")
    NON_ARREDATO("Non Arredato"),
    @XmlEnumValue("Parzialmente Arredato")
    PARZIALMENTE_ARREDATO("Parzialmente Arredato");
    private final String value;

    FurnitureType(String v) {
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
    public static FurnitureType fromValue(String v) {
        for (FurnitureType c: FurnitureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
