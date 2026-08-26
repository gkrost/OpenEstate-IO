package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektkategorie 2 fuer Sonstige Gewerbeobjekte.
 * 
 * <p>Java class for SonstigeGewerbeKategorieTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SonstigeGewerbeKategorieTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Anwesen"/>
 *     <enumeration value="Bauernhof"/>
 *     <enumeration value="Reiterhof"/>
 *     <enumeration value="Weingut"/>
 *     <enumeration value="Werkstatt"/>
 *     <enumeration value="Freizeitanlage"/>
 *     <enumeration value="Gewerbeflaeche"/>
 *     <enumeration value="Spezialobjekt"/>
 *     <enumeration value="Gewerbepark"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SonstigeGewerbeKategorieTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum SonstigeGewerbeKategorieTyp {

    @XmlEnumValue("Anwesen")
    ANWESEN("Anwesen"),
    @XmlEnumValue("Bauernhof")
    BAUERNHOF("Bauernhof"),
    @XmlEnumValue("Reiterhof")
    REITERHOF("Reiterhof"),
    @XmlEnumValue("Weingut")
    WEINGUT("Weingut"),
    @XmlEnumValue("Werkstatt")
    WERKSTATT("Werkstatt"),
    @XmlEnumValue("Freizeitanlage")
    FREIZEITANLAGE("Freizeitanlage"),
    @XmlEnumValue("Gewerbeflaeche")
    GEWERBEFLAECHE("Gewerbeflaeche"),
    @XmlEnumValue("Spezialobjekt")
    SPEZIALOBJEKT("Spezialobjekt"),
    @XmlEnumValue("Gewerbepark")
    GEWERBEPARK("Gewerbepark");
    private final String value;

    SonstigeGewerbeKategorieTyp(String v) {
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
    public static SonstigeGewerbeKategorieTyp fromValue(String v) {
        for (SonstigeGewerbeKategorieTyp c: SonstigeGewerbeKategorieTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
