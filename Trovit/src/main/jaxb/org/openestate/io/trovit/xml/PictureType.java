package org.openestate.io.trovit.xml;

import java.io.Serializable;
import java.net.URI;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * Ein einzufügendes oder zu aktualisierendes Bild.
 * 
 * <p>Java class for PictureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PictureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="picture_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="picture_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </all>
 *       <attribute name="featured" type="{}BooleanValue" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureType", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
public class PictureType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Url des Fotos
     * 
     */
    @XmlElement(name = "picture_url", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    protected URI pictureUrl;
    /**
     * Titel des Fotos
     * 
     */
    @XmlElement(name = "picture_title")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    protected String pictureTitle;
    /**
     * Ein Foto kann durch den Zusatz "featured" markiert werden.
     * 
     */
    @XmlAttribute(name = "featured")
    @XmlJavaTypeAdapter(Adapter16 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    protected Boolean featured;

    /**
     * Url des Fotos
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public URI getPictureUrl() {
        return pictureUrl;
    }

    /**
     * Sets the value of the pictureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     * @see #getPictureUrl()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public void setPictureUrl(URI value) {
        this.pictureUrl = value;
    }

    /**
     * Titel des Fotos
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public String getPictureTitle() {
        return pictureTitle;
    }

    /**
     * Sets the value of the pictureTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPictureTitle()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public void setPictureTitle(String value) {
        this.pictureTitle = value;
    }

    /**
     * Ein Foto kann durch den Zusatz "featured" markiert werden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Boolean getFeatured() {
        return featured;
    }

    /**
     * Sets the value of the featured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getFeatured()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public void setFeatured(Boolean value) {
        this.featured = value;
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
            URI thePictureUrl;
            thePictureUrl = this.getPictureUrl();
            strategy.appendField(locator, this, "pictureUrl", buffer, thePictureUrl, (this.pictureUrl!= null));
        }
        {
            String thePictureTitle;
            thePictureTitle = this.getPictureTitle();
            strategy.appendField(locator, this, "pictureTitle", buffer, thePictureTitle, (this.pictureTitle!= null));
        }
        {
            Boolean theFeatured;
            theFeatured = this.getFeatured();
            strategy.appendField(locator, this, "featured", buffer, theFeatured, (this.featured!= null));
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
        if (draftCopy instanceof PictureType) {
            final PictureType copy = ((PictureType) draftCopy);
            {
                Boolean pictureUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictureUrl!= null));
                if (pictureUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourcePictureUrl;
                    sourcePictureUrl = this.getPictureUrl();
                    URI copyPictureUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "pictureUrl", sourcePictureUrl), sourcePictureUrl, (this.pictureUrl!= null)));
                    copy.setPictureUrl(copyPictureUrl);
                } else {
                    if (pictureUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictureUrl = null;
                    }
                }
            }
            {
                Boolean pictureTitleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pictureTitle!= null));
                if (pictureTitleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePictureTitle;
                    sourcePictureTitle = this.getPictureTitle();
                    String copyPictureTitle = ((String) strategy.copy(LocatorUtils.property(locator, "pictureTitle", sourcePictureTitle), sourcePictureTitle, (this.pictureTitle!= null)));
                    copy.setPictureTitle(copyPictureTitle);
                } else {
                    if (pictureTitleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pictureTitle = null;
                    }
                }
            }
            {
                Boolean featuredShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.featured!= null));
                if (featuredShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFeatured;
                    sourceFeatured = this.getFeatured();
                    Boolean copyFeatured = ((Boolean) strategy.copy(LocatorUtils.property(locator, "featured", sourceFeatured), sourceFeatured, (this.featured!= null)));
                    copy.setFeatured(copyFeatured);
                } else {
                    if (featuredShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.featured = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:53+02:00")
    public Object createNewInstance() {
        return new PictureType();
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
        final PictureType that = ((PictureType) object);
        {
            URI lhsPictureUrl;
            lhsPictureUrl = this.getPictureUrl();
            URI rhsPictureUrl;
            rhsPictureUrl = that.getPictureUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureUrl", lhsPictureUrl), LocatorUtils.property(thatLocator, "pictureUrl", rhsPictureUrl), lhsPictureUrl, rhsPictureUrl, (this.pictureUrl!= null), (that.pictureUrl!= null))) {
                return false;
            }
        }
        {
            String lhsPictureTitle;
            lhsPictureTitle = this.getPictureTitle();
            String rhsPictureTitle;
            rhsPictureTitle = that.getPictureTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pictureTitle", lhsPictureTitle), LocatorUtils.property(thatLocator, "pictureTitle", rhsPictureTitle), lhsPictureTitle, rhsPictureTitle, (this.pictureTitle!= null), (that.pictureTitle!= null))) {
                return false;
            }
        }
        {
            Boolean lhsFeatured;
            lhsFeatured = this.getFeatured();
            Boolean rhsFeatured;
            rhsFeatured = that.getFeatured();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featured", lhsFeatured), LocatorUtils.property(thatLocator, "featured", rhsFeatured), lhsFeatured, rhsFeatured, (this.featured!= null), (that.featured!= null))) {
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
