
package org.openestate.io.openimmo.xml;

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
 * Java class for &lt;bauweise&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "bauweise")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Bauweise implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "MASSIV")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean massiv;
    @XmlAttribute(name = "FERTIGTEILE")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean fertigteile;
    @XmlAttribute(name = "HOLZ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected Boolean holz;

    /**
     * Gets the value of the massiv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getMASSIV() {
        return massiv;
    }

    /**
     * Sets the value of the massiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setMASSIV(Boolean value) {
        this.massiv = value;
    }

    /**
     * Gets the value of the fertigteile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getFERTIGTEILE() {
        return fertigteile;
    }

    /**
     * Sets the value of the fertigteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setFERTIGTEILE(Boolean value) {
        this.fertigteile = value;
    }

    /**
     * Gets the value of the holz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Boolean getHOLZ() {
        return holz;
    }

    /**
     * Sets the value of the holz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setHOLZ(Boolean value) {
        this.holz = value;
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
            Boolean theMASSIV;
            theMASSIV = this.getMASSIV();
            strategy.appendField(locator, this, "massiv", buffer, theMASSIV, (this.massiv!= null));
        }
        {
            Boolean theFERTIGTEILE;
            theFERTIGTEILE = this.getFERTIGTEILE();
            strategy.appendField(locator, this, "fertigteile", buffer, theFERTIGTEILE, (this.fertigteile!= null));
        }
        {
            Boolean theHOLZ;
            theHOLZ = this.getHOLZ();
            strategy.appendField(locator, this, "holz", buffer, theHOLZ, (this.holz!= null));
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
        if (draftCopy instanceof Bauweise) {
            final Bauweise copy = ((Bauweise) draftCopy);
            {
                Boolean massivShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.massiv!= null));
                if (massivShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMASSIV;
                    sourceMASSIV = this.getMASSIV();
                    Boolean copyMASSIV = ((Boolean) strategy.copy(LocatorUtils.property(locator, "massiv", sourceMASSIV), sourceMASSIV, (this.massiv!= null)));
                    copy.setMASSIV(copyMASSIV);
                } else {
                    if (massivShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.massiv = null;
                    }
                }
            }
            {
                Boolean fertigteileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fertigteile!= null));
                if (fertigteileShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFERTIGTEILE;
                    sourceFERTIGTEILE = this.getFERTIGTEILE();
                    Boolean copyFERTIGTEILE = ((Boolean) strategy.copy(LocatorUtils.property(locator, "fertigteile", sourceFERTIGTEILE), sourceFERTIGTEILE, (this.fertigteile!= null)));
                    copy.setFERTIGTEILE(copyFERTIGTEILE);
                } else {
                    if (fertigteileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fertigteile = null;
                    }
                }
            }
            {
                Boolean holzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.holz!= null));
                if (holzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHOLZ;
                    sourceHOLZ = this.getHOLZ();
                    Boolean copyHOLZ = ((Boolean) strategy.copy(LocatorUtils.property(locator, "holz", sourceHOLZ), sourceHOLZ, (this.holz!= null)));
                    copy.setHOLZ(copyHOLZ);
                } else {
                    if (holzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.holz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Bauweise();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Bauweise that = ((Bauweise) object);
        {
            Boolean lhsMASSIV;
            lhsMASSIV = this.getMASSIV();
            Boolean rhsMASSIV;
            rhsMASSIV = that.getMASSIV();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massiv", lhsMASSIV), LocatorUtils.property(thatLocator, "massiv", rhsMASSIV), lhsMASSIV, rhsMASSIV, (this.massiv!= null), (that.massiv!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFERTIGTEILE;
            lhsFERTIGTEILE = this.getFERTIGTEILE();
            Boolean rhsFERTIGTEILE;
            rhsFERTIGTEILE = that.getFERTIGTEILE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertigteile", lhsFERTIGTEILE), LocatorUtils.property(thatLocator, "fertigteile", rhsFERTIGTEILE), lhsFERTIGTEILE, rhsFERTIGTEILE, (this.fertigteile!= null), (that.fertigteile!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHOLZ;
            lhsHOLZ = this.getHOLZ();
            Boolean rhsHOLZ;
            rhsHOLZ = that.getHOLZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "holz", lhsHOLZ), LocatorUtils.property(thatLocator, "holz", rhsHOLZ), lhsHOLZ, rhsHOLZ, (this.holz!= null), (that.holz!= null))) {
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
