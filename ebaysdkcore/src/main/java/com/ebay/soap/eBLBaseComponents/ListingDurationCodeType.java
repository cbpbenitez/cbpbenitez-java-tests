
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingDurationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="Days_10"/>
 *     &lt;enumeration value="Days_14"/>
 *     &lt;enumeration value="Days_21"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_60"/>
 *     &lt;enumeration value="Days_90"/>
 *     &lt;enumeration value="Days_120"/>
 *     &lt;enumeration value="GTC"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingDurationCodeType")
@XmlEnum
public enum ListingDurationCodeType {


    /**
     * 
     * 						This value is used to set the duration of the listing to one day. A one-day listing 
     * 						duration is typically only available to sellers with a Feedback score of 10 or 
     * 						higher, so sellers with a Feedback score of less than 10 may be restricted from 
     * 						using a one-day listing duration. The seller can call 
     * 						<b>GetCategoryFeatures</b> with <b>ListingDurations</b> 
     * 						included as a <b>FeatureID</b> value in the call request to see if the 
     * 						one-day listing duration is available. 
     * 						<br><br>
     * 						A one-day listing duration is generally applicable to an auction listing or to a 
     * 						Real Estate Classified Ad.
     * 					
     * 
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * 
     * 						This value is used to set the duration of the listing to three days. 
     * 						<br><br>
     * 						A three-day listing duration is applicable to most listing types.
     * 					
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * 
     * 						This value is used to set the duration of the listing to five days. 
     * 						<br><br>
     * 						A five-day listing duration is applicable to most listing types.
     * 					
     * 
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * 
     * 						This value is used to set the duration of the listing to seven days. 
     * 						<br><br>
     * 						A seven-day listing duration is applicable to most listing types.
     * 					
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 10 days. 
     * 						<br><br>
     * 						A 10-day listing duration is applicable to most listing types.
     * 					
     * 
     */
    @XmlEnumValue("Days_10")
    DAYS_10("Days_10"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 14 days. 
     * 						<br><br>
     * 						A 14-day listing duration is typically only applicable to Classified Ad listings 
     * 						in specific categories.
     * 					
     * 
     */
    @XmlEnumValue("Days_14")
    DAYS_14("Days_14"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 21 days. 
     * 						<br><br>
     * 						A 21-day listing duration is typically only applicable to eBay Motors Local 
     * 						Market vehicle listings, a listing type that is only available to eBay Motors 
     * 						Dealers.
     * 					
     * 
     */
    @XmlEnumValue("Days_21")
    DAYS_21("Days_21"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 30 days. 
     * 						<br><br>
     * 						A 30-day listing duration is typically available for fixed-price listing, Classified Ad 
     * 						listings, and Real Estate auction listings.
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 60 days. 
     * 						<br><br>
     * 						A 60-day listing duration is typically only applicable to Classified Ad listings 
     * 						in specific categories.
     * 					
     * 
     */
    @XmlEnumValue("Days_60")
    DAYS_60("Days_60"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 90 days. 
     * 						<br><br>
     * 						A 90-day listing duration is generally only applicable to a Real Estate Classified
     * 						Ad.
     * 					
     * 
     */
    @XmlEnumValue("Days_90")
    DAYS_90("Days_90"),

    /**
     * 
     * 						This value is used to set the duration of the listing to 120 days. 
     * 						<br><br>
     * 						An 120-day listing duration is typically only applicable to Classified Ad listings 
     * 						in specific categories.
     * 					
     * 
     */
    @XmlEnumValue("Days_120")
    DAYS_120("Days_120"),

    /**
     * 
     * 						This value is used to set the duration of the listing to "Good 'Til Cancelled". This
     * 						option is available for fixed-price and Classified Ad listings. "Good 'Til
     * 						Cancelled" fixed-price listings will be relisted automatically every 30 days until
     * 						all inventory is sold out (e.g., <b>Item.Quantity</b>=0 in a 
     * 						single-variation fixed-price listing, or all occurences of 
     * 						<b>Item.Variations.Variation.Quantity</b>=0 in a multi-variation 
     * 						fixed-price listing), or the seller ends the fixed-price listing.
     * 					
     * 
     */
    GTC("GTC"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingDurationCodeType fromValue(String v) {
        for (ListingDurationCodeType c: ListingDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
