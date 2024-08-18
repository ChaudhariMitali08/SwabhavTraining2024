package com.techlabs.model;

public interface ITicTacToe {
    void play(int x, int y);
    void printBoard();

    boolean isGameOver();
}
