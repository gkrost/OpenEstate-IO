package org.openestate.io.is24_xml.xml;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for TypenHausTyp complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TypenHausTyp">
 *   <complexContent>
 *     <extension base="{http://www.immobilienscout24.de/immobilientransfer}VirtuelleImmobilieBaseTyp">
 *       <sequence>
 *         <element name="Baureihe" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *         <element name="Haustypinfo" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *         <element name="Dachform" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *         <element name="WohnFlProGeschoss" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *         <element name="PreisProBauleistung" type="{http://www.immobilienscout24.de/immobilientransfer}Freitext2000Typ" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Objektkategorie2" type="{http://www.immobilienscout24.de/immobilientransfer}TypenHausKategorienTyp" default="keineAngabe" />
 *       <attribute name="Wohnflaeche" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       <attribute name="Grundflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       <attribute name="Gesamtflaeche" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl102Typ" />
 *       <attribute name="Zimmeranzahl" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}ZimmeranzahlTyp" />
 *       <attribute name="PreisAb" use="required" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl152Typ" />
 *       <attribute name="Bauweise" type="{http://www.immobilienscout24.de/immobilientransfer}BauweiseTyp" />
 *       <attribute name="KWert" type="{http://www.immobilienscout24.de/immobilientransfer}Zahl32Typ" />
 *       <attribute name="Ausbaustufe" type="{http://www.immobilienscout24.de/immobilientransfer}AusbaustufeTyp" />
 *       <attribute name="Energiestandard" type="{http://www.immobilienscout24.de/immobilientransfer}EnergiestandardTyp" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypenHausTyp", propOrder = {
    "baureihe",
    "haustypinfo",
    "dachform",
    "wohnFlProGeschoss",
    "preisProBauleistung"
})
@XmlSeeAlso({
    TypenHaus.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
public class TypenHausTyp
    extends VirtuelleImmobilieBaseTyp
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Baureihe")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String baureihe;
    @XmlElement(name = "Haustypinfo")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String haustypinfo;
    @XmlElement(name = "Dachform")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String dachform;
    @XmlElement(name = "WohnFlProGeschoss")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String wohnFlProGeschoss;
    @XmlElement(name = "PreisProBauleistung")
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected String preisProBauleistung;
    @XmlAttribute(name = "Objektkategorie2")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected TypenHausKategorienTyp objektkategorie2;
    @XmlAttribute(name = "Wohnflaeche", required = true)
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal wohnflaeche;
    @XmlAttribute(name = "Grundflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal grundflaeche;
    @XmlAttribute(name = "Gesamtflaeche")
    @XmlJavaTypeAdapter(Adapter34 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal gesamtflaeche;
    @XmlAttribute(name = "Zimmeranzahl", required = true)
    @XmlJavaTypeAdapter(Adapter32 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal zimmeranzahl;
    @XmlAttribute(name = "PreisAb", required = true)
    @XmlJavaTypeAdapter(Adapter35 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal preisAb;
    @XmlAttribute(name = "Bauweise")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BauweiseTyp bauweise;
    /**
     * Neuer Fachbegriff hierfuer: U-Wert
     * 
     */
    @XmlAttribute(name = "KWert")
    @XmlJavaTypeAdapter(Adapter28 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected BigDecimal kWert;
    @XmlAttribute(name = "Ausbaustufe")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected AusbaustufeTyp ausbaustufe;
    @XmlAttribute(name = "Energiestandard")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    protected EnergiestandardTyp energiestandard;

    /**
     * Gets the value of the baureihe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getBaureihe() {
        return baureihe;
    }

    /**
     * Sets the value of the baureihe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setBaureihe(String value) {
        this.baureihe = value;
    }

    /**
     * Gets the value of the haustypinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getHaustypinfo() {
        return haustypinfo;
    }

    /**
     * Sets the value of the haustypinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setHaustypinfo(String value) {
        this.haustypinfo = value;
    }

    /**
     * Gets the value of the dachform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getDachform() {
        return dachform;
    }

    /**
     * Sets the value of the dachform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setDachform(String value) {
        this.dachform = value;
    }

    /**
     * Gets the value of the wohnFlProGeschoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getWohnFlProGeschoss() {
        return wohnFlProGeschoss;
    }

    /**
     * Sets the value of the wohnFlProGeschoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setWohnFlProGeschoss(String value) {
        this.wohnFlProGeschoss = value;
    }

    /**
     * Gets the value of the preisProBauleistung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public String getPreisProBauleistung() {
        return preisProBauleistung;
    }

    /**
     * Sets the value of the preisProBauleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setPreisProBauleistung(String value) {
        this.preisProBauleistung = value;
    }

    /**
     * Gets the value of the objektkategorie2 property.
     * 
     * @return
     *     possible object is
     *     {@link TypenHausKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public TypenHausKategorienTyp getObjektkategorie2() {
        if (objektkategorie2 == null) {
            return TypenHausKategorienTyp.KEINE_ANGABE;
        } else {
            return objektkategorie2;
        }
    }

    /**
     * Sets the value of the objektkategorie2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypenHausKategorienTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setObjektkategorie2(TypenHausKategorienTyp value) {
        this.objektkategorie2 = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setWohnflaeche(BigDecimal value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the grundflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getGrundflaeche() {
        return grundflaeche;
    }

    /**
     * Sets the value of the grundflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setGrundflaeche(BigDecimal value) {
        this.grundflaeche = value;
    }

    /**
     * Gets the value of the gesamtflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getGesamtflaeche() {
        return gesamtflaeche;
    }

    /**
     * Sets the value of the gesamtflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setGesamtflaeche(BigDecimal value) {
        this.gesamtflaeche = value;
    }

    /**
     * Gets the value of the zimmeranzahl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getZimmeranzahl() {
        return zimmeranzahl;
    }

    /**
     * Sets the value of the zimmeranzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setZimmeranzahl(BigDecimal value) {
        this.zimmeranzahl = value;
    }

    /**
     * Gets the value of the preisAb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getPreisAb() {
        return preisAb;
    }

    /**
     * Sets the value of the preisAb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setPreisAb(BigDecimal value) {
        this.preisAb = value;
    }

    /**
     * Gets the value of the bauweise property.
     * 
     * @return
     *     possible object is
     *     {@link BauweiseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BauweiseTyp getBauweise() {
        return bauweise;
    }

    /**
     * Sets the value of the bauweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link BauweiseTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setBauweise(BauweiseTyp value) {
        this.bauweise = value;
    }

    /**
     * Neuer Fachbegriff hierfuer: U-Wert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public BigDecimal getKWert() {
        return kWert;
    }

    /**
     * Sets the value of the kWert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getKWert()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setKWert(BigDecimal value) {
        this.kWert = value;
    }

    /**
     * Gets the value of the ausbaustufe property.
     * 
     * @return
     *     possible object is
     *     {@link AusbaustufeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public AusbaustufeTyp getAusbaustufe() {
        return ausbaustufe;
    }

    /**
     * Sets the value of the ausbaustufe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AusbaustufeTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setAusbaustufe(AusbaustufeTyp value) {
        this.ausbaustufe = value;
    }

    /**
     * Gets the value of the energiestandard property.
     * 
     * @return
     *     possible object is
     *     {@link EnergiestandardTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public EnergiestandardTyp getEnergiestandard() {
        return energiestandard;
    }

    /**
     * Sets the value of the energiestandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergiestandardTyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public void setEnergiestandard(EnergiestandardTyp value) {
        this.energiestandard = value;
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
            String theBaureihe;
            theBaureihe = this.getBaureihe();
            strategy.appendField(locator, this, "baureihe", buffer, theBaureihe, (this.baureihe!= null));
        }
        {
            String theHaustypinfo;
            theHaustypinfo = this.getHaustypinfo();
            strategy.appendField(locator, this, "haustypinfo", buffer, theHaustypinfo, (this.haustypinfo!= null));
        }
        {
            String theDachform;
            theDachform = this.getDachform();
            strategy.appendField(locator, this, "dachform", buffer, theDachform, (this.dachform!= null));
        }
        {
            String theWohnFlProGeschoss;
            theWohnFlProGeschoss = this.getWohnFlProGeschoss();
            strategy.appendField(locator, this, "wohnFlProGeschoss", buffer, theWohnFlProGeschoss, (this.wohnFlProGeschoss!= null));
        }
        {
            String thePreisProBauleistung;
            thePreisProBauleistung = this.getPreisProBauleistung();
            strategy.appendField(locator, this, "preisProBauleistung", buffer, thePreisProBauleistung, (this.preisProBauleistung!= null));
        }
        {
            TypenHausKategorienTyp theObjektkategorie2;
            theObjektkategorie2 = this.getObjektkategorie2();
            strategy.appendField(locator, this, "objektkategorie2", buffer, theObjektkategorie2, (this.objektkategorie2 != null));
        }
        {
            BigDecimal theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            strategy.appendField(locator, this, "wohnflaeche", buffer, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            BigDecimal theGrundflaeche;
            theGrundflaeche = this.getGrundflaeche();
            strategy.appendField(locator, this, "grundflaeche", buffer, theGrundflaeche, (this.grundflaeche!= null));
        }
        {
            BigDecimal theGesamtflaeche;
            theGesamtflaeche = this.getGesamtflaeche();
            strategy.appendField(locator, this, "gesamtflaeche", buffer, theGesamtflaeche, (this.gesamtflaeche!= null));
        }
        {
            BigDecimal theZimmeranzahl;
            theZimmeranzahl = this.getZimmeranzahl();
            strategy.appendField(locator, this, "zimmeranzahl", buffer, theZimmeranzahl, (this.zimmeranzahl!= null));
        }
        {
            BigDecimal thePreisAb;
            thePreisAb = this.getPreisAb();
            strategy.appendField(locator, this, "preisAb", buffer, thePreisAb, (this.preisAb!= null));
        }
        {
            BauweiseTyp theBauweise;
            theBauweise = this.getBauweise();
            strategy.appendField(locator, this, "bauweise", buffer, theBauweise, (this.bauweise!= null));
        }
        {
            BigDecimal theKWert;
            theKWert = this.getKWert();
            strategy.appendField(locator, this, "kWert", buffer, theKWert, (this.kWert!= null));
        }
        {
            AusbaustufeTyp theAusbaustufe;
            theAusbaustufe = this.getAusbaustufe();
            strategy.appendField(locator, this, "ausbaustufe", buffer, theAusbaustufe, (this.ausbaustufe!= null));
        }
        {
            EnergiestandardTyp theEnergiestandard;
            theEnergiestandard = this.getEnergiestandard();
            strategy.appendField(locator, this, "energiestandard", buffer, theEnergiestandard, (this.energiestandard!= null));
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
        if (draftCopy instanceof TypenHausTyp) {
            final TypenHausTyp copy = ((TypenHausTyp) draftCopy);
            {
                Boolean baureiheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baureihe!= null));
                if (baureiheShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBaureihe;
                    sourceBaureihe = this.getBaureihe();
                    String copyBaureihe = ((String) strategy.copy(LocatorUtils.property(locator, "baureihe", sourceBaureihe), sourceBaureihe, (this.baureihe!= null)));
                    copy.setBaureihe(copyBaureihe);
                } else {
                    if (baureiheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baureihe = null;
                    }
                }
            }
            {
                Boolean haustypinfoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haustypinfo!= null));
                if (haustypinfoShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHaustypinfo;
                    sourceHaustypinfo = this.getHaustypinfo();
                    String copyHaustypinfo = ((String) strategy.copy(LocatorUtils.property(locator, "haustypinfo", sourceHaustypinfo), sourceHaustypinfo, (this.haustypinfo!= null)));
                    copy.setHaustypinfo(copyHaustypinfo);
                } else {
                    if (haustypinfoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haustypinfo = null;
                    }
                }
            }
            {
                Boolean dachformShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dachform!= null));
                if (dachformShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDachform;
                    sourceDachform = this.getDachform();
                    String copyDachform = ((String) strategy.copy(LocatorUtils.property(locator, "dachform", sourceDachform), sourceDachform, (this.dachform!= null)));
                    copy.setDachform(copyDachform);
                } else {
                    if (dachformShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dachform = null;
                    }
                }
            }
            {
                Boolean wohnFlProGeschossShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnFlProGeschoss!= null));
                if (wohnFlProGeschossShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWohnFlProGeschoss;
                    sourceWohnFlProGeschoss = this.getWohnFlProGeschoss();
                    String copyWohnFlProGeschoss = ((String) strategy.copy(LocatorUtils.property(locator, "wohnFlProGeschoss", sourceWohnFlProGeschoss), sourceWohnFlProGeschoss, (this.wohnFlProGeschoss!= null)));
                    copy.setWohnFlProGeschoss(copyWohnFlProGeschoss);
                } else {
                    if (wohnFlProGeschossShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnFlProGeschoss = null;
                    }
                }
            }
            {
                Boolean preisProBauleistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisProBauleistung!= null));
                if (preisProBauleistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePreisProBauleistung;
                    sourcePreisProBauleistung = this.getPreisProBauleistung();
                    String copyPreisProBauleistung = ((String) strategy.copy(LocatorUtils.property(locator, "preisProBauleistung", sourcePreisProBauleistung), sourcePreisProBauleistung, (this.preisProBauleistung!= null)));
                    copy.setPreisProBauleistung(copyPreisProBauleistung);
                } else {
                    if (preisProBauleistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisProBauleistung = null;
                    }
                }
            }
            {
                Boolean objektkategorie2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkategorie2 != null));
                if (objektkategorie2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    TypenHausKategorienTyp sourceObjektkategorie2;
                    sourceObjektkategorie2 = this.getObjektkategorie2();
                    TypenHausKategorienTyp copyObjektkategorie2 = ((TypenHausKategorienTyp) strategy.copy(LocatorUtils.property(locator, "objektkategorie2", sourceObjektkategorie2), sourceObjektkategorie2, (this.objektkategorie2 != null)));
                    copy.setObjektkategorie2(copyObjektkategorie2);
                } else {
                    if (objektkategorie2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkategorie2 = null;
                    }
                }
            }
            {
                Boolean wohnflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaeche!= null));
                if (wohnflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWohnflaeche;
                    sourceWohnflaeche = this.getWohnflaeche();
                    BigDecimal copyWohnflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche, (this.wohnflaeche!= null)));
                    copy.setWohnflaeche(copyWohnflaeche);
                } else {
                    if (wohnflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaeche = null;
                    }
                }
            }
            {
                Boolean grundflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grundflaeche!= null));
                if (grundflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrundflaeche;
                    sourceGrundflaeche = this.getGrundflaeche();
                    BigDecimal copyGrundflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grundflaeche", sourceGrundflaeche), sourceGrundflaeche, (this.grundflaeche!= null)));
                    copy.setGrundflaeche(copyGrundflaeche);
                } else {
                    if (grundflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grundflaeche = null;
                    }
                }
            }
            {
                Boolean gesamtflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gesamtflaeche!= null));
                if (gesamtflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGesamtflaeche;
                    sourceGesamtflaeche = this.getGesamtflaeche();
                    BigDecimal copyGesamtflaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gesamtflaeche", sourceGesamtflaeche), sourceGesamtflaeche, (this.gesamtflaeche!= null)));
                    copy.setGesamtflaeche(copyGesamtflaeche);
                } else {
                    if (gesamtflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gesamtflaeche = null;
                    }
                }
            }
            {
                Boolean zimmeranzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zimmeranzahl!= null));
                if (zimmeranzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceZimmeranzahl;
                    sourceZimmeranzahl = this.getZimmeranzahl();
                    BigDecimal copyZimmeranzahl = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "zimmeranzahl", sourceZimmeranzahl), sourceZimmeranzahl, (this.zimmeranzahl!= null)));
                    copy.setZimmeranzahl(copyZimmeranzahl);
                } else {
                    if (zimmeranzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zimmeranzahl = null;
                    }
                }
            }
            {
                Boolean preisAbShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisAb!= null));
                if (preisAbShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreisAb;
                    sourcePreisAb = this.getPreisAb();
                    BigDecimal copyPreisAb = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisAb", sourcePreisAb), sourcePreisAb, (this.preisAb!= null)));
                    copy.setPreisAb(copyPreisAb);
                } else {
                    if (preisAbShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisAb = null;
                    }
                }
            }
            {
                Boolean bauweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bauweise!= null));
                if (bauweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    BauweiseTyp sourceBauweise;
                    sourceBauweise = this.getBauweise();
                    BauweiseTyp copyBauweise = ((BauweiseTyp) strategy.copy(LocatorUtils.property(locator, "bauweise", sourceBauweise), sourceBauweise, (this.bauweise!= null)));
                    copy.setBauweise(copyBauweise);
                } else {
                    if (bauweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauweise = null;
                    }
                }
            }
            {
                Boolean kWertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kWert!= null));
                if (kWertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKWert;
                    sourceKWert = this.getKWert();
                    BigDecimal copyKWert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kWert", sourceKWert), sourceKWert, (this.kWert!= null)));
                    copy.setKWert(copyKWert);
                } else {
                    if (kWertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kWert = null;
                    }
                }
            }
            {
                Boolean ausbaustufeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausbaustufe!= null));
                if (ausbaustufeShouldBeCopiedAndSet == Boolean.TRUE) {
                    AusbaustufeTyp sourceAusbaustufe;
                    sourceAusbaustufe = this.getAusbaustufe();
                    AusbaustufeTyp copyAusbaustufe = ((AusbaustufeTyp) strategy.copy(LocatorUtils.property(locator, "ausbaustufe", sourceAusbaustufe), sourceAusbaustufe, (this.ausbaustufe!= null)));
                    copy.setAusbaustufe(copyAusbaustufe);
                } else {
                    if (ausbaustufeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausbaustufe = null;
                    }
                }
            }
            {
                Boolean energiestandardShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energiestandard!= null));
                if (energiestandardShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergiestandardTyp sourceEnergiestandard;
                    sourceEnergiestandard = this.getEnergiestandard();
                    EnergiestandardTyp copyEnergiestandard = ((EnergiestandardTyp) strategy.copy(LocatorUtils.property(locator, "energiestandard", sourceEnergiestandard), sourceEnergiestandard, (this.energiestandard!= null)));
                    copy.setEnergiestandard(copyEnergiestandard);
                } else {
                    if (energiestandardShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energiestandard = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:23+02:00")
    public Object createNewInstance() {
        return new TypenHausTyp();
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
        final TypenHausTyp that = ((TypenHausTyp) object);
        {
            String lhsBaureihe;
            lhsBaureihe = this.getBaureihe();
            String rhsBaureihe;
            rhsBaureihe = that.getBaureihe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baureihe", lhsBaureihe), LocatorUtils.property(thatLocator, "baureihe", rhsBaureihe), lhsBaureihe, rhsBaureihe, (this.baureihe!= null), (that.baureihe!= null))) {
                return false;
            }
        }
        {
            String lhsHaustypinfo;
            lhsHaustypinfo = this.getHaustypinfo();
            String rhsHaustypinfo;
            rhsHaustypinfo = that.getHaustypinfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haustypinfo", lhsHaustypinfo), LocatorUtils.property(thatLocator, "haustypinfo", rhsHaustypinfo), lhsHaustypinfo, rhsHaustypinfo, (this.haustypinfo!= null), (that.haustypinfo!= null))) {
                return false;
            }
        }
        {
            String lhsDachform;
            lhsDachform = this.getDachform();
            String rhsDachform;
            rhsDachform = that.getDachform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachform", lhsDachform), LocatorUtils.property(thatLocator, "dachform", rhsDachform), lhsDachform, rhsDachform, (this.dachform!= null), (that.dachform!= null))) {
                return false;
            }
        }
        {
            String lhsWohnFlProGeschoss;
            lhsWohnFlProGeschoss = this.getWohnFlProGeschoss();
            String rhsWohnFlProGeschoss;
            rhsWohnFlProGeschoss = that.getWohnFlProGeschoss();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnFlProGeschoss", lhsWohnFlProGeschoss), LocatorUtils.property(thatLocator, "wohnFlProGeschoss", rhsWohnFlProGeschoss), lhsWohnFlProGeschoss, rhsWohnFlProGeschoss, (this.wohnFlProGeschoss!= null), (that.wohnFlProGeschoss!= null))) {
                return false;
            }
        }
        {
            String lhsPreisProBauleistung;
            lhsPreisProBauleistung = this.getPreisProBauleistung();
            String rhsPreisProBauleistung;
            rhsPreisProBauleistung = that.getPreisProBauleistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisProBauleistung", lhsPreisProBauleistung), LocatorUtils.property(thatLocator, "preisProBauleistung", rhsPreisProBauleistung), lhsPreisProBauleistung, rhsPreisProBauleistung, (this.preisProBauleistung!= null), (that.preisProBauleistung!= null))) {
                return false;
            }
        }
        {
            TypenHausKategorienTyp lhsObjektkategorie2;
            lhsObjektkategorie2 = this.getObjektkategorie2();
            TypenHausKategorienTyp rhsObjektkategorie2;
            rhsObjektkategorie2 = that.getObjektkategorie2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkategorie2", lhsObjektkategorie2), LocatorUtils.property(thatLocator, "objektkategorie2", rhsObjektkategorie2), lhsObjektkategorie2, rhsObjektkategorie2, (this.objektkategorie2 != null), (that.objektkategorie2 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            BigDecimal rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche, (this.wohnflaeche!= null), (that.wohnflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrundflaeche;
            lhsGrundflaeche = this.getGrundflaeche();
            BigDecimal rhsGrundflaeche;
            rhsGrundflaeche = that.getGrundflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grundflaeche", lhsGrundflaeche), LocatorUtils.property(thatLocator, "grundflaeche", rhsGrundflaeche), lhsGrundflaeche, rhsGrundflaeche, (this.grundflaeche!= null), (that.grundflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGesamtflaeche;
            lhsGesamtflaeche = this.getGesamtflaeche();
            BigDecimal rhsGesamtflaeche;
            rhsGesamtflaeche = that.getGesamtflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesamtflaeche", lhsGesamtflaeche), LocatorUtils.property(thatLocator, "gesamtflaeche", rhsGesamtflaeche), lhsGesamtflaeche, rhsGesamtflaeche, (this.gesamtflaeche!= null), (that.gesamtflaeche!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsZimmeranzahl;
            lhsZimmeranzahl = this.getZimmeranzahl();
            BigDecimal rhsZimmeranzahl;
            rhsZimmeranzahl = that.getZimmeranzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zimmeranzahl", lhsZimmeranzahl), LocatorUtils.property(thatLocator, "zimmeranzahl", rhsZimmeranzahl), lhsZimmeranzahl, rhsZimmeranzahl, (this.zimmeranzahl!= null), (that.zimmeranzahl!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPreisAb;
            lhsPreisAb = this.getPreisAb();
            BigDecimal rhsPreisAb;
            rhsPreisAb = that.getPreisAb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisAb", lhsPreisAb), LocatorUtils.property(thatLocator, "preisAb", rhsPreisAb), lhsPreisAb, rhsPreisAb, (this.preisAb!= null), (that.preisAb!= null))) {
                return false;
            }
        }
        {
            BauweiseTyp lhsBauweise;
            lhsBauweise = this.getBauweise();
            BauweiseTyp rhsBauweise;
            rhsBauweise = that.getBauweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauweise", lhsBauweise), LocatorUtils.property(thatLocator, "bauweise", rhsBauweise), lhsBauweise, rhsBauweise, (this.bauweise!= null), (that.bauweise!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKWert;
            lhsKWert = this.getKWert();
            BigDecimal rhsKWert;
            rhsKWert = that.getKWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kWert", lhsKWert), LocatorUtils.property(thatLocator, "kWert", rhsKWert), lhsKWert, rhsKWert, (this.kWert!= null), (that.kWert!= null))) {
                return false;
            }
        }
        {
            AusbaustufeTyp lhsAusbaustufe;
            lhsAusbaustufe = this.getAusbaustufe();
            AusbaustufeTyp rhsAusbaustufe;
            rhsAusbaustufe = that.getAusbaustufe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausbaustufe", lhsAusbaustufe), LocatorUtils.property(thatLocator, "ausbaustufe", rhsAusbaustufe), lhsAusbaustufe, rhsAusbaustufe, (this.ausbaustufe!= null), (that.ausbaustufe!= null))) {
                return false;
            }
        }
        {
            EnergiestandardTyp lhsEnergiestandard;
            lhsEnergiestandard = this.getEnergiestandard();
            EnergiestandardTyp rhsEnergiestandard;
            rhsEnergiestandard = that.getEnergiestandard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energiestandard", lhsEnergiestandard), LocatorUtils.property(thatLocator, "energiestandard", rhsEnergiestandard), lhsEnergiestandard, rhsEnergiestandard, (this.energiestandard!= null), (that.energiestandard!= null))) {
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
