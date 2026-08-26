package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;
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
 * <p>Java class for metadata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="metadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="publisher" type="{http://feed.immobiliare.it}publisher"/>
 *         <element name="build-date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="multipage" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <all>
 *                   <element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="last" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 </all>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadata", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class Metadata implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Publisher publisher;
    @XmlElement(name = "build-date", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Calendar buildDate;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Metadata.Multipage multipage;

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link Publisher }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publisher }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setPublisher(Publisher value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Calendar getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setBuildDate(Calendar value) {
        this.buildDate = value;
    }

    /**
     * Gets the value of the multipage property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata.Multipage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Metadata.Multipage getMultipage() {
        return multipage;
    }

    /**
     * Sets the value of the multipage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata.Multipage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setMultipage(Metadata.Multipage value) {
        this.multipage = value;
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
            Publisher thePublisher;
            thePublisher = this.getPublisher();
            strategy.appendField(locator, this, "publisher", buffer, thePublisher, (this.publisher!= null));
        }
        {
            Calendar theBuildDate;
            theBuildDate = this.getBuildDate();
            strategy.appendField(locator, this, "buildDate", buffer, theBuildDate, (this.buildDate!= null));
        }
        {
            Metadata.Multipage theMultipage;
            theMultipage = this.getMultipage();
            strategy.appendField(locator, this, "multipage", buffer, theMultipage, (this.multipage!= null));
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
        if (draftCopy instanceof Metadata) {
            final Metadata copy = ((Metadata) draftCopy);
            {
                Boolean publisherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publisher!= null));
                if (publisherShouldBeCopiedAndSet == Boolean.TRUE) {
                    Publisher sourcePublisher;
                    sourcePublisher = this.getPublisher();
                    Publisher copyPublisher = ((Publisher) strategy.copy(LocatorUtils.property(locator, "publisher", sourcePublisher), sourcePublisher, (this.publisher!= null)));
                    copy.setPublisher(copyPublisher);
                } else {
                    if (publisherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publisher = null;
                    }
                }
            }
            {
                Boolean buildDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildDate!= null));
                if (buildDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceBuildDate;
                    sourceBuildDate = this.getBuildDate();
                    Calendar copyBuildDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "buildDate", sourceBuildDate), sourceBuildDate, (this.buildDate!= null)));
                    copy.setBuildDate(copyBuildDate);
                } else {
                    if (buildDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildDate = null;
                    }
                }
            }
            {
                Boolean multipageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.multipage!= null));
                if (multipageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Metadata.Multipage sourceMultipage;
                    sourceMultipage = this.getMultipage();
                    Metadata.Multipage copyMultipage = ((Metadata.Multipage) strategy.copy(LocatorUtils.property(locator, "multipage", sourceMultipage), sourceMultipage, (this.multipage!= null)));
                    copy.setMultipage(copyMultipage);
                } else {
                    if (multipageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.multipage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new Metadata();
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
        final Metadata that = ((Metadata) object);
        {
            Publisher lhsPublisher;
            lhsPublisher = this.getPublisher();
            Publisher rhsPublisher;
            rhsPublisher = that.getPublisher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publisher", lhsPublisher), LocatorUtils.property(thatLocator, "publisher", rhsPublisher), lhsPublisher, rhsPublisher, (this.publisher!= null), (that.publisher!= null))) {
                return false;
            }
        }
        {
            Calendar lhsBuildDate;
            lhsBuildDate = this.getBuildDate();
            Calendar rhsBuildDate;
            rhsBuildDate = that.getBuildDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildDate", lhsBuildDate), LocatorUtils.property(thatLocator, "buildDate", rhsBuildDate), lhsBuildDate, rhsBuildDate, (this.buildDate!= null), (that.buildDate!= null))) {
                return false;
            }
        }
        {
            Metadata.Multipage lhsMultipage;
            lhsMultipage = this.getMultipage();
            Metadata.Multipage rhsMultipage;
            rhsMultipage = that.getMultipage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multipage", lhsMultipage), LocatorUtils.property(thatLocator, "multipage", rhsMultipage), lhsMultipage, rhsMultipage, (this.multipage!= null), (that.multipage!= null))) {
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
     *       <all>
     *         <element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="last" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       </all>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public static class Multipage implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected BigInteger current;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        protected BigInteger last;

        /**
         * Gets the value of the current property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public BigInteger getCurrent() {
            return current;
        }

        /**
         * Sets the value of the current property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setCurrent(BigInteger value) {
            this.current = value;
        }

        /**
         * Gets the value of the last property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public BigInteger getLast() {
            return last;
        }

        /**
         * Sets the value of the last property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public void setLast(BigInteger value) {
            this.last = value;
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
                BigInteger theCurrent;
                theCurrent = this.getCurrent();
                strategy.appendField(locator, this, "current", buffer, theCurrent, (this.current!= null));
            }
            {
                BigInteger theLast;
                theLast = this.getLast();
                strategy.appendField(locator, this, "last", buffer, theLast, (this.last!= null));
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
            if (draftCopy instanceof Metadata.Multipage) {
                final Metadata.Multipage copy = ((Metadata.Multipage) draftCopy);
                {
                    Boolean currentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.current!= null));
                    if (currentShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceCurrent;
                        sourceCurrent = this.getCurrent();
                        BigInteger copyCurrent = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "current", sourceCurrent), sourceCurrent, (this.current!= null)));
                        copy.setCurrent(copyCurrent);
                    } else {
                        if (currentShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.current = null;
                        }
                    }
                }
                {
                    Boolean lastShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.last!= null));
                    if (lastShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceLast;
                        sourceLast = this.getLast();
                        BigInteger copyLast = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "last", sourceLast), sourceLast, (this.last!= null)));
                        copy.setLast(copyLast);
                    } else {
                        if (lastShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.last = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
        public Object createNewInstance() {
            return new Metadata.Multipage();
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
            final Metadata.Multipage that = ((Metadata.Multipage) object);
            {
                BigInteger lhsCurrent;
                lhsCurrent = this.getCurrent();
                BigInteger rhsCurrent;
                rhsCurrent = that.getCurrent();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "current", lhsCurrent), LocatorUtils.property(thatLocator, "current", rhsCurrent), lhsCurrent, rhsCurrent, (this.current!= null), (that.current!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsLast;
                lhsLast = this.getLast();
                BigInteger rhsLast;
                rhsLast = that.getLast();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "last", lhsLast), LocatorUtils.property(thatLocator, "last", rhsLast), lhsLast, rhsLast, (this.last!= null), (that.last!= null))) {
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
