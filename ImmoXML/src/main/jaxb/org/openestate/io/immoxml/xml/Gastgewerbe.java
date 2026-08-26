
package org.openestate.io.immoxml.xml;

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
 * Java class for &lt;gastgewerbe&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "gastgewerbe")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Gastgewerbe implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "gastgew_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Gastgewerbe.GastgewTyp gastgewTyp;

    /**
     * Gets the value of the gastgewTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Gastgewerbe.GastgewTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Gastgewerbe.GastgewTyp getGastgewTyp() {
        return gastgewTyp;
    }

    /**
     * Sets the value of the gastgewTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gastgewerbe.GastgewTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGastgewTyp(Gastgewerbe.GastgewTyp value) {
        this.gastgewTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Gastgewerbe.GastgewTyp theGastgewTyp;
            theGastgewTyp = this.getGastgewTyp();
            strategy.appendField(locator, this, "gastgewTyp", buffer, theGastgewTyp, (this.gastgewTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Gastgewerbe) {
            final Gastgewerbe copy = ((Gastgewerbe) draftCopy);
            {
                Boolean gastgewTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gastgewTyp!= null));
                if (gastgewTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    Gastgewerbe.GastgewTyp sourceGastgewTyp;
                    sourceGastgewTyp = this.getGastgewTyp();
                    Gastgewerbe.GastgewTyp copyGastgewTyp = ((Gastgewerbe.GastgewTyp) strategy.copy(LocatorUtils.property(locator, "gastgewTyp", sourceGastgewTyp), sourceGastgewTyp, (this.gastgewTyp!= null)));
                    copy.setGastgewTyp(copyGastgewTyp);
                } else {
                    if (gastgewTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gastgewTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Gastgewerbe();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Gastgewerbe that = ((Gastgewerbe) object);
        {
            Gastgewerbe.GastgewTyp lhsGastgewTyp;
            lhsGastgewTyp = this.getGastgewTyp();
            Gastgewerbe.GastgewTyp rhsGastgewTyp;
            rhsGastgewTyp = that.getGastgewTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gastgewTyp", lhsGastgewTyp), LocatorUtils.property(thatLocator, "gastgewTyp", rhsGastgewTyp), lhsGastgewTyp, rhsGastgewTyp, (this.gastgewTyp!= null), (that.gastgewTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>gastgew_typ</em> attribute in &lt;gastgewerbe&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="GASTRONOMIE"/&gt;
     *     &lt;enumeration value="GASTRONOMIE_UND_WOHNUNG"/&gt;
     *     &lt;enumeration value="PENSIONEN"/&gt;
     *     &lt;enumeration value="HOTELS"/&gt;
     *     &lt;enumeration value="WEITERE_BEHERBERGUNGSBETRIEBE"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum GastgewTyp {

        GASTRONOMIE,
        GASTRONOMIE_UND_WOHNUNG,
        PENSIONEN,
        HOTELS,
        WEITERE_BEHERBERGUNGSBETRIEBE;

        public String value() {
            return name();
        }

        public static Gastgewerbe.GastgewTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
