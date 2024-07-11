package br.com.victorgadelha.conversordemoedas.services;

import java.net.http.HttpResponse;

import com.google.gson.Gson;

import br.com.victorgadelha.conversordemoedas.model.Currency;

public class DeserializationService {
    Gson gson = new Gson();

    public Currency deserializeJson(HttpResponse<String> response) {
        String responseBody = response.body();
        Currency currency = gson.fromJson(responseBody, Currency.class);
        return currency;
    }
}
