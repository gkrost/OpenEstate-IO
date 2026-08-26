package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *     <extension base="{http://feed.immobiliare.it}processable">
 *       <sequence>
 *         <element name="date-expiration" minOccurs="0">
 *           <simpleType>
 *             <union memberTypes=" {http://www.w3.org/2001/XMLSchema}dateTime {http://feed.immobiliare.it}nullString">
 *             </union>
 *           </simpleType>
 *         </element>
 *         <element name="transactions" type="{http://feed.immobiliare.it}transactions"/>
 *         <element name="building" type="{http://feed.immobiliare.it}building"/>
 *         <element name="features" type="{http://feed.immobiliare.it}features-property"/>
 *         <element name="extra-features" type="{http://feed.immobiliare.it}extra-features" minOccurs="0"/>
 *         <element name="extended" type="{http://feed.immobiliare.it}extended" minOccurs="0"/>
 *         <element name="auction-features" type="{http://feed.immobiliare.it}auction-features" minOccurs="0"/>
 *         <element name="documents" type="{http://feed.immobiliare.it}documents" minOccurs="0"/>
 *         <element name="blueprints" type="{http://feed.immobiliare.it}blueprints" minOccurs="0"/>
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
    "dateExpiration",
    "transactions",
    "building",
    "features",
    "extraFeatures",
    "extended",
    "auctionFeatures",
    "documents",
    "blueprints"
})
@XmlRootElement(name = "property")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class Property
    extends Processable
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "date-expiration", type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Calendar dateExpiration;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Transactions transactions;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Building building;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected FeaturesProperty features;
    @XmlElement(name = "extra-features")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected ExtraFeatures extraFeatures;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Extended extended;
    @XmlElement(name = "auction-features")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected AuctionFeatures auctionFeatures;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Documents documents;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Blueprints blueprints;

    /**
     * Gets the value of the dateExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Calendar getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Sets the value of the dateExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setDateExpiration(Calendar value) {
        this.dateExpiration = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link Transactions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Transactions getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transactions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setTransactions(Transactions value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link Building }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Building getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link Building }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setBuilding(Building value) {
        this.building = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public FeaturesProperty getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesProperty }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setFeatures(FeaturesProperty value) {
        this.features = value;
    }

    /**
     * Gets the value of the extraFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraFeatures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public ExtraFeatures getExtraFeatures() {
        return extraFeatures;
    }

    /**
     * Sets the value of the extraFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraFeatures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setExtraFeatures(ExtraFeatures value) {
        this.extraFeatures = value;
    }

    /**
     * Gets the value of the extended property.
     * 
     * @return
     *     possible object is
     *     {@link Extended }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Extended getExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extended }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setExtended(Extended value) {
        this.extended = value;
    }

    /**
     * Gets the value of the auctionFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionFeatures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public AuctionFeatures getAuctionFeatures() {
        return auctionFeatures;
    }

    /**
     * Sets the value of the auctionFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionFeatures }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setAuctionFeatures(AuctionFeatures value) {
        this.auctionFeatures = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link Documents }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documents }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setDocuments(Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the blueprints property.
     * 
     * @return
     *     possible object is
     *     {@link Blueprints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Blueprints getBlueprints() {
        return blueprints;
    }

    /**
     * Sets the value of the blueprints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blueprints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setBlueprints(Blueprints value) {
        this.blueprints = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            Calendar theDateExpiration;
            theDateExpiration = this.getDateExpiration();
            strategy.appendField(locator, this, "dateExpiration", buffer, theDateExpiration, (this.dateExpiration!= null));
        }
        {
            Transactions theTransactions;
            theTransactions = this.getTransactions();
            strategy.appendField(locator, this, "transactions", buffer, theTransactions, (this.transactions!= null));
        }
        {
            Building theBuilding;
            theBuilding = this.getBuilding();
            strategy.appendField(locator, this, "building", buffer, theBuilding, (this.building!= null));
        }
        {
            FeaturesProperty theFeatures;
            theFeatures = this.getFeatures();
            strategy.appendField(locator, this, "features", buffer, theFeatures, (this.features!= null));
        }
        {
            ExtraFeatures theExtraFeatures;
            theExtraFeatures = this.getExtraFeatures();
            strategy.appendField(locator, this, "extraFeatures", buffer, theExtraFeatures, (this.extraFeatures!= null));
        }
        {
            Extended theExtended;
            theExtended = this.getExtended();
            strategy.appendField(locator, this, "extended", buffer, theExtended, (this.extended!= null));
        }
        {
            AuctionFeatures theAuctionFeatures;
            theAuctionFeatures = this.getAuctionFeatures();
            strategy.appendField(locator, this, "auctionFeatures", buffer, theAuctionFeatures, (this.auctionFeatures!= null));
        }
        {
            Documents theDocuments;
            theDocuments = this.getDocuments();
            strategy.appendField(locator, this, "documents", buffer, theDocuments, (this.documents!= null));
        }
        {
            Blueprints theBlueprints;
            theBlueprints = this.getBlueprints();
            strategy.appendField(locator, this, "blueprints", buffer, theBlueprints, (this.blueprints!= null));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof Property) {
            final Property copy = ((Property) draftCopy);
            {
                Boolean dateExpirationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateExpiration!= null));
                if (dateExpirationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateExpiration;
                    sourceDateExpiration = this.getDateExpiration();
                    Calendar copyDateExpiration = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateExpiration", sourceDateExpiration), sourceDateExpiration, (this.dateExpiration!= null)));
                    copy.setDateExpiration(copyDateExpiration);
                } else {
                    if (dateExpirationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateExpiration = null;
                    }
                }
            }
            {
                Boolean transactionsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transactions!= null));
                if (transactionsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Transactions sourceTransactions;
                    sourceTransactions = this.getTransactions();
                    Transactions copyTransactions = ((Transactions) strategy.copy(LocatorUtils.property(locator, "transactions", sourceTransactions), sourceTransactions, (this.transactions!= null)));
                    copy.setTransactions(copyTransactions);
                } else {
                    if (transactionsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transactions = null;
                    }
                }
            }
            {
                Boolean buildingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.building!= null));
                if (buildingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Building sourceBuilding;
                    sourceBuilding = this.getBuilding();
                    Building copyBuilding = ((Building) strategy.copy(LocatorUtils.property(locator, "building", sourceBuilding), sourceBuilding, (this.building!= null)));
                    copy.setBuilding(copyBuilding);
                } else {
                    if (buildingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.building = null;
                    }
                }
            }
            {
                Boolean featuresShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.features!= null));
                if (featuresShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeaturesProperty sourceFeatures;
                    sourceFeatures = this.getFeatures();
                    FeaturesProperty copyFeatures = ((FeaturesProperty) strategy.copy(LocatorUtils.property(locator, "features", sourceFeatures), sourceFeatures, (this.features!= null)));
                    copy.setFeatures(copyFeatures);
                } else {
                    if (featuresShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.features = null;
                    }
                }
            }
            {
                Boolean extraFeaturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.extraFeatures!= null));
                if (extraFeaturesShouldBeCopiedAndSet == Boolean.TRUE) {
                    ExtraFeatures sourceExtraFeatures;
                    sourceExtraFeatures = this.getExtraFeatures();
                    ExtraFeatures copyExtraFeatures = ((ExtraFeatures) strategy.copy(LocatorUtils.property(locator, "extraFeatures", sourceExtraFeatures), sourceExtraFeatures, (this.extraFeatures!= null)));
                    copy.setExtraFeatures(copyExtraFeatures);
                } else {
                    if (extraFeaturesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extraFeatures = null;
                    }
                }
            }
            {
                Boolean extendedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.extended!= null));
                if (extendedShouldBeCopiedAndSet == Boolean.TRUE) {
                    Extended sourceExtended;
                    sourceExtended = this.getExtended();
                    Extended copyExtended = ((Extended) strategy.copy(LocatorUtils.property(locator, "extended", sourceExtended), sourceExtended, (this.extended!= null)));
                    copy.setExtended(copyExtended);
                } else {
                    if (extendedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extended = null;
                    }
                }
            }
            {
                Boolean auctionFeaturesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auctionFeatures!= null));
                if (auctionFeaturesShouldBeCopiedAndSet == Boolean.TRUE) {
                    AuctionFeatures sourceAuctionFeatures;
                    sourceAuctionFeatures = this.getAuctionFeatures();
                    AuctionFeatures copyAuctionFeatures = ((AuctionFeatures) strategy.copy(LocatorUtils.property(locator, "auctionFeatures", sourceAuctionFeatures), sourceAuctionFeatures, (this.auctionFeatures!= null)));
                    copy.setAuctionFeatures(copyAuctionFeatures);
                } else {
                    if (auctionFeaturesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auctionFeatures = null;
                    }
                }
            }
            {
                Boolean documentsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.documents!= null));
                if (documentsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Documents sourceDocuments;
                    sourceDocuments = this.getDocuments();
                    Documents copyDocuments = ((Documents) strategy.copy(LocatorUtils.property(locator, "documents", sourceDocuments), sourceDocuments, (this.documents!= null)));
                    copy.setDocuments(copyDocuments);
                } else {
                    if (documentsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.documents = null;
                    }
                }
            }
            {
                Boolean blueprintsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.blueprints!= null));
                if (blueprintsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Blueprints sourceBlueprints;
                    sourceBlueprints = this.getBlueprints();
                    Blueprints copyBlueprints = ((Blueprints) strategy.copy(LocatorUtils.property(locator, "blueprints", sourceBlueprints), sourceBlueprints, (this.blueprints!= null)));
                    copy.setBlueprints(copyBlueprints);
                } else {
                    if (blueprintsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.blueprints = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new Property();
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Property that = ((Property) object);
        {
            Calendar lhsDateExpiration;
            lhsDateExpiration = this.getDateExpiration();
            Calendar rhsDateExpiration;
            rhsDateExpiration = that.getDateExpiration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateExpiration", lhsDateExpiration), LocatorUtils.property(thatLocator, "dateExpiration", rhsDateExpiration), lhsDateExpiration, rhsDateExpiration, (this.dateExpiration!= null), (that.dateExpiration!= null))) {
                return false;
            }
        }
        {
            Transactions lhsTransactions;
            lhsTransactions = this.getTransactions();
            Transactions rhsTransactions;
            rhsTransactions = that.getTransactions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactions", lhsTransactions), LocatorUtils.property(thatLocator, "transactions", rhsTransactions), lhsTransactions, rhsTransactions, (this.transactions!= null), (that.transactions!= null))) {
                return false;
            }
        }
        {
            Building lhsBuilding;
            lhsBuilding = this.getBuilding();
            Building rhsBuilding;
            rhsBuilding = that.getBuilding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "building", lhsBuilding), LocatorUtils.property(thatLocator, "building", rhsBuilding), lhsBuilding, rhsBuilding, (this.building!= null), (that.building!= null))) {
                return false;
            }
        }
        {
            FeaturesProperty lhsFeatures;
            lhsFeatures = this.getFeatures();
            FeaturesProperty rhsFeatures;
            rhsFeatures = that.getFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "features", lhsFeatures), LocatorUtils.property(thatLocator, "features", rhsFeatures), lhsFeatures, rhsFeatures, (this.features!= null), (that.features!= null))) {
                return false;
            }
        }
        {
            ExtraFeatures lhsExtraFeatures;
            lhsExtraFeatures = this.getExtraFeatures();
            ExtraFeatures rhsExtraFeatures;
            rhsExtraFeatures = that.getExtraFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraFeatures", lhsExtraFeatures), LocatorUtils.property(thatLocator, "extraFeatures", rhsExtraFeatures), lhsExtraFeatures, rhsExtraFeatures, (this.extraFeatures!= null), (that.extraFeatures!= null))) {
                return false;
            }
        }
        {
            Extended lhsExtended;
            lhsExtended = this.getExtended();
            Extended rhsExtended;
            rhsExtended = that.getExtended();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extended", lhsExtended), LocatorUtils.property(thatLocator, "extended", rhsExtended), lhsExtended, rhsExtended, (this.extended!= null), (that.extended!= null))) {
                return false;
            }
        }
        {
            AuctionFeatures lhsAuctionFeatures;
            lhsAuctionFeatures = this.getAuctionFeatures();
            AuctionFeatures rhsAuctionFeatures;
            rhsAuctionFeatures = that.getAuctionFeatures();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionFeatures", lhsAuctionFeatures), LocatorUtils.property(thatLocator, "auctionFeatures", rhsAuctionFeatures), lhsAuctionFeatures, rhsAuctionFeatures, (this.auctionFeatures!= null), (that.auctionFeatures!= null))) {
                return false;
            }
        }
        {
            Documents lhsDocuments;
            lhsDocuments = this.getDocuments();
            Documents rhsDocuments;
            rhsDocuments = that.getDocuments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documents", lhsDocuments), LocatorUtils.property(thatLocator, "documents", rhsDocuments), lhsDocuments, rhsDocuments, (this.documents!= null), (that.documents!= null))) {
                return false;
            }
        }
        {
            Blueprints lhsBlueprints;
            lhsBlueprints = this.getBlueprints();
            Blueprints rhsBlueprints;
            rhsBlueprints = that.getBlueprints();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blueprints", lhsBlueprints), LocatorUtils.property(thatLocator, "blueprints", rhsBlueprints), lhsBlueprints, rhsBlueprints, (this.blueprints!= null), (that.blueprints!= null))) {
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

}
