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
 * <p>Java class for VermarktungGrundstueckWohnenMieteTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VermarktungGrundstueckWohnenMieteTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pacht">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Miete">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute name="Preis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}PreisAufAnfrage" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungGrundstueckWohnenMieteTyp", propOrder = {
    "pacht",
    "miete"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class VermarktungGrundstueckWohnenMieteTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "Pacht", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> pacht;
    @XmlElementRef(name = "Miete", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> miete;
    @XmlAttribute(name = "Preis", required = true)
    @XmlJavaTypeAdapter(Adapter36 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal preis;

    /**
     * Gets the value of the pacht property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Pacht }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> getPacht() {
        return pacht;
    }

    /**
     * Sets the value of the pacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Pacht }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setPacht(JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> value) {
        this.pacht = value;
    }

    /**
     * Gets the value of the miete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Miete }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> getMiete() {
        return miete;
    }

    /**
     * Sets the value of the miete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VermarktungGrundstueckWohnenMieteTyp.Miete }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setMiete(JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> value) {
        this.miete = value;
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
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> thePacht;
            thePacht = this.getPacht();
            strategy.appendField(locator, this, "pacht", buffer, thePacht, (this.pacht!= null));
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> theMiete;
            theMiete = this.getMiete();
            strategy.appendField(locator, this, "miete", buffer, theMiete, (this.miete!= null));
        }
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
        if (draftCopy instanceof VermarktungGrundstueckWohnenMieteTyp) {
            final VermarktungGrundstueckWohnenMieteTyp copy = ((VermarktungGrundstueckWohnenMieteTyp) draftCopy);
            {
                Boolean pachtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pacht!= null));
                if (pachtShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> sourcePacht;
                    sourcePacht = this.getPacht();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> copyPacht = ((JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> ) strategy.copy(LocatorUtils.property(locator, "pacht", sourcePacht), sourcePacht, (this.pacht!= null)));
                    copy.setPacht(copyPacht);
                } else {
                    if (pachtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pacht = null;
                    }
                }
            }
            {
                Boolean mieteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.miete!= null));
                if (mieteShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> sourceMiete;
                    sourceMiete = this.getMiete();
                    @SuppressWarnings("unchecked")
                    JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> copyMiete = ((JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> ) strategy.copy(LocatorUtils.property(locator, "miete", sourceMiete), sourceMiete, (this.miete!= null)));
                    copy.setMiete(copyMiete);
                } else {
                    if (mieteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.miete = null;
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new VermarktungGrundstueckWohnenMieteTyp();
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
        final VermarktungGrundstueckWohnenMieteTyp that = ((VermarktungGrundstueckWohnenMieteTyp) object);
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> lhsPacht;
            lhsPacht = this.getPacht();
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Pacht> rhsPacht;
            rhsPacht = that.getPacht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pacht", lhsPacht), LocatorUtils.property(thatLocator, "pacht", rhsPacht), lhsPacht, rhsPacht, (this.pacht!= null), (that.pacht!= null))) {
                return false;
            }
        }
        {
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> lhsMiete;
            lhsMiete = this.getMiete();
            JAXBElement<VermarktungGrundstueckWohnenMieteTyp.Miete> rhsMiete;
            rhsMiete = that.getMiete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miete", lhsMiete), LocatorUtils.property(thatLocator, "miete", rhsMiete), lhsMiete, rhsMiete, (this.miete!= null), (that.miete!= null))) {
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
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new VermarktungGrundstueckWohnenMieteTyp.Miete();
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
    public static class Pacht implements Serializable, Cloneable, CopyTo, Equals, ToString
    {


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
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new VermarktungGrundstueckWohnenMieteTyp.Pacht();
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
