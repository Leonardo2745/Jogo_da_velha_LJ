package model;

import java.util.Arrays;

public class Board {
    private final Symbol[][] grid;
    public static final int TAM = 3;

    public Board() {
        this.grid = new Symbol[TAM][TAM];
        limpar();
    }


    public void limpar() {
        for (int i = 0; i < TAM; i++) {
            Arrays.fill(grid[i], Symbol.VAZIO);
        }
    }


//    public boolean marcar(int linha, int coluna, Symbol s) {
//
//    }

//    public boolean estaVazio(int linha, int coluna) {
//
//    }

//    public boolean estaCheio() {
//
//    }

//    public GameResult verificarResultado() {
//        // Linhas
//
//        // Colunas
//
//        // Diagonais
//
//        // Empate ou em andamento
    ////        return estaCheio() ? GameResult.EMPATE : GameResult.EM_ANDAMENTO;
//    }


    public Symbol getAt(int linha, int coluna) {
        if (!coordValida(linha, coluna)) throw new IndexOutOfBoundsException("Coordenadas inválidas");
        return grid[linha][coluna];
    }

    private boolean coordValida(int l, int c) {
        return l >= 0 && l < TAM && c >= 0 && c < TAM;
    }
}

