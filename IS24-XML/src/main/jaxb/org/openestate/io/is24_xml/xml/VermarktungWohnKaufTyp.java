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
 * <p>Java class for VermarktungWohnKaufTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VermarktungWohnKaufTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="Kaufpreis" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       <attribute name="Wohngeld" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       <attribute name="StellplatzKaufpreis" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       <attribute name="MieteinnahmenProMonat" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VermarktungWohnKaufTyp")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class VermarktungWohnKaufTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "Kaufpreis", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal kaufpreis;
    @XmlAttribute(name = "Wohngeld")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal wohngeld;
    @XmlAttribute(name = "StellplatzKaufpreis")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal stellplatzKaufpreis;
    @XmlAttribute(name = "MieteinnahmenProMonat")
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal mieteinnahmenProMonat;

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setKaufpreis(BigDecimal value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the wohngeld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getWohngeld() {
        return wohngeld;
    }

    /**
     * Sets the value of the wohngeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setWohngeld(BigDecimal value) {
        this.wohngeld = value;
    }

    /**
     * Gets the value of the stellplatzKaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getStellplatzKaufpreis() {
        return stellplatzKaufpreis;
    }

    /**
     * Sets the value of the stellplatzKaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setStellplatzKaufpreis(BigDecimal value) {
        this.stellplatzKaufpreis = value;
    }

    /**
     * Gets the value of the mieteinnahmenProMonat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getMieteinnahmenProMonat() {
        return mieteinnahmenProMonat;
    }

    /**
     * Sets the value of the mieteinnahmenProMonat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setMieteinnahmenProMonat(BigDecimal value) {
        this.mieteinnahmenProMonat = value;
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
            BigDecimal theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            strategy.appendField(locator, this, "kaufpreis", buffer, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            BigDecimal theWohngeld;
            theWohngeld = this.getWohngeld();
            strategy.appendField(locator, this, "wohngeld", buffer, theWohngeld, (this.wohngeld!= null));
        }
        {
            BigDecimal theStellplatzKaufpreis;
            theStellplatzKaufpreis = this.getStellplatzKaufpreis();
            strategy.appendField(locator, this, "stellplatzKaufpreis", buffer, theStellplatzKaufpreis, (this.stellplatzKaufpreis!= null));
        }
        {
            BigDecimal theMieteinnahmenProMonat;
            theMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            strategy.appendField(locator, this, "mieteinnahmenProMonat", buffer, theMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null));
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
        if (draftCopy instanceof VermarktungWohnKaufTyp) {
            final VermarktungWohnKaufTyp copy = ((VermarktungWohnKaufTyp) draftCopy);
            {
                Boolean kaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreis!= null));
                if (kaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKaufpreis;
                    sourceKaufpreis = this.getKaufpreis();
                    BigDecimal copyKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis, (this.kaufpreis!= null)));
                    copy.setKaufpreis(copyKaufpreis);
                } else {
                    if (kaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreis = null;
                    }
                }
            }
            {
                Boolean wohngeldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohngeld!= null));
                if (wohngeldShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohngeld;
                    sourceWohngeld = this.getWohngeld();
                    BigDecimal copyWohngeld = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohngeld", sourceWohngeld), sourceWohngeld, (this.wohngeld!= null)));
                    copy.setWohngeld(copyWohngeld);
                } else {
                    if (wohngeldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohngeld = null;
                    }
                }
            }
            {
                Boolean stellplatzKaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stellplatzKaufpreis!= null));
                if (stellplatzKaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceStellplatzKaufpreis;
                    sourceStellplatzKaufpreis = this.getStellplatzKaufpreis();
                    BigDecimal copyStellplatzKaufpreis = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "stellplatzKaufpreis", sourceStellplatzKaufpreis), sourceStellplatzKaufpreis, (this.stellplatzKaufpreis!= null)));
                    copy.setStellplatzKaufpreis(copyStellplatzKaufpreis);
                } else {
                    if (stellplatzKaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stellplatzKaufpreis = null;
                    }
                }
            }
            {
                Boolean mieteinnahmenProMonatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mieteinnahmenProMonat!= null));
                if (mieteinnahmenProMonatShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMieteinnahmenProMonat;
                    sourceMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
                    BigDecimal copyMieteinnahmenProMonat = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "mieteinnahmenProMonat", sourceMieteinnahmenProMonat), sourceMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null)));
                    copy.setMieteinnahmenProMonat(copyMieteinnahmenProMonat);
                } else {
                    if (mieteinnahmenProMonatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieteinnahmenProMonat = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new VermarktungWohnKaufTyp();
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
        final VermarktungWohnKaufTyp that = ((VermarktungWohnKaufTyp) object);
        {
            BigDecimal lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            BigDecimal rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis, (this.kaufpreis!= null), (that.kaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohngeld;
            lhsWohngeld = this.getWohngeld();
            BigDecimal rhsWohngeld;
            rhsWohngeld = that.getWohngeld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohngeld", lhsWohngeld), LocatorUtils.property(thatLocator, "wohngeld", rhsWohngeld), lhsWohngeld, rhsWohngeld, (this.wohngeld!= null), (that.wohngeld!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsStellplatzKaufpreis;
            lhsStellplatzKaufpreis = this.getStellplatzKaufpreis();
            BigDecimal rhsStellplatzKaufpreis;
            rhsStellplatzKaufpreis = that.getStellplatzKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stellplatzKaufpreis", lhsStellplatzKaufpreis), LocatorUtils.property(thatLocator, "stellplatzKaufpreis", rhsStellplatzKaufpreis), lhsStellplatzKaufpreis, rhsStellplatzKaufpreis, (this.stellplatzKaufpreis!= null), (that.stellplatzKaufpreis!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMieteinnahmenProMonat;
            lhsMieteinnahmenProMonat = this.getMieteinnahmenProMonat();
            BigDecimal rhsMieteinnahmenProMonat;
            rhsMieteinnahmenProMonat = that.getMieteinnahmenProMonat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieteinnahmenProMonat", lhsMieteinnahmenProMonat), LocatorUtils.property(thatLocator, "mieteinnahmenProMonat", rhsMieteinnahmenProMonat), lhsMieteinnahmenProMonat, rhsMieteinnahmenProMonat, (this.mieteinnahmenProMonat!= null), (that.mieteinnahmenProMonat!= null))) {
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
