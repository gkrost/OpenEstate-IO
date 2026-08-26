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
 * <p>Java class for features-property complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="features-property">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="rooms" type="{http://feed.immobiliare.it}roomsType" minOccurs="0"/>
 *         <element name="size" type="{http://feed.immobiliare.it}sizeType" minOccurs="0"/>
 *         <element name="sizes" type="{http://feed.immobiliare.it}sizes" minOccurs="0"/>
 *         <element name="descriptions" type="{http://feed.immobiliare.it}descriptions" minOccurs="0"/>
 *         <element name="energy-class" type="{http://feed.immobiliare.it}classEnergy"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "features-property", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class FeaturesProperty implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected RoomsType rooms;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected SizeType size;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Sizes sizes;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Descriptions descriptions;
    @XmlElement(name = "energy-class", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected ClassEnergy energyClass;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public RoomsType getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomsType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setRooms(RoomsType value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link SizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public SizeType getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setSize(SizeType value) {
        this.size = value;
    }

    /**
     * Gets the value of the sizes property.
     * 
     * @return
     *     possible object is
     *     {@link Sizes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Sizes getSizes() {
        return sizes;
    }

    /**
     * Sets the value of the sizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sizes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setSizes(Sizes value) {
        this.sizes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the energyClass property.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnergy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public ClassEnergy getEnergyClass() {
        return energyClass;
    }

    /**
     * Sets the value of the energyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnergy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setEnergyClass(ClassEnergy value) {
        this.energyClass = value;
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
            RoomsType theRooms;
            theRooms = this.getRooms();
            strategy.appendField(locator, this, "rooms", buffer, theRooms, (this.rooms!= null));
        }
        {
            SizeType theSize;
            theSize = this.getSize();
            strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
        }
        {
            Sizes theSizes;
            theSizes = this.getSizes();
            strategy.appendField(locator, this, "sizes", buffer, theSizes, (this.sizes!= null));
        }
        {
            Descriptions theDescriptions;
            theDescriptions = this.getDescriptions();
            strategy.appendField(locator, this, "descriptions", buffer, theDescriptions, (this.descriptions!= null));
        }
        {
            ClassEnergy theEnergyClass;
            theEnergyClass = this.getEnergyClass();
            strategy.appendField(locator, this, "energyClass", buffer, theEnergyClass, (this.energyClass!= null));
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
        if (draftCopy instanceof FeaturesProperty) {
            final FeaturesProperty copy = ((FeaturesProperty) draftCopy);
            {
                Boolean roomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rooms!= null));
                if (roomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    RoomsType sourceRooms;
                    sourceRooms = this.getRooms();
                    RoomsType copyRooms = ((RoomsType) strategy.copy(LocatorUtils.property(locator, "rooms", sourceRooms), sourceRooms, (this.rooms!= null)));
                    copy.setRooms(copyRooms);
                } else {
                    if (roomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rooms = null;
                    }
                }
            }
            {
                Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    SizeType sourceSize;
                    sourceSize = this.getSize();
                    SizeType copySize = ((SizeType) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                    copy.setSize(copySize);
                } else {
                    if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.size = null;
                    }
                }
            }
            {
                Boolean sizesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sizes!= null));
                if (sizesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Sizes sourceSizes;
                    sourceSizes = this.getSizes();
                    Sizes copySizes = ((Sizes) strategy.copy(LocatorUtils.property(locator, "sizes", sourceSizes), sourceSizes, (this.sizes!= null)));
                    copy.setSizes(copySizes);
                } else {
                    if (sizesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sizes = null;
                    }
                }
            }
            {
                Boolean descriptionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.descriptions!= null));
                if (descriptionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Descriptions sourceDescriptions;
                    sourceDescriptions = this.getDescriptions();
                    Descriptions copyDescriptions = ((Descriptions) strategy.copy(LocatorUtils.property(locator, "descriptions", sourceDescriptions), sourceDescriptions, (this.descriptions!= null)));
                    copy.setDescriptions(copyDescriptions);
                } else {
                    if (descriptionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.descriptions = null;
                    }
                }
            }
            {
                Boolean energyClassShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyClass!= null));
                if (energyClassShouldBeCopiedAndSet == Boolean.TRUE) {
                    ClassEnergy sourceEnergyClass;
                    sourceEnergyClass = this.getEnergyClass();
                    ClassEnergy copyEnergyClass = ((ClassEnergy) strategy.copy(LocatorUtils.property(locator, "energyClass", sourceEnergyClass), sourceEnergyClass, (this.energyClass!= null)));
                    copy.setEnergyClass(copyEnergyClass);
                } else {
                    if (energyClassShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyClass = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new FeaturesProperty();
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
        final FeaturesProperty that = ((FeaturesProperty) object);
        {
            RoomsType lhsRooms;
            lhsRooms = this.getRooms();
            RoomsType rhsRooms;
            rhsRooms = that.getRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rooms", lhsRooms), LocatorUtils.property(thatLocator, "rooms", rhsRooms), lhsRooms, rhsRooms, (this.rooms!= null), (that.rooms!= null))) {
                return false;
            }
        }
        {
            SizeType lhsSize;
            lhsSize = this.getSize();
            SizeType rhsSize;
            rhsSize = that.getSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
                return false;
            }
        }
        {
            Sizes lhsSizes;
            lhsSizes = this.getSizes();
            Sizes rhsSizes;
            rhsSizes = that.getSizes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sizes", lhsSizes), LocatorUtils.property(thatLocator, "sizes", rhsSizes), lhsSizes, rhsSizes, (this.sizes!= null), (that.sizes!= null))) {
                return false;
            }
        }
        {
            Descriptions lhsDescriptions;
            lhsDescriptions = this.getDescriptions();
            Descriptions rhsDescriptions;
            rhsDescriptions = that.getDescriptions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptions", lhsDescriptions), LocatorUtils.property(thatLocator, "descriptions", rhsDescriptions), lhsDescriptions, rhsDescriptions, (this.descriptions!= null), (that.descriptions!= null))) {
                return false;
            }
        }
        {
            ClassEnergy lhsEnergyClass;
            lhsEnergyClass = this.getEnergyClass();
            ClassEnergy rhsEnergyClass;
            rhsEnergyClass = that.getEnergyClass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyClass", lhsEnergyClass), LocatorUtils.property(thatLocator, "energyClass", rhsEnergyClass), lhsEnergyClass, rhsEnergyClass, (this.energyClass!= null), (that.energyClass!= null))) {
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
