package seleniumDemo;

import java.util.Scanner;

public class Array2D {
	
	
	
	public static void addition(int[][] arr1, int[][] arr2,int r, int c) {
		 
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				System.out.println(arr1[i][j] + arr2[i][j]);
				 
			 }
			 System.out.println();
		 }
	}
	
	public static void substraction(int[][] arr1, int[][] arr2,int r, int c) {
		 
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				System.out.println(arr1[i][j] - arr2[i][j]);
				 
			 }
			 System.out.println();
		 }
	}
	
	
	public static void multiplication(int[][] arr1, int[][] arr2,int r, int c) {
		 
		   int[][] result = new int[r][c];
		
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 for (int k = 0; k < c; k++) {
	                    result[i][j] += arr1[i][k] * arr2[k][j];
	                }
	                System.out.print(result[i][j] + " ");
				 
			 }
			 System.out.println();
		 }
	}
	
	
	public static void transpose(int[][] arr1,int r, int c) {
		 
		 for(int i=0;i<c;i++) {
			 for(int j=0;j<r;j++) {
				System.out.println(arr1[j][i]);
				 
			 }
			 System.out.println();
		 }
	}
	
	static void checkSquare(int r, int c) {
        if (r == c)
            System.out.println("Matrix is Square Matrix");
        else
            System.out.println("Matrix is NOT Square Matrix");
    }
	
	
	 static void checkDiagonal(int[][] a, int n) {
	        boolean diagonal = true;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i != j && a[i][j] != 0) {
	                    diagonal = false;
	                    break;
	                }
	            }
	        }

	        if (diagonal)
	            System.out.println("Matrix is Diagonal Matrix");
	        else
	            System.out.println("Matrix is NOT Diagonal Matrix");
	    }

	 static void checkIdentity(int[][] a, int n) {
	        boolean identity = true;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
	                    identity = false;
	                    break;
	                }
	            }
	        }

	        if (identity)
	            System.out.println("Matrix is Identity Matrix");
	        else
	            System.out.println("Matrix is NOT Identity Matrix");
	    }
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int row = sc.nextInt();
	 int column = sc.nextInt();
	 int[][] arr1 = new int[row][column];
	 int[][] arr2 = new int[row][column];
	 
	 
	 
	 for(int i =0;i<arr1.length;i++) {
		 for(int j=0;j<arr1.length;j++) {
			 arr1[i][j] = sc.nextInt();
			 
		 }
	 }
	 for(int i =0;i<arr2.length;i++) {
		 for(int j=0;j<arr2.length;j++) {
			 arr2[i][j] = sc.nextInt();
			 
		 }
	 }
	 
	 
	 Array2D s = new Array2D();
	 
	 
	 s.addition(arr1, arr2, row, column);
     s.substraction(arr1, arr2, row, column);
     s.multiplication(arr1, arr2, row, column);
     s.transpose(arr1, row, column);
     s.checkSquare(row, column);

     if (row == column) {
         checkDiagonal(arr1, row);
         checkIdentity(arr1, row);
     }
}
}
