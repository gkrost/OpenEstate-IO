package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
import org.openestate.io.immobiliare_it.xml.types.SizeUnitType;


/**
 * <p>Java class for sizes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="sizes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="size" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="type" type="{http://feed.immobiliare.it}detailedSizeType"/>
 *                   <element name="floor" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://www.w3.org/2001/XMLSchema>int">
 *                           <attribute name="type" type="{http://feed.immobiliare.it}detailedSizeFloorType" default="Intermedio" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="surface" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="weight" type="{http://feed.immobiliare.it}ratioType"/>
 *                 </sequence>
 *                 <attribute name="main" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="unit" use="required" type="{http://feed.immobiliare.it}sizeTypeUnit" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizes", propOrder = {
    "size"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class Sizes implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected List<Sizes.Size> size;
    @XmlAttribute(name = "unit", required = true)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected SizeUnitType unit;

    /**
     * Gets the value of the size property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the size property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sizes.Size }
     * </p>
     * 
     * 
     * @return
     *     The value of the size property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public List<Sizes.Size> getSize() {
        if (size == null) {
            size = new ArrayList<>();
        }
        return this.size;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public SizeUnitType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setUnit(SizeUnitType value) {
        this.unit = value;
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
            List<Sizes.Size> theSize;
            theSize = (((this.size!= null)&&(!this.size.isEmpty()))?this.getSize():null);
            strategy.appendField(locator, this, "size", buffer, theSize, ((this.size!= null)&&(!this.size.isEmpty())));
        }
        {
            SizeUnitType theUnit;
            theUnit = this.getUnit();
            strategy.appendField(locator, this, "unit", buffer, theUnit, (this.unit!= null));
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
        if (draftCopy instanceof Sizes) {
            final Sizes copy = ((Sizes) draftCopy);
            {
                Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.size!= null)&&(!this.size.isEmpty())));
                if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Sizes.Size> sourceSize;
                    sourceSize = (((this.size!= null)&&(!this.size.isEmpty()))?this.getSize():null);
                    @SuppressWarnings("unchecked")
                    List<Sizes.Size> copySize = ((List<Sizes.Size> ) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, ((this.size!= null)&&(!this.size.isEmpty()))));
                    copy.size = null;
                    if (copySize!= null) {
                        List<Sizes.Size> uniqueSizel = copy.getSize();
                        uniqueSizel.addAll(copySize);
                    }
                } else {
                    if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.size = null;
                    }
                }
            }
            {
                Boolean unitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unit!= null));
                if (unitShouldBeCopiedAndSet == Boolean.TRUE) {
                    SizeUnitType sourceUnit;
                    sourceUnit = this.getUnit();
                    SizeUnitType copyUnit = ((SizeUnitType) strategy.copy(LocatorUtils.property(locator, "unit", sourceUnit), sourceUnit, (this.unit!= null)));
                    copy.setUnit(copyUnit);
                } else {
                    if (unitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new Sizes();
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
        final Sizes that = ((Sizes) object);
        {
            List<Sizes.Size> lhsSize;
            lhsSize = (((this.size!= null)&&(!this.size.isEmpty()))?this.getSize():null);
            List<Sizes.Size> rhsSize;
            rhsSize = (((that.size!= null)&&(!that.size.isEmpty()))?that.getSize():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, ((this.size!= null)&&(!this.size.isEmpty())), ((that.size!= null)&&(!that.size.isEmpty())))) {
                return false;
            }
        }
        {
            SizeUnitType lhsUnit;
            lhsUnit = this.getUnit();
            SizeUnitType rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit, (this.unit!= null), (that.unit!= null))) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="type" type="{http://feed.immobiliare.it}detailedSizeType"/>
     *         <element name="floor" minOccurs="0">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://www.w3.org/2001/XMLSchema>int">
     *                 <attribute name="type" type="{http://feed.immobiliare.it}detailedSizeFloorType" default="Intermedio" />
     *               </extension>
     *             </simpleContent>
     *           </complexType>
     *         </element>
     *         <element name="surface" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="weight" type="{http://feed.immobiliare.it}ratioType"/>
     *       </sequence>
     *       <attribute name="main" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "floor",
        "surface",
        "weight"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public static class Size implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected DetailedSizeType type;
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected Sizes.Size.Floor floor;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected BigInteger surface;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter18 .class)
        @XmlSchemaType(name = "double")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected BigDecimal weight;
        @XmlAttribute(name = "main")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected Boolean main;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link DetailedSizeType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public DetailedSizeType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailedSizeType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setType(DetailedSizeType value) {
            this.type = value;
        }

        /**
         * Gets the value of the floor property.
         * 
         * @return
         *     possible object is
         *     {@link Sizes.Size.Floor }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public Sizes.Size.Floor getFloor() {
            return floor;
        }

        /**
         * Sets the value of the floor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sizes.Size.Floor }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setFloor(Sizes.Size.Floor value) {
            this.floor = value;
        }

        /**
         * Gets the value of the surface property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public BigInteger getSurface() {
            return surface;
        }

        /**
         * Sets the value of the surface property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setSurface(BigInteger value) {
            this.surface = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public BigDecimal getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setWeight(BigDecimal value) {
            this.weight = value;
        }

        /**
         * Gets the value of the main property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public Boolean getMain() {
            return main;
        }

        /**
         * Sets the value of the main property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setMain(Boolean value) {
            this.main = value;
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
                DetailedSizeType theType;
                theType = this.getType();
                strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
            }
            {
                Sizes.Size.Floor theFloor;
                theFloor = this.getFloor();
                strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
            }
            {
                BigInteger theSurface;
                theSurface = this.getSurface();
                strategy.appendField(locator, this, "surface", buffer, theSurface, (this.surface!= null));
            }
            {
                BigDecimal theWeight;
                theWeight = this.getWeight();
                strategy.appendField(locator, this, "weight", buffer, theWeight, (this.weight!= null));
            }
            {
                Boolean theMain;
                theMain = this.getMain();
                strategy.appendField(locator, this, "main", buffer, theMain, (this.main!= null));
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
            if (draftCopy instanceof Sizes.Size) {
                final Sizes.Size copy = ((Sizes.Size) draftCopy);
                {
                    Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                    if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                        DetailedSizeType sourceType;
                        sourceType = this.getType();
                        DetailedSizeType copyType = ((DetailedSizeType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                        copy.setType(copyType);
                    } else {
                        if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.type = null;
                        }
                    }
                }
                {
                    Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                    if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                        Sizes.Size.Floor sourceFloor;
                        sourceFloor = this.getFloor();
                        Sizes.Size.Floor copyFloor = ((Sizes.Size.Floor) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                        copy.setFloor(copyFloor);
                    } else {
                        if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.floor = null;
                        }
                    }
                }
                {
                    Boolean surfaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.surface!= null));
                    if (surfaceShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceSurface;
                        sourceSurface = this.getSurface();
                        BigInteger copySurface = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "surface", sourceSurface), sourceSurface, (this.surface!= null)));
                        copy.setSurface(copySurface);
                    } else {
                        if (surfaceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.surface = null;
                        }
                    }
                }
                {
                    Boolean weightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.weight!= null));
                    if (weightShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigDecimal sourceWeight;
                        sourceWeight = this.getWeight();
                        BigDecimal copyWeight = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "weight", sourceWeight), sourceWeight, (this.weight!= null)));
                        copy.setWeight(copyWeight);
                    } else {
                        if (weightShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.weight = null;
                        }
                    }
                }
                {
                    Boolean mainShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.main!= null));
                    if (mainShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceMain;
                        sourceMain = this.getMain();
                        Boolean copyMain = ((Boolean) strategy.copy(LocatorUtils.property(locator, "main", sourceMain), sourceMain, (this.main!= null)));
                        copy.setMain(copyMain);
                    } else {
                        if (mainShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.main = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public Object createNewInstance() {
            return new Sizes.Size();
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
            final Sizes.Size that = ((Sizes.Size) object);
            {
                DetailedSizeType lhsType;
                lhsType = this.getType();
                DetailedSizeType rhsType;
                rhsType = that.getType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                    return false;
                }
            }
            {
                Sizes.Size.Floor lhsFloor;
                lhsFloor = this.getFloor();
                Sizes.Size.Floor rhsFloor;
                rhsFloor = that.getFloor();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsSurface;
                lhsSurface = this.getSurface();
                BigInteger rhsSurface;
                rhsSurface = that.getSurface();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "surface", lhsSurface), LocatorUtils.property(thatLocator, "surface", rhsSurface), lhsSurface, rhsSurface, (this.surface!= null), (that.surface!= null))) {
                    return false;
                }
            }
            {
                BigDecimal lhsWeight;
                lhsWeight = this.getWeight();
                BigDecimal rhsWeight;
                rhsWeight = that.getWeight();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "weight", lhsWeight), LocatorUtils.property(thatLocator, "weight", rhsWeight), lhsWeight, rhsWeight, (this.weight!= null), (that.weight!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsMain;
                lhsMain = this.getMain();
                Boolean rhsMain;
                rhsMain = that.getMain();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "main", lhsMain), LocatorUtils.property(thatLocator, "main", rhsMain), lhsMain, rhsMain, (this.main!= null), (that.main!= null))) {
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://www.w3.org/2001/XMLSchema>int">
         *       <attribute name="type" type="{http://feed.immobiliare.it}detailedSizeFloorType" default="Intermedio" />
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public static class Floor implements Serializable, Cloneable, CopyTo, Equals, ToString
        {

            @XmlValue
            @XmlJavaTypeAdapter(Adapter5 .class)
            @XmlSchemaType(name = "int")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            protected BigInteger value;
            @XmlAttribute(name = "type")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            protected DetailedFloorSizeType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            public BigInteger getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link DetailedFloorSizeType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            public DetailedFloorSizeType getType() {
                if (type == null) {
                    return DetailedFloorSizeType.INTERMEDIO;
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link DetailedFloorSizeType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            public void setType(DetailedFloorSizeType value) {
                this.type = value;
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
                    BigInteger theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                }
                {
                    DetailedFloorSizeType theType;
                    theType = this.getType();
                    strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
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
                if (draftCopy instanceof Sizes.Size.Floor) {
                    final Sizes.Size.Floor copy = ((Sizes.Size.Floor) draftCopy);
                    {
                        Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                        if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                            BigInteger sourceValue;
                            sourceValue = this.getValue();
                            BigInteger copyValue = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                            copy.setValue(copyValue);
                        } else {
                            if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.value = null;
                            }
                        }
                    }
                    {
                        Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                        if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                            DetailedFloorSizeType sourceType;
                            sourceType = this.getType();
                            DetailedFloorSizeType copyType = ((DetailedFloorSizeType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                            copy.setType(copyType);
                        } else {
                            if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.type = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
            public Object createNewInstance() {
                return new Sizes.Size.Floor();
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
                final Sizes.Size.Floor that = ((Sizes.Size.Floor) object);
                {
                    BigInteger lhsValue;
                    lhsValue = this.getValue();
                    BigInteger rhsValue;
                    rhsValue = that.getValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                        return false;
                    }
                }
                {
                    DetailedFloorSizeType lhsType;
                    lhsType = this.getType();
                    DetailedFloorSizeType rhsType;
                    rhsType = that.getType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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

    }

}
