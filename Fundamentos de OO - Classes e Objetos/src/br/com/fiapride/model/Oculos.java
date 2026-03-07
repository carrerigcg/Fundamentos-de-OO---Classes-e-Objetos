package br.com.fiapride.model;

public class Oculos {

    public String formatoArmacao;
    public double espessuraHaste;
    public double grauLente;

    // Metodo 1: ajusta o grau da lente
    // Regra: o grau nao pode ser menor que -30 nem maior que 30
    public void ajustarGrau(double novoGrau) {
        if (novoGrau < -30 || novoGrau > 30) {
            System.out.println("Grau invalido. O grau deve estar entre -30 e 30.");
        } else {
            grauLente = novoGrau;
            System.out.println("Grau atualizado para: " + grauLente);
        }
    }

    // Metodo 2: troca o formato da armacao
    // Regra: o formato nao pode ser vazio
    public void trocarArmacao(String novoFormato) {
        if (novoFormato == null || novoFormato.isEmpty()) {
            System.out.println("Formato invalido. O formato nao pode ser vazio.");
        } else {
            formatoArmacao = novoFormato;
            System.out.println("Armacao atualizada para: " + formatoArmacao);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Formato: " + formatoArmacao);
        System.out.println("Espessura da haste: " + espessuraHaste);
        System.out.println("Grau: " + grauLente);
    }
}