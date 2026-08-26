
package org.openestate.io.immoxml.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * Java class for &lt;kueche&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "kueche")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
public class Kueche implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "EBK")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean ebk;
    @XmlAttribute(name = "OFFEN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean offen;

    /**
     * Gets the value of the ebk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getEBK() {
        return ebk;
    }

    /**
     * Sets the value of the ebk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setEBK(Boolean value) {
        this.ebk = value;
    }

    /**
     * Gets the value of the offen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getOFFEN() {
        return offen;
    }

    /**
     * Sets the value of the offen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public void setOFFEN(Boolean value) {
        this.offen = value;
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
            Boolean theEBK;
            theEBK = this.getEBK();
            strategy.appendField(locator, this, "ebk", buffer, theEBK, (this.ebk!= null));
        }
        {
            Boolean theOFFEN;
            theOFFEN = this.getOFFEN();
            strategy.appendField(locator, this, "offen", buffer, theOFFEN, (this.offen!= null));
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
        if (draftCopy instanceof Kueche) {
            final Kueche copy = ((Kueche) draftCopy);
            {
                Boolean ebkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ebk!= null));
                if (ebkShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEBK;
                    sourceEBK = this.getEBK();
                    Boolean copyEBK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ebk", sourceEBK), sourceEBK, (this.ebk!= null)));
                    copy.setEBK(copyEBK);
                } else {
                    if (ebkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ebk = null;
                    }
                }
            }
            {
                Boolean offenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.offen!= null));
                if (offenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOFFEN;
                    sourceOFFEN = this.getOFFEN();
                    Boolean copyOFFEN = ((Boolean) strategy.copy(LocatorUtils.property(locator, "offen", sourceOFFEN), sourceOFFEN, (this.offen!= null)));
                    copy.setOFFEN(copyOFFEN);
                } else {
                    if (offenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.offen = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Kueche();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:30:44+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Kueche that = ((Kueche) object);
        {
            Boolean lhsEBK;
            lhsEBK = this.getEBK();
            Boolean rhsEBK;
            rhsEBK = that.getEBK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ebk", lhsEBK), LocatorUtils.property(thatLocator, "ebk", rhsEBK), lhsEBK, rhsEBK, (this.ebk!= null), (that.ebk!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOFFEN;
            lhsOFFEN = this.getOFFEN();
            Boolean rhsOFFEN;
            rhsOFFEN = that.getOFFEN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offen", lhsOFFEN), LocatorUtils.property(thatLocator, "offen", rhsOFFEN), lhsOFFEN, rhsOFFEN, (this.offen!= null), (that.offen!= null))) {
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

}
