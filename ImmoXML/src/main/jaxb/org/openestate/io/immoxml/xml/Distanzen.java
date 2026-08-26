
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 * Java class for &lt;distanzen&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "distanzen")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Distanzen implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "float")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected BigDecimal value;
    @XmlAttribute(name = "distanz_zu", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Distanzen.DistanzZu distanzZu;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the distanzZu property.
     * 
     * @return
     *     possible object is
     *     {@link Distanzen.DistanzZu }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Distanzen.DistanzZu getDistanzZu() {
        return distanzZu;
    }

    /**
     * Sets the value of the distanzZu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distanzen.DistanzZu }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setDistanzZu(Distanzen.DistanzZu value) {
        this.distanzZu = value;
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
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Distanzen.DistanzZu theDistanzZu;
            theDistanzZu = this.getDistanzZu();
            strategy.appendField(locator, this, "distanzZu", buffer, theDistanzZu, (this.distanzZu!= null));
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
        if (draftCopy instanceof Distanzen) {
            final Distanzen copy = ((Distanzen) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceValue;
                    sourceValue = this.getValue();
                    BigDecimal copyValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean distanzZuShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.distanzZu!= null));
                if (distanzZuShouldBeCopiedAndSet == Boolean.TRUE) {
                    Distanzen.DistanzZu sourceDistanzZu;
                    sourceDistanzZu = this.getDistanzZu();
                    Distanzen.DistanzZu copyDistanzZu = ((Distanzen.DistanzZu) strategy.copy(LocatorUtils.property(locator, "distanzZu", sourceDistanzZu), sourceDistanzZu, (this.distanzZu!= null)));
                    copy.setDistanzZu(copyDistanzZu);
                } else {
                    if (distanzZuShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.distanzZu = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Distanzen();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Distanzen that = ((Distanzen) object);
        {
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            Distanzen.DistanzZu lhsDistanzZu;
            lhsDistanzZu = this.getDistanzZu();
            Distanzen.DistanzZu rhsDistanzZu;
            rhsDistanzZu = that.getDistanzZu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distanzZu", lhsDistanzZu), LocatorUtils.property(thatLocator, "distanzZu", rhsDistanzZu), lhsDistanzZu, rhsDistanzZu, (this.distanzZu!= null), (that.distanzZu!= null))) {
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
     *                     Java enum for <em>distanz_zu</em> attribute in &lt;distanzen&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="FLUGHAFEN"/&gt;
     *     &lt;enumeration value="FERNBAHNHOF"/&gt;
     *     &lt;enumeration value="AUTOBAHN"/&gt;
     *     &lt;enumeration value="US_BAHN"/&gt;
     *     &lt;enumeration value="BUS"/&gt;
     *     &lt;enumeration value="KINDERGAERTEN"/&gt;
     *     &lt;enumeration value="GRUNDSCHULE"/&gt;
     *     &lt;enumeration value="HAUPTSCHULE"/&gt;
     *     &lt;enumeration value="REALSCHULE"/&gt;
     *     &lt;enumeration value="GESAMTSCHULE"/&gt;
     *     &lt;enumeration value="GYMNASIUM"/&gt;
     *     &lt;enumeration value="ZENTRUM"/&gt;
     *     &lt;enumeration value="EINKAUFSMOEGLICHKEITEN"/&gt;
     *     &lt;enumeration value="GASTSTAETTEN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public enum DistanzZu {

        FLUGHAFEN,
        FERNBAHNHOF,
        AUTOBAHN,
        US_BAHN,
        BUS,
        KINDERGAERTEN,
        GRUNDSCHULE,
        HAUPTSCHULE,
        REALSCHULE,
        GESAMTSCHULE,
        GYMNASIUM,
        ZENTRUM,
        EINKAUFSMOEGLICHKEITEN,
        GASTSTAETTEN;

        public String value() {
            return name();
        }

        public static Distanzen.DistanzZu fromValue(String v) {
            return valueOf(v);
        }

    }

}
