package br.com.victorgadelha.conversordemoedas.services;

import java.util.Scanner;

public class MenuService {
    Scanner scanner = new Scanner(System.in);

    public void currencyMenu() {

        System.out.println("""
                ************************************************************
                    Seja bem vindo(a) ao Conversor de Moedas!

                    "USD [Dólar Americano] =>> ARS [Peso Argentino]"
                    "ARS [Peso Argentino] =>> BRL [Real Brasileiro]"
                    "BRL [Real Brasileiro] =>> CLP [Peso Chileno]"
                    "CLP [Peso Chileno] =>> COP [Peso Colombiano]"
                    "COP [Peso Colombiano] =>> BOB [Boliviano Boliviano]"
                    "BOB [Boliviano Boliviano] =>> USD [Dólar Americano]"

                    Escolha uma opção válida:
                ************************************************************
                    """);
    }
}
