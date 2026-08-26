
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
 * Java class for &lt;geschlecht&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "geschlecht")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Geschlecht implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "geschl_attr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Geschlecht.GeschlAttr geschlAttr;

    /**
     * Gets the value of the geschlAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Geschlecht.GeschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Geschlecht.GeschlAttr getGeschlAttr() {
        return geschlAttr;
    }

    /**
     * Sets the value of the geschlAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geschlecht.GeschlAttr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setGeschlAttr(Geschlecht.GeschlAttr value) {
        this.geschlAttr = value;
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
            Geschlecht.GeschlAttr theGeschlAttr;
            theGeschlAttr = this.getGeschlAttr();
            strategy.appendField(locator, this, "geschlAttr", buffer, theGeschlAttr, (this.geschlAttr!= null));
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
        if (draftCopy instanceof Geschlecht) {
            final Geschlecht copy = ((Geschlecht) draftCopy);
            {
                Boolean geschlAttrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlAttr!= null));
                if (geschlAttrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Geschlecht.GeschlAttr sourceGeschlAttr;
                    sourceGeschlAttr = this.getGeschlAttr();
                    Geschlecht.GeschlAttr copyGeschlAttr = ((Geschlecht.GeschlAttr) strategy.copy(LocatorUtils.property(locator, "geschlAttr", sourceGeschlAttr), sourceGeschlAttr, (this.geschlAttr!= null)));
                    copy.setGeschlAttr(copyGeschlAttr);
                } else {
                    if (geschlAttrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlAttr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Geschlecht();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Geschlecht that = ((Geschlecht) object);
        {
            Geschlecht.GeschlAttr lhsGeschlAttr;
            lhsGeschlAttr = this.getGeschlAttr();
            Geschlecht.GeschlAttr rhsGeschlAttr;
            rhsGeschlAttr = that.getGeschlAttr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlAttr", lhsGeschlAttr), LocatorUtils.property(thatLocator, "geschlAttr", rhsGeschlAttr), lhsGeschlAttr, rhsGeschlAttr, (this.geschlAttr!= null), (that.geschlAttr!= null))) {
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
     *                     Java enum for <em>geschl_attr</em> attribute in &lt;geschlecht&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="EGAL"/&gt;
     *     &lt;enumeration value="NUR_MANN"/&gt;
     *     &lt;enumeration value="NUR_FRAU"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum GeschlAttr {

        EGAL,
        NUR_MANN,
        NUR_FRAU;

        public String value() {
            return name();
        }

        public static Geschlecht.GeschlAttr fromValue(String v) {
            return valueOf(v);
        }

    }

}
