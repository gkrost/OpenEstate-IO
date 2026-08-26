package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for VersteigerungsterminTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VersteigerungsterminTyp">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>date">
 *       <attribute name="Wiederholungstermin" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="Teilungsversteigerung" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersteigerungsterminTyp", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class VersteigerungsterminTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlValue
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected Calendar value;
    @XmlAttribute(name = "Wiederholungstermin")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected Boolean wiederholungstermin;
    @XmlAttribute(name = "Teilungsversteigerung")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected Boolean teilungsversteigerung;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Calendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setValue(Calendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the wiederholungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Boolean getWiederholungstermin() {
        if (wiederholungstermin == null) {
            return false;
        } else {
            return wiederholungstermin;
        }
    }

    /**
     * Sets the value of the wiederholungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setWiederholungstermin(Boolean value) {
        this.wiederholungstermin = value;
    }

    /**
     * Gets the value of the teilungsversteigerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Boolean getTeilungsversteigerung() {
        if (teilungsversteigerung == null) {
            return false;
        } else {
            return teilungsversteigerung;
        }
    }

    /**
     * Sets the value of the teilungsversteigerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setTeilungsversteigerung(Boolean value) {
        this.teilungsversteigerung = value;
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
            Calendar theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            Boolean theWiederholungstermin;
            theWiederholungstermin = this.getWiederholungstermin();
            strategy.appendField(locator, this, "wiederholungstermin", buffer, theWiederholungstermin, (this.wiederholungstermin!= null));
        }
        {
            Boolean theTeilungsversteigerung;
            theTeilungsversteigerung = this.getTeilungsversteigerung();
            strategy.appendField(locator, this, "teilungsversteigerung", buffer, theTeilungsversteigerung, (this.teilungsversteigerung!= null));
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
        if (draftCopy instanceof VersteigerungsterminTyp) {
            final VersteigerungsterminTyp copy = ((VersteigerungsterminTyp) draftCopy);
            {
                Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceValue;
                    sourceValue = this.getValue();
                    Calendar copyValue = ((Calendar) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                    copy.setValue(copyValue);
                } else {
                    if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.value = null;
                    }
                }
            }
            {
                Boolean wiederholungsterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wiederholungstermin!= null));
                if (wiederholungsterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWiederholungstermin;
                    sourceWiederholungstermin = this.getWiederholungstermin();
                    Boolean copyWiederholungstermin = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wiederholungstermin", sourceWiederholungstermin), sourceWiederholungstermin, (this.wiederholungstermin!= null)));
                    copy.setWiederholungstermin(copyWiederholungstermin);
                } else {
                    if (wiederholungsterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wiederholungstermin = null;
                    }
                }
            }
            {
                Boolean teilungsversteigerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilungsversteigerung!= null));
                if (teilungsversteigerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTeilungsversteigerung;
                    sourceTeilungsversteigerung = this.getTeilungsversteigerung();
                    Boolean copyTeilungsversteigerung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "teilungsversteigerung", sourceTeilungsversteigerung), sourceTeilungsversteigerung, (this.teilungsversteigerung!= null)));
                    copy.setTeilungsversteigerung(copyTeilungsversteigerung);
                } else {
                    if (teilungsversteigerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilungsversteigerung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new VersteigerungsterminTyp();
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
        final VersteigerungsterminTyp that = ((VersteigerungsterminTyp) object);
        {
            Calendar lhsValue;
            lhsValue = this.getValue();
            Calendar rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWiederholungstermin;
            lhsWiederholungstermin = this.getWiederholungstermin();
            Boolean rhsWiederholungstermin;
            rhsWiederholungstermin = that.getWiederholungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiederholungstermin", lhsWiederholungstermin), LocatorUtils.property(thatLocator, "wiederholungstermin", rhsWiederholungstermin), lhsWiederholungstermin, rhsWiederholungstermin, (this.wiederholungstermin!= null), (that.wiederholungstermin!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTeilungsversteigerung;
            lhsTeilungsversteigerung = this.getTeilungsversteigerung();
            Boolean rhsTeilungsversteigerung;
            rhsTeilungsversteigerung = that.getTeilungsversteigerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilungsversteigerung", lhsTeilungsversteigerung), LocatorUtils.property(thatLocator, "teilungsversteigerung", rhsTeilungsversteigerung), lhsTeilungsversteigerung, rhsTeilungsversteigerung, (this.teilungsversteigerung!= null), (that.teilungsversteigerung!= null))) {
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
