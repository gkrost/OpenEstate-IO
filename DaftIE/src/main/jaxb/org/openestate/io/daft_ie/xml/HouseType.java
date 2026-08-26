package org.openestate.io.daft_ie.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="houseType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="detached"/>
 *     <enumeration value="semi-detached"/>
 *     <enumeration value="terraced"/>
 *     <enumeration value="end-of-terrace"/>
 *     <enumeration value="townhouse"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "houseType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
public enum HouseType {

    @XmlEnumValue("detached")
    DETACHED("detached"),
    @XmlEnumValue("semi-detached")
    SEMI_DETACHED("semi-detached"),
    @XmlEnumValue("terraced")
    TERRACED("terraced"),
    @XmlEnumValue("end-of-terrace")
    END_OF_TERRACE("end-of-terrace"),
    @XmlEnumValue("townhouse")
    TOWNHOUSE("townhouse");
    private final String value;

    HouseType(String v) {
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
    public static HouseType fromValue(String v) {
        for (HouseType c: HouseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
