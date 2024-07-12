package br.com.victorgadelha.conversordemoedas.services;

import com.google.gson.Gson;

import br.com.victorgadelha.conversordemoedas.model.Currency;

public class DeserializationService {
    APIService apiService = new APIService();
    Gson gson = new Gson();

    public Currency deserializeJson(String response) {
        String responseBody = apiService.getCurrency();
        Currency currency = gson.fromJson(responseBody, Currency.class);
        return currency;
    }
}
