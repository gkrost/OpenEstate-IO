package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terrainType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="terrainType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="seminativo"/>
 *     <enumeration value="seminativo irriguo"/>
 *     <enumeration value="seminativo arborato"/>
 *     <enumeration value="seminativo arborato irriguo"/>
 *     <enumeration value="prato"/>
 *     <enumeration value="prato irriguo"/>
 *     <enumeration value="prato arborato"/>
 *     <enumeration value="prato a marcita"/>
 *     <enumeration value="risaia stabile"/>
 *     <enumeration value="pascolo"/>
 *     <enumeration value="pascolo arborato"/>
 *     <enumeration value="pascolo cespugliato"/>
 *     <enumeration value="giardino"/>
 *     <enumeration value="orto"/>
 *     <enumeration value="orto irriguo"/>
 *     <enumeration value="agrumeto"/>
 *     <enumeration value="vigneto"/>
 *     <enumeration value="uliveto"/>
 *     <enumeration value="frutteto"/>
 *     <enumeration value="gelseto"/>
 *     <enumeration value="colture speciali"/>
 *     <enumeration value="castagneto da frutto"/>
 *     <enumeration value="canneto"/>
 *     <enumeration value="bosco alto fusto"/>
 *     <enumeration value="bosco ceduo"/>
 *     <enumeration value="bosco misto"/>
 *     <enumeration value="incolto produttivo"/>
 *     <enumeration value="incolto sterile"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "terrainType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum TerrainType {

    @XmlEnumValue("seminativo")
    SEMINATIVO("seminativo"),
    @XmlEnumValue("seminativo irriguo")
    SEMINATIVO_IRRIGUO("seminativo irriguo"),
    @XmlEnumValue("seminativo arborato")
    SEMINATIVO_ARBORATO("seminativo arborato"),
    @XmlEnumValue("seminativo arborato irriguo")
    SEMINATIVO_ARBORATO_IRRIGUO("seminativo arborato irriguo"),
    @XmlEnumValue("prato")
    PRATO("prato"),
    @XmlEnumValue("prato irriguo")
    PRATO_IRRIGUO("prato irriguo"),
    @XmlEnumValue("prato arborato")
    PRATO_ARBORATO("prato arborato"),
    @XmlEnumValue("prato a marcita")
    PRATO_A_MARCITA("prato a marcita"),
    @XmlEnumValue("risaia stabile")
    RISAIA_STABILE("risaia stabile"),
    @XmlEnumValue("pascolo")
    PASCOLO("pascolo"),
    @XmlEnumValue("pascolo arborato")
    PASCOLO_ARBORATO("pascolo arborato"),
    @XmlEnumValue("pascolo cespugliato")
    PASCOLO_CESPUGLIATO("pascolo cespugliato"),
    @XmlEnumValue("giardino")
    GIARDINO("giardino"),
    @XmlEnumValue("orto")
    ORTO("orto"),
    @XmlEnumValue("orto irriguo")
    ORTO_IRRIGUO("orto irriguo"),
    @XmlEnumValue("agrumeto")
    AGRUMETO("agrumeto"),
    @XmlEnumValue("vigneto")
    VIGNETO("vigneto"),
    @XmlEnumValue("uliveto")
    ULIVETO("uliveto"),
    @XmlEnumValue("frutteto")
    FRUTTETO("frutteto"),
    @XmlEnumValue("gelseto")
    GELSETO("gelseto"),
    @XmlEnumValue("colture speciali")
    COLTURE_SPECIALI("colture speciali"),
    @XmlEnumValue("castagneto da frutto")
    CASTAGNETO_DA_FRUTTO("castagneto da frutto"),
    @XmlEnumValue("canneto")
    CANNETO("canneto"),
    @XmlEnumValue("bosco alto fusto")
    BOSCO_ALTO_FUSTO("bosco alto fusto"),
    @XmlEnumValue("bosco ceduo")
    BOSCO_CEDUO("bosco ceduo"),
    @XmlEnumValue("bosco misto")
    BOSCO_MISTO("bosco misto"),
    @XmlEnumValue("incolto produttivo")
    INCOLTO_PRODUTTIVO("incolto produttivo"),
    @XmlEnumValue("incolto sterile")
    INCOLTO_STERILE("incolto sterile");
    private final String value;

    TerrainType(String v) {
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
    public static TerrainType fromValue(String v) {
        for (TerrainType c: TerrainType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
