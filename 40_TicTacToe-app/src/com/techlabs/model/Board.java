package com.techlabs.model;

public class Board {
	private char[][] board;

	public Board() {
		board = new char[3][3];
		initializeBoard();
	}

	private void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	}

	public boolean isCellEmpty(int x, int y) {
		return board[x][y] == '-';
	}

	public void placeMark(int x, int y, char mark) {
		if (isCellEmpty(x, y)) {
			board[x][y] = mark;
		}
	}

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkWin(char mark) {
		return checkRows(mark) || checkColumns(mark) || checkDiagonals(mark);
	}

	private boolean checkRows(char mark) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == mark && board[i][1] == mark && board[i][2] == mark) {
				return true;
			}
		}
		return false;
	}

	private boolean checkColumns(char mark) {
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == mark && board[1][i] == mark && board[2][i] == mark) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonals(char mark) {
		if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
			return true;
		}
		if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
			return true;
		}
		return false;
	}
}
