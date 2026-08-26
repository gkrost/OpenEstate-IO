package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ImmobilienAdresseBaseTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImmobilienAdresseBaseTyp">
 *   <complexContent>
 *     <extension base="{http://www.immobilienscout24.de/immobilientransfer}AdresseBaseTyp">
 *       <attribute name="InternationaleRegion" type="{http://www.immobilienscout24.de/immobilientransfer}Text100Typ" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilienAdresseBaseTyp")
@XmlSeeAlso({
    ImmobilienAdresseTyp.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class ImmobilienAdresseBaseTyp
    extends AdresseBaseTyp
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "InternationaleRegion")
    @XmlJavaTypeAdapter(Adapter9 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String internationaleRegion;

    /**
     * Gets the value of the internationaleRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getInternationaleRegion() {
        return internationaleRegion;
    }

    /**
     * Sets the value of the internationaleRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setInternationaleRegion(String value) {
        this.internationaleRegion = value;
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
            String theInternationaleRegion;
            theInternationaleRegion = this.getInternationaleRegion();
            strategy.appendField(locator, this, "internationaleRegion", buffer, theInternationaleRegion, (this.internationaleRegion!= null));
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
        if (draftCopy instanceof ImmobilienAdresseBaseTyp) {
            final ImmobilienAdresseBaseTyp copy = ((ImmobilienAdresseBaseTyp) draftCopy);
            {
                Boolean internationaleRegionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internationaleRegion!= null));
                if (internationaleRegionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInternationaleRegion;
                    sourceInternationaleRegion = this.getInternationaleRegion();
                    String copyInternationaleRegion = ((String) strategy.copy(LocatorUtils.property(locator, "internationaleRegion", sourceInternationaleRegion), sourceInternationaleRegion, (this.internationaleRegion!= null)));
                    copy.setInternationaleRegion(copyInternationaleRegion);
                } else {
                    if (internationaleRegionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.internationaleRegion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new ImmobilienAdresseBaseTyp();
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
        final ImmobilienAdresseBaseTyp that = ((ImmobilienAdresseBaseTyp) object);
        {
            String lhsInternationaleRegion;
            lhsInternationaleRegion = this.getInternationaleRegion();
            String rhsInternationaleRegion;
            rhsInternationaleRegion = that.getInternationaleRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationaleRegion", lhsInternationaleRegion), LocatorUtils.property(thatLocator, "internationaleRegion", rhsInternationaleRegion), lhsInternationaleRegion, rhsInternationaleRegion, (this.internationaleRegion!= null), (that.internationaleRegion!= null))) {
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
