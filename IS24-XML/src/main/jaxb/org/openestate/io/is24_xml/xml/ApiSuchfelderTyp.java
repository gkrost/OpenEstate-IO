package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for ApiSuchfelderTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApiSuchfelderTyp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApiSuchfeld1" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *         <element name="ApiSuchfeld2" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *         <element name="ApiSuchfeld3" type="{http://www.immobilienscout24.de/immobilientransfer}ApiSearchStringTyp" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSuchfelderTyp", propOrder = {
    "apiSuchfeld1",
    "apiSuchfeld2",
    "apiSuchfeld3"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class ApiSuchfelderTyp implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElementRef(name = "ApiSuchfeld1", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<String> apiSuchfeld1;
    @XmlElementRef(name = "ApiSuchfeld2", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<String> apiSuchfeld2;
    @XmlElementRef(name = "ApiSuchfeld3", namespace = "http://www.immobilienscout24.de/immobilientransfer", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected JAXBElement<String> apiSuchfeld3;

    /**
     * Gets the value of the apiSuchfeld1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<String> getApiSuchfeld1() {
        return apiSuchfeld1;
    }

    /**
     * Sets the value of the apiSuchfeld1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setApiSuchfeld1(JAXBElement<String> value) {
        this.apiSuchfeld1 = value;
    }

    /**
     * Gets the value of the apiSuchfeld2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<String> getApiSuchfeld2() {
        return apiSuchfeld2;
    }

    /**
     * Sets the value of the apiSuchfeld2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setApiSuchfeld2(JAXBElement<String> value) {
        this.apiSuchfeld2 = value;
    }

    /**
     * Gets the value of the apiSuchfeld3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public JAXBElement<String> getApiSuchfeld3() {
        return apiSuchfeld3;
    }

    /**
     * Sets the value of the apiSuchfeld3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setApiSuchfeld3(JAXBElement<String> value) {
        this.apiSuchfeld3 = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            JAXBElement<String> theApiSuchfeld1;
            theApiSuchfeld1 = this.getApiSuchfeld1();
            strategy.appendField(locator, this, "apiSuchfeld1", buffer, theApiSuchfeld1, (this.apiSuchfeld1 != null));
        }
        {
            JAXBElement<String> theApiSuchfeld2;
            theApiSuchfeld2 = this.getApiSuchfeld2();
            strategy.appendField(locator, this, "apiSuchfeld2", buffer, theApiSuchfeld2, (this.apiSuchfeld2 != null));
        }
        {
            JAXBElement<String> theApiSuchfeld3;
            theApiSuchfeld3 = this.getApiSuchfeld3();
            strategy.appendField(locator, this, "apiSuchfeld3", buffer, theApiSuchfeld3, (this.apiSuchfeld3 != null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ApiSuchfelderTyp) {
            final ApiSuchfelderTyp copy = ((ApiSuchfelderTyp) draftCopy);
            {
                Boolean apiSuchfeld1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSuchfeld1 != null));
                if (apiSuchfeld1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<String> sourceApiSuchfeld1;
                    sourceApiSuchfeld1 = this.getApiSuchfeld1();
                    @SuppressWarnings("unchecked")
                    JAXBElement<String> copyApiSuchfeld1 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld1", sourceApiSuchfeld1), sourceApiSuchfeld1, (this.apiSuchfeld1 != null)));
                    copy.setApiSuchfeld1(copyApiSuchfeld1);
                } else {
                    if (apiSuchfeld1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSuchfeld1 = null;
                    }
                }
            }
            {
                Boolean apiSuchfeld2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSuchfeld2 != null));
                if (apiSuchfeld2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<String> sourceApiSuchfeld2;
                    sourceApiSuchfeld2 = this.getApiSuchfeld2();
                    @SuppressWarnings("unchecked")
                    JAXBElement<String> copyApiSuchfeld2 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld2", sourceApiSuchfeld2), sourceApiSuchfeld2, (this.apiSuchfeld2 != null)));
                    copy.setApiSuchfeld2(copyApiSuchfeld2);
                } else {
                    if (apiSuchfeld2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSuchfeld2 = null;
                    }
                }
            }
            {
                Boolean apiSuchfeld3ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSuchfeld3 != null));
                if (apiSuchfeld3ShouldBeCopiedAndSet == Boolean.TRUE) {
                    JAXBElement<String> sourceApiSuchfeld3;
                    sourceApiSuchfeld3 = this.getApiSuchfeld3();
                    @SuppressWarnings("unchecked")
                    JAXBElement<String> copyApiSuchfeld3 = ((JAXBElement<String> ) strategy.copy(LocatorUtils.property(locator, "apiSuchfeld3", sourceApiSuchfeld3), sourceApiSuchfeld3, (this.apiSuchfeld3 != null)));
                    copy.setApiSuchfeld3(copyApiSuchfeld3);
                } else {
                    if (apiSuchfeld3ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSuchfeld3 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new ApiSuchfelderTyp();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ApiSuchfelderTyp that = ((ApiSuchfelderTyp) object);
        {
            JAXBElement<String> lhsApiSuchfeld1;
            lhsApiSuchfeld1 = this.getApiSuchfeld1();
            JAXBElement<String> rhsApiSuchfeld1;
            rhsApiSuchfeld1 = that.getApiSuchfeld1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld1", lhsApiSuchfeld1), LocatorUtils.property(thatLocator, "apiSuchfeld1", rhsApiSuchfeld1), lhsApiSuchfeld1, rhsApiSuchfeld1, (this.apiSuchfeld1 != null), (that.apiSuchfeld1 != null))) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsApiSuchfeld2;
            lhsApiSuchfeld2 = this.getApiSuchfeld2();
            JAXBElement<String> rhsApiSuchfeld2;
            rhsApiSuchfeld2 = that.getApiSuchfeld2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld2", lhsApiSuchfeld2), LocatorUtils.property(thatLocator, "apiSuchfeld2", rhsApiSuchfeld2), lhsApiSuchfeld2, rhsApiSuchfeld2, (this.apiSuchfeld2 != null), (that.apiSuchfeld2 != null))) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsApiSuchfeld3;
            lhsApiSuchfeld3 = this.getApiSuchfeld3();
            JAXBElement<String> rhsApiSuchfeld3;
            rhsApiSuchfeld3 = that.getApiSuchfeld3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSuchfeld3", lhsApiSuchfeld3), LocatorUtils.property(thatLocator, "apiSuchfeld3", rhsApiSuchfeld3), lhsApiSuchfeld3, rhsApiSuchfeld3, (this.apiSuchfeld3 != null), (that.apiSuchfeld3 != null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
