package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ambience complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ambience">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="heating" type="{http://feed.immobiliare.it}heating" minOccurs="0"/>
 *         <element name="air-conditioning" type="{http://feed.immobiliare.it}air-conditioning" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ambience", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class Ambience implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Heating heating;
    @XmlElement(name = "air-conditioning")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected AirConditioning airConditioning;

    /**
     * Gets the value of the heating property.
     * 
     * @return
     *     possible object is
     *     {@link Heating }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Heating getHeating() {
        return heating;
    }

    /**
     * Sets the value of the heating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heating }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setHeating(Heating value) {
        this.heating = value;
    }

    /**
     * Gets the value of the airConditioning property.
     * 
     * @return
     *     possible object is
     *     {@link AirConditioning }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public AirConditioning getAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirConditioning }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setAirConditioning(AirConditioning value) {
        this.airConditioning = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Heating theHeating;
            theHeating = this.getHeating();
            strategy.appendField(locator, this, "heating", buffer, theHeating, (this.heating!= null));
        }
        {
            AirConditioning theAirConditioning;
            theAirConditioning = this.getAirConditioning();
            strategy.appendField(locator, this, "airConditioning", buffer, theAirConditioning, (this.airConditioning!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Ambience) {
            final Ambience copy = ((Ambience) draftCopy);
            {
                Boolean heatingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heating!= null));
                if (heatingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Heating sourceHeating;
                    sourceHeating = this.getHeating();
                    Heating copyHeating = ((Heating) strategy.copy(LocatorUtils.property(locator, "heating", sourceHeating), sourceHeating, (this.heating!= null)));
                    copy.setHeating(copyHeating);
                } else {
                    if (heatingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heating = null;
                    }
                }
            }
            {
                Boolean airConditioningShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.airConditioning!= null));
                if (airConditioningShouldBeCopiedAndSet == Boolean.TRUE) {
                    AirConditioning sourceAirConditioning;
                    sourceAirConditioning = this.getAirConditioning();
                    AirConditioning copyAirConditioning = ((AirConditioning) strategy.copy(LocatorUtils.property(locator, "airConditioning", sourceAirConditioning), sourceAirConditioning, (this.airConditioning!= null)));
                    copy.setAirConditioning(copyAirConditioning);
                } else {
                    if (airConditioningShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.airConditioning = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new Ambience();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Ambience that = ((Ambience) object);
        {
            Heating lhsHeating;
            lhsHeating = this.getHeating();
            Heating rhsHeating;
            rhsHeating = that.getHeating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heating", lhsHeating), LocatorUtils.property(thatLocator, "heating", rhsHeating), lhsHeating, rhsHeating, (this.heating!= null), (that.heating!= null))) {
                return false;
            }
        }
        {
            AirConditioning lhsAirConditioning;
            lhsAirConditioning = this.getAirConditioning();
            AirConditioning rhsAirConditioning;
            rhsAirConditioning = that.getAirConditioning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airConditioning", lhsAirConditioning), LocatorUtils.property(thatLocator, "airConditioning", rhsAirConditioning), lhsAirConditioning, rhsAirConditioning, (this.airConditioning!= null), (that.airConditioning!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
