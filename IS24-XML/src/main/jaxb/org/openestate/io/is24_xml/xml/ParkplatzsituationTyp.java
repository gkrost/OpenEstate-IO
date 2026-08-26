package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ParkplatzsituationTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ParkplatzsituationTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="guteParkmoeglichkeit"/>
 *     <enumeration value="schlechteParkmoeglichkeit"/>
 *     <enumeration value="Bewohnerparken"/>
 *     <enumeration value="eigenerStellplatzGarage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParkplatzsituationTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum ParkplatzsituationTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("guteParkmoeglichkeit")
    GUTE_PARKMOEGLICHKEIT("guteParkmoeglichkeit"),
    @XmlEnumValue("schlechteParkmoeglichkeit")
    SCHLECHTE_PARKMOEGLICHKEIT("schlechteParkmoeglichkeit"),
    @XmlEnumValue("Bewohnerparken")
    BEWOHNERPARKEN("Bewohnerparken"),
    @XmlEnumValue("eigenerStellplatzGarage")
    EIGENER_STELLPLATZ_GARAGE("eigenerStellplatzGarage");
    private final String value;

    ParkplatzsituationTyp(String v) {
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
    public static ParkplatzsituationTyp fromValue(String v) {
        for (ParkplatzsituationTyp c: ParkplatzsituationTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
