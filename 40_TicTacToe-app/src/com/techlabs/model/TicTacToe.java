package com.techlabs.model;

public class TicTacToe implements ITicTacToe {
    private Board board;
    private char currentPlayer;

    public TicTacToe() {
        board = new Board();
        currentPlayer = 'X';
    }

    @Override
    public void play(int x, int y) {
        if (board.isCellEmpty(x, y)) {
            board.placeMark(x, y, currentPlayer);
            if (board.checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }
            if (board.isBoardFull()) {
                System.out.println("It's a draw!");
                return;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        } else {
            System.out.println("Cell already occupied. Choose another cell.");
        }
    }

    @Override
    public void printBoard() {
        board.printBoard();
    }

    @Override
    public boolean isGameOver() {
        return board.checkWin('X') || board.checkWin('O') || board.isBoardFull();
    }
}
