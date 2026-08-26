package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Text, drei Zeichen, Enumeration einiger ISO-Waehrungscodes
 * 
 * <p>Java class for WaehrungTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WaehrungTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <length value="3"/>
 *     <enumeration value="AED"/>
 *     <enumeration value="AFA"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="AMD"/>
 *     <enumeration value="ANG"/>
 *     <enumeration value="AON"/>
 *     <enumeration value="ARP"/>
 *     <enumeration value="ATS"/>
 *     <enumeration value="AUD"/>
 *     <enumeration value="AWF"/>
 *     <enumeration value="AZM"/>
 *     <enumeration value="BAK"/>
 *     <enumeration value="BBD"/>
 *     <enumeration value="BDT"/>
 *     <enumeration value="BEF"/>
 *     <enumeration value="BGL"/>
 *     <enumeration value="BHD"/>
 *     <enumeration value="BIF"/>
 *     <enumeration value="BMD"/>
 *     <enumeration value="BND"/>
 *     <enumeration value="BOB"/>
 *     <enumeration value="BRL"/>
 *     <enumeration value="BSD"/>
 *     <enumeration value="BTR"/>
 *     <enumeration value="BWP"/>
 *     <enumeration value="BYR"/>
 *     <enumeration value="BZD"/>
 *     <enumeration value="CAD"/>
 *     <enumeration value="CDF"/>
 *     <enumeration value="CHF"/>
 *     <enumeration value="CLP"/>
 *     <enumeration value="CNY"/>
 *     <enumeration value="COP"/>
 *     <enumeration value="CRC"/>
 *     <enumeration value="CZK"/>
 *     <enumeration value="CUP"/>
 *     <enumeration value="CVE"/>
 *     <enumeration value="CYP"/>
 *     <enumeration value="DEM"/>
 *     <enumeration value="DJF"/>
 *     <enumeration value="DKK"/>
 *     <enumeration value="DOP"/>
 *     <enumeration value="DZD"/>
 *     <enumeration value="ECS"/>
 *     <enumeration value="EEK"/>
 *     <enumeration value="EGP"/>
 *     <enumeration value="ERN"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="ETB"/>
 *     <enumeration value="EUR"/>
 *     <enumeration value="FIM"/>
 *     <enumeration value="FJD"/>
 *     <enumeration value="FKP"/>
 *     <enumeration value="FRF"/>
 *     <enumeration value="GBP"/>
 *     <enumeration value="GEL"/>
 *     <enumeration value="GHC"/>
 *     <enumeration value="GIP"/>
 *     <enumeration value="GMD"/>
 *     <enumeration value="GNF"/>
 *     <enumeration value="GRD"/>
 *     <enumeration value="GTQ"/>
 *     <enumeration value="GYD"/>
 *     <enumeration value="HKD"/>
 *     <enumeration value="HNL"/>
 *     <enumeration value="HRK"/>
 *     <enumeration value="HTG"/>
 *     <enumeration value="HUF"/>
 *     <enumeration value="IDR"/>
 *     <enumeration value="IEP"/>
 *     <enumeration value="IEP"/>
 *     <enumeration value="ILS"/>
 *     <enumeration value="INR"/>
 *     <enumeration value="IQD"/>
 *     <enumeration value="IRR"/>
 *     <enumeration value="ISK"/>
 *     <enumeration value="ITL"/>
 *     <enumeration value="JMD"/>
 *     <enumeration value="JOD"/>
 *     <enumeration value="JPY"/>
 *     <enumeration value="KES"/>
 *     <enumeration value="KGS"/>
 *     <enumeration value="KHR"/>
 *     <enumeration value="KMF"/>
 *     <enumeration value="KPW"/>
 *     <enumeration value="KRW"/>
 *     <enumeration value="KWD"/>
 *     <enumeration value="KYD"/>
 *     <enumeration value="KZT"/>
 *     <enumeration value="LAK"/>
 *     <enumeration value="LBP"/>
 *     <enumeration value="LKR"/>
 *     <enumeration value="LRD"/>
 *     <enumeration value="LSL"/>
 *     <enumeration value="LTL"/>
 *     <enumeration value="LUF"/>
 *     <enumeration value="LVL"/>
 *     <enumeration value="LYD"/>
 *     <enumeration value="MAD"/>
 *     <enumeration value="MDL"/>
 *     <enumeration value="MGF"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MMK"/>
 *     <enumeration value="MNT"/>
 *     <enumeration value="MOP"/>
 *     <enumeration value="MRO"/>
 *     <enumeration value="MTL"/>
 *     <enumeration value="MUR"/>
 *     <enumeration value="MVR"/>
 *     <enumeration value="MWK"/>
 *     <enumeration value="MXP"/>
 *     <enumeration value="MYR"/>
 *     <enumeration value="MZM"/>
 *     <enumeration value="NAD"/>
 *     <enumeration value="NGN"/>
 *     <enumeration value="NIO"/>
 *     <enumeration value="NLG"/>
 *     <enumeration value="NOK"/>
 *     <enumeration value="NPR"/>
 *     <enumeration value="NZD"/>
 *     <enumeration value="OMR"/>
 *     <enumeration value="PAB"/>
 *     <enumeration value="PEN"/>
 *     <enumeration value="PGK"/>
 *     <enumeration value="PHP"/>
 *     <enumeration value="PKR"/>
 *     <enumeration value="PLZ"/>
 *     <enumeration value="PTE"/>
 *     <enumeration value="PYG"/>
 *     <enumeration value="QAR"/>
 *     <enumeration value="ROL"/>
 *     <enumeration value="RUR"/>
 *     <enumeration value="RWF"/>
 *     <enumeration value="SAR"/>
 *     <enumeration value="SBD"/>
 *     <enumeration value="SBL"/>
 *     <enumeration value="SCR"/>
 *     <enumeration value="SDD"/>
 *     <enumeration value="SEK"/>
 *     <enumeration value="SGD"/>
 *     <enumeration value="SHP"/>
 *     <enumeration value="SIT"/>
 *     <enumeration value="SKK"/>
 *     <enumeration value="SLL"/>
 *     <enumeration value="SOS"/>
 *     <enumeration value="SRG"/>
 *     <enumeration value="STD"/>
 *     <enumeration value="SVC"/>
 *     <enumeration value="SYP"/>
 *     <enumeration value="SZL"/>
 *     <enumeration value="THB"/>
 *     <enumeration value="TJR"/>
 *     <enumeration value="TMM"/>
 *     <enumeration value="TND"/>
 *     <enumeration value="TOP"/>
 *     <enumeration value="TRL"/>
 *     <enumeration value="TTD"/>
 *     <enumeration value="TWD"/>
 *     <enumeration value="TZS"/>
 *     <enumeration value="UAH"/>
 *     <enumeration value="UGX"/>
 *     <enumeration value="USD"/>
 *     <enumeration value="UYU"/>
 *     <enumeration value="UZS"/>
 *     <enumeration value="VEB"/>
 *     <enumeration value="VND"/>
 *     <enumeration value="VUV"/>
 *     <enumeration value="WST"/>
 *     <enumeration value="XAF"/>
 *     <enumeration value="XAG"/>
 *     <enumeration value="XAU"/>
 *     <enumeration value="XCD"/>
 *     <enumeration value="XCO"/>
 *     <enumeration value="XDR"/>
 *     <enumeration value="XPD"/>
 *     <enumeration value="XPF"/>
 *     <enumeration value="XPT"/>
 *     <enumeration value="YER"/>
 *     <enumeration value="YUM"/>
 *     <enumeration value="ZAR"/>
 *     <enumeration value="ZMK"/>
 *     <enumeration value="ZWD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WaehrungTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum WaehrungTyp {

    AED,
    AFA,
    ALL,
    AMD,
    ANG,
    AON,
    ARP,
    ATS,
    AUD,
    AWF,
    AZM,
    BAK,
    BBD,
    BDT,
    BEF,
    BGL,
    BHD,
    BIF,
    BMD,
    BND,
    BOB,
    BRL,
    BSD,
    BTR,
    BWP,
    BYR,
    BZD,
    CAD,
    CDF,
    CHF,
    CLP,
    CNY,
    COP,
    CRC,
    CZK,
    CUP,
    CVE,
    CYP,
    DEM,
    DJF,
    DKK,
    DOP,
    DZD,
    ECS,
    EEK,
    EGP,
    ERN,
    ESP,
    ETB,
    EUR,
    FIM,
    FJD,
    FKP,
    FRF,
    GBP,
    GEL,
    GHC,
    GIP,
    GMD,
    GNF,
    GRD,
    GTQ,
    GYD,
    HKD,
    HNL,
    HRK,
    HTG,
    HUF,
    IDR,
    IEP,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    ITL,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KHR,
    KMF,
    KPW,
    KRW,
    KWD,
    KYD,
    KZT,
    LAK,
    LBP,
    LKR,
    LRD,
    LSL,
    LTL,
    LUF,
    LVL,
    LYD,
    MAD,
    MDL,
    MGF,
    MKD,
    MMK,
    MNT,
    MOP,
    MRO,
    MTL,
    MUR,
    MVR,
    MWK,
    MXP,
    MYR,
    MZM,
    NAD,
    NGN,
    NIO,
    NLG,
    NOK,
    NPR,
    NZD,
    OMR,
    PAB,
    PEN,
    PGK,
    PHP,
    PKR,
    PLZ,
    PTE,
    PYG,
    QAR,
    ROL,
    RUR,
    RWF,
    SAR,
    SBD,
    SBL,
    SCR,
    SDD,
    SEK,
    SGD,
    SHP,
    SIT,
    SKK,
    SLL,
    SOS,
    SRG,
    STD,
    SVC,
    SYP,
    SZL,
    THB,
    TJR,
    TMM,
    TND,
    TOP,
    TRL,
    TTD,
    TWD,
    TZS,
    UAH,
    UGX,
    USD,
    UYU,
    UZS,
    VEB,
    VND,
    VUV,
    WST,
    XAF,
    XAG,
    XAU,
    XCD,
    XCO,
    XDR,
    XPD,
    XPF,
    XPT,
    YER,
    YUM,
    ZAR,
    ZMK,
    ZWD;

    public String value() {
        return name();
    }

    public static WaehrungTyp fromValue(String v) {
        return valueOf(v);
    }

}
