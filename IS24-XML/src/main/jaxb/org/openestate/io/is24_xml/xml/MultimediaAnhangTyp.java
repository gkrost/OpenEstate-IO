package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
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
 * <p>Java class for MultimediaAnhangTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MultimediaAnhangTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="AnhangArt" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}MMAnhangArtenTyp" />
 *       <attribute name="Dateiname" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Text255Typ" />
 *       <attribute name="Titel" type="{http://www.immobilienscout24.de/immobilientransfer}Text30Typ" />
 *       <attribute name="Dateityp" type="{http://www.immobilienscout24.de/immobilientransfer}Text4Typ" />
 *       <attribute name="Abspieldauer" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl5Typ" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaAnhangTyp")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class MultimediaAnhangTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Anhang-Art. Import von PDF-Dokumenten erfordert folgende Parameter: AnhangArt="video"
     *                     Dateiname="test.pdf" Dateityp="PDF"
     * 
     */
    @XmlAttribute(name = "AnhangArt", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected MMAnhangArtenTyp anhangArt;
    @XmlAttribute(name = "Dateiname", required = true)
    @XmlJavaTypeAdapter(Adapter12 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String dateiname;
    @XmlAttribute(name = "Titel")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String titel;
    @XmlAttribute(name = "Dateityp")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String dateityp;
    @XmlAttribute(name = "Abspieldauer")
    @XmlJavaTypeAdapter(Adapter23 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected Long abspieldauer;

    /**
     * Anhang-Art. Import von PDF-Dokumenten erfordert folgende Parameter: AnhangArt="video"
     *                     Dateiname="test.pdf" Dateityp="PDF"
     * 
     * @return
     *     possible object is
     *     {@link MMAnhangArtenTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public MMAnhangArtenTyp getAnhangArt() {
        return anhangArt;
    }

    /**
     * Sets the value of the anhangArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMAnhangArtenTyp }
     *     
     * @see #getAnhangArt()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setAnhangArt(MMAnhangArtenTyp value) {
        this.anhangArt = value;
    }

    /**
     * Gets the value of the dateiname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getDateiname() {
        return dateiname;
    }

    /**
     * Sets the value of the dateiname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setDateiname(String value) {
        this.dateiname = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the dateityp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getDateityp() {
        return dateityp;
    }

    /**
     * Sets the value of the dateityp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setDateityp(String value) {
        this.dateityp = value;
    }

    /**
     * Gets the value of the abspieldauer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Long getAbspieldauer() {
        return abspieldauer;
    }

    /**
     * Sets the value of the abspieldauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setAbspieldauer(Long value) {
        this.abspieldauer = value;
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
            MMAnhangArtenTyp theAnhangArt;
            theAnhangArt = this.getAnhangArt();
            strategy.appendField(locator, this, "anhangArt", buffer, theAnhangArt, (this.anhangArt!= null));
        }
        {
            String theDateiname;
            theDateiname = this.getDateiname();
            strategy.appendField(locator, this, "dateiname", buffer, theDateiname, (this.dateiname!= null));
        }
        {
            String theTitel;
            theTitel = this.getTitel();
            strategy.appendField(locator, this, "titel", buffer, theTitel, (this.titel!= null));
        }
        {
            String theDateityp;
            theDateityp = this.getDateityp();
            strategy.appendField(locator, this, "dateityp", buffer, theDateityp, (this.dateityp!= null));
        }
        {
            Long theAbspieldauer;
            theAbspieldauer = this.getAbspieldauer();
            strategy.appendField(locator, this, "abspieldauer", buffer, theAbspieldauer, (this.abspieldauer!= null));
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
        if (draftCopy instanceof MultimediaAnhangTyp) {
            final MultimediaAnhangTyp copy = ((MultimediaAnhangTyp) draftCopy);
            {
                Boolean anhangArtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhangArt!= null));
                if (anhangArtShouldBeCopiedAndSet == Boolean.TRUE) {
                    MMAnhangArtenTyp sourceAnhangArt;
                    sourceAnhangArt = this.getAnhangArt();
                    MMAnhangArtenTyp copyAnhangArt = ((MMAnhangArtenTyp) strategy.copy(LocatorUtils.property(locator, "anhangArt", sourceAnhangArt), sourceAnhangArt, (this.anhangArt!= null)));
                    copy.setAnhangArt(copyAnhangArt);
                } else {
                    if (anhangArtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhangArt = null;
                    }
                }
            }
            {
                Boolean dateinameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateiname!= null));
                if (dateinameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateiname;
                    sourceDateiname = this.getDateiname();
                    String copyDateiname = ((String) strategy.copy(LocatorUtils.property(locator, "dateiname", sourceDateiname), sourceDateiname, (this.dateiname!= null)));
                    copy.setDateiname(copyDateiname);
                } else {
                    if (dateinameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateiname = null;
                    }
                }
            }
            {
                Boolean titelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.titel!= null));
                if (titelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitel;
                    sourceTitel = this.getTitel();
                    String copyTitel = ((String) strategy.copy(LocatorUtils.property(locator, "titel", sourceTitel), sourceTitel, (this.titel!= null)));
                    copy.setTitel(copyTitel);
                } else {
                    if (titelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.titel = null;
                    }
                }
            }
            {
                Boolean dateitypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateityp!= null));
                if (dateitypShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateityp;
                    sourceDateityp = this.getDateityp();
                    String copyDateityp = ((String) strategy.copy(LocatorUtils.property(locator, "dateityp", sourceDateityp), sourceDateityp, (this.dateityp!= null)));
                    copy.setDateityp(copyDateityp);
                } else {
                    if (dateitypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateityp = null;
                    }
                }
            }
            {
                Boolean abspieldauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abspieldauer!= null));
                if (abspieldauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceAbspieldauer;
                    sourceAbspieldauer = this.getAbspieldauer();
                    Long copyAbspieldauer = ((Long) strategy.copy(LocatorUtils.property(locator, "abspieldauer", sourceAbspieldauer), sourceAbspieldauer, (this.abspieldauer!= null)));
                    copy.setAbspieldauer(copyAbspieldauer);
                } else {
                    if (abspieldauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abspieldauer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new MultimediaAnhangTyp();
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
        final MultimediaAnhangTyp that = ((MultimediaAnhangTyp) object);
        {
            MMAnhangArtenTyp lhsAnhangArt;
            lhsAnhangArt = this.getAnhangArt();
            MMAnhangArtenTyp rhsAnhangArt;
            rhsAnhangArt = that.getAnhangArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhangArt", lhsAnhangArt), LocatorUtils.property(thatLocator, "anhangArt", rhsAnhangArt), lhsAnhangArt, rhsAnhangArt, (this.anhangArt!= null), (that.anhangArt!= null))) {
                return false;
            }
        }
        {
            String lhsDateiname;
            lhsDateiname = this.getDateiname();
            String rhsDateiname;
            rhsDateiname = that.getDateiname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateiname", lhsDateiname), LocatorUtils.property(thatLocator, "dateiname", rhsDateiname), lhsDateiname, rhsDateiname, (this.dateiname!= null), (that.dateiname!= null))) {
                return false;
            }
        }
        {
            String lhsTitel;
            lhsTitel = this.getTitel();
            String rhsTitel;
            rhsTitel = that.getTitel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titel", lhsTitel), LocatorUtils.property(thatLocator, "titel", rhsTitel), lhsTitel, rhsTitel, (this.titel!= null), (that.titel!= null))) {
                return false;
            }
        }
        {
            String lhsDateityp;
            lhsDateityp = this.getDateityp();
            String rhsDateityp;
            rhsDateityp = that.getDateityp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateityp", lhsDateityp), LocatorUtils.property(thatLocator, "dateityp", rhsDateityp), lhsDateityp, rhsDateityp, (this.dateityp!= null), (that.dateityp!= null))) {
                return false;
            }
        }
        {
            Long lhsAbspieldauer;
            lhsAbspieldauer = this.getAbspieldauer();
            Long rhsAbspieldauer;
            rhsAbspieldauer = that.getAbspieldauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abspieldauer", lhsAbspieldauer), LocatorUtils.property(thatLocator, "abspieldauer", rhsAbspieldauer), lhsAbspieldauer, rhsAbspieldauer, (this.abspieldauer!= null), (that.abspieldauer!= null))) {
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
