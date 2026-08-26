package org.openestate.io.filemaker.xml.layout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for LayoutType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LayoutType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIELD" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="STYLE">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" />
 *                           <attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="DATABASE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutType", propOrder = {
    "field"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
public class LayoutType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "FIELD")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected List<LayoutType.FIELD> field;
    @XmlAttribute(name = "NAME", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected String name;
    @XmlAttribute(name = "DATABASE", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected String database;

    /**
     * Gets the value of the field property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the field property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutType.FIELD }
     * </p>
     * 
     * 
     * @return
     *     The value of the field property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public List<LayoutType.FIELD> getFIELD() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public String getDATABASE() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public void setDATABASE(String value) {
        this.database = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<LayoutType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD, ((this.field!= null)&&(!this.field.isEmpty())));
        }
        {
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
        }
        {
            String theDATABASE;
            theDATABASE = this.getDATABASE();
            strategy.appendField(locator, this, "database", buffer, theDATABASE, (this.database!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof LayoutType) {
            final LayoutType copy = ((LayoutType) draftCopy);
            {
                Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LayoutType.FIELD> sourceFIELD;
                    sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                    @SuppressWarnings("unchecked")
                    List<LayoutType.FIELD> copyFIELD = ((List<LayoutType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD, ((this.field!= null)&&(!this.field.isEmpty()))));
                    copy.field = null;
                    if (copyFIELD!= null) {
                        List<LayoutType.FIELD> uniqueFIELDl = copy.getFIELD();
                        uniqueFIELDl.addAll(copyFIELD);
                    }
                } else {
                    if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.field = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNAME;
                    sourceNAME = this.getNAME();
                    String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME, (this.name!= null)));
                    copy.setNAME(copyNAME);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean databaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.database!= null));
                if (databaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDATABASE;
                    sourceDATABASE = this.getDATABASE();
                    String copyDATABASE = ((String) strategy.copy(LocatorUtils.property(locator, "database", sourceDATABASE), sourceDATABASE, (this.database!= null)));
                    copy.setDATABASE(copyDATABASE);
                } else {
                    if (databaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.database = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object createNewInstance() {
        return new LayoutType();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LayoutType that = ((LayoutType) object);
        {
            List<LayoutType.FIELD> lhsFIELD;
            lhsFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            List<LayoutType.FIELD> rhsFIELD;
            rhsFIELD = (((that.field!= null)&&(!that.field.isEmpty()))?that.getFIELD():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsNAME;
            lhsNAME = this.getNAME();
            String rhsNAME;
            rhsNAME = that.getNAME();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsDATABASE;
            lhsDATABASE = this.getDATABASE();
            String rhsDATABASE;
            rhsDATABASE = that.getDATABASE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "database", lhsDATABASE), LocatorUtils.property(thatLocator, "database", rhsDATABASE), lhsDATABASE, rhsDATABASE, (this.database!= null), (that.database!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
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
     *         <element name="STYLE">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" />
     *                 <attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "style"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public static class FIELD implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "STYLE", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected LayoutType.FIELD.STYLE style;
        @XmlAttribute(name = "NAME", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected String name;

        /**
         * Gets the value of the style property.
         * 
         * @return
         *     possible object is
         *     {@link LayoutType.FIELD.STYLE }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public LayoutType.FIELD.STYLE getSTYLE() {
            return style;
        }

        /**
         * Sets the value of the style property.
         * 
         * @param value
         *     allowed object is
         *     {@link LayoutType.FIELD.STYLE }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setSTYLE(LayoutType.FIELD.STYLE value) {
            this.style = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setNAME(String value) {
            this.name = value;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                LayoutType.FIELD.STYLE theSTYLE;
                theSTYLE = this.getSTYLE();
                strategy.appendField(locator, this, "style", buffer, theSTYLE, (this.style!= null));
            }
            {
                String theNAME;
                theNAME = this.getNAME();
                strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
            }
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
            return copyTo(null, target, strategy);
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof LayoutType.FIELD) {
                final LayoutType.FIELD copy = ((LayoutType.FIELD) draftCopy);
                {
                    Boolean styleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.style!= null));
                    if (styleShouldBeCopiedAndSet == Boolean.TRUE) {
                        LayoutType.FIELD.STYLE sourceSTYLE;
                        sourceSTYLE = this.getSTYLE();
                        LayoutType.FIELD.STYLE copySTYLE = ((LayoutType.FIELD.STYLE) strategy.copy(LocatorUtils.property(locator, "style", sourceSTYLE), sourceSTYLE, (this.style!= null)));
                        copy.setSTYLE(copySTYLE);
                    } else {
                        if (styleShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.style = null;
                        }
                    }
                }
                {
                    Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                    if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceNAME;
                        sourceNAME = this.getNAME();
                        String copyNAME = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceNAME), sourceNAME, (this.name!= null)));
                        copy.setNAME(copyNAME);
                    } else {
                        if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.name = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object createNewInstance() {
            return new LayoutType.FIELD();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final LayoutType.FIELD that = ((LayoutType.FIELD) object);
            {
                LayoutType.FIELD.STYLE lhsSTYLE;
                lhsSTYLE = this.getSTYLE();
                LayoutType.FIELD.STYLE rhsSTYLE;
                rhsSTYLE = that.getSTYLE();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsSTYLE), LocatorUtils.property(thatLocator, "style", rhsSTYLE), lhsSTYLE, rhsSTYLE, (this.style!= null), (that.style!= null))) {
                    return false;
                }
            }
            {
                String lhsNAME;
                lhsNAME = this.getNAME();
                String rhsNAME;
                rhsNAME = that.getNAME();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsNAME), LocatorUtils.property(thatLocator, "name", rhsNAME), lhsNAME, rhsNAME, (this.name!= null), (that.name!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
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
         *       <attribute name="TYPE" type="{http://www.filemaker.com/fmpxmllayout}FieldStyleType" />
         *       <attribute name="VALUELIST" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public static class STYLE implements Serializable, Cloneable, CopyTo, Equals, ToString
        {

            @XmlAttribute(name = "TYPE")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            protected FieldStyleType type;
            @XmlAttribute(name = "VALUELIST")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            protected String valuelist;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link FieldStyleType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public FieldStyleType getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link FieldStyleType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public void setTYPE(FieldStyleType value) {
                this.type = value;
            }

            /**
             * Gets the value of the valuelist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public String getVALUELIST() {
                return valuelist;
            }

            /**
             * Sets the value of the valuelist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public void setVALUELIST(String value) {
                this.valuelist = value;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public String toString() {
                final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
                {
                    FieldStyleType theTYPE;
                    theTYPE = this.getTYPE();
                    strategy.appendField(locator, this, "type", buffer, theTYPE, (this.type!= null));
                }
                {
                    String theVALUELIST;
                    theVALUELIST = this.getVALUELIST();
                    strategy.appendField(locator, this, "valuelist", buffer, theVALUELIST, (this.valuelist!= null));
                }
                return buffer;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public Object clone() {
                return copyTo(createNewInstance());
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public Object copyTo(Object target) {
                final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
                return copyTo(null, target, strategy);
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof LayoutType.FIELD.STYLE) {
                    final LayoutType.FIELD.STYLE copy = ((LayoutType.FIELD.STYLE) draftCopy);
                    {
                        Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                        if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                            FieldStyleType sourceTYPE;
                            sourceTYPE = this.getTYPE();
                            FieldStyleType copyTYPE = ((FieldStyleType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, (this.type!= null)));
                            copy.setTYPE(copyTYPE);
                        } else {
                            if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.type = null;
                            }
                        }
                    }
                    {
                        Boolean valuelistShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.valuelist!= null));
                        if (valuelistShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceVALUELIST;
                            sourceVALUELIST = this.getVALUELIST();
                            String copyVALUELIST = ((String) strategy.copy(LocatorUtils.property(locator, "valuelist", sourceVALUELIST), sourceVALUELIST, (this.valuelist!= null)));
                            copy.setVALUELIST(copyVALUELIST);
                        } else {
                            if (valuelistShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.valuelist = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public Object createNewInstance() {
                return new LayoutType.FIELD.STYLE();
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final LayoutType.FIELD.STYLE that = ((LayoutType.FIELD.STYLE) object);
                {
                    FieldStyleType lhsTYPE;
                    lhsTYPE = this.getTYPE();
                    FieldStyleType rhsTYPE;
                    rhsTYPE = that.getTYPE();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, (this.type!= null), (that.type!= null))) {
                        return false;
                    }
                }
                {
                    String lhsVALUELIST;
                    lhsVALUELIST = this.getVALUELIST();
                    String rhsVALUELIST;
                    rhsVALUELIST = that.getVALUELIST();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "valuelist", lhsVALUELIST), LocatorUtils.property(thatLocator, "valuelist", rhsVALUELIST), lhsVALUELIST, rhsVALUELIST, (this.valuelist!= null), (that.valuelist!= null))) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public boolean equals(Object object) {
                final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
                return equals(null, null, object, strategy);
            }

        }

    }

}
