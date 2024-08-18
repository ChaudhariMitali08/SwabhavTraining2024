package com.techlabs.test;

import java.util.*;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matrix[][] = new int[3][3];

		System.out.println("Enter the elements of matrix");

		System.out.println("Matrix is:");

	}

	private static void printMatrixTest(int Matrix[][]) {
		for (int row = 0; row < 3; row++) {
			printRow(Matrix,row);
			System.out.println("");
		}
	}

	private static void createRows(int matrix[][], Scanner scanner) {
		{
			for (int row = 0; row < 3; row++) {
				readRowElements(matrix, scanner, row);

			}
		}
	}
}
