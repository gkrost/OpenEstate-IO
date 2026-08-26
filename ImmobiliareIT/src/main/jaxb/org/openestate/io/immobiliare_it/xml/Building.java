package org.openestate.io.immobiliare_it.xml;

import java.io.Serializable;
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
import org.openestate.io.immobiliare_it.xml.types.Breadcrumb;


/**
 * <p>Java class for building complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="building">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="maps" type="{http://feed.immobiliare.it}buildingMaps" minOccurs="0"/>
 *         <element name="status" type="{http://feed.immobiliare.it}status" minOccurs="0"/>
 *         <element name="terrains" type="{http://feed.immobiliare.it}terrains" minOccurs="0"/>
 *         <element name="class" type="{http://feed.immobiliare.it}class" minOccurs="0"/>
 *       </all>
 *       <attribute name="map" type="{http://feed.immobiliare.it}breadcrumb3" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "building", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
public class Building implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected BuildingMaps maps;
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected StatusType status;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Terrains terrains;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected ClassType clazz;
    @XmlAttribute(name = "map")
    @XmlJavaTypeAdapter(Adapter11 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    protected Breadcrumb map;

    /**
     * Gets the value of the maps property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingMaps }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public BuildingMaps getMaps() {
        return maps;
    }

    /**
     * Sets the value of the maps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingMaps }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setMaps(BuildingMaps value) {
        this.maps = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the terrains property.
     * 
     * @return
     *     possible object is
     *     {@link Terrains }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Terrains getTerrains() {
        return terrains;
    }

    /**
     * Sets the value of the terrains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terrains }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setTerrains(Terrains value) {
        this.terrains = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public ClassType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setClazz(ClassType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Breadcrumb }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Breadcrumb getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breadcrumb }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public void setMap(Breadcrumb value) {
        this.map = value;
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
            BuildingMaps theMaps;
            theMaps = this.getMaps();
            strategy.appendField(locator, this, "maps", buffer, theMaps, (this.maps!= null));
        }
        {
            StatusType theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            Terrains theTerrains;
            theTerrains = this.getTerrains();
            strategy.appendField(locator, this, "terrains", buffer, theTerrains, (this.terrains!= null));
        }
        {
            ClassType theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz, (this.clazz!= null));
        }
        {
            Breadcrumb theMap;
            theMap = this.getMap();
            strategy.appendField(locator, this, "map", buffer, theMap, (this.map!= null));
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
        if (draftCopy instanceof Building) {
            final Building copy = ((Building) draftCopy);
            {
                Boolean mapsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maps!= null));
                if (mapsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BuildingMaps sourceMaps;
                    sourceMaps = this.getMaps();
                    BuildingMaps copyMaps = ((BuildingMaps) strategy.copy(LocatorUtils.property(locator, "maps", sourceMaps), sourceMaps, (this.maps!= null)));
                    copy.setMaps(copyMaps);
                } else {
                    if (mapsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maps = null;
                    }
                }
            }
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    StatusType sourceStatus;
                    sourceStatus = this.getStatus();
                    StatusType copyStatus = ((StatusType) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean terrainsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terrains!= null));
                if (terrainsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Terrains sourceTerrains;
                    sourceTerrains = this.getTerrains();
                    Terrains copyTerrains = ((Terrains) strategy.copy(LocatorUtils.property(locator, "terrains", sourceTerrains), sourceTerrains, (this.terrains!= null)));
                    copy.setTerrains(copyTerrains);
                } else {
                    if (terrainsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terrains = null;
                    }
                }
            }
            {
                Boolean clazzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clazz!= null));
                if (clazzShouldBeCopiedAndSet == Boolean.TRUE) {
                    ClassType sourceClazz;
                    sourceClazz = this.getClazz();
                    ClassType copyClazz = ((ClassType) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz, (this.clazz!= null)));
                    copy.setClazz(copyClazz);
                } else {
                    if (clazzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clazz = null;
                    }
                }
            }
            {
                Boolean mapShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.map!= null));
                if (mapShouldBeCopiedAndSet == Boolean.TRUE) {
                    Breadcrumb sourceMap;
                    sourceMap = this.getMap();
                    Breadcrumb copyMap = ((Breadcrumb) strategy.copy(LocatorUtils.property(locator, "map", sourceMap), sourceMap, (this.map!= null)));
                    copy.setMap(copyMap);
                } else {
                    if (mapShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.map = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:17:08+02:00")
    public Object createNewInstance() {
        return new Building();
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
        final Building that = ((Building) object);
        {
            BuildingMaps lhsMaps;
            lhsMaps = this.getMaps();
            BuildingMaps rhsMaps;
            rhsMaps = that.getMaps();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maps", lhsMaps), LocatorUtils.property(thatLocator, "maps", rhsMaps), lhsMaps, rhsMaps, (this.maps!= null), (that.maps!= null))) {
                return false;
            }
        }
        {
            StatusType lhsStatus;
            lhsStatus = this.getStatus();
            StatusType rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Terrains lhsTerrains;
            lhsTerrains = this.getTerrains();
            Terrains rhsTerrains;
            rhsTerrains = that.getTerrains();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terrains", lhsTerrains), LocatorUtils.property(thatLocator, "terrains", rhsTerrains), lhsTerrains, rhsTerrains, (this.terrains!= null), (that.terrains!= null))) {
                return false;
            }
        }
        {
            ClassType lhsClazz;
            lhsClazz = this.getClazz();
            ClassType rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz, (this.clazz!= null), (that.clazz!= null))) {
                return false;
            }
        }
        {
            Breadcrumb lhsMap;
            lhsMap = this.getMap();
            Breadcrumb rhsMap;
            rhsMap = that.getMap();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "map", lhsMap), LocatorUtils.property(thatLocator, "map", rhsMap), lhsMap, rhsMap, (this.map!= null), (that.map!= null))) {
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
