
package org.openestate.io.openimmo.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Java enum for &lt;ausstatt_kategorie&gt; elements.

 */
@XmlType(name = "")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public enum AusstattKategorie {

    STANDARD,
    GEHOBEN,
    LUXUS;

    public String value() {
        return name();
    }

    public static AusstattKategorie fromValue(String v) {
        return valueOf(v);
    }

}