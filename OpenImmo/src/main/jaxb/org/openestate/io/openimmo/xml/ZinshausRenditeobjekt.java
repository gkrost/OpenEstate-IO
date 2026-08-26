
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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
 * Java class for &lt;zinshaus_renditeobjekt&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "zinshaus_renditeobjekt")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class ZinshausRenditeobjekt implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "zins_typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected ZinshausRenditeobjekt.ZinsTyp zinsTyp;

    /**
     * Gets the value of the zinsTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ZinshausRenditeobjekt.ZinsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public ZinshausRenditeobjekt.ZinsTyp getZinsTyp() {
        return zinsTyp;
    }

    /**
     * Sets the value of the zinsTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZinshausRenditeobjekt.ZinsTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public void setZinsTyp(ZinshausRenditeobjekt.ZinsTyp value) {
        this.zinsTyp = value;
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
            ZinshausRenditeobjekt.ZinsTyp theZinsTyp;
            theZinsTyp = this.getZinsTyp();
            strategy.appendField(locator, this, "zinsTyp", buffer, theZinsTyp, (this.zinsTyp!= null));
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
        if (draftCopy instanceof ZinshausRenditeobjekt) {
            final ZinshausRenditeobjekt copy = ((ZinshausRenditeobjekt) draftCopy);
            {
                Boolean zinsTypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zinsTyp!= null));
                if (zinsTypShouldBeCopiedAndSet == Boolean.TRUE) {
                    ZinshausRenditeobjekt.ZinsTyp sourceZinsTyp;
                    sourceZinsTyp = this.getZinsTyp();
                    ZinshausRenditeobjekt.ZinsTyp copyZinsTyp = ((ZinshausRenditeobjekt.ZinsTyp) strategy.copy(LocatorUtils.property(locator, "zinsTyp", sourceZinsTyp), sourceZinsTyp, (this.zinsTyp!= null)));
                    copy.setZinsTyp(copyZinsTyp);
                } else {
                    if (zinsTypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zinsTyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new ZinshausRenditeobjekt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZinshausRenditeobjekt that = ((ZinshausRenditeobjekt) object);
        {
            ZinshausRenditeobjekt.ZinsTyp lhsZinsTyp;
            lhsZinsTyp = this.getZinsTyp();
            ZinshausRenditeobjekt.ZinsTyp rhsZinsTyp;
            rhsZinsTyp = that.getZinsTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinsTyp", lhsZinsTyp), LocatorUtils.property(thatLocator, "zinsTyp", rhsZinsTyp), lhsZinsTyp, rhsZinsTyp, (this.zinsTyp!= null), (that.zinsTyp!= null))) {
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
     *                     Java enum for <em>zins_typ</em> attribute in &lt;zinshaus_renditeobjekt&gt; elements.
     * 
     * <p>Java class for null.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="MEHRFAMILIENHAUS"/&gt;
     *     &lt;enumeration value="WOHN_UND_GESCHAEFTSHAUS"/&gt;
     *     &lt;enumeration value="GESCHAEFTSHAUS"/&gt;
     *     &lt;enumeration value="BUEROGEBAEUDE"/&gt;
     *     &lt;enumeration value="SB_MAERKTE"/&gt;
     *     &lt;enumeration value="EINKAUFSCENTREN"/&gt;
     *     &lt;enumeration value="WOHNANLAGEN"/&gt;
     *     &lt;enumeration value="VERBRAUCHERMAERKTE"/&gt;
     *     &lt;enumeration value="INDUSTRIEANLAGEN"/&gt;
     *     &lt;enumeration value="PFLEGEHEIM"/&gt;
     *     &lt;enumeration value="SANATORIUM"/&gt;
     *     &lt;enumeration value="SENIORENHEIM"/&gt;
     *     &lt;enumeration value="BETREUTES-WOHNEN"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * </pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public enum ZinsTyp {

        MEHRFAMILIENHAUS("MEHRFAMILIENHAUS"),
        WOHN_UND_GESCHAEFTSHAUS("WOHN_UND_GESCHAEFTSHAUS"),
        GESCHAEFTSHAUS("GESCHAEFTSHAUS"),
        BUEROGEBAEUDE("BUEROGEBAEUDE"),
        SB_MAERKTE("SB_MAERKTE"),
        EINKAUFSCENTREN("EINKAUFSCENTREN"),
        WOHNANLAGEN("WOHNANLAGEN"),
        VERBRAUCHERMAERKTE("VERBRAUCHERMAERKTE"),
        INDUSTRIEANLAGEN("INDUSTRIEANLAGEN"),
        PFLEGEHEIM("PFLEGEHEIM"),
        SANATORIUM("SANATORIUM"),
        SENIORENHEIM("SENIORENHEIM"),
        @XmlEnumValue("BETREUTES-WOHNEN")
        BETREUTES_WOHNEN("BETREUTES-WOHNEN");
        private final String value;

        ZinsTyp(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static ZinshausRenditeobjekt.ZinsTyp fromValue(String v) {
            for (ZinshausRenditeobjekt.ZinsTyp c: ZinshausRenditeobjekt.ZinsTyp.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
