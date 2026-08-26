package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ausbaustufen von Typenhaeusern
 * 
 * <p>Java class for AusbaustufeTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AusbaustufeTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KeineAngabe"/>
 *     <enumeration value="Bausatzhaus"/>
 *     <enumeration value="Ausbauhaus"/>
 *     <enumeration value="SchluesselfertigMitKeller"/>
 *     <enumeration value="SchluesselfertigOhneBodenplatte"/>
 *     <enumeration value="SchluesselfertigMitBodenplatte"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AusbaustufeTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum AusbaustufeTyp {

    @XmlEnumValue("KeineAngabe")
    KEINE_ANGABE("KeineAngabe"),
    @XmlEnumValue("Bausatzhaus")
    BAUSATZHAUS("Bausatzhaus"),
    @XmlEnumValue("Ausbauhaus")
    AUSBAUHAUS("Ausbauhaus"),
    @XmlEnumValue("SchluesselfertigMitKeller")
    SCHLUESSELFERTIG_MIT_KELLER("SchluesselfertigMitKeller"),
    @XmlEnumValue("SchluesselfertigOhneBodenplatte")
    SCHLUESSELFERTIG_OHNE_BODENPLATTE("SchluesselfertigOhneBodenplatte"),
    @XmlEnumValue("SchluesselfertigMitBodenplatte")
    SCHLUESSELFERTIG_MIT_BODENPLATTE("SchluesselfertigMitBodenplatte");
    private final String value;

    AusbaustufeTyp(String v) {
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
    public static AusbaustufeTyp fromValue(String v) {
        for (AusbaustufeTyp c: AusbaustufeTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
