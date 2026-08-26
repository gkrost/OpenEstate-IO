package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Liste der ISO 3166-2-Codes fuer Deutschland
 * 
 * <p>Java class for ISOBundeslaenderCodeTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ISOBundeslaenderCodeTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="5"/>
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="DE-BW"/>
 *     <enumeration value="DE-BY"/>
 *     <enumeration value="DE-BE"/>
 *     <enumeration value="DE-BB"/>
 *     <enumeration value="DE-HB"/>
 *     <enumeration value="DE-HH"/>
 *     <enumeration value="DE-HE"/>
 *     <enumeration value="DE-MV"/>
 *     <enumeration value="DE-NI"/>
 *     <enumeration value="DE-NW"/>
 *     <enumeration value="DE-RP"/>
 *     <enumeration value="DE-SL"/>
 *     <enumeration value="DE-SN"/>
 *     <enumeration value="DE-ST"/>
 *     <enumeration value="DE-SH"/>
 *     <enumeration value="DE-TH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ISOBundeslaenderCodeTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum ISOBundeslaenderCodeTyp {

    @XmlEnumValue("DE-BW")
    DE_BW("DE-BW"),
    @XmlEnumValue("DE-BY")
    DE_BY("DE-BY"),
    @XmlEnumValue("DE-BE")
    DE_BE("DE-BE"),
    @XmlEnumValue("DE-BB")
    DE_BB("DE-BB"),
    @XmlEnumValue("DE-HB")
    DE_HB("DE-HB"),
    @XmlEnumValue("DE-HH")
    DE_HH("DE-HH"),
    @XmlEnumValue("DE-HE")
    DE_HE("DE-HE"),
    @XmlEnumValue("DE-MV")
    DE_MV("DE-MV"),
    @XmlEnumValue("DE-NI")
    DE_NI("DE-NI"),
    @XmlEnumValue("DE-NW")
    DE_NW("DE-NW"),
    @XmlEnumValue("DE-RP")
    DE_RP("DE-RP"),
    @XmlEnumValue("DE-SL")
    DE_SL("DE-SL"),
    @XmlEnumValue("DE-SN")
    DE_SN("DE-SN"),
    @XmlEnumValue("DE-ST")
    DE_ST("DE-ST"),
    @XmlEnumValue("DE-SH")
    DE_SH("DE-SH"),
    @XmlEnumValue("DE-TH")
    DE_TH("DE-TH");
    private final String value;

    ISOBundeslaenderCodeTyp(String v) {
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
    public static ISOBundeslaenderCodeTyp fromValue(String v) {
        for (ISOBundeslaenderCodeTyp c: ISOBundeslaenderCodeTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
