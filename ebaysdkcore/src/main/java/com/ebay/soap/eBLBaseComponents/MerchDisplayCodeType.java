
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchDisplayCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchDisplayCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DefaultTheme"/>
 *     &lt;enumeration value="StoreTheme"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchDisplayCodeType")
@XmlEnum
public enum MerchDisplayCodeType {


    /**
     * 
     * 						
     * 						Uses the default eBay theme for cross-promotion widgets.
     * 					
     * 
     */
    @XmlEnumValue("DefaultTheme")
    DEFAULT_THEME("DefaultTheme"),

    /**
     * 
     * 						
     * 						Uses the store theme for cross-promotion widgets.
     * 					
     * 
     */
    @XmlEnumValue("StoreTheme")
    STORE_THEME("StoreTheme"),

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

    MerchDisplayCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchDisplayCodeType fromValue(String v) {
        for (MerchDisplayCodeType c: MerchDisplayCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
