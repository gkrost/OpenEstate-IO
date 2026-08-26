package org.openestate.io.immobiliare_it.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyTypeBusiness</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PropertyTypeBusiness">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Centro commerciale"/>
 *     <enumeration value="Azienda agricola"/>
 *     <enumeration value="Ristorante"/>
 *     <enumeration value="Bar"/>
 *     <enumeration value="Pizzeria"/>
 *     <enumeration value="Pizza Al Taglio"/>
 *     <enumeration value="Pub"/>
 *     <enumeration value="Alimentari"/>
 *     <enumeration value="Rosticceria"/>
 *     <enumeration value="Pasticceria"/>
 *     <enumeration value="Discoteca"/>
 *     <enumeration value="Hotel"/>
 *     <enumeration value="Bed and Breakfast"/>
 *     <enumeration value="Pensione"/>
 *     <enumeration value="Gelateria"/>
 *     <enumeration value="Panetteria"/>
 *     <enumeration value="Altro | Alimentare"/>
 *     <enumeration value="Negozio"/>
 *     <enumeration value="Ferramenta"/>
 *     <enumeration value="Casalinghi"/>
 *     <enumeration value="Palestra"/>
 *     <enumeration value="Abbigliamento"/>
 *     <enumeration value="Estetica / Solarium"/>
 *     <enumeration value="Parrucchiere uomo/donna"/>
 *     <enumeration value="Auto officina"/>
 *     <enumeration value="Videonoleggio"/>
 *     <enumeration value="Tabaccheria"/>
 *     <enumeration value="Tintoria"/>
 *     <enumeration value="Lavanderia"/>
 *     <enumeration value="Cartoleria"/>
 *     <enumeration value="Libreria"/>
 *     <enumeration value="Informatica"/>
 *     <enumeration value="Telefonia"/>
 *     <enumeration value="Edicola"/>
 *     <enumeration value="Altro | Non alimentare"/>
 *     <enumeration value="Giochi"/>
 *     <enumeration value="Scommesse"/>
 *     <enumeration value="Edificabile residenziale"/>
 *     <enumeration value="Edificabile commerciale"/>
 *     <enumeration value="Edificabile industriale"/>
 *     <enumeration value="Agricolo"/>
 *     <enumeration value="Capannone"/>
 *     <enumeration value="Azienda Agricola"/>
 *     <enumeration value="Garage"/>
 *     <enumeration value="Negozio"/>
 *     <enumeration value="Ufficio"/>
 *     <enumeration value="Stabile"/>
 *     <enumeration value="Capannone Industriale"/>
 *     <enumeration value="Casa di cura"/>
 *     <enumeration value="Magazzino"/>
 *     <enumeration value="Showroom"/>
 *     <enumeration value="Scuderia"/>
 *     <enumeration value="Stabilimento Balneare"/>
 *     <enumeration value="Laboratorio"/>
 *     <enumeration value="Albergo"/>
 *     <enumeration value="Altro"/>
 *     <enumeration value="Agriturismo"/>
 *     <enumeration value="Filiale bancaria"/>
 *     <enumeration value="Consorzio agrario"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PropertyTypeBusiness")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public enum BusinessPropertyType {

    @XmlEnumValue("Centro commerciale")
    CENTRO_COMMERCIALE("Centro commerciale"),
    @XmlEnumValue("Azienda agricola")
    AZIENDA_AGRICOLA("Azienda agricola"),
    @XmlEnumValue("Ristorante")
    RISTORANTE("Ristorante"),
    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("Pizzeria")
    PIZZERIA("Pizzeria"),
    @XmlEnumValue("Pizza Al Taglio")
    PIZZA_AL_TAGLIO("Pizza Al Taglio"),
    @XmlEnumValue("Pub")
    PUB("Pub"),
    @XmlEnumValue("Alimentari")
    ALIMENTARI("Alimentari"),
    @XmlEnumValue("Rosticceria")
    ROSTICCERIA("Rosticceria"),
    @XmlEnumValue("Pasticceria")
    PASTICCERIA("Pasticceria"),
    @XmlEnumValue("Discoteca")
    DISCOTECA("Discoteca"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Bed and Breakfast")
    BED_AND_BREAKFAST("Bed and Breakfast"),
    @XmlEnumValue("Pensione")
    PENSIONE("Pensione"),
    @XmlEnumValue("Gelateria")
    GELATERIA("Gelateria"),
    @XmlEnumValue("Panetteria")
    PANETTERIA("Panetteria"),
    @XmlEnumValue("Altro | Alimentare")
    ALTRO_ALIMENTARE("Altro | Alimentare"),
    @XmlEnumValue("Negozio")
    NEGOZIO("Negozio"),
    @XmlEnumValue("Ferramenta")
    FERRAMENTA("Ferramenta"),
    @XmlEnumValue("Casalinghi")
    CASALINGHI("Casalinghi"),
    @XmlEnumValue("Palestra")
    PALESTRA("Palestra"),
    @XmlEnumValue("Abbigliamento")
    ABBIGLIAMENTO("Abbigliamento"),
    @XmlEnumValue("Estetica / Solarium")
    ESTETICA_SOLARIUM("Estetica / Solarium"),
    @XmlEnumValue("Parrucchiere uomo/donna")
    PARRUCCHIERE_UOMO_DONNA("Parrucchiere uomo/donna"),
    @XmlEnumValue("Auto officina")
    AUTO_OFFICINA("Auto officina"),
    @XmlEnumValue("Videonoleggio")
    VIDEONOLEGGIO("Videonoleggio"),
    @XmlEnumValue("Tabaccheria")
    TABACCHERIA("Tabaccheria"),
    @XmlEnumValue("Tintoria")
    TINTORIA("Tintoria"),
    @XmlEnumValue("Lavanderia")
    LAVANDERIA("Lavanderia"),
    @XmlEnumValue("Cartoleria")
    CARTOLERIA("Cartoleria"),
    @XmlEnumValue("Libreria")
    LIBRERIA("Libreria"),
    @XmlEnumValue("Informatica")
    INFORMATICA("Informatica"),
    @XmlEnumValue("Telefonia")
    TELEFONIA("Telefonia"),
    @XmlEnumValue("Edicola")
    EDICOLA("Edicola"),
    @XmlEnumValue("Altro | Non alimentare")
    ALTRO_NON_ALIMENTARE("Altro | Non alimentare"),
    @XmlEnumValue("Giochi")
    GIOCHI("Giochi"),
    @XmlEnumValue("Scommesse")
    SCOMMESSE("Scommesse"),
    @XmlEnumValue("Edificabile residenziale")
    EDIFICABILE_RESIDENZIALE("Edificabile residenziale"),
    @XmlEnumValue("Edificabile commerciale")
    EDIFICABILE_COMMERCIALE("Edificabile commerciale"),
    @XmlEnumValue("Edificabile industriale")
    EDIFICABILE_INDUSTRIALE("Edificabile industriale"),
    @XmlEnumValue("Agricolo")
    AGRICOLO("Agricolo"),
    @XmlEnumValue("Capannone")
    CAPANNONE("Capannone"),
    @XmlEnumValue("Azienda Agricola")
    AZIENDA_AGRICOLA2("Azienda Agricola"),
    @XmlEnumValue("Garage")
    GARAGE("Garage"),
    @XmlEnumValue("Ufficio")
    UFFICIO("Ufficio"),
    @XmlEnumValue("Stabile")
    STABILE("Stabile"),
    @XmlEnumValue("Capannone Industriale")
    CAPANNONE_INDUSTRIALE("Capannone Industriale"),
    @XmlEnumValue("Casa di cura")
    CASA_DI_CURA("Casa di cura"),
    @XmlEnumValue("Magazzino")
    MAGAZZINO("Magazzino"),
    @XmlEnumValue("Showroom")
    SHOWROOM("Showroom"),
    @XmlEnumValue("Scuderia")
    SCUDERIA("Scuderia"),
    @XmlEnumValue("Stabilimento Balneare")
    STABILIMENTO_BALNEARE("Stabilimento Balneare"),
    @XmlEnumValue("Laboratorio")
    LABORATORIO("Laboratorio"),
    @XmlEnumValue("Albergo")
    ALBERGO("Albergo"),
    @XmlEnumValue("Altro")
    ALTRO("Altro"),
    @XmlEnumValue("Agriturismo")
    AGRITURISMO("Agriturismo"),
    @XmlEnumValue("Filiale bancaria")
    FILIALE_BANCARIA("Filiale bancaria"),
    @XmlEnumValue("Consorzio agrario")
    CONSORZIO_AGRARIO("Consorzio agrario");
    private final String value;

    BusinessPropertyType(String v) {
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
    public static BusinessPropertyType fromValue(String v) {
        for (BusinessPropertyType c: BusinessPropertyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
