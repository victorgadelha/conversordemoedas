package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.services.APIService;
import br.com.victorgadelha.conversordemoedas.services.DeserializationService;

public class Main {
    public static void main(String[] args) {

        // var deserializationService = new DeserializationService();
        var apiService = new APIService();
        apiService.getCurrency();

        // deserializationService.deserializeJson(apiService.getCurrency());

    }
}