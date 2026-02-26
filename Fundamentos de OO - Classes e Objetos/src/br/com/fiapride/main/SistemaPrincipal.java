package br.com.fiapride.main;

import br.com.fiapride.model.Oculos;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Oculos meuOculos = new Oculos();
        meuOculos.formatoArmacao = "Redondo";
        meuOculos.espessuraHaste = "Fina";
        meuOculos.grau = 2.75;

        Oculos oculosDoArthur = new Oculos();
        oculosDoArthur.formatoArmacao = "Quadrado";
        oculosDoArthur.espessuraHaste = "Grossa";
        oculosDoArthur.grau = 0.75;

        System.out.println("========== MEU ÓCULOS ==========");
        System.out.printf("Formato da Armação: %s%n", meuOculos.formatoArmacao);
        System.out.printf("Espessura da Haste: %s%n", meuOculos.espessuraHaste);
        System.out.printf("Grau da Lente: %.2f%n", meuOculos.grau);

        System.out.println();

        System.out.println("====== ÓCULOS DO ARTHUR ======");
        System.out.printf("Formato da Armação: %s%n", oculosDoArthur.formatoArmacao);
        System.out.printf("Espessura da Haste: %s%n", oculosDoArthur.espessuraHaste);
        System.out.printf("Grau da Lente: %.2f%n", oculosDoArthur.grau);
    }
}