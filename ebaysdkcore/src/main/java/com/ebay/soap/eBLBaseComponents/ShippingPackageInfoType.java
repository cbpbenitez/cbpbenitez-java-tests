
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Type defining the <b>ShippingPackageInfoType</b> container, which is returned in order management calls if the order is being delivered through eBay Now. 
 * 			
 * 
 * <p>Java class for ShippingPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingPackageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingTrackingEvent" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingPackageInfoType", propOrder = {
    "storeID",
    "shippingTrackingEvent",
    "scheduledDeliveryTimeMin",
    "scheduledDeliveryTimeMax",
    "actualDeliveryTime",
    "any"
})
public class ShippingPackageInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StoreID")
    protected String storeID;
    @XmlElement(name = "ShippingTrackingEvent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingTrackingEvent;
    @XmlElement(name = "ScheduledDeliveryTimeMin", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar scheduledDeliveryTimeMin;
    @XmlElement(name = "ScheduledDeliveryTimeMax", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar scheduledDeliveryTimeMax;
    @XmlElement(name = "ActualDeliveryTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actualDeliveryTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the shippingTrackingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTrackingEvent() {
        return shippingTrackingEvent;
    }

    /**
     * Sets the value of the shippingTrackingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTrackingEvent(String value) {
        this.shippingTrackingEvent = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getScheduledDeliveryTimeMin() {
        return scheduledDeliveryTimeMin;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTimeMin(Calendar value) {
        this.scheduledDeliveryTimeMin = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getScheduledDeliveryTimeMax() {
        return scheduledDeliveryTimeMax;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTimeMax(Calendar value) {
        this.scheduledDeliveryTimeMax = value;
    }

    /**
     * Gets the value of the actualDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Sets the value of the actualDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDeliveryTime(Calendar value) {
        this.actualDeliveryTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
