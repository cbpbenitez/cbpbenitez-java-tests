
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundStatusCodeType")
@XmlEnum
public enum RefundStatusCodeType {


    /**
     * 
     * 					 The refund request was successful.<br/><br/>
     * 					 <span class="tablenote">
     * 					 <strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					 </span>
     * 					
     * 
     */
    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),

    /**
     * 
     * 					 The refund request is being processed.<br/><br/>
     * 					 <span class="tablenote">
     * 					 <strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					 </span>
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 					 The refund request was rejected.<br/><br/>
     * 					 <span class="tablenote">
     * 					 <strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					 </span>
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

    RefundStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundStatusCodeType fromValue(String v) {
        for (RefundStatusCodeType c: RefundStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
