
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
 * Java class for &lt;sonstige&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sonstige")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Sonstige implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "sonstige_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Sonstige.SonstigeTyp sonstigeTyp;

    /**
     * Gets the value of the sonstigeTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Sonstige.SonstigeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Sonstige.SonstigeTyp getSonstigeTyp() {
        return sonstigeTyp;
    }

    /**
     * Sets the value of the sonstigeTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sonstige.SonstigeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setSonstigeTyp(Sonstige.SonstigeTyp value) {
        this.sonstigeTyp = value;
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
            Sonstige.SonstigeTyp theSonstigeTyp;
            theSonstigeTyp = this.getSonstigeTyp();
            strategy.appendField(locator, this, "sonstigeTyp", buffer, theSonstigeTyp, (this.sonstigeTyp!= null));
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
        if (draftCopy instanceof Sonstige) {
            final Sonstige copy = ((Sonstige) draftCopy);
            {
                Boolean sonstigeTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstigeTyp!= null));
                if (sonstigeTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Sonstige.SonstigeTyp sourceSonstigeTyp;
                    sourceSonstigeTyp = this.getSonstigeTyp();
                    Sonstige.SonstigeTyp copySonstigeTyp = ((Sonstige.SonstigeTyp) strategy.copy(LocatorUtils.property(locator, "sonstigeTyp", sourceSonstigeTyp), sourceSonstigeTyp, (this.sonstigeTyp!= null)));
                    copy.setSonstigeTyp(copySonstigeTyp);
                } else {
                    if (sonstigeTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstigeTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Sonstige();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Sonstige that = ((Sonstige) object);
        {
            Sonstige.SonstigeTyp lhsSonstigeTyp;
            lhsSonstigeTyp = this.getSonstigeTyp();
            Sonstige.SonstigeTyp rhsSonstigeTyp;
            rhsSonstigeTyp = that.getSonstigeTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeTyp", lhsSonstigeTyp), LocatorUtils.property(thatLocator, "sonstigeTyp", rhsSonstigeTyp), lhsSonstigeTyp, rhsSonstigeTyp, (this.sonstigeTyp!= null), (that.sonstigeTyp!= null))) {
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
     *                     Java enum for <em>sonstige_typ</em> attribute in &lt;sonstige&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="PARKHAUS"/&gt;
     *     &lt;enumeration value="TANKSTELLE"/&gt;
     *     &lt;enumeration value="KRANKENHAUS"/&gt;
     *     &lt;enumeration value="SONSTIGE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum SonstigeTyp {

        PARKHAUS,
        TANKSTELLE,
        KRANKENHAUS,
        SONSTIGE;

        public String value() {
            return name();
        }

        public static Sonstige.SonstigeTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
