package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class ScannerService {
    Scanner scanner = new Scanner(System.in);

    public void currencyMenu() {

        System.out.println("""
                **************************************************
                    Seja bem vindo(a) ao Conversor de Moedas!

                    1) "USD [Dólar] =>> EUR [Euro]"
                    2) "EUR [Euro] =>> GBP [Libra Esterlina]"
                    3) "GBP [Libra Esterlina] =>> JPY [Iene Japonês]"
                    4) "JPY [Iene Japonês] =>> AUD [Dólar Australiano]"
                    5) "AUD [Dólar Australiano] =>> CAD [Dólar Canadense]"
                    6) "CAD [Dólar Canadense] =>> USD [Dólar Americano]"

                    Escolha uma opção válida:
                **************************************************
                    """);
    }
}
