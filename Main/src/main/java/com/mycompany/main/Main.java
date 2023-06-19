/**
 * TRABALHO ESTRUTURA E CLASSIFICAÇÃO DE DAODS
 * ADRIAN LUCAS TODERKE - 00230994
 */
package com.mycompany.main;
import java.util.Arrays;
import javax.swing.JOptionPane;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do Vetor:"));

        int[] vetor = new int[tam];

        for (int i = 0; i < tam; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o elemento " + (i + 1) + " do vetor:"));
        }

        JOptionPane.showMessageDialog(null, "Vetor original:\n" + Arrays.toString(vetor));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha o método:\n" +
                        "[1] Inserção\n" +
                        "[2] Seleção\n" +
                        "[3] Bolha"
        ));

        int[] vetorOrdenado;
        String metodoOrdenacao = "";

        switch (opcao) {
            case 1:
                vetorOrdenado = porInsercao(vetor.clone());
                metodoOrdenacao = "Inserção";
                break;
            case 2:
                vetorOrdenado = porSelecao(vetor.clone());
                metodoOrdenacao = "Seleção";
                break;
            case 3:
                vetorOrdenado = porBolha(vetor.clone());
                metodoOrdenacao = "Bolha";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                return;
        }

        JOptionPane.showMessageDialog(null,
                "Método de ordenação: " + metodoOrdenacao + "\n" +
                        "Vetor ordenado:\n" + Arrays.toString(vetorOrdenado)
        );
    }

    private static int[] porInsercao(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private static int[] porSelecao(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private static int[] porBolha(int[] array) {
        Arrays.sort(array);
        return array;
    }
}