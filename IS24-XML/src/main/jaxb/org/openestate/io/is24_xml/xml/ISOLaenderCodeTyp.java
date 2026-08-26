package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Text, drei Zeichen, Enumeration der ISO-3-Letter-Codes
 * 
 * <p>Java class for ISOLaenderCodeTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ISOLaenderCodeTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="3"/>
 *     <whiteSpace value="collapse"/>
 *     <enumeration value="AFG"/>
 *     <enumeration value="ALB"/>
 *     <enumeration value="DZA"/>
 *     <enumeration value="ASM"/>
 *     <enumeration value="AND"/>
 *     <enumeration value="AGO"/>
 *     <enumeration value="AIA"/>
 *     <enumeration value="ATG"/>
 *     <enumeration value="ARG"/>
 *     <enumeration value="ARM"/>
 *     <enumeration value="ABW"/>
 *     <enumeration value="AUS"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="AZE"/>
 *     <enumeration value="BHS"/>
 *     <enumeration value="BHR"/>
 *     <enumeration value="BGD"/>
 *     <enumeration value="BRB"/>
 *     <enumeration value="BLR"/>
 *     <enumeration value="BEL"/>
 *     <enumeration value="BLZ"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="BMU"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="BOL"/>
 *     <enumeration value="BIH"/>
 *     <enumeration value="BWA"/>
 *     <enumeration value="BRA"/>
 *     <enumeration value="VGB"/>
 *     <enumeration value="BRN"/>
 *     <enumeration value="BGR"/>
 *     <enumeration value="BFA"/>
 *     <enumeration value="BDI"/>
 *     <enumeration value="KHM"/>
 *     <enumeration value="CMR"/>
 *     <enumeration value="CAN"/>
 *     <enumeration value="CPV"/>
 *     <enumeration value="CYM"/>
 *     <enumeration value="CAF"/>
 *     <enumeration value="TCD"/>
 *     <enumeration value="CHL"/>
 *     <enumeration value="CHN"/>
 *     <enumeration value="HKG"/>
 *     <enumeration value="MAC"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="COM"/>
 *     <enumeration value="COG"/>
 *     <enumeration value="COK"/>
 *     <enumeration value="CRI"/>
 *     <enumeration value="CIV"/>
 *     <enumeration value="HRV"/>
 *     <enumeration value="CUB"/>
 *     <enumeration value="CYP"/>
 *     <enumeration value="CZE"/>
 *     <enumeration value="PRK"/>
 *     <enumeration value="COD"/>
 *     <enumeration value="DNK"/>
 *     <enumeration value="DJI"/>
 *     <enumeration value="DMA"/>
 *     <enumeration value="DOM"/>
 *     <enumeration value="TMP"/>
 *     <enumeration value="ECU"/>
 *     <enumeration value="EGY"/>
 *     <enumeration value="SLV"/>
 *     <enumeration value="GNQ"/>
 *     <enumeration value="ERI"/>
 *     <enumeration value="EST"/>
 *     <enumeration value="ETH"/>
 *     <enumeration value="FRO"/>
 *     <enumeration value="FLK"/>
 *     <enumeration value="FJI"/>
 *     <enumeration value="FIN"/>
 *     <enumeration value="FRA"/>
 *     <enumeration value="GUF"/>
 *     <enumeration value="PYF"/>
 *     <enumeration value="GAB"/>
 *     <enumeration value="GMB"/>
 *     <enumeration value="GEO"/>
 *     <enumeration value="DEU"/>
 *     <enumeration value="GHA"/>
 *     <enumeration value="GIB"/>
 *     <enumeration value="GRC"/>
 *     <enumeration value="GRL"/>
 *     <enumeration value="GRD"/>
 *     <enumeration value="GLP"/>
 *     <enumeration value="GUM"/>
 *     <enumeration value="GTM"/>
 *     <enumeration value="GIN"/>
 *     <enumeration value="GNB"/>
 *     <enumeration value="GUY"/>
 *     <enumeration value="HTI"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="HND"/>
 *     <enumeration value="HUN"/>
 *     <enumeration value="ISL"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="IDN"/>
 *     <enumeration value="IRN"/>
 *     <enumeration value="IRQ"/>
 *     <enumeration value="IRL"/>
 *     <enumeration value="ISR"/>
 *     <enumeration value="ITA"/>
 *     <enumeration value="JAM"/>
 *     <enumeration value="JPN"/>
 *     <enumeration value="JOR"/>
 *     <enumeration value="KAZ"/>
 *     <enumeration value="KEN"/>
 *     <enumeration value="KIR"/>
 *     <enumeration value="KWT"/>
 *     <enumeration value="KGZ"/>
 *     <enumeration value="LAO"/>
 *     <enumeration value="LVA"/>
 *     <enumeration value="LBN"/>
 *     <enumeration value="LSO"/>
 *     <enumeration value="LBR"/>
 *     <enumeration value="LBY"/>
 *     <enumeration value="LIE"/>
 *     <enumeration value="LTU"/>
 *     <enumeration value="LUX"/>
 *     <enumeration value="MDG"/>
 *     <enumeration value="MWI"/>
 *     <enumeration value="MYS"/>
 *     <enumeration value="MDV"/>
 *     <enumeration value="MLI"/>
 *     <enumeration value="MLT"/>
 *     <enumeration value="MHL"/>
 *     <enumeration value="MTQ"/>
 *     <enumeration value="MRT"/>
 *     <enumeration value="MUS"/>
 *     <enumeration value="MEX"/>
 *     <enumeration value="FSM"/>
 *     <enumeration value="MCO"/>
 *     <enumeration value="MNG"/>
 *     <enumeration value="MSR"/>
 *     <enumeration value="MAR"/>
 *     <enumeration value="MOZ"/>
 *     <enumeration value="MMR"/>
 *     <enumeration value="NAM"/>
 *     <enumeration value="NRU"/>
 *     <enumeration value="NPL"/>
 *     <enumeration value="NLD"/>
 *     <enumeration value="ANT"/>
 *     <enumeration value="NCL"/>
 *     <enumeration value="NZL"/>
 *     <enumeration value="NIC"/>
 *     <enumeration value="NER"/>
 *     <enumeration value="NGA"/>
 *     <enumeration value="NIU"/>
 *     <enumeration value="NFK"/>
 *     <enumeration value="MNP"/>
 *     <enumeration value="NOR"/>
 *     <enumeration value="PSE"/>
 *     <enumeration value="OMN"/>
 *     <enumeration value="PAK"/>
 *     <enumeration value="PLW"/>
 *     <enumeration value="PAN"/>
 *     <enumeration value="PNG"/>
 *     <enumeration value="PRY"/>
 *     <enumeration value="PER"/>
 *     <enumeration value="PHL"/>
 *     <enumeration value="PCN"/>
 *     <enumeration value="POL"/>
 *     <enumeration value="PRT"/>
 *     <enumeration value="PRI"/>
 *     <enumeration value="QAT"/>
 *     <enumeration value="KOR"/>
 *     <enumeration value="MDA"/>
 *     <enumeration value="REU"/>
 *     <enumeration value="ROU"/>
 *     <enumeration value="RUS"/>
 *     <enumeration value="RWA"/>
 *     <enumeration value="SHN"/>
 *     <enumeration value="KNA"/>
 *     <enumeration value="LCA"/>
 *     <enumeration value="SPM"/>
 *     <enumeration value="VCT"/>
 *     <enumeration value="WSM"/>
 *     <enumeration value="SMR"/>
 *     <enumeration value="STP"/>
 *     <enumeration value="SAU"/>
 *     <enumeration value="SEN"/>
 *     <enumeration value="SYC"/>
 *     <enumeration value="SLE"/>
 *     <enumeration value="SGP"/>
 *     <enumeration value="SVK"/>
 *     <enumeration value="SVN"/>
 *     <enumeration value="SLB"/>
 *     <enumeration value="SOM"/>
 *     <enumeration value="ZAF"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="LKA"/>
 *     <enumeration value="SDN"/>
 *     <enumeration value="SUR"/>
 *     <enumeration value="SJM"/>
 *     <enumeration value="SWZ"/>
 *     <enumeration value="SWE"/>
 *     <enumeration value="CHE"/>
 *     <enumeration value="SYR"/>
 *     <enumeration value="TWN"/>
 *     <enumeration value="TJK"/>
 *     <enumeration value="THA"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="TGO"/>
 *     <enumeration value="TKL"/>
 *     <enumeration value="TON"/>
 *     <enumeration value="TTO"/>
 *     <enumeration value="TUN"/>
 *     <enumeration value="TUR"/>
 *     <enumeration value="TKM"/>
 *     <enumeration value="TCA"/>
 *     <enumeration value="TUV"/>
 *     <enumeration value="UGA"/>
 *     <enumeration value="UKR"/>
 *     <enumeration value="ARE"/>
 *     <enumeration value="GBR"/>
 *     <enumeration value="TZA"/>
 *     <enumeration value="USA"/>
 *     <enumeration value="VIR"/>
 *     <enumeration value="URY"/>
 *     <enumeration value="UZB"/>
 *     <enumeration value="VUT"/>
 *     <enumeration value="VEN"/>
 *     <enumeration value="VNM"/>
 *     <enumeration value="WLF"/>
 *     <enumeration value="ESH"/>
 *     <enumeration value="YEM"/>
 *     <enumeration value="SCG"/>
 *     <enumeration value="ZMB"/>
 *     <enumeration value="ZWE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ISOLaenderCodeTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum ISOLaenderCodeTyp {

    AFG,
    ALB,
    DZA,
    ASM,
    AND,
    AGO,
    AIA,
    ATG,
    ARG,
    ARM,
    ABW,
    AUS,
    AUT,
    AZE,
    BHS,
    BHR,
    BGD,
    BRB,
    BLR,
    BEL,
    BLZ,
    BEN,
    BMU,
    BTN,
    BOL,
    BIH,
    BWA,
    BRA,
    VGB,
    BRN,
    BGR,
    BFA,
    BDI,
    KHM,
    CMR,
    CAN,
    CPV,
    CYM,
    CAF,
    TCD,
    CHL,
    CHN,
    HKG,
    MAC,
    COL,
    COM,
    COG,
    COK,
    CRI,
    CIV,
    HRV,
    CUB,
    CYP,
    CZE,
    PRK,
    COD,
    DNK,
    DJI,
    DMA,
    DOM,
    TMP,
    ECU,
    EGY,
    SLV,
    GNQ,
    ERI,
    EST,
    ETH,
    FRO,
    FLK,
    FJI,
    FIN,
    FRA,
    GUF,
    PYF,
    GAB,
    GMB,
    GEO,
    DEU,
    GHA,
    GIB,
    GRC,
    GRL,
    GRD,
    GLP,
    GUM,
    GTM,
    GIN,
    GNB,
    GUY,
    HTI,
    VAT,
    HND,
    HUN,
    ISL,
    IND,
    IDN,
    IRN,
    IRQ,
    IRL,
    ISR,
    ITA,
    JAM,
    JPN,
    JOR,
    KAZ,
    KEN,
    KIR,
    KWT,
    KGZ,
    LAO,
    LVA,
    LBN,
    LSO,
    LBR,
    LBY,
    LIE,
    LTU,
    LUX,
    MDG,
    MWI,
    MYS,
    MDV,
    MLI,
    MLT,
    MHL,
    MTQ,
    MRT,
    MUS,
    MEX,
    FSM,
    MCO,
    MNG,
    MSR,
    MAR,
    MOZ,
    MMR,
    NAM,
    NRU,
    NPL,
    NLD,
    ANT,
    NCL,
    NZL,
    NIC,
    NER,
    NGA,
    NIU,
    NFK,
    MNP,
    NOR,
    PSE,
    OMN,
    PAK,
    PLW,
    PAN,
    PNG,
    PRY,
    PER,
    PHL,
    PCN,
    POL,
    PRT,
    PRI,
    QAT,
    KOR,
    MDA,
    REU,
    ROU,
    RUS,
    RWA,
    SHN,
    KNA,
    LCA,
    SPM,
    VCT,
    WSM,
    SMR,
    STP,
    SAU,
    SEN,
    SYC,
    SLE,
    SGP,
    SVK,
    SVN,
    SLB,
    SOM,
    ZAF,
    ESP,
    LKA,
    SDN,
    SUR,
    SJM,
    SWZ,
    SWE,
    CHE,
    SYR,
    TWN,
    TJK,
    THA,
    MKD,
    TGO,
    TKL,
    TON,
    TTO,
    TUN,
    TUR,
    TKM,
    TCA,
    TUV,
    UGA,
    UKR,
    ARE,
    GBR,
    TZA,
    USA,
    VIR,
    URY,
    UZB,
    VUT,
    VEN,
    VNM,
    WLF,
    ESH,
    YEM,
    SCG,
    ZMB,
    ZWE;

    public String value() {
        return name();
    }

    public static ISOLaenderCodeTyp fromValue(String v) {
        return valueOf(v);
    }

}
