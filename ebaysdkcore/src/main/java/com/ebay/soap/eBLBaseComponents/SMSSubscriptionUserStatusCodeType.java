
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSSubscriptionUserStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SMSSubscriptionUserStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Unregistered"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SMSSubscriptionUserStatusCodeType")
@XmlEnum
public enum SMSSubscriptionUserStatusCodeType {


    /**
     * 
     * 						(out) Registered.
     * 					
     * 
     */
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),

    /**
     * 
     * 						(out) Unregistered.
     * 					
     * 
     */
    @XmlEnumValue("Unregistered")
    UNREGISTERED("Unregistered"),

    /**
     * 
     * 						(out) Pending subscription.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						(out) Subscription failed.
     * 					
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SMSSubscriptionUserStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SMSSubscriptionUserStatusCodeType fromValue(String v) {
        for (SMSSubscriptionUserStatusCodeType c: SMSSubscriptionUserStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
