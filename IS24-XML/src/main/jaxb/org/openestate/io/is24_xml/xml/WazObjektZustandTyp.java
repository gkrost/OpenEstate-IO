package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Objektzustaende-Enumeration fuer WAZ
 * 
 * <p>Java class for WazObjektZustandTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WazObjektZustandTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unbekannt"/>
 *     <enumeration value="Erstbezug"/>
 *     <enumeration value="Neuwertig"/>
 *     <enumeration value="VollstaendigRenoviert"/>
 *     <enumeration value="Renovierungsbeduerftig"/>
 *     <enumeration value="Modernisiert"/>
 *     <enumeration value="NachVereinbarung"/>
 *     <enumeration value="Gepflegt"/>
 *     <enumeration value="ErstbezugNachSanierung"/>
 *     <enumeration value="Saniert"/>
 *     <enumeration value="Unrenoviert"/>
 *     <enumeration value="Abbruchreif"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WazObjektZustandTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum WazObjektZustandTyp {

    @XmlEnumValue("Unbekannt")
    UNBEKANNT("Unbekannt"),
    @XmlEnumValue("Erstbezug")
    ERSTBEZUG("Erstbezug"),
    @XmlEnumValue("Neuwertig")
    NEUWERTIG("Neuwertig"),
    @XmlEnumValue("VollstaendigRenoviert")
    VOLLSTAENDIG_RENOVIERT("VollstaendigRenoviert"),
    @XmlEnumValue("Renovierungsbeduerftig")
    RENOVIERUNGSBEDUERFTIG("Renovierungsbeduerftig"),
    @XmlEnumValue("Modernisiert")
    MODERNISIERT("Modernisiert"),
    @XmlEnumValue("NachVereinbarung")
    NACH_VEREINBARUNG("NachVereinbarung"),
    @XmlEnumValue("Gepflegt")
    GEPFLEGT("Gepflegt"),
    @XmlEnumValue("ErstbezugNachSanierung")
    ERSTBEZUG_NACH_SANIERUNG("ErstbezugNachSanierung"),
    @XmlEnumValue("Saniert")
    SANIERT("Saniert"),

    /**
     * Nicht weiter unterstuetzt: Zu ersetzen durch Renovierungsbeduerftig
     * 
     */
    @XmlEnumValue("Unrenoviert")
    UNRENOVIERT("Unrenoviert"),
    @XmlEnumValue("Abbruchreif")
    ABBRUCHREIF("Abbruchreif");
    private final String value;

    WazObjektZustandTyp(String v) {
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
    public static WazObjektZustandTyp fromValue(String v) {
        for (WazObjektZustandTyp c: WazObjektZustandTyp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
