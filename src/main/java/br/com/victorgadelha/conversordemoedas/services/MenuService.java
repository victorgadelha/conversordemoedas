package br.com.victorgadelha.conversordemoedas.services;

public class MenuService {

    public void currencyMenu() {

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

    }
}