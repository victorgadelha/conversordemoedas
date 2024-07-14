package br.com.victorgadelha.conversordemoedas.services;

import com.google.gson.Gson;
import br.com.victorgadelha.conversordemoedas.model.Currency;

public class DeserializationService {

    private Gson gson = new Gson();

    public Currency deserializeJson(String apiService, Double scannerValue) {
        Currency currency = gson.fromJson(apiService, Currency.class);
        String currencyName = currency.getCurrencyName();
        Double currencyValue = null;

        switch (currencyName) {
            case "USD":
                currencyValue = scannerValue * currency.getExchangeRates().get("ARS");
                System.out.println(
                        "***************************************************************************************\n" +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [ARS]\n" +
                                "***************************************************************************************");
                break;
            case "ARS":
                currencyValue = scannerValue * currency.getExchangeRates().get("BRL");
                System.out.println(
                        "----------------------------------------------------------------------------------------\n"
                                +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [BRL]\n" +
                                "----------------------------------------------------------------------------------------");
                break;
            case "BRL":
                currencyValue = scannerValue * currency.getExchangeRates().get("CLP");
                System.out.println(
                        "----------------------------------------------------------------------------------------\n"
                                +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [CLP]\n" +
                                "----------------------------------------------------------------------------------------");
                break;
            case "CLP":
                currencyValue = scannerValue * currency.getExchangeRates().get("COP");
                System.out.println(
                        "----------------------------------------------------------------------------------------\n"
                                +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [COP]\n" +
                                "----------------------------------------------------------------------------------------");
                break;
            case "COP":
                currencyValue = scannerValue * currency.getExchangeRates().get("BOB");
                System.out.println(
                        "----------------------------------------------------------------------------------------\n"
                                +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [BOB]\n" +
                                "----------------------------------------------------------------------------------------");
                break;
            case "BOB":
                currencyValue = scannerValue * currency.getExchangeRates().get("USD");
                System.out.println(
                        "----------------------------------------------------------------------------------------\n"
                                +
                                "O valor " + scannerValue + " [" + currencyName + "] corresponde ao valor final de =>> "
                                +
                                currencyValue + " [USD]\n" +
                                "----------------------------------------------------------------------------------------");
                break;
            default:
                System.out.println("Moeda não suportada.");
                break;
        }

        return currency;
    }
}
