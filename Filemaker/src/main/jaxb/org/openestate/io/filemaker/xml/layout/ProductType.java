package org.openestate.io.filemaker.xml.layout;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for ProductType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProductType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="VERSION" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="BUILD" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
public class ProductType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "NAME", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected String name;
    @XmlAttribute(name = "VERSION", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected String version;
    @XmlAttribute(name = "BUILD", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected String build;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public String getBUILD() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public void setBUILD(String value) {
        this.build = value;
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
            String theNAME;
            theNAME = this.getNAME();
            strategy.appendField(locator, this, "name", buffer, theNAME, (this.name!= null));
        }
        {
            String theVERSION;
            theVERSION = this.getVERSION();
            strategy.appendField(locator, this, "version", buffer, theVERSION, (this.version!= null));
        }
        {
            String theBUILD;
            theBUILD = this.getBUILD();
            strategy.appendField(locator, this, "build", buffer, theBUILD, (this.build!= null));
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
        if (draftCopy instanceof ProductType) {
            final ProductType copy = ((ProductType) draftCopy);
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
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVERSION;
                    sourceVERSION = this.getVERSION();
                    String copyVERSION = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVERSION), sourceVERSION, (this.version!= null)));
                    copy.setVERSION(copyVERSION);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
            {
                Boolean buildShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.build!= null));
                if (buildShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBUILD;
                    sourceBUILD = this.getBUILD();
                    String copyBUILD = ((String) strategy.copy(LocatorUtils.property(locator, "build", sourceBUILD), sourceBUILD, (this.build!= null)));
                    copy.setBUILD(copyBUILD);
                } else {
                    if (buildShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.build = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object createNewInstance() {
        return new ProductType();
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
        final ProductType that = ((ProductType) object);
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
            String lhsVERSION;
            lhsVERSION = this.getVERSION();
            String rhsVERSION;
            rhsVERSION = that.getVERSION();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVERSION), LocatorUtils.property(thatLocator, "version", rhsVERSION), lhsVERSION, rhsVERSION, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            String lhsBUILD;
            lhsBUILD = this.getBUILD();
            String rhsBUILD;
            rhsBUILD = that.getBUILD();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "build", lhsBUILD), LocatorUtils.property(thatLocator, "build", rhsBUILD), lhsBUILD, rhsBUILD, (this.build!= null), (that.build!= null))) {
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
