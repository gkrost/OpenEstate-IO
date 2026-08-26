package org.openestate.io.wis_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Java enum for &amp;lt;KLIMAHAUS&amp;gt; elements.
 * 
 * <p>Java class for energyStandard</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="energyStandard">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A"/>
 *     <enumeration value="B"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "energyStandard")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
public enum EnergyStandard {

    A,
    B;

    public String value() {
        return name();
    }

    public static EnergyStandard fromValue(String v) {
        return valueOf(v);
    }

}
