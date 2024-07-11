package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.services.APIService;
import br.com.victorgadelha.conversordemoedas.services.ScannerService;

public class Main {
    public static void main(String[] args) {
        APIService apiService = new APIService();
        apiService.getCurrency();
        ScannerService scannerService = new ScannerService();
        scannerService.currencyMenu();
    }
}