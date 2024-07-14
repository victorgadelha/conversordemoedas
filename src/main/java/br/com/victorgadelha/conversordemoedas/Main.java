package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.services.APIService;
import br.com.victorgadelha.conversordemoedas.services.DeserializationService;
import br.com.victorgadelha.conversordemoedas.services.MenuService;
import br.com.victorgadelha.conversordemoedas.services.ScannerService;

public class Main {
    public static void main(String[] args) {

        var menuService = new MenuService();
        menuService.currencyMenu();

        var apiService = new APIService();
        var scannerService = new ScannerService();

        var deserializationService = new DeserializationService();

        deserializationService.deserializeJson(apiService.getCurrency(scannerService.scanOption()));

    }
}