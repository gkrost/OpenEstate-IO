package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedSizeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="detailedSizeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Abitazione"/>
 *     <enumeration value="Ufficio"/>
 *     <enumeration value="Studio"/>
 *     <enumeration value="Negozio"/>
 *     <enumeration value="Magazzino"/>
 *     <enumeration value="Garage"/>
 *     <enumeration value="Cantina"/>
 *     <enumeration value="Soffitta"/>
 *     <enumeration value="Balcone"/>
 *     <enumeration value="Terrazzo"/>
 *     <enumeration value="Giardino"/>
 *     <enumeration value="Terreno"/>
 *     <enumeration value="Parti comuni"/>
 *     <enumeration value="Altro"/>
 *     <enumeration value="Mansarda"/>
 *     <enumeration value="Capannone"/>
 *     <enumeration value="Laboratorio"/>
 *     <enumeration value="Posti auto"/>
 *     <enumeration value="Soppalco"/>
 *     <enumeration value="Esterno"/>
 *     <enumeration value="Parcheggio"/>
 *     <enumeration value="Albergo/hotel"/>
 *     <enumeration value="Posto moto"/>
 *     <enumeration value="Posto barca"/>
 *     <enumeration value="Posto camper o roulotte"/>
 *     <enumeration value="Autorimessa"/>
 *     <enumeration value="Centralina"/>
 *     <enumeration value="Podere o tenuta"/>
 *     <enumeration value="Filiale bancaria"/>
 *     <enumeration value="Scuderia"/>
 *     <enumeration value="Casa di cura"/>
 *     <enumeration value="Stabilimento balneare"/>
 *     <enumeration value="Azienda agricola"/>
 *     <enumeration value="Impianti sportivi"/>
 *     <enumeration value="Stazione di servizio"/>
 *     <enumeration value="Autorimessa"/>
 *     <enumeration value="Autolavaggio"/>
 *     <enumeration value="Impianti sportivi"/>
 *     <enumeration value="Stabilimento balneare"/>
 *     <enumeration value="Campeggio"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "detailedSizeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum DetailedSizeType {

    @XmlEnumValue("Abitazione")
    ABITAZIONE("Abitazione"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Studio")
    STUDIO("Studio"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Cantina")
    CANTINA("Cantina"),
    @XmlEnumValue("Soffitta")
    SOFFITTA("Soffitta"),
    @XmlEnumValue("Balcone")
    BALCONE("Balcone"),
    @XmlEnumValue("Terrazzo")
    TERRAZZO("Terrazzo"),
    @XmlEnumValue("Giardino")
    GIARDINO("Giardino"),
    @XmlEnumValue("Terreno")
    TERRENO("Terreno"),
    @XmlEnumValue("Parti comuni")
    PARTI_COMUNI("Parti comuni"),
    @XmlEnumValue("Altro")
    ALTRO("Altro"),
    @XmlEnumValue("Mansarda")
    MANSARDA("Mansarda"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Laboratorio")
    LABORATORIO("Laboratorio"),
    @XmlEnumValue("Posti auto")
    POSTI_AUTO("Posti auto"),
    @XmlEnumValue("Soppalco")
    SOPPALCO("Soppalco"),
    @XmlEnumValue("Esterno")
    ESTERNO("Esterno"),
    @XmlEnumValue("Parcheggio")
    PARCHEGGIO("Parcheggio"),
    @XmlEnumValue("Albergo/hotel")
    ALBERGO_HOTEL("Albergo/hotel"),
    @XmlEnumValue("Posto moto")
    POSTO_MOTO("Posto moto"),
    @XmlEnumValue("Posto barca")
    POSTO_BARCA("Posto barca"),
    @XmlEnumValue("Posto camper o roulotte")
    POSTO_CAMPER_O_ROULOTTE("Posto camper o roulotte"),
    @XmlEnumValue("Autorimessa")
    AUTORIMESSA("Autorimessa"),
    @XmlEnumValue("Centralina")
    CENTRALINA("Centralina"),
    @XmlEnumValue("Podere o tenuta")
    PODERE_O_TENUTA("Podere o tenuta"),
    @XmlEnumValue("Filiale bancaria")
    FILIALE_BANCARIA("Filiale bancaria"),
    @XmlEnumValue("Scuderia")
    SCUDERIA("Scuderia"),
    @XmlEnumValue("Casa di cura")
    CASA_DI_CURA("Casa di cura"),
    @XmlEnumValue("Stabilimento balneare")
    STABILIMENTO_BALNEARE("Stabilimento balneare"),
    @XmlEnumValue("Azienda agricola")
    AZIENDA_AGRICOLA("Azienda agricola"),
    @XmlEnumValue("Impianti sportivi")
    IMPIANTI_SPORTIVI("Impianti sportivi"),
    @XmlEnumValue("Stazione di servizio")
    STAZIONE_DI_SERVIZIO("Stazione di servizio"),
    @XmlEnumValue("Autolavaggio")
    AUTOLAVAGGIO("Autolavaggio"),
    @XmlEnumValue("Campeggio")
    CAMPEGGIO("Campeggio");
    private final String value;

    DetailedSizeType(String v) {
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
    public static DetailedSizeType fromValue(String v) {
        for (DetailedSizeType c: DetailedSizeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
