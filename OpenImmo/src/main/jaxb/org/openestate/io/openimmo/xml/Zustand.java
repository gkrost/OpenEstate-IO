
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * Java class for &lt;zustand&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zustand")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Zustand implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "zustand_art")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Zustand.ZustandArt zustandArt;

    /**
     * Gets the value of the zustandArt property.
     * 
     * @return
     *     possible object is
     *     {@link Zustand.ZustandArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Zustand.ZustandArt getZustandArt() {
        return zustandArt;
    }

    /**
     * Sets the value of the zustandArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zustand.ZustandArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setZustandArt(Zustand.ZustandArt value) {
        this.zustandArt = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Zustand.ZustandArt theZustandArt;
            theZustandArt = this.getZustandArt();
            strategy.appendField(locator, this, "zustandArt", buffer, theZustandArt, (this.zustandArt!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Zustand) {
            final Zustand copy = ((Zustand) draftCopy);
            {
                Boolean zustandArtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustandArt!= null));
                if (zustandArtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Zustand.ZustandArt sourceZustandArt;
                    sourceZustandArt = this.getZustandArt();
                    Zustand.ZustandArt copyZustandArt = ((Zustand.ZustandArt) strategy.copy(LocatorUtils.property(locator, "zustandArt", sourceZustandArt), sourceZustandArt, (this.zustandArt!= null)));
                    copy.setZustandArt(copyZustandArt);
                } else {
                    if (zustandArtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustandArt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Zustand();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Zustand that = ((Zustand) object);
        {
            Zustand.ZustandArt lhsZustandArt;
            lhsZustandArt = this.getZustandArt();
            Zustand.ZustandArt rhsZustandArt;
            rhsZustandArt = that.getZustandArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustandArt", lhsZustandArt), LocatorUtils.property(thatLocator, "zustandArt", rhsZustandArt), lhsZustandArt, rhsZustandArt, (this.zustandArt!= null), (that.zustandArt!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>zustand</em> attribute in &lt;zustand_art&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="ERSTBEZUG"/&gt;
     *     &lt;enumeration value="TEIL_VOLLRENOVIERUNGSBED"/&gt;
     *     &lt;enumeration value="NEUWERTIG"/&gt;
     *     &lt;enumeration value="TEIL_VOLLSANIERT"/&gt;
     *     &lt;enumeration value="TEIL_VOLLRENOVIERT"/&gt;
     *     &lt;enumeration value="TEIL_SANIERT"/&gt;
     *     &lt;enumeration value="VOLL_SANIERT"/&gt;
     *     &lt;enumeration value="SANIERUNGSBEDUERFTIG"/&gt;
     *     &lt;enumeration value="BAUFAELLIG"/&gt;
     *     &lt;enumeration value="NACH_VEREINBARUNG"/&gt;
     *     &lt;enumeration value="MODERNISIERT"/&gt;
     *     &lt;enumeration value="GEPFLEGT"/&gt;
     *     &lt;enumeration value="ROHBAU"/&gt;
     *     &lt;enumeration value="ENTKERNT"/&gt;
     *     &lt;enumeration value="ABRISSOBJEKT"/&gt;
     *     &lt;enumeration value="PROJEKTIERT"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum ZustandArt {

        ERSTBEZUG,
        TEIL_VOLLRENOVIERUNGSBED,
        NEUWERTIG,
        TEIL_VOLLSANIERT,
        TEIL_VOLLRENOVIERT,
        TEIL_SANIERT,
        VOLL_SANIERT,
        SANIERUNGSBEDUERFTIG,
        BAUFAELLIG,
        NACH_VEREINBARUNG,
        MODERNISIERT,
        GEPFLEGT,
        ROHBAU,
        ENTKERNT,
        ABRISSOBJEKT,
        PROJEKTIERT;

        public String value() {
            return name();
        }

        public static Zustand.ZustandArt fromValue(String v) {
            return valueOf(v);
        }

    }

}
