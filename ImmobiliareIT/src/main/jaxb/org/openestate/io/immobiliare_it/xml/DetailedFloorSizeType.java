package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedSizeFloorType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="detailedSizeFloorType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Intermedio"/>
 *     <enumeration value="Interrato"/>
 *     <enumeration value="Seminterrato"/>
 *     <enumeration value="PianoTerra"/>
 *     <enumeration value="Rialzato"/>
 *     <enumeration value="Multipiano"/>
 *     <enumeration value="Ultimo"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "detailedSizeFloorType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum DetailedFloorSizeType {

    @XmlEnumValue("Intermedio")
    INTERMEDIO("Intermedio"),
    @XmlEnumValue("Interrato")
    INTERRATO("Interrato"),
    @XmlEnumValue("Seminterrato")
    SEMINTERRATO("Seminterrato"),
    @XmlEnumValue("PianoTerra")
    PIANO_TERRA("PianoTerra"),
    @XmlEnumValue("Rialzato")
    RIALZATO("Rialzato"),
    @XmlEnumValue("Multipiano")
    MULTIPIANO("Multipiano"),
    @XmlEnumValue("Ultimo")
    ULTIMO("Ultimo");
    private final String value;

    DetailedFloorSizeType(String v) {
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
    public static DetailedFloorSizeType fromValue(String v) {
        for (DetailedFloorSizeType c: DetailedFloorSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
