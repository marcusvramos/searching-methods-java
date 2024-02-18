package com.example.metodosdebusca;

import com.example.metodosdebusca.Vetor;

public class TestesVetor {
    public static void main(String[] args) {
        Vetor v = new Vetor(10);
        v.preencheVetor();
        v.leVetor();
        System.out.println("\nBusca exaustiva: " + v.buscaExaustiva(9));
        System.out.println("Busca sentinela: " + v.buscaSentinela(14));
        System.out.println("Busca indexada: " + v.buscaIndexada(6));
        System.out.println("Busca binária: " + v.buscaBinaria(18));
    }
}
