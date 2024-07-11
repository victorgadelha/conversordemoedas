package br.com.victorgadelha.conversordemoedas.model;

import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("base_code")
    private String currencyName;

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

}
