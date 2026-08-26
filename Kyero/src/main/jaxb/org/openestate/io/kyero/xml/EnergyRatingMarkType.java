package org.openestate.io.kyero.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyRatingMarkType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="energyRatingMarkType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <maxLength value="1"/>
 *     <enumeration value="A"/>
 *     <enumeration value="B"/>
 *     <enumeration value="C"/>
 *     <enumeration value="D"/>
 *     <enumeration value="E"/>
 *     <enumeration value="F"/>
 *     <enumeration value="G"/>
 *     <enumeration value="X"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "energyRatingMarkType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
public enum EnergyRatingMarkType {

    A,
    B,
    C,
    D,
    E,
    F,
    G,
    X;

    public String value() {
        return name();
    }

    public static EnergyRatingMarkType fromValue(String v) {
        return valueOf(v);
    }

}
