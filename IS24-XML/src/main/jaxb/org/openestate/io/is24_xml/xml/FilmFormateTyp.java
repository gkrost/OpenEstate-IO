package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Akzeptierte Dateiformate von Film-Attachments
 * 
 * <p>Java class for FilmFormateTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FilmFormateTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVI"/>
 *     <enumeration value="MPG"/>
 *     <enumeration value="MOV"/>
 *     <enumeration value="QT"/>
 *     <enumeration value="QTL"/>
 *     <enumeration value="RM"/>
 *     <enumeration value="RV"/>
 *     <enumeration value="MPE"/>
 *     <enumeration value="MPEG"/>
 *     <enumeration value="MP4"/>
 *     <enumeration value="WMV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FilmFormateTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum FilmFormateTyp {

    AVI("AVI"),
    MPG("MPG"),
    MOV("MOV"),
    QT("QT"),
    QTL("QTL"),
    RM("RM"),
    RV("RV"),
    MPE("MPE"),
    MPEG("MPEG"),
    @XmlEnumValue("MP4")
    MP_4("MP4"),
    WMV("WMV");
    private final String value;

    FilmFormateTyp(String v) {
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
    public static FilmFormateTyp fromValue(String v) {
        for (FilmFormateTyp c: FilmFormateTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
