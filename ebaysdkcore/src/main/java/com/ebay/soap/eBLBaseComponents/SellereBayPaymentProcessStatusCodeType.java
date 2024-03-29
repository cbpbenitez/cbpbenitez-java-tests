
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellereBayPaymentProcessStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellereBayPaymentProcessStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AcceptedUA"/>
 *     &lt;enumeration value="MustAcceptUA"/>
 *     &lt;enumeration value="eBayPaymentProcessEnabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellereBayPaymentProcessStatusCodeType")
@XmlEnum
public enum SellereBayPaymentProcessStatusCodeType {


    /**
     * 
     * 						This value indicates that the DE or AT seller has accepted the supplemental user agreement
     * 						related to the new payment process, but the new payment process has yet to be
     * 						fully implemented on the seller's account. 	
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					
     * 
     */
    @XmlEnumValue("AcceptedUA")
    ACCEPTED_UA("AcceptedUA"),

    /**
     * 
     * 						This value indicates that the DE or AT seller has yet to accept the supplemental user agreement related to
     * 						the new payment process. If the new payment process has been fully implemented on the seller's account, 
     * 						this seller will be blocked from listing on the DE and AT sites until the user agreement is accepted.
     * 					  <br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					
     * 
     */
    @XmlEnumValue("MustAcceptUA")
    MUST_ACCEPT_UA("MustAcceptUA"),

    /**
     * 
     * 						This value indicates that the DE or AT seller has accepted the supplemental user
     * 						agreement related to the new payment process and the new payment process is
     * 						fully implemented on the seller's account. 		
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> The introduction of the new eBay payment process for the Germany and
     * 						Austria eBay sites has been delayed until further notice. 
     * 					
     * 
     */
    @XmlEnumValue("eBayPaymentProcessEnabled")
    E_BAY_PAYMENT_PROCESS_ENABLED("eBayPaymentProcessEnabled"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellereBayPaymentProcessStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellereBayPaymentProcessStatusCodeType fromValue(String v) {
        for (SellereBayPaymentProcessStatusCodeType c: SellereBayPaymentProcessStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
