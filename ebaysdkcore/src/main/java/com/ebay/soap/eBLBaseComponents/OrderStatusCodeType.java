
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Authenticated"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusCodeType")
@XmlEnum
public enum OrderStatusCodeType {


    /**
     * 
     * 						The cart is active. Items can only be added, deleted, or updated in the cart
     * 						when status is Active.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						The cart is invalid; it does not exist. An example is a cart that has expired.
     * 					
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     * 						The order is completed.
     * 					
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     * 						The cart was cancelled.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						The order was shipped. Half.com users
     * 						can specify this in the GetOrders input.
     * 					
     * 
     */
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),

    /**
     * 
     * 						Default status.
     * 					
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * 
     * 						The cart was authenticated.
     * 					
     * 
     */
    @XmlEnumValue("Authenticated")
    AUTHENTICATED("Authenticated"),

    /**
     * 
     * 						After placing the order and before completion of checkout,
     * 						the card is "in process."
     * 					
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * 						Invalid.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						All the orders with active and completed status
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    OrderStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusCodeType fromValue(String v) {
        for (OrderStatusCodeType c: OrderStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
