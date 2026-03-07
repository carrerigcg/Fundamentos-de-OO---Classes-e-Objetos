package br.com.fiapride.main;

import br.com.fiapride.model.Oculos;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Oculos meuOculos = new Oculos();
        meuOculos.formatoArmacao = "Redondo";
        meuOculos.espessuraHaste = 3.5;
        meuOculos.grauLente = -2.0;

        System.out.println("--- Estado inicial ---");
        meuOculos.exibirInformacoes();

        System.out.println("");

        meuOculos.ajustarGrau(-4.5);
        meuOculos.ajustarGrau(-99);

        System.out.println("");

        meuOculos.trocarArmacao("Retangular");
        meuOculos.trocarArmacao("");

        System.out.println("");

        System.out.println("--- Estado final ---");
        meuOculos.exibirInformacoes();
    }
}