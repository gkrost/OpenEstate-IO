package org.openestate.io.is24_xml.xml;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Akzeptierte Dateiformate von Bild-Attachments
 * 
 * <p>Java class for BildFormateTyp</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BildFormateTyp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JPG"/>
 *     <enumeration value="GIF"/>
 *     <enumeration value="PNG"/>
 *     <enumeration value="BMP"/>
 *     <enumeration value="WBMP"/>
 *     <enumeration value="JPEG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BildFormateTyp")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public enum BildFormateTyp {

    JPG,
    GIF,
    PNG,
    BMP,
    WBMP,
    JPEG;

    public String value() {
        return name();
    }

    public static BildFormateTyp fromValue(String v) {
        return valueOf(v);
    }

}
