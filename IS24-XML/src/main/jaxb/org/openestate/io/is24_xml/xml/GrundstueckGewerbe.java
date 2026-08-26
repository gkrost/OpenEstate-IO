package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.Equals;
import org.jvnet.jaxb.lang.EqualsStrategy;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb.lang.JAXBToStringStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;

public class GrundstueckGewerbe
    extends JAXBElement<GrundstueckGewerbe.Type>
{

    protected static final QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GrundstueckGewerbe");

    public GrundstueckGewerbe(GrundstueckGewerbe.Type value) {
        super(NAME, ((Class<GrundstueckGewerbe.Type> ) GrundstueckGewerbe.Type.class), null, value);
    }

    public GrundstueckGewerbe() {
        super(NAME, ((Class<GrundstueckGewerbe.Type> ) GrundstueckGewerbe.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckTypBase">
     *       <sequence>
     *         <element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGrundstueckGewerbeTyp"/>
     *         <element name="BebaubarMit" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckGewerbeEmpfohleneNutzung" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckGewerbeKategorienTyp" default="Gewerbe" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vermarktung",
        "bebaubarMit"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Type
        extends GrundstueckTypBase
        implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Vermarktung", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected VermarktungGrundstueckGewerbeTyp vermarktung;
        @XmlElement(name = "BebaubarMit")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected GrundstueckGewerbeEmpfohleneNutzung bebaubarMit;
        @XmlAttribute(name = "Objektkategorie2")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected GrundstueckGewerbeKategorienTyp objektkategorie2;

        /**
         * Gets the value of the vermarktung property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGrundstueckGewerbeTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public VermarktungGrundstueckGewerbeTyp getVermarktung() {
            return vermarktung;
        }

        /**
         * Sets the value of the vermarktung property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGrundstueckGewerbeTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setVermarktung(VermarktungGrundstueckGewerbeTyp value) {
            this.vermarktung = value;
        }

        /**
         * Gets the value of the bebaubarMit property.
         * 
         * @return
         *     possible object is
         *     {@link GrundstueckGewerbeEmpfohleneNutzung }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public GrundstueckGewerbeEmpfohleneNutzung getBebaubarMit() {
            return bebaubarMit;
        }

        /**
         * Sets the value of the bebaubarMit property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrundstueckGewerbeEmpfohleneNutzung }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setBebaubarMit(GrundstueckGewerbeEmpfohleneNutzung value) {
            this.bebaubarMit = value;
        }

        /**
         * Gets the value of the objektkategorie2 property.
         * 
         * @return
         *     possible object is
         *     {@link GrundstueckGewerbeKategorienTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public GrundstueckGewerbeKategorienTyp getObjektkategorie2() {
            if (objektkategorie2 == null) {
                return GrundstueckGewerbeKategorienTyp.GEWERBE;
            } else {
                return objektkategorie2;
            }
        }

        /**
         * Sets the value of the objektkategorie2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrundstueckGewerbeKategorienTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setObjektkategorie2(GrundstueckGewerbeKategorienTyp value) {
            this.objektkategorie2 = value;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGrundstueckGewerbeTyp theVermarktung;
                theVermarktung = this.getVermarktung();
                strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
            }
            {
                GrundstueckGewerbeEmpfohleneNutzung theBebaubarMit;
                theBebaubarMit = this.getBebaubarMit();
                strategy.appendField(locator, this, "bebaubarMit", buffer, theBebaubarMit, (this.bebaubarMit!= null));
            }
            {
                GrundstueckGewerbeKategorienTyp theObjektkategorie2;
                theObjektkategorie2 = this.getObjektkategorie2();
                strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
            }
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
            return copyTo(null, target, strategy);
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GrundstueckGewerbe.Type) {
                final GrundstueckGewerbe.Type copy = ((GrundstueckGewerbe.Type) draftCopy);
                {
                    Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                    if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGrundstueckGewerbeTyp sourceVermarktung;
                        sourceVermarktung = this.getVermarktung();
                        VermarktungGrundstueckGewerbeTyp copyVermarktung = ((VermarktungGrundstueckGewerbeTyp) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
                        copy.setVermarktung(copyVermarktung);
                    } else {
                        if (vermarktungShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.vermarktung = null;
                        }
                    }
                }
                {
                    Boolean bebaubarMitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bebaubarMit!= null));
                    if (bebaubarMitShouldBeCopiedAndSet == Boolean.TRUE) {
                        GrundstueckGewerbeEmpfohleneNutzung sourceBebaubarMit;
                        sourceBebaubarMit = this.getBebaubarMit();
                        GrundstueckGewerbeEmpfohleneNutzung copyBebaubarMit = ((GrundstueckGewerbeEmpfohleneNutzung) strategy.copy(LocatorUtils.property(locator, "bebaubarMit", sourceBebaubarMit), sourceBebaubarMit, (this.bebaubarMit!= null)));
                        copy.setBebaubarMit(copyBebaubarMit);
                    } else {
                        if (bebaubarMitShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bebaubarMit = null;
                        }
                    }
                }
                {
                    Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                        GrundstueckGewerbeKategorienTyp sourceObjektkategorie2;
                        sourceObjektkategorie2 = this.getObjektkategorie2();
                        GrundstueckGewerbeKategorienTyp copyObjektkategorie2 = ((GrundstueckGewerbeKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                        copy.setObjektkategorie2(copyObjektkategorie2);
                    } else {
                        if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objektkategorie2 = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new GrundstueckGewerbe.Type();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final GrundstueckGewerbe.Type that = ((GrundstueckGewerbe.Type) object);
            {
                VermarktungGrundstueckGewerbeTyp lhsVermarktung;
                lhsVermarktung = this.getVermarktung();
                VermarktungGrundstueckGewerbeTyp rhsVermarktung;
                rhsVermarktung = that.getVermarktung();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                    return false;
                }
            }
            {
                GrundstueckGewerbeEmpfohleneNutzung lhsBebaubarMit;
                lhsBebaubarMit = this.getBebaubarMit();
                GrundstueckGewerbeEmpfohleneNutzung rhsBebaubarMit;
                rhsBebaubarMit = that.getBebaubarMit();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarMit", lhsBebaubarMit), LocatorUtils.property(thatLocator, "bebaubarMit", rhsBebaubarMit), lhsBebaubarMit, rhsBebaubarMit, (this.bebaubarMit!= null), (that.bebaubarMit!= null))) {
                    return false;
                }
            }
            {
                GrundstueckGewerbeKategorienTyp lhsObjektkategorie2;
                lhsObjektkategorie2 = this.getObjektkategorie2();
                GrundstueckGewerbeKategorienTyp rhsObjektkategorie2;
                rhsObjektkategorie2 = that.getObjektkategorie2();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            return equals(null, null, object, strategy);
        }

    }

}
