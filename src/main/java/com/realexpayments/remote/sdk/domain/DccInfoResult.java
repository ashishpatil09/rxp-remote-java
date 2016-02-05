package com.realexpayments.remote.sdk.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>
 * Domain object representing DCC information returned by Realex.
 * </p>
 * <p/>
 * <p><code><pre>
 * DccInfoResult dccInfo = new DccInfoResult();
 * dccInfo.setCardHolderCurrency("GBP");
 * dccInfo.setCardHolderAmount(13049);
 * dccInfo.setCardHolderRate(0.6868);
 * dccInfo.setMerchantCurrency("EUR");
 * dccInfo.setMerchantAmount("19000");
 *
 * <p/>
 * </pre></code></p>
 *
 * @author vicpada
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DccInfoResult{

    /**
     * The currency of the card holder
     */
    @XmlElement(name = "cardholdercurrency")
    private String cardHolderCurrency;

    /**
     * The amount on the card holder currency
     */
    @XmlElement(name = "cardholderamount")
    private Long cardHolderAmount;

    /**
     * The rate used to calculate the card holder amount
     */
    @XmlElement(name = "cardholderrate")
    private Double cardHolderRate;

    /**
     * The currency used by the merchant
     */
    @XmlElement(name = "merchantcurrency")
    private String merchantCurrency;

    /**
     * The amount in the currency of the merchant
     */
    @XmlElement(name = "merchantamount")
    private Long merchantAmount;

    /**
     * Getter for the card holder currency
     *
     * @return String
     */
    public String getCardHolderCurrency() {
        return cardHolderCurrency;
    }

    /**
     * Setter for card holder currency.
     *
     * @param currency
     */
    public void setCardHolderCurrency(String currency) {
        this.cardHolderCurrency = currency;
    }

    /**
     * Getter for card holder amount
     *
     * @return Long
     */
    public Long getCardHolderAmount() {
        return cardHolderAmount;
    }

    /**
     * Setter for card holder amount.
     *
     * @param amount
     */
    public void setCardHolderAmount(Long amount) {
        this.cardHolderAmount = amount;
    }

    /**
     * Getter for card holder rate
     *
     * @return Double
     */
    public Double getCardHolderRate() {
        return cardHolderRate;
    }

    /**
     * Setter for card holder rate
     *
     * @param rate
     */
    public void setCardHolderRate(Double rate) {
        this.cardHolderRate = rate;
    }

    /**
     * Getter for merchant currency
     *
     * @return String
     */
    public String getMerchantCurrency() {
        return merchantCurrency;
    }

    /**
     * Setter for merchant currency.
     *
     * @param currency
     */
    public void setMerchantCurrency(String currency) {
        this.merchantCurrency = currency;
    }

    /**
     * Getter merchant amount
     *
     * @return Long
     */
    public Long getMerchantAmount() {
        return merchantAmount;
    }

    /**
     * Setter for amount.
     *
     * @param amount
     */
    public void setMerchantAmount(Long amount) {
        this.merchantAmount = amount;
    }
}


