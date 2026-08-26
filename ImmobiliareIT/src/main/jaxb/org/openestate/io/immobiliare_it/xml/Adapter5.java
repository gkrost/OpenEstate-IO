package org.openestate.io.immobiliare_it.xml;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, BigInteger>
{


    public BigInteger unmarshal(String value) {
        return (jakarta.xml.bind.DatatypeConverter.parseInteger(value));
    }

    public String marshal(BigInteger value) {
        if (value == null) {
            return null;
        }
        return (jakarta.xml.bind.DatatypeConverter.printInteger(value));
    }

}
