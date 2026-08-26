package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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

public class GarageKauf
    extends JAXBElement<GarageKauf.Type>
{

    protected static final QName NAME = new QName("http://www.immobilienscout24.de/immobilientransfer", "GarageKauf");

    public GarageKauf(GarageKauf.Type value) {
        super(NAME, ((Class<GarageKauf.Type> ) GarageKauf.Type.class), null, value);
    }

    public GarageKauf() {
        super(NAME, ((Class<GarageKauf.Type> ) GarageKauf.Type.class), null, null);
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
     *         <element name="Kaufpreise" type="{http://www.immobilienscout24.de/immobilientransfer}VermarktungGarageKaufTyp"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kaufpreise"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public static class Type
        extends GarageTyp
        implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "Kaufpreise", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        protected VermarktungGarageKaufTyp kaufpreise;

        /**
         * Gets the value of the kaufpreise property.
         * 
         * @return
         *     possible object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public VermarktungGarageKaufTyp getKaufpreise() {
            return kaufpreise;
        }

        /**
         * Sets the value of the kaufpreise property.
         * 
         * @param value
         *     allowed object is
         *     {@link VermarktungGarageKaufTyp }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public void setKaufpreise(VermarktungGarageKaufTyp value) {
            this.kaufpreise = value;
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
                VermarktungGarageKaufTyp theKaufpreise;
                theKaufpreise = this.getKaufpreise();
                strategy.appendField(locator, this, "kaufpreise", buffer, theKaufpreise, (this.kaufpreise!= null));
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
            if (draftCopy instanceof GarageKauf.Type) {
                final GarageKauf.Type copy = ((GarageKauf.Type) draftCopy);
                {
                    Boolean kaufpreiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreise!= null));
                    if (kaufpreiseShouldBeCopiedAndSet == Boolean.TRUE) {
                        VermarktungGarageKaufTyp sourceKaufpreise;
                        sourceKaufpreise = this.getKaufpreise();
                        VermarktungGarageKaufTyp copyKaufpreise = ((VermarktungGarageKaufTyp) strategy.copy(LocatorUtils.property(locator, "kaufpreise", sourceKaufpreise), sourceKaufpreise, (this.kaufpreise!= null)));
                        copy.setKaufpreise(copyKaufpreise);
                    } else {
                        if (kaufpreiseShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kaufpreise = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
        public Object createNewInstance() {
            return new GarageKauf.Type();
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
            final GarageKauf.Type that = ((GarageKauf.Type) object);
            {
                VermarktungGarageKaufTyp lhsKaufpreise;
                lhsKaufpreise = this.getKaufpreise();
                VermarktungGarageKaufTyp rhsKaufpreise;
                rhsKaufpreise = that.getKaufpreise();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreise", lhsKaufpreise), LocatorUtils.property(thatLocator, "kaufpreise", rhsKaufpreise), lhsKaufpreise, rhsKaufpreise, (this.kaufpreise!= null), (that.kaufpreise!= null))) {
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
