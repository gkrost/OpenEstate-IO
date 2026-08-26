package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
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


/**
 * <p>Java class for VermarktungGewerbeTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VermarktungGewerbeTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Miete">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Pro" type="{http://www.immobilienscout24.de/immobilientransfer}MieteEinheitTyp" default="Monat" />
 *                 <attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
 *                 <attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Kauf">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute name="PreisParkflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       <attribute name="Nebenkosten" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGewerbeTyp", propOrder = {
    "miete",
    "kauf"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class VermarktungGewerbeTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Miete", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<VermarktungGewerbeTyp.Miete> miete;
    @XmlElementRef(name = "Kauf", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<VermarktungGewerbeTyp.Kauf> kauf;
    @XmlAttribute(name = "PreisParkflaeche")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal preisParkflaeche;
    @XmlAttribute(name = "Nebenkosten")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal nebenkosten;

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Miete }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<VermarktungGewerbeTyp.Miete> getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Miete }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setMiete(JAXBElement<VermarktungGewerbeTyp.Miete> value) {
        this.miete = value;
    }

    /**
     * Gets the value of the kauf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Kauf }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<VermarktungGewerbeTyp.Kauf> getKauf() {
        return kauf;
    }

    /**
     * Sets the value of the kauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGewerbeTyp.Kauf }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setKauf(JAXBElement<VermarktungGewerbeTyp.Kauf> value) {
        this.kauf = value;
    }

    /**
     * Gets the value of the preisParkflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getPreisParkflaeche() {
        return preisParkflaeche;
    }

    /**
     * Sets the value of the preisParkflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setPreisParkflaeche(BigDecimal value) {
        this.preisParkflaeche = value;
    }

    /**
     * Gets the value of the nebenkosten property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getNebenkosten() {
        return nebenkosten;
    }

    /**
     * Sets the value of the nebenkosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setNebenkosten(BigDecimal value) {
        this.nebenkosten = value;
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
        {
            JAXBElement<VermarktungGewerbeTyp.Miete> theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete, (this.miete!= null));
        }
        {
            JAXBElement<VermarktungGewerbeTyp.Kauf> theKauf;
            theKauf = this.getKauf();
            strategy.appendField(locator, this, "kauf", buffer, theKauf, (this.kauf!= null));
        }
        {
            BigDecimal thePreisParkflaeche;
            thePreisParkflaeche = this.getPreisParkflaeche();
            strategy.appendField(locator, this, "preisParkflaeche", buffer, thePreisParkflaeche, (this.preisParkflaeche!= null));
        }
        {
            BigDecimal theNebenkosten;
            theNebenkosten = this.getNebenkosten();
            strategy.appendField(locator, this, "nebenkosten", buffer, theNebenkosten, (this.nebenkosten!= null));
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
        if (draftCopy instanceof VermarktungGewerbeTyp) {
            final VermarktungGewerbeTyp copy = ((VermarktungGewerbeTyp) draftCopy);
            {
                Boolean mieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.miete!= null));
                if (mieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGewerbeTyp.Miete> sourceMiete;
                    sourceMiete = this.getMiete();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGewerbeTyp.Miete> copyMiete = ((JAXBElement<VermarktungGewerbeTyp.Miete> ) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete, (this.miete!= null)));
                    copy.setMiete(copyMiete);
                } else {
                    if (mieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.miete = null;
                    }
                }
            }
            {
                Boolean kaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kauf!= null));
                if (kaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGewerbeTyp.Kauf> sourceKauf;
                    sourceKauf = this.getKauf();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGewerbeTyp.Kauf> copyKauf = ((JAXBElement<VermarktungGewerbeTyp.Kauf> ) strategy.copy(LocatorUtils.property(locator, "kauf", sourceKauf), sourceKauf, (this.kauf!= null)));
                    copy.setKauf(copyKauf);
                } else {
                    if (kaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kauf = null;
                    }
                }
            }
            {
                Boolean preisParkflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisParkflaeche!= null));
                if (preisParkflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreisParkflaeche;
                    sourcePreisParkflaeche = this.getPreisParkflaeche();
                    BigDecimal copyPreisParkflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisParkflaeche", sourcePreisParkflaeche), sourcePreisParkflaeche, (this.preisParkflaeche!= null)));
                    copy.setPreisParkflaeche(copyPreisParkflaeche);
                } else {
                    if (preisParkflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisParkflaeche = null;
                    }
                }
            }
            {
                Boolean nebenkostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nebenkosten!= null));
                if (nebenkostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNebenkosten;
                    sourceNebenkosten = this.getNebenkosten();
                    BigDecimal copyNebenkosten = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "nebenkosten", sourceNebenkosten), sourceNebenkosten, (this.nebenkosten!= null)));
                    copy.setNebenkosten(copyNebenkosten);
                } else {
                    if (nebenkostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nebenkosten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new VermarktungGewerbeTyp();
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
        final VermarktungGewerbeTyp that = ((VermarktungGewerbeTyp) object);
        {
            JAXBElement<VermarktungGewerbeTyp.Miete> lhsMiete;
            lhsMiete = this.getMiete();
            JAXBElement<VermarktungGewerbeTyp.Miete> rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete, (this.miete!= null), (that.miete!= null))) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGewerbeTyp.Kauf> lhsKauf;
            lhsKauf = this.getKauf();
            JAXBElement<VermarktungGewerbeTyp.Kauf> rhsKauf;
            rhsKauf = that.getKauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kauf", lhsKauf), LocatorUtils.property(thatLocator, "kauf", rhsKauf), lhsKauf, rhsKauf, (this.kauf!= null), (that.kauf!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPreisParkflaeche;
            lhsPreisParkflaeche = this.getPreisParkflaeche();
            BigDecimal rhsPreisParkflaeche;
            rhsPreisParkflaeche = that.getPreisParkflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisParkflaeche", lhsPreisParkflaeche), LocatorUtils.property(thatLocator, "preisParkflaeche", rhsPreisParkflaeche), lhsPreisParkflaeche, rhsPreisParkflaeche, (this.preisParkflaeche!= null), (that.preisParkflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNebenkosten;
            lhsNebenkosten = this.getNebenkosten();
            BigDecimal rhsNebenkosten;
            rhsNebenkosten = that.getNebenkosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nebenkosten", lhsNebenkosten), LocatorUtils.property(thatLocator, "nebenkosten", rhsNebenkosten), lhsNebenkosten, rhsNebenkosten, (this.nebenkosten!= null), (that.nebenkosten!= null))) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Kauf implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "Preis", required = true)
        @XmlJavaTypeAdapter(Adapter36 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected BigDecimal preis;

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
            {
                BigDecimal thePreis;
                thePreis = this.getPreis();
                strategy.appendField(locator, this, "preis", buffer, thePreis, (this.preis!= null));
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
            if (draftCopy instanceof VermarktungGewerbeTyp.Kauf) {
                final VermarktungGewerbeTyp.Kauf copy = ((VermarktungGewerbeTyp.Kauf) draftCopy);
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
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new VermarktungGewerbeTyp.Kauf();
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
            final VermarktungGewerbeTyp.Kauf that = ((VermarktungGewerbeTyp.Kauf) object);
            {
                BigDecimal lhsPreis;
                lhsPreis = this.getPreis();
                BigDecimal rhsPreis;
                rhsPreis = that.getPreis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "preis", lhsPreis), LocatorUtils.property(thatLocator, "preis", rhsPreis), lhsPreis, rhsPreis, (this.preis!= null), (that.preis!= null))) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Pro" type="{http://www.immobilienscout24.de/immobilientransfer}MieteEinheitTyp" default="Monat" />
     *       <attribute name="Kaltmiete" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
     *       <attribute name="Kaution" type="{http://www.immobilienscout24.de/immobilientransfer}Text50Typ" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Miete implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "Pro")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected MieteEinheitTyp pro;
        @XmlAttribute(name = "Kaltmiete", required = true)
        @XmlJavaTypeAdapter(Adapter36 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected BigDecimal kaltmiete;
        @XmlAttribute(name = "Kaution")
        @XmlJavaTypeAdapter(Adapter7 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected String kaution;

        /**
         * Gets the value of the pro property.
         * 
         * @return
         *     possible object is
         *     {@link MieteEinheitTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public MieteEinheitTyp getPro() {
            if (pro == null) {
                return MieteEinheitTyp.MONAT;
            } else {
                return pro;
            }
        }

        /**
         * Sets the value of the pro property.
         * 
         * @param value
         *     allowed object is
         *     {@link MieteEinheitTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setPro(MieteEinheitTyp value) {
            this.pro = value;
        }

        /**
         * Gets the value of the kaltmiete property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public BigDecimal getKaltmiete() {
            return kaltmiete;
        }

        /**
         * Sets the value of the kaltmiete property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setKaltmiete(BigDecimal value) {
            this.kaltmiete = value;
        }

        /**
         * Gets the value of the kaution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public String getKaution() {
            return kaution;
        }

        /**
         * Sets the value of the kaution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setKaution(String value) {
            this.kaution = value;
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
            {
                MieteEinheitTyp thePro;
                thePro = this.getPro();
                strategy.appendField(locator, this, "pro", buffer, thePro, (this.pro!= null));
            }
            {
                BigDecimal theKaltmiete;
                theKaltmiete = this.getKaltmiete();
                strategy.appendField(locator, this, "kaltmiete", buffer, theKaltmiete, (this.kaltmiete!= null));
            }
            {
                String theKaution;
                theKaution = this.getKaution();
                strategy.appendField(locator, this, "kaution", buffer, theKaution, (this.kaution!= null));
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
            if (draftCopy instanceof VermarktungGewerbeTyp.Miete) {
                final VermarktungGewerbeTyp.Miete copy = ((VermarktungGewerbeTyp.Miete) draftCopy);
                {
                    Boolean proShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pro!= null));
                    if (proShouldBeCopiedAndSet == Boolean.TRUE) {
                        MieteEinheitTyp sourcePro;
                        sourcePro = this.getPro();
                        MieteEinheitTyp copyPro = ((MieteEinheitTyp) strategy.copy(LocatorUtils.property(locator, "pro", sourcePro), sourcePro, (this.pro!= null)));
                        copy.setPro(copyPro);
                    } else {
                        if (proShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.pro = null;
                        }
                    }
                }
                {
                    Boolean kaltmieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaltmiete!= null));
                    if (kaltmieteShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceKaltmiete;
                        sourceKaltmiete = this.getKaltmiete();
                        BigDecimal copyKaltmiete = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaltmiete", sourceKaltmiete), sourceKaltmiete, (this.kaltmiete!= null)));
                        copy.setKaltmiete(copyKaltmiete);
                    } else {
                        if (kaltmieteShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kaltmiete = null;
                        }
                    }
                }
                {
                    Boolean kautionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaution!= null));
                    if (kautionShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceKaution;
                        sourceKaution = this.getKaution();
                        String copyKaution = ((String) strategy.copy(LocatorUtils.property(locator, "kaution", sourceKaution), sourceKaution, (this.kaution!= null)));
                        copy.setKaution(copyKaution);
                    } else {
                        if (kautionShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kaution = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new VermarktungGewerbeTyp.Miete();
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
            final VermarktungGewerbeTyp.Miete that = ((VermarktungGewerbeTyp.Miete) object);
            {
                MieteEinheitTyp lhsPro;
                lhsPro = this.getPro();
                MieteEinheitTyp rhsPro;
                rhsPro = that.getPro();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pro", lhsPro), LocatorUtils.property(thatLocator, "pro", rhsPro), lhsPro, rhsPro, (this.pro!= null), (that.pro!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsKaltmiete;
                lhsKaltmiete = this.getKaltmiete();
                BigDecimal rhsKaltmiete;
                rhsKaltmiete = that.getKaltmiete();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaltmiete", lhsKaltmiete), LocatorUtils.property(thatLocator, "kaltmiete", rhsKaltmiete), lhsKaltmiete, rhsKaltmiete, (this.kaltmiete!= null), (that.kaltmiete!= null))) {
                    return false;
                }
            }
            {
                String lhsKaution;
                lhsKaution = this.getKaution();
                String rhsKaution;
                rhsKaution = that.getKaution();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaution", lhsKaution), LocatorUtils.property(thatLocator, "kaution", rhsKaution), lhsKaution, rhsKaution, (this.kaution!= null), (that.kaution!= null))) {
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
