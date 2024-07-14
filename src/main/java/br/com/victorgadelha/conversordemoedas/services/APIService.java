package br.com.victorgadelha.conversordemoedas.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import io.github.cdimascio.dotenv.Dotenv;

public class APIService {
    private Dotenv dotenv = Dotenv.load();
    private String apiKey = dotenv.get("API_KEY");

    public String getCurrency(int userChoice) {

        try {

            String currency = null;

            switch (userChoice) {
                case 1:
                    currency = "USD";
                    break;
                case 2:
                    currency = "ARS";
                    break;
                case 3:
                    currency = "BRL";
                    break;
                case 4:
                    currency = "CLP";
                    break;
                case 5:
                    currency = "COP";
                    break;
                case 6:
                    currency = "BOB";
                    break;
                default:
                    System.out.println("Opção inválida! Escolha alguma das opções mostradas no menu.");
                    break;
            }

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(
                            "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + currency))
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String allCurrencies = response.body();

            return allCurrencies;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
