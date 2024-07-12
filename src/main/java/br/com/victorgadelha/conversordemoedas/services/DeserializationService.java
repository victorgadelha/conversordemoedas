package br.com.victorgadelha.conversordemoedas.services;

import java.util.Map;

import com.google.gson.Gson;

import br.com.victorgadelha.conversordemoedas.model.Currency;

public class DeserializationService {
    APIService apiService = new APIService();
    Gson gson = new Gson();

    public Currency deserializeJson(String response) {
        String responseBody = apiService.getCurrency();
        Currency currency = gson.fromJson(responseBody, Currency.class);
        String currencyName = currency.getCurrencyName();

        switch (currencyName) {
            case "USD":
                for (Map.Entry<String, Double> currencyValue : currency.getExchangeRates().entrySet()) {
                    if (currencyValue.getKey() == "ARS") {
                        currency.setCurrencyValue(currencyValue.getValue());

                        System.out.println("Chave: " + currencyValue.getKey() + ", Valor: " + currencyValue.getValue());
                    }
                    // "USD [Dólar Americano] =>> ARS [Peso Argentino]"
                    // "ARS [Peso Argentino] =>> BRL [Real Brasileiro]"
                    // "BRL [Real Brasileiro] =>> CLP [Peso Chileno]"
                    // "CLP [Peso Chileno] =>> COP [Peso Colombiano]"
                    // "COP [Peso Colombiano] =>> BOB [Boliviano Boliviano]"
                    // "BOB [Boliviano Boliviano] =>> USD [Dólar Americano]"
                }
                break;

            default:
                break;
        }

        return currency;
    }
}
