package br.com.victorgadelha.conversordemoedas.services;

//import java.util.Map;

import com.google.gson.Gson;

import br.com.victorgadelha.conversordemoedas.model.Currency;

public class DeserializationService {

    Gson gson = new Gson();

    public Currency deserializeJson(String apiService) {
        Currency currency = gson.fromJson(apiService, Currency.class);
        String currencyName = currency.getCurrencyName();
        Double currencyValue;

        switch (currencyName) {
            case "USD":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("ARS"));
                break;
            case "ARS":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("BRL"));
                break;
            case "BRL":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("CLP"));
                break;
            case "CLP":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("COP"));
                break;
            case "COP":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("BOB"));
                break;
            case "BOB":
                currencyValue = currency.setCurrencyValue(currency.getExchangeRates().get("USD"));
                break;
            default:
                System.out.println("Moeda não suportada.");
                break;
        }

        System.out.println(
                "O valor + " + "[" + currencyName + "] " + " corresponde ao valor final de =>> "
                        + currency.getCurrencyValue());

        return currency;
    }
}
