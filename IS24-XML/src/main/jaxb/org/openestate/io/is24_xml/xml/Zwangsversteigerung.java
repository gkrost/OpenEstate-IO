package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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

public class Zwangsversteigerung
    extends JAXBElement<Zwangsversteigerung.Type>
{

    protected static final QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "Zwangsversteigerung");

    public Zwangsversteigerung(Zwangsversteigerung.Type value) {
        super(NAME, ((Class<Zwangsversteigerung.Type> ) Zwangsversteigerung.Type.class), null, value);
    }

    public Zwangsversteigerung() {
        super(NAME, ((Class<Zwangsversteigerung.Type> ) Zwangsversteigerung.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.immobilienscout24.de/immobilientransfer}ZwangsversteigerungTyp">
     *       <sequence>
     *         <element name="Aenderungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="Amtsgericht" type="{http://www.immobilienscout24.de/immobilientransfer}AmtsgerichtTyp"/>
     *         <element name="Aufhebungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="Eigentuemer" type="{http://www.immobilienscout24.de/immobilientransfer}Text80Typ"/>
     *         <element name="Erfassungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Grundbuchblattnummer" type="{http://www.immobilienscout24.de/immobilientransfer}Text40Typ"/>
     *         <element name="Objektart" type="{http://www.immobilienscout24.de/immobilientransfer}ZwangsversteigerungKategorieTyp"/>
     *         <element name="Preis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ"/>
     *         <element name="Versteigerungstermin" type="{http://www.immobilienscout24.de/immobilientransfer}VersteigerungsterminTyp"/>
     *       </sequence>
     *       <attribute name="Gesamtflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aenderungsdatum",
        "amtsgericht",
        "aufhebungsdatum",
        "eigentuemer",
        "erfassungsdatum",
        "grundbuchblattnummer",
        "objektart",
        "preis",
        "versteigerungstermin"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Type
        extends ZwangsversteigerungTyp
        implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Aenderungsdatum", type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected Calendar aenderungsdatum;
        @XmlElement(name = "Amtsgericht", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected AmtsgerichtTyp amtsgericht;
        @XmlElement(name = "Aufhebungsdatum", type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected Calendar aufhebungsdatum;
        @XmlElement(name = "Eigentuemer", required = true)
        @XmlJavaTypeAdapter(Adapter8 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected String eigentuemer;
        @XmlElement(name = "Erfassungsdatum", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected Calendar erfassungsdatum;
        @XmlElement(name = "Grundbuchblattnummer", required = true)
        @XmlJavaTypeAdapter(Adapter6 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected String grundbuchblattnummer;
        @XmlElement(name = "Objektart", required = true)
        @XmlSchemaType(name = "string")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected ZwangsversteigerungKategorieTyp objektart;
        @XmlElement(name = "Preis", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter35 .class)
        @XmlSchemaType(name = "decimal")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected BigDecimal preis;
        @XmlElement(name = "Versteigerungstermin", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected VersteigerungsterminTyp versteigerungstermin;
        @XmlAttribute(name = "Gesamtflaeche", required = true)
        @XmlJavaTypeAdapter(Adapter34 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected BigDecimal gesamtflaeche;

        /**
         * Gets the value of the aenderungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Calendar getAenderungsdatum() {
            return aenderungsdatum;
        }

        /**
         * Sets the value of the aenderungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setAenderungsdatum(Calendar value) {
            this.aenderungsdatum = value;
        }

        /**
         * Gets the value of the amtsgericht property.
         * 
         * @return
         *     possible object is
         *     {@link AmtsgerichtTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public AmtsgerichtTyp getAmtsgericht() {
            return amtsgericht;
        }

        /**
         * Sets the value of the amtsgericht property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmtsgerichtTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setAmtsgericht(AmtsgerichtTyp value) {
            this.amtsgericht = value;
        }

        /**
         * Gets the value of the aufhebungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Calendar getAufhebungsdatum() {
            return aufhebungsdatum;
        }

        /**
         * Sets the value of the aufhebungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setAufhebungsdatum(Calendar value) {
            this.aufhebungsdatum = value;
        }

        /**
         * Gets the value of the eigentuemer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public String getEigentuemer() {
            return eigentuemer;
        }

        /**
         * Sets the value of the eigentuemer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setEigentuemer(String value) {
            this.eigentuemer = value;
        }

        /**
         * Gets the value of the erfassungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Calendar getErfassungsdatum() {
            return erfassungsdatum;
        }

        /**
         * Sets the value of the erfassungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setErfassungsdatum(Calendar value) {
            this.erfassungsdatum = value;
        }

        /**
         * Gets the value of the grundbuchblattnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public String getGrundbuchblattnummer() {
            return grundbuchblattnummer;
        }

        /**
         * Sets the value of the grundbuchblattnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setGrundbuchblattnummer(String value) {
            this.grundbuchblattnummer = value;
        }

        /**
         * Gets the value of the objektart property.
         * 
         * @return
         *     possible object is
         *     {@link ZwangsversteigerungKategorieTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public ZwangsversteigerungKategorieTyp getObjektart() {
            return objektart;
        }

        /**
         * Sets the value of the objektart property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZwangsversteigerungKategorieTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setObjektart(ZwangsversteigerungKategorieTyp value) {
            this.objektart = value;
        }

        /**
         * Gets the value of the preis property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public BigDecimal getPreis() {
            return preis;
        }

        /**
         * Sets the value of the preis property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setPreis(BigDecimal value) {
            this.preis = value;
        }

        /**
         * Gets the value of the versteigerungstermin property.
         * 
         * @return
         *     possible object is
         *     {@link VersteigerungsterminTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public VersteigerungsterminTyp getVersteigerungstermin() {
            return versteigerungstermin;
        }

        /**
         * Sets the value of the versteigerungstermin property.
         * 
         * @param value
         *     allowed object is
         *     {@link VersteigerungsterminTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setVersteigerungstermin(VersteigerungsterminTyp value) {
            this.versteigerungstermin = value;
        }

        /**
         * Gets the value of the gesamtflaeche property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public BigDecimal getGesamtflaeche() {
            return gesamtflaeche;
        }

        /**
         * Sets the value of the gesamtflaeche property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setGesamtflaeche(BigDecimal value) {
            this.gesamtflaeche = value;
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
                Calendar theAenderungsdatum;
                theAenderungsdatum = this.getAenderungsdatum();
                strategy.appendField(locator, this, "aenderungsdatum", buffer, theAenderungsdatum, (this.aenderungsdatum!= null));
            }
            {
                AmtsgerichtTyp theAmtsgericht;
                theAmtsgericht = this.getAmtsgericht();
                strategy.appendField(locator, this, "amtsgericht", buffer, theAmtsgericht, (this.amtsgericht!= null));
            }
            {
                Calendar theAufhebungsdatum;
                theAufhebungsdatum = this.getAufhebungsdatum();
                strategy.appendField(locator, this, "aufhebungsdatum", buffer, theAufhebungsdatum, (this.aufhebungsdatum!= null));
            }
            {
                String theEigentuemer;
                theEigentuemer = this.getEigentuemer();
                strategy.appendField(locator, this, "eigentuemer", buffer, theEigentuemer, (this.eigentuemer!= null));
            }
            {
                Calendar theErfassungsdatum;
                theErfassungsdatum = this.getErfassungsdatum();
                strategy.appendField(locator, this, "erfassungsdatum", buffer, theErfassungsdatum, (this.erfassungsdatum!= null));
            }
            {
                String theGrundbuchblattnummer;
                theGrundbuchblattnummer = this.getGrundbuchblattnummer();
                strategy.appendField(locator, this, "grundbuchblattnummer", buffer, theGrundbuchblattnummer, (this.grundbuchblattnummer!= null));
            }
            {
                ZwangsversteigerungKategorieTyp theObjektart;
                theObjektart = this.getObjektart();
                strategy.appendField(locator, this, "objektart", buffer, theObjektart, (this.objektart!= null));
            }
            {
                BigDecimal thePreis;
                thePreis = this.getPreis();
                strategy.appendField(locator, this, "preis", buffer, thePreis, (this.preis!= null));
            }
            {
                VersteigerungsterminTyp theVersteigerungstermin;
                theVersteigerungstermin = this.getVersteigerungstermin();
                strategy.appendField(locator, this, "versteigerungstermin", buffer, theVersteigerungstermin, (this.versteigerungstermin!= null));
            }
            {
                BigDecimal theGesamtflaeche;
                theGesamtflaeche = this.getGesamtflaeche();
                strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche, (this.gesamtflaeche!= null));
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
            if (draftCopy instanceof Zwangsversteigerung.Type) {
                final Zwangsversteigerung.Type copy = ((Zwangsversteigerung.Type) draftCopy);
                {
                    Boolean aenderungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aenderungsdatum!= null));
                    if (aenderungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceAenderungsdatum;
                        sourceAenderungsdatum = this.getAenderungsdatum();
                        Calendar copyAenderungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aenderungsdatum", sourceAenderungsdatum), sourceAenderungsdatum, (this.aenderungsdatum!= null)));
                        copy.setAenderungsdatum(copyAenderungsdatum);
                    } else {
                        if (aenderungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.aenderungsdatum = null;
                        }
                    }
                }
                {
                    Boolean amtsgerichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amtsgericht!= null));
                    if (amtsgerichtShouldBeCopiedAndSet == Boolean.TRUE) {
                        AmtsgerichtTyp sourceAmtsgericht;
                        sourceAmtsgericht = this.getAmtsgericht();
                        AmtsgerichtTyp copyAmtsgericht = ((AmtsgerichtTyp) strategy.copy(LocatorUtils.property(locator, "amtsgericht", sourceAmtsgericht), sourceAmtsgericht, (this.amtsgericht!= null)));
                        copy.setAmtsgericht(copyAmtsgericht);
                    } else {
                        if (amtsgerichtShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.amtsgericht = null;
                        }
                    }
                }
                {
                    Boolean aufhebungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aufhebungsdatum!= null));
                    if (aufhebungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceAufhebungsdatum;
                        sourceAufhebungsdatum = this.getAufhebungsdatum();
                        Calendar copyAufhebungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "aufhebungsdatum", sourceAufhebungsdatum), sourceAufhebungsdatum, (this.aufhebungsdatum!= null)));
                        copy.setAufhebungsdatum(copyAufhebungsdatum);
                    } else {
                        if (aufhebungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.aufhebungsdatum = null;
                        }
                    }
                }
                {
                    Boolean eigentuemerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eigentuemer!= null));
                    if (eigentuemerShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceEigentuemer;
                        sourceEigentuemer = this.getEigentuemer();
                        String copyEigentuemer = ((String) strategy.copy(LocatorUtils.property(locator, "eigentuemer", sourceEigentuemer), sourceEigentuemer, (this.eigentuemer!= null)));
                        copy.setEigentuemer(copyEigentuemer);
                    } else {
                        if (eigentuemerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.eigentuemer = null;
                        }
                    }
                }
                {
                    Boolean erfassungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erfassungsdatum!= null));
                    if (erfassungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceErfassungsdatum;
                        sourceErfassungsdatum = this.getErfassungsdatum();
                        Calendar copyErfassungsdatum = ((Calendar) strategy.copy(LocatorUtils.property(locator, "erfassungsdatum", sourceErfassungsdatum), sourceErfassungsdatum, (this.erfassungsdatum!= null)));
                        copy.setErfassungsdatum(copyErfassungsdatum);
                    } else {
                        if (erfassungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.erfassungsdatum = null;
                        }
                    }
                }
                {
                    Boolean grundbuchblattnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundbuchblattnummer!= null));
                    if (grundbuchblattnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceGrundbuchblattnummer;
                        sourceGrundbuchblattnummer = this.getGrundbuchblattnummer();
                        String copyGrundbuchblattnummer = ((String) strategy.copy(LocatorUtils.property(locator, "grundbuchblattnummer", sourceGrundbuchblattnummer), sourceGrundbuchblattnummer, (this.grundbuchblattnummer!= null)));
                        copy.setGrundbuchblattnummer(copyGrundbuchblattnummer);
                    } else {
                        if (grundbuchblattnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.grundbuchblattnummer = null;
                        }
                    }
                }
                {
                    Boolean objektartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektart!= null));
                    if (objektartShouldBeCopiedAndSet == Boolean.TRUE) {
                        ZwangsversteigerungKategorieTyp sourceObjektart;
                        sourceObjektart = this.getObjektart();
                        ZwangsversteigerungKategorieTyp copyObjektart = ((ZwangsversteigerungKategorieTyp) strategy.copy(LocatorUtils.property(locator, "objektart", sourceObjektart), sourceObjektart, (this.objektart!= null)));
                        copy.setObjektart(copyObjektart);
                    } else {
                        if (objektartShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objektart = null;
                        }
                    }
                }
                {
                    Boolean preisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preis!= null));
                    if (preisShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourcePreis;
                        sourcePreis = this.getPreis();
                        BigDecimal copyPreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preis", sourcePreis), sourcePreis, (this.preis!= null)));
                        copy.setPreis(copyPreis);
                    } else {
                        if (preisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.preis = null;
                        }
                    }
                }
                {
                    Boolean versteigerungsterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versteigerungstermin!= null));
                    if (versteigerungsterminShouldBeCopiedAndSet == Boolean.TRUE) {
                        VersteigerungsterminTyp sourceVersteigerungstermin;
                        sourceVersteigerungstermin = this.getVersteigerungstermin();
                        VersteigerungsterminTyp copyVersteigerungstermin = ((VersteigerungsterminTyp) strategy.copy(LocatorUtils.property(locator, "versteigerungstermin", sourceVersteigerungstermin), sourceVersteigerungstermin, (this.versteigerungstermin!= null)));
                        copy.setVersteigerungstermin(copyVersteigerungstermin);
                    } else {
                        if (versteigerungsterminShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.versteigerungstermin = null;
                        }
                    }
                }
                {
                    Boolean gesamtflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesamtflaeche!= null));
                    if (gesamtflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceGesamtflaeche;
                        sourceGesamtflaeche = this.getGesamtflaeche();
                        BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche, (this.gesamtflaeche!= null)));
                        copy.setGesamtflaeche(copyGesamtflaeche);
                    } else {
                        if (gesamtflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.gesamtflaeche = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new Zwangsversteigerung.Type();
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
            final Zwangsversteigerung.Type that = ((Zwangsversteigerung.Type) object);
            {
                Calendar lhsAenderungsdatum;
                lhsAenderungsdatum = this.getAenderungsdatum();
                Calendar rhsAenderungsdatum;
                rhsAenderungsdatum = that.getAenderungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsdatum", lhsAenderungsdatum), LocatorUtils.property(thatLocator, "aenderungsdatum", rhsAenderungsdatum), lhsAenderungsdatum, rhsAenderungsdatum, (this.aenderungsdatum!= null), (that.aenderungsdatum!= null))) {
                    return false;
                }
            }
            {
                AmtsgerichtTyp lhsAmtsgericht;
                lhsAmtsgericht = this.getAmtsgericht();
                AmtsgerichtTyp rhsAmtsgericht;
                rhsAmtsgericht = that.getAmtsgericht();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "amtsgericht", lhsAmtsgericht), LocatorUtils.property(thatLocator, "amtsgericht", rhsAmtsgericht), lhsAmtsgericht, rhsAmtsgericht, (this.amtsgericht!= null), (that.amtsgericht!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsAufhebungsdatum;
                lhsAufhebungsdatum = this.getAufhebungsdatum();
                Calendar rhsAufhebungsdatum;
                rhsAufhebungsdatum = that.getAufhebungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aufhebungsdatum", lhsAufhebungsdatum), LocatorUtils.property(thatLocator, "aufhebungsdatum", rhsAufhebungsdatum), lhsAufhebungsdatum, rhsAufhebungsdatum, (this.aufhebungsdatum!= null), (that.aufhebungsdatum!= null))) {
                    return false;
                }
            }
            {
                String lhsEigentuemer;
                lhsEigentuemer = this.getEigentuemer();
                String rhsEigentuemer;
                rhsEigentuemer = that.getEigentuemer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "eigentuemer", lhsEigentuemer), LocatorUtils.property(thatLocator, "eigentuemer", rhsEigentuemer), lhsEigentuemer, rhsEigentuemer, (this.eigentuemer!= null), (that.eigentuemer!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsErfassungsdatum;
                lhsErfassungsdatum = this.getErfassungsdatum();
                Calendar rhsErfassungsdatum;
                rhsErfassungsdatum = that.getErfassungsdatum();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "erfassungsdatum", lhsErfassungsdatum), LocatorUtils.property(thatLocator, "erfassungsdatum", rhsErfassungsdatum), lhsErfassungsdatum, rhsErfassungsdatum, (this.erfassungsdatum!= null), (that.erfassungsdatum!= null))) {
                    return false;
                }
            }
            {
                String lhsGrundbuchblattnummer;
                lhsGrundbuchblattnummer = this.getGrundbuchblattnummer();
                String rhsGrundbuchblattnummer;
                rhsGrundbuchblattnummer = that.getGrundbuchblattnummer();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "grundbuchblattnummer", lhsGrundbuchblattnummer), LocatorUtils.property(thatLocator, "grundbuchblattnummer", rhsGrundbuchblattnummer), lhsGrundbuchblattnummer, rhsGrundbuchblattnummer, (this.grundbuchblattnummer!= null), (that.grundbuchblattnummer!= null))) {
                    return false;
                }
            }
            {
                ZwangsversteigerungKategorieTyp lhsObjektart;
                lhsObjektart = this.getObjektart();
                ZwangsversteigerungKategorieTyp rhsObjektart;
                rhsObjektart = that.getObjektart();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektart", lhsObjektart), LocatorUtils.property(thatLocator, "objektart", rhsObjektart), lhsObjektart, rhsObjektart, (this.objektart!= null), (that.objektart!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsPreis;
                lhsPreis = this.getPreis();
                BigDecimal rhsPreis;
                rhsPreis = that.getPreis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis, (this.preis!= null), (that.preis!= null))) {
                    return false;
                }
            }
            {
                VersteigerungsterminTyp lhsVersteigerungstermin;
                lhsVersteigerungstermin = this.getVersteigerungstermin();
                VersteigerungsterminTyp rhsVersteigerungstermin;
                rhsVersteigerungstermin = that.getVersteigerungstermin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "versteigerungstermin", lhsVersteigerungstermin), LocatorUtils.property(thatLocator, "versteigerungstermin", rhsVersteigerungstermin), lhsVersteigerungstermin, rhsVersteigerungstermin, (this.versteigerungstermin!= null), (that.versteigerungstermin!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsGesamtflaeche;
                lhsGesamtflaeche = this.getGesamtflaeche();
                BigDecimal rhsGesamtflaeche;
                rhsGesamtflaeche = that.getGesamtflaeche();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche, (this.gesamtflaeche!= null), (that.gesamtflaeche!= null))) {
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
