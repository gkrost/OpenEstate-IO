package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MindestmietdauerTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MindestmietdauerTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="1"/>
 *     <enumeration value="2"/>
 *     <enumeration value="3"/>
 *     <enumeration value="4"/>
 *     <enumeration value="5"/>
 *     <enumeration value="6"/>
 *     <enumeration value="7"/>
 *     <enumeration value="8"/>
 *     <enumeration value="9"/>
 *     <enumeration value="10"/>
 *     <enumeration value="11"/>
 *     <enumeration value="12+"/>
 *     <enumeration value="Unbefristet"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MindestmietdauerTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum MindestmietdauerTyp {

    @XmlEnumValue("1")
    MONTHS_01("1"),
    @XmlEnumValue("2")
    MONTHS_02("2"),
    @XmlEnumValue("3")
    MONTHS_03("3"),
    @XmlEnumValue("4")
    MONTHS_04("4"),
    @XmlEnumValue("5")
    MONTHS_05("5"),
    @XmlEnumValue("6")
    MONTHS_06("6"),
    @XmlEnumValue("7")
    MONTHS_07("7"),
    @XmlEnumValue("8")
    MONTHS_08("8"),
    @XmlEnumValue("9")
    MONTHS_09("9"),
    @XmlEnumValue("10")
    MONTHS_10("10"),
    @XmlEnumValue("11")
    MONTHS_11("11"),
    @XmlEnumValue("12+")
    MONTHS_12_PLUS("12+"),
    @XmlEnumValue("Unbefristet")
    UNBEFRISTET("Unbefristet");
    private final String value;

    MindestmietdauerTyp(String v) {
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
    public static MindestmietdauerTyp fromValue(String v) {
        for (MindestmietdauerTyp c: MindestmietdauerTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
