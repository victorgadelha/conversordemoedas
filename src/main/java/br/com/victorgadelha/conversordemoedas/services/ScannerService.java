package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class ScannerService {

    public int scanOption() {
        var scanner = new Scanner(System.in);
        var choice = scanner.nextInt();

        while (choice <= 0 || choice > 6) {
            System.out.println("Opção inválida! Escolha uma opção do menu.");
            choice = scanner.nextInt();
        }
        scanner.close();
        return choice;
    }
}