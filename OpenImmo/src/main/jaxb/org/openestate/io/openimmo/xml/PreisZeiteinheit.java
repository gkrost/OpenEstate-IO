
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
 * Java class for &lt;preis_zeiteinheit&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "preis_zeiteinheit")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class PreisZeiteinheit implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "zeiteinheit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected PreisZeiteinheit.Zeiteinheit zeiteinheit;

    /**
     * Gets the value of the zeiteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public PreisZeiteinheit.Zeiteinheit getZeiteinheit() {
        return zeiteinheit;
    }

    /**
     * Sets the value of the zeiteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreisZeiteinheit.Zeiteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setZeiteinheit(PreisZeiteinheit.Zeiteinheit value) {
        this.zeiteinheit = value;
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
            PreisZeiteinheit.Zeiteinheit theZeiteinheit;
            theZeiteinheit = this.getZeiteinheit();
            strategy.appendField(locator, this, "zeiteinheit", buffer, theZeiteinheit, (this.zeiteinheit!= null));
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
        if (draftCopy instanceof PreisZeiteinheit) {
            final PreisZeiteinheit copy = ((PreisZeiteinheit) draftCopy);
            {
                Boolean zeiteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeiteinheit!= null));
                if (zeiteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    PreisZeiteinheit.Zeiteinheit sourceZeiteinheit;
                    sourceZeiteinheit = this.getZeiteinheit();
                    PreisZeiteinheit.Zeiteinheit copyZeiteinheit = ((PreisZeiteinheit.Zeiteinheit) strategy.copy(LocatorUtils.property(locator, "zeiteinheit", sourceZeiteinheit), sourceZeiteinheit, (this.zeiteinheit!= null)));
                    copy.setZeiteinheit(copyZeiteinheit);
                } else {
                    if (zeiteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeiteinheit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new PreisZeiteinheit();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PreisZeiteinheit that = ((PreisZeiteinheit) object);
        {
            PreisZeiteinheit.Zeiteinheit lhsZeiteinheit;
            lhsZeiteinheit = this.getZeiteinheit();
            PreisZeiteinheit.Zeiteinheit rhsZeiteinheit;
            rhsZeiteinheit = that.getZeiteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeiteinheit", lhsZeiteinheit), LocatorUtils.property(thatLocator, "zeiteinheit", rhsZeiteinheit), lhsZeiteinheit, rhsZeiteinheit, (this.zeiteinheit!= null), (that.zeiteinheit!= null))) {
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
     *                     Java enum for <em>zeiteinheit</em> attribute in &lt;preis_zeiteinheit&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="TAG"/&gt;
     *     &lt;enumeration value="WOCHE"/&gt;
     *     &lt;enumeration value="MONAT"/&gt;
     *     &lt;enumeration value="JAHR"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum Zeiteinheit {

        TAG,
        WOCHE,
        MONAT,
        JAHR;

        public String value() {
            return name();
        }

        public static PreisZeiteinheit.Zeiteinheit fromValue(String v) {
            return valueOf(v);
        }

    }

}
