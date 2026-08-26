package org.openestate.io.wis_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Java enum for &amp;lt;ENERGIEEFFIZIENZKLASSE&amp;gt; elements.
 * 
 * <p>Java class for energyEfficiencyClass</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="energyEfficiencyClass">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="A gold"/>
 *     <enumeration value="A Gold"/>
 *     <enumeration value="A+++"/>
 *     <enumeration value="A++"/>
 *     <enumeration value="A+"/>
 *     <enumeration value="A"/>
 *     <enumeration value="B"/>
 *     <enumeration value="C"/>
 *     <enumeration value="D"/>
 *     <enumeration value="E"/>
 *     <enumeration value="F"/>
 *     <enumeration value="G"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "energyEfficiencyClass")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
public enum EnergyEfficiencyClass {

    @XmlEnumValue("A gold")
    A_GOLD("A gold"),
    @XmlEnumValue("A Gold")
    A_GOLD2("A Gold"),
    @XmlEnumValue("A+++")
    A_PLUS_PLUS_PLUS("A+++"),
    @XmlEnumValue("A++")
    A_PLUS_PLUS("A++"),
    @XmlEnumValue("A+")
    A_PLUS("A+"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G");
    private final String value;

    EnergyEfficiencyClass(String v) {
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
    public static EnergyEfficiencyClass fromValue(String v) {
        for (EnergyEfficiencyClass c: EnergyEfficiencyClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
