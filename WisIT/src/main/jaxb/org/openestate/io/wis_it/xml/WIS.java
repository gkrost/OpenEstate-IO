package org.openestate.io.wis_it.xml;

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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BENUTZER">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OBJEKTE" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   <element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
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
@XmlType(name = "", propOrder = {
    "benutzer",
    "objekte"
})
@XmlRootElement(name = "WIS")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
public class WIS implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Informationen zum Benutzer, dem die importierten Objekten
     *                             zugeordnet werden sollen. Hier können in zukunft weitere Werte
     *                             hinzukommen.
     * 
     */
    @XmlElement(name = "BENUTZER", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    protected WIS.BENUTZER benutzer;
    /**
     * Beinhaltet allgemeine Angaben zu den Objekten und die einzelnen
     *                             Objekte.
     * 
     *                             Muss nicht vorhanden sein, wenn nur Kundendaten übertragen werden.
     * 
     */
    @XmlElement(name = "OBJEKTE")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    protected WIS.OBJEKTE objekte;

    /**
     * Informationen zum Benutzer, dem die importierten Objekten
     *                             zugeordnet werden sollen. Hier können in zukunft weitere Werte
     *                             hinzukommen.
     * 
     * @return
     *     possible object is
     *     {@link WIS.BENUTZER }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public WIS.BENUTZER getBENUTZER() {
        return benutzer;
    }

    /**
     * Sets the value of the benutzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIS.BENUTZER }
     *     
     * @see #getBENUTZER()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public void setBENUTZER(WIS.BENUTZER value) {
        this.benutzer = value;
    }

    /**
     * Beinhaltet allgemeine Angaben zu den Objekten und die einzelnen
     *                             Objekte.
     * 
     *                             Muss nicht vorhanden sein, wenn nur Kundendaten übertragen werden.
     * 
     * @return
     *     possible object is
     *     {@link WIS.OBJEKTE }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public WIS.OBJEKTE getOBJEKTE() {
        return objekte;
    }

    /**
     * Sets the value of the objekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIS.OBJEKTE }
     *     
     * @see #getOBJEKTE()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public void setOBJEKTE(WIS.OBJEKTE value) {
        this.objekte = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            WIS.BENUTZER theBENUTZER;
            theBENUTZER = this.getBENUTZER();
            strategy.appendField(locator, this, "benutzer", buffer, theBENUTZER, (this.benutzer!= null));
        }
        {
            WIS.OBJEKTE theOBJEKTE;
            theOBJEKTE = this.getOBJEKTE();
            strategy.appendField(locator, this, "objekte", buffer, theOBJEKTE, (this.objekte!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof WIS) {
            final WIS copy = ((WIS) draftCopy);
            {
                Boolean benutzerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.benutzer!= null));
                if (benutzerShouldBeCopiedAndSet == Boolean.TRUE) {
                    WIS.BENUTZER sourceBENUTZER;
                    sourceBENUTZER = this.getBENUTZER();
                    WIS.BENUTZER copyBENUTZER = ((WIS.BENUTZER) strategy.copy(LocatorUtils.property(locator, "benutzer", sourceBENUTZER), sourceBENUTZER, (this.benutzer!= null)));
                    copy.setBENUTZER(copyBENUTZER);
                } else {
                    if (benutzerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.benutzer = null;
                    }
                }
            }
            {
                Boolean objekteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objekte!= null));
                if (objekteShouldBeCopiedAndSet == Boolean.TRUE) {
                    WIS.OBJEKTE sourceOBJEKTE;
                    sourceOBJEKTE = this.getOBJEKTE();
                    WIS.OBJEKTE copyOBJEKTE = ((WIS.OBJEKTE) strategy.copy(LocatorUtils.property(locator, "objekte", sourceOBJEKTE), sourceOBJEKTE, (this.objekte!= null)));
                    copy.setOBJEKTE(copyOBJEKTE);
                } else {
                    if (objekteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objekte = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public Object createNewInstance() {
        return new WIS();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WIS that = ((WIS) object);
        {
            WIS.BENUTZER lhsBENUTZER;
            lhsBENUTZER = this.getBENUTZER();
            WIS.BENUTZER rhsBENUTZER;
            rhsBENUTZER = that.getBENUTZER();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "benutzer", lhsBENUTZER), LocatorUtils.property(thatLocator, "benutzer", rhsBENUTZER), lhsBENUTZER, rhsBENUTZER, (this.benutzer!= null), (that.benutzer!= null))) {
                return false;
            }
        }
        {
            WIS.OBJEKTE lhsOBJEKTE;
            lhsOBJEKTE = this.getOBJEKTE();
            WIS.OBJEKTE rhsOBJEKTE;
            rhsOBJEKTE = that.getOBJEKTE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objekte", lhsOBJEKTE), LocatorUtils.property(thatLocator, "objekte", rhsOBJEKTE), lhsOBJEKTE, rhsOBJEKTE, (this.objekte!= null), (that.objekte!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
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
     *         <element name="KDNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "kdnr"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public static class BENUTZER implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        /**
         * Wichtig ist die Definition der Kundennummer, da diese
         *                                         bestimmt, welchem Benutzer die Objekte zugeordnet werden.
         *                                         Muss vorhanden sein.
         * 
         *                                         Es findet eine interne Prüfung der Datenherkunft zu
         *                                         Kundennummer statt, sodass eine Zuordnung zu anderen
         *                                         Benutzern nicht möglich ist.
         * 
         */
        @XmlElement(name = "KDNR", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        protected String kdnr;

        /**
         * Wichtig ist die Definition der Kundennummer, da diese
         *                                         bestimmt, welchem Benutzer die Objekte zugeordnet werden.
         *                                         Muss vorhanden sein.
         * 
         *                                         Es findet eine interne Prüfung der Datenherkunft zu
         *                                         Kundennummer statt, sodass eine Zuordnung zu anderen
         *                                         Benutzern nicht möglich ist.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public String getKDNR() {
            return kdnr;
        }

        /**
         * Sets the value of the kdnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getKDNR()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public void setKDNR(String value) {
            this.kdnr = value;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theKDNR;
                theKDNR = this.getKDNR();
                strategy.appendField(locator, this, "kdnr", buffer, theKDNR, (this.kdnr!= null));
            }
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
            return copyTo(null, target, strategy);
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof WIS.BENUTZER) {
                final WIS.BENUTZER copy = ((WIS.BENUTZER) draftCopy);
                {
                    Boolean kdnrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kdnr!= null));
                    if (kdnrShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceKDNR;
                        sourceKDNR = this.getKDNR();
                        String copyKDNR = ((String) strategy.copy(LocatorUtils.property(locator, "kdnr", sourceKDNR), sourceKDNR, (this.kdnr!= null)));
                        copy.setKDNR(copyKDNR);
                    } else {
                        if (kdnrShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.kdnr = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object createNewInstance() {
            return new WIS.BENUTZER();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final WIS.BENUTZER that = ((WIS.BENUTZER) object);
            {
                String lhsKDNR;
                lhsKDNR = this.getKDNR();
                String rhsKDNR;
                rhsKDNR = that.getKDNR();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "kdnr", lhsKDNR), LocatorUtils.property(thatLocator, "kdnr", rhsKDNR), lhsKDNR, rhsKDNR, (this.kdnr!= null), (that.kdnr!= null))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            return equals(null, null, object, strategy);
        }

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
     *         <element name="ANZAHL" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         <element name="OBJEKT" type="{}ObjectType" maxOccurs="unbounded" minOccurs="0"/>
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
        "anzahl",
        "objekt"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
    public static class OBJEKTE implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        /**
         * Anzahl der Datensätze die folgen. Dient zur Kontrolle der
         *                                         Vollständigkeit des Imports. Muss vorhanden sein.
         * 
         */
        @XmlElement(name = "ANZAHL", required = true, type = String.class)
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "positiveInteger")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        protected BigInteger anzahl;
        /**
         * Direkt auf die Anzahl folgen die einzelnen Objekte.
         *                                         Mindestens ein Objekt muss vorhanden sein.
         * 
         */
        @XmlElement(name = "OBJEKT")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        protected List<ObjectType> objekt;

        /**
         * Anzahl der Datensätze die folgen. Dient zur Kontrolle der
         *                                         Vollständigkeit des Imports. Muss vorhanden sein.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public BigInteger getANZAHL() {
            return anzahl;
        }

        /**
         * Sets the value of the anzahl property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getANZAHL()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public void setANZAHL(BigInteger value) {
            this.anzahl = value;
        }

        /**
         * Direkt auf die Anzahl folgen die einzelnen Objekte.
         *                                         Mindestens ein Objekt muss vorhanden sein.
         * 
         * Gets the value of the objekt property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the objekt property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOBJEKT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObjectType }
         * </p>
         * 
         * 
         * @return
         *     The value of the objekt property.
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public List<ObjectType> getOBJEKT() {
            if (objekt == null) {
                objekt = new ArrayList<>();
            }
            return this.objekt;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                BigInteger theANZAHL;
                theANZAHL = this.getANZAHL();
                strategy.appendField(locator, this, "anzahl", buffer, theANZAHL, (this.anzahl!= null));
            }
            {
                List<ObjectType> theOBJEKT;
                theOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                strategy.appendField(locator, this, "objekt", buffer, theOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty())));
            }
            return buffer;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object clone() {
            return copyTo(createNewInstance());
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object copyTo(Object target) {
            final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
            return copyTo(null, target, strategy);
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof WIS.OBJEKTE) {
                final WIS.OBJEKTE copy = ((WIS.OBJEKTE) draftCopy);
                {
                    Boolean anzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahl!= null));
                    if (anzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                        BigInteger sourceANZAHL;
                        sourceANZAHL = this.getANZAHL();
                        BigInteger copyANZAHL = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "anzahl", sourceANZAHL), sourceANZAHL, (this.anzahl!= null)));
                        copy.setANZAHL(copyANZAHL);
                    } else {
                        if (anzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.anzahl = null;
                        }
                    }
                }
                {
                    Boolean objektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.objekt!= null)&&(!this.objekt.isEmpty())));
                    if (objektShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ObjectType> sourceOBJEKT;
                        sourceOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                        @SuppressWarnings("unchecked")
                        List<ObjectType> copyOBJEKT = ((List<ObjectType> ) strategy.copy(LocatorUtils.property(locator, "objekt", sourceOBJEKT), sourceOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty()))));
                        copy.objekt = null;
                        if (copyOBJEKT!= null) {
                            List<ObjectType> uniqueOBJEKTl = copy.getOBJEKT();
                            uniqueOBJEKTl.addAll(copyOBJEKT);
                        }
                    } else {
                        if (objektShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.objekt = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public Object createNewInstance() {
            return new WIS.OBJEKTE();
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final WIS.OBJEKTE that = ((WIS.OBJEKTE) object);
            {
                BigInteger lhsANZAHL;
                lhsANZAHL = this.getANZAHL();
                BigInteger rhsANZAHL;
                rhsANZAHL = that.getANZAHL();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahl", lhsANZAHL), LocatorUtils.property(thatLocator, "anzahl", rhsANZAHL), lhsANZAHL, rhsANZAHL, (this.anzahl!= null), (that.anzahl!= null))) {
                    return false;
                }
            }
            {
                List<ObjectType> lhsOBJEKT;
                lhsOBJEKT = (((this.objekt!= null)&&(!this.objekt.isEmpty()))?this.getOBJEKT():null);
                List<ObjectType> rhsOBJEKT;
                rhsOBJEKT = (((that.objekt!= null)&&(!that.objekt.isEmpty()))?that.getOBJEKT():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "objekt", lhsOBJEKT), LocatorUtils.property(thatLocator, "objekt", rhsOBJEKT), lhsOBJEKT, rhsOBJEKT, ((this.objekt!= null)&&(!this.objekt.isEmpty())), ((that.objekt!= null)&&(!that.objekt.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:05:59+02:00")
        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
            return equals(null, null, object, strategy);
        }

    }

}
