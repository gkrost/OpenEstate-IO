package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bodenbelag von Gewerbeobjekten
 * 
 * <p>Java class for BodenbelagTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BodenbelagTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="keineAngabe"/>
 *     <enumeration value="Beton"/>
 *     <enumeration value="Epoxidharz"/>
 *     <enumeration value="Fliesen"/>
 *     <enumeration value="Laminat"/>
 *     <enumeration value="Dielen"/>
 *     <enumeration value="Parkett"/>
 *     <enumeration value="PVC"/>
 *     <enumeration value="Teppichboden"/>
 *     <enumeration value="TeppichbodenAntistatisch"/>
 *     <enumeration value="TeppichfliesenStuhlrollenfest"/>
 *     <enumeration value="Stein"/>
 *     <enumeration value="NachWunsch"/>
 *     <enumeration value="OhneBodenbelag"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BodenbelagTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum BodenbelagTyp {

    @XmlEnumValue("keineAngabe")
    KEINE_ANGABE("keineAngabe"),
    @XmlEnumValue("Beton")
    BETON("Beton"),
    @XmlEnumValue("Epoxidharz")
    EPOXIDHARZ("Epoxidharz"),
    @XmlEnumValue("Fliesen")
    FLIESEN("Fliesen"),
    @XmlEnumValue("Laminat")
    LAMINAT("Laminat"),
    @XmlEnumValue("Dielen")
    DIELEN("Dielen"),
    @XmlEnumValue("Parkett")
    PARKETT("Parkett"),
    PVC("PVC"),
    @XmlEnumValue("Teppichboden")
    TEPPICHBODEN("Teppichboden"),
    @XmlEnumValue("TeppichbodenAntistatisch")
    TEPPICHBODEN_ANTISTATISCH("TeppichbodenAntistatisch"),
    @XmlEnumValue("TeppichfliesenStuhlrollenfest")
    TEPPICHFLIESEN_STUHLROLLENFEST("TeppichfliesenStuhlrollenfest"),
    @XmlEnumValue("Stein")
    STEIN("Stein"),
    @XmlEnumValue("NachWunsch")
    NACH_WUNSCH("NachWunsch"),
    @XmlEnumValue("OhneBodenbelag")
    OHNE_BODENBELAG("OhneBodenbelag");
    private final String value;

    BodenbelagTyp(String v) {
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
    public static BodenbelagTyp fromValue(String v) {
        for (BodenbelagTyp c: BodenbelagTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
