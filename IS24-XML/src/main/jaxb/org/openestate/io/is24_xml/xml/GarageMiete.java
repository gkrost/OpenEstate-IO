package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
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

public class GarageMiete
    extends JAXBElement<GarageMiete.Type>
{

    protected static final QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GarageMiete");

    public GarageMiete(GarageMiete.Type value) {
        super(NAME, ((Class<GarageMiete.Type> ) GarageMiete.Type.class), null, value);
    }

    public GarageMiete() {
        super(NAME, ((Class<GarageMiete.Type> ) GarageMiete.Type.class), null, null);
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.immobilienscout24.de/immobilientransfer}GarageTyp">
     *       <sequence>
     *         <element name="Mietpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGarageMieteTyp"/>
     *       </sequence>
     *       <attribute name="VerfuegbarAb" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       <attribute name="VerfuegbarBis" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mietpreise"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Type
        extends GarageTyp
        implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Mietpreise", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected VermarktungGarageMieteTyp mietpreise;
        @XmlAttribute(name = "VerfuegbarAb")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected Calendar verfuegbarAb;
        @XmlAttribute(name = "VerfuegbarBis")
        @XmlJavaTypeAdapter(Adapter1 .class)
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected Calendar verfuegbarBis;

        /**
         * Gets the value of the mietpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageMieteTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public VermarktungGarageMieteTyp getMietpreise() {
            return mietpreise;
        }

        /**
         * Sets the value of the mietpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGarageMieteTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setMietpreise(VermarktungGarageMieteTyp value) {
            this.mietpreise = value;
        }

        /**
         * Gets the value of the verfuegbarAb property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Calendar getVerfuegbarAb() {
            return verfuegbarAb;
        }

        /**
         * Sets the value of the verfuegbarAb property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setVerfuegbarAb(Calendar value) {
            this.verfuegbarAb = value;
        }

        /**
         * Gets the value of the verfuegbarBis property.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Calendar getVerfuegbarBis() {
            return verfuegbarBis;
        }

        /**
         * Sets the value of the verfuegbarBis property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setVerfuegbarBis(Calendar value) {
            this.verfuegbarBis = value;
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
            super.appendFields(locator, buffer, strategy);
            {
                VermarktungGarageMieteTyp theMietpreise;
                theMietpreise = this.getMietpreise();
                strategy.appendField(locator, this, "mietpreise", buffer, theMietpreise, (this.mietpreise!= null));
            }
            {
                Calendar theVerfuegbarAb;
                theVerfuegbarAb = this.getVerfuegbarAb();
                strategy.appendField(locator, this, "verfuegbarAb", buffer, theVerfuegbarAb, (this.verfuegbarAb!= null));
            }
            {
                Calendar theVerfuegbarBis;
                theVerfuegbarBis = this.getVerfuegbarBis();
                strategy.appendField(locator, this, "verfuegbarBis", buffer, theVerfuegbarBis, (this.verfuegbarBis!= null));
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
            super.copyTo(locator, draftCopy, strategy);
            if (draftCopy instanceof GarageMiete.Type) {
                final GarageMiete.Type copy = ((GarageMiete.Type) draftCopy);
                {
                    Boolean mietpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mietpreise!= null));
                    if (mietpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGarageMieteTyp sourceMietpreise;
                        sourceMietpreise = this.getMietpreise();
                        VermarktungGarageMieteTyp copyMietpreise = ((VermarktungGarageMieteTyp) strategy.copy(LocatorUtils.property(locator, "mietpreise", sourceMietpreise), sourceMietpreise, (this.mietpreise!= null)));
                        copy.setMietpreise(copyMietpreise);
                    } else {
                        if (mietpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.mietpreise = null;
                        }
                    }
                }
                {
                    Boolean verfuegbarAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verfuegbarAb!= null));
                    if (verfuegbarAbShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceVerfuegbarAb;
                        sourceVerfuegbarAb = this.getVerfuegbarAb();
                        Calendar copyVerfuegbarAb = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarAb", sourceVerfuegbarAb), sourceVerfuegbarAb, (this.verfuegbarAb!= null)));
                        copy.setVerfuegbarAb(copyVerfuegbarAb);
                    } else {
                        if (verfuegbarAbShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.verfuegbarAb = null;
                        }
                    }
                }
                {
                    Boolean verfuegbarBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verfuegbarBis!= null));
                    if (verfuegbarBisShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceVerfuegbarBis;
                        sourceVerfuegbarBis = this.getVerfuegbarBis();
                        Calendar copyVerfuegbarBis = ((Calendar) strategy.copy(LocatorUtils.property(locator, "verfuegbarBis", sourceVerfuegbarBis), sourceVerfuegbarBis, (this.verfuegbarBis!= null)));
                        copy.setVerfuegbarBis(copyVerfuegbarBis);
                    } else {
                        if (verfuegbarBisShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.verfuegbarBis = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new GarageMiete.Type();
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
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final GarageMiete.Type that = ((GarageMiete.Type) object);
            {
                VermarktungGarageMieteTyp lhsMietpreise;
                lhsMietpreise = this.getMietpreise();
                VermarktungGarageMieteTyp rhsMietpreise;
                rhsMietpreise = that.getMietpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mietpreise", lhsMietpreise), LocatorUtils.property(thatLocator, "mietpreise", rhsMietpreise), lhsMietpreise, rhsMietpreise, (this.mietpreise!= null), (that.mietpreise!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarAb;
                lhsVerfuegbarAb = this.getVerfuegbarAb();
                Calendar rhsVerfuegbarAb;
                rhsVerfuegbarAb = that.getVerfuegbarAb();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarAb", lhsVerfuegbarAb), LocatorUtils.property(thatLocator, "verfuegbarAb", rhsVerfuegbarAb), lhsVerfuegbarAb, rhsVerfuegbarAb, (this.verfuegbarAb!= null), (that.verfuegbarAb!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsVerfuegbarBis;
                lhsVerfuegbarBis = this.getVerfuegbarBis();
                Calendar rhsVerfuegbarBis;
                rhsVerfuegbarBis = that.getVerfuegbarBis();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "verfuegbarBis", lhsVerfuegbarBis), LocatorUtils.property(thatLocator, "verfuegbarBis", rhsVerfuegbarBis), lhsVerfuegbarBis, rhsVerfuegbarBis, (this.verfuegbarBis!= null), (that.verfuegbarBis!= null))) {
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

}
