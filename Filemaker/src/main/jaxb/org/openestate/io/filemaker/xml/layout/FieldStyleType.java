package org.openestate.io.filemaker.xml.layout;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for FieldStyleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FieldStyleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="POPUPLIST"/>
 *     <enumeration value="POPUPMENU"/>
 *     <enumeration value="CHECKBOX"/>
 *     <enumeration value="RADIOBUTTONS"/>
 *     <enumeration value="SCROLLTEXT"/>
 *     <enumeration value="SELECTIONLIST"/>
 *     <enumeration value="EDITTEXT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FieldStyleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
public enum FieldStyleType {

    POPUPLIST,
    POPUPMENU,
    CHECKBOX,
    RADIOBUTTONS,
    SCROLLTEXT,
    SELECTIONLIST,
    EDITTEXT;

    public String value() {
        return name();
    }

    public static FieldStyleType fromValue(String v) {
        return valueOf(v);
    }

}
