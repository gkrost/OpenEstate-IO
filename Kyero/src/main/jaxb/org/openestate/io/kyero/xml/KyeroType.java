package org.openestate.io.kyero.xml;

import java.io.Serializable;
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
 * <p>Java class for kyeroType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="kyeroType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="feed_version">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="feed_generated" type="{}dateType" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kyeroType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
public class KyeroType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "feed_version", required = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected String feedVersion;
    @XmlElement(name = "feed_generated", type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    protected Calendar feedGenerated;

    /**
     * Gets the value of the feedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public String getFeedVersion() {
        return feedVersion;
    }

    /**
     * Sets the value of the feedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setFeedVersion(String value) {
        this.feedVersion = value;
    }

    /**
     * Gets the value of the feedGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Calendar getFeedGenerated() {
        return feedGenerated;
    }

    /**
     * Sets the value of the feedGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public void setFeedGenerated(Calendar value) {
        this.feedGenerated = value;
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
            String theFeedVersion;
            theFeedVersion = this.getFeedVersion();
            strategy.appendField(locator, this, "feedVersion", buffer, theFeedVersion, (this.feedVersion!= null));
        }
        {
            Calendar theFeedGenerated;
            theFeedGenerated = this.getFeedGenerated();
            strategy.appendField(locator, this, "feedGenerated", buffer, theFeedGenerated, (this.feedGenerated!= null));
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
        if (draftCopy instanceof KyeroType) {
            final KyeroType copy = ((KyeroType) draftCopy);
            {
                Boolean feedVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feedVersion!= null));
                if (feedVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFeedVersion;
                    sourceFeedVersion = this.getFeedVersion();
                    String copyFeedVersion = ((String) strategy.copy(LocatorUtils.property(locator, "feedVersion", sourceFeedVersion), sourceFeedVersion, (this.feedVersion!= null)));
                    copy.setFeedVersion(copyFeedVersion);
                } else {
                    if (feedVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feedVersion = null;
                    }
                }
            }
            {
                Boolean feedGeneratedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feedGenerated!= null));
                if (feedGeneratedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFeedGenerated;
                    sourceFeedGenerated = this.getFeedGenerated();
                    Calendar copyFeedGenerated = ((Calendar) strategy.copy(LocatorUtils.property(locator, "feedGenerated", sourceFeedGenerated), sourceFeedGenerated, (this.feedGenerated!= null)));
                    copy.setFeedGenerated(copyFeedGenerated);
                } else {
                    if (feedGeneratedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feedGenerated = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:41+02:00")
    public Object createNewInstance() {
        return new KyeroType();
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
        final KyeroType that = ((KyeroType) object);
        {
            String lhsFeedVersion;
            lhsFeedVersion = this.getFeedVersion();
            String rhsFeedVersion;
            rhsFeedVersion = that.getFeedVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedVersion", lhsFeedVersion), LocatorUtils.property(thatLocator, "feedVersion", rhsFeedVersion), lhsFeedVersion, rhsFeedVersion, (this.feedVersion!= null), (that.feedVersion!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFeedGenerated;
            lhsFeedGenerated = this.getFeedGenerated();
            Calendar rhsFeedGenerated;
            rhsFeedGenerated = that.getFeedGenerated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feedGenerated", lhsFeedGenerated), LocatorUtils.property(thatLocator, "feedGenerated", rhsFeedGenerated), lhsFeedGenerated, rhsFeedGenerated, (this.feedGenerated!= null), (that.feedGenerated!= null))) {
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
