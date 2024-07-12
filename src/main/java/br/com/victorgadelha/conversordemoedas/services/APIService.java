package br.com.victorgadelha.conversordemoedas.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import io.github.cdimascio.dotenv.Dotenv;

public class APIService {
    private Dotenv dotenv = Dotenv.load();
    private String apiKey = dotenv.get("API_KEY");

    public String getCurrency() {

        try {

            var menuService = new MenuService();

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(
                            "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + menuService.currencyMenu()))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String allCurrencies = response.body();

            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: " + allCurrencies);

            return allCurrencies;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
