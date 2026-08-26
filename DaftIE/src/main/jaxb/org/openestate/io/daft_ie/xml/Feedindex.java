package org.openestate.io.daft_ie.xml;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="feed" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <all>
 *                   <element name="loc" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   <element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 </all>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "feed"
})
@XmlRootElement(name = "feedindex")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
public class Feedindex implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    protected List<Feedindex.Feed> feed;

    /**
     * Gets the value of the feed property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the feed property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Feedindex.Feed }
     * </p>
     * 
     * 
     * @return
     *     The value of the feed property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public List<Feedindex.Feed> getFeed() {
        if (feed == null) {
            feed = new ArrayList<>();
        }
        return this.feed;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Feedindex.Feed> theFeed;
            theFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
            strategy.appendField(locator, this, "feed", buffer, theFeed, ((this.feed!= null)&&(!this.feed.isEmpty())));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Feedindex) {
            final Feedindex copy = ((Feedindex) draftCopy);
            {
                Boolean feedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.feed!= null)&&(!this.feed.isEmpty())));
                if (feedShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Feedindex.Feed> sourceFeed;
                    sourceFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
                    @SuppressWarnings("unchecked")
                    List<Feedindex.Feed> copyFeed = ((List<Feedindex.Feed> ) strategy.copy(LocatorUtils.property(locator, "feed", sourceFeed), sourceFeed, ((this.feed!= null)&&(!this.feed.isEmpty()))));
                    copy.feed = null;
                    if (copyFeed!= null) {
                        List<Feedindex.Feed> uniqueFeedl = copy.getFeed();
                        uniqueFeedl.addAll(copyFeed);
                    }
                } else {
                    if (feedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feed = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public Object createNewInstance() {
        return new Feedindex();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Feedindex that = ((Feedindex) object);
        {
            List<Feedindex.Feed> lhsFeed;
            lhsFeed = (((this.feed!= null)&&(!this.feed.isEmpty()))?this.getFeed():null);
            List<Feedindex.Feed> rhsFeed;
            rhsFeed = (((that.feed!= null)&&(!that.feed.isEmpty()))?that.getFeed():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feed", lhsFeed), LocatorUtils.property(thatLocator, "feed", rhsFeed), lhsFeed, rhsFeed, ((this.feed!= null)&&(!this.feed.isEmpty())), ((that.feed!= null)&&(!that.feed.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
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
     *         <element name="loc" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         <element name="lastmod" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
    public static class Feed implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter3 .class)
        @XmlSchemaType(name = "anyURI")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        protected URI loc;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        protected Calendar lastmod;

        /**
         * Gets the value of the loc property.
         * 
         * @return
         *     possible object is
         *     {@link URI }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public URI getLoc() {
            return loc;
        }

        /**
         * Sets the value of the loc property.
         * 
         * @param value
         *     allowed object is
         *     {@link URI }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public void setLoc(URI value) {
            this.loc = value;
        }

        /**
         * Gets the value of the lastmod property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public Calendar getLastmod() {
            return lastmod;
        }

        /**
         * Sets the value of the lastmod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public void setLastmod(Calendar value) {
            this.lastmod = value;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                URI theLoc;
                theLoc = this.getLoc();
                strategy.appendField(locator, this, "loc", buffer, theLoc, (this.loc!= null));
            }
            {
                Calendar theLastmod;
                theLastmod = this.getLastmod();
                strategy.appendField(locator, this, "lastmod", buffer, theLastmod, (this.lastmod!= null));
            }
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
            return copyTo(null, target, strategy);
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof Feedindex.Feed) {
                final Feedindex.Feed copy = ((Feedindex.Feed) draftCopy);
                {
                    Boolean locShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loc!= null));
                    if (locShouldBeCopiedAndSet == Boolean.TRUE) {
                        URI sourceLoc;
                        sourceLoc = this.getLoc();
                        URI copyLoc = ((URI) strategy.copy(LocatorUtils.property(locator, "loc", sourceLoc), sourceLoc, (this.loc!= null)));
                        copy.setLoc(copyLoc);
                    } else {
                        if (locShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.loc = null;
                        }
                    }
                }
                {
                    Boolean lastmodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastmod!= null));
                    if (lastmodShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceLastmod;
                        sourceLastmod = this.getLastmod();
                        Calendar copyLastmod = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastmod", sourceLastmod), sourceLastmod, (this.lastmod!= null)));
                        copy.setLastmod(copyLastmod);
                    } else {
                        if (lastmodShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.lastmod = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public Object createNewInstance() {
            return new Feedindex.Feed();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Feedindex.Feed that = ((Feedindex.Feed) object);
            {
                URI lhsLoc;
                lhsLoc = this.getLoc();
                URI rhsLoc;
                rhsLoc = that.getLoc();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "loc", lhsLoc), LocatorUtils.property(thatLocator, "loc", rhsLoc), lhsLoc, rhsLoc, (this.loc!= null), (that.loc!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsLastmod;
                lhsLastmod = this.getLastmod();
                Calendar rhsLastmod;
                rhsLastmod = that.getLastmod();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "lastmod", lhsLastmod), LocatorUtils.property(thatLocator, "lastmod", rhsLastmod), lhsLastmod, rhsLastmod, (this.lastmod!= null), (that.lastmod!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:16:52+02:00")
        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            return equals(null, null, object, strategy);
        }

    }

}
