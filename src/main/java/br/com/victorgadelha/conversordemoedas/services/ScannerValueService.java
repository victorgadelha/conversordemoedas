package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class ScannerValueService {
    public Double getScannerValue() {
        System.out.println("Digite o valor para converter: ");

        var scanner = new Scanner(System.in);
        Double value = scanner.nextDouble();

        while (value == null || value < 0) {
            System.out.println("Digite um valor acima de 0");
        }
        // scanner.close();
        return value;
    }
}
