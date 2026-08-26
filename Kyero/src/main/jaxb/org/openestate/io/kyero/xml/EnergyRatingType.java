package org.openestate.io.kyero.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for energyRatingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="energyRatingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="consumption" type="{}energyRatingMarkType" minOccurs="0"/>
 *         <element name="emissions" type="{}energyRatingMarkType" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyRatingType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
public class EnergyRatingType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected EnergyRatingMarkType consumption;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected EnergyRatingMarkType emissions;

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public EnergyRatingMarkType getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setConsumption(EnergyRatingMarkType value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the emissions property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public EnergyRatingMarkType getEmissions() {
        return emissions;
    }

    /**
     * Sets the value of the emissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingMarkType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setEmissions(EnergyRatingMarkType value) {
        this.emissions = value;
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
            EnergyRatingMarkType theConsumption;
            theConsumption = this.getConsumption();
            strategy.appendField(locator, this, "consumption", buffer, theConsumption, (this.consumption!= null));
        }
        {
            EnergyRatingMarkType theEmissions;
            theEmissions = this.getEmissions();
            strategy.appendField(locator, this, "emissions", buffer, theEmissions, (this.emissions!= null));
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
        if (draftCopy instanceof EnergyRatingType) {
            final EnergyRatingType copy = ((EnergyRatingType) draftCopy);
            {
                Boolean consumptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.consumption!= null));
                if (consumptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyRatingMarkType sourceConsumption;
                    sourceConsumption = this.getConsumption();
                    EnergyRatingMarkType copyConsumption = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "consumption", sourceConsumption), sourceConsumption, (this.consumption!= null)));
                    copy.setConsumption(copyConsumption);
                } else {
                    if (consumptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.consumption = null;
                    }
                }
            }
            {
                Boolean emissionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emissions!= null));
                if (emissionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyRatingMarkType sourceEmissions;
                    sourceEmissions = this.getEmissions();
                    EnergyRatingMarkType copyEmissions = ((EnergyRatingMarkType) strategy.copy(LocatorUtils.property(locator, "emissions", sourceEmissions), sourceEmissions, (this.emissions!= null)));
                    copy.setEmissions(copyEmissions);
                } else {
                    if (emissionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.emissions = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object createNewInstance() {
        return new EnergyRatingType();
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
        final EnergyRatingType that = ((EnergyRatingType) object);
        {
            EnergyRatingMarkType lhsConsumption;
            lhsConsumption = this.getConsumption();
            EnergyRatingMarkType rhsConsumption;
            rhsConsumption = that.getConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumption", lhsConsumption), LocatorUtils.property(thatLocator, "consumption", rhsConsumption), lhsConsumption, rhsConsumption, (this.consumption!= null), (that.consumption!= null))) {
                return false;
            }
        }
        {
            EnergyRatingMarkType lhsEmissions;
            lhsEmissions = this.getEmissions();
            EnergyRatingMarkType rhsEmissions;
            rhsEmissions = that.getEmissions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emissions", lhsEmissions), LocatorUtils.property(thatLocator, "emissions", rhsEmissions), lhsEmissions, rhsEmissions, (this.emissions!= null), (that.emissions!= null))) {
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
