package br.com.victorgadelha.conversordemoedas.model;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("base_code")
    private String currencyName;

    @SerializedName("conversion_rates")
    private Map<String, Double> exchangeRates;

    private Double currencyValue;

    public String getCurrencyName() {
        return currencyName;
    }

    public Map<String, Double> getExchangeRates() {
        return exchangeRates;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Double currencyValue) {
        this.currencyValue = currencyValue;
    }

    @Override
    public String toString() {
        return "Currency [currencyName=" + currencyName + ", exchangeList=" + exchangeRates + "]";
    }

}
