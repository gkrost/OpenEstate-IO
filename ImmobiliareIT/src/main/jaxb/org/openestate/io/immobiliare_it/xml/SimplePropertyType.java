package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyTypeSimple</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="propertyTypeSimple">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Appartamento"/>
 *     <enumeration value="Attico"/>
 *     <enumeration value="Mansarda"/>
 *     <enumeration value="Garage"/>
 *     <enumeration value="Casa indipendente"/>
 *     <enumeration value="Palazzo"/>
 *     <enumeration value="Stabile"/>
 *     <enumeration value="Rustico"/>
 *     <enumeration value="Casale"/>
 *     <enumeration value="Villa"/>
 *     <enumeration value="Villetta a schiera"/>
 *     <enumeration value="Loft"/>
 *     <enumeration value="Open Space"/>
 *     <enumeration value="Multiproprietà"/>
 *     <enumeration value="Villetta"/>
 *     <enumeration value="Agriturismo"/>
 *     <enumeration value="Bed and Breakfast"/>
 *     <enumeration value="Barca"/>
 *     <enumeration value="Bungalow"/>
 *     <enumeration value="Chalet"/>
 *     <enumeration value="Baita"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Parco Vacanze"/>
 *     <enumeration value="Residence"/>
 *     <enumeration value="Roulotte"/>
 *     <enumeration value="Stanza"/>
 *     <enumeration value="Camera"/>
 *     <enumeration value="Casa per ferie (gruppi)"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Altro"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "propertyTypeSimple")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum SimplePropertyType {

    @XmlEnumValue("Appartamento")
    APPARTAMENTO("Appartamento"),
    @XmlEnumValue("Attico")
    ATTICO("Attico"),
    @XmlEnumValue("Mansarda")
    MANSARDA("Mansarda"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Casa indipendente")
    CASA_INDIPENDENTE("Casa indipendente"),
    @XmlEnumValue("Palazzo")
    PALAZZO("Palazzo"),
    @XmlEnumValue("Stabile")
    STABILE("Stabile"),
    @XmlEnumValue("Rustico")
    RUSTICO("Rustico"),
    @XmlEnumValue("Casale")
    CASALE("Casale"),
    @XmlEnumValue("Villa")
    VILLA("Villa"),
    @XmlEnumValue("Villetta a schiera")
    VILLETTA_A_SCHIERA("Villetta a schiera"),
    @XmlEnumValue("Loft")
    LOFT("Loft"),
    @XmlEnumValue("Open Space")
    OPEN_SPACE("Open Space"),
    @XmlEnumValue("Multipropriet\u00e0")
    MULTIPROPRIETA("Multipropriet\u00e0"),
    @XmlEnumValue("Villetta")
    VILLETTA("Villetta"),
    @XmlEnumValue("Agriturismo")
    AGRITURISMO("Agriturismo"),
    @XmlEnumValue("Bed and Breakfast")
    BED_AND_BREAKFAST("Bed and Breakfast"),
    @XmlEnumValue("Barca")
    BARCA("Barca"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("Chalet")
    CHALET("Chalet"),
    @XmlEnumValue("Baita")
    BAITA("Baita"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Parco Vacanze")
    PARCO_VACANZE("Parco Vacanze"),
    @XmlEnumValue("Residence")
    RESIDENCE("Residence"),
    @XmlEnumValue("Roulotte")
    ROULOTTE("Roulotte"),
    @XmlEnumValue("Stanza")
    STANZA("Stanza"),
    @XmlEnumValue("Camera")
    CAMERA("Camera"),
    @XmlEnumValue("Casa per ferie (gruppi)")
    CASA_PER_FERIE("Casa per ferie (gruppi)"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Altro")
    ALTRO("Altro");
    private final String value;

    SimplePropertyType(String v) {
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
    public static SimplePropertyType fromValue(String v) {
        for (SimplePropertyType c: SimplePropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
