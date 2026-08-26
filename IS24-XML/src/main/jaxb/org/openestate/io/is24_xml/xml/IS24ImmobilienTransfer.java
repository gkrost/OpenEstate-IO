package org.openestate.io.is24_xml.xml;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;

public class IS24ImmobilienTransfer
    extends JAXBElement<ImmobilienTransferTyp>
{

    protected static final QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "IS24ImmobilienTransfer");

    public IS24ImmobilienTransfer(ImmobilienTransferTyp value) {
        super(NAME, ((Class<ImmobilienTransferTyp> ) ImmobilienTransferTyp.class), null, value);
    }

    public IS24ImmobilienTransfer() {
        super(NAME, ((Class<ImmobilienTransferTyp> ) ImmobilienTransferTyp.class), null, null);
    }

}
