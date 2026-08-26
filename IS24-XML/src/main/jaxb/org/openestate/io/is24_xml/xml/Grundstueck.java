package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
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
 *         <element name="Vermarktung" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGrundstueckTypAlt"/>
 *         <element name="BebaubarMit" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckEmpfohleneNutzung" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}GrundstueckKategorienTyp" />
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
public class Grundstueck
    extends GrundstueckTypBase
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Vermarktung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected VermarktungGrundstueckTypAlt vermarktung;
    @XmlElement(name = "BebaubarMit")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected GrundstueckEmpfohleneNutzung bebaubarMit;
    @XmlAttribute(name = "Objektkategorie2")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected GrundstueckKategorienTyp objektkategorie2;

    /**
     * Gets the value of the vermarktung property.
     * 
     * @return
     *     possible object is
     *     {@link VermarktungGrundstueckTypAlt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public VermarktungGrundstueckTypAlt getVermarktung() {
        return vermarktung;
    }

    /**
     * Sets the value of the vermarktung property.
     * 
     * @param value
     *     allowed object is
     *     {@link VermarktungGrundstueckTypAlt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setVermarktung(VermarktungGrundstueckTypAlt value) {
        this.vermarktung = value;
    }

    /**
     * Gets the value of the bebaubarMit property.
     * 
     * @return
     *     possible object is
     *     {@link GrundstueckEmpfohleneNutzung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public GrundstueckEmpfohleneNutzung getBebaubarMit() {
        return bebaubarMit;
    }

    /**
     * Sets the value of the bebaubarMit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrundstueckEmpfohleneNutzung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setBebaubarMit(GrundstueckEmpfohleneNutzung value) {
        this.bebaubarMit = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link GrundstueckKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public GrundstueckKategorienTyp getObjektkategorie2() {
        return objektkategorie2;
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrundstueckKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setObjektkategorie2(GrundstueckKategorienTyp value) {
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
            VermarktungGrundstueckTypAlt theVermarktung;
            theVermarktung = this.getVermarktung();
            strategy.appendField(locator, this, "vermarktung", buffer, theVermarktung, (this.vermarktung!= null));
        }
        {
            GrundstueckEmpfohleneNutzung theBebaubarMit;
            theBebaubarMit = this.getBebaubarMit();
            strategy.appendField(locator, this, "bebaubarMit", buffer, theBebaubarMit, (this.bebaubarMit!= null));
        }
        {
            GrundstueckKategorienTyp theObjektkategorie2;
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
        if (draftCopy instanceof Grundstueck) {
            final Grundstueck copy = ((Grundstueck) draftCopy);
            {
                Boolean vermarktungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermarktung!= null));
                if (vermarktungShouldBeCopiedAndSet == Boolean.TRUE) {
                    VermarktungGrundstueckTypAlt sourceVermarktung;
                    sourceVermarktung = this.getVermarktung();
                    VermarktungGrundstueckTypAlt copyVermarktung = ((VermarktungGrundstueckTypAlt) strategy.copy(LocatorUtils.property(locator, "vermarktung", sourceVermarktung), sourceVermarktung, (this.vermarktung!= null)));
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
                    GrundstueckEmpfohleneNutzung sourceBebaubarMit;
                    sourceBebaubarMit = this.getBebaubarMit();
                    GrundstueckEmpfohleneNutzung copyBebaubarMit = ((GrundstueckEmpfohleneNutzung) strategy.copy(LocatorUtils.property(locator, "bebaubarMit", sourceBebaubarMit), sourceBebaubarMit, (this.bebaubarMit!= null)));
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
                    GrundstueckKategorienTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    GrundstueckKategorienTyp copyObjektkategorie2 = ((GrundstueckKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
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
        return new Grundstueck();
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
        final Grundstueck that = ((Grundstueck) object);
        {
            VermarktungGrundstueckTypAlt lhsVermarktung;
            lhsVermarktung = this.getVermarktung();
            VermarktungGrundstueckTypAlt rhsVermarktung;
            rhsVermarktung = that.getVermarktung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermarktung", lhsVermarktung), LocatorUtils.property(thatLocator, "vermarktung", rhsVermarktung), lhsVermarktung, rhsVermarktung, (this.vermarktung!= null), (that.vermarktung!= null))) {
                return false;
            }
        }
        {
            GrundstueckEmpfohleneNutzung lhsBebaubarMit;
            lhsBebaubarMit = this.getBebaubarMit();
            GrundstueckEmpfohleneNutzung rhsBebaubarMit;
            rhsBebaubarMit = that.getBebaubarMit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bebaubarMit", lhsBebaubarMit), LocatorUtils.property(thatLocator, "bebaubarMit", rhsBebaubarMit), lhsBebaubarMit, rhsBebaubarMit, (this.bebaubarMit!= null), (that.bebaubarMit!= null))) {
                return false;
            }
        }
        {
            GrundstueckKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            GrundstueckKategorienTyp rhsObjektkategorie2;
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
