package org.openestate.io.kyero.xml;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseBoolType(value));
    }

    public String marshal(Boolean value) {
        return (org.openestate.io.kyero.KyeroUtils.printBoolType(value));
    }

}
