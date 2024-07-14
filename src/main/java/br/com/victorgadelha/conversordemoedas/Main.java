package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.services.APIService;
import br.com.victorgadelha.conversordemoedas.services.DeserializationService;
import br.com.victorgadelha.conversordemoedas.services.MenuService;
import br.com.victorgadelha.conversordemoedas.services.ScannerChoiceService;
import br.com.victorgadelha.conversordemoedas.services.ScannerValueService;

public class Main {
    public static void main(String[] args) {

        var menuService = new MenuService();
        var apiService = new APIService();
        var scannerChoiceService = new ScannerChoiceService();
        var deserializationService = new DeserializationService();
        var scannerValueService = new ScannerValueService();

        int scannerChoice;

        do {
            menuService.currencyMenu();
            scannerChoice = scannerChoiceService.getScannerChoice();

            if (scannerChoice != 7) {
                String apiResponse = apiService.getCurrency(scannerChoice);
                Double scannerValue = scannerValueService.getScannerValue();
                System.out.println();

                deserializationService.deserializeJson(apiResponse, scannerValue);
                System.out.println();
            }

        } while (scannerChoice != 7);

        System.out.println("Obrigado por usar o Conversor de Moedas!");
    }
}
