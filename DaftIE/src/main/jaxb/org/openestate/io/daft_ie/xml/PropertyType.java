package org.openestate.io.daft_ie.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="propertyType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="house"/>
 *     <enumeration value="apartment"/>
 *     <enumeration value="duplex"/>
 *     <enumeration value="bungalow"/>
 *     <enumeration value="site"/>
 *     <enumeration value="commercial"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "propertyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
public enum PropertyType {

    @XmlEnumValue("house")
    HOUSE("house"),
    @XmlEnumValue("apartment")
    APARTMENT("apartment"),
    @XmlEnumValue("duplex")
    DUPLEX("duplex"),
    @XmlEnumValue("bungalow")
    BUNGALOW("bungalow"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial");
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
