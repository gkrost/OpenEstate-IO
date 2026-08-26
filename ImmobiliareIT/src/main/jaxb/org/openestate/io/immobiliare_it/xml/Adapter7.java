package org.openestate.io.immobiliare_it.xml;

import java.util.Calendar;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter7
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.parseDateUpdatedType(value));
    }

    public String marshal(Calendar value) {
        return (org.openestate.io.immobiliare_it.ImmobiliareItUtils.printDateUpdatedType(value));
    }

}
