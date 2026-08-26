package org.openestate.io.filemaker.xml.result;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for MetaDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MetaDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIELD" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="TYPE" use="required" type="{http://www.filemaker.com/fmpxmlresult}FieldType" />
 *                 <attribute name="EMPTYOK" use="required" type="{http://www.filemaker.com/fmpxmlresult}BooleanType" />
 *                 <attribute name="MAXREPEAT" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataType", propOrder = {
    "field"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
public class MetaDataType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "FIELD")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected List<MetaDataType.FIELD> field;

    /**
     * Gets the value of the field property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the field property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaDataType.FIELD }
     * </p>
     * 
     * 
     * @return
     *     The value of the field property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public List<MetaDataType.FIELD> getFIELD() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
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
            List<MetaDataType.FIELD> theFIELD;
            theFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            strategy.appendField(locator, this, "field", buffer, theFIELD, ((this.field!= null)&&(!this.field.isEmpty())));
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
        if (draftCopy instanceof MetaDataType) {
            final MetaDataType copy = ((MetaDataType) draftCopy);
            {
                Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MetaDataType.FIELD> sourceFIELD;
                    sourceFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
                    @SuppressWarnings("unchecked")
                    List<MetaDataType.FIELD> copyFIELD = ((List<MetaDataType.FIELD> ) strategy.copy(LocatorUtils.property(locator, "field", sourceFIELD), sourceFIELD, ((this.field!= null)&&(!this.field.isEmpty()))));
                    copy.field = null;
                    if (copyFIELD!= null) {
                        List<MetaDataType.FIELD> uniqueFIELDl = copy.getFIELD();
                        uniqueFIELDl.addAll(copyFIELD);
                    }
                } else {
                    if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.field = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object createNewInstance() {
        return new MetaDataType();
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
        final MetaDataType that = ((MetaDataType) object);
        {
            List<MetaDataType.FIELD> lhsFIELD;
            lhsFIELD = (((this.field!= null)&&(!this.field.isEmpty()))?this.getFIELD():null);
            List<MetaDataType.FIELD> rhsFIELD;
            rhsFIELD = (((that.field!= null)&&(!that.field.isEmpty()))?that.getFIELD():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsFIELD), LocatorUtils.property(thatLocator, "field", rhsFIELD), lhsFIELD, rhsFIELD, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="NAME" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="TYPE" use="required" type="{http://www.filemaker.com/fmpxmlresult}FieldType" />
     *       <attribute name="EMPTYOK" use="required" type="{http://www.filemaker.com/fmpxmlresult}BooleanType" />
     *       <attribute name="MAXREPEAT" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public static class FIELD implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlAttribute(name = "NAME", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected String name;
        @XmlAttribute(name = "TYPE", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected FieldType type;
        @XmlAttribute(name = "EMPTYOK", required = true)
        @XmlJavaTypeAdapter(Adapter1 .class)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected Boolean emptyok;
        @XmlAttribute(name = "MAXREPEAT", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected BigInteger maxrepeat;

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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link FieldType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public FieldType getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link FieldType }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setTYPE(FieldType value) {
            this.type = value;
        }

        /**
         * Gets the value of the emptyok property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Boolean getEMPTYOK() {
            return emptyok;
        }

        /**
         * Sets the value of the emptyok property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setEMPTYOK(Boolean value) {
            this.emptyok = value;
        }

        /**
         * Gets the value of the maxrepeat property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public BigInteger getMAXREPEAT() {
            return maxrepeat;
        }

        /**
         * Sets the value of the maxrepeat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setMAXREPEAT(BigInteger value) {
            this.maxrepeat = value;
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
                FieldType theTYPE;
                theTYPE = this.getTYPE();
                strategy.appendField(locator, this, "type", buffer, theTYPE, (this.type!= null));
            }
            {
                Boolean theEMPTYOK;
                theEMPTYOK = this.getEMPTYOK();
                strategy.appendField(locator, this, "emptyok", buffer, theEMPTYOK, (this.emptyok!= null));
            }
            {
                BigInteger theMAXREPEAT;
                theMAXREPEAT = this.getMAXREPEAT();
                strategy.appendField(locator, this, "maxrepeat", buffer, theMAXREPEAT, (this.maxrepeat!= null));
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
            if (draftCopy instanceof MetaDataType.FIELD) {
                final MetaDataType.FIELD copy = ((MetaDataType.FIELD) draftCopy);
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
                    Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.type!= null));
                    if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                        FieldType sourceTYPE;
                        sourceTYPE = this.getTYPE();
                        FieldType copyTYPE = ((FieldType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, (this.type!= null)));
                        copy.setTYPE(copyTYPE);
                    } else {
                        if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.type = null;
                        }
                    }
                }
                {
                    Boolean emptyokShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.emptyok!= null));
                    if (emptyokShouldBeCopiedAndSet == Boolean.TRUE) {
                        Boolean sourceEMPTYOK;
                        sourceEMPTYOK = this.getEMPTYOK();
                        Boolean copyEMPTYOK = ((Boolean) strategy.copy(LocatorUtils.property(locator, "emptyok", sourceEMPTYOK), sourceEMPTYOK, (this.emptyok!= null)));
                        copy.setEMPTYOK(copyEMPTYOK);
                    } else {
                        if (emptyokShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.emptyok = null;
                        }
                    }
                }
                {
                    Boolean maxrepeatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxrepeat!= null));
                    if (maxrepeatShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceMAXREPEAT;
                        sourceMAXREPEAT = this.getMAXREPEAT();
                        BigInteger copyMAXREPEAT = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "maxrepeat", sourceMAXREPEAT), sourceMAXREPEAT, (this.maxrepeat!= null)));
                        copy.setMAXREPEAT(copyMAXREPEAT);
                    } else {
                        if (maxrepeatShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.maxrepeat = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object createNewInstance() {
            return new MetaDataType.FIELD();
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
            final MetaDataType.FIELD that = ((MetaDataType.FIELD) object);
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
                FieldType lhsTYPE;
                lhsTYPE = this.getTYPE();
                FieldType rhsTYPE;
                rhsTYPE = that.getTYPE();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, (this.type!= null), (that.type!= null))) {
                    return false;
                }
            }
            {
                Boolean lhsEMPTYOK;
                lhsEMPTYOK = this.getEMPTYOK();
                Boolean rhsEMPTYOK;
                rhsEMPTYOK = that.getEMPTYOK();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "emptyok", lhsEMPTYOK), LocatorUtils.property(thatLocator, "emptyok", rhsEMPTYOK), lhsEMPTYOK, rhsEMPTYOK, (this.emptyok!= null), (that.emptyok!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsMAXREPEAT;
                lhsMAXREPEAT = this.getMAXREPEAT();
                BigInteger rhsMAXREPEAT;
                rhsMAXREPEAT = that.getMAXREPEAT();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "maxrepeat", lhsMAXREPEAT), LocatorUtils.property(thatLocator, "maxrepeat", rhsMAXREPEAT), lhsMAXREPEAT, rhsMAXREPEAT, (this.maxrepeat!= null), (that.maxrepeat!= null))) {
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

}
