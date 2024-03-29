
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CrossSell"/>
 *     &lt;enumeration value="UpSell"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionMethodCodeType")
@XmlEnum
public enum PromotionMethodCodeType {


    /**
     * 
     * 						
     * 						Promote/present items that are related to or can be used with the
     * 						specified item.
     * 					
     * 
     */
    @XmlEnumValue("CrossSell")
    CROSS_SELL("CrossSell"),

    /**
     * 
     * 						
     * 						Promote/present items that of higher quality or more expensive
     * 						than the specified item.
     * 					
     * 
     */
    @XmlEnumValue("UpSell")
    UP_SELL("UpSell"),

    /**
     * 
     * 						
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionMethodCodeType fromValue(String v) {
        for (PromotionMethodCodeType c: PromotionMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
