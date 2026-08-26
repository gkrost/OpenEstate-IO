
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlEnum;
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
 * Java class for &lt;hallen_lager_prod&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "hallen_lager_prod")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class HallenLagerProd implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "hallen_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected HallenLagerProd.HallenTyp hallenTyp;

    /**
     * Gets the value of the hallenTyp property.
     * 
     * @return
     *     possible object is
     *     {@link HallenLagerProd.HallenTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public HallenLagerProd.HallenTyp getHallenTyp() {
        return hallenTyp;
    }

    /**
     * Sets the value of the hallenTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link HallenLagerProd.HallenTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setHallenTyp(HallenLagerProd.HallenTyp value) {
        this.hallenTyp = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            HallenLagerProd.HallenTyp theHallenTyp;
            theHallenTyp = this.getHallenTyp();
            strategy.appendField(locator, this, "hallenTyp", buffer, theHallenTyp, (this.hallenTyp!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof HallenLagerProd) {
            final HallenLagerProd copy = ((HallenLagerProd) draftCopy);
            {
                Boolean hallenTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hallenTyp!= null));
                if (hallenTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    HallenLagerProd.HallenTyp sourceHallenTyp;
                    sourceHallenTyp = this.getHallenTyp();
                    HallenLagerProd.HallenTyp copyHallenTyp = ((HallenLagerProd.HallenTyp) strategy.copy(LocatorUtils.property(locator, "hallenTyp", sourceHallenTyp), sourceHallenTyp, (this.hallenTyp!= null)));
                    copy.setHallenTyp(copyHallenTyp);
                } else {
                    if (hallenTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hallenTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new HallenLagerProd();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final HallenLagerProd that = ((HallenLagerProd) object);
        {
            HallenLagerProd.HallenTyp lhsHallenTyp;
            lhsHallenTyp = this.getHallenTyp();
            HallenLagerProd.HallenTyp rhsHallenTyp;
            rhsHallenTyp = that.getHallenTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hallenTyp", lhsHallenTyp), LocatorUtils.property(thatLocator, "hallenTyp", rhsHallenTyp), lhsHallenTyp, rhsHallenTyp, (this.hallenTyp!= null), (that.hallenTyp!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }


    /**
     * 
     *                     Java enum for <em>hallen_typ</em> attribute in &lt;hallen_lager_prod&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="HALLE"/&gt;
     *     &lt;enumeration value="INDUSTRIEHALLE"/&gt;
     *     &lt;enumeration value="LAGER"/&gt;
     *     &lt;enumeration value="LAGERFLAECHEN"/&gt;
     *     &lt;enumeration value="LAGER_MIT_FREIFLAECHE"/&gt;
     *     &lt;enumeration value="HOCHREGALLAGER"/&gt;
     *     &lt;enumeration value="SPEDITIONSLAGER"/&gt;
     *     &lt;enumeration value="PRODUKTION"/&gt;
     *     &lt;enumeration value="WERKSTATT"/&gt;
     *     &lt;enumeration value="SERVICE"/&gt;
     *     &lt;enumeration value="FREIFLAECHEN"/&gt;
     *     &lt;enumeration value="KUEHLHAUS"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum HallenTyp {

        HALLE,
        INDUSTRIEHALLE,
        LAGER,
        LAGERFLAECHEN,
        LAGER_MIT_FREIFLAECHE,
        HOCHREGALLAGER,
        SPEDITIONSLAGER,
        PRODUKTION,
        WERKSTATT,
        SERVICE,
        FREIFLAECHEN,
        KUEHLHAUS;

        public String value() {
            return name();
        }

        public static HallenLagerProd.HallenTyp fromValue(String v) {
            return valueOf(v);
        }

    }

}
