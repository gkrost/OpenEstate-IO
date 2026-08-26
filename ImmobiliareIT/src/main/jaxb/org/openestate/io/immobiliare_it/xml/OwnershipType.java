package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownershipType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ownershipType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="intera proprietà"/>
 *     <enumeration value="nuda proprietà"/>
 *     <enumeration value="parziale proprietà"/>
 *     <enumeration value="usufrutto"/>
 *     <enumeration value="multiproprietà"/>
 *     <enumeration value="diritto di superficie"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ownershipType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum OwnershipType {

    @XmlEnumValue("intera propriet\u00e0")
    INTERA_PROPRIETA("intera propriet\u00e0"),
    @XmlEnumValue("nuda propriet\u00e0")
    NUDA_PROPRIETA("nuda propriet\u00e0"),
    @XmlEnumValue("parziale propriet\u00e0")
    PARZIALE_PROPRIETA("parziale propriet\u00e0"),
    @XmlEnumValue("usufrutto")
    USUFRUTTO("usufrutto"),
    @XmlEnumValue("multipropriet\u00e0")
    MULTIPROPRIETA("multipropriet\u00e0"),
    @XmlEnumValue("diritto di superficie")
    DIRITTO_DI_SUPERFICIE("diritto di superficie");
    private final String value;

    OwnershipType(String v) {
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
    public static OwnershipType fromValue(String v) {
        for (OwnershipType c: OwnershipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
