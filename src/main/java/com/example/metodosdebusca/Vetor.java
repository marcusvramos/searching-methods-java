package com.example.metodosdebusca;

public class Vetor {
    private int[] vet;
    private int TL;

    public Vetor(int posicoes) {
        this.vet = new int[posicoes+1];
        TL = posicoes;
    }

    public void preencheVetor() {
        for (int i = 0; i < TL; i++) {
            vet[i] = i+5;
        }
    }

    public void leVetor() {
        System.out.print("Vetor: ");
        for (int i = 0; i < TL; i++) {
            System.out.print(vet[i] + " ");
        }
    }

    // Buscas em estruturas desordenadas
    public int buscaExaustiva(int chave) {
        int pos = 0;
        while (pos < TL && chave != vet[pos]) {
            pos++;
        }

        if (pos < TL) {
            return pos;
        }

        return -1;
    }

    public int buscaSentinela(int chave) {
        int pos = 0;
        vet[TL] = chave;
        while (chave != vet[pos]) {
            pos++;
        }

        if (pos < TL)
            return pos;

        return -1;
    }

    // Buscas em estruturas ordenadas
    public int buscaIndexada(int chave) {
        int pos = 0;
        while(pos < TL && chave > vet[pos]) {
            pos++;
        }
        if(pos < TL && chave == vet[pos]) {
            return pos;
        }
        return -1;
    }

    public int buscaBinaria(int chave) {
        int inicio = 0;
        int fim = TL - 1;
        int meio = fim/2;

        while (inicio < fim && vet[meio] != chave) {
            if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
            meio = (inicio + fim) / 2;
        }

        if (vet[meio] == chave) {
            return meio;
        }

        return -1;
    }
}