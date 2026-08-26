
package org.openestate.io.openimmo.xml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
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
 * Java class for &lt;fehlerliste&gt; element.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fehler"
})
@XmlRootElement(name = "fehlerliste")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
public class Fehlerliste implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    protected List<Fehlerliste.Fehler> fehler;

    /**
     * Gets the value of the fehler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fehler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFehler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fehlerliste.Fehler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public List<Fehlerliste.Fehler> getFehler() {
        if (fehler == null) {
            fehler = new ArrayList<Fehlerliste.Fehler>();
        }
        return this.fehler;
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
            List<Fehlerliste.Fehler> theFehler;
            theFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
            strategy.appendField(locator, this, "fehler", buffer, theFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty())));
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
        if (draftCopy instanceof Fehlerliste) {
            final Fehlerliste copy = ((Fehlerliste) draftCopy);
            {
                Boolean fehlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fehler!= null)&&(!this.fehler.isEmpty())));
                if (fehlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Fehlerliste.Fehler> sourceFehler;
                    sourceFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
                    @SuppressWarnings("unchecked")
                    List<Fehlerliste.Fehler> copyFehler = ((List<Fehlerliste.Fehler> ) strategy.copy(LocatorUtils.property(locator, "fehler", sourceFehler), sourceFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty()))));
                    copy.fehler = null;
                    if (copyFehler!= null) {
                        List<Fehlerliste.Fehler> uniqueFehlerl = copy.getFehler();
                        uniqueFehlerl.addAll(copyFehler);
                    }
                } else {
                    if (fehlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fehler = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new Fehlerliste();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Fehlerliste that = ((Fehlerliste) object);
        {
            List<Fehlerliste.Fehler> lhsFehler;
            lhsFehler = (((this.fehler!= null)&&(!this.fehler.isEmpty()))?this.getFehler():null);
            List<Fehlerliste.Fehler> rhsFehler;
            rhsFehler = (((that.fehler!= null)&&(!that.fehler.isEmpty()))?that.getFehler():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fehler", lhsFehler), LocatorUtils.property(thatLocator, "fehler", rhsFehler), lhsFehler, rhsFehler, ((this.fehler!= null)&&(!this.fehler.isEmpty())), ((that.fehler!= null)&&(!that.fehler.isEmpty())))) {
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
     * Java class for &lt;fehler&gt; in &lt;fehlerliste&gt elements.
     * 
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objektId",
        "fehlernr",
        "text"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
    public static class Fehler implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "objekt_id")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        protected String objektId;
        @XmlElement(type = String.class)
        @XmlJavaTypeAdapter(Adapter5 .class)
        @XmlSchemaType(name = "int")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        protected BigInteger fehlernr;
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        protected String text;

        /**
         * Gets the value of the objektId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public String getObjektId() {
            return objektId;
        }

        /**
         * Sets the value of the objektId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public void setObjektId(String value) {
            this.objektId = value;
        }

        /**
         * Gets the value of the fehlernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public BigInteger getFehlernr() {
            return fehlernr;
        }

        /**
         * Sets the value of the fehlernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public void setFehlernr(BigInteger value) {
            this.fehlernr = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public void setText(String value) {
            this.text = value;
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
                String theObjektId;
                theObjektId = this.getObjektId();
                strategy.appendField(locator, this, "objektId", buffer, theObjektId, (this.objektId!= null));
            }
            {
                BigInteger theFehlernr;
                theFehlernr = this.getFehlernr();
                strategy.appendField(locator, this, "fehlernr", buffer, theFehlernr, (this.fehlernr!= null));
            }
            {
                String theText;
                theText = this.getText();
                strategy.appendField(locator, this, "text", buffer, theText, (this.text!= null));
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
            if (draftCopy instanceof Fehlerliste.Fehler) {
                final Fehlerliste.Fehler copy = ((Fehlerliste.Fehler) draftCopy);
                {
                    Boolean objektIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektId!= null));
                    if (objektIdShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceObjektId;
                        sourceObjektId = this.getObjektId();
                        String copyObjektId = ((String) strategy.copy(LocatorUtils.property(locator, "objektId", sourceObjektId), sourceObjektId, (this.objektId!= null)));
                        copy.setObjektId(copyObjektId);
                    } else {
                        if (objektIdShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objektId = null;
                        }
                    }
                }
                {
                    Boolean fehlernrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fehlernr!= null));
                    if (fehlernrShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceFehlernr;
                        sourceFehlernr = this.getFehlernr();
                        BigInteger copyFehlernr = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "fehlernr", sourceFehlernr), sourceFehlernr, (this.fehlernr!= null)));
                        copy.setFehlernr(copyFehlernr);
                    } else {
                        if (fehlernrShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.fehlernr = null;
                        }
                    }
                }
                {
                    Boolean textShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.text!= null));
                    if (textShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceText;
                        sourceText = this.getText();
                        String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText, (this.text!= null)));
                        copy.setText(copyText);
                    } else {
                        if (textShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.text = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public Object createNewInstance() {
            return new Fehlerliste.Fehler();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T06:31:15+02:00", comments = "JAXB RI v2.3.0")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Fehlerliste.Fehler that = ((Fehlerliste.Fehler) object);
            {
                String lhsObjektId;
                lhsObjektId = this.getObjektId();
                String rhsObjektId;
                rhsObjektId = that.getObjektId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objektId", lhsObjektId), LocatorUtils.property(thatLocator, "objektId", rhsObjektId), lhsObjektId, rhsObjektId, (this.objektId!= null), (that.objektId!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsFehlernr;
                lhsFehlernr = this.getFehlernr();
                BigInteger rhsFehlernr;
                rhsFehlernr = that.getFehlernr();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fehlernr", lhsFehlernr), LocatorUtils.property(thatLocator, "fehlernr", rhsFehlernr), lhsFehlernr, rhsFehlernr, (this.fehlernr!= null), (that.fehlernr!= null))) {
                    return false;
                }
            }
            {
                String lhsText;
                lhsText = this.getText();
                String rhsText;
                rhsText = that.getText();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, (this.text!= null), (that.text!= null))) {
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

    }

}
