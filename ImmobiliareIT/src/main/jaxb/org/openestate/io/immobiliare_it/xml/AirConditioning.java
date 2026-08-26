package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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
 * <p>Java class for air-conditioning complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="air-conditioning">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="effect">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Freddo"/>
 *               <enumeration value="Caldo"/>
 *               <enumeration value="Freddo/Caldo"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </all>
 *       <attribute name="type">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Autonomo"/>
 *             <enumeration value="Centralizzato"/>
 *             <enumeration value="Predisposizione impianto"/>
 *             <enumeration value="Assente"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "air-conditioning", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class AirConditioning implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected AirConditioning.Effect effect;
    @XmlAttribute(name = "type")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected AirConditioning.Type type;

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link AirConditioning.Effect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public AirConditioning.Effect getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirConditioning.Effect }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setEffect(AirConditioning.Effect value) {
        this.effect = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AirConditioning.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public AirConditioning.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirConditioning.Type }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setType(AirConditioning.Type value) {
        this.type = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            AirConditioning.Effect theEffect;
            theEffect = this.getEffect();
            strategy.appendField(locator, this, "effect", buffer, theEffect, (this.effect!= null));
        }
        {
            AirConditioning.Type theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof AirConditioning) {
            final AirConditioning copy = ((AirConditioning) draftCopy);
            {
                Boolean effectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.effect!= null));
                if (effectShouldBeCopiedAndSet == Boolean.TRUE) {
                    AirConditioning.Effect sourceEffect;
                    sourceEffect = this.getEffect();
                    AirConditioning.Effect copyEffect = ((AirConditioning.Effect) strategy.copy(LocatorUtils.property(locator, "effect", sourceEffect), sourceEffect, (this.effect!= null)));
                    copy.setEffect(copyEffect);
                } else {
                    if (effectShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.effect = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    AirConditioning.Type sourceType;
                    sourceType = this.getType();
                    AirConditioning.Type copyType = ((AirConditioning.Type) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType, (this.type!= null)));
                    copy.setType(copyType);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new AirConditioning();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirConditioning that = ((AirConditioning) object);
        {
            AirConditioning.Effect lhsEffect;
            lhsEffect = this.getEffect();
            AirConditioning.Effect rhsEffect;
            rhsEffect = that.getEffect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effect", lhsEffect), LocatorUtils.property(thatLocator, "effect", rhsEffect), lhsEffect, rhsEffect, (this.effect!= null), (that.effect!= null))) {
                return false;
            }
        }
        {
            AirConditioning.Type lhsType;
            lhsType = this.getType();
            AirConditioning.Type rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }


    /**
     * <p>Java class for null</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * <pre>{@code
     * <simpleType>
     *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     <enumeration value="Freddo"/>
     *     <enumeration value="Caldo"/>
     *     <enumeration value="Freddo/Caldo"/>
     *   </restriction>
     * </simpleType>
     * }</pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public enum Effect {

        @XmlEnumValue("Freddo")
        FREDDO("Freddo"),
        @XmlEnumValue("Caldo")
        CALDO("Caldo"),
        @XmlEnumValue("Freddo/Caldo")
        FREDDO_CALDO("Freddo/Caldo");
        private final String value;

        Effect(String v) {
            value = v;
        }

        /**
         * Gets the value associated to the enum constant.
         * 
         * @return
         *     The value linked to the enum.
         */
        public String value() {
            return value;
        }

        /**
         * Gets the enum associated to the value passed as parameter.
         * 
         * @param v
         *     The value to get the enum from.
         * @return
         *     The enum which corresponds to the value, if it exists.
         * @throws IllegalArgumentException
         *     If no value matches in the enum declaration.
         */
        public static AirConditioning.Effect fromValue(String v) {
            for (AirConditioning.Effect c: AirConditioning.Effect.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * <p>Java class for null</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * <pre>{@code
     * <simpleType>
     *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *     <enumeration value="Autonomo"/>
     *     <enumeration value="Centralizzato"/>
     *     <enumeration value="Predisposizione impianto"/>
     *     <enumeration value="Assente"/>
     *   </restriction>
     * </simpleType>
     * }</pre>
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public enum Type {

        @XmlEnumValue("Autonomo")
        AUTONOMO("Autonomo"),
        @XmlEnumValue("Centralizzato")
        CENTRALIZZATO("Centralizzato"),
        @XmlEnumValue("Predisposizione impianto")
        PREDISPOSIZIONE_IMPIANTO("Predisposizione impianto"),
        @XmlEnumValue("Assente")
        ASSENTE("Assente");
        private final String value;

        Type(String v) {
            value = v;
        }

        /**
         * Gets the value associated to the enum constant.
         * 
         * @return
         *     The value linked to the enum.
         */
        public String value() {
            return value;
        }

        /**
         * Gets the enum associated to the value passed as parameter.
         * 
         * @param v
         *     The value to get the enum from.
         * @return
         *     The enum which corresponds to the value, if it exists.
         * @throws IllegalArgumentException
         *     If no value matches in the enum declaration.
         */
        public static AirConditioning.Type fromValue(String v) {
            for (AirConditioning.Type c: AirConditioning.Type.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
