package br.com.victorgadelha.conversordemoedas;

import br.com.victorgadelha.conversordemoedas.service.APIService;

public class Main {
    public static void main(String[] args) {
        APIService apiService = new APIService();
        apiService.getCurrency();
    }
}