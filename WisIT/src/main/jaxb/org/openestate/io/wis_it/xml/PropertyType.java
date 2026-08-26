package org.openestate.io.wis_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Java enum for &amp;lt;IMMOBILIENART&amp;gt; elements.
 * 
 * <p>Java class for propertyType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="propertyType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="bauernhof"/>
 *     <enumeration value="baugrund"/>
 *     <enumeration value="buero"/>
 *     <enumeration value="einfamilienhaus"/>
 *     <enumeration value="garage"/>
 *     <enumeration value="gastgewerbeobjekt"/>
 *     <enumeration value="geschaeft"/>
 *     <enumeration value="gewerbehalle"/>
 *     <enumeration value="kulturgrund"/>
 *     <enumeration value="reihenhaus"/>
 *     <enumeration value="wald"/>
 *     <enumeration value="wohnung"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "propertyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
public enum PropertyType {

    @XmlEnumValue("bauernhof")
    BAUERNHOF("bauernhof"),
    @XmlEnumValue("baugrund")
    BAUGRUND("baugrund"),
    @XmlEnumValue("buero")
    BUERO("buero"),
    @XmlEnumValue("einfamilienhaus")
    EINFAMILIENHAUS("einfamilienhaus"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("gastgewerbeobjekt")
    GASTGEWERBEOBJEKT("gastgewerbeobjekt"),
    @XmlEnumValue("geschaeft")
    GESCHAEFT("geschaeft"),
    @XmlEnumValue("gewerbehalle")
    GEWERBEHALLE("gewerbehalle"),
    @XmlEnumValue("kulturgrund")
    KULTURGRUND("kulturgrund"),
    @XmlEnumValue("reihenhaus")
    REIHENHAUS("reihenhaus"),
    @XmlEnumValue("wald")
    WALD("wald"),
    @XmlEnumValue("wohnung")
    WOHNUNG("wohnung");
    private final String value;

    PropertyType(String v) {
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
    public static PropertyType fromValue(String v) {
        for (PropertyType c: PropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
