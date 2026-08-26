package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kitchen</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="kitchen">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Abitabile"/>
 *     <enumeration value="Semi abitabile"/>
 *     <enumeration value="Cucinotto"/>
 *     <enumeration value="Angolo Cottura"/>
 *     <enumeration value="A vista"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "kitchen")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum KitchenType {

    @XmlEnumValue("Abitabile")
    ABITABILE("Abitabile"),
    @XmlEnumValue("Semi abitabile")
    SEMI_ABITABILE("Semi abitabile"),
    @XmlEnumValue("Cucinotto")
    CUCINOTTO("Cucinotto"),
    @XmlEnumValue("Angolo Cottura")
    ANGOLO_COTTURA("Angolo Cottura"),
    @XmlEnumValue("A vista")
    A_VISTA("A vista");
    private final String value;

    KitchenType(String v) {
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
    public static KitchenType fromValue(String v) {
        for (KitchenType c: KitchenType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
