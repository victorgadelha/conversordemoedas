package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class ScannerChoiceService {

    public int getScannerChoice() {
        var scanner = new Scanner(System.in);
        int currencyChoice = scanner.nextInt();

        while (currencyChoice <= 0 || currencyChoice > 7) {
            System.out.println("Opção inválida! Escolha uma opção do menu.");
            currencyChoice = scanner.nextInt();
        }
        // scanner.close();
        return currencyChoice;
    }
}