
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatedShippingChargeOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculatedShippingChargeOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ChargeEachItem"/>
 *     &lt;enumeration value="ChargeEntireOrder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalculatedShippingChargeOptionCodeType")
@XmlEnum
public enum CalculatedShippingChargeOptionCodeType {


    /**
     * 
     * 						Charge the actual shipping cost and my full packaging and handling
     * 						fee for each item.
     * 					
     * 
     */
    @XmlEnumValue("ChargeEachItem")
    CHARGE_EACH_ITEM("ChargeEachItem"),

    /**
     * 
     * 						Charge the actual shipping cost and a packaging and handling fee of
     * 						X amount for the entire order.
     * 					
     * 
     */
    @XmlEnumValue("ChargeEntireOrder")
    CHARGE_ENTIRE_ORDER("ChargeEntireOrder"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CalculatedShippingChargeOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedShippingChargeOptionCodeType fromValue(String v) {
        for (CalculatedShippingChargeOptionCodeType c: CalculatedShippingChargeOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
