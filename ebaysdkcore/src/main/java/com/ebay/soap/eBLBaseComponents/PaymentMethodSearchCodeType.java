
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="PaisaPay"/>
 *     &lt;enumeration value="PayPalOrPaisaPay"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodSearchCodeType")
@XmlEnum
public enum PaymentMethodSearchCodeType {


    /**
     * 
     * 					  PayPal payment method.
     * 				  
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     *  
     * 					  PaisaPay payment method. The PaisaPay payment method is only for the India site (site ID 203).
     * 					
     * 
     */
    @XmlEnumValue("PaisaPay")
    PAISA_PAY("PaisaPay"),

    /**
     * 
     * 					  Either the PayPal or the PaisaPay payment method. The PaisaPay payment method is only for the India site (site ID 203).
     * 					 
     * 
     */
    @XmlEnumValue("PayPalOrPaisaPay")
    PAY_PAL_OR_PAISA_PAY("PayPalOrPaisaPay"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 					  PaisaPayEscrowEMI (Equal Monthly Installments) payment method. The PaisaPayEscrowEMI payment method is only for the India site (site ID 203).
     * 					 
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI");
    private final String value;

    PaymentMethodSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodSearchCodeType fromValue(String v) {
        for (PaymentMethodSearchCodeType c: PaymentMethodSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
