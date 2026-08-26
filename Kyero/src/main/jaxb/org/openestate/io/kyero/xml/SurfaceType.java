package org.openestate.io.kyero.xml;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
 * <p>Java class for surfaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="surfaceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="built" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="plot" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surfaceType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
public class SurfaceType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected BigInteger built;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected BigInteger plot;

    /**
     * Gets the value of the built property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public BigInteger getBuilt() {
        return built;
    }

    /**
     * Sets the value of the built property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setBuilt(BigInteger value) {
        this.built = value;
    }

    /**
     * Gets the value of the plot property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public BigInteger getPlot() {
        return plot;
    }

    /**
     * Sets the value of the plot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setPlot(BigInteger value) {
        this.plot = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            BigInteger theBuilt;
            theBuilt = this.getBuilt();
            strategy.appendField(locator, this, "built", buffer, theBuilt, (this.built!= null));
        }
        {
            BigInteger thePlot;
            thePlot = this.getPlot();
            strategy.appendField(locator, this, "plot", buffer, thePlot, (this.plot!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SurfaceType) {
            final SurfaceType copy = ((SurfaceType) draftCopy);
            {
                Boolean builtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.built!= null));
                if (builtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceBuilt;
                    sourceBuilt = this.getBuilt();
                    BigInteger copyBuilt = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "built", sourceBuilt), sourceBuilt, (this.built!= null)));
                    copy.setBuilt(copyBuilt);
                } else {
                    if (builtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.built = null;
                    }
                }
            }
            {
                Boolean plotShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plot!= null));
                if (plotShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourcePlot;
                    sourcePlot = this.getPlot();
                    BigInteger copyPlot = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "plot", sourcePlot), sourcePlot, (this.plot!= null)));
                    copy.setPlot(copyPlot);
                } else {
                    if (plotShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object createNewInstance() {
        return new SurfaceType();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SurfaceType that = ((SurfaceType) object);
        {
            BigInteger lhsBuilt;
            lhsBuilt = this.getBuilt();
            BigInteger rhsBuilt;
            rhsBuilt = that.getBuilt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "built", lhsBuilt), LocatorUtils.property(thatLocator, "built", rhsBuilt), lhsBuilt, rhsBuilt, (this.built!= null), (that.built!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPlot;
            lhsPlot = this.getPlot();
            BigInteger rhsPlot;
            rhsPlot = that.getPlot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plot", lhsPlot), LocatorUtils.property(thatLocator, "plot", rhsPlot), lhsPlot, rhsPlot, (this.plot!= null), (that.plot!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
