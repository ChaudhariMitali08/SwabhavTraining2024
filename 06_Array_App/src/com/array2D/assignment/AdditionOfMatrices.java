package com.array2D.assignment;

import java.util.*;

public class AdditionOfMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows m :- ");
		int m = sc.nextInt();

		System.out.println("Enter the number of columns n :- ");
		int n = sc.nextInt();

		int[][] matrix1 = new int[m][n];
		int[][] matrix2 = new int[m][n];
		int[][] sum =new int[m][n];
		
		System.out.println("enter the elements of 1st matrix");
		for(int i = 0;i<m;i++) {
			for(int j = 0 ; j<n;j++) {
				matrix1[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("enter the elements of 2nd matrix");
		for(int i = 0;i<m;i++) {
			for(int j = 0 ; j<n;j++) {
				matrix2[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Sum");

		for(int i = 0;i<m;i++) {
			for(int j = 0 ; j<n;j++) {
				sum[i][j]= matrix1[i][j] + matrix2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}