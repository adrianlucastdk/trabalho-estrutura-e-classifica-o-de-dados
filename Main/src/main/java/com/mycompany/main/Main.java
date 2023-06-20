/**
 * TRABALHO ESTRUTURA E CLASSIFICAÇÃO DE DAODS
 * ADRIAN LUCAS TODERKE - 00230994
 */

package com.mycompany.main;
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

    public static int[] porInsercao(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        return vetor;
    }

    public static int[] porSelecao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
        return vetor;
    }

    public static int[] porBolha(int[] vetor) {
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
        return vetor;
    }
}
