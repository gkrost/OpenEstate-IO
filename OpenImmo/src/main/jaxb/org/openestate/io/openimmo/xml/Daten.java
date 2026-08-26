
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * Java class for &lt;daten&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pfad",
    "anhanginhalt"
})
@XmlRootElement(name = "daten")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Daten implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected String pfad;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected byte[] anhanginhalt;

    /**
     * Gets the value of the pfad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String getPfad() {
        return pfad;
    }

    /**
     * Sets the value of the pfad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setPfad(String value) {
        this.pfad = value;
    }

    /**
     * Gets the value of the anhanginhalt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public byte[] getAnhanginhalt() {
        return anhanginhalt;
    }

    /**
     * Sets the value of the anhanginhalt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setAnhanginhalt(byte[] value) {
        this.anhanginhalt = value;
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
            String thePfad;
            thePfad = this.getPfad();
            strategy.appendField(locator, this, "pfad", buffer, thePfad, (this.pfad!= null));
        }
        {
            byte[] theAnhanginhalt;
            theAnhanginhalt = this.getAnhanginhalt();
            strategy.appendField(locator, this, "anhanginhalt", buffer, theAnhanginhalt, (this.anhanginhalt!= null));
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
        if (draftCopy instanceof Daten) {
            final Daten copy = ((Daten) draftCopy);
            {
                Boolean pfadShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pfad!= null));
                if (pfadShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePfad;
                    sourcePfad = this.getPfad();
                    String copyPfad = ((String) strategy.copy(LocatorUtils.property(locator, "pfad", sourcePfad), sourcePfad, (this.pfad!= null)));
                    copy.setPfad(copyPfad);
                } else {
                    if (pfadShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pfad = null;
                    }
                }
            }
            {
                Boolean anhanginhaltShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anhanginhalt!= null));
                if (anhanginhaltShouldBeCopiedAndSet == Boolean.TRUE) {
                    byte[] sourceAnhanginhalt;
                    sourceAnhanginhalt = this.getAnhanginhalt();
                    byte[] copyAnhanginhalt = ((byte[]) strategy.copy(LocatorUtils.property(locator, "anhanginhalt", sourceAnhanginhalt), sourceAnhanginhalt, (this.anhanginhalt!= null)));
                    copy.setAnhanginhalt(copyAnhanginhalt);
                } else {
                    if (anhanginhaltShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anhanginhalt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Daten();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Daten that = ((Daten) object);
        {
            String lhsPfad;
            lhsPfad = this.getPfad();
            String rhsPfad;
            rhsPfad = that.getPfad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pfad", lhsPfad), LocatorUtils.property(thatLocator, "pfad", rhsPfad), lhsPfad, rhsPfad, (this.pfad!= null), (that.pfad!= null))) {
                return false;
            }
        }
        {
            byte[] lhsAnhanginhalt;
            lhsAnhanginhalt = this.getAnhanginhalt();
            byte[] rhsAnhanginhalt;
            rhsAnhanginhalt = that.getAnhanginhalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anhanginhalt", lhsAnhanginhalt), LocatorUtils.property(thatLocator, "anhanginhalt", rhsAnhanginhalt), lhsAnhanginhalt, rhsAnhanginhalt, (this.anhanginhalt!= null), (that.anhanginhalt!= null))) {
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

}
