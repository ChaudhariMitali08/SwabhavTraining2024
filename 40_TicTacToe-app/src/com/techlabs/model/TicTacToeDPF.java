package com.techlabs.model;

import java.util.Scanner;

public class TicTacToeDPF {
    private ITicTacToe game;

    public TicTacToeDPF() {
        game = new TicTacToe();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (!game.isGameOver()) {
            game.printBoard();
            System.out.println("Enter row and column (0, 1, 2): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            game.play(x, y);
        }
        game.printBoard();
        scanner.close();
    }
}
