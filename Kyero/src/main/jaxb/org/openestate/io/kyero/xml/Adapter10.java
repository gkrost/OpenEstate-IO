package org.openestate.io.kyero.xml;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.parseTypeDataType(value));
    }

    public String marshal(String value) {
        return (org.openestate.io.kyero.KyeroUtils.printTypeDataType(value));
    }

}
