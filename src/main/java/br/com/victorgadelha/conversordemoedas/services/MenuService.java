package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class MenuService {
    public String currencyMenu() {

        System.out.println("""
                ************************************************************
                    Seja bem vindo(a) ao Conversor de Moedas!

                    1 - "USD [Dólar Americano] =>> ARS [Peso Argentino]"
                    2 - "ARS [Peso Argentino] =>> BRL [Real Brasileiro]"
                    3 - "BRL [Real Brasileiro] =>> CLP [Peso Chileno]"
                    4 - "CLP [Peso Chileno] =>> COP [Peso Colombiano]"
                    5 - "COP [Peso Colombiano] =>> BOB [Boliviano Boliviano]"
                    6 - "BOB [Boliviano Boliviano] =>> USD [Dólar Americano]"

                    Escolha uma opção válida:
                ************************************************************
                    """);
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();
        //
        switch (option) {
            case 1:
                return "USD";
            case 2:
                return "ARS";
            case 3:
                return "BRL";
            case 4:
                return "CLP";
            case 5:
                return "COP";
            case 6:
                return "BOB";
            default:
                System.out.println("Opção inválida! Escolha alguma das opções mostradas no menu.");
                return null; // ou lançar uma exceção, dependendo do contexto
        }
    }

}
