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
 * <p>Java class for ResultSetType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultSetType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ROW" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="COL" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="RECORDID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 <attribute name="MODID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="FOUND" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSetType", propOrder = {
    "row"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
public class ResultSetType implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "ROW")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected List<ResultSetType.ROW> row;
    @XmlAttribute(name = "FOUND", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    protected BigInteger found;

    /**
     * Gets the value of the row property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the row property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getROW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultSetType.ROW }
     * </p>
     * 
     * 
     * @return
     *     The value of the row property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public List<ResultSetType.ROW> getROW() {
        if (row == null) {
            row = new ArrayList<>();
        }
        return this.row;
    }

    /**
     * Gets the value of the found property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public BigInteger getFOUND() {
        return found;
    }

    /**
     * Sets the value of the found property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public void setFOUND(BigInteger value) {
        this.found = value;
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
            List<ResultSetType.ROW> theROW;
            theROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
            strategy.appendField(locator, this, "row", buffer, theROW, ((this.row!= null)&&(!this.row.isEmpty())));
        }
        {
            BigInteger theFOUND;
            theFOUND = this.getFOUND();
            strategy.appendField(locator, this, "found", buffer, theFOUND, (this.found!= null));
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
        if (draftCopy instanceof ResultSetType) {
            final ResultSetType copy = ((ResultSetType) draftCopy);
            {
                Boolean rowShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.row!= null)&&(!this.row.isEmpty())));
                if (rowShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ResultSetType.ROW> sourceROW;
                    sourceROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
                    @SuppressWarnings("unchecked")
                    List<ResultSetType.ROW> copyROW = ((List<ResultSetType.ROW> ) strategy.copy(LocatorUtils.property(locator, "row", sourceROW), sourceROW, ((this.row!= null)&&(!this.row.isEmpty()))));
                    copy.row = null;
                    if (copyROW!= null) {
                        List<ResultSetType.ROW> uniqueROWl = copy.getROW();
                        uniqueROWl.addAll(copyROW);
                    }
                } else {
                    if (rowShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.row = null;
                    }
                }
            }
            {
                Boolean foundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.found!= null));
                if (foundShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceFOUND;
                    sourceFOUND = this.getFOUND();
                    BigInteger copyFOUND = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "found", sourceFOUND), sourceFOUND, (this.found!= null)));
                    copy.setFOUND(copyFOUND);
                } else {
                    if (foundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.found = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public Object createNewInstance() {
        return new ResultSetType();
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
        final ResultSetType that = ((ResultSetType) object);
        {
            List<ResultSetType.ROW> lhsROW;
            lhsROW = (((this.row!= null)&&(!this.row.isEmpty()))?this.getROW():null);
            List<ResultSetType.ROW> rhsROW;
            rhsROW = (((that.row!= null)&&(!that.row.isEmpty()))?that.getROW():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "row", lhsROW), LocatorUtils.property(thatLocator, "row", rhsROW), lhsROW, rhsROW, ((this.row!= null)&&(!this.row.isEmpty())), ((that.row!= null)&&(!that.row.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsFOUND;
            lhsFOUND = this.getFOUND();
            BigInteger rhsFOUND;
            rhsFOUND = that.getFOUND();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "found", lhsFOUND), LocatorUtils.property(thatLocator, "found", rhsFOUND), lhsFOUND, rhsFOUND, (this.found!= null), (that.found!= null))) {
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
     *       <sequence>
     *         <element name="COL" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="RECORDID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       <attribute name="MODID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "col"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
    public static class ROW implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @XmlElement(name = "COL")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected List<ResultSetType.ROW.COL> col;
        @XmlAttribute(name = "RECORDID", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected BigInteger recordid;
        @XmlAttribute(name = "MODID", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        protected BigInteger modid;

        /**
         * Gets the value of the col property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the col property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCOL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResultSetType.ROW.COL }
         * </p>
         * 
         * 
         * @return
         *     The value of the col property.
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public List<ResultSetType.ROW.COL> getCOL() {
            if (col == null) {
                col = new ArrayList<>();
            }
            return this.col;
        }

        /**
         * Gets the value of the recordid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public BigInteger getRECORDID() {
            return recordid;
        }

        /**
         * Sets the value of the recordid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setRECORDID(BigInteger value) {
            this.recordid = value;
        }

        /**
         * Gets the value of the modid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public BigInteger getMODID() {
            return modid;
        }

        /**
         * Sets the value of the modid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public void setMODID(BigInteger value) {
            this.modid = value;
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
                List<ResultSetType.ROW.COL> theCOL;
                theCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                strategy.appendField(locator, this, "col", buffer, theCOL, ((this.col!= null)&&(!this.col.isEmpty())));
            }
            {
                BigInteger theRECORDID;
                theRECORDID = this.getRECORDID();
                strategy.appendField(locator, this, "recordid", buffer, theRECORDID, (this.recordid!= null));
            }
            {
                BigInteger theMODID;
                theMODID = this.getMODID();
                strategy.appendField(locator, this, "modid", buffer, theMODID, (this.modid!= null));
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
            if (draftCopy instanceof ResultSetType.ROW) {
                final ResultSetType.ROW copy = ((ResultSetType.ROW) draftCopy);
                {
                    Boolean colShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.col!= null)&&(!this.col.isEmpty())));
                    if (colShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ResultSetType.ROW.COL> sourceCOL;
                        sourceCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                        @SuppressWarnings("unchecked")
                        List<ResultSetType.ROW.COL> copyCOL = ((List<ResultSetType.ROW.COL> ) strategy.copy(LocatorUtils.property(locator, "col", sourceCOL), sourceCOL, ((this.col!= null)&&(!this.col.isEmpty()))));
                        copy.col = null;
                        if (copyCOL!= null) {
                            List<ResultSetType.ROW.COL> uniqueCOLl = copy.getCOL();
                            uniqueCOLl.addAll(copyCOL);
                        }
                    } else {
                        if (colShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.col = null;
                        }
                    }
                }
                {
                    Boolean recordidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recordid!= null));
                    if (recordidShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceRECORDID;
                        sourceRECORDID = this.getRECORDID();
                        BigInteger copyRECORDID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "recordid", sourceRECORDID), sourceRECORDID, (this.recordid!= null)));
                        copy.setRECORDID(copyRECORDID);
                    } else {
                        if (recordidShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.recordid = null;
                        }
                    }
                }
                {
                    Boolean modidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modid!= null));
                    if (modidShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceMODID;
                        sourceMODID = this.getMODID();
                        BigInteger copyMODID = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "modid", sourceMODID), sourceMODID, (this.modid!= null)));
                        copy.setMODID(copyMODID);
                    } else {
                        if (modidShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.modid = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public Object createNewInstance() {
            return new ResultSetType.ROW();
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
            final ResultSetType.ROW that = ((ResultSetType.ROW) object);
            {
                List<ResultSetType.ROW.COL> lhsCOL;
                lhsCOL = (((this.col!= null)&&(!this.col.isEmpty()))?this.getCOL():null);
                List<ResultSetType.ROW.COL> rhsCOL;
                rhsCOL = (((that.col!= null)&&(!that.col.isEmpty()))?that.getCOL():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "col", lhsCOL), LocatorUtils.property(thatLocator, "col", rhsCOL), lhsCOL, rhsCOL, ((this.col!= null)&&(!this.col.isEmpty())), ((that.col!= null)&&(!that.col.isEmpty())))) {
                    return false;
                }
            }
            {
                BigInteger lhsRECORDID;
                lhsRECORDID = this.getRECORDID();
                BigInteger rhsRECORDID;
                rhsRECORDID = that.getRECORDID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "recordid", lhsRECORDID), LocatorUtils.property(thatLocator, "recordid", rhsRECORDID), lhsRECORDID, rhsRECORDID, (this.recordid!= null), (that.recordid!= null))) {
                    return false;
                }
            }
            {
                BigInteger lhsMODID;
                lhsMODID = this.getMODID();
                BigInteger rhsMODID;
                rhsMODID = that.getMODID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modid", lhsMODID), LocatorUtils.property(thatLocator, "modid", rhsMODID), lhsMODID, rhsMODID, (this.modid!= null), (that.modid!= null))) {
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
         *       <sequence>
         *         <element name="DATA" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "data"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
        public static class COL implements Serializable, Cloneable, CopyTo, Equals, ToString
        {

            @XmlElement(name = "DATA")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            protected List<String> data;

            /**
             * Gets the value of the data property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore, any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the data property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getDATA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * </p>
             * 
             * 
             * @return
             *     The value of the data property.
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public List<String> getDATA() {
                if (data == null) {
                    data = new ArrayList<>();
                }
                return this.data;
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
                    List<String> theDATA;
                    theDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                    strategy.appendField(locator, this, "data", buffer, theDATA, ((this.data!= null)&&(!this.data.isEmpty())));
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
                if (draftCopy instanceof ResultSetType.ROW.COL) {
                    final ResultSetType.ROW.COL copy = ((ResultSetType.ROW.COL) draftCopy);
                    {
                        Boolean dataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.data!= null)&&(!this.data.isEmpty())));
                        if (dataShouldBeCopiedAndSet == Boolean.TRUE) {
                            List<String> sourceDATA;
                            sourceDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                            @SuppressWarnings("unchecked")
                            List<String> copyDATA = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "data", sourceDATA), sourceDATA, ((this.data!= null)&&(!this.data.isEmpty()))));
                            copy.data = null;
                            if (copyDATA!= null) {
                                List<String> uniqueDATAl = copy.getDATA();
                                uniqueDATAl.addAll(copyDATA);
                            }
                        } else {
                            if (dataShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.data = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:01+02:00")
            public Object createNewInstance() {
                return new ResultSetType.ROW.COL();
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
                final ResultSetType.ROW.COL that = ((ResultSetType.ROW.COL) object);
                {
                    List<String> lhsDATA;
                    lhsDATA = (((this.data!= null)&&(!this.data.isEmpty()))?this.getDATA():null);
                    List<String> rhsDATA;
                    rhsDATA = (((that.data!= null)&&(!that.data.isEmpty()))?that.getDATA():null);
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "data", lhsDATA), LocatorUtils.property(thatLocator, "data", rhsDATA), lhsDATA, rhsDATA, ((this.data!= null)&&(!this.data.isEmpty())), ((that.data!= null)&&(!that.data.isEmpty())))) {
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

}
