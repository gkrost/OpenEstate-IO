package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rental</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="rental">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="3+2"/>
 *     <enumeration value="4+4"/>
 *     <enumeration value="6+6"/>
 *     <enumeration value="9+9"/>
 *     <enumeration value="Transitorio"/>
 *     <enumeration value="Concordato"/>
 *     <enumeration value="Libero"/>
 *     <enumeration value="Studenti"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "rental")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum RentalType {

    @XmlEnumValue("3+2")
    RENT_3_PLUS_2("3+2"),
    @XmlEnumValue("4+4")
    RENT_4_PLUS_4("4+4"),
    @XmlEnumValue("6+6")
    RENT_6_PLUS_6("6+6"),
    @XmlEnumValue("9+9")
    RENT_9_PLUS_9("9+9"),
    @XmlEnumValue("Transitorio")
    TRANSITORIO("Transitorio"),
    @XmlEnumValue("Concordato")
    CONCORDATO("Concordato"),
    @XmlEnumValue("Libero")
    LIBERO("Libero"),
    @XmlEnumValue("Studenti")
    STUDENTI("Studenti");
    private final String value;

    RentalType(String v) {
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
    public static RentalType fromValue(String v) {
        for (RentalType c: RentalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
