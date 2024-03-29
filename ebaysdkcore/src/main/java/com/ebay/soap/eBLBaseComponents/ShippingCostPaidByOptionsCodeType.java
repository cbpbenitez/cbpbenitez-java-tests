
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingCostPaidByOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCostPaidByOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="EUSeller_ReturnRights"/>
 *     &lt;enumeration value="EUSeller_CancelRights"/>
 *     &lt;enumeration value="EUBuyer_CancelRightsUnder40"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingCostPaidByOptionsCodeType")
@XmlEnum
public enum ShippingCostPaidByOptionsCodeType {


    /**
     * 
     * 						This value indicates that the buyer is responsible for paying the return shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						This value indicates that the seller is responsible for paying the return shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value indicates that the German or Austrian seller is responsible for paying the return shipping cost. If this value is set for the return policy, the buyer simply returns the item and the seller is automatically responsible for return shipping cost. This value is only supported on the DE and AT sites.
     * 					
     * 
     */
    @XmlEnumValue("EUSeller_ReturnRights")
    EU_SELLER_RETURN_RIGHTS("EUSeller_ReturnRights"),

    /**
     * 
     * 						This value indicates that the German or Austrian seller is responsible for paying the return shipping cost if the item price is more than 40 euros. If the item price is less than 40 euros, it is at the seller's discretion to impose the return shipping cost on the buyer, or to handle the return shipping cost themselves. If this value is set for the return policy, the buyer can send an order cancellation request via letter, e-mail, or fax, or simply return the item. This value is only supported on the DE and AT sites.
     * 					
     * 
     */
    @XmlEnumValue("EUSeller_CancelRights")
    EU_SELLER_CANCEL_RIGHTS("EUSeller_CancelRights"),

    /**
     * 
     * 						This value indicates that the buyer of an item on the German or Austrian site is responsible for paying the return shipping cost, unless the order exceeds 40 euros, in which case the seller would pay for the return shipping cost. This value is only supported on the DE and AT sites.
     * 					
     * 
     */
    @XmlEnumValue("EUBuyer_CancelRightsUnder40")
    EU_BUYER_CANCEL_RIGHTS_UNDER_40("EUBuyer_CancelRightsUnder40");
    private final String value;

    ShippingCostPaidByOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCostPaidByOptionsCodeType fromValue(String v) {
        for (ShippingCostPaidByOptionsCodeType c: ShippingCostPaidByOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
