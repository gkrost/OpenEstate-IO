package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ad" type="{}AdType" maxOccurs="unbounded" minOccurs="0"/>
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
    "ad"
})
@XmlRootElement(name = "trovit")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
public class Trovit implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Liste von einzufügenden oder zu aktualisierenden Objekten.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    protected List<AdType> ad;

    /**
     * Liste von einzufügenden oder zu aktualisierenden Objekten.
     * 
     * Gets the value of the ad property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ad property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdType }
     * </p>
     * 
     * 
     * @return
     *     The value of the ad property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public List<AdType> getAd() {
        if (ad == null) {
            ad = new ArrayList<>();
        }
        return this.ad;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<AdType> theAd;
            theAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
            strategy.appendField(locator, this, "ad", buffer, theAd, ((this.ad!= null)&&(!this.ad.isEmpty())));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Trovit) {
            final Trovit copy = ((Trovit) draftCopy);
            {
                Boolean adShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.ad!= null)&&(!this.ad.isEmpty())));
                if (adShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<AdType> sourceAd;
                    sourceAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
                    @SuppressWarnings("unchecked")
                    List<AdType> copyAd = ((List<AdType> ) strategy.copy(LocatorUtils.property(locator, "ad", sourceAd), sourceAd, ((this.ad!= null)&&(!this.ad.isEmpty()))));
                    copy.ad = null;
                    if (copyAd!= null) {
                        List<AdType> uniqueAdl = copy.getAd();
                        uniqueAdl.addAll(copyAd);
                    }
                } else {
                    if (adShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ad = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Object createNewInstance() {
        return new Trovit();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Trovit that = ((Trovit) object);
        {
            List<AdType> lhsAd;
            lhsAd = (((this.ad!= null)&&(!this.ad.isEmpty()))?this.getAd():null);
            List<AdType> rhsAd;
            rhsAd = (((that.ad!= null)&&(!that.ad.isEmpty()))?that.getAd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ad", lhsAd), LocatorUtils.property(thatLocator, "ad", rhsAd), lhsAd, rhsAd, ((this.ad!= null)&&(!this.ad.isEmpty())), ((that.ad!= null)&&(!that.ad.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
