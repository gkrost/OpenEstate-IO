package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyTypeProject</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="propertyTypeProject">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Attico"/>
 *     <enumeration value="Appartamento"/>
 *     <enumeration value="Negozio"/>
 *     <enumeration value="Ufficio"/>
 *     <enumeration value="Box Auto"/>
 *     <enumeration value="Villa"/>
 *     <enumeration value="Villetta"/>
 *     <enumeration value="Capannone"/>
 *     <enumeration value="Loft"/>
 *     <enumeration value="Magazzino"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "propertyTypeProject")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum ProjectPropertyType {

    @XmlEnumValue("Attico")
    ATTICO("Attico"),
    @XmlEnumValue("Appartamento")
    APPARTAMENTO("Appartamento"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Box Auto")
    BOX_AUTO("Box Auto"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Villetta")
    VILLETTA("Villetta"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino");
    private final String value;

    ProjectPropertyType(String v) {
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
    public static ProjectPropertyType fromValue(String v) {
        for (ProjectPropertyType c: ProjectPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
