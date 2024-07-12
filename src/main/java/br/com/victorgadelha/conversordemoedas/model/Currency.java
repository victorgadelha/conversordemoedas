package br.com.victorgadelha.conversordemoedas.model;

import java.util.HashMap;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("base_code")
    private String currencyName;

    @SerializedName("conversion_rates")
    private HashMap<String, Double> exchangeRates;

    @Override
    public String toString() {
        return "Currency [currencyName=" + currencyName + ", exchangeList=" + exchangeRates + "]";
    }

}
