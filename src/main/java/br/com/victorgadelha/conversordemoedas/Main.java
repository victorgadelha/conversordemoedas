package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.services.APIService;
import br.com.victorgadelha.conversordemoedas.services.DeserializationService;
import br.com.victorgadelha.conversordemoedas.services.MenuService;

public class Main {
    public static void main(String[] args) {
        APIService apiService = new APIService();

        MenuService scannerService = new MenuService();
        scannerService.currencyMenu();
        DeserializationService deserializationService = new DeserializationService();
        System.out.println(deserializationService.deserializeJson(apiService.getCurrency()));
    }
}