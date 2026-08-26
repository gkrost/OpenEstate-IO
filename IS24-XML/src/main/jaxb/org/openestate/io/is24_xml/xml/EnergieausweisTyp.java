package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for EnergieausweisTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnergieausweisTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Energieausweistyp" type="{http://www.immobilienscout24.de/immobilientransfer}EnergieausweistypTyp" />
 *       <attribute name="Energieverbrauchskennwert" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl52Typ" />
 *       <attribute name="WarmwasserEnthalten" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergieausweisTyp")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class EnergieausweisTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Energieausweistyp")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected EnergieausweistypTyp energieausweistyp;
    @XmlAttribute(name = "Energieverbrauchskennwert")
    @XmlJavaTypeAdapter(Adapter30 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal energieverbrauchskennwert;
    /**
     * Nur im Falle des Energieausweistyps
     *                     'Energieverbrauchskennwert' zu setzen. Gibt an, ob
     *                     im Energieverbrauchskennwert der Warmwasser
     *                     Energieverbrauch enthalten ist.
     * 
     */
    @XmlAttribute(name = "WarmwasserEnthalten")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected Boolean warmwasserEnthalten;

    /**
     * Gets the value of the energieausweistyp property.
     * 
     * @return
     *     possible object is
     *     {@link EnergieausweistypTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public EnergieausweistypTyp getEnergieausweistyp() {
        return energieausweistyp;
    }

    /**
     * Sets the value of the energieausweistyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergieausweistypTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setEnergieausweistyp(EnergieausweistypTyp value) {
        this.energieausweistyp = value;
    }

    /**
     * Gets the value of the energieverbrauchskennwert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getEnergieverbrauchskennwert() {
        return energieverbrauchskennwert;
    }

    /**
     * Sets the value of the energieverbrauchskennwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setEnergieverbrauchskennwert(BigDecimal value) {
        this.energieverbrauchskennwert = value;
    }

    /**
     * Nur im Falle des Energieausweistyps
     *                     'Energieverbrauchskennwert' zu setzen. Gibt an, ob
     *                     im Energieverbrauchskennwert der Warmwasser
     *                     Energieverbrauch enthalten ist.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Boolean getWarmwasserEnthalten() {
        return warmwasserEnthalten;
    }

    /**
     * Sets the value of the warmwasserEnthalten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getWarmwasserEnthalten()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setWarmwasserEnthalten(Boolean value) {
        this.warmwasserEnthalten = value;
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
            EnergieausweistypTyp theEnergieausweistyp;
            theEnergieausweistyp = this.getEnergieausweistyp();
            strategy.appendField(locator, this, "energieausweistyp", buffer, theEnergieausweistyp, (this.energieausweistyp!= null));
        }
        {
            BigDecimal theEnergieverbrauchskennwert;
            theEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            strategy.appendField(locator, this, "energieverbrauchskennwert", buffer, theEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null));
        }
        {
            Boolean theWarmwasserEnthalten;
            theWarmwasserEnthalten = this.getWarmwasserEnthalten();
            strategy.appendField(locator, this, "warmwasserEnthalten", buffer, theWarmwasserEnthalten, (this.warmwasserEnthalten!= null));
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
        if (draftCopy instanceof EnergieausweisTyp) {
            final EnergieausweisTyp copy = ((EnergieausweisTyp) draftCopy);
            {
                Boolean energieausweistypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieausweistyp!= null));
                if (energieausweistypShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergieausweistypTyp sourceEnergieausweistyp;
                    sourceEnergieausweistyp = this.getEnergieausweistyp();
                    EnergieausweistypTyp copyEnergieausweistyp = ((EnergieausweistypTyp) strategy.copy(LocatorUtils.property(locator, "energieausweistyp", sourceEnergieausweistyp), sourceEnergieausweistyp, (this.energieausweistyp!= null)));
                    copy.setEnergieausweistyp(copyEnergieausweistyp);
                } else {
                    if (energieausweistypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieausweistyp = null;
                    }
                }
            }
            {
                Boolean energieverbrauchskennwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energieverbrauchskennwert!= null));
                if (energieverbrauchskennwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceEnergieverbrauchskennwert;
                    sourceEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
                    BigDecimal copyEnergieverbrauchskennwert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "energieverbrauchskennwert", sourceEnergieverbrauchskennwert), sourceEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null)));
                    copy.setEnergieverbrauchskennwert(copyEnergieverbrauchskennwert);
                } else {
                    if (energieverbrauchskennwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energieverbrauchskennwert = null;
                    }
                }
            }
            {
                Boolean warmwasserEnthaltenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.warmwasserEnthalten!= null));
                if (warmwasserEnthaltenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWarmwasserEnthalten;
                    sourceWarmwasserEnthalten = this.getWarmwasserEnthalten();
                    Boolean copyWarmwasserEnthalten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "warmwasserEnthalten", sourceWarmwasserEnthalten), sourceWarmwasserEnthalten, (this.warmwasserEnthalten!= null)));
                    copy.setWarmwasserEnthalten(copyWarmwasserEnthalten);
                } else {
                    if (warmwasserEnthaltenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.warmwasserEnthalten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new EnergieausweisTyp();
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
        final EnergieausweisTyp that = ((EnergieausweisTyp) object);
        {
            EnergieausweistypTyp lhsEnergieausweistyp;
            lhsEnergieausweistyp = this.getEnergieausweistyp();
            EnergieausweistypTyp rhsEnergieausweistyp;
            rhsEnergieausweistyp = that.getEnergieausweistyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieausweistyp", lhsEnergieausweistyp), LocatorUtils.property(thatLocator, "energieausweistyp", rhsEnergieausweistyp), lhsEnergieausweistyp, rhsEnergieausweistyp, (this.energieausweistyp!= null), (that.energieausweistyp!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsEnergieverbrauchskennwert;
            lhsEnergieverbrauchskennwert = this.getEnergieverbrauchskennwert();
            BigDecimal rhsEnergieverbrauchskennwert;
            rhsEnergieverbrauchskennwert = that.getEnergieverbrauchskennwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energieverbrauchskennwert", lhsEnergieverbrauchskennwert), LocatorUtils.property(thatLocator, "energieverbrauchskennwert", rhsEnergieverbrauchskennwert), lhsEnergieverbrauchskennwert, rhsEnergieverbrauchskennwert, (this.energieverbrauchskennwert!= null), (that.energieverbrauchskennwert!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWarmwasserEnthalten;
            lhsWarmwasserEnthalten = this.getWarmwasserEnthalten();
            Boolean rhsWarmwasserEnthalten;
            rhsWarmwasserEnthalten = that.getWarmwasserEnthalten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warmwasserEnthalten", lhsWarmwasserEnthalten), LocatorUtils.property(thatLocator, "warmwasserEnthalten", rhsWarmwasserEnthalten), lhsWarmwasserEnthalten, rhsWarmwasserEnthalten, (this.warmwasserEnthalten!= null), (that.warmwasserEnthalten!= null))) {
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
